package X;

import com.ss.android.ugc.aweme.live.smoothhost.OpenLivePreparationTask;

/* JADX INFO: renamed from: X.01oS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.smoothhost.OpenLivePreparationTask", f = "OpenLivePreparationTask.kt", l = {152, 155}, m = "queryPodcast")
public final class C446201oS extends AbstractC23140094w {
    public InterfaceC383701eN LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ OpenLivePreparationTask LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C446201oS(OpenLivePreparationTask openLivePreparationTask, InterfaceC1364105Vn<? super C446201oS> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = openLivePreparationTask;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("OpenLivePreparationTask@f498.queryPodcast$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILLL.LIZJ(this);
        C1C7U.LIZIZ("OpenLivePreparationTask@f498.queryPodcast$1");
        return objLIZJ;
    }
}
