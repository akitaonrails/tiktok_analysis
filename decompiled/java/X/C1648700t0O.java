package X;

/* JADX INFO: renamed from: X.0t0O, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1648700t0O implements InterfaceC1648710t0P {
    public final InterfaceC1648710t0P LIZ;
    public final /* synthetic */ ViewOnTouchListenerC1648690t0N LIZIZ;

    @Override // X.InterfaceC1648710t0P
    public final boolean O0() {
        return this.LIZ.O0();
    }

    @Override // X.InterfaceC1648710t0P
    public final void R2() {
        this.LIZ.R2();
    }

    @Override // X.InterfaceC1648710t0P
    public final void S2() {
        this.LIZ.S2();
    }

    @Override // X.InterfaceC1648710t0P
    public final void W2() {
        this.LIZ.W2();
    }

    @Override // X.InterfaceC1648710t0P
    public final void p2() {
        this.LIZ.p2();
    }

    @Override // X.InterfaceC1648710t0P
    public final void Q2() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RecordLayout onRecordStart isRecording: ");
        sbLIZ.append(this.LIZIZ.LLLLLL);
        C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ));
        if (this.LIZIZ.LLLLLL) {
            return;
        }
        this.LIZ.Q2();
        this.LIZIZ.setRecording(true);
    }

    @Override // X.InterfaceC1648710t0P
    public final void T2(boolean z) {
        this.LIZ.T2(z);
        C2288908xz.LIZIZ();
    }

    @Override // X.InterfaceC1648710t0P
    public final void V2(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RecordLayout onRecordEnd isRecording: ");
        sbLIZ.append(this.LIZIZ.LLLLLL);
        C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ));
        ViewOnTouchListenerC1648690t0N viewOnTouchListenerC1648690t0N = this.LIZIZ;
        if (viewOnTouchListenerC1648690t0N.LLLLLL) {
            if (viewOnTouchListenerC1648690t0N.LLILLL && !viewOnTouchListenerC1648690t0N.LLILZ) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("RecordLayout onRecordEnd skip for template: ");
                sbLIZ2.append(this.LIZIZ.LLLLLL);
                C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ2));
            } else {
                this.LIZ.V2(z);
            }
            this.LIZIZ.setRecording(false);
            this.LIZIZ.LLLLII = false;
        }
    }

    @Override // X.InterfaceC1648710t0P
    public final void y2(EnumC1448830no1 enumC1448830no1) {
        this.LIZ.y2(enumC1448830no1);
    }

    public C1648700t0O(ViewOnTouchListenerC1648690t0N viewOnTouchListenerC1648690t0N, InterfaceC1648710t0P interfaceC1648710t0P) {
        this.LIZIZ = viewOnTouchListenerC1648690t0N;
        this.LIZ = interfaceC1648710t0P;
    }

    @Override // X.InterfaceC1648710t0P
    public final void U2(float f, float f2) {
        this.LIZ.U2(f, f2);
    }
}
