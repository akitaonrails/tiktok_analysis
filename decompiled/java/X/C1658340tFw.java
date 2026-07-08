package X;

import com.ss.android.ugc.aweme.social.creation.record.viewmodel.RecordViewModelState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tFw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1658340tFw extends AbstractC2255721DQs<InterfaceC1648760t0U> implements InterfaceC379610EuV, InterfaceC1648760t0U {
    public static final int LLILZ = 8;
    public final C1DRG LL;
    public final InterfaceC332260D0u<C1658370tFz> LLILLJJLI = C1BNE.LIZ(new C1658370tFz(false, 15));
    public InterfaceC1652190t61 LLILLL;

    public InterfaceC1648760t0U W1() {
        return this;
    }

    @Override // X.InterfaceC1648760t0U
    public C05YD<C1658370tFz> Bb2() {
        return this.LLILLJJLI;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        W1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C1658340tFw(C1DRG c1drg) {
        this.LL = c1drg;
    }

    @Override // X.InterfaceC1648760t0U
    public void iQ(InterfaceC1652190t61 interfaceC1652190t61) {
        this.LLILLL = interfaceC1652190t61;
    }

    @Override // X.InterfaceC1648760t0U
    public void mD(C1658370tFz c1658370tFz) {
        this.LLILLJJLI.setValue(c1658370tFz);
    }

    @Override // X.InterfaceC1648760t0U
    public RecordViewModelState z20(RecordViewModelState recordViewModelState) {
        boolean zLJFF;
        boolean z;
        boolean z2;
        boolean z3;
        C385670FAf<Boolean> c385670FAfL00;
        C1658370tFz value = this.LLILLJJLI.getValue();
        InterfaceC1652190t61 interfaceC1652190t61 = this.LLILLL;
        if (interfaceC1652190t61 != null && (c385670FAfL00 = interfaceC1652190t61.L00()) != null) {
            zLJFF = Intrinsics.LJFF(c385670FAfL00.LIZJ(), Boolean.TRUE);
        } else {
            zLJFF = false;
        }
        boolean z4 = value.LIZ;
        if (value.LIZIZ && !recordViewModelState.getPanelShowing() && recordViewModelState.getRecordStatus() == EnumC1308705Af.NOT_RECORDING && !zLJFF) {
            z = true;
        } else {
            z = false;
        }
        if (value.LIZJ && recordViewModelState.getRecordStatus() == EnumC1308705Af.NOT_RECORDING && recordViewModelState.getCameraVisible() && !zLJFF) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (value.LIZLLL && recordViewModelState.getRecordStatus() != EnumC1308705Af.PROCESSING) {
            z3 = true;
        } else {
            z3 = false;
        }
        return recordViewModelState.copy(recordViewModelState.topViewState, recordViewModelState.centerViewState, recordViewModelState.bottomViewState, recordViewModelState.cameraLayoutMarginsPx, recordViewModelState.panelShowing, recordViewModelState.cameraVisible, recordViewModelState.recordStatus, recordViewModelState.inRecordMotionEventConsumer, new C1658370tFz(z4, z, z2, z3));
    }

    @Override // X.InterfaceC1648760t0U
    public void jd1(InterfaceC2217241BqE<C1658370tFz, Boolean> interfaceC2217241BqE, boolean z) {
        C1658370tFz c1658370tFzLIZ;
        InterfaceC332260D0u<C1658370tFz> interfaceC332260D0u = this.LLILLJJLI;
        C1658370tFz value = interfaceC332260D0u.getValue();
        if (Intrinsics.LJFF(interfaceC2217241BqE, new C2217381BqS() { // from class: X.0tFy
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1658370tFz) obj).LIZ);
            }
        })) {
            c1658370tFzLIZ = C1658370tFz.LIZ(value, z, false, false, false, 14);
        } else if (Intrinsics.LJFF(interfaceC2217241BqE, new C2217381BqS() { // from class: X.0t0q
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1658370tFz) obj).LIZIZ);
            }
        })) {
            c1658370tFzLIZ = C1658370tFz.LIZ(value, false, z, false, false, 13);
        } else if (Intrinsics.LJFF(interfaceC2217241BqE, new C2217381BqS() { // from class: X.0t0e
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1658370tFz) obj).LIZJ);
            }
        })) {
            c1658370tFzLIZ = C1658370tFz.LIZ(value, false, false, z, false, 11);
        } else if (Intrinsics.LJFF(interfaceC2217241BqE, new C2217381BqS() { // from class: X.0t0c
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1658370tFz) obj).LIZLLL);
            }
        })) {
            c1658370tFzLIZ = C1658370tFz.LIZ(value, false, false, false, z, 7);
        } else {
            c1658370tFzLIZ = C1658370tFz.LIZ(value, false, false, false, false, 15);
        }
        interfaceC332260D0u.setValue(c1658370tFzLIZ);
    }
}
