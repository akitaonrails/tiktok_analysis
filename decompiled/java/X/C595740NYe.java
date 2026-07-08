package X;

import com.ss.android.ugc.aweme.im.activity.status.sdk.api.ActivityStatusExternalToolService;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.privacy.PrivacySettingsFeature;
import com.ss.android.ugc.aweme.im.saas.host.api.im.IMNetworkSaasApi;
import com.ss.android.ugc.aweme.im.saas.host.api.im.utils.IMALogApi;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0NYe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C595740NYe extends C09AY implements Function1<InterfaceC595750NYf, Unit> {
    public C595740NYe() {
        super(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [X.065o] */
    /* JADX WARN: Type inference failed for: r0v13, types: [X.0NXQ] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.0YLk] */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.0NYd] */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.0NY3] */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.0NYI] */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.0NXz] */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.0NYz] */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC595750NYf interfaceC595750NYf) {
        InterfaceC595750NYf interfaceC595750NYf2 = interfaceC595750NYf;
        C1DFH c1dfh = C0PEM.LIZ;
        interfaceC595750NYf2.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ));
        interfaceC595750NYf2.LJIIJJI(new C597200Nba());
        interfaceC595750NYf2.LJI(new C0NY8() { // from class: X.0YLk
            @Override // X.C0NY8
            public final void LIZ(int i, String str, String str2) {
                IMALogApi.LIZ.getClass();
                IMALogApi iMALogApiLIZ = C0Z53.LIZ();
                if (iMALogApiLIZ != null) {
                    iMALogApiLIZ.LIZ(i, str, str2);
                }
            }
        });
        interfaceC595750NYf2.LIZ(new C0NXT() { // from class: X.0NYd
            @Override // X.C0NXT
            public final void d() {
            }

            @Override // X.C0NXT
            public final void e() {
            }

            @Override // X.C0NXT
            public final void i() {
            }
        });
        interfaceC595750NYf2.LJII(new C0NXF() { // from class: X.0NY3
            @Override // X.C0NXF
            public final long LIZ() {
                return System.currentTimeMillis();
            }
        });
        interfaceC595750NYf2.LIZIZ(new C0NYH() { // from class: X.0NYI
            @Override // X.C0NYH
            public final C898360ZMc LIZ() {
                return new C898360ZMc();
            }
        });
        final C13BV c13bv = C13BV.INSTANCE;
        interfaceC595750NYf2.LJFF(new C0NX9(c13bv) { // from class: X.0NXz
            public final List<C0NY2> LIZ;

            @Override // X.C0NX9
            public final C898370ZMd LIZ() {
                return new C898370ZMd();
            }

            {
                this.LIZ = c13bv;
            }
        });
        final PrivacySettingsFeature privacySettingsFeature = (PrivacySettingsFeature) C0ZJX.LIZJ.getValue();
        interfaceC595750NYf2.LJIIIIZZ(new InterfaceC595940NYy(privacySettingsFeature) { // from class: X.0NYz
            public final PrivacySettingsFeature LIZ;

            /* JADX WARN: Type inference failed for: r1v0, types: [X.0ZH9] */
            @Override // X.InterfaceC595940NYy
            public final C0ZH9 LIZ() {
                final PrivacySettingsFeature privacySettingsFeature2 = this.LIZ;
                return new C0NYJ(privacySettingsFeature2) { // from class: X.0ZH9
                    public final PrivacySettingsFeature LIZ;

                    {
                        this.LIZ = privacySettingsFeature2;
                    }

                    @Override // X.C0NYJ
                    public final boolean LIZ(String str, String str2) {
                        IMNetworkSaasApi.LIZ.getClass();
                        IMNetworkSaasApi iMNetworkSaasApiLIZ = C05O2.LIZ();
                        if (iMNetworkSaasApiLIZ != null && iMNetworkSaasApiLIZ.LJLJLJ()) {
                            return true;
                        }
                        if (str == null && str2 == null) {
                            return !C0ZH6.LIZIZ(this.LIZ);
                        }
                        if (!Intrinsics.LJFF(str, "enter_background") && C0ZH6.LIZIZ(this.LIZ)) {
                            return false;
                        }
                        return true;
                    }
                };
            }

            /* JADX WARN: Type inference failed for: r1v0, types: [X.0ZH8] */
            @Override // X.InterfaceC595940NYy
            public final C0ZH8 LIZIZ() {
                final PrivacySettingsFeature privacySettingsFeature2 = this.LIZ;
                return new InterfaceC595310NWn(privacySettingsFeature2) { // from class: X.0ZH8
                    public final PrivacySettingsFeature LIZ;

                    @Override // X.InterfaceC595310NWn
                    public final boolean LIZ() {
                        return (C0ZH6.LIZIZ(this.LIZ) || C1689706jX.LIZ()) ? false : true;
                    }

                    @Override // X.InterfaceC595310NWn
                    public final boolean LIZIZ() {
                        IMNetworkSaasApi.LIZ.getClass();
                        IMNetworkSaasApi iMNetworkSaasApiLIZ = C05O2.LIZ();
                        if (iMNetworkSaasApiLIZ == null || !iMNetworkSaasApiLIZ.LJLJLJ()) {
                            return (C0ZH6.LIZIZ(this.LIZ) || C1689706jX.LIZ()) ? false : true;
                        }
                        return true;
                    }

                    {
                        this.LIZ = privacySettingsFeature2;
                    }
                };
            }

            @Override // X.InterfaceC595940NYy
            public final C897630ZJh LIZJ() {
                return new C897630ZJh(this.LIZ);
            }

            {
                this.LIZ = privacySettingsFeature;
            }
        });
        interfaceC595750NYf2.LJ(new C0NXE() { // from class: X.065o
            @Override // X.C0NXE
            public final void LIZ(String str, C0NXK c0nxk, C0NXK c0nxk2, String str2) {
                boolean zLIZIZ;
                if (c0nxk == null || c0nxk2 == null) {
                    return;
                }
                ActivityStatusExternalToolService.LIZ.getClass();
                InterfaceC595880NYs interfaceC595880NYsLIZ = C04TB.LIZ().LIZ();
                boolean zLIZIZ2 = false;
                if (interfaceC595880NYsLIZ != null) {
                    zLIZIZ = interfaceC595880NYsLIZ.LIZIZ(c0nxk);
                } else {
                    zLIZIZ = false;
                }
                InterfaceC595880NYs interfaceC595880NYsLIZ2 = C04TB.LIZ().LIZ();
                if (interfaceC595880NYsLIZ2 != null) {
                    zLIZIZ2 = interfaceC595880NYsLIZ2.LIZIZ(c0nxk2);
                }
                long j = c0nxk2.LIZIZ;
                if (!zLIZIZ && zLIZIZ2) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - (j * 1000);
                    InterfaceC897380ZIi.LIZIZ.getClass();
                    C897370ZIh.LIZ().LJFF();
                    if (str2 == null) {
                        str2 = EnumC15513065n.FETCH_REQUEST.getValue();
                    }
                    C0ZJ9.LJFF(jCurrentTimeMillis, C0I0B.LJFF.LIZIZ(), str, str2);
                }
            }
        });
        interfaceC595750NYf2.LJIIJ(new C0NXP() { // from class: X.0NXQ
            @Override // X.C0NXP
            public final void LIZ(String str, Map<String, String> map) {
                C0I0B.LJFF.LIZIZ();
                C20684815ws.LJIILLIIL(str, map);
            }
        });
        interfaceC595750NYf2.LIZJ(new C595770NYh(0));
        interfaceC595750NYf2.LJIIIZ(AFwS195S0000000_9.get$arr$(574));
        return Unit.LIZ;
    }
}
