package X;

import android.view.SurfaceHolder;
import com.bytedance.creativex.camerakit.camera.session.recorder.impl.RecorderImpl;
import com.ss.android.ugc.asve.context.PreviewSize;
import com.ss.android.vesdk.VECameraSettings;
import com.ss.android.vesdk.VEDisplaySettings;
import com.ss.android.vesdk.VESize;
import dn3.k;
import java.lang.Enum;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS401S0200000_35;
import kotlin.jvm.internal.AwS47S0010000_35;
import kotlin.jvm.internal.AwS579S0100000_35;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1DGO, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DGO<KEY extends Enum<KEY>> implements C1DGN<KEY> {
    public final C1DGK<KEY> LIZ;
    public final C1DGI<KEY> LIZIZ;
    public final Function0<C1DHP> LIZJ;
    public Function0<? extends C1DGU<KEY>> LIZLLL;

    /* JADX WARN: Type inference failed for: r4v0, types: [X.1DHg] */
    @Override // X.C1DGN
    public final k create() {
        C1DGU<KEY> c1dgt;
        final Function0<C1DHP> function0 = this.LIZJ;
        ?? r4 = new C1DHH(function0) { // from class: X.1DHg
            public final Function0<C1DHP> LIZ;
            public RecorderImpl LIZIZ;
            public C1DKA LIZJ;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.LIZ = function0;
            }

            @Override // X.C1DHH
            public final RecorderImpl LIZ(final C1DKA c1dka, C2253271DHh c2253271DHh) {
                RecorderImpl recorderImpl = this.LIZIZ;
                if (recorderImpl == null) {
                    final C1DKV c1dkv = c2253271DHh.LIZLLL;
                    C1DKV c1dkv2 = new C1DKV(c1dkv) { // from class: X.1DKS
                        public final /* synthetic */ C1DKV LIZ;
                        public final C2253531DIh LIZIZ;
                        public final C1DKX LIZJ;

                        @Override // X.C1DKV
                        public final boolean LIZ() {
                            return this.LIZ.LIZ();
                        }

                        @Override // X.C1DKV
                        public final boolean LIZIZ() {
                            return this.LIZ.LIZIZ();
                        }

                        @Override // X.C1DKV
                        public final boolean LIZJ() {
                            return this.LIZ.LIZJ();
                        }

                        @Override // X.C1DKV
                        public final boolean LIZLLL() {
                            return this.LIZ.LIZLLL();
                        }

                        @Override // X.C1DKV
                        public final boolean LJ() {
                            return this.LIZ.LJ();
                        }

                        @Override // X.C1DKV
                        public final Function0<List<C2185991Agv>> LJFF() {
                            return this.LIZ.LJFF();
                        }

                        @Override // X.C1DKV
                        public final boolean LJI() {
                            return this.LIZ.LJI();
                        }

                        @Override // X.C1DKV
                        public final boolean LJII() {
                            return this.LIZ.LJII();
                        }

                        @Override // X.C1DKV
                        public final int LJIIIIZZ() {
                            return this.LIZ.LJIIIIZZ();
                        }

                        @Override // X.C1DKV
                        public final Function0<Boolean> LJIIIZ() {
                            return this.LIZ.LJIIIZ();
                        }

                        @Override // X.C1DKV
                        public final C1DMJ LJIIJ() {
                            return this.LIZ.LJIIJ();
                        }

                        @Override // X.C1DKV
                        public final boolean LJIIJJI() {
                            return this.LIZ.LJIIJJI();
                        }

                        @Override // X.C1DKV
                        public final boolean LJIIL() {
                            return this.LIZ.LJIIL();
                        }

                        @Override // X.C1DKV
                        public final boolean LJIILIIL() {
                            return this.LIZ.LJIILIIL();
                        }

                        @Override // X.C1DKV
                        public final boolean LJIILJJIL() {
                            return this.LIZ.LJIILJJIL();
                        }

                        @Override // X.C1DKV
                        public final boolean LJIILL() {
                            return this.LIZ.LJIILL();
                        }

                        @Override // X.C1DKV
                        public final int LJIJ() {
                            return this.LIZ.LJIJ();
                        }

                        @Override // X.C1DKV
                        public final boolean LJIJI() {
                            return this.LIZ.LJIJI();
                        }

                        @Override // X.C1DKV
                        public final boolean LJIJJ() {
                            return this.LIZ.LJIJJ();
                        }

                        @Override // X.C1DKV
                        public final boolean LJIJJLI() {
                            return this.LIZ.LJIJJLI();
                        }

                        @Override // X.C1DKV
                        public final boolean LJIL() {
                            return this.LIZ.LJIL();
                        }

                        @Override // X.C1DKV
                        public final boolean LJJ() {
                            return this.LIZ.LJJ();
                        }

                        @Override // X.C1DKV
                        public final long LJJI() {
                            return this.LIZ.LJJI();
                        }

                        @Override // X.C1DKV
                        public final boolean LJJIFFI() {
                            return this.LIZ.LJJIFFI();
                        }

                        @Override // X.C1DKV
                        public final boolean LJJII() {
                            return this.LIZ.LJJII();
                        }

                        @Override // X.C1DKV
                        public final InterfaceC2253801DJi LJJIII() {
                            return this.LIZ.LJJIII();
                        }

                        @Override // X.C1DKV
                        public final Function0<Boolean> LJJIIJ() {
                            return this.LIZ.LJJIIJ();
                        }

                        @Override // X.C1DKV
                        public final Function0<Boolean> LJJIIZ() {
                            return this.LIZ.LJJIIZ();
                        }

                        @Override // X.C1DKV
                        public final boolean LJJIIZI() {
                            return this.LIZ.LJJIIZI();
                        }

                        @Override // X.C1DKV
                        public final int getRotation() {
                            return this.LIZ.getRotation();
                        }

                        @Override // X.C1DKV
                        public final SurfaceHolder getSurfaceHolder() {
                            return this.LIZ.getSurfaceHolder();
                        }

                        @Override // X.C1DKV
                        public final Pair<Integer, Integer> LJJIIJZLJL() {
                            return new Pair<>(Integer.valueOf(this.LIZLLL.LIZIZ.width), Integer.valueOf(this.LIZLLL.LIZIZ.height));
                        }

                        @Override // X.C1DKV
                        public final C1DKZ LJIILLIIL() {
                            return this.LIZJ;
                        }

                        @Override // X.C1DKV
                        public final InterfaceC2253521DIg LJIIZILJ() {
                            return this.LIZIZ;
                        }

                        /* JADX WARN: Type inference failed for: r0v0, types: [X.1DIh] */
                        /* JADX WARN: Type inference failed for: r0v1, types: [X.1DKX] */
                        {
                            this.LIZ = c1dkv;
                            this.LIZIZ = new InterfaceC2253521DIg(c1dkv) { // from class: X.1DIh
                                public final /* synthetic */ InterfaceC2253521DIg LIZ;

                                @Override // X.InterfaceC2253521DIg
                                public final C1D3N LIZ() {
                                    return this.LIZ.LIZ();
                                }

                                @Override // X.InterfaceC2253521DIg
                                public final int[] LIZIZ() {
                                    PreviewSize previewSize = this.LIZIZ.LIZJ;
                                    return new int[]{previewSize.width, previewSize.height};
                                }

                                @Override // X.InterfaceC2253521DIg
                                public final VECameraSettings.CAMERA_MODE_TYPE LIZJ() {
                                    return this.LIZ.LIZJ();
                                }

                                @Override // X.InterfaceC2253521DIg
                                public final boolean LIZLLL() {
                                    return this.LIZ.LIZLLL();
                                }

                                @Override // X.InterfaceC2253521DIg
                                public final int[] LJ() {
                                    return this.LIZ.LJ();
                                }

                                @Override // X.InterfaceC2253521DIg
                                public final byte LJI() {
                                    return this.LIZ.LJI();
                                }

                                @Override // X.InterfaceC2253521DIg
                                public final boolean LJII() {
                                    return this.LIZ.LJII();
                                }

                                @Override // X.InterfaceC2253521DIg
                                public final int[] LJIIIIZZ() {
                                    PreviewSize previewSize = this.LIZIZ.LIZLLL;
                                    return new int[]{previewSize.width, previewSize.height};
                                }

                                @Override // X.InterfaceC2253521DIg
                                public final int LJIIIZ() {
                                    return this.LIZ.LJIIIZ();
                                }

                                @Override // X.InterfaceC2253521DIg
                                public final VEDisplaySettings LJIIJJI() {
                                    return this.LIZ.LJIIJJI();
                                }

                                @Override // X.InterfaceC2253521DIg
                                public final boolean LJIIL() {
                                    return this.LIZ.LJIIL();
                                }

                                @Override // X.InterfaceC2253521DIg
                                public final VEDisplaySettings LJIILIIL(VESize vESize) {
                                    return this.LIZ.LJIILIIL(vESize);
                                }

                                @Override // X.InterfaceC2253521DIg
                                public final boolean LJIILJJIL() {
                                    return this.LIZ.LJIILJJIL();
                                }

                                @Override // X.InterfaceC2253521DIg
                                public final boolean LJIILL() {
                                    return this.LIZ.LJIILL();
                                }

                                @Override // X.InterfaceC2253521DIg
                                public final int LJIILLIIL() {
                                    return this.LIZ.LJIILLIIL();
                                }

                                @Override // X.InterfaceC2253521DIg
                                public final int[] LJIIZILJ() {
                                    return this.LIZ.LJIIZILJ();
                                }

                                @Override // X.InterfaceC2253521DIg
                                public final boolean LJIJ() {
                                    return this.LIZ.LJIJ();
                                }

                                @Override // X.InterfaceC2253521DIg
                                public final int LJIJI() {
                                    return this.LIZ.LJIJI();
                                }

                                @Override // X.InterfaceC2253521DIg
                                public final boolean LJIJJ() {
                                    return this.LIZ.LJIJJ();
                                }

                                @Override // X.InterfaceC2253521DIg
                                public final int getFrontCameraStabilizationStrategy() {
                                    return this.LIZ.getFrontCameraStabilizationStrategy();
                                }

                                @Override // X.InterfaceC2253521DIg
                                public final int getRearCameraStabilizationStrategy() {
                                    return this.LIZ.getRearCameraStabilizationStrategy();
                                }

                                @Override // X.InterfaceC2253521DIg
                                public final Boolean LJFF() {
                                    return this.LIZIZ.LJIIIIZZ;
                                }

                                @Override // X.InterfaceC2253521DIg
                                public final int[] LJIIJ() {
                                    Integer num;
                                    C1DKA c1dka2 = this.LIZIZ;
                                    if (c1dka2.LJII == null || (num = c1dka2.LJI) == null) {
                                        return null;
                                    }
                                    return new int[]{num.intValue(), this.LIZIZ.LJII.intValue()};
                                }

                                {
                                    this.LIZ = c1dkv.LJIIZILJ();
                                }
                            };
                            this.LIZJ = new C1DKZ(this.LIZLLL, c1dkv) { // from class: X.1DKX
                                public final /* synthetic */ C1DKZ LIZ;
                                public final /* synthetic */ C1DKV LIZIZ;
                                public final /* synthetic */ C1DKA LIZJ;

                                @Override // X.C1DKZ
                                public final boolean LIZ() {
                                    return this.LIZ.LIZ();
                                }

                                @Override // X.C1DKZ
                                public final boolean LIZJ() {
                                    return this.LIZ.LIZJ();
                                }

                                @Override // X.C1DKZ
                                public final boolean LIZLLL() {
                                    return this.LIZ.LIZLLL();
                                }

                                @Override // X.C1DKZ
                                public final EnumC1778480wNi LJ() {
                                    return this.LIZ.LJ();
                                }

                                @Override // X.C1DKZ
                                public final float LJFF() {
                                    return this.LIZ.LJFF();
                                }

                                @Override // X.C1DKZ
                                public final String LJII() {
                                    return this.LIZ.LJII();
                                }

                                @Override // X.C1DKZ
                                public final float LIZIZ() {
                                    Float f = this.LIZJ.LJIIIZ;
                                    return f != null ? f.floatValue() : this.LIZIZ.LJIILLIIL().LIZIZ();
                                }

                                @Override // X.C1DKZ
                                public final int LJI() {
                                    Integer num = this.LIZJ.LJIIJ;
                                    return num != null ? num.intValue() : this.LIZIZ.LJIILLIIL().LJI();
                                }

                                {
                                    this.LIZIZ = c1dkv;
                                    this.LIZ = c1dkv.LJIILLIIL();
                                }
                            };
                        }
                    };
                    InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("CaptureLog createRecorderActual: ");
                    sbLIZ.append(c1dka);
                    interfaceC1463990oCTLIZLLL.i(C2188811AlT.LIZIZ(sbLIZ));
                    RecorderImpl recorderImpl2 = new RecorderImpl(new C2253271DHh(c2253271DHh.LIZ, c2253271DHh.LIZIZ, c2253271DHh.LIZJ, c1dkv2, c2253271DHh.LJ, c2253271DHh.LJFF, c2253271DHh.LJI, c2253271DHh.LJII, c2253271DHh.LJIIIIZZ));
                    recorderImpl2.init();
                    this.LIZIZ = recorderImpl2;
                } else {
                    C1DKA c1dka2 = this.LIZJ;
                    if (c1dka2 != null && c1dka2 != c1dka) {
                        InterfaceC1463990oCT interfaceC1463990oCTLIZLLL2 = C2219091BtD.LIZLLL();
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("CaptureLog tryUpdateRecorder oldSessionContext: [");
                        sbLIZ2.append(c1dka2);
                        sbLIZ2.append("], \n newSessionContext:[");
                        sbLIZ2.append(c1dka);
                        sbLIZ2.append(']');
                        interfaceC1463990oCTLIZLLL2.i(C2188811AlT.LIZIZ(sbLIZ2));
                        this.LIZ.invoke().LIZ();
                        this.LIZ.invoke().LIZ();
                        C1DK4 c1dk4 = new C2217381BqS() { // from class: X.1DK4
                            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                            public final Object get(Object obj) {
                                return ((C1DKA) obj).LIZIZ;
                            }
                        };
                        Object objInvoke = c1dk4.invoke(c1dka2);
                        Object objInvoke2 = c1dk4.invoke(c1dka);
                        if (!Intrinsics.LJFF(objInvoke, objInvoke2)) {
                            PreviewSize previewSize = (PreviewSize) objInvoke2;
                            recorderImpl.getMediaController().Q4(previewSize.width, previewSize.height);
                        }
                        Pair pair = new Pair(new C2217381BqS() { // from class: X.1DJu
                            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                            public final Object get(Object obj) {
                                return ((C1DKA) obj).LJI;
                            }
                        }, new C2217381BqS() { // from class: X.1DJx
                            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                            public final Object get(Object obj) {
                                return ((C1DKA) obj).LJII;
                            }
                        });
                        Function1 function1 = (Function1) pair.getFirst();
                        Function1 function12 = (Function1) pair.getSecond();
                        Object objInvoke3 = function1.invoke(c1dka2);
                        Object objInvoke4 = function1.invoke(c1dka);
                        Object objInvoke5 = function12.invoke(c1dka2);
                        Object objInvoke6 = function12.invoke(c1dka);
                        if (!Intrinsics.LJFF(objInvoke3, objInvoke4) && !Intrinsics.LJFF(objInvoke5, objInvoke6)) {
                            Integer num = (Integer) objInvoke6;
                            Integer num2 = (Integer) objInvoke4;
                            if (num2 != null && num != null) {
                                recorderImpl.getCameraController().x4(new AwS401S0200000_35(num2, num, 44));
                            }
                        }
                        Boolean bool = c1dka.LJIIIIZZ;
                        if (bool != null) {
                            boolean zBooleanValue = bool.booleanValue();
                            if (!Intrinsics.LJFF(Boolean.valueOf(zBooleanValue), c1dka2.LJIIIIZZ)) {
                                recorderImpl.getCameraController().x4(new AwS47S0010000_35(zBooleanValue, 18));
                            }
                        }
                    }
                }
                this.LIZJ = c1dka;
                RecorderImpl recorderImpl3 = this.LIZIZ;
                if (recorderImpl3 != null) {
                    return recorderImpl3;
                }
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        };
        Function0<? extends C1DGU<KEY>> function02 = this.LIZLLL;
        if (function02 == null || (c1dgt = function02.invoke()) == null) {
            c1dgt = new C1DGT<>();
        }
        return new k(this.LIZ, c1dgt, this.LIZIZ, r4, this.LIZJ);
    }

    public C1DGO(C1DGK c1dgk, C1DGG c1dgg, AwS579S0100000_35 awS579S0100000_35) {
        this.LIZ = c1dgk;
        this.LIZIZ = c1dgg;
        this.LIZJ = awS579S0100000_35;
    }
}
