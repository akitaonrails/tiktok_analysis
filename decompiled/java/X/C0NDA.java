package X;

import com.bytedance.ies.ugc.aweme.commercialize.search.setting.CommerceSearchAdConfigSetting;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.0NDA, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NDA implements InterfaceC1010140cOS {
    public static final C01GW<C0NDA> LJII = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, new C0NDB());
    public boolean LIZLLL;
    public int LJ;
    public boolean LJI;
    public final Map<String, Integer> LIZ = Collections.synchronizedMap(new HashMap());
    public final Map<String, Integer> LIZIZ = Collections.synchronizedMap(new HashMap());
    public final Map<String, Set<String>> LIZJ = Collections.synchronizedMap(new HashMap());
    public boolean LJFF = true;

    @Override // X.InterfaceC1010140cOS
    public final void LIZIZ() {
        this.LJFF = false;
    }

    @Override // X.InterfaceC1010140cOS
    public final void LJIIL() {
        this.LIZLLL = true;
    }

    @Override // X.InterfaceC1010140cOS
    public final boolean LJI() {
        return this.LJFF;
    }

    @Override // X.InterfaceC1010140cOS
    public final boolean LJIIIIZZ() {
        return this.LJI;
    }

    @Override // X.InterfaceC1010140cOS
    public final int LJIILIIL() {
        return this.LJ;
    }

    public static String LJIILJJIL(AwemeRawAd awemeRawAd) {
        if (awemeRawAd != null && awemeRawAd.getCreativeId() != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(awemeRawAd.getCreativeId());
            sbLIZ.append(false);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return "default_key";
    }

    @Override // X.InterfaceC1010140cOS
    public final void LIZ(int i) {
        this.LJ = i;
    }

    @Override // X.InterfaceC1010140cOS
    public final void LIZJ(boolean z) {
        this.LJI = z;
    }

    @Override // X.InterfaceC1010140cOS
    public final Set<String> LJ(Aweme aweme) {
        if (aweme == null || aweme.getAwemeRawAd() == null) {
            return null;
        }
        return this.LIZJ.get(LJIILJJIL(aweme.getAwemeRawAd()));
    }

    @Override // X.InterfaceC1010140cOS
    public final void LJFF(Aweme aweme) {
        Set<String> setLJ = LJ(aweme);
        if (setLJ == null) {
            return;
        }
        setLJ.clear();
    }

    @Override // X.InterfaceC1010140cOS
    public final int LJII(Aweme aweme) {
        if (aweme == null || aweme.getAwemeRawAd() == null) {
            return 0;
        }
        Integer num = this.LIZ.get(LJIILJJIL(aweme.getAwemeRawAd()));
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // X.InterfaceC1010140cOS
    public final int LJIIIZ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        Map<String, String> searchAdExtraParams;
        String str;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (searchAdExtraParams = awemeRawAd.getSearchAdExtraParams()) != null && (str = searchAdExtraParams.get("inner_ad_position")) != null) {
            return CastIntegerProtector.parseInt(str);
        }
        return 0;
    }

    @Override // X.InterfaceC1010140cOS
    public final boolean LJIIJJI(Aweme aweme) {
        if (aweme != null && CommerceSearchAdConfigSetting.LIZ().enableDedupShowAndOmsdk) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1010140cOS
    public final void LIZLLL(int i, Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && C1010120cOQ.LJIJJ(awemeRawAd)) {
            this.LIZ.put(LJIILJJIL(awemeRawAd), Integer.valueOf(i));
        }
    }

    @Override // X.InterfaceC1010140cOS
    public final void LJIIJ(Aweme aweme, String str) {
        AwemeRawAd awemeRawAd;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            String strLJIILJJIL = LJIILJJIL(awemeRawAd);
            if (this.LIZJ.get(strLJIILJJIL) == null) {
                this.LIZJ.put(strLJIILJJIL, new HashSet());
            }
            Set<String> set = this.LIZJ.get(strLJIILJJIL);
            if (set != null) {
                set.add(str);
            }
        }
    }
}
