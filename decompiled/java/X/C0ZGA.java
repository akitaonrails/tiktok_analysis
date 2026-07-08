package X;

import com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed.assem.DetailFeedDMViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS593S0100000_14;
import njp.a;

/* JADX INFO: renamed from: X.0ZGA, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed.assem.DetailFeedDMViewModel$sendMessageForProfilePageRepostTabAfterFetchIMUser$1", f = "DetailFeedDMViewModel.kt", l = {302}, m = "invokeSuspend")
public final class C0ZGA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ AnonymousClass0957<Boolean> LLILLL;
    public final /* synthetic */ C0ZG9 LLILZ;
    public final /* synthetic */ DetailFeedDMViewModel LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0ZGA(AnonymousClass0957<Boolean> anonymousClass0957, C0ZG9 c0zg9, DetailFeedDMViewModel detailFeedDMViewModel, InterfaceC1364105Vn<? super C0ZGA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = anonymousClass0957;
        this.LLILZ = c0zg9;
        this.LLILZIL = detailFeedDMViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0ZGA c0zga = new C0ZGA(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c0zga.LLILLJJLI = obj;
        return c0zga;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC497601wk interfaceC497601wk;
        C1C7U.LIZ("DetailFeedDMViewModel@859b.sendMessageForProfilePageRepostTabAfterFetchIMUser$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            AnonymousClass0957<Boolean> anonymousClass0957 = this.LLILLL;
            this.LLILLJJLI = interfaceC497601wk;
            this.LL = 1;
            obj = anonymousClass0957.LJLIIIL(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("DetailFeedDMViewModel@859b.sendMessageForProfilePageRepostTabAfterFetchIMUser$1");
                return objLJFF;
            }
        }
        if (((Boolean) obj).booleanValue() && C2296808zG.LJI(interfaceC497601wk)) {
            C0ZG9 c0zg9 = this.LLILZ;
            if (c0zg9.LJ && c0zg9.LIZIZ.isQuickReply()) {
                DetailFeedDMViewModel detailFeedDMViewModel = this.LLILZIL;
                CharSequence charSequence = this.LLILZ.LIZ;
                detailFeedDMViewModel.getClass();
                detailFeedDMViewModel.setState(new AwS593S0100000_14(charSequence, 221));
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DetailFeedDMViewModel@859b.sendMessageForProfilePageRepostTabAfterFetchIMUser$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
