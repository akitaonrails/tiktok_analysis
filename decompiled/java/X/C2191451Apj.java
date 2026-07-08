package X;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1Apj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2191451Apj extends C09AY implements Function0<String> {
    public final /* synthetic */ C675200Qe6<Object> LL;
    public final /* synthetic */ C2191441Api LLILLJJLI;
    public final /* synthetic */ boolean LLILLL = true;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2191451Apj(C675200Qe6 c675200Qe6, C2191441Api c2191441Api) {
        super(0);
        this.LL = c675200Qe6;
        this.LLILLJJLI = c2191441Api;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TAKE_HIT path=concurrent domain=");
        sbLIZ.append(this.LL.LIZ);
        sbLIZ.append(" mode=");
        sbLIZ.append(this.LLILLJJLI.LJFF);
        sbLIZ.append(" keyType=");
        C2191431Aph c2191431Aph = C2191431Aph.LIZ;
        List<String> list = this.LLILLJJLI.LIZIZ;
        c2191431Aph.getClass();
        sbLIZ.append(C2191431Aph.LJ(list));
        sbLIZ.append(" key=");
        sbLIZ.append(this.LLILLJJLI.LIZ);
        sbLIZ.append(" useOnlyOnce=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(" deferred=");
        sbLIZ.append(System.identityHashCode(this.LLILLJJLI.LIZJ));
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
