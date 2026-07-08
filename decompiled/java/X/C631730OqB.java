package X;

import Y.AgS101S1100000_9;
import com.ss.android.ugc.aweme.music.highlight.HighlightSelectListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS240S0000000_9;
import njp.a;

/* JADX INFO: renamed from: X.0OqB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.music.highlight.HighlightSelectListViewModel$submitHighlightMusic$1", f = "HighlightSelectListViewModel.kt", l = {114, 118}, m = "invokeSuspend")
public final class C631730OqB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ HighlightSelectListViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C631730OqB(HighlightSelectListViewModel highlightSelectListViewModel, InterfaceC1364105Vn<? super C631730OqB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = highlightSelectListViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C631730OqB(this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        C1C7U.LIZ("HighlightSelectListViewModel@f6a5.submitHighlightMusic$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("HighlightSelectListViewModel@f6a5.submitHighlightMusic$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) this.LL;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            str = ((C631750OqD) this.LLILLL.getState()).LL;
            if (str == null) {
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("HighlightSelectListViewModel@f6a5.submitHighlightMusic$1");
                return unit2;
            }
            this.LLILLL.setState(AFwS240S0000000_9.get$arr$(710));
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("submitHighlightMusic highlightSourceMusicId: ");
            sbLIZ.append(str);
            C1720106oR.LJI("music_biz", C2188811AlT.LIZIZ(sbLIZ));
            InterfaceC631520Opq interfaceC631520Opq = (InterfaceC631520Opq) this.LLILLL.LL.getOperator();
            C631640Oq2 c631640Oq2 = (C631640Oq2) C1252710ihh.LJIIIZ(this.LLILLL, C13LE.LIZ(InterfaceC634000Otq.class));
            if (c631640Oq2 == null || (str2 = c631640Oq2.LIZIZ) == null) {
                str2 = "";
            }
            this.LL = str;
            this.LLILLJJLI = 1;
            obj = interfaceC631520Opq.LJLZ(str2, str);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("HighlightSelectListViewModel@f6a5.submitHighlightMusic$1");
                return objLJFF;
            }
        }
        AgS101S1100000_9 agS101S1100000_9 = new AgS101S1100000_9(this.LLILLL, str, 0);
        this.LL = null;
        this.LLILLJJLI = 2;
        if (((InterfaceC346201Wa) obj).collect(agS101S1100000_9, this) == objLJFF) {
            C1C7U.LIZIZ("HighlightSelectListViewModel@f6a5.submitHighlightMusic$1");
            return objLJFF;
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("HighlightSelectListViewModel@f6a5.submitHighlightMusic$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
