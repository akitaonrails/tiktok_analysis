package X;

import com.ss.android.ugc.aweme.creative.model.music.StickPointMusicAlg;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NM1, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.download.StickPointMusicAlgFileDownloadV1$startDownloadFile$1$1", f = "StickPointMusicAlgFileDownloadV1.kt", l = {}, m = "invokeSuspend")
public final class C0NM1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1421070n5F LL;
    public final /* synthetic */ StickPointMusicAlg LLILLJJLI;
    public final /* synthetic */ AtomicBoolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NM1(C1421070n5F c1421070n5F, StickPointMusicAlg stickPointMusicAlg, AtomicBoolean atomicBoolean, InterfaceC1364105Vn<? super C0NM1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1421070n5F;
        this.LLILLJJLI = stickPointMusicAlg;
        this.LLILLL = atomicBoolean;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NM1(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StickPointMusicAlgFileDownloadV1@3c2c.startDownloadFile$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0NM2 c0nm2 = this.LL.LIZ;
        if (c0nm2 != null) {
            c0nm2.LIZ(this.LLILLJJLI, this.LLILLL.get());
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StickPointMusicAlgFileDownloadV1@3c2c.startDownloadFile$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
