package X;

import android.content.Context;
import com.ss.android.ugc.aweme.im.activity.status.sdk.api.ActivityStatusExternalToolService;
import com.ss.android.ugc.aweme.im.saas.host.api.foundation.IMCrossAppFeatureDiffApi;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0ZEw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C896480ZEw {
    public static C429270GsP LIZIZ(C595660NXw c595660NXw) {
        long jLIZ;
        long jLIZIZ;
        C1E8E c1e8e = C1E8E.LIZ;
        if (c595660NXw == null) {
            return C429270GsP.LIZLLL;
        }
        ActivityStatusExternalToolService.LIZ.getClass();
        InterfaceC595880NYs interfaceC595880NYsLIZ = C04TB.LIZ().LIZ();
        if (interfaceC595880NYsLIZ != null) {
            jLIZ = interfaceC595880NYsLIZ.LIZ();
        } else {
            jLIZ = -1;
        }
        C0NXK c0nxk = c595660NXw.LIZIZ;
        if (c0nxk != null) {
            long millis = TimeUnit.SECONDS.toMillis(c0nxk.LIZIZ);
            if (c1e8e != null) {
                jLIZIZ = C1E8E.LIZIZ();
            } else {
                jLIZIZ = 0;
            }
            if (((C1400340mXo) C0I0B.LJFF.LIZ()).LIZJ(c0nxk.LIZ)) {
                InterfaceC897380ZIi.LIZIZ.getClass();
                if (C897370ZIh.LIZ().LJ().LIZ()) {
                    return C429270GsP.LIZIZ;
                }
                return C429270GsP.LIZJ;
            }
            if (millis <= jLIZ && jLIZ <= millis + jLIZIZ) {
                return C429270GsP.LIZIZ;
            }
            return C429270GsP.LIZJ;
        }
        List<C0NXK> list = c595660NXw.LIZJ;
        if (list != null && !list.isEmpty()) {
            if (LIZJ(c595660NXw)) {
                return C429270GsP.LIZIZ;
            }
            return C429270GsP.LIZJ;
        }
        return C429270GsP.LIZLLL;
    }

    public static final boolean LIZJ(C595660NXw c595660NXw) {
        String str;
        if (c595660NXw == null) {
            return false;
        }
        if (c595660NXw.LIZIZ != null) {
            InterfaceC461710I8r interfaceC461710I8rLIZ = C0I0B.LJFF.LIZ();
            C0NXK c0nxk = c595660NXw.LIZIZ;
            if (c0nxk != null) {
                str = c0nxk.LIZ;
            } else {
                str = null;
            }
            if (((C1400340mXo) interfaceC461710I8rLIZ).LIZJ(str)) {
                InterfaceC897380ZIi.LIZIZ.getClass();
                return C897370ZIh.LIZ().LJ().LIZ();
            }
        }
        ActivityStatusExternalToolService.LIZ.getClass();
        InterfaceC595880NYs interfaceC595880NYsLIZ = C04TB.LIZ().LIZ();
        if (interfaceC595880NYsLIZ == null || !interfaceC595880NYsLIZ.LIZJ(c595660NXw)) {
            return false;
        }
        return true;
    }

    public static C894700Z8a LIZ(C595660NXw c595660NXw, Context context, int i) {
        C1E8E c1e8e;
        long jLIZ;
        long jLIZIZ;
        long jLJFF;
        long jLIZIZ2;
        long jLJFF2;
        long jLJ;
        long jLJFF3;
        List<C0NXL> list;
        C0NXL next;
        Context contextLIZ = context;
        if ((i & 1) != 0) {
            C0I0B.LJFF.LIZJ();
            contextLIZ = C894660Z7w.LIZ();
        }
        if ((i & 2) != 0) {
            c1e8e = C1E8E.LIZ;
        } else {
            c1e8e = null;
        }
        if (contextLIZ == null) {
            return C894700Z8a.LJI;
        }
        if (c595660NXw == null) {
            return C894700Z8a.LJI;
        }
        ActivityStatusExternalToolService.LIZ.getClass();
        InterfaceC595880NYs interfaceC595880NYsLIZ = C04TB.LIZ().LIZ();
        if (interfaceC595880NYsLIZ != null) {
            jLIZ = interfaceC595880NYsLIZ.LIZ();
        } else {
            jLIZ = -1;
        }
        C0NXK c0nxk = c595660NXw.LIZIZ;
        if (c0nxk != null) {
            long millis = TimeUnit.SECONDS.toMillis(c0nxk.LIZIZ);
            if (c1e8e != null) {
                jLIZIZ2 = C1E8E.LIZIZ();
            } else {
                jLIZIZ2 = 0;
            }
            if (((C1400340mXo) C0I0B.LJFF.LIZ()).LIZJ(c0nxk.LIZ)) {
                InterfaceC897380ZIi.LIZIZ.getClass();
                if (C897370ZIh.LIZ().LJ().LIZ()) {
                    return new C894700Z8a(contextLIZ.getResources().getString(2131824688), EnumC896490ZEx.ACTIVE_NOW, EnumC894710Z8b.ACTIVE_NOW, null, 0, 0, 56);
                }
                return new C894700Z8a("", EnumC896490ZEx.NO_STATUS, EnumC894710Z8b.NO_STATUS, null, 0, 0, 56);
            }
            IMCrossAppFeatureDiffApi.LIZ.getClass();
            IMCrossAppFeatureDiffApi iMCrossAppFeatureDiffApiLIZIZ = C898670ZNh.LIZIZ();
            if (iMCrossAppFeatureDiffApiLIZIZ != null && iMCrossAppFeatureDiffApiLIZIZ.LJII() && (list = c0nxk.LIZLLL) != null) {
                Iterator<C0NXL> it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (next.LIZ == 364225) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                C0NXL c0nxl = next;
                if (c0nxl != null) {
                    long millis2 = TimeUnit.SECONDS.toMillis(c0nxl.LIZIZ);
                    if (millis2 <= jLIZ && jLIZ <= millis2 + jLIZIZ2) {
                        return new C894700Z8a(contextLIZ.getResources().getString(2131858483), EnumC896490ZEx.ACTIVE_ON_WHEE, EnumC894710Z8b.ACTIVE_ON_WHEE, null, 0, 0, 56);
                    }
                }
            }
            if (millis <= jLIZ) {
                if (jLIZ <= jLIZIZ2 + millis) {
                    return new C894700Z8a(contextLIZ.getResources().getString(2131824688), EnumC896490ZEx.ACTIVE_NOW, EnumC894710Z8b.ACTIVE_NOW, null, 0, 0, 56);
                }
                if (c1e8e != null) {
                    jLJFF3 = C1E8E.LJFF();
                } else {
                    jLJFF3 = 0;
                }
                if (jLIZ < jLJFF3 + millis) {
                    return new C894700Z8a(contextLIZ.getString(2131828570, Integer.valueOf((int) ((jLIZ - millis) / 60000))), EnumC896490ZEx.MIN_THRESHOLD, EnumC894710Z8b.ACTIVE_MINUTE, null, 0, 0, 56);
                }
            }
            if (c1e8e != null) {
                jLJFF2 = C1E8E.LJFF();
            } else {
                jLJFF2 = 0;
            }
            long j = jLJFF2 + millis;
            if (c1e8e != null) {
                jLJ = C1E8E.LJ();
            } else {
                jLJ = 0;
            }
            if (jLIZ < jLJ + millis && j <= jLIZ) {
                return new C894700Z8a(contextLIZ.getString(2131828569, Integer.valueOf((int) ((jLIZ - millis) / 3600000))), EnumC896490ZEx.HOUR_THRESHOLD, EnumC894710Z8b.ACTIVE_HOUR, null, 0, 0, 56);
            }
            if (C1387310mCn.LJIIIIZZ(millis)) {
                return new C894700Z8a(contextLIZ.getResources().getString(2131824690), EnumC896490ZEx.DATE_THRESHOLD, EnumC894710Z8b.ACTIVE_YESTERDAY, null, 0, 0, 56);
            }
            if (C1387310mCn.LJFF(millis)) {
                return new C894700Z8a(contextLIZ.getResources().getString(2131824689), EnumC896490ZEx.DATE_THRESHOLD, EnumC894710Z8b.ACTIVE_TODAY, null, 0, 0, 56);
            }
            return new C894700Z8a("", EnumC896490ZEx.NO_STATUS, EnumC894710Z8b.NO_STATUS, null, 0, 0, 56);
        }
        List<C0NXK> list2 = c595660NXw.LIZJ;
        if (list2 != null && !list2.isEmpty()) {
            List<C0NXK> list3 = c595660NXw.LIZJ;
            String str = "";
            if (list3 != null) {
                String str2 = "";
                int i2 = 60;
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                String str3 = "";
                for (C0NXK c0nxk2 : list3) {
                    long millis3 = TimeUnit.SECONDS.toMillis(c0nxk2.LIZIZ);
                    if (c1e8e != null) {
                        jLIZIZ = C1E8E.LIZIZ();
                    } else {
                        jLIZIZ = 0;
                    }
                    if (millis3 <= jLIZ) {
                        if (jLIZ <= jLIZIZ + millis3) {
                            i4++;
                            if (i4 == 1) {
                                str = c0nxk2.LIZ;
                            }
                        } else {
                            if (c1e8e != null) {
                                jLJFF = C1E8E.LJFF();
                            } else {
                                jLJFF = 0;
                            }
                            if (jLIZ < jLJFF + millis3) {
                                i3++;
                                if (i3 == 1) {
                                    str2 = c0nxk2.LIZ;
                                }
                                int i6 = (int) ((jLIZ - millis3) / 60000);
                                if (i6 < i2) {
                                    i2 = i6;
                                }
                            }
                        }
                    }
                    if (C1387310mCn.LJFF(millis3) && (i5 = i5 + 1) == 1) {
                        str3 = c0nxk2.LIZ;
                    }
                }
                if (i4 == 1) {
                    return new C894700Z8a("Placeholder", EnumC896490ZEx.ACTIVE_NOW, null, str, 0, 1, 20);
                }
                if (i4 > 1) {
                    return new C894700Z8a(contextLIZ.getResources().getQuantityString(2131755343, i4, Integer.valueOf(i4)), EnumC896490ZEx.ACTIVE_NOW, null, null, 0, i4, 28);
                }
                if (i3 == 1) {
                    return new C894700Z8a("Placeholder", EnumC896490ZEx.MIN_THRESHOLD, null, str2, i2, 1, 4);
                }
                if (i3 > 1) {
                    return new C894700Z8a(contextLIZ.getResources().getString(2131835258, Integer.valueOf(i3)), EnumC896490ZEx.MIN_THRESHOLD, null, null, 0, i3, 28);
                }
                if (i5 == 1) {
                    return new C894700Z8a("Placeholder", EnumC896490ZEx.DATE_THRESHOLD, null, str3, 0, 1, 20);
                }
                if (i5 > 1) {
                    return new C894700Z8a(contextLIZ.getResources().getQuantityString(2131755344, i5, Integer.valueOf(i5)), EnumC896490ZEx.DATE_THRESHOLD, null, null, 0, i5, 28);
                }
            }
            return C894700Z8a.LJI;
        }
        return C894700Z8a.LJI;
    }
}
