package X;

import com.ss.android.ugc.aweme.feed.assem.tns.banner.TnSBannerAssemAbility;
import com.ss.android.ugc.aweme.feed.assem.tns.banner.TnsBannerAssemTrigger;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.TnSUserExperienceFeedInfo;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityAbility;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0RoU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.assem.tns.banner.TnsBannerAssemTrigger$onReceiveJsEvent$1", f = "TnSBannerAssem.kt", l = {124}, m = "invokeSuspend")
public final class C707120RoU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ TnsBannerAssemTrigger LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C707120RoU(TnsBannerAssemTrigger tnsBannerAssemTrigger, InterfaceC1364105Vn<? super C707120RoU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = tnsBannerAssemTrigger;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C707120RoU(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2;
        TnSUserExperienceFeedInfo tnSUserExperienceFeedInfo;
        C1C7U.LIZ("TnsBannerAssemTrigger@99d3.onReceiveJsEvent$1");
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
            C1DFB c1dfb = C0PEM.LIZJ;
            C09MR c09mr = new C09MR(this.LLILLJJLI, null);
            this.LL = 1;
            obj = C23250099c.LJI(this, c1dfb, c09mr);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("TnsBannerAssemTrigger@99d3.onReceiveJsEvent$1");
                return objLJFF;
            }
        }
        Aweme aweme = (Aweme) obj;
        C724270Sb3 c724270Sb3 = this.LLILLJJLI.LLJI;
        if (c724270Sb3 != null) {
            obj2 = c724270Sb3.LL;
        } else {
            obj2 = null;
        }
        Aweme aweme2 = ((VideoItemParams) obj2).getAweme();
        if (aweme2 != null && aweme != null && (tnSUserExperienceFeedInfo = aweme.getTnSUserExperienceFeedInfo()) != null) {
            aweme2.setTnSUserExperienceFeedInfo(tnSUserExperienceFeedInfo);
        }
        TnSBannerAssemAbility tnSBannerAssemAbility = (TnSBannerAssemAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this.LLILLJJLI), TnSBannerAssemAbility.class, null);
        if (tnSBannerAssemAbility != null) {
            tnSBannerAssemAbility.OZ1();
        }
        PriorityAbility priorityAbility = (PriorityAbility) this.LLILLJJLI.LLJL.getValue();
        if (priorityAbility != null) {
            priorityAbility.nw0(this.LLILLJJLI, true);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TnsBannerAssemTrigger@99d3.onReceiveJsEvent$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
