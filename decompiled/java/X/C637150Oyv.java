package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.profilebanner.data.ProfileBannerModel;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Oyv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.profilebanner.framework.ProfileBannerFetcher$triggerFetch$1", f = "ProfileBannerFetcher.kt", l = {91}, m = "invokeSuspend")
public final class C637150Oyv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C637170Oyx LLILLJJLI;
    public final /* synthetic */ Function1<ProfileBannerModel, Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C637150Oyv(C637170Oyx c637170Oyx, Function1<? super ProfileBannerModel, Unit> function1, InterfaceC1364105Vn<? super C637150Oyv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c637170Oyx;
        this.LLILLL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C637150Oyv(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ProfileBannerFetcher@8da2.triggerFetch$1");
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
                final C099F c099fLIZIZ = C090F.LIZIZ();
                C20554315bp.LIZIZ.LJ(EnumC20654715s1.PROFILE_BANNER, this.LLILLJJLI.LIZ, new AbstractC637050Oyl() { // from class: X.0Oyn
                    @Override // X.AbstractC637050Oyl
                    public final void LIZ(C20554115bn c20554115bn, String str, n nVar, Map<String, Object> map) {
                        if (!c099fLIZIZ.isCompleted()) {
                            c099fLIZIZ.LJIIZILJ(new C443120HZe<>(c20554115bn, str, nVar));
                        }
                    }
                });
                long j = this.LLILLJJLI.LIZIZ;
                C477701tX c477701tX = new C477701tX(c099fLIZIZ, null);
                this.LL = 1;
                obj = C099A.LIZIZ(j, c477701tX, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("ProfileBannerFetcher@8da2.triggerFetch$1");
                    return objLJFF;
                }
            }
            C443120HZe c443120HZe = (C443120HZe) obj;
            this.LLILLJJLI.getClass();
            this.LLILLJJLI.LIZ((C20554115bn) c443120HZe.getFirst(), (String) c443120HZe.getSecond(), (n) c443120HZe.getThird(), this.LLILLL);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("ProfileBannerFetcher@8da2.triggerFetch$1");
            return unit;
        } catch (C094W e) {
            TryCatchGuardChecker.doCheck(e);
            C637190Oyz c637190Oyz = C637190Oyz.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("trigger timeout: ");
            sbLIZ.append(e);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c637190Oyz.getClass();
            C637190Oyz.LIZIZ(strLIZIZ);
            this.LLILLL.invoke(null);
            C637260Oz6.LIZ.getClass();
            C637260Oz6.LIZ(null, "fetch_time_out", null, false);
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("ProfileBannerFetcher@8da2.triggerFetch$1");
            return unit2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
