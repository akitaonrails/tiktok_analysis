package X;

import com.ss.android.ugc.aweme.story.archive2.model.GetArchivedStoryIDsResponse;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.01Qs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C332401Qs extends C09AY implements Function1<C1173560ge2, C1173560ge2> {
    public final /* synthetic */ GetArchivedStoryIDsResponse LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C332401Qs(GetArchivedStoryIDsResponse getArchivedStoryIDsResponse, boolean z) {
        super(1);
        this.LL = getArchivedStoryIDsResponse;
        this.LLILLJJLI = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1173560ge2 invoke(C1173560ge2 c1173560ge2) {
        C1173680geE c1173680geELIZJ;
        C1173560ge2 c1173560ge22 = c1173560ge2;
        GetArchivedStoryIDsResponse getArchivedStoryIDsResponse = this.LL;
        if (getArchivedStoryIDsResponse == null) {
            if (this.LLILLJJLI) {
                c1173680geELIZJ = C1173680geE.LIZ(c1173560ge22.LLILLJJLI, null, null, null, false, true, 15);
            } else {
                c1173680geELIZJ = C1173680geE.LIZ(c1173560ge22.LL, null, null, null, false, true, 15);
            }
        } else if (this.LLILLJJLI) {
            c1173680geELIZJ = c1173560ge22.LLILLJJLI.LIZJ(getArchivedStoryIDsResponse);
        } else {
            c1173680geELIZJ = c1173560ge22.LL.LIZJ(getArchivedStoryIDsResponse);
        }
        if (this.LLILLJJLI) {
            return C1173560ge2.LIZ(c1173560ge22, null, c1173680geELIZJ, null, null, 0L, false, false, false, null, 1021);
        }
        return C1173560ge2.LIZ(c1173560ge22, c1173680geELIZJ, null, null, null, 0L, false, false, false, null, 1022);
    }
}
