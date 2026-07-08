package X;

import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HsD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.gif.GifCardProtocolKt$buildGifFavouriteAction$1$1", f = "GifCardProtocol.kt", l = {284}, m = "invokeSuspend")
public final class C454630HsD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ View LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C454630HsD(View view, String str, int i, InterfaceC1364105Vn<? super C454630HsD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = view;
        this.LLILLL = str;
        this.LLILZ = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C454630HsD(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GifCardProtocolKt@f0b4.buildGifFavouriteAction$1$1");
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
            C454640HsE c454640HsE = IMStickerApi.LIZ;
            View view = this.LLILLJJLI;
            IMStickerApi iMStickerApiLIZ = c454640HsE.LIZ();
            if (iMStickerApiLIZ == null) {
                if (C457760HxG.LIZJ()) {
                    HandlerHook.viewPost(view, new RunnableC1413105g1(view));
                }
                iMStickerApiLIZ = C453610HqZ.LIZIZ;
            }
            InterfaceC447740Hh6 imStickerStoreService = iMStickerApiLIZ.getImStickerStoreService();
            int value = C0IBD.StickerCreateScene_Unknown.getValue();
            EnumC441530HTb enumC441530HTb = EnumC441530HTb.TOP;
            View view2 = this.LLILLJJLI;
            String str = this.LLILLL;
            int i2 = this.LLILZ;
            this.LL = 1;
            if (imStickerStoreService.LJJIIZ("reaction_view_store_button", view2, 0L, str, i2, null, null, null, false, value, null, null, enumC441530HTb, false, this) == objLJFF) {
                C1C7U.LIZIZ("GifCardProtocolKt@f0b4.buildGifFavouriteAction$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GifCardProtocolKt@f0b4.buildGifFavouriteAction$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
