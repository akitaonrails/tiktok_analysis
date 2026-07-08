package X;

import com.bytedance.helios.cache.config.FeatureRegisterConfig;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0WyG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C840580WyG implements InterfaceC826020Wam {
    public static final C840580WyG LIZ = new C840580WyG();
    public static List<FeatureRegisterConfig> LIZIZ = new ArrayList();

    @Override // X.InterfaceC826020Wam
    public final void LIZ(int i, Object obj, Object[] objArr, C0WZW c0wzw, Object obj2) throws Throwable {
        Integer numValueOf;
        int iLIZIZ;
        for (FeatureRegisterConfig featureRegisterConfig : LIZIZ) {
            if (c0wzw.LIZ) {
                Map<Integer, Integer> map = C842060X1o.LIZ;
                if (obj != null && (obj instanceof Method)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    Method method = (Method) obj;
                    sbLIZ.append(method.getDeclaringClass().getName());
                    sbLIZ.append('.');
                    sbLIZ.append(method.getName());
                    Integer num = C842060X1o.LIZIZ.get(C2188811AlT.LIZIZ(sbLIZ));
                    if (num != null) {
                        numValueOf = Integer.valueOf(C842060X1o.LIZ(num.intValue()));
                    }
                }
            } else {
                numValueOf = Integer.valueOf(C842060X1o.LIZ(i));
            }
            if (numValueOf != null) {
                int iIntValue = numValueOf.intValue();
                if (c0wzw.LIZ) {
                    if ((this instanceof Method) && objArr.length != 0) {
                        int length = objArr.length;
                        C1691430u7J.LIZ(length, objArr.length);
                        iLIZIZ = C842060X1o.LIZIZ(iIntValue, Arrays.copyOfRange(objArr, 1, length));
                    } else {
                        iLIZIZ = 0;
                    }
                } else {
                    iLIZIZ = C842060X1o.LIZIZ(iIntValue, objArr);
                }
                String strValueOf = String.valueOf(iIntValue);
                if (iLIZIZ != 0) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(iIntValue);
                    sbLIZ2.append('(');
                    sbLIZ2.append(iLIZIZ);
                    sbLIZ2.append(')');
                    strValueOf = C2188811AlT.LIZIZ(sbLIZ2);
                }
                if (featureRegisterConfig.funSigNames.contains(strValueOf) && obj2 != null) {
                    String str = featureRegisterConfig.featureKey;
                    EnumC840610WyJ enumC840610WyJ = EnumC840610WyJ.STRING;
                    String string = obj2.toString();
                    C840570WyF c840570WyF = new C840570WyF(str, new C840600WyI(enumC840610WyJ, string));
                    C840600WyI c840600WyI = C840560WyE.LIZ.get(str);
                    if (c840600WyI != null) {
                        if (c840600WyI.LIZ != enumC840610WyJ || !Intrinsics.LJFF(c840600WyI.LIZIZ, string)) {
                            c840570WyF.invoke();
                        }
                    } else {
                        c840570WyF.invoke();
                    }
                }
            }
        }
    }
}
