package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.ss.android.ugc.aweme.tako.signal.ITakoSignalService;
import com.ss.android.ugc.aweme.tako.signal.impl.TakoContextAbilityImpl;
import java.util.Map;

/* JADX INFO: renamed from: X.0yZx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1862950yZx implements C14FC {
    public static final C1862950yZx LIZ = new C1862950yZx();

    @Override // X.C14FC
    public final C1862940yZw LIZ() {
        ITakoSignalService iTakoSignalService;
        TakoContextAbilityImpl takoContextAbilityImplLIZIZ;
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        Map<String, String> map;
        if (!C07B2.LIZ() || (iTakoSignalService = (ITakoSignalService) PluggableExtentionKt.pluggableSpi$default(ITakoSignalService.class, false, false, false, 14, null)) == null || (takoContextAbilityImplLIZIZ = iTakoSignalService.LIZIZ()) == null || (c13lcT71 = takoContextAbilityImplLIZIZ.T71()) == null || (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) == null || (map = c1863850ybP.LLJLL) == null) {
            return null;
        }
        return LIZLLL(map);
    }

    public static C1862940yZw LIZIZ(Map map) {
        if (!C07B2.LIZ() || map == null) {
            return null;
        }
        return LIZLLL(map);
    }

    public static C1862940yZw LIZJ(InterfaceC665370Q7z interfaceC665370Q7z) {
        ITakoContextAbility iTakoContextAbility;
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        Map<String, String> map;
        if (!C07B2.LIZ() || (iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ(interfaceC665370Q7z, ITakoContextAbility.class, null)) == null || (c13lcT71 = iTakoContextAbility.T71()) == null || (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) == null || (map = c1863850ybP.LLJLL) == null) {
            return null;
        }
        return LIZLLL(map);
    }

    public static C1862940yZw LIZLLL(Map map) {
        String str;
        String str2;
        String str3 = (String) map.get("word_id");
        if (str3 == null || str3.length() <= 0 || (str = (String) map.get("words_content")) == null || str.length() <= 0 || (str2 = (String) map.get("impr_id")) == null || str2.length() <= 0) {
            return null;
        }
        return new C1862940yZw(str3, str, str2);
    }
}
