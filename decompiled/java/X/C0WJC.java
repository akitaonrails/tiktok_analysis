package X;

import java.io.IOException;

/* JADX INFO: renamed from: X.0WJC, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.migratedraft.provider.pack.FileUtils", f = "FileUtils.kt", l = {108}, m = "writeAIGCDBDataToFile")
public final class C0WJC extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0WJA LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0WJC(C0WJA c0wja, InterfaceC1364105Vn<? super C0WJC> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c0wja;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws IOException {
        C1C7U.LIZ("FileUtils@6ab4.writeAIGCDBDataToFile$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJIIIIZZ = this.LLILLL.LJIIIIZZ(null, null, this);
        C1C7U.LIZIZ("FileUtils@6ab4.writeAIGCDBDataToFile$1");
        return objLJIIIIZZ;
    }
}
