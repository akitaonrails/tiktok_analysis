package X;

import com.ss.android.ugc.aweme.notice.api.bean.EntranceKey;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeGroupAttrs;
import com.ss.android.ugc.aweme.notice.api.services.INoticeCountService;
import java.util.Arrays;

/* JADX INFO: renamed from: X.0zdo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1903780zdo {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C816240W0g());

    public static INoticeCountService LJII() {
        return (INoticeCountService) LIZ.getValue();
    }

    public static final int LJFF() {
        return LJII().LJIIJJI();
    }

    public static final int LJIIIIZZ() {
        return LJII().LJIIZILJ();
    }

    public static final void LIZIZ(EntranceKey entranceKey) {
        LJII().LJIJJ(entranceKey);
    }

    public static final void LIZJ(int... iArr) {
        LJII().LJFF(null, false, iArr);
    }

    public static final void LIZLLL(int... iArr) {
        LJII().LJJIFFI(null, iArr);
    }

    public static final void LJ(int... iArr) {
        for (int i : iArr) {
            LJII().LJ(i, null, false);
        }
    }

    public static final NoticeGroupAttrs LJI(int i) {
        return LJII().LJIILIIL(i);
    }

    public static final int LJIIIZ(int... iArr) {
        return LJII().LJIIJ(iArr, true);
    }

    public static final int LJIIJ(int... iArr) {
        return LJII().LJIIJ(iArr, false);
    }

    public static final boolean LJIIJJI(int... iArr) {
        return LJII().LJIIIIZZ(null, false, Arrays.copyOf(iArr, iArr.length));
    }

    public static final void LIZ(EnumC624380OeK enumC624380OeK, int... iArr) {
        LJII().LJFF(enumC624380OeK, false, iArr);
    }
}
