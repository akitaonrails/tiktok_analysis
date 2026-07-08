package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS43S1300000_1;
import kotlin.jvm.internal.AwS580S0100000_1;

/* JADX INFO: renamed from: X.03h2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C909803h2 extends C09AY implements Function1<C1397620mTQ, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;
    public final /* synthetic */ C013C LLILZ;
    public final /* synthetic */ C912503hT LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ C897703f5 LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C909803h2(boolean z, Context context, Function0<Unit> function0, C013C c013c, C912503hT c912503hT, String str, C897703f5 c897703f5) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = context;
        this.LLILLL = function0;
        this.LLILZ = c013c;
        this.LLILZIL = c912503hT;
        this.LLILZLL = str;
        this.LLIZ = c897703f5;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1397620mTQ c1397620mTQ) {
        C1397620mTQ c1397620mTQ2 = c1397620mTQ;
        c1397620mTQ2.LJFF = true;
        if (this.LL) {
            c1397620mTQ2.LJFF(2131832764, new AwS580S0100000_1(this.LLILLL, (Function0<Unit>) 207));
        } else {
            c1397620mTQ2.LIZJ(0, this.LLILLJJLI.getString(2131832784), new AwS43S1300000_1(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, 3));
        }
        if (this.LL) {
            c1397620mTQ2.LIZJ(1, this.LLILLJJLI.getString(2131840328), new AwS43S1300000_1(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, 1));
        } else {
            c1397620mTQ2.LIZJ(1, this.LLILLJJLI.getString(2131844876), AFwS228S0000000_1.get$arr$(177));
        }
        return Unit.LIZ;
    }
}
