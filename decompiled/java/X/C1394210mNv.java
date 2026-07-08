package X;

import Y.ARunnableS39S0300000_6;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.feed.model.VideoTag;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: renamed from: X.0mNv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1394210mNv implements InterfaceC1399020mVg {
    public static final int LIZIZ = VideoTag.MDP_SQUARE_EFFECT.getVideoTag();
    public final Function0<Fragment> LIZ;

    @Override // X.InterfaceC1399020mVg
    public final int LIZIZ() {
        return 2131857979;
    }

    public C1394210mNv(AwS565S0100000_21 awS565S0100000_21) {
        this.LIZ = awS565S0100000_21;
    }

    @Override // X.InterfaceC1399020mVg
    public final void LIZ(ViewGroup viewGroup) {
        View viewFindViewById;
        TextView textView;
        if (viewGroup == null || (viewFindViewById = viewGroup.findViewById(R.id.cbx)) == null || (textView = (TextView) viewFindViewById.findViewById(R.id.szn)) == null) {
            return;
        }
        HandlerHook.viewPost(viewFindViewById, new ARunnableS39S0300000_6(viewFindViewById, textView, this, 18));
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0292  */
    @Override // X.InterfaceC1399020mVg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(android.content.Context r54, com.ss.android.ugc.aweme.feed.model.Aweme r55, java.lang.Integer r56) {
        /*
            Method dump skipped, instruction units count: 670
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1394210mNv.LIZJ(android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.Integer):void");
    }
}
