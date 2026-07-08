package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0EMX, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.creationflow.publish.save.controll.EPSyncTaskManager$prepare$1$1", f = "EPSyncTaskManager.kt", l = {}, m = "invokeSuspend")
public final class C0EMX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0EMK LL;
    public final /* synthetic */ VideoPublishEditModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0EMX(C0EMK c0emk, VideoPublishEditModel videoPublishEditModel, InterfaceC1364105Vn<? super C0EMX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0emk;
        this.LLILLJJLI = videoPublishEditModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0EMX(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EPSyncTaskManager@1ee4.prepare$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LLILLJJLI.LLLLLL().LJ(this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EPSyncTaskManager@1ee4.prepare$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
