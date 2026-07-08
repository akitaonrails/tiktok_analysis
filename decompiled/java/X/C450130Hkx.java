package X;

import com.ss.android.ugc.aweme.im.sticker.api.model.StickerSetInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Hkx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sticker.basic.repo.BasicStickerRepository$useStickerSet$1", f = "BasicStickerRepository.kt", l = {200}, m = "invokeSuspend")
public final class C450130Hkx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C450100Hku LLILLJJLI;
    public final /* synthetic */ StickerSetInfo LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C450130Hkx(C450100Hku c450100Hku, StickerSetInfo stickerSetInfo, InterfaceC1364105Vn<? super C450130Hkx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c450100Hku;
        this.LLILLL = stickerSetInfo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C450130Hkx(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BasicStickerRepository@45d8.useStickerSet$1");
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
            C2252331DDr c2252331DDr = this.LLILLJJLI.LIZJ;
            StickerSetInfo stickerSetInfo = this.LLILLL;
            this.LL = 1;
            if (c2252331DDr.emit(stickerSetInfo, this) == objLJFF) {
                C1C7U.LIZIZ("BasicStickerRepository@45d8.useStickerSet$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BasicStickerRepository@45d8.useStickerSet$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
