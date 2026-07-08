package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0kVv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1322290kVv extends C09AY implements Function1<C957403oi, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ C1318160kPG LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1322290kVv(boolean z, String str, String str2, String str3, C1318160kPG c1318160kPG) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = c1318160kPG;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C957403oi c957403oi) {
        C957403oi c957403oi2 = c957403oi;
        c957403oi2.LIZLLL("success", Integer.valueOf(this.LL ? 1 : 0));
        c957403oi2.LIZLLL("image_url", this.LLILLJJLI);
        String str = this.LLILLL;
        if (str != null) {
            c957403oi2.LIZLLL("page_name", str);
        }
        c957403oi2.LIZLLL("blurhash", this.LLILZ);
        c957403oi2.LIZLLL("width", Integer.valueOf(this.LLILZIL.LIZ));
        c957403oi2.LIZLLL("height", Integer.valueOf(this.LLILZIL.LIZIZ));
        return Unit.LIZ;
    }
}
