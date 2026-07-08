package X;

import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.adminsetting.LiveFilterCommentApproveDialog;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0TYd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class C748610TYd extends C2217421BqW implements Function1<EnumC748580TYa, Unit> {
    public C748610TYd(Object obj) {
        super(1, obj, LiveFilterCommentApproveDialog.class, "switchPage", "switchPage(Lcom/bytedance/android/livesdk/dataChannel/BroadcastDialogPage;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(EnumC748580TYa enumC748580TYa) {
        Fragment fragment;
        EnumC748580TYa enumC748580TYa2 = enumC748580TYa;
        LiveFilterCommentApproveDialog liveFilterCommentApproveDialog = (LiveFilterCommentApproveDialog) this.receiver;
        liveFilterCommentApproveDialog.getClass();
        int i = C748600TYc.LIZ[enumC748580TYa2.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    liveFilterCommentApproveDialog.dismiss();
                }
                return Unit.LIZ;
            }
            fragment = (Fragment) liveFilterCommentApproveDialog.LLILZ.getValue();
        } else {
            fragment = (Fragment) liveFilterCommentApproveDialog.LLILLL.getValue();
        }
        if (fragment != null) {
            C19EH c19ehLJIIJ = liveFilterCommentApproveDialog.getChildFragmentManager().LJIIJ();
            if (enumC748580TYa2.getGoNextPage()) {
                c19ehLJIIJ.LJIJJ(R.anim.hf, R.anim.hc);
            } else {
                c19ehLJIIJ.LJIJJ(R.anim.hb, R.anim.hg);
            }
            c19ehLJIIJ.LJIJ(R.id.eqx, fragment, null);
            c19ehLJIIJ.LJIIIZ();
        }
        return Unit.LIZ;
    }
}
