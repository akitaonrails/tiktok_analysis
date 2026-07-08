package X;

import android.view.View;
import java.util.Map;
import kotlin.jvm.internal.AwS17S2300000_23;

/* JADX INFO: renamed from: X.0qJY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1545260qJY extends AbstractC1545300qJc {
    public final /* synthetic */ C1545060qJE LIZ;
    public final /* synthetic */ InterfaceC1547330qMt LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ InterfaceC1547330qMt LIZLLL;

    public C1545260qJY(InterfaceC1547330qMt interfaceC1547330qMt, InterfaceC1547330qMt interfaceC1547330qMt2, C1545060qJE c1545060qJE, String str) {
        this.LIZ = c1545060qJE;
        this.LIZIZ = interfaceC1547330qMt;
        this.LIZJ = str;
        this.LIZLLL = interfaceC1547330qMt2;
    }

    public final void LIZ(C21326518d5 c21326518d5, View view, String str, Object obj) {
        String str2;
        Integer num;
        C1168400gVi.LIZJ(new C1545270qJZ(this.LIZJ, this.LIZLLL, str));
        C1545310qJd c1545310qJdLIZLLL = this.LIZ.LIZLLL.LIZ.LIZLLL();
        if (c1545310qJdLIZLLL != null) {
            AwS17S2300000_23 awS17S2300000_23 = new AwS17S2300000_23(this.LIZIZ, this.LIZJ, str, this.LIZ, obj, 0);
            if (C1325860kbg.LJII()) {
                c1545310qJdLIZLLL.LIZ.add((C1488830oqX) awS17S2300000_23.invoke());
            }
        }
        InterfaceC1547330qMt interfaceC1547330qMt = this.LIZIZ;
        if (interfaceC1547330qMt instanceof C1547320qMs) {
            this.LIZ.LJ(c21326518d5, (C1547320qMs) interfaceC1547330qMt, view, str, obj);
        }
        String str3 = "";
        int iIntValue = 4005;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            Object obj2 = map.get("code");
            if ((obj2 instanceof Integer) && (num = (Integer) obj2) != null) {
                iIntValue = num.intValue();
            }
            Object obj3 = map.get("msg");
            if (!(obj3 instanceof String) || (str2 = (String) obj3) == null) {
                str2 = "";
            }
        } else {
            str2 = obj instanceof String ? (String) obj : "";
        }
        C1545060qJE c1545060qJE = this.LIZ;
        EnumC1986007qE enumC1986007qE = EnumC1986007qE.ActionRuntime;
        String nodeName = this.LIZIZ.getNodeName();
        if (nodeName != null) {
            str3 = nodeName;
        }
        c1545060qJE.LJIIIIZZ(iIntValue, str2, enumC1986007qE, str3, this.LIZJ);
    }
}
