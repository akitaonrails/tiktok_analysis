package X;

import androidx.fragment.app.FragmentManager;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HTc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.util.StickerUtils$saveSticker$2$1$onFailed$2", f = "StickerUtils.kt", l = {}, m = "invokeSuspend")
public final class C441540HTc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ FragmentManager LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C441540HTc(FragmentManager fragmentManager, InterfaceC1364105Vn<? super C441540HTc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = fragmentManager;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C441540HTc(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StickerUtils@5e46.saveSticker$2$1$onFailed$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        FragmentManager fragmentManager = this.LL;
        C0HQV c0hqv = C0HQV.LIZ;
        c0hqv.getClass();
        c0hqv.getClass();
        fragmentManager.LLIIIILZ(C799520VXy.LIZ(new Pair("DOWNLOADED_RESULT", false)), "STICKER_RESULT");
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StickerUtils@5e46.saveSticker$2$1$onFailed$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
