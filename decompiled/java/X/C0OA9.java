package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.localservice.optimistic.VideoLikeService;
import java.lang.ref.WeakReference;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0OA9, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OA9 extends C09AY implements InterfaceC1631620sYq<C0OA0, Boolean, Throwable, Unit> {
    public final /* synthetic */ VideoLikeService LL;
    public final /* synthetic */ Aweme LLILLJJLI;
    public final /* synthetic */ WeakReference<Fragment> LLILLL;
    public final /* synthetic */ C0OAA<InterfaceC1631620sYq<Boolean, Boolean, Throwable, Unit>> LLILZ;
    public final /* synthetic */ String LLILZIL = "homepage_nearby";
    public final /* synthetic */ String LLILZLL = "nearby_tab_outflow";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0OA9(VideoLikeService videoLikeService, Aweme aweme, WeakReference weakReference, C0OAA c0oaa) {
        super(3);
        this.LL = videoLikeService;
        this.LLILLJJLI = aweme;
        this.LLILLL = weakReference;
        this.LLILZ = c0oaa;
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(C0OA0 c0oa0, Boolean bool, Throwable th) {
        Context context;
        int i;
        C0OA0 c0oa02 = c0oa0;
        boolean zBooleanValue = bool.booleanValue();
        Throwable th2 = th;
        if (zBooleanValue) {
            VideoLikeService videoLikeService = this.LL;
            Aweme aweme = this.LLILLJJLI;
            boolean z = c0oa02.LIZ;
            videoLikeService.getClass();
            VideoLikeService.LJIIJ(aweme, z ? 1 : 0);
            C737030Svd c737030Svd = new C737030Svd(13, this.LLILLJJLI.getAid());
            String str = this.LLILZIL;
            String str2 = this.LLILZLL;
            c737030Svd.LJ = str;
            c737030Svd.LIZLLL = str2;
            Bundle bundle = new Bundle();
            bundle.putInt("user_digged", c0oa02.LIZ ? 1 : 0);
            c737030Svd.LIZJ = bundle;
            C1440005kM.LIZ(c737030Svd);
        }
        Fragment fragment = this.LLILLL.get();
        if (fragment != null && (context = fragment.getContext()) != null) {
            if (c0oa02.LIZ) {
                i = 2131857729;
            } else {
                i = 2131830649;
            }
            C1354920lMY.LIZLLL(context, th2, i);
        }
        InterfaceC1631620sYq<Boolean, Boolean, Throwable, Unit> interfaceC1631620sYq = this.LLILZ.LIZ;
        if (interfaceC1631620sYq != null) {
            return interfaceC1631620sYq.invoke(Boolean.valueOf(c0oa02.LIZ), Boolean.valueOf(zBooleanValue), th2);
        }
        return null;
    }
}
