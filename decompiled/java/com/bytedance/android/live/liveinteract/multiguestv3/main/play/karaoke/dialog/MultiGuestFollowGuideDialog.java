package com.bytedance.android.live.liveinteract.multiguestv3.main.play.karaoke.dialog;

import X.C0KVU;
import X.C1121670fIL;
import X.C16FS;
import X.C2188811AlT;
import X.C786410Ut5;
import X.C930540aK4;
import X.C930940aKi;
import X.InterfaceC2262081DgM;
import X.InterfaceC500940Jki;
import Y.ACListenerS150S0100000_15;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.CheckPermissionSucc;
import com.bytedance.android.live.room.LiveEndEvent;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: loaded from: classes16.dex */
public final class MultiGuestFollowGuideDialog extends LiveDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2OzE6emHELIOSE+KSwiZz8/KTxiIi4hKSonLGE3ISQgJih9BTAgPSYUPSA/PQk8JCkjPggmISEpDSYyJCor";
    public C16FS LL;
    public Companion.OnFollowRequestListener LLILLJJLI;

    public static final class Companion {

        public interface OnFollowRequestListener extends Parcelable {
            void L2(boolean z);
        }
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final boolean onBackPressed() {
        Companion.OnFollowRequestListener onFollowRequestListener = this.LLILLJJLI;
        if (onFollowRequestListener != null) {
            onFollowRequestListener.L2(false);
        }
        C930540aK4.LJJIZ(this);
        return super.onBackPressed();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C500980Jkm createParams() {
        /*
            r4 = this;
            android.content.Context r0 = r4.getContext()
            if (r0 == 0) goto L47
            int r3 = X.C465640INu.LIZIZ(r0)
        La:
            X.0Jkm r2 = new X.0Jkm
            r0 = 2131567692(0x7f0d244c, float:1.8760961E38)
            r2.<init>(r0)
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r4.dataChannel
            if (r1 == 0) goto L43
            java.lang.Class<X.0TZM> r0 = X.C0TZM.class
            java.lang.Object r0 = r1.gg0(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L43
            boolean r1 = r0.booleanValue()
            if (r1 != 0) goto L44
            r0 = 8388629(0x800015, float:1.1754973E-38)
        L29:
            r2.LJII = r0
            r0 = 1056964608(0x3f000000, float:0.5)
            r2.LJI = r0
            if (r1 == 0) goto L41
            r0 = -1
        L32:
            r2.LJIIIZ = r0
            if (r1 == 0) goto L37
            r3 = -1
        L37:
            r2.LJIIJ = r3
            if (r1 == 0) goto L49
            r0 = 2131887795(0x7f1206b3, float:1.9410207E38)
            r2.LIZJ = r0
            return r2
        L41:
            r0 = r3
            goto L32
        L43:
            r1 = 1
        L44:
            r0 = 80
            goto L29
        L47:
            r3 = 0
            goto La
        L49:
            r0 = 2131887796(0x7f1206b4, float:1.941021E38)
            r2.LIZJ = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.play.karaoke.dialog.MultiGuestFollowGuideDialog.createParams():X.0Jkm");
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String strLIZJ;
        InterfaceC2262081DgM currentUser;
        User userLJIJJLI;
        super.onViewCreated(view, bundle);
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room == null) {
            dismiss();
            return;
        }
        TextView textView = (TextView) view.findViewById(R.id.mru);
        String strLIZJ2 = C0KVU.LIZJ(room.getOwner());
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        if (interfaceC500940JkiUser == null || (userLJIJJLI = interfaceC500940JkiUser.LJIJJLI()) == null || (strLIZJ = C0KVU.LIZJ(userLJIJJLI)) == null) {
            strLIZJ = "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strLIZJ2);
        sbLIZ.append(" & ");
        sbLIZ.append(strLIZJ);
        textView.setText(C2188811AlT.LIZIZ(sbLIZ));
        ImageView imageView = (ImageView) view.findViewById(R.id.aza);
        User owner = room.getOwner();
        if (owner != null) {
            C1121670fIL.LJIILIIL(imageView, owner.getAvatarThumb(), imageView.getWidth(), imageView.getHeight(), R.drawable.el_);
        }
        ImageView imageView2 = (ImageView) view.findViewById(R.id.j9x);
        InterfaceC500940Jki interfaceC500940JkiUser2 = UserService.getInstance().user();
        if (interfaceC500940JkiUser2 != null && (currentUser = interfaceC500940JkiUser2.getCurrentUser()) != null) {
            C1121670fIL.LJIILIIL(imageView2, currentUser.getAvatarThumb(), imageView2.getWidth(), imageView2.getHeight(), R.drawable.el_);
        }
        C16FS c16fs = (C16FS) view.findViewById(R.id.mrh);
        if (c16fs != null) {
            this.LL = c16fs;
            C786410Ut5.h8(c16fs, new ACListenerS150S0100000_15(this, 85));
        }
        C786410Ut5.I7(new ACListenerS150S0100000_15(this, 86), view);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.BQ2(this, CheckPermissionSucc.class, new AwS594S0100000_15(this, 379));
            dataChannel.BQ2(this, LiveEndEvent.class, new AwS594S0100000_15(this, 380));
        }
    }
}
