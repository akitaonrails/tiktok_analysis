package X;

import com.ss.android.ugc.aweme.IMGroupChatApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0i98, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1231280i98 extends C09AY implements Function1<IMGroupChatApi, Unit> {
    public final /* synthetic */ C19EG LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1231280i98(C19EG c19eg, String str, String str2, String str3) {
        super(1);
        this.LL = c19eg;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(IMGroupChatApi iMGroupChatApi) {
        iMGroupChatApi.LIZLLL(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ);
        return Unit.LIZ;
    }
}
