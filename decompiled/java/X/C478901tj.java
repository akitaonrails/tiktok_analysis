package X;

import com.ss.android.ugc.aweme.im.sharepanel.impl.share.sendto.SendToViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01tj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sharepanel.impl.share.sendto.SendToViewModel$createRefactorSendListener$1", f = "SendToViewModel.kt", l = {225}, m = "invokeSuspend")
public final class C478901tj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C05XL<Integer> LLILLJJLI;
    public final /* synthetic */ SendToViewModel LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C478901tj(C05XL<Integer> c05xl, SendToViewModel sendToViewModel, int i, String str, InterfaceC1364105Vn<? super C478901tj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c05xl;
        this.LLILLL = sendToViewModel;
        this.LLILZ = i;
        this.LLILZIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C478901tj(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SendToViewModel@e6c.createRefactorSendListener$1");
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
            C05XL<Integer> c05xl = this.LLILLJJLI;
            this.LL = 1;
            obj = c05xl.LJLIIIL(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SendToViewModel@e6c.createRefactorSendListener$1");
                return objLJFF;
            }
        }
        int iIntValue = ((Number) obj).intValue();
        SendToViewModel sendToViewModel = this.LLILLL;
        int i2 = this.LLILZ;
        String str = this.LLILZIL;
        sendToViewModel.getClass();
        SendToViewModel.vQ2(i2, iIntValue, str);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SendToViewModel@e6c.createRefactorSendListener$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
