package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Jg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.celebration.CelebrationFetcher$onFetchSuccess$allSuccess$1$1$1", f = "CelebrationFetcher.kt", l = {140}, m = "invokeSuspend")
public final class C1332205Jg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public int LL;
    public final /* synthetic */ List<String> LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ C1420270n3x LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1332205Jg(List<String> list, String str, boolean z, C1420270n3x c1420270n3x, InterfaceC1364105Vn<? super C1332205Jg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
        this.LLILLL = str;
        this.LLILZ = z;
        this.LLILZIL = c1420270n3x;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1332205Jg(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CelebrationFetcher@b7ac.onFetchSuccess$allSuccess$1$1$1");
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
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append((String) C13LP.LJJJJZI(this.LLILLJJLI));
            sbLIZ.append(this.LLILLL);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            List<String> listLJJJJIZL = C13LP.LJJJJIZL(this.LLILLJJLI, 1);
            String str = this.LLILLL;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJJJIZL, 10));
            for (String str2 : listLJJJJIZL) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(str2);
                sbLIZ2.append(str);
                arrayList.add(C2188811AlT.LIZIZ(sbLIZ2));
            }
            C2243408qe c2243408qe = C2243408qe.LIZ;
            String str3 = this.LLILLL;
            boolean z = this.LLILZ;
            this.LL = 1;
            obj = c2243408qe.LIZ(strLIZIZ, str3, arrayList, this, z);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("CelebrationFetcher@b7ac.onFetchSuccess$allSuccess$1$1$1");
                return objLJFF;
            }
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (!zBooleanValue) {
            C554890LpX c554890LpX = C554890LpX.LIZIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(LJII());
            sbLIZ3.append(", resource download failed: ");
            sbLIZ3.append(this.LLILLL);
            C201955140j.LJII(c554890LpX, C2188811AlT.LIZIZ(sbLIZ3));
        }
        Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
        C1C7U.LIZIZ("CelebrationFetcher@b7ac.onFetchSuccess$allSuccess$1$1$1");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
