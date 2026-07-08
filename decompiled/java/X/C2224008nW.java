package X;

import android.graphics.Bitmap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08nW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.record.shooting.PhotoProcessor$enterEditPageAfterImageCapture$saveAdditionalImageTask$1", f = "PhotoProcessor.kt", l = {215}, m = "invokeSuspend")
public final class C2224008nW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C578810Mn1 LL;
    public Object LLILLJJLI;
    public Function1 LLILLL;
    public Object LLILZ;
    public int LLILZIL;
    public final /* synthetic */ Map<Bitmap, Function1<String, Unit>> LLILZLL;
    public final /* synthetic */ C578810Mn1 LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2224008nW(Map<Bitmap, ? extends Function1<? super String, Unit>> map, C578810Mn1 c578810Mn1, InterfaceC1364105Vn<? super C2224008nW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = map;
        this.LLIZ = c578810Mn1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2224008nW(this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x004a -> B:6:0x001d). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            java.lang.String r7 = "PhotoProcessor@9c21.enterEditPageAfterImageCapture$saveAdditionalImageTask$1"
            X.C1C7U.LIZ(r7)
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r8.LLILZIL
            r5 = 1
            if (r0 == 0) goto L50
            if (r0 != r5) goto L66
            java.lang.Object r2 = r8.LLILZ
            kotlin.jvm.functions.Function1 r3 = r8.LLILLL
            java.lang.Object r4 = r8.LLILLJJLI
            java.util.Iterator r4 = (java.util.Iterator) r4
            X.0Mn1 r1 = r8.LL
            X.C155000ia.LIZIZ(r9)
        L1d:
            r3.invoke(r2)
        L20:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L60
            java.lang.Object r2 = r4.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r0 = r2.getKey()
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            java.lang.Object r3 = r2.getValue()
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            java.lang.String r2 = r1.LIZJ()
            r8.LL = r1
            r8.LLILLJJLI = r4
            r8.LLILLL = r3
            r8.LLILZ = r2
            r8.LLILZIL = r5
            java.lang.Object r0 = X.C578810Mn1.LJII(r0, r2, r8)
            if (r0 != r6) goto L1d
            X.C1C7U.LIZIZ(r7)
            return r6
        L50:
            X.C155000ia.LIZIZ(r9)
            java.util.Map<android.graphics.Bitmap, kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit>> r0 = r8.LLILZLL
            X.0Mn1 r1 = r8.LLIZ
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r4 = r0.iterator()
            goto L20
        L60:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        L66:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2224008nW.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
