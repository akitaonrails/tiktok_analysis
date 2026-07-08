package X;

import android.content.Context;
import android.opengl.GLES20;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource;
import com.ss.android.ugc.aweme.live.alphaplayer.model.MaskSrc;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.1Cxe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2247321Cxe {
    public final Context LIZ;
    public final boolean LIZIZ;
    public FloatBuffer LJFF;
    public FloatBuffer LJI;
    public FloatBuffer LJII;
    public final List<MaskSrc> LJIIZILJ;
    public C2247351Cxh LJIJI;
    public final InterfaceC2247471Cxt LJIJJ;
    public final float[] LIZJ = new float[8];
    public final float[] LIZLLL = new float[8];
    public final float[] LJ = new float[8];
    public final C2247381Cxk LJIIIIZZ = new C2247381Cxk();
    public int LJIIIZ = 0;
    public int LJIIJ = 0;
    public int LJIIJJI = 0;
    public int LJIIL = 0;
    public int LJIILIIL = 0;
    public int LJIILJJIL = 0;
    public final Map<String, MaskSrc> LJIILL = new HashMap();
    public final Map<String, Integer> LJIILLIIL = new HashMap();
    public final Map<String, C2247381Cxk> LJIJ = new HashMap();

    public final void LIZIZ() {
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(this.LIZJ.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        floatBufferAsFloatBuffer.put(this.LIZJ);
        this.LJFF = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.position(0);
        FloatBuffer floatBufferAsFloatBuffer2 = ByteBuffer.allocateDirect(this.LIZLLL.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        floatBufferAsFloatBuffer2.put(this.LIZLLL);
        this.LJI = floatBufferAsFloatBuffer2;
        floatBufferAsFloatBuffer2.position(0);
        FloatBuffer floatBufferAsFloatBuffer3 = ByteBuffer.allocateDirect(this.LJ.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        floatBufferAsFloatBuffer3.put(this.LJ);
        this.LJII = floatBufferAsFloatBuffer3;
        floatBufferAsFloatBuffer3.position(0);
        int iLIZIZ = C1287350jbZ.LIZIZ(C1287350jbZ.LIZJ(this.LIZ.getResources(), "mask/mask_vertex.sh"), C1287350jbZ.LIZJ(this.LIZ.getResources(), "mask/mask_frag.sh"));
        this.LJIIIZ = iLIZIZ;
        if (iLIZIZ != 0) {
            this.LJIIJ = GLES20.glGetAttribLocation(iLIZIZ, "aPosition");
            C1287350jbZ.LIZ();
            if (this.LJIIJ == -1) {
                throw new RuntimeException("Could not get attrib location for aPosition");
            }
            this.LJIIJJI = GLES20.glGetAttribLocation(this.LJIIIZ, "aTextureCoord");
            C1287350jbZ.LIZ();
            if (this.LJIIJJI == -1) {
                throw new RuntimeException("Could not get attrib location for aTextureCoord");
            }
            this.LJIIL = GLES20.glGetAttribLocation(this.LJIIIZ, "aMaskTextureCoord");
            C1287350jbZ.LIZ();
            if (this.LJIIL == -1) {
                throw new RuntimeException("Could not get attrib location for aMaskTextureCoord");
            }
            this.LJIILIIL = GLES20.glGetUniformLocation(this.LJIIIZ, "sTexture");
            C1287350jbZ.LIZ();
            if (this.LJIILIIL == -1) {
                throw new RuntimeException("Could not get attrib location for sTexture");
            }
            this.LJIILJJIL = GLES20.glGetUniformLocation(this.LJIIIZ, "sMaskTexture");
            C1287350jbZ.LIZ();
            if (this.LJIILJJIL == -1) {
                throw new RuntimeException("Could not get attrib location for sMaskTexture");
            }
        }
        List<MaskSrc> list = this.LJIIZILJ;
        if (list == null || ((ArrayList) list).isEmpty()) {
            return;
        }
        ((HashMap) this.LJIILLIIL).clear();
        ((HashMap) this.LJIILL).clear();
        for (int i = 0; i < ((ArrayList) this.LJIIZILJ).size(); i++) {
            MaskSrc maskSrc = (MaskSrc) ListProtector.get(this.LJIIZILJ, i);
            ((HashMap) this.LJIILL).put(maskSrc.getName(), maskSrc);
            ((HashMap) this.LJIILLIIL).put(maskSrc.getName(), Integer.valueOf(C1271240jBa.LIZ(maskSrc.getBitmap())));
        }
    }

    public final void LIZJ() {
        Iterator it2 = ((HashMap) this.LJIILLIIL).entrySet().iterator();
        while (it2.hasNext()) {
            int iIntValue = ((Integer) ((Map.Entry) it2.next()).getValue()).intValue();
            if (iIntValue != 0) {
                GLES20.glDeleteTextures(1, new int[]{iIntValue}, 0);
            }
        }
        Iterator it3 = ((HashMap) this.LJIILL).entrySet().iterator();
        while (it3.hasNext()) {
            ((MaskSrc) ((Map.Entry) it3.next()).getValue()).getBitmap();
        }
        ((HashMap) this.LJIILL).clear();
        ((HashMap) this.LJIILLIIL).clear();
        ((ArrayList) this.LJIIZILJ).clear();
    }

    public C2247321Cxe(Context context, List<MaskSrc> list, InterfaceC2247471Cxt interfaceC2247471Cxt) {
        this.LIZ = context;
        this.LJIIZILJ = new ArrayList(list);
        this.LJIJJ = interfaceC2247471Cxt;
        this.LIZIZ = C726770Sf5.LIZ(context);
    }

    public final void LIZ(int i, int i2, int i3, int i4, int i5, C2247401Cxm c2247401Cxm, String str, DataSource.Element element, C2246591CwT c2246591CwT) {
        C2246581CwS c2246581CwS;
        C2247451Cxr c2247451Cxr;
        C2246581CwS c2246581CwS2;
        float width;
        float height;
        int i6;
        float fMin;
        float fMin2;
        if (!element.isValid()) {
            return;
        }
        MaskSrc maskSrc = (MaskSrc) ((HashMap) this.LJIILL).get(str);
        if (maskSrc == null) {
            int[] iArr = element.renderFrame;
            LIZLLL(str, element, null, null, i4, i5, iArr[2], iArr[3], c2247401Cxm);
            return;
        }
        if (c2246591CwT == null) {
            c2246581CwS = null;
        } else {
            c2246581CwS = c2246591CwT.LJIIIIZZ;
        }
        if (c2246581CwS != null) {
            int[] iArr2 = {i4, i5};
            int[] iArr3 = {i2, i3};
            C2246601CwU c2246601CwU = c2246581CwS.LJ;
            C2247381Cxk c2247381Cxk = c2246581CwS.LIZJ;
            C2247381Cxk c2247381Cxk2 = c2246581CwS.LIZLLL;
            C2246601CwU c2246601CwU2 = c2246581CwS.LJFF;
            int[] iArr4 = c2246581CwS.LJIIJ;
            int[] iArr5 = element.renderFrame;
            int i7 = iArr5[0];
            int i8 = c2246601CwU.LIZ;
            int i9 = i7 - i8;
            int i10 = iArr5[1];
            int i11 = c2246601CwU.LIZJ;
            int i12 = i10 - i11;
            int i13 = iArr5[2] + c2246601CwU.LIZIZ + i8;
            int i14 = iArr5[3] + i11 + c2246601CwU.LIZLLL;
            if (c2246581CwS.LIZ != 2) {
                this.LJIIIIZZ.LIZLLL(iArr2[0], iArr2[1], new int[]{i9, i12, i13, i14});
                C2247371Cxj.LIZ(this.LJIIIIZZ, c2247401Cxm);
                C2247371Cxj.LIZIZ(this.LJIIIIZZ);
                C2247361Cxi c2247361CxiLIZ = C2247441Cxq.LIZ(this.LJIIIIZZ, true);
                if (this.LIZIZ) {
                    if (c2246581CwS.LJIIIZ) {
                        float f = c2247361CxiLIZ.LIZ;
                        c2247361CxiLIZ = c2247361CxiLIZ.LJI(((f + f) + c2247361CxiLIZ.LIZJ) / 2.0f);
                    }
                    if (c2246581CwS.LJIIIIZZ) {
                        C2247361Cxi c2247361CxiLJI = c2247361CxiLIZ.LJI(0.0f);
                        float f2 = c2247361CxiLJI.LIZ;
                        c2247361CxiLIZ = c2247361CxiLJI.LJI(((f2 + f2) + c2247361CxiLJI.LIZJ) / 2.0f);
                    }
                }
                this.LJIJI.LIZ(c2247361CxiLIZ, C2247441Cxq.LIZ(c2247381Cxk, false).LJ(iArr3[0], iArr3[1]), C2247441Cxq.LIZ(c2247381Cxk2, false).LJ(iArr3[0], iArr3[1]));
            } else if (c2246601CwU2 != null && iArr4 != null && iArr4.length == 2) {
                float f3 = i9;
                float f4 = i12;
                float f5 = i13;
                float f6 = i14;
                C2247361Cxi c2247361Cxi = new C2247361Cxi(f3, f4, f5, f6);
                int i15 = c2246601CwU2.LIZ;
                float f7 = i9 + i15;
                int i16 = c2246601CwU2.LIZJ;
                float f8 = i12 + i16;
                float f9 = (i13 - i15) - c2246601CwU2.LIZIZ;
                float f10 = (i14 - i16) - c2246601CwU2.LIZLLL;
                if (c2246581CwS.LJI) {
                    width = 1.0f;
                } else {
                    width = ((maskSrc.getWidth() - element.renderFrame[2]) / f9) + 1.0f;
                }
                if (c2246581CwS.LJII) {
                    i6 = 2;
                    height = 1.0f;
                } else {
                    height = ((maskSrc.getHeight() - element.renderFrame[3]) / f10) + 1.0f;
                    i6 = 2;
                }
                float[] fArr = new float[i6];
                int i17 = iArr4[0];
                int[] iArr6 = element.renderFrame;
                fArr[0] = i17 + iArr6[0];
                fArr[1] = iArr4[1] + iArr6[1];
                C2247361Cxi c2247361CxiLIZ2 = C2247441Cxq.LIZ(c2247381Cxk, false);
                C2247361Cxi c2247361CxiLIZ3 = C2247441Cxq.LIZ(c2247381Cxk2, false);
                Float[][] fArr2 = {new Float[]{Float.valueOf((f7 - f3) / f5), Float.valueOf(f9 / f5), Float.valueOf(((f3 + f5) - (f7 + f9)) / f5)}, new Float[]{Float.valueOf((f8 - f4) / f6), Float.valueOf(f10 / f6), Float.valueOf(((f4 + f6) - (f8 + f10)) / f6)}};
                float f11 = 1;
                float f12 = f11 - width;
                float f13 = f9 * f12;
                float f14 = f11 - height;
                float f15 = f10 * f14;
                float f16 = fArr[0];
                if (f16 <= f7) {
                    fMin = 0.0f;
                } else {
                    fMin = Math.min(f9, f16 - f7) * f12;
                }
                float f18 = fArr[1];
                if (f18 <= f8) {
                    fMin2 = 0.0f;
                } else {
                    fMin2 = Math.min(f10, f18 - f8) * f14;
                }
                float f19 = -f15;
                float f20 = -f13;
                C2247431Cxp[] c2247431CxpArr = {new C2247431Cxp(c2247361Cxi, c2247361CxiLIZ2, c2247361CxiLIZ3).LIZ(0.0f, fArr2[0][1].floatValue() + fArr2[0][2].floatValue(), 0.0f, fArr2[1][1].floatValue() + fArr2[1][2].floatValue()), new C2247431Cxp(c2247361Cxi, c2247361CxiLIZ2, c2247361CxiLIZ3).LIZ(0.0f, fArr2[0][1].floatValue() + fArr2[0][2].floatValue(), fArr2[1][0].floatValue(), fArr2[1][2].floatValue()).LIZJ(1.0f, height), new C2247431Cxp(c2247361Cxi, c2247361CxiLIZ2, c2247361CxiLIZ3).LIZ(0.0f, fArr2[0][1].floatValue() + fArr2[0][2].floatValue(), fArr2[1][0].floatValue() + fArr2[1][1].floatValue(), 0.0f).LIZIZ(0.0f, f19), new C2247431Cxp(c2247361Cxi, c2247361CxiLIZ2, c2247361CxiLIZ3).LIZ(fArr2[0][0].floatValue(), fArr2[0][2].floatValue(), 0.0f, fArr2[1][1].floatValue() + fArr2[1][2].floatValue()).LIZJ(width, 1.0f), new C2247431Cxp(c2247361Cxi, c2247361CxiLIZ2, c2247361CxiLIZ3).LIZ(fArr2[0][0].floatValue(), fArr2[0][2].floatValue(), fArr2[1][0].floatValue(), fArr2[1][2].floatValue()).LIZJ(width, height), new C2247431Cxp(c2247361Cxi, c2247361CxiLIZ2, c2247361CxiLIZ3).LIZ(fArr2[0][0].floatValue(), fArr2[0][2].floatValue(), fArr2[1][0].floatValue() + fArr2[1][1].floatValue(), 0.0f).LIZJ(width, 1.0f).LIZIZ(0.0f, f19), new C2247431Cxp(c2247361Cxi, c2247361CxiLIZ2, c2247361CxiLIZ3).LIZ(fArr2[0][0].floatValue() + fArr2[0][1].floatValue(), 0.0f, 0.0f, fArr2[1][1].floatValue() + fArr2[1][2].floatValue()).LIZIZ(f20, 0.0f), new C2247431Cxp(c2247361Cxi, c2247361CxiLIZ2, c2247361CxiLIZ3).LIZ(fArr2[0][0].floatValue() + fArr2[0][1].floatValue(), 0.0f, fArr2[1][0].floatValue(), fArr2[1][2].floatValue()).LIZJ(1.0f, height).LIZIZ(f20, 0.0f), new C2247431Cxp(c2247361Cxi, c2247361CxiLIZ2, c2247361CxiLIZ3).LIZ(fArr2[0][0].floatValue() + fArr2[0][1].floatValue(), 0.0f, fArr2[1][0].floatValue() + fArr2[1][1].floatValue(), 0.0f).LIZIZ(f20, f19)};
                ArrayList<C2247431Cxp> arrayList = new ArrayList(9);
                int i18 = 0;
                do {
                    arrayList.add(c2247431CxpArr[i18].LIZIZ(fMin, fMin2));
                    i18++;
                } while (i18 < 9);
                c2247451Cxr = new C2247451Cxr(arrayList, new Pair(Float.valueOf(fMin), Float.valueOf(fMin2)), new C2247431Cxp(c2247361Cxi, c2247361CxiLIZ2, c2247361CxiLIZ3).LIZ(fArr2[0][0].floatValue(), fArr2[0][2].floatValue(), fArr2[1][0].floatValue(), fArr2[1][2].floatValue()).LIZ);
                ArrayList<C2247431Cxp> arrayList2 = new ArrayList();
                for (C2247431Cxp c2247431Cxp : arrayList) {
                    C2247361Cxi c2247361CxiLJ = c2247431Cxp.LIZ.LJ(iArr2[0], iArr2[1]);
                    float f21 = c2247361CxiLJ.LIZ;
                    float f22 = c2247361CxiLJ.LIZIZ;
                    C2247381Cxk c2247381Cxk3 = new C2247381Cxk(f21, f22, c2247361CxiLJ.LIZJ + f21, c2247361CxiLJ.LIZLLL + f22);
                    C2247371Cxj.LIZ(c2247381Cxk3, c2247401Cxm);
                    C2247371Cxj.LIZIZ(c2247381Cxk3);
                    arrayList2.add(new C2247431Cxp(C2247441Cxq.LIZ(c2247381Cxk3, true), c2247431Cxp.LIZIZ.LJ(iArr3[0], iArr3[1]), c2247431Cxp.LIZJ.LJ(iArr3[0], iArr3[1])));
                }
                C2247361Cxi c2247361Cxi2 = ((C2247431Cxp) ListProtector.get(arrayList2, 4)).LIZ;
                C2247361Cxi c2247361CxiLJ2 = c2247451Cxr.LIZJ.LJ(iArr2[0], iArr2[1]);
                float f23 = c2247361CxiLJ2.LIZ;
                float f24 = c2247361CxiLJ2.LIZIZ;
                C2247381Cxk c2247381Cxk4 = new C2247381Cxk(f23, f24, c2247361CxiLJ2.LIZJ + f23, c2247361CxiLJ2.LIZLLL + f24);
                C2247371Cxj.LIZ(c2247381Cxk4, c2247401Cxm);
                C2247371Cxj.LIZIZ(c2247381Cxk4);
                C2247361Cxi c2247361CxiLIZ4 = C2247441Cxq.LIZ(c2247381Cxk4, true);
                this.LJIJJ.LIZIZ(str, new float[]{((c2247361Cxi2.LIZ + c2247361Cxi2.LIZJ) - c2247361CxiLIZ4.LIZ) - c2247361CxiLIZ4.LIZJ, ((c2247361Cxi2.LIZIZ + c2247361Cxi2.LIZLLL) - c2247361CxiLIZ4.LIZIZ) - c2247361CxiLIZ4.LIZLLL});
                if (this.LIZIZ) {
                    if (c2246581CwS.LJIIIZ) {
                        float f25 = ((((C2247431Cxp) ListProtector.get(arrayList2, 0)).LIZ.LIZ + ((C2247431Cxp) ListProtector.get(arrayList2, 8)).LIZ.LIZ) + ((C2247431Cxp) ListProtector.get(arrayList2, 8)).LIZ.LIZJ) / 2.0f;
                        for (C2247431Cxp c2247431Cxp2 : arrayList2) {
                            c2247431Cxp2.LIZ = c2247431Cxp2.LIZ.LJI(f25);
                        }
                    }
                    if (c2246581CwS.LJIIIIZZ) {
                        for (C2247431Cxp c2247431Cxp3 : arrayList2) {
                            c2247431Cxp3.LIZ = c2247431Cxp3.LIZ.LJI(0.0f);
                        }
                        float f26 = ((((C2247431Cxp) ListProtector.get(arrayList2, 0)).LIZ.LIZ + ((C2247431Cxp) ListProtector.get(arrayList2, 8)).LIZ.LIZ) + ((C2247431Cxp) ListProtector.get(arrayList2, 8)).LIZ.LIZJ) / 2.0f;
                        for (C2247431Cxp c2247431Cxp4 : arrayList2) {
                            c2247431Cxp4.LIZ = c2247431Cxp4.LIZ.LJI(f26);
                        }
                    }
                }
                C2247351Cxh c2247351Cxh = this.LJIJI;
                c2247351Cxh.getClass();
                ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(arrayList2.size() * 12 * 4).order(ByteOrder.nativeOrder());
                ByteBuffer byteBufferOrder2 = ByteBuffer.allocateDirect(arrayList2.size() * 12 * 4).order(ByteOrder.nativeOrder());
                ByteBuffer byteBufferOrder3 = ByteBuffer.allocateDirect(arrayList2.size() * 12 * 4).order(ByteOrder.nativeOrder());
                GLES20.glEnable(3042);
                GLES20.glBlendFunc(770, 771);
                GLES20.glUseProgram(c2247351Cxh.LIZ);
                for (C2247431Cxp c2247431Cxp5 : arrayList2) {
                    C2247351Cxh.LIZJ(c2247431Cxp5.LIZ, byteBufferOrder, true);
                    C2247351Cxh.LIZJ(c2247431Cxp5.LIZIZ, byteBufferOrder2, false);
                    C2247351Cxh.LIZJ(c2247431Cxp5.LIZJ, byteBufferOrder3, false);
                }
                byteBufferOrder.flip();
                byteBufferOrder2.flip();
                byteBufferOrder3.flip();
                GLES20.glVertexAttribPointer(c2247351Cxh.LIZIZ, 2, 5126, false, 0, (Buffer) byteBufferOrder);
                GLES20.glVertexAttribPointer(c2247351Cxh.LIZJ, 2, 5126, false, 0, (Buffer) byteBufferOrder2);
                GLES20.glVertexAttribPointer(c2247351Cxh.LIZLLL, 2, 5126, false, 0, (Buffer) byteBufferOrder3);
                GLES20.glEnableVertexAttribArray(c2247351Cxh.LIZIZ);
                GLES20.glEnableVertexAttribArray(c2247351Cxh.LIZJ);
                GLES20.glEnableVertexAttribArray(c2247351Cxh.LIZLLL);
                GLES20.glDrawArrays(4, 0, arrayList2.size() * 6);
                GLES20.glDisable(3042);
            }
            c2247451Cxr = null;
        } else {
            c2247451Cxr = null;
        }
        float f27 = i2;
        float f28 = i3;
        float f29 = i4;
        float f30 = i5;
        float width2 = maskSrc.getWidth();
        float height2 = maskSrc.getHeight();
        if (c2246591CwT == null) {
            c2246581CwS2 = null;
        } else {
            c2246581CwS2 = c2246591CwT.LJIIIIZZ;
        }
        C2247381Cxk c2247381CxkLIZLLL = LIZLLL(str, element, c2246581CwS2, c2247451Cxr, f29, f30, width2, height2, c2247401Cxm);
        if (this.LIZIZ && c2246591CwT != null) {
            if (c2246591CwT.LJI) {
                float f31 = 0.0f - c2247381CxkLIZLLL.LIZ;
                float f32 = 0.0f - c2247381CxkLIZLLL.LIZJ;
                float f33 = ((f31 + f32) / 2.0f) * 2.0f;
                c2247381CxkLIZLLL.LIZ = f33 - f31;
                c2247381CxkLIZLLL.LIZJ = f33 - f32;
            }
            if (c2246591CwT.LJII) {
                float f34 = c2247381CxkLIZLLL.LIZ;
                float f35 = c2247381CxkLIZLLL.LIZJ;
                float f36 = ((f34 + f35) / 2.0f) * 2.0f;
                c2247381CxkLIZLLL.LIZ = f36 - f34;
                c2247381CxkLIZLLL.LIZJ = f36 - f35;
            }
        }
        C2247371Cxj.LIZJ(this.LIZJ, c2247381CxkLIZLLL.LIZ, c2247381CxkLIZLLL.LIZIZ, c2247381CxkLIZLLL.LIZJ, c2247381CxkLIZLLL.LIZLLL);
        this.LJFF.position(0);
        this.LJFF.put(this.LIZJ);
        C2247381Cxk c2247381Cxk5 = this.LJIIIIZZ;
        if (c2246581CwS2 != null) {
            c2247381Cxk5.LJ(element.renderFrame);
            float f37 = c2247381Cxk5.LIZJ - c2247381Cxk5.LIZ;
            float f38 = c2247381Cxk5.LIZLLL - c2247381Cxk5.LIZIZ;
            c2247381Cxk5.LIZJ(0.0f, 0.0f, f37, f38, f37, f38);
        } else if (element.fitType != 1) {
            c2247381Cxk5.LJ(element.renderFrame);
            float f39 = c2247381Cxk5.LIZJ - c2247381Cxk5.LIZ;
            float f40 = c2247381Cxk5.LIZLLL - c2247381Cxk5.LIZIZ;
            c2247381Cxk5.LIZJ(0.0f, 0.0f, f39, f40, f39, f40);
        } else {
            c2247381Cxk5.LJ(element.renderFrame);
            float f41 = c2247381Cxk5.LIZJ - c2247381Cxk5.LIZ;
            float f42 = c2247381Cxk5.LIZLLL - c2247381Cxk5.LIZIZ;
            if (element.type == 0) {
                c2247381Cxk5.LIZJ(0.0f, 0.0f, width2, height2, width2, height2);
            } else if (f41 <= width2 && f42 <= height2) {
                float f43 = (width2 - f41) / 2.0f;
                float f44 = (height2 - f42) / 2.0f;
                c2247381Cxk5.LIZJ(f43, f44, f43 + f41, f44 + f42, width2, height2);
            } else {
                float f45 = f41 / f42;
                if (f45 > width2 / height2) {
                    float f46 = width2 / f45;
                    float f47 = (height2 - f46) / 2.0f;
                    c2247381Cxk5.LIZJ(0.0f, f47, width2, f47 + f46, width2, height2);
                } else {
                    float f48 = f45 * height2;
                    float f49 = (width2 - f48) / 2.0f;
                    c2247381Cxk5.LIZJ(f49, 0.0f, f49 + f48, height2, width2, height2);
                }
            }
        }
        float[] fArr3 = this.LIZLLL;
        C2247381Cxk c2247381Cxk6 = this.LJIIIIZZ;
        C2247371Cxj.LIZJ(fArr3, c2247381Cxk6.LIZ, c2247381Cxk6.LIZIZ, c2247381Cxk6.LIZJ, c2247381Cxk6.LIZLLL);
        this.LJI.position(0);
        this.LJI.put(this.LIZLLL);
        this.LJIIIIZZ.LIZLLL(f27, f28, element.sourceFrame);
        float[] fArr4 = this.LJ;
        C2247381Cxk c2247381Cxk7 = this.LJIIIIZZ;
        C2247371Cxj.LIZJ(fArr4, c2247381Cxk7.LIZ, c2247381Cxk7.LIZIZ, c2247381Cxk7.LIZJ, c2247381Cxk7.LIZLLL);
        this.LJII.position(0);
        this.LJII.put(this.LJ);
        GLES20.glUseProgram(this.LJIIIZ);
        C1287350jbZ.LIZ();
        this.LJFF.position(0);
        GLES20.glVertexAttribPointer(this.LJIIJ, 2, 5126, false, 0, (Buffer) this.LJFF);
        C1287350jbZ.LIZ();
        GLES20.glEnableVertexAttribArray(this.LJIIJ);
        C1287350jbZ.LIZ();
        this.LJI.position(0);
        GLES20.glVertexAttribPointer(this.LJIIJJI, 2, 5126, false, 0, (Buffer) this.LJI);
        C1287350jbZ.LIZ();
        GLES20.glEnableVertexAttribArray(this.LJIIJJI);
        C1287350jbZ.LIZ();
        GLES20.glActiveTexture(33984);
        Integer num = (Integer) ((HashMap) this.LJIILLIIL).get(str);
        if (num != null && num.intValue() != 0) {
            GLES20.glBindTexture(3553, num.intValue());
            GLES20.glUniform1i(this.LJIILIIL, 0);
            this.LJII.position(0);
            GLES20.glVertexAttribPointer(this.LJIIL, 2, 5126, false, 0, (Buffer) this.LJII);
            C1287350jbZ.LIZ();
            GLES20.glEnableVertexAttribArray(this.LJIIL);
            C1287350jbZ.LIZ();
            GLES20.glActiveTexture(33985);
            GLES20.glBindTexture(36197, i);
            GLES20.glUniform1i(this.LJIILJJIL, 1);
            GLES20.glEnable(3042);
            GLES20.glBlendFunc(770, 771);
            GLES20.glDrawArrays(5, 0, 4);
            C1287350jbZ.LIZ();
            GLES20.glDisable(3042);
        }
    }

    public final C2247381Cxk LIZLLL(String str, DataSource.Element element, C2246581CwS c2246581CwS, C2247451Cxr c2247451Cxr, float f, float f2, float f3, float f4, C2247401Cxm c2247401Cxm) {
        float f5;
        float f6;
        if (c2246581CwS != null) {
            C2247381Cxk c2247381Cxk = this.LJIIIIZZ;
            int[] iArr = element.renderFrame;
            int i = iArr[0];
            int i2 = iArr[1];
            int i3 = iArr[2];
            int i4 = iArr[3];
            if (c2246581CwS.LIZ != 2) {
                float f7 = i;
                int i5 = c2246581CwS.LIZIZ;
                if (i5 != 1) {
                    if (i5 == 2) {
                        f6 = i3 - f3;
                    }
                    float f8 = i2 + ((i4 - f4) / 2.0f);
                    c2247381Cxk.LIZJ(f7, f8, f7 + f3, f8 + f4, f, f2);
                } else {
                    f6 = (i3 - f3) / 2.0f;
                }
                f7 += f6;
                float f82 = i2 + ((i4 - f4) / 2.0f);
                c2247381Cxk.LIZJ(f7, f82, f7 + f3, f82 + f4, f, f2);
            } else if (c2247451Cxr != null) {
                float f9 = i;
                float fFloatValue = c2247451Cxr.LIZIZ.getFirst().floatValue() + f9;
                float f10 = i2;
                float fFloatValue2 = c2247451Cxr.LIZIZ.getSecond().floatValue() + f10;
                if (c2246581CwS.LJI) {
                    fFloatValue = ((i3 - f3) / 2.0f) + f9;
                }
                if (c2246581CwS.LJII) {
                    f5 = f10 + ((i4 - f4) / 2.0f);
                } else {
                    f5 = fFloatValue2;
                }
                c2247381Cxk.LIZJ(fFloatValue, f5, fFloatValue + f3, f5 + f4, f, f2);
            }
        } else if (element.type == 0) {
            C2247381Cxk c2247381Cxk2 = this.LJIIIIZZ;
            int[] iArr2 = element.renderFrame;
            if (iArr2.length >= 4) {
                int i6 = iArr2[0];
                float f11 = i6 + ((iArr2[2] - f3) / 2.0f);
                float f12 = iArr2[1] + ((iArr2[3] - f4) / 2.0f);
                c2247381Cxk2.LIZJ(f11, f12, f11 + f3, f12 + f4, f, f2);
            }
        } else {
            this.LJIIIIZZ.LIZLLL(f, f2, element.renderFrame);
        }
        C2247371Cxj.LIZ(this.LJIIIIZZ, c2247401Cxm);
        C2247371Cxj.LIZIZ(this.LJIIIIZZ);
        ((HashMap) this.LJIJ).put(str, C2247381Cxk.LIZ(this.LJIIIIZZ));
        return this.LJIIIIZZ;
    }
}
