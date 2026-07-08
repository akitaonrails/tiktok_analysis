package X;

import android.content.Context;
import com.bytedance.android.alog.Alog;
import com.bytedance.android.livesdk.comp.api.logger.service.ILoggerService;
import com.ss.android.agilelogger.ALog;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Wcp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C827290Wcp extends C09AY implements Function0<Alog> {
    public final /* synthetic */ C827600WdK LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C827290Wcp(C827600WdK c827600WdK) {
        super(0);
        this.LL = c827600WdK;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Alog invoke() {
        this.LL.getClass();
        Context context = ((ILoggerService) C1161920gLG.LIZJ(ILoggerService.class)).getContext();
        if (context == null) {
            return null;
        }
        C0VSJ c0vsj = new C0VSJ(C786410Ut5.y2(context, null), "live_client_offline_log");
        if (!c0vsj.exists()) {
            c0vsj.mkdir();
        }
        C827310Wcr c827310Wcr = new C827310Wcr(context);
        c827310Wcr.LIZIZ = 20971520;
        c827310Wcr.LJ = c0vsj.getPath();
        C827360Wcw c827360WcwLIZ = c827310Wcr.LIZ();
        C827280Wco c827280Wco = new C827280Wco(c827360WcwLIZ.LIZ);
        c827280Wco.LIZJ("live_client_offline_log");
        c827280Wco.LJ = c827360WcwLIZ.LJFF;
        c827280Wco.LJFF = c827360WcwLIZ.LIZLLL;
        c827280Wco.LJI = c827360WcwLIZ.LIZJ;
        c827280Wco.LJII = c827360WcwLIZ.LIZIZ;
        c827280Wco.LJIIIIZZ = ALog.sConfig != null ? ALog.sConfig.LJ : c827360WcwLIZ.LJ;
        c827280Wco.LJIIIZ = 65536;
        c827280Wco.LJIIJ = 196608;
        c827280Wco.LJIIL = EnumC827470Wd7.SAFE.value;
        c827280Wco.LJIILIIL = EnumC827460Wd6.RAW.value;
        c827280Wco.LJIILJJIL = EnumC827440Wd4.LEGACY.value;
        c827280Wco.LJIILL = (c827360WcwLIZ.LJI ? EnumC827430Wd3.ZSTD : EnumC827430Wd3.NONE).value;
        boolean z = c827360WcwLIZ.LJII;
        c827280Wco.LJIILLIIL = (z ? EnumC827450Wd5.TEA_16 : EnumC827450Wd5.NONE).value;
        c827280Wco.LJIIZILJ = (z ? EnumC827420Wd2.EC_SECP256K1 : EnumC827420Wd2.NONE).value;
        c827280Wco.LJIJ = c827360WcwLIZ.LJIIIZ;
        c827280Wco.LJIJI = ALog.sConfig != null ? ALog.sConfig.LJIILLIIL : false;
        return c827280Wco.LIZIZ();
    }
}
