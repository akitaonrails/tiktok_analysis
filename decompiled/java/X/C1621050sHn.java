package X;

import com.ss.android.ugc.gamora.recorder.sticker.l0;

/* JADX INFO: renamed from: X.0sHn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1621050sHn implements InterfaceC1621930sJD {
    public EnumC1641600sow LIZ = EnumC1641600sow.DEFAULT;
    public final /* synthetic */ l0 LIZIZ;

    @Override // X.InterfaceC1621930sJD
    public final void LIZ() {
        EnumC1641600sow enumC1641600sow;
        if (C1660920tK6.LJFF) {
            this.LIZIZ.Jf(true, false);
            enumC1641600sow = EnumC1641600sow.WIRED;
        } else {
            this.LIZIZ.Jf(false, false);
            enumC1641600sow = EnumC1641600sow.DEFAULT;
        }
        this.LIZ = enumC1641600sow;
    }

    @Override // X.InterfaceC1621930sJD
    public final void LIZIZ() {
        if (this.LIZ == EnumC1641600sow.DEFAULT) {
            this.LIZIZ.Jf(true, false);
            this.LIZ = EnumC1641600sow.WIRED;
        }
    }

    @Override // X.InterfaceC1621930sJD
    public final void LIZJ() {
        if (this.LIZ == EnumC1641600sow.WIRED) {
            this.LIZIZ.Jf(false, false);
            this.LIZ = EnumC1641600sow.DEFAULT;
        }
    }

    @Override // X.InterfaceC1621930sJD
    public final void LIZLLL() {
        EnumC1641600sow enumC1641600sow = this.LIZ;
        EnumC1641600sow enumC1641600sow2 = EnumC1641600sow.BLUETOOTH;
        if (enumC1641600sow != enumC1641600sow2) {
            this.LIZIZ.Jf(true, true);
            this.LIZ = enumC1641600sow2;
        }
    }

    public C1621050sHn(l0 l0Var) {
        this.LIZIZ = l0Var;
    }
}
