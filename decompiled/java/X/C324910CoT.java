package X;

import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import com.ss.android.ugc.aweme.tako.ui.TakoChatActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CoT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.ui.TakoChatActivity$attachChatFragment$2$2$1", f = "TakoChatActivity.kt", l = {}, m = "invokeSuspend")
public final class C324910CoT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ TakoChatActivity LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C324910CoT(TakoChatActivity takoChatActivity, long j, boolean z, long j2, InterfaceC1364105Vn<? super C324910CoT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = takoChatActivity;
        this.LLILLJJLI = j;
        this.LLILLL = z;
        this.LLILZ = j2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C324910CoT(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("TakoChatActivity@1b1a.attachChatFragment$2$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        TakoEnterParams takoEnterParamsDN1 = this.LL.DN1();
        String str2 = null;
        if (takoEnterParamsDN1 != null) {
            str2 = takoEnterParamsDN1.enterFrom;
        }
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        TakoEnterParams takoEnterParamsDN12 = this.LL.DN1();
        if (takoEnterParamsDN12 != null && (str = takoEnterParamsDN12.enterMethod) != null) {
            str3 = str;
        }
        C1862330yYx.LJJLIL(c1862330yYx, str2, str3, this.LLILLJJLI, this.LLILLL, this.LLILZ, null, 96);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoChatActivity@1b1a.attachChatFragment$2$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
