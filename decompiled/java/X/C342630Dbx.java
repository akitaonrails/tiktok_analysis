package X;

/* JADX INFO: renamed from: X.0Dbx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C342630Dbx extends AbstractC2255721DQs<InterfaceC1642030spd> implements InterfaceC1642030spd {
    public static final C342640Dby LLILLL = new Object() { // from class: X.0Dby
    };
    public static final int LLILZ = 8;
    public final InterfaceC23198097c LL;
    public final InterfaceC1642030spd LLILLJJLI = this;

    private final void X1() {
        InterfaceC23198097c interfaceC23198097c = this.LL;
        if (interfaceC23198097c == null) {
            C201955140j.LIZLLL(C1632470saD.LIZIZ, "RecordLongRunningTaskCancellationCoordinator", "EffectPrefetcherComponent not present, skip pause");
        } else {
            C201955140j.LJIILL(C1632470saD.LIZIZ, "RecordLongRunningTaskCancellationCoordinator", "Pausing the EffectPrefetcher");
            interfaceC23198097c.pause();
        }
    }

    @Override // X.InterfaceC1642030spd
    public void EP1() {
        C342610Dbv.LIZ.getClass();
        if (((Boolean) C342610Dbv.LIZIZ.getValue()).booleanValue()) {
            X1();
        }
    }

    @Override // X.InterfaceC1642030spd
    public void NG2() {
        C342620Dbw.LIZ.getClass();
        if (((Boolean) C342620Dbw.LIZIZ.getValue()).booleanValue()) {
            X1();
        }
    }

    public InterfaceC1642030spd W1() {
        return this.LLILLJJLI;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLJJLI;
    }

    public C342630Dbx(InterfaceC23198097c interfaceC23198097c) {
        this.LL = interfaceC23198097c;
    }
}
