package X;

import android.app.Activity;
import android.os.Build;
import com.bytedance.bpea.basics.Cert;
import kotlin.Pair;
import kotlin.jvm.internal.AwS579S0100000_35;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hY5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1208310hY5 {
    public static final /* synthetic */ int LJII = 0;
    public final InterfaceC1235640iGA LIZ;
    public final Activity LIZIZ;
    public final Cert LIZJ;
    public final C1208270hY1 LIZLLL;
    public final InterfaceC1207170hWF LJ;
    public final C12Q8 LJFF;
    public final InterfaceC1798670wuH LJI;

    public final void LIZ() {
        if (Build.VERSION.SDK_INT >= 31) {
            C1798620wuC.LIZLLL("LocationController", "promoteInAppPermission: promoteAboveS");
            C1208270hY1 c1208270hY1 = this.LIZLLL;
            final C1210150hb3 c1210150hb3 = c1208270hY1.LJ;
            final C12Q8 c12q8 = this.LJFF;
            final Activity activity = this.LIZIZ;
            C12QB c12qb = new C12QB() { // from class: X.0hYP
                @Override // X.C12QB
                public final void LIZ() {
                    int i = C12QH.LIZ[c1210150hb3.LIZIZ.ordinal()];
                    if (i == 1) {
                        c12q8.LIZIZ(new AwS579S0100000_35(this, 197));
                        return;
                    }
                    if (i == 2) {
                        C1798620wuC.LIZLLL("LocationController", "promoteInAppPermission above S: CANCEL");
                        c12q8.LIZIZ(new AwS579S0100000_35(this, 198));
                        return;
                    }
                    if (i != 3) {
                        C1798620wuC.LIZLLL("LocationController", "should never goto here");
                        this.getClass();
                        return;
                    }
                    C1798620wuC.LIZLLL("LocationController", "promoteInAppPermission above S: SETTINGS");
                    C1208130hXn c1208130hXn = C1208130hXn.LIZJ;
                    Activity activity2 = activity;
                    c1208130hXn.getClass();
                    C1208130hXn.LJJJJI(activity2);
                    this.LIZIZ(null, "in_app_above_s_settings");
                    this.LJ.LIZIZ(C1208000hXa.LJ);
                }

                @Override // X.C12QB
                public final String LIZIZ() {
                    return c1210150hb3.LIZ;
                }

                @Override // X.C12QB
                public final C12QJ type() {
                    return c1210150hb3.LIZIZ;
                }
            };
            final C1210150hb3 c1210150hb32 = c1208270hY1.LJFF;
            c12q8.LIZJ(c1208270hY1.LIZ, c1208270hY1.LIZIZ, c12qb, c1210150hb32 != null ? new C12QB() { // from class: X.0hYP
                @Override // X.C12QB
                public final void LIZ() {
                    int i = C12QH.LIZ[c1210150hb32.LIZIZ.ordinal()];
                    if (i == 1) {
                        c12q8.LIZIZ(new AwS579S0100000_35(this, 197));
                        return;
                    }
                    if (i == 2) {
                        C1798620wuC.LIZLLL("LocationController", "promoteInAppPermission above S: CANCEL");
                        c12q8.LIZIZ(new AwS579S0100000_35(this, 198));
                        return;
                    }
                    if (i != 3) {
                        C1798620wuC.LIZLLL("LocationController", "should never goto here");
                        this.getClass();
                        return;
                    }
                    C1798620wuC.LIZLLL("LocationController", "promoteInAppPermission above S: SETTINGS");
                    C1208130hXn c1208130hXn = C1208130hXn.LIZJ;
                    Activity activity2 = activity;
                    c1208130hXn.getClass();
                    C1208130hXn.LJJJJI(activity2);
                    this.LIZIZ(null, "in_app_above_s_settings");
                    this.LJ.LIZIZ(C1208000hXa.LJ);
                }

                @Override // X.C12QB
                public final String LIZIZ() {
                    return c1210150hb32.LIZ;
                }

                @Override // X.C12QB
                public final C12QJ type() {
                    return c1210150hb32.LIZIZ;
                }
            } : null, c1208270hY1.LIZJ, new AwS579S0100000_35(this, 195));
            return;
        }
        C1798620wuC.LIZLLL("LocationController", "promoteInAppPermission: promoteUnderS");
        C1208270hY1 c1208270hY12 = this.LIZLLL;
        final C1210150hb3 c1210150hb33 = c1208270hY12.LJ;
        final C12Q8 c12q82 = this.LJFF;
        final Cert cert = this.LIZJ;
        final Activity activity2 = this.LIZIZ;
        C12QB c12qb2 = new C12QB() { // from class: X.0hY7
            @Override // X.C12QB
            public final void LIZ() {
                int i = C12QL.LIZ[c1210150hb33.LIZIZ.ordinal()];
                if (i == 1) {
                    C1798620wuC.LIZLLL("LocationController", "promoteInAppPermission: perform OK");
                    final C12Q8 c12q83 = c12q82;
                    final C1208310hY5 c1208310hY5 = this;
                    c1208310hY5.LIZ.LIZIZ(activity2, new String[]{"android.permission.ACCESS_FINE_LOCATION"}, cert, new InterfaceC1208110hXl() { // from class: X.0hY8
                        @Override // X.InterfaceC1208110hXl
                        public final void LIZ(C1208240hXy c1208240hXy) {
                        }

                        @Override // X.InterfaceC1208110hXl
                        public final void LIZIZ(Pair<String, ? extends EnumC1207930hXT>... pairArr) {
                            EnumC1207930hXT second;
                            int length = pairArr.length;
                            int i2 = 0;
                            while (true) {
                                second = null;
                                if (i2 >= length) {
                                    break;
                                }
                                Pair<String, ? extends EnumC1207930hXT> pair = pairArr[i2];
                                if (Intrinsics.LJFF(pair.getFirst(), "android.permission.ACCESS_FINE_LOCATION")) {
                                    second = pair.getSecond();
                                    break;
                                }
                                i2++;
                            }
                            if (second == EnumC1207930hXT.Granted) {
                                c12q83.LIZIZ(new AwS579S0100000_35(c1208310hY5, 200));
                            } else {
                                c12q83.LIZIZ(new AwS579S0100000_35(c1208310hY5, 201));
                            }
                        }
                    });
                    return;
                }
                if (i != 2) {
                    C1798620wuC.LIZLLL("LocationController", "promoteInAppPermission under S: should never goto here");
                    this.getClass();
                } else {
                    C1798620wuC.LIZLLL("LocationController", "promoteInAppPermission: perform CANCEL");
                    c12q82.LIZIZ(new AwS579S0100000_35(this, 199));
                }
            }

            @Override // X.C12QB
            public final String LIZIZ() {
                return c1210150hb33.LIZ;
            }

            @Override // X.C12QB
            public final C12QJ type() {
                return c1210150hb33.LIZIZ;
            }
        };
        final C1210150hb3 c1210150hb34 = c1208270hY12.LJFF;
        c12q82.LIZJ(c1208270hY12.LIZ, c1208270hY12.LIZIZ, c12qb2, c1210150hb34 != null ? new C12QB() { // from class: X.0hY7
            @Override // X.C12QB
            public final void LIZ() {
                int i = C12QL.LIZ[c1210150hb34.LIZIZ.ordinal()];
                if (i == 1) {
                    C1798620wuC.LIZLLL("LocationController", "promoteInAppPermission: perform OK");
                    final C12Q8 c12q83 = c12q82;
                    final C1208310hY5 c1208310hY5 = this;
                    c1208310hY5.LIZ.LIZIZ(activity2, new String[]{"android.permission.ACCESS_FINE_LOCATION"}, cert, new InterfaceC1208110hXl() { // from class: X.0hY8
                        @Override // X.InterfaceC1208110hXl
                        public final void LIZ(C1208240hXy c1208240hXy) {
                        }

                        @Override // X.InterfaceC1208110hXl
                        public final void LIZIZ(Pair<String, ? extends EnumC1207930hXT>... pairArr) {
                            EnumC1207930hXT second;
                            int length = pairArr.length;
                            int i2 = 0;
                            while (true) {
                                second = null;
                                if (i2 >= length) {
                                    break;
                                }
                                Pair<String, ? extends EnumC1207930hXT> pair = pairArr[i2];
                                if (Intrinsics.LJFF(pair.getFirst(), "android.permission.ACCESS_FINE_LOCATION")) {
                                    second = pair.getSecond();
                                    break;
                                }
                                i2++;
                            }
                            if (second == EnumC1207930hXT.Granted) {
                                c12q83.LIZIZ(new AwS579S0100000_35(c1208310hY5, 200));
                            } else {
                                c12q83.LIZIZ(new AwS579S0100000_35(c1208310hY5, 201));
                            }
                        }
                    });
                    return;
                }
                if (i != 2) {
                    C1798620wuC.LIZLLL("LocationController", "promoteInAppPermission under S: should never goto here");
                    this.getClass();
                } else {
                    C1798620wuC.LIZLLL("LocationController", "promoteInAppPermission: perform CANCEL");
                    c12q82.LIZIZ(new AwS579S0100000_35(this, 199));
                }
            }

            @Override // X.C12QB
            public final String LIZIZ() {
                return c1210150hb34.LIZ;
            }

            @Override // X.C12QB
            public final C12QJ type() {
                return c1210150hb34.LIZIZ;
            }
        } : null, null, new AwS579S0100000_35(this, 196));
    }

    public final void LIZIZ(Boolean bool, String str) {
        if (bool != null) {
            C1798660wuG.LIZ(this.LJI, bool.booleanValue(), str);
        } else {
            C1798660wuG.LIZ(this.LJI, C1194170hBH.LIZIZ(this.LIZIZ), str);
        }
    }

    public C1208310hY5(InterfaceC1235640iGA interfaceC1235640iGA, Activity activity, Cert cert, C1208270hY1 c1208270hY1, InterfaceC1207170hWF interfaceC1207170hWF, C12Q8 c12q8, InterfaceC1798670wuH interfaceC1798670wuH) {
        this.LIZ = interfaceC1235640iGA;
        this.LIZIZ = activity;
        this.LIZJ = cert;
        this.LIZLLL = c1208270hY1;
        this.LJ = interfaceC1207170hWF;
        this.LJFF = c12q8;
        this.LJI = interfaceC1798670wuH;
    }
}
