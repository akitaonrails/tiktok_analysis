package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.chatroom.api.UserEmote;

/* JADX INFO: renamed from: X.0JRc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C491980JRc extends RecyclerView.ViewHolder {
    public void I5(AbstractC492010JRf abstractC492010JRf, InterfaceC2753014t interfaceC2753014t) {
    }

    public C491980JRc(View view) {
        super(view);
    }

    public static void L5(UserEmote userEmote, C19R6 c19r6) {
        if (c19r6 == null || userEmote == null) {
            return;
        }
        C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ(userEmote.image);
        c1324610kZfLJIIIZ.LJJ = Boolean.TRUE;
        c1324610kZfLJIIIZ.LJJI(c19r6);
    }
}
