package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.03CD, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03CD extends FrameLayout implements InterfaceC438770HIl {
    public final ImageView LL;
    public final FrameLayout LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public final int LLILZIL;

    @Override // X.InterfaceC438770HIl
    public final View LLLILZJ() {
        return this;
    }

    public final FrameLayout getFl() {
        return this.LLILLJJLI;
    }

    public final ImageView getIv() {
        return this.LL;
    }

    public C03CD(Context context) {
        super(context, null, 0);
        this.LLILLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        this.LLILZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(76));
        this.LLILZIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(46));
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.d1h, this, true);
        this.LL = (ImageView) findViewById(R.id.lkw);
        this.LLILLJJLI = (FrameLayout) findViewById(R.id.ibk);
    }

    @Override // X.InterfaceC438770HIl
    public final void LIZ(float f) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        int iLIZIZ = C814420VxA.LIZIZ(this.LLILLL * f);
        int iLIZIZ2 = C814420VxA.LIZIZ(this.LLILZ * f);
        int iLIZIZ3 = C814420VxA.LIZIZ(this.LLILZIL * f);
        ImageView imageView = this.LL;
        if (imageView != null && (layoutParams2 = imageView.getLayoutParams()) != null) {
            layoutParams2.width = iLIZIZ2;
        }
        ImageView imageView2 = this.LL;
        if (imageView2 != null && (layoutParams = imageView2.getLayoutParams()) != null) {
            layoutParams.height = iLIZIZ3;
        }
        FrameLayout frameLayout = this.LLILLJJLI;
        if (frameLayout != null) {
            frameLayout.setPadding(iLIZIZ, iLIZIZ, iLIZIZ, iLIZIZ);
        }
    }
}
