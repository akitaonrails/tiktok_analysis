package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HHZ, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.socialavatar.SocialAvatarDownloadHelper$prepareResources$2$deferredJob$1", f = "SocialAvatarDownloadHelper.kt", l = {187}, m = "invokeSuspend")
public final class C0HHZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Object>, Object> {
    public int LL;
    public final /* synthetic */ C0HHY LLILLJJLI;
    public final /* synthetic */ C438460HHg LLILLL;
    public final /* synthetic */ List<C0HFH> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HHZ(C0HHY c0hhy, C438460HHg c438460HHg, List<C0HFH> list, InterfaceC1364105Vn<? super C0HHZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0hhy;
        this.LLILLL = c438460HHg;
        this.LLILZ = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HHZ(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objValueOf;
        C1C7U.LIZ("SocialAvatarDownloadHelper@2edb.prepareResources$2$deferredJob$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C0HHY c0hhy = this.LLILLJJLI;
                C438460HHg c438460HHg = this.LLILLL;
                C438440HHe c438440HHe = c0hhy.LJIIIZ;
                this.LL = 1;
                obj = c0hhy.LJII(c438460HHg, c438440HHe, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("SocialAvatarDownloadHelper@2edb.prepareResources$2$deferredJob$1");
                    return objLJFF;
                }
            }
            File file = (File) obj;
            if (file != null) {
                this.LLILLJJLI.LJIIIIZZ.put(this.LLILLL.LIZ, file);
                objValueOf = Unit.LIZ;
            } else {
                objValueOf = null;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            objValueOf = Boolean.valueOf(this.LLILZ.add(new C0HFH(e)));
        }
        C1C7U.LIZIZ("SocialAvatarDownloadHelper@2edb.prepareResources$2$deferredJob$1");
        return objValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Object> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
