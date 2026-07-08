package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Yt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.MetaDataManager$updateMetaDataInCoroutineWithCheck$1", f = "MetaDataManager.kt", l = {30}, m = "invokeSuspend")
public final class C353301Yt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;
    public final /* synthetic */ VideoPublishEditModel LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C353301Yt(Function0<Unit> function0, VideoPublishEditModel videoPublishEditModel, boolean z, InterfaceC1364105Vn<? super C353301Yt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = function0;
        this.LLILZ = videoPublishEditModel;
        this.LLILZIL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C353301Yt c353301Yt = new C353301Yt(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c353301Yt.LLILLJJLI = obj;
        return c353301Yt;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC497601wk interfaceC497601wk;
        C1C7U.LIZ("MetaDataManager@439e.updateMetaDataInCoroutineWithCheck$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            C1DFB c1dfb = C0PEM.LIZJ;
            C353401Yu c353401Yu = new C353401Yu(this.LLILZ, this.LLILZIL, null);
            this.LLILLJJLI = interfaceC497601wk;
            this.LL = 1;
            if (C23250099c.LJI(this, c1dfb, c353401Yu) == objLJFF) {
                C1C7U.LIZIZ("MetaDataManager@439e.updateMetaDataInCoroutineWithCheck$1");
                return objLJFF;
            }
        }
        if (C2296808zG.LJI(interfaceC497601wk)) {
            this.LLILLL.invoke();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MetaDataManager@439e.updateMetaDataInCoroutineWithCheck$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
