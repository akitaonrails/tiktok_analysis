package X;

import android.app.Application;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.poi.mapmode.viewmodel.PoiMapModeMapVM;
import com.ss.android.ugc.aweme.poi.mapmode.viewmodel.PoiMapModePageVM;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gjC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1176760gjC {
    public final Context LIZ;
    public PoiMapModeMapVM LIZIZ;
    public PoiMapModePageVM LIZJ;
    public C1176780gjE LIZLLL;
    public boolean LJ;
    public final InterfaceC1176770gjD[] LJFF = {new InterfaceC1176770gjD() { // from class: X.0gmI
        @Override // X.InterfaceC1176770gjD
        public final void LIZ() {
        }

        @Override // X.InterfaceC1176770gjD
        public final void LIZIZ(C1176760gjC c1176760gjC) {
        }

        @Override // X.InterfaceC1176770gjD
        public final void LIZJ(C1176760gjC c1176760gjC) {
        }

        @Override // X.InterfaceC1176770gjD
        public final void LIZLLL(C1176760gjC c1176760gjC) {
        }

        @Override // X.InterfaceC1176770gjD
        public final void LJ(final C1176760gjC c1176760gjC, C19EG c19eg, Fragment fragment) {
            C1207450hWh.LIZ.LJIJJ("poi", "anchor", C1178720gmM.LIZLLL, c19eg, new C1207520hWo("map_mode", "map_mode_find_places", null, null, false, false, null, null, null, 508), new InterfaceC1207030hW1() { // from class: X.0gmP
                @Override // X.InterfaceC1207030hW1
                public final void LIZ() {
                    c1176760gjC.LIZ();
                    c1176760gjC.LIZLLL();
                }

                @Override // X.InterfaceC1207030hW1
                public final void LIZJ(int i) {
                }

                @Override // X.InterfaceC1207030hW1
                public final void LIZIZ(int i, String str) {
                }
            }, null);
        }
    }, new InterfaceC1176770gjD() { // from class: X.0gnx
        public InterfaceC1177640gkc LIZ;

        @Override // X.InterfaceC1176770gjD
        public final void LIZ() {
        }

        @Override // X.InterfaceC1176770gjD
        public final void LIZIZ(C1176760gjC c1176760gjC) {
            InterfaceC1177640gkc interfaceC1177640gkc = this.LIZ;
            if (interfaceC1177640gkc != null) {
                interfaceC1177640gkc.remove();
            }
        }

        @Override // X.InterfaceC1176770gjD
        public final void LIZJ(C1176760gjC c1176760gjC) {
            InterfaceC1177640gkc interfaceC1177640gkc = this.LIZ;
            if (interfaceC1177640gkc != null) {
                interfaceC1177640gkc.remove();
            }
            this.LIZ = null;
        }

        @Override // X.InterfaceC1176770gjD
        public final void LIZLLL(C1176760gjC c1176760gjC) {
            InterfaceC1177250gjz interfaceC1177250gjz;
            C1176780gjE c1176780gjE;
            C1177960gl8 c1177960gl8;
            PoiMapModeMapVM poiMapModeMapVM = c1176760gjC.LIZIZ;
            if (poiMapModeMapVM != null && (interfaceC1177250gjz = poiMapModeMapVM.LL) != null && (c1176780gjE = c1176760gjC.LIZLLL) != null && (c1177960gl8 = c1176780gjE.LIZ) != null) {
                double d = c1177960gl8.lat;
                double d2 = c1177960gl8.lon;
                if (d == 0.0d && d2 == 0.0d) {
                    return;
                }
                InterfaceC1177640gkc interfaceC1177640gkc = this.LIZ;
                if (interfaceC1177640gkc != null) {
                    interfaceC1177640gkc.remove();
                }
                C1177600gkY c1177600gkY = new C1177600gkY();
                c1177600gkY.LIZ = new C1178490glz(d, d2);
                c1177600gkY.LIZIZ = Double.valueOf(1700.0d);
                c1177600gkY.LJ = Float.valueOf(2.0f);
                c1177600gkY.LJFF = Float.valueOf(-1.0f);
                Context context = c1176760gjC.LIZ;
                if (context != null) {
                    Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a0c, context);
                    if (numLIZJ != null) {
                        c1177600gkY.LIZJ = Integer.valueOf(numLIZJ.intValue());
                    }
                    Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.c4, context);
                    if (numLIZJ2 != null) {
                        c1177600gkY.LIZLLL = Integer.valueOf(numLIZJ2.intValue());
                    }
                }
                this.LIZ = interfaceC1177250gjz.LJIJI(c1177600gkY);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x00e2, code lost:
        
            if (r4 == X.EnumC1205470hTV.SUCCESS) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00e4, code lost:
        
            r3.LJIL(r26, r27, X.C1178720gmM.LJI, new X.C1207520hWo("map_mode", "click_show", null, null, r9, r9, null, null, null, 508), new X.C1179740go0(r25, r26));
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0106, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x010f, code lost:
        
            if (X.C1197760hH4.LIZJ(r26, X.C1178720gmM.LJI) == false) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0111, code lost:
        
            r2 = X.C2188811AlT.LIZ();
            r2.append("convertPreciseGPSPermissionExp needPromotePreciseWithCert:false, cert:");
            r4 = X.C1178720gmM.LJI;
            r2.append(r4);
            X.C2188811AlT.LIZIZ(r2);
            r3 = X.C1197750hH3.LIZ;
            r3.getClass();
            r3.LIZJ("map_mode_click_no_action", new kotlin.jvm.internal.AwS38S0310000_18(r26, r4, null, 3));
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0132, code lost:
        
            return;
         */
        @Override // X.InterfaceC1176770gjD
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void LJ(final X.C1176760gjC r25, final X.C19EG r26, androidx.fragment.app.Fragment r27) {
            /*
                Method dump skipped, instruction units count: 311
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C1179710gnx.LJ(X.0gjC, X.19EG, androidx.fragment.app.Fragment):void");
        }
    }, new InterfaceC1176770gjD() { // from class: X.0gjB
        @Override // X.InterfaceC1176770gjD
        public final void LIZ() {
        }

        @Override // X.InterfaceC1176770gjD
        public final void LIZIZ(C1176760gjC c1176760gjC) {
            InterfaceC1177250gjz interfaceC1177250gjz;
            PoiMapModeMapVM poiMapModeMapVM = c1176760gjC.LIZIZ;
            if (poiMapModeMapVM != null && (interfaceC1177250gjz = poiMapModeMapVM.LL) != null) {
                interfaceC1177250gjz.LJIILJJIL(false);
                interfaceC1177250gjz.LJJIIZI().LIZIZ();
            }
        }

        @Override // X.InterfaceC1176770gjD
        public final void LIZJ(C1176760gjC c1176760gjC) {
            LIZIZ(c1176760gjC);
        }

        @Override // X.InterfaceC1176770gjD
        public final void LIZLLL(C1176760gjC c1176760gjC) {
            PoiMapModeMapVM poiMapModeMapVM;
            InterfaceC1177250gjz interfaceC1177250gjz;
            if (C297480BlK.LIZ() && (poiMapModeMapVM = c1176760gjC.LIZIZ) != null && (interfaceC1177250gjz = poiMapModeMapVM.LL) != null) {
                interfaceC1177250gjz.LJIILJJIL(true);
                interfaceC1177250gjz.LJJIIZI().LIZIZ();
            }
        }

        @Override // X.InterfaceC1176770gjD
        public final void LJ(C1176760gjC c1176760gjC, C19EG c19eg, Fragment fragment) {
            c1176760gjC.LIZLLL();
        }
    }};
    public InterfaceC1176770gjD LJI = new InterfaceC1176770gjD() { // from class: X.0gmI
        @Override // X.InterfaceC1176770gjD
        public final void LIZ() {
        }

        @Override // X.InterfaceC1176770gjD
        public final void LIZIZ(C1176760gjC c1176760gjC) {
        }

        @Override // X.InterfaceC1176770gjD
        public final void LIZJ(C1176760gjC c1176760gjC) {
        }

        @Override // X.InterfaceC1176770gjD
        public final void LIZLLL(C1176760gjC c1176760gjC) {
        }

        @Override // X.InterfaceC1176770gjD
        public final void LJ(final C1176760gjC c1176760gjC, C19EG c19eg, Fragment fragment) {
            C1207450hWh.LIZ.LJIJJ("poi", "anchor", C1178720gmM.LIZLLL, c19eg, new C1207520hWo("map_mode", "map_mode_find_places", null, null, false, false, null, null, null, 508), new InterfaceC1207030hW1() { // from class: X.0gmP
                @Override // X.InterfaceC1207030hW1
                public final void LIZ() {
                    c1176760gjC.LIZ();
                    c1176760gjC.LIZLLL();
                }

                @Override // X.InterfaceC1207030hW1
                public final void LIZJ(int i) {
                }

                @Override // X.InterfaceC1207030hW1
                public final void LIZIZ(int i, String str) {
                }
            }, null);
        }
    };
    public AnonymousClass0956 LJII;

    public final void LIZIZ() {
        C1177960gl8 c1177960gl8;
        PoiMapModeMapVM poiMapModeMapVM;
        InterfaceC1177250gjz interfaceC1177250gjz;
        C1176780gjE c1176780gjE = this.LIZLLL;
        if (c1176780gjE == null || (c1177960gl8 = c1176780gjE.LIZ) == null || (poiMapModeMapVM = this.LIZIZ) == null || (interfaceC1177250gjz = poiMapModeMapVM.LL) == null) {
            return;
        }
        Float fValueOf = Float.valueOf(interfaceC1177250gjz.LJIJJ());
        C1178480gly c1178480gly = new C1178480gly();
        c1178480gly.LIZ = true;
        c1178480gly.LIZJ = new AwS562S0100000_18(this, 2704);
        c1178480gly.LIZLLL = new AwS562S0100000_18(this, 2705);
        interfaceC1177250gjz.LIZIZ(c1177960gl8, fValueOf, c1178480gly);
    }

    public final void LIZJ() {
        PoiMapModeMapVM poiMapModeMapVM = this.LIZIZ;
        this.LJII = poiMapModeMapVM != null ? C23250099c.LIZLLL(poiMapModeMapVM.getAssemVMScope(), null, null, new C1174510gfZ(poiMapModeMapVM, null), 3) : null;
    }

    public final void LIZLLL() {
        InterfaceC1177250gjz interfaceC1177250gjz;
        C1174480gfW c1174480gfW;
        EnumC1174300gfE enumC1174300gfE;
        InterfaceC1177110gjl<C1177210gjv> interfaceC1177110gjl;
        InterfaceC1177110gjl<C1177210gjv> interfaceC1177110gjl2;
        AnonymousClass0956 anonymousClass0956 = this.LJII;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        if (C290940Bam.LIZ()) {
            PoiMapModeMapVM poiMapModeMapVM = this.LIZIZ;
            if (poiMapModeMapVM != null && (interfaceC1177110gjl2 = poiMapModeMapVM.LLILLJJLI) != null) {
                interfaceC1177110gjl2.clearData();
            }
            PoiMapModeMapVM poiMapModeMapVM2 = this.LIZIZ;
            if (poiMapModeMapVM2 != null && (interfaceC1177110gjl = poiMapModeMapVM2.LLILLJJLI) != null) {
                interfaceC1177110gjl.LJIIIIZZ();
            }
        } else {
            PoiMapModeMapVM poiMapModeMapVM3 = this.LIZIZ;
            if (poiMapModeMapVM3 != null && (interfaceC1177250gjz = poiMapModeMapVM3.LL) != null) {
                interfaceC1177250gjz.LJIILLIIL();
            }
        }
        C1176780gjE c1176780gjE = this.LIZLLL;
        if (c1176780gjE != null && Intrinsics.LJFF(c1176780gjE.LIZIZ, Boolean.TRUE)) {
            if (this.LJ) {
                LIZJ();
                return;
            } else {
                LIZIZ();
                return;
            }
        }
        PoiMapModePageVM poiMapModePageVM = this.LIZJ;
        if (poiMapModePageVM != null && (c1174480gfW = poiMapModePageVM.LL) != null && (enumC1174300gfE = c1174480gfW.LIZJ) != null) {
            enumC1174300gfE.onPoiListDataStart(c1174480gfW);
        }
        C1207450hWh.LIZ.LJIIL("poi", "anchor", C1178720gmM.LIZJ, C1178720gmM.LIZIZ, new C0OA4(new AwS562S0100000_18(this, 2702), new AwS597S0100000_18(this, 1011)), -1L);
    }

    public final void LIZ() {
        InterfaceC1176770gjD interfaceC1176770gjD;
        ILocationBaseServiceForMT iLocationBaseServiceForMT = (ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class);
        C844470XAv.LIZ.getClass();
        boolean zLJ = iLocationBaseServiceForMT.LJ(C844470XAv.LIZ());
        boolean zLJJIJ = ((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).LJJIJ();
        if (C1207450hWh.LIZ.LJI("poi", "anchor") && zLJ && zLJJIJ) {
            interfaceC1176770gjD = this.LJFF[2];
        } else {
            C19741112Lp c19741112Lp = C19741112Lp.LIZ;
            Application applicationLIZ = C1BWL.LIZ();
            c19741112Lp.getClass();
            interfaceC1176770gjD = C19741112Lp.LIZLLL(applicationLIZ, "android.permission.ACCESS_COARSE_LOCATION") ? this.LJFF[1] : this.LJFF[0];
        }
        if (Intrinsics.LJFF(this.LJI.getClass(), interfaceC1176770gjD.getClass())) {
            return;
        }
        AnonymousClass0956 anonymousClass0956 = this.LJII;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LJI.LIZJ(this);
        this.LJI = interfaceC1176770gjD;
        interfaceC1176770gjD.LIZ();
    }

    public C1176760gjC(Context context) {
        this.LIZ = context;
        LIZ();
    }
}
