package X;

import com.ss.android.ugc.aweme.autocut.s;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0mzN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1417430mzN extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1417350mzF LL;
    public final /* synthetic */ C096H LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1417430mzN(C1417350mzF c1417350mzF, C096H c096h, int i, String str, String str2, String str3) {
        super(0);
        this.LL = c1417350mzF;
        this.LLILLJJLI = c096h;
        this.LLILLL = i;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = str3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C1417310mzB c1417310mzB = this.LL.LJII;
        C23149095f c23149095f = (C23149095f) this.LLILLJJLI;
        c1417310mzB.LJII = c23149095f.LIZ;
        s sVar = s.LIZ;
        Map<String, String> map = c23149095f.LIZIZ;
        sVar.getClass();
        Integer numLJJIJ = s.LJJIJ(map);
        c1417310mzB.LIZJ = numLJJIJ != null ? numLJJIJ.intValue() : this.LLILLL;
        C1417310mzB c1417310mzB2 = this.LL.LJII;
        c1417310mzB2.LJIILLIIL = this.LLILZ;
        Map<String, String> map2 = ((C23149095f) this.LLILLJJLI).LIZIZ;
        c1417310mzB2.LJIILL = map2 != null ? map2.get("autocut_nle_log_id") : null;
        this.LL.LJII.LJI = s.LJJ(((C23149095f) this.LLILLJJLI).LIZ);
        C1417310mzB c1417310mzB3 = this.LL.LJII;
        String strLJJIIZ = s.LJJIIZ(((C23149095f) this.LLILLJJLI).LIZIZ);
        if (strLJJIIZ == null) {
            strLJJIIZ = this.LLILZIL;
        }
        c1417310mzB3.LJIIJ = strLJJIIZ;
        C1417310mzB c1417310mzB4 = this.LL.LJII;
        String strLJJIIZI = s.LJJIIZI(((C23149095f) this.LLILLJJLI).LIZIZ);
        if (strLJJIIZI == null) {
            strLJJIIZI = this.LLILZLL;
        }
        c1417310mzB4.LJIIJJI = strLJJIIZI;
        this.LL.LJ();
        return Unit.LIZ;
    }
}
