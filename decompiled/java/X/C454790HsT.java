package X;

import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HsT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.mesagelist.MessageListFooterViewModel$tryToMapAiStickersWithExpression$list$1", f = "MessageListFooterViewModel.kt", l = {}, m = "invokeSuspend")
public final class C454790HsT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends StickerItem>>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C454790HsT(String str, String str2, InterfaceC1364105Vn<? super C454790HsT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C454790HsT(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MessageListFooterViewModel@60fe.tryToMapAiStickersWithExpression$list$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<StickerItem> listLJIIZILJ = IMStickerApi.LIZ.LIZIZ().getImSocialAvatarService().LJIIZILJ(this.LL, this.LLILLJJLI);
        if (listLJIIZILJ == null) {
            listLJIIZILJ = C13BV.INSTANCE;
        }
        C1C7U.LIZIZ("MessageListFooterViewModel@60fe.tryToMapAiStickersWithExpression$list$1");
        return listLJIIZILJ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends StickerItem>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
