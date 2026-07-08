package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.05sL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1489505sL extends C09AY implements Function1<C957403oi, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1489505sL(long j, String str, boolean z, String str2, String str3) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = j;
        this.LLILZ = z;
        this.LLILZIL = str3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C957403oi c957403oi) {
        C957403oi c957403oi2 = c957403oi;
        c957403oi2.LIZLLL("ec_biz_scene", this.LL);
        c957403oi2.LIZLLL("bitmap_cache_key", this.LLILLJJLI);
        c957403oi2.LIZLLL("duration", Long.valueOf(this.LLILLL));
        c957403oi2.LIZLLL("is_success", Integer.valueOf(this.LLILZ ? 1 : 0));
        String str = this.LLILZIL;
        if (str == null) {
            str = "";
        }
        c957403oi2.LIZLLL("error_msg", str);
        return Unit.LIZ;
    }
}
