package X;

import Y.ARunnableS112S0100000_12;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewCampaignWidget;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0UM6, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UM6 implements InterfaceC1143790fs1 {
    public final /* synthetic */ PreviewCampaignWidget LIZ;
    public final /* synthetic */ boolean LIZIZ;
    public final /* synthetic */ long LIZJ;
    public final /* synthetic */ boolean LIZLLL;

    @Override // X.InterfaceC1143790fs1
    public final void onFinish(boolean z) {
        C1836670xtZ c1836670xtZ;
        if (z) {
            final PreviewCampaignWidget previewCampaignWidget = this.LIZ;
            final C1295960jpS c1295960jpS = previewCampaignWidget.LLJIJIL;
            C1295710jp3 c1295710jp3 = new C1295710jp3(c1295960jpS) { // from class: X.0UM7
                @Override // X.C1295710jp3
                public final String LIZ(String str) {
                    if (Intrinsics.LJFF(str, "9")) {
                        return String.valueOf(previewCampaignWidget.LLJJI);
                    }
                    return str;
                }
            };
            C1295960jpS c1295960jpS2 = this.LIZ.LLJIJIL;
            if (c1295960jpS2 != null) {
                c1295960jpS2.setTextDelegate(c1295710jp3);
            }
            try {
                PreviewCampaignWidget previewCampaignWidget2 = this.LIZ;
                C1295960jpS c1295960jpS3 = previewCampaignWidget2.LLJIJIL;
                if (c1295960jpS3 != null) {
                    if (previewCampaignWidget2.context != null) {
                        c1836670xtZ = new C1836670xtZ();
                    } else {
                        c1836670xtZ = null;
                    }
                    c1295960jpS3.setFontAssetDelegate(c1836670xtZ);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (this.LIZIZ) {
                PreviewCampaignWidget previewCampaignWidget3 = this.LIZ;
                C786410Ut5.LJLIIL(this.LIZJ, previewCampaignWidget3.LLJJIJI, new ARunnableS112S0100000_12(previewCampaignWidget3, 408));
                return;
            }
            if (this.LIZLLL) {
                PreviewCampaignWidget previewCampaignWidget4 = this.LIZ;
                C786410Ut5.LJLIIL(this.LIZJ, previewCampaignWidget4.LLJJIJI, new ARunnableS112S0100000_12(previewCampaignWidget4, 409));
                PreviewCampaignWidget previewCampaignWidget5 = this.LIZ;
                C786410Ut5.LJLIIL(this.LIZJ + ((long) DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL), previewCampaignWidget5.LLJJIJI, new ARunnableS112S0100000_12(previewCampaignWidget5, 410));
                return;
            }
            PreviewCampaignWidget previewCampaignWidget6 = this.LIZ;
            C786410Ut5.LJLIIL(this.LIZJ, previewCampaignWidget6.LLJJIJI, new ARunnableS112S0100000_12(previewCampaignWidget6, 411));
        }
    }

    public C0UM6(PreviewCampaignWidget previewCampaignWidget, boolean z, long j, boolean z2) {
        this.LIZ = previewCampaignWidget;
        this.LIZIZ = z;
        this.LIZJ = j;
        this.LIZLLL = z2;
    }
}
