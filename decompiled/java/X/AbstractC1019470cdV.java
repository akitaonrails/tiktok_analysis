package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cdV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractC1019470cdV {
    public final String LIZ;
    public int LJ;
    public int LJFF;
    public String LIZIZ = "";
    public int LIZJ = -1;
    public int LIZLLL = -1;
    public String LJI = "";
    public HashMap<String, C1019500cdY> LJII = new HashMap<>();
    public HashSet<String> LJIIIIZZ = new HashSet<>();
    public final HashSet<String> LJIIIZ = new HashSet<>();
    public String LJIIJ = "";

    public void LJ() {
        if (!TextUtils.isEmpty(this.LJI) && !TextUtils.equals(this.LJI, C1024180cl6.LIZIZ())) {
            this.LJIIIIZZ = new HashSet<>();
            this.LJII = new HashMap<>();
        }
        String strLIZIZ = C1024180cl6.LIZIZ();
        this.LJI = strLIZIZ;
        if (!Intrinsics.LJFF(C1019270cdB.LIZLLL, strLIZIZ)) {
            C1019270cdB.LIZLLL = strLIZIZ;
            C1019270cdB.LIZJ();
        }
        this.LIZIZ = C1019270cdB.LIZIZ;
        this.LIZJ = -1;
        this.LIZLLL = -1;
        this.LJFF = 0;
        this.LJ = 0;
        this.LJIIJ = "";
    }

    public AbstractC1019470cdV(String str) {
        this.LIZ = str;
    }

    public boolean LIZ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (!aweme.isAd() || (awemeRawAd = aweme.getAwemeRawAd()) == null || awemeRawAd.isReshowAd() || Intrinsics.LJFF(this.LJIIJ, aweme.getAid())) {
            return false;
        }
        return true;
    }

    public final void LIZIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommerceSessionPositionHelper ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(':');
        C1022620cia.LJ(C2188811AlT.LIZIZ(sbLIZ), str);
    }

    public void LIZLLL(List<? extends Aweme> list) {
        String creativeIdStr;
        for (Aweme aweme : list) {
            if (aweme.isAd()) {
                HashSet<String> hashSet = this.LJIIIZ;
                AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                if (awemeRawAd == null || (creativeIdStr = awemeRawAd.getCreativeIdStr()) == null) {
                    creativeIdStr = "";
                }
                hashSet.add(creativeIdStr);
            }
        }
    }

    public void LJFF(Aweme aweme) {
        if (!this.LJIIIIZZ.contains(aweme.getAid())) {
            this.LJ++;
            this.LJIIIIZZ.add(aweme.getAid());
        }
        if (LIZ(aweme)) {
            this.LJFF++;
        }
        this.LJIIJ = aweme.getAid();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onViewHolderSelected, shownItemNum: ");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", shownAdNum: ");
        sbLIZ.append(this.LJFF);
        LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    public void LIZJ(C1022820ciu c1022820ciu, String str) {
        if (!this.LJII.containsKey(str)) {
            int i = -1;
            if (this.LIZJ == -1) {
                this.LIZJ = this.LJ;
            }
            HashMap<String, C1019500cdY> map = this.LJII;
            String str2 = this.LIZIZ;
            int i2 = this.LJ;
            int i3 = this.LJFF;
            int iLIZIZ = i2 + C1019400cdO.LIZIZ(this.LIZ);
            int i4 = this.LIZLLL;
            if (i4 != -1) {
                i = (-1) + (this.LJ - i4);
            }
            map.put(str, new C1019500cdY(str2, i2, i3, iLIZIZ, i, 992));
            this.LIZLLL = this.LJ;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onAdShow, info: ");
        sbLIZ.append(this.LJII.get(str));
        LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        C1019500cdY c1019500cdY = this.LJII.get(str);
        if (c1019500cdY != null) {
            c1022820ciu.LIZIZ(c1019500cdY.LIZ, "session_id");
            c1022820ciu.LIZIZ(Integer.valueOf(c1019500cdY.LIZIZ), "absolute_session_position");
            c1022820ciu.LIZIZ(Integer.valueOf(c1019500cdY.LIZJ), "relative_session_position");
            c1022820ciu.LIZIZ(Integer.valueOf(c1019500cdY.LIZLLL), "absolute_session_position_with_cross_tab");
            c1022820ciu.LIZIZ(Integer.valueOf(this.LIZJ), "start_pos");
            c1022820ciu.LIZIZ(Integer.valueOf(c1019500cdY.LJ), "ad_gap");
        }
    }
}
