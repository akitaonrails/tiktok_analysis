package X;

import com.ss.android.ugc.aweme.socialavatar.mixstudio.generatingpage.MixStudioGeneratingPageViewModel;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HRC, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.generatingpage.MixStudioGeneratingPageViewModel$onPrepared$2$1$generatingId$1", f = "MixStudioGeneratingPageViewModel.kt", l = {81}, m = "invokeSuspend")
public final class C0HRC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super InterfaceC440230HOb<?>>, Object> {
    public int LL;
    public final /* synthetic */ MixStudioGeneratingPageViewModel LLILLJJLI;
    public final /* synthetic */ List<Pair<Integer, String>> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HRC(MixStudioGeneratingPageViewModel mixStudioGeneratingPageViewModel, List<Pair<Integer, String>> list, InterfaceC1364105Vn<? super C0HRC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = mixStudioGeneratingPageViewModel;
        this.LLILLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HRC(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MixStudioGeneratingPageViewModel@f91f.onPrepared$2$1$generatingId$1");
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
            MixStudioGeneratingPageViewModel mixStudioGeneratingPageViewModel = this.LLILLJJLI;
            List<Pair<Integer, String>> list = this.LLILLL;
            this.LL = 1;
            obj = mixStudioGeneratingPageViewModel.xQ2(list, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("MixStudioGeneratingPageViewModel@f91f.onPrepared$2$1$generatingId$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("MixStudioGeneratingPageViewModel@f91f.onPrepared$2$1$generatingId$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super InterfaceC440230HOb<?>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
