package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.hybrid.spark.raven.component.BaseComponentData;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gL4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1161800gL4 {
    public static <T extends BaseComponentData> InterfaceC1161620gKm LIZ(InterfaceC1161810gL5<T> interfaceC1161810gL5) {
        C128Y c128yLJI = C724240Sb0.LJI(interfaceC1161810gL5);
        if (c128yLJI instanceof InterfaceC1161620gKm) {
            return (InterfaceC1161620gKm) c128yLJI;
        }
        return null;
    }

    public static <T extends BaseComponentData> String LIZIZ(InterfaceC1161810gL5<T> interfaceC1161810gL5) {
        Integer numValueOf;
        int iIntValue;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        InterfaceC1161620gKm interfaceC1161620gKmSH = interfaceC1161810gL5.sH();
        int iIntValue2 = 0;
        Integer numValueOf2 = null;
        if (interfaceC1161620gKmSH != null) {
            Integer numValueOf3 = Integer.valueOf(interfaceC1161620gKmSH.Lg());
            if (numValueOf3 != null) {
                iIntValue = numValueOf3.intValue();
            } else {
                iIntValue = 0;
            }
            numValueOf = Integer.valueOf(iIntValue);
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append('_');
        String strS2 = interfaceC1161810gL5.S2();
        if (strS2 == null) {
            strS2 = "";
        }
        sbLIZ.append(strS2);
        sbLIZ.append('_');
        InterfaceC1161620gKm interfaceC1161620gKmSH2 = interfaceC1161810gL5.sH();
        if (interfaceC1161620gKmSH2 != null) {
            Integer numValueOf4 = Integer.valueOf(interfaceC1161620gKmSH2.hi(interfaceC1161810gL5.S2()));
            if (numValueOf4 != null) {
                iIntValue2 = numValueOf4.intValue();
            }
            numValueOf2 = Integer.valueOf(iIntValue2);
        }
        sbLIZ.append(numValueOf2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static <T extends BaseComponentData> void LIZLLL(InterfaceC1161810gL5<T> interfaceC1161810gL5) {
        C1161870gLB c1161870gLBBr;
        InterfaceC1161620gKm interfaceC1161620gKmSH = interfaceC1161810gL5.sH();
        if (interfaceC1161620gKmSH != null && (c1161870gLBBr = interfaceC1161620gKmSH.Br()) != null) {
            c1161870gLBBr.LIZLLL(interfaceC1161810gL5, interfaceC1161810gL5.B());
        }
    }

    public static <T extends BaseComponentData> void LIZJ(InterfaceC1161810gL5<T> interfaceC1161810gL5, View view, InterfaceC665370Q7z interfaceC665370Q7z) {
        for (View view2 : (ArrayList) C422500GhU.LIZ(view, AFwS236S0000000_6.get$arr$(33))) {
            if (view2 instanceof ViewOnAttachStateChangeListenerC20604515jv) {
                C1196320hEk.LIZIZ((RecyclerView) view2, interfaceC665370Q7z);
            }
        }
        final String strS2 = interfaceC1161810gL5.S2();
        C1554960qZC.LIZ(interfaceC665370Q7z, new InterfaceC2753014t(strS2) { // from class: X.0160
            public final String LL;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof AnonymousClass0160) && Intrinsics.LJFF(this.LL, ((AnonymousClass0160) obj).LL);
            }

            public final int hashCode() {
                String str = this.LL;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("InstanceSource(instanceId=");
                sbLIZ.append(this.LL);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            {
                this.LL = strS2;
            }
        }, AnonymousClass0160.class, "source_default_key");
    }
}
