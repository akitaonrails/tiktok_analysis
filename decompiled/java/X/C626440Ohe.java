package X;

import com.ss.android.ugc.aweme.topic.review.model.TopicReview;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Ohe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C626440Ohe extends C09AY implements Function1<C626430Ohd, C626430Ohd> {
    public final /* synthetic */ float LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C626440Ohe(float f, long j, long j2, boolean z) {
        super(1);
        this.LL = f;
        this.LLILLJJLI = j;
        this.LLILLL = j2;
        this.LLILZ = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C626430Ohd invoke(C626430Ohd c626430Ohd) {
        C291001Au<TopicReview> c291001Au;
        C626430Ohd c626430Ohd2 = c626430Ohd;
        float f = this.LL;
        long j = this.LLILLJJLI;
        long j2 = this.LLILLL;
        boolean z = this.LLILZ;
        if (z) {
            c291001Au = c626430Ohd2.LLILZLL;
        } else {
            c291001Au = new C291001Au<>(null);
        }
        return C626430Ohd.LIZ(c626430Ohd2, f, j, j2, false, z, c291001Au, 8);
    }
}
