package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0kcT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1326350kcT extends C09AY implements Function1<C957403oi, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ long LLILZLL;
    public final /* synthetic */ boolean LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1326350kcT(String str, String str2, boolean z, boolean z2, long j, long j2, boolean z3) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = z;
        this.LLILZ = z2;
        this.LLILZIL = j;
        this.LLILZLL = j2;
        this.LLIZ = z3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C957403oi c957403oi) {
        C957403oi c957403oi2 = c957403oi;
        String str = this.LL;
        if (str != null) {
            c957403oi2.LIZLLL("ec_biz_scene", str);
        }
        c957403oi2.LIZLLL("image_url", this.LLILLJJLI);
        c957403oi2.LIZLLL("is_asynchronous", Integer.valueOf(this.LLILLL ? 1 : 0));
        c957403oi2.LIZLLL("is_success", Integer.valueOf(this.LLILZ ? 1 : 0));
        c957403oi2.LIZLLL("start_to_obtain", Long.valueOf(this.LLILZIL));
        c957403oi2.LIZLLL("obtain_to_finish", Long.valueOf(this.LLILZLL));
        c957403oi2.LIZLLL("is_base64", Integer.valueOf(this.LLIZ ? 1 : 0));
        return Unit.LIZ;
    }
}
