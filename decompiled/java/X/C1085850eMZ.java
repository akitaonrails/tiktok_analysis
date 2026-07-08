package X;

import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0eMZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1085850eMZ extends C09AY implements Function1<ViewGroup.LayoutParams, Unit> {
    public final /* synthetic */ float LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1085850eMZ(float f) {
        super(1);
        this.LL = f;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ViewGroup.LayoutParams layoutParams) {
        layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(48 + (this.LL * 4.5f))));
        return Unit.LIZ;
    }
}
