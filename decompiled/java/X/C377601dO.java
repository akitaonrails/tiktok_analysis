package X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01dO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "live.ss.android.common.util.UtilityKotlinExtentionsKt$setImageResourceAsync$1", f = "UtilityKotlinExtentions.kt", l = {105}, m = "invokeSuspend")
public final class C377601dO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ ImageView LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C377601dO(int i, ImageView imageView, InterfaceC1364105Vn<? super C377601dO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = i;
        this.LLILLL = imageView;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C377601dO(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            int i2 = this.LLILLJJLI;
            this.LL = 1;
            obj = C23250099c.LJI(this, C0PEM.LIZJ, new C377501dN(i2, null));
            if (obj == objLJFF) {
                return objLJFF;
            }
        }
        Drawable drawable = (Drawable) obj;
        if (C500260Jjc.LJ(this.LLILLL.getContext()) == null) {
            return Unit.LIZ;
        }
        this.LLILLL.setImageDrawable(drawable);
        return Unit.LIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
