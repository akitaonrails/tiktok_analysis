package X;

import Y.ACListenerS111S0200000_7;
import android.app.Activity;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveShowResolutionSelectionSetting;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS621S0100000_7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0INb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C465450INb extends AbstractC21673619ry<C465460INc> {
    public final RecyclerView LL;
    public final List<C465470INd> LLILLJJLI;
    public final Map<String, String> LLILLL;
    public final Function2<String, Integer, Unit> LLILZ;
    public int LLILZIL;
    public final BPEAHandler LLILZLL = new BPEAHandler(Looper.getMainLooper());
    public boolean LLIZ;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILLJJLI.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [T, java.lang.String] */
    public final void LLLFZ(C465460INc c465460INc) {
        final int bindingAdapterPosition;
        final int i;
        if (!this.LLIZ && (bindingAdapterPosition = c465460INc.getBindingAdapterPosition()) != (i = this.LLILZIL)) {
            this.LLIZ = true;
            final C259800zU c259800zU = new C259800zU();
            ?? r0 = ((C465470INd) ListProtector.get(this.LLILLJJLI, bindingAdapterPosition)).LIZIZ;
            c259800zU.element = r0;
            if (r0 != 0 && r0.length() != 0) {
                final String str = ((C465470INd) ListProtector.get(this.LLILLJJLI, i)).LIZ;
                String str2 = "";
                if (str == null) {
                    str = "";
                }
                String str3 = C0IL2.LIZ.LIZ().mEnterRoomConfig.mRoomsData.warmUpPlayerTag;
                if (str3 != null) {
                    str2 = str3;
                }
                InterfaceC480510Isr interfaceC480510IsrLIZIZ = ((IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class)).YY().LIZIZ(str2);
                if (interfaceC480510IsrLIZIZ != null) {
                    interfaceC480510IsrLIZIZ.switchResolution((String) c259800zU.element, new InterfaceC1699420uKC() { // from class: X.0INf
                        @Override // X.InterfaceC1699420uKC
                        public final void LIZ(final boolean z) {
                            final C465450INb c465450INb = this.LIZ;
                            BPEAHandler bPEAHandler = c465450INb.LLILZLL;
                            final int i2 = bindingAdapterPosition;
                            final int i3 = i;
                            final C259800zU<String> c259800zU2 = c259800zU;
                            final String str4 = str;
                            C786410Ut5.LJJZZIII(bPEAHandler, new Runnable() { // from class: X.0INe
                                public final void LIZ() {
                                    Integer num;
                                    C465460INc c465460INc2;
                                    C465460INc c465460INc3;
                                    if (z) {
                                        C465470INd c465470INd = (C465470INd) ListProtector.get(c465450INb.LLILLJJLI, i2);
                                        C465450INb c465450INb2 = c465450INb;
                                        int i4 = i2;
                                        ((C465470INd) ListProtector.get(c465450INb2.LLILLJJLI, i4)).LIZLLL = true;
                                        RecyclerView recyclerView = c465450INb2.LL;
                                        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = recyclerView != null ? recyclerView.findViewHolderForAdapterPosition(i4) : null;
                                        if ((viewHolderFindViewHolderForAdapterPosition instanceof C465460INc) && (c465460INc3 = (C465460INc) viewHolderFindViewHolderForAdapterPosition) != null) {
                                            View view = c465460INc3.LLILLJJLI;
                                            if (view != null) {
                                                view.setSelected(true);
                                            }
                                            C16F5 c16f5 = c465460INc3.LLILLL;
                                            if (c16f5 != null) {
                                                c16f5.setSelected(true);
                                            }
                                            C20744016Fi c20744016Fi = c465460INc3.LLILZ;
                                            if (c20744016Fi != null) {
                                                c20744016Fi.setChecked(true);
                                            }
                                        }
                                        C465450INb c465450INb3 = c465450INb;
                                        int i5 = i3;
                                        ((C465470INd) ListProtector.get(c465450INb3.LLILLJJLI, i5)).LIZLLL = false;
                                        RecyclerView recyclerView2 = c465450INb3.LL;
                                        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition2 = recyclerView2 != null ? recyclerView2.findViewHolderForAdapterPosition(i5) : null;
                                        if ((viewHolderFindViewHolderForAdapterPosition2 instanceof C465460INc) && (c465460INc2 = (C465460INc) viewHolderFindViewHolderForAdapterPosition2) != null) {
                                            View view2 = c465460INc2.LLILLJJLI;
                                            if (view2 != null) {
                                                view2.setSelected(false);
                                            }
                                            C16F5 c16f52 = c465460INc2.LLILLL;
                                            if (c16f52 != null) {
                                                c16f52.setSelected(false);
                                            }
                                            C20744016Fi c20744016Fi2 = c465460INc2.LLILZ;
                                            if (c20744016Fi2 != null) {
                                                c20744016Fi2.setChecked(false);
                                            }
                                        }
                                        c465450INb.LLILZIL = i2;
                                        if (LiveShowResolutionSelectionSetting.INSTANCE.needPersistAcrossRooms()) {
                                            ((IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class)).cy1(c259800zU2.element);
                                        }
                                        if (c465470INd.LIZIZ == null || (num = c465470INd.LIZJ) == null) {
                                            return;
                                        }
                                        num.intValue();
                                        String str5 = c465470INd.LIZIZ;
                                        String strLJI = Intrinsics.LJFF(str5 != null ? str5.toLowerCase(Locale.ROOT) : null, "auto") ? C20642515q3.LJI(2131855063) : C786410Ut5.j4(C20642515q3.LJI(2131855062), Arrays.copyOf(new Object[]{c465470INd.LIZ}, 1));
                                        RecyclerView recyclerView3 = c465450INb.LL;
                                        Activity activityLJIJ = C520010KaN.LJIJ(recyclerView3 != null ? recyclerView3.getContext() : null, false);
                                        if (activityLJIJ != null) {
                                            C1389890mGx c1389890mGx = new C1389890mGx(activityLJIJ);
                                            c1389890mGx.LJIIJ(strLJI);
                                            c1389890mGx.LJIIJJI();
                                        }
                                        c465450INb.LLILZ.invoke(c465470INd.LIZIZ, c465470INd.LIZJ);
                                    }
                                    String str6 = c259800zU2.element;
                                    String str7 = str4;
                                    List<C465470INd> list = c465450INb.LLILLJJLI;
                                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                                    Iterator<C465470INd> it2 = list.iterator();
                                    while (it2.hasNext()) {
                                        arrayList.add(it2.next().LIZIZ);
                                    }
                                    ArrayList arrayList2 = new ArrayList();
                                    for (Object obj : arrayList) {
                                        String str8 = (String) obj;
                                        if (str8 != null && str8.length() != 0) {
                                            arrayList2.add(obj);
                                        }
                                    }
                                    boolean z2 = z;
                                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_manual_videoquality_event");
                                    c474500IjALIZ.LJJII(C465500INg.LIZ, "manual_videoquality_sid");
                                    c474500IjALIZ.LJJII("select_quality", "manual_videoquality_action_type");
                                    c474500IjALIZ.LJJII(str7, "from_quality");
                                    c474500IjALIZ.LJJII(C13LP.LJJLIIIJ(arrayList2, ",", null, null, 0, null, null, 62), "available_quality");
                                    c474500IjALIZ.LJJII(str6, "selected_quality");
                                    c474500IjALIZ.LJJII(z2 ? "1" : CardStruct.IStatusCode.DEFAULT, "is_manual_vq_success");
                                    c474500IjALIZ.LJJII(String.valueOf(0), "error_code");
                                    c474500IjALIZ.LJIL();
                                    c474500IjALIZ.LIZ();
                                    c465450INb.LLIZ = false;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean zLIZ;
                                    C1C7U.LIZ("LiveTalentDefinitionSelectionDialog$TalentDefinitionListAdapter@3d4e.handleAudienceItemSelect$2$1");
                                    try {
                                        LIZ();
                                    } finally {
                                        if (!zLIZ) {
                                        }
                                    }
                                    C1C7U.LIZIZ("LiveTalentDefinitionSelectionDialog$TalentDefinitionListAdapter@3d4e.handleAudienceItemSelect$2$1");
                                }
                            });
                        }
                    });
                }
            }
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        String str;
        String lowerCase;
        C465460INc c465460INc = (C465460INc) viewHolder;
        C465470INd c465470INd = (C465470INd) ListProtector.get(this.LLILLJJLI, i);
        C20744016Fi c20744016Fi = c465460INc.LLILZ;
        if (c20744016Fi != null) {
            c20744016Fi.setClickable(false);
        }
        String strJ4 = c465470INd.LIZ;
        String str2 = c465470INd.LIZIZ;
        String lowerCase2 = null;
        if (str2 != null) {
            lowerCase2 = str2.toLowerCase(Locale.ROOT);
        }
        if (Intrinsics.LJFF(lowerCase2, "auto") && c465470INd.LIZLLL && (str = c465460INc.LL.get(C0INE.LIZIZ())) != null && (lowerCase = str.toLowerCase(Locale.ROOT)) != null && lowerCase.length() != 0) {
            strJ4 = C786410Ut5.j4(C20642515q3.LJI(2131855059), Arrays.copyOf(new Object[]{lowerCase}, 1));
        }
        C16F5 c16f5 = c465460INc.LLILLL;
        if (c16f5 != null) {
            c16f5.setText(strJ4);
        }
        C20744016Fi c20744016Fi2 = c465460INc.LLILZ;
        if (c20744016Fi2 != null) {
            c20744016Fi2.setChecked(c465470INd.LIZLLL);
        }
        View view = c465460INc.LLILLJJLI;
        if (view != null) {
            view.setSelected(c465470INd.LIZLLL);
        }
        C16F5 c16f52 = c465460INc.LLILLL;
        if (c16f52 != null) {
            c16f52.setSelected(c465470INd.LIZLLL);
        }
        C16F5 c16f53 = c465460INc.LLILLL;
        if (c16f53 != null) {
            C786410Ut5.l8(c16f53, new ACListenerS111S0200000_7(this, c465460INc, 11));
        }
        C786410Ut5.I7(new ACListenerS111S0200000_7(this, c465460INc, 12), c465460INc.itemView);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C465460INc c465460INc = new C465460INc(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.hq5, viewGroup, false), this.LLILLL);
        try {
            View view = c465460INc.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c465460INc.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c465460INc.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C465460INc.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c465460INc.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c465460INc.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C465460INc.class.getName();
        return c465460INc;
    }

    public C465450INb(RecyclerView recyclerView, List list, Map map, AwS621S0100000_7 awS621S0100000_7) {
        this.LL = recyclerView;
        this.LLILLJJLI = list;
        this.LLILLL = map;
        this.LLILZ = awS621S0100000_7;
        int size = ((ArrayList) list).size();
        for (int i = 0; i < size; i++) {
            if (((C465470INd) ListProtector.get(this.LLILLJJLI, i)).LIZLLL) {
                this.LLILZIL = i;
                return;
            }
        }
    }
}
