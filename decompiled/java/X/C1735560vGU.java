package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.k;
import com.google.gson.p;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.ug.common.model.DiversionTargetRes;
import com.ss.android.ugc.aweme.ecommerce.ug.common.model.DiversionTargetResCfg;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0vGU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1735560vGU {
    public static final C1735560vGU LIZ = new C1735560vGU();

    /* JADX WARN: Removed duplicated region for block: B:21:0x004d A[Catch: all -> 0x011d, PHI: r3 r10
      0x004d: PHI (r3v3 java.lang.String) = (r3v1 java.lang.String), (r3v0 java.lang.String) binds: [B:20:0x004b, B:14:0x0033] A[DONT_GENERATE, DONT_INLINE]
      0x004d: PHI (r10v3 android.net.Uri) = (r10v1 android.net.Uri), (r10v0 android.net.Uri) binds: [B:20:0x004b, B:14:0x0033] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x011d, blocks: (B:3:0x0002, B:5:0x0014, B:7:0x001e, B:9:0x0023, B:11:0x0029, B:13:0x002f, B:21:0x004d, B:23:0x0053, B:25:0x005b, B:26:0x005d, B:28:0x0061, B:30:0x0069, B:32:0x006d, B:34:0x0073, B:36:0x0079, B:38:0x0085, B:40:0x008f, B:42:0x0097, B:44:0x00a9, B:47:0x00b5, B:49:0x00c3, B:50:0x00cc, B:52:0x00ea, B:51:0x00e2, B:54:0x00f5, B:56:0x00ff, B:58:0x0109, B:15:0x0035, B:17:0x003d, B:19:0x0043, B:60:0x0113), top: B:68:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static kotlin.Pair LIZ(android.app.Activity r9, android.net.Uri r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1735560vGU.LIZ(android.app.Activity, android.net.Uri, boolean):kotlin.Pair");
    }

    public static String LIZIZ(Uri uri, String str, String str2) {
        boolean z;
        List list;
        Object next;
        DiversionTargetResCfg diversionTargetResCfg;
        String str3;
        Type type;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("placeholder_t_open_schema", Long.valueOf(System.currentTimeMillis()));
        Iterator it2 = linkedHashMap.entrySet().iterator();
        while (true) {
            z = false;
            if (!it2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it2.next();
            str2 = u.LJJIFFI(str2, (String) entry.getKey(), String.valueOf(((Number) entry.getValue()).longValue()), false);
        }
        String strLIZJ = LIZJ(uri, str, str2);
        try {
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(strLIZJ), "diversion_config");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
                new p();
                k kVarLJJIIZ = p.LIZJ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter).LJIILIIL().LJJIIZ("diversion_target_resources");
                if (kVarLJJIIZ != null) {
                    try {
                        Gson gsonLJFF = C1741890vQh.LJFF();
                        C1120604Zw.LIZ.getClass();
                        C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                        if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                            z = true;
                        }
                        if (z) {
                            C13JX c13jx = KTypeProjection.LIZJ;
                            C13JW c13jwLJII = C13LE.LJII(DiversionTargetRes.class);
                            c13jx.getClass();
                            type = C2371409Qy.LIZJ(C13LE.LJFF(List.class, C13JX.LIZ(c13jwLJII)));
                        } else {
                            type = new TypeToken<List<? extends DiversionTargetRes>>() { // from class: X.0vGV
                            }.getType();
                        }
                        Object objLIZLLL = gsonLJFF.LIZLLL(kVarLJJIIZ, type);
                        if (!(objLIZLLL instanceof List)) {
                            objLIZLLL = null;
                        }
                        list = (List) objLIZLLL;
                    } catch (s e) {
                        TryCatchGuardChecker.doCheck(e);
                        list = null;
                    }
                    if (list != null) {
                        Iterator it3 = list.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                next = it3.next();
                                if (Intrinsics.LJFF(((DiversionTargetRes) next).name, EnumC1735580vGW.MALL_SPARKVIEW.getValue())) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        DiversionTargetRes diversionTargetRes = (DiversionTargetRes) next;
                        if (diversionTargetRes != null && (diversionTargetResCfg = diversionTargetRes.config) != null && (str3 = diversionTargetResCfg.schema) != null) {
                            Uri uri2 = UriProtector.parse(str3);
                            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri2, "placeholder_cover");
                            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri2, "detail_params");
                            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 != null) {
                                LIZ.getClass();
                                C23250099c.LIZLLL(C2296808zG.LIZ(C2126308Ur.LIZ), null, null, new C06IR(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2, null), 3);
                            }
                            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 != null) {
                                LIZ.getClass();
                                C23250099c.LIZLLL(C2296808zG.LIZ(C2126308Ur.LIZ), null, null, new C1534505zb(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3, null), 3);
                            }
                        }
                    }
                }
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
            return strLIZJ;
        } catch (CancellationException e2) {
            TryCatchGuardChecker.doCheck(e2);
            throw e2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return strLIZJ;
        }
    }

    public static String LIZJ(Uri uri, String str, String str2) {
        boolean z;
        boolean z2;
        String strLJIL;
        if (str != null && !a0.LJJJIL(str)) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            try {
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str);
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null && !a0.LJJJIL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                Unit unit = null;
                if (!(!z2)) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = null;
                }
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
                    new p();
                    Set<Map.Entry<String, k>> setEntrySet = p.LIZJ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter).LJIILIIL().entrySet();
                    if (setEntrySet != null) {
                        Iterator<T> it2 = setEntrySet.iterator();
                        while (it2.hasNext()) {
                            Map.Entry entry = (Map.Entry) it2.next();
                            if (Intrinsics.LJFF(entry.getKey(), "placeholder_origin_cover")) {
                                strLJIL = Uri.encode(((k) entry.getValue()).LJIL());
                            } else {
                                strLJIL = ((k) entry.getValue()).LJIL();
                            }
                            str2 = u.LJJIFFI(str2, (String) entry.getKey(), strLJIL, false);
                        }
                        unit = Unit.LIZ;
                    }
                }
                C189200o6.m2constructorimpl(unit);
                return str2;
            } catch (CancellationException e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1AF0.LJ(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        return str2;
    }
}
