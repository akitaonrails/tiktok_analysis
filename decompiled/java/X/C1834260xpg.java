package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xpg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1834260xpg extends C09AY implements Function1<C1834780xqW, C1834780xqW> {
    public final /* synthetic */ C1834580xqC LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Boolean LLILZIL;
    public final /* synthetic */ C259800zU<C1834580xqC> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1834260xpg(C1834580xqC c1834580xqC, int i, boolean z, String str, Boolean bool, C259800zU<C1834580xqC> c259800zU) {
        super(1);
        this.LL = c1834580xqC;
        this.LLILLJJLI = i;
        this.LLILLL = z;
        this.LLILZ = str;
        this.LLILZIL = bool;
        this.LLILZLL = c259800zU;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, X.0xqC, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public final C1834780xqW invoke(C1834780xqW c1834780xqW) {
        C1834780xqW c1834780xqW2 = c1834780xqW;
        C1834580xqC c1834580xqC = this.LL;
        int i = this.LLILLJJLI;
        boolean z = this.LLILLL;
        String str = this.LLILZ;
        if (str.length() == 0) {
            str = c1834580xqC.LLJJJJLIIL;
        }
        ?? LIZ = C1834580xqC.LIZ(c1834580xqC, i, z, str, false, null, -29360129, 63);
        Boolean bool = this.LLILZIL;
        C259800zU<C1834580xqC> c259800zU = this.LLILZLL;
        if (bool != null) {
            LIZ.LLJL = bool.booleanValue();
        }
        c259800zU.element = LIZ;
        return C1834780xqW.LIZ(c1834780xqW2, null, null, null, new C1623606Xi(LIZ), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524279);
    }
}
