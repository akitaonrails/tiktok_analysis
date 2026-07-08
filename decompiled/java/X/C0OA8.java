package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.localservice.optimistic.VideoLikeService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0OA8, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OA8 extends C09AY implements Function2<C0OA0, Boolean, Unit> {
    public final /* synthetic */ VideoLikeService LLILLJJLI;
    public final /* synthetic */ Aweme LLILLL;
    public final /* synthetic */ C0OAA<Function2<Boolean, Boolean, Unit>> LLILZ;
    public final /* synthetic */ boolean LL = true;
    public final /* synthetic */ String LLILZIL = "homepage_nearby";
    public final /* synthetic */ String LLILZLL = "nearby_tab_outflow";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0OA8(VideoLikeService videoLikeService, Aweme aweme, C0OAA c0oaa) {
        super(2);
        this.LLILLJJLI = videoLikeService;
        this.LLILLL = aweme;
        this.LLILZ = c0oaa;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(C0OA0 c0oa0, Boolean bool) {
        C0OA0 c0oa02 = c0oa0;
        boolean zBooleanValue = bool.booleanValue();
        if (!this.LL || zBooleanValue) {
            VideoLikeService videoLikeService = this.LLILLJJLI;
            Aweme aweme = this.LLILLL;
            boolean z = c0oa02.LIZ;
            videoLikeService.getClass();
            VideoLikeService.LJIIJ(aweme, z ? 1 : 0);
            C737030Svd c737030Svd = new C737030Svd(13, this.LLILLL.getAid());
            String str = this.LLILZIL;
            String str2 = this.LLILZLL;
            c737030Svd.LJ = str;
            c737030Svd.LIZLLL = str2;
            Bundle bundle = new Bundle();
            bundle.putInt("user_digged", c0oa02.LIZ ? 1 : 0);
            c737030Svd.LIZJ = bundle;
            C1440005kM.LIZ(c737030Svd);
        }
        Function2<Boolean, Boolean, Unit> function2 = this.LLILZ.LIZ;
        if (function2 != null) {
            return function2.invoke(Boolean.valueOf(c0oa02.LIZ), Boolean.valueOf(zBooleanValue));
        }
        return null;
    }
}
