package X;

import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ieC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1250540ieC extends C09AY implements Function1<C1250500ie8, C1250500ie8> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ AbstractC1623806Xk<Integer> LLILLJJLI;
    public final /* synthetic */ User LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1250540ieC(int i, AbstractC1623806Xk<Integer> abstractC1623806Xk, User user, boolean z, boolean z2) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = abstractC1623806Xk;
        this.LLILLL = user;
        this.LLILZ = z;
        this.LLILZIL = z2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1250500ie8 invoke(C1250500ie8 c1250500ie8) {
        return C1250500ie8.LIZ(c1250500ie8, false, this.LL, 0, false, this.LLILLJJLI, null, null, this.LLILLL, this.LLILZ, this.LLILZIL, 104);
    }
}
