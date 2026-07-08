package X;

import com.bytedance.als.ui.UIPanelComponent;
import de.b;
import ge.i;
import kotlin.jvm.internal.AwS587S0100000_8;

/* JADX INFO: renamed from: X.0Lx9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C559610Lx9 {
    public final C0LEK LIZ;
    public final String LIZIZ;

    public static void LIZ(AbstractC2255721DQs abstractC2255721DQs) {
        if (!(abstractC2255721DQs instanceof i)) {
            if (!(abstractC2255721DQs instanceof UIPanelComponent)) {
                if (!(abstractC2255721DQs instanceof AbstractC1664510tPt)) {
                    return;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Please use uiGroupComponent DSL to register UIGroupLogicComponent(");
                sbLIZ.append(abstractC2255721DQs.getComponentName());
                sbLIZ.append(')');
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Please use panelUIComponent DSL to register UIPanelComponent(");
            sbLIZ2.append(abstractC2255721DQs.getComponentName());
            sbLIZ2.append(')');
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("Please use slotUIComponent DSL to register UISlotComponent(");
        sbLIZ3.append(abstractC2255721DQs.getComponentName());
        sbLIZ3.append(')');
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ3));
    }

    public C559610Lx9(C0LEK c0lek, String str) {
        this.LIZ = c0lek;
        this.LIZIZ = str;
        EnumC1642750sqn enumC1642750sqn = EnumC1642750sqn.IMMEDIATE;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("register component ");
        sbLIZ.append(b.class.getName());
        sbLIZ.append(" api ");
        sbLIZ.append(C0ETY.class.getName());
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        c0lek.LIZ(str, enumC1642750sqn, null, C0ETY.class, b.class, new AwS587S0100000_8(new C0ET4(), this, 13));
    }
}
