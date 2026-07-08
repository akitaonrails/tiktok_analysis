package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Gqc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C428160Gqc extends FrameLayout {
    public LinearLayout LL;
    public LinearLayout LLILLJJLI;
    public SmartAvatarImageView LLILLL;
    public SmartAvatarImageView LLILZ;
    public SmartAvatarImageView LLILZIL;
    public TuxTextView LLILZLL;
    public final int LLIZ;
    public final int LLIZLLLIL;
    public final int LLJ;

    public final SmartAvatarImageView getIvAvatarEndFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.l9j);
            this.LLILZIL = (SmartAvatarImageView) callbackFindViewById;
        }
        return (SmartAvatarImageView) callbackFindViewById;
    }

    public final SmartAvatarImageView getIvAvatarMiddleFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.l9k);
            this.LLILZ = (SmartAvatarImageView) callbackFindViewById;
        }
        return (SmartAvatarImageView) callbackFindViewById;
    }

    public final SmartAvatarImageView getIvAvatarStartFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.l9l);
            this.LLILLL = (SmartAvatarImageView) callbackFindViewById;
        }
        return (SmartAvatarImageView) callbackFindViewById;
    }

    public final LinearLayout getLlAvatarContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.nau);
            this.LLILLJJLI = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final LinearLayout getPvEntranceCapsuleContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.sjf);
            this.LL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final TuxTextView getTvCapsuleFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.zc2);
            this.LLILZLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final View getCapsuleInnerView() {
        return getPvEntranceCapsuleContainerFromXml();
    }

    public final void setIvAvatarEndFromXml(SmartAvatarImageView smartAvatarImageView) {
        this.LLILZIL = smartAvatarImageView;
    }

    public final void setIvAvatarMiddleFromXml(SmartAvatarImageView smartAvatarImageView) {
        this.LLILZ = smartAvatarImageView;
    }

    public final void setIvAvatarStartFromXml(SmartAvatarImageView smartAvatarImageView) {
        this.LLILLL = smartAvatarImageView;
    }

    public final void setLlAvatarContainerFromXml(LinearLayout linearLayout) {
        this.LLILLJJLI = linearLayout;
    }

    public final void setPvEntranceCapsuleContainerFromXml(LinearLayout linearLayout) {
        this.LL = linearLayout;
    }

    public final void setTvCapsuleFromXml(TuxTextView tuxTextView) {
        this.LLILZLL = tuxTextView;
    }

    public C428160Gqc(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        this.LLIZLLLIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5));
        this.LLJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
        FrameLayout.inflate(context, R.layout.ejo, this);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.bw);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(46));
        setBackground(c384050F3z.LIZ(context));
    }

    public final void LIZ(SmartAvatarImageView smartAvatarImageView, UrlModel urlModel) {
        if (urlModel != null) {
            C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(urlModel));
            c1331670kl3LJIIIIZZ.LJJIJ(C422830Gi1.LIZ(100));
            int i = this.LLIZ;
            c1331670kl3LJIIIIZZ.LJIIIIZZ = i;
            c1331670kl3LJIIIIZZ.LJIIIZ = i;
            c1331670kl3LJIIIIZZ.LJJIJLIJ = true;
            c1331670kl3LJIIIIZZ.LJJ(smartAvatarImageView);
            C786410Ut5.h3(c1331670kl3LJIIIIZZ);
            C786410Ut5.o(smartAvatarImageView, 0);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("bind");
            sbLIZ.append(urlModel.getUri());
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }
}
