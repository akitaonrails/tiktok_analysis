package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0vjG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1753400vjG extends ConstraintLayout implements LifecycleEventObserver {
    public static final float LLILZLL;
    public static final float LLIZ;
    public static final float LLIZLLLIL = C0H9H.LIZ(0);
    public C1753460vjM LL;
    public CardView LLILLJJLI;
    public C7938038e LLILLL;
    public CardView LLILZ;
    public InterfaceC1753440vjK LLILZIL;

    static {
        float f = 20;
        LLILZLL = C0H9H.LIZ(f);
        LLIZ = C0H9H.LIZ(f);
    }

    public final CardView getCdShareIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.dkv);
            this.LLILLJJLI = (CardView) callbackFindViewById;
        }
        return (CardView) callbackFindViewById;
    }

    public final C1753460vjM getCevShareIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.dmp);
            this.LL = (C1753460vjM) callbackFindViewById;
        }
        return (C1753460vjM) callbackFindViewById;
    }

    public final CardView getShareTagContainer() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.v1o);
            this.LLILZ = (CardView) callbackFindViewById;
        }
        return (CardView) callbackFindViewById;
    }

    public final C7938038e getShareTagView() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.v1p);
            this.LLILLL = (C7938038e) callbackFindViewById;
        }
        return (C7938038e) callbackFindViewById;
    }

    public final View getShareIconView() {
        return getCevShareIconFromXml();
    }

    public final C7938038e getTagView() {
        return getShareTagView();
    }

    public final CardView getTagViewContainer() {
        return getShareTagContainer();
    }

    public final InterfaceC1753440vjK getOnClickListener() {
        return this.LLILZIL;
    }

    public final void setBackgroundColorRes(int i) {
        getCevShareIconFromXml().setBackgroundColorRes(i);
    }

    public final void setCartIconBackgroundAlpha(int i) {
        getCevShareIconFromXml().setBackgroundAlpha(i);
    }

    public final void setCdShareIconFromXml(CardView cardView) {
        this.LLILLJJLI = cardView;
    }

    public final void setCevShareIconFromXml(C1753460vjM c1753460vjM) {
        this.LL = c1753460vjM;
    }

    public final void setOnClickListener(InterfaceC1753440vjK interfaceC1753440vjK) {
        this.LLILZIL = interfaceC1753440vjK;
    }

    public final void setShareTagContainer(CardView cardView) {
        this.LLILZ = cardView;
    }

    public final void setShareTagView(C7938038e c7938038e) {
        this.LLILLL = c7938038e;
    }

    public final void settCartIconTintColorRes(int i) {
        getCevShareIconFromXml().setTintColorRes(i);
    }

    public C1753400vjG(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static void e0(C1753400vjG c1753400vjG, C1753410vjH c1753410vjH) {
        int i;
        c1753400vjG.getClass();
        EnumC1743330vT1 enumC1743330vT1 = c1753410vjH.LIZ;
        if (enumC1743330vT1 == null) {
            i = -1;
        } else {
            i = C1743340vT2.LIZ[enumC1743330vT1.ordinal()];
        }
        if (i == 1) {
            c1753400vjG.getCdShareIconFromXml().setBackgroundColor(0);
            c1753400vjG.getCevShareIconFromXml().setTintColorRes(R.attr.ee);
        } else {
            c1753400vjG.getCdShareIconFromXml().setBackgroundColor(0);
            c1753400vjG.getCevShareIconFromXml().setBackgroundAlpha(0);
            c1753400vjG.getCevShareIconFromXml().setTintColorRes(R.attr.a1h);
        }
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        int[] iArr = C1743340vT2.LIZIZ;
        event.ordinal();
    }

    public C1753400vjG(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C786410Ut5.Sd(R.layout.axi, C786410Ut5.ne(context), this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ShareEntryView);
        float dimension = typedArrayObtainStyledAttributes.getDimension(R$styleable.ShareEntryView_share_width, LLILZLL);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(R$styleable.ShareEntryView_share_height, LLIZ);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(R$styleable.ShareEntryView_share_card_width, -1.0f);
        float dimension4 = typedArrayObtainStyledAttributes.getDimension(R$styleable.ShareEntryView_share_card_height, -1.0f);
        float dimension5 = typedArrayObtainStyledAttributes.getDimension(R$styleable.ShareEntryView_share_icon_padding, LLIZLLLIL);
        float dimension6 = typedArrayObtainStyledAttributes.getDimension(R$styleable.ShareEntryView_share_end_margin, -1.0f);
        float dimension7 = typedArrayObtainStyledAttributes.getDimension(R$styleable.ShareEntryView_share_start_margin, -1.0f);
        float dimension8 = typedArrayObtainStyledAttributes.getDimension(R$styleable.ShareEntryView_share_top_margin, -1.0f);
        float dimension9 = typedArrayObtainStyledAttributes.getDimension(R$styleable.ShareEntryView_share_bottom_margin, -1.0f);
        typedArrayObtainStyledAttributes.recycle();
        getCevShareIconFromXml().setIconMargin(C679280Qkg.LIZIZ(Integer.valueOf((int) dimension5)));
        getCevShareIconFromXml().setIconWidth((int) dimension);
        getCevShareIconFromXml().setIconHeight((int) dimension2);
        if (dimension3 != -1.0f) {
            getCdShareIconFromXml().setMinimumWidth((int) dimension3);
        }
        if (dimension4 != -1.0f) {
            getCdShareIconFromXml().setMinimumHeight((int) dimension4);
        }
        if (dimension6 != -1.0f) {
            C0H9H.LIZLLL((int) dimension6, getCdShareIconFromXml());
        }
        if (dimension7 != -1.0f) {
            C0H9H.LJFF((int) dimension7, getCdShareIconFromXml());
        }
        if (dimension8 != -1.0f) {
            C0H9H.LJI((int) dimension8, getCdShareIconFromXml());
        }
        if (dimension9 != -1.0f) {
            C0H9H.LIZJ((int) dimension9, getCdShareIconFromXml());
        }
    }
}
