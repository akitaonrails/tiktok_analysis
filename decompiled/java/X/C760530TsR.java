package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0TsR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.LiveEffectTestHelper$updateMakeUp$1", f = "LiveEffectTestHelper.kt", l = {BaseNotice.CREATOR, 68}, m = "invokeSuspend")
public final class C760530TsR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C760530TsR(int i, String str, String str2, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C760530TsR(this.LLILZ, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r2 = r19
            java.lang.String r7 = "LiveEffectTestHelper@73b1.updateMakeUp$1"
            X.C1C7U.LIZ(r7)
            java.lang.Object r6 = X.C099R.LJFF()
            r12 = r18
            int r0 = r12.LL
            r5 = 2
            r1 = 1
            if (r0 == 0) goto L2d
            if (r0 == r1) goto L58
            if (r0 != r5) goto L81
            X.C155000ia.LIZIZ(r2)
        L1a:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r0 = r2.booleanValue()
            if (r0 != 0) goto L27
            java.lang.String r0 = "update makeup fail"
            X.C766270U4b.LJIIJJI(r0)
        L27:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        L2d:
            X.C155000ia.LIZIZ(r2)
            X.0U8T r8 = X.C0U8T.LIZ
            java.lang.String r0 = r12.LLILLJJLI
            java.lang.String r10 = X.C0UD4.LJFF
            boolean r0 = r8.LJIIIIZZ(r0, r10)
            if (r0 != 0) goto L68
            java.lang.String r9 = r12.LLILLJJLI
            java.lang.String r11 = r12.LLILLL
            r14 = 0
            r12.LL = r1
            r0 = 476(0x1dc, float:6.67E-43)
            kotlin.jvm.internal.AFwS199S0000000_12 r13 = kotlin.jvm.internal.AFwS199S0000000_12.get$arr$(r0)
            r16 = 1
            r17 = 0
            r15 = r14
            java.lang.Object r2 = r8.LJFF(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            if (r2 != r6) goto L5b
            X.C1C7U.LIZIZ(r7)
            return r6
        L58:
            X.C155000ia.LIZIZ(r2)
        L5b:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r0 = r2.booleanValue()
            if (r0 != 0) goto L68
            java.lang.String r0 = "set makeup fail"
            X.C766270U4b.LJIIJJI(r0)
        L68:
            X.0U8T r4 = X.C0U8T.LIZ
            java.lang.String r3 = r12.LLILLJJLI
            java.lang.String r2 = X.C0UD4.LJFF
            java.lang.String r1 = r12.LLILLL
            int r0 = r12.LLILZ
            r12.LL = r5
            r4.getClass()
            java.lang.Object r2 = X.C0U8T.LJIJI(r0, r3, r2, r1, r12)
            if (r2 != r6) goto L1a
            X.C1C7U.LIZIZ(r7)
            return r6
        L81:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C760530TsR.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
