package X;

import android.os.SystemClock;
import com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.MultiCoHostSearchFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0bB2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.MultiCoHostSearchFragment$initEditComponent$2$afterTextChanged$1", f = "MultiCoHostSearchFragment.kt", l = {498}, m = "invokeSuspend")
public final class C963380bB2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public int LLILLJJLI;
    public final /* synthetic */ MultiCoHostSearchFragment LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C963380bB2(MultiCoHostSearchFragment multiCoHostSearchFragment, String str, InterfaceC1364105Vn<? super C963380bB2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = multiCoHostSearchFragment;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C963380bB2(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long jElapsedRealtime;
        C1C7U.LIZ("MultiCoHostSearchFragment@3afc.initEditComponent$2$afterTextChanged$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        int i2 = 1;
        if (i != 0) {
            if (i == 1) {
                jElapsedRealtime = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            jElapsedRealtime = SystemClock.elapsedRealtime();
            C20441214yg.LJIIIZ("MultiCoHostSearchFrag", "search job start");
            this.LL = jElapsedRealtime;
            this.LLILLJJLI = 1;
            if (AnonymousClass0958.LIZIZ(500L, this) == objLJFF) {
                C1C7U.LIZIZ("MultiCoHostSearchFragment@3afc.initEditComponent$2$afterTextChanged$1");
                return objLJFF;
            }
        }
        MultiCoHostSearchFragment multiCoHostSearchFragment = this.LLILLL;
        if (multiCoHostSearchFragment.mStatusActive) {
            if (multiCoHostSearchFragment.LLJJJ) {
                i2 = 3;
            }
            multiCoHostSearchFragment.LLJJIJIL = i2;
            multiCoHostSearchFragment.LLJJJ = false;
            AbstractC960710b6j abstractC960710b6j = (AbstractC960710b6j) multiCoHostSearchFragment.LLILLL;
            if (abstractC960710b6j != null) {
                abstractC960710b6j.LJIJI(i2, jElapsedRealtime, this.LLILZ);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MultiCoHostSearchFragment@3afc.initEditComponent$2$afterTextChanged$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
