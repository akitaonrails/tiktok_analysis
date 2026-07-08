package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS52S1000000_1;
import p8b.b;
import p8b.c;

/* JADX INFO: renamed from: X.03Nz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C834903Nz {
    public static b LIZ(c cVar, String str, Integer num, String str2, int i) {
        Object objInvoke;
        b bVar;
        Function0 function0;
        String str3 = str2;
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            str3 = "";
        }
        Integer numValueOf = Integer.valueOf(AnonymousClass0408.LJIIJJI(AnonymousClass0408.LIZ, C955103oL.LIZ(num), str, null, null, 12));
        C969603qg c969603qg = EnumC969503qf.Companion;
        int iIntValue = numValueOf.intValue();
        c969603qg.getClass();
        EnumC969503qf enumC969503qfLIZ = C969603qg.LIZ(iIntValue, str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(cVar.getViewName());
        sbLIZ.append('_');
        sbLIZ.append(enumC969503qfLIZ.name());
        sbLIZ.append('_');
        sbLIZ.append(str3);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        try {
            Object obj = ((HashMap) C1005103wP.LIZ).get(strLIZIZ);
            if (obj == null) {
                C04CK c04ck = new C04CK() { // from class: X.048T
                    @Override // X.AbstractC1748790vbp
                    public final C1748850vbv LIZ() {
                        return new C1748850vbv(new C1748840vbu("key", new C1747940vaS[0]), new C1748840vbu("error_code", new C1747940vaS[0]));
                    }
                };
                c04ck.LJIIIIZZ(new AwS52S1000000_1(strLIZIZ, 41));
                c04ck.LIZJ(false);
                return null;
            }
            if (C19719512Dh.LJFF(0, obj) && (function0 = (Function0) obj) != null) {
                objInvoke = function0.invoke();
            } else {
                objInvoke = null;
            }
            if (objInvoke instanceof b) {
                bVar = (b) objInvoke;
                if (bVar == null) {
                }
                AnonymousClass0405.LIZ(bVar);
                return bVar;
            }
            bVar = null;
            C04CK c04ck2 = new C04CK() { // from class: X.048T
                @Override // X.AbstractC1748790vbp
                public final C1748850vbv LIZ() {
                    return new C1748850vbv(new C1748840vbu("key", new C1747940vaS[0]), new C1748840vbu("error_code", new C1747940vaS[0]));
                }
            };
            c04ck2.LJIIIIZZ(new AwS52S1000000_1(strLIZIZ, 42));
            c04ck2.LIZJ(false);
            AnonymousClass0405.LIZ(bVar);
            return bVar;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("IDynamicView reflect exception: ");
            sbLIZ2.append(e.getMessage());
            C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ2));
            return null;
        }
    }
}
