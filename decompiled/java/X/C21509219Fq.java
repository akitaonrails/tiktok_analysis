package X;

import Y.AAListenerS342S0100000_32;
import Y.AUListenerS253S0100000_2;
import Y.AUListenerS254S0100000_4;
import Y.AUListenerS256S0100000_6;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.profile.business.ur.ui.CropActivity;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.19Fq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21509219Fq {
    public final Context LIZ;
    public final ViewGroup LIZIZ;
    public final InterfaceC21509619Fu LIZJ;
    public final View LIZLLL;
    public final FrameLayout LJ;
    public final RemoteImageView LJFF;
    public final TuxIconView LJI;
    public final ConstraintLayout LJII;
    public final FrameLayout LJIIIIZZ;
    public final TuxTextView LJIIIZ;
    public final C0HZQ LJIIJ;
    public final C424560Gko LJIIJJI;
    public final TuxIconView LJIIL;
    public final TuxTextView LJIILIIL;
    public final TuxTextView LJIILJJIL;
    public final TuxTextView LJIILL;
    public final TuxTextView LJIILLIIL;
    public final AnimatorSet LJIIZILJ;

    public final void LIZ() {
        this.LJIIZILJ.removeAllListeners();
        this.LJIIZILJ.cancel();
        if (this.LJIIJ.isChecked()) {
            FrameLayout frameLayout = this.LJ;
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt((int) C12ES.LIZJ(120.0f, this.LIZ), (int) C12ES.LIZJ(240.0f, this.LIZ));
            valueAnimatorOfInt.setDuration(250L);
            valueAnimatorOfInt.addUpdateListener(new AUListenerS253S0100000_2(frameLayout, 21));
            RemoteImageView remoteImageView = this.LJFF;
            ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(0, 100);
            valueAnimatorOfInt2.setDuration(100L);
            valueAnimatorOfInt2.addUpdateListener(new AUListenerS254S0100000_4(remoteImageView, 9));
            C424560Gko c424560Gko = this.LJIIJJI;
            ValueAnimator valueAnimatorOfInt3 = ValueAnimator.ofInt((int) ((C12ES.LIZJ(120.0f, this.LIZ) / C12ES.LIZJ(84.0f, this.LIZ)) * 100), 100);
            valueAnimatorOfInt3.setDuration(250L);
            valueAnimatorOfInt3.addUpdateListener(new AUListenerS256S0100000_6(c424560Gko, 77));
            this.LJIIZILJ.addListener(new AAListenerS342S0100000_32(this, 3));
            this.LJIIZILJ.playTogether(valueAnimatorOfInt, valueAnimatorOfInt2, valueAnimatorOfInt3);
            this.LJIIZILJ.start();
            return;
        }
        this.LJIIZILJ.cancel();
        this.LJIIZILJ.removeAllListeners();
        FrameLayout frameLayout2 = this.LJ;
        ValueAnimator valueAnimatorOfInt4 = ValueAnimator.ofInt((int) C12ES.LIZJ(240.0f, this.LIZ), (int) C12ES.LIZJ(120.0f, this.LIZ));
        valueAnimatorOfInt4.setDuration(250L);
        valueAnimatorOfInt4.addUpdateListener(new AUListenerS253S0100000_2(frameLayout2, 21));
        RemoteImageView remoteImageView2 = this.LJFF;
        ValueAnimator valueAnimatorOfInt5 = ValueAnimator.ofInt(100, 0);
        valueAnimatorOfInt5.setDuration(100L);
        valueAnimatorOfInt5.addUpdateListener(new AUListenerS254S0100000_4(remoteImageView2, 9));
        C424560Gko c424560Gko2 = this.LJIIJJI;
        ValueAnimator valueAnimatorOfInt6 = ValueAnimator.ofInt(100, (int) ((C12ES.LIZJ(120.0f, this.LIZ) / C12ES.LIZJ(84.0f, this.LIZ)) * 100));
        valueAnimatorOfInt6.setDuration(250L);
        valueAnimatorOfInt6.addUpdateListener(new AUListenerS256S0100000_6(c424560Gko2, 77));
        this.LJIIZILJ.addListener(new AAListenerS342S0100000_32(this, 4));
        this.LJIIZILJ.playTogether(valueAnimatorOfInt4, valueAnimatorOfInt5, valueAnimatorOfInt6);
        this.LJIIZILJ.start();
    }

    public C21509219Fq(String str, CropActivity cropActivity, ViewGroup viewGroup, GradientDrawable gradientDrawable, EnumC19388010tC enumC19388010tC, C21509319Fr c21509319Fr) {
        String strLIZJ;
        this.LIZ = cropActivity;
        this.LIZIZ = viewGroup;
        this.LIZJ = c21509319Fr;
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(cropActivity), R.layout.eau, viewGroup, false);
        this.LIZLLL = viewTd;
        this.LJ = (FrameLayout) viewTd.findViewById(R.id.f4y);
        this.LJFF = (RemoteImageView) viewTd.findViewById(R.id.bi4);
        this.LJI = (TuxIconView) viewTd.findViewById(R.id.fl2);
        this.LJII = (ConstraintLayout) viewTd.findViewById(R.id.rib);
        this.LJIIIIZZ = (FrameLayout) viewTd.findViewById(R.id.rm4);
        this.LJIIIZ = (TuxTextView) viewTd.findViewById(R.id.ric);
        this.LJIIJ = (C0HZQ) viewTd.findViewById(R.id.rm3);
        this.LJIIJJI = (C424560Gko) viewTd.findViewById(R.id.tso);
        this.LJIIL = (TuxIconView) viewTd.findViewById(R.id.goi);
        this.LJIILIIL = (TuxTextView) viewTd.findViewById(R.id.fss);
        this.LJIILJJIL = (TuxTextView) viewTd.findViewById(R.id.bkr);
        TuxTextView tuxTextView = (TuxTextView) viewTd.findViewById(R.id.f5p);
        int i = C19388210tE.LIZ[enumC19388010tC.ordinal()];
        if (i != 1) {
            if (i == 2) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append((char) 10024);
                sbLIZ.append(C1216270hkv.LIZJ(2131845022));
                strLIZJ = C2188811AlT.LIZIZ(sbLIZ);
            } else {
                throw new C1954807lC();
            }
        } else {
            strLIZJ = C1216270hkv.LIZJ(2131820639);
        }
        tuxTextView.setText(strLIZJ);
        this.LJIILL = tuxTextView;
        TuxTextView tuxTextView2 = (TuxTextView) viewTd.findViewById(R.id.f4u);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append('@');
        sbLIZ2.append(((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().getCurUser().getNickname());
        tuxTextView2.setText(C2188811AlT.LIZIZ(sbLIZ2));
        this.LJIILLIIL = tuxTextView2;
        this.LJIIZILJ = new AnimatorSet();
    }
}
