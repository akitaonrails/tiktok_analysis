package X;

import android.graphics.Bitmap;
import android.os.RemoteException;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.1BSp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2205251BSp implements InterfaceC1177040gje {
    public final C2205271BSr LIZ;

    @Override // X.InterfaceC1177040gje
    public final float LIZ() {
        C2205271BSr c2205271BSr = this.LIZ;
        c2205271BSr.getClass();
        try {
            return c2205271BSr.LIZ.LJFF();
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new C829150Wfp(e);
        }
    }

    @Override // X.InterfaceC1177040gje
    public final C1177960gl8 getPosition() {
        return new C1177960gl8(this.LIZ.LIZ().latitude, this.LIZ.LIZ().longitude);
    }

    @Override // X.InterfaceC1177040gje
    public final Object getTag() {
        C2205271BSr c2205271BSr = this.LIZ;
        c2205271BSr.getClass();
        try {
            return C0WH6.LLLIIL(c2205271BSr.LIZ.LJI());
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new C829150Wfp(e);
        }
    }

    @Override // X.InterfaceC1177040gje
    public final boolean isVisible() {
        C2205271BSr c2205271BSr = this.LIZ;
        c2205271BSr.getClass();
        try {
            return c2205271BSr.LIZ.LLJJLIIIJLLLLLLLZ();
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new C829150Wfp(e);
        }
    }

    @Override // X.InterfaceC1177040gje
    public final void remove() {
        C2205271BSr c2205271BSr = this.LIZ;
        c2205271BSr.getClass();
        try {
            c2205271BSr.LIZ.LJIILL();
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new C829150Wfp(e);
        }
    }

    public C2205251BSp(C2205271BSr c2205271BSr) {
        this.LIZ = c2205271BSr;
    }

    @Override // X.InterfaceC1177040gje
    public final C2205251BSp LIZIZ(float f) {
        C2205271BSr c2205271BSr = this.LIZ;
        c2205271BSr.getClass();
        try {
            c2205271BSr.LIZ.LLJLIL(f);
            return this;
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new C829150Wfp(e);
        }
    }

    @Override // X.InterfaceC1177040gje
    public final C2205251BSp LIZJ(Object obj) {
        C2205271BSr c2205271BSr = this.LIZ;
        c2205271BSr.getClass();
        try {
            c2205271BSr.LIZ.LLJLLIL(new C0WH6(obj));
            return this;
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new C829150Wfp(e);
        }
    }

    @Override // X.InterfaceC1177040gje
    public final C2205251BSp LIZLLL(Bitmap bitmap) {
        C2205271BSr c2205271BSr = this.LIZ;
        C837010WsV c837010WsVLIZ = C1BT8.LIZ(bitmap);
        c2205271BSr.getClass();
        try {
            c2205271BSr.LIZ.U(c837010WsVLIZ.LIZ);
            bitmap.getWidth();
            bitmap.getHeight();
            return this;
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new C829150Wfp(e);
        }
    }

    @Override // X.InterfaceC1177040gje
    public final C2205251BSp setVisible(boolean z) {
        C2205271BSr c2205271BSr = this.LIZ;
        c2205271BSr.getClass();
        try {
            c2205271BSr.LIZ.i(z);
            return this;
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new C829150Wfp(e);
        }
    }

    public final C2205251BSp LJ(float f, float f2) {
        C2205271BSr c2205271BSr = this.LIZ;
        c2205271BSr.getClass();
        try {
            c2205271BSr.LIZ.LLLJIL(f, f2);
            return this;
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new C829150Wfp(e);
        }
    }
}
