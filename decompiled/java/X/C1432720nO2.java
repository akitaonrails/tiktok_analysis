package X;

import Y.ACallableS427S0100000_22;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import java.util.List;

/* JADX INFO: renamed from: X.0nO2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public class C1432720nO2 extends AbstractC1432780nO8 {
    public final List<C1432730nO3> LIZLLL;

    @Override // X.AbstractC1432780nO8
    public final List<C1429800nJK> LIZIZ() {
        return C1432640nNu.LIZIZ(this.LIZLLL);
    }

    @Override // X.AbstractC1432780nO8
    public final void LJFF(InterfaceC1432820nOC interfaceC1432820nOC) {
        super.LJFF(interfaceC1432820nOC);
        if (!AbstractC1432780nO8.LIZJ()) {
            return;
        }
        C15O7.LIZJ(new ACallableS427S0100000_22(this, 10)).LIZLLL(new C1466860oH6(this, (C1432870nOH) interfaceC1432820nOC, 9));
    }

    public C1432720nO2(CreativeInfo creativeInfo, List<C1432730nO3> list) {
        super(creativeInfo);
        this.LIZLLL = list;
    }
}
