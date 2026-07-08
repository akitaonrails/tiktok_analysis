package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.comp.api.pcs.infra.flashcomponent.NoFlashDataSignalInit;
import com.bytedance.android.livesdk.comp.api.pcs.infra.flashcomponent.setting.FlashListItemViewComponentConfig;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS586S0100000_7;

/* JADX INFO: renamed from: X.0KJD, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public abstract class C0KJD extends FrameLayout {
    public RecyclerView.LayoutManager LL;
    public final C0KR3 LLILLJJLI;
    public final C0KR3 LLILLL;
    public final RecyclerView LLILZ;
    public String LLILZIL;
    public List<InterfaceC515600KJy> LLILZLL;
    public Function1<? super String, Boolean> LLIZ;

    public static /* synthetic */ void getFlashComponentId$annotations() {
    }

    public abstract InterfaceC508520Jww<InterfaceC515600KJy> getListAdapter();

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C0KJE c0kje;
        super.onDetachedFromWindow();
        List<InterfaceC515600KJy> list = this.LLILZLL;
        if (list != null) {
            int i = 0;
            for (InterfaceC515600KJy interfaceC515600KJy : list) {
                int i2 = i + 1;
                if (i < 0) {
                    C1697810uHb.LJIJI();
                    throw null;
                }
                if (interfaceC515600KJy instanceof C0KJG) {
                    RecyclerView recyclerView = this.LLILZ;
                    RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = recyclerView != null ? recyclerView.findViewHolderForAdapterPosition(i) : null;
                    if ((viewHolderFindViewHolderForAdapterPosition instanceof C0KJE) && (c0kje = (C0KJE) viewHolderFindViewHolderForAdapterPosition) != null) {
                        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = c0kje.LLILLL;
                        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
                            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJIFFI(true);
                        }
                        c0kje.LLILLL = null;
                    }
                }
                i = i2;
            }
        }
    }

    public final RecyclerView getBodyListView() {
        return this.LLILZ;
    }

    public final List<InterfaceC515600KJy> getCurrentItemList() {
        return this.LLILZLL;
    }

    public final C0KR3 getFooterView() {
        return this.LLILLJJLI;
    }

    public final C0KR3 getHeaderView() {
        return this.LLILLL;
    }

    public final void setBodyListOverScrollMode(int i) {
        RecyclerView recyclerView = this.LLILZ;
        if (recyclerView != null) {
            recyclerView.setOverScrollMode(i);
        }
    }

    public final void setFlashListComponentId(String str) {
        this.LLILZIL = str;
    }

    public C0KJD(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0KJD(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = new LinearLayoutManager(context);
        View viewInflate = FrameLayout.inflate(context, R.layout.gzm, this);
        this.LLILZ = (RecyclerView) viewInflate.findViewById(R.id.yqf);
        this.LLILLJJLI = (C0KR3) viewInflate.findViewById(R.id.yqg);
        this.LLILLL = (C0KR3) viewInflate.findViewById(R.id.yqh);
        int i2 = NoFlashDataSignalInit.LLILZIL;
    }

    public final <T extends InterfaceC515600KJy> List<T> LIZ(List<? extends T> list, RecyclerView.LayoutManager layoutManager, Function1<? super String, Boolean> function1) {
        List<InterfaceC515600KJy> list2;
        if (this.LLILZIL == null) {
            return new ArrayList();
        }
        this.LLIZ = function1;
        if (layoutManager != null) {
            this.LL = layoutManager;
        }
        ArrayList arrayList = new ArrayList(list);
        String str = this.LLILZIL;
        if (str != null) {
            List<FlashListItemViewComponentConfig> listLJLLLL = C13LP.LJLLLL(new C512401z8(80), C202700qH.LIZ(str).LIZ());
            if (listLJLLLL != null) {
                for (FlashListItemViewComponentConfig flashListItemViewComponentConfig : listLJLLLL) {
                    Pair pairLJI = C500260Jjc.LJI(arrayList, new AwS586S0100000_7(flashListItemViewComponentConfig, 597));
                    Object first = pairLJI.getFirst();
                    int iIntValue = ((Number) pairLJI.getSecond()).intValue();
                    int i = flashListItemViewComponentConfig.op;
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3 && first != null && iIntValue >= 0) {
                                ListProtector.remove(arrayList, iIntValue);
                            }
                        } else {
                            C0KJG c0kjg = new C0KJG(flashListItemViewComponentConfig.url, flashListItemViewComponentConfig.LIZ);
                            if (first != null && iIntValue >= 0) {
                                ListProtector.add(arrayList, iIntValue, c0kjg);
                                arrayList.remove(first);
                            } else {
                                int i2 = flashListItemViewComponentConfig.fallbackOrder;
                                if (i2 != -2) {
                                    if (i2 == 0) {
                                        ListProtector.add(arrayList, 0, c0kjg);
                                    }
                                } else {
                                    arrayList.add(c0kjg);
                                }
                            }
                        }
                    } else {
                        C0KJG c0kjg2 = new C0KJG(flashListItemViewComponentConfig.url, flashListItemViewComponentConfig.LIZ);
                        if (first != null && iIntValue >= 0) {
                            ListProtector.add(arrayList, iIntValue, c0kjg2);
                        } else {
                            int i3 = flashListItemViewComponentConfig.fallbackOrder;
                            if (i3 != -2) {
                                if (i3 == 0) {
                                    ListProtector.add(arrayList, 0, c0kjg2);
                                }
                            } else {
                                arrayList.add(c0kjg2);
                            }
                        }
                    }
                }
            }
        }
        C500260Jjc.LJJJLZIJ(arrayList, new AwS586S0100000_7(function1, (Function1<? super C0KCH, Unit>) 596));
        RecyclerView recyclerView = this.LLILZ;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(this.LL);
        }
        if (C19719512Dh.LJI(arrayList)) {
            list2 = arrayList;
        } else {
            list2 = this.LLILZLL;
        }
        this.LLILZLL = list2;
        return arrayList;
    }
}
