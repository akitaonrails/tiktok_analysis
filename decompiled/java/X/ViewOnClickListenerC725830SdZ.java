package X;

import Y.ARunnableS9S0210000_6;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import avg.f;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.model.PhotoCarouselProductStruct;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS555S0100000_11;
import mf.a;

/* JADX INFO: renamed from: X.0SdZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class ViewOnClickListenerC725830SdZ extends ConstraintLayout implements View.OnClickListener {
    public C0SM7 LL;
    public InterfaceC719500SKe LLILLJJLI;
    public InterfaceC720380SNo LLILLL;
    public PhotoCarouselProductStruct LLILZ;
    public PhotoModeImageUrlModel LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public final C0SM0 LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;

    private final C0SMS getPhotoLoader() {
        return (C0SMS) this.LLJIJIL.getValue();
    }

    private final TuxTextView getTopLeftTag() {
        return (TuxTextView) this.LLJ.getValue();
    }

    private final SmartImageView getTopRightIcon() {
        return (SmartImageView) this.LLJI.getValue();
    }

    public final void h0() {
        C0SMS photoLoader = getPhotoLoader();
        if (photoLoader != null) {
            C0SM0 c0sm0 = this.LLIZLLLIL;
            int i = C0SMS.LJJIIZ;
            photoLoader.LJI(c0sm0, null);
        }
    }

    public final void reset() {
        C0SMS photoLoader = getPhotoLoader();
        if (photoLoader != null) {
            photoLoader.LJIIIIZZ();
        }
    }

    public final C0SM7 getFeedPhotoParams() {
        return this.LL;
    }

    public final InterfaceC719500SKe getImageLoadListener() {
        return this.LLILLJJLI;
    }

    public final InterfaceC720380SNo getTouchInterceptor() {
        return this.LLILLL;
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x0156  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r14) {
        /*
            Method dump skipped, instruction units count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnClickListenerC725830SdZ.onClick(android.view.View):void");
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Integer numValueOf;
        if (motionEvent != null && (numValueOf = Integer.valueOf(motionEvent.getAction())) != null) {
            if (numValueOf.intValue() == 0) {
                i0(this, this, 0.95f, 0L, true, 4);
            } else if (numValueOf.intValue() == 1 || numValueOf.intValue() == 3) {
                i0(this, this, 1.0f, 0L, false, 12);
            }
        }
        InterfaceC720380SNo interfaceC720380SNo = this.LLILLL;
        if (interfaceC720380SNo != null) {
            interfaceC720380SNo.onTouchEvent(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setFeedPhotoParams(C0SM7 c0sm7) {
        this.LL = c0sm7;
    }

    public final void setImageLoadListener(InterfaceC719500SKe interfaceC719500SKe) {
        this.LLILLJJLI = interfaceC719500SKe;
    }

    public final void setTouchInterceptor(InterfaceC720380SNo interfaceC720380SNo) {
        this.LLILLL = interfaceC720380SNo;
    }

    public ViewOnClickListenerC725830SdZ(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewOnClickListenerC725830SdZ(Context context, AttributeSet attributeSet, int i) {
        View.OnClickListener fVar;
        super(context, attributeSet, i);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.cz6, this, true);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zg, context);
        if (numLIZJ != null) {
            setBackgroundColor(numLIZJ.intValue());
        }
        if (C1848410yCV.LIZ) {
            fVar = new f(this);
        } else {
            fVar = this;
        }
        a aVar = new a(fVar);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(this);
        }
        setOnClickListener(aVar);
        C2271391DvN.LIZ(this, (C1A5L) C2271381DvM.k.getValue());
        View viewFindViewById = findViewById(R.id.tv_vsa_multi_product_top_left_tag);
        if (viewFindViewById != null) {
            C786410Ut5.I7(this, viewFindViewById);
            C2271391DvN.LIZ(viewFindViewById, (C1A5L) C2271381DvM.l.getValue());
        }
        View viewFindViewById2 = findViewById(R.id.lzn);
        if (viewFindViewById2 != null) {
            C786410Ut5.I7(this, viewFindViewById2);
            C2271391DvN.LIZ(viewFindViewById2, (C1A5L) C2271381DvM.m.getValue());
        }
        this.LLILZLL = -1;
        this.LLIZ = -1;
        this.LLIZLLLIL = C0SM0.NONE;
        this.LLJ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 820));
        this.LLJI = C452501pT.LIZIZ(new AwS550S0100000_6(this, 821));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 992));
    }

    public final InterfaceC469401sC e0(int i, int i2, PhotoModeImageUrlModel photoModeImageUrlModel, PhotoCarouselProductStruct photoCarouselProductStruct) {
        String productTag;
        UrlModel linkIcon;
        this.LLILZ = photoCarouselProductStruct;
        this.LLILZIL = photoModeImageUrlModel;
        this.LLILZLL = i;
        this.LLIZ = i2;
        if (photoCarouselProductStruct != null && (linkIcon = photoCarouselProductStruct.getLinkIcon()) != null) {
            C339190DRl.LIZLLL(getTopRightIcon());
            C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(linkIcon));
            c1331670kl3LJIIIIZZ.LJJ(getTopRightIcon());
            c1331670kl3LJIIIIZZ.LJIIJJI();
        } else {
            C339190DRl.LIZIZ(getTopRightIcon());
        }
        if (photoCarouselProductStruct != null && (productTag = photoCarouselProductStruct.getProductTag()) != null && C123100dR.LIZ(productTag)) {
            TuxTextView topLeftTag = getTopLeftTag();
            if (topLeftTag != null) {
                topLeftTag.setText(photoCarouselProductStruct.getProductTag());
            }
            C339190DRl.LIZLLL(getTopLeftTag());
        } else {
            C339190DRl.LIZIZ(getTopLeftTag());
        }
        C0SMS photoLoader = getPhotoLoader();
        VideoItemParams videoItemParamsD6 = null;
        if (photoLoader == null || photoModeImageUrlModel == null) {
            return null;
        }
        C0SM7 c0sm7 = this.LL;
        if (c0sm7 != null) {
            videoItemParamsD6 = c0sm7.d6();
        }
        Boolean bool = Boolean.TRUE;
        int i3 = C0SMS.LJJIIZ;
        return photoLoader.LJFF(i2, photoModeImageUrlModel, videoItemParamsD6, C0SM0.NONE, 0, bool);
    }

    public static void i0(ViewOnClickListenerC725830SdZ viewOnClickListenerC725830SdZ, View view, float f, long j, boolean z, int i) {
        if ((i & 4) != 0) {
            j = 0;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        viewOnClickListenerC725830SdZ.getClass();
        view.clearAnimation();
        view.animate().scaleX(f).scaleY(f).setDuration(50L).setStartDelay(j).setInterpolator(C1619980sG4.LJIIJJI()).withEndAction(new ARunnableS9S0210000_6(viewOnClickListenerC725830SdZ, view, z, 3)).start();
    }
}
