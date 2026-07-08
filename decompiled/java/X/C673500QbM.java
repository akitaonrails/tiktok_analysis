package X;

import com.ss.android.ugc.aweme.ecommerce.search.suggest.model.EcSearchHistoryWordsResponse;
import com.ss.android.ugc.aweme.ecommerce.search.suggest.vm.EcSearchMiddlePitayaHelper;
import com.ss.android.ugc.aweme.ecommerce.search.suggest.vm.SuggestAssemViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS589S0100000_10;
import njp.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0QbM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.suggest.vm.SuggestAssemViewModel$fetchHistoryWithImage$2", f = "SuggestAssemViewModel.kt", l = {1119}, m = "invokeSuspend")
public final class C673500QbM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C673920Qc2 LLILLJJLI;
    public final /* synthetic */ C673690Qbf LLILLL;
    public final /* synthetic */ SuggestAssemViewModel LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C673500QbM(C673920Qc2 c673920Qc2, C673690Qbf c673690Qbf, SuggestAssemViewModel suggestAssemViewModel, InterfaceC1364105Vn<? super C673500QbM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c673920Qc2;
        this.LLILLL = c673690Qbf;
        this.LLILZ = suggestAssemViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C673500QbM(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        List<Object> list;
        C1C7U.LIZ("SuggestAssemViewModel@b236.fetchHistoryWithImage$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        boolean z = true;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C673920Qc2 c673920Qc2 = this.LLILLJJLI;
            c673920Qc2.LIZLLL();
            c673920Qc2.LIZJ();
            JSONObject jSONObject = new JSONObject();
            EcSearchMiddlePitayaHelper.LIZJ(this.LLILLL, jSONObject);
            C680200QmA c680200QmA = C680200QmA.LIZ;
            this.LL = 1;
            obj = c680200QmA.LIZ(jSONObject, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SuggestAssemViewModel@b236.fetchHistoryWithImage$2");
                return objLJFF;
            }
        }
        String str = (String) obj;
        C672820QaG.LIZ.getClass();
        EcSearchHistoryWordsResponse ecSearchHistoryWordsResponseLJI = C672820QaG.LJI(str);
        int size = 0;
        if (ecSearchHistoryWordsResponseLJI == null) {
            z = false;
        }
        C673920Qc2 c673920Qc22 = this.LLILLJJLI;
        if (ecSearchHistoryWordsResponseLJI != null && (list = ecSearchHistoryWordsResponseLJI.historyWordsWithImages) != null) {
            size = list.size();
        }
        c673920Qc22.LIZIZ(size, z);
        c673920Qc22.LIZJ();
        if (z) {
            this.LLILZ.setState(new AwS589S0100000_10(new C673680Qbe(str, this.LLILLJJLI), 89));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SuggestAssemViewModel@b236.fetchHistoryWithImage$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
