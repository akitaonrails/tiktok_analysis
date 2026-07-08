package X;

import com.ss.android.ugc.aweme.feed.assem.share.VideoShareViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Spp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C733430Spp extends C09AY implements Function1<C732520SoM, C732520SoM> {
    public final /* synthetic */ VideoShareViewModel LL;
    public final /* synthetic */ String LLILLJJLI = "whatsapp";
    public final /* synthetic */ float LLILLL;
    public final /* synthetic */ float LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C733430Spp(VideoShareViewModel videoShareViewModel, float f, float f2) {
        super(1);
        this.LL = videoShareViewModel;
        this.LLILLL = f;
        this.LLILZ = f2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C732520SoM invoke(C732520SoM c732520SoM) {
        Aweme aweme;
        C732520SoM c732520SoM2 = c732520SoM;
        EnumC733460Sps enumC733460Sps = EnumC733460Sps.FLIP_AND_BREATHE;
        VideoItemParams item = this.LL.getItem();
        if (item != null) {
            aweme = item.getAweme();
        } else {
            aweme = null;
        }
        return C732520SoM.LIZ(c732520SoM2, null, null, null, null, null, new C291001Au(new Pair(enumC733460Sps, new C733530Spz(aweme, this.LL.eventType, this.LLILLJJLI, this.LLILLL, this.LLILZ))), 63);
    }
}
