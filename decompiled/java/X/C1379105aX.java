package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05aX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$updateSelectionTouchMode$1$1", f = "SelectionGestures.kt", l = {94}, m = "invokeSuspend")
public final class C1379105aX extends C09AW implements Function2<C05ZT, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ Function1<Boolean, Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1379105aX(Function1<? super Boolean, Unit> function1, InterfaceC1364105Vn<? super C1379105aX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1379105aX c1379105aX = new C1379105aX(this.LLILZ, interfaceC1364105Vn);
        c1379105aX.LLILLL = obj;
        return c1379105aX;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002f A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x002d -> B:6:0x0012). Please report as a decompilation issue!!! */
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
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLJJLI
            r3 = 1
            if (r0 == 0) goto L30
            if (r0 != r3) goto L38
            java.lang.Object r0 = r5.LLILLL
            X.05ZT r0 = (X.C05ZT) r0
            X.C155000ia.LIZIZ(r6)
        L12:
            X.13fT r6 = (X.C20067313fT) r6
            kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> r2 = r5.LLILZ
            boolean r1 = X.C1379605ac.LIZLLL(r6)
            r1 = r1 ^ 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2.invoke(r1)
        L23:
            X.13fE r1 = X.EnumC20065813fE.Initial
            r5.LLILLL = r0
            r5.LLILLJJLI = r3
            java.lang.Object r6 = r0.LJJIJIL(r1, r5)
            if (r6 != r4) goto L12
            return r4
        L30:
            X.C155000ia.LIZIZ(r6)
            java.lang.Object r0 = r5.LLILLL
            X.05ZT r0 = (X.C05ZT) r0
            goto L23
        L38:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1379105aX.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C05ZT c05zt, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c05zt, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
