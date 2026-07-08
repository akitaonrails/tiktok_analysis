package X;

import com.bytedance.keva.Keva;

/* JADX INFO: renamed from: X.0CmT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C323670CmT {
    public static final C323670CmT LIZ = new C323670CmT();

    public static Keva LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("feed_insert_recommend_user_card_common_");
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        return Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
    }
}
