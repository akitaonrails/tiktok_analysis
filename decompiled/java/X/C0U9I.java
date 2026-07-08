package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.depend.model.effect.LiveEffectOld;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: renamed from: X.0U9I, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0U9I {
    public static final void LIZ(List<LiveEffect> list) {
        if (!list.isEmpty()) {
            int i = C0U9H.LIZ[((LiveEffect) ListProtector.get(list, 0)).LJLIL().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    LiveEffectOld liveEffectOld = new LiveEffectOld();
                    liveEffectOld.LJJLJ = C0U9E.NO_RESULT_TIP;
                    liveEffectOld.LLIIIILZ = C0U6H.RECOMMEND;
                    ListProtector.add(list, 0, liveEffectOld);
                    return;
                }
                LiveEffectOld liveEffectOld2 = new LiveEffectOld();
                liveEffectOld2.LJJLJ = C0U9E.NO_RESULT_TIP;
                liveEffectOld2.LLIIIILZ = C0U6H.RECOMMEND;
                ListProtector.set(list, 0, liveEffectOld2);
            }
        }
    }

    public static final void LIZIZ(List<LiveEffect> list) {
        if (!list.isEmpty()) {
            int i = C0U9H.LIZ[((LiveEffect) ListProtector.get(list, 0)).LJLIL().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    LiveEffectOld liveEffectOld = new LiveEffectOld();
                    liveEffectOld.LJJLJ = C0U9E.TRENDING_TIP;
                    liveEffectOld.LLIIIILZ = C0U6H.RECOMMEND;
                    ListProtector.add(list, 0, liveEffectOld);
                    return;
                }
                return;
            }
            LiveEffectOld liveEffectOld2 = new LiveEffectOld();
            liveEffectOld2.LJJLJ = C0U9E.TRENDING_TIP;
            liveEffectOld2.LLIIIILZ = C0U6H.RECOMMEND;
            ListProtector.set(list, 0, liveEffectOld2);
        }
    }

    public static final void LIZJ(List<LiveEffect> list) {
        if (!list.isEmpty()) {
            if (((LiveEffect) ListProtector.get(list, 0)).LJLIL() == C0U9E.TRENDING_TIP) {
                ListProtector.remove(list, 0);
            }
            if (((LiveEffect) ListProtector.get(list, 0)).LJLIL() == C0U9E.NO_RESULT_TIP) {
                ListProtector.remove(list, 0);
            }
        }
    }
}
