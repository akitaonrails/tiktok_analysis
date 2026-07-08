package X;

import com.ss.android.ugc.aweme.im.userportrait.api.service.IMUserPortraitApi;

/* JADX INFO: renamed from: X.1DtE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2270061DtE implements InterfaceC888670Ytd {
    public static final C2270061DtE LIZ = new C2270061DtE();

    public static final InterfaceC2270081DtG LJJIFFI() {
        IMUserPortraitApi.LIZ.getClass();
        return C1730606q8.LIZ().LIZJ();
    }

    @Override // X.InterfaceC888670Ytd
    public final boolean LJIIJ() {
        return LJJIFFI().LIZJ(LJJIFFI().LIZLLL(), 12L, 14L).LIZ();
    }

    @Override // X.InterfaceC888670Ytd
    public final boolean LJIL() {
        return LJJIFFI().LIZJ(LJJIFFI().LIZLLL(), 9L, 14L).LIZ();
    }

    @Override // X.InterfaceC888670Ytd
    public final int LIZIZ(String str) {
        Long l = (Long) LJJIFFI().LIZ(C1555980qaq.LIZ("dm_conversation_count_last_login", str)).LJFF();
        if (l != null) {
            return (int) l.longValue();
        }
        return -1;
    }

    @Override // X.InterfaceC888670Ytd
    public final void LJJ(int i, String str) {
        LJJIFFI().LIZ(C1555980qaq.LIZ("dm_conversation_count_last_login", str)).LIZ(Long.valueOf(i));
    }
}
