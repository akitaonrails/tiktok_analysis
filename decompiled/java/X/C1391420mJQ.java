package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS422S0200000_21;

/* JADX INFO: renamed from: X.0mJQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1391420mJQ extends AbstractC1391440mJS {
    public String LIZLLL;
    public boolean LJ;
    public final C444940Hca LJFF;

    @Override // X.AbstractC1397490mTD
    public final View LIZIZ() {
        TuxTextView tuxTextView = new TuxTextView(this.LIZ, null, 6, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        C786410Ut5.R6(tuxTextView, layoutParams);
        tuxTextView.setText(this.LJFF.LIZ(tuxTextView.getContext()));
        tuxTextView.setMovementMethod(C431260Gvc.LIZ);
        tuxTextView.setClickable(false);
        tuxTextView.setLongClickable(false);
        return tuxTextView;
    }

    public C1391420mJQ(Context context) {
        super(context);
        this.LIZLLL = "";
        C444940Hca c444940Hca = new C444940Hca();
        c444940Hca.LIZJ = this.LIZLLL;
        c444940Hca.LIZIZ = this.LJ;
        c444940Hca.LIZLLL(this.LIZIZ.LJJI);
        c444940Hca.LIZIZ(this.LIZIZ.LJ);
        this.LJFF = c444940Hca;
    }

    @Override // X.AbstractC1397490mTD
    public final void LIZ(C1397510mTF c1397510mTF) {
        this.LIZJ = c1397510mTF;
    }

    public final void LIZJ(boolean z) {
        this.LJ = z;
        this.LJFF.LIZIZ = z;
    }

    public final void LIZLLL(String str) {
        this.LIZLLL = str;
        this.LJFF.LIZJ = str;
    }

    public final void LJ(Function1<? super C1391430mJR, Unit> function1) {
        this.LJFF.LJIIIIZZ = new AwS422S0200000_21((Function1) function1, (Function1<? super C1391430mJR, Unit>) this, (C1391420mJQ) 101);
    }
}
