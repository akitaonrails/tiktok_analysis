package X;

import com.bytedance.effectcreatormobile.infrastructure.effectplatform.api.AssetsLibData;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uU7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.bytedance.effectcreatormobile.infrastructure.effectplatform.impl.StickerResProvider$preload$1$1$1$preloadListDeferred$1$1$1", f = "StickerResProvider.kt", l = {49}, m = "invokeSuspend")
public final class C1705570uU7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super AssetsLibData.AssetsLibCategory>, Object> {
    public int LL;
    public final /* synthetic */ C1705580uU8 LLILLJJLI;
    public final /* synthetic */ AssetsLibData.AssetsLibCategory LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1705570uU7(C1705580uU8 c1705580uU8, AssetsLibData.AssetsLibCategory assetsLibCategory, InterfaceC1364105Vn<? super C1705570uU7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1705580uU8;
        this.LLILLL = assetsLibCategory;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1705570uU7(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StickerResProvider@ef8d.preload$1$1$1$preloadListDeferred$1$1$1");
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
            C1705580uU8 c1705580uU8 = this.LLILLJJLI;
            String str = this.LLILLL.key;
            this.LL = 1;
            c1705580uU8.getClass();
            obj = C1705580uU8.LIZLLL(str, CardStruct.IStatusCode.DEFAULT, 0, false, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("StickerResProvider@ef8d.preload$1$1$1$preloadListDeferred$1$1$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("StickerResProvider@ef8d.preload$1$1$1$preloadListDeferred$1$1$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super AssetsLibData.AssetsLibCategory> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
