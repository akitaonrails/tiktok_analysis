package X;

import Y.ACListenerS141S0100000_6;
import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0HtL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C455330HtL extends RecyclerView.ViewHolder {
    public final SmartImageView LL;
    public final InterfaceC455400HtS LLILLJJLI;
    public C455420HtU LLILLL;

    public final void I5(boolean z) {
        Drawable drawableLIZ;
        SmartImageView smartImageView = this.LL;
        if (!z) {
            drawableLIZ = null;
        } else {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(8));
            drawableLIZ = c384050F3z.LIZ(this.LL.getContext());
        }
        smartImageView.setBackground(drawableLIZ);
    }

    public C455330HtL(SmartImageView smartImageView, C455360HtO c455360HtO) {
        super(smartImageView);
        this.LL = smartImageView;
        this.LLILLJJLI = c455360HtO;
        C786410Ut5.Q8(smartImageView, new ACListenerS141S0100000_6(this, 152));
    }
}
