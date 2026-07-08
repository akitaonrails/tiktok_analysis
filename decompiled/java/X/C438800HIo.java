package X;

import com.ss.android.ugc.aweme.socialavatar.api.SocialAvatarFastFlowService;
import com.ss.android.ugc.ur.socialavatar.ISocialAvatarCreationStatusService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HIo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sticker.impl.socialavatar.data.IMSocialAvatarStatusManager$refreshAll$1", f = "IMSocialAvatarStatusManager.kt", l = {334}, m = "invokeSuspend")
public final class C438800HIo extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C439110HJt LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C438800HIo(C439110HJt c439110HJt, InterfaceC1364105Vn<? super C438800HIo> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c439110HJt;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C438800HIo(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMSocialAvatarStatusManager@4f1f.refreshAll$1");
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
            ISocialAvatarCreationStatusService iSocialAvatarCreationStatusService = (ISocialAvatarCreationStatusService) this.LLILLJJLI.LIZJ.getValue();
            if (iSocialAvatarCreationStatusService != null) {
                String str = this.LLILLJJLI.LIZ;
                this.LL = 1;
                if (iSocialAvatarCreationStatusService.LIZIZ(str, this) == objLJFF) {
                    C1C7U.LIZIZ("IMSocialAvatarStatusManager@4f1f.refreshAll$1");
                    return objLJFF;
                }
            }
        }
        SocialAvatarFastFlowService socialAvatarFastFlowService = (SocialAvatarFastFlowService) this.LLILLJJLI.LIZLLL.getValue();
        if (socialAvatarFastFlowService != null) {
            socialAvatarFastFlowService.LJ(this.LLILLJJLI.LIZ);
        }
        C439110HJt c439110HJt = this.LLILLJJLI;
        C23250099c.LIZLLL(c439110HJt.LJIIJ, null, null, new C438810HIp(c439110HJt, null), 3);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMSocialAvatarStatusManager@4f1f.refreshAll$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
