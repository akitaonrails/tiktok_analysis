package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.assem.SubPackageErrorAssem;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.ui.SubPackagePageSheet;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0KD1, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KD1 extends C09AY implements Function1<C0SZ5, Unit> {
    public final /* synthetic */ SubPackagePageSheet LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0KD1(SubPackagePageSheet subPackagePageSheet) {
        super(1);
        this.LL = subPackagePageSheet;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0SZ5 c0sz5) {
        C0SZ5 c0sz52 = c0sz5;
        c0sz52.LL = C13LE.LIZ(SubPackageErrorAssem.class);
        c0sz52.LLIZLLLIL = R.id.pxt;
        final SubPackagePageSheet subPackagePageSheet = this.LL;
        c0sz52.LLJIJIL = C1163420gNg.LIZ(new InterfaceC201986141o() { // from class: X.0KD2
            @Override // X.InterfaceC201986141o
            public final void LIZ(Context context, int i, View view, Function1 function1) {
                int i2;
                ViewGroup viewGroup;
                if (C960203pA.LIZIZ(subPackagePageSheet.requireActivity())) {
                    i2 = R.style.uy;
                } else {
                    i2 = R.style.v0;
                }
                LayoutInflater layoutInflaterNe = C786410Ut5.ne(new C1361400lX0(subPackagePageSheet.requireActivity(), i2));
                if (view instanceof ViewGroup) {
                    viewGroup = (ViewGroup) view;
                } else {
                    viewGroup = null;
                }
                function1.invoke(C786410Ut5.Td(layoutInflaterNe, i, viewGroup, false));
            }
        });
        return Unit.LIZ;
    }
}
