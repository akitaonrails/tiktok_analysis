package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1BVE, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BVE extends C09AY implements Function1<C1397510mTF, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C1BVI LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1BVE(int i, C1BVI c1bvi, String str, String str2) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = c1bvi;
        this.LLILZ = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1397510mTF c1397510mTF) {
        C1BVD c1bvd = C1BVD.LIZ;
        String str = this.LL;
        c1bvd.getClass();
        if (!C1BVD.LIZ(str)) {
            C1BVD.LIZIZ(this.LLILLJJLI, this.LLILLL, this.LLILZ, "dismiss", CardStruct.IStatusCode.DEFAULT);
        }
        return Unit.LIZ;
    }
}
