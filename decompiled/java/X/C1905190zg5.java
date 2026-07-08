package X;

import android.content.Context;
import android.graphics.drawable.LayerDrawable;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushBanStrategy;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushConfig;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushFreqControlStrategy;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushPopupLimitStrategy;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushUITemplate;
import com.ss.android.ugc.aweme.litemode.LiteModePushConfig;
import com.zhiliaoapp.musically.R;
import java.util.Collections;

/* JADX INFO: renamed from: X.0zg5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1905190zg5 {
    public static void LIZ(InterfaceC1905200zg6 interfaceC1905200zg6) {
        LiteModePushConfig liteModePushConfigLIZ;
        String str;
        int i;
        C1905300zgG.LIZ.getClass();
        if (C1905300zgG.LIZJ() || C1905300zgG.LIZLLL() || (liteModePushConfigLIZ = C1905280zgE.LIZ()) == null) {
            return;
        }
        if ((liteModePushConfigLIZ.pushPlan != interfaceC1905200zg6.LJIIJJI() && (liteModePushConfigLIZ.pushPlan != 2 || interfaceC1905200zg6.LJIIJJI() != 1 || liteModePushConfigLIZ.planBDefaultTurnOn != 1)) || (str = liteModePushConfigLIZ.freqStrategyId) == null) {
            return;
        }
        C1908480zlO c1908480zlO = C1908480zlO.LIZIZ;
        InterfaceC19330810jy interfaceC19330810jyLJIJ = c1908480zlO.LJIJ(interfaceC1905200zg6.LIZJ());
        if (interfaceC19330810jyLJIJ != null) {
            c1908480zlO.LJI(interfaceC19330810jyLJIJ);
        }
        c1908480zlO.LJ(interfaceC1905200zg6.LJFF());
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        if (contextLIZ == null) {
            return;
        }
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
        c419910GdJ.LIZ = R.raw.icon_rocket_fill;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1x);
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(contextLIZ);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
        c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a19);
        c384050F3z.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(200)));
        LayerDrawable layerDrawableLJIILIIL = C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(contextLIZ));
        long jHashCode = str.hashCode();
        int iLIZJ = interfaceC1905200zg6.LIZJ();
        String strLIZLLL = interfaceC1905200zg6.LIZLLL();
        InnerPushUITemplate innerPushUITemplate = new InnerPushUITemplate(0, null, 0, 0, 0, 0, null, null, null, null, null, null, null, Collections.singletonList(layerDrawableLJIILIIL), null, 48, 48, 0.0f, 0.5f, null, 20, 20, null, false, -3, 3, null, 0, 0, 0, Boolean.FALSE, 0, 0, 0, 0, 0, null, null, contextLIZ.getString(interfaceC1905200zg6.LJI()), null, 2, null, 3, contextLIZ.getString(interfaceC1905200zg6.LJ()), null, 36, 48, 4, 0, null, interfaceC1905200zg6.LIZIZ(), 0.5f, null, true, 0, null, null, null, 12, null, null, null, null, null, 0);
        InnerPushPopupLimitStrategy[] innerPushPopupLimitStrategyArr = new InnerPushPopupLimitStrategy[2];
        innerPushPopupLimitStrategyArr[0] = new InnerPushPopupLimitStrategy(jHashCode, 1, interfaceC1905200zg6.LIZ(), null);
        long j = jHashCode + 1;
        InnerPushBanStrategy innerPushBanStrategyLJII = interfaceC1905200zg6.LJII();
        if (innerPushBanStrategyLJII != null) {
            i = innerPushBanStrategyLJII.banByCancelTimes;
        } else {
            i = 3;
        }
        innerPushPopupLimitStrategyArr[1] = new InnerPushPopupLimitStrategy(j, i, 922244979187558L, null);
        new C19323510in(iLIZJ, strLIZLLL, new InnerPushConfig(0L, new InnerPushFreqControlStrategy(C1697810uHb.LJIIJJI(innerPushPopupLimitStrategyArr), interfaceC1905200zg6.LJII()), 10000, C1697810uHb.LJIIJJI(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11), 5), innerPushUITemplate, null, null, 460).LIZIZ();
    }
}
