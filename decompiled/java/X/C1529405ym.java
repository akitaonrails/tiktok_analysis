package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05ym, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chatdetail.analytics.IMGroupChatDetailAnalytics$logClickCreateGroup$1", f = "IMGroupChatDetailAnalytics.kt", l = {100}, m = "invokeSuspend")
public final class C1529405ym extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C830490Whz LL;
    public C830490Whz LLILLJJLI;
    public Object LLILLL;
    public int LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1529405ym(String str, InterfaceC1364105Vn<? super C1529405ym> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1529405ym(this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C830490Whz c830490Whz;
        Object obj2;
        C830490Whz c830490Whz2;
        C1C7U.LIZ("IMGroupChatDetailAnalytics@1157.logClickCreateGroup$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILZ;
        if (i != 0) {
            if (i == 1) {
                obj2 = this.LLILLL;
                c830490Whz = this.LLILLJJLI;
                c830490Whz2 = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            c830490Whz = new C830490Whz();
            c830490Whz.put("enter_from", this.LLILZIL);
            c830490Whz.put("has_menu", CardStruct.IStatusCode.DEFAULT);
            this.LL = c830490Whz;
            this.LLILLJJLI = c830490Whz;
            obj2 = "group_owner_account_type";
            this.LLILLL = "group_owner_account_type";
            this.LLILZ = 1;
            obj = C1529605yo.LIZ(C461720I8s.LIZIZ(), this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("IMGroupChatDetailAnalytics@1157.logClickCreateGroup$1");
                return objLJFF;
            }
            c830490Whz2 = c830490Whz;
        }
        c830490Whz.put(obj2, obj);
        C0I0B.LJFF.LIZIZ();
        C20684815ws.LJIILLIIL("click_create_group", c830490Whz2);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMGroupChatDetailAnalytics@1157.logClickCreateGroup$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
