package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.AwS77S0210000_26;

/* JADX INFO: renamed from: X.0uks, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1715960uks extends C09AY implements Function1<C1397630mTR, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ Context LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ C19EG LLILZLL;
    public final /* synthetic */ C1715940ukq<Unit> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1715960uks(String str, boolean z, boolean z2, Context context, boolean z3, C19EG c19eg, C1715940ukq<Unit> c1715940ukq) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
        this.LLILZ = context;
        this.LLILZIL = z3;
        this.LLILZLL = c19eg;
        this.LLIZ = c1715940ukq;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1397630mTR c1397630mTR) {
        C1397630mTR c1397630mTR2 = c1397630mTR;
        c1397630mTR2.LIZJ(0, this.LL, new AwS77S0210000_26(this.LLILZIL, (boolean) this.LLILZLL, (C19EG) this.LLIZ, (C1715940ukq<Unit>) 6));
        if (this.LLILLJJLI && !this.LLILLL) {
            c1397630mTR2.LIZJ(1, this.LLILZ.getString(2131840135), new AwS605S0100000_26(this.LLIZ, (C1715940ukq<Unit>) 765));
        }
        return Unit.LIZ;
    }
}
