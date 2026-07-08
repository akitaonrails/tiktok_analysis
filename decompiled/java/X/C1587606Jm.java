package X;

import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06Jm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.CameraEffectAnimationMgr$flipToCameraEffect$2", f = "CameraEffectAnimationMgr.kt", l = {BaseNotice.CREATOR, 64}, m = "invokeSuspend")
public final class C1587606Jm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super InterfaceC343480DdK>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ File LLILZ;
    public final /* synthetic */ SmartImageView LLILZIL;
    public final /* synthetic */ Effect LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1587606Jm(SmartImageView smartImageView, Effect effect, File file, InterfaceC1364105Vn interfaceC1364105Vn, boolean z) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = z;
        this.LLILZ = file;
        this.LLILZIL = smartImageView;
        this.LLILZLL = effect;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        boolean z = this.LLILLL;
        C1587606Jm c1587606Jm = new C1587606Jm(this.LLILZIL, this.LLILZLL, this.LLILZ, interfaceC1364105Vn, z);
        c1587606Jm.LLILLJJLI = obj;
        return c1587606Jm;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C099G c099gLIZIZ;
        C1331670kl3 c1331670kl3LJII;
        C1C7U.LIZ("CameraEffectAnimationMgr@48bf.flipToCameraEffect$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    C1C7U.LIZIZ("CameraEffectAnimationMgr@48bf.flipToCameraEffect$2");
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1331670kl3LJII = (C1331670kl3) this.LLILLJJLI;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            if (this.LLILLL) {
                c099gLIZIZ = C23250099c.LIZIZ(interfaceC497601wk, null, null, new C1329705Ih(null), 3);
            } else {
                c099gLIZIZ = null;
            }
            c1331670kl3LJII = C1331660kl2.LJII(this.LLILZ);
            c1331670kl3LJII.LJJIIZ = EnumC714850S2h.SMALL;
            c1331670kl3LJII.LJJ(this.LLILZIL);
            c1331670kl3LJII.LJJIJIL((InterfaceC1331800klG) C337660DLo.LIZIZ.getValue());
            if (c099gLIZIZ != null) {
                this.LLILLJJLI = c1331670kl3LJII;
                this.LL = 1;
                if (c099gLIZIZ.LJLIIIL(this) == objLJFF) {
                    C1C7U.LIZIZ("CameraEffectAnimationMgr@48bf.flipToCameraEffect$2");
                    return objLJFF;
                }
            }
        }
        C337180DJs.LIZJ(this.LLILZIL);
        Effect effect = this.LLILZLL;
        this.LLILLJJLI = null;
        this.LL = 2;
        C1DFH c1dfh = C0PEM.LIZ;
        obj = C23250099c.LJI(this, C2107308Nj.LIZ, new C445360HdG(c1331670kl3LJII, effect, null));
        if (obj == objLJFF) {
            C1C7U.LIZIZ("CameraEffectAnimationMgr@48bf.flipToCameraEffect$2");
            return objLJFF;
        }
        C1C7U.LIZIZ("CameraEffectAnimationMgr@48bf.flipToCameraEffect$2");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super InterfaceC343480DdK> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
