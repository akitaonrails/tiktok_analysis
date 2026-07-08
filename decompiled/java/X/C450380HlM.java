package X;

import android.view.View;
import com.ss.android.ugc.aweme.im.sticker.basic.stickerstore.BasicStickerStoreHelper;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HlM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sticker.basic.stickerstore.BasicStickerStoreHelper$removeFavSticker$3$1", f = "BasicStickerStoreHelper.kt", l = {}, m = "invokeSuspend")
public final class C450380HlM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC450440HlS LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Long LLILLL;
    public final /* synthetic */ View LLILZ;
    public final /* synthetic */ Integer LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C450380HlM(InterfaceC450440HlS interfaceC450440HlS, String str, Long l, View view, Integer num, InterfaceC1364105Vn<? super C450380HlM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC450440HlS;
        this.LLILLJJLI = str;
        this.LLILLL = l;
        this.LLILZ = view;
        this.LLILZIL = num;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C450380HlM(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int iIntValue;
        Long l;
        C1C7U.LIZ("BasicStickerStoreHelper@bf0d.removeFavSticker$3$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC450440HlS interfaceC450440HlS = this.LL;
        if (interfaceC450440HlS != null) {
            interfaceC450440HlS.LIZ(null);
        }
        String string = this.LLILLJJLI;
        if (string != null || ((l = this.LLILLL) != null && l.longValue() != 0 && (string = l.toString()) != null)) {
            BasicStickerStoreHelper.LIZLLL.LJI().removeFavouriteSticker(string);
        }
        BasicStickerStoreHelper basicStickerStoreHelper = BasicStickerStoreHelper.LIZLLL;
        View view = this.LLILZ;
        Integer num = this.LLILZIL;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 2131848857;
        }
        basicStickerStoreHelper.getClass();
        BasicStickerStoreHelper.LJII(iIntValue, view);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BasicStickerStoreHelper@bf0d.removeFavSticker$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
