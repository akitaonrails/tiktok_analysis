package X;

import com.bytedance.im.core.proto.MediaUploadConfig;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0OAb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.bytedance.im.uploader.DefaultUploaderAbility$fetchRemoteUploadConfig$1", f = "DefaultUploaderAbility.kt", l = {102}, m = "invokeSuspend")
public final class C614950OAb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0YOG LLILLL;
    public final /* synthetic */ Function1<List<MediaUploadConfig>, Unit> LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C614950OAb(C0YOG c0yog, Function1<? super List<MediaUploadConfig>, Unit> function1, Function0<Unit> function0, InterfaceC1364105Vn<? super C614950OAb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c0yog;
        this.LLILZ = function1;
        this.LLILZIL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C614950OAb c614950OAb = new C614950OAb(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c614950OAb.LLILLJJLI = obj;
        return c614950OAb;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.String r4 = "DefaultUploaderAbility@2148.fetchRemoteUploadConfig$1"
            X.C1C7U.LIZ(r4)
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LL
            r2 = 1
            if (r0 == 0) goto L39
            if (r0 != r2) goto L56
            X.C155000ia.LIZIZ(r6)
            X.00o6 r6 = (X.C189200o6) r6
            java.lang.Object r1 = r6.m10unboximpl()
        L19:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 != 0) goto L2c
            if (r1 == 0) goto L2c
            kotlin.jvm.functions.Function1<java.util.List<com.bytedance.im.core.proto.MediaUploadConfig>, kotlin.Unit> r0 = r5.LLILZ
            if (r0 == 0) goto L2c
            r0.invoke(r1)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            if (r0 != 0) goto L33
        L2c:
            kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r5.LLILZIL
            if (r0 == 0) goto L33
            r0.invoke()
        L33:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r4)
            return r0
        L39:
            X.C155000ia.LIZIZ(r6)
            java.lang.Object r1 = r5.LLILLJJLI
            X.0YOG r0 = r5.LLILLL
            X.01GW r0 = r0.LIZLLL
            java.lang.Object r0 = r0.getValue()
            X.0YO0 r0 = (X.C0YO0) r0
            r5.LLILLJJLI = r1
            r5.LL = r2
            java.lang.Object r1 = r0.LIZIZ(r5)
            if (r1 != r3) goto L19
            X.C1C7U.LIZIZ(r4)
            return r3
        L56:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C614950OAb.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
