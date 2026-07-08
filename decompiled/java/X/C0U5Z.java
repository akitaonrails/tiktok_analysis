package X;

import com.bytedance.android.live.effect.datastore.base.BaseEffectViewModel;
import com.bytedance.android.live.effect.filter.data.ComposerFilterViewModel;
import com.bytedance.android.livesdk.livesetting.effect.LiveBeautyFilterRestoreOpt;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.EffectManager;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AwS378S0200000_12;

/* JADX INFO: renamed from: X.0U5Z, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0U5Z implements InterfaceC767150U7l<LiveEffect> {
    public static final C01GW<C0U5Z> LJI = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(351));
    public final List<LiveEffect> LIZ = new ArrayList();
    public Map<String, Double> LIZIZ = new LinkedHashMap();
    public EffectManager LIZJ;
    public final String LIZLLL;
    public ComposerFilterViewModel LJ;
    public AnonymousClass0956 LJFF;

    public final void LJII() {
        this.LJ = null;
        AnonymousClass0956 anonymousClass0956 = this.LJFF;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LJFF = null;
        if (LiveBeautyFilterRestoreOpt.INSTANCE.enable()) {
            ((ArrayList) this.LIZ).clear();
            this.LIZIZ.clear();
            this.LIZJ = null;
        }
    }

    public C0U5Z() {
        String str = C0UD4.LIZ;
        this.LIZLLL = "livefiltercomposerexperiment";
    }

    @Override // X.InterfaceC767150U7l
    public final List<LiveEffect> LIZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC767150U7l
    public final float LIZIZ(int i) {
        LiveEffect liveEffect;
        if (i < ((ArrayList) this.LIZ).size() && i >= 0) {
            liveEffect = (LiveEffect) ListProtector.get(this.LIZ, i);
        } else {
            liveEffect = null;
        }
        return LJFF(liveEffect);
    }

    @Override // X.InterfaceC767150U7l
    public final void LIZJ(int i) {
        C761210TtX.LIZ(i, this.LIZ);
    }

    public final void LJ(LiveEffect liveEffect) {
        ComposerFilterViewModel composerFilterViewModel = this.LJ;
        if (composerFilterViewModel != null) {
            BaseEffectViewModel.vQ2(composerFilterViewModel, liveEffect, new AwS378S0200000_12(this, liveEffect, 70), 28);
        }
    }

    public final float LJFF(LiveEffect liveEffect) {
        String str;
        double dDoubleValue;
        if (liveEffect == null) {
            return 1.0f;
        }
        if (this.LIZIZ.containsKey(liveEffect.LLJLL())) {
            Map<String, Double> map = this.LIZIZ;
            String strLLJLL = liveEffect.LLJLL();
            Double d = this.LIZIZ.get(liveEffect.LLJLL());
            if (d != null) {
                dDoubleValue = d.doubleValue();
            } else {
                dDoubleValue = 1.0d;
            }
            map.put(strLLJLL, Double.valueOf(dDoubleValue));
            Double d2 = this.LIZIZ.get(liveEffect.LLJLL());
            if (d2 == null) {
                return 0.0f;
            }
            return (float) d2.doubleValue();
        }
        if (this.LIZIZ.containsKey(liveEffect.getResourceId())) {
            Double d3 = this.LIZIZ.get(liveEffect.getResourceId());
            if (d3 == null) {
                return 0.0f;
            }
            return (float) d3.doubleValue();
        }
        C0U78 c0u78LIZ = C0UA1.LIZ();
        String resourceId = liveEffect.getResourceId();
        LiveEffect.ComposerConfig composerConfigLJIIJ = C0U7C.LJIIJ(liveEffect);
        if (composerConfigLJIIJ == null || (str = composerConfigLJIIJ.tag) == null) {
            str = "";
        }
        Float fLJIJ = c0u78LIZ.LJIJ(resourceId, str);
        if (fLJIJ != null) {
            return fLJIJ.floatValue();
        }
        LiveEffect.ComposerConfig composerConfigLJIIJ2 = C0U7C.LJIIJ(liveEffect);
        if (composerConfigLJIIJ2 == null) {
            return 1.0f;
        }
        int i = composerConfigLJIIJ2.maxValue;
        int i2 = composerConfigLJIIJ2.minValue;
        int i3 = composerConfigLJIIJ2.defaultValue;
        if (i3 == 0) {
            return 0.0f;
        }
        return (i3 * 1.0f) / (i - i2);
    }

    public final boolean LJI(LiveEffect liveEffect) {
        if (liveEffect == null) {
            return false;
        }
        if (liveEffect.LJJIJIIJI()) {
            return true;
        }
        ComposerFilterViewModel composerFilterViewModel = this.LJ;
        if (composerFilterViewModel == null) {
            return false;
        }
        return composerFilterViewModel.yQ2(liveEffect);
    }

    public final void LIZLLL(LiveEffect liveEffect, Float f) {
        String strLLJLL;
        String strLJLL;
        if (f == null || Float.isNaN(f.floatValue()) || Float.isInfinite(f.floatValue()) || (strLLJLL = liveEffect.LLJLL()) == null || (strLJLL = liveEffect.LJLL()) == null) {
            return;
        }
        String resourceId = liveEffect.getResourceId();
        this.LIZIZ.put(strLLJLL, Double.valueOf(f.floatValue()));
        this.LIZIZ.put(resourceId, Double.valueOf(f.floatValue()));
        C0UA1.LIZ().LJIL(C0UG7.LIZJ(C0U7C.LJIIJ(liveEffect), f.floatValue()), liveEffect, strLJLL);
    }
}
