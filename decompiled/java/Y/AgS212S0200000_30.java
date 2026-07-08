package Y;

import X.InterfaceC1364105Vn;
import X.InterfaceC346701Wf;

/* JADX INFO: loaded from: classes31.dex */
public class AgS212S0200000_30 implements InterfaceC346701Wf {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC346701Wf
    public final Object emit(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        switch (this.$t) {
            case 0:
                return emit$0(this, obj, interfaceC1364105Vn);
            case 1:
                return emit$1(this, obj, interfaceC1364105Vn);
            case 2:
                return emit$2(this, obj, interfaceC1364105Vn);
            case 3:
                return emit$3(this, obj, interfaceC1364105Vn);
            default:
                return null;
        }
    }

    public AgS212S0200000_30(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$0(Y.AgS212S0200000_30 r7, java.lang.Object r8, X.InterfaceC1364105Vn r9) {
        /*
            boolean r0 = r9 instanceof X.C20104813lW
            if (r0 == 0) goto L5b
            r6 = r9
            X.13lW r6 = (X.C20104813lW) r6
            int r2 = r6.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5b
            int r2 = r2 - r1
            r6.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r6.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILLJJLI
            r4 = 1
            if (r0 == 0) goto L25
            if (r0 != r4) goto L61
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r3 = r7.l0
            X.01Wf r3 = (X.InterfaceC346701Wf) r3
            java.lang.String r8 = (java.lang.String) r8
            r2 = 0
            if (r8 == 0) goto L52
            int r0 = r8.length()
            if (r0 <= 0) goto L3e
            r0 = 1
        L38:
            if (r0 != 0) goto L3b
            r8 = r2
        L3b:
            if (r8 == 0) goto L52
            goto L40
        L3e:
            r0 = 0
            goto L38
        L40:
            X.04rF r1 = X.C1227904rF.LIZ     // Catch: java.lang.Exception -> L4e
            java.lang.Object r0 = r7.l1     // Catch: java.lang.Exception -> L4e
            java.lang.reflect.Type r0 = (java.lang.reflect.Type) r0     // Catch: java.lang.Exception -> L4e
            r1.getClass()     // Catch: java.lang.Exception -> L4e
            java.lang.Object r2 = X.C1227904rF.LIZJ(r8, r0)     // Catch: java.lang.Exception -> L4e
            goto L52
        L4e:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L52:
            r6.LLILLJJLI = r4
            java.lang.Object r0 = r3.emit(r2, r6)
            if (r0 != r5) goto L22
            return r5
        L5b:
            X.13lW r6 = new X.13lW
            r6.<init>(r7, r9)
            goto L12
        L61:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS212S0200000_30.emit$0(Y.AgS212S0200000_30, java.lang.Object, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$1(Y.AgS212S0200000_30 r7, java.lang.Object r8, X.InterfaceC1364105Vn r9) {
        /*
            boolean r0 = r9 instanceof X.C20104913lX
            if (r0 == 0) goto L5b
            r6 = r9
            X.13lX r6 = (X.C20104913lX) r6
            int r2 = r6.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5b
            int r2 = r2 - r1
            r6.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r6.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILLJJLI
            r4 = 1
            if (r0 == 0) goto L25
            if (r0 != r4) goto L61
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r3 = r7.l0
            X.01Wf r3 = (X.InterfaceC346701Wf) r3
            java.lang.String r8 = (java.lang.String) r8
            r2 = 0
            if (r8 == 0) goto L52
            int r0 = r8.length()
            if (r0 <= 0) goto L3e
            r0 = 1
        L38:
            if (r0 != 0) goto L3b
            r8 = r2
        L3b:
            if (r8 == 0) goto L52
            goto L40
        L3e:
            r0 = 0
            goto L38
        L40:
            X.04rF r1 = X.C1227904rF.LIZ     // Catch: java.lang.Exception -> L4e
            java.lang.Object r0 = r7.l1     // Catch: java.lang.Exception -> L4e
            java.lang.Class r0 = (java.lang.Class) r0     // Catch: java.lang.Exception -> L4e
            r1.getClass()     // Catch: java.lang.Exception -> L4e
            java.lang.Object r2 = X.C1227904rF.LIZIZ(r8, r0)     // Catch: java.lang.Exception -> L4e
            goto L52
        L4e:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L52:
            r6.LLILLJJLI = r4
            java.lang.Object r0 = r3.emit(r2, r6)
            if (r0 != r5) goto L22
            return r5
        L5b:
            X.13lX r6 = new X.13lX
            r6.<init>(r7, r9)
            goto L12
        L61:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS212S0200000_30.emit$1(Y.AgS212S0200000_30, java.lang.Object, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$2(Y.AgS212S0200000_30 r6, java.lang.Object r7, X.InterfaceC1364105Vn r8) {
        /*
            boolean r0 = r8 instanceof X.C20099613kg
            if (r0 == 0) goto L5d
            r5 = r8
            X.13kg r5 = (X.C20099613kg) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5d
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r4 = r5.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L28
            if (r0 == r1) goto L3c
            if (r0 != r2) goto L63
            X.C155000ia.LIZIZ(r4)
        L25:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L28:
            X.C155000ia.LIZIZ(r4)
            java.lang.Object r0 = r6.l0
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r5.LL = r6
            r5.LLILZIL = r7
            r5.LLILLL = r1
            java.lang.Object r4 = r0.invoke(r7, r5)
            if (r4 != r3) goto L43
            return r3
        L3c:
            java.lang.Object r7 = r5.LLILZIL
            Y.AgS212S0200000_30 r6 = r5.LL
            X.C155000ia.LIZIZ(r4)
        L43:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r0 = r4.booleanValue()
            if (r0 == 0) goto L6b
            java.lang.Object r1 = r6.l1
            X.01Wf r1 = (X.InterfaceC346701Wf) r1
            r5.LL = r6
            r0 = 0
            r5.LLILZIL = r0
            r5.LLILLL = r2
            java.lang.Object r0 = r1.emit(r7, r5)
            if (r0 != r3) goto L25
            return r3
        L5d:
            X.13kg r5 = new X.13kg
            r5.<init>(r6, r8)
            goto L12
        L63:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L6b:
            X.094L r0 = new X.094L
            r0.<init>(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS212S0200000_30.emit$2(Y.AgS212S0200000_30, java.lang.Object, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$3(Y.AgS212S0200000_30 r5, java.lang.Object r6, X.InterfaceC1364105Vn r7) {
        /*
            boolean r0 = r7 instanceof X.C20099113kb
            if (r0 == 0) goto L3c
            r4 = r7
            X.13kb r4 = (X.C20099113kb) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3c
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r2 = 1
            if (r0 == 0) goto L25
            if (r0 != r2) goto L42
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r1 = r5.l0
            X.013C r1 = (X.C013C) r1
            r0 = 0
            r1.element = r0
            java.lang.Object r0 = r5.l1
            X.01Wf r0 = (X.InterfaceC346701Wf) r0
            r4.LLILLL = r2
            java.lang.Object r0 = r0.emit(r6, r4)
            if (r0 != r3) goto L22
            return r3
        L3c:
            X.13kb r4 = new X.13kb
            r4.<init>(r5, r7)
            goto L12
        L42:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS212S0200000_30.emit$3(Y.AgS212S0200000_30, java.lang.Object, X.05Vn):java.lang.Object");
    }
}
