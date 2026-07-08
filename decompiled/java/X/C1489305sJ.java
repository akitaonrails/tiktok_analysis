package X;

import com.bytedance.scene.Scene;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.05sJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1489305sJ extends C09AY implements Function1<C957403oi, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ C1489405sK LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1489305sJ(long j, C1489405sK c1489405sK, String str, String str2) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = j;
        this.LLILZ = c1489405sK;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C957403oi c957403oi) {
        C957403oi c957403oi2 = c957403oi;
        String str = this.LL;
        if (str != null) {
            c957403oi2.LIZLLL("page_name", str);
        }
        String str2 = this.LLILLJJLI;
        if (str2 != null) {
            c957403oi2.LIZLLL(Scene.SCENE_SERVICE, str2);
        }
        c957403oi2.LIZLLL("duration", Long.valueOf(this.LLILLL));
        if (Intrinsics.LJFF(this.LLILZ, C1489405sK.LIZJ)) {
            c957403oi2.LIZLLL("is_success", 0);
        } else {
            c957403oi2.LIZLLL("loaded_count", Integer.valueOf(this.LLILZ.LIZ));
            c957403oi2.LIZLLL("not_found_count", Integer.valueOf(this.LLILZ.LIZIZ));
            c957403oi2.LIZLLL("is_success", 1);
        }
        return Unit.LIZ;
    }
}
