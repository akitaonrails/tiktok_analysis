package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0mk1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.wavepublish.dm.video.DMVideoCompileTask$onTaskSuccess$2", f = "DMVideoCompileTask.kt", l = {869, 870}, m = "invokeSuspend")
public final class C1407910mk1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1435550nSb LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1407910mk1(C1435550nSb c1435550nSb, InterfaceC1364105Vn<? super C1407910mk1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1435550nSb;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1407910mk1(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DMVideoCompileTask@c7d8.onTaskSuccess$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        C1434960nRe c1434960nRe = null;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("DMVideoCompileTask@c7d8.onTaskSuccess$2");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C140D c140d = C140D.LIZ;
            C1434960nRe c1434960nRe2 = this.LLILLJJLI.LLJ;
            if (c1434960nRe2 == null) {
                c1434960nRe2 = null;
            }
            VideoPublishEditModel videoPublishEditModel = c1434960nRe2.LIZ;
            this.LL = 1;
            if (c140d.LJJJI(videoPublishEditModel, false, this) == objLJFF) {
                C1C7U.LIZIZ("DMVideoCompileTask@c7d8.onTaskSuccess$2");
                return objLJFF;
            }
        }
        C140D c140d2 = C140D.LIZ;
        C1434960nRe c1434960nRe3 = this.LLILLJJLI.LLJ;
        if (c1434960nRe3 != null) {
            c1434960nRe = c1434960nRe3;
        }
        VideoPublishEditModel videoPublishEditModel2 = c1434960nRe.LIZ;
        this.LL = 2;
        if (c140d2.LJJJI(videoPublishEditModel2, true, this) == objLJFF) {
            C1C7U.LIZIZ("DMVideoCompileTask@c7d8.onTaskSuccess$2");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("DMVideoCompileTask@c7d8.onTaskSuccess$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
