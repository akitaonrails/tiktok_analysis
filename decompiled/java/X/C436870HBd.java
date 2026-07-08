package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HBd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.socialavatar.review.SocialAvatarTaskHandler$generateImages$2$compiledAvatarAsync$1", f = "SocialAvatarTaskHandler.kt", l = {170}, m = "invokeSuspend")
public final class C436870HBd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public int LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ C436960HBm LLILLL;
    public final /* synthetic */ C0HFS LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C436870HBd(Context context, C436960HBm c436960HBm, C0HFS c0hfs, InterfaceC1364105Vn<? super C436870HBd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = context;
        this.LLILLL = c436960HBm;
        this.LLILZ = c0hfs;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C436870HBd(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("SocialAvatarTaskHandler@9d1f.generateImages$2$compiledAvatarAsync$1");
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
            C0HBV c0hbv = C0HBV.LIZ;
            Context context = this.LLILLJJLI;
            C0VSJ c0vsj = new C0VSJ(C2354709Kn.LJIIL("profileHeader"), "profileCombinedSocialAvatar.png");
            String str = this.LLILLL.LIZ;
            C0HFS c0hfs = this.LLILZ;
            this.LL = 1;
            obj = c0hbv.LJ(context, c0vsj, str, c0hfs, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SocialAvatarTaskHandler@9d1f.generateImages$2$compiledAvatarAsync$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("SocialAvatarTaskHandler@9d1f.generateImages$2$compiledAvatarAsync$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
