package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HBf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.socialavatar.review.SocialAvatarTaskHandler$generateImages$2$storyCanvasAsync$1", f = "SocialAvatarTaskHandler.kt", l = {180}, m = "invokeSuspend")
public final class C436890HBf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public int LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ C436960HBm LLILZ;
    public final /* synthetic */ C0HFS LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C436890HBf(boolean z, Context context, C436960HBm c436960HBm, C0HFS c0hfs, InterfaceC1364105Vn<? super C436890HBf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = z;
        this.LLILLL = context;
        this.LLILZ = c436960HBm;
        this.LLILZIL = c0hfs;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C436890HBf(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("SocialAvatarTaskHandler@9d1f.generateImages$2$storyCanvasAsync$1");
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
                C0HBV c0hbv = C0HBV.LIZ;
                Context context = this.LLILLL;
                C0VSJ c0vsj = new C0VSJ(C2354709Kn.LJIIL("profileHeader"), "profileStorySocialAvatar.png");
                C436960HBm c436960HBm = this.LLILZ;
                C0HFS c0hfs = this.LLILZIL;
                this.LL = 1;
                obj = c0hbv.LJFF(context, c0vsj, c436960HBm, c0hfs, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("SocialAvatarTaskHandler@9d1f.generateImages$2$storyCanvasAsync$1");
                    return objLJFF;
                }
            } else {
                obj = null;
            }
        }
        C1C7U.LIZIZ("SocialAvatarTaskHandler@9d1f.generateImages$2$storyCanvasAsync$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
