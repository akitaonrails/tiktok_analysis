package X;

import com.ss.android.ugc.aweme.tako.botpage.actionbar.model.TakoActiveBotItem;
import defpackage.w2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS42S0010000_30;
import kotlin.jvm.internal.AwS609S0100000_30;

/* JADX INFO: renamed from: X.14Il, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20242514Il extends C09AY implements Function1<C1863340yaa, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ TakoActiveBotItem LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ w2 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20242514Il(boolean z, TakoActiveBotItem takoActiveBotItem, boolean z2, w2 w2Var) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = takoActiveBotItem;
        this.LLILLL = z2;
        this.LLILZ = w2Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1863340yaa c1863340yaa) {
        int i;
        C1863340yaa c1863340yaa2 = c1863340yaa;
        c1863340yaa2.LIZ(new AwS609S0100000_30(this.LLILLJJLI, 161));
        new AwS42S0010000_30(this.LLILLL, 2).invoke(c1863340yaa2.LIZIZ);
        new AwS609S0100000_30(this.LLILZ, 162).invoke(c1863340yaa2.LIZLLL);
        new AwS609S0100000_30(this.LLILLJJLI, 163).invoke(c1863340yaa2.LJIIIZ);
        if (this.LL) {
            i = 5;
        } else {
            i = 7;
        }
        c1863340yaa2.LJII = i;
        return Unit.LIZ;
    }
}
