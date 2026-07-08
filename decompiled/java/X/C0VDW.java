package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0VDW, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VDW {
    static {
        new ArrayList();
    }

    public static String LIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int iLastIndexOf = str.lastIndexOf(e3.d);
        if (iLastIndexOf == -1) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append("-cloudMsg.zip");
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str.substring(0, iLastIndexOf));
        sbLIZ2.append("-cloudMsg.zip");
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    public static void LIZIZ(C794090VDb c794090VDb) throws Throwable {
        int i;
        InterfaceC794170VDj interfaceC794170VDj = c794090VDb.LJIIIIZZ;
        if (interfaceC794170VDj != null && interfaceC794170VDj.LIZIZ().size() != 0 && !c794090VDb.LIZIZ) {
            if (!c794090VDb.LJIIIZ && System.currentTimeMillis() - c794090VDb.LIZ < 0) {
                return;
            }
            C0VDB.LIZIZ().getClass();
            Context context = C0VDB.LJFF;
            if (context == null) {
                return;
            }
            try {
                NetworkInfo networkInfoLJIJ = C786410Ut5.LJIJ((ConnectivityManager) C786410Ut5.H2(context, "connectivity"));
                if (networkInfoLJIJ == null) {
                    return;
                }
                if (!networkInfoLJIJ.isConnected()) {
                    return;
                }
                if (!c794090VDb.LJIIJ) {
                    c794090VDb.LJIILJJIL = c794090VDb.LJIIIIZZ.LIZIZ();
                } else if (c794090VDb.LJIIIIZZ.LIZIZ().size() != 1 && !c794090VDb.LJIIJJI) {
                    ArrayList arrayList = new ArrayList();
                    for (String str : c794090VDb.LJIIIIZZ.LIZIZ()) {
                        C0VSJ c0vsj = new C0VSJ(str);
                        C0VSJ c0vsj2 = new C0VSJ(c0vsj.getParent(), LIZ(c0vsj.getName()));
                        if (c0vsj2.exists()) {
                            c0vsj2.delete();
                        }
                        C2120108Sh.LIZJ(c0vsj2.getAbsolutePath(), str);
                        arrayList.add(c0vsj2.getAbsolutePath());
                    }
                    c794090VDb.LJIILJJIL = arrayList;
                } else {
                    C0VSJ c0vsj3 = new C0VSJ((String) ListProtector.get(c794090VDb.LJIIIIZZ.LIZIZ(), 0));
                    C0VSJ c0vsj4 = new C0VSJ(c0vsj3.getParent(), LIZ(c0vsj3.getName()));
                    if (c0vsj4.exists()) {
                        c0vsj4.delete();
                    }
                    C2120108Sh.LIZJ(c0vsj4.getAbsolutePath(), (String[]) c794090VDb.LJIIIIZZ.LIZIZ().toArray(new String[c794090VDb.LJIIIIZZ.LIZIZ().size()]));
                    ArrayList arrayList2 = new ArrayList(1);
                    arrayList2.add(c0vsj4.getAbsolutePath());
                    c794090VDb.LJIILJJIL = arrayList2;
                }
                String str2 = C2403709bP.LIZ;
                boolean z = false;
                for (int i2 = 0; i2 < c794090VDb.LJIILJJIL.size(); i2++) {
                    C0VSJ c0vsj5 = new C0VSJ((String) ListProtector.get(c794090VDb.LJIILJJIL, i2));
                    if (c0vsj5.exists()) {
                        if (i2 < c794090VDb.LJIILJJIL.size() - 1) {
                            i = 1;
                        } else {
                            i = 2;
                        }
                        if (c794090VDb.LJIILIIL) {
                            i = c794090VDb.LIZLLL;
                        }
                        boolean zLIZIZ = C2403709bP.LIZIZ(C2403709bP.LIZ, c0vsj5, i, c794090VDb.LJII, c794090VDb.LIZJ, c794090VDb.LJ, c794090VDb.LJFF, c794090VDb.LJI);
                        if (zLIZIZ && c794090VDb.LJIIJ) {
                            c0vsj5.delete();
                        }
                        if (i2 == 0) {
                            z = zLIZIZ;
                        } else if (z && zLIZIZ) {
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                }
                if (c794090VDb.LJIIL && z) {
                    Iterator<String> it2 = c794090VDb.LJIIIIZZ.LIZIZ().iterator();
                    while (it2.hasNext()) {
                        C0VSJ c0vsj6 = new C0VSJ(it2.next());
                        if (c0vsj6.exists()) {
                            c0vsj6.delete();
                        }
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static void LIZJ(C794080VDa c794080VDa) {
        if (C792400V6o.LJIIIIZZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("uploadInfo=");
            sbLIZ.append(c794080VDa);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        if (!TextUtils.isEmpty(c794080VDa.LIZJ)) {
            String str = C2403709bP.LIZ;
            int i = c794080VDa.LIZLLL;
            String str2 = c794080VDa.LIZJ;
            String str3 = c794080VDa.LJ;
            long j = c794080VDa.LJFF;
            HashMap<String, String> map = c794080VDa.LJI;
            try {
                InterfaceC2403509bN interfaceC2403509bNLIZ = C2403709bP.LIZ(str);
                interfaceC2403509bNLIZ.LIZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, String.valueOf(i));
                if (str2 == null) {
                    str2 = "";
                }
                interfaceC2403509bNLIZ.LIZ("cid", str2);
                if (str3 == null) {
                    str3 = "";
                }
                interfaceC2403509bNLIZ.LIZ("err_msg", str3);
                C0VDB.LIZIZ();
                interfaceC2403509bNLIZ.LIZ("aid", "");
                C0VDB.LIZIZ();
                interfaceC2403509bNLIZ.LIZ("update_version_code", "");
                interfaceC2403509bNLIZ.LIZ("operate_time", String.valueOf(j));
                if (i == 2 || i == 3 || (i == 0 && map != null && !map.isEmpty())) {
                    C2403709bP.LIZJ(interfaceC2403509bNLIZ, map);
                }
                C0VDB.LIZIZ();
                interfaceC2403509bNLIZ.LIZ("uid", "");
                interfaceC2403509bNLIZ.finish();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }
}
