package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0HJN, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.replytosticker.ReplyToStickerUtil$buildRequest$2", f = "ReplyToStickerUtil.kt", l = {128}, m = "invokeSuspend")
public final class C0HJN extends C09AX implements Function1<InterfaceC1364105Vn<? super List<? extends StickerItem>>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C869590Y9l LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HJN(C869590Y9l c869590Y9l, String str, String str2, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = c869590Y9l;
        this.LLILZ = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HJN(this.LLILLL, this.LLILLJJLI, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super List<? extends StickerItem>> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        C1C7U.LIZ("ReplyToStickerUtil@c6c1.buildRequest$2");
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
                int type = EnumC451180Hme.PHOTO_COMMENT_STICKER.getType();
                Long lLJIILIIL = C2095008Iq.LJIILIIL(this.LLILLJJLI);
                String str = this.LLILLJJLI;
                String conversationId = this.LLILLL.getConversationId();
                String str2 = this.LLILZ;
                this.LL = 1;
                obj = imStickerStoreService.LIZLLL(type, str, conversationId, lLJIILIIL, str2, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("ReplyToStickerUtil@c6c1.buildRequest$2");
                    return objLJFF;
                }
            }
            obj2 = (List) obj;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            obj2 = C13BV.INSTANCE;
        }
        C1C7U.LIZIZ("ReplyToStickerUtil@c6c1.buildRequest$2");
        return obj2;
    }
}
