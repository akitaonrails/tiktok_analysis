package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.IProfileService;
import com.ss.android.ugc.aweme.profile.model.AvatarUri;
import com.ss.android.ugc.aweme.services.IAvatarPublishStoryService;
import com.ss.android.ugc.aweme.services.IExternalService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS266S0300000_22;
import kotlin.jvm.internal.AwS388S0200000_22;
import njp.a;

/* JADX INFO: renamed from: X.0ng0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.util.ChangeAvatarUtil$request$2", f = "ChangeAvatarUtil.kt", l = {83}, m = "invokeSuspend")
public final class C1443860ng0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1443880ng2 LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;
    public final /* synthetic */ Function1<Exception, Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1443860ng0(C1443880ng2 c1443880ng2, String str, Function0<Unit> function0, Function1<? super Exception, Unit> function1, InterfaceC1364105Vn<? super C1443860ng0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1443880ng2;
        this.LLILLL = str;
        this.LLILZ = function0;
        this.LLILZIL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1443860ng0(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objRequestUpdateAvatar = obj;
        C1C7U.LIZ("ChangeAvatarUtil@b9ec.request$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objRequestUpdateAvatar);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objRequestUpdateAvatar);
            IAvatarPublishStoryService iAvatarPublishStoryServiceAvatarService = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).avatarService();
            String str = this.LLILLJJLI.LIZIZ.creativeModel.changeAvatarModel.originPath;
            this.LL = 1;
            objRequestUpdateAvatar = iAvatarPublishStoryServiceAvatarService.requestUpdateAvatar(str, this);
            if (objRequestUpdateAvatar == objLJFF) {
                C1C7U.LIZIZ("ChangeAvatarUtil@b9ec.request$2");
                return objLJFF;
            }
        }
        AvatarUri avatarUri = (AvatarUri) objRequestUpdateAvatar;
        IProfileService iProfileService = (IProfileService) ServiceManager.get().getService(IProfileService.class);
        C1443880ng2 c1443880ng2 = this.LLILLJJLI;
        iProfileService.updateSavePostChoose(c1443880ng2.LIZ, c1443880ng2.LIZIZ.creativeModel.changeAvatarModel.realEnterMethod, avatarUri, this.LLILLL, new AwS266S0300000_22(c1443880ng2, (C1443880ng2) avatarUri, (AvatarUri) this.LLILZ, (Function0<Unit>) 11), new AwS388S0200000_22(this.LLILLJJLI, (C1443880ng2) this.LLILZIL, (Function1<? super Exception, Unit>) 48));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ChangeAvatarUtil@b9ec.request$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
