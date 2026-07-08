package com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.avatar;

import X.AbstractC19484711Kz;
import X.C01NB;
import X.C11NJ;
import X.C11S5;
import X.C12ES;
import X.C16FS;
import X.C1701940uOG;
import X.C19487311Lz;
import X.C480460Ism;
import X.C497740JfY;
import X.C500980Jkm;
import X.C516201zk;
import X.C516301zl;
import X.C786410Ut5;
import X.C936250aTH;
import X.C953780avY;
import X.InterfaceC300801Eo;
import X.ViewOnClickListenerC512201z6;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.avatar.common.api.IAvatarAPI;
import com.bytedance.android.live.liveinteract.multilive.social.model.AvatarGetReq;
import com.bytedance.android.live.liveinteract.multilive.social.model.AvatarGetResp;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestAvatarFeatureSetting;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import webcast.data.multi_guest_social_data.Avatar;

/* JADX INFO: loaded from: classes.dex */
public final class MultiGuestAvatarIntroFragment extends MultiGuestAbstractAvatarFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2OzE6emE+HELIOSKSwiZyI2LCwtZygmLTY4Zy4lKTEtO2EePSk4IAgmLTY4CDkyPCQ+ACEnOioKOy40JSAiPQ==";
    public Long LL;
    public User LLILLJJLI;
    public final C11NJ LLILLL = new C11NJ();
    public boolean LLILZ;

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.gke);
        c500980Jkm.LIZJ = R.style.ahk;
        c500980Jkm.LJII = 80;
        c500980Jkm.LJ = true;
        c500980Jkm.LJIIJ = -2;
        c500980Jkm.LJI = 0.0f;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.LLILLL.dispose();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.avatar.MultiGuestAbstractAvatarFragment, com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        long id;
        AbstractC19484711Kz abstractC19484711KzLIZ;
        C16FS c16fs;
        String nickName;
        super.onViewCreated(view, bundle);
        LiveIconView liveIconView = (LiveIconView) view.findViewById(R.id.lc0);
        if (liveIconView != null) {
            C786410Ut5.g8(liveIconView, new ViewOnClickListenerC512201z6(this, 14));
        }
        LiveIconView liveIconView2 = (LiveIconView) view.findViewById(R.id.lt8);
        if (liveIconView2 != null) {
            C786410Ut5.g8(liveIconView2, new ViewOnClickListenerC512201z6(this, 15));
        }
        TextView textView = (TextView) view.findViewById(R.id.biy);
        if (textView != null) {
            Object[] objArr = new Object[1];
            User user = this.LLILLJJLI;
            if (user != null) {
                nickName = user.getNickName();
            } else {
                nickName = null;
            }
            objArr[0] = nickName;
            textView.setText(C497740JfY.LJIJJ(2131852839, objArr));
        }
        if (!this.LLILZ && MultiGuestAvatarFeatureSetting.INSTANCE.hasUseAbility() && (c16fs = (C16FS) view.findViewById(R.id.biw)) != null) {
            C12ES.LJIILL(0, c16fs);
            C786410Ut5.h8(c16fs, new ViewOnClickListenerC512201z6(this, 16));
        }
        Long l = this.LL;
        if (l != null) {
            long jLongValue = l.longValue();
            boolean z = C936250aTH.LIZIZ;
            User user2 = this.LLILLJJLI;
            if (user2 != null) {
                id = user2.getId();
            } else {
                id = 0;
            }
            final Avatar avatar = (Avatar) ((LinkedHashMap) C936250aTH.LIZLLL).get(Long.valueOf(jLongValue));
            if (avatar != null) {
                abstractC19484711KzLIZ = AbstractC19484711Kz.LJII(new InterfaceC300801Eo() { // from class: X.01Ek
                    /* JADX WARN: Type inference failed for: r0v1, types: [T, com.bytedance.android.live.liveinteract.multilive.social.model.AvatarGetResp$ResponseData] */
                    @Override // X.InterfaceC300801Eo
                    public final void subscribe(InterfaceC2329309At<C470590Icr<AvatarGetResp.ResponseData>> interfaceC2329309At) {
                        C470590Icr<AvatarGetResp.ResponseData> c470590Icr = new C470590Icr<>();
                        Avatar avatar2 = avatar;
                        c470590Icr.statusCode = 0;
                        ?? r0 = (T) new AvatarGetResp.ResponseData();
                        r0.avatar = avatar2;
                        c470590Icr.data = r0;
                        interfaceC2329309At.onSuccess(c470590Icr);
                    }
                });
            } else {
                AvatarGetReq avatarGetReq = new AvatarGetReq();
                avatarGetReq.avatarOwnerUserId = id;
                avatarGetReq.avatarId = jLongValue;
                avatarGetReq.applier = C936250aTH.LJ();
                avatarGetReq.common = C936250aTH.LIZLLL();
                C480460Ism.LIZ().getClass();
                abstractC19484711KzLIZ = C01NB.LIZ(((IAvatarAPI) C480460Ism.LIZLLL(IAvatarAPI.class)).getAvatar(avatarGetReq).LJJIJIIJI(C11S5.LIZ()).LJJ(C953780avY.LIZIZ).LJIILL(new C516301zl(jLongValue, 6)));
            }
            C19487311Lz.LIZJ(abstractC19484711KzLIZ.LJJ(C1701940uOG.LIZIZ()), this.LLILLL, new C516201zk(view, 34), new C516301zl(jLongValue, 1), 24);
        }
    }
}
