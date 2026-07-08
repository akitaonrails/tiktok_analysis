package X;

import android.content.Context;
import com.ss.android.ugc.aweme.commerce.tools.tcm.CommerceToolsTcmModel;
import com.ss.android.ugc.aweme.commerce.tools.tcm.model.BrandedContentSwitchStatus;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS82S0210000_31;

/* JADX INFO: renamed from: X.15Mz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20509115Mz extends C09AY implements Function1<C1397620mTQ, Unit> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ CommerceToolsTcmModel LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ BrandedContentSwitchStatus LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20509115Mz(Context context, boolean z, CommerceToolsTcmModel commerceToolsTcmModel, boolean z2, int i, boolean z3, BrandedContentSwitchStatus brandedContentSwitchStatus) {
        super(1);
        this.LL = context;
        this.LLILLJJLI = z;
        this.LLILLL = commerceToolsTcmModel;
        this.LLILZ = z2;
        this.LLILZIL = i;
        this.LLILZLL = z3;
        this.LLIZ = brandedContentSwitchStatus;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1397620mTQ c1397620mTQ) {
        C1397620mTQ c1397620mTQ2 = c1397620mTQ;
        c1397620mTQ2.LJFF(2131849969, new C20509015My(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL));
        c1397620mTQ2.LJII(2131849962, new AwS82S0210000_31(this.LLILZLL, this.LLILLL, this.LLIZ, 0));
        c1397620mTQ2.LJFF = true;
        return Unit.LIZ;
    }
}
