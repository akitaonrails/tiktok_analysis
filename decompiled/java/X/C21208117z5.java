package X;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.AwS611S0100000_32;
import kotlin.jvm.internal.AwS646S0100000_32;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.17z5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21208117z5 {
    public static final C21208117z5 LIZ = new C21208117z5();
    public static final ConcurrentHashMap<String, C21208017z4> LIZIZ = new ConcurrentHashMap<>();

    public static void LIZJ(String str) {
        InterfaceC1541990qEH interfaceC1541990qEH;
        InterfaceC1541990qEH interfaceC1541990qEH2;
        if (str == null) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        ConcurrentHashMap<String, C21208017z4> concurrentHashMap = LIZIZ;
        C21208017z4 c21208017z4Remove = concurrentHashMap.remove(str);
        if (c21208017z4Remove != null && (interfaceC1541990qEH2 = c21208017z4Remove.LIZIZ) != null) {
            interfaceC1541990qEH2.LLD(true);
        }
        Set<String> setKeySet = concurrentHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append('_');
            if (u.LJJIIJZLJL((String) obj, C2188811AlT.LIZIZ(sbLIZ), false)) {
                arrayList.add(obj);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C21208017z4 c21208017z4Remove2 = LIZIZ.remove(it2.next());
            if (c21208017z4Remove2 != null && (interfaceC1541990qEH = c21208017z4Remove2.LIZIZ) != null) {
                interfaceC1541990qEH.LLD(true);
            }
        }
    }

    public static void LIZLLL(C21208217z6 c21208217z6) throws Throwable {
        LinkedHashMap linkedHashMap;
        String strLJIIIIZZ;
        InterfaceC1540940qCa interfaceC1540940qCa;
        C1537720q7O c1537720q7O;
        long jLongValue;
        long jLongValue2;
        Map<String, Object> mapLIZJ;
        AbstractC21191617wQ abstractC21191617wQ;
        Map<String, Object> mapLIZLLL;
        String strLJIIIIZZ2;
        Map<String, Object> map;
        String strLJIIIIZZ3;
        long jLongValue3;
        AbstractC21191617wQ abstractC21191617wQ2 = c21208217z6.LJII;
        if (abstractC21191617wQ2 != null) {
            abstractC21191617wQ2.LIZ(Long.valueOf(System.currentTimeMillis()), "data_ready_time");
        }
        if (c21208217z6.LJ == null) {
            C21199917xl c21199917xl = C21199917xl.LIZ;
            Long lLJIILIIL = C2095008Iq.LJIILIIL(c21208217z6.LIZIZ);
            if (lLJIILIIL != null) {
                jLongValue3 = lLJIILIIL.longValue();
            } else {
                jLongValue3 = 0;
            }
            C21200017xm c21200017xmLIZ = c21199917xl.LIZ(Long.valueOf(jLongValue3));
            if (c21200017xmLIZ != null) {
                C21200117xn c21200117xn = new C21200117xn(4, 75);
                c21200117xn.LIZJ = new AwS611S0100000_32(c21208217z6, 286);
                c21200017xmLIZ.LIZIZ(c21200117xn);
            }
        }
        InterfaceC21208317z7 interfaceC21208317z7 = c21208217z6.LJI;
        if (interfaceC21208317z7 != null) {
            interfaceC21208317z7.onLoading();
        }
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c21208217z6.LIZIZ);
        sbLIZ.append(" start preload lynxCard, waiting for gecko resource, maybe there's other card showing now");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LJ(strLIZIZ);
        Uri.Builder builderBuildUpon = UriProtector.parse(c21208217z6.LIZJ).buildUpon();
        AbstractC21191617wQ abstractC21191617wQ3 = c21208217z6.LJII;
        if (abstractC21191617wQ3 != null && (map = abstractC21191617wQ3.LIZIZ) != null && (strLJIIIIZZ3 = C1741890vQh.LJIIIIZZ(map)) != null) {
            builderBuildUpon.appendQueryParameter("page_params", strLJIIIIZZ3);
        }
        AbstractC21191617wQ abstractC21191617wQ4 = c21208217z6.LJII;
        if (abstractC21191617wQ4 != null && (mapLIZLLL = abstractC21191617wQ4.LIZLLL()) != null && (strLJIIIIZZ2 = C1741890vQh.LJIIIIZZ(mapLIZLLL)) != null) {
            builderBuildUpon.appendQueryParameter("track_params", strLJIIIIZZ2);
        }
        String string = builderBuildUpon.build().toString();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(c21208217z6.LIZIZ);
        sbLIZ2.append(" finalSchema : ");
        sbLIZ2.append(string);
        C2341109Fh.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
        long jCurrentTimeMillis = System.currentTimeMillis();
        JSONObject jSONObject = c21208217z6.LJIIIIZZ;
        if (jSONObject != null && (abstractC21191617wQ = c21208217z6.LJII) != null) {
            abstractC21191617wQ.LIZJ = jSONObject;
        }
        C1563990qnl c1563990qnl = c21208217z6.LJIIIZ;
        if (c1563990qnl != null) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("trigger_source", c1563990qnl.LIZ);
                jSONObject2.put("chain_id", c1563990qnl.LIZIZ);
                AbstractC21191617wQ abstractC21191617wQ5 = c21208217z6.LJII;
                if (abstractC21191617wQ5 != null) {
                    abstractC21191617wQ5.LIZLLL = jSONObject2;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C2341109Fh c2341109Fh2 = C2341109Fh.LIZ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("LynxCardCache setChainInfo error: ");
                sbLIZ3.append(e.getMessage());
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
                c2341109Fh2.getClass();
                C2341109Fh.LIZJ(strLIZIZ2);
            }
        }
        AbstractC21191617wQ abstractC21191617wQ6 = c21208217z6.LJII;
        if (abstractC21191617wQ6 != null && (mapLIZJ = abstractC21191617wQ6.LIZJ()) != null) {
            linkedHashMap = new LinkedHashMap(mapLIZJ);
        } else {
            linkedHashMap = new LinkedHashMap();
        }
        linkedHashMap.put("data_from", "load_schema");
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("LynxCardCache.preload load_schema ");
        sbLIZ4.append(jCurrentTimeMillis);
        linkedHashMap.put("debug_key", C2188811AlT.LIZIZ(sbLIZ4));
        C2341109Fh c2341109Fh3 = C2341109Fh.LIZ;
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("jyq_debug ");
        sbLIZ5.append(c21208217z6.LIZIZ);
        sbLIZ5.append(' ');
        sbLIZ5.append(jCurrentTimeMillis);
        sbLIZ5.append(" finalSchema : ");
        sbLIZ5.append(string);
        String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ5);
        c2341109Fh3.getClass();
        C2341109Fh.LIZ(strLIZIZ3);
        Context context = c21208217z6.LIZ;
        String str = c21208217z6.LIZIZ;
        int i = c21208217z6.LIZLLL;
        String str2 = c21208217z6.LJ;
        Long l = c21208217z6.LJFF;
        InterfaceC21208317z7 interfaceC21208317z72 = c21208217z6.LJI;
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("ec_lynx_pin_card_load_opt", true)) {
            strLJIIIIZZ = C1741890vQh.LJIIIIZZ(linkedHashMap);
        } else {
            strLJIIIIZZ = null;
        }
        C21208017z4 c21208017z4LIZIZ = LIZIZ(context, str, string, i, str2, l, interfaceC21208317z72, strLJIIIIZZ, c21208217z6.LJIIIZ, new AwS646S0100000_32(c21208217z6, 22));
        if (c21208017z4LIZIZ == null) {
            if (c21208217z6.LJ == null) {
                C21199917xl c21199917xl2 = C21199917xl.LIZ;
                Long lLJIILIIL2 = C2095008Iq.LJIILIIL(c21208217z6.LIZIZ);
                if (lLJIILIIL2 != null) {
                    jLongValue2 = lLJIILIIL2.longValue();
                } else {
                    jLongValue2 = 0;
                }
                C21200017xm c21200017xmLIZ2 = c21199917xl2.LIZ(Long.valueOf(jLongValue2));
                if (c21200017xmLIZ2 != null) {
                    c21200017xmLIZ2.LJI(4, null);
                }
            }
            InterfaceC21208317z7 interfaceC21208317z73 = c21208217z6.LJI;
            if (interfaceC21208317z73 != null) {
                interfaceC21208317z73.LIZ("lynx view create failed", false);
                return;
            }
            return;
        }
        AbstractC21191617wQ abstractC21191617wQ7 = c21208217z6.LJII;
        if (abstractC21191617wQ7 != null) {
            c21208017z4LIZIZ.LJ = abstractC21191617wQ7;
        }
        InterfaceC21208317z7 interfaceC21208317z74 = c21208217z6.LJI;
        if (interfaceC21208317z74 != null) {
            c21208017z4LIZIZ.LJFF = interfaceC21208317z74;
        }
        c21208017z4LIZIZ.LJI = c21208217z6.LJFF;
        if (c21208017z4LIZIZ.LIZLLL && c21208217z6.LIZLLL == c21208017z4LIZIZ.LIZ && Intrinsics.LJFF(c21208217z6.LJ, c21208017z4LIZIZ.LIZJ)) {
            AbstractC21191617wQ abstractC21191617wQ8 = c21208217z6.LJII;
            if (abstractC21191617wQ8 != null) {
                abstractC21191617wQ8.LIZ("1", "is_reuse");
            }
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append(c21208217z6.LIZIZ);
            sbLIZ6.append(" same card type from cache. Skip load and update global props when card really show");
            C2341109Fh.LIZ(C2188811AlT.LIZIZ(sbLIZ6));
            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
            sbLIZ7.append(c21208217z6.LIZIZ);
            sbLIZ7.append(" remove load gecko resource task");
            C2341109Fh.LIZ(C2188811AlT.LIZIZ(sbLIZ7));
            if (c21208217z6.LJ == null) {
                C21199917xl c21199917xl3 = C21199917xl.LIZ;
                Long lLJIILIIL3 = C2095008Iq.LJIILIIL(c21208217z6.LIZIZ);
                if (lLJIILIIL3 != null) {
                    jLongValue = lLJIILIIL3.longValue();
                } else {
                    jLongValue = 0;
                }
                C21200017xm c21200017xmLIZ3 = c21199917xl3.LIZ(Long.valueOf(jLongValue));
                if (c21200017xmLIZ3 != null) {
                    c21200017xmLIZ3.LJI(4, null);
                }
            }
            InterfaceC21208317z7 interfaceC21208317z75 = c21208217z6.LJI;
            if (interfaceC21208317z75 != null) {
                interfaceC21208317z75.LIZ(null, true);
                return;
            }
            return;
        }
        AbstractC21191617wQ abstractC21191617wQ9 = c21208217z6.LJII;
        if (abstractC21191617wQ9 != null) {
            abstractC21191617wQ9.LIZ(CardStruct.IStatusCode.DEFAULT, "is_reuse");
        }
        if (c21208017z4LIZIZ.LIZLLL) {
            StringBuilder sbLIZ8 = C2188811AlT.LIZ();
            sbLIZ8.append(c21208217z6.LIZIZ);
            sbLIZ8.append(" isReuse, update spark context");
            C2341109Fh.LIZ(C2188811AlT.LIZIZ(sbLIZ8));
            InterfaceC1541990qEH interfaceC1541990qEH = c21208017z4LIZIZ.LIZIZ;
            if (interfaceC1541990qEH instanceof InterfaceC1105930esx) {
                interfaceC1540940qCa = (InterfaceC1540940qCa) interfaceC1541990qEH;
            } else {
                interfaceC1540940qCa = null;
            }
            SparkContext sparkContextLIZ = LIZ(string, null);
            C1538140q84.LJ(C1538140q84.LIZ, sparkContextLIZ, sparkContextLIZ.liteLynxConfig);
            if (interfaceC1540940qCa != null) {
                interfaceC1540940qCa.LJIILIIL(sparkContextLIZ);
            }
            InterfaceC1541990qEH interfaceC1541990qEH2 = c21208017z4LIZIZ.LIZIZ;
            if ((interfaceC1541990qEH2 instanceof C1537720q7O) && (c1537720q7O = (C1537720q7O) interfaceC1541990qEH2) != null) {
                String strLJIJI = sparkContextLIZ.LJIJI();
                boolean z = C1537720q7O.LLLII;
                c1537720q7O.LJJIJ(strLJIJI, null);
            }
        } else {
            StringBuilder sbLIZ9 = C2188811AlT.LIZ();
            sbLIZ9.append(c21208217z6.LIZIZ);
            sbLIZ9.append(" start to load");
            C2341109Fh.LIZ(C2188811AlT.LIZIZ(sbLIZ9));
            InterfaceC1541990qEH interfaceC1541990qEH3 = c21208017z4LIZIZ.LIZIZ;
            if (interfaceC1541990qEH3 != null) {
                interfaceC1541990qEH3.load();
            }
        }
        c21208017z4LIZIZ.LIZ = c21208217z6.LIZLLL;
        c21208017z4LIZIZ.LIZJ = c21208217z6.LJ;
    }

    public static SparkContext LIZ(String str, String str2) {
        C1538140q84 c1538140q84 = C1538140q84.LIZ;
        C1538590q8n c1538590q8n = new C1538590q8n();
        c1538590q8n.LIZLLL = false;
        c1538590q8n.LJ = false;
        c1538590q8n.LJFF = false;
        c1538590q8n.LJI = true;
        c1538590q8n.LJIIIZ = true;
        SparkContext sparkContextLIZJ = c1538140q84.LIZJ(str, c1538590q8n);
        if (str2 != null) {
            sparkContextLIZJ.initData = str2;
        }
        sparkContextLIZJ.LJJJJZ(new C1151900g56(0));
        return sparkContextLIZJ;
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [X.17z3] */
    public static C21208017z4 LIZIZ(Context context, final String str, String str2, int i, final String str3, final Long l, final InterfaceC21208317z7 interfaceC21208317z7, String str4, C1563990qnl c1563990qnl, Function2 function2) {
        final String strLIZIZ;
        HybridSchemaParam hybridSchemaParamLIZJ;
        InterfaceC1541990qEH interfaceC1541990qEH;
        View viewE1;
        ViewGroup viewGroup;
        if (str3 != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append('_');
            sbLIZ.append(str3);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            strLIZIZ = str;
        }
        ConcurrentHashMap<String, C21208017z4> concurrentHashMap = LIZIZ;
        C21208017z4 c21208017z4 = concurrentHashMap.get(strLIZIZ);
        InterfaceC1541990qEH interfaceC1541990qEH2 = null;
        if (c21208017z4 == null || (function2 != null && ((Boolean) function2.invoke(Integer.valueOf(c21208017z4.LIZ), c21208017z4.LIZJ)).booleanValue())) {
            C2341109Fh c2341109Fh = C2341109Fh.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str);
            sbLIZ2.append(" create");
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            c2341109Fh.getClass();
            C2341109Fh.LIZ(strLIZIZ2);
            final ?? r7 = new InterfaceC1760430vub() { // from class: X.17z3
                @Override // X.InterfaceC1760430vub
                public final void LIZ(String str5, boolean z) {
                    InterfaceC21208317z7 interfaceC21208317z72;
                    Long l2;
                    long jLongValue;
                    ConcurrentHashMap<String, C21208017z4> concurrentHashMap2 = C21208117z5.LIZIZ;
                    C21208017z4 c21208017z42 = concurrentHashMap2.get(strLIZIZ);
                    if (c21208017z42 == null || (interfaceC21208317z72 = c21208017z42.LJFF) == null) {
                        interfaceC21208317z72 = interfaceC21208317z7;
                    }
                    C21208017z4 c21208017z43 = concurrentHashMap2.get(strLIZIZ);
                    if (c21208017z43 == null || (l2 = c21208017z43.LJI) == null) {
                        l2 = l;
                    }
                    long jLongValue2 = 0;
                    if (z) {
                        if (interfaceC21208317z72 != null) {
                            interfaceC21208317z72.LIZ(null, true);
                        }
                        if (str3 == null) {
                            C21199917xl c21199917xl = C21199917xl.LIZ;
                            Long lLJIILIIL = C2095008Iq.LJIILIIL(str);
                            if (lLJIILIIL != null) {
                                jLongValue2 = lLJIILIIL.longValue();
                            }
                            C21200017xm c21200017xmLIZ = c21199917xl.LIZ(Long.valueOf(jLongValue2));
                            if (c21200017xmLIZ != null) {
                                c21200017xmLIZ.LJI(4, null);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (str3 == null) {
                        C21199917xl c21199917xl2 = C21199917xl.LIZ;
                        Long lLJIILIIL2 = C2095008Iq.LJIILIIL(str);
                        if (lLJIILIIL2 != null) {
                            jLongValue = lLJIILIIL2.longValue();
                        } else {
                            jLongValue = 0;
                        }
                        C21200017xm c21200017xmLIZ2 = c21199917xl2.LIZ(Long.valueOf(jLongValue));
                        if (c21200017xmLIZ2 != null) {
                            c21200017xmLIZ2.LJI(0, new AwS595S0100000_16(l2, 257));
                        }
                        Long lLJIILIIL3 = C2095008Iq.LJIILIIL(str);
                        if (lLJIILIIL3 != null) {
                            jLongValue2 = lLJIILIIL3.longValue();
                        }
                        C21200017xm c21200017xmLIZ3 = c21199917xl2.LIZ(Long.valueOf(jLongValue2));
                        if (c21200017xmLIZ3 != null) {
                            c21200017xmLIZ3.LJI(4, null);
                        }
                    }
                    if (interfaceC21208317z72 == null) {
                        return;
                    }
                    interfaceC21208317z72.LIZ(str5, false);
                }
            };
            SparkContext sparkContextLIZ = LIZ(str2, str4);
            InterfaceC1531560pxS interfaceC1531560pxS = sparkContextLIZ.hybridParams;
            if (interfaceC1531560pxS != null && (hybridSchemaParamLIZJ = interfaceC1531560pxS.LIZJ()) != null) {
                InterfaceC1541990qEH interfaceC1541990qEHLIZIZ = C1537820q7Y.LIZIZ(hybridSchemaParamLIZJ, sparkContextLIZ, context, new AbstractC1537870q7d() { // from class: X.0vuW
                    @Override // X.AbstractC1537870q7d
                    public final void LJLJJI() {
                        C2341109Fh.LIZ.getClass();
                        C2341109Fh.LIZ("onPreKitCreate() called");
                    }

                    @Override // X.AbstractC1537870q7d
                    public final void onDestroy() {
                        C2341109Fh.LIZ.getClass();
                        C2341109Fh.LIZ("onDestroy() called");
                    }

                    @Override // X.AbstractC1537870q7d
                    public final void LJLIIIL(InterfaceC1541990qEH interfaceC1541990qEH3) {
                        C2341109Fh.LIZ.getClass();
                        C2341109Fh.LIZ("onLoadFinish() called");
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super((Object) null);
                    }

                    @Override // X.AbstractC1537870q7d
                    public final void LJLIIL(InterfaceC1541990qEH interfaceC1541990qEH3, String str5) {
                        C2341109Fh.LIZ.getClass();
                        C2341109Fh.LIZ("onLoadStart() called");
                    }

                    @Override // X.AbstractC1537870q7d
                    public final void LJLJJL(String str5, byte[] bArr) {
                        boolean z;
                        C2341109Fh c2341109Fh2 = C2341109Fh.LIZ;
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append(str);
                        sbLIZ3.append(" onResourceLoadFinish.show lynx card,templateArray is null ");
                        if (bArr == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        sbLIZ3.append(z);
                        sbLIZ3.append(", baseUrl ");
                        sbLIZ3.append(str5);
                        String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
                        c2341109Fh2.getClass();
                        C2341109Fh.LIZ(strLIZIZ3);
                        InterfaceC1760430vub interfaceC1760430vub = r7;
                        if (interfaceC1760430vub != null) {
                            interfaceC1760430vub.LIZ(null, true);
                        }
                    }

                    @Override // X.AbstractC1537870q7d
                    public final void LJL(InterfaceC1541990qEH interfaceC1541990qEH3, String str5, C1542120qEU c1542120qEU) {
                        C2341109Fh c2341109Fh2 = C2341109Fh.LIZ;
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("onLoadFailed() called reason: ");
                        sbLIZ3.append(c1542120qEU.LIZIZ);
                        String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
                        c2341109Fh2.getClass();
                        C2341109Fh.LIZ(strLIZIZ3);
                        InterfaceC1760430vub interfaceC1760430vub = r7;
                        if (interfaceC1760430vub != null) {
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("errorCode:");
                            sbLIZ4.append(c1542120qEU.LIZ);
                            sbLIZ4.append(",errorReason:");
                            sbLIZ4.append(c1542120qEU.LIZIZ);
                            interfaceC1760430vub.LIZ(C2188811AlT.LIZIZ(sbLIZ4), false);
                        }
                    }
                });
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(str);
                sbLIZ3.append(" lynxView created:");
                sbLIZ3.append(interfaceC1541990qEHLIZIZ);
                C2341109Fh.LJ(C2188811AlT.LIZIZ(sbLIZ3));
                if (interfaceC1541990qEHLIZIZ != null) {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append(str);
                    sbLIZ4.append(" cache new created lynxView:,view:");
                    sbLIZ4.append(interfaceC1541990qEHLIZIZ);
                    C2341109Fh.LIZ(C2188811AlT.LIZIZ(sbLIZ4));
                    C21208017z4 c21208017z42 = new C21208017z4(i, interfaceC1541990qEHLIZIZ, str3);
                    concurrentHashMap.put(strLIZIZ, c21208017z42);
                    c21208017z42.LJI = l;
                    c21208017z42.LJFF = interfaceC21208317z7;
                    return c21208017z42;
                }
            } else {
                C21192417wY.LIZIZ(EnumC21192517wZ.CHAIN_FAILED, c1563990qnl, C2097908Jt.LIZJ(new Pair("reason", "create_lynx_view_schema_null")));
            }
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append(str);
            sbLIZ5.append(" return cached lynxView:");
            C21208017z4 c21208017z43 = concurrentHashMap.get(strLIZIZ);
            if (c21208017z43 != null) {
                interfaceC1541990qEH2 = c21208017z43.LIZIZ;
            }
            sbLIZ5.append(interfaceC1541990qEH2);
            sbLIZ5.append('}');
            C2341109Fh.LIZ(C2188811AlT.LIZIZ(sbLIZ5));
            return concurrentHashMap.get(strLIZIZ);
        }
        InterfaceC1541990qEH interfaceC1541990qEH3 = c21208017z4.LIZIZ;
        if (interfaceC1541990qEH3 != null && (viewE1 = interfaceC1541990qEH3.e1()) != null) {
            ViewParent parent = viewE1.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                C786410Ut5.LJJJLZIJ(viewE1, viewGroup);
            }
        }
        if (str4 != null && (interfaceC1541990qEH = c21208017z4.LIZIZ) != null) {
            interfaceC1541990qEH.d1(str4);
        }
        C2341109Fh c2341109Fh2 = C2341109Fh.LIZ;
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append(str);
        sbLIZ6.append(" find cached lynxView:");
        sbLIZ6.append(c21208017z4.LIZIZ);
        String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ6);
        c2341109Fh2.getClass();
        C2341109Fh.LIZ(strLIZIZ3);
        c21208017z4.LIZLLL = true;
        return c21208017z4;
    }
}
