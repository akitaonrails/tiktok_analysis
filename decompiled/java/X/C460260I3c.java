package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0I3c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C460260I3c extends C09AY implements Function2<C1360520lVa, Context, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C460260I3c(String str, String str2) {
        super(2);
        this.LL = str;
        this.LLILLJJLI = str2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(C1360520lVa c1360520lVa, Context context) {
        C1360520lVa c1360520lVa2 = c1360520lVa;
        Context context2 = context;
        Object[] objArr = new Object[1];
        String str = this.LL;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        objArr[0] = str;
        c1360520lVa2.LIZLLL(context2.getString(2131828587, objArr));
        c1360520lVa2.LIZIZ(" ");
        String str3 = this.LLILLJJLI;
        if (str3 != null) {
            str2 = str3;
        }
        c1360520lVa2.LIZLLL(str2);
        return Unit.LIZ;
    }
}
