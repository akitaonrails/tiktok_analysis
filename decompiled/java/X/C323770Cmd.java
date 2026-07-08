package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.prop.presenter.MobileEffectViewModel;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cmd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.prop.fragment.ame.StickerPropEditHelperKt$launchNewEffectEditScreen$1", f = "StickerPropEditHelper.kt", l = {107, 113}, m = "invokeSuspend")
public final class C323770Cmd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MobileEffectViewModel LLILLJJLI;
    public final /* synthetic */ NewFaceStickerBean LLILLL;
    public final /* synthetic */ Fragment LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C323770Cmd(MobileEffectViewModel mobileEffectViewModel, NewFaceStickerBean newFaceStickerBean, Fragment fragment, Function0<Unit> function0, InterfaceC1364105Vn<? super C323770Cmd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = mobileEffectViewModel;
        this.LLILLL = newFaceStickerBean;
        this.LLILZ = fragment;
        this.LLILZIL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C323770Cmd(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLJIJ = obj;
        C1C7U.LIZ("StickerPropEditHelperKt@fc16.launchNewEffectEditScreen$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(objLJIJ);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("StickerPropEditHelperKt@fc16.launchNewEffectEditScreen$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(objLJIJ);
        } else {
            C155000ia.LIZIZ(objLJIJ);
            this.LLILLJJLI.vQ2(true);
            NewFaceStickerBean newFaceStickerBean = this.LLILLL;
            this.LL = 1;
            C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
            c2252611DEt.LJIJJ();
            C844470XAv.LIZ.getClass();
            C1633850scR.LIZ(C844470XAv.LIZ(), null).LJIIZILJ(newFaceStickerBean.effectId, null, new C513301zH(c2252611DEt, 4));
            objLJIJ = c2252611DEt.LJIJ();
            if (objLJIJ == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (objLJIJ == objLJFF) {
                C1C7U.LIZIZ("StickerPropEditHelperKt@fc16.launchNewEffectEditScreen$1");
                return objLJFF;
            }
        }
        Effect effect = (Effect) objLJIJ;
        if (effect == null) {
            this.LLILLJJLI.vQ2(false);
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("StickerPropEditHelperKt@fc16.launchNewEffectEditScreen$1");
            return unit2;
        }
        this.LLILLJJLI.vQ2(false);
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C1738310vKv c1738310vKv = new C1738310vKv(this.LLILZ, this.LLILLL, effect, this.LLILZIL, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c1738310vKv) == objLJFF) {
            C1C7U.LIZIZ("StickerPropEditHelperKt@fc16.launchNewEffectEditScreen$1");
            return objLJFF;
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("StickerPropEditHelperKt@fc16.launchNewEffectEditScreen$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
