package X;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0i6k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1229800i6k extends C09AY implements Function1<C1229630i6T, C1229630i6T> {
    public final /* synthetic */ C1229630i6T LL;
    public final /* synthetic */ List<InterfaceC1891350zJl> LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ List<C1229760i6g> LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ Boolean LLIZLLLIL;
    public final /* synthetic */ boolean LLJ;
    public final /* synthetic */ boolean LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1229800i6k(C1229630i6T c1229630i6T, List<? extends InterfaceC1891350zJl> list, boolean z, String str, List<C1229760i6g> list2, boolean z2, boolean z3, Boolean bool, boolean z4, boolean z5) {
        super(1);
        this.LL = c1229630i6T;
        this.LLILLJJLI = list;
        this.LLILLL = z;
        this.LLILZ = str;
        this.LLILZIL = list2;
        this.LLILZLL = z2;
        this.LLIZ = z3;
        this.LLIZLLLIL = bool;
        this.LLJ = z4;
        this.LLJI = z5;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1229630i6T invoke(C1229630i6T c1229630i6T) {
        boolean zBooleanValue;
        C1229630i6T c1229630i6T2 = c1229630i6T;
        C1229580i6O c1229580i6O = this.LL.LL;
        List<InterfaceC1891350zJl> list = this.LLILLJJLI;
        boolean z = this.LLILLL;
        String str = this.LLILZ;
        c1229580i6O.getClass();
        C1229580i6O c1229580i6O2 = new C1229580i6O(list, z, str);
        C1229840i6o c1229840i6o = this.LL.LLILLJJLI;
        List<C1229760i6g> list2 = this.LLILZIL;
        boolean z2 = this.LLILZLL;
        boolean z3 = this.LLIZ;
        c1229840i6o.getClass();
        C1229840i6o c1229840i6o2 = new C1229840i6o(list2, z2, z3);
        Boolean bool = this.LLIZLLLIL;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = c1229630i6T2.LLILLL;
        }
        return C1229630i6T.LIZ(c1229630i6T2, c1229580i6O2, c1229840i6o2, zBooleanValue, null, this.LLJ, this.LLJI, null, 72);
    }
}
