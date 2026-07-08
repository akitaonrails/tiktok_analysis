package X;

import com.ss.android.ugc.aweme.hometab.base.tabicon.dto.TabDynamicIconInfo;

/* JADX INFO: renamed from: X.0NLK, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.hometab.base.tabicon.iconfile.IconFileManager", f = "IconFileManager.kt", l = {105}, m = "downloadIcon")
public final class C0NLK extends AbstractC23140094w {
    public TabDynamicIconInfo LL;
    public long LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C0NLJ LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NLK(C0NLJ c0nlj, InterfaceC1364105Vn<? super C0NLK> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c0nlj;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IconFileManager@af01.downloadIcon$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILZ.LIZJ(null, false, this);
        C1C7U.LIZIZ("IconFileManager@af01.downloadIcon$1");
        return objLIZJ;
    }
}
