package X;

import android.app.Activity;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06RT, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.pet.share.ShareStreakUtil$showLoading$2", f = "StreakShareUtil.kt", l = {337, 340, 341}, m = "invokeSuspend")
public final class C06RT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC1631620sYq<Activity, String, InterfaceC1364105Vn<? super Pair<Integer, C1371590lnR>>, Object> LLILLJJLI;
    public final /* synthetic */ Activity LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ C06RP LLILZIL;
    public final /* synthetic */ Function1<Pair<Integer, C1371590lnR>, Unit> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C06RT(InterfaceC1631620sYq<? super Activity, ? super String, ? super InterfaceC1364105Vn<? super Pair<Integer, C1371590lnR>>, ? extends Object> interfaceC1631620sYq, Activity activity, String str, C06RP c06rp, Function1<? super Pair<Integer, C1371590lnR>, Unit> function1, InterfaceC1364105Vn<? super C06RT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC1631620sYq;
        this.LLILLL = activity;
        this.LLILZ = str;
        this.LLILZIL = c06rp;
        this.LLILZLL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06RT(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.String r8 = "ShareStreakUtil@bf84.showLoading$2"
            X.C1C7U.LIZ(r8)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r9.LL
            r6 = 0
            r4 = 3
            r7 = 2
            r3 = 1
            if (r0 == 0) goto L20
            if (r0 == r3) goto L3a
            if (r0 == r7) goto L4f
            if (r0 != r4) goto L6d
            X.C155000ia.LIZIZ(r10)
        L1a:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r8)
            return r0
        L20:
            X.C155000ia.LIZIZ(r10)
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r2 = X.C2107308Nj.LIZ
            X.06RU r1 = new X.06RU
            X.06RP r0 = r9.LLILZIL
            r1.<init>(r0, r6)
            r9.LL = r3
            java.lang.Object r0 = X.C23250099c.LJI(r9, r2, r1)
            if (r0 != r5) goto L3d
            X.C1C7U.LIZIZ(r8)
            return r5
        L3a:
            X.C155000ia.LIZIZ(r10)
        L3d:
            X.0sYq<android.app.Activity, java.lang.String, X.05Vn<? super kotlin.Pair<java.lang.Integer, X.0lnR>>, java.lang.Object> r2 = r9.LLILLJJLI
            android.app.Activity r1 = r9.LLILLL
            java.lang.String r0 = r9.LLILZ
            r9.LL = r7
            java.lang.Object r10 = r2.invoke(r1, r0, r9)
            if (r10 != r5) goto L52
            X.C1C7U.LIZIZ(r8)
            return r5
        L4f:
            X.C155000ia.LIZIZ(r10)
        L52:
            kotlin.Pair r10 = (kotlin.Pair) r10
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r3 = X.C2107308Nj.LIZ
            X.06RS r2 = new X.06RS
            X.06RP r1 = r9.LLILZIL
            kotlin.jvm.functions.Function1<kotlin.Pair<java.lang.Integer, X.0lnR>, kotlin.Unit> r0 = r9.LLILZLL
            r2.<init>(r1, r0, r10, r6)
            r9.LL = r4
            java.lang.Object r0 = X.C23250099c.LJI(r9, r3, r2)
            if (r0 != r5) goto L1a
            X.C1C7U.LIZIZ(r8)
            return r5
        L6d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06RT.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
