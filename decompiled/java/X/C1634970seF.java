package X;

import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0seF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1634970seF extends C09AY implements Function1<C1634990seH, Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ float LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1634970seF(int i, String str, int i2, boolean z, String str2, float f, int i3, int i4) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = str;
        this.LLILLL = i2;
        this.LLILZ = z;
        this.LLILZIL = str2;
        this.LLILZLL = f;
        this.LLIZ = i3;
        this.LLIZLLLIL = i4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1634990seH c1634990seH) {
        C1634990seH c1634990seH2 = c1634990seH;
        c1634990seH2.LIZ(this.LL, "use_cache");
        c1634990seH2.LIZIZ("first_category_id", this.LLILLJJLI);
        c1634990seH2.LIZ(this.LLILLL, "first_category_interactive_count");
        ((C543670LTx) c1634990seH2.LIZ.getValue()).LIZ(Boolean.valueOf(this.LLILZ), "first_category_interactive_info_mixed");
        c1634990seH2.LIZIZ("first_category_interactive_info_mixed_ids", this.LLILZIL);
        float f = this.LLILZLL;
        C543670LTx c543670LTx = (C543670LTx) c1634990seH2.LIZ.getValue();
        c543670LTx.LIZ.put("duration", Float.valueOf(f));
        c1634990seH2.LIZ(this.LLIZ, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c1634990seH2.LIZ(this.LLIZLLLIL, "error_code");
        return Unit.LIZ;
    }
}
