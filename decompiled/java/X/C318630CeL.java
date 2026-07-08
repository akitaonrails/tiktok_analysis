package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.effectcreatormobile.infrastructure.ui.widgets.creator.fragment.CommonFetchFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CeL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.bytedance.effectcreatormobile.infrastructure.ui.widgets.creator.fragment.CommonFetchFragment$initObserver$$inlined$launchAndCollectIn$default$1", f = "CommonFetchFragment.kt", l = {LiveToolbarIconStyleSetting.GRAY_WITH_TEXT}, m = "invokeSuspend")
public final class C318630CeL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ LifecycleOwner LLILLJJLI;
    public final /* synthetic */ Lifecycle.State LLILLL;
    public final /* synthetic */ InterfaceC346201Wa LLILZ;
    public final /* synthetic */ CommonFetchFragment LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C318630CeL(LifecycleOwner lifecycleOwner, Lifecycle.State state, InterfaceC346201Wa interfaceC346201Wa, InterfaceC1364105Vn interfaceC1364105Vn, CommonFetchFragment commonFetchFragment) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = lifecycleOwner;
        this.LLILLL = state;
        this.LLILZ = interfaceC346201Wa;
        this.LLILZIL = commonFetchFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C318630CeL(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn, this.LLILZIL);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CommonFetchFragment@b064.initObserver$$inlined$launchAndCollectIn$default$1");
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
            LifecycleOwner lifecycleOwner = this.LLILLJJLI;
            Lifecycle.State state = this.LLILLL;
            C318640CeM c318640CeM = new C318640CeM(this.LLILZ, null, this.LLILZIL);
            this.LL = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycleOwner, state, c318640CeM, this) == objLJFF) {
                C1C7U.LIZIZ("CommonFetchFragment@b064.initObserver$$inlined$launchAndCollectIn$default$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CommonFetchFragment@b064.initObserver$$inlined$launchAndCollectIn$default$1");
        return unit;
    }
}
