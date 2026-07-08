package X;

import com.bytedance.scene.Scene;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05tK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.comment.IMShareCommentTemplateAnalytics$trackClickMentionCommentMessage$1", f = "IMShareCommentTemplateAnalytics.kt", l = {}, m = "invokeSuspend")
public final class C1495605tK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC1493105sv LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1495605tK(InterfaceC1493105sv interfaceC1493105sv, String str, String str2, String str3, String str4, String str5, String str6, InterfaceC1364105Vn<? super C1495605tK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC1493105sv;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = str4;
        this.LLILZLL = str5;
        this.LLIZ = str6;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1495605tK(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMShareCommentTemplateAnalytics@de2.trackClickMentionCommentMessage$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String str = this.LLILLJJLI;
        String str2 = this.LLILLL;
        String str3 = this.LLILZ;
        String str4 = this.LLILZIL;
        String str5 = this.LLILZLL;
        String str6 = this.LLIZ;
        C13DA c13da = new C13DA();
        c13da.put("comment_item_id", str);
        c13da.put("from_comment_id", str2);
        c13da.put("conversation_id", str3);
        c13da.put("from_user_id", str4);
        c13da.put("enter_from", str5);
        c13da.put(Scene.SCENE_SERVICE, str6);
        this.LL.sendEvent("click_mention_comment_message", c13da.build());
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMShareCommentTemplateAnalytics@de2.trackClickMentionCommentMessage$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
