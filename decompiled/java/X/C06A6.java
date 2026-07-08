package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.preload.api.IIMPreloadService;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06A6, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.controller.preload.MediaPreloadManager$onMediaAvailable$3", f = "MediaPreloadManager.kt", l = {}, m = "invokeSuspend")
public final class C06A6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C870370YCl LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06A6(C870370YCl c870370YCl, InterfaceC1364105Vn<? super C06A6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c870370YCl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06A6(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        IIMPreloadService iIMPreloadService;
        InterfaceC1335505Kn eventCenter;
        C1C7U.LIZ("MediaPreloadManager@9282.onMediaAvailable$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C869590Y9l c869590Y9lLJJJ = C0YNY.LIZ(InterfaceC874680YTa.LIZ).LJJJ(this.LL.LIZIZ);
        if (c869590Y9lLJJJ != null && (iIMPreloadService = (IIMPreloadService) PluggableExtentionKt.pluggableSpiForReal(IIMPreloadService.class)) != null && (eventCenter = iIMPreloadService.getEventCenter()) != null) {
            eventCenter.LIZ(new C05GP(Collections.singletonList(c869590Y9lLJJJ)));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MediaPreloadManager@9282.onMediaAvailable$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
