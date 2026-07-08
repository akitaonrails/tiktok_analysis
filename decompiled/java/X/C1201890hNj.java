package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.service.ILocationOfflineService;
import com.ss.android.ugc.nearby.roaming.RegionAllListAssem;
import java.text.Collator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0hNj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.nearby.roaming.RegionAllListAssem$processAllRegions$1$2", f = "RegionAllListAssem.kt", l = {}, m = "invokeSuspend")
public final class C1201890hNj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C259800zU<InterfaceC1891350zJl[]> LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ HashMap<String, String> LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ RegionAllListAssem LLILZIL;
    public final /* synthetic */ Collator LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1201890hNj(C259800zU<InterfaceC1891350zJl[]> c259800zU, boolean z, HashMap<String, String> map, boolean z2, RegionAllListAssem regionAllListAssem, Collator collator, InterfaceC1364105Vn<? super C1201890hNj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c259800zU;
        this.LLILLJJLI = z;
        this.LLILLL = map;
        this.LLILZ = z2;
        this.LLILZIL = regionAllListAssem;
        this.LLILZLL = collator;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1201890hNj(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        C1C7U.LIZ("RegionAllListAssem@c16d.processAllRegions$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        long jCurrentTimeMillis = System.currentTimeMillis();
        InterfaceC1891350zJl[] interfaceC1891350zJlArr = this.LL.element;
        final boolean z = this.LLILLJJLI;
        final HashMap<String, String> map = this.LLILLL;
        final boolean z2 = this.LLILZ;
        final RegionAllListAssem regionAllListAssem = this.LLILZIL;
        final Collator collator = this.LLILZLL;
        Arrays.sort(interfaceC1891350zJlArr, new Comparator() { // from class: X.0hNk
            /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
            /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
            /* JADX WARN: Removed duplicated region for block: B:45:0x00bc A[PHI: r3
              0x00bc: PHI (r3v13 java.lang.String) = (r3v1 java.lang.String), (r3v10 java.lang.String), (r3v22 java.lang.String) binds: [B:44:0x00bb, B:33:0x008a, B:10:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
            @Override // java.util.Comparator
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final int compare(java.lang.Object r9, java.lang.Object r10) {
                /*
                    Method dump skipped, instruction units count: 273
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1201900hNk.compare(java.lang.Object, java.lang.Object):int");
            }
        });
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        ILocationOfflineService iLocationOfflineService = (ILocationOfflineService) PluggableExtentionKt.pluggableSpi$default(ILocationOfflineService.class, false, false, false, 14, null);
        if (iLocationOfflineService != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("cost:");
            sbLIZ.append(jCurrentTimeMillis2 - jCurrentTimeMillis);
            iLocationOfflineService.LIZJ("Region", C2188811AlT.LIZIZ(sbLIZ));
            unit = Unit.LIZ;
        } else {
            unit = null;
        }
        C1C7U.LIZIZ("RegionAllListAssem@c16d.processAllRegions$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
