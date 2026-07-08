package X;

import com.ss.android.ugc.aweme.feed.model.upvote.CarrierType;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0lTW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1359240lTW extends C09AY implements Function1<C1358700lSe, C1358700lSe> {
    public final /* synthetic */ Throwable LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ CarrierType LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1359240lTW(Throwable th, String str, CarrierType carrierType, boolean z) {
        super(1);
        this.LL = th;
        this.LLILLJJLI = str;
        this.LLILLL = carrierType;
        this.LLILZ = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1358700lSe invoke(C1358700lSe c1358700lSe) {
        C491001vg c491001vg = new C491001vg(this.LL);
        String str = this.LLILLJJLI;
        C291001Au c291001Au = new C291001Au(new C735200Ssg(2, str, this.LLILLL, this.LLILZ));
        C1358880lSw.LIZ.getClass();
        return C1358700lSe.LIZ(c1358700lSe, c491001vg, c291001Au, C1358940lT2.LIZJ(C1358880lSw.LJFF(str)), null, null, 34);
    }
}
