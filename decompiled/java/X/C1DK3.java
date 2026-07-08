package X;

import android.view.SurfaceHolder;
import com.ss.android.ugc.aweme.services.video.IVideoConfigService;
import com.ss.android.vesdk.VECameraSettings;
import com.ss.android.vesdk.VEDisplaySettings;
import com.ss.android.vesdk.VEPreviewSettings;
import com.ss.android.vesdk.VESize;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS226S0000000_35;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.1DK3, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DK3 implements C1DK0 {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(650));

    @Override // X.C1DK0
    public final int getHeight() {
        return ((IVideoConfigService) this.LIZ.getValue()).getVideoHeight();
    }

    @Override // X.C1DK0
    public final int getWidth() {
        return ((IVideoConfigService) this.LIZ.getValue()).getVideoWidth();
    }

    @Override // X.C1DK0
    public final VEPreviewSettings LIZ(final boolean z) {
        C1DKV c1dkv;
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "im_dm_video_preview_settings_alignment", true, true)) {
            C1651100t4G.LIZ.getClass();
            final C1660540tJU c1660540tJULIZ = C1661480tL0.LIZ(0);
            final boolean zLJIL = new C19731412Hw("").LJIL();
            c1dkv = new C1DKV(zLJIL, c1660540tJULIZ, z) { // from class: X.1DLU
                public final long LIZ;
                public final InterfaceC2253521DIg LIZIZ;
                public final C2254241DLa LIZJ;
                public final AFwS214S0000000_25 LIZLLL;
                public final boolean LJ;
                public final AwS569S0100000_25 LJFF;

                @Override // X.C1DKV
                public final boolean LIZIZ() {
                    return false;
                }

                @Override // X.C1DKV
                public final boolean LIZJ() {
                    return false;
                }

                @Override // X.C1DKV
                public final boolean LIZLLL() {
                    return false;
                }

                @Override // X.C1DKV
                public final boolean LJI() {
                    return false;
                }

                @Override // X.C1DKV
                public final boolean LJII() {
                    return false;
                }

                @Override // X.C1DKV
                public final boolean LJIIJJI() {
                    return false;
                }

                @Override // X.C1DKV
                public final boolean LJIIL() {
                    return false;
                }

                @Override // X.C1DKV
                public final boolean LJIILJJIL() {
                    return false;
                }

                @Override // X.C1DKV
                public final int LJIJ() {
                    return 0;
                }

                @Override // X.C1DKV
                public final boolean LJIJJ() {
                    return false;
                }

                @Override // X.C1DKV
                public final boolean LJIJJLI() {
                    return false;
                }

                @Override // X.C1DKV
                public final boolean LJIL() {
                    return false;
                }

                @Override // X.C1DKV
                public final boolean LJJ() {
                    return false;
                }

                @Override // X.C1DKV
                public final boolean LJJIFFI() {
                    return false;
                }

                @Override // X.C1DKV
                public final boolean LJJII() {
                    return false;
                }

                @Override // X.C1DKV
                public final boolean LJJIIZI() {
                    return false;
                }

                @Override // X.C1DKV
                public final int getRotation() {
                    return 0;
                }

                @Override // X.C1DKV
                public final SurfaceHolder getSurfaceHolder() {
                    return null;
                }

                @Override // X.C1DKV
                public final boolean LIZ() {
                    C1651100t4G.LIZ.getClass();
                    return C290870Baf.LIZ();
                }

                @Override // X.C1DKV
                public final boolean LJ() {
                    C1651100t4G.LIZ.getClass();
                    return C0BNG.LIZ();
                }

                @Override // X.C1DKV
                public final int LJIIIIZZ() {
                    C1651100t4G.LIZ.getClass();
                    return ((Number) C280780AzU.LIZ.getValue()).intValue();
                }

                @Override // X.C1DKV
                public final Function0<Boolean> LJIIIZ() {
                    return AFwS226S0000000_35.get$arr$(85);
                }

                @Override // X.C1DKV
                public final C1DMJ LJIIJ() {
                    return new C2208831Bcf();
                }

                @Override // X.C1DKV
                public final boolean LJIILIIL() {
                    C1651100t4G.LIZ.getClass();
                    return C1645510svF.LIZ();
                }

                @Override // X.C1DKV
                public final C1DKZ LJIILLIIL() {
                    return new C1DLY();
                }

                @Override // X.C1DKV
                public final boolean LJIJI() {
                    C1651100t4G.LIZ.getClass();
                    return false;
                }

                @Override // X.C1DKV
                public final Function0<Boolean> LJJIIZ() {
                    return AFwS226S0000000_35.get$arr$(86);
                }

                @Override // X.C1DKV
                public final Pair<Integer, Integer> LJJIIJZLJL() {
                    return C2240051Clv.LIZ();
                }

                @Override // X.C1DKV
                public final Function0<List<C2185991Agv>> LJFF() {
                    return this.LJFF;
                }

                @Override // X.C1DKV
                public final boolean LJIILL() {
                    return this.LJ;
                }

                @Override // X.C1DKV
                public final InterfaceC2253521DIg LJIIZILJ() {
                    return this.LIZIZ;
                }

                @Override // X.C1DKV
                public final long LJJI() {
                    return this.LIZ;
                }

                @Override // X.C1DKV
                public final InterfaceC2253801DJi LJJIII() {
                    return this.LIZJ;
                }

                @Override // X.C1DKV
                public final Function0<Boolean> LJJIIJ() {
                    return this.LIZLLL;
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [X.1DLa] */
                {
                    long j;
                    if (zLJIL) {
                        j = 1;
                    } else {
                        j = 0;
                    }
                    this.LIZ = j;
                    this.LIZIZ = c1660540tJULIZ;
                    this.LIZJ = new InterfaceC2253801DJi() { // from class: X.1DLa
                        @Override // X.InterfaceC2253801DJi
                        public final boolean LIZ() {
                            return false;
                        }

                        @Override // X.InterfaceC2253801DJi
                        public final boolean LIZIZ() {
                            return false;
                        }

                        @Override // X.InterfaceC2253801DJi
                        public final int LIZJ() {
                            return 0;
                        }

                        @Override // X.InterfaceC2253801DJi
                        public final String LIZLLL() {
                            return "";
                        }

                        @Override // X.InterfaceC2253801DJi
                        public final String LJ() {
                            return "";
                        }

                        @Override // X.InterfaceC2253801DJi
                        public final int LJFF() {
                            return 0;
                        }
                    };
                    this.LIZLLL = AFwS214S0000000_25.get$arr$(543);
                    this.LJ = z;
                    this.LJFF = new AwS569S0100000_25(c1660540tJULIZ, 1064);
                }
            };
        } else {
            c1dkv = new C1DKV() { // from class: X.1DLV
                public final C1661500tL2 LIZ = new InterfaceC2253521DIg() { // from class: X.0tL2
                    @Override // X.InterfaceC2253521DIg
                    public final int[] LIZIZ() {
                        return new int[0];
                    }

                    @Override // X.InterfaceC2253521DIg
                    public final boolean LIZLLL() {
                        return true;
                    }

                    @Override // X.InterfaceC2253521DIg
                    public final int[] LJ() {
                        return new int[0];
                    }

                    @Override // X.InterfaceC2253521DIg
                    public final Boolean LJFF() {
                        return null;
                    }

                    @Override // X.InterfaceC2253521DIg
                    public final boolean LJII() {
                        return false;
                    }

                    @Override // X.InterfaceC2253521DIg
                    public final int LJIIIZ() {
                        return R.drawable.bsu;
                    }

                    @Override // X.InterfaceC2253521DIg
                    public final int[] LJIIJ() {
                        return null;
                    }

                    @Override // X.InterfaceC2253521DIg
                    public final VEDisplaySettings LJIIJJI() {
                        return null;
                    }

                    @Override // X.InterfaceC2253521DIg
                    public final boolean LJIIL() {
                        return false;
                    }

                    @Override // X.InterfaceC2253521DIg
                    public final VEDisplaySettings LJIILIIL(VESize vESize) {
                        return null;
                    }

                    @Override // X.InterfaceC2253521DIg
                    public final boolean LJIILJJIL() {
                        return false;
                    }

                    @Override // X.InterfaceC2253521DIg
                    public final boolean LJIILL() {
                        return false;
                    }

                    @Override // X.InterfaceC2253521DIg
                    public final int LJIILLIIL() {
                        return 10;
                    }

                    @Override // X.InterfaceC2253521DIg
                    public final int[] LJIIZILJ() {
                        return new int[0];
                    }

                    @Override // X.InterfaceC2253521DIg
                    public final boolean LJIJ() {
                        return false;
                    }

                    @Override // X.InterfaceC2253521DIg
                    public final int LJIJI() {
                        return 50;
                    }

                    @Override // X.InterfaceC2253521DIg
                    public final boolean LJIJJ() {
                        return false;
                    }

                    @Override // X.InterfaceC2253521DIg
                    public final int getFrontCameraStabilizationStrategy() {
                        return 0;
                    }

                    @Override // X.InterfaceC2253521DIg
                    public final int getRearCameraStabilizationStrategy() {
                        return 0;
                    }

                    @Override // X.InterfaceC2253521DIg
                    public final byte LJI() {
                        return EnumC2041407zA.AS_OPTION_FLAG_PICTURE_SIZE.getOption();
                    }

                    @Override // X.InterfaceC2253521DIg
                    public final int[] LJIIIIZZ() {
                        C1651100t4G.LIZ.getClass();
                        return C1448570nnb.LIZJ(EnumC1448590nnd.RATIO_9_16);
                    }

                    @Override // X.InterfaceC2253521DIg
                    public final C1D3N LIZ() {
                        return C1D3N.AS_CAMERA_LENS_FRONT;
                    }

                    @Override // X.InterfaceC2253521DIg
                    public final VECameraSettings.CAMERA_MODE_TYPE LIZJ() {
                        return VECameraSettings.CAMERA_MODE_TYPE.VIDEO_MODE;
                    }
                };

                @Override // X.C1DKV
                public final boolean LIZIZ() {
                    return false;
                }

                @Override // X.C1DKV
                public final boolean LIZJ() {
                    return false;
                }

                @Override // X.C1DKV
                public final boolean LIZLLL() {
                    return false;
                }

                @Override // X.C1DKV
                public final boolean LJI() {
                    return false;
                }

                @Override // X.C1DKV
                public final boolean LJII() {
                    return false;
                }

                @Override // X.C1DKV
                public final int LJIIIIZZ() {
                    return 5;
                }

                @Override // X.C1DKV
                public final boolean LJIIJJI() {
                    return false;
                }

                @Override // X.C1DKV
                public final boolean LJIIL() {
                    return false;
                }

                @Override // X.C1DKV
                public final boolean LJIILJJIL() {
                    return false;
                }

                @Override // X.C1DKV
                public final boolean LJIILL() {
                    return false;
                }

                @Override // X.C1DKV
                public final int LJIJ() {
                    return 0;
                }

                @Override // X.C1DKV
                public final boolean LJIJI() {
                    return false;
                }

                @Override // X.C1DKV
                public final boolean LJIJJ() {
                    return false;
                }

                @Override // X.C1DKV
                public final boolean LJIJJLI() {
                    return false;
                }

                @Override // X.C1DKV
                public final boolean LJIL() {
                    return false;
                }

                @Override // X.C1DKV
                public final boolean LJJ() {
                    return false;
                }

                @Override // X.C1DKV
                public final long LJJI() {
                    return 0L;
                }

                @Override // X.C1DKV
                public final boolean LJJIFFI() {
                    return false;
                }

                @Override // X.C1DKV
                public final boolean LJJII() {
                    return false;
                }

                @Override // X.C1DKV
                public final boolean LJJIIZI() {
                    return false;
                }

                @Override // X.C1DKV
                public final int getRotation() {
                    return 0;
                }

                @Override // X.C1DKV
                public final SurfaceHolder getSurfaceHolder() {
                    return null;
                }

                @Override // X.C1DKV
                public final boolean LIZ() {
                    C1651100t4G.LIZ.getClass();
                    return C290870Baf.LIZ();
                }

                @Override // X.C1DKV
                public final boolean LJ() {
                    C1651100t4G.LIZ.getClass();
                    return C0BNG.LIZ();
                }

                @Override // X.C1DKV
                public final Function0<List<C2185991Agv>> LJFF() {
                    return AFwS226S0000000_35.get$arr$(84);
                }

                @Override // X.C1DKV
                public final Function0<Boolean> LJIIIZ() {
                    return AFwS226S0000000_35.get$arr$(85);
                }

                @Override // X.C1DKV
                public final C1DMJ LJIIJ() {
                    return new C2208831Bcf();
                }

                @Override // X.C1DKV
                public final boolean LJIILIIL() {
                    C1651100t4G.LIZ.getClass();
                    return C1645510svF.LIZ();
                }

                @Override // X.C1DKV
                public final C1DKZ LJIILLIIL() {
                    return new C1DLY();
                }

                @Override // X.C1DKV
                public final InterfaceC2253801DJi LJJIII() {
                    return new C1DLZ();
                }

                @Override // X.C1DKV
                public final Function0<Boolean> LJJIIJ() {
                    return AFwS226S0000000_35.get$arr$(83);
                }

                @Override // X.C1DKV
                public final Function0<Boolean> LJJIIZ() {
                    return AFwS226S0000000_35.get$arr$(86);
                }

                @Override // X.C1DKV
                public final Pair<Integer, Integer> LJJIIJZLJL() {
                    return C2240051Clv.LIZ();
                }

                @Override // X.C1DKV
                public final InterfaceC2253521DIg LJIIZILJ() {
                    return this.LIZ;
                }
            };
        }
        return C1DKT.LIZ(c1dkv);
    }
}
