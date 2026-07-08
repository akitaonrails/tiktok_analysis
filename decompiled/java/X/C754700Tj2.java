package X;

import com.bytedance.android.livesdk.model.GameTag;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import java.util.Map;

/* JADX INFO: renamed from: X.0Tj2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C754700Tj2 {
    public static Hashtag LIZ;
    public static GameTag LIZIZ;
    public static Hashtag LIZJ;
    public static GameTag LIZLLL;
    public static Hashtag LJ;
    public static GameTag LJFF;
    public static Hashtag LJI;
    public static GameTag LJII;

    public static Hashtag LIZ() {
        Hashtag hashtag = LJ;
        if (hashtag != null) {
            return hashtag;
        }
        String strLIZIZ = InterfaceC772390URp.n.LIZIZ();
        Hashtag hashtag2 = (strLIZIZ == null || strLIZIZ.length() == 0) ? null : (Hashtag) C1516000pYM.LIZ(Hashtag.class, strLIZIZ);
        LJ = hashtag2;
        return hashtag2;
    }

    public static GameTag LIZIZ() {
        GameTag gameTag = LJFF;
        if (gameTag != null) {
            return gameTag;
        }
        String strLIZIZ = InterfaceC772390URp.m.LIZIZ();
        GameTag gameTag2 = null;
        GameTag gameTag3 = !(strLIZIZ == null || strLIZIZ.length() == 0) ? (GameTag) C1516000pYM.LIZ(GameTag.class, strLIZIZ) : null;
        LJFF = gameTag3;
        if (gameTag3 == null) {
            Map<String, String> mapLIZIZ = InterfaceC772390URp.l.LIZIZ();
            if (mapLIZIZ != null && !mapLIZIZ.isEmpty()) {
                gameTag2 = new GameTag(null, null, null, null, 0, null, null, null, null, 511, null);
                String str = mapLIZIZ.get("key_id");
                gameTag2.id = Long.valueOf(str != null ? CastLongProtector.parseLong(str) : 0L);
                String str2 = mapLIZIZ.get("key_show_name");
                if (str2 == null) {
                    str2 = "";
                }
                gameTag2.showName = str2;
                String str3 = mapLIZIZ.get("key_short_name");
                if (str3 == null) {
                    str3 = "";
                }
                gameTag2.shortName = str3;
                String str4 = mapLIZIZ.get("key_full_name");
                gameTag2.fullName = str4 != null ? str4 : "";
            }
            LJFF = gameTag2;
        }
        return LJFF;
    }

    public static Hashtag LIZJ() {
        Hashtag hashtag;
        Hashtag hashtag2 = LIZ;
        if (hashtag2 != null) {
            return hashtag2;
        }
        String strLIZIZ = C0UKZ.LLJJJ.LIZIZ();
        if (strLIZIZ == null || strLIZIZ.length() == 0 || (hashtag = (Hashtag) C1516000pYM.LIZ(Hashtag.class, strLIZIZ)) == null) {
            hashtag = new Hashtag(C0UKZ.LLJJIJI.LIZIZ(), C0UKZ.LLJJIJIIJIL.LIZIZ(), null, 0);
        }
        LIZ = hashtag;
        return hashtag;
    }

    public static void LIZLLL(GameTag gameTag) {
        String strLIZLLL;
        LJFF = gameTag;
        C20337914i1<String> c20337914i1 = InterfaceC772390URp.m;
        if (gameTag == null || (strLIZLLL = C1516000pYM.LIZLLL(gameTag)) == null) {
            strLIZLLL = "";
        }
        c20337914i1.LJFF(strLIZLLL);
    }

    public static void LJ(Hashtag hashtag) {
        String strLIZLLL;
        LIZ = hashtag;
        C20337914i1<String> c20337914i1 = C0UKZ.LLJJJ;
        if (hashtag == null || (strLIZLLL = C1516000pYM.LIZLLL(hashtag)) == null) {
            strLIZLLL = "";
        }
        c20337914i1.LJFF(strLIZLLL);
    }
}
