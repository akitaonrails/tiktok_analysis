package Y;

import X.AbstractC214793194d;
import X.AbstractC214814194y;
import X.C0PEM;
import X.C1443030nef;
import X.C1443540nfU;
import X.C1450080nq2;
import X.C19EG;
import X.C1C7U;
import X.C201955140j;
import X.C2296808zG;
import X.C23250099c;
import X.C2471109mH;
import X.C573020Mdg;
import android.os.Bundle;
import com.bytedance.scene.navigation.NavigationScene;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.external.ability.IPageToFinish;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import com.ss.android.ugc.tiktok.tools.performance.api.settings.DeferEnterAnimEndConfig;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class ARunnableS2S0410000_8 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public boolean z4;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService == null || !creativeToolsPluginService.LIZJ((C19EG) this.l0, "OpenPhotoNextServiceImpl", true)) {
            C201955140j.LJIIIIZZ(C1450080nq2.LIZIZ, "OpenPhotoNextServiceImpl", "ve plugin not ready");
            return;
        }
        C573020Mdg c573020Mdg = new C573020Mdg((C19EG) this.l0, this.z4, false);
        ShortVideoContext shortVideoContextLIZIZ = C1443540nfU.LIZIZ((Bundle) this.l1);
        C1443030nef c1443030nefLJII = C1443030nef.LJII();
        String str = shortVideoContextLIZIZ.shootWay;
        c1443030nefLJII.LIZIZ = str;
        c1443030nefLJII.LIZJ = str;
        C1443030nef.LJII().LIZLLL = shortVideoContextLIZIZ.mShootFrom;
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C2471109mH(((Bundle) this.l1).getBoolean("need_copy_to_creative_path", false), shortVideoContextLIZIZ, (List) this.l2, c573020Mdg, (IPageToFinish) this.l3, (Bundle) this.l1, null), 3);
    }

    public final void LIZ$1() {
        ARunnableS77S0200000_8 aRunnableS77S0200000_8 = new ARunnableS77S0200000_8((AbstractC214814194y) this.l1, (NavigationScene) this.l3, 37);
        if (this.z4 && ((DeferEnterAnimEndConfig) this.l0).getDeferType() == 2) {
            new SafeHandler((AbstractC214814194y) this.l1).postDelayed(aRunnableS77S0200000_8, ((DeferEnterAnimEndConfig) this.l0).getDeferTime());
        } else {
            aRunnableS77S0200000_8.run();
        }
        ((AbstractC214793194d) this.l2).LJIIIIZZ(null);
    }

    public static final void run$0(ARunnableS2S0410000_8 aRunnableS2S0410000_8) {
        boolean zLIZ;
        C1C7U.LIZ("OpenPhotoNextServiceImpl@40cd.gotoNextPage$1");
        try {
            aRunnableS2S0410000_8.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("OpenPhotoNextServiceImpl@40cd.gotoNextPage$1");
    }

    public static final void run$1(ARunnableS2S0410000_8 aRunnableS2S0410000_8) {
        boolean zLIZ;
        C1C7U.LIZ("SAALauncher@a6aa.launchPageInSAAActivityInternal$pushScene$1");
        try {
            aRunnableS2S0410000_8.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SAALauncher@a6aa.launchPageInSAAActivityInternal$pushScene$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ARunnableS2S0410000_8(Object obj, C19EG c19eg, boolean z, Bundle bundle, List<String> list, IPageToFinish iPageToFinish) {
        this.$t = iPageToFinish;
        this.l0 = obj;
        this.z4 = c19eg;
        this.l1 = z;
        this.l2 = bundle;
        this.l3 = list;
    }
}
