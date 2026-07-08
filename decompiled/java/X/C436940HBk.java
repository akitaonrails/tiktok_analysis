package X;

import com.ss.android.ugc.profile.business.ur.socialavatar.review.SocialAvatarEditViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HBk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.socialavatar.review.SocialAvatarEditViewModel$generateImages$2$staticAvatarAsync$1", f = "SocialAvatarEditViewModel.kt", l = {498}, m = "invokeSuspend")
public final class C436940HBk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public int LL;
    public final /* synthetic */ SocialAvatarEditViewModel LLILLJJLI;
    public final /* synthetic */ C436960HBm LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C436940HBk(SocialAvatarEditViewModel socialAvatarEditViewModel, C436960HBm c436960HBm, InterfaceC1364105Vn<? super C436940HBk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = socialAvatarEditViewModel;
        this.LLILLL = c436960HBm;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C436940HBk(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SocialAvatarEditViewModel@c2d3.generateImages$2$staticAvatarAsync$1");
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
            if (((C0HNI) this.LLILLJJLI.getState()).LLILZLL) {
                obj = this.LLILLL.LJ;
            } else {
                C0HBV c0hbv = C0HBV.LIZ;
                String str = this.LLILLL.LIZ;
                this.LL = 1;
                c0hbv.getClass();
                obj = C0HBV.LIZIZ(str, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("SocialAvatarEditViewModel@c2d3.generateImages$2$staticAvatarAsync$1");
                    return objLJFF;
                }
            }
        }
        C1C7U.LIZIZ("SocialAvatarEditViewModel@c2d3.generateImages$2$staticAvatarAsync$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
