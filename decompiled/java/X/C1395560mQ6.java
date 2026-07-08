package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.minis.model.MinisMetaResp;
import com.ss.android.ugc.aweme.minis.report.api.IMinisReportService;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS456S0200000_21;

/* JADX INFO: renamed from: X.0mQ6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1395560mQ6 {
    public final MinisMetaResp LIZ;
    public final String LIZIZ;
    public final Activity LIZJ;
    public final InterfaceC1395520mQ2 LIZLLL;
    public final Function2<String, Throwable, Unit> LJ;
    public final Function2<C1395560mQ6, Throwable, Unit> LJFF;
    public final AtomicReference<EnumC1395570mQ7> LJI = new AtomicReference<>(EnumC1395570mQ7.UNSET);
    public String LJII;
    public Throwable LJIIIIZZ;
    public C1381420m3I LJIIIZ;

    public final Object LIZJ(InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        ((IMinisReportService) ServiceManager.get().getService(IMinisReportService.class)).LJFF(this.LIZIZ, new AwS456S0200000_21(this, c23260099m, 15));
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }

    public final Object LIZLLL(InterfaceC1364105Vn<? super C1735750vGn> interfaceC1364105Vn) {
        C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        ((IMinisReportService) ServiceManager.get().getService(IMinisReportService.class)).LJ(new AwS456S0200000_21(this, c23260099m, 16));
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }

    public final Object LIZIZ(String str, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        ((IMinisReportService) ServiceManager.get().getService(IMinisReportService.class)).LJI(this.LIZIZ, str, new AwS456S0200000_21(this, c23260099m, 14));
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }

    public final Object LIZ(String str, String str2, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        ((IMinisReportService) ServiceManager.get().getService(IMinisReportService.class)).LJIIIZ(this.LIZIZ, str, str2, new AwS456S0200000_21(this, c23260099m, 13));
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(java.lang.String r6, java.lang.String r7, X.InterfaceC1364105Vn<? super kotlin.Unit> r8) {
        /*
            r5 = this;
            if (r7 == 0) goto Lc
            int r0 = r7.length()
            if (r0 <= 0) goto L41
            X.01yO r4 = X.EnumC507801yO.COMPLETE
        La:
            if (r4 != 0) goto Le
        Lc:
            X.01yO r4 = X.EnumC507801yO.UPLOAD_IMAGE_FAILED
        Le:
            X.099m r3 = new X.099m
            X.05Vn r0 = X.C099M.LIZLLL(r8)
            r3.<init>(r0)
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.minis.report.api.IMinisReportService> r0 = com.ss.android.ugc.aweme.minis.report.api.IMinisReportService.class
            java.lang.Object r2 = r1.getService(r0)
            com.ss.android.ugc.aweme.minis.report.api.IMinisReportService r2 = (com.ss.android.ugc.aweme.minis.report.api.IMinisReportService) r2
            kotlin.jvm.internal.AwS456S0200000_21 r1 = new kotlin.jvm.internal.AwS456S0200000_21
            r0 = 17
            r1.<init>(r5, r3, r0)
            r2.LIZLLL(r6, r7, r4, r1)
            java.lang.Object r1 = r3.LIZ()
            java.lang.Object r0 = X.C099R.LJFF()
            if (r1 != r0) goto L3a
            X.C099Q.LIZJ(r8)
        L3a:
            java.lang.Object r0 = X.C099R.LJFF()
            if (r1 != r0) goto L44
            return r1
        L41:
            X.01yO r4 = X.EnumC507801yO.UPLOAD_IMAGE_FAILED
            goto La
        L44:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1395560mQ6.LJ(java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1395560mQ6(MinisMetaResp minisMetaResp, String str, Activity activity, InterfaceC1395520mQ2 interfaceC1395520mQ2, Function2<? super String, ? super Throwable, Unit> function2, Function2<? super C1395560mQ6, ? super Throwable, Unit> function22) {
        this.LIZ = minisMetaResp;
        this.LIZIZ = str;
        this.LIZJ = activity;
        this.LIZLLL = interfaceC1395520mQ2;
        this.LJ = function2;
        this.LJFF = function22;
        this.LJIIIZ = new C1381420m3I(str, EnumC1381430m3J.VIOLATION);
    }
}
