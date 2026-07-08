package X;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0jKm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1276940jKm extends C09AY implements Function0<Unit> {
    public final /* synthetic */ AbstractC1273900jFs LL;
    public final /* synthetic */ C1276910jKj LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1276940jKm(AbstractC1273900jFs abstractC1273900jFs, C1276910jKj c1276910jKj, boolean z) {
        super(0);
        this.LL = abstractC1273900jFs;
        this.LLILLJJLI = c1276910jKj;
        this.LLILLL = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C1269340j8W c1269340j8WLLD = this.LL.LLD();
        C1276910jKj c1276910jKj = this.LLILLJJLI;
        boolean z = this.LLILLL;
        boolean z2 = c1276910jKj.LLILLJJLI;
        C965350bED c965350bED = c1276910jKj.LLILZ.LJJ;
        String str = c1276910jKj.LLILZIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("split on rtc, storeParams before originCapResolution: ");
        sbLIZ.append(c1276910jKj.LLJIJIL);
        sbLIZ.append(", originClipResolution: ");
        sbLIZ.append(c1276910jKj.LLJILJIL);
        sbLIZ.append(", originCapFps: ");
        sbLIZ.append(c1276910jKj.LLJILLL);
        sbLIZ.append(", enable: ");
        sbLIZ.append(c1269340j8WLLD.LJJIIZ().LIZLLL);
        sbLIZ.append(", fpsCache=");
        sbLIZ.append(c1276910jKj.LLJJ);
        sbLIZ.append(";storeParams after capResolution: ");
        sbLIZ.append(new Pair(Integer.valueOf(c1269340j8WLLD.LJJIIZI()), Integer.valueOf(c1269340j8WLLD.LJJIIJ())));
        sbLIZ.append(",clipResolution: ");
        sbLIZ.append(new Pair(Integer.valueOf(c1269340j8WLLD.LJIILJJIL(1)), Integer.valueOf(c1269340j8WLLD.LJIILIIL(1))));
        sbLIZ.append(" , capFps: ");
        sbLIZ.append(new Pair(Integer.valueOf(c1269340j8WLLD.LJJIIJZLJL()), Integer.valueOf(c1269340j8WLLD.LJJIII())));
        sbLIZ.append(", enable: ");
        sbLIZ.append(c1269340j8WLLD.LJJIIZ().LIZLLL);
        sbLIZ.append("videoFps:");
        sbLIZ.append(c1269340j8WLLD.LJJIJIIJI());
        sbLIZ.append(", isRoomOwner:");
        sbLIZ.append(z2);
        C1AZW.LIZIZ(c965350bED, str, C2188811AlT.LIZIZ(sbLIZ), null, null);
        if (c1276910jKj.LLJIJIL == null) {
            c1276910jKj.LLJIJIL = new Pair<>(Integer.valueOf(c1269340j8WLLD.LJJIIZI()), Integer.valueOf(c1269340j8WLLD.LJJIIJ()));
            String str2 = c1276910jKj.LLILZIL;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("split on rtc, storeParams, originCapResolution: ");
            sbLIZ2.append(c1276910jKj.LLJIJIL);
            C1AZW.LJIIJ(12, str2, C2188811AlT.LIZIZ(sbLIZ2), null, null);
        }
        if (z) {
            if (c1276910jKj.LLJILJILJ == null) {
                c1276910jKj.LLJILJILJ = new Pair<>(Integer.valueOf(c1269340j8WLLD.LJIILJJIL(1)), Integer.valueOf(c1269340j8WLLD.LJIILIIL(1)));
                String str3 = c1276910jKj.LLILZIL;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("split on rtc, storeParams, tempClipResolution: ");
                sbLIZ3.append(c1276910jKj.LLJILJILJ);
                C1AZW.LJIIJ(12, str3, C2188811AlT.LIZIZ(sbLIZ3), null, null);
            }
        } else if (c1276910jKj.LLJILJIL == null) {
            c1276910jKj.LLJILJIL = new Pair<>(Integer.valueOf(c1269340j8WLLD.LJIILJJIL(1)), Integer.valueOf(c1269340j8WLLD.LJIILIIL(1)));
            String str4 = c1276910jKj.LLILZIL;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("split on rtc, storeParams, originClipResolution: ");
            sbLIZ4.append(c1276910jKj.LLJILJIL);
            C1AZW.LJIIJ(12, str4, C2188811AlT.LIZIZ(sbLIZ4), null, null);
        }
        if (c1276910jKj.LLJILLL == null) {
            c1276910jKj.LLJILLL = new Pair<>(Integer.valueOf(c1269340j8WLLD.LJJIIJZLJL()), Integer.valueOf(c1269340j8WLLD.LJJIII()));
            String str5 = c1276910jKj.LLILZIL;
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("split on rtc, storeParams, originCapFps: ");
            sbLIZ5.append(c1276910jKj.LLJILLL);
            sbLIZ5.append(", enable: ");
            sbLIZ5.append(c1269340j8WLLD.LJJIIZ().LIZLLL);
            C1AZW.LJIIJ(12, str5, C2188811AlT.LIZIZ(sbLIZ5), null, null);
        }
        if (z2 && c1276910jKj.LLJJ <= 0) {
            c1276910jKj.LLJJ = c1269340j8WLLD.LJJIJIIJI();
            String str6 = c1276910jKj.LLILZIL;
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("storeParams videoFps:");
            sbLIZ6.append(c1276910jKj.LLJJ);
            C1AZW.LJIIJ(12, str6, C2188811AlT.LIZIZ(sbLIZ6), null, null);
        }
        return Unit.LIZ;
    }
}
