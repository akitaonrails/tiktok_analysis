package X;

import com.ss.android.ugc.aweme.feed.assem.share.VideoShareViewModel;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0SoV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C732610SoV extends C09AY implements Function1<C732520SoM, C732520SoM> {
    public final /* synthetic */ VideoShareViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C732610SoV(VideoShareViewModel videoShareViewModel) {
        super(1);
        this.LL = videoShareViewModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final C732520SoM invoke(C732520SoM c732520SoM) {
        C732600SoU c732600SoU;
        C732600SoU c732600SoU2;
        C732520SoM c732520SoM2 = c732520SoM;
        C732520SoM c732520SoM3 = (C732520SoM) this.LL.getState();
        if (c732520SoM3 != null && (c732600SoU2 = c732520SoM3.LLILLJJLI) != null) {
            c732600SoU = new C732600SoU(this.LL.getForceTextVisible(), c732600SoU2.LIZIZ, c732600SoU2.LIZJ);
        } else {
            c732600SoU = null;
        }
        return C732520SoM.LIZ(c732520SoM2, c732600SoU, null, null, null, null, null, 125);
    }
}
