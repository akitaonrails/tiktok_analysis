package X;

import com.ss.android.ugc.aweme.im.sdk.chat.feature.reaction.reactionlist.IMReactionListSheetViewModel;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CYz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.reaction.reactionlist.IMReactionListSheetViewModel$fetchMissingUsers$1", f = "IMReactionListSheetViewModel.kt", l = {}, m = "invokeSuspend")
public final class C315670CYz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<String> LL;
    public final /* synthetic */ InterfaceC1685420txc<String, String, Boolean, String, InterfaceC1480505qt, Unit> LLILLJJLI;
    public final /* synthetic */ IMReactionListSheetViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C315670CYz(List<String> list, InterfaceC1685420txc<? super String, ? super String, ? super Boolean, ? super String, ? super InterfaceC1480505qt, Unit> interfaceC1685420txc, IMReactionListSheetViewModel iMReactionListSheetViewModel, InterfaceC1364105Vn<? super C315670CYz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
        this.LLILLJJLI = interfaceC1685420txc;
        this.LLILLL = iMReactionListSheetViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C315670CYz(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMReactionListSheetViewModel@12da.fetchMissingUsers$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Iterator<String> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            this.LLILLJJLI.invoke(it2.next(), null, false, "im_chat_reaction", this.LLILLL.LLJ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMReactionListSheetViewModel@12da.fetchMissingUsers$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
