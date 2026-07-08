package X;

import com.ss.android.ugc.aweme.dc.core.ListIndexSnapshot;
import com.ss.android.ugc.aweme.dc.core.PORef;

/* JADX INFO: renamed from: X.0Nxh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.dc.core.LayeredDiskCache", f = "LayeredDiskCache.kt", l = {107, 114, 129, 136, 143, 155, 170, 209, 217, 224}, m = "fullRead")
public final class C610910Nxh<VO> extends AbstractC23140094w {
    public long LL;
    public long LLILLJJLI;
    public long LLILLL;
    public ListIndexSnapshot LLILZ;
    public Object LLILZIL;
    public C238400w2 LLILZLL;
    public C118300cf LLIZ;
    public C118300cf LLIZLLLIL;
    public C013C LLJ;
    public Object LLJI;
    public Object LLJIJIL;
    public Object LLJILJIL;
    public Object LLJILJILJ;
    public Object LLJILLL;
    public Object LLJJ;
    public PORef LLJJI;
    public Object LLJJIII;
    public Object LLJJIJI;
    public /* synthetic */ Object LLJJIJIIJIL;
    public final /* synthetic */ C610900Nxg LLJJIJIL;
    public int LLJJJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C610910Nxh(C610900Nxg c610900Nxg, InterfaceC1364105Vn<? super C610910Nxh> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLJJIJIL = c610900Nxg;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LayeredDiskCache@f330.fullRead$1");
        this.LLJJIJIIJIL = obj;
        this.LLJJJ |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLJJIJIL.LIZIZ(this);
        C1C7U.LIZIZ("LayeredDiskCache@f330.fullRead$1");
        return objLIZIZ;
    }
}
