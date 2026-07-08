package X;

/* JADX INFO: renamed from: X.0L0p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.livephoto.resource.LivePhotoResourceManager", f = "LivePhotoResourceManager.kt", l = {25}, m = "fetchLivePhotoEffect-IoAF18A")
public final class C536050L0p extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C536200L1e LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C536050L0p(C536200L1e c536200L1e, InterfaceC1364105Vn<? super C536050L0p> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c536200L1e;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LivePhotoResourceManager@9540.fetchLivePhotoEffect$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(this);
        if (objLIZ == C099R.LJFF()) {
            C1C7U.LIZIZ("LivePhotoResourceManager@9540.fetchLivePhotoEffect$1");
            return objLIZ;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLIZ);
        C1C7U.LIZIZ("LivePhotoResourceManager@9540.fetchLivePhotoEffect$1");
        return c189200o6M1boximpl;
    }
}
