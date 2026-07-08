package X;

import com.ss.android.ugc.gamora.editorpro.capabilities.video.crop.croppanel.CropPanelScene;
import ge.i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS20S0010000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0Ep2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C376220Ep2 extends i<InterfaceC375030En7, CropPanelScene, C376210Ep1, C376230Ep3> implements InterfaceC379610EuV, InterfaceC375030En7 {
    public static final int LLJJ = 8;
    public final C1DRG LLJILJILJ;
    public InterfaceC376240Ep4 LLJILLL;

    @Override // X.AbstractC1664470tPp
    public Function0<C376210Ep1> o2() {
        return AFwS191S0000000_5.get$arr$(364);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C376230Ep3> w2() {
        return new AwS549S0100000_5(this, 1306);
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILJILJ;
    }

    @Override // X.InterfaceC375030En7
    public void LLJJIJIIJIL(boolean z) {
        i3(new AwS20S0010000_5(z, 65));
    }

    @Override // X.InterfaceC375030En7
    public void fq2(InterfaceC376240Ep4 interfaceC376240Ep4) {
        this.LLJILLL = interfaceC376240Ep4;
    }

    @Override // X.InterfaceC375030En7
    public void zy1(EnumC375190EnN enumC375190EnN) {
        i3(new AwS584S0100000_5(enumC375190EnN, 1038));
    }

    public C376220Ep2(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3);
        this.LLJILJILJ = c1drg;
    }
}
