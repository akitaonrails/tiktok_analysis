package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.18Li, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21269218Li extends C09AY implements Function1<C957403oi, Unit> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21269218Li(long j, String str, String str2, String str3) {
        super(1);
        this.LL = j;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C957403oi c957403oi) {
        C957403oi c957403oi2 = c957403oi;
        c957403oi2.LIZLLL("EVENT_ORIGIN_FEATURE", "TEMAI");
        c957403oi2.LIZLLL("duration", Long.valueOf(this.LL));
        String str = this.LLILLJJLI;
        if (str != null) {
            c957403oi2.LIZLLL("quit_type", str);
        }
        String str2 = this.LLILLL;
        if (str2 != null) {
            c957403oi2.LIZLLL("entrance_form", str2);
        }
        String str3 = this.LLILZ;
        if (str3 != null) {
            c957403oi2.LIZLLL("group_id", str3);
        }
        C21272518Mp c21272518Mp = C21272518Mp.LIZ;
        String str4 = this.LLILZ;
        c21272518Mp.getClass();
        Map<String, ? extends Object> mapLJIIIZ = C21272518Mp.LJIIIZ(str4);
        if (mapLJIIIZ != null) {
            c957403oi2.LJ(mapLJIIIZ);
        }
        return Unit.LIZ;
    }
}
