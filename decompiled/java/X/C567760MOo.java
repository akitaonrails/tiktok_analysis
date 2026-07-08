package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.composer.model.CreationConfigModelCompat;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.optimization.ILayoutPreloadServiceForEditPage;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS552S0100000_8;
import njp.a;

/* JADX INFO: renamed from: X.0MOo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.external.composer.CreationComposerProcessor$start$6$2", f = "CreationComposerProcessor.kt", l = {}, m = "invokeSuspend")
public final class C567760MOo extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ Intent LLILLJJLI;
    public final /* synthetic */ CreationConfigModelCompat LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C567760MOo(Context context, Intent intent, CreationConfigModelCompat creationConfigModelCompat, InterfaceC1364105Vn<? super C567760MOo> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = context;
        this.LLILLJJLI = intent;
        this.LLILLL = creationConfigModelCompat;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C567760MOo(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CreationComposerProcessor@8bd3.start$6$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (C0MKI.LIZ()) {
            C1660680tJi.LIZ().LJIIZILJ(this.LL, this.LLILLJJLI, true);
        } else {
            Bundle extras = null;
            ILayoutPreloadServiceForEditPage iLayoutPreloadServiceForEditPage = (ILayoutPreloadServiceForEditPage) PluggableExtentionKt.pluggableSpi$default(ILayoutPreloadServiceForEditPage.class, false, false, false, 14, null);
            Bundle extras2 = null;
            if (iLayoutPreloadServiceForEditPage != null) {
                Context context = this.LL;
                try {
                    extras = this.LLILLJJLI.getExtras();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                iLayoutPreloadServiceForEditPage.preloadLayoutFiles(context, extras);
            }
            Context context2 = this.LL;
            Intent intent = this.LLILLJJLI;
            if (intent != null) {
                try {
                    extras2 = intent.getExtras();
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            }
            C0MWH.LJIILLIIL(context2, extras2);
        }
        C01TT.LIZLLL(new AwS552S0100000_8(this.LLILLL, 1004));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CreationComposerProcessor@8bd3.start$6$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
