package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.message.content.GifContent;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.gif.DefaultGifClickHandler;
import com.ss.android.ugc.aweme.im.service.automessage.IShareMessageHelper;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS546S0100000_2;
import njp.a;

/* JADX INFO: renamed from: X.068p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.gif.DefaultGifClickHandler$handleGifClick$3$1$1", f = "GifCardProtocol.kt", l = {}, m = "invokeSuspend")
public final class C15593068p extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ DefaultGifClickHandler LL;
    public final /* synthetic */ View LLILLJJLI;
    public final /* synthetic */ GifContent LLILLL;
    public final /* synthetic */ C869590Y9l LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15593068p(View view, C869590Y9l c869590Y9l, GifContent gifContent, DefaultGifClickHandler defaultGifClickHandler, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = defaultGifClickHandler;
        this.LLILLJJLI = view;
        this.LLILLL = gifContent;
        this.LLILZ = c869590Y9l;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        DefaultGifClickHandler defaultGifClickHandler = this.LL;
        return new C15593068p(this.LLILLJJLI, this.LLILZ, this.LLILLL, defaultGifClickHandler, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DefaultGifClickHandler@f6b6.handleGifClick$3$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        IShareMessageHelper.LIZ.getClass();
        IShareMessageHelper iShareMessageHelperLIZ = C069M.LIZ();
        if (iShareMessageHelperLIZ != null) {
            SessionInfo sessionInfo = this.LL.LL;
            Context context = this.LLILLJJLI.getContext();
            GifContent gifContent = this.LLILLL;
            if (gifContent != null) {
                gifContent.setRefVideo(null);
            }
            iShareMessageHelperLIZ.LIZ(sessionInfo, context, gifContent, null, this.LLILZ, "sticker_pop_up", "chat", true, new AwS546S0100000_2(this.LL, 553));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DefaultGifClickHandler@f6b6.handleGifClick$3$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
