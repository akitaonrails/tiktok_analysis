package X;

import com.ss.android.ugc.aweme.feed.model.banner.BannerCommonAction;

/* JADX INFO: renamed from: X.0SH1, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SH1 {
    public final EnumC638200P1m LIZ;
    public final BannerCommonAction LIZIZ;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C0SH1(BannerCommonAction bannerCommonAction, int i) {
        EnumC638200P1m enumC638200P1m;
        if ((i & 1) != 0) {
            enumC638200P1m = EnumC638200P1m.PRIMARY;
        } else {
            enumC638200P1m = null;
        }
        this(enumC638200P1m, (i & 2) != 0 ? null : bannerCommonAction);
    }

    public C0SH1(EnumC638200P1m enumC638200P1m, BannerCommonAction bannerCommonAction) {
        this.LIZ = enumC638200P1m;
        this.LIZIZ = bannerCommonAction;
    }
}
