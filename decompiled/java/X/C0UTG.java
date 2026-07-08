package X;

import Y.ACListenerS147S0100000_12;
import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0UTG, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UTG extends FrameLayout {
    public final String LL;
    public final boolean LLILLJJLI;
    public final C20382814pG LLILLL;
    public final DataChannel LLILZ;
    public final boolean LLILZIL;
    public final C11NJ LLILZLL;

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.LLILZLL.LJ();
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.h65, this, true);
        C197039127h c197039127h = (C197039127h) findViewById(R.id.cp9);
        if (c197039127h != null) {
            C786410Ut5.U8(c197039127h, new ACListenerS147S0100000_12((Object) this, 482));
        }
    }

    public C0UTG(Context context, String str, boolean z, C20382814pG c20382814pG, DataChannel dataChannel, boolean z2) {
        super(context, null);
        this.LL = str;
        this.LLILLJJLI = z;
        this.LLILLL = c20382814pG;
        this.LLILZ = dataChannel;
        this.LLILZIL = z2;
        this.LLILZLL = new C11NJ();
    }
}
