package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.autocut.s;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0mzI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1417380mzI extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1417350mzF LL;
    public final /* synthetic */ NLEModel LLILLJJLI;
    public final /* synthetic */ Map<String, String> LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1417380mzI(C1417350mzF c1417350mzF, NLEModel nLEModel, Map<String, String> map, int i, String str, String str2, String str3) {
        super(0);
        this.LL = c1417350mzF;
        this.LLILLJJLI = nLEModel;
        this.LLILLL = map;
        this.LLILZ = i;
        this.LLILZIL = str;
        this.LLILZLL = str2;
        this.LLIZ = str3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C1417310mzB c1417310mzB = this.LL.LJII;
        c1417310mzB.LJII = this.LLILLJJLI;
        s sVar = s.LIZ;
        Map<String, String> map = this.LLILLL;
        sVar.getClass();
        Integer numLJJIJ = s.LJJIJ(map);
        c1417310mzB.LIZJ = numLJJIJ != null ? numLJJIJ.intValue() : this.LLILZ;
        C1417310mzB c1417310mzB2 = this.LL.LJII;
        c1417310mzB2.LJIILLIIL = this.LLILZIL;
        Map<String, String> map2 = this.LLILLL;
        c1417310mzB2.LJIILL = map2 != null ? map2.get("autocut_nle_log_id") : null;
        this.LL.LJII.LJI = s.LJJ(this.LLILLJJLI);
        C1417310mzB c1417310mzB3 = this.LL.LJII;
        String strLJJIIZ = s.LJJIIZ(this.LLILLL);
        if (strLJJIIZ == null) {
            strLJJIIZ = this.LLILZLL;
        }
        c1417310mzB3.LJIIJ = strLJJIIZ;
        C1417310mzB c1417310mzB4 = this.LL.LJII;
        String strLJJIIZI = s.LJJIIZI(this.LLILLL);
        if (strLJJIIZI == null) {
            strLJJIIZI = this.LLIZ;
        }
        c1417310mzB4.LJIIJJI = strLJJIIZI;
        this.LL.LJ();
        return Unit.LIZ;
    }
}
