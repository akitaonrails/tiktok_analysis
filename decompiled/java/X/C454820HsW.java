package X;

import com.ss.android.ugc.aweme.im.message.template.card.StickerTemplate;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.gif.DefaultStickerClickHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0HsW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.gif.DefaultStickerClickHandler$handleGeneralStickerTypeClick$2", f = "StoreStickerCardProtocol.kt", l = {1240}, m = "invokeSuspend")
public final class C454820HsW extends C09AX implements Function1<InterfaceC1364105Vn<? super String>, Object> {
    public int LL;
    public final /* synthetic */ DefaultStickerClickHandler LLILLJJLI;
    public final /* synthetic */ StickerTemplate LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C454820HsW(DefaultStickerClickHandler defaultStickerClickHandler, StickerTemplate stickerTemplate, InterfaceC1364105Vn<? super C454820HsW> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = defaultStickerClickHandler;
        this.LLILLL = stickerTemplate;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C454820HsW(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DefaultStickerClickHandler@2047.handleGeneralStickerTypeClick$2");
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
            DefaultStickerClickHandler defaultStickerClickHandler = this.LLILLJJLI;
            StickerTemplate stickerTemplate = this.LLILLL;
            this.LL = 1;
            obj = defaultStickerClickHandler.LIZ(stickerTemplate, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("DefaultStickerClickHandler@2047.handleGeneralStickerTypeClick$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("DefaultStickerClickHandler@2047.handleGeneralStickerTypeClick$2");
        return obj;
    }
}
