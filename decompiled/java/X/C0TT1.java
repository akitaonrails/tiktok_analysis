package X;

import com.bytedance.ies.ugc.aweme.commercialize.splash.report.TopViewAdEventLogger;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0TT1, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TT1 {
    public boolean LIZJ;
    public int LIZLLL;
    public String LJ;
    public final Keva LIZ = Keva.getRepo("splash_top_reach_name");
    public final Calendar LIZIZ = Calendar.getInstance();
    public StringBuilder LJFF = new StringBuilder();
    public final ArrayList<C443120HZe<String, String, String>> LJI = new ArrayList<>();

    public final void LIZ() {
        List listLJJLIIIJILLIZJL;
        if (this.LIZJ) {
            return;
        }
        this.LIZJ = true;
        this.LIZLLL = this.LIZ.getInt("saved_splash_show_chance", 0);
        this.LJ = this.LIZ.getString("saved_splash_date", null);
        String string = this.LIZ.getString("saved_splash_show_result", null);
        if (string == null) {
            string = "";
        }
        this.LJFF = new StringBuilder(string);
        this.LJI.clear();
        if (string.length() != 0) {
            try {
                List<String> listLJJLIIIJILLIZJL2 = a0.LJJLIIIJILLIZJL(string, new String[]{","}, 0, 6);
                if (listLJJLIIIJILLIZJL2 == null || listLJJLIIIJILLIZJL2.isEmpty()) {
                    return;
                }
                for (String str : listLJJLIIIJILLIZJL2) {
                    if (str != null && str.length() != 0 && (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{"_"}, 0, 6)) != null && !listLJJLIIIJILLIZJL.isEmpty() && listLJJLIIIJILLIZJL.size() >= 3) {
                        ArrayList<C443120HZe<String, String, String>> arrayList = this.LJI;
                        String str2 = (String) listLJJLIIIJILLIZJL.get(0);
                        str2.toString();
                        String str3 = (String) listLJJLIIIJILLIZJL.get(1);
                        str3.toString();
                        String str4 = (String) listLJJLIIIJILLIZJL.get(2);
                        str4.toString();
                        arrayList.add(new C443120HZe<>(str2, str3, str4));
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public final String LIZJ() {
        return this.LIZIZ.get(1) + "/" + this.LIZIZ.get(2) + "/" + this.LIZIZ.get(5);
    }

    public final void LJI() {
        this.LIZ.storeInt("saved_splash_show_chance", this.LIZLLL);
        this.LIZ.storeString("saved_splash_date", this.LJ);
        this.LIZ.storeString("saved_splash_show_result", this.LJFF.toString());
    }

    public final String LIZIZ() {
        LIZ();
        if (Intrinsics.LJFF(LIZJ(), this.LJ)) {
            return this.LJFF.toString();
        }
        return null;
    }

    public final int LIZLLL() {
        LIZ();
        String strLIZJ = LIZJ();
        if (!Intrinsics.LJFF(strLIZJ, this.LJ)) {
            this.LJ = strLIZJ;
            this.LIZLLL = 0;
            this.LJFF.setLength(0);
            this.LJI.clear();
        }
        return this.LIZLLL;
    }

    public static final void LJFF(Aweme aweme) {
        TopViewAdEventLogger.LJJIIZ().logAd(C1018060cbE.LJIILJJIL, aweme.getAwemeRawAd(), new AwS595S0100000_16(aweme, 364));
    }

    public final void LJ(String str, String str2) {
        if (str == null) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        if (str2 == null) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ();
        String strLIZJ = LIZJ();
        if (!Intrinsics.LJFF(strLIZJ, this.LJ)) {
            this.LJ = strLIZJ;
            this.LIZLLL = 0;
            this.LJFF.setLength(0);
            this.LJI.clear();
        }
        int i = this.LIZLLL + 1;
        this.LIZLLL = i;
        String strValueOf = String.valueOf(i);
        int size = this.LJI.size();
        if (size > 0) {
            int i2 = size - 1;
            C443120HZe c443120HZe = (C443120HZe) ListProtector.get(this.LJI, i2);
            Object first = c443120HZe.getFirst();
            Object second = c443120HZe.getSecond();
            if (Intrinsics.LJFF(CardStruct.IStatusCode.DEFAULT, first) && Intrinsics.LJFF(CardStruct.IStatusCode.DEFAULT, second)) {
                ListProtector.set(this.LJI, i2, new C443120HZe(str, str2, strValueOf));
                StringBuilder sb = new StringBuilder();
                for (C443120HZe<String, String, String> c443120HZe2 : this.LJI) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(c443120HZe2.getFirst());
                    sbLIZ.append('_');
                    sbLIZ.append(c443120HZe2.getSecond());
                    sbLIZ.append('_');
                    sbLIZ.append(c443120HZe2.getThird());
                    sbLIZ.append(',');
                    sb.append(C2188811AlT.LIZIZ(sbLIZ));
                }
                this.LJFF = sb;
                LJI();
                return;
            }
        }
        this.LJI.add(new C443120HZe<>(str, str2, strValueOf));
        StringBuilder sb2 = this.LJFF;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str);
        sbLIZ2.append('_');
        sbLIZ2.append(str2);
        sbLIZ2.append('_');
        sbLIZ2.append(strValueOf);
        sbLIZ2.append(',');
        sb2.append(C2188811AlT.LIZIZ(sbLIZ2));
        LJI();
    }
}
