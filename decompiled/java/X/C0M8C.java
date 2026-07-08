package X;

import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0M8C, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M8C extends C09AY implements Function0<C0M8D> {
    public C0M8C() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0M8D] */
    @Override // kotlin.jvm.functions.Function0
    public final C0M8D invoke() {
        return new C0M6G() { // from class: X.0M8D
            @Override // X.C0M6G
            public final Pair LIZ(String str, CreativeInfo creativeInfo, CreativeInfo creativeInfo2) {
                return C0MYE.LIZ(str, creativeInfo, creativeInfo2, new C0M8K() { // from class: X.08p5
                    @Override // X.C0M8K
                    public final String LIZ(String str2, CreativeInfo creativeInfo3, CreativeInfo creativeInfo4) {
                        String strLIZIZ = C0CHQ.LIZ().LJJIIJZLJL().getPathService().LIZIZ(creativeInfo3);
                        String strLIZIZ2 = C0CHQ.LIZ().LJJIIJZLJL().getPathService().LIZIZ(creativeInfo4);
                        if (u.LJJIIJZLJL(str2, strLIZIZ, false)) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(strLIZIZ2);
                            sbLIZ.append(a0.LJJJJZ(strLIZIZ, str2));
                            return C2188811AlT.LIZIZ(sbLIZ);
                        }
                        return str2;
                    }
                });
            }
        };
    }
}
