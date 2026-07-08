package X;

import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;

/* JADX INFO: renamed from: X.0sb8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1633040sb8 implements InterfaceC1632830san {
    public final String LIZ;

    public C1633040sb8(String str) {
        this.LIZ = str;
    }

    @Override // X.InterfaceC1632830san
    public final boolean LIZ(ProviderEffect providerEffect) {
        return C2286708xd.LIZJ(LIZIZ(providerEffect));
    }

    @Override // X.InterfaceC1632830san
    public final String LIZIZ(ProviderEffect providerEffect) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C1489060oqu.LIZ(this.LIZ));
        sbLIZ.append(providerEffect.getId());
        sbLIZ.append(".gif");
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
