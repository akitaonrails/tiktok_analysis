package X;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.bpea.basics.Cert;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS208S0000000_20;

/* JADX INFO: renamed from: X.0hYG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1208420hYG {
    public final Context LIZ;
    public final boolean LIZIZ;
    public final Function0<String> LIZJ;
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS208S0000000_20.get$arr$(50));

    public final int LIZ(Cert cert) {
        if (!this.LIZIZ) {
            return 0;
        }
        C1208130hXn.LIZJ.getClass();
        C1208160hXq c1208160hXqLIZ = C1208130hXn.LIZLLL.LIZ(cert);
        if (c1208160hXqLIZ == null || c1208160hXqLIZ.LJI == null) {
            return 2;
        }
        EnumC1208400hYE enumC1208400hYE = EnumC1208400hYE.InAppPromote;
        if (!LJIIIIZZ(enumC1208400hYE, c1208160hXqLIZ.LJ)) {
            return 1;
        }
        if (LJII(cert, enumC1208400hYE, c1208160hXqLIZ.LJ)) {
            return 0;
        }
        return 2;
    }

    public final int LIZIZ(Cert cert) {
        if (!this.LIZIZ) {
            return 0;
        }
        C1208130hXn.LIZJ.getClass();
        C1208160hXq c1208160hXqLIZ = C1208130hXn.LIZLLL.LIZ(cert);
        if (c1208160hXqLIZ == null) {
            return 2;
        }
        EnumC1208400hYE enumC1208400hYE = EnumC1208400hYE.System;
        if (!LJIIIIZZ(enumC1208400hYE, c1208160hXqLIZ.LJ)) {
            return 1;
        }
        if (LJII(cert, enumC1208400hYE, c1208160hXqLIZ.LJ)) {
            return 0;
        }
        return 2;
    }

    public final int LIZJ(Cert cert) {
        if (!this.LIZIZ) {
            return 0;
        }
        C1208130hXn.LIZJ.getClass();
        C1208160hXq c1208160hXqLIZ = C1208130hXn.LIZLLL.LIZ(cert);
        if (c1208160hXqLIZ == null || c1208160hXqLIZ.LIZIZ == null) {
            return 2;
        }
        EnumC1208400hYE enumC1208400hYE = EnumC1208400hYE.SystemPromote;
        if (!LJIIIIZZ(enumC1208400hYE, c1208160hXqLIZ.LJ)) {
            return 1;
        }
        if (LJII(cert, enumC1208400hYE, c1208160hXqLIZ.LJ)) {
            return 0;
        }
        return 2;
    }

    public final C1208560hYU LIZLLL(EnumC2192761Arq enumC2192761Arq) {
        String strInvoke = this.LIZJ.invoke();
        Map map = (Map) this.LIZLLL.getValue();
        Object objSynchronizedMap = map.get(enumC2192761Arq);
        if (objSynchronizedMap == null) {
            objSynchronizedMap = Collections.synchronizedMap(new HashMap());
            map.put(enumC2192761Arq, objSynchronizedMap);
        }
        Map map2 = (Map) objSynchronizedMap;
        Object c1208560hYU = map2.get(strInvoke);
        if (c1208560hYU == null) {
            c1208560hYU = new C1208560hYU(this.LIZ, strInvoke, enumC2192761Arq);
            map2.put(strInvoke, c1208560hYU);
        }
        return (C1208560hYU) c1208560hYU;
    }

    public final long LJI(EnumC2192761Arq enumC2192761Arq) {
        if (!this.LIZIZ) {
            return 0L;
        }
        return LIZLLL(enumC2192761Arq).LIZJ().LJ;
    }

    public final boolean LJIIIZ(EnumC2192761Arq enumC2192761Arq) {
        C1208410hYF c1208410hYF;
        int i;
        C1208560hYU c1208560hYULIZLLL = LIZLLL(enumC2192761Arq);
        int i2 = c1208560hYULIZLLL.LIZJ().LIZIZ;
        C1209840haY c1209840haYLJFF = LJFF(EnumC1208400hYE.System, enumC2192761Arq, i2);
        if (c1209840haYLJFF != null && (c1208410hYF = c1209840haYLJFF.LIZIZ) != null) {
            C1208520hYQ c1208520hYQLIZJ = c1208560hYULIZLLL.LIZJ();
            if (i2 == 0) {
                i = c1208520hYQLIZJ.LIZLLL;
            } else {
                i = c1208520hYQLIZJ.LIZJ;
            }
            long j = c1208560hYULIZLLL.LIZJ().LJ;
            C1798620wuC c1798620wuC = C1798620wuC.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("isGlobalSystemAllowed: ");
            sbLIZ.append(enumC2192761Arq);
            sbLIZ.append(", ");
            sbLIZ.append(i2);
            sbLIZ.append(", count=");
            sbLIZ.append(i);
            sbLIZ.append(", lastTime=");
            sbLIZ.append(j);
            sbLIZ.append(", config=");
            sbLIZ.append(c1209840haYLJFF);
            C1798620wuC.LIZLLL("LocationController", C2188811AlT.LIZIZ(sbLIZ));
            return new C1209850haZ(c1208410hYF).LIZ(i, j);
        }
        C1798620wuC.LIZLLL("LocationController", "isGlobalSystemPopupAllowed: true, config is null");
        return true;
    }

    public final boolean LJIIIIZZ(EnumC1208400hYE enumC1208400hYE, EnumC2192761Arq enumC2192761Arq) {
        int i;
        C1208410hYF c1208410hYF;
        int i2 = C1208390hYD.LIZ[enumC1208400hYE.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 == 4) {
                        return false;
                    }
                    throw new C1954807lC();
                }
                C1208560hYU c1208560hYULIZLLL = LIZLLL(enumC2192761Arq);
                C1208570hYV c1208570hYVLIZLLL = c1208560hYULIZLLL.LIZLLL();
                if (c1208570hYVLIZLLL.LIZIZ == EnumC2192761Arq.Passive) {
                    i = c1208570hYVLIZLLL.LJ;
                } else {
                    i = -1;
                }
                C1209840haY c1209840haYLJFF = LJFF(EnumC1208400hYE.InAppPromote, enumC2192761Arq, i);
                if (c1209840haYLJFF != null && (c1208410hYF = c1209840haYLJFF.LIZIZ) != null) {
                    int i3 = c1208560hYULIZLLL.LIZLLL().LIZJ;
                    long j = c1208560hYULIZLLL.LIZLLL().LIZLLL;
                    C1798620wuC c1798620wuC = C1798620wuC.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("isGlobalInAppPromoteAllowed: ");
                    sbLIZ.append(enumC2192761Arq);
                    sbLIZ.append(", ");
                    sbLIZ.append(i);
                    sbLIZ.append(", count=");
                    sbLIZ.append(i3);
                    sbLIZ.append(", lastTime=");
                    sbLIZ.append(j);
                    sbLIZ.append(", config=");
                    sbLIZ.append(c1209840haYLJFF);
                    C1798620wuC.LIZLLL("LocationController", C2188811AlT.LIZIZ(sbLIZ));
                    return new C1209850haZ(c1208410hYF).LIZ(i3, j);
                }
                C1798620wuC.LIZLLL("LocationController", "isGlobalInAppPromoteAllowed: true, config is null");
                return true;
            }
            return LJIIIZ(enumC2192761Arq);
        }
        return LJIIIZ(enumC2192761Arq);
    }

    public C1208420hYG(Context context, boolean z, Function0<String> function0) {
        this.LIZ = context;
        this.LIZIZ = z;
        this.LIZJ = function0;
    }

    public static C1208410hYF LJ(Cert cert, EnumC1208400hYE enumC1208400hYE, int i) {
        List<C1208410hYF> list;
        C1208130hXn.LIZJ.getClass();
        C1208160hXq c1208160hXqLIZ = C1208130hXn.LIZLLL.LIZ(cert);
        C1208410hYF c1208410hYF = null;
        if (c1208160hXqLIZ == null || (list = c1208160hXqLIZ.LJII) == null) {
            return null;
        }
        Iterator<C1208410hYF> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            C1208410hYF next = it2.next();
            C1208410hYF c1208410hYF2 = next;
            if (c1208410hYF2.LIZIZ == i && c1208410hYF2.LIZ == enumC1208400hYE) {
                c1208410hYF = next;
                break;
            }
        }
        return c1208410hYF;
    }

    public static C1209840haY LJFF(EnumC1208400hYE enumC1208400hYE, EnumC2192761Arq enumC2192761Arq, int i) {
        C1209840haY next;
        C1208130hXn.LIZJ.getClass();
        Iterator<C1209840haY> it2 = C1208130hXn.LIZLLL.LJ.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                C1209840haY c1209840haY = next;
                if (c1209840haY.LIZ == enumC2192761Arq) {
                    C1208410hYF c1208410hYF = c1209840haY.LIZIZ;
                    if (c1208410hYF.LIZIZ == i && c1208410hYF.LIZ == enumC1208400hYE) {
                        break;
                    }
                }
            } else {
                next = null;
                break;
            }
        }
        return next;
    }

    public final boolean LJII(Cert cert, EnumC1208400hYE enumC1208400hYE, EnumC2192761Arq enumC2192761Arq) {
        int iIntValue;
        long jLongValue;
        int iIntValue2;
        int i = C1208390hYD.LIZ[enumC1208400hYE.ordinal()];
        int iIntValue3 = 0;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return false;
                    }
                    throw new C1954807lC();
                }
            } else {
                C1208560hYU c1208560hYULIZLLL = LIZLLL(enumC2192761Arq);
                C1208490hYN c1208490hYNLIZIZ = c1208560hYULIZLLL.LIZIZ();
                c1208490hYNLIZIZ.getClass();
                String strCertToken = cert.certToken();
                if (strCertToken != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("last_system_promote_result_");
                    sbLIZ.append(strCertToken);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    Integer num = c1208490hYNLIZIZ.LIZIZ.get(strLIZIZ);
                    if (num != null) {
                        iIntValue2 = num.intValue();
                    } else {
                        iIntValue2 = c1208490hYNLIZIZ.LIZ.getInt(strLIZIZ, 0);
                        c1208490hYNLIZIZ.LIZIZ.put(strLIZIZ, Integer.valueOf(iIntValue2));
                    }
                } else {
                    iIntValue2 = 0;
                }
                C1208410hYF c1208410hYFLJ = LJ(cert, enumC1208400hYE, iIntValue2);
                if (c1208410hYFLJ != null) {
                    C1208490hYN c1208490hYNLIZIZ2 = c1208560hYULIZLLL.LIZIZ();
                    if (iIntValue2 == 0) {
                        c1208490hYNLIZIZ2.getClass();
                        String strCertToken2 = cert.certToken();
                        if (strCertToken2 != null) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("system_promote_reject_count_");
                            sbLIZ2.append(strCertToken2);
                            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                            Integer num2 = c1208490hYNLIZIZ2.LIZLLL.get(strLIZIZ2);
                            if (num2 != null) {
                                iIntValue3 = num2.intValue();
                            } else {
                                iIntValue3 = c1208490hYNLIZIZ2.LIZ.getInt(strLIZIZ2, 0);
                                c1208490hYNLIZIZ2.LIZLLL.put(strLIZIZ2, Integer.valueOf(iIntValue3));
                            }
                        }
                    } else {
                        iIntValue3 = c1208490hYNLIZIZ2.LIZ(cert);
                    }
                    C1208490hYN c1208490hYNLIZIZ3 = c1208560hYULIZLLL.LIZIZ();
                    c1208490hYNLIZIZ3.getClass();
                    String strCertToken3 = cert.certToken();
                    long jLongValue2 = 0;
                    if (strCertToken3 != null) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("last_system_promote_time_");
                        sbLIZ3.append(strCertToken3);
                        String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
                        Long l = c1208490hYNLIZIZ3.LJ.get(strLIZIZ3);
                        if (l != null) {
                            jLongValue2 = l.longValue();
                        } else {
                            jLongValue2 = c1208490hYNLIZIZ3.LIZ.getLong(strLIZIZ3, 0L);
                            c1208490hYNLIZIZ3.LJ.put(strLIZIZ3, Long.valueOf(jLongValue2));
                        }
                    }
                    C1798620wuC c1798620wuC = C1798620wuC.LIZ;
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("isCertSystemPromoteAllowed: ");
                    sbLIZ4.append(enumC2192761Arq);
                    sbLIZ4.append(", ");
                    sbLIZ4.append(iIntValue2);
                    sbLIZ4.append(", count=");
                    sbLIZ4.append(iIntValue3);
                    sbLIZ4.append(", lastTime=");
                    sbLIZ4.append(jLongValue2);
                    sbLIZ4.append(", config=");
                    sbLIZ4.append(c1208410hYFLJ);
                    C1798620wuC.LIZLLL("LocationController", C2188811AlT.LIZIZ(sbLIZ4));
                    return new C1209850haZ(c1208410hYFLJ).LIZ(iIntValue3, jLongValue2);
                }
                C1798620wuC.LIZLLL("LocationController", "isCertSystemPromoteAllowed: true, config is null");
            }
        } else {
            C1208560hYU c1208560hYULIZLLL2 = LIZLLL(enumC2192761Arq);
            C1208480hYM c1208480hYMLIZ = c1208560hYULIZLLL2.LIZ();
            c1208480hYMLIZ.getClass();
            String strCertToken4 = cert.certToken();
            if (strCertToken4 != null) {
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("last_system_popup_result_");
                sbLIZ5.append(strCertToken4);
                String strLIZIZ4 = C2188811AlT.LIZIZ(sbLIZ5);
                Integer num3 = c1208480hYMLIZ.LIZIZ.get(strLIZIZ4);
                if (num3 != null) {
                    iIntValue = num3.intValue();
                } else {
                    iIntValue = c1208480hYMLIZ.LIZ.getInt(strLIZIZ4, 0);
                    c1208480hYMLIZ.LIZIZ.put(strLIZIZ4, Integer.valueOf(iIntValue));
                }
            } else {
                iIntValue = 0;
            }
            C1208410hYF c1208410hYFLJ2 = LJ(cert, enumC1208400hYE, iIntValue);
            if (c1208410hYFLJ2 != null) {
                C1208480hYM c1208480hYMLIZ2 = c1208560hYULIZLLL2.LIZ();
                c1208480hYMLIZ2.getClass();
                if (iIntValue == 0) {
                    String strCertToken5 = cert.certToken();
                    if (strCertToken5 != null) {
                        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                        sbLIZ6.append("system_popup_reject_count_");
                        sbLIZ6.append(strCertToken5);
                        String strLIZIZ5 = C2188811AlT.LIZIZ(sbLIZ6);
                        Integer num4 = c1208480hYMLIZ2.LIZLLL.get(strLIZIZ5);
                        if (num4 != null) {
                            iIntValue3 = num4.intValue();
                        } else {
                            iIntValue3 = c1208480hYMLIZ2.LIZ.getInt(strLIZIZ5, 0);
                            c1208480hYMLIZ2.LIZLLL.put(strLIZIZ5, Integer.valueOf(iIntValue3));
                        }
                    }
                } else {
                    String strCertToken6 = cert.certToken();
                    if (strCertToken6 != null) {
                        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                        sbLIZ7.append("system_popup_count_");
                        sbLIZ7.append(strCertToken6);
                        String strLIZIZ6 = C2188811AlT.LIZIZ(sbLIZ7);
                        Integer num5 = c1208480hYMLIZ2.LIZJ.get(strLIZIZ6);
                        if (num5 != null) {
                            iIntValue3 = num5.intValue();
                        } else {
                            iIntValue3 = c1208480hYMLIZ2.LIZ.getInt(strLIZIZ6, 0);
                            c1208480hYMLIZ2.LIZJ.put(strLIZIZ6, Integer.valueOf(iIntValue3));
                        }
                    }
                }
                C1208480hYM c1208480hYMLIZ3 = c1208560hYULIZLLL2.LIZ();
                c1208480hYMLIZ3.getClass();
                String strCertToken7 = cert.certToken();
                if (strCertToken7 != null) {
                    StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                    sbLIZ8.append("last_system_popup_time_");
                    sbLIZ8.append(strCertToken7);
                    String strLIZIZ7 = C2188811AlT.LIZIZ(sbLIZ8);
                    Long l2 = c1208480hYMLIZ3.LJ.get(strLIZIZ7);
                    if (l2 != null) {
                        jLongValue = l2.longValue();
                    } else {
                        jLongValue = c1208480hYMLIZ3.LIZ.getLong(strLIZIZ7, c1208480hYMLIZ3.LJFF);
                        c1208480hYMLIZ3.LJ.put(strLIZIZ7, Long.valueOf(jLongValue));
                    }
                } else {
                    jLongValue = c1208480hYMLIZ3.LJFF;
                }
                C1798620wuC c1798620wuC2 = C1798620wuC.LIZ;
                StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                sbLIZ9.append("isCertSystemPopupAllowed: ");
                sbLIZ9.append(enumC2192761Arq);
                sbLIZ9.append(", ");
                sbLIZ9.append(iIntValue);
                sbLIZ9.append(", count=");
                sbLIZ9.append(iIntValue3);
                sbLIZ9.append(", lastTime=");
                sbLIZ9.append(jLongValue);
                sbLIZ9.append(", config=");
                sbLIZ9.append(c1208410hYFLJ2);
                C1798620wuC.LIZLLL("LocationController", C2188811AlT.LIZIZ(sbLIZ9));
                return new C1209850haZ(c1208410hYFLJ2).LIZ(iIntValue3, jLongValue);
            }
            C1798620wuC.LIZLLL("LocationController", "isCertSystemPopupAllowed: true, config is null");
        }
        return true;
    }

    public final void LJIIJ(EnumC2192761Arq enumC2192761Arq, int i, long j) {
        if (!this.LIZIZ) {
            return;
        }
        C1798620wuC c1798620wuC = C1798620wuC.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateInAppPromoteStatus: ");
        sbLIZ.append(enumC2192761Arq);
        sbLIZ.append(", ");
        sbLIZ.append(i);
        sbLIZ.append(", ");
        sbLIZ.append(j);
        C1798620wuC.LIZLLL("LocationController", C2188811AlT.LIZIZ(sbLIZ));
        C1208570hYV c1208570hYVLIZLLL = LIZLLL(enumC2192761Arq).LIZLLL();
        c1208570hYVLIZLLL.LJ = i;
        SharedPreferences.Editor editorEdit = c1208570hYVLIZLLL.LIZ.edit();
        editorEdit.putInt("last_in_app_popup_result", i);
        editorEdit.apply();
        c1208570hYVLIZLLL.LIZLLL = j;
        SharedPreferences.Editor editorEdit2 = c1208570hYVLIZLLL.LIZ.edit();
        editorEdit2.putLong("last_in_app_popup_time", j);
        editorEdit2.apply();
        c1208570hYVLIZLLL.LIZJ++;
        SharedPreferences.Editor editorEdit3 = c1208570hYVLIZLLL.LIZ.edit();
        editorEdit3.putInt("in_app_popup_count", c1208570hYVLIZLLL.LIZJ);
        editorEdit3.apply();
    }

    public final void LJIIJJI(EnumC2192761Arq enumC2192761Arq, int i, Cert cert, long j) {
        if (!this.LIZIZ) {
            return;
        }
        C1798620wuC c1798620wuC = C1798620wuC.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateSystemPromoteStatus: ");
        sbLIZ.append(enumC2192761Arq);
        sbLIZ.append(", ");
        sbLIZ.append(i);
        sbLIZ.append(", ");
        sbLIZ.append(cert);
        sbLIZ.append(", ");
        sbLIZ.append(j);
        C1798620wuC.LIZLLL("LocationController", C2188811AlT.LIZIZ(sbLIZ));
        C1208560hYU c1208560hYULIZLLL = LIZLLL(enumC2192761Arq);
        C1208520hYQ c1208520hYQLIZJ = c1208560hYULIZLLL.LIZJ();
        c1208520hYQLIZJ.LIZIZ = i;
        SharedPreferences.Editor editorEdit = c1208520hYQLIZJ.LIZ.edit();
        editorEdit.putInt("last_system_popup_result", i);
        editorEdit.apply();
        C1208520hYQ c1208520hYQLIZJ2 = c1208560hYULIZLLL.LIZJ();
        c1208520hYQLIZJ2.LJ = j;
        SharedPreferences.Editor editorEdit2 = c1208520hYQLIZJ2.LIZ.edit();
        editorEdit2.putLong("last_system_popup_time", j);
        editorEdit2.apply();
        C1208520hYQ c1208520hYQLIZJ3 = c1208560hYULIZLLL.LIZJ();
        c1208520hYQLIZJ3.LIZJ++;
        SharedPreferences.Editor editorEdit3 = c1208520hYQLIZJ3.LIZ.edit();
        editorEdit3.putInt("system_popup_count", c1208520hYQLIZJ3.LIZJ);
        editorEdit3.apply();
        C1208480hYM c1208480hYMLIZ = c1208560hYULIZLLL.LIZ();
        c1208480hYMLIZ.getClass();
        String strCertToken = cert.certToken();
        if (strCertToken != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("last_system_popup_result_");
            sbLIZ2.append(strCertToken);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            c1208480hYMLIZ.LIZIZ.put(strLIZIZ, Integer.valueOf(i));
            SharedPreferences.Editor editorEdit4 = c1208480hYMLIZ.LIZ.edit();
            editorEdit4.putInt(strLIZIZ, i);
            editorEdit4.apply();
        }
        C1208480hYM c1208480hYMLIZ2 = c1208560hYULIZLLL.LIZ();
        c1208480hYMLIZ2.getClass();
        String strCertToken2 = cert.certToken();
        if (strCertToken2 != null) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("last_system_popup_time_");
            sbLIZ3.append(strCertToken2);
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
            c1208480hYMLIZ2.LJ.put(strLIZIZ2, Long.valueOf(j));
            SharedPreferences.Editor editorEdit5 = c1208480hYMLIZ2.LIZ.edit();
            editorEdit5.putLong(strLIZIZ2, j);
            editorEdit5.apply();
        }
        C1208480hYM c1208480hYMLIZ3 = c1208560hYULIZLLL.LIZ();
        c1208480hYMLIZ3.getClass();
        String strCertToken3 = cert.certToken();
        if (strCertToken3 != null) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("system_popup_count_");
            sbLIZ4.append(strCertToken3);
            String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ4);
            Integer num = c1208480hYMLIZ3.LIZJ.get(strLIZIZ3);
            if (num == null) {
                num = 0;
            }
            int iIntValue = num.intValue() + 1;
            c1208480hYMLIZ3.LIZJ.put(strLIZIZ3, Integer.valueOf(iIntValue));
            SharedPreferences.Editor editorEdit6 = c1208480hYMLIZ3.LIZ.edit();
            editorEdit6.putInt(strLIZIZ3, iIntValue);
            editorEdit6.apply();
        }
        if (i == 1) {
            C1208520hYQ c1208520hYQLIZJ4 = c1208560hYULIZLLL.LIZJ();
            c1208520hYQLIZJ4.LIZLLL = 0;
            SharedPreferences.Editor editorEdit7 = c1208520hYQLIZJ4.LIZ.edit();
            editorEdit7.putInt("system_popup_reject_count", c1208520hYQLIZJ4.LIZLLL);
            editorEdit7.apply();
            C1208480hYM c1208480hYMLIZ4 = c1208560hYULIZLLL.LIZ();
            c1208480hYMLIZ4.getClass();
            String strCertToken4 = cert.certToken();
            if (strCertToken4 != null) {
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("system_popup_reject_count_");
                sbLIZ5.append(strCertToken4);
                String strLIZIZ4 = C2188811AlT.LIZIZ(sbLIZ5);
                c1208480hYMLIZ4.LIZLLL.put(strLIZIZ4, 0);
                SharedPreferences.Editor editorEdit8 = c1208480hYMLIZ4.LIZ.edit();
                editorEdit8.putInt(strLIZIZ4, 0);
                editorEdit8.apply();
                return;
            }
            return;
        }
        C1208520hYQ c1208520hYQLIZJ5 = c1208560hYULIZLLL.LIZJ();
        c1208520hYQLIZJ5.LIZLLL++;
        SharedPreferences.Editor editorEdit9 = c1208520hYQLIZJ5.LIZ.edit();
        editorEdit9.putInt("system_popup_reject_count", c1208520hYQLIZJ5.LIZLLL);
        editorEdit9.apply();
        C1208480hYM c1208480hYMLIZ5 = c1208560hYULIZLLL.LIZ();
        c1208480hYMLIZ5.getClass();
        String strCertToken5 = cert.certToken();
        if (strCertToken5 == null) {
            return;
        }
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append("system_popup_reject_count_");
        sbLIZ6.append(strCertToken5);
        String strLIZIZ5 = C2188811AlT.LIZIZ(sbLIZ6);
        Integer num2 = c1208480hYMLIZ5.LIZLLL.get(strLIZIZ5);
        if (num2 == null) {
            num2 = 0;
        }
        int iIntValue2 = num2.intValue() + 1;
        c1208480hYMLIZ5.LIZLLL.put(strLIZIZ5, Integer.valueOf(iIntValue2));
        SharedPreferences.Editor editorEdit10 = c1208480hYMLIZ5.LIZ.edit();
        editorEdit10.putInt(strLIZIZ5, iIntValue2);
        editorEdit10.apply();
    }

    public final void LJIIL(EnumC2192761Arq enumC2192761Arq, int i, Cert cert, long j) {
        if (!this.LIZIZ) {
            return;
        }
        C1798620wuC c1798620wuC = C1798620wuC.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateSystemPromoteStatus: ");
        sbLIZ.append(enumC2192761Arq);
        sbLIZ.append(", ");
        sbLIZ.append(i);
        sbLIZ.append(", ");
        sbLIZ.append(cert);
        sbLIZ.append(", ");
        sbLIZ.append(j);
        C1798620wuC.LIZLLL("LocationController", C2188811AlT.LIZIZ(sbLIZ));
        C1208560hYU c1208560hYULIZLLL = LIZLLL(enumC2192761Arq);
        C1208520hYQ c1208520hYQLIZJ = c1208560hYULIZLLL.LIZJ();
        c1208520hYQLIZJ.LIZIZ = i;
        SharedPreferences.Editor editorEdit = c1208520hYQLIZJ.LIZ.edit();
        editorEdit.putInt("last_system_popup_result", i);
        editorEdit.apply();
        C1208520hYQ c1208520hYQLIZJ2 = c1208560hYULIZLLL.LIZJ();
        c1208520hYQLIZJ2.LJ = j;
        SharedPreferences.Editor editorEdit2 = c1208520hYQLIZJ2.LIZ.edit();
        editorEdit2.putLong("last_system_popup_time", j);
        editorEdit2.apply();
        C1208520hYQ c1208520hYQLIZJ3 = c1208560hYULIZLLL.LIZJ();
        c1208520hYQLIZJ3.LIZJ++;
        SharedPreferences.Editor editorEdit3 = c1208520hYQLIZJ3.LIZ.edit();
        editorEdit3.putInt("system_popup_count", c1208520hYQLIZJ3.LIZJ);
        editorEdit3.apply();
        C1208490hYN c1208490hYNLIZIZ = c1208560hYULIZLLL.LIZIZ();
        c1208490hYNLIZIZ.getClass();
        String strCertToken = cert.certToken();
        if (strCertToken != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("last_system_promote_result_");
            sbLIZ2.append(strCertToken);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            c1208490hYNLIZIZ.LIZIZ.put(strLIZIZ, Integer.valueOf(i));
            SharedPreferences.Editor editorEdit4 = c1208490hYNLIZIZ.LIZ.edit();
            editorEdit4.putInt(strLIZIZ, i);
            editorEdit4.apply();
        }
        C1208490hYN c1208490hYNLIZIZ2 = c1208560hYULIZLLL.LIZIZ();
        c1208490hYNLIZIZ2.getClass();
        String strCertToken2 = cert.certToken();
        if (strCertToken2 != null) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("last_system_promote_time_");
            sbLIZ3.append(strCertToken2);
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
            c1208490hYNLIZIZ2.LJ.put(strLIZIZ2, Long.valueOf(j));
            SharedPreferences.Editor editorEdit5 = c1208490hYNLIZIZ2.LIZ.edit();
            editorEdit5.putLong(strLIZIZ2, j);
            editorEdit5.apply();
        }
        C1208490hYN c1208490hYNLIZIZ3 = c1208560hYULIZLLL.LIZIZ();
        c1208490hYNLIZIZ3.getClass();
        String strCertToken3 = cert.certToken();
        if (strCertToken3 != null) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("system_promote_count_");
            sbLIZ4.append(strCertToken3);
            String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ4);
            Integer num = c1208490hYNLIZIZ3.LIZJ.get(strLIZIZ3);
            if (num == null) {
                num = 0;
            }
            int iIntValue = num.intValue() + 1;
            c1208490hYNLIZIZ3.LIZJ.put(strLIZIZ3, Integer.valueOf(iIntValue));
            SharedPreferences.Editor editorEdit6 = c1208490hYNLIZIZ3.LIZ.edit();
            editorEdit6.putInt(strLIZIZ3, iIntValue);
            editorEdit6.apply();
        }
        if (i == 1) {
            C1208520hYQ c1208520hYQLIZJ4 = c1208560hYULIZLLL.LIZJ();
            c1208520hYQLIZJ4.LIZLLL = 0;
            SharedPreferences.Editor editorEdit7 = c1208520hYQLIZJ4.LIZ.edit();
            editorEdit7.putInt("system_popup_reject_count", c1208520hYQLIZJ4.LIZLLL);
            editorEdit7.apply();
            C1208490hYN c1208490hYNLIZIZ4 = c1208560hYULIZLLL.LIZIZ();
            c1208490hYNLIZIZ4.getClass();
            String strCertToken4 = cert.certToken();
            if (strCertToken4 != null) {
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("system_promote_reject_count_");
                sbLIZ5.append(strCertToken4);
                String strLIZIZ4 = C2188811AlT.LIZIZ(sbLIZ5);
                c1208490hYNLIZIZ4.LIZLLL.put(strLIZIZ4, 0);
                SharedPreferences.Editor editorEdit8 = c1208490hYNLIZIZ4.LIZ.edit();
                editorEdit8.putInt(strLIZIZ4, 0);
                editorEdit8.apply();
                return;
            }
            return;
        }
        C1208520hYQ c1208520hYQLIZJ5 = c1208560hYULIZLLL.LIZJ();
        c1208520hYQLIZJ5.LIZLLL++;
        SharedPreferences.Editor editorEdit9 = c1208520hYQLIZJ5.LIZ.edit();
        editorEdit9.putInt("system_popup_reject_count", c1208520hYQLIZJ5.LIZLLL);
        editorEdit9.apply();
        C1208490hYN c1208490hYNLIZIZ5 = c1208560hYULIZLLL.LIZIZ();
        c1208490hYNLIZIZ5.getClass();
        String strCertToken5 = cert.certToken();
        if (strCertToken5 == null) {
            return;
        }
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append("system_promote_reject_count_");
        sbLIZ6.append(strCertToken5);
        String strLIZIZ5 = C2188811AlT.LIZIZ(sbLIZ6);
        Integer num2 = c1208490hYNLIZIZ5.LIZLLL.get(strLIZIZ5);
        if (num2 == null) {
            num2 = 0;
        }
        int iIntValue2 = num2.intValue() + 1;
        c1208490hYNLIZIZ5.LIZLLL.put(strLIZIZ5, Integer.valueOf(iIntValue2));
        SharedPreferences.Editor editorEdit10 = c1208490hYNLIZIZ5.LIZ.edit();
        editorEdit10.putInt(strLIZIZ5, iIntValue2);
        editorEdit10.apply();
    }
}
