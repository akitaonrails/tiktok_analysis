package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.03WF, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03WF extends C09AY implements Function1<C957403oi, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03WF(String str, String str2, String str3) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C957403oi c957403oi) {
        C957403oi c957403oi2 = c957403oi;
        String str = this.LL;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        c957403oi2.LIZJ("payment_reference", str);
        String str3 = this.LLILLJJLI;
        if (str3 == null) {
            str3 = "";
        }
        c957403oi2.LIZJ("page_name", str3);
        String str4 = this.LLILLL;
        if (str4 != null) {
            str2 = str4;
        }
        c957403oi2.LIZJ("error_code", str2);
        return Unit.LIZ;
    }
}
