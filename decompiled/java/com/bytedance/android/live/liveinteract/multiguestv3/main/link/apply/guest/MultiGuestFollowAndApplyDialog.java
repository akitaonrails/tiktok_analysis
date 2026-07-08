package com.bytedance.android.live.liveinteract.multiguestv3.main.link.apply.guest;

import X.C0KVU;
import X.C1121670fIL;
import X.C16FS;
import X.C2188811AlT;
import X.C497740JfY;
import X.C500980Jkm;
import X.C786410Ut5;
import X.C930940aKi;
import X.InterfaceC2262081DgM;
import X.InterfaceC500940Jki;
import Y.ACListenerS150S0100000_15;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.CheckPermissionSucc;
import com.bytedance.android.live.room.LiveEndEvent;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: loaded from: classes16.dex */
public final class MultiGuestFollowAndApplyDialog extends LiveDialogFragment {
    public static boolean LLILLL = false;
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2OzE6emHELIOSE+KSwiZyM6Ji5iKD8jJDxiLjo2OzFiBDo/PCwLPCogPAMjJSM8PwQiLQ4jOCk1DSYyJCor";
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
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.g9i);
        c500980Jkm.LIZJ = R.style.aji;
        c500980Jkm.LJIIJ = -1;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final boolean onBackPressed() {
        Companion.OnFollowRequestListener onFollowRequestListener = this.LLILLJJLI;
        if (onFollowRequestListener != null) {
            onFollowRequestListener.L2(false);
        }
        return super.onBackPressed();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        LLILLL = false;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Object obj;
        String strLIZJ;
        String strLIZIZ;
        InterfaceC2262081DgM currentUser;
        User userLJIJJLI;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        Companion.OnFollowRequestListener onFollowRequestListener = null;
        if (arguments != null) {
            try {
                obj = arguments.get("OnLinkMicBuiltListener");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                obj = null;
            } catch (OutOfMemoryError e2) {
                TryCatchGuardChecker.doCheck(e2);
                obj = null;
            }
        } else {
            obj = null;
        }
        if (obj instanceof Companion.OnFollowRequestListener) {
            onFollowRequestListener = (Companion.OnFollowRequestListener) obj;
        }
        this.LLILLJJLI = onFollowRequestListener;
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
        if (!C497740JfY.LJJ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLIZJ2);
            sbLIZ.append(" & ");
            sbLIZ.append(strLIZJ);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strLIZJ);
            sbLIZ2.append(" & ");
            sbLIZ2.append(strLIZJ2);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        textView.setText(strLIZIZ);
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
            C786410Ut5.h8(c16fs, new ACListenerS150S0100000_15(this, 67));
        }
        C786410Ut5.I7(new ACListenerS150S0100000_15(this, 68), view);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.BQ2(this, CheckPermissionSucc.class, new AwS594S0100000_15(this, 329));
            dataChannel.BQ2(this, LiveEndEvent.class, new AwS594S0100000_15(this, 330));
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.ss.android.ugc.aweme.tux.business.base.GlobalHookDialogFragment, androidx.fragment.app.DialogFragment
    public final void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
        LLILLL = true;
        PopupMonitorServiceImpl.LIZ.getClass();
        PopupMonitorServiceImpl.LJJIZ(this);
    }
}
