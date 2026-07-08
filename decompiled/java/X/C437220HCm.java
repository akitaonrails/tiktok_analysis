package X;

import com.ss.android.ugc.ur.socialavatar.SocialAvatarResultResponse;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0HCm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C437220HCm extends C09AY implements Function1<C0HNI, C0HNI> {
    public final /* synthetic */ List<C436960HBm> LL;
    public final /* synthetic */ C436960HBm LLILLJJLI;
    public final /* synthetic */ C0HFD LLILLL;
    public final /* synthetic */ Long LLILZ;
    public final /* synthetic */ SocialAvatarResultResponse LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C437220HCm(List<C436960HBm> list, C436960HBm c436960HBm, C0HFD c0hfd, Long l, SocialAvatarResultResponse socialAvatarResultResponse, String str) {
        super(1);
        this.LL = list;
        this.LLILLJJLI = c436960HBm;
        this.LLILLL = c0hfd;
        this.LLILZ = l;
        this.LLILZIL = socialAvatarResultResponse;
        this.LLILZLL = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C0HNI invoke(C0HNI c0hni) {
        String str;
        int i;
        C0HFS c0hfs;
        C0HNI c0hni2 = c0hni;
        Boolean bool = Boolean.TRUE;
        List<C436960HBm> list = this.LL;
        C436960HBm c436960HBm = this.LLILLJJLI;
        C0HFD c0hfd = this.LLILLL;
        Long l = this.LLILZ;
        boolean z = this.LLILZIL.useNewSaveFlow;
        if (c436960HBm == null || (str = c436960HBm.LJI) == null) {
            str = "";
        }
        if (c0hfd != null && (c0hfs = c0hfd.LIZ) != null) {
            i = c0hfs.LIZ;
        } else {
            i = -1;
        }
        return C0HNI.LIZ(c0hni2, bool, list, c436960HBm, c0hfd, l, z, str, i, false, false, false, this.LLILZLL, null, null, 14080);
    }
}
