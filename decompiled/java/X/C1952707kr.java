package X;

import com.bytedance.keva.Keva;

/* JADX INFO: renamed from: X.07kr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1952707kr {
    public static final C1952707kr LIZ = new C1952707kr();

    public static Keva LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("insert_rec_user_card_into_rec_feed_");
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        return Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
    }
}
