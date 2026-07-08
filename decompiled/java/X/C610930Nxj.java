package X;

import com.ss.android.ugc.aweme.dc.core.ListIndexSnapshot;

/* JADX INFO: renamed from: X.0Nxj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.dc.core.LayeredDiskCache", f = "LayeredDiskCache.kt", l = {244, 251, 261, 268, 276}, m = "openPagedRead")
public final class C610930Nxj<VO> extends AbstractC23140094w {
    public long LL;
    public long LLILLJJLI;
    public ListIndexSnapshot LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C610900Nxg LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C610930Nxj(C610900Nxg c610900Nxg, InterfaceC1364105Vn<? super C610930Nxj> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c610900Nxg;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LayeredDiskCache@f330.openPagedRead$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILZIL.LIZ(this);
        C1C7U.LIZIZ("LayeredDiskCache@f330.openPagedRead$1");
        return objLIZ;
    }
}
