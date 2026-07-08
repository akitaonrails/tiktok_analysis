package X;

import android.content.Context;
import android.util.LruCache;
import android.view.View;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lynx.hybrid.i18n.SparkI18nManager;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.tiktok.ef.i18nmanagerapi.service.i18n.I18nManagerServiceApi;
import com.tiktok.myna.extension.setting.MynaFlattenOptExperiment;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS212S0000000_23;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0qQ0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1549260qQ0 implements InterfaceC1168280gVW {
    public static final C1549260qQ0 LIZ = new C1549260qQ0();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(238));

    @Override // X.InterfaceC1168280gVW
    public final String LIZIZ() {
        C844470XAv.LIZ.getClass();
        return C844470XAv.LIZJ();
    }

    @Override // X.InterfaceC1168280gVW
    public final long LIZJ() {
        C844470XAv.LIZ.getClass();
        return C844470XAv.LIZIZ();
    }

    @Override // X.InterfaceC1168280gVW
    public final String LIZLLL() {
        String lowerCase;
        I18nManagerServiceApi i18nManagerServiceApi = (I18nManagerServiceApi) PluggableExtentionKt.pluggableSpi$default(I18nManagerServiceApi.class, false, false, false, 14, null);
        if (i18nManagerServiceApi != null) {
            C844470XAv.LIZ.getClass();
            String strLJIILJJIL = i18nManagerServiceApi.LJIILJJIL(C844470XAv.LIZ());
            if (strLJIILJJIL != null && (lowerCase = strLJIILJJIL.toLowerCase(Locale.ENGLISH)) != null) {
                return lowerCase;
            }
        }
        return "en-us";
    }

    @Override // X.InterfaceC1168280gVW
    public final Context LJFF() {
        C844470XAv.LIZ.getClass();
        return C844470XAv.LIZ();
    }

    @Override // X.InterfaceC1168280gVW
    public final boolean LJII() {
        return ((Boolean) LIZIZ.getValue()).booleanValue();
    }

    @Override // X.InterfaceC1168280gVW
    public final Map<String, Object> LJIIIZ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        SettingsManager.LIZLLL().getClass();
        linkedHashMap.put("enable_serval_svg", Boolean.valueOf(SettingsManager.LIZ("enable_serval_svg", false)));
        boolean zLJIIIZ = C0C64.LJIILLIIL().LJIIIZ(31744, "myna_enable_leaf_flatten_opt", true, true);
        C01GW c01gw = MynaFlattenOptExperiment.LIZIZ;
        if (!((MynaFlattenOptExperiment.Config) c01gw.getValue()).enableLeafFlatten) {
            zLJIIIZ = false;
        }
        linkedHashMap.put("enable_leaf_flatten", Boolean.valueOf(zLJIIIZ));
        linkedHashMap.put("enable_level_flatten", Boolean.valueOf(((MynaFlattenOptExperiment.Config) c01gw.getValue()).enableLevelFlatten));
        linkedHashMap.put("enable_overflow_flatten", Boolean.valueOf(((MynaFlattenOptExperiment.Config) c01gw.getValue()).enableOverflowFlatten));
        linkedHashMap.put("enable_flatten_pool", Boolean.valueOf(((MynaFlattenOptExperiment.Config) c01gw.getValue()).enableFlattenPool));
        linkedHashMap.put("flatten_blacklist", ((MynaFlattenOptExperiment.Config) c01gw.getValue()).flattenBlacklist);
        SettingsManager.LIZLLL().getClass();
        linkedHashMap.put("legacy_forest_cdn_request", Boolean.valueOf(SettingsManager.LIZ("myna_legacy_forest_cdn_request", false)));
        return linkedHashMap;
    }

    @Override // X.InterfaceC1168280gVW
    public final int appId() {
        C844470XAv.LIZ.getClass();
        return C844470XAv.LJIIJ;
    }

    @Override // X.InterfaceC1168280gVW
    public final String channel() {
        C844470XAv.LIZ.getClass();
        return C844470XAv.LJIILL;
    }

    @Override // X.InterfaceC1168280gVW
    public final boolean isLocalTest() {
        C844470XAv.LIZ.getClass();
        return C844470XAv.LJIILL.equals("local_test");
    }

    @Override // X.InterfaceC1168280gVW
    public final String LJIIIIZZ(Context context) {
        if (C960203pA.LIZIZ(context)) {
            return "dark";
        }
        return "light";
    }

    @Override // X.InterfaceC1168280gVW
    public final void LJIIJ(Function1 function1) {
        if (!LJII()) {
            return;
        }
        function1.invoke(new Object() { // from class: X.0qQ6
        });
    }

    @Override // X.InterfaceC1168280gVW
    public final void ensureNotReachHere(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Unexpected reach here: ");
        sbLIZ.append(str);
        C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC1168280gVW
    public final void LIZ(String str, Map<String, ? extends Object> map) {
        JSONObject jSONObject = new JSONObject();
        String key = "";
        try {
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                key = entry.getKey();
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            C20684815ws.LJIJ(str, jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Myna, sendLog2: fail send event ");
            sbLIZ.append(str);
            sbLIZ.append(", key = ");
            sbLIZ.append(key);
            C1AF0.LJFF(e, C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // X.InterfaceC1168280gVW
    public final void LJ(final String str, Map<String, ? extends Object> map) {
        if (map != null) {
            SparkI18nManager.LIZ.getClass();
            SparkI18nManager.Meta metaLJIIIIZZ = SparkI18nManager.LJIIIIZZ(map);
            if (metaLJIIIIZZ != null) {
                final String strLIZLLL = LIZLLL();
                SparkI18nManager.LIZLLL(new C1540610qC3(metaLJIIIIZZ, strLIZLLL, false, null, 12), new InterfaceC1546990qML() { // from class: X.0qQ1
                    @Override // X.InterfaceC1546990qML
                    public final void LIZIZ(C1537200q6Y c1537200q6Y) {
                    }

                    @Override // X.InterfaceC1546990qML
                    public final void LIZ(Object obj) {
                        String str2;
                        Map map2;
                        C1549310qQ5 c1549310qQ5;
                        Map<String, C1549300qQ4> map3;
                        Map<String, C1549300qQ4> map4;
                        C1549300qQ4 c1549300qQ4;
                        Map<String, String> map5;
                        Map<String, C1549300qQ4> map6;
                        if (C189200o6.m7isFailureimpl(obj)) {
                            obj = null;
                        }
                        C1536580q5Y c1536580q5Y = (C1536580q5Y) obj;
                        if (c1536580q5Y != null) {
                            str2 = c1536580q5Y.LIZ;
                        } else {
                            str2 = null;
                        }
                        Map map7 = (Map) GsonProtectorUtils.fromJson(C1058250de3.LIZIZ(), str2, (Type) Map.class);
                        if (map7 != null) {
                            String str3 = str;
                            String str4 = strLIZLLL;
                            if (map7.get("data") instanceof Map) {
                                Object obj2 = map7.get("data");
                                if (obj2 instanceof Map) {
                                    map2 = (Map) obj2;
                                } else {
                                    map2 = null;
                                }
                                C1549290qQ3 c1549290qQ3 = C1549280qQ2.LIZ;
                                if (c1549290qQ3.LIZ.get(str3) == null) {
                                    c1549290qQ3.LIZ.put(str3, new C1549310qQ5(null));
                                }
                                C1549310qQ5 c1549310qQ52 = c1549290qQ3.LIZ.get(str3);
                                if ((c1549310qQ52 == null || (map6 = c1549310qQ52.LIZ) == null || map6.get(str4) == null) && (c1549310qQ5 = c1549290qQ3.LIZ.get(str3)) != null && (map3 = c1549310qQ5.LIZ) != null) {
                                    map3.put(str4, new C1549300qQ4(null));
                                }
                                C1549310qQ5 c1549310qQ53 = c1549290qQ3.LIZ.get(str3);
                                if (c1549310qQ53 != null && (map4 = c1549310qQ53.LIZ) != null && (c1549300qQ4 = map4.get(str4)) != null && (map5 = c1549300qQ4.LIZ) != null && map2 != null) {
                                    for (Map.Entry entry : map2.entrySet()) {
                                        Object value = entry.getValue();
                                        if (value != null) {
                                            map5.put((String) entry.getKey(), (String) value);
                                        }
                                    }
                                }
                            }
                        }
                    }
                });
            }
        }
    }

    @Override // X.InterfaceC1168280gVW
    public final AbstractC21333318eB LJI(final C21325918cz c21325918cz, String str) {
        if (Intrinsics.LJFF(str, "tux-icon")) {
            return new AbstractC21333318eB<TuxIconView>(c21325918cz) { // from class: X.0hQK
                public C1203510hQL LLZZJLIL;
                public final C01GW LLZZLLIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 2688));

                public static String LJLLILLLL(String str2) {
                    if (!a0.LJJJIL(str2) && a0.LJJIIZI(str2, "myna#", false)) {
                        return u.LJJIFFI(str2, "myna#", "myna%23", false);
                    }
                    return str2;
                }

                @Override // X.AbstractC21333318eB
                public final View LJJJLZIJ(Context context) {
                    return (View) this.LLZZLLIL.getValue();
                }

                /* JADX WARN: Removed duplicated region for block: B:39:0x00ef  */
                /* JADX WARN: Removed duplicated region for block: B:62:0x0148  */
                /* JADX WARN: Removed duplicated region for block: B:91:0x01d3 A[PHI: r5
                  0x01d3: PHI (r5v4 X.0Ra5) = (r5v3 X.0Ra5), (r5v6 X.0Ra5) binds: [B:16:0x0087, B:36:0x00e9] A[DONT_GENERATE, DONT_INLINE]] */
                @Override // X.AbstractC21333318eB
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LJJLIIIJILLIZJL(java.util.Map<java.lang.String, ? extends java.lang.Object> r16) {
                    /*
                        Method dump skipped, instruction units count: 548
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1203500hQK.LJJLIIIJILLIZJL(java.util.Map):void");
                }

                public final Integer LJLLJ(String str2) {
                    boolean z;
                    if (str2 != null && !a0.LJJJIL(str2)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        return null;
                    }
                    Integer numValueOf = Integer.valueOf(C786410Ut5.n3(LJJIJLIJ().getResources(), str2, "attr", LJJIJLIJ().getPackageName()));
                    if (numValueOf.intValue() == 0) {
                        return null;
                    }
                    return numValueOf;
                }

                /* JADX WARN: Removed duplicated region for block: B:33:0x0064  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Integer LJLLL(java.lang.String r7) {
                    /*
                        r6 = this;
                        r3 = 1
                        if (r7 == 0) goto Le
                        boolean r0 = kotlin.text.a0.LJJJIL(r7)
                        if (r0 != 0) goto Le
                        r0 = 0
                    La:
                        r2 = 0
                        if (r0 == 0) goto L10
                        return r2
                    Le:
                        r0 = 1
                        goto La
                    L10:
                        X.0hQL r0 = r6.LLZZJLIL
                        if (r0 != 0) goto L15
                        r0 = r2
                    L15:
                        java.lang.String r1 = r0.LIZIZ
                        if (r1 == 0) goto La1
                        boolean r0 = kotlin.text.a0.LJJJIL(r1)
                        r3 = r3 ^ r0
                        if (r3 == 0) goto La1
                        java.lang.String r3 = LJLLILLLL(r1)
                        if (r3 == 0) goto La1
                        X.0hQL r0 = r6.LLZZJLIL
                        if (r0 == 0) goto L2b
                        r2 = r0
                    L2b:
                        java.lang.String r0 = r2.LJ
                        r5 = 2131108793(0x7f0623b9, float:1.7830203E38)
                        java.lang.String r2 = "Dark"
                        java.lang.String r4 = "Light"
                        if (r0 == 0) goto L90
                        java.lang.CharSequence r0 = kotlin.text.a0.LJLIIIL(r0)
                        java.lang.String r1 = r0.toString()
                        java.util.Locale r0 = java.util.Locale.ROOT
                        java.lang.String r1 = r1.toLowerCase(r0)
                        java.lang.String r0 = "dark"
                        boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
                        if (r0 != 0) goto L65
                        java.lang.String r0 = "light"
                        boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
                        if (r0 != 0) goto L64
                        android.content.Context r0 = r6.LJJIJLIJ()
                        java.lang.Integer r0 = X.C1308910kAL.LIZ(r5, r0)
                        if (r0 == 0) goto L64
                        int r0 = r0.intValue()
                        if (r0 == 0) goto L65
                    L64:
                        r2 = r4
                    L65:
                        X.01GW r0 = X.C2248361CzK.LIZ
                        java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                        java.lang.String r0 = "tux://color?token="
                        r1.append(r0)
                        r1.append(r7)
                        java.lang.String r0 = "&from="
                        r1.append(r0)
                        r1.append(r3)
                        java.lang.String r0 = "&theme="
                        r1.append(r0)
                        r1.append(r2)
                        java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
                        android.content.Context r0 = r6.LJJIJLIJ()
                        java.lang.Integer r0 = X.C2248361CzK.LJ(r0, r1)
                        return r0
                    L90:
                        android.content.Context r0 = r6.LJJIJLIJ()
                        java.lang.Integer r0 = X.C1308910kAL.LIZ(r5, r0)
                        if (r0 == 0) goto L64
                        int r0 = r0.intValue()
                        if (r0 == 0) goto L65
                        goto L64
                    La1:
                        return r2
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1203500hQK.LJLLL(java.lang.String):java.lang.Integer");
                }

                public final Integer LJLLLL(Object obj) {
                    C1203510hQL c1203510hQL = null;
                    if (obj instanceof C1203510hQL) {
                        C1203510hQL c1203510hQL2 = this.LLZZJLIL;
                        if (c1203510hQL2 != null) {
                            c1203510hQL = c1203510hQL2;
                        }
                        return LJLLL(c1203510hQL.LIZLLL);
                    }
                    if (!(obj instanceof C1203520hQM)) {
                        return null;
                    }
                    return LJLLL(((C1203520hQM) obj).LIZIZ);
                }

                public final int LJLLLLLL(String str2) {
                    if (str2 != null) {
                        LruCache<Float, Integer> lruCache = C849430XTx.LIZ;
                        Integer numLIZLLL = C849430XTx.LIZLLL(this.LL.LJIIJ().LIZIZ, str2);
                        if (numLIZLLL != null) {
                            return numLIZLLL.intValue();
                        }
                        return -1;
                    }
                    return -1;
                }
            };
        }
        if (Intrinsics.LJFF(str, "tux-rating-bar")) {
            return new AbstractC21333318eB<C1203410hQB>(c21325918cz) { // from class: X.0hQJ
                public final C01GW LLZZJLIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 2689));

                public final C1203410hQB LJLLILLLL() {
                    return (C1203410hQB) this.LLZZJLIL.getValue();
                }

                @Override // X.AbstractC21333318eB
                public final View LJJJLZIJ(Context context) {
                    return LJLLILLLL();
                }

                /* JADX WARN: Removed duplicated region for block: B:19:0x0082  */
                /* JADX WARN: Removed duplicated region for block: B:21:0x008f  */
                /* JADX WARN: Removed duplicated region for block: B:24:0x00a0  */
                /* JADX WARN: Removed duplicated region for block: B:27:0x00a9  */
                /* JADX WARN: Removed duplicated region for block: B:28:0x00ab  */
                /* JADX WARN: Removed duplicated region for block: B:29:0x00b9  */
                @Override // X.AbstractC21333318eB
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LJJLIIIJILLIZJL(java.util.Map<java.lang.String, ? extends java.lang.Object> r8) {
                    /*
                        Method dump skipped, instruction units count: 212
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1203490hQJ.LJJLIIIJILLIZJL(java.util.Map):void");
                }
            };
        }
        return null;
    }
}
