package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserArchiveSettings;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Ra, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.feature.archive.settings.ArchiveSettingPageViewModel$Companion$getArchiveSettings$3$1", f = "ArchiveSettingPageViewModel.kt", l = {68, 74}, m = "invokeSuspend")
public final class C1352405Ra extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ IMUserArchiveSettings LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ Function1<IMUserArchiveSettings, Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1352405Ra(IMUserArchiveSettings iMUserArchiveSettings, boolean z, Function1<? super IMUserArchiveSettings, Unit> function1, InterfaceC1364105Vn<? super C1352405Ra> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = iMUserArchiveSettings;
        this.LLILLL = z;
        this.LLILZ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1352405Ra(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        IMUserArchiveSettings iMUserArchiveSettings;
        C1C7U.LIZ("ArchiveSettingPageViewModel$Companion@74d8.getArchiveSettings$3$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("request user feature info exception: ");
            sbLIZ.append(e);
            C2188811AlT.LIZIZ(sbLIZ);
            iMUserArchiveSettings = this.LLILLJJLI;
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("ArchiveSettingPageViewModel$Companion@74d8.getArchiveSettings$3$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            IMContactApi.LIZ.getClass();
            InterfaceC15516065q interfaceC15516065qLIZJ = C069P.LIZ().LIZJ();
            EnumC1725606pK enumC1725606pK = EnumC1725606pK.ARCHIVE_SETTINGS;
            this.LL = 1;
            obj = interfaceC15516065qLIZJ.LIZIZ(enumC1725606pK, null, null, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ArchiveSettingPageViewModel$Companion@74d8.getArchiveSettings$3$1");
                return objLJFF;
            }
        }
        iMUserArchiveSettings = (IMUserArchiveSettings) obj;
        if (!this.LLILLL) {
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C1352505Rb c1352505Rb = new C1352505Rb(this.LLILZ, iMUserArchiveSettings, null);
            this.LL = 2;
            if (C23250099c.LJI(this, abstractC2238408pq, c1352505Rb) == objLJFF) {
                C1C7U.LIZIZ("ArchiveSettingPageViewModel$Companion@74d8.getArchiveSettings$3$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ArchiveSettingPageViewModel$Companion@74d8.getArchiveSettings$3$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
