package X;

import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.adminsetting.LiveBroadcastEndAdminSettingDialog;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0TXu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class C748520TXu extends C2217421BqW implements Function1<EnumC748580TYa, Unit> {
    public C748520TXu(Object obj) {
        super(1, obj, LiveBroadcastEndAdminSettingDialog.class, "switchPage", "switchPage(Lcom/bytedance/android/livesdk/dataChannel/BroadcastDialogPage;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(EnumC748580TYa enumC748580TYa) {
        Fragment fragmentMR;
        EnumC748580TYa enumC748580TYa2 = enumC748580TYa;
        LiveBroadcastEndAdminSettingDialog liveBroadcastEndAdminSettingDialog = (LiveBroadcastEndAdminSettingDialog) this.receiver;
        if (liveBroadcastEndAdminSettingDialog.isAdded() && liveBroadcastEndAdminSettingDialog.getHost() != null && (fragmentMR = liveBroadcastEndAdminSettingDialog.MR(enumC748580TYa2)) != null) {
            C19EH c19ehLJIIJ = liveBroadcastEndAdminSettingDialog.getChildFragmentManager().LJIIJ();
            if (enumC748580TYa2.getGoNextPage()) {
                c19ehLJIIJ.LJIJJ(R.anim.hf, R.anim.hc);
            } else {
                c19ehLJIIJ.LJIJJ(R.anim.hb, R.anim.hg);
            }
            c19ehLJIIJ.LJIJ(R.id.aic, fragmentMR, null);
            c19ehLJIIJ.LJIIIZ();
        }
        return Unit.LIZ;
    }
}
