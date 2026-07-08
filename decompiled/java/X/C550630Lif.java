package X;

import Y.AgS100S1100000_8;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitImageUploadResult;
import com.ss.android.ugc.aweme.portrait.service.AIPortraitFileServiceImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Lif, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.portrait.service.AIPortraitFileServiceImpl$observeUploadResult$1", f = "AIPortraitFileServiceImpl.kt", l = {102, 103}, m = "invokeSuspend")
public final class C550630Lif extends C09AX implements Function2<InterfaceC346701Wf<? super AIPortraitImageUploadResult>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ AIPortraitFileServiceImpl LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C550630Lif(AIPortraitFileServiceImpl aIPortraitFileServiceImpl, String str, InterfaceC1364105Vn<? super C550630Lif> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = aIPortraitFileServiceImpl;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C550630Lif c550630Lif = new C550630Lif(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c550630Lif.LLILLJJLI = obj;
        return c550630Lif;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC346701Wf interfaceC346701Wf;
        C1C7U.LIZ("AIPortraitFileServiceImpl@545c.observeUploadResult$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("AIPortraitFileServiceImpl@545c.observeUploadResult$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC346701Wf = (InterfaceC346701Wf) this.LLILLJJLI;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC346701Wf = (InterfaceC346701Wf) this.LLILLJJLI;
            AIPortraitImageUploadResult aIPortraitImageUploadResult = this.LLILLL.LIZLLL.get(this.LLILZ);
            if (aIPortraitImageUploadResult != null) {
                this.LLILLJJLI = interfaceC346701Wf;
                this.LL = 1;
                if (interfaceC346701Wf.emit(aIPortraitImageUploadResult, this) == objLJFF) {
                    C1C7U.LIZIZ("AIPortraitFileServiceImpl@545c.observeUploadResult$1");
                    return objLJFF;
                }
            }
        }
        final C2252331DDr c2252331DDr = this.LLILLL.LIZJ;
        final String str = this.LLILZ;
        InterfaceC346201Wa<AIPortraitImageUploadResult> interfaceC346201Wa = new InterfaceC346201Wa<AIPortraitImageUploadResult>() { // from class: X.0Lih
            @Override // X.InterfaceC346201Wa
            public final Object collect(InterfaceC346701Wf<? super AIPortraitImageUploadResult> interfaceC346701Wf2, InterfaceC1364105Vn interfaceC1364105Vn) {
                Object objCollect = c2252331DDr.collect(new AgS100S1100000_8(interfaceC346701Wf2, str, 2), interfaceC1364105Vn);
                if (objCollect == C099R.LJFF()) {
                    return objCollect;
                }
                return Unit.LIZ;
            }
        };
        this.LLILLJJLI = null;
        this.LL = 2;
        if (C09IC.LJIILLIIL(this, interfaceC346201Wa, interfaceC346701Wf) == objLJFF) {
            C1C7U.LIZIZ("AIPortraitFileServiceImpl@545c.observeUploadResult$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("AIPortraitFileServiceImpl@545c.observeUploadResult$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC346701Wf<? super AIPortraitImageUploadResult> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC346701Wf, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
