package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0MNy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C567600MNy extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ C0MO1 LLILLJJLI;
    public final /* synthetic */ LinearLayout LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ InterfaceC1364105Vn<C0MO1> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C567600MNy(Context context, C0MO1 c0mo1, LinearLayout linearLayout, boolean z, C23260099m c23260099m) {
        super(1);
        this.LL = context;
        this.LLILLJJLI = c0mo1;
        this.LLILLL = linearLayout;
        this.LLILZ = z;
        this.LLILZIL = c23260099m;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        View view;
        boolean zBooleanValue = bool.booleanValue();
        C0MO1 c0mo1 = null;
        if (C426750GoL.LIZLLL(this.LL)) {
            Object obj = this.LLILLJJLI;
            if ((obj instanceof View) && (view = (View) obj) != null) {
                view.setLayoutDirection(1);
            }
        }
        C0FFY.LIZIZ(this.LLILLL);
        if (this.LLILZ) {
            C426750GoL.LJIIL(this.LLILLL, null, Integer.valueOf(((this.LLILLL.getLayoutParams().height - ((this.LLILLJJLI.getAreaHeight() + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(156))) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)))) / 2) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(70))), null, null, 29);
        }
        InterfaceC1364105Vn<C0MO1> interfaceC1364105Vn = this.LLILZIL;
        if (zBooleanValue) {
            c0mo1 = this.LLILLJJLI;
        }
        C2243608qg.LIZ(c0mo1, interfaceC1364105Vn);
        return Unit.LIZ;
    }
}
