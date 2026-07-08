package X;

import Y.ARunnableS109S0100000_9;
import Y.ARunnableS42S0300000_9;
import android.app.Application;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.i18n.location.api.LocationData;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.placediscovery.param.MapBounds;
import com.ss.android.ugc.aweme.poi.mapdetail.viewmodel.PoiMapDetailAreaFilterVM;
import com.ss.android.ugc.aweme.poi.mapdetail.viewmodel.PoiMapDetailFilterVM;
import com.ss.android.ugc.aweme.poi.mapdetail.viewmodel.PoiMapDetailMapVM;
import com.ss.android.ugc.aweme.poi.mapdetail.viewmodel.PoiMapDetailNavTabVM;
import com.ss.android.ugc.aweme.poi.mapdetail.viewmodel.PoiMapDetailPageVM;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS105S0110000_18;
import kotlin.jvm.internal.AwS32S0010000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0giw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1176600giw {
    public static final /* synthetic */ int LJIIIZ = 0;
    public final Context LIZ;
    public final InterfaceC665370Q7z LIZIZ;
    public PoiMapDetailMapVM LIZJ;
    public PoiMapDetailPageVM LIZLLL;
    public C1176660gj2 LJ;
    public boolean LJFF;
    public final InterfaceC1176640gj0[] LJI = {new InterfaceC1176640gj0() { // from class: X.0gmJ
        @Override // X.InterfaceC1176640gj0
        public final void LIZ() {
        }

        @Override // X.InterfaceC1176640gj0
        public final void LIZJ(C1176600giw c1176600giw) {
        }

        @Override // X.InterfaceC1176640gj0
        public final void LIZLLL(C1176600giw c1176600giw) {
        }

        @Override // X.InterfaceC1176640gj0
        public final void LJFF(C1176600giw c1176600giw) {
        }

        @Override // X.InterfaceC1176640gj0
        public final void LIZIZ(final C1176600giw c1176600giw, C19EG c19eg, Fragment fragment) {
            C1207450hWh.LIZ.LJIJJ("poi", "anchor", C1178720gmM.LIZLLL, c19eg, new C1207520hWo("map_mode", "map_mode_find_places", null, null, false, false, null, null, null, 508), new InterfaceC1207030hW1() { // from class: X.0gmO
                @Override // X.InterfaceC1207030hW1
                public final void LIZ() {
                    c1176600giw.LIZ();
                    c1176600giw.LJFF();
                }

                @Override // X.InterfaceC1207030hW1
                public final void LIZJ(int i) {
                }

                @Override // X.InterfaceC1207030hW1
                public final void LIZIZ(int i, String str) {
                }
            }, null);
        }

        @Override // X.InterfaceC1176640gj0
        public final void LJ(final C1176600giw c1176600giw, C19EG c19eg, Fragment fragment) {
            C1207450hWh.LIZ.LJIJJ("poi", "anchor", C1178720gmM.LIZLLL, c19eg, new C1207520hWo("map_mode", "map_mode_find_places", null, null, false, false, null, null, null, 508), new InterfaceC1207030hW1() { // from class: X.0gmN
                @Override // X.InterfaceC1207030hW1
                public final void LIZIZ(int i, String str) {
                }

                @Override // X.InterfaceC1207030hW1
                public final void LIZJ(int i) {
                }

                @Override // X.InterfaceC1207030hW1
                public final void LIZ() {
                    c1176600giw.LIZ();
                    c1176600giw.LJ();
                }
            }, null);
        }
    }, new InterfaceC1176640gj0() { // from class: X.0gny
        public InterfaceC1177640gkc LIZ;

        @Override // X.InterfaceC1176640gj0
        public final void LIZ() {
        }

        @Override // X.InterfaceC1176640gj0
        public final void LIZJ(C1176600giw c1176600giw) {
            InterfaceC1177250gjz interfaceC1177250gjz;
            C1176660gj2 c1176660gj2;
            C1177960gl8 c1177960gl8;
            PoiMapDetailMapVM poiMapDetailMapVM = c1176600giw.LIZJ;
            if (poiMapDetailMapVM != null && (interfaceC1177250gjz = poiMapDetailMapVM.LL) != null && (c1176660gj2 = c1176600giw.LJ) != null && (c1177960gl8 = c1176660gj2.LIZ) != null) {
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
                Context context = c1176600giw.LIZ;
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

        @Override // X.InterfaceC1176640gj0
        public final void LIZLLL(C1176600giw c1176600giw) {
            InterfaceC1177640gkc interfaceC1177640gkc = this.LIZ;
            if (interfaceC1177640gkc != null) {
                interfaceC1177640gkc.remove();
            }
        }

        @Override // X.InterfaceC1176640gj0
        public final void LJFF(C1176600giw c1176600giw) {
            InterfaceC1177640gkc interfaceC1177640gkc = this.LIZ;
            if (interfaceC1177640gkc != null) {
                interfaceC1177640gkc.remove();
            }
            this.LIZ = null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
        
            if (r1 == X.EnumC1205470hTV.SUCCESS) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
        
            r13.LJIL(r16, r17, X.C1178720gmM.LJI, new X.C1207520hWo("map_mode", "click_show", null, null, false, false, null, null, null, 508), new X.C1179730gnz(r16, r18));
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0057, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0065, code lost:
        
            if (X.C1197760hH4.LIZJ(r16, r0) == false) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0067, code lost:
        
            r1 = X.C2188811AlT.LIZ();
            r1.append("convertPreciseGPSPermissionExp needPromotePreciseWithCert:false, cert:");
            r3 = X.C1178720gmM.LJI;
            r1.append(r3);
            X.C2188811AlT.LIZIZ(r1);
            r2 = X.C1197750hH3.LIZ;
            r2.getClass();
            r2.LIZJ("map_mode_click_no_action", new kotlin.jvm.internal.AwS38S0310000_18(r16, r3, null, 3));
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0088, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static void LJI(final X.C19EG r16, androidx.fragment.app.Fragment r17, final kotlin.jvm.functions.Function0 r18) {
            /*
                java.lang.Class<com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT> r0 = com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT.class
                r1 = 0
                r6 = 0
                r4 = 14
                r5 = 0
                r2 = r1
                r3 = r1
                java.lang.Object r13 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r0, r1, r2, r3, r4, r5)
                com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT r13 = (com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT) r13
                if (r13 != 0) goto L12
                return
            L12:
                boolean r0 = X.C300190Bph.LIZ()
                r10 = 0
                r14 = r16
                if (r0 == 0) goto L5a
                java.lang.Class<com.ss.android.ugc.tiktok.location_api.service.api.ILocationServiceForLS> r5 = com.ss.android.ugc.tiktok.location_api.service.api.ILocationServiceForLS.class
                r9 = 14
                r7 = r6
                r8 = r6
                java.lang.Object r1 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r5, r6, r7, r8, r9, r10)
                com.ss.android.ugc.tiktok.location_api.service.api.ILocationServiceForLS r1 = (com.ss.android.ugc.tiktok.location_api.service.api.ILocationServiceForLS) r1
                if (r1 == 0) goto L58
                com.bytedance.bpea.cert.token.TokenCert r0 = X.C1178720gmM.LJI
                X.0hTV r1 = r1.LIZIZ(r14, r0)
            L2f:
                X.0hTV r0 = X.EnumC1205470hTV.SUCCESS
                if (r1 != r0) goto L67
            L33:
                com.bytedance.bpea.cert.token.TokenCert r16 = X.C1178720gmM.LJI
                X.0hWo r2 = new X.0hWo
                java.lang.String r3 = "map_mode"
                java.lang.String r4 = "click_show"
                r5 = 0
                r7 = 0
                r12 = 508(0x1fc, float:7.12E-43)
                r6 = r5
                r8 = r7
                r9 = r5
                r10 = r5
                r11 = r5
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                X.0gnz r0 = new X.0gnz
                r1 = r18
                r0.<init>()
                r15 = r17
                r17 = r2
                r18 = r0
                r13.LJIL(r14, r15, r16, r17, r18)
                return
            L58:
                r1 = r10
                goto L2f
            L5a:
                X.0hH4 r1 = X.C1197760hH4.LIZ
                com.bytedance.bpea.cert.token.TokenCert r0 = X.C1178720gmM.LJI
                r1.getClass()
                boolean r0 = X.C1197760hH4.LIZJ(r14, r0)
                if (r0 != 0) goto L33
            L67:
                java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                java.lang.String r0 = "convertPreciseGPSPermissionExp needPromotePreciseWithCert:false, cert:"
                r1.append(r0)
                com.bytedance.bpea.cert.token.TokenCert r3 = X.C1178720gmM.LJI
                r1.append(r3)
                X.C2188811AlT.LIZIZ(r1)
                X.0hH3 r2 = X.C1197750hH3.LIZ
                r2.getClass()
                kotlin.jvm.internal.AwS38S0310000_18 r1 = new kotlin.jvm.internal.AwS38S0310000_18
                r0 = 3
                r1.<init>(r14, r3, r10, r0)
                java.lang.String r0 = "map_mode_click_no_action"
                r2.LIZJ(r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C1179720gny.LJI(X.19EG, androidx.fragment.app.Fragment, kotlin.jvm.functions.Function0):void");
        }

        @Override // X.InterfaceC1176640gj0
        public final void LIZIZ(final C1176600giw c1176600giw, C19EG c19eg, Fragment fragment) {
            boolean z;
            if (c1176600giw.LJFF) {
                C1197760hH4.LIZ.getClass();
                if (!C1197760hH4.LIZ() && !C300190Bph.LIZ()) {
                    ILocationBaseServiceForMT iLocationBaseServiceForMT = (ILocationBaseServiceForMT) PluggableExtentionKt.pluggableSpi$default(ILocationBaseServiceForMT.class, false, false, false, 14, null);
                    if (iLocationBaseServiceForMT != null) {
                        if (iLocationBaseServiceForMT.LJJIJ()) {
                            z = true;
                        } else {
                            z = false;
                            if (iLocationBaseServiceForMT == null) {
                                return;
                            }
                        }
                        C844470XAv.LIZ.getClass();
                        if (iLocationBaseServiceForMT.LJ(C844470XAv.LIZ())) {
                            if (!z) {
                                if (iLocationBaseServiceForMT != null) {
                                    iLocationBaseServiceForMT.LIZJ("map_mode", null, c19eg, null, C1178720gmM.LJ, new AwS562S0100000_18(c1176600giw, 2499), AFwS206S0000000_18.get$arr$(689), AFwS206S0000000_18.get$arr$(690), "map_mode_find_places");
                                    return;
                                }
                                return;
                            } else if (iLocationBaseServiceForMT == null) {
                                return;
                            }
                        }
                        iLocationBaseServiceForMT.LJIJJLI("poi", "anchor", C1178720gmM.LJFF, c19eg, new C1207520hWo("map_mode", "map_mode_find_places", null, null, false, false, null, null, null, 508), new InterfaceC1207030hW1() { // from class: X.0go2
                            @Override // X.InterfaceC1207030hW1
                            public final void LIZ() {
                                c1176600giw.LIZ();
                                c1176600giw.LJFF();
                            }

                            @Override // X.InterfaceC1207030hW1
                            public final void LIZJ(int i) {
                            }

                            @Override // X.InterfaceC1207030hW1
                            public final void LIZIZ(int i, String str) {
                            }
                        }, true, true);
                        return;
                    }
                    return;
                }
                LJI(c19eg, fragment, new AwS562S0100000_18(c1176600giw, 2498));
                return;
            }
            c1176600giw.LJFF();
        }

        @Override // X.InterfaceC1176640gj0
        public final void LJ(final C1176600giw c1176600giw, C19EG c19eg, Fragment fragment) {
            boolean z;
            C1197760hH4.LIZ.getClass();
            if (!C1197760hH4.LIZ() && !C300190Bph.LIZ()) {
                ILocationBaseServiceForMT iLocationBaseServiceForMT = (ILocationBaseServiceForMT) PluggableExtentionKt.pluggableSpi$default(ILocationBaseServiceForMT.class, false, false, false, 14, null);
                if (iLocationBaseServiceForMT != null) {
                    if (iLocationBaseServiceForMT.LJJIJ()) {
                        z = true;
                    } else {
                        z = false;
                        if (iLocationBaseServiceForMT == null) {
                            return;
                        }
                    }
                    C844470XAv.LIZ.getClass();
                    if (iLocationBaseServiceForMT.LJ(C844470XAv.LIZ())) {
                        if (!z) {
                            iLocationBaseServiceForMT.LIZJ("map_mode", null, c19eg, null, C1178720gmM.LJ, new AwS562S0100000_18(c1176600giw, 2497), AFwS206S0000000_18.get$arr$(687), AFwS206S0000000_18.get$arr$(688), "map_mode_find_places");
                            return;
                        } else if (iLocationBaseServiceForMT == null) {
                            return;
                        }
                    }
                    iLocationBaseServiceForMT.LJIJJLI("poi", "anchor", C1178720gmM.LJFF, c19eg, new C1207520hWo("map_mode", "map_mode_find_places", null, null, false, false, null, null, null, 508), new InterfaceC1207030hW1() { // from class: X.0go1
                        @Override // X.InterfaceC1207030hW1
                        public final void LIZ() {
                            c1176600giw.LIZ();
                            c1176600giw.LJ();
                        }

                        @Override // X.InterfaceC1207030hW1
                        public final void LIZJ(int i) {
                        }

                        @Override // X.InterfaceC1207030hW1
                        public final void LIZIZ(int i, String str) {
                        }
                    }, true, true);
                    return;
                }
                return;
            }
            LJI(c19eg, fragment, new AwS562S0100000_18(c1176600giw, 2496));
        }
    }, new InterfaceC1176640gj0() { // from class: X.0gix
        @Override // X.InterfaceC1176640gj0
        public final void LIZ() {
        }

        @Override // X.InterfaceC1176640gj0
        public final void LIZJ(C1176600giw c1176600giw) {
            PoiMapDetailMapVM poiMapDetailMapVM;
            InterfaceC1177250gjz interfaceC1177250gjz;
            if (C297480BlK.LIZ() && (poiMapDetailMapVM = c1176600giw.LIZJ) != null && (interfaceC1177250gjz = poiMapDetailMapVM.LL) != null) {
                interfaceC1177250gjz.LJIILJJIL(true);
                interfaceC1177250gjz.LJJIIZI().LIZIZ();
            }
        }

        @Override // X.InterfaceC1176640gj0
        public final void LIZLLL(C1176600giw c1176600giw) {
            InterfaceC1177250gjz interfaceC1177250gjz;
            PoiMapDetailMapVM poiMapDetailMapVM = c1176600giw.LIZJ;
            if (poiMapDetailMapVM != null && (interfaceC1177250gjz = poiMapDetailMapVM.LL) != null) {
                interfaceC1177250gjz.LJIILJJIL(false);
                interfaceC1177250gjz.LJJIIZI().LIZIZ();
            }
        }

        @Override // X.InterfaceC1176640gj0
        public final void LJFF(C1176600giw c1176600giw) {
            LIZLLL(c1176600giw);
        }

        @Override // X.InterfaceC1176640gj0
        public final void LIZIZ(C1176600giw c1176600giw, C19EG c19eg, Fragment fragment) {
            c1176600giw.LJFF();
        }

        @Override // X.InterfaceC1176640gj0
        public final void LJ(C1176600giw c1176600giw, C19EG c19eg, Fragment fragment) {
            c1176600giw.LJ();
        }
    }};
    public InterfaceC1176640gj0 LJII = new InterfaceC1176640gj0() { // from class: X.0gmJ
        @Override // X.InterfaceC1176640gj0
        public final void LIZ() {
        }

        @Override // X.InterfaceC1176640gj0
        public final void LIZJ(C1176600giw c1176600giw) {
        }

        @Override // X.InterfaceC1176640gj0
        public final void LIZLLL(C1176600giw c1176600giw) {
        }

        @Override // X.InterfaceC1176640gj0
        public final void LJFF(C1176600giw c1176600giw) {
        }

        @Override // X.InterfaceC1176640gj0
        public final void LIZIZ(final C1176600giw c1176600giw, C19EG c19eg, Fragment fragment) {
            C1207450hWh.LIZ.LJIJJ("poi", "anchor", C1178720gmM.LIZLLL, c19eg, new C1207520hWo("map_mode", "map_mode_find_places", null, null, false, false, null, null, null, 508), new InterfaceC1207030hW1() { // from class: X.0gmO
                @Override // X.InterfaceC1207030hW1
                public final void LIZ() {
                    c1176600giw.LIZ();
                    c1176600giw.LJFF();
                }

                @Override // X.InterfaceC1207030hW1
                public final void LIZJ(int i) {
                }

                @Override // X.InterfaceC1207030hW1
                public final void LIZIZ(int i, String str) {
                }
            }, null);
        }

        @Override // X.InterfaceC1176640gj0
        public final void LJ(final C1176600giw c1176600giw, C19EG c19eg, Fragment fragment) {
            C1207450hWh.LIZ.LJIJJ("poi", "anchor", C1178720gmM.LIZLLL, c19eg, new C1207520hWo("map_mode", "map_mode_find_places", null, null, false, false, null, null, null, 508), new InterfaceC1207030hW1() { // from class: X.0gmN
                @Override // X.InterfaceC1207030hW1
                public final void LIZIZ(int i, String str) {
                }

                @Override // X.InterfaceC1207030hW1
                public final void LIZJ(int i) {
                }

                @Override // X.InterfaceC1207030hW1
                public final void LIZ() {
                    c1176600giw.LIZ();
                    c1176600giw.LJ();
                }
            }, null);
        }
    };
    public AnonymousClass0956 LJIIIIZZ;

    public final void LIZIZ() {
        C1177960gl8 c1177960gl8;
        PoiMapDetailMapVM poiMapDetailMapVM;
        InterfaceC1177250gjz interfaceC1177250gjz;
        C1176660gj2 c1176660gj2 = this.LJ;
        if (c1176660gj2 == null || (c1177960gl8 = c1176660gj2.LIZ) == null || (poiMapDetailMapVM = this.LIZJ) == null || (interfaceC1177250gjz = poiMapDetailMapVM.LL) == null) {
            return;
        }
        float fLJIJJ = interfaceC1177250gjz.LJIJJ();
        if (fLJIJJ < 4.5f) {
            fLJIJJ = 4.5f;
        }
        Float fValueOf = Float.valueOf(fLJIJJ);
        C1178480gly c1178480gly = new C1178480gly();
        c1178480gly.LIZ = true;
        c1178480gly.LIZJ = new AwS562S0100000_18(this, 2506);
        c1178480gly.LIZLLL = new AwS562S0100000_18(this, 2507);
        interfaceC1177250gjz.LIZIZ(c1177960gl8, fValueOf, c1178480gly);
    }

    public final void LIZJ() {
        PoiMapDetailFilterVM poiMapDetailFilterVM;
        C1165940gRk c1165940gRkLJJIJIIJIL;
        C1176580giu c1176580giu;
        PoiMapDetailMapVM poiMapDetailMapVM = this.LIZJ;
        AnonymousClass0956 anonymousClass0956VQ2 = null;
        anonymousClass0956VQ2 = null;
        if (poiMapDetailMapVM != null) {
            InterfaceC1177250gjz interfaceC1177250gjz = poiMapDetailMapVM.LL;
            MapBounds mapBoundsLIZ = (interfaceC1177250gjz == null || (c1165940gRkLJJIJIIJIL = interfaceC1177250gjz.LJJIJIIJIL()) == null || (c1176580giu = c1165940gRkLJJIJIIJIL.bounds) == null) ? null : C1175070ggT.LIZ(c1176580giu);
            PoiMapDetailPageVM poiMapDetailPageVM = poiMapDetailMapVM.LLILLJJLI;
            if (poiMapDetailPageVM != null && (poiMapDetailFilterVM = poiMapDetailPageVM.LLJI) != null) {
                poiMapDetailFilterVM.setState(AFwS256S0000000_18.get$arr$(910));
                PoiMapDetailAreaFilterVM poiMapDetailAreaFilterVM = poiMapDetailFilterVM.LL;
                if (poiMapDetailAreaFilterVM != null) {
                    poiMapDetailAreaFilterVM.withState(new AwS105S0110000_18(poiMapDetailAreaFilterVM, false, 14));
                }
                poiMapDetailFilterVM.LLILLJJLI = false;
            }
            PoiMapDetailPageVM poiMapDetailPageVM2 = poiMapDetailMapVM.LLILLJJLI;
            if (poiMapDetailPageVM2 != null) {
                poiMapDetailPageVM2.withState(new AwS597S0100000_18(poiMapDetailPageVM2, 846));
                PoiMapDetailNavTabVM poiMapDetailNavTabVM = poiMapDetailPageVM2.LLJIJIL;
                if (poiMapDetailNavTabVM != null) {
                    poiMapDetailNavTabVM.setState(new AwS32S0010000_18(false, 19));
                }
            }
            PoiMapDetailPageVM poiMapDetailPageVM3 = poiMapDetailMapVM.LLILLJJLI;
            if (poiMapDetailPageVM3 != null) {
                EnumC1176250giN enumC1176250giNWQ2 = poiMapDetailPageVM3.wQ2(false);
                anonymousClass0956VQ2 = PoiMapDetailPageVM.vQ2(poiMapDetailPageVM3, new C1176270giP(enumC1176250giNWQ2 != null ? Integer.valueOf(enumC1176250giNWQ2.getValue()) : null, EnumC1176260giO.NEARBY, mapBoundsLIZ), false, false, 0L, 12);
            }
        }
        this.LJIIIIZZ = anonymousClass0956VQ2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ() {
        /*
            r9 = this;
            com.ss.android.ugc.aweme.poi.mapdetail.viewmodel.PoiMapDetailPageVM r0 = r9.LIZLLL
            r6 = 0
            if (r0 == 0) goto L36
            X.0ghS r0 = r0.LLILZIL
            if (r0 == 0) goto L36
            X.0giv r0 = r0.getAccInitData()
            if (r0 == 0) goto L36
            com.ss.android.ugc.aweme.poi_api.model.PoiLocation r1 = r0.centerPoiLocation
            if (r1 == 0) goto L36
            X.0gl8 r3 = new X.0gl8
            java.lang.Double r0 = r1.lat
            r7 = 0
            if (r0 == 0) goto L62
            double r4 = r0.doubleValue()
        L1f:
            java.lang.Double r0 = r1.lng
            if (r0 == 0) goto L5f
            double r0 = r0.doubleValue()
        L27:
            r3.<init>(r4, r0)
            double r1 = r3.lat
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 != 0) goto L37
            double r1 = r3.lon
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 != 0) goto L37
        L36:
            r3 = r6
        L37:
            com.ss.android.ugc.aweme.poi.mapdetail.viewmodel.PoiMapDetailPageVM r0 = r9.LIZLLL
            if (r0 == 0) goto L4c
            X.0Q7z r1 = r0.LLIZ
            if (r1 == 0) goto L4c
            java.lang.Class<com.ss.android.ugc.aweme.poi.mapdetail.assem.IMapDetailSearchBtnAbility> r0 = com.ss.android.ugc.aweme.poi.mapdetail.assem.IMapDetailSearchBtnAbility.class
            X.01wD r0 = X.C1558520qew.LIZ(r1, r0, r6)
            com.ss.android.ugc.aweme.poi.mapdetail.assem.IMapDetailSearchBtnAbility r0 = (com.ss.android.ugc.aweme.poi.mapdetail.assem.IMapDetailSearchBtnAbility) r0
            if (r0 == 0) goto L4c
            r0.LJ()
        L4c:
            com.bytedance.bpea.cert.token.TokenCert r2 = X.C1178720gmM.LIZ
            kotlin.jvm.internal.AwS384S0200000_18 r1 = new kotlin.jvm.internal.AwS384S0200000_18
            r0 = 206(0xce, float:2.89E-43)
            r1.<init>(r3, r9, r0)
            r0 = 691(0x2b3, float:9.68E-43)
            kotlin.jvm.internal.AFwS206S0000000_18 r0 = kotlin.jvm.internal.AFwS206S0000000_18.get$arr$(r0)
            LIZLLL(r0, r1, r2)
            return
        L5f:
            r0 = 0
            goto L27
        L62:
            r4 = 0
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1176600giw.LJ():void");
    }

    public final void LJFF() {
        C1175770ghb c1175770ghb;
        AnonymousClass0956 anonymousClass0956 = this.LJIIIIZZ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        C1176660gj2 c1176660gj2 = this.LJ;
        if (c1176660gj2 != null && Intrinsics.LJFF(c1176660gj2.LIZIZ, Boolean.TRUE)) {
            if (this.LJFF) {
                LIZJ();
                return;
            } else {
                LIZIZ();
                return;
            }
        }
        PoiMapDetailPageVM poiMapDetailPageVM = this.LIZLLL;
        if (poiMapDetailPageVM != null && (c1175770ghb = poiMapDetailPageVM.LL) != null) {
            c1175770ghb.LIZIZ(c1175770ghb, false);
        }
        LIZLLL(new AwS562S0100000_18(this, 2502), new AwS597S0100000_18(this, 773), C1178720gmM.LIZJ);
    }

    public final void LIZ() {
        InterfaceC1176640gj0 interfaceC1176640gj0;
        if (C1176620giy.LIZ()) {
            interfaceC1176640gj0 = this.LJI[2];
        } else {
            C19741112Lp c19741112Lp = C19741112Lp.LIZ;
            Application applicationLIZ = C1BWL.LIZ();
            c19741112Lp.getClass();
            interfaceC1176640gj0 = C19741112Lp.LIZLLL(applicationLIZ, "android.permission.ACCESS_COARSE_LOCATION") ? this.LJI[1] : this.LJI[0];
        }
        if (Intrinsics.LJFF(this.LJII.getClass(), interfaceC1176640gj0.getClass())) {
            return;
        }
        AnonymousClass0956 anonymousClass0956 = this.LJIIIIZZ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LJII.LJFF(this);
        this.LJII = interfaceC1176640gj0;
        interfaceC1176640gj0.LIZ();
    }

    public C1176600giw(Context context, InterfaceC665370Q7z interfaceC665370Q7z) {
        this.LIZ = context;
        this.LIZIZ = interfaceC665370Q7z;
        LIZ();
    }

    public static void LIZLLL(final Function0 function0, final Function1 function1, TokenCert tokenCert) {
        C1207450hWh.LIZ.LJIIL("poi", "anchor", tokenCert, C1178720gmM.LIZIZ, new InterfaceC687820QyS() { // from class: X.0OA3
            @Override // X.InterfaceC687820QyS
            public final void LIZ(LocationData locationData) {
                C786410Ut5.LJJZZIII(C724640Sbe.LIZ(), new ARunnableS42S0300000_9(locationData, function0, function1, 4));
            }

            @Override // X.InterfaceC687820QyS
            public final void onError(int i, String str) {
                C786410Ut5.LJJZZIII(C724640Sbe.LIZ(), new ARunnableS109S0100000_9(function0, 156));
            }
        }, -1L);
    }
}
