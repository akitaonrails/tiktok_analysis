package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.notification.bean.BioMentionListResponse;
import com.ss.android.ugc.aweme.notification.bean.SocialAvatarLikeListResponse;
import com.ss.android.ugc.aweme.notification.bean.TranslationLikeListResponse;

/* JADX INFO: renamed from: X.0zmS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1909140zmS {
    public static final InterfaceC1909150zmT LIZ = (InterfaceC1909150zmT) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).LIZ(C593760NQo.LIZ).create(InterfaceC1909150zmT.class);

    public static C11NZ<BioMentionListResponse> LIZIZ() {
        return LIZ.LIZIZ();
    }

    public static C15O7 LIZJ(long j, String str) {
        return LIZ.LIZJ(str, j, 20, 1);
    }

    public static C11NZ LIZ(String str, long j, long j2) {
        return LIZ.LJ(str, j, j2, 10);
    }

    public static C11NZ<SocialAvatarLikeListResponse> LJ(long j, long j2, String str) {
        return LIZ.LIZ(j, j2, str);
    }

    public static C15O7<TranslationLikeListResponse> LJFF(String str, String str2, long j, long j2) {
        return LIZ.LIZLLL(str, str2, j, j2);
    }

    public static C15O7 LIZLLL(long j, long j2, boolean z, int i, String str, String str2) {
        return LIZ.LJFF(j, j2, 20, z, i, str, 0, str2);
    }
}
