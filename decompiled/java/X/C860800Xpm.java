package X;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.ss.android.ugc.aweme.component.bio.biometric.enroll.BioEnrollFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xpm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.component.bio.biometric.enroll.BioEnrollFragment$onViewCreated$16", f = "BioEnrollFragment.kt", l = {475}, m = "invokeSuspend")
public final class C860800Xpm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ BioEnrollFragment LLILLJJLI;
    public final /* synthetic */ C1715930ukp LLILLL;
    public final /* synthetic */ Context LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C860800Xpm(BioEnrollFragment bioEnrollFragment, C1715930ukp c1715930ukp, Context context, InterfaceC1364105Vn<? super C860800Xpm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = bioEnrollFragment;
        this.LLILLL = c1715930ukp;
        this.LLILZ = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C860800Xpm(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BioEnrollFragment@fcc.onViewCreated$16");
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
            Lifecycle lifecycle = this.LLILLJJLI.getViewLifecycleOwner().getLifecycle();
            Lifecycle.State state = Lifecycle.State.RESUMED;
            C860810Xpn c860810Xpn = new C860810Xpn(this.LLILLJJLI, this.LLILLL, this.LLILZ, null);
            this.LL = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycle, state, c860810Xpn, this) == objLJFF) {
                C1C7U.LIZIZ("BioEnrollFragment@fcc.onViewCreated$16");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BioEnrollFragment@fcc.onViewCreated$16");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
