package X;

import com.bytedance.android.live.effect.filter.data.ComposerFilterViewModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0U5W, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0U5W {
    public final ComposerFilterViewModel LIZ;
    public final DataChannel LIZIZ;
    public final C19P4 LIZJ;
    public LiveEffect LJ;
    public boolean LJI;
    public final List<LiveEffect> LIZLLL = new ArrayList();
    public final Map<Long, Float> LJFF = new LinkedHashMap();

    public final void LIZ(LiveEffect liveEffect) {
        int i;
        int i2;
        int iLJZ;
        int i3;
        if (!this.LJI) {
            return;
        }
        if (liveEffect == null) {
            C500260Jjc.LJIILIIL(this.LIZJ);
            return;
        }
        if (liveEffect.LJJIJIIJI()) {
            C500260Jjc.LJIILIIL(this.LIZJ);
            return;
        }
        if (C0U7C.LJIIJ(liveEffect) != null) {
            C500260Jjc.LLFFF(this.LIZJ);
            C19P4 c19p4 = this.LIZJ;
            LiveEffect.ComposerConfig composerConfigLJIIJ = C0U7C.LJIIJ(liveEffect);
            if (composerConfigLJIIJ != null) {
                i = composerConfigLJIIJ.maxValue;
            } else {
                i = 100;
            }
            LiveEffect.ComposerConfig composerConfigLJIIJ2 = C0U7C.LJIIJ(liveEffect);
            if (composerConfigLJIIJ2 != null) {
                i2 = composerConfigLJIIJ2.minValue;
            } else {
                i2 = 0;
            }
            float fLJFF = C760630Tsb.LIZ().LJFF(liveEffect);
            if (fLJFF == 0.0f) {
                iLJZ = 0;
            } else {
                iLJZ = C500260Jjc.LJZ(fLJFF * (i - i2));
            }
            c19p4.setPercent(iLJZ);
            C19P4 c19p42 = this.LIZJ;
            LiveEffect.ComposerConfig composerConfigLJIIJ3 = C0U7C.LJIIJ(liveEffect);
            if (composerConfigLJIIJ3 != null) {
                i3 = composerConfigLJIIJ3.defaultValue;
            } else {
                i3 = 0;
            }
            c19p42.LIZJ(100, 0, i3, true);
            return;
        }
        C500260Jjc.LJIILIIL(this.LIZJ);
    }

    public C0U5W(ComposerFilterViewModel composerFilterViewModel, DataChannel dataChannel, C19P4 c19p4) {
        this.LIZ = composerFilterViewModel;
        this.LIZIZ = dataChannel;
        this.LIZJ = c19p4;
    }
}
