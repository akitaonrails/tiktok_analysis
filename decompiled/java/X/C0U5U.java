package X;

import android.content.Context;
import android.view.View;
import com.bytedance.android.live.effect.bgeffect.LiveBgDialogFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0U5U, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0U5U {
    public static C0UAO LIZ;
    public static C767880UAg LIZIZ;
    public static C0U57 LIZJ;
    public static ViewOnLayoutChangeListenerC766940U6q LIZLLL;
    public static C0U58 LJ;
    public static C0U58 LJFF;

    public static LiveBgDialogFragment LIZ(Context context, DataChannel dataChannel, String str, C0U58 c0u58, InterfaceC767730U9r interfaceC767730U9r, View.OnClickListener onClickListener, C0U59 c0u59, String str2, boolean z) {
        if (dataChannel.gg0(C748880TZe.class) != null) {
            if (C760940Tt6.LIZ(str)) {
                LJ = c0u58;
            } else {
                LJFF = c0u58;
            }
            if (C760940Tt6.LIZ(str)) {
                if (LIZJ == null) {
                    C0U57 c0u57 = new C0U57(context, dataChannel, str, onClickListener, c0u59, str2, z);
                    if (interfaceC767730U9r != null) {
                        c0u57.LLJJJJLIIL = interfaceC767730U9r;
                    }
                    c0u57.LLJJL = c0u58;
                    c0u57.LLJJJJJIL.LLJIJIL = c0u58;
                    LIZJ = c0u57;
                }
                LiveBgDialogFragment liveBgDialogFragment = new LiveBgDialogFragment();
                C0U57 c0u572 = LIZJ;
                if (c0u572 != null) {
                    liveBgDialogFragment.LL = c0u572;
                }
                return liveBgDialogFragment;
            }
            C0U57 c0u573 = new C0U57(context, dataChannel, str, onClickListener, c0u59, str2, z);
            if (interfaceC767730U9r != null) {
                c0u573.LLJJJJLIIL = interfaceC767730U9r;
            }
            c0u573.LLJJL = c0u58;
            c0u573.LLJJJJJIL.LLJIJIL = c0u58;
            LiveBgDialogFragment liveBgDialogFragment2 = new LiveBgDialogFragment();
            liveBgDialogFragment2.LL = c0u573;
            return liveBgDialogFragment2;
        }
        return null;
    }
}
