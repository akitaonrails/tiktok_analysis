package X;

import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.adminsetting.LiveAdminSettingDialog;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0TYX, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class C0TYX extends C2217421BqW implements Function1<EnumC748580TYa, Unit> {
    public C0TYX(Object obj) {
        super(1, obj, LiveAdminSettingDialog.class, "switchPage", "switchPage(Lcom/bytedance/android/livesdk/dataChannel/BroadcastDialogPage;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(EnumC748580TYa enumC748580TYa) {
        C0TYU c0tyu;
        Fragment fragmentLIZ;
        EnumC748580TYa enumC748580TYa2 = enumC748580TYa;
        LiveAdminSettingDialog liveAdminSettingDialog = (LiveAdminSettingDialog) this.receiver;
        if (liveAdminSettingDialog.isAdded() && liveAdminSettingDialog.getHost() != null && (c0tyu = liveAdminSettingDialog.LLILZ) != null && (fragmentLIZ = c0tyu.LIZ(enumC748580TYa2)) != null) {
            C19EH c19ehLJIIJ = liveAdminSettingDialog.getChildFragmentManager().LJIIJ();
            if (enumC748580TYa2.getGoNextPage()) {
                c19ehLJIIJ.LJIJJ(R.anim.hf, R.anim.hc);
            } else {
                c19ehLJIIJ.LJIJJ(R.anim.hb, R.anim.hg);
            }
            c19ehLJIIJ.LJIJ(R.id.aic, fragmentLIZ, null);
            c19ehLJIIJ.LJIIIZ();
        }
        return Unit.LIZ;
    }
}
