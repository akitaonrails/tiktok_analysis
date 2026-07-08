package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.05sI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1489205sI extends C09AY implements Function1<C957403oi, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1489205sI(String str, String str2, String str3) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C957403oi c957403oi) {
        C957403oi c957403oi2 = c957403oi;
        String str = this.LL;
        if (str != null) {
            c957403oi2.LIZLLL("path", str);
        }
        c957403oi2.LIZLLL("url", this.LLILLJJLI);
        String str2 = this.LLILLL;
        if (str2 != null) {
            c957403oi2.LIZLLL("ec_biz_scene", str2);
        }
        return Unit.LIZ;
    }
}
