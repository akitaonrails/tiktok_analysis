package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08um, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.mixediting.resource.feature.MixEditingFeatureExtractionService$reuseAIMusicUploadedResult$2$2", f = "MixEditingFeatureExtractionService.kt", l = {455}, m = "invokeSuspend")
public final class C2269008um extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C2268608ui>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ List<String> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2269008um(List list, int i, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = i;
        this.LLILZIL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        String str = this.LLILLL;
        return new C2269008um(this.LLILZIL, this.LLILZ, str, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        int iOrdinal;
        String strLIZLLL;
        boolean z;
        Object objLIZJ = obj;
        C1C7U.LIZ("MixEditingFeatureExtractionService@fa48.reuseAIMusicUploadedResult$2$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                str = (String) this.LL;
                C155000ia.LIZIZ(objLIZJ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLIZJ);
            long jCurrentTimeMillis = System.currentTimeMillis();
            str = null;
            try {
                C11NZ<String> c11nzLJ = C2275708vr.LJ();
                if (c11nzLJ != null) {
                    str = (String) c11nzLJ.LJLJI(((Number) C2269108un.LIZ.getValue()).longValue(), TimeUnit.MILLISECONDS).LIZLLL();
                }
                iOrdinal = -1;
            } catch (RuntimeException e) {
                TryCatchGuardChecker.doCheck(e);
                iOrdinal = EnumC2268208ue.TIMEOUT_CANCEL.ordinal();
            }
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            if (iOrdinal == -1) {
                if (str != null && str.length() != 0) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    iOrdinal = EnumC2268208ue.FAIL.ordinal();
                }
            }
            if (C123100dR.LIZ(str)) {
                C2269208uo c2269208uo = C2269208uo.LIZ;
                String str2 = this.LLILLL;
                int iOrdinal2 = EnumC2268208ue.SUCCESS.ordinal();
                long jCurrentTimeMillis3 = System.currentTimeMillis() - jCurrentTimeMillis;
                int i2 = this.LLILZ;
                c2269208uo.getClass();
                C2269208uo.LIZJ(iOrdinal2, jCurrentTimeMillis3, i2, str2, str);
                C2275708vr c2275708vr = C2275708vr.LIZ;
                List<String> list = this.LLILZIL;
                this.LL = str;
                this.LLILLJJLI = 1;
                objLIZJ = c2275708vr.LIZJ(list, this);
                if (objLIZJ == objLJFF) {
                    C1C7U.LIZIZ("MixEditingFeatureExtractionService@fa48.reuseAIMusicUploadedResult$2$2");
                    return objLJFF;
                }
            } else {
                C2269208uo c2269208uo2 = C2269208uo.LIZ;
                String str3 = this.LLILLL;
                int i3 = this.LLILZ;
                c2269208uo2.getClass();
                C2269208uo.LIZJ(iOrdinal, jCurrentTimeMillis2, i3, str3, null);
                C2268608ui c2268608ui = new C2268608ui(null, false, null, null, null, 16383);
                List<String> list2 = this.LLILZIL;
                if (C296620Bjw.LIZ()) {
                    C201955140j.LIZLLL(C1398350mUb.LIZIZ, "MixEditingFeatureExtractionService", "reuseAIMusicUploadedResult fallback: StudioAssetApiUpgradeAB hit, building image_info_list rec_config directly");
                    strLIZLLL = C2270208uy.LIZ(list2);
                } else {
                    strLIZLLL = C2268608ui.LIZLLL(list2);
                }
                if (!C2269608us.LIZ()) {
                    C2269208uo.LIZJ = new Pair<>("empty", strLIZLLL);
                }
                c2268608ui.LIZ = "empty";
                c2268608ui.LIZJ = true;
                c2268608ui.LJIIJ = strLIZLLL;
                C1C7U.LIZIZ("MixEditingFeatureExtractionService@fa48.reuseAIMusicUploadedResult$2$2");
                return c2268608ui;
            }
        }
        String str4 = (String) objLIZJ;
        C2269208uo c2269208uo3 = C2269208uo.LIZ;
        Pair<String, String> pair = new Pair<>(str, str4);
        c2269208uo3.getClass();
        C2269208uo.LIZJ = pair;
        C2268608ui c2268608ui2 = new C2268608ui(null, false, null, null, null, 16383);
        c2268608ui2.LIZ = str;
        c2268608ui2.LJIIJ = str4;
        C1C7U.LIZIZ("MixEditingFeatureExtractionService@fa48.reuseAIMusicUploadedResult$2$2");
        return c2268608ui2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C2268608ui> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
