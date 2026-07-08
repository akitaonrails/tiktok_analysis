package X;

import android.content.Context;
import android.net.Uri;
import com.ss.android.ugc.aweme.EffectImgCreator$Output;
import com.ss.android.ugc.aweme.data.IconSelectData;
import com.ss.android.ugc.aweme.prop.mobileefffect.EditImageEffectImgCreatorData;
import com.ss.android.ugc.aweme.publish.EffectMobilePublishVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS605S0100000_26;
import njp.a;

/* JADX INFO: renamed from: X.0vIx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.publish.EffectMobilePublishVM$autoGenIcon$2", f = "EffectMobilePublishVM.kt", l = {248}, m = "invokeSuspend")
public final class C1737090vIx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ EffectMobilePublishVM LLILLL;
    public final /* synthetic */ EnumC1736950vIj LLILZ;
    public final /* synthetic */ Context LLILZIL;
    public final /* synthetic */ AbstractC1557100qce LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1737090vIx(EffectMobilePublishVM effectMobilePublishVM, EnumC1736950vIj enumC1736950vIj, Context context, AbstractC1557100qce abstractC1557100qce, InterfaceC1364105Vn<? super C1737090vIx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = effectMobilePublishVM;
        this.LLILZ = enumC1736950vIj;
        this.LLILZIL = context;
        this.LLILZLL = abstractC1557100qce;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1737090vIx(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        EnumC1737340vJM enumC1737340vJM;
        Object objLJIJ = obj;
        C1C7U.LIZ("EffectMobilePublishVM@cb08.autoGenIcon$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLJIJ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJIJ);
            EffectMobilePublishVM effectMobilePublishVM = this.LLILLL;
            Context context = this.LLILZIL;
            AbstractC1557100qce abstractC1557100qce = this.LLILZLL;
            this.LL = context;
            this.LLILLJJLI = 1;
            final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
            c2252611DEt.LJIJJ();
            InterfaceC1737080vIw interfaceC1737080vIw = (InterfaceC1737080vIw) effectMobilePublishVM.LLIZ.getValue();
            if (interfaceC1737080vIw != null) {
                interfaceC1737080vIw.LJ(context, abstractC1557100qce, new InterfaceC1737610vJn() { // from class: X.0vJF
                    @Override // X.InterfaceC1737610vJn
                    public final void LIZ() {
                        InterfaceC20236714Gf<EffectImgCreator$Output> interfaceC20236714Gf = c2252611DEt;
                        C189200o6.m2constructorimpl(null);
                        interfaceC20236714Gf.resumeWith(null);
                    }

                    @Override // X.InterfaceC1737610vJn
                    public final void LIZIZ(EffectImgCreator$Output effectImgCreator$Output) {
                        InterfaceC20236714Gf<EffectImgCreator$Output> interfaceC20236714Gf = c2252611DEt;
                        C189200o6.m2constructorimpl(effectImgCreator$Output);
                        interfaceC20236714Gf.resumeWith(effectImgCreator$Output);
                    }
                });
            }
            objLJIJ = c2252611DEt.LJIJ();
            if (objLJIJ == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (objLJIJ == objLJFF) {
                C1C7U.LIZIZ("EffectMobilePublishVM@cb08.autoGenIcon$2");
                return objLJFF;
            }
        }
        EffectImgCreator$Output effectImgCreator$Output = (EffectImgCreator$Output) objLJIJ;
        EffectMobilePublishVM effectMobilePublishVM2 = this.LLILLL;
        EnumC1736950vIj enumC1736950vIj = this.LLILZ;
        effectMobilePublishVM2.getClass();
        if (effectImgCreator$Output != null) {
            Uri uri = effectImgCreator$Output.effectIconUri;
            String str = effectImgCreator$Output.effectIconId;
            IconSelectData iconSelectData = effectImgCreator$Output.originIconData;
            if (iconSelectData != null) {
                enumC1737340vJM = iconSelectData.selectType;
            } else {
                enumC1737340vJM = null;
            }
            effectMobilePublishVM2.IQ2(uri, new EditImageEffectImgCreatorData(str, true, enumC1737340vJM, enumC1736950vIj, 0, 48));
        } else {
            effectMobilePublishVM2.setState(new AwS605S0100000_26(enumC1736950vIj, 470));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EffectMobilePublishVM@cb08.autoGenIcon$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
