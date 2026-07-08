package X;

import androidx.compose.foundation.layout.c;
import com.ss.android.ugc.aweme.social.creation.mediapicker.ui.SocialMediaPickerViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS581S0100000_2;

/* JADX INFO: renamed from: X.0MAG, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MAG extends C09AY implements InterfaceC1631630sYr<InterfaceC1669590tY5, Integer, InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ float LL;
    public final /* synthetic */ SocialMediaPickerViewModel LLILLJJLI;
    public final /* synthetic */ C05P0<Integer> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0MAG(float f, SocialMediaPickerViewModel socialMediaPickerViewModel, C05P0<Integer> c05p0) {
        super(4);
        this.LL = f;
        this.LLILLJJLI = socialMediaPickerViewModel;
        this.LLILLL = c05p0;
    }

    @Override // X.InterfaceC1631630sYr
    public final Unit invoke(InterfaceC1669590tY5 interfaceC1669590tY5, Integer num, InterfaceC1680500tpg interfaceC1680500tpg, Integer num2) {
        num.intValue();
        InterfaceC1680500tpg interfaceC1680500tpg2 = interfaceC1680500tpg;
        if ((num2.intValue() & 129) == 128 && interfaceC1680500tpg2.LIZ()) {
            interfaceC1680500tpg2.LIZJ();
        } else {
            InterfaceC1685750ty9 interfaceC1685750ty9LJ = c.LJ(InterfaceC1685750ty9.LIZ, 1.0f);
            interfaceC1680500tpg2.LJJIIJZLJL(5004770);
            C05P0<Integer> c05p0 = this.LLILLL;
            Object objLJJ = interfaceC1680500tpg2.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            if (objLJJ == C1680510tph.LIZIZ) {
                objLJJ = new AwS581S0100000_2((C05P0) c05p0, (C05P0<InterfaceC1692950u9l>) 304);
                interfaceC1680500tpg2.LJJIJIIJI(objLJJ);
            }
            interfaceC1680500tpg2.LJ();
            C1669260tXY.LIZIZ(C1685330txT.LIZ(interfaceC1685750ty9LJ, (Function1) objLJJ), this.LL, this.LLILLJJLI, interfaceC1680500tpg2, 6);
        }
        return Unit.LIZ;
    }
}
