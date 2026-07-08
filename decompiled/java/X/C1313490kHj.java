package X;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.sdui.render.bridge.ReadableArray;
import com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0kHj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1313490kHj extends AbstractC1313500kHk<C1313560kHq> {
    public final SDUIBaseUI LLLLZI;
    public List<C1313450kHf> LLLLZIL;
    public C1313620kHw LLLLZLL;
    public final Matrix LLLLZLLIL;

    @Override // X.AbstractC1313520kHm, com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI
    public final boolean LJIIJJI() {
        return this.LLLLZI.LJIIJJI();
    }

    @Override // com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI
    public final Rect LJIIL() {
        return this.LLLLZI.LJIIL();
    }

    @Override // com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI
    public final List<SDUIBaseUI> LJIILL() {
        return this.LLLLZI.LJIILL();
    }

    @Override // com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI
    public final int LJIIZILJ() {
        return this.LLLLZI.LJIIZILJ();
    }

    @Override // com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI
    public final String LJIJ() {
        SDUIBaseUI sDUIBaseUI = this.LLLLZI;
        if (sDUIBaseUI != null) {
            return sDUIBaseUI.LJIJ();
        }
        return null;
    }

    @Override // X.AbstractC1313520kHm, com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI
    public final C1313610kHv LJJ() {
        return this.LLLLZI.LJJ();
    }

    @Override // com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI
    public final int LJJI() {
        return this.LLLLZI.LJJI();
    }

    @Override // com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI
    public final int LJJIII() {
        return this.LLLLZI.LJJIII();
    }

    @Override // com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI
    public final int LJJIIJ() {
        return this.LLLLZI.LJJIIJ();
    }

    @Override // com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI
    public final C1297860jsW LJJIIZI() {
        return this.LLLLZI.LJJIIZI();
    }

    @Override // com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI
    public final String LJJIJIL() {
        SDUIBaseUI sDUIBaseUI = this.LLLLZI;
        if (sDUIBaseUI != null) {
            return sDUIBaseUI.LJJIJIL();
        }
        return null;
    }

    @Override // com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI
    public final int LJJIJLIJ() {
        return this.LLLLZI.LJJIJLIJ();
    }

    @Override // X.AbstractC1313520kHm, com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI
    public final C1313510kHl LJJIZ() {
        return this.LLLLZI.LJJIZ();
    }

    @Override // com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI
    public final float LJJJIL() {
        SDUIBaseUI sDUIBaseUI = this.LLLLZI;
        if (sDUIBaseUI instanceof AbstractC1313520kHm) {
            return sDUIBaseUI.LJJJIL();
        }
        return 0.0f;
    }

    @Override // com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI
    public final int LJJJJI() {
        return this.LLLLZI.LJJJJI();
    }

    @Override // com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI
    public final boolean LJJJJZI() {
        return this.LLLLZI.LJJJJZI();
    }

    @Override // com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI
    public final boolean LJJJLIIL() {
        return this.LLLLZI.LJJJLIIL();
    }

    @Override // X.AbstractC1313500kHk, X.AbstractC1313520kHm, com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI
    public final void LJJJLZIJ() {
        this.LLLLZI.LJJJLZIJ();
    }

    @Override // com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI
    public final void LJJLIIIJL() {
        SDUIBaseUI sDUIBaseUI = this.LLLLZI;
        if (sDUIBaseUI != null) {
            sDUIBaseUI.LJJLIIIJL();
        }
        super.LJJLIIIJL();
    }

    @Override // X.AbstractC1313500kHk, X.AbstractC1313520kHm
    public final void LJLJLJ() {
        View view = (View) this.LLLLLILLIL.getParent();
        if (view == null) {
            return;
        }
        ((ViewGroup) this.LLLLLILLIL).layout(0, 0, view.getWidth(), view.getHeight());
        if (this.LLLLLILLIL.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) this.LLLLLILLIL.getParent();
            if (this.LLLFFI != 0) {
                viewGroup.setClipChildren(false);
            }
            this.LLLLLILLIL.setClipBounds(null);
        }
        SDUIBaseUI sDUIBaseUI = this.LLLLZI;
        if (sDUIBaseUI instanceof AbstractC1313520kHm) {
            ((AbstractC1313520kHm) sDUIBaseUI).LJLJLJ();
        }
        LJZI();
    }

    public final C1313620kHw LJZ() {
        if (this.LLLLZLL == null) {
            C1313620kHw c1313620kHw = new C1313620kHw();
            this.LLLLZLL = c1313620kHw;
            T t = this.LLLLLILLIL;
            if (t != 0) {
                ((C1313560kHq) t).LLILZLL = c1313620kHw;
            }
        }
        return this.LLLLZLL;
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x019e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJZI() {
        /*
            Method dump skipped, instruction units count: 1228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1313490kHj.LJZI():void");
    }

    @Override // X.AbstractC1313500kHk, com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI
    public final SDUIBaseUI LJIILJJIL(int i) {
        return (SDUIBaseUI) ListProtector.get(this.LLLLZI.LLIZLLLIL, i);
    }

    @Override // X.AbstractC1313500kHk, com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI
    public final void LJJLIIJ(SDUIBaseUI sDUIBaseUI) {
        this.LLLLZI.LJJLIIJ(sDUIBaseUI);
    }

    @Override // com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI
    public final void LJJLJLI(Rect rect) {
        this.LLLLZI.LJJLJLI(null);
    }

    @Override // com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI
    public final void LJJZ(int i) {
        this.LLLLZI.LJJZ(i);
    }

    @Override // com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI
    public final void LJL(int i) {
        this.LLLLZI.LJL(i);
    }

    @Override // com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI
    public final void LJLIIIL(Object obj) {
        this.LLLLZI.LJLIIIL(obj);
    }

    @Override // com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI
    public final void LJLILLLLZI(SDUIBaseUI sDUIBaseUI) {
        this.LLLLZI.LJLILLLLZI(sDUIBaseUI);
    }

    @Override // com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI
    public final void LJLJI(C1291290jhv c1291290jhv) {
        SDUIBaseUI sDUIBaseUI = this.LLLLZI;
        sDUIBaseUI.LJLJI(c1291290jhv);
        sDUIBaseUI.LJI(c1291290jhv);
    }

    @Override // com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI
    public final void LJLJJI(float[] fArr) {
        this.LLLLZI.LJLJJI(fArr);
        LJJJJZ();
    }

    @Override // X.AbstractC1313520kHm
    public final View LJLJJL(Context context) {
        return new C1313560kHq(this, (AbstractC1317090kNX) context);
    }

    @Override // X.AbstractC1313500kHk
    public final void LJLLL(AbstractC1313520kHm abstractC1313520kHm) {
        ((AbstractC1313500kHk) this.LLLLZI).LJLLL(abstractC1313520kHm);
    }

    @Override // X.AbstractC1313500kHk
    public final void LJLZ(SDUIBaseUI sDUIBaseUI) {
        ((AbstractC1313500kHk) this.LLLLZI).LJLZ(sDUIBaseUI);
    }

    @Override // com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI
    public final void setBoxShadow(ReadableArray readableArray) {
        ArrayList arrayList;
        if (readableArray != null && readableArray.size() != 0) {
            arrayList = new ArrayList();
            for (int i = 0; i < readableArray.size(); i++) {
                ReadableArray array = readableArray.getArray(i);
                C1313450kHf c1313450kHf = new C1313450kHf();
                c1313450kHf.LIZIZ = (float) array.getDouble(0);
                c1313450kHf.LIZJ = (float) array.getDouble(1);
                float f = (float) array.getDouble(2);
                c1313450kHf.LIZLLL = f;
                c1313450kHf.LJFF = f * 1.25f;
                c1313450kHf.LJ = (float) array.getDouble(3);
                c1313450kHf.LJI = (int) array.getDouble(4);
                int i2 = (int) array.getLong(5);
                c1313450kHf.LIZ = i2;
                if ((c1313450kHf.LIZIZ != 0.0f || c1313450kHf.LIZJ != 0.0f || c1313450kHf.LIZLLL != 0.0f || c1313450kHf.LJ != 0.0f) && Color.alpha(i2) != 0 && c1313450kHf.LIZLLL >= 0.0f) {
                    arrayList.add(c1313450kHf);
                }
            }
        } else {
            arrayList = null;
        }
        this.LLLLZIL = arrayList;
        LJZI();
    }

    @Override // com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI
    public final void setOutlineColor(int i) {
        LJZ().LIZIZ = Integer.valueOf(i);
    }

    @Override // com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI
    public final void setOutlineWidth(float f) {
        LJZ().LIZJ = f;
    }

    public C1313490kHj(AbstractC1317090kNX abstractC1317090kNX, SDUIBaseUI sDUIBaseUI) {
        super(abstractC1317090kNX);
        this.LLLLZLLIL = new Matrix();
        this.LLLFFI = 3;
        this.LLLLZI = sDUIBaseUI;
        sDUIBaseUI.LJJZZI(this);
        int i = sDUIBaseUI.LLJJ;
        String strLJJIJIL = sDUIBaseUI.LJJIJIL();
        this.LLJJ = i;
        this.LLJJI = strLJJIJIL;
        LJJJJLI();
        super.LJJJJLL(this.LLLLZI, 0);
        super.LJLJL(null, sDUIBaseUI);
        super.LJLLL((AbstractC1313520kHm) sDUIBaseUI);
    }

    @Override // X.AbstractC1313500kHk, com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI
    public final void LJJJJLL(SDUIBaseUI sDUIBaseUI, int i) {
        this.LLLLZI.LJJJJLL(sDUIBaseUI, i);
    }

    @Override // X.AbstractC1313520kHm
    public final void LJLJL(SDUIBaseUI sDUIBaseUI, SDUIBaseUI sDUIBaseUI2) {
        ((AbstractC1313520kHm) this.LLLLZI).LJLJL(sDUIBaseUI, sDUIBaseUI2);
    }

    @Override // com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI
    public final void LJLIIL(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, Rect rect) {
        this.LLLLZI.LJLIIL(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, rect);
    }
}
