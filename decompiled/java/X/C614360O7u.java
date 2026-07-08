package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.service.IProfileMusicTabService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0O7u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.music.presenter.MusicDetailHelper$deletePinnedAweme$1", f = "MusicDetailHelper.kt", l = {137}, m = "invokeSuspend")
public final class C614360O7u extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C614360O7u(String str, String str2, InterfaceC1364105Vn<? super C614360O7u> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C614360O7u(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MusicDetailHelper@3526.deletePinnedAweme$1");
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
            C613950O6f c613950O6fLIZ = C613940O6e.LIZ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("mota: ");
            sbLIZ.append(c613950O6fLIZ.LIZ);
            sbLIZ.append(", ");
            sbLIZ.append(Intrinsics.LJFF(c613950O6fLIZ.LIZ, C0O8O.LIZ));
            C2344809Gs.LJ(C2188811AlT.LIZIZ(sbLIZ));
            try {
                C0O7F.LIZLLL(c613950O6fLIZ.LIZ);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C2344809Gs.LJ("mota retrofitInstance is empty");
            }
            IProfileMusicTabService iProfileMusicTabService = (IProfileMusicTabService) ServiceManager.get().getService(IProfileMusicTabService.class);
            C613960O6g c613960O6gLIZ = c613950O6fLIZ.LIZ(new C614570O8p(this.LLILLJJLI, this.LLILLL));
            final String str = this.LLILLJJLI + this.LLILLL;
            C0O7F.LIZ(c613960O6gLIZ, new AbstractC614210O7f(str) { // from class: X.0O7n
                public final String LIZIZ;
                public final C614260O7k LIZJ;

                @Override // X.InterfaceC614350O7t
                public final String LIZ() {
                    return this.LIZIZ;
                }

                @Override // X.AbstractC614210O7f
                public final AbstractC614250O7j LIZIZ() {
                    return this.LIZJ;
                }

                {
                    this.LIZIZ = str;
                    C614260O7k c614260O7k = C614260O7k.LIZIZ;
                    c614260O7k.LIZ = C614270O7l.LIZIZ.LIZ | c614260O7k.LIZ;
                    this.LIZJ = c614260O7k;
                }
            });
            InterfaceC346201Wa interfaceC346201WaLJIIL = iProfileMusicTabService.LJIIL(c613960O6gLIZ, "/tiktok/music/pinned_aweme/delete/v1/", null);
            final String str2 = this.LLILLJJLI;
            final String str3 = this.LLILLL;
            InterfaceC346701Wf interfaceC346701Wf = new InterfaceC346701Wf(str2, str3) { // from class: X.0O7v
                public final /* synthetic */ String LL;

                @Override // X.InterfaceC346701Wf
                public final Object emit(Object obj2, InterfaceC1364105Vn interfaceC1364105Vn) {
                    if (obj2 instanceof C0O79) {
                        C1440005kM.LIZ(new C1165540gR6(this.LL, true, false));
                    } else if (obj2 instanceof C0O78) {
                        C1440005kM.LIZ(new C1165540gR6(this.LL, false, false));
                    }
                    return Unit.LIZ;
                }
            };
            this.LL = 1;
            if (interfaceC346201WaLJIIL.collect(interfaceC346701Wf, this) == objLJFF) {
                C1C7U.LIZIZ("MusicDetailHelper@3526.deletePinnedAweme$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MusicDetailHelper@3526.deletePinnedAweme$1");
        return unit;
    }
}
