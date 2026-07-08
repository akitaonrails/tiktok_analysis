package X;

import com.ss.android.ugc.aweme.creative.model.CreativeInfo;

/* JADX INFO: renamed from: X.064D, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.external.composer.InstantCloneParser", f = "InstantCloneParser.kt", l = {64, 77}, m = "parse")
public final class C064D extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public C259800zU LLILLL;
    public C259800zU LLILZ;
    public Object LLILZIL;
    public CreativeInfo LLILZLL;
    public /* synthetic */ Object LLIZ;
    public final /* synthetic */ C0MOS LLIZLLLIL;
    public int LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C064D(C0MOS c0mos, InterfaceC1364105Vn<? super C064D> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZLLLIL = c0mos;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InstantCloneParser@3cac.parse$1");
        this.LLIZ = obj;
        this.LLJ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLIZLLLIL.LIZ(null, null, this);
        C1C7U.LIZIZ("InstantCloneParser@3cac.parse$1");
        return objLIZ;
    }
}
