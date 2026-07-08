package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.1A1g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.quickchat.mob.UnifyQuickEmojiAnalytics$trackDmQuickReplyPanelShow$1", f = "UnifyQuickEmojiAnalytics.kt", l = {}, m = "invokeSuspend")
public final class C2172661A1g extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC1493105sv LL;
    public final /* synthetic */ EnumC2172611A1b LLILLJJLI;
    public final /* synthetic */ EnumC913000Zrm LLILLL;
    public final /* synthetic */ C0ZH1 LLILZ;
    public final /* synthetic */ EnumC456270Hur LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ C0S2U LLIZLLLIL;
    public final /* synthetic */ EnumC913010Zrn LLJ;
    public final /* synthetic */ C0S2R LLJI;
    public final /* synthetic */ String LLJIJIL;
    public final /* synthetic */ boolean LLJILJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2172661A1g(InterfaceC1493105sv interfaceC1493105sv, EnumC2172611A1b enumC2172611A1b, EnumC913000Zrm enumC913000Zrm, C0ZH1 c0zh1, EnumC456270Hur enumC456270Hur, int i, int i2, C0S2U c0s2u, EnumC913010Zrn enumC913010Zrn, C0S2R c0s2r, String str, boolean z, InterfaceC1364105Vn<? super C2172661A1g> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC1493105sv;
        this.LLILLJJLI = enumC2172611A1b;
        this.LLILLL = enumC913000Zrm;
        this.LLILZ = c0zh1;
        this.LLILZIL = enumC456270Hur;
        this.LLILZLL = i;
        this.LLIZ = i2;
        this.LLIZLLLIL = c0s2u;
        this.LLJ = enumC913010Zrn;
        this.LLJI = c0s2r;
        this.LLJIJIL = str;
        this.LLJILJIL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2172661A1g(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("UnifyQuickEmojiAnalytics@da92.trackDmQuickReplyPanelShow$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        EnumC2172611A1b enumC2172611A1b = this.LLILLJJLI;
        EnumC913000Zrm enumC913000Zrm = this.LLILLL;
        C0ZH1 c0zh1 = this.LLILZ;
        EnumC456270Hur enumC456270Hur = this.LLILZIL;
        int i = this.LLILZLL;
        int i2 = this.LLIZ;
        C0S2U c0s2u = this.LLIZLLLIL;
        EnumC913010Zrn enumC913010Zrn = this.LLJ;
        C0S2R c0s2r = this.LLJI;
        String str2 = this.LLJIJIL;
        boolean z = this.LLJILJIL;
        C13DA c13da = new C13DA();
        c13da.put("enter_from", enumC2172611A1b.getEtString());
        c13da.put("enter_method", enumC913000Zrm.getEtString());
        c13da.put("item_type", c0zh1.getEtString());
        c13da.put("tab_num", String.valueOf(enumC456270Hur.getEtNumber()));
        c13da.put("tab_name", enumC456270Hur.getEtString());
        c13da.put("emoji_num", String.valueOf(i));
        c13da.put("avatar_num", String.valueOf(i2));
        c13da.put("trigger_reason", c0s2u.getEtString());
        c13da.put("parent_enter_method", enumC913010Zrn.getEtString());
        c13da.put("chat_type", c0s2r.getEtString());
        c13da.put("group_id", str2);
        if (enumC456270Hur == EnumC456270Hur.AVATAR) {
            if (z) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            c13da.put("has_ugc_sa", str);
        }
        this.LL.sendEvent("ttsocial_dm_quick_reply_panel_show", c13da.build());
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("UnifyQuickEmojiAnalytics@da92.trackDmQuickReplyPanelShow$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
