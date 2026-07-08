package X;

import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09Lv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.VideoChosenResultFromAddSceneImpl$checkAddValid$1$compressVideoTask$1", f = "VideoChosenResultFromAddSceneImpl.kt", l = {135}, m = "invokeSuspend")
public final class C2358109Lv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public int LL;
    public final /* synthetic */ C536080L0s LLILLJJLI;
    public final /* synthetic */ List<MediaModel> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2358109Lv(C536080L0s c536080L0s, List<? extends MediaModel> list, InterfaceC1364105Vn<? super C2358109Lv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c536080L0s;
        this.LLILLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2358109Lv(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VideoChosenResultFromAddSceneImpl@77d1.checkAddValid$1$compressVideoTask$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C536080L0s c536080L0s = this.LLILLJJLI;
            List<MediaModel> list = this.LLILLL;
            this.LL = 1;
            obj = c536080L0s.LIZJ(list, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("VideoChosenResultFromAddSceneImpl@77d1.checkAddValid$1$compressVideoTask$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("VideoChosenResultFromAddSceneImpl@77d1.checkAddValid$1$compressVideoTask$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
