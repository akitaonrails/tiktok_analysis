package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.SimplifyCameraPermissionExperiment;
import com.ss.android.ugc.aweme.experiment.SimplifyCameraPermissionExperimentV2Gif;
import com.ss.android.ugc.aweme.experiment.SimplifyPermissionFixKillSwitch;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tMj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1662550tMj extends AbstractC1664490tPr<C1662500tMe, C1662570tMl> implements InterfaceC523020KfE {
    public final C385670FAf<Boolean> LLJJJIL;
    public final C385670FAf<Boolean> LLJJJJ;
    public final ShortVideoContext LLJJJJJIL;
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 335));
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 334));
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 336));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 338));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 337));
    public final Keva LLJLILLLLZIIL = Keva.getRepo("show_permission_statement_repo");
    public final Keva LLJLL = Keva.getRepo("simplify_show_permission_non_first_page_repo");
    public boolean LLJLLIL;

    public static boolean LLLLLJIL() {
        return SimplifyPermissionFixKillSwitch.INSTANCE.enable() && !SimplifyCameraPermissionExperiment.isEnabled() && SimplifyCameraPermissionExperimentV2Gif.isEnabled();
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (LLLLLJIL()) {
            Keva keva = C1662830tNB.LLLZLZ;
            if (!C1488120opO.LIZIZ()) {
                LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0tMf
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return ((C1662500tMe) obj).LJIIL;
                    }
                }, Lifecycle.State.STARTED, new AwS604S0100000_25(this, 199));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009a  */
    @Override // X.AbstractC1664490tPr, com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r7) {
        /*
            r6 = this;
            super.onCreate(r7)
            boolean r0 = com.ss.android.ugc.aweme.experiment.SimplifyCameraPermissionExperiment.isEnabled()
            r3 = 1
            java.lang.String r1 = "SimplifyPermissionFirstAuthorizationUIPanelSceneV2"
            r5 = 0
            r4 = 2131368462(0x7f0a1a0e, float:1.8356875E38)
            if (r0 != 0) goto L1c
            boolean r0 = com.ss.android.ugc.aweme.experiment.SimplifyCameraPermissionExperimentV2Gif.isEnabled()
            if (r0 == 0) goto L79
            boolean r0 = LLLLLJIL()
            if (r0 != 0) goto L79
        L1c:
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r6.LLJJJJJIL
            java.lang.String r2 = r0.shootWay
            java.lang.String r0 = "story"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
            if (r0 != 0) goto L79
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r6.LLJJJJJIL
            java.lang.String r2 = r0.shootWay
            java.lang.String r0 = "chat_shoot"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
            if (r0 != 0) goto L79
            boolean r0 = com.ss.android.ugc.aweme.experiment.SimplifyCameraPermissionExperimentV2Gif.isEnabled()
            java.lang.String r2 = "simplify_show_permission_non_first_page"
            if (r0 == 0) goto L55
            com.bytedance.keva.Keva r0 = X.C1662830tNB.LLLZLZ
            boolean r0 = X.C1488120opO.LIZIZ()
            if (r0 != 0) goto L55
            X.01GW r0 = r6.LLJLIL
            java.lang.Object r0 = r0.getValue()
            com.bytedance.scene.Scene r0 = (com.bytedance.scene.Scene) r0
            r6.add(r4, r0, r1)
        L4f:
            com.bytedance.keva.Keva r0 = r6.LLJLL
            r0.storeBoolean(r2, r3)
            return
        L55:
            com.bytedance.keva.Keva r0 = r6.LLJLL
            boolean r0 = r0.getBoolean(r2, r5)
            if (r0 == 0) goto L6b
            X.01GW r0 = r6.LLJL
            java.lang.Object r1 = r0.getValue()
            com.bytedance.scene.Scene r1 = (com.bytedance.scene.Scene) r1
            java.lang.String r0 = "SimplifyPermissionNonFirstAuthorizationUIPanelScene"
            r6.add(r4, r1, r0)
            goto L4f
        L6b:
            X.01GW r0 = r6.LLJJLIIIJLLLLLLLZ
            java.lang.Object r1 = r0.getValue()
            com.bytedance.scene.Scene r1 = (com.bytedance.scene.Scene) r1
            java.lang.String r0 = "SimplifyPermissionFirstAuthorizationUIPanelScene"
            r6.add(r4, r1, r0)
            goto L4f
        L79:
            boolean r0 = LLLLLJIL()
            java.lang.String r2 = "show_permission_page"
            if (r0 == 0) goto L9a
            com.bytedance.keva.Keva r0 = X.C1662830tNB.LLLZLZ
            boolean r0 = X.C1488120opO.LIZIZ()
            if (r0 != 0) goto L9a
            X.01GW r0 = r6.LLJLIL
            java.lang.Object r0 = r0.getValue()
            com.bytedance.scene.Scene r0 = (com.bytedance.scene.Scene) r0
            r6.add(r4, r0, r1)
        L94:
            com.bytedance.keva.Keva r0 = r6.LLJLILLLLZIIL
            r0.storeBoolean(r2, r3)
            return
        L9a:
            boolean r0 = X.C256040A1q.LIZ()
            if (r0 == 0) goto Lb6
            com.bytedance.keva.Keva r0 = r6.LLJLILLLLZIIL
            boolean r0 = r0.getBoolean(r2, r5)
            if (r0 == 0) goto Lb6
            X.01GW r0 = r6.LLJJL
            java.lang.Object r1 = r0.getValue()
            com.bytedance.scene.Scene r1 = (com.bytedance.scene.Scene) r1
            java.lang.String r0 = "MusicShareToStoryUIPanelScene"
            r6.add(r4, r1, r0)
            goto L94
        Lb6:
            X.01GW r0 = r6.LLJJJJLIIL
            java.lang.Object r1 = r0.getValue()
            com.bytedance.scene.Scene r1 = (com.bytedance.scene.Scene) r1
            java.lang.String r0 = "RecordPermissionUIScene"
            r6.add(r4, r1, r0)
            goto L94
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1662550tMj.onCreate(android.os.Bundle):void");
    }

    public C1662550tMj(C385670FAf<Boolean> c385670FAf, C385670FAf<Boolean> c385670FAf2, ShortVideoContext shortVideoContext) {
        this.LLJJJIL = c385670FAf;
        this.LLJJJJ = c385670FAf2;
        this.LLJJJJJIL = shortVideoContext;
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if ((SimplifyCameraPermissionExperiment.isEnabled() || SimplifyCameraPermissionExperimentV2Gif.isEnabled()) && !Intrinsics.LJFF(this.LLJJJJJIL.shootWay, "story") && !Intrinsics.LJFF(this.LLJJJJJIL.shootWay, "chat_shoot")) {
            return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.erg, viewGroup, false);
        }
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.erf, viewGroup, false);
    }
}
