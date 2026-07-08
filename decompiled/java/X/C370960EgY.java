package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0EgY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.ugc.android.editor.track.frame.VideoFrameCache$1", f = "VideoFrameCache.kt", l = {84}, m = "invokeSuspend")
public final class C370960EgY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public InterfaceC358460E3o LL;
    public InterfaceC824740WWy LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ C370920EgU LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C370960EgY(C370920EgU c370920EgU, InterfaceC1364105Vn<? super C370960EgY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c370920EgU;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C370960EgY(this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0049 -> B:6:0x0017). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.String r6 = "VideoFrameCache@ba6a.<init>$1"
            X.C1C7U.LIZ(r6)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r7.LLILLL
            r4 = 1
            if (r0 == 0) goto L55
            if (r0 != r4) goto L6b
            X.0WWy r3 = r7.LLILLJJLI
            X.0E3o r2 = r7.LL
            X.C155000ia.LIZIZ(r8)
        L17:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r0 = r8.booleanValue()
            if (r0 == 0) goto L65
            java.lang.Object r1 = r3.next()
            X.0E3o r1 = (X.InterfaceC358460E3o) r1
            boolean r0 = r1 instanceof X.C358480E3q
            if (r0 != 0) goto L4d
            boolean r0 = r1 instanceof X.C358450E3n
            if (r0 != 0) goto L4d
            boolean r0 = r1 instanceof X.C370990Egb
            if (r0 == 0) goto L4b
            X.0Egb r1 = (X.C370990Egb) r1
            X.05XL<X.0E3o> r0 = r1.LIZ
            r0.LJIIZILJ(r2)
        L38:
            r1 = 0
        L39:
            r7.LL = r1
            r7.LLILLJJLI = r3
            r7.LLILLL = r4
            java.lang.Object r8 = r3.LIZ(r7)
            if (r8 != r5) goto L49
            X.C1C7U.LIZIZ(r6)
            return r5
        L49:
            r2 = r1
            goto L17
        L4b:
            r1 = r2
            goto L39
        L4d:
            X.0EgU r0 = r7.LLILZ
            X.1DEK r0 = r0.LLJIJIL
            r0.LJIIIIZZ(r1)
            goto L39
        L55:
            X.C155000ia.LIZIZ(r8)
            X.0EgU r0 = r7.LLILZ
            X.1DEK r0 = r0.LLJI
            r0.getClass()
            X.1DEL r3 = new X.1DEL
            r3.<init>(r0)
            goto L38
        L65:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        L6b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C370960EgY.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
