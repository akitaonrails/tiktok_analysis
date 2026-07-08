package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.text.u;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.03kB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C929303kB implements InterfaceC930603kO {
    public final Map<String, InterfaceC930603kO> LIZ;

    public C929303kB() {
        HashMap map = new HashMap();
        this.LIZ = map;
        map.put("eg_ccdc_global_card_number", new InterfaceC930603kO() { // from class: X.03kA
            @Override // X.InterfaceC930603kO
            public final C922003j0 LIZ(C930103kJ... c930103kJArr) {
                String str;
                C931603kY c931603kYLIZIZ;
                C930503kN c930503kN;
                C922003j0 c922003j0 = new C922003j0();
                boolean z = true;
                c922003j0.LIZ = true;
                C930103kJ c930103kJ = c930103kJArr[0];
                String str2 = c930103kJ.LJI;
                if (c930103kJ.LIZIZ() && TextUtils.isEmpty(str2)) {
                    c922003j0.LIZ = false;
                    c922003j0.LIZIZ("pipo_common_error_required_field", "pipo_common_payin_card_number");
                } else {
                    Object obj = c930103kJ.LJIIIZ;
                    String str3 = null;
                    if (obj instanceof C930903kR) {
                        str = ((C930903kR) obj).LIZ;
                    } else {
                        str = null;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        C931003kS c931003kS = C932203ke.LIZ;
                        c931603kYLIZIZ = c931003kS.LIZJ(str2, str);
                        if (c931603kYLIZIZ == null) {
                            c931603kYLIZIZ = c931003kS.LIZIZ(str2);
                        }
                    } else {
                        c931603kYLIZIZ = C932203ke.LIZ.LIZIZ(str2);
                    }
                    Iterator it2 = ((ArrayList) ((C931203kU) C1724150uy5.LJIIL.LIZ()).LJI).iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            C930403kM c930403kM = (C930403kM) it2.next();
                            String str4 = c930403kM.LIZ;
                            if (str4 != null && str4.length() != 0 && u.LJJIIJZLJL(str2, str4, false)) {
                                C900703fZ c900703fZ = c930403kM.LIZIZ;
                                if (c900703fZ != null) {
                                    str3 = c900703fZ.LIZ;
                                }
                                c930503kN = new C930503kN(false, str3);
                            }
                        } else {
                            c930503kN = new C930503kN(true, null);
                            break;
                        }
                    }
                    C1724150uy5.LJIIL.LIZ().getClass();
                    List<String> list = C845503Sb.LIZJ;
                    if (list != null && (!list.isEmpty())) {
                        Iterator<String> it3 = list.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                if (u.LJJIIJZLJL(str2, it3.next(), false)) {
                                    break;
                                }
                            } else {
                                z = false;
                                break;
                            }
                        }
                    }
                    Boolean boolValueOf = Boolean.valueOf(z);
                    if (c931603kYLIZIZ != null) {
                        C1724150uy5 c1724150uy5 = C1724150uy5.LJIIL;
                        if (((HashMap) ((C931203kU) c1724150uy5.LIZ()).LJIIIIZZ).get(c931603kYLIZIZ.LJI) == null) {
                            c922003j0.LIZ = false;
                            c922003j0.LIZIZ("pipo_common_error_card_not_supported", new String[0]);
                            return c922003j0;
                        }
                        if (!c930503kN.LIZ) {
                            c922003j0.LIZ = false;
                            c922003j0.LIZJ = c930503kN.LIZIZ;
                            InterfaceC930803kQ interfaceC930803kQ = c1724150uy5.LIZ.LJJII;
                            if (interfaceC930803kQ != null) {
                                interfaceC930803kQ.onEvent(str2);
                                return c922003j0;
                            }
                        } else {
                            if (c931603kYLIZIZ.LIZLLL == null) {
                                c931603kYLIZIZ.LIZLLL = new ArrayList();
                                if (c931603kYLIZIZ.LIZJ != null) {
                                    for (int i = 0; i < c931603kYLIZIZ.LIZJ.length(); i++) {
                                        try {
                                            ((ArrayList) c931603kYLIZIZ.LIZLLL).add((Integer) c931603kYLIZIZ.LIZJ.get(i));
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                        }
                                    }
                                }
                            }
                            if (!((ArrayList) c931603kYLIZIZ.LIZLLL).contains(Integer.valueOf(str2.length()))) {
                                c922003j0.LIZ = false;
                                c922003j0.LIZIZ("pipo_common_error_card_number_length", new String[0]);
                                return c922003j0;
                            }
                            if (!Pattern.matches("^[0-9]+$", str2)) {
                                c922003j0.LIZ = false;
                                c922003j0.LIZIZ("pipo_common_error_card_check", new String[0]);
                                return c922003j0;
                            }
                            if (!C904903gF.LIZ(str2)) {
                                c922003j0.LIZ = false;
                                c922003j0.LIZIZ("pipo_common_error_card_number", new String[0]);
                                return c922003j0;
                            }
                            if (!boolValueOf.booleanValue()) {
                                c922003j0.LIZ = false;
                                c922003j0.LIZIZ("pipo_common_payin_ccinstallment_incorrect_card_notice", new String[0]);
                                return c922003j0;
                            }
                        }
                    } else {
                        c922003j0.LIZ = false;
                        c922003j0.LIZIZ("pipo_common_error_card_number", new String[0]);
                        return c922003j0;
                    }
                }
                return c922003j0;
            }
        });
        map.put("eg_ccdc_global_cvv", new InterfaceC930603kO() { // from class: X.03kE
            @Override // X.InterfaceC930603kO
            public final C922003j0 LIZ(C930103kJ... c930103kJArr) {
                C931503kX c931503kX;
                String strReplace;
                C922003j0 c922003j0 = new C922003j0();
                c922003j0.LIZ = true;
                C930103kJ c930103kJ = c930103kJArr[0];
                String str = c930103kJ.LJI;
                Object obj = c930103kJ.LJIIIZ;
                if (obj != null) {
                    c931503kX = (C931503kX) obj;
                } else {
                    c931503kX = null;
                }
                if (c930103kJ.LIZIZ() && TextUtils.isEmpty(str)) {
                    c922003j0.LIZ = false;
                    c922003j0.LIZIZ("pipo_common_error_required_field", "pipo_common_payin_security_code");
                } else if (c931503kX != null) {
                    if (c931503kX.LIZ().size() > 0) {
                        strReplace = c931503kX.LIZ().toString().replace(e3.e, "{").replace(e3.f, "}").replace(" ", "");
                    } else {
                        strReplace = "{3,4}";
                    }
                    if (!Pattern.matches(C786410Ut5.j4("^[0-9]%s$", new Object[]{strReplace}), str)) {
                        c922003j0.LIZ = false;
                        c922003j0.LIZIZ("pipo_common_error_is_invalid", "pipo_common_payin_security_code");
                        return c922003j0;
                    }
                    if (!Pattern.matches("^[0-9]{3,4}$", str)) {
                        c922003j0.LIZ = false;
                        c922003j0.LIZIZ("pipo_common_error_is_invalid", "pipo_common_payin_security_code");
                        return c922003j0;
                    }
                } else {
                    c922003j0.LIZ = false;
                    c922003j0.LIZIZ("pipo_common_error_is_invalid", "pipo_common_payin_security_code");
                    return c922003j0;
                }
                return c922003j0;
            }
        });
        map.put("eg_ccdc_global_expiration_year", new InterfaceC930603kO() { // from class: X.03j1
            @Override // X.InterfaceC930603kO
            public final C922003j0 LIZ(C930103kJ... c930103kJArr) {
                int iLIZJ;
                C930103kJ c930103kJ = c930103kJArr[0];
                C930103kJ c930103kJ2 = c930103kJArr[1];
                C922003j0 c922003j0 = new C922003j0();
                c922003j0.LIZ = true;
                Calendar calendar = Calendar.getInstance();
                int i = calendar.get(1);
                int i2 = calendar.get(2);
                String str = c930103kJ.LJI;
                if (c930103kJ.LIZIZ() && TextUtils.isEmpty(str)) {
                    c922003j0.LIZ = false;
                    c922003j0.LIZIZ("pipo_common_error_required_field", "pipo_common_payin_expiry_date");
                    iLIZJ = -1;
                } else {
                    iLIZJ = C906203gS.LIZJ(str);
                    if (!Pattern.matches("^[0-9]{2}$", str)) {
                        c922003j0.LIZ = false;
                        c922003j0.LIZIZ("pipo_common_payin_expiry_date", new String[0]);
                    } else if (!Pattern.matches("^[0-9]{2}$", str)) {
                        c922003j0.LIZ = false;
                        c922003j0.LIZIZ("pipo_common_payin_expiry_date", new String[0]);
                    } else if (iLIZJ > i + 15) {
                        c922003j0.LIZ = false;
                        c922003j0.LIZIZ("pipo_common_error_year_too_far", new String[0]);
                    } else {
                        int iLIZIZ = C906203gS.LIZIZ(c930103kJ2.LJI);
                        if (iLIZJ < i || (iLIZJ == i && iLIZIZ < i2)) {
                            c922003j0.LIZ = false;
                            c922003j0.LIZIZ("pipo_common_error_card_expired", new String[0]);
                        }
                    }
                }
                C922003j0 c922003j02 = new C922003j0();
                c922003j02.LIZ = true;
                String str2 = c930103kJ2.LJI;
                if (c930103kJ2.LIZIZ() && TextUtils.isEmpty(str2)) {
                    c922003j0.LIZ = false;
                    c922003j0.LIZIZ("pipo_common_error_required_field", "pipo_common_payin_expiry_date");
                } else {
                    int iLIZ = C906203gS.LIZ(str2);
                    if (!Pattern.matches("^[0-9]{2}$", str2)) {
                        c922003j02.LIZ = false;
                        c922003j02.LIZIZ("pipo_common_payin_expiry_date", new String[0]);
                    } else if (!Pattern.matches("^[0-9]{2}$", str2)) {
                        c922003j02.LIZ = false;
                        c922003j02.LIZIZ("pipo_common_payin_expiry_date", new String[0]);
                    } else if (iLIZ <= 12 && iLIZ >= 1) {
                        if ((iLIZJ == i && iLIZ < i2) || iLIZJ < i) {
                            c922003j02.LIZ = false;
                            c922003j02.LIZIZ("pipo_common_error_card_expired", new String[0]);
                        }
                    } else {
                        c922003j02.LIZ = false;
                        c922003j02.LIZIZ("pipo_common_error_month_check", new String[0]);
                    }
                }
                if (c922003j0.LJ == null) {
                    c922003j0.LJ = new ArrayList();
                }
                ((ArrayList) c922003j0.LJ).add(c922003j02);
                return c922003j0;
            }
        });
        map.put("eg_ccdc_global_expiration_month", new InterfaceC930603kO() { // from class: X.03j1
            @Override // X.InterfaceC930603kO
            public final C922003j0 LIZ(C930103kJ... c930103kJArr) {
                int iLIZJ;
                C930103kJ c930103kJ = c930103kJArr[0];
                C930103kJ c930103kJ2 = c930103kJArr[1];
                C922003j0 c922003j0 = new C922003j0();
                c922003j0.LIZ = true;
                Calendar calendar = Calendar.getInstance();
                int i = calendar.get(1);
                int i2 = calendar.get(2);
                String str = c930103kJ.LJI;
                if (c930103kJ.LIZIZ() && TextUtils.isEmpty(str)) {
                    c922003j0.LIZ = false;
                    c922003j0.LIZIZ("pipo_common_error_required_field", "pipo_common_payin_expiry_date");
                    iLIZJ = -1;
                } else {
                    iLIZJ = C906203gS.LIZJ(str);
                    if (!Pattern.matches("^[0-9]{2}$", str)) {
                        c922003j0.LIZ = false;
                        c922003j0.LIZIZ("pipo_common_payin_expiry_date", new String[0]);
                    } else if (!Pattern.matches("^[0-9]{2}$", str)) {
                        c922003j0.LIZ = false;
                        c922003j0.LIZIZ("pipo_common_payin_expiry_date", new String[0]);
                    } else if (iLIZJ > i + 15) {
                        c922003j0.LIZ = false;
                        c922003j0.LIZIZ("pipo_common_error_year_too_far", new String[0]);
                    } else {
                        int iLIZIZ = C906203gS.LIZIZ(c930103kJ2.LJI);
                        if (iLIZJ < i || (iLIZJ == i && iLIZIZ < i2)) {
                            c922003j0.LIZ = false;
                            c922003j0.LIZIZ("pipo_common_error_card_expired", new String[0]);
                        }
                    }
                }
                C922003j0 c922003j02 = new C922003j0();
                c922003j02.LIZ = true;
                String str2 = c930103kJ2.LJI;
                if (c930103kJ2.LIZIZ() && TextUtils.isEmpty(str2)) {
                    c922003j0.LIZ = false;
                    c922003j0.LIZIZ("pipo_common_error_required_field", "pipo_common_payin_expiry_date");
                } else {
                    int iLIZ = C906203gS.LIZ(str2);
                    if (!Pattern.matches("^[0-9]{2}$", str2)) {
                        c922003j02.LIZ = false;
                        c922003j02.LIZIZ("pipo_common_payin_expiry_date", new String[0]);
                    } else if (!Pattern.matches("^[0-9]{2}$", str2)) {
                        c922003j02.LIZ = false;
                        c922003j02.LIZIZ("pipo_common_payin_expiry_date", new String[0]);
                    } else if (iLIZ <= 12 && iLIZ >= 1) {
                        if ((iLIZJ == i && iLIZ < i2) || iLIZJ < i) {
                            c922003j02.LIZ = false;
                            c922003j02.LIZIZ("pipo_common_error_card_expired", new String[0]);
                        }
                    } else {
                        c922003j02.LIZ = false;
                        c922003j02.LIZIZ("pipo_common_error_month_check", new String[0]);
                    }
                }
                if (c922003j0.LJ == null) {
                    c922003j0.LJ = new ArrayList();
                }
                ((ArrayList) c922003j0.LJ).add(c922003j02);
                return c922003j0;
            }
        });
        map.put("eg_ccdc_global_billing_address_country_regin", new InterfaceC930603kO() { // from class: X.03kK
            @Override // X.InterfaceC930603kO
            public final C922003j0 LIZ(C930103kJ... c930103kJArr) {
                C922003j0 c922003j0 = new C922003j0();
                c922003j0.LIZ = true;
                String str = c930103kJArr[0].LJI;
                String str2 = c930103kJArr[1].LJI;
                String str3 = c930103kJArr[2].LJI;
                boolean zIsEmpty = TextUtils.isEmpty(str);
                boolean zIsEmpty2 = TextUtils.isEmpty(str2);
                boolean zIsEmpty3 = TextUtils.isEmpty(str3);
                if ((zIsEmpty || zIsEmpty2 || zIsEmpty3) && (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3))) {
                    c922003j0.LIZ = false;
                    c922003j0.LIZIZ("invalid_billing_address", new String[0]);
                } else if (!TextUtils.isEmpty(str3) && str3.length() > 300) {
                    c922003j0.LIZ = false;
                    c922003j0.LIZIZ("invalid_post_code", new String[0]);
                    return c922003j0;
                }
                return c922003j0;
            }
        });
        map.put("eg_ccdc_global_identity", new InterfaceC930603kO() { // from class: X.03kL
            /* JADX WARN: Code restructure failed: missing block: B:35:0x00d4, code lost:
            
                if (r6 != X.C906203gS.LIZ(java.lang.String.valueOf(r11.charAt(10)))) goto L36;
             */
            @Override // X.InterfaceC930603kO
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.C922003j0 LIZ(X.C930103kJ... r14) {
                /*
                    Method dump skipped, instruction units count: 224
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C930303kL.LIZ(X.03kJ[]):X.03j0");
            }
        });
        map.put("eg_pi_ew_ovo_c_d_local_id_wallet_id", new InterfaceC930603kO() { // from class: X.03kD
            @Override // X.InterfaceC930603kO
            public final C922003j0 LIZ(C930103kJ... c930103kJArr) {
                C922003j0 c922003j0 = new C922003j0();
                c922003j0.LIZ = true;
                C930103kJ c930103kJ = c930103kJArr[0];
                String str = c930103kJ.LJI;
                if (c930103kJ.LIZIZ() && TextUtils.isEmpty(str)) {
                    c922003j0.LIZ = false;
                    c922003j0.LIZIZ("pipo_common_error_required_field", "pipo_common_payin_ovo_id");
                } else if (!Pattern.matches("^08[0-9]{8,11}$", str)) {
                    c922003j0.LIZ = false;
                    c922003j0.LIZIZ("pipo_common_error_is_invalid", "pipo_common_payin_ovo_id");
                    return c922003j0;
                }
                return c922003j0;
            }
        });
        map.put("eg_ccdc_global_holder_name", new InterfaceC930603kO() { // from class: X.03j2
            @Override // X.InterfaceC930603kO
            public final C922003j0 LIZ(C930103kJ... c930103kJArr) {
                C922003j0 c922003j0 = new C922003j0();
                c922003j0.LIZ = true;
                C930103kJ c930103kJ = c930103kJArr[0];
                String str = c930103kJ.LJI;
                if (c930103kJ.LIZIZ() && TextUtils.isEmpty(str)) {
                    c922003j0.LIZ = false;
                    c922003j0.LIZIZ("pipo_common_error_required_field", "pipo_common_payin_cardholder_name");
                } else if (!Pattern.matches(C889903dp.LIZLLL, str)) {
                    c922003j0.LIZ = false;
                    c922003j0.LIZIZ("pipo_common_error_is_invalid", "pipo_common_payin_cardholder_name");
                    return c922003j0;
                }
                return c922003j0;
            }
        });
        map.put("eg_ccdc_global_email", new InterfaceC930603kO() { // from class: X.03kC
            @Override // X.InterfaceC930603kO
            public final C922003j0 LIZ(C930103kJ... c930103kJArr) {
                C922003j0 c922003j0 = new C922003j0();
                c922003j0.LIZ = true;
                C930103kJ c930103kJ = c930103kJArr[0];
                String str = c930103kJ.LJI;
                if (c930103kJ.LIZIZ() && TextUtils.isEmpty(str)) {
                    c922003j0.LIZ = false;
                    c922003j0.LIZIZ("pipo_common_error_required_field", "pipo_common_payin_Email");
                } else if (!Pattern.matches("^(([^<>()\\[\\]\\\\.,;:\\s@\"]+(\\.[^<>()\\[\\]\\\\.,;:\\s@\"]+)*)|(\".+\"))@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$", str)) {
                    c922003j0.LIZ = false;
                    c922003j0.LIZIZ("pipo_common_error_is_invalid", "pipo_common_payin_Email");
                    return c922003j0;
                }
                return c922003j0;
            }
        });
        map.put("eg_ccdc_global_billing_address", new InterfaceC930603kO() { // from class: X.03kH
            @Override // X.InterfaceC930603kO
            public final C922003j0 LIZ(C930103kJ... c930103kJArr) {
                C922003j0 c922003j0 = new C922003j0();
                c922003j0.LIZ = true;
                C930103kJ c930103kJ = c930103kJArr[0];
                String str = c930103kJ.LJI;
                if (c930103kJ.LIZIZ() && TextUtils.isEmpty(str)) {
                    c922003j0.LIZ = false;
                    c922003j0.LIZIZ("pipo_common_error_required_field", "pipo_common_payin_mobile_address1");
                }
                return c922003j0;
            }
        });
        map.put("eg_ccdc_global_billing_address_street_mobile", new InterfaceC930603kO() { // from class: X.03kG
            @Override // X.InterfaceC930603kO
            public final C922003j0 LIZ(C930103kJ... c930103kJArr) {
                C922003j0 c922003j0 = new C922003j0();
                c922003j0.LIZ = true;
                C930103kJ c930103kJ = c930103kJArr[0];
                String str = c930103kJ.LJI;
                if (c930103kJ.LIZIZ() && TextUtils.isEmpty(str)) {
                    c922003j0.LIZ = false;
                    c922003j0.LIZIZ("pipo_common_error_required_field", "pipo_common_payin_address");
                }
                return c922003j0;
            }
        });
        map.put("eg_ccdc_global_billing_address_postal_code", new InterfaceC930603kO() { // from class: X.03kF
            @Override // X.InterfaceC930603kO
            public final C922003j0 LIZ(C930103kJ... c930103kJArr) {
                C922003j0 c922003j0 = new C922003j0();
                c922003j0.LIZ = true;
                C930103kJ c930103kJ = c930103kJArr[0];
                String str = c930103kJ.LJI;
                if (c930103kJ.LIZIZ() && TextUtils.isEmpty(str)) {
                    c922003j0.LIZ = false;
                    c922003j0.LIZIZ("pipo_common_error_required_field", "pipo_common_payin_postalcode");
                }
                return c922003j0;
            }
        });
        for (Object obj : (HashSet) C889903dp.LIZ) {
            if (!this.LIZ.containsKey(obj)) {
                Map<String, InterfaceC930603kO> map2 = this.LIZ;
                map2.put((String) obj, map2.get("eg_ccdc_global_card_number"));
            }
        }
        for (Object obj2 : (HashSet) C889903dp.LIZIZ) {
            if (!this.LIZ.containsKey(obj2)) {
                Map<String, InterfaceC930603kO> map3 = this.LIZ;
                map3.put((String) obj2, map3.get("eg_ccdc_global_expiration_year"));
            }
        }
        for (Object obj3 : (HashSet) C889903dp.LIZJ) {
            if (!this.LIZ.containsKey(obj3)) {
                Map<String, InterfaceC930603kO> map4 = this.LIZ;
                map4.put((String) obj3, map4.get("eg_ccdc_global_expiration_month"));
            }
        }
    }

    @Override // X.InterfaceC930603kO
    public final C922003j0 LIZ(C930103kJ... c930103kJArr) {
        InterfaceC930603kO interfaceC930603kO = (InterfaceC930603kO) ((HashMap) this.LIZ).get(c930103kJArr[0].LIZ);
        C922003j0 c922003j0 = new C922003j0();
        if (interfaceC930603kO != null) {
            return interfaceC930603kO.LIZ(c930103kJArr);
        }
        return c922003j0;
    }
}
