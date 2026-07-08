package X;

import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0snO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.tools.infosticker.repository.internal.compact.InfoStickerCompactHeaderListView$initObserver$1$3$4", f = "InfoStickerCompactHeaderListView.kt", l = {275}, m = "invokeSuspend")
public final class C1640640snO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1640440sn4 LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ Effect LLILZ;
    public final /* synthetic */ FrameLayout LLILZIL;
    public final /* synthetic */ C1662850tND LLILZLL;
    public final /* synthetic */ LifecycleOwner LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1640640snO(C1640440sn4 c1640440sn4, int i, Effect effect, FrameLayout frameLayout, C1662850tND c1662850tND, LifecycleOwner lifecycleOwner, InterfaceC1364105Vn<? super C1640640snO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1640440sn4;
        this.LLILLL = i;
        this.LLILZ = effect;
        this.LLILZIL = frameLayout;
        this.LLILZLL = c1662850tND;
        this.LLIZ = lifecycleOwner;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1640640snO(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007f  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1640640snO.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
