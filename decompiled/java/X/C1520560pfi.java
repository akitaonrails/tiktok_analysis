package X;

import Y.ARunnableS123S0100000_23;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Pattern;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS212S0000000_23;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pfi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1520560pfi {
    public String LIZ;
    public String LIZJ;
    public C1491800ovK LJII;
    public int LJIIJJI;
    public List<Integer> LJIIL;
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(144));
    public final C1520260pfE LIZLLL = new C1520260pfE();
    public final Map<String, String> LJ = new LinkedHashMap();
    public C1521090pgZ LJFF = new C1521090pgZ();
    public JSONObject LJI = new JSONObject();
    public EnumC993170bx5 LJIIIIZZ = EnumC993170bx5.Slardar;
    public final C01GW LJIIIZ = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(145));
    public int LJIIJ = -1;

    public final UUID LIZ() {
        return (UUID) this.LIZIZ.getValue();
    }

    public String LIZIZ() {
        String next;
        String str;
        boolean z = C1520630pfp.LJ;
        Iterator<String> it2 = C1520600pfm.LIZ.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = "default_bid";
                str = "__hybrid_default";
                break;
            }
            next = it2.next();
            str = (String) ((LinkedHashMap) this.LJ).get(next);
            if (Intrinsics.LJFF("regex_bid", next)) {
                if (z && !C1520370pfP.LIZ(str)) {
                    LJ();
                    str = (String) ((LinkedHashMap) this.LJ).get(next);
                }
                Map map = (Map) this.LJIIIZ.getValue();
                next = (map != null && map.containsKey("regex_source") && (map.get("regex_source") instanceof String)) ? String.valueOf(map.get("regex_source")) : "";
            }
            if (C1520370pfP.LIZ(str)) {
                break;
            }
        }
        this.LJFF.LIZJ(next, "bid_source");
        return str;
    }

    public final void LIZJ() {
        if (!(!EnumC1521240pgo.eventStream.not()) || this == null) {
            return;
        }
        C824310WVh.LIZIZ(new ARunnableS123S0100000_23(this, 100));
    }

    public final void LIZLLL() {
        if (!(!EnumC1521240pgo.eventStream.not()) || this == null) {
            return;
        }
        C824310WVh.LIZIZ(new ARunnableS123S0100000_23(this, 102));
    }

    public final void LJ() {
        C1520350pfN c1520350pfN;
        String str;
        String string;
        C118300cf c118300cf;
        boolean z = C1520630pfp.LIZLLL;
        C1491800ovK c1491800ovK = this.LJII;
        String strLJIIJ = C1520640pfq.LJIIJ("schema", c1491800ovK != null ? c1491800ovK.LIZIZ() : null);
        int i = 0;
        if (z) {
            List<Integer> listLJIIJJI = this.LJIIL;
            int length = strLJIIJ.length();
            int iHashCode = strLJIIJ.hashCode();
            if (listLJIIJJI == null || this.LJIIJ != length || this.LJIIJJI != iHashCode) {
                Pattern pattern = C859880XoI.LIZ;
                try {
                    int length2 = strLJIIJ.length();
                    listLJIIJJI = new ArrayList<>();
                    C118300cf c118300cf2 = new C118300cf();
                    c118300cf2.element = -1;
                    C013C c013c = new C013C();
                    c013c.element = true;
                    C118300cf c118300cf3 = new C118300cf();
                    c118300cf3.element = -1;
                    C118300cf c118300cf4 = new C118300cf();
                    c118300cf4.element = -1;
                    C013C c013c2 = new C013C();
                    int i2 = 0;
                    while (true) {
                        if (i2 < length2) {
                            char cCharAt = strLJIIJ.charAt(i2);
                            if (c118300cf2.element >= 0) {
                                if (cCharAt == '#') {
                                    C859880XoI.LIZIZ(c118300cf3, c013c2, c118300cf4, LSPassThroughRecordSizeConfig.DEFAULT, c013c, c118300cf2, listLJIIJJI, i2);
                                    C859880XoI.LIZ(i2, length2, listLJIIJJI);
                                    break;
                                }
                                if (cCharAt != '&') {
                                    if (cCharAt == '=' && !c013c2.element) {
                                        c118300cf4.element = i2 + 1;
                                        c013c2.element = true;
                                    }
                                    c118300cf = c118300cf3;
                                    i2++;
                                    c118300cf3 = c118300cf;
                                    i = 0;
                                } else {
                                    c118300cf = c118300cf3;
                                    C859880XoI.LIZIZ(c118300cf3, c013c2, c118300cf4, LSPassThroughRecordSizeConfig.DEFAULT, c013c, c118300cf2, listLJIIJJI, i2);
                                    c118300cf.element = i2 + 1;
                                    c118300cf4.element = -1;
                                    c013c2.element = false;
                                    i2++;
                                    c118300cf3 = c118300cf;
                                    i = 0;
                                }
                            } else {
                                if (cCharAt == '#') {
                                    C859880XoI.LIZ(i, i2, listLJIIJJI);
                                    C859880XoI.LIZ(i2, length2, listLJIIJJI);
                                    break;
                                }
                                if (cCharAt == '?') {
                                    C859880XoI.LIZ(i, i2, listLJIIJJI);
                                    c118300cf2.element = i2;
                                    c118300cf3.element = i2 + 1;
                                }
                                c118300cf = c118300cf3;
                                i2++;
                                c118300cf3 = c118300cf;
                                i = 0;
                            }
                        } else if (c118300cf2.element < 0) {
                            C859880XoI.LIZ(0, length2, listLJIIJJI);
                        } else {
                            C859880XoI.LIZIZ(c118300cf3, c013c2, c118300cf4, LSPassThroughRecordSizeConfig.DEFAULT, c013c, c118300cf2, listLJIIJJI, i2);
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    listLJIIJJI = C1697810uHb.LJIIJJI(0, Integer.valueOf(strLJIIJ.length()));
                }
                this.LJIIJ = length;
                this.LJIIJJI = iHashCode;
                this.LJIIL = listLJIIJJI;
            }
            try {
                StringBuilder sb = new StringBuilder();
                int iLIZ = C0GYY.LIZ(0, listLJIIJJI.size() - 1, 2);
                if (iLIZ >= 0) {
                    int i3 = 0;
                    while (true) {
                        sb.append((CharSequence) strLJIIJ, listLJIIJJI.get(i3).intValue(), listLJIIJJI.get(i3 + 1).intValue());
                        if (i3 == iLIZ) {
                            break;
                        } else {
                            i3 += 2;
                        }
                    }
                }
                strLJIIJ = sb.toString();
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
        }
        String str2 = "";
        if (!(this instanceof C1520220pfA) ? !(this instanceof C1520340pfM) || (c1520350pfN = ((C1520340pfM) this).LJIILIIL) == null || (str = c1520350pfN.LIZ) == null : (str = this.LJFF.LIZ) == null) {
            str = "";
        }
        if (a0.LJJJIL(str)) {
            try {
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(strLJIIJ), "url");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
                    str = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
                }
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                C189200o6.m2constructorimpl(new C098200Yq(th3));
            }
        }
        ArrayList arrayListLJ = C1697810uHb.LJ(str, strLJIIJ);
        String str3 = (String) ((LinkedHashMap) this.LJ).get("regex_bid");
        if (str3 == null || str3.length() == 0) {
            C1520830pg9 c1520830pg9 = C1520830pg9.LIZLLL;
            C1520930pgJ c1520930pgJ = EnumC1520910pgH.Companion;
            String str4 = this.LJFF.LIZJ;
            c1520930pgJ.getClass();
            C1520610pfn c1520610pfnLIZJ = c1520830pg9.LIZJ(arrayListLJ, C1520930pgJ.LIZ(str4), false);
            ((Map) this.LJIIIZ.getValue()).put("regex_source", c1520610pfnLIZJ.LIZIZ);
            this.LJ.put("regex_bid", c1520610pfnLIZJ.LIZ);
        }
        Object objOpt = this.LJI.opt("pid");
        if (objOpt != null && (string = objOpt.toString()) != null) {
            str2 = string;
        }
        if (str2.length() == 0) {
            String strLJI = C08HX.LJI(arrayListLJ, C1520600pfm.LIZIZ);
            if (EnumC1520990pgP.DECODE_PID.isEnabled()) {
                strLJI = Uri.decode(strLJI);
            }
            C12868051u.LJI(this.LJI, "pid", strLJI);
        }
    }

    public JSONObject LJII() {
        return new JSONObject();
    }

    public C1520560pfi(String str) {
        this.LIZ = str;
    }

    public final void onEventTerminated(EnumC1520250pfD enumC1520250pfD) {
        this.LIZLLL.LIZIZ = enumC1520250pfD;
        if (!EnumC1521240pgo.eventStream.not()) {
            C824310WVh.LIZIZ(new ARunnableS123S0100000_23(this, 101));
        }
    }

    public final void LJFF(Object obj, String str) {
        Object c098200Yq;
        try {
            ((Map) this.LJIIIZ.getValue()).put(str, obj);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C1520960pgM.LIZIZ(thM5exceptionOrNullimpl);
        }
    }

    public final void LJI(boolean z, EnumC1520250pfD enumC1520250pfD) {
        if (z) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Event terminated, type = ");
            sbLIZ.append(enumC1520250pfD.name());
            C1521730phb.LJI("HBMonitorSDK_V2", C2188811AlT.LIZIZ(sbLIZ));
            onEventTerminated(enumC1520250pfD);
        }
    }
}
