package X;

import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05bs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.music.addtodsp.feed.button.MusicAddToDspLogger$reportAddSongIconClick$1", f = "MusicAddToDspLogger.kt", l = {}, m = "invokeSuspend")
public final class C1387405bs extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ VideoItemParams LL;
    public final /* synthetic */ Integer LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1387405bs(VideoItemParams videoItemParams, Integer num, InterfaceC1364105Vn<? super C1387405bs> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = videoItemParams;
        this.LLILLJJLI = num;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1387405bs(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MusicAddToDspLogger@6b39.reportAddSongIconClick$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C631270OpR.LIZJ(this.LL, this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MusicAddToDspLogger@6b39.reportAddSongIconClick$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
