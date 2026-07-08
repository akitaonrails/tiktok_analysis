package X;

import Y.ARunnableS107S0100000_7;
import com.bytedance.android.livesdk.broadcast.preview.widget.playbook.PreviewInteractWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.PreviewSettingWidget;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0KdX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C521970KdX implements InterfaceC254900yh {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC254900yh
    public final void x1(int i) {
        switch (this.$t) {
            case 0:
                x1$0(this, i);
                break;
            case 1:
                x1$1(this, i);
                break;
            case 2:
                x1$2(this, i);
                break;
            case 3:
                x1$3(this, i);
                break;
            case 4:
                x1$4(this, i);
                break;
        }
    }

    public C521970KdX(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void x1$0(C521970KdX c521970KdX, int i) {
        if (i != 6 && i != 7) {
            return;
        }
        ((PreviewSettingWidget) c521970KdX.l0).LLJILJIL = true;
    }

    public static final void x1$1(C521970KdX c521970KdX, int i) {
        ((PreviewInteractWidget) c521970KdX.l0).LLJI = false;
    }

    public static final void x1$2(C521970KdX c521970KdX, int i) {
        Function1<Integer, Unit> function1LIZIZ;
        try {
            InterfaceC520940Kbs interfaceC520940Kbs = (InterfaceC520940Kbs) c521970KdX.l0;
            if (interfaceC520940Kbs != null && (function1LIZIZ = interfaceC520940Kbs.LIZIZ()) != null) {
                function1LIZIZ.invoke(Integer.valueOf(i));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static final void x1$3(C521970KdX c521970KdX, int i) {
        if (i != 6 && i != 8) {
            ((C498770JhD) c521970KdX.l0).LLILLL = false;
        }
    }

    public static final void x1$4(C521970KdX c521970KdX, int i) {
        C1106110etF c1106110etF = (C1106110etF) c521970KdX.l0;
        c1106110etF.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Tooltip dismissed, dismiss type: ");
        sbLIZ.append(i);
        C20441214yg.LIZIZ("CoHostSuggestionToolTip", C2188811AlT.LIZIZ(sbLIZ));
        C786410Ut5.LJLIIL(100L, C0IK5.LIZ(), new ARunnableS107S0100000_7(c1106110etF, 212));
    }
}
