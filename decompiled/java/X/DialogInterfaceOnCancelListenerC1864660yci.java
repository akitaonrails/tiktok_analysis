package X;

import android.content.DialogInterface;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.clip.LiveReplayVideoClipActivity;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0yci, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class DialogInterfaceOnCancelListenerC1864660yci implements DialogInterface.OnCancelListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.$t) {
            case 0:
                onCancel$0(this, dialogInterface);
                break;
            case 1:
                onCancel$1(this, dialogInterface);
                break;
            case 2:
                onCancel$2(this, dialogInterface);
                break;
        }
    }

    public static final void onCancel$0(DialogInterfaceOnCancelListenerC1864660yci dialogInterfaceOnCancelListenerC1864660yci, DialogInterface dialogInterface) {
        C0IK5.LIZLLL(((LiveReplayVideoClipActivity) dialogInterfaceOnCancelListenerC1864660yci.l0).LLJJL);
        LiveReplayVideoClipActivity liveReplayVideoClipActivity = (LiveReplayVideoClipActivity) dialogInterfaceOnCancelListenerC1864660yci.l0;
        liveReplayVideoClipActivity.LLJJJJLIIL = 0.0f;
        liveReplayVideoClipActivity.LLLZ(((Number) ((Pair) dialogInterfaceOnCancelListenerC1864660yci.l1).getSecond()).longValue() - ((Number) ((Pair) dialogInterfaceOnCancelListenerC1864660yci.l1).getFirst()).longValue());
    }

    public static final void onCancel$1(DialogInterfaceOnCancelListenerC1864660yci dialogInterfaceOnCancelListenerC1864660yci, DialogInterface dialogInterface) {
        C1802660x0i.LIZJ((C1797250wrz) dialogInterfaceOnCancelListenerC1864660yci.l1, "cancel");
    }

    public static final void onCancel$2(DialogInterfaceOnCancelListenerC1864660yci dialogInterfaceOnCancelListenerC1864660yci, DialogInterface dialogInterface) {
        C1802670x0j.LIZJ((C1797250wrz) dialogInterfaceOnCancelListenerC1864660yci.l1, "cancel");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DialogInterfaceOnCancelListenerC1864660yci(Object obj, LiveReplayVideoClipActivity liveReplayVideoClipActivity, Pair<Long, Long> pair) {
        this.$t = pair;
        this.l0 = obj;
        this.l1 = liveReplayVideoClipActivity;
    }
}
