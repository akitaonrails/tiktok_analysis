package X;

import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.giftlimitnotification.GiftLimitSettingDialog;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0TXq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class C748480TXq extends C2217421BqW implements Function1<EnumC748580TYa, Unit> {
    public C748480TXq(Object obj) {
        super(1, obj, GiftLimitSettingDialog.class, "switchPage", "switchPage(Lcom/bytedance/android/livesdk/dataChannel/BroadcastDialogPage;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(EnumC748580TYa enumC748580TYa) {
        Fragment fragment;
        EnumC748580TYa enumC748580TYa2 = enumC748580TYa;
        GiftLimitSettingDialog giftLimitSettingDialog = (GiftLimitSettingDialog) this.receiver;
        giftLimitSettingDialog.getClass();
        if (enumC748580TYa2 == EnumC748580TYa.DISMISS) {
            giftLimitSettingDialog.dismiss();
        } else if (C748490TXr.LIZ[enumC748580TYa2.ordinal()] == 1 && (fragment = giftLimitSettingDialog.LLILLL) != null) {
            C19EH c19ehLJIIJ = giftLimitSettingDialog.getChildFragmentManager().LJIIJ();
            if (enumC748580TYa2.getGoNextPage()) {
                c19ehLJIIJ.LJIJJ(R.anim.hf, R.anim.hc);
            } else {
                c19ehLJIIJ.LJIJJ(R.anim.hb, R.anim.hg);
            }
            c19ehLJIIJ.LJIJ(R.id.iye, fragment, null);
            c19ehLJIIJ.LJIIIZ();
        }
        return Unit.LIZ;
    }
}
