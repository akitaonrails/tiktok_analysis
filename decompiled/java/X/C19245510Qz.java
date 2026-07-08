package X;

import Y.AAListenerS338S0100000_28;
import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.plugin.journey.NewUserInterestStruct;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.10Qz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19245510Qz extends C10R3 {
    public final TuxIconView LLILZIL;
    public final TuxTextView LLILZLL;
    public final C1295960jpS LLIZ;

    @Override // X.C10R3
    public final void N5(NewUserInterestStruct newUserInterestStruct) {
        int iLJIIJ;
        int iLIZIZ;
        this.itemView.setBackgroundResource(R.drawable.ce3);
        this.LLILZLL.setText(newUserInterestStruct.text);
        TuxTextView tuxTextView = this.LLILZLL;
        if (C1911400zq6.LIZ(this.itemView.getContext())) {
            iLJIIJ = C12ES.LJIIJ(this.itemView.getContext());
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(150));
        } else {
            iLJIIJ = C12ES.LJIIJ(this.itemView.getContext());
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(150));
        }
        tuxTextView.setMaxWidth(iLJIIJ - iLIZIZ);
        C786410Ut5.LLD(4, this.LLIZ);
    }

    public C19245510Qz(C19245210Qw c19245210Qw, View view) {
        super(c19245210Qw, view);
        this.LLILZIL = (TuxIconView) view.findViewById(R.id.a3c);
        this.LLILZLL = (TuxTextView) view.findViewById(R.id.text);
        this.LLIZ = (C1295960jpS) view.findViewById(R.id.xv7);
    }

    @Override // X.C10R3
    public final void P5(String str, boolean z) {
        if (z) {
            this.itemView.setSelected(true);
            C786410Ut5.LLLLLLZZ(this.LLILZIL, 4);
            C786410Ut5.LLD(0, this.LLIZ);
            this.LLIZ.addAnimatorListener(new AAListenerS338S0100000_28(this, 0));
            this.LLIZ.playAnimation();
            return;
        }
        this.itemView.setSelected(false);
        C786410Ut5.LLLLLLZZ(this.LLILZIL, 0);
        C786410Ut5.LLD(4, this.LLIZ);
    }
}
