package X;

import com.ss.android.ugc.aweme.profile.model.AvatarMetaInfo;
import com.ss.android.ugc.profile.business.ur.socialavatar.network.SocialAvatarLikeStatusResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HED, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.enlarge.EnlargeAvatarSocialAvatarHelper$showButtons$2", f = "EnlargeAvatarSocialAvatarHelper.kt", l = {338}, m = "invokeSuspend")
public final class C0HED extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C442840HYc LL;
    public int LLILLJJLI;
    public final /* synthetic */ C442840HYc LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HED(C442840HYc c442840HYc, InterfaceC1364105Vn<? super C0HED> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c442840HYc;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HED(this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C442840HYc c442840HYc;
        Long l;
        boolean zBooleanValue;
        Boolean boolValueOf;
        C1C7U.LIZ("EnlargeAvatarSocialAvatarHelper@38b.showButtons$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                c442840HYc = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            c442840HYc = this.LLILLL;
            AvatarMetaInfo avatarMetaInfoLIZIZ = C1245160iVW.LIZIZ(c442840HYc.LIZIZ);
            if (avatarMetaInfoLIZIZ != null && (l = avatarMetaInfoLIZIZ.socialAvatarID) != null) {
                long jLongValue = l.longValue();
                C0HMR.LIZ.getClass();
                C0HEN c0henLIZ = C0HMR.LIZ();
                this.LL = c442840HYc;
                this.LLILLJJLI = 1;
                if (!C1644806cI.LIZIZ()) {
                    obj = null;
                } else {
                    obj = C0HEN.LIZIZ.LIZ(new C0HEI(c0henLIZ, jLongValue, null), this);
                }
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("EnlargeAvatarSocialAvatarHelper@38b.showButtons$2");
                    return objLJFF;
                }
            }
            zBooleanValue = false;
            c442840HYc.LJIJJLI = zBooleanValue;
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C0HEA(this.LLILLL, null), 3);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("EnlargeAvatarSocialAvatarHelper@38b.showButtons$2");
            return unit;
        }
        SocialAvatarLikeStatusResponse socialAvatarLikeStatusResponse = (SocialAvatarLikeStatusResponse) obj;
        if (socialAvatarLikeStatusResponse != null && (boolValueOf = Boolean.valueOf(socialAvatarLikeStatusResponse.hasLiked)) != null) {
            zBooleanValue = boolValueOf.booleanValue();
        } else {
            zBooleanValue = false;
        }
        c442840HYc.LJIJJLI = zBooleanValue;
        C1DFH c1dfh2 = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C0HEA(this.LLILLL, null), 3);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("EnlargeAvatarSocialAvatarHelper@38b.showButtons$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
