package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.10lN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19339510lN implements InterfaceC1401600mZq {
    public final Context LIZ;
    public final int LIZIZ;

    @Override // X.InterfaceC1401600mZq
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC1401600mZq
    public final void LIZLLL(RelativeLayout relativeLayout) {
    }

    @Override // X.InterfaceC1401600mZq
    public final InterfaceC19369110q9 LIZ(ViewGroup viewGroup) {
        return new C20687815xM(this.LIZ, viewGroup);
    }

    @Override // X.InterfaceC1401600mZq
    public final void LIZJ(RelativeLayout relativeLayout) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(this.LIZ), R.layout.bjy, relativeLayout, false);
        C1324840ka2.LIZ((RemoteImageView) viewTd.findViewById(R.id.vzc), this.LIZIZ);
        C844470XAv c844470XAv = C844470XAv.LIZ;
        c844470XAv.getClass();
        float f = 96;
        int iLIZJ = (int) C12ES.LIZJ(f, C844470XAv.LIZ());
        c844470XAv.getClass();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iLIZJ, (int) C12ES.LIZJ(f, C844470XAv.LIZ()));
        layoutParams.addRule(12);
        layoutParams.addRule(14);
        c844470XAv.getClass();
        layoutParams.bottomMargin = (int) C12ES.LIZJ(8, C844470XAv.LIZ());
        relativeLayout.addView(viewTd, layoutParams);
    }

    public C19339510lN(Context context, int i) {
        this.LIZ = context;
        this.LIZIZ = i;
    }
}
