package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.experiment.SlashComponentUIPreloadExp;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.PoiDetailInfoAssem;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiHeaderCell;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.container.slash.PoiDetailSlashFragment;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0gtK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1183040gtK implements InterfaceC1180800gpi, InterfaceC1181600gr0 {
    @Override // X.InterfaceC1180970gpz
    public final boolean LIZ() {
        return false;
    }

    @Override // X.InterfaceC1181600gr0
    public final void LIZJ(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv, C1180920gpu c1180920gpu) {
    }

    @Override // X.InterfaceC1181600gr0
    public final boolean LJ() {
        return false;
    }

    @Override // X.InterfaceC1180800gpi
    public final C19719912Dl LJFF(BaseComponentData baseComponentData, InterfaceC1181010gq3 interfaceC1181010gq3) {
        return C13LE.LIZ(PoiDetailInfoAssem.class);
    }

    @Override // X.InterfaceC1180970gpz
    public final InterfaceC1180980gq0<PoiListApi.PoiDetailResponse> LIZIZ() {
        return new C1208890hZ1(50);
    }

    @Override // X.InterfaceC1180970gpz
    public final InterfaceC1181340gqa LJII() {
        if (SlashComponentUIPreloadExp.LIZ("poi_head_info") || SlashComponentUIPreloadExp.LIZ("travel_head_info")) {
            return new InterfaceC1181340gqa() { // from class: X.0gtM
                @Override // X.InterfaceC1181340gqa
                public final List LIZ(BaseComponentData baseComponentData) {
                    return null;
                }

                @Override // X.InterfaceC1181340gqa
                public final void LIZIZ() {
                }

                @Override // X.InterfaceC1181340gqa
                public final List LIZJ(InterfaceC1181010gq3 interfaceC1181010gq3) {
                    C1185600gxS c1185600gxS;
                    String typeLevel;
                    boolean zBooleanValue;
                    String collectInfo;
                    C1188440h22 c1188440h22;
                    C1188440h22 c1188440h222;
                    Boolean boolIsClaimed;
                    C1188440h22 c1188440h223;
                    try {
                        if (interfaceC1181010gq3 instanceof PoiDetailSlashFragment) {
                            C1173300gdc<C1185600gxS> c1173300gdcQr0 = ((PoiDetailSlashFragment) interfaceC1181010gq3).qr0();
                            if (c1173300gdcQr0 != null) {
                                c1185600gxS = c1173300gdcQr0.LIZ;
                            } else {
                                c1185600gxS = null;
                            }
                            if (c1185600gxS != null && (c1188440h223 = c1185600gxS.LJ) != null) {
                                typeLevel = c1188440h223.getTypeLevel();
                            } else {
                                typeLevel = null;
                            }
                            boolean z = false;
                            if (c1185600gxS == null || (c1188440h222 = c1185600gxS.LJ) == null || (boolIsClaimed = c1188440h222.isClaimed()) == null) {
                                zBooleanValue = false;
                            } else {
                                zBooleanValue = boolIsClaimed.booleanValue();
                            }
                            EnumC1184730gw3.Companion.getClass();
                            EnumC1184730gw3 enumC1184730gw3LIZ = C1184920gwM.LIZ(typeLevel, zBooleanValue);
                            if (((Number) C1183070gtN.LIZ.getValue()).intValue() >= 1) {
                                z = true;
                            }
                            if (z && C1183070gtN.LIZ(enumC1184730gw3LIZ)) {
                                if (c1185600gxS == null || (c1188440h22 = c1185600gxS.LJ) == null) {
                                    collectInfo = null;
                                } else {
                                    collectInfo = c1188440h22.getCollectInfo();
                                }
                                Pair<String, Integer> pairLIZ = C1181860grQ.LIZ(collectInfo);
                                if (pairLIZ != null) {
                                    String first = pairLIZ.getFirst();
                                    int iIntValue = pairLIZ.getSecond().intValue();
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(new C1181330gqZ(1, 0, 16, Integer.valueOf(iIntValue), 1, first));
                                    return arrayList;
                                }
                            }
                        }
                        C189200o6.m2constructorimpl(Unit.LIZ);
                        return null;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                        return null;
                    }
                }
            };
        }
        return null;
    }

    @Override // X.InterfaceC1180970gpz
    public final InterfaceC1181670gr7 service() {
        return new C1181880grS();
    }

    @Override // X.InterfaceC1181600gr0
    public final void LJI(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv) {
        viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(PoiHeaderCell.class);
    }

    @Override // X.InterfaceC1180970gpz
    public final boolean LIZLLL(BaseComponentData baseComponentData, boolean z) {
        if (baseComponentData != null && (baseComponentData instanceof PoiListApi.PoiDetailResponse)) {
            return true;
        }
        return false;
    }
}
