package X;

import android.content.Context;
import com.ss.android.ugc.aweme.unifiedauth.manager.PushUserGuidePopupManager;
import com.ss.android.ugc.aweme.unifiedauthapi.model.UnifiedAuthPopupConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06C3, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.unifiedauth.manager.PushUserGuidePopupManager$doPopupTracking$1", f = "PushUserGuidePopupManager.kt", l = {}, m = "invokeSuspend")
public final class C06C3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ UnifiedAuthPopupConfig LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06C3(Context context, UnifiedAuthPopupConfig unifiedAuthPopupConfig, boolean z, InterfaceC1364105Vn<? super C06C3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = context;
        this.LLILLJJLI = unifiedAuthPopupConfig;
        this.LLILLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06C3(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PushUserGuidePopupManager@2b75.doPopupTracking$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        PushUserGuidePopupManager pushUserGuidePopupManager = PushUserGuidePopupManager.LIZ;
        Context context = this.LL;
        UnifiedAuthPopupConfig unifiedAuthPopupConfig = this.LLILLJJLI;
        boolean z = this.LLILLL;
        pushUserGuidePopupManager.getClass();
        PushUserGuidePopupManager.LJIIIZ(context, unifiedAuthPopupConfig, z);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PushUserGuidePopupManager@2b75.doPopupTracking$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
