package X;

import android.view.View;
import com.bytedance.hybrid.spark.raven.component.BaseComponentData;
import com.bytedance.hybrid.spark.raven.page.RavenFragment;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS98S1000000_13;

/* JADX INFO: renamed from: X.0gKP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1161390gKP {
    public final Map<String, InterfaceC1161570gKh> LIZ;

    public C1161390gKP(RavenFragment ravenFragment) {
        C1161870gLB c1161870gLBBr = ravenFragment.Br();
        if (c1161870gLBBr != null) {
            c1161870gLBBr.LIZ.add(new InterfaceC1161880gLC() { // from class: X.0gKg
                @Override // X.InterfaceC1161880gLC
                public final void LIZJ(InterfaceC1161810gL5<?> interfaceC1161810gL5) {
                }

                @Override // X.InterfaceC1161880gLC
                public final void LIZLLL(InterfaceC1161810gL5<?> interfaceC1161810gL5, BaseComponentData baseComponentData) {
                }

                @Override // X.InterfaceC1161880gLC
                public final void LJ(InterfaceC1161810gL5<?> interfaceC1161810gL5, View view) {
                }

                @Override // X.InterfaceC1161880gLC
                public final void LIZIZ(InterfaceC1161810gL5<?> interfaceC1161810gL5) {
                    InterfaceC1161570gKh interfaceC1161570gKh;
                    String strS2 = interfaceC1161810gL5.S2();
                    if (strS2 != null && (interfaceC1161570gKh = (InterfaceC1161570gKh) ((LinkedHashMap) this.LIZ.LIZ).get(strS2)) != null) {
                        interfaceC1161570gKh.LJJJJZ();
                    }
                }

                @Override // X.InterfaceC1161880gLC
                public final void LJFF(InterfaceC1161810gL5<?> interfaceC1161810gL5) {
                    String strS2 = interfaceC1161810gL5.S2();
                    if (strS2 != null) {
                        C1161390gKP c1161390gKP = this.LIZ;
                        c1161390gKP.getClass();
                        new C1043010dFT();
                        C1043010dFT.LIZ(null, new AwS98S1000000_13(strS2, 14));
                        c1161390gKP.LIZ.remove(strS2);
                    }
                }

                @Override // X.InterfaceC1161880gLC
                public final void LIZ(InterfaceC1161810gL5<?> interfaceC1161810gL5, BaseComponentData baseComponentData) {
                    InterfaceC1161570gKh interfaceC1161570gKh;
                    String strS2 = interfaceC1161810gL5.S2();
                    if (strS2 != null && (interfaceC1161570gKh = (InterfaceC1161570gKh) ((LinkedHashMap) this.LIZ.LIZ).get(strS2)) != null) {
                        interfaceC1161570gKh.onBind();
                    }
                }
            });
        }
        this.LIZ = new LinkedHashMap();
    }
}
