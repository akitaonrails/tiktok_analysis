package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialogBuilder;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import kotlin.Pair;
import kotlin.jvm.internal.AwS582S0100000_3;

/* JADX INFO: renamed from: X.0Kwf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C533830Kwf implements InterfaceC522520KeQ {
    public final C19EG LL;
    public final long LLILLJJLI;
    public final long LLILLL;
    public final C536280L1m LLILZ;

    @Override // X.InterfaceC522520KeQ
    public final void LIZIZ(AwS582S0100000_3 awS582S0100000_3) {
    }

    @Override // X.InterfaceC522520KeQ
    public final void LJJLIIIJJIZ() {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0L1m] */
    public C533830Kwf(C19EG c19eg, long j, long j2) {
        this.LL = c19eg;
        this.LLILLJJLI = j;
        this.LLILLL = j2;
        final C19EG c19eg2 = this.LL;
        final long j3 = this.LLILLJJLI;
        final long j4 = this.LLILLL;
        this.LLILZ = new C0L7R(c19eg2, j3, j4) { // from class: X.0L1m
            @Override // X.C0L7R
            public final String LJIILL(CreativeInfo creativeInfo) {
                if (!C305160Bxi.LIZ()) {
                    return null;
                }
                String strLIZLLL = C2298208zU.LIZLLL(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), creativeInfo, EnumC20228214Cy.CONCAT, null, false, 12);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strLIZLLL);
                sbLIZ.append(C1449640npK.LIZ("-concat-v.mp4"));
                return new C0VSJ(C2188811AlT.LIZIZ(sbLIZ)).getPath();
            }

            @Override // X.C0L7R
            public final CreativeLoadingDialogBuilder LJIILLIIL(Activity activity) {
                CreativeLoadingDialogBuilder creativeLoadingDialogBuilderLJIILLIIL = super.LJIILLIIL(activity);
                creativeLoadingDialogBuilderLJIILLIIL.loadingMessage(activity.getString(2131845263));
                return creativeLoadingDialogBuilderLJIILLIIL;
            }

            @Override // X.C0L7R
            public final boolean LJJIJIIJIL(VideoSegment videoSegment, boolean z, CreativeInfo creativeInfo, InterfaceC2357009Lk interfaceC2357009Lk) {
                boolean z2;
                Pair pair = new Pair(Integer.valueOf(C578540Mma.LIZ().uploadCompressWidthThreshold), Integer.valueOf(C540010LFv.LIZLLL(C578540Mma.LIZ().uploadCompressWidthThreshold)));
                if (videoSegment.width * videoSegment.height > ((Number) pair.getFirst()).intValue() * ((Number) pair.getSecond()).intValue()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!C536290L1n.LIZ(videoSegment) || z2) {
                    return true;
                }
                return false;
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00d2  */
    @Override // X.InterfaceC522520KeQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(int r25, int r26, android.content.Intent r27) {
        /*
            Method dump skipped, instruction units count: 455
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C533830Kwf.LIZ(int, int, android.content.Intent):void");
    }
}
