package X;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioStatusRepository;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HI5, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.util.StickerUtils$saveSticker$2", f = "StickerUtils.kt", l = {}, m = "invokeSuspend")
public final class C0HI5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ StickerItem LLILLL;
    public final /* synthetic */ EnumC441640HTm LLILZ;
    public final /* synthetic */ FragmentManager LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HI5(String str, Context context, StickerItem stickerItem, EnumC441640HTm enumC441640HTm, FragmentManager fragmentManager, InterfaceC1364105Vn<? super C0HI5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = context;
        this.LLILLL = stickerItem;
        this.LLILZ = enumC441640HTm;
        this.LLILZIL = fragmentManager;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HI5(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StickerUtils@5e46.saveSticker$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1331670kl3 c1331670kl3LJI = C1331660kl2.LJI(UriProtector.parse(this.LL));
        c1331670kl3LJI.LJJIJL(this.LLILLJJLI);
        c1331670kl3LJI.LIZLLL("MixStudioShareViewModel");
        c1331670kl3LJI.LJIL = Bitmap.Config.ARGB_8888;
        final Context context = this.LLILLJJLI;
        final StickerItem stickerItem = this.LLILLL;
        final String str = this.LL;
        final EnumC441640HTm enumC441640HTm = this.LLILZ;
        final FragmentManager fragmentManager = this.LLILZIL;
        c1331670kl3LJI.LJIILJJIL(new AbstractC2350809Ja() { // from class: X.0HTe
            /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:30:0x00d8
                	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
                	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
                	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
                	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
                */
            @Override // X.InterfaceC605070NoH
            public final void LIZ(java.io.File r16) {
                /*
                    Method dump skipped, instruction units count: 473
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C441560HTe.LIZ(java.io.File):void");
            }

            @Override // X.InterfaceC605070NoH
            public final void onFailed(Throwable th) {
                C05YD<InterfaceC440090HNn> c05ydLIZ;
                InterfaceC440090HNn value;
                C0HQV.LIZ.getClass();
                MixStudioStatusRepository mixStudioStatusRepository = (MixStudioStatusRepository) C0HQV.LIZLLL.getValue();
                if (mixStudioStatusRepository != null && (c05ydLIZ = mixStudioStatusRepository.LIZ()) != null && (value = c05ydLIZ.getValue()) != null) {
                    EnumC441640HTm enumC441640HTm2 = enumC441640HTm;
                    C440370HOp.LIZ.getClass();
                    C440370HOp.LJIIJ(enumC441640HTm2, C440370HOp.LJIILIIL(value), EnumC440990HQz.DOWNLOAD_STICKER, null);
                }
                C0HQV.LIZIZ().LIZ("MixStudioShareViewModel", "sticker download failure");
                C1DFH c1dfh = C0PEM.LIZ;
                C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C441540HTc(fragmentManager, null), 3);
            }
        });
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StickerUtils@5e46.saveSticker$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
