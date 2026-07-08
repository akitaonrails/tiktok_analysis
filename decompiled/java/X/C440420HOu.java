package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.resultspage.MixStudioResultsBaseAssem;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.resultspage.MixStudioResultsPageViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HOu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.resultspage.MixStudioResultsBaseAssem$discardGenerationDialog$1$3$1$1", f = "MixStudioResultsBaseAssem.kt", l = {504}, m = "invokeSuspend")
public final class C440420HOu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MixStudioResultsBaseAssem LLILLJJLI;
    public final /* synthetic */ Fragment LLILLL;
    public final /* synthetic */ Context LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C440420HOu(MixStudioResultsBaseAssem mixStudioResultsBaseAssem, Fragment fragment, Context context, InterfaceC1364105Vn<? super C440420HOu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = mixStudioResultsBaseAssem;
        this.LLILLL = fragment;
        this.LLILZ = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C440420HOu(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MixStudioResultsBaseAssem@327b.discardGenerationDialog$1$3$1$1");
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
            InterfaceC440090HNn interfaceC440090HNnOp = this.LLILLJJLI.op();
            if (interfaceC440090HNnOp != null) {
                MixStudioResultsBaseAssem mixStudioResultsBaseAssem = this.LLILLJJLI;
                C440370HOp c440370HOp = C440370HOp.LIZ;
                EnumC441640HTm enumC441640HTmVQ2 = mixStudioResultsBaseAssem.hp().vQ2();
                c440370HOp.getClass();
                C440370HOp.LJII(enumC441640HTmVQ2, C440370HOp.LJIILIIL(interfaceC440090HNnOp), EnumC440430HOv.DISCARD);
            }
            MixStudioResultsPageViewModel mixStudioResultsPageViewModelTp = this.LLILLJJLI.tp();
            this.LL = 1;
            obj = mixStudioResultsPageViewModelTp.vQ2(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("MixStudioResultsBaseAssem@327b.discardGenerationDialog$1$3$1$1");
                return objLJFF;
            }
        }
        if (!((Boolean) obj).booleanValue()) {
            InterfaceC440090HNn interfaceC440090HNnOp2 = this.LLILLJJLI.op();
            if (interfaceC440090HNnOp2 != null) {
                MixStudioResultsBaseAssem mixStudioResultsBaseAssem2 = this.LLILLJJLI;
                C440370HOp c440370HOp2 = C440370HOp.LIZ;
                EnumC441640HTm enumC441640HTmVQ22 = mixStudioResultsBaseAssem2.hp().vQ2();
                c440370HOp2.getClass();
                C440370HOp.LJIIJ(enumC441640HTmVQ22, C440370HOp.LJIILIIL(interfaceC440090HNnOp2), EnumC440990HQz.DOWNLOAD_STICKER, EnumC440400HOs.UPDATE_VISIBILITY);
            }
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C437501n3(this.LLILLL, this.LLILZ, null), 3);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MixStudioResultsBaseAssem@327b.discardGenerationDialog$1$3$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
