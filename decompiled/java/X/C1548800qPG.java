package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0qPG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1548800qPG extends C09AY implements Function1<C957403oi, Unit> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1548800qPG(int i, int i2, long j, long j2, String str, boolean z, boolean z2) {
        super(1);
        this.LL = j;
        this.LLILLJJLI = j2;
        this.LLILLL = z;
        this.LLILZ = i;
        this.LLILZIL = z2;
        this.LLILZLL = str;
        this.LLIZ = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C957403oi c957403oi) {
        C957403oi c957403oi2 = c957403oi;
        c957403oi2.LIZJ("duration", Long.valueOf(this.LL - this.LLILLJJLI));
        c957403oi2.LIZJ("has_first_screen_data", Integer.valueOf(this.LLILLL ? 1 : 0));
        c957403oi2.LIZJ("is_preload", Integer.valueOf(this.LLILZ));
        c957403oi2.LIZJ("is_gecko_cache", Integer.valueOf(this.LLILZIL ? 1 : 0));
        String str = this.LLILZLL;
        if (str == null) {
            str = "not found";
        }
        c957403oi2.LIZJ("brick_schema", str);
        c957403oi2.LIZJ("brick_name", Integer.valueOf(this.LLIZ));
        return Unit.LIZ;
    }
}
