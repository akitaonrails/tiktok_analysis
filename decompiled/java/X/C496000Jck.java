package X;

import com.bytedance.android.livesdk.profile.api.ProfileApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import webcast.api.room.GetRoomProfileCardResponse;

/* JADX INFO: renamed from: X.0Jck, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.profile.dao.LiveProfileRepositoryForAnchor$asyncRequest$profileCardDeferred$1", f = "LiveProfileRepositoryForAnchor.kt", l = {99}, m = "invokeSuspend")
public final class C496000Jck extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super GetRoomProfileCardResponse>, Object> {
    public int LL;
    public final /* synthetic */ C496060Jcq LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C496000Jck(C496060Jcq c496060Jcq, InterfaceC1364105Vn<? super C496000Jck> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c496060Jcq;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C496000Jck(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLJJJJL = obj;
        C1C7U.LIZ("LiveProfileRepositoryForAnchor@6987.asyncRequest$profileCardDeferred$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLJJJJL);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJJJJL);
            C480460Ism.LIZ().getClass();
            ProfileApi profileApi = (ProfileApi) C480460Ism.LIZLLL(ProfileApi.class);
            long id = this.LLILLJJLI.LIZ.LJFF.getId();
            long ownerUserId = this.LLILLJJLI.LIZ.LJFF.getOwnerUserId();
            C495920Jcc c495920Jcc = this.LLILLJJLI.LIZ;
            long j = c495920Jcc.LJII;
            String strLJIIIIZZ = C2348809Ig.LJIIIIZZ(c495920Jcc.LIZIZ());
            C495920Jcc c495920Jcc2 = this.LLILLJJLI.LIZ;
            C19476611Hw c19476611HwLJL = profileApi.getProfileResponse(id, ownerUserId, j, strLJIIIIZZ, c495920Jcc2.LIZJ.LIZLLL, c495920Jcc2.LJIIIIZZ.isCanRecognizeEnigma()).LJL(C11S5.LIZ());
            this.LL = 1;
            objLJJJJL = C500260Jjc.LJJJJL(c19476611HwLJL, this);
            if (objLJJJJL == objLJFF) {
                C1C7U.LIZIZ("LiveProfileRepositoryForAnchor@6987.asyncRequest$profileCardDeferred$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("LiveProfileRepositoryForAnchor@6987.asyncRequest$profileCardDeferred$1");
        return objLJJJJL;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super GetRoomProfileCardResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
