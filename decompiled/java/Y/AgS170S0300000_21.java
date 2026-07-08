package Y;

import X.C1362510lYn;
import X.C1363360laA;
import X.C1363950lb7;
import X.C2188811AlT;
import X.C2296808zG;
import X.EnumC1364010lbD;
import X.InterfaceC1364105Vn;
import X.InterfaceC346701Wf;
import X.InterfaceC497601wk;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import kotlin.Unit;

/* JADX INFO: loaded from: classes22.dex */
public class AgS170S0300000_21 implements InterfaceC346701Wf {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC346701Wf
    public final Object emit(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        switch (this.$t) {
            case 0:
                return emit$0(this, obj, interfaceC1364105Vn);
            case 1:
                return emit$1(this, obj, interfaceC1364105Vn);
            case 2:
                return emit$2(this, obj, interfaceC1364105Vn);
            default:
                return null;
        }
    }

    public static final Object emit$0(AgS170S0300000_21 agS170S0300000_21, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        String displayName;
        EnumC1364010lbD enumC1364010lbD = (EnumC1364010lbD) obj;
        if (C2296808zG.LJI((InterfaceC497601wk) agS170S0300000_21.l0)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("concat: ");
            sbLIZ.append(((IMContact) agS170S0300000_21.l1).getDisplayName());
            sbLIZ.append(" iconState：");
            sbLIZ.append(enumC1364010lbD);
            sbLIZ.append(' ');
            C2188811AlT.LIZIZ(sbLIZ);
            ((C1363950lb7) agS170S0300000_21.l2).W5(enumC1364010lbD);
            if (C2296808zG.LJI((InterfaceC497601wk) agS170S0300000_21.l0) && (displayName = ((IMContact) agS170S0300000_21.l1).getDisplayName()) != null && displayName.length() != 0) {
                C1363360laA.LIZ.put(displayName, enumC1364010lbD);
            }
        }
        return Unit.LIZ;
    }

    public static final Object emit$1(AgS170S0300000_21 agS170S0300000_21, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        C1362510lYn c1362510lYn = (C1362510lYn) obj;
        if (C2296808zG.LJI((InterfaceC497601wk) agS170S0300000_21.l0)) {
            C1363950lb7 c1363950lb7 = (C1363950lb7) agS170S0300000_21.l1;
            int i = C1363950lb7.LLLFFI;
            c1363950lb7.V5(c1362510lYn, null);
            String displayName = ((IMContact) agS170S0300000_21.l2).getDisplayName();
            C1362510lYn c1362510lYn2 = new C1362510lYn(c1362510lYn.LIZ, c1362510lYn.LIZIZ, ((C1363950lb7) agS170S0300000_21.l1).LLJJIJI);
            if (displayName != null && displayName.length() != 0) {
                C1363360laA.LIZIZ.put(displayName, c1362510lYn2);
            }
        }
        return Unit.LIZ;
    }

    public static final Object emit$2(AgS170S0300000_21 agS170S0300000_21, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (C2296808zG.LJI((InterfaceC497601wk) agS170S0300000_21.l0)) {
            ((C1363950lb7) agS170S0300000_21.l1).LLJJIJIIJIL = !zBooleanValue;
            String displayName = ((IMContact) agS170S0300000_21.l2).getDisplayName();
            if (displayName != null && displayName.length() != 0) {
                C1363360laA.LIZJ.put(displayName, Boolean.valueOf(zBooleanValue));
            }
        }
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AgS170S0300000_21(com.ss.android.ugc.aweme.im.contacts.api.model.IMContact r2, X.C1363950lb7 r3, X.InterfaceC497601wk r4, int r5) {
        /*
            r1 = this;
            r1.$t = r5
            if (r5 == 0) goto Lf
            r0 = r1
            r0.l0 = r4
            r0.l1 = r3
            r0.l2 = r2
        Lb:
            r0.<init>()
            return
        Lf:
            r0 = r1
            r0.l0 = r4
            r0.l1 = r2
            r0.l2 = r3
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS170S0300000_21.<init>(com.ss.android.ugc.aweme.im.contacts.api.model.IMContact, X.0lb7, X.01wk, int):void");
    }
}
