package X;

import Y.ARunnableS2S0410000_8;
import android.os.Bundle;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.services.external.ability.IOpenPhotoNextService;
import com.ss.android.ugc.aweme.services.external.ability.IPageToFinish;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1Drk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2269141Drk extends C09AY implements Function0<C565850MHf> {
    public C2269141Drk() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0MHf] */
    @Override // kotlin.jvm.functions.Function0
    public final C565850MHf invoke() {
        return new IOpenPhotoNextService() { // from class: X.0MHf
            @Override // com.ss.android.ugc.aweme.services.external.ability.IOpenPhotoNextService
            public final void openEditPageForImages(C19EG c19eg, Bundle bundle, List<String> list) {
                C573020Mdg c573020Mdg = new C573020Mdg(c19eg, false, false);
                ShortVideoContext shortVideoContextLIZIZ = C1443540nfU.LIZIZ(bundle);
                C1443030nef c1443030nefLJII = C1443030nef.LJII();
                String str = shortVideoContextLIZIZ.shootWay;
                c1443030nefLJII.LIZIZ = str;
                c1443030nefLJII.LIZJ = str;
                C1443030nef.LJII().LIZLLL = shortVideoContextLIZIZ.mShootFrom;
                C573020Mdg.LJIIIIZZ(c573020Mdg, shortVideoContextLIZIZ, list, null, false, null, Long.valueOf(System.currentTimeMillis()), false, bundle.getParcelableArrayList("extra_image_model_media_list"), bundle.getString(FollowStatusChangeMethod.PARAM_UID), null, null, null, 15360);
            }

            @Override // com.ss.android.ugc.aweme.services.external.ability.IOpenPhotoNextService
            public final void gotoNextPage(C19EG c19eg, boolean z, Bundle bundle, List<String> list, IPageToFinish iPageToFinish) {
                c19eg.runOnUiThread(new ARunnableS2S0410000_8(c19eg, z, bundle, list, iPageToFinish, 0));
            }
        };
    }
}
