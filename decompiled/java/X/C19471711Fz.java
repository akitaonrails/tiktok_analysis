package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.liveevent.ILiveEventOuterService;
import com.ss.android.ugc.aweme.services.publish.MobParam;
import com.ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.11Fz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.ss.android.ugc.aweme.MultiAnchorPublishExtension$handleLiveEventAction$1", f = "MultiAnchorPublishExtension.kt", l = {}, m = "invokeSuspend")
public final class C19471711Fz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C19510811Va LL;
    public final /* synthetic */ AnchorPublishStruct LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19471711Fz(C19510811Va c19510811Va, AnchorPublishStruct anchorPublishStruct, InterfaceC1364105Vn<? super C19471711Fz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c19510811Va;
        this.LLILLJJLI = anchorPublishStruct;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C19471711Fz(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        ILiveEventOuterService iLiveEventOuterServiceK5;
        C1C7U.LIZ("MultiAnchorPublishExtension@182f.handleLiveEventAction$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ILiveOuterService iLiveOuterService = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class);
        Fragment fragment = null;
        if (iLiveOuterService != null && (iLiveEventOuterServiceK5 = iLiveOuterService.K5()) != null && !iLiveEventOuterServiceK5.getAnchorManagerABConfigIfFullRollout()) {
            Fragment fragment2 = this.LL.LLILLL;
            if (fragment2 != null) {
                fragment = fragment2;
            }
            Context context = fragment.getContext();
            AnchorPublishStruct anchorPublishStruct = this.LLILLJJLI;
            MobParam mobParam = this.LL.LJIILL().mobParam;
            String str = mobParam.shootWay;
            String str2 = mobParam.creationId;
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, anchorPublishStruct.scheme);
            smartRouteBuildRoute.withParam("shoot_way", str);
            smartRouteBuildRoute.withParam("creation_id", str2);
            smartRouteBuildRoute.withParam("title", anchorPublishStruct.title);
            smartRouteBuildRoute.withParam("type", anchorPublishStruct.type);
            smartRouteBuildRoute.withParam("subtype", anchorPublishStruct.subtype);
            smartRouteBuildRoute.open();
        } else {
            C19510811Va c19510811Va = this.LL;
            if (c19510811Va.LLJL == null) {
                LifecycleOwner lifecycleOwner = c19510811Va.LLILZ;
                if (lifecycleOwner == null) {
                    lifecycleOwner = null;
                }
                C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), C0PEM.LIZJ, null, new C1430600nKc(c19510811Va, null), 2);
            } else {
                c19510811Va.LJJIJ(false);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MultiAnchorPublishExtension@182f.handleLiveEventAction$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
