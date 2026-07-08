package X;

import Y.AObjectS126S0000000_28;
import android.app.Activity;
import android.view.View;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.homepage.IHomePageService;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0zfQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.tiktok.kmp.nu.feed.ShortcutRefreshEntryManager$tryShowRefreshTooltip$4", f = "ShortcutRefreshEntryManager.kt", l = {145}, m = "invokeSuspend")
public final class C1904780zfQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1904780zfQ(int i, InterfaceC1364105Vn<? super C1904780zfQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1904780zfQ(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Activity activityLIZIZ;
        Activity activityLIZ;
        IHomePageService iHomePageService;
        InterfaceC1570600qyQ interfaceC1570600qyQLJIILL;
        AbstractC1591090rVT abstractC1591090rVTY01;
        View viewLJIJI;
        C1C7U.LIZ("ShortcutRefreshEntryManager@190e.tryShowRefreshTooltip$4");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C1904820zfU.LIZ.getClass();
            long j = C1904820zfU.LIZIZ().LIZIZ;
            if (j > 0) {
                this.LL = 1;
                if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                    C1C7U.LIZIZ("ShortcutRefreshEntryManager@190e.tryShowRefreshTooltip$4");
                    return objLJFF;
                }
            }
        }
        C1904810zfT c1904810zfT = C1904810zfT.LIZ;
        C1904820zfU.LIZ.getClass();
        long j2 = C1904820zfU.LIZIZ().LIZJ;
        c1904810zfT.getClass();
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        if (abstractC1387200mCcLJ != null && (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) != null && (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) != null && (activityLIZ instanceof C19EG) && (iHomePageService = (IHomePageService) PluggableExtentionKt.pluggableSpi$default(IHomePageService.class, false, false, false, 14, null)) != null && (interfaceC1570600qyQLJIILL = iHomePageService.LJIILL((C19EG) activityLIZ)) != null && (abstractC1591090rVTY01 = interfaceC1570600qyQLJIILL.y01()) != null && (viewLJIJI = abstractC1591090rVTY01.LJIJI("HOME")) != null) {
            C450650Hln c450650Hln = new C450650Hln(viewLJIJI.getContext());
            C1904800zfS.LIZ.getClass();
            C450650Hln.LJ(c450650Hln, C1904800zfS.LIZ("refreshFeed_forYou_tooltip_desc"), R.attr.ace);
            c450650Hln.LIZ(0);
            C1391550mJd c1391550mJd = new C1391550mJd(activityLIZ);
            c1391550mJd.LLILLJJLI.LIZIZ = viewLJIJI;
            c1391550mJd.LLILLJJLI.LJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(80));
            c1391550mJd.LJII(R.attr.acd);
            C1391600mJi c1391600mJi = c1391550mJd.LLILLJJLI;
            c1391600mJi.LJIIZILJ = c450650Hln;
            c1391600mJi.LIZLLL = EnumC1235690iGF.TOP;
            c1391600mJi.LJII = j2;
            EnumC1584360rKc enumC1584360rKc = EnumC1584360rKc.HOME;
            C1905770zh1.LIZ(c1391550mJd, "clc_shortcut_feed_refresh_tip", enumC1584360rKc, new AObjectS126S0000000_28(4));
            C0P0T c0p0tLIZIZ = c1391550mJd.LIZIZ();
            C1904790zfR c1904790zfRLIZ = C1904960zfi.LIZ("clc_shortcut_feed_refresh_tip", enumC1584360rKc);
            c1904790zfRLIZ.LIZLLL = false;
            c1904790zfRLIZ.LJ = j2;
            c1904790zfRLIZ.LJFF = EnumC1619300sEy.NO_OPERATION;
            if (Intrinsics.LJFF(C1905750zgz.LIZIZ.LJFF(c1904790zfRLIZ.LIZ(c0p0tLIZIZ), null), C0J74.LIZ)) {
                C20684815ws.LJIILLIIL("refresh_feed_show", C2097608Jq.LJI(new Pair("vv", String.valueOf(this.LLILLJJLI)), new Pair("dnu_days", String.valueOf(C1904820zfU.LIZIZ)), new Pair("skip_num", String.valueOf(C1904820zfU.LIZJ))));
                C01GW c01gw = C1904820zfU.LJFF;
                ((Keva) ((C1904840zfW) c01gw.getValue()).LIZIZ.getValue()).storeInt("tooltip_show_times", ((Keva) ((C1904840zfW) c01gw.getValue()).LIZIZ.getValue()).getInt("tooltip_show_times", 0) + 1);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ShortcutRefreshEntryManager@190e.tryShowRefreshTooltip$4");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
