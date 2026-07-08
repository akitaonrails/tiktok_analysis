package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0qrW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "tiktok.communication.LibKt$getAllParents$1", f = "Lib.kt", l = {93}, m = "invokeSuspend")
public final class C1566320qrW extends C09AW implements Function2<AbstractC1421005hI<? super InterfaceC665370Q7z>, InterfaceC1364105Vn<? super Unit>, Object> {
    public InterfaceC665370Q7z LLILLJJLI;
    public int LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ InterfaceC665370Q7z LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1566320qrW(InterfaceC665370Q7z interfaceC665370Q7z, InterfaceC1364105Vn<? super C1566320qrW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = interfaceC665370Q7z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1566320qrW c1566320qrW = new C1566320qrW(this.LLILZIL, interfaceC1364105Vn);
        c1566320qrW.LLILZ = obj;
        return c1566320qrW;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002e -> B:6:0x0014). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r3 = 1
            if (r0 == 0) goto L31
            if (r0 != r3) goto L3e
            X.0Q7z r2 = r5.LLILLJJLI
            java.lang.Object r0 = r5.LLILZ
            X.05hI r0 = (X.AbstractC1421005hI) r0
            X.C155000ia.LIZIZ(r6)
        L14:
            X.0qZ5 r1 = r2.getTree()
            X.0Q7z r2 = r1.LJIIIIZZ()
        L1c:
            com.bytedance.provider.impl.GScope r1 = com.bytedance.provider.impl.GScope.LL
            boolean r1 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r1)
            if (r1 != 0) goto L3b
            r5.LLILZ = r0
            r5.LLILLJJLI = r2
            r5.LLILLL = r3
            java.lang.Object r1 = r0.LIZ(r2, r5)
            if (r1 != r4) goto L14
            return r4
        L31:
            X.C155000ia.LIZIZ(r6)
            java.lang.Object r0 = r5.LLILZ
            X.05hI r0 = (X.AbstractC1421005hI) r0
            X.0Q7z r2 = r5.LLILZIL
            goto L1c
        L3b:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L3e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1566320qrW.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AbstractC1421005hI<? super InterfaceC665370Q7z> abstractC1421005hI, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(abstractC1421005hI, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
