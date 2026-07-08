package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo;
import com.ss.android.ugc.aweme.ecommerce.dependency.live.LiveDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.live.ILiveDependencyService;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS244S0000000_12;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vgP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1751630vgP extends ConstraintLayout {
    public static final /* synthetic */ int LLJIJIL = 0;
    public SmartImageView LL;
    public SmartImageView LLILLJJLI;
    public TuxTextView LLILLL;
    public TuxTextView LLILZ;
    public LinearLayout LLILZIL;
    public C1751800vgg LLILZLL;
    public View LLIZ;
    public InterfaceC1751670vgT LLIZLLLIL;
    public ValueAnimator LLJ;
    public final C01GW LLJI;

    private final ValueAnimator.AnimatorUpdateListener getLiveAnimUpdateListener() {
        return (ValueAnimator.AnimatorUpdateListener) this.LLJI.getValue();
    }

    public final SmartImageView getAvatarFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.bh2);
            this.LL = (SmartImageView) callbackFindViewById;
        }
        return (SmartImageView) callbackFindViewById;
    }

    public final C1751800vgg getFollowFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.jkf);
            this.LLILZLL = (C1751800vgg) callbackFindViewById;
        }
        return (C1751800vgg) callbackFindViewById;
    }

    public final LinearLayout getHeaderInfoContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.v72);
            this.LLILZIL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final TuxTextView getHeaderShopInfoTextFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.jkg);
            this.LLILZ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final SmartImageView getOfficialLabelFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.pim);
            this.LLILLJJLI = (SmartImageView) callbackFindViewById;
        }
        return (SmartImageView) callbackFindViewById;
    }

    public final TuxTextView getTvNameFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.zym);
            this.LLILLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final void h0() {
        ValueAnimator valueAnimator;
        View view = this.LLIZ;
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
        if (this.LLJ == null) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setDuration(2000L);
            valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            valueAnimatorOfFloat.setRepeatCount(-1);
            valueAnimatorOfFloat.setRepeatMode(1);
            valueAnimatorOfFloat.addUpdateListener(getLiveAnimUpdateListener());
            this.LLJ = valueAnimatorOfFloat;
        }
        ValueAnimator valueAnimator2 = this.LLJ;
        if (valueAnimator2 == null || valueAnimator2.isRunning() || (valueAnimator = this.LLJ) == null) {
            return;
        }
        valueAnimator.start();
    }

    public final InterfaceC1751670vgT getShopInfoListener() {
        return this.LLIZLLLIL;
    }

    public final void e0(SellerInfo sellerInfo) {
        AnonymousClass0317 anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin;
        boolean z;
        String name;
        Image image = sellerInfo.avatar;
        if (image != null) {
            C1326790kdB c1326790kdB = C1326790kdB.LIZ;
            C03IT thumbFirstImageUrlModel = image.toThumbFirstImageUrlModel();
            c1326790kdB.getClass();
            C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(thumbFirstImageUrlModel);
            C1331750klB c1331750klB = new C1331750klB();
            int iLIZ = C960203pA.LIZ(R.attr.ng, getContext());
            float fLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1));
            c1331750klB.LIZJ = iLIZ;
            c1331750klB.LIZIZ = fLIZIZ;
            c1331750klB.LJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            c1331670kl3LIZLLL.LJJI = new C1331730kl9(c1331750klB);
            c1331670kl3LIZLLL.LJJIIZ(R.drawable.b74);
            c1331670kl3LIZLLL.LJJ(getAvatarFromXml());
            C786410Ut5.h3(c1331670kl3LIZLLL);
        }
        C786410Ut5.LJLLLLLL(0, getAvatarFromXml());
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin = LiveDependencyService.createILiveDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin != null) {
                z = true;
            } else {
                z = false;
            }
            String name2 = ILiveDependencyService.class.getName();
            if (anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILiveDependencyService.class);
        }
        View viewCreateLiveCircleView = ((ILiveDependencyService) anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin).createLiveCircleView(getContext(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(1.5f))));
        if (viewCreateLiveCircleView != null) {
            this.LLIZ = viewCreateLiveCircleView;
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(0.75f)));
            viewCreateLiveCircleView.setPadding(iLIZIZ, iLIZIZ, iLIZIZ, iLIZIZ);
            View view = this.LLIZ;
            if (view != null) {
                C786410Ut5.W5(view, new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(34)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(34))));
            }
            addView(this.LLIZ);
            View view2 = this.LLIZ;
            if (view2 != null) {
                C1744700vVE.LJIILJJIL(view2, new AwS244S0000000_12(4));
                C786410Ut5.LJLLLLLL(8, view2);
            }
        }
    }

    public final void setAvatarFromXml(SmartImageView smartImageView) {
        this.LL = smartImageView;
    }

    public final void setFollowFromXml(C1751800vgg c1751800vgg) {
        this.LLILZLL = c1751800vgg;
    }

    public final void setHeaderInfoContainerFromXml(LinearLayout linearLayout) {
        this.LLILZIL = linearLayout;
    }

    public final void setHeaderShopInfoTextFromXml(TuxTextView tuxTextView) {
        this.LLILZ = tuxTextView;
    }

    public final void setHeaderShopViewListener(InterfaceC1751670vgT interfaceC1751670vgT) {
        this.LLIZLLLIL = interfaceC1751670vgT;
    }

    public final void setOfficialLabelFromXml(SmartImageView smartImageView) {
        this.LLILLJJLI = smartImageView;
    }

    public final void setShopInfoListener(InterfaceC1751670vgT interfaceC1751670vgT) {
        this.LLIZLLLIL = interfaceC1751670vgT;
    }

    public final void setTvNameFromXml(TuxTextView tuxTextView) {
        this.LLILLL = tuxTextView;
    }

    public final void i0(boolean z, Boolean bool) {
        InterfaceC1751670vgT interfaceC1751670vgT;
        int i;
        C1751800vgg followFromXml = getFollowFromXml();
        int i2 = 0;
        if (followFromXml != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, followFromXml);
        }
        LinearLayout headerInfoContainerFromXml = getHeaderInfoContainerFromXml();
        if (headerInfoContainerFromXml != null) {
            if (!(!z)) {
                i2 = 8;
            }
            C786410Ut5.LJLLLLLL(i2, headerInfoContainerFromXml);
        }
        if (Intrinsics.LJFF(bool, Boolean.TRUE) && (interfaceC1751670vgT = this.LLIZLLLIL) != null) {
            interfaceC1751670vgT.LIZIZ();
        }
    }

    public C1751630vgP(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLJI = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1311));
        C954703oH.LIZ(context, R.layout.an5, this, true);
    }
}
