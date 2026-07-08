package X;

import android.content.Context;

/* JADX INFO: renamed from: X.0ctl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1029550ctl extends C1029530ctj {
    @Override // X.C1029530ctj, X.InterfaceC1029520cti
    public final AbstractC1066520drO LIZIZ(Context context, C1066490drL c1066490drL) {
        final ViewOnClickListenerC1029810cuB viewOnClickListenerC1029810cuB = new ViewOnClickListenerC1029810cuB(context);
        return new AbstractC1066520drO<C1066490drL>(viewOnClickListenerC1029810cuB) { // from class: X.0cuE
            public final ViewOnClickListenerC1029810cuB LL;

            {
                super(viewOnClickListenerC1029810cuB);
                this.LL = viewOnClickListenerC1029810cuB;
            }

            @Override // X.AbstractC1066520drO
            public final void I5(C1066490drL c1066490drL2) {
                ViewOnClickListenerC1029810cuB viewOnClickListenerC1029810cuB2 = this.LL;
                if (viewOnClickListenerC1029810cuB2 != null) {
                    c1066490drL2.getClass();
                    viewOnClickListenerC1029810cuB2.setDataCenter(null);
                }
                ViewOnClickListenerC1029810cuB viewOnClickListenerC1029810cuB3 = this.LL;
                if (viewOnClickListenerC1029810cuB3 != null) {
                    viewOnClickListenerC1029810cuB3.LIZ(c1066490drL2.LIZIZ, c1066490drL2.LIZ);
                }
                c1066490drL2.getClass();
            }
        };
    }
}
