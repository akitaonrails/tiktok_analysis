package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.anchor.CountDownForAllV2AnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.anchor.CountDownForAllV2AnchorWidget;
import com.bytedance.android.livesdk.model.CountDownForAllEntryClickEvent;
import com.bytedance.android.livesdk.model.CountdownForAllConfigWrapper;

/* JADX INFO: renamed from: X.01Il, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C310901Il implements InterfaceC311801Iu {
    public final /* synthetic */ CountDownForAllV2AnchorWidget LIZ;

    public final void LIZIZ() {
        C310701Ij<CountDownForAllEntryClickEvent, CountdownForAllConfigWrapper> c310701Ij;
        CountDownForAllV2AnchorViewModel countDownForAllV2AnchorViewModel = (CountDownForAllV2AnchorViewModel) this.LIZ.LL;
        if (countDownForAllV2AnchorViewModel == null || (c310701Ij = countDownForAllV2AnchorViewModel.LLILZ) == null) {
            return;
        }
        c310701Ij.LIZIZ();
    }

    public C310901Il(CountDownForAllV2AnchorWidget countDownForAllV2AnchorWidget) {
        this.LIZ = countDownForAllV2AnchorWidget;
    }

    @Override // X.InterfaceC311801Iu
    public final void LIZ(int i) {
        C310701Ij<CountDownForAllEntryClickEvent, CountdownForAllConfigWrapper> c310701Ij;
        C946050aj5 c946050aj5LIZ;
        CountDownForAllV2AnchorViewModel countDownForAllV2AnchorViewModel = (CountDownForAllV2AnchorViewModel) this.LIZ.LL;
        if (countDownForAllV2AnchorViewModel != null && (c310701Ij = countDownForAllV2AnchorViewModel.LLILZ) != null && (c946050aj5LIZ = c310701Ij.LIZ()) != null) {
            c946050aj5LIZ.LIZIZ(i);
        }
    }
}
