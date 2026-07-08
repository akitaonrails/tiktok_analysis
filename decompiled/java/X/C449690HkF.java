package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.AFwS192S0000000_6;

/* JADX INFO: renamed from: X.0HkF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C449690HkF implements C0I06 {
    public static final C449690HkF LL = new C449690HkF();
    public static final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(450));

    @Override // X.C0I06
    public final Integer Ga() {
        return null;
    }

    public static final Keva LIZ() {
        return (Keva) LLILLJJLI.getValue();
    }

    public static final String LIZIZ() {
        String curUserId = C0I0B.LJFF.LIZ().getCurUserId();
        return curUserId == null ? "" : curUserId;
    }

    @Override // X.C0I06
    public final int fJ() {
        Keva kevaLIZ = LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("emoji_type");
        sbLIZ.append(LIZIZ());
        return kevaLIZ.getInt(C2188811AlT.LIZIZ(sbLIZ), -1);
    }

    @Override // X.C0I06
    public final long hN() {
        Keva kevaLIZ = LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sticker_set_id");
        sbLIZ.append(LIZIZ());
        return kevaLIZ.getLong(C2188811AlT.LIZIZ(sbLIZ), -1L);
    }

    @Override // X.C0I06
    public final void Dg(int i) {
        Keva kevaLIZ = LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("emoji_type");
        sbLIZ.append(LIZIZ());
        kevaLIZ.storeInt(C2188811AlT.LIZIZ(sbLIZ), i);
    }

    @Override // X.C0I06
    public final void c8(long j) {
        Keva kevaLIZ = LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sticker_set_id");
        sbLIZ.append(LIZIZ());
        kevaLIZ.storeLong(C2188811AlT.LIZIZ(sbLIZ), j);
    }

    @Override // X.C0I06
    public final void la(int i) {
        Keva kevaLIZ = LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("scroll_offset");
        sbLIZ.append(LIZIZ());
        kevaLIZ.storeInt(C2188811AlT.LIZIZ(sbLIZ), i);
    }

    @Override // X.C0I06
    public final void z4(int i) {
        Keva kevaLIZ = LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("scroll_position");
        sbLIZ.append(LIZIZ());
        kevaLIZ.storeInt(C2188811AlT.LIZIZ(sbLIZ), i);
    }
}
