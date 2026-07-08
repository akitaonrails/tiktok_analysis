package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;

/* JADX INFO: renamed from: X.0cKm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1007860cKm implements InterfaceC1007880cKo {
    public boolean LIZLLL;
    public Aweme LJFF;
    public C0P9H LJI;
    public final C603820NmG<String, EnumC590180NCu> LIZ = new C603820NmG<>(20);
    public final C603820NmG<String, C1009960cOA> LIZIZ = new C603820NmG<>(20);
    public EnumC710310Rtd LIZJ = EnumC710310Rtd.UNKNOWN;
    public int LJ = -1;
    public final C603820NmG<String, C1007830cKj> LJII = new C603820NmG<>(20);

    @Override // X.InterfaceC1007880cKo
    public final C1009960cOA LIZ(Aweme aweme) {
        if (aweme == null) {
            return null;
        }
        String aid = aweme.getAid();
        if (aid == null) {
            aid = "";
        }
        if (this.LIZIZ.LIZJ(aid) == null) {
            this.LIZIZ.LIZLLL(aid, new C1009960cOA());
        }
        return this.LIZIZ.LIZJ(aid);
    }

    public final EnumC590180NCu LIZJ(Aweme aweme) {
        String aid;
        if (aweme == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        EnumC590180NCu enumC590180NCuLIZJ = this.LIZ.LIZJ(aid);
        if (enumC590180NCuLIZJ == null) {
            enumC590180NCuLIZJ = EnumC590180NCu.NOT_TRACK;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getShowEventTrackStatus key=");
        sbLIZ.append(aid);
        sbLIZ.append(", status = ");
        sbLIZ.append(this.LIZ.LIZJ(aid));
        C2188811AlT.LIZIZ(sbLIZ);
        int i = C2510609se.LIZ;
        return enumC590180NCuLIZJ;
    }

    public final C0PPD LIZIZ(Aweme aweme, String str) {
        String aid;
        AwemeRawAd awemeRawAd;
        if (str == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            Integer numValueOf = null;
            if (aweme != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            sbLIZ.append(aid);
            if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
                numValueOf = Integer.valueOf(awemeRawAd.getRit());
            }
            sbLIZ.append(numValueOf);
            str = C2188811AlT.LIZIZ(sbLIZ);
        }
        if (this.LJII.LIZJ(str) == null) {
            this.LJII.LIZLLL(str, new C1007830cKj());
        }
        return this.LJII.LIZJ(str);
    }

    public final void LIZLLL(Aweme aweme, EnumC590180NCu enumC590180NCu) {
        String aid;
        if (aweme == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateShowEventTrackStatus key=");
        sbLIZ.append(aid);
        sbLIZ.append(", status = ");
        sbLIZ.append(enumC590180NCu);
        C2188811AlT.LIZIZ(sbLIZ);
        int i = C2510609se.LIZ;
        this.LIZ.LIZLLL(aid, enumC590180NCu);
    }
}
