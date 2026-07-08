package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0hlr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1216850hlr extends C09AY implements Function1<C127K, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ Function1<Boolean, Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1216850hlr(String str, String str2, Context context, boolean z, Function1<? super Boolean, Unit> function1) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = context;
        this.LLILZ = z;
        this.LLILZIL = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C127K c127k) {
        C127K c127k2 = c127k;
        c127k2.setTitle(this.LL);
        c127k2.setSubtitle(this.LLILLJJLI);
        C127A c127a = new C127A(this.LLILLL);
        boolean z = this.LLILZ;
        Function1<Boolean, Unit> function1 = this.LLILZIL;
        c127a.LJIILJJIL(z);
        c127a.LJIILLIIL(new C511901z3(function1, 8));
        c127k2.setAccessory(c127a);
        c127k2.setInset(EnumC1216650hlX.PADDING_32);
        return Unit.LIZ;
    }
}
