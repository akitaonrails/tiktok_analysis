package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.im.message.template.card.StickerTemplate;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.quoted.ui.DefaultQuotedMessageClickHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.069r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.quoted.ui.DefaultQuotedMessageClickHandler$openQuotedStickerPreviewSheet$1$1", f = "DefaultQuotedMessageClickHandler.kt", l = {}, m = "invokeSuspend")
public final class C15621069r extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ View LL;
    public final /* synthetic */ DefaultQuotedMessageClickHandler LLILLJJLI;
    public final /* synthetic */ C869590Y9l LLILLL;
    public final /* synthetic */ StickerTemplate LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15621069r(View view, DefaultQuotedMessageClickHandler defaultQuotedMessageClickHandler, C869590Y9l c869590Y9l, StickerTemplate stickerTemplate, InterfaceC1364105Vn<? super C15621069r> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = view;
        this.LLILLJJLI = defaultQuotedMessageClickHandler;
        this.LLILLL = c869590Y9l;
        this.LLILZ = stickerTemplate;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C15621069r(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C19EG c19egLIZIZ;
        C1C7U.LIZ("DefaultQuotedMessageClickHandler@b1e6.openQuotedStickerPreviewSheet$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Context context = this.LL.getContext();
        if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
            this.LLILLJJLI.LIZIZ().zM(this.LL, c19egLIZIZ, this.LLILLL, this.LLILZ);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("DefaultQuotedMessageClickHandler@b1e6.openQuotedStickerPreviewSheet$1$1");
            return unit;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("DefaultQuotedMessageClickHandler@b1e6.openQuotedStickerPreviewSheet$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
