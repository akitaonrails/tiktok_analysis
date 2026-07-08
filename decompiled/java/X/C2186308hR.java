package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.ai.impl.smartreply.chatroom.sharepost.BotSharePostPickerViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS248S0000000_14;
import njp.a;

/* JADX INFO: renamed from: X.08hR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.ai.impl.smartreply.chatroom.sharepost.BotSharePostPickerViewModel$sendSelected$3", f = "BotSharePostPickerViewModel.kt", l = {}, m = "invokeSuspend")
public final class C2186308hR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ List<Aweme> LLILLJJLI;
    public final /* synthetic */ BotSharePostPickerViewModel LLILLL;
    public final /* synthetic */ Context LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2186308hR(List<? extends Aweme> list, BotSharePostPickerViewModel botSharePostPickerViewModel, Context context, String str, InterfaceC1364105Vn<? super C2186308hR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
        this.LLILLL = botSharePostPickerViewModel;
        this.LLILZ = context;
        this.LLILZIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2186308hR c2186308hR = new C2186308hR(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c2186308hR.LL = obj;
        return c2186308hR;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("BotSharePostPickerViewModel@549b.sendSelected$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<Aweme> list = this.LLILLJJLI;
        BotSharePostPickerViewModel botSharePostPickerViewModel = this.LLILLL;
        Context context = this.LLILZ;
        String str = this.LLILZIL;
        try {
            int i = 0;
            for (Aweme aweme : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    botSharePostPickerViewModel.xQ2(context, aweme, str, i);
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            this.LLILLL.setState(AFwS248S0000000_14.get$arr$(64));
        } else {
            if (C189200o6.m5exceptionOrNullimpl(c098200Yq) == null) {
                new Throwable("sendSelected failed");
            }
            this.LLILLL.setState(AFwS248S0000000_14.get$arr$(65));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BotSharePostPickerViewModel@549b.sendSelected$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
