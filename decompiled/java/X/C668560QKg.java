package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.ss.android.ugc.aweme.search.pages.sug.core.model.SearchSugResponse;
import defpackage.w8;
import defpackage.y8;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentSkipListMap;
import kotlin.jvm.internal.AFwS196S0000000_10;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0QKg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C668560QKg {
    public static SearchSugResponse LIZIZ;
    public static boolean LIZLLL;
    public static boolean LJ;
    public static final C668560QKg LIZ = new C668560QKg();
    public static volatile w8 LIZJ = new w8();
    public static final C054G LJFF = C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ()));
    public static final C01GW LJI = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(17));

    public static Keva LIZ() {
        return (Keva) LJI.getValue();
    }

    public static int LIZIZ() {
        long j = LIZ().getLong("cache_time", -1L);
        if (j == -1) {
            return 0;
        }
        if (System.currentTimeMillis() - j > C1828907Eh.LIZ() * 60 * LSPassThroughRecordSizeConfig.DEFAULT) {
            return System.currentTimeMillis() - j < 259200000 ? 2 : 3;
        }
        return 1;
    }

    public static SearchSugResponse LIZJ(String str) {
        try {
            return (SearchSugResponse) GsonProtectorUtils.fromJson(C7740030o.LIZ().getGson(), str, SearchSugResponse.class);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static void LIZLLL(SearchSugResponse searchSugResponse) {
        Integer numValueOf;
        if (searchSugResponse == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("insertTire count:");
        List<SearchSugEntity> list = searchSugResponse.sugList;
        if (list != null) {
            numValueOf = Integer.valueOf(list.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        w8 w8Var = new w8();
        System.currentTimeMillis();
        int i = 0;
        for (SearchSugEntity searchSugEntity : searchSugResponse.sugList) {
            int i2 = i + 1;
            String lowerCase = searchSugEntity.content.toLowerCase(Locale.ROOT);
            y8 y8Var = w8Var.LIZ;
            int length = lowerCase.length();
            for (int i3 = 0; i3 < length; i3++) {
                char cCharAt = lowerCase.charAt(i3);
                y8 y8VarLIZIZ = y8Var.LIZIZ(cCharAt);
                if (y8VarLIZIZ == null) {
                    y8VarLIZIZ = new y8();
                    if (y8Var.LJ == null) {
                        y8Var.LJ = Character.valueOf(cCharAt);
                        y8Var.LJFF = y8VarLIZIZ;
                    } else {
                        if (y8Var.LIZ == null) {
                            ConcurrentSkipListMap<Character, y8> concurrentSkipListMap = new ConcurrentSkipListMap<>();
                            Character ch = y8Var.LJ;
                            if (ch != null) {
                                char cCharValue = ch.charValue();
                                y8 y8Var2 = y8Var.LJFF;
                                if (y8Var2 != null) {
                                    concurrentSkipListMap.put(Character.valueOf(cCharValue), y8Var2);
                                }
                            }
                            y8Var.LIZ = concurrentSkipListMap;
                        }
                        ConcurrentSkipListMap<Character, y8> concurrentSkipListMap2 = y8Var.LIZ;
                        if (concurrentSkipListMap2 == null) {
                            concurrentSkipListMap2 = null;
                        }
                        concurrentSkipListMap2.put(Character.valueOf(cCharAt), y8VarLIZIZ);
                    }
                }
                y8Var = y8VarLIZIZ;
            }
            y8Var.LIZIZ = true;
            y8Var.LIZJ = i;
            y8Var.LIZLLL = searchSugEntity;
            i = i2;
        }
        LIZJ = w8Var;
        LIZIZ = searchSugResponse;
    }
}
