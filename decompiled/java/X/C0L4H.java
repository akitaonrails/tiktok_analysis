package X;

import com.ss.android.ugc.aweme.creative.model.CreativeInfo;

/* JADX INFO: renamed from: X.0L4H, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.external.composer.StoryLinkShareParser", f = "StoryLinkShareParser.kt", l = {80}, m = "parse")
public final class C0L4H extends AbstractC23140094w {
    public Object LL;
    public CreativeInfo LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C0MOR LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0L4H(C0MOR c0mor, InterfaceC1364105Vn<? super C0L4H> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c0mor;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryLinkShareParser@1a2a.parse$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILZ.LIZ(null, this);
        C1C7U.LIZIZ("StoryLinkShareParser@1a2a.parse$1");
        return objLIZ;
    }
}
