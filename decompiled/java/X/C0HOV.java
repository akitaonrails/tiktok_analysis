package X;

import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.homepage.MixStudioHomePageAssem;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.homepage.MixStudioHomePageViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS585S0100000_6;
import njp.a;

/* JADX INFO: renamed from: X.0HOV, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.homepage.MixStudioHomePageAssem$openDropdownFragment$dropdownView$1$1$onIdChange$1", f = "MixStudioHomePageAssem.kt", l = {1543}, m = "invokeSuspend")
public final class C0HOV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MixStudioHomePageAssem LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ Set<C443120HZe<Integer, String, C05YD<C0HOM<? extends C440440HOw>>>> LLILZ;
    public final /* synthetic */ List<C0HQC> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0HOV(MixStudioHomePageAssem mixStudioHomePageAssem, int i, Set<? extends C443120HZe<Integer, String, ? extends C05YD<? extends C0HOM<? extends C440440HOw>>>> set, List<C0HQC> list, InterfaceC1364105Vn<? super C0HOV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = mixStudioHomePageAssem;
        this.LLILLL = i;
        this.LLILZ = set;
        this.LLILZIL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HOV(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC440230HOb<? extends List<C440440HOw>> c1372905Yx;
        InterfaceC440090HNn interfaceC440090HNn;
        C0HOB c0hob;
        C1C7U.LIZ("MixStudioHomePageAssem@94b0.openDropdownFragment$dropdownView$1$1$onIdChange$1");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(50L, this) == objLJFF) {
                C1C7U.LIZIZ("MixStudioHomePageAssem@94b0.openDropdownFragment$dropdownView$1$1$onIdChange$1");
                return objLJFF;
            }
        }
        MixStudioHomePageAssem mixStudioHomePageAssem = this.LLILLJJLI;
        int i2 = this.LLILLL;
        Set<C443120HZe<Integer, String, C05YD<C0HOM<? extends C440440HOw>>>> set = this.LLILZ;
        List<C0HQC> list = this.LLILZIL;
        mixStudioHomePageAssem.getClass();
        int iIntValue = ((Number) ((C443120HZe) C13LP.LJJJJZI(((C0HQC) ListProtector.get(list, i2)).LIZIZ)).getFirst()).intValue();
        if (!set.isEmpty()) {
            C0HOO c0hoo = C0HOM.LIZ;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(set, 10));
            Iterator<T> it2 = set.iterator();
            while (it2.hasNext()) {
                arrayList.add(((C443120HZe) it2.next()).getThird());
            }
            LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(mixStudioHomePageAssem);
            c0hoo.getClass();
            c1372905Yx = new C0HOD(C0HOO.LIZ(arrayList, lifecycleScope));
        } else {
            c1372905Yx = new C1372905Yx(iIntValue);
        }
        mixStudioHomePageAssem.mp().yQ2(c1372905Yx);
        C0HOC c0hoc = mixStudioHomePageAssem.mp().getState().LLILZIL;
        if (c0hoc != null && (interfaceC440090HNn = c0hoc.LIZ) != null && ((c0hob = mixStudioHomePageAssem.op().getState().LLILZIL.get(Integer.valueOf(iIntValue))) == null || !c0hob.LIZ.invoke(interfaceC440090HNn).booleanValue())) {
            MixStudioHomePageViewModel mixStudioHomePageViewModelMp = mixStudioHomePageAssem.mp();
            mixStudioHomePageViewModelMp.getClass();
            mixStudioHomePageViewModelMp.setState(new AwS585S0100000_6((C0HOC) null, 290));
        }
        mixStudioHomePageAssem.Gp(EnumC440220HOa.CHANGE_ID, c1372905Yx);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MixStudioHomePageAssem@94b0.openDropdownFragment$dropdownView$1$1$onIdChange$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
