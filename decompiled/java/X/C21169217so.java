package X;

import X.AbstractC21169117sn;
import com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadMobProtocol;
import com.ss.android.ugc.aweme.share.base.download.configuration.protocol.MuteAudioAbilityProtocol;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.17so, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21169217so<CONTEXT extends AbstractC21169117sn> extends AbstractC21169717st<CONTEXT> {
    public final MuteAudioAbilityProtocol<CONTEXT> LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final C01GW LJIIJ;

    @Override // X.InterfaceC21170217sy
    public final String LIZIZ() {
        return "MuteAudioAbility";
    }

    @Override // X.AbstractC21169717st
    public final void LJII() {
    }

    @Override // X.AbstractC21169717st
    public final void LJIIIZ(String str, String str2) {
    }

    @Override // X.AbstractC21169717st
    public final void LJI() {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C21169317sp(this, null), 3);
    }

    @Override // X.InterfaceC21170217sy
    public final void cancel() {
        LIZJ(this.LJIIIZ);
    }

    public C21169217so(CONTEXT context, MuteAudioAbilityProtocol<CONTEXT> muteAudioAbilityProtocol) {
        String strLIZ;
        super(context);
        this.LJII = muteAudioAbilityProtocol;
        if (C289400BVy.LIZ()) {
            strLIZ = context.LIZIZ();
        } else {
            strLIZ = context.LIZ();
        }
        this.LJIIIIZZ = strLIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(context.LJ);
        sbLIZ.append("_mute");
        sbLIZ.append(context.LIZIZ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(strLIZ);
        sbLIZ2.append(strLIZIZ);
        this.LJIIIZ = C2188811AlT.LIZIZ(sbLIZ2);
        this.LJIIJ = C452501pT.LIZIZ(new AwS576S0100000_32(this, 441));
    }

    @Override // X.AbstractC21169717st
    public final void LJIIIIZZ(int i, String str, String str2, String str3) {
        DownloadMobProtocol<CONTEXT> downloadMobProtocol = this.LJ;
        if (downloadMobProtocol != null) {
            downloadMobProtocol.LJIILIIL(i, str2);
        }
    }
}
