package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0YOu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C873580YOu {
    public final C0YH7 LIZ;

    public C873580YOu(C0YH7 c0yh7) {
        this.LIZ = c0yh7;
    }

    public final void LIZIZ(C873500YOm c873500YOm) {
        try {
            InterfaceC497601wk interfaceC497601wkLIZ = this.LIZ.LLJLL().LIZ();
            C873690YPf c873690YPf = new C873690YPf(this.LIZ.LJFF(), c873500YOm.LIZLLL);
            if (interfaceC497601wkLIZ != null) {
                C23250099c.LIZLLL(interfaceC497601wkLIZ, null, null, new C873590YOv(c873500YOm, this, c873690YPf, null), 3);
            } else {
                this.LIZ.LIZLLL().LJIIIIZZ("SendMediaMessageUseCase", "userLifecycleScope is null, ABORT", null);
                c873690YPf.LIZ(new C0YQ0(null, null, new C0YPY(-1042, "userLifecycleScope is null", null, null), C873700YPg.LIZ(c873500YOm.LIZ)));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C868780Y6i c868780Y6iLIZLLL = this.LIZ.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("startSendingProcess exception ");
            sbLIZ.append(e);
            c868780Y6iLIZLLL.LJIIIIZZ("SendMediaMessageUseCase", C2188811AlT.LIZIZ(sbLIZ), null);
            this.LIZ.LJ().getEvent().LIZLLL("SendMediaMessageUseCase", e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:41:0x00a0, B:45:0x00ab], limit reached: 104 */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[LOOP:0: B:18:0x0057->B:106:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0138 A[Catch: Exception -> 0x0150, CancellationException -> 0x01a0, TryCatch #0 {Exception -> 0x0150, blocks: (B:80:0x0132, B:82:0x0138, B:84:0x013c, B:87:0x0148, B:88:0x014d), top: B:99:0x0132 }] */
    /* JADX WARN: Type inference failed for: r2v3, types: [X.0YPb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x012f -> B:99:0x0132). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.util.List<? extends X.AbstractC873650YPb> r23, X.C873910YQb r24, X.C873500YOm r25, boolean r26, X.InterfaceC1364105Vn<? super X.InterfaceC873740YPk> r27) {
        /*
            Method dump skipped, instruction units count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C873580YOu.LIZ(java.util.List, X.0YQb, X.0YOm, boolean, X.05Vn):java.lang.Object");
    }
}
