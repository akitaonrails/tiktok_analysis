package X;

import androidx.fragment.app.Fragment;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.livesdk.hashtag.PreviewHashtagDialog;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0TjC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class C754800TjC extends C2217421BqW implements Function1<EnumC754820TjE, Unit> {
    public C754800TjC(Object obj) {
        super(1, obj, PreviewHashtagDialog.class, "switchPage", "switchPage(Lcom/bytedance/android/livesdk/dataChannel/HashtagDialogPage;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(EnumC754820TjE enumC754820TjE) throws Throwable {
        Fragment fragmentNR;
        EnumC754820TjE enumC754820TjE2 = enumC754820TjE;
        PreviewHashtagDialog previewHashtagDialog = (PreviewHashtagDialog) this.receiver;
        previewHashtagDialog.getClass();
        if (enumC754820TjE2 == EnumC754820TjE.FINISH) {
            DataChannel dataChannel = previewHashtagDialog.dataChannel;
            if (dataChannel != null && Intrinsics.LJFF(dataChannel.gg0(C754830TjF.class), Boolean.TRUE)) {
                ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).setAgeRestricted(previewHashtagDialog.dataChannel);
            }
            previewHashtagDialog.dismiss();
        } else {
            C19EH c19ehLJIIJ = previewHashtagDialog.getChildFragmentManager().LJIIJ();
            if (enumC754820TjE2 != EnumC754820TjE.GO_BACK) {
                int i = C754810TjD.LIZ[enumC754820TjE2.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        fragmentNR = previewHashtagDialog.MR();
                    }
                    previewHashtagDialog.NR().setUserVisibleHint(false);
                } else {
                    fragmentNR = previewHashtagDialog.NR();
                }
                if (fragmentNR != null) {
                    c19ehLJIIJ.LJIJJ(R.anim.hf, R.anim.hc);
                    if (fragmentNR.isAdded()) {
                        c19ehLJIIJ.LJJIFFI(fragmentNR);
                    } else {
                        c19ehLJIIJ.LIZIZ(R.id.aic, fragmentNR);
                    }
                }
                previewHashtagDialog.NR().setUserVisibleHint(false);
            } else {
                Fragment fragment = (Fragment) C13LP.LJJJLZIJ(r1.size() - 1, previewHashtagDialog.getChildFragmentManager().LJJLIIIJL());
                if (fragment != null) {
                    c19ehLJIIJ.LJIJJ(R.anim.hb, R.anim.hg);
                    c19ehLJIIJ.LJIILL(fragment);
                }
                previewHashtagDialog.NR().setUserVisibleHint(true);
            }
            c19ehLJIIJ.LJIIIZ();
        }
        return Unit.LIZ;
    }
}
