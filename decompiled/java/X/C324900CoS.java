package X;

import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import com.ss.android.ugc.aweme.tako.ui.TakoChatRootFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CoS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.ui.TakoChatRootFragment$attachChatFragment$2$2$1", f = "TakoChatRootFragment.kt", l = {}, m = "invokeSuspend")
public final class C324900CoS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ TakoChatRootFragment LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C324900CoS(TakoChatRootFragment takoChatRootFragment, long j, boolean z, long j2, InterfaceC1364105Vn<? super C324900CoS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = takoChatRootFragment;
        this.LLILLJJLI = j;
        this.LLILLL = z;
        this.LLILZ = j2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C324900CoS(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("TakoChatRootFragment@b942.attachChatFragment$2$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        TakoEnterParams takoEnterParams = this.LL.LLJJ;
        String str2 = null;
        if (takoEnterParams != null) {
            str2 = takoEnterParams.enterFrom;
        }
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        if (takoEnterParams != null && (str = takoEnterParams.enterMethod) != null) {
            str3 = str;
        }
        C1862330yYx.LJJLIL(c1862330yYx, str2, str3, this.LLILLJJLI, this.LLILLL, this.LLILZ, null, 96);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoChatRootFragment@b942.attachChatFragment$2$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
