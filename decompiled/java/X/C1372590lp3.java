package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0lp3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1372590lp3 extends FrameLayout implements InterfaceC1373050lpn {
    public C11FQ LL;
    public View LLILLJJLI;
    public View LLILLL;
    public TuxTextView LLILZ;
    public TuxTextView LLILZIL;

    @Override // X.InterfaceC1373050lpn
    public final void LIZ() {
        View view = this.LLILLL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        TuxTextView tuxTextView = this.LLILZIL;
        if (tuxTextView != null) {
            C786410Ut5.LLLLZLL(tuxTextView, 0);
        }
    }

    public final TuxTextView getDisplayDescTv() {
        return this.LLILZ;
    }

    public final TuxTextView getDownloadDescTv() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC1373050lpn
    public C11FQ getQrCodeSquareView() {
        return this.LL;
    }

    public C1372590lp3(Context context) {
        super(context, null, 0);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.f88, this, true);
        this.LLILLJJLI = findViewById(R.id.v1b);
        this.LLILLL = findViewById(R.id.v1f);
    }

    public final void setDisplayDescTv(TuxTextView tuxTextView) {
        this.LLILZ = tuxTextView;
    }

    public final void setDownloadDescTv(TuxTextView tuxTextView) {
        this.LLILZIL = tuxTextView;
    }
}
