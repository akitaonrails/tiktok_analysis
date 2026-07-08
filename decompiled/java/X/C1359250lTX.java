package X;

import com.ss.android.ugc.aweme.feed.model.upvote.CarrierType;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0lTX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1359250lTX extends C09AY implements Function1<C1358700lSe, C1358700lSe> {
    public final /* synthetic */ int LL = 3;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ CarrierType LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ UpvoteStruct LLILZIL;
    public final /* synthetic */ UpvoteStruct LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1359250lTX(String str, CarrierType carrierType, boolean z, UpvoteStruct upvoteStruct, UpvoteStruct upvoteStruct2) {
        super(1);
        this.LLILLJJLI = str;
        this.LLILLL = carrierType;
        this.LLILZ = z;
        this.LLILZIL = upvoteStruct;
        this.LLILZLL = upvoteStruct2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1358700lSe invoke(C1358700lSe c1358700lSe) {
        C1358700lSe c1358700lSe2 = c1358700lSe;
        int i = this.LL;
        String str = this.LLILLJJLI;
        C291001Au c291001Au = new C291001Au(new C735200Ssg(i, str, this.LLILLL, this.LLILZ));
        UpvoteStruct upvoteStructLIZJ = this.LLILZIL;
        if (upvoteStructLIZJ == null) {
            C1358880lSw.LIZ.getClass();
            upvoteStructLIZJ = C1358940lT2.LIZJ(C1358880lSw.LJFF(str));
        }
        return C1358700lSe.LIZ(c1358700lSe2, null, c291001Au, upvoteStructLIZJ, this.LLILZLL, null, 35);
    }
}
