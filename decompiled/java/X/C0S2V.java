package X;

import com.ss.android.ugc.aweme.feed.assem.sharer.VideoExposeSharerInformationVM;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS26S0010000_11;

/* JADX INFO: renamed from: X.0S2V, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0S2V extends C09AY implements Function1<C0S2L, C0S2L> {
    public final /* synthetic */ VideoExposeSharerInformationVM LL;
    public final /* synthetic */ C118300cf LLILLJJLI;
    public final /* synthetic */ C118300cf LLILLL;
    public final /* synthetic */ C013C LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ C013C LLILZLL;
    public final /* synthetic */ boolean LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0S2V(VideoExposeSharerInformationVM videoExposeSharerInformationVM, C118300cf c118300cf, C118300cf c118300cf2, C013C c013c, String str, C013C c013c2, boolean z) {
        super(1);
        this.LL = videoExposeSharerInformationVM;
        this.LLILLJJLI = c118300cf;
        this.LLILLL = c118300cf2;
        this.LLILZ = c013c;
        this.LLILZIL = str;
        this.LLILZLL = c013c2;
        this.LLIZ = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C0S2L invoke(C0S2L c0s2l) {
        boolean zDQ2 = this.LL.DQ2();
        C0S2L c0s2lLIZ = C0S2L.LIZ(c0s2l, null, null, null, null, null, this.LLILZIL, this.LLILLJJLI.element, this.LLILLL.element, false, zDQ2, this.LLILZ.element, null, 2335);
        C013C c013c = this.LLILZLL;
        VideoExposeSharerInformationVM videoExposeSharerInformationVM = this.LL;
        boolean z = this.LLIZ;
        if (c013c.element) {
            videoExposeSharerInformationVM.getClass();
            videoExposeSharerInformationVM.setState(new AwS26S0010000_11(z, 18));
        }
        return c0s2lLIZ;
    }
}
