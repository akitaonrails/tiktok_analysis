package X;

import android.util.Log;
import com.bytedance.als.dsl.AlsVMContainer;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: renamed from: X.0sxx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1647190sxx extends AbstractC1664510tPt<InterfaceC1646840sxO> implements InterfaceC1646840sxO {
    public static final C1647210sxz LLJILJILJ = new Object() { // from class: X.0sxz
    };
    public final C19A3 LLJILJIL;

    @Override // X.AbstractC1664510tPt
    public int q3() {
        return R.layout.d7v;
    }

    @Override // X.AbstractC1664510tPt, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        C201955140j.LJIIL("RecordMinorUIGroupComponent onCreate");
    }

    @Override // X.AbstractC1664510tPt, X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RecordMinorUIGroupComponent onDestroy\n ");
        sbLIZ.append(Log.getStackTraceString(new Exception()));
        C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.AbstractC2255721DQs
    public void onResume() {
        super.onResume();
        C201955140j.LJIIL("RecordMinorUIGroupComponent onResume");
    }

    @Override // X.AbstractC2255721DQs
    public void onStart() {
        super.onStart();
        C201955140j.LJIIL("RecordMinorUIGroupComponent onStart");
    }

    @Override // X.AbstractC1664510tPt
    public void o2(C19A3 c19a3) {
        C201955140j.LJIIL("RecordMinorUIGroupComponent before buildChildComponents");
        AlsVMContainer alsVMContainer = (AlsVMContainer) C1659680tI6.LIZ.LIZ(c3(), AlsVMContainer.class);
        C1647230sy1 c1647230sy1 = new C1647230sy1(0);
        c1647230sy1.LIZJ = true;
        c1647230sy1.LIZLLL = true;
        alsVMContainer.LL = c1647230sy1;
        T2("RecordMinorUIGroupComponent", AFwS266S0000000_25.get$arr$(500));
        X1("RecordMinorUIGroupComponent", new AwS604S0100000_25(this, c19a3, 702));
    }

    public C1647190sxx(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3, c1drg);
        this.LLJILJIL = c19a3;
    }
}
