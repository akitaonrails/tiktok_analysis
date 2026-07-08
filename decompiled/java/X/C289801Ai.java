package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.01Ai, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C289801Ai {
    public static final void LIZ(View view, ViewGroup viewGroup, DataChannel dataChannel) {
        Boolean bool;
        if ((dataChannel == null || (bool = (Boolean) dataChannel.gg0(C0TZM.class)) == null || bool.booleanValue()) && viewGroup != null) {
            view.getLayoutParams().height = viewGroup.getHeight();
        }
    }
}
