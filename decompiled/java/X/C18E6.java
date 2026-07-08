package X;

import android.os.SystemClock;
import android.view.View;
import com.bytedance.android.btm.api.BtmPageLifecycle;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.impl.page.model.PageInfo;
import com.bytedance.android.btm.impl.page.model.PageInfoStack;
import com.bytedance.android.btm.impl.setting.BugfixModel;
import com.bytedance.android.btm.impl.setting.FeatureModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.a0;
import kotlin.text.u;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.18E6, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18E6 {
    public static final String LIZ;
    public static final String LIZIZ;

    static {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RegisterBtmPageHelper_");
        sbLIZ.append("handleViewV2");
        LIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("RegisterBtmPageHelper_");
        sbLIZ2.append("handleV2core");
        LIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00e4 A[Catch: all -> 0x010c, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:11:0x002b, B:14:0x0041, B:17:0x0057, B:20:0x005e, B:22:0x006d, B:27:0x0079, B:29:0x0088, B:34:0x0094, B:36:0x009c, B:40:0x00a4, B:42:0x00aa, B:45:0x00b0, B:51:0x00bb, B:56:0x00c3, B:59:0x00e4), top: B:71:0x002b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static kotlin.Pair LIZIZ(android.view.View r13, java.lang.String r14, java.lang.String r15) {
        /*
            Method dump skipped, instruction units count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18E6.LIZIZ(android.view.View, java.lang.String, java.lang.String):kotlin.Pair");
    }

    public static void LIZ(View view, Object obj, String str, String str2) {
        int iIntValue;
        PageInfo pageInfoCurrent;
        long jLongValue;
        int iIntValue2;
        boolean zLJFF;
        String name = obj.getClass().getName();
        C21248618Dk c21248618Dk = C21248618Dk.LIZ;
        c21248618Dk.getClass();
        PageInfoStack pageInfoStackLJIIIZ = C21248618Dk.LJIIIZ(obj);
        String str3 = LIZIZ;
        C18CK.LJIIL(str3, new C18G9(name, str));
        InterfaceC21252118Et interfaceC21252118EtLIZIZ = null;
        Object obj2 = null;
        PageInfo pageInfoCopy = null;
        if (pageInfoStackLJIIIZ != null) {
            if (!pageInfoStackLJIIIZ.isContainer()) {
                C18CE.LJI(1126, pageInfoStackLJIIIZ.current(), null, null, new C21256318Gj(str), null, 188);
                return;
            }
            PageInfo pageInfoCurrent2 = pageInfoStackLJIIIZ.current();
            String pageBtm = pageInfoCurrent2.getPageBtm();
            if (pageBtm != null && pageBtm.length() != 0) {
                Regex regex = C18C3.LIZ;
                String pageBtm2 = pageInfoCurrent2.getPageBtm();
                if (pageBtm2 != null && pageBtm2.length() != 0 && str != null && str.length() != 0) {
                    List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(pageBtm2, new String[]{e3.d}, 0, 6);
                    List listLJJLIIIJILLIZJL2 = a0.LJJLIIIJILLIZJL(str, new String[]{e3.d}, 0, 6);
                    listLJJLIIIJILLIZJL.size();
                    if (listLJJLIIIJILLIZJL2.size() == 1 && u.LJJIIJZLJL(str, "b", false)) {
                        zLJFF = Intrinsics.LJFF(ListProtector.get(listLJJLIIIJILLIZJL, 1), ListProtector.get(listLJJLIIIJILLIZJL2, 0));
                    } else {
                        zLJFF = Intrinsics.LJFF(ListProtector.get(listLJJLIIIJILLIZJL, 1), ListProtector.get(listLJJLIIIJILLIZJL2, 1));
                    }
                    if (zLJFF) {
                        C18CK.LJIIL(str3, new C18GI(str));
                        return;
                    }
                }
                C21250218Ea c21250218Ea = C21250218Ea.LIZ;
                if (!C21250218Ea.LIZ(obj)) {
                    C18CE.LJI(2011, pageInfoCurrent2, null, null, new C21256418Gk(str), null, 188);
                }
                pageInfoStackLJIIIZ.onFEJump(obj, str);
                return;
            }
            C18CK.LJIIL(str3, new C18HV());
            pageInfoCurrent2.parsePageBtm(str);
            BugfixModel bugfixModelLIZIZ = C18CS.LIZ.LIZIZ();
            bugfixModelLIZIZ.getClass();
            Object objLIZIZ = C1972007ny.LIZIZ(bugfixModelLIZIZ, "fix_register_page_when_no_resume", Integer.valueOf(bugfixModelLIZIZ.fixRegisterPageWhenNotResume));
            if (objLIZIZ instanceof Integer) {
                obj2 = objLIZIZ;
            }
            Integer num = (Integer) obj2;
            if (num != null) {
                iIntValue2 = num.intValue();
            } else {
                iIntValue2 = bugfixModelLIZIZ.fixRegisterPageWhenNotResume;
            }
            bugfixModelLIZIZ.fixRegisterPageWhenNotResume = iIntValue2;
            if (iIntValue2 != 1 || pageInfoStackLJIIIZ.getPageState() == BtmPageLifecycle.State.RESUMED) {
                C18DB.LIZ(EnumC21250718Ef.HybridRegister, pageInfoCurrent2);
                return;
            }
            return;
        }
        c21248618Dk.getClass();
        C21256818Go c21256818GoLJI = C21248618Dk.LJI(obj);
        if (c21256818GoLJI != null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - c21256818GoLJI.LIZ;
            BtmPageLifecycle.State state = c21256818GoLJI.LIZIZ;
            FeatureModel featureModelLIZJ = C18CS.LIZ.LIZJ();
            featureModelLIZJ.getClass();
            Object objLIZIZ2 = C1972007ny.LIZIZ(featureModelLIZJ, "errcode_2015_timemillis", Long.valueOf(featureModelLIZJ.errCode2015Timemillis));
            if (!(objLIZIZ2 instanceof Long)) {
                objLIZIZ2 = null;
            }
            Long l = (Long) objLIZIZ2;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = featureModelLIZJ.errCode2015Timemillis;
            }
            featureModelLIZJ.errCode2015Timemillis = jLongValue;
            if (jElapsedRealtime > jLongValue || state != BtmPageLifecycle.State.RESUMED) {
                C18CE.LIZ.LIZIZ(2015, "", obj, null, false, new C18G0(jElapsedRealtime, state, str));
            }
        }
        BtmSDK.INSTANCE.getDepend().getClass();
        C18IP.LJIIJ(new C18EW(new WeakReference(obj), str, false, str2, 92));
        if (C18CS.LIZ.LIZIZ().LJI() == 1) {
            C21248618Dk.LJI.put(view, new C589920NBu<>(obj));
        }
        BugfixModel bugfixModelLIZIZ2 = C18CS.LIZ.LIZIZ();
        bugfixModelLIZIZ2.getClass();
        Object objLIZIZ3 = C1972007ny.LIZIZ(bugfixModelLIZIZ2, "fix_native_state", Integer.valueOf(bugfixModelLIZIZ2.fixNativeState));
        if (!(objLIZIZ3 instanceof Integer)) {
            objLIZIZ3 = null;
        }
        Integer num2 = (Integer) objLIZIZ3;
        if (num2 != null) {
            iIntValue = num2.intValue();
        } else {
            iIntValue = bugfixModelLIZIZ2.fixNativeState;
        }
        bugfixModelLIZIZ2.fixNativeState = iIntValue;
        if (iIntValue == 1) {
            C18EP.LJ(obj);
        }
        String str4 = C18EO.LIZ;
        EnumC21251518En enumC21251518EnLIZJ = C18EO.LIZJ(obj, EnumC21250718Ef.HybridRegister);
        if (enumC21251518EnLIZJ != null) {
            int i = C21251918Er.LIZ[enumC21251518EnLIZJ.ordinal()];
            if (i != 1 && i != 2 && i != 3 && i != 4 && i != 5) {
                c21248618Dk.getClass();
                PageInfo pageInfoLJIIIIZZ = C21248618Dk.LJIIIIZZ(obj);
                if (pageInfoLJIIIIZZ != null) {
                    pageInfoCopy = pageInfoLJIIIIZZ.copy();
                }
                C18CE c18ce = C18CE.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("btm = ");
                sbLIZ.append(str);
                sbLIZ.append(", reason = ");
                sbLIZ.append(enumC21251518EnLIZJ);
                C18CE.LJII(c18ce, 1120, C2188811AlT.LIZIZ(sbLIZ), obj, pageInfoCopy, false, false, null, false, null, null, 1008);
            } else {
                c21248618Dk.getClass();
                PageInfoStack pageInfoStackLJIIIZ2 = C21248618Dk.LJIIIZ(obj);
                if (pageInfoStackLJIIIZ2 != null && (pageInfoCurrent = pageInfoStackLJIIIZ2.current()) != null) {
                    C18E9 c18e9LIZIZ = C18EN.LIZIZ(obj);
                    if (c18e9LIZIZ != null) {
                        interfaceC21252118EtLIZIZ = c18e9LIZIZ.LIZIZ(obj);
                    }
                    boolean z = C18E3.LIZ;
                    EnumC21250718Ef enumC21250718Ef = EnumC21250718Ef.HybridRegister;
                    C18E3.LJI(obj, pageInfoStackLJIIIZ2, pageInfoCurrent, interfaceC21252118EtLIZIZ, c18e9LIZIZ, enumC21250718Ef);
                    pageInfoCurrent.onlyResume(enumC21250718Ef);
                    C18DB.LIZ(enumC21250718Ef, pageInfoCurrent);
                }
            }
        }
        C18CK.LJIIL(str3, new C18FI(name, str, enumC21251518EnLIZJ));
    }
}
