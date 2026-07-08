package X;

import com.ss.android.ugc.aweme.publicgroup.data.GroupCompositeType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0i5c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1229100i5c {
    public static final C1229100i5c LIZ = new C1229100i5c();

    public static final List<GroupCompositeType> LJIILIIL() {
        EnumC1228990i5R enumC1228990i5R = EnumC1228990i5R.PUBLIC_GROUP;
        return C1697810uHb.LJIIJJI(new GroupCompositeType(enumC1228990i5R.getValue(), EnumC913760Zt0.FAN_GROUP.getValue(), EnumC1219960hqs.UNKNOWN.getValue()), new GroupCompositeType(enumC1228990i5R.getValue(), EnumC913760Zt0.CAMPUS_GROUP.getValue(), EnumC1219960hqs.UNKNOWN.getValue()));
    }

    public final List<String> LJIILJJIL() {
        List<GroupCompositeType> listLJIILIIL = LJIILIIL();
        ArrayList arrayList = new ArrayList();
        Iterator<GroupCompositeType> it2 = listLJIILIIL.iterator();
        while (it2.hasNext()) {
            String str = it2.next().groupType;
            if (str != null && str.length() != 0) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public static final EnumC1219960hqs LIZ(String str) {
        C0Y8Y coreInfo;
        Map<String, String> ext;
        String str2;
        C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(str);
        Integer numLJIIJJI = null;
        if (c0y8tLIZ != null && (coreInfo = c0y8tLIZ.getCoreInfo()) != null && (ext = coreInfo.getExt()) != null && (str2 = ext.get("a:group_business_type")) != null) {
            numLJIIJJI = C2095008Iq.LJIIJJI(str2);
        }
        int iLIZ = C1527905yX.LIZ(numLJIIJJI);
        EnumC1219960hqs.Companion.getClass();
        return C1219970hqt.LIZ(iLIZ);
    }

    public static final String LIZIZ(C0Y8T c0y8t) {
        String str;
        C0Y8Y coreInfo;
        Map<String, String> ext;
        if (LJIIIIZZ(c0y8t)) {
            return "fan_group";
        }
        if (c0y8t != null && (coreInfo = c0y8t.getCoreInfo()) != null && (ext = coreInfo.getExt()) != null) {
            str = ext.get("a:group_type");
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(str, EnumC913760Zt0.CAMPUS_GROUP.getValue())) {
            return "campus_group";
        }
        return "group";
    }

    public static final String LIZLLL(String str) {
        C0Y8Y coreInfo;
        Map<String, String> ext;
        C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(str);
        String str2 = null;
        if (c0y8tLIZ != null && (coreInfo = c0y8tLIZ.getCoreInfo()) != null && (ext = coreInfo.getExt()) != null) {
            str2 = ext.get("a:et_chat_type");
        }
        if (C123100dR.LIZ(str2)) {
            if (str2 == null) {
                return "";
            }
            return str2;
        }
        return "group";
    }

    public static final String LJ(C0Y8T c0y8t) {
        C0Y8Y coreInfo;
        Map<String, String> ext;
        String str;
        if (c0y8t == null || (coreInfo = c0y8t.getCoreInfo()) == null || (ext = coreInfo.getExt()) == null || (str = ext.get("a:group_type")) == null) {
            return EnumC913760Zt0.NORMAL_GROUP_CHAT.getValue();
        }
        return str;
    }

    public static final String LJFF(String str) {
        C0Y8Y coreInfo;
        Map<String, String> ext;
        String str2;
        C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(str);
        if (c0y8tLIZ == null || (coreInfo = c0y8tLIZ.getCoreInfo()) == null || (ext = coreInfo.getExt()) == null || (str2 = ext.get("a:group_type")) == null) {
            return EnumC913760Zt0.NORMAL_GROUP_CHAT.getValue();
        }
        return str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x004c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LJI(java.lang.String r3) {
        /*
            X.0YSQ r0 = X.InterfaceC876950Yaj.LIZ
            X.0Yaj r0 = X.C0YSQ.LIZIZ(r0)
            X.0Y8T r2 = r0.LIZ(r3)
            r1 = 1
            if (r2 == 0) goto L19
            boolean r0 = r2.isSingleChat()
            if (r0 != r1) goto L19
            r0 = 1
        L14:
            java.lang.String r3 = ""
            if (r0 == 0) goto L1b
            return r3
        L19:
            r0 = 0
            goto L14
        L1b:
            if (r2 == 0) goto L4d
            X.0Y8Y r0 = r2.getCoreInfo()
            if (r0 == 0) goto L4d
            java.util.Map r1 = r0.getExt()
            if (r1 == 0) goto L4d
            java.lang.String r0 = "a:et_group_type"
            java.lang.Object r2 = r1.get(r0)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r0 = "a:group_type"
            java.lang.Object r1 = r1.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            if (r2 == 0) goto L41
            int r0 = r2.length()
            if (r0 != 0) goto L54
        L41:
            if (r1 == 0) goto L4d
            int r0 = r1.length()
            if (r0 == 0) goto L4d
            r2 = r1
        L4a:
            if (r2 != 0) goto L54
            return r3
        L4d:
            X.0Zt0 r0 = X.EnumC913760Zt0.NORMAL_GROUP_CHAT
            java.lang.String r2 = r0.getValue()
            goto L4a
        L54:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1229100i5c.LJI(java.lang.String):java.lang.String");
    }

    public static final boolean LJII(String str) {
        return LJIIIIZZ(C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LJIL(str));
    }

    public static boolean LJIIIIZZ(C0Y8T c0y8t) {
        String str;
        C0Y8Y coreInfo;
        Map<String, String> ext;
        if (c0y8t != null && (coreInfo = c0y8t.getCoreInfo()) != null && (ext = coreInfo.getExt()) != null) {
            str = ext.get("a:group_type");
        } else {
            str = null;
        }
        return Intrinsics.LJFF(str, EnumC913760Zt0.FAN_GROUP.getValue());
    }

    public static final boolean LJIIIZ(String str) {
        return C0ZFW.LIZ.LJI(C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(str)) instanceof C880780Ygu;
    }

    public final String LIZJ(String str) {
        return LIZIZ(C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(str));
    }

    public final boolean LJIIJ(String str) {
        return !LJIIJJI(str);
    }

    public final boolean LJIIJJI(String str) {
        return ((ArrayList) LJIILJJIL()).contains(LJFF(str));
    }

    public final boolean LJIIL(C0Y8T c0y8t) {
        return ((ArrayList) LJIILJJIL()).contains(LJ(c0y8t));
    }
}
