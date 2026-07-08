package X;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0slt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1639710slt implements InterfaceC1642310sq5 {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(458));
    public final C01GW LIZIZ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 866));
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 867));
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 865));
    public final C01GW LJ = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(459));
    public final C01GW LJFF = C452501pT.LIZIZ(new AwS569S0100000_25(this, 868));
    public InterfaceC1635410sex LJI;

    @Override // X.InterfaceC1642310sq5
    public final InterfaceC1635410sex LJ() {
        InterfaceC1635410sex interfaceC1635410sexLIZ;
        synchronized (this) {
            try {
                interfaceC1635410sexLIZ = this.LJI;
                if (interfaceC1635410sexLIZ == null) {
                    interfaceC1635410sexLIZ = C1633850scR.LIZ(C0CHQ.LIZ, null);
                }
                this.LJI = interfaceC1635410sexLIZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return interfaceC1635410sexLIZ;
    }

    @Override // X.InterfaceC1642310sq5
    public final void LJFF() {
        InterfaceC1635410sex interfaceC1635410sex;
        synchronized (this) {
            try {
                interfaceC1635410sex = this.LJI;
                this.LJI = null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (interfaceC1635410sex != null) {
            interfaceC1635410sex.LIZLLL(LIZJ().get());
        }
    }

    @Override // X.InterfaceC1642310sq5
    public final InterfaceC1429820nJM LIZ() {
        return (InterfaceC1429820nJM) this.LIZIZ.getValue();
    }

    @Override // X.InterfaceC1642310sq5
    public final InterfaceC1639870sm9 LIZIZ() {
        return (InterfaceC1639870sm9) this.LIZJ.getValue();
    }

    @Override // X.InterfaceC1642310sq5
    public InterfaceC1456340o08<String> LIZJ() {
        return (InterfaceC1456340o08) this.LJ.getValue();
    }

    @Override // X.InterfaceC1642310sq5
    public final C12IO LIZLLL() {
        return (C12IO) this.LIZ.getValue();
    }

    @Override // X.InterfaceC1642310sq5
    public final void LJI() {
        if (!TextUtils.equals(Build.BRAND, "Xiaomi") || C1961207mE.LIZ("android.content.res.MiuiResourcesImpl")) {
            return;
        }
        C1961207mE.LIZ("android.content.res.MiuiResources");
    }

    @Override // X.InterfaceC1642310sq5
    public final InterfaceC1639820sm4 LJII() {
        return (InterfaceC1639820sm4) this.LIZLLL.getValue();
    }
}
