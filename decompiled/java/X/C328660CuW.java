package X;

import android.content.Context;
import android.util.AttributeSet;
import com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.api.Message;

/* JADX INFO: renamed from: X.0CuW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C328660CuW extends C1860130yVP {
    public static final /* synthetic */ int LLJJLIIIJLLLLLLLZ = 0;
    public final C328520CuI LLJJJJLIIL;
    public Message LLJJL;

    @Override // X.C1860100yVM, androidx.appcompat.widget.AppCompatTextView, android.view.View
    public final void onDetachedFromWindow() {
        String str;
        super.onDetachedFromWindow();
        C01GW c01gw = C2142108aJ.LIZ;
        Message message = this.LLJJL;
        if (message == null || (str = message.uuid) == null) {
            str = "";
        }
        C2142108aJ.LIZIZ(str);
    }

    public C328660CuW(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLJJJJLIIL = new C328520CuI();
    }
}
