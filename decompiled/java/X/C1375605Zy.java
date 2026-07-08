package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Zy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1", f = "TapGestureDetector.kt", l = {105, 116, 119, 122, 149, 167, 169, 180}, m = "invokeSuspend")
public final class C1375605Zy extends C09AW implements Function2<C05ZT, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LLILLJJLI;
    public Object LLILLL;
    public C20066813fO LLILZ;
    public int LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ InterfaceC497601wk LLIZ;
    public final /* synthetic */ InterfaceC1631620sYq<InterfaceC595070NVp, C1378605aS, InterfaceC1364105Vn<? super Unit>, Object> LLIZLLLIL;
    public final /* synthetic */ Function1<C1378605aS, Unit> LLJ;
    public final /* synthetic */ Function1<C1378605aS, Unit> LLJI;
    public final /* synthetic */ Function1<C1378605aS, Unit> LLJIJIL;
    public final /* synthetic */ C1697530uH9 LLJILJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1375605Zy(InterfaceC497601wk interfaceC497601wk, InterfaceC1631620sYq<? super InterfaceC595070NVp, ? super C1378605aS, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> interfaceC1631620sYq, Function1<? super C1378605aS, Unit> function1, Function1<? super C1378605aS, Unit> function12, Function1<? super C1378605aS, Unit> function13, C1697530uH9 c1697530uH9, InterfaceC1364105Vn<? super C1375605Zy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZ = interfaceC497601wk;
        this.LLIZLLLIL = interfaceC1631620sYq;
        this.LLJ = function1;
        this.LLJI = function12;
        this.LLJIJIL = function13;
        this.LLJILJIL = c1697530uH9;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1375605Zy c1375605Zy = new C1375605Zy(this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, interfaceC1364105Vn);
        c1375605Zy.LLILZLL = obj;
        return c1375605Zy;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0221 A[PHI: r3 r5
      0x0221: PHI (r3v21 X.09AE) = (r3v23 X.09AE), (r3v26 X.09AE) binds: [B:78:0x01f8, B:81:0x0219] A[DONT_GENERATE, DONT_INLINE]
      0x0221: PHI (r5v9 X.13fO) = (r5v10 X.13fO), (r5v11 X.13fO) binds: [B:78:0x01f8, B:81:0x0219] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0231  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 630
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1375605Zy.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C05ZT c05zt, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c05zt, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
