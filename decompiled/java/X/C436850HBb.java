package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HBb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.socialavatar.review.SocialAvatarTaskHandler$generateImages$2$dynamicAvatarAsync$1", f = "SocialAvatarTaskHandler.kt", l = {194}, m = "invokeSuspend")
public final class C436850HBb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public int LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ C436960HBm LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C436850HBb(boolean z, C436960HBm c436960HBm, InterfaceC1364105Vn<? super C436850HBb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = z;
        this.LLILLL = c436960HBm;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C436850HBb(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SocialAvatarTaskHandler@9d1f.generateImages$2$dynamicAvatarAsync$1");
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
            if (this.LLILLJJLI) {
                obj = this.LLILLL.LJFF;
            } else {
                C0HBV c0hbv = C0HBV.LIZ;
                String str = this.LLILLL.LIZIZ;
                this.LL = 1;
                c0hbv.getClass();
                obj = C0HBV.LIZIZ(str, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("SocialAvatarTaskHandler@9d1f.generateImages$2$dynamicAvatarAsync$1");
                    return objLJFF;
                }
            }
        }
        C1C7U.LIZIZ("SocialAvatarTaskHandler@9d1f.generateImages$2$dynamicAvatarAsync$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
