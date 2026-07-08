package X;

import android.text.style.ClickableSpan;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.dialog.AigcWallpaperInfoDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.fragment.anchor.AigcWallpaperAnchorEditFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.fragment.guest.AigcWallpaperGuestEditFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0bms, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class C986840bms extends ClickableSpan {
    public final int $t;
    public Object l0;

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            default:
                super.onClick(view);
                break;
        }
    }

    public C986840bms(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onClick$0(C986840bms c986840bms, View view) {
        FragmentManager fragmentManager;
        DataChannel dataChannel = ((AigcWallpaperAnchorEditFragment) c986840bms.l0).LL;
        if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) != null) {
            C492400JSs.LIZ(new AigcWallpaperInfoDialog(), fragmentManager, "AigcWallpaperGuestEditFragment");
        }
    }

    public static final void onClick$1(C986840bms c986840bms, View view) {
        FragmentManager fragmentManager;
        DataChannel dataChannel = ((AigcWallpaperGuestEditFragment) c986840bms.l0).LL;
        if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) != null) {
            C492400JSs.LIZ(new AigcWallpaperInfoDialog(), fragmentManager, "AigcWallpaperGuestEditFragment");
        }
    }
}
