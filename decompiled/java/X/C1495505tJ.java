package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05tJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.quickchat.mob.UnifyQuickEmojiAnalytics$trackRecommendResult$1", f = "UnifyQuickEmojiAnalytics.kt", l = {}, m = "invokeSuspend")
public final class C1495505tJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC1493105sv LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1495505tJ(InterfaceC1493105sv interfaceC1493105sv, boolean z, int i, boolean z2, String str, InterfaceC1364105Vn<? super C1495505tJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC1493105sv;
        this.LLILLJJLI = z;
        this.LLILLL = i;
        this.LLILZ = z2;
        this.LLILZIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1495505tJ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        C1C7U.LIZ("UnifyQuickEmojiAnalytics@da92.trackRecommendResult$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        boolean z = this.LLILLJJLI;
        int i = this.LLILLL;
        boolean z2 = this.LLILZ;
        String str = this.LLILZIL;
        C13DA c13da = new C13DA();
        String str2 = "1";
        if (z) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        c13da.put("success", obj2);
        c13da.put("sticker_count", String.valueOf(i));
        if (!z2) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c13da.put("is_fallback", str2);
        c13da.put("group_id", str);
        this.LL.sendEvent("story_reply_sa_recommend_result", c13da.build());
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("UnifyQuickEmojiAnalytics@da92.trackRecommendResult$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
