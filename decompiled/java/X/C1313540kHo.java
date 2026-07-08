package X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.bytedance.sdui.render.tasm.behavior.ui.utils.BackgroundDrawable;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0kHo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1313540kHo extends C1313690kI3 {
    public final WeakReference<AbstractC1313520kHm> LJFF;
    public C1313580kHs LJI;
    public boolean LJII;

    @Override // X.C1313690kI3
    public final BackgroundDrawable LIZ() {
        AbstractC1313520kHm abstractC1313520kHm = this.LJFF.get();
        if (abstractC1313520kHm == null) {
            return null;
        }
        BackgroundDrawable backgroundDrawableLIZ = super.LIZ();
        T t = abstractC1313520kHm.LLLLLILLIL;
        if (t != 0) {
            Drawable background = t.getBackground();
            abstractC1313520kHm.LLLLLILLIL.setBackground(null);
            if (background != null) {
                abstractC1313520kHm.LLLLLILLIL.setBackground(new LayerDrawable(new Drawable[]{backgroundDrawableLIZ, background}));
                return backgroundDrawableLIZ;
            }
            abstractC1313520kHm.LLLLLILLIL.setBackground(backgroundDrawableLIZ);
        }
        return backgroundDrawableLIZ;
    }

    public final void LJFF() {
        float fLJI;
        AbstractC1313520kHm abstractC1313520kHm = this.LJFF.get();
        if (abstractC1313520kHm == null) {
            return;
        }
        C1313580kHs c1313580kHs = this.LJI;
        float f = 0.0f;
        if (c1313580kHs != null) {
            float fLJFF = c1313580kHs.LJFF() + 0.0f;
            fLJI = 0.0f + this.LJI.LJI();
            f = fLJFF;
        } else {
            fLJI = 0.0f;
        }
        T t = abstractC1313520kHm.LLLLLILLIL;
        if (t != 0) {
            C786410Ut5.Jc(t, f);
            C786410Ut5.ed(abstractC1313520kHm.LLLLLILLIL, fLJI);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x05c2  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(java.util.List<X.C1313650kHz> r113) {
        /*
            Method dump skipped, instruction units count: 1936
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1313540kHo.LJ(java.util.List):void");
    }

    public C1313540kHo(AbstractC1313520kHm abstractC1313520kHm, AbstractC1317090kNX abstractC1317090kNX) {
        super(abstractC1317090kNX);
        this.LJII = true;
        this.LJFF = new WeakReference<>(abstractC1313520kHm);
    }
}
