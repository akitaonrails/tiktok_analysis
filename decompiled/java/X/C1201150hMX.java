package X;

import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0hMX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1201150hMX extends C09AY implements Function1<C1182980gtE, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ Map<String, Object> LLIZLLLIL;
    public final /* synthetic */ boolean LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1201150hMX(boolean z, long j, long j2, long j3, String str, int i, String str2, Map<String, Object> map, boolean z2) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = j;
        this.LLILLL = j2;
        this.LLILZ = j3;
        this.LLILZIL = str;
        this.LLILZLL = i;
        this.LLIZ = str2;
        this.LLIZLLLIL = map;
        this.LLJ = z2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1182980gtE c1182980gtE) {
        long j;
        C1182980gtE c1182980gtE2 = c1182980gtE;
        c1182980gtE2.LIZLLL = "/tiktok/feed/nearby/chunk";
        c1182980gtE2.LJ = "nearby_revamp_chunk";
        if (this.LL) {
            j = this.LLILLJJLI - this.LLILLL;
        } else {
            j = this.LLILZ;
        }
        c1182980gtE2.LIZ = Long.valueOf(j);
        c1182980gtE2.LIZIZ = Long.valueOf(this.LLILLJJLI);
        c1182980gtE2.LIZJ = null;
        c1182980gtE2.LJFF = new Pair<>("load_scene", this.LLILZIL);
        c1182980gtE2.LJI = new Pair<>("index", String.valueOf(this.LLILZLL));
        String str = this.LLIZ;
        if (str == null) {
            str = "";
        }
        c1182980gtE2.LJII = new Pair<>("data_type", str);
        Map<String, ? extends Object> map = this.LLIZLLLIL;
        map.put("is_reuse", Integer.valueOf(C1189060h32.LJJIIZ(Boolean.valueOf(this.LLJ))));
        c1182980gtE2.LJIILJJIL = map;
        return Unit.LIZ;
    }
}
