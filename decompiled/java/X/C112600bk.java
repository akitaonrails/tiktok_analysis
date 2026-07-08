package X;

import com.bytedance.android.live.liveinteract.multilive.model.ApplyGuideResponse;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.00bk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C112600bk extends C09AY implements Function1<C927940aFs, C927940aFs> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ C470590Icr<ApplyGuideResponse.ResponseData> LLILLJJLI;
    public final /* synthetic */ ApplyGuideResponse.ResponseData LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C112600bk(String str, C470590Icr<ApplyGuideResponse.ResponseData> c470590Icr, ApplyGuideResponse.ResponseData responseData) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = c470590Icr;
        this.LLILLL = responseData;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C927940aFs invoke(C927940aFs c927940aFs) {
        return new C927940aFs(this.LLILLL.applyUser, this.LL, this.LLILLJJLI.LIZIZ);
    }
}
