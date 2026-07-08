package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Og8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.offlinemode.repo.OfflineModeCacheVideoManager$cacheVideos$1$urlKey$2$1", f = "OfflineModeCacheVideoManager.kt", l = {135}, m = "invokeSuspend")
public final class C625500Og8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ EnumC624980OfI LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ InterfaceC1631620sYq<Integer, Aweme, InterfaceC497601wk, Boolean> LLILZIL;
    public final /* synthetic */ int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C625500Og8(String str, EnumC624980OfI enumC624980OfI, String str2, InterfaceC1631620sYq<? super Integer, ? super Aweme, ? super InterfaceC497601wk, Boolean> interfaceC1631620sYq, int i, InterfaceC1364105Vn<? super C625500Og8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = enumC624980OfI;
        this.LLILZ = str2;
        this.LLILZIL = interfaceC1631620sYq;
        this.LLILZLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C625500Og8(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("OfflineModeCacheVideoManager@1e1d.cacheVideos$1$urlKey$2$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        boolean z2 = true;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C625530OgB c625530OgB = C625530OgB.LIZ;
                String str = this.LLILLJJLI;
                this.LL = 1;
                c625530OgB.getClass();
                obj = C625530OgB.LJIILL(str);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("OfflineModeCacheVideoManager@1e1d.cacheVideos$1$urlKey$2$1");
                    return objLJFF;
                }
            }
            Aweme aweme = (Aweme) obj;
            if (aweme != null) {
                InterfaceC1631620sYq<Integer, Aweme, InterfaceC497601wk, Boolean> interfaceC1631620sYq = this.LLILZIL;
                int i2 = this.LLILZLL;
                if (interfaceC1631620sYq == null || !interfaceC1631620sYq.invoke(C2286608xc.LJ(i2), aweme, C625460Og4.LIZIZ).booleanValue()) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("OfflineModeCacheVideoManager@1e1d.cacheVideos$1$urlKey$2$1");
                    return unit;
                }
            }
            C625460Og4.LIZ.getClass();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C625460Og4.LIZLLL.LJ(String.valueOf(e));
        }
        if (C625460Og4.LIZIZ() == null && C625420Og0.LJFF() != EnumC624770Oex.USER_PAUSE && C625420Og0.LJFF() != EnumC624770Oex.UNINITIALIZED) {
            if (!C625460Og4.LIZJ && this.LLILLL == EnumC624980OfI.SYSTEM_RESUME && C625420Og0.LJIIIIZZ().getInt("keva_end_reason", -1) == -1) {
                C625460Og4.LIZJ = true;
                C625460Og4.LJIIJJI(EnumC624960OfG.OTHERS.getValue());
            }
            if (!C625420Og0.LJIIIIZZ().getBoolean("HAS_DOWNLOAD_START", false) && C625420Og0.LIZJ() < C625420Og0.LIZ()) {
                C625460Og4.LIZJ = true;
                C625460Og4.LJIIL(this.LLILLL);
                C625420Og0.LJIILIIL(EnumC624770Oex.DOWNLOADING);
            }
            String str2 = this.LLILZ;
            if (str2 != null && str2.length() != 0) {
                z2 = false;
            }
            if (!z2) {
                C1322200kVm.LIZ().LJIJ(C1325710kbR.LIZIZ(this.LLILZ), null);
            }
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("OfflineModeCacheVideoManager@1e1d.cacheVideos$1$urlKey$2$1");
            return unit2;
        }
        C19319410i8 c19319410i8 = C625460Og4.LIZLLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("downloadState: ");
        sbLIZ.append(C625420Og0.LJFF());
        sbLIZ.append("  pause download and return");
        c19319410i8.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
        C625460Og4.LJIILLIIL(false);
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("OfflineModeCacheVideoManager@1e1d.cacheVideos$1$urlKey$2$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
