package X;

import Y.ARunnableS45S0101000_34;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1Bf0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2210281Bf0 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ InterfaceC2184721Aes LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2210281Bf0(InterfaceC2184721Aes interfaceC2184721Aes) {
        super(0);
        this.LL = interfaceC2184721Aes;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C2209911BeP c2209911BeP;
        BPEAHandler bPEAHandler;
        C2210271Bez c2210271Bez = (C2210271Bez) this.LL;
        if (c2210271Bez.LJI) {
            c2210271Bez.LJI = false;
            if ((c2210271Bez.LJFF || c2210271Bez.LIZJ || c2210271Bez.LIZLLL) && (c2209911BeP = ((C2211111BgL) c2210271Bez.LJIIIIZZ).LIZ.LJIILIIL) != null && (bPEAHandler = c2209911BeP.LLJILJILJ) != null) {
                C786410Ut5.LJJZZIII(bPEAHandler, new ARunnableS45S0101000_34(c2209911BeP, 2));
            }
        }
        return Unit.LIZ;
    }
}
