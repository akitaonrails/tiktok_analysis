package X;

import com.ss.android.ugc.nearby.container.model.NearbyRevampResponse;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0hMY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1201160hMY extends C09AY implements Function1<C1182980gtE, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ NearbyRevampResponse LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ Map<String, Object> LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1201160hMY(boolean z, long j, long j2, long j3, NearbyRevampResponse nearbyRevampResponse, String str, Map<String, Object> map, boolean z2) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = j;
        this.LLILLL = j2;
        this.LLILZ = j3;
        this.LLILZIL = nearbyRevampResponse;
        this.LLILZLL = str;
        this.LLIZ = map;
        this.LLIZLLLIL = z2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1182980gtE c1182980gtE) {
        long j;
        C1182980gtE c1182980gtE2 = c1182980gtE;
        c1182980gtE2.LIZLLL = "/tiktok/feed/nearby/revamp";
        c1182980gtE2.LJ = "nearby_revamp";
        if (this.LL) {
            j = this.LLILLJJLI - this.LLILLL;
        } else {
            j = this.LLILZ;
        }
        c1182980gtE2.LIZ = Long.valueOf(j);
        c1182980gtE2.LIZIZ = Long.valueOf(this.LLILLJJLI);
        c1182980gtE2.LIZJ = this.LLILZIL;
        c1182980gtE2.LJFF = new Pair<>("load_scene", this.LLILZLL);
        Map<String, ? extends Object> map = this.LLIZ;
        map.put("is_reuse", Integer.valueOf(C1189060h32.LJJIIZ(Boolean.valueOf(this.LLIZLLLIL))));
        c1182980gtE2.LJIILJJIL = map;
        return Unit.LIZ;
    }
}
