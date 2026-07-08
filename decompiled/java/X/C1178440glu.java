package X;

import Y.ARunnableS109S0100000_9;
import Y.ARunnableS26S0400000_18;
import android.content.Context;
import com.bytedance.i18n.location.api.LocationData;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.poi.quiz.data.PoiQuizToastModel;
import com.ss.android.ugc.aweme.poi.quiz.vm.PoiQuizMapVM;
import com.ss.android.ugc.tiktok.location_api.service.ILocationService;
import com.ss.android.ugc.tiktok.location_api.service.api.ILocationServiceForLS;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AwS147S0400000_18;
import kotlin.jvm.internal.AwS37S1110000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS78S0500000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0glu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1178440glu {
    public final Context LIZ;
    public PoiQuizMapVM LIZIZ;
    public LocationData LIZJ;
    public final InterfaceC1178420gls[] LIZLLL = {new InterfaceC1178420gls() { // from class: X.0gmG
        @Override // X.InterfaceC1178420gls
        public final void LIZ() {
        }

        @Override // X.InterfaceC1178420gls
        public final void LIZJ(C1178440glu c1178440glu) {
        }

        @Override // X.InterfaceC1178420gls
        public final void LJ(C1178440glu c1178440glu) {
        }

        @Override // X.InterfaceC1178420gls
        public final void LJII(C1178440glu c1178440glu) {
        }

        @Override // X.InterfaceC1178420gls
        public final void LJFF(C19EG c19eg, final C1178440glu c1178440glu, final AwS562S0100000_18 awS562S0100000_18) {
            if (c19eg == null) {
                return;
            }
            C1207450hWh.LIZ.LJIJJ("poi", "quiz", C1178670gmH.LIZ, c19eg, C1178670gmH.LIZ(EnumC1178700gmK.AFTER_QUIZ), new InterfaceC1207030hW1() { // from class: X.0gmF
                @Override // X.InterfaceC1207030hW1
                public final void LIZIZ(int i, String str) {
                }

                @Override // X.InterfaceC1207030hW1
                public final void LIZJ(int i) {
                }

                @Override // X.InterfaceC1207030hW1
                public final void LIZ() {
                    c1178440glu.LIZ();
                    awS562S0100000_18.invoke();
                }
            }, null);
        }

        @Override // X.InterfaceC1178420gls
        public final void LJI(C1178440glu c1178440glu, C19EG c19eg, List<PoiQuizToastModel> list) {
            C1182860gt2 c1182860gt2 = C1182860gt2.LIZ;
            EnumC1178460glw enumC1178460glw = EnumC1178460glw.FIND_NEARBY_PLACE;
            c1182860gt2.getClass();
            C1182860gt2.LIZIZ(c19eg, list, enumC1178460glw, null);
        }

        @Override // X.InterfaceC1178420gls
        public final void LIZIZ(final C19EG c19eg, final C1178440glu c1178440glu, final List list, final Function0 function0) {
            if (c19eg == null) {
                return;
            }
            C1182900gt6 c1182900gt6 = C1182900gt6.LIZ;
            c1182900gt6.getClass();
            EnumC1205470hTV enumC1205470hTVLIZ = null;
            c1182900gt6.LIZJ("poi_quiz_request_gps_permission", null);
            if (C300190Bph.LIZ()) {
                ILocationServiceForLS iLocationServiceForLS = (ILocationServiceForLS) PluggableExtentionKt.pluggableSpi$default(ILocationServiceForLS.class, false, false, false, 14, null);
                if (iLocationServiceForLS != null) {
                    enumC1205470hTVLIZ = iLocationServiceForLS.LIZ(c19eg, C1178670gmH.LIZ, null);
                }
                if (enumC1205470hTVLIZ != EnumC1205470hTV.SUCCESS) {
                    return;
                }
            }
            C1207450hWh.LIZ.LJIJJ("poi", "quiz", C1178670gmH.LIZ, c19eg, C1178670gmH.LIZ(EnumC1178700gmK.BEFORE_QUIZ), new InterfaceC1207030hW1() { // from class: X.0gmE
                @Override // X.InterfaceC1207030hW1
                public final void LIZ() {
                    C1182900gt6 c1182900gt62 = C1182900gt6.LIZ;
                    c1182900gt62.getClass();
                    c1182900gt62.LIZJ("poi_quiz_request_gps_permission_result", new AwS37S1110000_18((Integer) null, (String) null, true, 2));
                    c1178440glu.LIZ();
                    function0.invoke();
                }

                @Override // X.InterfaceC1207030hW1
                public final void LIZJ(int i) {
                    C1182900gt6 c1182900gt62 = C1182900gt6.LIZ;
                    Integer numValueOf = Integer.valueOf(i);
                    c1182900gt62.getClass();
                    c1182900gt62.LIZJ("poi_quiz_request_gps_permission_result", new AwS37S1110000_18(numValueOf, (String) null, false, 2));
                    c1178440glu.LJ(c19eg, list, EnumC1178460glw.REQUEST_GPS, function0);
                }

                @Override // X.InterfaceC1207030hW1
                public final void LIZIZ(int i, String str) {
                    C1182900gt6 c1182900gt62 = C1182900gt6.LIZ;
                    Integer numValueOf = Integer.valueOf(i);
                    c1182900gt62.getClass();
                    c1182900gt62.LIZJ("poi_quiz_request_gps_permission_result", new AwS37S1110000_18(numValueOf, str, false, 2));
                    c1178440glu.LJ(c19eg, list, EnumC1178460glw.REQUEST_GPS, function0);
                }
            }, null);
        }

        @Override // X.InterfaceC1178420gls
        public final void LIZLLL(Boolean bool, C1178440glu c1178440glu, C19EG c19eg, List<PoiQuizToastModel> list, Function0<Unit> function0) {
            if (c19eg == null) {
                return;
            }
            AwS147S0400000_18 awS147S0400000_18 = new AwS147S0400000_18(c19eg, (C19EG) c1178440glu, (C1178440glu) list, (List<PoiQuizToastModel>) function0, (Function0<Unit>) 5);
            if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
                C1182860gt2 c1182860gt2 = C1182860gt2.LIZ;
                EnumC1178460glw enumC1178460glw = EnumC1178460glw.REQUEST_GPS_IN_QUIZ;
                c1182860gt2.getClass();
                C1182860gt2.LIZIZ(c19eg, list, enumC1178460glw, awS147S0400000_18);
                return;
            }
            awS147S0400000_18.invoke();
        }
    }, new InterfaceC1178420gls() { // from class: X.0glq
        public InterfaceC1177640gkc LIZ;

        @Override // X.InterfaceC1178420gls
        public final void LIZ() {
        }

        @Override // X.InterfaceC1178420gls
        public final void LIZIZ(C19EG c19eg, C1178440glu c1178440glu, List list, Function0 function0) {
        }

        @Override // X.InterfaceC1178420gls
        public final void LIZLLL(Boolean bool, C1178440glu c1178440glu, C19EG c19eg, List<PoiQuizToastModel> list, Function0<Unit> function0) {
        }

        @Override // X.InterfaceC1178420gls
        public final void LJFF(C19EG c19eg, C1178440glu c1178440glu, AwS562S0100000_18 awS562S0100000_18) {
        }

        @Override // X.InterfaceC1178420gls
        public final void LIZJ(C1178440glu c1178440glu) {
            InterfaceC1177640gkc interfaceC1177640gkc = this.LIZ;
            if (interfaceC1177640gkc != null) {
                interfaceC1177640gkc.remove();
            }
            this.LIZ = null;
        }

        @Override // X.InterfaceC1178420gls
        public final void LJ(C1178440glu c1178440glu) {
            InterfaceC1177250gjz interfaceC1177250gjz;
            LocationData locationData;
            PoiQuizMapVM poiQuizMapVM = c1178440glu.LIZIZ;
            if (poiQuizMapVM == null || (interfaceC1177250gjz = poiQuizMapVM.LL) == null || (locationData = c1178440glu.LIZJ) == null) {
                return;
            }
            double d = locationData.latitude;
            double d2 = locationData.longitude;
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
            Context context = c1178440glu.LIZ;
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

        @Override // X.InterfaceC1178420gls
        public final void LJII(C1178440glu c1178440glu) {
            InterfaceC1177640gkc interfaceC1177640gkc = this.LIZ;
            if (interfaceC1177640gkc != null) {
                interfaceC1177640gkc.remove();
            }
        }

        @Override // X.InterfaceC1178420gls
        public final void LJI(C1178440glu c1178440glu, C19EG c19eg, List<PoiQuizToastModel> list) {
            c1178440glu.LJFF();
        }
    }, new InterfaceC1178420gls() { // from class: X.0glp
        @Override // X.InterfaceC1178420gls
        public final void LIZ() {
        }

        @Override // X.InterfaceC1178420gls
        public final void LIZIZ(C19EG c19eg, C1178440glu c1178440glu, List list, Function0 function0) {
        }

        @Override // X.InterfaceC1178420gls
        public final void LIZLLL(Boolean bool, C1178440glu c1178440glu, C19EG c19eg, List<PoiQuizToastModel> list, Function0<Unit> function0) {
        }

        @Override // X.InterfaceC1178420gls
        public final void LJFF(C19EG c19eg, C1178440glu c1178440glu, AwS562S0100000_18 awS562S0100000_18) {
        }

        @Override // X.InterfaceC1178420gls
        public final void LIZJ(C1178440glu c1178440glu) {
            LJII(c1178440glu);
        }

        @Override // X.InterfaceC1178420gls
        public final void LJ(C1178440glu c1178440glu) {
            InterfaceC1177250gjz interfaceC1177250gjz;
            PoiQuizMapVM poiQuizMapVM = c1178440glu.LIZIZ;
            if (poiQuizMapVM != null && (interfaceC1177250gjz = poiQuizMapVM.LL) != null) {
                interfaceC1177250gjz.LJIILJJIL(true);
                interfaceC1177250gjz.LJJIIZI().LIZIZ();
            }
        }

        @Override // X.InterfaceC1178420gls
        public final void LJII(C1178440glu c1178440glu) {
            InterfaceC1177250gjz interfaceC1177250gjz;
            PoiQuizMapVM poiQuizMapVM = c1178440glu.LIZIZ;
            if (poiQuizMapVM != null && (interfaceC1177250gjz = poiQuizMapVM.LL) != null) {
                interfaceC1177250gjz.LJIILJJIL(false);
                interfaceC1177250gjz.LJJIIZI().LIZIZ();
            }
        }

        @Override // X.InterfaceC1178420gls
        public final void LJI(C1178440glu c1178440glu, C19EG c19eg, List<PoiQuizToastModel> list) {
            InterfaceC1177250gjz interfaceC1177250gjz;
            c1178440glu.LJFF();
            PoiQuizMapVM poiQuizMapVM = c1178440glu.LIZIZ;
            if (poiQuizMapVM != null && (interfaceC1177250gjz = poiQuizMapVM.LL) != null) {
                interfaceC1177250gjz.LJIILJJIL(true);
                interfaceC1177250gjz.LJJIIZI().LIZIZ();
            }
        }
    }};
    public InterfaceC1178420gls LJ = new InterfaceC1178420gls() { // from class: X.0gmG
        @Override // X.InterfaceC1178420gls
        public final void LIZ() {
        }

        @Override // X.InterfaceC1178420gls
        public final void LIZJ(C1178440glu c1178440glu) {
        }

        @Override // X.InterfaceC1178420gls
        public final void LJ(C1178440glu c1178440glu) {
        }

        @Override // X.InterfaceC1178420gls
        public final void LJII(C1178440glu c1178440glu) {
        }

        @Override // X.InterfaceC1178420gls
        public final void LJFF(C19EG c19eg, final C1178440glu c1178440glu, final AwS562S0100000_18 awS562S0100000_18) {
            if (c19eg == null) {
                return;
            }
            C1207450hWh.LIZ.LJIJJ("poi", "quiz", C1178670gmH.LIZ, c19eg, C1178670gmH.LIZ(EnumC1178700gmK.AFTER_QUIZ), new InterfaceC1207030hW1() { // from class: X.0gmF
                @Override // X.InterfaceC1207030hW1
                public final void LIZIZ(int i, String str) {
                }

                @Override // X.InterfaceC1207030hW1
                public final void LIZJ(int i) {
                }

                @Override // X.InterfaceC1207030hW1
                public final void LIZ() {
                    c1178440glu.LIZ();
                    awS562S0100000_18.invoke();
                }
            }, null);
        }

        @Override // X.InterfaceC1178420gls
        public final void LJI(C1178440glu c1178440glu, C19EG c19eg, List<PoiQuizToastModel> list) {
            C1182860gt2 c1182860gt2 = C1182860gt2.LIZ;
            EnumC1178460glw enumC1178460glw = EnumC1178460glw.FIND_NEARBY_PLACE;
            c1182860gt2.getClass();
            C1182860gt2.LIZIZ(c19eg, list, enumC1178460glw, null);
        }

        @Override // X.InterfaceC1178420gls
        public final void LIZIZ(final C19EG c19eg, final C1178440glu c1178440glu, final List list, final Function0 function0) {
            if (c19eg == null) {
                return;
            }
            C1182900gt6 c1182900gt6 = C1182900gt6.LIZ;
            c1182900gt6.getClass();
            EnumC1205470hTV enumC1205470hTVLIZ = null;
            c1182900gt6.LIZJ("poi_quiz_request_gps_permission", null);
            if (C300190Bph.LIZ()) {
                ILocationServiceForLS iLocationServiceForLS = (ILocationServiceForLS) PluggableExtentionKt.pluggableSpi$default(ILocationServiceForLS.class, false, false, false, 14, null);
                if (iLocationServiceForLS != null) {
                    enumC1205470hTVLIZ = iLocationServiceForLS.LIZ(c19eg, C1178670gmH.LIZ, null);
                }
                if (enumC1205470hTVLIZ != EnumC1205470hTV.SUCCESS) {
                    return;
                }
            }
            C1207450hWh.LIZ.LJIJJ("poi", "quiz", C1178670gmH.LIZ, c19eg, C1178670gmH.LIZ(EnumC1178700gmK.BEFORE_QUIZ), new InterfaceC1207030hW1() { // from class: X.0gmE
                @Override // X.InterfaceC1207030hW1
                public final void LIZ() {
                    C1182900gt6 c1182900gt62 = C1182900gt6.LIZ;
                    c1182900gt62.getClass();
                    c1182900gt62.LIZJ("poi_quiz_request_gps_permission_result", new AwS37S1110000_18((Integer) null, (String) null, true, 2));
                    c1178440glu.LIZ();
                    function0.invoke();
                }

                @Override // X.InterfaceC1207030hW1
                public final void LIZJ(int i) {
                    C1182900gt6 c1182900gt62 = C1182900gt6.LIZ;
                    Integer numValueOf = Integer.valueOf(i);
                    c1182900gt62.getClass();
                    c1182900gt62.LIZJ("poi_quiz_request_gps_permission_result", new AwS37S1110000_18(numValueOf, (String) null, false, 2));
                    c1178440glu.LJ(c19eg, list, EnumC1178460glw.REQUEST_GPS, function0);
                }

                @Override // X.InterfaceC1207030hW1
                public final void LIZIZ(int i, String str) {
                    C1182900gt6 c1182900gt62 = C1182900gt6.LIZ;
                    Integer numValueOf = Integer.valueOf(i);
                    c1182900gt62.getClass();
                    c1182900gt62.LIZJ("poi_quiz_request_gps_permission_result", new AwS37S1110000_18(numValueOf, str, false, 2));
                    c1178440glu.LJ(c19eg, list, EnumC1178460glw.REQUEST_GPS, function0);
                }
            }, null);
        }

        @Override // X.InterfaceC1178420gls
        public final void LIZLLL(Boolean bool, C1178440glu c1178440glu, C19EG c19eg, List<PoiQuizToastModel> list, Function0<Unit> function0) {
            if (c19eg == null) {
                return;
            }
            AwS147S0400000_18 awS147S0400000_18 = new AwS147S0400000_18(c19eg, (C19EG) c1178440glu, (C1178440glu) list, (List<PoiQuizToastModel>) function0, (Function0<Unit>) 5);
            if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
                C1182860gt2 c1182860gt2 = C1182860gt2.LIZ;
                EnumC1178460glw enumC1178460glw = EnumC1178460glw.REQUEST_GPS_IN_QUIZ;
                c1182860gt2.getClass();
                C1182860gt2.LIZIZ(c19eg, list, enumC1178460glw, awS147S0400000_18);
                return;
            }
            awS147S0400000_18.invoke();
        }
    };

    public static boolean LIZJ() {
        InterfaceC1207490hWl interfaceC1207490hWl = (InterfaceC1207490hWl) PluggableExtentionKt.pluggableSpi$default(ILocationService.class, false, false, false, 14, null);
        if (interfaceC1207490hWl == null) {
            return false;
        }
        C844470XAv.LIZ.getClass();
        return interfaceC1207490hWl.LJII(0, C844470XAv.LIZ());
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0078 A[PHI: r4
      0x0078: PHI (r4v2 boolean) = (r4v1 boolean), (r4v4 boolean) binds: [B:24:0x0075, B:8:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            r6 = this;
            java.lang.Class<com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT> r0 = com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT.class
            r1 = 0
            r4 = 14
            r5 = 0
            r2 = r1
            r3 = r1
            java.lang.Object r1 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r0, r1, r2, r3, r4, r5)
            com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT r1 = (com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT) r1
            r5 = 1
            if (r1 == 0) goto L74
            X.0XAv r0 = X.C844470XAv.LIZ
            r0.getClass()
            android.content.Context r0 = X.C844470XAv.LIZ()
            boolean r0 = r1.LJ(r0)
            if (r0 != r5) goto L74
            r4 = 1
        L21:
            boolean r0 = r1.LJJIJ()
            if (r0 != r5) goto L78
            r3 = 1
        L28:
            X.0hWh r2 = X.C1207450hWh.LIZ
            java.lang.String r1 = "poi"
            java.lang.String r0 = "quiz"
            boolean r0 = r2.LJI(r1, r0)
            if (r0 == 0) goto L58
            if (r4 == 0) goto L58
            if (r3 == 0) goto L58
            X.0gls[] r1 = r6.LIZLLL
            r0 = 2
            r2 = r1[r0]
        L3d:
            X.0gls r0 = r6.LJ
            java.lang.Class r1 = r0.getClass()
            java.lang.Class r0 = r2.getClass()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L57
            X.0gls r0 = r6.LJ
            r0.LIZJ(r6)
            r6.LJ = r2
            r2.LIZ()
        L57:
            return
        L58:
            X.12Lp r0 = X.C19741112Lp.LIZ
            android.app.Application r1 = X.C1BWL.LIZ()
            r0.getClass()
            java.lang.String r0 = "android.permission.ACCESS_COARSE_LOCATION"
            boolean r0 = X.C19741112Lp.LIZLLL(r1, r0)
            if (r0 == 0) goto L6e
            X.0gls[] r0 = r6.LIZLLL
            r2 = r0[r5]
            goto L3d
        L6e:
            X.0gls[] r1 = r6.LIZLLL
            r0 = 0
            r2 = r1[r0]
            goto L3d
        L74:
            r4 = 0
            if (r1 == 0) goto L78
            goto L21
        L78:
            r3 = 0
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1178440glu.LIZ():void");
    }

    public final void LJFF() {
        InterfaceC1177250gjz interfaceC1177250gjz;
        LocationData locationData = this.LIZJ;
        if (locationData != null) {
            C1177960gl8 c1177960gl8 = new C1177960gl8(locationData.latitude, locationData.longitude);
            PoiQuizMapVM poiQuizMapVM = this.LIZIZ;
            if (poiQuizMapVM != null && (interfaceC1177250gjz = poiQuizMapVM.LL) != null) {
                LIZLLL(c1177960gl8, interfaceC1177250gjz);
                return;
            }
        }
        LIZIZ(AFwS206S0000000_18.get$arr$(748), new AwS597S0100000_18(this, 959));
    }

    public C1178440glu(Context context) {
        this.LIZ = context;
        LIZ();
    }

    public final void LIZIZ(final Function0 function0, final Function1 function1) {
        C1182900gt6 c1182900gt6 = C1182900gt6.LIZ;
        c1182900gt6.getClass();
        c1182900gt6.LIZJ("poi_quiz_fetch_location", null);
        C1207450hWh.LIZ.LJIIL("poi", "quiz", C1178670gmH.LIZIZ, C1178670gmH.LIZJ, new InterfaceC687820QyS() { // from class: X.0gnh
            @Override // X.InterfaceC687820QyS
            public final void LIZ(LocationData locationData) {
                C786410Ut5.LJJZZIII(C724640Sbe.LIZ(), new ARunnableS26S0400000_18(locationData, function0, this, function1, 3));
            }

            @Override // X.InterfaceC687820QyS
            public final void onError(int i, String str) {
                C1182900gt6 c1182900gt62 = C1182900gt6.LIZ;
                Integer numValueOf = Integer.valueOf(i);
                c1182900gt62.getClass();
                c1182900gt62.LIZJ("poi_quiz_fetch_location_result", new AwS37S1110000_18(numValueOf, str, false, 1));
                C786410Ut5.LJJZZIII(C724640Sbe.LIZ(), new ARunnableS109S0100000_9(function0, 204));
            }
        }, -1L);
    }

    public final void LIZLLL(C1177960gl8 c1177960gl8, InterfaceC1177250gjz interfaceC1177250gjz) {
        Float fValueOf = Float.valueOf(interfaceC1177250gjz.LJIJJ());
        C1178480gly c1178480gly = new C1178480gly();
        c1178480gly.LIZ = true;
        c1178480gly.LIZJ = new AwS562S0100000_18(this, 2651);
        interfaceC1177250gjz.LIZIZ(c1177960gl8, fValueOf, c1178480gly);
    }

    public final void LJ(C19EG c19eg, List<PoiQuizToastModel> list, EnumC1178460glw enumC1178460glw, Function0<Unit> function0) {
        C1182860gt2 c1182860gt2 = C1182860gt2.LIZ;
        AwS78S0500000_18 awS78S0500000_18 = new AwS78S0500000_18(enumC1178460glw, (EnumC1178460glw) this, (C1178440glu) c19eg, (C19EG) list, (List<PoiQuizToastModel>) function0, (Function0<Unit>) 2);
        c1182860gt2.getClass();
        C1182860gt2.LIZIZ(c19eg, list, enumC1178460glw, awS78S0500000_18);
    }
}
