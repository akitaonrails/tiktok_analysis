package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.1A1h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.quickchat.mob.UnifyQuickEmojiAnalytics$trackDmQuickReplyInputBtnShow$1", f = "UnifyQuickEmojiAnalytics.kt", l = {}, m = "invokeSuspend")
public final class C2172671A1h extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC1493105sv LL;
    public final /* synthetic */ EnumC2172611A1b LLILLJJLI;
    public final /* synthetic */ EnumC913000Zrm LLILLL;
    public final /* synthetic */ C0ZH1 LLILZ;
    public final /* synthetic */ C0S2U LLILZIL;
    public final /* synthetic */ EnumC913010Zrn LLILZLL;
    public final /* synthetic */ C0S2R LLIZ;
    public final /* synthetic */ String LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2172671A1h(InterfaceC1493105sv interfaceC1493105sv, EnumC2172611A1b enumC2172611A1b, EnumC913000Zrm enumC913000Zrm, C0ZH1 c0zh1, C0S2U c0s2u, EnumC913010Zrn enumC913010Zrn, C0S2R c0s2r, String str, InterfaceC1364105Vn<? super C2172671A1h> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC1493105sv;
        this.LLILLJJLI = enumC2172611A1b;
        this.LLILLL = enumC913000Zrm;
        this.LLILZ = c0zh1;
        this.LLILZIL = c0s2u;
        this.LLILZLL = enumC913010Zrn;
        this.LLIZ = c0s2r;
        this.LLIZLLLIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2172671A1h(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UnifyQuickEmojiAnalytics@da92.trackDmQuickReplyInputBtnShow$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        EnumC2172611A1b enumC2172611A1b = this.LLILLJJLI;
        EnumC913000Zrm enumC913000Zrm = this.LLILLL;
        C0ZH1 c0zh1 = this.LLILZ;
        C0S2U c0s2u = this.LLILZIL;
        EnumC913010Zrn enumC913010Zrn = this.LLILZLL;
        C0S2R c0s2r = this.LLIZ;
        String str = this.LLIZLLLIL;
        C13DA c13da = new C13DA();
        c13da.put("enter_from", enumC2172611A1b.getEtString());
        c13da.put("enter_method", enumC913000Zrm.getEtString());
        c13da.put("item_type", c0zh1.getEtString());
        c13da.put("trigger_reason", c0s2u.getEtString());
        c13da.put("parent_enter_method", enumC913010Zrn.getEtString());
        c13da.put("chat_type", c0s2r.getEtString());
        c13da.put("group_id", str);
        this.LL.sendEvent("ttsocial_dm_quick_reply_input_btn_show", c13da.build());
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("UnifyQuickEmojiAnalytics@da92.trackDmQuickReplyInputBtnShow$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
