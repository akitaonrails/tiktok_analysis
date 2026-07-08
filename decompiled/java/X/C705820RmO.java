package X;

import android.content.Context;
import com.ss.android.ugc.feed.platform.cell.interact.view.InteractFrameLayout;

/* JADX INFO: renamed from: X.0RmO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C705820RmO extends InteractFrameLayout implements InterfaceC695290RPb {
    public final /* synthetic */ C705870RmT LL;

    @Override // X.InterfaceC695290RPb
    public void setOnPerfListener(InterfaceC705840RmQ interfaceC705840RmQ) {
        this.LL.setOnPerfListener(interfaceC705840RmQ);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LL.LIZIZ();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LL.LIZJ();
    }

    public C705820RmO(Context context) {
        super(context, null, 0, 0);
        C705870RmT c705870RmT = new C705870RmT();
        this.LL = c705870RmT;
        if (C715260S3w.LIZIZ()) {
            c705870RmT.LL = this;
        }
    }
}
