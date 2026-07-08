package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.mob.record.IRecordMobService;
import com.ss.android.ugc.aweme.services.optimization.ILayoutPreloadServiceForEditPage;
import com.ss.ugc.aweme.creation.base.BasicModel;
import com.ss.ugc.aweme.creation.base.TrackModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS546S0100000_2;
import njp.a;

/* JADX INFO: renamed from: X.0MOp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.external.composer.MixStudioShareParser$launch$1", f = "MixStudioShareParser.kt", l = {}, m = "invokeSuspend")
public final class C567770MOp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ Intent LLILLJJLI;
    public final /* synthetic */ C575890MiJ LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C567770MOp(Context context, Intent intent, C575890MiJ c575890MiJ, InterfaceC1364105Vn<? super C567770MOp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = context;
        this.LLILLJJLI = intent;
        this.LLILLL = c575890MiJ;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C567770MOp(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Bundle extras;
        Bundle extras2;
        String shootWay;
        String enterFrom;
        TrackModel track;
        TrackModel track2;
        TrackModel track3;
        C1C7U.LIZ("MixStudioShareParser@252e.launch$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String enterMethod = null;
        if (C0L4C.LIZ()) {
            C1660680tJi.LIZ().LJIIZILJ(this.LL, this.LLILLJJLI, true);
        } else {
            ILayoutPreloadServiceForEditPage iLayoutPreloadServiceForEditPage = (ILayoutPreloadServiceForEditPage) PluggableExtentionKt.pluggableSpi$default(ILayoutPreloadServiceForEditPage.class, false, false, false, 14, null);
            if (iLayoutPreloadServiceForEditPage != null) {
                Context context = this.LL;
                try {
                    extras2 = this.LLILLJJLI.getExtras();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    extras2 = null;
                }
                iLayoutPreloadServiceForEditPage.preloadLayoutFiles(context, extras2);
            }
            Context context2 = this.LL;
            try {
                extras = this.LLILLJJLI.getExtras();
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                extras = null;
            }
            C0MWH.LJIILLIIL(context2, extras);
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        BasicModel basic = this.LLILLL.LIZ.getBasic();
        if (basic != null && (track3 = basic.getTrack()) != null) {
            shootWay = track3.getShootWay();
        } else {
            shootWay = null;
        }
        c2344009Gk.LJIIIIZZ("shoot_way", shootWay);
        BasicModel basic2 = this.LLILLL.LIZ.getBasic();
        if (basic2 != null && (track2 = basic2.getTrack()) != null) {
            enterFrom = track2.getEnterFrom();
        } else {
            enterFrom = null;
        }
        c2344009Gk.LJIIIIZZ("enter_from", enterFrom);
        BasicModel basic3 = this.LLILLL.LIZ.getBasic();
        if (basic3 != null && (track = basic3.getTrack()) != null) {
            enterMethod = track.getEnterMethod();
        }
        c2344009Gk.LJIIIIZZ("enter_method", enterMethod);
        IRecordMobService iRecordMobService = (IRecordMobService) PluggableExtentionKt.pluggableSpi$default(IRecordMobService.class, false, false, false, 14, null);
        if (iRecordMobService != null) {
            iRecordMobService.LIZ(c2344009Gk.LIZ);
        }
        C01TT.LIZLLL(new AwS546S0100000_2(this.LLILLL, 1101));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MixStudioShareParser@252e.launch$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
