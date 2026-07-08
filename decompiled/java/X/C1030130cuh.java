package X;

import Y.ARunnableS10S0500000_16;
import Y.ARunnableS75S0200000_6;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.AdAnchorsExtras;
import com.ss.android.ugc.aweme.feed.model.AdIcon;
import com.ss.android.ugc.aweme.feed.model.AdPrefix;
import com.ss.android.ugc.aweme.feed.model.SecondLine;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS132S1200000_16;
import kotlin.jvm.internal.AwS145S0400000_16;
import kotlin.jvm.internal.AwS260S0300000_16;
import kotlin.jvm.internal.AwS382S0200000_16;

/* JADX INFO: renamed from: X.0cuh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1030130cuh extends FrameLayout implements InterfaceC1028010crH {
    public ConstraintLayout LL;
    public TuxTextView LLILLJJLI;
    public SmartImageView LLILLL;
    public TuxTextView LLILZ;
    public TuxTextView LLILZIL;
    public C426160GnO LLILZLL;
    public TuxTextView LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public Function0<Unit> LLJI;

    @Override // X.InterfaceC1028010crH
    public final void LIZ() {
        this.LLJ = false;
        this.LLIZLLLIL = false;
        C337180DJs.LIZ(getAnchorSecondLineContainer());
        C337180DJs.LIZ(getAnchorSecondLine());
    }

    @Override // X.InterfaceC1028010crH
    public final void LIZJ() {
        float f = C715390S4j.LIZ;
        C715390S4j.LIZ(getAnchorTagRootFromXml());
    }

    public final SmartImageView getAnchorImgFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.b00);
            this.LLILLL = (SmartImageView) callbackFindViewById;
        }
        return (SmartImageView) callbackFindViewById;
    }

    public final TuxTextView getAnchorPreTitleFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.b1f);
            this.LLILZ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getAnchorSecondLine() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.b2f);
            this.LLIZ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final C426160GnO getAnchorSecondLineContainer() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.b1i);
            this.LLILZLL = (C426160GnO) callbackFindViewById;
        }
        return (C426160GnO) callbackFindViewById;
    }

    public final ConstraintLayout getAnchorTagRootFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.b2j);
            this.LL = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    public final TuxTextView getAnchorTitleDiv2FromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.b33);
            this.LLILZIL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getAnchorTitleFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.b31);
            this.LLILLJJLI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    @Override // X.InterfaceC1028010crH
    public final boolean LJ() {
        return this.LLIZLLLIL;
    }

    public C1030130cuh(Context context) {
        super(context, null);
        FrameLayout.inflate(context, R.layout.dup, this);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 80;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
        float f = C715390S4j.LIZ;
        C715390S4j.LIZJ(4, getAnchorTagRootFromXml());
    }

    @Override // X.InterfaceC1028010crH
    public final void LIZIZ(ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        if (viewGroup.indexOfChild(this) == -1) {
            ViewParent parent = getParent();
            if ((parent instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent) != null) {
                C786410Ut5.LJJJLZIJ(this, viewGroup2);
            }
            viewGroup.addView(this);
        }
    }

    @Override // X.InterfaceC1028010crH
    public void setAnchorImg(UrlModel urlModel) {
        if (urlModel != null) {
            C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(urlModel));
            c1331670kl3LJIIIIZZ.LJJ(getAnchorImgFromXml());
            C786410Ut5.h3(c1331670kl3LJIIIIZZ);
        } else {
            SmartImageView anchorImgFromXml = getAnchorImgFromXml();
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_anchor_product;
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            anchorImgFromXml.setImageDrawable(c419910GdJ.LIZ(getAnchorImgFromXml().getContext()));
        }
    }

    public final void setAnchorImgFromXml(SmartImageView smartImageView) {
        this.LLILLL = smartImageView;
    }

    public final void setAnchorPreTitleFromXml(TuxTextView tuxTextView) {
        this.LLILZ = tuxTextView;
    }

    public final void setAnchorSecondLine(TuxTextView tuxTextView) {
        this.LLIZ = tuxTextView;
    }

    public final void setAnchorSecondLineContainer(C426160GnO c426160GnO) {
        this.LLILZLL = c426160GnO;
    }

    public final void setAnchorTagRootFromXml(ConstraintLayout constraintLayout) {
        this.LL = constraintLayout;
    }

    public final void setAnchorTitleDiv2FromXml(TuxTextView tuxTextView) {
        this.LLILZIL = tuxTextView;
    }

    public final void setAnchorTitleFromXml(TuxTextView tuxTextView) {
        this.LLILLJJLI = tuxTextView;
    }

    public final void setPrefixTitle(CharSequence charSequence) {
        if (charSequence != null && charSequence.length() != 0) {
            getAnchorPreTitleFromXml().setText(charSequence);
            C337180DJs.LIZJ(getAnchorPreTitleFromXml());
            C337180DJs.LIZJ(getAnchorTitleDiv2FromXml());
        } else {
            C337180DJs.LIZ(getAnchorPreTitleFromXml());
            C337180DJs.LIZ(getAnchorTitleDiv2FromXml());
        }
    }

    public final void setSecondLineHeight(int i) {
        TuxTextView anchorSecondLine = getAnchorSecondLine();
        if (anchorSecondLine == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = anchorSecondLine.getLayoutParams();
        layoutParams.height = i;
        C786410Ut5.R6(anchorSecondLine, layoutParams);
    }

    public final void setSecondLineText(AdAnchorsExtras adAnchorsExtras) {
        C426160GnO anchorSecondLineContainer;
        SecondLine secondLine;
        TuxTextView anchorSecondLine = getAnchorSecondLine();
        if (anchorSecondLine == null || (anchorSecondLineContainer = getAnchorSecondLineContainer()) == null) {
            return;
        }
        if (adAnchorsExtras != null && (secondLine = adAnchorsExtras.secondLine) != null) {
            anchorSecondLine.setText(secondLine.content);
            if (this.LLJ) {
                return;
            }
            ViewTreeObserverOnPreDrawListenerC337150DJp.LIZ(anchorSecondLineContainer, new ARunnableS10S0500000_16(this, anchorSecondLineContainer, anchorSecondLine, secondLine, anchorSecondLineContainer, 0));
            this.LLJ = true;
            return;
        }
        C337180DJs.LIZ(anchorSecondLineContainer);
        C337180DJs.LIZ(anchorSecondLine);
    }

    @Override // X.InterfaceC1028010crH
    public void setShowSecondLineListener(Function0<Unit> function0) {
        this.LLJI = function0;
    }

    @Override // X.InterfaceC1028010crH
    public final void LIZLLL(String str, AdAnchorsExtras adAnchorsExtras) {
        AdPrefix adPrefix;
        AwS132S1200000_16 awS132S1200000_16 = new AwS132S1200000_16(this, str, adAnchorsExtras, 1);
        ConstraintLayout anchorTagRootFromXml = getAnchorTagRootFromXml();
        if (adAnchorsExtras != null && (adPrefix = adAnchorsExtras.prefix) != null && anchorTagRootFromXml != null) {
            Integer num = adPrefix.prefixStyle;
            if (num != null) {
                if (num.intValue() == 1) {
                    setPrefixTitle(adPrefix.prefixTag);
                    awS132S1200000_16.invoke();
                    return;
                } else if (num.intValue() == 2) {
                    LJI(adPrefix.primaryPrefixImageUrls, anchorTagRootFromXml, new AwS382S0200000_16(this, awS132S1200000_16, 8), new AwS145S0400000_16(this, adPrefix, anchorTagRootFromXml, awS132S1200000_16, 0));
                    return;
                } else if (num.intValue() == 3) {
                    LJI(adPrefix.secondaryPrefixImageUrls, anchorTagRootFromXml, new AwS382S0200000_16(this, awS132S1200000_16, 9), new AwS260S0300000_16(this, adPrefix, awS132S1200000_16, 1));
                    return;
                }
            }
            C337180DJs.LIZ(getAnchorPreTitleFromXml());
            C337180DJs.LIZ(getAnchorTitleDiv2FromXml());
            awS132S1200000_16.invoke();
            return;
        }
        C337180DJs.LIZ(getAnchorPreTitleFromXml());
        C337180DJs.LIZ(getAnchorTitleDiv2FromXml());
        awS132S1200000_16.invoke();
    }

    @Override // X.InterfaceC1028010crH
    public final void LJFF(AdAnchorsExtras adAnchorsExtras, UrlModel urlModel) {
        AdIcon adIcon;
        String str;
        if (adAnchorsExtras != null && (adIcon = adAnchorsExtras.icon) != null) {
            UrlModel urlModel2 = new UrlModel();
            List<String> list = adIcon.iconUrls;
            if (list == null || (str = (String) C13LP.LJJJLZIJ(0, list)) == null) {
                str = "";
            }
            urlModel2.setUri(str);
            urlModel2.setUrlList(adIcon.iconUrls);
            Integer num = adIcon.iconType;
            if (num != null && num.intValue() == 1) {
                setAnchorImg(urlModel2);
                return;
            }
            return;
        }
        setAnchorImg(urlModel);
    }

    public static void LJI(List list, final ConstraintLayout constraintLayout, final Function1 function1, final Function0 function0) {
        final SpannableString spannableString = new SpannableString(" ");
        C1331660kl2.LJIIJ(new C03IT(list)).LJJII(new AbstractC468201s0() { // from class: X.0GcR
            @Override // X.InterfaceC1331910klR
            public final void LIZ(Bitmap bitmap) {
                if (bitmap != null) {
                    View view = constraintLayout;
                    SpannableString spannableString2 = spannableString;
                    Function1<SpannableString, Unit> function12 = function1;
                    int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(view.getContext().getResources(), bitmap);
                    bitmapDrawable.setBounds(0, 0, (int) ((bitmap.getWidth() * iLIZIZ) / bitmap.getHeight()), iLIZIZ);
                    C786410Ut5.p2(spannableString2, new ImageSpan(bitmapDrawable, 2), 0, 1, 33);
                    HandlerHook.viewPost(view, new ARunnableS75S0200000_6(function12, spannableString2, 15));
                }
            }

            @Override // X.InterfaceC1331910klR
            public final void onFailed(Throwable th) {
                Function0<Unit> function02 = function0;
                if (function02 != null) {
                    function02.invoke();
                }
            }
        });
    }
}
