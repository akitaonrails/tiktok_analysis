package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.lighten.loader.SmartImageView;

/* JADX INFO: renamed from: X.0vyd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1762930vyd extends FrameLayout {
    public static final int LLILZIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64));
    public static final int LLILZLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
    public static final int LLIZ;
    public static final int LLIZLLLIL;
    public final SmartImageView LL;
    public final C1763600vzi LLILLJJLI;
    public final SmartImageView LLILLL;
    public String LLILZ;

    static {
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
        LLIZ = iLIZIZ;
        LLIZLLLIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)) + iLIZIZ;
    }

    public final View getPriceView() {
        return this.LLILLJJLI;
    }

    public C1762930vyd(Context context) {
        super(context, null, 0);
        SmartImageView smartImageView = new SmartImageView(getContext());
        C786410Ut5.G6(smartImageView, new FrameLayout.LayoutParams(-1, -1));
        this.LL = smartImageView;
        C1763600vzi c1763600vzi = new C1763600vzi(getContext(), null, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        int i = LLILZLL;
        layoutParams.setMarginStart(i);
        layoutParams.setMarginEnd(i);
        layoutParams.gravity = 16;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1763600vzi);
        c1763600vzi.setLayoutParams(layoutParams);
        this.LLILLJJLI = c1763600vzi;
        SmartImageView smartImageView2 = new SmartImageView(getContext());
        smartImageView2.setId(FrameLayout.generateViewId());
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -1);
        layoutParams2.gravity = 8388629;
        C786410Ut5.G6(smartImageView2, layoutParams2);
        C0H1U.LJIIIIZZ(LLIZ, smartImageView2);
        smartImageView2.setMaxWidth(LLIZLLLIL);
        C03DZ.LIZ(smartImageView2);
        this.LLILLL = smartImageView2;
        ViewGroup.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, LLILZIL);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams3);
        addView(smartImageView);
        addView(c1763600vzi);
        addView(smartImageView2);
    }
}
