package X;

import Y.AfS114S0300000_22;
import Y.AkS483S0100000_22;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS566S0100000_22;

/* JADX INFO: renamed from: X.0npg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1449860npg implements InterfaceC1450730nr5 {
    public final Context LIZ;
    public final boolean LIZIZ;
    public final StickerItemModel LIZJ;
    public final Function0<InterfaceC1449880npi> LIZLLL;
    public float LJ;
    public float LJFF;
    public float LJI;
    public final float LJII;
    public String LJIIIIZZ;
    public C1441050nbT LJIIIZ;
    public Pair<Pair<Float, Float>, Pair<Float, Float>> LJIIJ;

    @Override // X.InterfaceC1450730nr5
    public final void LIZJ(float f) {
    }

    @Override // X.InterfaceC1450730nr5
    public final void LJFF() {
    }

    @Override // X.InterfaceC1450730nr5
    public final C11NZ<StickerItemModel> LJI() {
        C1441050nbT c1441050nbT = this.LJIIIZ;
        if (c1441050nbT != null) {
            return C11NZ.LJJJJZ(LJIIIIZZ(c1441050nbT));
        }
        InterfaceC1449880npi interfaceC1449880npiInvoke = this.LIZLLL.invoke();
        return interfaceC1449880npiInvoke == null ? C11NZ.LJJJJZ(LJIIIIZZ(this.LJIIIZ)) : C11NZ.LJIJJLI(new C1466900oHA(this.LIZ, this.LIZJ, interfaceC1449880npiInvoke.LIZ(), 1)).LJJJJZI(new AkS483S0100000_22(this, 7));
    }

    public final void LJIIIZ() {
        StickerItemModel stickerItemModel = this.LIZJ;
        stickerItemModel.uuid = this.LJIIIIZZ;
        stickerItemModel.currentOffsetX = this.LJ;
        stickerItemModel.currentOffsetY = this.LJFF;
        stickerItemModel.rotateAngle = this.LJI;
    }

    @Override // X.InterfaceC1450730nr5
    public final void LIZ(float f) {
        InterfaceC1449880npi interfaceC1449880npiInvoke = this.LIZLLL.invoke();
        if (interfaceC1449880npiInvoke == null) {
            return;
        }
        float f2 = f % 360.0f;
        if (f2 < 0.0f) {
            f2 += 360;
        }
        float f3 = 360.0f - f2;
        this.LJI = f3;
        InterfaceC1452170ntP interfaceC1452170ntPLLFII = interfaceC1449880npiInvoke.LLFII();
        String str = this.LJIIIIZZ;
        if (str != null) {
            C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(interfaceC1452170ntPLLFII);
            if (c348100DkmLIZIZ != null) {
                C348440DlK c348440DlKLJJIIJZLJL = c348100DkmLIZIZ.LJIIIZ().LJJIIJZLJL(str);
                if (c348440DlKLJJIIJZLJL != null) {
                    c348440DlKLJJIIJZLJL.LJII = f3;
                    C348100Dkm c348100DkmLIZIZ2 = C352130DrH.LIZIZ(interfaceC1452170ntPLLFII);
                    if (c348100DkmLIZIZ2 != null) {
                        c348100DkmLIZIZ2.LJIIIZ().LIZLLL(c348440DlKLJJIIJZLJL);
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        LJIIIZ();
    }

    @Override // X.InterfaceC1450730nr5
    public final void LIZIZ(Pair<Pair<Float, Float>, Pair<Float, Float>> pair) {
        InterfaceC1449880npi interfaceC1449880npiInvoke;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CanvasEmbeddedSticker->");
        sbLIZ.append("onDirectorRectBoundUpdate");
        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        this.LJIIJ = pair;
        C1441050nbT c1441050nbT = this.LJIIIZ;
        if (c1441050nbT == null || (interfaceC1449880npiInvoke = this.LIZLLL.invoke()) == null) {
            return;
        }
        LJII(c1441050nbT, interfaceC1449880npiInvoke.LIZIZ());
        InterfaceC1452170ntP interfaceC1452170ntPLLFII = interfaceC1449880npiInvoke.LLFII();
        String str = this.LJIIIIZZ;
        if (str != null) {
            C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(interfaceC1452170ntPLLFII);
            if (c348100DkmLIZIZ != null) {
                C348440DlK c348440DlKLJJIIJZLJL = c348100DkmLIZIZ.LJIIIZ().LJJIIJZLJL(str);
                if (c348440DlKLJJIIJZLJL != null) {
                    c348440DlKLJJIIJZLJL.LJFF = this.LJ;
                    c348440DlKLJJIIJZLJL.LJI = this.LJFF;
                    C348100Dkm c348100DkmLIZIZ2 = C352130DrH.LIZIZ(interfaceC1452170ntPLLFII);
                    if (c348100DkmLIZIZ2 != null) {
                        c348100DkmLIZIZ2.LJIIIZ().LIZLLL(c348440DlKLJJIIJZLJL);
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        LJIIIZ();
    }

    @Override // X.InterfaceC1450730nr5
    public final void LJ(AwS566S0100000_22 awS566S0100000_22) {
        InterfaceC1449880npi interfaceC1449880npiInvoke = this.LIZLLL.invoke();
        if (interfaceC1449880npiInvoke != null) {
            C11NZ.LJIJJLI(new C1466900oHA(this.LIZ, this.LIZJ, interfaceC1449880npiInvoke.LIZ(), 1)).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS114S0300000_22(this, interfaceC1449880npiInvoke, awS566S0100000_22, 4), C19487811Me.LIZLLL);
        }
    }

    public final StickerItemModel LJIIIIZZ(C1441050nbT c1441050nbT) {
        StickerItemModel stickerItemModel = this.LIZJ;
        if (c1441050nbT != null) {
            stickerItemModel.path = c1441050nbT.LIZ;
            InterfaceC1449880npi interfaceC1449880npiInvoke = this.LIZLLL.invoke();
            if (interfaceC1449880npiInvoke != null) {
                stickerItemModel.endTime = interfaceC1449880npiInvoke.LLFII().getDuration();
                stickerItemModel.normalizedWidth = c1441050nbT.LIZIZ / interfaceC1449880npiInvoke.LIZIZ().getFirst().floatValue();
                stickerItemModel.normalizedHeight = c1441050nbT.LIZJ / interfaceC1449880npiInvoke.LIZIZ().getSecond().floatValue();
            }
        }
        return stickerItemModel;
    }

    @Override // X.InterfaceC1450730nr5
    public final void LIZLLL(float f, float f2) {
        InterfaceC1449880npi interfaceC1449880npiInvoke = this.LIZLLL.invoke();
        if (interfaceC1449880npiInvoke == null) {
            return;
        }
        Pair<Float, Float> pairLIZIZ = interfaceC1449880npiInvoke.LIZIZ();
        this.LJ += f / pairLIZIZ.getFirst().floatValue();
        this.LJFF += f2 / pairLIZIZ.getSecond().floatValue();
        InterfaceC1452170ntP interfaceC1452170ntPLLFII = interfaceC1449880npiInvoke.LLFII();
        String str = this.LJIIIIZZ;
        if (str != null) {
            C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(interfaceC1452170ntPLLFII);
            if (c348100DkmLIZIZ != null) {
                C348440DlK c348440DlKLJJIIJZLJL = c348100DkmLIZIZ.LJIIIZ().LJJIIJZLJL(str);
                if (c348440DlKLJJIIJZLJL != null) {
                    c348440DlKLJJIIJZLJL.LJFF = this.LJ;
                    c348440DlKLJJIIJZLJL.LJI = this.LJFF;
                    C348100Dkm c348100DkmLIZIZ2 = C352130DrH.LIZIZ(interfaceC1452170ntPLLFII);
                    if (c348100DkmLIZIZ2 != null) {
                        c348100DkmLIZIZ2.LJIIIZ().LIZLLL(c348440DlKLJJIIJZLJL);
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        LJIIIZ();
    }

    public final void LJII(C1441050nbT c1441050nbT, Pair<Float, Float> pair) {
        Pair<Pair<Float, Float>, Pair<Float, Float>> pair2 = this.LJIIJ;
        if (pair2 != null) {
            float f = this.LJII;
            float f2 = -this.LJI;
            Pair<Float, Float> first = pair2.getFirst();
            float fFloatValue = first.getFirst().floatValue();
            float fFloatValue2 = (first.getSecond().floatValue() - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(7))) - ((c1441050nbT.LIZJ * f) / 2.0f);
            float[] fArr = new float[2];
            RectF rectF = new RectF(pair2.getFirst().getFirst().floatValue(), pair2.getFirst().getSecond().floatValue(), pair2.getSecond().getFirst().floatValue(), pair2.getSecond().getSecond().floatValue());
            Matrix matrix = new Matrix();
            matrix.postRotate(f2, rectF.centerX(), rectF.centerY());
            matrix.mapPoints(fArr, new float[]{fFloatValue + ((c1441050nbT.LIZIZ * f) / 2.0f), fFloatValue2});
            Pair pair3 = new Pair(Float.valueOf(fArr[0] / pair.getFirst().floatValue()), Float.valueOf(fArr[1] / pair.getSecond().floatValue()));
            float fFloatValue3 = ((Number) pair3.getFirst()).floatValue();
            float fFloatValue4 = ((Number) pair3.getSecond()).floatValue();
            StickerItemModel stickerItemModel = this.LIZJ;
            stickerItemModel.currentOffsetX = fFloatValue3;
            stickerItemModel.currentOffsetY = fFloatValue4;
        }
        StickerItemModel stickerItemModel2 = this.LIZJ;
        this.LJ = stickerItemModel2.currentOffsetX;
        this.LJFF = stickerItemModel2.currentOffsetY;
    }

    public C1449860npg(Context context, boolean z, StickerItemModel stickerItemModel, AwS566S0100000_22 awS566S0100000_22) {
        this.LIZ = context;
        this.LIZIZ = z;
        this.LIZJ = stickerItemModel;
        this.LIZLLL = awS566S0100000_22;
        this.LJ = stickerItemModel.currentOffsetX;
        this.LJFF = stickerItemModel.currentOffsetY;
        this.LJI = stickerItemModel.rotateAngle;
        this.LJII = stickerItemModel.scale;
        this.LJIIIIZZ = stickerItemModel.uuid;
    }
}
