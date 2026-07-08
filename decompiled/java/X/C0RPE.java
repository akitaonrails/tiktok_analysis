package X;

import android.view.View;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.ability.IPhotoSlidesAbility;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;

/* JADX INFO: renamed from: X.0RPE, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RPE implements C0RPK {
    public final LinearLayout LL;
    public final C0RPK LLILLJJLI;
    public boolean LLILLL;
    public InterfaceC665370Q7z LLILZ;
    public IPhotoSlidesAbility LLILZIL;
    public VideoItemParams LLILZLL;

    @Override // X.C0RPK
    public final void SC(boolean z) {
    }

    @Override // X.C0RPK
    public final void oC(boolean z) {
    }

    @Override // X.C0RPK
    public final void qe(boolean z) {
    }

    @Override // X.C0RPK
    public final void nl() {
        C0RPK c0rpk = this.LLILLJJLI;
        if (c0rpk != null) {
            c0rpk.nl();
        }
    }

    @Override // X.C0RPK
    public final void w5() {
        C0RPK c0rpk;
        if (this.LLILLL || (c0rpk = this.LLILLJJLI) == null) {
            return;
        }
        c0rpk.w5();
    }

    @Override // X.C0RPK
    public final void wF() {
        C0RPK c0rpk;
        if (this.LLILLL || (c0rpk = this.LLILLJJLI) == null) {
            return;
        }
        c0rpk.wF();
    }

    public C0RPE(LinearLayout linearLayout, C0RPK c0rpk) {
        this.LL = linearLayout;
        this.LLILLJJLI = c0rpk;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C0RPK c0rpk;
        if (!this.LLILLL && (c0rpk = this.LLILLJJLI) != null) {
            c0rpk.onLayoutChange(view, i, i2, i3, i4, i5, i6, i7, i8);
        }
    }
}
