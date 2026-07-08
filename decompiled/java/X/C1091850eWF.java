package X;

import Y.ARunnableS50S0300000_17;
import android.content.Context;
import android.text.Spannable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.broadcast.preview.widget.revision.BannerImageLoadDefaultTypeSetting;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS561S0100000_17;
import webcast.data.ImagePadding;
import webcast.data.TopRightBannerContainerComponent;

/* JADX INFO: renamed from: X.0eWF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1091850eWF extends ConstraintLayout implements C0ULX {
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public final int LLIZ;
    public final int LLIZLLLIL;

    @Override // X.C0ULX
    public final void onDetach() {
    }

    @Override // X.C0ULX
    public final void onHide() {
    }

    @Override // X.C0ULX
    public final void onPause() {
    }

    @Override // X.C0ULX
    public final void onResume() {
    }

    @Override // X.C0ULX
    public final void onShow() {
    }

    private final ConstraintLayout getBannerIconContainer() {
        return (ConstraintLayout) this.LLILZ.getValue();
    }

    private final ImageView getCloseButton() {
        return (ImageView) this.LLILZIL.getValue();
    }

    private final TextView getSubtitleView() {
        return (TextView) this.LLILLJJLI.getValue();
    }

    private final TextView getTitleView() {
        return (TextView) this.LL.getValue();
    }

    public final ConstraintLayout getBannerContainer() {
        return (ConstraintLayout) this.LLILLL.getValue();
    }

    public final ImageView getMountainPointer() {
        return (ImageView) this.LLILZLL.getValue();
    }

    @Override // X.C0ULX
    public View getBannerView() {
        return getBannerContainer();
    }

    public final void h0(TopRightBannerContainerComponent topRightBannerContainerComponent) {
        ImageView.ScaleType scaleType;
        ImageView imageView = (ImageView) findViewById(R.id.bs5);
        if (topRightBannerContainerComponent.image != null) {
            C500260Jjc.LLFFF(imageView);
            C500260Jjc.LLFFF(getBannerIconContainer());
            ImagePadding imagePadding = topRightBannerContainerComponent.imagePadding;
            if (imagePadding != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                marginLayoutParams.setMarginStart(Math.max(C439101nJ.LIZ(imagePadding.left), 0));
                marginLayoutParams.topMargin = Math.max(C439101nJ.LIZ(imagePadding.top), 0);
                marginLayoutParams.setMarginEnd(Math.max(C439101nJ.LIZ(imagePadding.right), 0));
                marginLayoutParams.bottomMargin = Math.max(C439101nJ.LIZ(imagePadding.bottom), 0);
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(imageView);
                imageView.setLayoutParams(marginLayoutParams);
            }
            C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ(topRightBannerContainerComponent.image);
            if (BannerImageLoadDefaultTypeSetting.INSTANCE.enable()) {
                scaleType = ImageView.ScaleType.FIT_CENTER;
            } else {
                scaleType = ImageView.ScaleType.CENTER_CROP;
            }
            c1324610kZfLJIIIZ.LJIJJ = e0(topRightBannerContainerComponent, scaleType);
            c1324610kZfLJIIIZ.LJJ = Boolean.FALSE;
            c1324610kZfLJIIIZ.LJJI(imageView);
            if (C497740JfY.LJJ()) {
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(imageView);
                imageView.setScaleX(-1.0f);
            }
        } else {
            C500260Jjc.LJIILIIL(getBannerIconContainer());
        }
        Integer numValueOf = Integer.valueOf(topRightBannerContainerComponent.type);
        if (numValueOf != null) {
            if (numValueOf.intValue() == 19 || numValueOf.intValue() == 20 || numValueOf.intValue() == 21 || numValueOf.intValue() == 30 || numValueOf.intValue() == 31) {
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                C786410Ut5.Qb(imageView, 1.0f);
            }
        }
    }

    @Override // X.C0ULX
    public void setOnCloseClickListener(View.OnClickListener onClickListener) {
        View viewFindViewById = findViewById(R.id.br9);
        if (viewFindViewById != null) {
            C786410Ut5.I7(onClickListener, viewFindViewById);
        }
    }

    public static final ImageView.ScaleType e0(TopRightBannerContainerComponent topRightBannerContainerComponent, ImageView.ScaleType scaleType) {
        switch (topRightBannerContainerComponent.imageModeScaleAndroid) {
            case 0:
                return ImageView.ScaleType.CENTER_CROP;
            case 1:
                return ImageView.ScaleType.MATRIX;
            case 2:
                return ImageView.ScaleType.FIT_XY;
            case 3:
                return ImageView.ScaleType.FIT_START;
            case 4:
                return ImageView.ScaleType.FIT_CENTER;
            case 5:
                return ImageView.ScaleType.FIT_END;
            case 6:
                return ImageView.ScaleType.CENTER;
            case 7:
                return ImageView.ScaleType.CENTER_INSIDE;
            default:
                return scaleType;
        }
    }

    @Override // X.C0ULX
    public final void LJZI(View view, Function0<Unit> function0) {
        if (view == null) {
            C500260Jjc.LJLJL(C439101nJ.LIZ(8), getBannerContainer());
        } else {
            HandlerHook.viewPostDelay(view, new ARunnableS50S0300000_17(this, view, function0, 8), 500L);
        }
    }

    @Override // X.C0ULX
    public final boolean LLZLLLL(int i, Object obj) {
        TopRightBannerContainerComponent topRightBannerContainerComponent;
        if (i != 30 && i != 31) {
            return false;
        }
        String str = null;
        if ((obj instanceof TopRightBannerContainerComponent) && (topRightBannerContainerComponent = (TopRightBannerContainerComponent) obj) != null) {
            TextView titleView = getTitleView();
            Text text = topRightBannerContainerComponent.titleText;
            if (text != null) {
                str = text.defaultPattern;
            }
            titleView.setText(C1133830fbx.LJIILIIL(text, str));
            h0(topRightBannerContainerComponent);
            return true;
        }
        return true;
    }

    public C1091850eWF(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = C452501pT.LIZIZ(new AwS561S0100000_17(this, 312));
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS561S0100000_17(this, 311));
        this.LLILLL = C452501pT.LIZIZ(new AwS561S0100000_17(this, 307));
        this.LLILZ = C452501pT.LIZIZ(new AwS561S0100000_17(this, 308));
        this.LLILZIL = C452501pT.LIZIZ(new AwS561S0100000_17(this, 309));
        this.LLILZLL = C452501pT.LIZIZ(new AwS561S0100000_17(this, 310));
        this.LLIZ = C439101nJ.LIZ(20);
        this.LLIZLLLIL = C439101nJ.LIZ(12);
        C500260Jjc.LJIILL(R.layout.hh0, this, true);
    }

    @Override // X.C0ULX
    public final boolean c0(DataChannel dataChannel, LifecycleOwner lifecycleOwner, TopRightBannerContainerComponent topRightBannerContainerComponent) {
        String str;
        String str2;
        float f;
        int i = 0;
        if (topRightBannerContainerComponent.titleText == null && topRightBannerContainerComponent.subtitleText == null) {
            return false;
        }
        Text text = topRightBannerContainerComponent.titleText;
        if (text != null) {
            str = text.defaultPattern;
        } else {
            str = null;
        }
        Spannable spannableLJIILIIL = C1133830fbx.LJIILIIL(text, str);
        Text text2 = topRightBannerContainerComponent.subtitleText;
        if (text2 != null) {
            str2 = text2.defaultPattern;
        } else {
            str2 = null;
        }
        Spannable spannableLJIILIIL2 = C1133830fbx.LJIILIIL(text2, str2);
        if (spannableLJIILIIL.length() == 0 && spannableLJIILIIL2.length() == 0) {
            return false;
        }
        if (spannableLJIILIIL2.length() > 0) {
            getSubtitleView().setText(spannableLJIILIIL2);
            getTitleView().setMaxLines(1);
        } else {
            C500260Jjc.LJIILIIL(getSubtitleView());
            getTitleView().setMaxLines(2);
        }
        if (spannableLJIILIIL.length() > 0) {
            getTitleView().setText(spannableLJIILIIL);
        } else {
            C500260Jjc.LJIILIIL(getTitleView());
        }
        h0(topRightBannerContainerComponent);
        ImageView imageView = (ImageView) findViewById(R.id.br8);
        if (topRightBannerContainerComponent.backgroundImage != null) {
            getBannerContainer().setBackground(null);
            if (imageView != null) {
                C500260Jjc.LLFFF(imageView);
            }
            C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ(topRightBannerContainerComponent.backgroundImage);
            c1324610kZfLJIIIZ.LJIJJ = e0(topRightBannerContainerComponent, ImageView.ScaleType.FIT_XY);
            c1324610kZfLJIIIZ.LJJ = Boolean.FALSE;
            c1324610kZfLJIIIZ.LJJI(imageView);
            if (C497740JfY.LJJ()) {
                C786410Ut5.Qb(imageView, -1.0f);
            }
        } else if (imageView != null) {
            C500260Jjc.LJIILIIL(imageView);
        }
        if (topRightBannerContainerComponent.type == 13 && (!topRightBannerContainerComponent.extra.isEmpty())) {
            String str3 = topRightBannerContainerComponent.extra.get("image_text");
            TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.kf1);
            if (tuxTextView != null) {
                tuxTextView.setText(str3);
                if (C497740JfY.LJJ()) {
                    f = -18.0f;
                } else {
                    f = 18.0f;
                }
                C786410Ut5.Gb(tuxTextView, f);
                C500260Jjc.LLFFF(tuxTextView);
            }
        }
        ImageView closeButton = getCloseButton();
        if (!topRightBannerContainerComponent.hasCloseButton) {
            i = 8;
        }
        C786410Ut5.LJZI(i, closeButton);
        return true;
    }
}
