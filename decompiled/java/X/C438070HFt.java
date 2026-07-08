package X;

import Y.AsS33S0100000_6;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.ss.android.ugc.aweme.creative.model.ailive.PromptModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: renamed from: X.0HFt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C438070HFt extends FrameLayout {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJILJ;
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public int LLILLL;
    public final C01GW LLILZ;
    public final C425490GmJ LLILZIL;
    public final C01GW LLILZLL;
    public final C2252321DDq LLIZ;
    public final C438080HFu LLIZLLLIL;
    public final C01GW LLJ;
    public final Set<C438110HFx> LLJI;
    public final C2252331DDr LLJIJIL;
    public int LLJILJIL;

    static {
        C2217371BqR c2217371BqR = new C2217371BqR(C438070HFt.class, "prompts", "getPrompts()Ljava/util/List;", 0);
        C13LE.LIZ.getClass();
        LLJILJILJ = new InterfaceC2217461Bqa[]{c2217371BqR};
    }

    private final InterfaceC432280GxG getUiCoreService() {
        return (InterfaceC432280GxG) this.LLILZLL.getValue();
    }

    private final InterfaceC332260D0u<Boolean> get_promptsListVisibleState() {
        return (InterfaceC332260D0u) this.LLILZ.getValue();
    }

    public final List<C438110HFx> getAttachedItemList() {
        return C13LP.LLIIII(this.LLJI);
    }

    public final RecyclerView getPromptListView() {
        return (RecyclerView) this.LLJ.getValue();
    }

    public final List<PromptModel> getPrompts() {
        return (List) this.LLIZLLLIL.getValue(this, LLJILJILJ[0]);
    }

    public final C05YC<Pair<InterfaceC434700H2u, Integer>> get_clickEvent() {
        return (C05YC) this.LL.getValue();
    }

    public final C05YC<C443120HZe<InterfaceC434700H2u, Integer, Boolean>> get_itemAttachEvent() {
        return (C05YC) this.LLILLJJLI.getValue();
    }

    public final RecyclerView.LayoutManager getListLayoutManager() {
        return getPromptListView().getLayoutManager();
    }

    public final int getSpanCount() {
        StaggeredGridLayoutManager staggeredGridLayoutManager;
        RecyclerView.LayoutManager layoutManager = getPromptListView().getLayoutManager();
        if (!(layoutManager instanceof StaggeredGridLayoutManager) || (staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager) == null) {
            return 2;
        }
        return staggeredGridLayoutManager.LJJIII();
    }

    public final void LIZ(Lifecycle lifecycle) {
        final RecyclerView promptListView = getPromptListView();
        promptListView.setAdapter(new C434660H2q(lifecycle, getPrompts(), getUiCoreService()));
        promptListView.addItemDecoration(new C0DXR() { // from class: X.0GmO
            @Override // X.C0DXR
            public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                boolean z;
                boolean z2;
                int iLIZIZ;
                int iLIZIZ2;
                int iLIZIZ3;
                int iLIZIZ4;
                int spanCount = this.LL.getSpanCount();
                int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
                if (childAdapterPosition == c21673919s1.LIZIZ() - 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (childAdapterPosition < spanCount) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                rect.top = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5));
                rect.bottom = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5));
                if (C426750GoL.LIZLLL(promptListView.getContext())) {
                    if (z) {
                        iLIZIZ3 = 0;
                    } else {
                        iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                    }
                    rect.left = iLIZIZ3;
                    if (z2) {
                        iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                    } else {
                        iLIZIZ4 = 0;
                    }
                    rect.right = iLIZIZ4;
                } else {
                    if (z2) {
                        iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                    } else {
                        iLIZIZ = 0;
                    }
                    rect.left = iLIZIZ;
                    if (z) {
                        iLIZIZ2 = 0;
                    } else {
                        iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                    }
                    rect.right = iLIZIZ2;
                }
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                if (layoutManager != null && layoutManager.getItemViewType(view) == 100) {
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams instanceof C21681819tI) {
                        ((C21681819tI) layoutParams).LLILLJJLI = true;
                    }
                }
            }
        });
        LIZJ(2);
        addView(getPromptListView());
        getPromptListView().addOnScrollListener(new AsS33S0100000_6(this, 5));
        this.LLJI.clear();
        C23250099c.LIZLLL(LifecycleKt.androidx_lifecycle_LifecycleKt_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_getCoroutineScope(lifecycle), null, null, new C346801Wg(get_itemAttachEvent(), null, new C438100HFw(this, null)), 3);
        C23250099c.LIZLLL(LifecycleKt.androidx_lifecycle_LifecycleKt_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_getCoroutineScope(lifecycle), null, null, new C346801Wg(this.LLIZ, null, new C433170Gyh(this, null)), 3);
    }

    public final void LIZIZ(boolean z) {
        get_promptsListVisibleState().setValue(Boolean.valueOf(z));
    }

    public final void LIZJ(Integer num) {
        int iIntValue;
        StaggeredGridLayoutManager staggeredGridLayoutManager;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 2;
        }
        if (getPromptListView().getLayoutManager() == null) {
            getPromptListView().setLayoutManager(new StaggeredGridLayoutManager(iIntValue, 0));
            return;
        }
        RecyclerView.LayoutManager layoutManager = getPromptListView().getLayoutManager();
        if (!(layoutManager instanceof StaggeredGridLayoutManager) || (staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager) == null) {
            return;
        }
        staggeredGridLayoutManager.LJJJ(iIntValue);
    }

    public final void setItemBackGroundColorRes(int i) {
        this.LLILLL = i;
    }

    public final void setPrompts(List<PromptModel> list) {
        this.LLIZLLLIL.setValue(this, LLJILJILJ[0], list);
    }

    public C438070HFt(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(455));
        this.LLILLJJLI = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(456));
        this.LLILLL = R.attr.zg;
        this.LLILZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(3369));
        this.LLILZIL = new C425490GmJ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
        this.LLILZLL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1140));
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(C13BV.INSTANCE);
        this.LLIZ = c2252321DDqLIZ;
        this.LLIZLLLIL = new C438080HFu(c2252321DDqLIZ);
        this.LLJ = C452501pT.LIZIZ(new AwS548S0100000_4(context, 455));
        this.LLJI = new LinkedHashSet();
        this.LLJIJIL = C09IR.LIZIZ(0, 1, EnumC2252401DDy.DROP_OLDEST, 1);
    }
}
