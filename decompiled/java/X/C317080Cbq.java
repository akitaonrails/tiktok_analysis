package X;

import com.ss.android.ugc.aweme.mention.viewmodel.VideoCaptionMentionSearchViewModel;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Cbq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C317080Cbq extends C09AY implements Function1<C325550CpV, C325550CpV> {
    public final /* synthetic */ VideoCaptionMentionSearchViewModel LL;
    public final /* synthetic */ List<C20611415l2> LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ float LLILZLL;
    public final /* synthetic */ float LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C317080Cbq(VideoCaptionMentionSearchViewModel videoCaptionMentionSearchViewModel, List<C20611415l2> list, boolean z, int i, boolean z2, float f, float f2) {
        super(1);
        this.LL = videoCaptionMentionSearchViewModel;
        this.LLILLJJLI = list;
        this.LLILLL = z;
        this.LLILZ = i;
        this.LLILZIL = z2;
        this.LLILZLL = f;
        this.LLIZ = f2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C325550CpV invoke(C325550CpV c325550CpV) {
        return C325550CpV.LIZ(c325550CpV, null, null, new C317090Cbr(this.LL.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ), 3);
    }
}
