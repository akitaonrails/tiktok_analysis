package X;

import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.15lB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20612315lB extends C09AY implements Function1<C20612215lA, C20612215lA> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ Set<String> LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20612315lB(String str, Set<String> set, boolean z) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = set;
        this.LLILLL = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C20612215lA invoke(C20612215lA c20612215lA) {
        return C20612215lA.LIZ(c20612215lA, false, null, new C291001Au(new C330490CxT(this.LL, this.LLILLJJLI, this.LLILLL)), 0, null, false, 59);
    }
}
