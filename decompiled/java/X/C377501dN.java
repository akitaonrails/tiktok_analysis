package X;

import android.graphics.drawable.Drawable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01dN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "live.ss.android.common.util.UtilityKotlinExtentionsKt$getDrawableInBackground$2", f = "UtilityKotlinExtentions.kt", l = {}, m = "invokeSuspend")
public final class C377501dN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Drawable>, Object> {
    public final /* synthetic */ int LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C377501dN(int i, InterfaceC1364105Vn<? super C377501dN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C377501dN(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        return C497740JfY.LJIIJ(this.LL);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Drawable> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
