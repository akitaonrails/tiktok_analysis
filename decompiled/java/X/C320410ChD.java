package X;

import com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS8S3100000_27;
import njp.a;

/* JADX INFO: renamed from: X.0ChD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel$onExitChat$1", f = "MessageViewModel.kt", l = {4413}, m = "invokeSuspend")
public final class C320410ChD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MessageViewModel LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C320410ChD(MessageViewModel messageViewModel, String str, String str2, String str3, InterfaceC1364105Vn<? super C320410ChD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = messageViewModel;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = str3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C320410ChD(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MessageViewModel@9229.onExitChat$1");
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
            C1863380yae c1863380yae = this.LLILLJJLI.LLJJJJ;
            if (c1863380yae != null) {
                C1863400yag c1863400yag = C1863400yag.LIZ;
                this.LL = 1;
                if (C1863400yag.LIZLLL(c1863400yag, c1863380yae, null, this, 6) == objLJFF) {
                    C1C7U.LIZIZ("MessageViewModel@9229.onExitChat$1");
                    return objLJFF;
                }
            }
        }
        MessageViewModel messageViewModel = this.LLILLJJLI;
        String str = this.LLILLL;
        String str2 = this.LLILZ;
        String str3 = this.LLILZIL;
        messageViewModel.getClass();
        messageViewModel.withState(new AwS8S3100000_27(messageViewModel, str, str2, str3, 1));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MessageViewModel@9229.onExitChat$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
