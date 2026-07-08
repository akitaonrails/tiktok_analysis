package X;

import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.contacts.api.model.MAFIMUser;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.1BHn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2202371BHn implements InterfaceC2202381BHo {
    public final InterfaceC2202381BHo LIZ;
    public final InterfaceC1493105sv LIZIZ;

    @Override // X.InterfaceC2202381BHo
    public final int LIZLLL() {
        try {
            return this.LIZ.LIZLLL();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            LJIIL("getFollowingAndCanSendMessageCount", e);
            return 0;
        }
    }

    @Override // X.InterfaceC2202381BHo
    public final List<IMUser> LJI() {
        try {
            return this.LIZ.LJI();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            LJIIL("getAllMUFWithShareStatus", e);
            return C13BV.INSTANCE;
        }
    }

    public C2202371BHn(C808340VnM c808340VnM) {
        InterfaceC1493505sz interfaceC1493505szLIZIZ = C0I0B.LJFF.LIZIZ();
        this.LIZ = c808340VnM;
        this.LIZIZ = interfaceC1493505szLIZIZ;
    }

    @Override // X.InterfaceC2202381BHo
    public final MAFIMUser LJ(long j) {
        try {
            return this.LIZ.LJ(j);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            LJIIL("getMAFWithShareStatus", e);
            return null;
        }
    }

    @Override // X.InterfaceC2202381BHo
    public final List<MAFIMUser> LJFF(int i) {
        try {
            return this.LIZ.LJFF(i);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            LJIIL("getAllMAFWithShareStatus", e);
            return new ArrayList();
        }
    }

    @Override // X.InterfaceC2202381BHo
    public final List<IMUser> LJII(List<Long> list) {
        try {
            return this.LIZ.LJII(list);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            LJIIL("getIMUserBaseInfoListWithShareStatus", e);
            return null;
        }
    }

    @Override // X.InterfaceC2202381BHo
    public final IMUser LJIIJ(Long l) {
        try {
            return this.LIZ.LJIIJ(l);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            LJIIL("getIMUserBaseInfoWithShareStatus", e);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    @Override // X.InterfaceC2202381BHo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.util.List<com.ss.android.ugc.aweme.im.contacts.impl.model.SharePermission> r6, X.InterfaceC1364105Vn<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C2202441BHu
            if (r0 == 0) goto L20
            r4 = r7
            X.1BHu r4 = (X.C2202441BHu) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L32
            if (r0 != r1) goto L2a
            goto L26
        L20:
            X.1BHu r4 = new X.1BHu
            r4.<init>(r5, r7)
            goto L12
        L26:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Exception -> L40
            goto L49
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C155000ia.LIZIZ(r3)
            X.1BHo r0 = r5.LIZ     // Catch: java.lang.Exception -> L40
            r4.LLILLL = r1     // Catch: java.lang.Exception -> L40
            java.lang.Object r0 = r0.LIZ(r6, r4)     // Catch: java.lang.Exception -> L40
            if (r0 != r2) goto L49
            return r2
        L40:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            java.lang.String r0 = "insertOrReplaceList"
            r5.LJIIL(r0, r1)
        L49:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2202371BHn.LIZ(java.util.List, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    @Override // X.InterfaceC2202381BHo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.lang.Long r6, X.InterfaceC1364105Vn<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C2202391BHp
            if (r0 == 0) goto L20
            r4 = r7
            X.1BHp r4 = (X.C2202391BHp) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L32
            if (r0 != r1) goto L2a
            goto L26
        L20:
            X.1BHp r4 = new X.1BHp
            r4.<init>(r5, r7)
            goto L12
        L26:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Exception -> L40
            goto L49
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C155000ia.LIZIZ(r3)
            X.1BHo r0 = r5.LIZ     // Catch: java.lang.Exception -> L40
            r4.LLILLL = r1     // Catch: java.lang.Exception -> L40
            java.lang.Object r0 = r0.LIZIZ(r6, r4)     // Catch: java.lang.Exception -> L40
            if (r0 != r2) goto L49
            return r2
        L40:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            java.lang.String r0 = "delete"
            r5.LJIIL(r0, r1)
        L49:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2202371BHn.LIZIZ(java.lang.Long, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    @Override // X.InterfaceC2202381BHo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(java.util.List<java.lang.Long> r6, X.InterfaceC1364105Vn<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C2202431BHt
            if (r0 == 0) goto L20
            r4 = r7
            X.1BHt r4 = (X.C2202431BHt) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L32
            if (r0 != r1) goto L2a
            goto L26
        L20:
            X.1BHt r4 = new X.1BHt
            r4.<init>(r5, r7)
            goto L12
        L26:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Exception -> L40
            goto L49
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C155000ia.LIZIZ(r3)
            X.1BHo r0 = r5.LIZ     // Catch: java.lang.Exception -> L40
            r4.LLILLL = r1     // Catch: java.lang.Exception -> L40
            java.lang.Object r0 = r0.LIZJ(r6, r4)     // Catch: java.lang.Exception -> L40
            if (r0 != r2) goto L49
            return r2
        L40:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            java.lang.String r0 = "deleteList"
            r5.LJIIL(r0, r1)
        L49:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2202371BHn.LIZJ(java.util.List, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    @Override // X.InterfaceC2202381BHo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIIZZ(java.lang.Long r6, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.im.contacts.impl.model.SharePermission> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C2202401BHq
            if (r0 == 0) goto L20
            r4 = r7
            X.1BHq r4 = (X.C2202401BHq) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L32
            if (r0 != r1) goto L2a
            goto L26
        L20:
            X.1BHq r4 = new X.1BHq
            r4.<init>(r5, r7)
            goto L12
        L26:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Exception -> L41
            return r3
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C155000ia.LIZIZ(r3)
            X.1BHo r0 = r5.LIZ     // Catch: java.lang.Exception -> L41
            r4.LLILLL = r1     // Catch: java.lang.Exception -> L41
            java.lang.Object r3 = r0.LJIIIIZZ(r6, r4)     // Catch: java.lang.Exception -> L41
            if (r3 != r2) goto L40
            return r2
        L40:
            return r3
        L41:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            java.lang.String r0 = "getSharePermission"
            r5.LJIIL(r0, r1)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2202371BHn.LJIIIIZZ(java.lang.Long, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    @Override // X.InterfaceC2202381BHo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIZ(com.ss.android.ugc.aweme.im.contacts.impl.model.SharePermission r6, X.InterfaceC1364105Vn<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C2202411BHr
            if (r0 == 0) goto L20
            r4 = r7
            X.1BHr r4 = (X.C2202411BHr) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L32
            if (r0 != r1) goto L2a
            goto L26
        L20:
            X.1BHr r4 = new X.1BHr
            r4.<init>(r5, r7)
            goto L12
        L26:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Exception -> L40
            goto L49
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C155000ia.LIZIZ(r3)
            X.1BHo r0 = r5.LIZ     // Catch: java.lang.Exception -> L40
            r4.LLILLL = r1     // Catch: java.lang.Exception -> L40
            java.lang.Object r0 = r0.LJIIIZ(r6, r4)     // Catch: java.lang.Exception -> L40
            if (r0 != r2) goto L49
            return r2
        L40:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            java.lang.String r0 = "insertOrReplace"
            r5.LJIIL(r0, r1)
        L49:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2202371BHn.LJIIIZ(com.ss.android.ugc.aweme.im.contacts.impl.model.SharePermission, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    @Override // X.InterfaceC2202381BHo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJJI(com.ss.android.ugc.aweme.im.contacts.impl.model.SharePermission r6, X.InterfaceC1364105Vn<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C2202421BHs
            if (r0 == 0) goto L20
            r4 = r7
            X.1BHs r4 = (X.C2202421BHs) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L32
            if (r0 != r1) goto L2a
            goto L26
        L20:
            X.1BHs r4 = new X.1BHs
            r4.<init>(r5, r7)
            goto L12
        L26:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Exception -> L40
            goto L49
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C155000ia.LIZIZ(r3)
            X.1BHo r0 = r5.LIZ     // Catch: java.lang.Exception -> L40
            r4.LLILLL = r1     // Catch: java.lang.Exception -> L40
            java.lang.Object r0 = r0.LJIIJJI(r6, r4)     // Catch: java.lang.Exception -> L40
            if (r0 != r2) goto L49
            return r2
        L40:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            java.lang.String r0 = "updateSharePermission"
            r5.LJIIL(r0, r1)
        L49:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2202371BHn.LJIIJJI(com.ss.android.ugc.aweme.im.contacts.impl.model.SharePermission, X.05Vn):java.lang.Object");
    }

    public final void LJIIL(String str, Exception exc) {
        this.LIZIZ.sendEvent("SHARE_PERMISSION_ERROR", C2097608Jq.LJIIJ(new Pair("transactionName", str), new Pair("isRoom", "true"), new Pair("error_stack", Log.getStackTraceString(exc))));
    }
}
