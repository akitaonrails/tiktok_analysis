package X;

import com.ss.android.ugc.aweme.im.service.gecko.MessagingGeckoUtils;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AwS547S0100000_3;

/* JADX INFO: renamed from: X.07eK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1912207eK {
    public static final C01GW<Integer> LIZLLL = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(9));
    public static final Map<String, String> LJ = C2097608Jq.LJIIIIZZ(new Pair("[smile]", "im_e1.webp"), new Pair("[happy]", "im_e2.webp"), new Pair("[angry]", "im_e3.png"), new Pair("[cry]", "im_e4.webp"), new Pair("[embarrassed]", "im_e5.png"), new Pair("[surprised]", "im_e6.webp"), new Pair("[wronged]", "im_e7.webp"), new Pair("[shout]", "im_e8.webp"), new Pair("[flushed]", "im_e9.webp"), new Pair("[yummy]", "im_e10.webp"), new Pair("[complacent]", "im_e11.webp"), new Pair("[drool]", "im_e12.webp"), new Pair("[scream]", "im_e13.webp"), new Pair("[weep]", "im_e14.png"), new Pair("[speechless]", "im_e15.png"), new Pair("[funnyface]", "im_e16.webp"), new Pair("[laughwithtears]", "im_e17.webp"), new Pair("[wicked]", "im_e18.webp"), new Pair("[facewithrollingeyes]", "im_e19.webp"), new Pair("[sulk]", "im_e20.png"), new Pair("[thinking]", "im_e21.webp"), new Pair("[lovely]", "im_e22.webp"), new Pair("[greedy]", "im_e23.webp"), new Pair("[wow]", "im_e24.webp"), new Pair("[joyful]", "im_e25.webp"), new Pair("[hehe]", "im_e26.webp"), new Pair("[slap]", "im_e27.webp"), new Pair("[tears]", "im_e28.webp"), new Pair("[stun]", "im_e29.webp"), new Pair("[cute]", "im_e30.webp"), new Pair("[blink]", "im_e31.webp"), new Pair("[disdain]", "im_e32.webp"), new Pair("[astonish]", "im_e33.webp"), new Pair("[rage]", "im_e34.webp"), new Pair("[cool]", "im_e35.webp"), new Pair("[excited]", "im_e36.webp"), new Pair("[proud]", "im_e37.webp"), new Pair("[smileface]", "im_e38.webp"), new Pair("[evil]", "im_e39.webp"), new Pair("[angel]", "im_e40.webp"), new Pair("[laugh]", "im_e41.webp"), new Pair("[pride]", "im_e42.webp"), new Pair("[nap]", "im_e43.webp"), new Pair("[loveface]", "im_e44.webp"), new Pair("[awkward]", "im_e45.webp"), new Pair("[shock]", "im_e46.png"));
    public static final C01GW<C1912207eK> LJFF = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(10));
    public final MessagingGeckoUtils LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(new AwS547S0100000_3(this, 2));
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(11));

    public C1912207eK(MessagingGeckoUtils messagingGeckoUtils) {
        this.LIZ = messagingGeckoUtils;
    }

    public final String LIZ(String str) {
        if (!this.LIZ.LIZIZ()) {
            return "";
        }
        Object objLIZ = this.LIZ.LIZ(str);
        C189200o6.m5exceptionOrNullimpl(objLIZ);
        if (C189200o6.m7isFailureimpl(objLIZ)) {
            objLIZ = null;
        }
        String str2 = (String) objLIZ;
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public final String LIZIZ(String str) {
        Map<String, String> map = LJ;
        if (!map.containsKey(str)) {
            return "";
        }
        CharSequence charSequence = (CharSequence) ((Map) this.LIZIZ.getValue()).get(str);
        if (charSequence == null || charSequence.length() == 0) {
            String str2 = map.get(str);
            if (str2 == null) {
                return "";
            }
            ((Map) this.LIZIZ.getValue()).put(str, LIZ(str2));
        }
        String str3 = (String) ((Map) this.LIZIZ.getValue()).get(str);
        if (str3 == null) {
            return "";
        }
        return str3;
    }
}
