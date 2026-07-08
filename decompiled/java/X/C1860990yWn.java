package X;

import Y.ARunnableS1S1500000_10;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoVideoItem;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0yWn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1860990yWn {
    public static final void LIZ(SmartImageView smartImageView, TakoVideoItem takoVideoItem, String str, Map<String, String> map, C1861010yWp c1861010yWp, Pair<Integer, Integer> pair) {
        Runnable runnable;
        C01GW c01gw = C18080076g.LIZ;
        if (((Number) c01gw.getValue()).intValue() != -1 && C18080076g.LIZ() <= 0) {
            LIZIZ(smartImageView, takoVideoItem, str, map, c1861010yWp, pair);
            return;
        }
        Object tag = smartImageView.getTag(R.id.xdd);
        if ((tag instanceof Runnable) && (runnable = (Runnable) tag) != null) {
            HandlerHook.viewRemoveCallbacks(smartImageView, runnable);
            smartImageView.setTag(R.id.xdd, null);
        }
        if (((Number) c01gw.getValue()).intValue() == -1) {
            return;
        }
        ARunnableS1S1500000_10 aRunnableS1S1500000_10 = new ARunnableS1S1500000_10(smartImageView, takoVideoItem, C2097608Jq.LJIILIIL(map, new Pair("video_cover_load_delay_ms", String.valueOf(C18080076g.LIZ()))), c1861010yWp, pair, str, 1);
        smartImageView.setTag(R.id.xdd, aRunnableS1S1500000_10);
        HandlerHook.viewPostDelay(smartImageView, aRunnableS1S1500000_10, C18080076g.LIZ());
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0223  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(com.bytedance.lighten.loader.SmartImageView r9, com.ss.android.ugc.aweme.tako.ccl.model.api.TakoVideoItem r10, java.lang.String r11, java.util.Map<java.lang.String, java.lang.String> r12, X.C1861010yWp r13, kotlin.Pair<java.lang.Integer, java.lang.Integer> r14) {
        /*
            Method dump skipped, instruction units count: 615
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1860990yWn.LIZIZ(com.bytedance.lighten.loader.SmartImageView, com.ss.android.ugc.aweme.tako.ccl.model.api.TakoVideoItem, java.lang.String, java.util.Map, X.0yWp, kotlin.Pair):void");
    }
}
