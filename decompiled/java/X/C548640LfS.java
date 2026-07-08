package X;

import android.content.Context;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LfS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.portrait.generate.component.AIPortraitGenerationDraftComponent$saveDraft$1", f = "AIPortraitGenerationDraftComponent.kt", l = {89}, m = "invokeSuspend")
public final class C548640LfS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C548630LfR LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C548640LfS(C548630LfR c548630LfR, Context context, String str, InterfaceC1364105Vn<? super C548640LfS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c548630LfR;
        this.LLILLL = context;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C548640LfS(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objZ1;
        C1C7U.LIZ("AIPortraitGenerationDraftComponent@2dc5.saveDraft$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
                objZ1 = ((C189200o6) obj).m10unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C548630LfR c548630LfR = this.LLILLJJLI;
            c548630LfR.LLILZLL = c548630LfR.c3(this.LLILLL);
            CreativeLoadingDialog creativeLoadingDialog = this.LLILLJJLI.LLILZLL;
            if (creativeLoadingDialog != null) {
                creativeLoadingDialog.show();
            }
            C548630LfR c548630LfR2 = this.LLILLJJLI;
            String str = this.LLILZ;
            this.LL = 1;
            objZ1 = c548630LfR2.Z1(str, this);
            if (objZ1 == objLJFF) {
                C1C7U.LIZIZ("AIPortraitGenerationDraftComponent@2dc5.saveDraft$1");
                return objLJFF;
            }
        }
        if (C189200o6.m8isSuccessimpl(objZ1)) {
            this.LLILLJJLI.L1(2131826226);
            CreativeLoadingDialog creativeLoadingDialog2 = this.LLILLJJLI.LLILZLL;
            if (creativeLoadingDialog2 != null) {
                creativeLoadingDialog2.dismiss();
            }
            InterfaceC548670LfV interfaceC548670LfVW2 = this.LLILLJJLI.W2();
            if (interfaceC548670LfVW2 != null) {
                interfaceC548670LfVW2.TH0();
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AIPortraitGenerationDraftComponent@2dc5.saveDraft$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
