package X;

import Y.AfS114S0300000_22;
import Y.AkS483S0100000_22;
import android.content.Context;
import android.view.Choreographer;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AwS566S0100000_22;

/* JADX INFO: renamed from: X.0nph, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1449870nph implements InterfaceC1450730nr5 {
    public static final /* synthetic */ int LJIIZILJ = 0;
    public final Context LIZ;
    public final boolean LIZIZ;
    public final StickerItemModel LIZJ;
    public final int LIZLLL;
    public final boolean LJ;
    public final Function0<InterfaceC1449880npi> LJFF;
    public float LJI;
    public float LJII;
    public float LJIIJ;
    public String LJIIJJI;
    public C1447650nm7 LJIIL;
    public Pair<Pair<Float, Float>, Pair<Float, Float>> LJIILIIL;
    public boolean LJIILL;
    public float LJIIIIZZ = 1.0f;
    public float LJIIIZ = -1.0f;
    public final C01GW LJIILJJIL = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(464));
    public final ChoreographerFrameCallbackC1466710oGr LJIILLIIL = new ChoreographerFrameCallbackC1466710oGr(this, 1);

    @Override // X.InterfaceC1450730nr5
    public final void LIZ(float f) {
    }

    @Override // X.InterfaceC1450730nr5
    public final void LJFF() {
        if (this.LJIILL) {
            ((Choreographer) this.LJIILJJIL.getValue()).removeFrameCallback(this.LJIILLIIL);
            this.LJIILL = false;
            LJIIIIZZ();
        }
    }

    @Override // X.InterfaceC1450730nr5
    public final C11NZ<StickerItemModel> LJI() {
        C1447650nm7 c1447650nm7 = this.LJIIL;
        if (c1447650nm7 != null) {
            return C11NZ.LJJJJZ(LJIIIZ(c1447650nm7));
        }
        InterfaceC1449880npi interfaceC1449880npiInvoke = this.LJFF.invoke();
        if (interfaceC1449880npiInvoke == null) {
            return C11NZ.LJJJJZ(LJIIIZ(this.LJIIL));
        }
        return C11NZ.LJIJJLI(new C1447640nm6(this.LIZLLL, this.LIZ, this.LIZJ, interfaceC1449880npiInvoke.LIZ())).LJJJJZI(new AkS483S0100000_22(this, 8));
    }

    public final void LJIIIIZZ() {
        C348100Dkm c348100DkmLIZIZ;
        String str;
        C348440DlK c348440DlKLJJIIJZLJL;
        InterfaceC1449880npi interfaceC1449880npiInvoke = this.LJFF.invoke();
        if (interfaceC1449880npiInvoke == null || (c348100DkmLIZIZ = C352130DrH.LIZIZ(interfaceC1449880npiInvoke.LLFII())) == null || (str = this.LJIIJJI) == null || (c348440DlKLJJIIJZLJL = c348100DkmLIZIZ.LJIIIZ().LJJIIJZLJL(str)) == null) {
            return;
        }
        c348100DkmLIZIZ.LJIIIZ().LIZLLL(c348440DlKLJJIIJZLJL);
        C1450640nqw.LLLF.getClass();
        if (C1450640nqw.LLLFZ) {
            C1450640nqw.LLLI++;
        }
    }

    public final void LJIIJJI() {
        if (!this.LJ) {
            LJIIIIZZ();
        } else {
            if (this.LJIILL) {
                return;
            }
            this.LJIILL = true;
            ((Choreographer) this.LJIILJJIL.getValue()).postFrameCallback(this.LJIILLIIL);
        }
    }

    public final void LJIIL() {
        StickerItemModel stickerItemModel = this.LIZJ;
        stickerItemModel.uuid = this.LJIIJJI;
        stickerItemModel.currentOffsetX = this.LJI;
        stickerItemModel.currentOffsetY = this.LJII;
        stickerItemModel.scale = this.LJIIJ;
    }

    public static final void LJIIJ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CanvasEmbeddedSticker->");
        sbLIZ.append(str);
        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC1450730nr5
    public final void LIZIZ(Pair<Pair<Float, Float>, Pair<Float, Float>> pair) {
        InterfaceC1449880npi interfaceC1449880npiInvoke;
        LJIIJ("onDirectorRectBoundUpdate");
        this.LJIILIIL = pair;
        C1447650nm7 c1447650nm7 = this.LJIIL;
        if (c1447650nm7 == null || (interfaceC1449880npiInvoke = this.LJFF.invoke()) == null) {
            return;
        }
        LJII(c1447650nm7, interfaceC1449880npiInvoke.LIZIZ());
        InterfaceC1452170ntP interfaceC1452170ntPLLFII = interfaceC1449880npiInvoke.LLFII();
        String str = this.LJIIJJI;
        if (str != null) {
            C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(interfaceC1452170ntPLLFII);
            if (c348100DkmLIZIZ != null) {
                C348440DlK c348440DlKLJJIIJZLJL = c348100DkmLIZIZ.LJIIIZ().LJJIIJZLJL(str);
                if (c348440DlKLJJIIJZLJL != null) {
                    c348440DlKLJJIIJZLJL.LJFF = this.LJI;
                    c348440DlKLJJIIJZLJL.LJI = this.LJII;
                    LJIIJJI();
                }
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        LJIIL();
    }

    @Override // X.InterfaceC1450730nr5
    public final void LIZJ(float f) {
        if (this.LJIIIZ < 0.0f) {
            this.LJIIIZ = f;
        }
        float f2 = f / this.LJIIIZ;
        this.LJIIIIZZ = f2;
        this.LJIIJ *= f2;
        this.LJIIIZ = f;
        InterfaceC1449880npi interfaceC1449880npiInvoke = this.LJFF.invoke();
        if (interfaceC1449880npiInvoke == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onDirectorScale,scale:");
        sbLIZ.append(f);
        sbLIZ.append(",currentScaleFactor:");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(".index:");
        sbLIZ.append(-1);
        sbLIZ.append(",uuid:");
        sbLIZ.append(this.LJIIJJI);
        LJIIJ(C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC1452170ntP interfaceC1452170ntPLLFII = interfaceC1449880npiInvoke.LLFII();
        String str = this.LJIIJJI;
        if (str != null) {
            C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(interfaceC1452170ntPLLFII);
            if (c348100DkmLIZIZ != null) {
                C348440DlK c348440DlKLJJIIJZLJL = c348100DkmLIZIZ.LJIIIZ().LJJIIJZLJL(str);
                if (c348440DlKLJJIIJZLJL != null) {
                    c348440DlKLJJIIJZLJL.LJIIJ = this.LJIIJ;
                    LJIIJJI();
                }
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        if (this.LJI != -1.0f) {
            LJIIL();
        }
    }

    @Override // X.InterfaceC1450730nr5
    public final void LJ(AwS566S0100000_22 awS566S0100000_22) {
        InterfaceC1449880npi interfaceC1449880npiInvoke = this.LJFF.invoke();
        if (interfaceC1449880npiInvoke != null) {
            C11NZ.LJIJJLI(new C1447640nm6(this.LIZLLL, this.LIZ, this.LIZJ, interfaceC1449880npiInvoke.LIZ())).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS114S0300000_22(this, interfaceC1449880npiInvoke, awS566S0100000_22, 5), C19487811Me.LIZLLL);
        }
    }

    public final StickerItemModel LJIIIZ(C1447650nm7 c1447650nm7) {
        StickerItemModel stickerItemModel = this.LIZJ;
        if (c1447650nm7 != null) {
            stickerItemModel.path = c1447650nm7.LIZ;
            InterfaceC1449880npi interfaceC1449880npiInvoke = this.LJFF.invoke();
            if (interfaceC1449880npiInvoke != null) {
                stickerItemModel.endTime = interfaceC1449880npiInvoke.LLFII().getDuration();
                stickerItemModel.normalizedWidth = c1447650nm7.LIZIZ / interfaceC1449880npiInvoke.LIZIZ().getFirst().floatValue();
                stickerItemModel.normalizedHeight = c1447650nm7.LIZJ / interfaceC1449880npiInvoke.LIZIZ().getSecond().floatValue();
            }
        }
        return stickerItemModel;
    }

    @Override // X.InterfaceC1450730nr5
    public final void LIZLLL(float f, float f2) {
        InterfaceC1449880npi interfaceC1449880npiInvoke = this.LJFF.invoke();
        if (interfaceC1449880npiInvoke == null) {
            return;
        }
        Pair<Float, Float> pairLIZIZ = interfaceC1449880npiInvoke.LIZIZ();
        this.LJI += f / pairLIZIZ.getFirst().floatValue();
        this.LJII += f2 / pairLIZIZ.getSecond().floatValue();
        InterfaceC1452170ntP interfaceC1452170ntPLLFII = interfaceC1449880npiInvoke.LLFII();
        String str = this.LJIIJJI;
        if (str != null) {
            C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(interfaceC1452170ntPLLFII);
            if (c348100DkmLIZIZ != null) {
                C348440DlK c348440DlKLJJIIJZLJL = c348100DkmLIZIZ.LJIIIZ().LJJIIJZLJL(str);
                if (c348440DlKLJJIIJZLJL != null) {
                    c348440DlKLJJIIJZLJL.LJFF = this.LJI;
                    c348440DlKLJJIIJZLJL.LJI = this.LJII;
                    LJIIJJI();
                }
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        LJIIL();
    }

    public final void LJII(C1447650nm7 c1447650nm7, Pair<Float, Float> pair) {
        float f;
        float f2;
        float fFloatValue;
        Pair<Pair<Float, Float>, Pair<Float, Float>> pair2 = this.LJIILIIL;
        if (pair2 != null) {
            float f3 = this.LJIIJ;
            int i = this.LIZLLL;
            float f4 = this.LIZJ.photoModeShareToStoryRatio;
            Pair<Float, Float> first = pair2.getFirst();
            float fFloatValue2 = first.getFirst().floatValue();
            float fFloatValue3 = first.getSecond().floatValue();
            Pair<Float, Float> second = pair2.getSecond();
            float fFloatValue4 = second.getFirst().floatValue();
            float fFloatValue5 = second.getSecond().floatValue();
            float f5 = c1447650nm7.LIZJ * f3;
            float f6 = (c1447650nm7.LIZIZ * f3) / 2.0f;
            if (c1447650nm7.LIZLLL) {
                f = fFloatValue4 - f6;
            } else {
                f = fFloatValue2 + f6;
            }
            float fFloatValue6 = f / pair.getFirst().floatValue();
            if (f4 != -1.0f) {
                float f7 = fFloatValue5 - fFloatValue3;
                if (f4 > 1.0f) {
                    f4 = 1.0f;
                }
                float f8 = f7 / 2;
                fFloatValue5 = f8 + (f4 * f8) + fFloatValue3;
            }
            if (i == 0) {
                f2 = fFloatValue5 - (f5 / 2.0f);
                fFloatValue = pair.getSecond().floatValue();
            } else {
                f2 = fFloatValue5 + (f5 / 2.0f);
                fFloatValue = pair.getSecond().floatValue();
            }
            Pair pair3 = new Pair(Float.valueOf(fFloatValue6), Float.valueOf(f2 / fFloatValue));
            float fFloatValue7 = ((Number) pair3.getFirst()).floatValue();
            float fFloatValue8 = ((Number) pair3.getSecond()).floatValue();
            StickerItemModel stickerItemModel = this.LIZJ;
            stickerItemModel.currentOffsetX = fFloatValue7;
            stickerItemModel.currentOffsetY = fFloatValue8;
        }
        StickerItemModel stickerItemModel2 = this.LIZJ;
        this.LJI = stickerItemModel2.currentOffsetX;
        this.LJII = stickerItemModel2.currentOffsetY;
    }

    public C1449870nph(Context context, boolean z, StickerItemModel stickerItemModel, int i, boolean z2, AwS566S0100000_22 awS566S0100000_22) {
        this.LIZ = context;
        this.LIZIZ = z;
        this.LIZJ = stickerItemModel;
        this.LIZLLL = i;
        this.LJ = z2;
        this.LJFF = awS566S0100000_22;
        this.LJI = stickerItemModel.currentOffsetX;
        this.LJII = stickerItemModel.currentOffsetY;
        this.LJIIJ = stickerItemModel.scale;
        this.LJIIJJI = stickerItemModel.uuid;
    }
}
