package X;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BannerComponent;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionWaist;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ReminderButton;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vxz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1762530vxz extends FrameLayout {
    public FrameLayout LL;
    public FrameLayout LLILLJJLI;
    public View LLILLL;
    public ConstraintLayout LLILZ;
    public SmartImageView LLILZIL;
    public View LLILZLL;
    public PromotionWaist LLIZ;

    public final SmartImageView getBackgroundImageFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.bo6);
            this.LLILZIL = (SmartImageView) callbackFindViewById;
        }
        return (SmartImageView) callbackFindViewById;
    }

    public final View getBackgroundMaskFromXml() {
        View view = this.LLILLL;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.boi);
        this.LLILLL = viewFindViewById;
        return viewFindViewById;
    }

    public final View getDivideLineFromXml() {
        View view = this.LLILZLL;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.fyx);
        this.LLILZLL = viewFindViewById;
        return viewFindViewById;
    }

    public final FrameLayout getHeadComponentContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.jhp);
            this.LL = (FrameLayout) callbackFindViewById;
        }
        return (FrameLayout) callbackFindViewById;
    }

    public final FrameLayout getTailComponentContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.x2u);
            this.LLILLJJLI = (FrameLayout) callbackFindViewById;
        }
        return (FrameLayout) callbackFindViewById;
    }

    public final ConstraintLayout getWaistContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.waist_container);
            this.LLILZ = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    public C1762530vxz(Context context) {
        super(context, null, 0);
        C954703oH.LIZ(context, R.layout.au8, this, true);
    }

    public final void setBackgroundImageFromXml(SmartImageView smartImageView) {
        this.LLILZIL = smartImageView;
    }

    public final void setBackgroundMaskFromXml(View view) {
        this.LLILLL = view;
    }

    public final void setDivideLineFromXml(View view) {
        this.LLILZLL = view;
    }

    public final void setHeadComponentContainerFromXml(FrameLayout frameLayout) {
        this.LL = frameLayout;
    }

    public final void setTailComponentContainerFromXml(FrameLayout frameLayout) {
        this.LLILLJJLI = frameLayout;
    }

    public final void setWaistContainerFromXml(ConstraintLayout constraintLayout) {
        this.LLILZ = constraintLayout;
    }

    public static boolean LIZ(BannerComponent bannerComponent, BannerComponent bannerComponent2) {
        if (bannerComponent != null && bannerComponent2 != null && Intrinsics.LJFF(BannerComponent.LIZ(bannerComponent), BannerComponent.LIZ(bannerComponent2))) {
            C7902036u c7902036u = ReminderButton.Companion;
            ReminderButton reminderButton = bannerComponent.reminderButton;
            ReminderButton reminderButton2 = bannerComponent2.reminderButton;
            c7902036u.getClass();
            if (!C7902036u.LIZ(reminderButton, reminderButton2)) {
                return false;
            }
            return true;
        }
        return true;
    }
}
