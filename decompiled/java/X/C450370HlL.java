package X;

import android.view.View;
import com.ss.android.ugc.aweme.im.sticker.basic.stickerstore.BasicStickerStoreHelper;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HlL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sticker.basic.stickerstore.BasicStickerStoreHelper$removeFavSticker$4$1", f = "BasicStickerStoreHelper.kt", l = {}, m = "invokeSuspend")
public final class C450370HlL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Throwable LL;
    public final /* synthetic */ InterfaceC450440HlS LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Long LLILZ;
    public final /* synthetic */ View LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C450370HlL(Throwable th, InterfaceC450440HlS interfaceC450440HlS, String str, Long l, View view, InterfaceC1364105Vn<? super C450370HlL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = th;
        this.LLILLJJLI = interfaceC450440HlS;
        this.LLILLL = str;
        this.LLILZ = l;
        this.LLILZIL = view;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C450370HlL(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int errorCode;
        Long l;
        C23112093u c23112093u;
        C1C7U.LIZ("BasicStickerStoreHelper@bf0d.removeFavSticker$4$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Throwable th = this.LL;
        if ((th instanceof C0XIR) && (c23112093u = (C23112093u) th) != null) {
            errorCode = c23112093u.getErrorCode();
        } else {
            errorCode = -1;
        }
        InterfaceC450440HlS interfaceC450440HlS = this.LLILLJJLI;
        if (interfaceC450440HlS != null) {
            interfaceC450440HlS.onFail(errorCode);
        }
        if (errorCode == 200002) {
            String string = this.LLILLL;
            if (string != null || ((l = this.LLILZ) != null && l.longValue() != 0 && (string = l.toString()) != null)) {
                BasicStickerStoreHelper.LIZLLL.LJI().removeFavouriteSticker(string);
            }
            BasicStickerStoreHelper basicStickerStoreHelper = BasicStickerStoreHelper.LIZLLL;
            View view = this.LLILZIL;
            basicStickerStoreHelper.getClass();
            BasicStickerStoreHelper.LJII(2131848857, view);
        } else {
            BasicStickerStoreHelper basicStickerStoreHelper2 = BasicStickerStoreHelper.LIZLLL;
            View view2 = this.LLILZIL;
            basicStickerStoreHelper2.getClass();
            BasicStickerStoreHelper.LJII(2131848866, view2);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BasicStickerStoreHelper@bf0d.removeFavSticker$4$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
