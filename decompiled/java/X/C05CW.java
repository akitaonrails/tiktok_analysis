package X;

import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIPlaygroundChipsModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05CW, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.aiplayground.panel.helper.AIPlaygroundInspirationChipsHelper$addTextDataModel$1", f = "AIPlaygroundInspirationChipsHelper.kt", l = {49}, m = "invokeSuspend")
public final class C05CW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C389450FOt LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;
    public final /* synthetic */ List<Effect> LLILZIL;
    public final /* synthetic */ boolean LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C05CW(C389450FOt c389450FOt, String str, Function0<Unit> function0, List<? extends Effect> list, boolean z, InterfaceC1364105Vn<? super C05CW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c389450FOt;
        this.LLILLL = str;
        this.LLILZ = function0;
        this.LLILZIL = list;
        this.LLILZLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05CW(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("AIPlaygroundInspirationChipsHelper@4c0a.addTextDataModel$1");
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
            C1DFB c1dfb = C0PEM.LIZJ;
            C23115093x c23115093x = new C23115093x(this.LLILLL, this.LLILZIL, this.LLILZLL, null);
            this.LL = 1;
            obj = C23250099c.LJI(this, c1dfb, c23115093x);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AIPlaygroundInspirationChipsHelper@4c0a.addTextDataModel$1");
                return objLJFF;
            }
        }
        Collection<? extends AIPlaygroundChipsModel> collection = (Collection) obj;
        HashMap<String, ArrayList<AIPlaygroundChipsModel>> map = this.LLILLJJLI.LIZLLL;
        String str = this.LLILLL;
        ArrayList<AIPlaygroundChipsModel> arrayList = map.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            map.put(str, arrayList);
        }
        arrayList.addAll(collection);
        this.LLILZ.invoke();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AIPlaygroundInspirationChipsHelper@4c0a.addTextDataModel$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
