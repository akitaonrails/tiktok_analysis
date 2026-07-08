package X;

import android.widget.PopupWindow;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;

/* JADX INFO: renamed from: X.15tS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public interface InterfaceC20663615tS extends InterfaceC20665015tg {
    void LIZJ(InnerPushMessage innerPushMessage, int[] iArr, boolean z, boolean z2);

    void LJII(InnerPushMessage innerPushMessage);

    C20665215ti LJIILLIIL();

    void LJJIII(C20665215ti c20665215ti, InnerPushMessage innerPushMessage);

    void dismiss();

    int getMessageType();

    InnerPushMessage getMsg();

    boolean isShowing();

    void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener);
}
