package X;

import com.ss.android.ugc.aweme.autocut.PreloadNLEConfig;
import com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0mzG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1417360mzG implements InterfaceC1417610mzf<Object> {
    public final List<InterfaceC1417610mzf<? extends Object>> LIZ;
    public final C1417340mzE LIZIZ;
    public final C1417460mzQ LIZJ;

    @Override // X.InterfaceC1417610mzf
    public final void LIZ() {
        Iterator<InterfaceC1417610mzf<? extends Object>> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ();
        }
    }

    @Override // X.InterfaceC1417610mzf
    public final void LIZIZ() {
        Iterator<InterfaceC1417610mzf<? extends Object>> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZIZ();
        }
    }

    @Override // X.InterfaceC1417610mzf
    public final void cancel() {
        Iterator<InterfaceC1417610mzf<? extends Object>> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().cancel();
        }
    }

    public C1417360mzG(VideoPublishEditModel videoPublishEditModel, List<AutoCutMediaModel> list, boolean z) {
        C1417340mzE c1417340mzE;
        ArrayList arrayList = new ArrayList();
        this.LIZ = arrayList;
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        PreloadNLEConfig preloadNLEConfig = C1178004jC.LIZ;
        PreloadNLEConfig preloadNLEConfig2 = (PreloadNLEConfig) c0c64LJIILLIIL.LJJII(PreloadNLEConfig.class, preloadNLEConfig, "autocut_selection_preload_NLE_config", true);
        C1417460mzQ c1417460mzQ = null;
        if ((preloadNLEConfig2 != null ? preloadNLEConfig2 : preloadNLEConfig).enable) {
            c1417340mzE = new C1417340mzE(videoPublishEditModel, list, z);
            arrayList.add(c1417340mzE);
        } else {
            c1417340mzE = null;
        }
        this.LIZIZ = c1417340mzE;
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "autocut_selection_preload_cover", true, false)) {
            c1417460mzQ = new C1417460mzQ(videoPublishEditModel);
            arrayList.add(c1417460mzQ);
        }
        this.LIZJ = c1417460mzQ;
    }
}
