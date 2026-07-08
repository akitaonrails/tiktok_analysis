package X;

import android.view.View;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0zh1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1905770zh1 {
    /* JADX WARN: Type inference failed for: r0v0, types: [X.0kzG] */
    public static final void LIZ(AbstractC1391580mJg abstractC1391580mJg, final String str, final EnumC1584360rKc enumC1584360rKc, final Function1 function1) {
        final ?? r0 = new InterfaceC1340660kzY() { // from class: X.0kzG
            @Override // X.InterfaceC1340660kzY
            public final void LIZ(AbstractC1391670mJp abstractC1391670mJp) {
                function1.invoke(abstractC1391670mJp);
            }
        };
        abstractC1391580mJg.LLILLJJLI.LJJI = new InterfaceC1340660kzY(str, enumC1584360rKc, r0) { // from class: X.0zh2
            public final String LIZ;
            public final EnumC1584360rKc LIZIZ;
            public final InterfaceC1340660kzY LIZJ;

            @Override // X.InterfaceC1340660kzY
            public final void LIZ(AbstractC1391670mJp abstractC1391670mJp) {
                C1905750zgz.LIZIZ.LIZIZ(this.LIZ, this.LIZIZ);
                InterfaceC1340660kzY interfaceC1340660kzY = this.LIZJ;
                if (interfaceC1340660kzY != null) {
                    interfaceC1340660kzY.LIZ(abstractC1391670mJp);
                }
            }

            {
                this.LIZ = str;
                this.LIZIZ = enumC1584360rKc;
                this.LIZJ = r0;
            }
        };
    }

    public static final void LIZIZ(AbstractC1391580mJg abstractC1391580mJg, String str, EnumC1584360rKc enumC1584360rKc, final Function0 function0) {
        abstractC1391580mJg.LLILLJJLI.LJJIFFI = new C1619380sF6(str, enumC1584360rKc, new InterfaceC1391650mJn() { // from class: X.0zh3
            @Override // X.InterfaceC1391650mJn
            public final void onShow() {
                function0.invoke();
            }
        });
    }

    public static final void LIZJ(AbstractC1391580mJg abstractC1391580mJg, final String str, boolean z, final View.OnClickListener onClickListener) {
        abstractC1391580mJg.LJIIIZ(z, new View.OnClickListener(str, onClickListener) { // from class: X.0zgm
            public final String LL;
            public final View.OnClickListener LLILLJJLI;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1905750zgz.LIZIZ.LIZLLL(this.LL, EnumC1905820zh6.CLICK_TOOLTIPS);
                View.OnClickListener onClickListener2 = this.LLILLJJLI;
                if (onClickListener2 != null) {
                    onClickListener2.onClick(view);
                }
            }

            {
                this.LL = str;
                this.LLILLJJLI = onClickListener;
            }
        });
    }
}
