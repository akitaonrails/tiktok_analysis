package X;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.tasm.TemplateData;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PdN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C649270PdN {
    public static final C649270PdN LIZ = new C649270PdN();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(706));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(708));
    public static final C01GW LIZLLL = C1935507i5.LIZ(AFwS196S0000000_10.get$arr$(707));
    public static String LJ = "";
    public static final ConcurrentHashMap<SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, AbstractC1542100qES> LJFF = new ConcurrentHashMap<>();

    public static void LJ() {
        Iterator it2 = ((ConcurrentHashMap) LIZIZ.getValue()).entrySet().iterator();
        while (it2.hasNext()) {
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJIL(((C649110Pd7) ((Map.Entry) it2.next()).getValue()).LIZIZ);
        }
        ((ConcurrentHashMap) LIZIZ.getValue()).clear();
        Iterator it3 = ((ConcurrentHashMap) LIZJ.getValue()).entrySet().iterator();
        while (it3.hasNext()) {
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJIL(((C649110Pd7) ((Map.Entry) it3.next()).getValue()).LIZIZ);
        }
        ((ConcurrentHashMap) LIZJ.getValue()).clear();
    }

    public static void LIZIZ(CharSequence charSequence) {
        if ((TextUtils.equals(charSequence, "TikTok Theme Dark") || TextUtils.equals(LJ, "TikTok Theme Dark")) && !TextUtils.equals(charSequence, LJ)) {
            LJ();
            LJ = charSequence.toString();
        }
    }

    public static void LIZ(boolean z, String str, C649110Pd7 c649110Pd7) {
        try {
            CharSequence charSequenceLJIIIIZZ = C1308910kAL.LJIIIIZZ(c649110Pd7.LIZIZ.getContext());
            if (charSequenceLJIIIIZZ == null) {
                charSequenceLJIIIIZZ = "";
            }
            LIZIZ(charSequenceLJIIIIZZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (z) {
            ((ConcurrentHashMap) LIZJ.getValue()).put(str, c649110Pd7);
        } else {
            ((ConcurrentHashMap) LIZIZ.getValue()).put(str, c649110Pd7);
        }
    }

    public static C649110Pd7 LIZJ(String str, AbstractC1542100qES abstractC1542100qES, View view) {
        CharSequence charSequenceLJIIIIZZ;
        boolean z;
        boolean z2;
        EnumC647870Pb7 enumC647870Pb7;
        Activity activityLIZ;
        Activity activityLIZ2;
        Context context;
        C19EG c19egLJ = C651290Pgd.LJ();
        if (c19egLJ == null || (charSequenceLJIIIIZZ = C1308910kAL.LJIIIIZZ(c19egLJ)) == null) {
            charSequenceLJIIIIZZ = "";
        }
        LIZIZ(charSequenceLJIIIIZZ);
        C01GW c01gw = LIZJ;
        C649110Pd7 c649110Pd7 = (C649110Pd7) ((ConcurrentHashMap) c01gw.getValue()).remove(str);
        if (c649110Pd7 == null) {
            c649110Pd7 = (C649110Pd7) ((ConcurrentHashMap) LIZIZ.getValue()).remove(str);
            z = false;
        } else {
            z = true;
        }
        C649200PdG.LIZ.getClass();
        if (C649200PdG.LIZIZ == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        EnumC647870Pb7 enumC647870Pb72 = null;
        if (z2 && C649470Pdh.LJIILL(str) && c649110Pd7 != null && view != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = c649110Pd7.LIZIZ;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null && (context = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getContext()) != null) {
                activityLIZ = C1388190mED.LIZ(context);
            } else {
                activityLIZ = null;
            }
            Context context2 = view.getContext();
            if (context2 != null) {
                activityLIZ2 = C1388190mED.LIZ(context2);
            } else {
                activityLIZ2 = null;
            }
            if (!Intrinsics.LJFF(activityLIZ, activityLIZ2)) {
                if (z) {
                    ((ConcurrentHashMap) c01gw.getValue()).put(str, c649110Pd7);
                    return null;
                }
                ((ConcurrentHashMap) LIZIZ.getValue()).put(str, c649110Pd7);
                return null;
            }
        }
        if (C0QCS.LIZ(str)) {
            if (c649110Pd7 != null) {
                enumC647870Pb7 = c649110Pd7.LIZJ;
            } else {
                enumC647870Pb7 = null;
            }
            if (enumC647870Pb7 == EnumC647870Pb7.LOADING) {
                LJFF.put(c649110Pd7.LIZIZ, abstractC1542100qES);
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetch cache of ");
        sbLIZ.append(str);
        sbLIZ.append(" and result is ");
        sbLIZ.append(c649110Pd7);
        sbLIZ.append(" status:");
        if (c649110Pd7 != null) {
            enumC647870Pb72 = c649110Pd7.LIZJ;
        }
        sbLIZ.append(enumC647870Pb72);
        sbLIZ.append(' ');
        C2188811AlT.LIZIZ(sbLIZ);
        return c649110Pd7;
    }

    public static void LIZLLL(C649270PdN c649270PdN, Context context, final String str, String str2, C649350PdV c649350PdV, TemplateData templateData) {
        C1538200q8A c1538200q8A;
        String str3 = str2;
        TemplateData templateDataLIZJ = templateData;
        final boolean z = false;
        c649270PdN.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        C1537900q7g c1537900q7g = C1541950qED.LIZJ;
        SparkContext sparkContext = new SparkContext();
        c1537900q7g.getClass();
        C1541950qED c1541950qED = new C1541950qED(context, sparkContext);
        C0C64.LJIILLIIL().LJIIIZ(31744, "preload_without_prepare", true, false);
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ = c1541950qED.LIZ(false);
        SparkContext sparkContext2 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ.getSparkContext();
        if (sparkContext2 != null && (c1538200q8A = (C1538200q8A) sparkContext2.LJFF(C1538200q8A.class)) != null) {
            c1538200q8A.LJIILLIIL.put("containerContextStart", Long.valueOf(jCurrentTimeMillis));
        }
        if (templateDataLIZJ != null) {
            Boolean bool = Boolean.TRUE;
            templateDataLIZJ.LJIILIIL("isPreload", bool);
            templateDataLIZJ.LJIILIIL("hitPreload", bool);
        } else {
            C647380PaK c647380PaK = C647380PaK.LJIIIIZZ;
            if (str3 == null) {
                str3 = "{}";
            }
            Boolean bool2 = Boolean.TRUE;
            Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("isPreload", bool2), new Pair("hitPreload", bool2));
            SparkContext sparkContext3 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ.getSparkContext();
            c647380PaK.getClass();
            templateDataLIZJ = C647380PaK.LIZJ(str, str3, mapLJIIIIZZ, sparkContext3);
        }
        sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ.U0(C2097908Jt.LIZJ(new Pair("is_preload", Boolean.TRUE)));
        final C649110Pd7 c649110Pd7 = new C649110Pd7(str, sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ, EnumC647870Pb7.LOADING);
        if (C0QCS.LIZ(str)) {
            LIZ(false, str, c649110Pd7);
        }
        final C013C c013c = new C013C();
        final C013C c013c2 = new C013C();
        final C259800zU c259800zU = new C259800zU();
        C649100Pd6.LJFF(C649100Pd6.LIZ, sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ, str, templateDataLIZJ, true, new AbstractC1542100qES() { // from class: X.0PdM
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.AbstractC1537870q7d
            public final void LJLIIIL(InterfaceC1541990qEH interfaceC1541990qEH) {
                c013c2.element = true;
                c259800zU.element = interfaceC1541990qEH;
                if (c013c.element) {
                    c649110Pd7.LIZJ = EnumC647870Pb7.SUCCEED;
                    if (C0QCS.LIZ(str)) {
                        C649270PdN.LIZ.getClass();
                        AbstractC1542100qES abstractC1542100qESRemove = C649270PdN.LJFF.remove(c649110Pd7.LIZIZ);
                        if (abstractC1542100qESRemove != null) {
                            abstractC1542100qESRemove.LJLIIIL(interfaceC1541990qEH);
                            return;
                        }
                        return;
                    }
                    C649270PdN c649270PdN2 = C649270PdN.LIZ;
                    boolean z2 = z;
                    String str4 = str;
                    C649110Pd7 c649110Pd72 = c649110Pd7;
                    c649270PdN2.getClass();
                    C649270PdN.LIZ(z2, str4, c649110Pd72);
                    return;
                }
                C647890Pb9 c647890Pb9 = new C647890Pb9();
                c647890Pb9.LJIIZILJ("type", "load_error");
                c647890Pb9.LJJIFFI(1);
                c647890Pb9.LJIIZILJ("error", "runtime_not_ready");
                c647890Pb9.LJIIZILJ("schema", str);
                c647890Pb9.LJIILJJIL();
                C665010Q6p c665010Q6p = C665010Q6p.LIZ;
                String str5 = str;
                c665010Q6p.getClass();
                if (!C665010Q6p.LIZIZ(str5)) {
                    return;
                }
                c649110Pd7.LIZJ = EnumC647870Pb7.SUCCEED;
                if (C0QCS.LIZ(str)) {
                    C649270PdN.LIZ.getClass();
                    AbstractC1542100qES abstractC1542100qESRemove2 = C649270PdN.LJFF.remove(c649110Pd7.LIZIZ);
                    if (abstractC1542100qESRemove2 == null) {
                        return;
                    }
                    abstractC1542100qESRemove2.LJLIIIL(interfaceC1541990qEH);
                    return;
                }
                C649270PdN c649270PdN3 = C649270PdN.LIZ;
                boolean z3 = z;
                String str6 = str;
                C649110Pd7 c649110Pd73 = c649110Pd7;
                c649270PdN3.getClass();
                C649270PdN.LIZ(z3, str6, c649110Pd73);
            }

            @Override // X.AbstractC1537870q7d
            public final void LJLJJLL(EnumC1067640dtC enumC1067640dtC) {
                c013c.element = true;
                InterfaceC1541990qEH interfaceC1541990qEH = c259800zU.element;
                if (interfaceC1541990qEH != null) {
                    C013C c013c3 = c013c2;
                    C649110Pd7 c649110Pd72 = c649110Pd7;
                    String str4 = str;
                    boolean z2 = z;
                    if (c013c3.element) {
                        c649110Pd72.LIZJ = EnumC647870Pb7.SUCCEED;
                        if (C0QCS.LIZ(str4)) {
                            C649270PdN.LIZ.getClass();
                            AbstractC1542100qES abstractC1542100qESRemove = C649270PdN.LJFF.remove(c649110Pd72.LIZIZ);
                            if (abstractC1542100qESRemove != null) {
                                abstractC1542100qESRemove.LJLIIIL(interfaceC1541990qEH);
                                return;
                            }
                            return;
                        }
                        C649270PdN.LIZ.getClass();
                        C649270PdN.LIZ(z2, str4, c649110Pd72);
                    }
                }
            }

            @Override // X.AbstractC1537870q7d
            public final void LJLI(InterfaceC1541990qEH interfaceC1541990qEH, String str4, String str5) {
                if (C0QCS.LIZ(str)) {
                    c649110Pd7.LIZJ = EnumC647870Pb7.FAILED;
                    C649270PdN.LIZ.getClass();
                    AbstractC1542100qES abstractC1542100qESRemove = C649270PdN.LJFF.remove(c649110Pd7.LIZIZ);
                    if (abstractC1542100qESRemove != null) {
                        abstractC1542100qESRemove.LJLI(interfaceC1541990qEH, str4, str5);
                    }
                }
            }
        }, new C689770R3v(c649350PdV, sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ, 1), null, null, 192);
    }
}
