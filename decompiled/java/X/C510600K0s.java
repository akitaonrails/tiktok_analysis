package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import webcast.api.pgc_sub.PGCGetSubPrivilegeDetailResponse;

/* JADX INFO: renamed from: X.0K0s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C510600K0s extends C0K1I<C510500K0i> {
    public final C417410GYh LLILLJJLI;
    public final C417410GYh LLILLL;
    public final TextView LLILZ;
    public final TextView LLILZIL;
    public boolean LLILZLL;

    public C510600K0s(View view) {
        super(view);
        this.LLILLJJLI = (C417410GYh) view.findViewById(R.id.xsw);
        this.LLILLL = (C417410GYh) view.findViewById(R.id.xsx);
        this.LLILZ = (TextView) view.findViewById(R.id.xt0);
        this.LLILZIL = (TextView) view.findViewById(R.id.xt1);
    }

    @Override // X.AbstractC339560DSw
    public final void I5(InterfaceC339570DSx interfaceC339570DSx) {
        User currentUser;
        ImageModel avatarThumb;
        C510480K0g c510480K0g = (C510480K0g) interfaceC339570DSx;
        P5(c510480K0g);
        PGCGetSubPrivilegeDetailResponse.Data data = c510480K0g.LIZLLL;
        if (this.LLILZLL) {
            View viewFindViewById = this.itemView.findViewById(R.id.tv_title);
            if (viewFindViewById != null) {
                C0K0R.LIZ(viewFindViewById);
            }
            View viewFindViewById2 = this.itemView.findViewById(R.id.zhr);
            if (viewFindViewById2 != null) {
                C0K0R.LIZ(viewFindViewById2);
            }
            View view = this.itemView;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = 0;
                C786410Ut5.W5(view, marginLayoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        C511420K3w.LJIIJ.getClass();
        C511420K3w c511420K3w = new C511420K3w();
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        User currentUser2 = null;
        if (iUserService != null) {
            currentUser = iUserService.getCurrentUser();
        } else {
            currentUser = null;
        }
        com.bytedance.android.live.base.model.user.User userLJ = C15WP.LJ(currentUser);
        if (userLJ != null) {
            avatarThumb = userLJ.getAvatarThumb();
        } else {
            avatarThumb = null;
        }
        c511420K3w.LIZ = avatarThumb;
        c511420K3w.LIZ(this.LLILLL);
        C511430K3x.LIZ.getClass();
        C511430K3x.LIZJ(this.LLILLJJLI, C511430K3x.LIZ("ttlive_sub_discord_icon.png"));
        TextView textView = this.LLILZ;
        if (textView != null) {
            textView.setText(C0K7S.LIZ(data.anchorDetail));
        }
        TextView textView2 = this.LLILZIL;
        if (textView2 != null) {
            IUserService iUserService2 = (IUserService) ServiceManager.get().getService(IUserService.class);
            if (iUserService2 != null) {
                currentUser2 = iUserService2.getCurrentUser();
            }
            textView2.setText(C0K7S.LIZ(C15WP.LJ(currentUser2)));
        }
        TextView textView3 = this.LLILZ;
        if (textView3 != null) {
            C0K1Z.LIZ.getClass();
            textView3.setTextColor(C0K1Z.LIZLLL("#A6BAFF"));
        }
        TextView textView4 = this.LLILZIL;
        if (textView4 != null) {
            C0K1Z.LIZ.getClass();
            textView4.setTextColor(C0K1Z.LIZLLL("#C8A6FF"));
        }
    }
}
