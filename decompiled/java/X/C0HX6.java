package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.utils.UserVerify;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0HX6, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public class C0HX6 extends FrameLayout {
    public SmartAvatarImageView LL;
    public ImageView LLILLJJLI;
    public UserVerify LLILLL;
    public final int LLILZ;
    public final int LLILZIL;
    public int[] LLILZLL;

    public final void LIZ() {
        C786410Ut5.LJZI(8, this.LLILLJJLI);
    }

    public FrameLayout.LayoutParams getAvatarLayoutParams() {
        return new FrameLayout.LayoutParams(-1, -1);
    }

    public int getVerifyIconMarginEnd() {
        return -this.LLILZIL;
    }

    public final void LIZJ() {
        setPlaceHolder(R.color.al);
        int iLIZ = C960203pA.LIZ(R.attr.ng, getContext());
        float fLIZJ = C12ES.LIZJ(0.5f, getContext());
        if (this.LL.getHierarchy().LIZJ != null) {
            this.LL.getHierarchy().LIZJ.LJFF = iLIZ;
            this.LL.getHierarchy().LIZJ.LJFF(fLIZJ);
        }
        setFailureImage(R.raw.icon_color_default_avatar);
    }

    public SmartAvatarImageView getAvatarImageView() {
        return this.LL;
    }

    public int getVerifyIconSize() {
        return this.LLILZ;
    }

    private void setFailureImage(int i) {
        this.LL.getHierarchy().LJIJJ(i, InterfaceC1320380kSq.LJI);
    }

    public void LIZIZ(C1331670kl3 c1331670kl3) {
        c1331670kl3.LIZLLL("Avatar");
    }

    public void setPlaceHolder(int i) {
        this.LL.getHierarchy().LJJI(i, InterfaceC1320380kSq.LJI);
    }

    public void setPlaceHolderImage(Drawable drawable) {
        this.LL.setPlaceholderImage(drawable);
    }

    public void setRequestImgSize(int[] iArr) {
        this.LLILZLL = iArr;
    }

    public void setUserData(UserVerify userVerify) {
        UserVerify userVerify2 = this.LLILLL;
        if (userVerify2 != null && userVerify != null && userVerify2.getAvatarThumb() == userVerify.getAvatarThumb()) {
            return;
        }
        int i = 0;
        setClipChildren(false);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
        this.LLILLL = userVerify;
        if (userVerify == null) {
            this.LL.setController(null);
            C786410Ut5.LJZI(8, this.LLILLJJLI);
        } else {
            C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(userVerify.getAvatarThumb()));
            int[] iArr = this.LLILZLL;
            if (iArr != null) {
                c1331670kl3LJIIIIZZ.LJJIJ(iArr);
            }
            LIZIZ(c1331670kl3LJIIIIZZ);
            c1331670kl3LJIIIIZZ.LJJ(this.LL);
            C786410Ut5.h3(c1331670kl3LJIIIIZZ);
            boolean z = true;
            if ((userVerify.getVerificationType() == null || (userVerify.getVerificationType().intValue() != 2 && userVerify.getVerificationType().intValue() != 3)) && TextUtils.isEmpty(userVerify.getEnterpriseVerifyReason()) && TextUtils.isEmpty(userVerify.getCustomVerify())) {
                z = false;
            }
            ImageView imageView = this.LLILLJJLI;
            if (!z) {
                i = 8;
            }
            C786410Ut5.LJZI(i, imageView);
        }
        LIZJ();
    }

    public C0HX6(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0HX6(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C844470XAv.LIZ.getClass();
        this.LLILZ = (int) C844470XAv.LIZ().getResources().getDimension(R.dimen.p_);
        this.LLILZIL = (int) C12ES.LIZJ(2.0f, C844470XAv.LIZ());
        SmartAvatarImageView smartAvatarImageView = new SmartAvatarImageView(getContext());
        this.LL = smartAvatarImageView;
        smartAvatarImageView.getHierarchy().LJJI(R.color.al, InterfaceC1320380kSq.LJI);
        addView(this.LL, getAvatarLayoutParams());
        int verifyIconSize = getVerifyIconSize();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(verifyIconSize, verifyIconSize);
        layoutParams.gravity = 8388693;
        layoutParams.setMarginEnd(getVerifyIconMarginEnd());
        ImageView imageView = new ImageView(getContext());
        this.LLILLJJLI = imageView;
        try {
            imageView.setImageDrawable(getResources().getDrawable(R.drawable.cb9));
        } catch (Resources.NotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C786410Ut5.LJZI(8, this.LLILLJJLI);
        addView(this.LLILLJJLI, layoutParams);
    }
}
