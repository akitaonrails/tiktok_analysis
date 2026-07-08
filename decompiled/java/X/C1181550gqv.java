package X;

import android.view.View;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import com.ss.android.ugc.aweme.slash.page.SlashFragment;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS98S1000000_13;

/* JADX INFO: renamed from: X.0gqv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1181550gqv {
    public final Map<String, InterfaceC1181670gr7> LIZ;

    public C1181550gqv(SlashFragment slashFragment) {
        C1174000gek c1174000gekBr = slashFragment.Br();
        if (c1174000gekBr != null) {
            c1174000gekBr.LL.add(new InterfaceC1174010gel() { // from class: X.0gqw
                @Override // X.InterfaceC1174010gel
                public final void LJII(InterfaceC1173990gej<?> interfaceC1173990gej) {
                }

                @Override // X.InterfaceC1174010gel
                public final void LJJ(InterfaceC1173990gej<?> interfaceC1173990gej, View view) {
                }

                @Override // X.InterfaceC1174010gel
                public final void LJJI(InterfaceC1173990gej<?> interfaceC1173990gej, BaseComponentData baseComponentData) {
                }

                @Override // X.InterfaceC1174010gel
                public final void LJFF(InterfaceC1173990gej<?> interfaceC1173990gej) {
                    String strS2 = interfaceC1173990gej.S2();
                    if (strS2 != null) {
                        C1181550gqv c1181550gqv = this.LL;
                        c1181550gqv.getClass();
                        C1180170goh.LIZLLL().LIZ(new AwS98S1000000_13(strS2, 19));
                        c1181550gqv.LIZ.remove(strS2);
                    }
                }

                @Override // X.InterfaceC1174010gel
                public final void LJI(InterfaceC1173990gej<?> interfaceC1173990gej) {
                    InterfaceC1181670gr7 interfaceC1181670gr7;
                    String strS2 = interfaceC1173990gej.S2();
                    if (strS2 != null && (interfaceC1181670gr7 = (InterfaceC1181670gr7) ((LinkedHashMap) this.LL.LIZ).get(strS2)) != null) {
                        interfaceC1181670gr7.LJJJJZ();
                    }
                }

                @Override // X.InterfaceC1174010gel
                public final void LJIIJJI(InterfaceC1173990gej<?> interfaceC1173990gej, BaseComponentData baseComponentData) {
                    InterfaceC1181670gr7 interfaceC1181670gr7;
                    String strS2 = interfaceC1173990gej.S2();
                    if (strS2 != null && (interfaceC1181670gr7 = (InterfaceC1181670gr7) ((LinkedHashMap) this.LL.LIZ).get(strS2)) != null) {
                        interfaceC1181670gr7.onBind();
                    }
                }
            });
        }
        this.LIZ = new LinkedHashMap();
    }
}
