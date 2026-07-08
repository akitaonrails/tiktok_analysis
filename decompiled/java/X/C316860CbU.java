package X;

import android.os.Looper;
import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.commercialize.chatagent.botpage.actionbar.model.CommerceAgentActiveActionItem;
import com.ss.android.ugc.aweme.commercialize.chatagent.botpage.actionbar.model.CommerceAgentActiveBotItem;
import com.ss.android.ugc.aweme.commercialize.chatagent.botpage.vm.MessageViewModel;
import com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.ExtraRequestInfo;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS232S0000000_4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import njp.a;

/* JADX INFO: renamed from: X.0CbU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.chatagent.botpage.vm.MessageViewModel$askQuestion$1", f = "MessageViewModel.kt", l = {709}, m = "invokeSuspend")
public final class C316860CbU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ MessageViewModel LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ Map<String, String> LLILZLL;
    public final /* synthetic */ CommerceAgentActiveActionItem LLIZ;
    public final /* synthetic */ CommerceAgentActiveBotItem LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ int LLJI;
    public final /* synthetic */ int LLJIJIL;
    public final /* synthetic */ ExtraRequestInfo LLJILJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C316860CbU(int i, int i2, CommerceAgentActiveActionItem commerceAgentActiveActionItem, CommerceAgentActiveBotItem commerceAgentActiveBotItem, MessageViewModel messageViewModel, ExtraRequestInfo extraRequestInfo, String str, String str2, String str3, Map map, InterfaceC1364105Vn interfaceC1364105Vn, boolean z) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = z;
        this.LLILLL = messageViewModel;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = map;
        this.LLIZ = commerceAgentActiveActionItem;
        this.LLIZLLLIL = commerceAgentActiveBotItem;
        this.LLJ = str3;
        this.LLJI = i;
        this.LLJIJIL = i2;
        this.LLJILJIL = extraRequestInfo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        boolean z = this.LLILLJJLI;
        MessageViewModel messageViewModel = this.LLILLL;
        String str = this.LLILZ;
        String str2 = this.LLILZIL;
        Map<String, String> map = this.LLILZLL;
        return new C316860CbU(this.LLJI, this.LLJIJIL, this.LLIZ, this.LLIZLLLIL, messageViewModel, this.LLJILJIL, str, str2, this.LLJ, map, interfaceC1364105Vn, z);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MessageViewModel@2947.askQuestion$1");
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
            if (this.LLILLJJLI) {
                MessageViewModel messageViewModel = this.LLILLL;
                messageViewModel.getClass();
                if (Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
                    messageViewModel.setState(AFwS232S0000000_4.get$arr$(219));
                } else {
                    InterfaceC497601wk viewModelScope = ViewModelKt.getViewModelScope(messageViewModel);
                    C1DFH c1dfh = C0PEM.LIZ;
                    C23250099c.LIZLLL(viewModelScope, C2107308Nj.LIZ, null, new C316850CbT(messageViewModel, null), 2);
                }
            }
            MessageViewModel messageViewModel2 = this.LLILLL;
            String str = this.LLILZ;
            String str2 = this.LLILZIL;
            boolean z = this.LLILLJJLI;
            Map<String, String> map = this.LLILZLL;
            CommerceAgentActiveActionItem commerceAgentActiveActionItem = this.LLIZ;
            CommerceAgentActiveBotItem commerceAgentActiveBotItem = this.LLIZLLLIL;
            String str3 = this.LLJ;
            int i2 = this.LLJI;
            int i3 = this.LLJIJIL;
            ExtraRequestInfo extraRequestInfo = this.LLJILJIL;
            this.LL = 1;
            messageViewModel2.getClass();
            if ((!a0.LJJJIL(str)) && str != null) {
                C23250099c.LIZLLL(ViewModelKt.getViewModelScope(messageViewModel2), C0PEM.LIZJ, null, new C320990Ci9(i2, i3, commerceAgentActiveActionItem, commerceAgentActiveBotItem, messageViewModel2, extraRequestInfo, str, str2, str3, map, null, z), 2);
            }
            if (Unit.LIZ == objLJFF) {
                C1C7U.LIZIZ("MessageViewModel@2947.askQuestion$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MessageViewModel@2947.askQuestion$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
