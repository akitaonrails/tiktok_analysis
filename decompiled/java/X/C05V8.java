package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05V8, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2", f = "TapGestureDetector.kt", l = {227}, m = "invokeSuspend")
public final class C05V8 extends C09AW implements Function2<C05ZT, InterfaceC1364105Vn<? super C20066813fO>, Object> {
    public long LLILLJJLI;
    public int LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C20066813fO LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05V8(C20066813fO c20066813fO, InterfaceC1364105Vn<? super C05V8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = c20066813fO;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C05V8 c05v8 = new C05V8(this.LLILZIL, interfaceC1364105Vn);
        c05v8.LLILZ = obj;
        return c05v8;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x003e -> B:6:0x0014). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r8 = X.C099R.LJFF()
            int r0 = r9.LLILLL
            r7 = 1
            if (r0 == 0) goto L1d
            if (r0 != r7) goto L41
            long r2 = r9.LLILLJJLI
            java.lang.Object r6 = r9.LLILZ
            X.05ZT r6 = (X.C05ZT) r6
            X.C155000ia.LIZIZ(r10)
        L14:
            X.13fO r10 = (X.C20066813fO) r10
            long r4 = r10.LIZIZ
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 < 0) goto L32
            return r10
        L1d:
            X.C155000ia.LIZIZ(r10)
            java.lang.Object r6 = r9.LLILZ
            X.05ZT r6 = (X.C05ZT) r6
            X.13fO r0 = r9.LLILZIL
            long r2 = r0.LIZIZ
            X.05Zl r0 = r6.getViewConfiguration()
            r0.LIZ()
            r0 = 40
            long r2 = r2 + r0
        L32:
            r9.LLILZ = r6
            r9.LLILLJJLI = r2
            r9.LLILLL = r7
            X.13fE r0 = X.EnumC20065813fE.Main
            java.lang.Object r10 = X.C1374405Zm.LIZIZ(r6, r7, r0, r9)
            if (r10 != r8) goto L14
            return r8
        L41:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05V8.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C05ZT c05zt, InterfaceC1364105Vn<? super C20066813fO> interfaceC1364105Vn) {
        return ((a) create(c05zt, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
