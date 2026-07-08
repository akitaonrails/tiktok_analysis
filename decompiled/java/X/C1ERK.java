package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1ERK, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1ERK extends C09AY implements Function0<C1107560eva> {
    public C1ERK() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0eva] */
    @Override // kotlin.jvm.functions.Function0
    public final C1107560eva invoke() {
        return new InterfaceC1121830fIb() { // from class: X.0eva
            @Override // X.InterfaceC1121830fIb
            public final List<Class<? extends AbstractC1549150qPp<?, ?>>> LJFF() {
                ArrayList arrayList = new ArrayList();
                arrayList.add(C1514360pVi.class);
                arrayList.add(C519760KZy.class);
                arrayList.add(C1116920fAg.class);
                arrayList.add(C1116750fAP.class);
                return arrayList;
            }

            @Override // X.InterfaceC1121830fIb
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC1121830fIb
            public final void LIZJ() {
            }

            @Override // X.InterfaceC1121830fIb
            public final void LIZLLL() {
            }

            @Override // X.InterfaceC1121830fIb
            public final C1103280eog LJ() {
                return C1103280eog.LIZLLL;
            }

            @Override // X.InterfaceC1121830fIb
            public final C1106750euH LJJIIZI() {
                return C1106750euH.LIZ;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [X.0ef9] */
            @Override // X.InterfaceC1121830fIb
            public final C1097370ef9 LIZ(Map map, Map map2, Map map3, Context context) {
                if (Intrinsics.LJFF("live_pcs_go_live_preview", "live_pcs_go_live_preview")) {
                    return new AbstractC1097350ef7(map, map2, map3) { // from class: X.0ef9
                        public final Map<String, String> LIZ;
                        public final Map<String, String> LIZIZ;
                        public final Map<String, Object> LIZJ;
                        public final boolean LIZLLL;
                        public final Map<String, Boolean> LJ;
                        public final String LJFF;

                        @Override // X.InterfaceC1097470efJ
                        public final boolean LIZ() {
                            return this.LIZLLL;
                        }

                        @Override // X.InterfaceC1097470efJ
                        public final Map<String, String> LIZJ() {
                            return this.LIZIZ;
                        }

                        @Override // X.InterfaceC1097470efJ
                        public final Map<String, Boolean> LIZLLL() {
                            return this.LJ;
                        }

                        @Override // X.InterfaceC1097470efJ
                        public final Map<String, Object> LJII() {
                            return this.LIZJ;
                        }

                        @Override // X.InterfaceC1097470efJ
                        public final Map<String, String> getLogParam() {
                            return this.LIZ;
                        }

                        @Override // X.InterfaceC1097470efJ
                        public final String getSceneKey() {
                            return this.LJFF;
                        }

                        {
                            Map<String, Boolean> mapLJ = C2097608Jq.LJ();
                            this.LIZ = map;
                            this.LIZIZ = map2;
                            this.LIZJ = map3;
                            this.LIZLLL = true;
                            this.LJ = mapLJ;
                            this.LJFF = "live_pcs_go_live_preview";
                        }
                    };
                }
                return null;
            }
        };
    }
}
