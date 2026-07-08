package X;

import com.ss.android.ugc.aweme.services.external.ui.ChangeBanMusicConfig;
import kotlin.jvm.internal.AwS1S2200100_8;

/* JADX INFO: renamed from: X.15iu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.external.ui.RecordServiceBaseImpl", f = "RecordServiceBaseImpl.kt", l = {926, 929, 985}, m = "startStripMusicPreview$suspendImpl")
public final class C20598215iu extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public ChangeBanMusicConfig LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public AwS1S2200100_8 LLILZLL;
    public AwS1S2200100_8 LLIZ;
    public Object LLIZLLLIL;
    public /* synthetic */ Object LLJ;
    public final /* synthetic */ AbstractC20598115it LLJI;
    public int LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20598215iu(AbstractC20598115it abstractC20598115it, InterfaceC1364105Vn<? super C20598215iu> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLJI = abstractC20598115it;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("RecordServiceBaseImpl@d40c.startStripMusicPreview$1");
        this.LLJ = obj;
        this.LLJIJIL |= Integer.MIN_VALUE;
        Object objLJ = AbstractC20598115it.LJ(this.LLJI, null, null, 0L, null, null, null, null, this);
        C1C7U.LIZIZ("RecordServiceBaseImpl@d40c.startStripMusicPreview$1");
        return objLJ;
    }
}
