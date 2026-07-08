package X;

import com.ss.android.ugc.aweme.model.TextExtraStruct;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0SJG, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SJG extends C09AY implements Function1<C0SJL<C719000SIg>, C0SJL<C719000SIg>> {
    public final /* synthetic */ Function1<C0SJL<C719000SIg>, Boolean> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0SJG(Function1<? super C0SJL<C719000SIg>, Boolean> function1) {
        super(1);
        this.LL = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C0SJL<C719000SIg> invoke(C0SJL<C719000SIg> c0sjl) {
        String hashTagName;
        TextExtraStruct textExtraStruct;
        C0SJL<C719000SIg> c0sjl2 = c0sjl;
        if (this.LL.invoke(c0sjl2).booleanValue()) {
            c0sjl2.LLIZLLLIL.clear();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('<');
            sbLIZ.append(c0sjl2.LIZLLL());
            sbLIZ.append("> removeSpans, ");
            C719000SIg c719000SIg = c0sjl2.LLIZ;
            if (c719000SIg != null && (textExtraStruct = c719000SIg.LIZ) != null) {
                hashTagName = textExtraStruct.getHashTagName();
            } else {
                hashTagName = null;
            }
            sbLIZ.append(hashTagName);
            C719300SJk.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        }
        return c0sjl2;
    }
}
