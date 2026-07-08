package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.18No, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21275018No extends C09AY implements Function1<C957403oi, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ Integer LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21275018No(String str, Integer num, String str2, boolean z, String str3) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = num;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = str3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C957403oi c957403oi) {
        C957403oi c957403oi2 = c957403oi;
        c957403oi2.LIZLLL("is_success", Integer.valueOf(this.LL ? 1 : 0));
        Integer num = this.LLILLJJLI;
        if (num != null) {
            c957403oi2.LIZLLL("err_code", Integer.valueOf(num.intValue()));
        }
        String str = this.LLILLL;
        if (str != null) {
            c957403oi2.LIZLLL("err_msg", str);
        }
        String str2 = this.LLILZ;
        if (str2 != null) {
            c957403oi2.LIZLLL("url", str2);
        }
        String str3 = this.LLILZIL;
        if (str3 != null) {
            c957403oi2.LIZLLL("schema", str3);
        }
        return Unit.LIZ;
    }
}
