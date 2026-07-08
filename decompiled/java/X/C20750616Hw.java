package X;

import Y.ACListenerS165S0100000_31;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.multimatch.ui.MatchCountDownAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.16Hw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public class C20750616Hw extends C09AY implements InterfaceC1685420txc {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1685420txc
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3, obj4, obj5);
            case 1:
                return invoke$1(this, obj, obj2, obj3, obj4, obj5);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20750616Hw(C15DF c15df, int i) {
        super(5);
        this.$t = i;
        this.l0 = c15df;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20750616Hw(MatchCountDownAssem matchCountDownAssem, int i) {
        super(5);
        this.$t = i;
        this.l0 = matchCountDownAssem;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* bridge */ /* synthetic */ java.lang.Object invoke$0(X.C20750616Hw r13, java.lang.Object r14, java.lang.Object r15, java.lang.Object r16, java.lang.Object r17, java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 1218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20750616Hw.invoke$0(X.16Hw, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(C20750616Hw c20750616Hw, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Object obj6;
        String str;
        ACListenerS165S0100000_31 aCListenerS165S0100000_31;
        C20486515Eh c20486515Eh = (C20486515Eh) obj2;
        C20486515Eh c20486515Eh2 = (C20486515Eh) obj3;
        boolean zBooleanValue = ((Boolean) obj4).booleanValue();
        Function0 function0 = (Function0) obj5;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bind countdown ui left=");
        sbLIZ.append(c20486515Eh.LIZ);
        sbLIZ.append(" right=");
        if (c20486515Eh2 == null || (obj6 = c20486515Eh2.LIZ) == null) {
            obj6 = "default";
        }
        sbLIZ.append(obj6);
        sbLIZ.append(" arrowVisible=");
        sbLIZ.append(zBooleanValue);
        sbLIZ.append(" click=");
        if (function0 != null) {
            str = "enabled";
        } else {
            str = "disabled";
        }
        sbLIZ.append(str);
        C20441214yg.LJIIIZ("MatchCountDownAssem", C2188811AlT.LIZIZ(sbLIZ));
        MatchCountDownAssem matchCountDownAssem = (MatchCountDownAssem) c20750616Hw.l0;
        matchCountDownAssem.Jo(matchCountDownAssem.LLJIJIL, c20486515Eh);
        ((MatchCountDownAssem) c20750616Hw.l0).Ho(c20486515Eh2);
        ConstraintLayout constraintLayout = ((MatchCountDownAssem) c20750616Hw.l0).LLJJIJIL;
        if (constraintLayout != null) {
            if (function0 == null) {
                aCListenerS165S0100000_31 = null;
            } else {
                aCListenerS165S0100000_31 = new ACListenerS165S0100000_31(function0, 148);
            }
            C786410Ut5.Y7(constraintLayout, aCListenerS165S0100000_31);
        }
        LiveIconView liveIconView = ((MatchCountDownAssem) c20750616Hw.l0).LLJJI;
        if (liveIconView != null) {
            C500260Jjc.LJLJLJ(liveIconView, zBooleanValue);
        }
        return Unit.LIZ;
    }
}
