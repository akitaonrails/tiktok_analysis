package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.viewmodel.BotDetailViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06kB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.viewmodel.BotDetailViewModel$tryPinBotChatToTop$1$intercepted$1", f = "BotDetailViewModel.kt", l = {167}, m = "invokeSuspend")
public final class C1693706kB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public int LL;
    public final /* synthetic */ BotDetailViewModel LLILLJJLI;
    public final /* synthetic */ Activity LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1693706kB(BotDetailViewModel botDetailViewModel, Activity activity, InterfaceC1364105Vn<? super C1693706kB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = botDetailViewModel;
        this.LLILLL = activity;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1693706kB(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BotDetailViewModel@6175.tryPinBotChatToTop$1$intercepted$1");
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
            IMChatListApi.LJJIII.getClass();
            IMChatListApi iMChatListApiLIZ = C890330YwJ.LIZ();
            C0Y8T c0y8t = (C0Y8T) this.LLILLJJLI.LLILZ.getValue();
            Activity activity = this.LLILLL;
            this.LL = 1;
            obj = iMChatListApiLIZ.LJIJ(c0y8t, activity, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("BotDetailViewModel@6175.tryPinBotChatToTop$1$intercepted$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("BotDetailViewModel@6175.tryPinBotChatToTop$1$intercepted$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
