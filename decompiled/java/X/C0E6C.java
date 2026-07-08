package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0E6C, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0E6C extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C0E5K LL;
    public final /* synthetic */ C0E48 LLILLJJLI;
    public final /* synthetic */ VideoPublishEditModel LLILLL;
    public final /* synthetic */ EnumC378720Et4 LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ AbstractC359260E6q LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0E6C(C0E5K c0e5k, C0E48 c0e48, VideoPublishEditModel videoPublishEditModel, EnumC378720Et4 enumC378720Et4, long j, AbstractC359260E6q abstractC359260E6q) {
        super(0);
        this.LL = c0e5k;
        this.LLILLJJLI = c0e48;
        this.LLILLL = videoPublishEditModel;
        this.LLILZ = enumC378720Et4;
        this.LLILZIL = j;
        this.LLILZLL = abstractC359260E6q;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C19A3 c19a3 = this.LL.LIZIZ;
        C0E48 c0e48 = this.LLILLJJLI;
        C359220E6m c359220E6m = C359220E6m.LIZIZ;
        C375820EoO.LIZ(c19a3, c0e48, C376260Ep6.class, new C379120Eti(c0e48, this.LLILLL, this.LLILZ, null, null, c359220E6m, false, false, false, false, null, null, this.LLILZIL, EnumC378910EtN.ALBUM, 4056), 16);
        C378370EsV c378370EsV = C378370EsV.LIZ;
        VideoPublishEditModel videoPublishEditModel = this.LLILLL;
        AbstractC359260E6q abstractC359260E6q = this.LLILZLL;
        c378370EsV.getClass();
        C378370EsV.LJII(videoPublishEditModel, c359220E6m, abstractC359260E6q);
        return Unit.LIZ;
    }
}
