package X;

import java.util.HashSet;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Ns9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C607470Ns9 extends C09AY implements Function0<String> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ HashSet<String> LLILLJJLI;
    public final /* synthetic */ HashSet<Long> LLILLL;
    public final /* synthetic */ C118300cf LLILZ;
    public final /* synthetic */ C118300cf LLILZIL;
    public final /* synthetic */ List<String> LLILZLL;
    public final /* synthetic */ C118300cf LLIZ;
    public final /* synthetic */ C118300cf LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C607470Ns9(String str, HashSet<String> hashSet, HashSet<Long> hashSet2, C118300cf c118300cf, C118300cf c118300cf2, List<String> list, C118300cf c118300cf3, C118300cf c118300cf4) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = hashSet;
        this.LLILLL = hashSet2;
        this.LLILZ = c118300cf;
        this.LLILZIL = c118300cf2;
        this.LLILZLL = list;
        this.LLIZ = c118300cf3;
        this.LLIZLLLIL = c118300cf4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("diff stream tabId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(" baseIdKeys=");
        sbLIZ.append(this.LLILLJJLI.size());
        sbLIZ.append(" baseFallback=");
        sbLIZ.append(this.LLILLL.size());
        sbLIZ.append(" fullIdKeys=");
        sbLIZ.append(this.LLILZ.element);
        sbLIZ.append(" fullFallback=");
        sbLIZ.append(this.LLILZIL.element);
        sbLIZ.append(" delta=");
        sbLIZ.append(this.LLILZLL.size());
        sbLIZ.append(" deltaIdKeys=");
        sbLIZ.append(this.LLIZ.element);
        sbLIZ.append(" deltaFallback=");
        sbLIZ.append(this.LLIZLLLIL.element);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
