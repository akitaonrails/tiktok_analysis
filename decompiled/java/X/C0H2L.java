package X;

import android.content.Context;
import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0H2L, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.elements.EmptyElementDisplayStrategy$1", f = "EmptyElementDisplayStrategy.kt", l = {93}, m = "invokeSuspend")
public final class C0H2L extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C0H6P LL;
    public int LLILLJJLI;
    public final /* synthetic */ C0H6P LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0H2L(C0H6P c0h6p, InterfaceC1364105Vn<? super C0H2L> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c0h6p;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0H2L(this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C0H6P c0h6p;
        C1C7U.LIZ("EmptyElementDisplayStrategy@9646.<init>$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                c0h6p = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            c0h6p = this.LLILLL;
            C0H2N c0h2n = C0H6P.LJIILL;
            Context context = c0h6p.LJFF;
            this.LL = c0h6p;
            this.LLILLJJLI = 1;
            obj = c0h2n.LIZ(context, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("EmptyElementDisplayStrategy@9646.<init>$1");
                return objLJFF;
            }
        }
        c0h6p.LJIIJJI = (Bitmap) obj;
        this.LLILLL.LJIIIZ();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EmptyElementDisplayStrategy@9646.<init>$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
