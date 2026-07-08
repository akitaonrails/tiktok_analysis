package X;

import Y.ACallableS427S0100000_22;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import java.util.List;

/* JADX INFO: renamed from: X.0nNx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1432670nNx extends AbstractC1432780nO8 {
    public int LIZLLL;
    public final List<EditVideoSegment> LJ;

    @Override // X.InterfaceC1432810nOB
    public final String LIZ() {
        return "extract_upload";
    }

    @Override // X.AbstractC1432780nO8
    public final List<C1429800nJK> LIZIZ() {
        return C1432640nNu.LIZ(this.LJ);
    }

    @Override // X.AbstractC1432780nO8
    public final void LJFF(InterfaceC1432820nOC interfaceC1432820nOC) {
        super.LJFF(interfaceC1432820nOC);
        if (!AbstractC1432780nO8.LIZJ()) {
            return;
        }
        C15O7.LIZJ(new ACallableS427S0100000_22(this, 12)).LIZLLL(new C1466860oH6((C1432870nOH) interfaceC1432820nOC, this, 11));
    }

    public C1432670nNx(CreativeInfo creativeInfo, List<EditVideoSegment> list) {
        super(creativeInfo);
        this.LJ = list;
    }
}
