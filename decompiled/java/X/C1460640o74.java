package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.optimization.ILayoutPreloadServiceForEditPage;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0o74, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1460640o74 extends FrameLayout {
    public static final int LLIZLLLIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
    public static final int LLJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
    public C19471411Fw LL;
    public SmartImageView LLILLJJLI;
    public TuxIconView LLILLL;
    public SmartImageView LLILZ;
    public ViewStub LLILZIL;
    public C0FJM LLILZLL;
    public Function1<? super C1459730o5b, Unit> LLIZ;

    public final ViewGroup.LayoutParams getIconLayoutParams() {
        SmartImageView smartImageView = this.LLILLJJLI;
        if (smartImageView == null) {
            smartImageView = null;
        }
        return smartImageView.getLayoutParams();
    }

    public final int getTextWidth$tools_camera_edit_release() {
        C19471411Fw c19471411Fw = this.LL;
        if (c19471411Fw == null) {
            c19471411Fw = null;
        }
        return c19471411Fw.getLayoutParams().width;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public C1460640o74(Context context) {
        super(context);
        C0JAI.LIZ(28.0f, getContext());
        ((ILayoutPreloadServiceForEditPage) ServiceManager.get().getService(ILayoutPreloadServiceForEditPage.class)).loadLayoutToolbarFiles("view_bottom_tool_item", getContext(), (LayoutInflater) C786410Ut5.H2(getContext(), "layout_inflater"), R.layout.i9s, this, true);
        this.LL = (C19471411Fw) findViewById(R.id.cw7);
        this.LLILLJJLI = (SmartImageView) findViewById(R.id.cw4);
        findViewById(R.id.ly5);
        this.LLILLL = (TuxIconView) findViewById(R.id.cw6);
        this.LLILZ = (SmartImageView) findViewById(R.id.ll5);
        this.LLILZIL = (ViewStub) findViewById(R.id.view_stub_save_local_progress);
    }

    public final void LIZ(int i) {
        Function1<? super C1459730o5b, Unit> function1 = this.LLIZ;
        if (function1 != null) {
            SmartImageView smartImageView = this.LLILLJJLI;
            C19471411Fw c19471411Fw = null;
            if (smartImageView == null) {
                smartImageView = null;
            }
            C19471411Fw c19471411Fw2 = this.LL;
            if (c19471411Fw2 != null) {
                c19471411Fw = c19471411Fw2;
            }
            function1.invoke(new C1459730o5b(smartImageView, c19471411Fw, i, this.LLILZLL, null, null));
        }
    }

    public final void setIcon(int i) {
        SmartImageView smartImageView = this.LLILLJJLI;
        SmartImageView smartImageView2 = null;
        if (smartImageView == null) {
            smartImageView = null;
        } else {
            smartImageView2 = smartImageView;
        }
        smartImageView2.setImageDrawable(C800330VaR.LIZIZ(smartImageView.getContext(), i));
    }

    public final void setIconPadding(int i) {
        SmartImageView smartImageView = this.LLILLJJLI;
        if (smartImageView == null) {
            smartImageView = null;
        }
        C426750GoL.LJIIL(smartImageView, Integer.valueOf(i), Integer.valueOf(i), Integer.valueOf(i), Integer.valueOf(i), 16);
    }

    public final void setRawIcon(int i) {
        ViewGroup.LayoutParams iconLayoutParams = getIconLayoutParams();
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZJ = iconLayoutParams.height - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
        c419910GdJ.LIZIZ = iconLayoutParams.width - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
        c419910GdJ.LIZ = i;
        c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
        setIcon(c419910GdJ.LIZ(getContext()));
    }

    public final void setText(int i) {
        C19471411Fw c19471411Fw = this.LL;
        if (c19471411Fw == null) {
            c19471411Fw = null;
        }
        c19471411Fw.setText(getContext().getString(i));
    }

    public final void setIcon(ImageUrlModel imageUrlModel) {
        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(imageUrlModel);
        c1331670kl3LJIIIIZZ.LJIILJJIL = 0;
        SmartImageView smartImageView = this.LLILLJJLI;
        if (smartImageView == null) {
            smartImageView = null;
        }
        c1331670kl3LJIIIIZZ.LJJ(smartImageView);
        C786410Ut5.h3(c1331670kl3LJIIIIZZ);
    }

    public final void setText(String str) {
        C19471411Fw c19471411Fw = this.LL;
        if (c19471411Fw == null) {
            c19471411Fw = null;
        }
        c19471411Fw.setText(str);
    }

    public final void setIcon(Drawable drawable) {
        SmartImageView smartImageView = this.LLILLJJLI;
        if (smartImageView == null) {
            smartImageView = null;
        }
        smartImageView.setImageDrawable(drawable);
    }
}
