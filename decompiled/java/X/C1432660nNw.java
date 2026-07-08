package X;

import Y.ACallableS427S0100000_22;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import java.util.List;

/* JADX INFO: renamed from: X.0nNw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1432660nNw extends AbstractC1432780nO8 {
    public int LIZLLL;
    public final List<EditVideoSegment> LJ;

    @Override // X.InterfaceC1432810nOB
    public final String LIZ() {
        return "extract_movie";
    }

    @Override // X.AbstractC1432780nO8
    public final void LJ() {
        throw null;
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
        C15O7.LIZJ(new ACallableS427S0100000_22(this, 9)).LIZLLL(new C1466860oH6((C1432870nOH) interfaceC1432820nOC, this, 7));
    }

    public C1432660nNw(CreativeInfo creativeInfo, List<EditVideoSegment> list) {
        super(creativeInfo);
        this.LJ = list;
    }

    public static void LJI(C1432660nNw c1432660nNw, InterfaceC1432820nOC interfaceC1432820nOC, C15O7 c15o7) {
        c1432660nNw.getClass();
        C1C7U.LIZ("CutSameVideoExtractor@34db.start$2L");
        interfaceC1432820nOC.onFinish(c15o7.LJIILJJIL());
        C2265108u9.LIZJ();
        super.LJ();
        C1C7U.LIZIZ("CutSameVideoExtractor@34db.start$2L");
    }
}
