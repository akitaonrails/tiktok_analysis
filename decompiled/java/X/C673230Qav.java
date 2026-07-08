package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.discover.model.suggest.SuggestWordResponse;
import com.ss.android.ugc.aweme.discover.model.suggest.TypeWords;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.ecommerce.search.suggest.vm.SuggestAssemViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS589S0100000_10;
import njp.a;

/* JADX INFO: renamed from: X.0Qav, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.suggest.vm.SuggestAssemViewModel$setFirstGuessData$2", f = "SuggestAssemViewModel.kt", l = {}, m = "invokeSuspend")
public final class C673230Qav extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ SuggestAssemViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C673230Qav(String str, SuggestAssemViewModel suggestAssemViewModel, InterfaceC1364105Vn<? super C673230Qav> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = suggestAssemViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C673230Qav(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        List<TypeWords> list;
        TypeWords typeWords;
        List<Word> list2;
        Word word;
        C1C7U.LIZ("SuggestAssemViewModel@b236.setFirstGuessData$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            SuggestWordResponse suggestWordResponse = (SuggestWordResponse) C7740030o.LIZ().getGson().LJII(this.LL, SuggestWordResponse.class);
            unit = null;
            if (suggestWordResponse != null && (list = suggestWordResponse.data) != null && (typeWords = (TypeWords) C13LP.LJJJLL(list)) != null && (list2 = typeWords.words) != null && (!list2.isEmpty()) && (word = (Word) C13LP.LJJJLL(list2)) != null) {
                SuggestAssemViewModel suggestAssemViewModel = this.LLILLJJLI;
                String str = suggestWordResponse.logId;
                if (str == null) {
                    str = "";
                }
                word.setImplId(str);
                suggestAssemViewModel.setState(new AwS589S0100000_10(word, 83));
                unit = Unit.LIZ;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            unit = Unit.LIZ;
        }
        C1C7U.LIZIZ("SuggestAssemViewModel@b236.setFirstGuessData$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
