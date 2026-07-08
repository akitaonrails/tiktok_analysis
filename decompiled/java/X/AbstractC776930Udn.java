package X;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.model.message.ChatMessage;

/* JADX INFO: renamed from: X.0Udn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC776930Udn extends C776960Udq implements LifecycleOwner {
    public static final /* synthetic */ int LLILLJJLI = 0;

    public abstract void LJII(InterfaceC1110630f0X interfaceC1110630f0X);

    public abstract boolean LJIIIIZZ();

    public abstract void LJIIIZ();

    public abstract void LJIIJ();

    public abstract void LJIIJJI(boolean z);

    public abstract void LJIIL(boolean z);

    public abstract void LJIILIIL();

    public abstract void LJIILJJIL(ChatMessage chatMessage, ChatMessage chatMessage2);

    public void LJIILL(int i) {
    }

    public void LJIILLIIL(int i) {
    }

    public abstract int getCurTabMsg();

    public abstract void setMsgBtnActive(boolean z);

    public abstract void setTipsView(View view);

    public AbstractC776930Udn(Context context) {
        super(context);
    }
}
