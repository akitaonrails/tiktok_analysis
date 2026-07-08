package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.contacts.api.model.MAFIMUser;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.1DZp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2258031DZp implements InterfaceC1726606pU {
    public final InterfaceC1726606pU LIZ;
    public final C0WYD LIZIZ;

    @Override // X.InterfaceC1726606pU
    public final MAFIMUser LIZJ(long j) {
        try {
            return this.LIZ.LIZJ(j);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            LJIJ("getMAF", e);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    @Override // X.InterfaceC1726606pU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.InterfaceC1364105Vn<? super java.lang.Integer> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C2258101DZw
            if (r0 == 0) goto L20
            r4 = r6
            X.1DZw r4 = (X.C2258101DZw) r4
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
            X.1DZw r4 = new X.1DZw
            r4.<init>(r5, r6)
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
            X.06pU r0 = r5.LIZ     // Catch: java.lang.Exception -> L41
            r4.LLILLL = r1     // Catch: java.lang.Exception -> L41
            java.lang.Object r3 = r0.LIZLLL(r4)     // Catch: java.lang.Exception -> L41
            if (r3 != r2) goto L40
            return r2
        L40:
            return r3
        L41:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            java.lang.String r0 = "getMufCount"
            r5.LJIJ(r0, r1)
            r0 = 0
            java.lang.Integer r0 = X.C2286608xc.LJ(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2258031DZp.LIZLLL(X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC1726606pU
    public final List<IMUser> LJ(String str) {
        try {
            return this.LIZ.LJ(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            LJIJ("findWithConditionAndPermissionSortWeight", e);
            return new ArrayList();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    @Override // X.InterfaceC1726606pU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(X.InterfaceC1364105Vn<? super java.util.List<java.lang.Long>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C2258081DZu
            if (r0 == 0) goto L20
            r4 = r6
            X.1DZu r4 = (X.C2258081DZu) r4
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
            X.1DZu r4 = new X.1DZu
            r4.<init>(r5, r6)
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
            X.06pU r0 = r5.LIZ     // Catch: java.lang.Exception -> L41
            r4.LLILLL = r1     // Catch: java.lang.Exception -> L41
            java.lang.Object r3 = r0.LJI(r4)     // Catch: java.lang.Exception -> L41
            if (r3 != r2) goto L40
            return r2
        L40:
            return r3
        L41:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            java.lang.String r0 = "getAllMAFUids"
            r5.LJIJ(r0, r1)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2258031DZp.LJI(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    @Override // X.InterfaceC1726606pU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIZ(X.InterfaceC1364105Vn<? super java.util.List<com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBaseInfo>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C2258091DZv
            if (r0 == 0) goto L20
            r4 = r6
            X.1DZv r4 = (X.C2258091DZv) r4
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
            X.1DZv r4 = new X.1DZv
            r4.<init>(r5, r6)
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
            X.06pU r0 = r5.LIZ     // Catch: java.lang.Exception -> L41
            r4.LLILLL = r1     // Catch: java.lang.Exception -> L41
            java.lang.Object r3 = r0.LJIIIZ(r4)     // Catch: java.lang.Exception -> L41
            if (r3 != r2) goto L40
            return r2
        L40:
            return r3
        L41:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            java.lang.String r0 = "getAllUserBaseInfo"
            r5.LJIJ(r0, r1)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2258031DZp.LJIIIZ(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    @Override // X.InterfaceC1726606pU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILL(X.InterfaceC1364105Vn<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C2258061DZs
            if (r0 == 0) goto L20
            r4 = r6
            X.1DZs r4 = (X.C2258061DZs) r4
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
            X.1DZs r4 = new X.1DZs
            r4.<init>(r5, r6)
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
            X.06pU r0 = r5.LIZ     // Catch: java.lang.Exception -> L40
            r4.LLILLL = r1     // Catch: java.lang.Exception -> L40
            java.lang.Object r0 = r0.LJIILL(r4)     // Catch: java.lang.Exception -> L40
            if (r0 != r2) goto L49
            return r2
        L40:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            java.lang.String r0 = "deleteAllMAF"
            r5.LJIJ(r0, r1)
        L49:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2258031DZp.LJIILL(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    @Override // X.InterfaceC1726606pU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILLIIL(X.InterfaceC1364105Vn<? super java.lang.Integer> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C2258121DZy
            if (r0 == 0) goto L20
            r4 = r6
            X.1DZy r4 = (X.C2258121DZy) r4
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
            X.1DZy r4 = new X.1DZy
            r4.<init>(r5, r6)
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
            X.06pU r0 = r5.LIZ     // Catch: java.lang.Exception -> L41
            r4.LLILLL = r1     // Catch: java.lang.Exception -> L41
            java.lang.Object r3 = r0.LJIILLIIL(r4)     // Catch: java.lang.Exception -> L41
            if (r3 != r2) goto L40
            return r2
        L40:
            return r3
        L41:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            java.lang.String r0 = "totalCount"
            r5.LJIJ(r0, r1)
            r0 = 0
            java.lang.Integer r0 = X.C2286608xc.LJ(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2258031DZp.LJIILLIIL(X.05Vn):java.lang.Object");
    }

    public C2258031DZp(C2201851BFn c2201851BFn, C0WYD c0wyd) {
        this.LIZ = c2201851BFn;
        this.LIZIZ = c0wyd;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    @Override // X.InterfaceC1726606pU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.util.List<com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBaseInfo> r6, X.InterfaceC1364105Vn<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C2258111DZx
            if (r0 == 0) goto L20
            r4 = r7
            X.1DZx r4 = (X.C2258111DZx) r4
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
            X.1DZx r4 = new X.1DZx
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
            X.06pU r0 = r5.LIZ     // Catch: java.lang.Exception -> L40
            r4.LLILLL = r1     // Catch: java.lang.Exception -> L40
            java.lang.Object r0 = r0.LIZ(r6, r4)     // Catch: java.lang.Exception -> L40
            if (r0 != r2) goto L49
            return r2
        L40:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            java.lang.String r0 = "insertOrReplaceList"
            r5.LJIJ(r0, r1)
        L49:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2258031DZp.LIZ(java.util.List, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    @Override // X.InterfaceC1726606pU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.lang.Long r6, X.InterfaceC1364105Vn<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C2257991DZl
            if (r0 == 0) goto L20
            r4 = r7
            X.1DZl r4 = (X.C2257991DZl) r4
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
            X.1DZl r4 = new X.1DZl
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
            X.06pU r0 = r5.LIZ     // Catch: java.lang.Exception -> L40
            r4.LLILLL = r1     // Catch: java.lang.Exception -> L40
            java.lang.Object r0 = r0.LIZIZ(r6, r4)     // Catch: java.lang.Exception -> L40
            if (r0 != r2) goto L49
            return r2
        L40:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            java.lang.String r0 = "delete"
            r5.LJIJ(r0, r1)
        L49:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2258031DZp.LIZIZ(java.lang.Long, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC1726606pU
    public final List<IMUser> LJFF(String str, boolean z) {
        try {
            return this.LIZ.LJFF(str, z);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            LJIJ("findWithConditionSortWeight", e);
            return new ArrayList();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    @Override // X.InterfaceC1726606pU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBaseInfo r6, X.InterfaceC1364105Vn<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C2258041DZq
            if (r0 == 0) goto L20
            r4 = r7
            X.1DZq r4 = (X.C2258041DZq) r4
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
            X.1DZq r4 = new X.1DZq
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
            X.06pU r0 = r5.LIZ     // Catch: java.lang.Exception -> L40
            r4.LLILLL = r1     // Catch: java.lang.Exception -> L40
            java.lang.Object r0 = r0.LJII(r6, r4)     // Catch: java.lang.Exception -> L40
            if (r0 != r2) goto L49
            return r2
        L40:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            java.lang.String r0 = "insertOrReplace"
            r5.LJIJ(r0, r1)
        L49:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2258031DZp.LJII(com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBaseInfo, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    @Override // X.InterfaceC1726606pU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIIZZ(long r6, X.InterfaceC1364105Vn<? super kotlin.Unit> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof X.C2258131DZz
            if (r0 == 0) goto L20
            r4 = r8
            X.1DZz r4 = (X.C2258131DZz) r4
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
            X.1DZz r4 = new X.1DZz
            r4.<init>(r5, r8)
            goto L12
        L26:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Exception -> L40
            goto L4a
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C155000ia.LIZIZ(r3)
            X.06pU r0 = r5.LIZ     // Catch: java.lang.Exception -> L40
            r4.LLILLL = r1     // Catch: java.lang.Exception -> L40
            java.lang.Object r0 = r0.LJIIIIZZ(r6, r4)     // Catch: java.lang.Exception -> L40
            if (r0 != r2) goto L4a
            return r2
        L40:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            java.lang.String r0 = "unblockUser"
            r5.LJIJ(r0, r1)
        L4a:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2258031DZp.LJIIIIZZ(long, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    @Override // X.InterfaceC1726606pU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJ(long r6, X.InterfaceC1364105Vn<? super kotlin.Unit> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof X.C2258021DZo
            if (r0 == 0) goto L20
            r4 = r8
            X.1DZo r4 = (X.C2258021DZo) r4
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
            X.1DZo r4 = new X.1DZo
            r4.<init>(r5, r8)
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
            X.06pU r0 = r5.LIZ     // Catch: java.lang.Exception -> L40
            r4.LLILLL = r1     // Catch: java.lang.Exception -> L40
            java.lang.Object r0 = r0.LJIIJ(r6, r4)     // Catch: java.lang.Exception -> L40
            if (r0 != r2) goto L49
            return r2
        L40:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            java.lang.String r0 = "deleteAllExpired"
            r5.LJIJ(r0, r1)
        L49:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2258031DZp.LJIIJ(long, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    @Override // X.InterfaceC1726606pU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJJI(java.lang.Long r6, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBaseInfo> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C2258001DZm
            if (r0 == 0) goto L20
            r4 = r7
            X.1DZm r4 = (X.C2258001DZm) r4
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
            X.1DZm r4 = new X.1DZm
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
            X.06pU r0 = r5.LIZ     // Catch: java.lang.Exception -> L41
            r4.LLILLL = r1     // Catch: java.lang.Exception -> L41
            java.lang.Object r3 = r0.LJIIJJI(r6, r4)     // Catch: java.lang.Exception -> L41
            if (r3 != r2) goto L40
            return r2
        L40:
            return r3
        L41:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            java.lang.String r0 = "getIMUserBaseInfo"
            r5.LJIJ(r0, r1)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2258031DZp.LJIIJJI(java.lang.Long, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    @Override // X.InterfaceC1726606pU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIL(com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBaseInfo r6, X.InterfaceC1364105Vn<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C2258051DZr
            if (r0 == 0) goto L20
            r4 = r7
            X.1DZr r4 = (X.C2258051DZr) r4
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
            X.1DZr r4 = new X.1DZr
            r4.<init>(r5, r7)
            goto L12
        L26:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Exception -> L40
            goto L4a
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C155000ia.LIZIZ(r3)
            X.06pU r0 = r5.LIZ     // Catch: java.lang.Exception -> L40
            r4.LLILLL = r1     // Catch: java.lang.Exception -> L40
            java.lang.Object r0 = r0.LJIIL(r6, r4)     // Catch: java.lang.Exception -> L40
            if (r0 != r2) goto L4a
            return r2
        L40:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            java.lang.String r0 = "updateIMUserBaseInfo"
            r5.LJIJ(r0, r1)
        L4a:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2258031DZp.LJIIL(com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBaseInfo, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    @Override // X.InterfaceC1726606pU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILIIL(long r6, X.InterfaceC1364105Vn<? super kotlin.Unit> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof X.C2258011DZn
            if (r0 == 0) goto L20
            r4 = r8
            X.1DZn r4 = (X.C2258011DZn) r4
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
            X.1DZn r4 = new X.1DZn
            r4.<init>(r5, r8)
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
            X.06pU r0 = r5.LIZ     // Catch: java.lang.Exception -> L40
            r4.LLILLL = r1     // Catch: java.lang.Exception -> L40
            java.lang.Object r0 = r0.LJIILIIL(r6, r4)     // Catch: java.lang.Exception -> L40
            if (r0 != r2) goto L49
            return r2
        L40:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            java.lang.String r0 = "blockUser"
            r5.LJIJ(r0, r1)
        L49:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2258031DZp.LJIILIIL(long, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    @Override // X.InterfaceC1726606pU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIZILJ(long r6, X.InterfaceC1364105Vn<? super java.util.List<java.lang.Long>> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof X.C2258071DZt
            if (r0 == 0) goto L20
            r4 = r8
            X.1DZt r4 = (X.C2258071DZt) r4
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
            X.1DZt r4 = new X.1DZt
            r4.<init>(r5, r8)
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
            X.06pU r0 = r5.LIZ     // Catch: java.lang.Exception -> L41
            r4.LLILLL = r1     // Catch: java.lang.Exception -> L41
            java.lang.Object r3 = r0.LJIIZILJ(r6, r4)     // Catch: java.lang.Exception -> L41
            if (r3 != r2) goto L40
            return r2
        L40:
            return r3
        L41:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            java.lang.String r0 = "getAllExpiredUids"
            r5.LJIJ(r0, r1)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2258031DZp.LJIIZILJ(long, X.05Vn):java.lang.Object");
    }

    public final void LJIJ(String str, Exception exc) {
        this.LIZIZ.LIZ(C2097608Jq.LJIIJ(new Pair("transactionName", str), new Pair("isRoom", "true")), exc, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    @Override // X.InterfaceC1726606pU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILJJIL(int r10, int r11, java.lang.String r12, java.util.List r13, X.InterfaceC1364105Vn r14) {
        /*
            r9 = this;
            boolean r0 = r14 instanceof X.C2258141Da0
            if (r0 == 0) goto L20
            r8 = r14
            X.1Da0 r8 = (X.C2258141Da0) r8
            int r2 = r8.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r8.LLILLL = r2
        L12:
            java.lang.Object r3 = r8.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r8.LLILLL
            r0 = 1
            if (r1 == 0) goto L32
            if (r1 != r0) goto L2a
            goto L26
        L20:
            X.1Da0 r8 = new X.1Da0
            r8.<init>(r9, r14)
            goto L12
        L26:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Exception -> L45
            return r3
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C155000ia.LIZIZ(r3)
            X.06pU r3 = r9.LIZ     // Catch: java.lang.Exception -> L45
            r8.LLILLL = r0     // Catch: java.lang.Exception -> L45
            r7 = r13
            r6 = r12
            r5 = r11
            r4 = r10
            java.lang.Object r3 = r3.LJIILJJIL(r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> L45
            if (r3 != r2) goto L44
            return r2
        L44:
            return r3
        L45:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            java.lang.String r0 = "findWithCondition"
            r9.LJIJ(r0, r1)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2258031DZp.LJIILJJIL(int, int, java.lang.String, java.util.List, X.05Vn):java.lang.Object");
    }
}
