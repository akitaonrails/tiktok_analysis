package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Yv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.MetaDataManager$updateMetaDataInCoroutine$1$1", f = "MetaDataManager.kt", l = {}, m = "invokeSuspend")
public final class C353501Yv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ VideoPublishEditModel LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C353501Yv(VideoPublishEditModel videoPublishEditModel, boolean z, InterfaceC1364105Vn<? super C353501Yv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = videoPublishEditModel;
        this.LLILLJJLI = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C353501Yv(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MetaDataManager@439e.updateMetaDataInCoroutine$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1436990nUv.LJIIIIZZ(this.LL, this.LLILLJJLI);
        C0MH4.LIZIZ(this.LL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MetaDataManager@439e.updateMetaDataInCoroutine$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
