package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Oh3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C626070Oh3 extends LinearLayout {
    public final void LIZIZ() {
        TuxIconView tuxIconView = (TuxIconView) findViewById(R.id.yk_);
        C01GW c01gw = C626080Oh4.LIZ;
        if (C626080Oh4.LIZIZ) {
            tuxIconView.setIconRes(R.raw.icon_speaker_x_mark_ltr);
        } else {
            tuxIconView.setIconRes(R.raw.icon_speaker_2_ltr);
        }
    }

    public final void setMuteClickListener(View.OnClickListener onClickListener) {
        C786410Ut5.a9((TuxIconView) findViewById(R.id.yk_), onClickListener);
    }

    public final void setMuteIconVisible(boolean z) {
        int i;
        TuxIconView tuxIconView = (TuxIconView) findViewById(R.id.yk_);
        if (z) {
            i = 0;
        } else {
            i = 4;
        }
        C786410Ut5.LLLLLLZZ(tuxIconView, i);
    }

    public C626070Oh3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LinearLayout.inflate(context, R.layout.bsu, this);
    }

    public final void LIZ(long j, boolean z) {
        TextView textView = (TextView) findViewById(R.id.ykm);
        if (textView != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.e4);
            c384050F3z.LJIIIZ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
            c384050F3z.LJIIJJI = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
            textView.setBackground(c384050F3z.LIZ(textView.getContext()));
            textView.setText(textView.getResources().getQuantityString(2131756060, (int) j, C1843500y4a.LIZIZ(j)));
        }
        LIZIZ();
        TuxIconView tuxIconView = (TuxIconView) findViewById(R.id.ykl);
        View viewFindViewById = findViewById(R.id.ykk);
        if (z) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById);
            C786410Ut5.LLLLLLZZ(tuxIconView, 0);
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(11));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(11));
            c419910GdJ.LIZ = R.raw.icon_eye_fill;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a00);
            TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(tuxIconView.getContext());
            C384050F3z c384050F3z2 = new C384050F3z();
            c384050F3z2.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(17));
            c384050F3z2.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(17));
            c384050F3z2.LIZIZ = Integer.valueOf(R.attr.ob);
            c384050F3z2.LJIIIIZZ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
            c384050F3z2.LJIIJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
            tuxIconView.setImageDrawable(C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z2.LIZ(tuxIconView.getContext())));
            return;
        }
        C786410Ut5.LLLLLLZZ(tuxIconView, 8);
        C786410Ut5.LJLLLLLL(0, viewFindViewById);
        C1295960jpS c1295960jpS = (C1295960jpS) findViewById(R.id.ykj);
        c1295960jpS.setRepeatCount(-1);
        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().LJIILLIIL(c1295960jpS, Boolean.TRUE);
    }
}
