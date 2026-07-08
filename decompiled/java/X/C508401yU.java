package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.minis.page.MinisReportActivity;
import com.ss.android.ugc.aweme.minis.report.api.IMinisReportService;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.01yU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C508401yU {
    public static C508401yU LJIIJJI;
    public final String LIZ;
    public final WeakReference<Activity> LIZIZ;
    public final List<WeakReference<Activity>> LIZJ = new ArrayList();
    public final C23119094b LIZLLL;
    public final C054G LJ;
    public String LJFF;
    public String LJI;
    public volatile boolean LJII;
    public String LJIIIIZZ;
    public final C099G LJIIIZ;
    public final C099G LJIIJ;

    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.minis.report.api.MinisData LIZ() {
        /*
            r14 = this;
            com.ss.android.ugc.aweme.minis.common.SchemaParserData r1 = X.C2195221Avo.LJII
            com.ss.android.ugc.aweme.minis.model.MinisMetaResp r3 = X.C2195221Avo.LJIIJ
            X.1Axf r4 = X.C2195221Avo.LJIIIZ
            X.09ZS r0 = X.C09ZS.LIZ
            r0.getClass()
            X.09ZW r0 = X.C09ZS.LIZJ()
            r13 = 0
            if (r0 == 0) goto L8f
            java.lang.String r5 = r0.LIZIZ
        L14:
            java.lang.ref.WeakReference<android.app.Activity> r0 = r14.LIZIZ
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            if (r0 != 0) goto L27
            X.0XAv r0 = X.C844470XAv.LIZ
            r0.getClass()
            android.content.Context r0 = X.C844470XAv.LIZ()
        L27:
            X.0VhM r0 = X.C804420Vh2.LJ(r0)
            if (r0 == 0) goto L8c
            int[] r2 = X.C804480Vh8.LIZ
            int r0 = r0.ordinal()
            r2 = r2[r0]
            r0 = 1
            if (r2 == r0) goto L89
            r0 = 2
            if (r2 == r0) goto L86
            r0 = 3
            if (r2 == r0) goto L83
            r0 = 4
            if (r2 != r0) goto L8c
            java.lang.String r6 = "4G"
        L43:
            if (r1 == 0) goto L7d
            java.lang.Boolean r7 = r1.isNativeGame
            com.ss.android.ugc.aweme.minis.common.TiktokMinisQueryParams r0 = r1.tiktokMinisParams
            if (r0 == 0) goto L7e
            java.lang.String r8 = r0.enterFrom
        L4d:
            java.lang.String r9 = r1.enterMethod
        L4f:
            if (r3 == 0) goto L55
            java.lang.String r10 = r3.minisCategory
            if (r10 != 0) goto L5d
        L55:
            if (r1 == 0) goto L7b
            com.ss.android.ugc.aweme.minis.common.TiktokMinisQueryParams r0 = r1.tiktokMinisParams
            if (r0 == 0) goto L7b
            java.lang.String r10 = r0.minisCategory
        L5d:
            if (r1 == 0) goto L79
            java.lang.String r11 = r1.LJI()
        L63:
            if (r4 == 0) goto L77
            org.json.JSONArray r0 = X.C2196361Axe.LIZ
            java.lang.String r12 = X.C2196361Axe.LIZ(r4)
        L6b:
            if (r1 == 0) goto L71
            java.lang.String r13 = r1.LJIIIZ()
        L71:
            com.ss.android.ugc.aweme.minis.report.api.MinisData r4 = new com.ss.android.ugc.aweme.minis.report.api.MinisData
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r4
        L77:
            r12 = r13
            goto L6b
        L79:
            r11 = r13
            goto L63
        L7b:
            r10 = r13
            goto L5d
        L7d:
            r7 = r13
        L7e:
            r8 = r13
            if (r1 != 0) goto L4d
            r9 = r13
            goto L4f
        L83:
            java.lang.String r6 = "3G"
            goto L43
        L86:
            java.lang.String r6 = "2G"
            goto L43
        L89:
            java.lang.String r6 = "Wi-Fi"
            goto L43
        L8c:
            java.lang.String r6 = "N/A"
            goto L43
        L8f:
            r5 = r13
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C508401yU.LIZ():com.ss.android.ugc.aweme.minis.report.api.MinisData");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0071 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x001a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List LIZIZ(java.util.List r8) throws java.lang.Throwable {
        /*
            java.lang.String r6 = "minis-ReportSession"
            java.lang.String r5 = ","
            X.0XAv r0 = X.C844470XAv.LIZ
            r0.getClass()
            android.content.Context r0 = X.C844470XAv.LIZ()
            java.io.File r4 = X.C786410Ut5.w2(r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r8 = r8.iterator()
        L1a:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L75
            java.lang.Object r7 = r8.next()
            java.lang.String r7 = (java.lang.String) r7
            r2 = 0
            boolean r0 = kotlin.text.a0.LJJIIZI(r7, r5, r2)     // Catch: java.lang.Exception -> L51
            if (r0 == 0) goto L31
            java.lang.String r7 = kotlin.text.a0.LJJLIL(r7, r5, r7)     // Catch: java.lang.Exception -> L51
        L31:
            int r1 = r7.length()     // Catch: java.lang.Exception -> L51
            r0 = 10485760(0xa00000, float:1.469368E-38)
            if (r1 <= r0) goto L41
            int r0 = X.C2187451AjH.LIZ     // Catch: java.lang.Exception -> L51
            java.lang.String r0 = "base64 string exceeds 10 MB limit, skipping"
            X.C1720106oR.LIZ(r6, r0)     // Catch: java.lang.Exception -> L51
            goto L6e
        L41:
            byte[] r2 = android.util.Base64.decode(r7, r2)     // Catch: java.lang.Exception -> L51
            java.lang.String r1 = "minis_report_"
            java.lang.String r0 = ".jpeg"
            java.io.File r0 = java.io.File.createTempFile(r1, r0, r4)     // Catch: java.lang.Exception -> L51
            X.C09BH.LJIIIIZZ(r0, r2)     // Catch: java.lang.Exception -> L51
            goto L6f
        L51:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            int r0 = X.C2187451AjH.LIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "decodeAndWriteFile failed: "
            r1.append(r0)
            java.lang.String r0 = r2.getMessage()
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C1720106oR.LIZ(r6, r0)
        L6e:
            r0 = 0
        L6f:
            if (r0 == 0) goto L1a
            r3.add(r0)
            goto L1a
        L75:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C508401yU.LIZIZ(java.util.List):java.util.List");
    }

    public static Object LIZJ(InterfaceC1364105Vn interfaceC1364105Vn) {
        C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        IMinisReportService iMinisReportService = (IMinisReportService) PluggableExtentionKt.pluggableSpi$default(IMinisReportService.class, false, false, false, 14, null);
        if (iMinisReportService == null) {
            C098200Yq c098200Yq = new C098200Yq(new IllegalStateException("IMinisReportService not available"));
            C189200o6.m2constructorimpl(c098200Yq);
            c23260099m.resumeWith(c098200Yq);
        } else {
            iMinisReportService.LJ(new C5185020h(c23260099m, 48));
        }
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }

    public static Object LIZLLL(InterfaceC1364105Vn interfaceC1364105Vn) {
        C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        IMinisReportService iMinisReportService = (IMinisReportService) PluggableExtentionKt.pluggableSpi$default(IMinisReportService.class, false, false, false, 14, null);
        if (iMinisReportService == null) {
            C098200Yq c098200Yq = new C098200Yq(new IllegalStateException("IMinisReportService not available"));
            C189200o6.m2constructorimpl(c098200Yq);
            c23260099m.resumeWith(c098200Yq);
        } else {
            iMinisReportService.LIZIZ(new C5185020h(c23260099m, 49));
        }
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(X.InterfaceC1364105Vn<? super X.C1735750vGn> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C508101yR
            if (r0 == 0) goto L23
            r5 = r7
            X.01yR r5 = (X.C508101yR) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L23
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r4 = r5.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L31
            if (r0 == r1) goto L3f
            if (r0 != r2) goto L29
            goto L4f
        L23:
            X.01yR r5 = new X.01yR
            r5.<init>(r6, r7)
            goto L12
        L29:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L31:
            X.C155000ia.LIZIZ(r4)
            X.099G r0 = r6.LJIIIZ     // Catch: java.lang.Exception -> L55
            r5.LLILLL = r1     // Catch: java.lang.Exception -> L55
            java.lang.Object r4 = r0.LJLIIIL(r5)     // Catch: java.lang.Exception -> L55
            if (r4 != r3) goto L42
            return r3
        L3f:
            X.C155000ia.LIZIZ(r4)     // Catch: java.lang.Exception -> L55
        L42:
            X.0vGn r4 = (X.C1735750vGn) r4     // Catch: java.lang.Exception -> L55
            if (r4 != 0) goto L75
            r5.LLILLL = r2     // Catch: java.lang.Exception -> L55
            java.lang.Object r4 = LIZJ(r5)     // Catch: java.lang.Exception -> L55
            if (r4 != r3) goto L52
            return r3
        L4f:
            X.C155000ia.LIZIZ(r4)     // Catch: java.lang.Exception -> L55
        L52:
            X.0vGn r4 = (X.C1735750vGn) r4     // Catch: java.lang.Exception -> L55
            return r4
        L55:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            int r0 = X.C2187451AjH.LIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "getImageAuthKey failed: "
            r1.append(r0)
            java.lang.String r0 = r2.getMessage()
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "minis-ReportSession"
            X.C1720106oR.LIZ(r0, r1)
            r4 = 0
        L75:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C508401yU.LJ(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(X.InterfaceC1364105Vn<? super X.C1735750vGn> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C508201yS
            if (r0 == 0) goto L23
            r5 = r7
            X.01yS r5 = (X.C508201yS) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L23
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r4 = r5.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L31
            if (r0 == r1) goto L3f
            if (r0 != r2) goto L29
            goto L4f
        L23:
            X.01yS r5 = new X.01yS
            r5.<init>(r6, r7)
            goto L12
        L29:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L31:
            X.C155000ia.LIZIZ(r4)
            X.099G r0 = r6.LJIIJ     // Catch: java.lang.Exception -> L55
            r5.LLILLL = r1     // Catch: java.lang.Exception -> L55
            java.lang.Object r4 = r0.LJLIIIL(r5)     // Catch: java.lang.Exception -> L55
            if (r4 != r3) goto L42
            return r3
        L3f:
            X.C155000ia.LIZIZ(r4)     // Catch: java.lang.Exception -> L55
        L42:
            X.0vGn r4 = (X.C1735750vGn) r4     // Catch: java.lang.Exception -> L55
            if (r4 != 0) goto L75
            r5.LLILLL = r2     // Catch: java.lang.Exception -> L55
            java.lang.Object r4 = LIZLLL(r5)     // Catch: java.lang.Exception -> L55
            if (r4 != r3) goto L52
            return r3
        L4f:
            X.C155000ia.LIZIZ(r4)     // Catch: java.lang.Exception -> L55
        L52:
            X.0vGn r4 = (X.C1735750vGn) r4     // Catch: java.lang.Exception -> L55
            return r4
        L55:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            int r0 = X.C2187451AjH.LIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "getMaterialAuthKey failed: "
            r1.append(r0)
            java.lang.String r0 = r2.getMessage()
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "minis-ReportSession"
            X.C1720106oR.LIZ(r0, r1)
            r4 = 0
        L75:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C508401yU.LJFF(X.05Vn):java.lang.Object");
    }

    public final void LJI(Activity activity) {
        if (activity == this.LIZIZ.get()) {
            return;
        }
        List<WeakReference<Activity>> list = this.LIZJ;
        if (!(list instanceof Collection) || !((ArrayList) list).isEmpty()) {
            Iterator it2 = ((ArrayList) list).iterator();
            while (it2.hasNext()) {
                if (((Reference) it2.next()).get() == activity) {
                    return;
                }
            }
        }
        ((ArrayList) this.LIZJ).add(new WeakReference(activity));
        int i = C2187451AjH.LIZ;
    }

    public C508401yU(MinisReportActivity minisReportActivity, String str) {
        this.LIZ = str;
        this.LIZIZ = new WeakReference<>(minisReportActivity);
        C23119094b c23119094bLIZ = C2296908zH.LIZ();
        this.LIZLLL = c23119094bLIZ;
        C054G c054gLIZ = C2296808zG.LIZ(C0PEM.LIZJ.plus(c23119094bLIZ));
        this.LJ = c054gLIZ;
        this.LJIIIZ = C23250099c.LIZIZ(c054gLIZ, null, null, new C507901yP(this, null), 3);
        this.LJIIJ = C23250099c.LIZIZ(c054gLIZ, null, null, new C508001yQ(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(X.C1735750vGn r9, java.io.File r10, X.InterfaceC1364105Vn r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof X.C508301yT
            if (r0 == 0) goto L2d
            r4 = r11
            X.01yT r4 = (X.C508301yT) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2d
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r2 = r4.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILZ
            r7 = 3
            r6 = 2
            r5 = 1
            if (r0 == 0) goto L33
            if (r0 == r5) goto L51
            if (r0 == r6) goto L6c
            if (r0 == r7) goto L8b
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2d:
            X.01yT r4 = new X.01yT
            r4.<init>(r8, r11)
            goto L12
        L33:
            X.C155000ia.LIZIZ(r2)
            r2 = 0
            if (r10 == 0) goto L93
            boolean r0 = r10.exists()
            if (r0 == 0) goto L93
            X.0vGm r1 = X.C1735740vGm.LIZ     // Catch: java.lang.Throwable -> L72
            java.lang.String r0 = r10.getAbsolutePath()     // Catch: java.lang.Throwable -> L72
            r4.LLILZ = r5     // Catch: java.lang.Throwable -> L72
            r1.getClass()     // Catch: java.lang.Throwable -> L72
            java.lang.Object r2 = X.C1735740vGm.LIZ(r9, r0, r2, r4)     // Catch: java.lang.Throwable -> L72
            if (r2 != r3) goto L54
            return r3
        L51:
            X.C155000ia.LIZIZ(r2)     // Catch: java.lang.Throwable -> L72
        L54:
            r1 = r2
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L72
            java.lang.String r0 = X.C2195221Avo.LJIIIIZZ
            if (r0 == 0) goto L71
            X.01aU r0 = X.C359501aT.LIZ(r0)
            if (r0 == 0) goto L71
            r4.LL = r1
            r4.LLILZ = r6
            kotlin.Unit r0 = r0.LIZIZ()
            if (r0 != r3) goto L71
            return r3
        L6c:
            java.lang.Object r1 = r4.LL
            X.C155000ia.LIZIZ(r2)
        L71:
            return r1
        L72:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L72
            java.lang.String r1 = X.C2195221Avo.LJIIIIZZ
            if (r1 == 0) goto L92
            X.01aU r1 = X.C359501aT.LIZ(r1)
            if (r1 == 0) goto L92
            r4.LL = r0
            r4.LLILZ = r7
            kotlin.Unit r1 = r1.LIZIZ()
            if (r1 != r3) goto L92
            return r3
        L8b:
            java.lang.Object r0 = r4.LL
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            X.C155000ia.LIZIZ(r2)
        L92:
            throw r0
        L93:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C508401yU.LJII(X.0vGn, java.io.File, X.05Vn):java.lang.Object");
    }
}
