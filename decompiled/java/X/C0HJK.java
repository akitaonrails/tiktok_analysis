package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0HJK, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.replytosticker.ReplyToStickerUtil$buildRequest$1", f = "ReplyToStickerUtil.kt", l = {71}, m = "invokeSuspend")
public final class C0HJK extends C09AX implements Function1<InterfaceC1364105Vn<? super List<? extends StickerItem>>, Object> {
    public int LL;
    public final /* synthetic */ Integer LLILLJJLI;
    public final /* synthetic */ C259800zU<Long> LLILLL;
    public final /* synthetic */ C259800zU<String> LLILZ;
    public final /* synthetic */ C869590Y9l LLILZIL;
    public final /* synthetic */ C259800zU<String> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HJK(Integer num, C259800zU<Long> c259800zU, C259800zU<String> c259800zU2, C869590Y9l c869590Y9l, C259800zU<String> c259800zU3, InterfaceC1364105Vn<? super C0HJK> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = num;
        this.LLILLL = c259800zU;
        this.LLILZ = c259800zU2;
        this.LLILZIL = c869590Y9l;
        this.LLILZLL = c259800zU3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HJK(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super List<? extends StickerItem>> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        C1C7U.LIZ("ReplyToStickerUtil@c6c1.buildRequest$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                InterfaceC447740Hh6 imStickerStoreService = IMStickerApi.LIZ.LIZIZ().getImStickerStoreService();
                int iIntValue = this.LLILLJJLI.intValue();
                Long l = this.LLILLL.element;
                String str = this.LLILZ.element;
                String conversationId = this.LLILZIL.getConversationId();
                String str2 = this.LLILZLL.element;
                this.LL = 1;
                obj = imStickerStoreService.LIZLLL(iIntValue, str, conversationId, l, str2, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("ReplyToStickerUtil@c6c1.buildRequest$1");
                    return objLJFF;
                }
            }
            obj2 = (List) obj;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            obj2 = C13BV.INSTANCE;
        }
        C1C7U.LIZIZ("ReplyToStickerUtil@c6c1.buildRequest$1");
        return obj2;
    }
}
