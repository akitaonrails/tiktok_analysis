package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.09Ui, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2380209Ui extends C09AY implements Function1<C957403oi, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ long LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2380209Ui(int i, long j, String str, boolean z, boolean z2, boolean z3) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = i;
        this.LLILLL = z;
        this.LLILZ = z2;
        this.LLILZIL = z3;
        this.LLILZLL = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C957403oi c957403oi) {
        String str;
        C957403oi c957403oi2 = c957403oi;
        if (C2190461Ao8.LIZ() && (str = this.LL) != null) {
            c957403oi2.LIZLLL("gaid", str);
        }
        c957403oi2.LIZLLL("count", Integer.valueOf(this.LLILLJJLI));
        c957403oi2.LIZLLL("use_cache", Integer.valueOf(this.LLILLL ? 1 : 0));
        c957403oi2.LIZLLL("hit_cache", Integer.valueOf(this.LLILZ ? 1 : 0));
        c957403oi2.LIZLLL("is_preload", Integer.valueOf(this.LLILZIL ? 1 : 0));
        c957403oi2.LIZLLL("duration", Long.valueOf(this.LLILZLL));
        return Unit.LIZ;
    }
}
