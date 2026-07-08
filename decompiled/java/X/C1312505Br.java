package X;

import com.bytedance.android.livesdk.chatroom.ui.extracard.LiveExtraCardFrequencyManager;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.05Br, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.bytedance.android.livesdk.chatroom.ui.extracard.LiveExtraCardFrequencyManager$clearCache$1", f = "LiveExtraCardFrequencyManager.kt", l = {}, m = "invokeSuspend")
public final class C1312505Br extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1312505Br(InterfaceC1364105Vn<? super C1312505Br> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1312505Br(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveExtraCardFrequencyManager@260.clearCache$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            Map<String, Set<String>> map = LiveExtraCardFrequencyManager.LIZJ;
            if (map != null) {
                map.clear();
            }
            LiveExtraCardFrequencyManager.LIZJ = null;
            Set<String> stringSet = LiveExtraCardFrequencyManager.LIZIZ.getStringSet("KEY_CARD_IDS", C08CX.INSTANCE);
            Set<String> setLLIIJI = C13LP.LLIIJI(stringSet);
            for (String str : setLLIIJI) {
                Set<String> stringSet2 = LiveExtraCardFrequencyManager.LIZIZ.getStringSet(str, C08CX.INSTANCE);
                long jCurrentTimeMillis = (System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) - ((long) 1296000);
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                for (String str2 : stringSet2) {
                    if (CastLongProtector.parseLong(str2) < jCurrentTimeMillis) {
                        linkedHashSet.add(str2);
                    }
                }
                stringSet2.removeAll(linkedHashSet);
                if (stringSet2.isEmpty()) {
                    LiveExtraCardFrequencyManager.LIZIZ.erase(str);
                    stringSet.remove(str);
                } else if (!linkedHashSet.isEmpty()) {
                    LiveExtraCardFrequencyManager.LIZIZ.storeStringSet(str, stringSet2);
                }
            }
            if (stringSet.size() != setLLIIJI.size()) {
                LiveExtraCardFrequencyManager.LIZIZ.storeStringSet("KEY_CARD_IDS", stringSet);
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveExtraCardFrequencyManager@260.clearCache$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C1312505Br(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
