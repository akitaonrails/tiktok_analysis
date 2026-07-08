package X;

import Y.AObjectS312S0200000_12;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.common.setting.PlayEffectSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.depend.model.effect.LiveEffectOld;
import com.bytedance.android.livesdkapi.host.IHostCreativeTool;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS199S0000000_12;
import webcast.data.EffectStruct;

/* JADX INFO: renamed from: X.0Tur, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C762030Tur {
    public static final C01GW LIZ = C292401Bi.LIZ(AFwS199S0000000_12.get$arr$(535));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(536));
    public static String LIZJ = "";

    public static void LIZ(LiveEffect liveEffect, String str) {
        String resourceId;
        if (liveEffect != null && (resourceId = liveEffect.getResourceId()) != null) {
            C098J c098j = (C098J) LIZIZ.getValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append('_');
            sbLIZ.append(resourceId);
            sbLIZ.append('$');
            c098j.put(C2188811AlT.LIZIZ(sbLIZ), liveEffect);
        }
    }

    public static LiveEffectOld LIZIZ(EffectStruct effectStruct, String str) {
        if (effectStruct == null) {
            return null;
        }
        LiveEffectOld liveEffectOld = new LiveEffectOld();
        try {
            liveEffectOld.LLIIZ(CastLongProtector.parseLong(effectStruct.effectId));
            liveEffectOld.LJFF = effectStruct.id;
            liveEffectOld.LJI = effectStruct.resourceId;
            liveEffectOld.LJJLJ(effectStruct.panel);
            liveEffectOld.setExtra(effectStruct.extra);
            liveEffectOld.LJIILLIIL = str;
            C189200o6.m2constructorimpl(Unit.LIZ);
            return liveEffectOld;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return liveEffectOld;
        }
    }

    public static void LIZJ(String str, String str2, EnumC771350UNp enumC771350UNp, Function1 function1) {
        if (str2 == null || enumC771350UNp == null) {
            return;
        }
        C207209166l c207209166l = new C207209166l(str, enumC771350UNp, null, null, str2, null, false, 1, true, 236);
        C207232167i.LIZIZ(c207209166l, new AObjectS312S0200000_12(function1, c207209166l, 6));
    }

    public static void LIZLLL(InterfaceC497601wk interfaceC497601wk, String str, String str2, InterfaceC760840Tsw interfaceC760840Tsw) {
        Object objPutIfAbsent;
        C098J c098j = (C098J) LIZIZ.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(str2);
        sbLIZ.append('$');
        LiveEffect liveEffect = (LiveEffect) c098j.get(C2188811AlT.LIZIZ(sbLIZ));
        if (liveEffect != null) {
            interfaceC760840Tsw.LIZ(liveEffect);
            return;
        }
        if (!((IHostCreativeTool) C1161920gLG.LIZJ(IHostCreativeTool.class)).ni()) {
            if (!PlayEffectSetting.INSTANCE.isEnable()) {
                interfaceC760840Tsw.onFail();
                return;
            }
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) LIZ.getValue();
            Object c760830Tsv = concurrentHashMap.get(str2);
            if (c760830Tsv == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(str2, (c760830Tsv = new C760830Tsv(System.currentTimeMillis())))) != null) {
                c760830Tsv = objPutIfAbsent;
            }
            C760830Tsv c760830Tsv2 = (C760830Tsv) c760830Tsv;
            if (System.currentTimeMillis() - c760830Tsv2.LIZ > 86400000) {
                c760830Tsv2.LIZ = System.currentTimeMillis();
                c760830Tsv2.LIZIZ = 0;
            }
            if (c760830Tsv2.LIZIZ >= 3) {
                interfaceC760840Tsw.onFail();
                return;
            } else {
                C23250099c.LIZLLL(interfaceC497601wk, C0PEM.LIZJ, null, new C760820Tsu(str2, str, interfaceC760840Tsw, null), 2);
                return;
            }
        }
        C23250099c.LIZLLL(interfaceC497601wk, C0PEM.LIZJ, null, new C760780Tsq(str, str2, interfaceC760840Tsw, null), 2);
    }
}
