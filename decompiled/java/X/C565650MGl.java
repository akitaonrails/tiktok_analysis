package X;

import android.os.Bundle;
import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.onthisday.material.MaterialSelectPagingScene;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.onthisday.material.MaterialSelectScene;

/* JADX INFO: renamed from: X.0MGl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C565650MGl {
    public static void LIZ(final Scene scene, Bundle bundle, final Integer num, int i, int i2) {
        C19AL c19alLIZ;
        Scene materialSelectScene;
        if (num != null) {
            C569760MWg c569760MWg = new C569760MWg();
            c569760MWg.LIZIZ = new AbstractC565380MFk(num) { // from class: X.0MGk
                public final /* synthetic */ Integer LIZIZ;

                @Override // X.InterfaceC363130ELn
                public final void onResult(Object obj) {
                    AbstractC214814194y abstractC214814194y;
                    C0MFN c0mfn;
                    Scene scene2 = this.LIZ;
                    if ((scene2 instanceof AbstractC214814194y) && (abstractC214814194y = (AbstractC214814194y) scene2) != null && (obj instanceof C0MFN) && (c0mfn = (C0MFN) obj) != null) {
                        Integer num2 = this.LIZIZ;
                        if (!abstractC214814194y.onInterceptActivityResult(num2.intValue(), c0mfn.LIZ, c0mfn.LIZIZ)) {
                            abstractC214814194y.onActivityResult(num2.intValue(), c0mfn.LIZ, c0mfn.LIZIZ);
                        }
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(this.LIZ);
                    this.LIZIZ = num;
                }
            };
            c19alLIZ = c569760MWg.LIZ();
        } else {
            c19alLIZ = null;
        }
        NavigationScene navigationSceneLIZIZ = C1447800nmM.LIZIZ(scene);
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "enable_eoy_material_recall_all", true, false) && i == 2 && i2 == 2) {
            materialSelectScene = new MaterialSelectPagingScene();
        } else {
            materialSelectScene = new MaterialSelectScene();
        }
        materialSelectScene.mArguments = bundle;
        navigationSceneLIZIZ.LLLLLLLLLL(materialSelectScene, c19alLIZ);
    }
}
