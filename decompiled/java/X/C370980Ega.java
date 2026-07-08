package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.0Ega, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.ugc.android.editor.track.frame.VideoFrameCache", f = "VideoFrameCache.kt", l = {180}, m = "doRefresh")
public final class C370980Ega extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C370920EgU LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C370980Ega(C370920EgU c370920EgU, InterfaceC1364105Vn<? super C370980Ega> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c370920EgU;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VideoFrameCache@ba6a.doRefresh$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Unit unitLIZJ = this.LLILLJJLI.LIZJ(false, this);
        C1C7U.LIZIZ("VideoFrameCache@ba6a.doRefresh$1");
        return unitLIZJ;
    }
}
