package X;

import android.view.View;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.generatingpage.MixStudioGeneratingPageAssem;
import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioStatusRepository;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.01nN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.generatingpage.MixStudioGeneratingPageAssem$onViewCreated$7", f = "MixStudioGeneratingPageAssem.kt", l = {438}, m = "invokeSuspend")
public final class C439501nN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MixStudioGeneratingPageAssem LLILLJJLI;
    public final /* synthetic */ View LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C439501nN(View view, MixStudioGeneratingPageAssem mixStudioGeneratingPageAssem, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = mixStudioGeneratingPageAssem;
        this.LLILLL = view;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C439501nN(this.LLILLL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C05YD<AbstractC440540HPg> taskStatus;
        C1C7U.LIZ("MixStudioGeneratingPageAssem@b2f1.onViewCreated$7");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            MixStudioStatusRepository mixStudioStatusRepository = (MixStudioStatusRepository) this.LLILLJJLI.LLJL.getValue();
            if (mixStudioStatusRepository != null && (taskStatus = mixStudioStatusRepository.getTaskStatus()) != null) {
                final View view = this.LLILLL;
                final MixStudioGeneratingPageAssem mixStudioGeneratingPageAssem = this.LLILLJJLI;
                InterfaceC346701Wf<? super AbstractC440540HPg> interfaceC346701Wf = new InterfaceC346701Wf() { // from class: X.01nM
                    @Override // X.InterfaceC346701Wf
                    public final Object emit(Object obj2, InterfaceC1364105Vn interfaceC1364105Vn) {
                        if (Intrinsics.LJFF(obj2, C440570HPj.LIZ)) {
                            C1DFH c1dfh = C0PEM.LIZ;
                            C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C439301nL(view, mixStudioGeneratingPageAssem, null), 3);
                        }
                        return Unit.LIZ;
                    }
                };
                this.LL = 1;
                if (taskStatus.collect(interfaceC346701Wf, this) == objLJFF) {
                    C1C7U.LIZIZ("MixStudioGeneratingPageAssem@b2f1.onViewCreated$7");
                    return objLJFF;
                }
            } else {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("MixStudioGeneratingPageAssem@b2f1.onViewCreated$7");
                return unit;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
