package X;

import com.ss.android.ugc.aweme.api.pipeline.TemplateConsumeCoreParam;

/* JADX INFO: renamed from: X.0Ksv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipeline.node.MusicDownloadNodeKt", f = "MusicDownloadNode.kt", l = {63, 65}, m = "downloadMusic")
public final class C531510Ksv extends AbstractC23140094w {
    public C531490Kst LL;
    public Object LLILLJJLI;
    public TemplateConsumeCoreParam LLILLL;
    public boolean LLILZ;
    public long LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public int LLIZ;

    public C531510Ksv(InterfaceC1364105Vn<? super C531510Ksv> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MusicDownloadNodeKt@de15.downloadMusic$1");
        this.LLILZLL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objLIZ = C531500Ksu.LIZ(null, null, null, false, this);
        if (objLIZ == C099R.LJFF()) {
            C1C7U.LIZIZ("MusicDownloadNodeKt@de15.downloadMusic$1");
            return objLIZ;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLIZ);
        C1C7U.LIZIZ("MusicDownloadNodeKt@de15.downloadMusic$1");
        return c189200o6M1boximpl;
    }
}
