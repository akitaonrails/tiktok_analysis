package X;

import com.ss.android.ugc.aweme.tools.sticker.core.text.model.CaptionTemplateData;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.HashMap;
import java.util.HashSet;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS53S0200100_5;
import njp.a;

/* JADX INFO: renamed from: X.0FCH, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.sticker.core.text.resource.TextResourceRepository$downloadCaptionTemplate$3$results$1$1", f = "TextResourceRepository.kt", l = {202}, m = "invokeSuspend")
public final class C0FCH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends Pair<? extends String, ? extends Effect>>>, Object> {
    public int LL;
    public final /* synthetic */ C0FDM LLILLJJLI;
    public final /* synthetic */ CaptionTemplateData LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Object LLILZIL;
    public final /* synthetic */ Function1<Integer, Unit> LLILZLL;
    public final /* synthetic */ HashMap<String, Integer> LLIZ;
    public final /* synthetic */ HashSet<String> LLIZLLLIL;
    public final /* synthetic */ long LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0FCH(C0FDM c0fdm, CaptionTemplateData captionTemplateData, String str, Object obj, Function1<? super Integer, Unit> function1, HashMap<String, Integer> map, HashSet<String> hashSet, long j, InterfaceC1364105Vn<? super C0FCH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0fdm;
        this.LLILLL = captionTemplateData;
        this.LLILZ = str;
        this.LLILZIL = obj;
        this.LLILZLL = function1;
        this.LLIZ = map;
        this.LLIZLLLIL = hashSet;
        this.LLJ = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0FCH(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLIZJ;
        C1C7U.LIZ("TextResourceRepository@b217.downloadCaptionTemplate$3$results$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
                objLIZJ = ((C189200o6) obj).m10unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C0FDM c0fdm = this.LLILLJJLI;
            CaptionTemplateData captionTemplateData = this.LLILLL;
            String str = this.LLILZ;
            C2642010m c2642010m = new C2642010m(this.LLILZIL, this.LLILZLL, this.LLIZ, str, this.LLIZLLLIL);
            AwS53S0200100_5 awS53S0200100_5 = new AwS53S0200100_5(this.LLILLJJLI, this.LLJ, this.LLILLL, 0);
            this.LL = 1;
            objLIZJ = c0fdm.LIZJ(captionTemplateData, str, c2642010m, awS53S0200100_5, this);
            if (objLIZJ == objLJFF) {
                C1C7U.LIZIZ("TextResourceRepository@b217.downloadCaptionTemplate$3$results$1$1");
                return objLJFF;
            }
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLIZJ);
        C1C7U.LIZIZ("TextResourceRepository@b217.downloadCaptionTemplate$3$results$1$1");
        return c189200o6M1boximpl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends Pair<? extends String, ? extends Effect>>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
