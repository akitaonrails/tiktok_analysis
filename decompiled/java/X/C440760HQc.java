package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.common.model.StickerBase;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HQc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.resultspage.v2.view.AliveButtonView$updateStickerVariantCache$2$1", f = "AliveButtonView.kt", l = {428}, m = "invokeSuspend")
public final class C440760HQc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public long LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ C440750HQb LLILZ;
    public final /* synthetic */ InterfaceC20236714Gf<Boolean> LLILZIL;
    public final /* synthetic */ int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C440760HQc(C440750HQb c440750HQb, InterfaceC20236714Gf<? super Boolean> interfaceC20236714Gf, int i, InterfaceC1364105Vn<? super C440760HQc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c440750HQb;
        this.LLILZIL = interfaceC20236714Gf;
        this.LLILZLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C440760HQc(this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        StickerItem stickerItem;
        StickerBase stickerBase;
        Long l;
        int i;
        long jLongValue;
        C1C7U.LIZ("AliveButtonView@476a.updateStickerVariantCache$2$1");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LLILLL;
        try {
        } catch (C0XIR e) {
            TryCatchGuardChecker.doCheck(e);
            this.LLILZ.getLogger().LIZ("AliveButtonView", "api switch attr fails");
            InterfaceC20236714Gf<Boolean> interfaceC20236714Gf = this.LLILZIL;
            C189200o6.m2constructorimpl(false);
            interfaceC20236714Gf.resumeWith(false);
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            this.LLILZ.getLogger().LIZ("AliveButtonView", "api fails due to other reasons");
            InterfaceC20236714Gf<Boolean> interfaceC20236714Gf2 = this.LLILZIL;
            C189200o6.m2constructorimpl(false);
            interfaceC20236714Gf2.resumeWith(false);
        }
        if (i2 != 0) {
            if (i2 == 1) {
                jLongValue = this.LLILLJJLI;
                i = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C440750HQb c440750HQb = this.LLILZ;
            C440830HQj c440830HQj = c440750HQb.LLILLL;
            if (c440830HQj != null && (stickerItem = c440830HQj.LIZ) != null && (stickerBase = stickerItem.stickerBase) != null && (l = stickerBase.id) != null) {
                i = this.LLILZLL;
                jLongValue = l.longValue();
                InterfaceC447740Hh6 stickerStoreService = c440750HQb.getStickerStoreService();
                int type = EnumC451180Hme.AIMOJI_STICKER_STATIC.getType();
                this.LL = i;
                this.LLILLJJLI = jLongValue;
                this.LLILLL = 1;
                if (stickerStoreService.LJ(type, jLongValue, i, null, this) == objLJFF) {
                    C1C7U.LIZIZ("AliveButtonView@476a.updateStickerVariantCache$2$1");
                    return objLJFF;
                }
            }
            InterfaceC20236714Gf<Boolean> interfaceC20236714Gf3 = this.LLILZIL;
            C189200o6.m2constructorimpl(true);
            interfaceC20236714Gf3.resumeWith(true);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("AliveButtonView@476a.updateStickerVariantCache$2$1");
            return unit;
        }
        C454640HsE c454640HsE = IMStickerApi.LIZ;
        c454640HsE.LIZIZ().getImSocialAvatarService().LIZIZ(i, jLongValue);
        c454640HsE.LIZIZ().getImSocialAvatarService().LJJIJIIJI(String.valueOf(jLongValue));
        InterfaceC20236714Gf<Boolean> interfaceC20236714Gf32 = this.LLILZIL;
        C189200o6.m2constructorimpl(true);
        interfaceC20236714Gf32.resumeWith(true);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("AliveButtonView@476a.updateStickerVariantCache$2$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
