package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.09Un, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2380709Un extends C09AY implements Function1<C957403oi, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2380709Un(int i, String str, String str2, boolean z) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = z;
        this.LLILLL = i;
        this.LLILZ = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C957403oi c957403oi) {
        C957403oi c957403oi2 = c957403oi;
        c957403oi2.LIZLLL("path", this.LL);
        c957403oi2.LIZLLL("is_retry", Integer.valueOf(this.LLILLJJLI ? 1 : 0));
        c957403oi2.LIZLLL("code", Integer.valueOf(this.LLILLL));
        String str = this.LLILZ;
        if (str == null) {
            str = "";
        }
        c957403oi2.LIZLLL("message", str);
        return Unit.LIZ;
    }
}
