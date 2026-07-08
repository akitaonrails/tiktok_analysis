package X;

import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0S7v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.videohotswap.overlay.FullAwemeCallback$onFullAwemeFetchSuccessVhs$1", f = "FullAwemeCallback.kt", l = {}, m = "invokeSuspend")
public final class C716290S7v extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC692440REc LL;
    public final /* synthetic */ List<Aweme> LLILLJJLI;
    public final /* synthetic */ C716280S7u LLILLL;
    public final /* synthetic */ List<C0S81> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C716290S7v(InterfaceC692440REc interfaceC692440REc, List<? extends Aweme> list, C716280S7u c716280S7u, List<C0S81> list2, InterfaceC1364105Vn<? super C716290S7v> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC692440REc;
        this.LLILLJJLI = list;
        this.LLILLL = c716280S7u;
        this.LLILZ = list2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C716290S7v(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String aid;
        C0S8S c0s8s;
        BaseListFragmentPanel baseListFragmentPanelYE;
        IPlayerComponentAbility iPlayerComponentAbilityX32;
        C1C7U.LIZ("FullAwemeCallback@29f7.onFullAwemeFetchSuccessVhs$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.setData(this.LLILLJJLI);
        this.LL.notifyDataSetChanged();
        IFeedPanelPlatformAbility iFeedPanelPlatformAbility = this.LLILLL.LJ;
        if (iFeedPanelPlatformAbility != null && (iPlayerComponentAbilityX32 = iFeedPanelPlatformAbility.x32()) != null) {
            iPlayerComponentAbilityX32.tryResumePlay();
        }
        Iterator<Aweme> it2 = this.LLILLJJLI.iterator();
        while (true) {
            int iCl2 = 0;
            String strCY1 = null;
            if (!it2.hasNext()) {
                break;
            }
            Aweme next = it2.next();
            IFeedPanelPlatformAbility iFeedPanelPlatformAbility2 = this.LLILLL.LJ;
            if (iFeedPanelPlatformAbility2 != null && (baseListFragmentPanelYE = iFeedPanelPlatformAbility2.yE()) != null) {
                C716280S7u c716280S7u = this.LLILLL;
                IFeedPanelPlatformAbility iFeedPanelPlatformAbility3 = c716280S7u.LJ;
                if (iFeedPanelPlatformAbility3 != null) {
                    strCY1 = iFeedPanelPlatformAbility3.cY1();
                }
                IFeedPanelPlatformAbility iFeedPanelPlatformAbility4 = c716280S7u.LJ;
                if (iFeedPanelPlatformAbility4 != null) {
                    iCl2 = iFeedPanelPlatformAbility4.cl2();
                }
                C1440005kM.LIZ(new C1D01(iCl2, next, baseListFragmentPanelYE, strCY1));
            }
        }
        for (C0S81 c0s81 : this.LLILZ) {
            Aweme awemeInvoke = this.LLILLL.LIZJ.invoke();
            if (awemeInvoke != null) {
                aid = awemeInvoke.getAid();
            } else {
                aid = null;
            }
            if (Intrinsics.LJFF(aid, c0s81.LIZ.getAid()) && (c0s8s = this.LLILLL.LIZIZ) != null) {
                C0S8V c0s8v = c0s81.LIZIZ;
                FrameLayout frameLayout = c0s8s.LIZ;
                if (frameLayout != null) {
                    C786410Ut5.LJZ(0, frameLayout);
                }
                FrameLayout frameLayout2 = c0s8s.LIZIZ;
                if (frameLayout2 != null) {
                    C786410Ut5.LJZ(8, frameLayout2);
                }
                ((C0S8T) c0s8s.LIZ(c0s8v)).LIZLLL();
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FullAwemeCallback@29f7.onFullAwemeFetchSuccessVhs$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
