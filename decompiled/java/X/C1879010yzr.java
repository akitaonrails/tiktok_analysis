package X;

import java.util.ArrayList;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0yzr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1879010yzr extends C09AY implements Function0<String> {
    public final /* synthetic */ EnumC1910950zpN LL;
    public final /* synthetic */ EnumC1879020yzs LLILLJJLI;
    public final /* synthetic */ Pair<String, Function0<Object>>[] LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1879010yzr(EnumC1879020yzs enumC1879020yzs, EnumC1910950zpN enumC1910950zpN, Pair[] pairArr) {
        super(0);
        this.LL = enumC1910950zpN;
        this.LLILLJJLI = enumC1879020yzs;
        this.LLILLL = pairArr;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        String describe = this.LL.getDescribe();
        if (this.LLILLJJLI != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(describe);
            sbLIZ.append(",by,");
            sbLIZ.append(this.LLILLJJLI.getDescribe());
            describe = C2188811AlT.LIZIZ(sbLIZ);
        }
        Pair<String, Function0<Object>>[] pairArr = this.LLILLL;
        if (pairArr != null) {
            for (Pair pair : (ArrayList) C13LQ.LJIJI(pairArr)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(describe);
                sbLIZ2.append(',');
                sbLIZ2.append((String) pair.getFirst());
                sbLIZ2.append(':');
                Function0 function0 = (Function0) pair.getSecond();
                sbLIZ2.append(function0 != null ? function0.invoke() : null);
                describe = C2188811AlT.LIZIZ(sbLIZ2);
            }
        }
        return describe;
    }
}
