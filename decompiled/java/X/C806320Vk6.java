package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.persistence.database.AIGCDatabase;

/* JADX INFO: renamed from: X.0Vk6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C806320Vk6 {
    public final InterfaceC796410VLz LIZ;

    public C806320Vk6() {
        C0VM0 c0vm0 = AIGCDatabase.LL;
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        AIGCDatabase aIGCDatabase = AIGCDatabase.LLILLJJLI;
        if (aIGCDatabase == null) {
            synchronized (c0vm0) {
                try {
                    C796500VMi c796500VMiLIZ = C0OGG.LIZ(C786410Ut5.N3(contextLIZ), AIGCDatabase.class, "0000_03_creation_aigc_workflow_database");
                    c796500VMiLIZ.LIZJ();
                    aIGCDatabase = (AIGCDatabase) c796500VMiLIZ.LIZIZ();
                    AIGCDatabase.LLILLJJLI = aIGCDatabase;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        this.LIZ = aIGCDatabase.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.C555820Lr2 r7, X.InterfaceC1364105Vn<? super X.C189200o6<kotlin.Unit>> r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C806340Vk8
            if (r0 == 0) goto L22
            r5 = r8
            X.0Vk8 r5 = (X.C806340Vk8) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r4 = r5.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r1 = 1
            if (r0 == 0) goto L30
            if (r0 != r1) goto L28
            X.01sO r2 = r5.LL
            goto L42
        L22:
            X.0Vk8 r5 = new X.0Vk8
            r5.<init>(r6, r8)
            goto L12
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C155000ia.LIZIZ(r4)
            X.01sO r2 = X.C470601sO.LIZ
            X.0VLz r0 = r6.LIZ     // Catch: java.lang.Throwable -> L4b
            r5.LL = r2     // Catch: java.lang.Throwable -> L4b
            r5.LLILZ = r1     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r0 = r0.LJII(r7, r5)     // Catch: java.lang.Throwable -> L4b
            if (r0 != r3) goto L45
            return r3
        L42:
            X.C155000ia.LIZIZ(r4)     // Catch: java.lang.Throwable -> L4d
        L45:
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L4d
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L4d
            return r0
        L4b:
            r1 = move-exception
            goto L4e
        L4d:
            r1 = move-exception
        L4e:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            boolean r0 = r1 instanceof java.util.concurrent.CancellationException
            if (r0 != 0) goto L64
            r2.getClass()
            X.C470601sO.LIZ(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            return r0
        L64:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C806320Vk6.LIZ(X.0Lr2, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.lang.String r7, X.InterfaceC1364105Vn<? super X.C189200o6<kotlin.Unit>> r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C806360VkA
            if (r0 == 0) goto L22
            r5 = r8
            X.0VkA r5 = (X.C806360VkA) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r4 = r5.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r1 = 1
            if (r0 == 0) goto L30
            if (r0 != r1) goto L28
            X.01sO r2 = r5.LL
            goto L42
        L22:
            X.0VkA r5 = new X.0VkA
            r5.<init>(r6, r8)
            goto L12
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C155000ia.LIZIZ(r4)
            X.01sO r2 = X.C470601sO.LIZ
            X.0VLz r0 = r6.LIZ     // Catch: java.lang.Throwable -> L4b
            r5.LL = r2     // Catch: java.lang.Throwable -> L4b
            r5.LLILZ = r1     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r0 = r0.LJ(r7, r5)     // Catch: java.lang.Throwable -> L4b
            if (r0 != r3) goto L45
            return r3
        L42:
            X.C155000ia.LIZIZ(r4)     // Catch: java.lang.Throwable -> L4d
        L45:
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L4d
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L4d
            return r0
        L4b:
            r1 = move-exception
            goto L4e
        L4d:
            r1 = move-exception
        L4e:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            boolean r0 = r1 instanceof java.util.concurrent.CancellationException
            if (r0 != 0) goto L64
            r2.getClass()
            X.C470601sO.LIZ(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            return r0
        L64:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C806320Vk6.LIZIZ(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(java.lang.String r6, X.InterfaceC1364105Vn<? super X.C189200o6<java.lang.Integer>> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C806370VkB
            if (r0 == 0) goto L22
            r4 = r7
            X.0VkB r4 = (X.C806370VkB) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r0 = r4.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r2 = r4.LLILZ
            r1 = 1
            if (r2 == 0) goto L30
            if (r2 != r1) goto L28
            X.01sO r2 = r4.LL
            goto L42
        L22:
            X.0VkB r4 = new X.0VkB
            r4.<init>(r5, r7)
            goto L12
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C155000ia.LIZIZ(r0)
            X.01sO r2 = X.C470601sO.LIZ
            X.0VLz r0 = r5.LIZ     // Catch: java.lang.Throwable -> L4b
            r4.LL = r2     // Catch: java.lang.Throwable -> L4b
            r4.LLILZ = r1     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r0 = r0.LIZLLL(r6, r4)     // Catch: java.lang.Throwable -> L4b
            if (r0 != r3) goto L45
            return r3
        L42:
            X.C155000ia.LIZIZ(r0)     // Catch: java.lang.Throwable -> L4d
        L45:
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L4d
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L4d
            return r0
        L4b:
            r1 = move-exception
            goto L4e
        L4d:
            r1 = move-exception
        L4e:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            boolean r0 = r1 instanceof java.util.concurrent.CancellationException
            if (r0 != 0) goto L64
            r2.getClass()
            X.C470601sO.LIZ(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            return r0
        L64:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C806320Vk6.LIZJ(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(java.lang.String r6, X.InterfaceC1364105Vn<? super X.C189200o6<java.lang.String>> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C806380VkC
            if (r0 == 0) goto L22
            r4 = r7
            X.0VkC r4 = (X.C806380VkC) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r0 = r4.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r2 = r4.LLILZ
            r1 = 1
            if (r2 == 0) goto L30
            if (r2 != r1) goto L28
            X.01sO r2 = r4.LL
            goto L42
        L22:
            X.0VkC r4 = new X.0VkC
            r4.<init>(r5, r7)
            goto L12
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C155000ia.LIZIZ(r0)
            X.01sO r2 = X.C470601sO.LIZ
            X.0VLz r0 = r5.LIZ     // Catch: java.lang.Throwable -> L4b
            r4.LL = r2     // Catch: java.lang.Throwable -> L4b
            r4.LLILZ = r1     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r0 = r0.LIZIZ(r6, r4)     // Catch: java.lang.Throwable -> L4b
            if (r0 != r3) goto L45
            return r3
        L42:
            X.C155000ia.LIZIZ(r0)     // Catch: java.lang.Throwable -> L4d
        L45:
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L4d
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L4d
            return r0
        L4b:
            r1 = move-exception
            goto L4e
        L4d:
            r1 = move-exception
        L4e:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            boolean r0 = r1 instanceof java.util.concurrent.CancellationException
            if (r0 != 0) goto L64
            r2.getClass()
            X.C470601sO.LIZ(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            return r0
        L64:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C806320Vk6.LIZLLL(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(java.lang.String r6, X.InterfaceC1364105Vn<? super X.C189200o6<java.lang.String>> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C806390VkD
            if (r0 == 0) goto L22
            r4 = r7
            X.0VkD r4 = (X.C806390VkD) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r0 = r4.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r2 = r4.LLILZ
            r1 = 1
            if (r2 == 0) goto L30
            if (r2 != r1) goto L28
            X.01sO r2 = r4.LL
            goto L42
        L22:
            X.0VkD r4 = new X.0VkD
            r4.<init>(r5, r7)
            goto L12
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C155000ia.LIZIZ(r0)
            X.01sO r2 = X.C470601sO.LIZ
            X.0VLz r0 = r5.LIZ     // Catch: java.lang.Throwable -> L4b
            r4.LL = r2     // Catch: java.lang.Throwable -> L4b
            r4.LLILZ = r1     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r0 = r0.LJIILJJIL(r6, r4)     // Catch: java.lang.Throwable -> L4b
            if (r0 != r3) goto L45
            return r3
        L42:
            X.C155000ia.LIZIZ(r0)     // Catch: java.lang.Throwable -> L4d
        L45:
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L4d
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L4d
            return r0
        L4b:
            r1 = move-exception
            goto L4e
        L4d:
            r1 = move-exception
        L4e:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            boolean r0 = r1 instanceof java.util.concurrent.CancellationException
            if (r0 != 0) goto L64
            r2.getClass()
            X.C470601sO.LIZ(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            return r0
        L64:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C806320Vk6.LJ(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(java.lang.String r6, X.InterfaceC1364105Vn<? super X.C189200o6<X.C555820Lr2>> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C806400VkE
            if (r0 == 0) goto L22
            r4 = r7
            X.0VkE r4 = (X.C806400VkE) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r0 = r4.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r2 = r4.LLILZ
            r1 = 1
            if (r2 == 0) goto L30
            if (r2 != r1) goto L28
            X.01sO r2 = r4.LL
            goto L42
        L22:
            X.0VkE r4 = new X.0VkE
            r4.<init>(r5, r7)
            goto L12
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C155000ia.LIZIZ(r0)
            X.01sO r2 = X.C470601sO.LIZ
            X.0VLz r0 = r5.LIZ     // Catch: java.lang.Throwable -> L4b
            r4.LL = r2     // Catch: java.lang.Throwable -> L4b
            r4.LLILZ = r1     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r0 = r0.LJIIJ(r6, r4)     // Catch: java.lang.Throwable -> L4b
            if (r0 != r3) goto L45
            return r3
        L42:
            X.C155000ia.LIZIZ(r0)     // Catch: java.lang.Throwable -> L4d
        L45:
            X.0Lr2 r0 = (X.C555820Lr2) r0     // Catch: java.lang.Throwable -> L4d
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L4d
            return r0
        L4b:
            r1 = move-exception
            goto L4e
        L4d:
            r1 = move-exception
        L4e:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            boolean r0 = r1 instanceof java.util.concurrent.CancellationException
            if (r0 != 0) goto L64
            r2.getClass()
            X.C470601sO.LIZ(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            return r0
        L64:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C806320Vk6.LJFF(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(java.lang.String r6, X.InterfaceC1364105Vn<? super X.C189200o6<X.C555820Lr2>> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C806410VkF
            if (r0 == 0) goto L22
            r4 = r7
            X.0VkF r4 = (X.C806410VkF) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r0 = r4.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r2 = r4.LLILZ
            r1 = 1
            if (r2 == 0) goto L30
            if (r2 != r1) goto L28
            X.01sO r2 = r4.LL
            goto L42
        L22:
            X.0VkF r4 = new X.0VkF
            r4.<init>(r5, r7)
            goto L12
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C155000ia.LIZIZ(r0)
            X.01sO r2 = X.C470601sO.LIZ
            X.0VLz r0 = r5.LIZ     // Catch: java.lang.Throwable -> L4b
            r4.LL = r2     // Catch: java.lang.Throwable -> L4b
            r4.LLILZ = r1     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r0 = r0.LJIIJJI(r6, r4)     // Catch: java.lang.Throwable -> L4b
            if (r0 != r3) goto L45
            return r3
        L42:
            X.C155000ia.LIZIZ(r0)     // Catch: java.lang.Throwable -> L4d
        L45:
            X.0Lr2 r0 = (X.C555820Lr2) r0     // Catch: java.lang.Throwable -> L4d
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L4d
            return r0
        L4b:
            r1 = move-exception
            goto L4e
        L4d:
            r1 = move-exception
        L4e:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            boolean r0 = r1 instanceof java.util.concurrent.CancellationException
            if (r0 != 0) goto L64
            r2.getClass()
            X.C470601sO.LIZ(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            return r0
        L64:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C806320Vk6.LJI(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(java.lang.String r6, X.InterfaceC1364105Vn<? super X.C189200o6<? extends java.util.List<X.C555820Lr2>>> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C806420VkG
            if (r0 == 0) goto L22
            r4 = r7
            X.0VkG r4 = (X.C806420VkG) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r0 = r4.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r2 = r4.LLILZ
            r1 = 1
            if (r2 == 0) goto L30
            if (r2 != r1) goto L28
            X.01sO r2 = r4.LL
            goto L42
        L22:
            X.0VkG r4 = new X.0VkG
            r4.<init>(r5, r7)
            goto L12
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C155000ia.LIZIZ(r0)
            X.01sO r2 = X.C470601sO.LIZ
            X.0VLz r0 = r5.LIZ     // Catch: java.lang.Throwable -> L4b
            r4.LL = r2     // Catch: java.lang.Throwable -> L4b
            r4.LLILZ = r1     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r0 = r0.LJFF(r6, r4)     // Catch: java.lang.Throwable -> L4b
            if (r0 != r3) goto L45
            return r3
        L42:
            X.C155000ia.LIZIZ(r0)     // Catch: java.lang.Throwable -> L4d
        L45:
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L4d
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L4d
            return r0
        L4b:
            r1 = move-exception
            goto L4e
        L4d:
            r1 = move-exception
        L4e:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            boolean r0 = r1 instanceof java.util.concurrent.CancellationException
            if (r0 != 0) goto L64
            r2.getClass()
            X.C470601sO.LIZ(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            return r0
        L64:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C806320Vk6.LJII(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIIZZ(java.util.List<java.lang.String> r6, X.InterfaceC1364105Vn<? super X.C189200o6<? extends java.util.List<X.C555820Lr2>>> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C806430VkH
            if (r0 == 0) goto L22
            r4 = r7
            X.0VkH r4 = (X.C806430VkH) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r0 = r4.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r2 = r4.LLILZ
            r1 = 1
            if (r2 == 0) goto L30
            if (r2 != r1) goto L28
            X.01sO r2 = r4.LL
            goto L42
        L22:
            X.0VkH r4 = new X.0VkH
            r4.<init>(r5, r7)
            goto L12
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C155000ia.LIZIZ(r0)
            X.01sO r2 = X.C470601sO.LIZ
            X.0VLz r0 = r5.LIZ     // Catch: java.lang.Throwable -> L4b
            r4.LL = r2     // Catch: java.lang.Throwable -> L4b
            r4.LLILZ = r1     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r0 = r0.LJIIIZ(r6, r4)     // Catch: java.lang.Throwable -> L4b
            if (r0 != r3) goto L45
            return r3
        L42:
            X.C155000ia.LIZIZ(r0)     // Catch: java.lang.Throwable -> L4d
        L45:
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L4d
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L4d
            return r0
        L4b:
            r1 = move-exception
            goto L4e
        L4d:
            r1 = move-exception
        L4e:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            boolean r0 = r1 instanceof java.util.concurrent.CancellationException
            if (r0 != 0) goto L64
            r2.getClass()
            X.C470601sO.LIZ(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            return r0
        L64:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C806320Vk6.LJIIIIZZ(java.util.List, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIZ(java.lang.String r7, X.InterfaceC1364105Vn<? super X.C189200o6<kotlin.Unit>> r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C806440VkI
            if (r0 == 0) goto L22
            r5 = r8
            X.0VkI r5 = (X.C806440VkI) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r4 = r5.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r1 = 1
            if (r0 == 0) goto L30
            if (r0 != r1) goto L28
            X.01sO r2 = r5.LL
            goto L42
        L22:
            X.0VkI r5 = new X.0VkI
            r5.<init>(r6, r8)
            goto L12
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C155000ia.LIZIZ(r4)
            X.01sO r2 = X.C470601sO.LIZ
            X.0VLz r0 = r6.LIZ     // Catch: java.lang.Throwable -> L4b
            r5.LL = r2     // Catch: java.lang.Throwable -> L4b
            r5.LLILZ = r1     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r0 = r0.LJIILIIL(r7, r5)     // Catch: java.lang.Throwable -> L4b
            if (r0 != r3) goto L45
            return r3
        L42:
            X.C155000ia.LIZIZ(r4)     // Catch: java.lang.Throwable -> L4d
        L45:
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L4d
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L4d
            return r0
        L4b:
            r1 = move-exception
            goto L4e
        L4d:
            r1 = move-exception
        L4e:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            boolean r0 = r1 instanceof java.util.concurrent.CancellationException
            if (r0 != 0) goto L64
            r2.getClass()
            X.C470601sO.LIZ(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            return r0
        L64:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C806320Vk6.LJIIIZ(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJ(java.lang.String r7, java.lang.String r8, X.InterfaceC1364105Vn<? super X.C189200o6<kotlin.Unit>> r9) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r9 instanceof X.C806450VkJ
            if (r0 == 0) goto L22
            r5 = r9
            X.0VkJ r5 = (X.C806450VkJ) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r4 = r5.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r1 = 1
            if (r0 == 0) goto L30
            if (r0 != r1) goto L28
            X.01sO r2 = r5.LL
            goto L42
        L22:
            X.0VkJ r5 = new X.0VkJ
            r5.<init>(r6, r9)
            goto L12
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C155000ia.LIZIZ(r4)
            X.01sO r2 = X.C470601sO.LIZ
            X.0VLz r0 = r6.LIZ     // Catch: java.lang.Throwable -> L4b
            r5.LL = r2     // Catch: java.lang.Throwable -> L4b
            r5.LLILZ = r1     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r0 = r0.LJIIL(r7, r8, r5)     // Catch: java.lang.Throwable -> L4b
            if (r0 != r3) goto L45
            return r3
        L42:
            X.C155000ia.LIZIZ(r4)     // Catch: java.lang.Throwable -> L4d
        L45:
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L4d
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L4d
            return r0
        L4b:
            r1 = move-exception
            goto L4e
        L4d:
            r1 = move-exception
        L4e:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            boolean r0 = r1 instanceof java.util.concurrent.CancellationException
            if (r0 != 0) goto L64
            r2.getClass()
            X.C470601sO.LIZ(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            return r0
        L64:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C806320Vk6.LJIIJ(java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJJI(java.lang.String r7, java.util.Map<java.lang.String, ? extends X.InterfaceC1406105et> r8, X.InterfaceC1364105Vn<? super X.C189200o6<kotlin.Unit>> r9) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r9 instanceof X.C806350Vk9
            if (r0 == 0) goto L22
            r5 = r9
            X.0Vk9 r5 = (X.C806350Vk9) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r1 = r5.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r3 = 1
            if (r0 == 0) goto L30
            if (r0 != r3) goto L28
            X.01sO r2 = r5.LL
            goto L4b
        L22:
            X.0Vk9 r5 = new X.0Vk9
            r5.<init>(r6, r9)
            goto L12
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C155000ia.LIZIZ(r1)
            X.01sO r2 = X.C470601sO.LIZ
            X.0Lr0 r0 = X.C555800Lr0.LIZ     // Catch: java.lang.Throwable -> L54
            r0.getClass()     // Catch: java.lang.Throwable -> L54
            java.lang.String r1 = X.C555800Lr0.LJ(r8)     // Catch: java.lang.Throwable -> L54
            X.0VLz r0 = r6.LIZ     // Catch: java.lang.Throwable -> L54
            r5.LL = r2     // Catch: java.lang.Throwable -> L54
            r5.LLILZ = r3     // Catch: java.lang.Throwable -> L54
            java.lang.Object r0 = r0.LJIIIIZZ(r7, r1, r5)     // Catch: java.lang.Throwable -> L54
            if (r0 != r4) goto L4e
            return r4
        L4b:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Throwable -> L56
        L4e:
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L56
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L56
            return r0
        L54:
            r1 = move-exception
            goto L57
        L56:
            r1 = move-exception
        L57:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            boolean r0 = r1 instanceof java.util.concurrent.CancellationException
            if (r0 != 0) goto L6d
            r2.getClass()
            X.C470601sO.LIZ(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            return r0
        L6d:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C806320Vk6.LJIIJJI(java.lang.String, java.util.Map, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0092 A[Catch: all -> 0x00bb, TryCatch #1 {all -> 0x00bb, blocks: (B:14:0x0036, B:40:0x00b1, B:41:0x00b3, B:27:0x008b, B:28:0x008e, B:30:0x0092, B:31:0x0094, B:33:0x009a, B:19:0x0057), top: B:53:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009a A[Catch: all -> 0x00bb, TryCatch #1 {all -> 0x00bb, blocks: (B:14:0x0036, B:40:0x00b1, B:41:0x00b3, B:27:0x008b, B:28:0x008e, B:30:0x0092, B:31:0x0094, B:33:0x009a, B:19:0x0057), top: B:53:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b1 A[Catch: all -> 0x00bb, TryCatch #1 {all -> 0x00bb, blocks: (B:14:0x0036, B:40:0x00b1, B:41:0x00b3, B:27:0x008b, B:28:0x008e, B:30:0x0092, B:31:0x0094, B:33:0x009a, B:19:0x0057), top: B:53:0x001d }] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIL(java.lang.String r9, X.C555910LrB r10, X.InterfaceC1364105Vn<? super X.C189200o6<kotlin.Unit>> r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C806320Vk6.LJIIL(java.lang.String, X.0LrB, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILIIL(java.lang.String r7, java.lang.String r8, X.InterfaceC1364105Vn<? super X.C189200o6<kotlin.Unit>> r9) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r9 instanceof X.C806460VkK
            if (r0 == 0) goto L22
            r5 = r9
            X.0VkK r5 = (X.C806460VkK) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r4 = r5.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r1 = 1
            if (r0 == 0) goto L30
            if (r0 != r1) goto L28
            X.01sO r2 = r5.LL
            goto L42
        L22:
            X.0VkK r5 = new X.0VkK
            r5.<init>(r6, r9)
            goto L12
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C155000ia.LIZIZ(r4)
            X.01sO r2 = X.C470601sO.LIZ
            X.0VLz r0 = r6.LIZ     // Catch: java.lang.Throwable -> L4b
            r5.LL = r2     // Catch: java.lang.Throwable -> L4b
            r5.LLILZ = r1     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r0 = r0.LIZ(r7, r8, r5)     // Catch: java.lang.Throwable -> L4b
            if (r0 != r3) goto L45
            return r3
        L42:
            X.C155000ia.LIZIZ(r4)     // Catch: java.lang.Throwable -> L4d
        L45:
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L4d
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L4d
            return r0
        L4b:
            r1 = move-exception
            goto L4e
        L4d:
            r1 = move-exception
        L4e:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            boolean r0 = r1 instanceof java.util.concurrent.CancellationException
            if (r0 != 0) goto L64
            r2.getClass()
            X.C470601sO.LIZ(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            return r0
        L64:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C806320Vk6.LJIILIIL(java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }
}
