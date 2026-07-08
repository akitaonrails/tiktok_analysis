package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.ACLCommonShare;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeACLShare;
import kotlin.jvm.internal.AwS422S0200000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0m0j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1379830m0j extends AbstractC1382550m57 {
    public final String LJIIJ;
    public final int LJIIJJI;
    public final String LJIIL;
    public final boolean LJIILIIL;
    public final String LJIILJJIL;
    public final String LJIILL;
    public final String LJIILLIIL;
    public final C01GW LJIIZILJ;
    public final C01GW LJIJ;

    @Override // X.AbstractC1382550m57
    public final void LJ() {
    }

    @Override // X.AbstractC1382550m57
    public final boolean LJIIIIZZ() {
        return false;
    }

    @Override // X.AbstractC1382550m57
    public final boolean LJIIIZ() {
        return false;
    }

    @Override // X.AbstractC1382550m57
    public final boolean LJIIJ() {
        return false;
    }

    @Override // X.AbstractC21169117sn
    public final String LIZ() {
        return this.LJIILL;
    }

    @Override // X.AbstractC21169117sn
    public final String LIZIZ() {
        return this.LJIILLIIL;
    }

    @Override // X.AbstractC1382550m57
    public final String LIZLLL() {
        return this.LJIILJJIL;
    }

    public final ACLCommonShare LJIIJJI(Aweme aweme) {
        String str;
        String str2 = this.LJIIJ;
        if (Intrinsics.LJFF(str2, "download_action")) {
            AwemeACLShare awemeACLShare = aweme.awemeACLShareInfo;
            if (awemeACLShare != null) {
                return awemeACLShare.getDownloadGeneral();
            }
            return null;
        }
        if (Intrinsics.LJFF(str2, "share_download") && (str = this.LJIIL) != null && str.length() != 0) {
            C1373540lqa c1373540lqa = C1373850lr5.LIZ;
            String str3 = this.LJIIL;
            c1373540lqa.getClass();
            return C1373540lqa.LJII(aweme, str3);
        }
        return null;
    }

    public C1379830m0j(Context context, InterfaceC21168717sj interfaceC21168717sj, Aweme aweme, String str, String str2, String str3, int i, String str4, boolean z, String str5, int i2) {
        String aid;
        super(context, EnumC1292230jjR.DOWNLOAD_IMAGE.getSuffix(), EnumC1379880m0o.AWEME_STORY_PHOTO.getType(), interfaceC21168717sj, aweme, str, str2);
        this.LJIIJ = str3;
        this.LJIIJJI = i;
        this.LJIIL = str4;
        this.LJIILIIL = z;
        this.LJIILJJIL = str5;
        this.LJIILL = C2427709fH.LJIILLIIL(context);
        this.LJIILLIIL = C2427709fH.LJIJ(context);
        this.LJIIZILJ = C452501pT.LIZIZ(new AwS422S0200000_21(this, aweme, 114));
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1484));
        this.LJIJ = c01gwLIZIZ;
        this.LJ = C08HM.LIZJ((String) c01gwLIZIZ.getValue());
        C1376270luz c1376270luz = C1376270luz.LIZ;
        String aid2 = aweme.getAid();
        c1376270luz.getClass();
        Aweme aweme2 = C1376270luz.LJI;
        if (aweme2 != null) {
            aid = aweme2.getAid();
        } else {
            aid = null;
        }
        if (!Intrinsics.LJFF(aid2, aid)) {
            C1376270luz.LJIIIZ = 0;
        }
        C1376270luz.LJII = str;
        C1376270luz.LJ = false;
        C1376270luz.LJI = aweme;
        C1376270luz.LJIIIIZZ = str4;
    }
}
