package X;

import android.view.View;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import com.ss.android.ugc.aweme.im.sticker.basic.stickerstore.BasicStickerStoreHelper;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HlN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sticker.basic.stickerstore.BasicStickerStoreHelper$addFavSticker$3$1", f = "BasicStickerStoreHelper.kt", l = {}, m = "invokeSuspend")
public final class C450390HlN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC450440HlS LL;
    public final /* synthetic */ StickerItem LLILLJJLI;
    public final /* synthetic */ View LLILLL;
    public final /* synthetic */ Integer LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C450390HlN(InterfaceC450440HlS interfaceC450440HlS, StickerItem stickerItem, View view, Integer num, InterfaceC1364105Vn<? super C450390HlN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC450440HlS;
        this.LLILLJJLI = stickerItem;
        this.LLILLL = view;
        this.LLILZ = num;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C450390HlN(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int iIntValue;
        C1C7U.LIZ("BasicStickerStoreHelper@bf0d.addFavSticker$3$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC450440HlS interfaceC450440HlS = this.LL;
        if (interfaceC450440HlS != null) {
            interfaceC450440HlS.LIZ(this.LLILLJJLI);
        }
        StickerItem stickerItem = this.LLILLJJLI;
        if (stickerItem != null) {
            BasicStickerStoreHelper.LIZLLL.LJI().addFavouriteSticker(stickerItem);
        }
        BasicStickerStoreHelper basicStickerStoreHelper = BasicStickerStoreHelper.LIZLLL;
        View view = this.LLILLL;
        Integer num = this.LLILZ;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 2131848838;
        }
        basicStickerStoreHelper.getClass();
        BasicStickerStoreHelper.LJII(iIntValue, view);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BasicStickerStoreHelper@bf0d.addFavSticker$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
