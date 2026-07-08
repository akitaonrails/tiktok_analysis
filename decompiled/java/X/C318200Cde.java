package X;

import com.ss.android.ugc.aweme.effectcreator.models.CKEDraftInfo;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.MyEffectsViewModel;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.DraftEffect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cde, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.MyEffectsViewModel$fetchDraftEffects$2$deferredDraftList$1$deferred$1", f = "MyEffectsViewModel.kt", l = {303}, m = "invokeSuspend")
public final class C318200Cde extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super DraftEffect>, Object> {
    public int LL;
    public final /* synthetic */ MyEffectsViewModel LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ CKEDraftInfo LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C318200Cde(CKEDraftInfo cKEDraftInfo, MyEffectsViewModel myEffectsViewModel, String str, InterfaceC1364105Vn interfaceC1364105Vn, boolean z) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = myEffectsViewModel;
        this.LLILLL = str;
        this.LLILZ = z;
        this.LLILZIL = cKEDraftInfo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C318200Cde(this.LLILZIL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn, this.LLILZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("MyEffectsViewModel@4e1b.fetchDraftEffects$2$deferredDraftList$1$deferred$1");
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
            MyEffectsViewModel myEffectsViewModel = this.LLILLJJLI;
            String str = this.LLILLL;
            boolean z = this.LLILZ;
            CKEDraftInfo cKEDraftInfo = this.LLILZIL;
            this.LL = 1;
            myEffectsViewModel.getClass();
            obj = C23250099c.LJI(this, C0PEM.LIZJ, new C1643480sry(cKEDraftInfo, myEffectsViewModel, str, null, z));
            if (obj == objLJFF) {
                C1C7U.LIZIZ("MyEffectsViewModel@4e1b.fetchDraftEffects$2$deferredDraftList$1$deferred$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("MyEffectsViewModel@4e1b.fetchDraftEffects$2$deferredDraftList$1$deferred$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super DraftEffect> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
