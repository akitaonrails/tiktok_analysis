package X;

import com.bytedance.scene.Scene;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Xuu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C863980Xuu implements InterfaceC863850Xuh {
    public final C0YEM LIZ;
    public final InterfaceC863240Xti LIZIZ;
    public final C864090Xv5 LIZJ;
    public final InterfaceC862700Xsq LIZLLL;
    public final C864120Xv8 LJ;
    public final C864080Xv4 LJFF;
    public final C2232408os LJI;
    public final C1DEV LJII;
    public EnumC864060Xv2 LJIIIIZZ;
    public final Set<String> LJIIIZ;
    public AnonymousClass0956 LJIIJ;

    @Override // X.InterfaceC863850Xuh
    public final Object LIZ(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) throws Throwable {
        Object objLJI = C23250099c.LJI(interfaceC1364105Vn, this.LJI, new C864010Xux(this, null));
        if (objLJI == C099R.LJFF()) {
            return objLJI;
        }
        return Unit.LIZ;
    }

    @Override // X.InterfaceC863850Xuh
    public final void LIZLLL(InterfaceC864110Xv7 interfaceC864110Xv7) {
        if (!this.LJ.LIZ) {
            LJIIIIZZ("registerRetryCommand() called but retry is disabled");
            return;
        }
        C864090Xv5 c864090Xv5 = this.LIZJ;
        InterfaceC864110Xv7 interfaceC864110Xv72 = (InterfaceC864110Xv7) ((LinkedHashMap) c864090Xv5.LIZIZ).get(Integer.valueOf(interfaceC864110Xv7.LIZ()));
        if (interfaceC864110Xv72 != null && c864090Xv5.LIZ.LJIIIZ().LIZIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Command with type ");
            sbLIZ.append(interfaceC864110Xv7.LIZ());
            sbLIZ.append(" (");
            sbLIZ.append(interfaceC864110Xv72.LIZJ());
            sbLIZ.append(") is already registered. Attempted to register ");
            sbLIZ.append(interfaceC864110Xv7.LIZJ());
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        c864090Xv5.LIZIZ.put(Integer.valueOf(interfaceC864110Xv7.LIZ()), interfaceC864110Xv7);
    }

    @Override // X.InterfaceC863850Xuh
    public final Object LJ(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) throws Throwable {
        Object objLJI = C23250099c.LJI(interfaceC1364105Vn, this.LJI, new C864000Xuw(this, null));
        if (objLJI == C099R.LJFF()) {
            return objLJI;
        }
        return Unit.LIZ;
    }

    public final void LJIIIIZZ(String str) {
        C868780Y6i.LJ(this.LIZ.LIZLLL(), "NetworkRequestRetryScheduler", str, 4);
    }

    public final void LJIIIZ(String str) {
        C868780Y6i.LJIILJJIL(this.LIZ.LIZLLL(), "NetworkRequestRetryScheduler", str, 4);
    }

    @Override // X.InterfaceC863850Xuh
    public final Object LIZJ(String str, C863520XuA c863520XuA) {
        if (this.LJ.LIZ && !a0.LJJJIL(str)) {
            return C23250099c.LJI(c863520XuA, this.LJI, new C863280Xtm(this, str, null));
        }
        return false;
    }

    @Override // X.InterfaceC863850Xuh
    public final String LJFF(int i, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(i);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC863850Xuh
    public final Object LJI(String str, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) throws Throwable {
        Object objLJI = C23250099c.LJI(interfaceC1364105Vn, this.LJI, new C863990Xuv(this, str, null));
        if (objLJI == C099R.LJFF()) {
            return objLJI;
        }
        return Unit.LIZ;
    }

    @Override // X.InterfaceC863850Xuh
    public final Object LJII(String str, C863520XuA c863520XuA) {
        if (!this.LJ.LIZ) {
            return false;
        }
        return C23250099c.LJI(c863520XuA, this.LJI, new C863220Xtg(this, str, null));
    }

    public final Object LJIIJJI(String str, AbstractC23140094w abstractC23140094w) {
        if (!this.LJ.LIZ) {
            return false;
        }
        return C23250099c.LJI(abstractC23140094w, this.LJI, new C863230Xth(this, str, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01f2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069 A[Catch: all -> 0x0173, Exception -> 0x0175, CancellationException -> 0x0177, TryCatch #14 {CancellationException -> 0x0177, Exception -> 0x0175, all -> 0x0173, blocks: (B:52:0x012f, B:22:0x0061, B:24:0x0069, B:25:0x0070), top: B:147:0x012f }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0070 A[Catch: all -> 0x0173, Exception -> 0x0175, CancellationException -> 0x0177, TryCatch #14 {CancellationException -> 0x0177, Exception -> 0x0175, all -> 0x0173, blocks: (B:52:0x012f, B:22:0x0061, B:24:0x0069, B:25:0x0070), top: B:147:0x012f }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0089 A[Catch: Exception -> 0x016f, CancellationException -> 0x0171, all -> 0x01db, TryCatch #17 {all -> 0x01db, blocks: (B:29:0x0083, B:31:0x0089, B:88:0x017c, B:93:0x01b1, B:71:0x015a), top: B:144:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a6 A[Catch: all -> 0x0153, Exception -> 0x0156, CancellationException -> 0x0158, TryCatch #13 {CancellationException -> 0x0158, Exception -> 0x0156, all -> 0x0153, blocks: (B:35:0x00a1, B:37:0x00a6, B:40:0x00d3, B:42:0x00db, B:43:0x00e1, B:49:0x00f6, B:53:0x0138, B:63:0x014f, B:64:0x0152), top: B:149:0x00a1 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d3 A[Catch: all -> 0x0153, Exception -> 0x0156, CancellationException -> 0x0158, TryCatch #13 {CancellationException -> 0x0158, Exception -> 0x0156, all -> 0x0153, blocks: (B:35:0x00a1, B:37:0x00a6, B:40:0x00d3, B:42:0x00db, B:43:0x00e1, B:49:0x00f6, B:53:0x0138, B:63:0x014f, B:64:0x0152), top: B:149:0x00a1 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01af A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01da A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0081 -> B:145:0x0083). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILIIL(java.lang.String r12, X.InterfaceC1364105Vn<? super kotlin.Unit> r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C863980Xuu.LJIILIIL(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0239  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJ(X.C864100Xv6 r23, java.lang.String r24, X.InterfaceC1364105Vn<? super java.lang.Boolean> r25) {
        /*
            Method dump skipped, instruction units count: 600
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C863980Xuu.LJIIJ(X.0Xv6, java.lang.String, X.05Vn):java.lang.Object");
    }

    public final void LJIIL(String str, EnumC864040Xv0 enumC864040Xv0, String str2, C864100Xv6 c864100Xv6) {
        long jCurrentTimeMillis = System.currentTimeMillis() - c864100Xv6.LJFF;
        int iLIZ = this.LIZIZ.LIZ() - 1;
        int i = c864100Xv6.LJI + 1;
        C0YJ9 c0yj9 = new C0YJ9(this.LIZ);
        c0yj9.LIZJ("im_sdk_retry_request_completed");
        c0yj9.LIZ(Long.valueOf(jCurrentTimeMillis), "time_in_queue");
        c0yj9.LIZ(Integer.valueOf(c864100Xv6.LIZIZ), "cmd_type");
        c0yj9.LIZ(Integer.valueOf(iLIZ), "current_queue_length");
        c0yj9.LIZ(Integer.valueOf(i), "retry_count");
        c0yj9.LIZ(str2, "request_id");
        c0yj9.LIZ(str, Scene.SCENE_SERVICE);
        c0yj9.LIZ(Integer.valueOf(enumC864040Xv0.getValue()), "complete_code");
        c0yj9.LIZLLL();
    }

    public C863980Xuu(C0YEM c0yem, C869940YAu c869940YAu, C864090Xv5 c864090Xv5, C864020Xuy c864020Xuy, C864120Xv8 c864120Xv8) {
        C864080Xv4 c864080Xv4 = new C864080Xv4(new C864130Xv9(), AFwS189S0000000_3.get$arr$(1610));
        this.LIZ = c0yem;
        this.LIZIZ = c869940YAu;
        this.LIZJ = c864090Xv5;
        this.LIZLLL = c864020Xuy;
        this.LJ = c864120Xv8;
        this.LJFF = c864080Xv4;
        this.LJI = new C2232408os(C786410Ut5.h4());
        this.LJII = C2191201ApK.LIZ();
        this.LJIIIIZZ = EnumC864060Xv2.STOPPED;
        this.LJIIIZ = new LinkedHashSet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0112 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0129 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x014d  */
    /* JADX WARN: Type inference failed for: r0v42, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r11v0, types: [X.0Xuu] */
    /* JADX WARN: Type inference failed for: r14v1, types: [com.bytedance.im.core.proto.Request, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.05Vn] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // X.InterfaceC863850Xuh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T extends X.InterfaceC864170XvD> java.lang.Object LIZIZ(java.lang.String r12, int r13, com.bytedance.im.core.proto.Request r14, kotlin.jvm.functions.Function2<? super com.bytedance.im.core.proto.Request, ? super X.InterfaceC1364105Vn<? super T>, ? extends java.lang.Object> r15, X.InterfaceC1364105Vn<? super T> r16) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C863980Xuu.LIZIZ(java.lang.String, int, com.bytedance.im.core.proto.Request, kotlin.jvm.functions.Function2, X.05Vn):java.lang.Object");
    }
}
