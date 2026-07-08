package X;

import android.content.Context;
import com.ss.android.ugc.aweme.account.model.BaseLoginMethod;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0iNE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1240020iNE extends C09AY implements Function1<C1397620mTQ, Unit> {
    public final /* synthetic */ int LL = 2131838745;
    public final /* synthetic */ int LLILLJJLI = 2131838746;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ C1239960iN8 LLILZ;
    public final /* synthetic */ BaseLoginMethod LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ Context LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1240020iNE(int i, C1239960iN8 c1239960iN8, BaseLoginMethod baseLoginMethod, String str, boolean z, Context context) {
        super(1);
        this.LLILLL = i;
        this.LLILZ = c1239960iN8;
        this.LLILZIL = baseLoginMethod;
        this.LLILZLL = str;
        this.LLIZ = z;
        this.LLIZLLLIL = context;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1397620mTQ c1397620mTQ) {
        C1397620mTQ c1397620mTQ2 = c1397620mTQ;
        c1397620mTQ2.LJ(this.LL, new C1240030iNF(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL));
        c1397620mTQ2.LJII(this.LLILLJJLI, new C1240040iNG(this.LLILZ, this.LLILZLL, this.LLIZ));
        return Unit.LIZ;
    }
}
