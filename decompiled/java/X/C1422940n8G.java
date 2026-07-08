package X;

import android.graphics.Bitmap;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.tools.mvtemplate.core.TemplateCategoryData;
import java.util.List;

/* JADX INFO: renamed from: X.0n8G, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1422940n8G implements InterfaceC1424840nBK {
    public final /* synthetic */ C1422930n8F LIZ;

    @Override // X.InterfaceC1424840nBK
    public final void LJIIJ() {
        this.LIZ.LIZJ.invoke();
    }

    public C1422940n8G(C1422930n8F c1422930n8F) {
        this.LIZ = c1422930n8F;
    }

    @Override // X.InterfaceC1424840nBK
    public final void F1(C1422540n7c c1422540n7c) {
        this.LIZ.LJIIJJI.invoke(c1422540n7c);
    }

    @Override // X.InterfaceC1424890nBP
    public final void LIZ(boolean z) {
        this.LIZ.LIZIZ.invoke(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC1424840nBK
    public final void LIZIZ(TemplateCategoryData templateCategoryData) {
        this.LIZ.LJIIIZ.invoke(templateCategoryData);
    }

    @Override // X.InterfaceC1424840nBK
    public final void LJIIIIZZ(TemplateCategoryData templateCategoryData) {
        this.LIZ.LIZLLL.invoke(templateCategoryData);
    }

    @Override // X.InterfaceC1424840nBK
    public final void LJIIIZ(TemplateCategoryData templateCategoryData) {
        this.LIZ.LJIIIIZZ.invoke(templateCategoryData);
    }

    @Override // X.InterfaceC1424890nBP
    public final void LIZJ(int i, C1419590n2r c1419590n2r) {
        this.LIZ.LJI.invoke(c1419590n2r, Integer.valueOf(i));
    }

    @Override // X.InterfaceC1424890nBP
    public final void LJ(C1419590n2r c1419590n2r, boolean z) {
        this.LIZ.LJII.invoke(Boolean.valueOf(z), c1419590n2r);
    }

    @Override // X.InterfaceC1424840nBK
    public final void LJII(List<C1422430n7R> list, int i) {
        this.LIZ.LJFF.invoke(list, Integer.valueOf(i));
    }

    @Override // X.InterfaceC1424840nBK
    public final void LIZLLL(int i, C1419590n2r c1419590n2r, TemplateCategoryData templateCategoryData, long j) {
        this.LIZ.LJIIJ.invoke(Integer.valueOf(i), c1419590n2r, templateCategoryData, Long.valueOf(j));
    }

    @Override // X.InterfaceC1424840nBK
    public final void LJFF(int i, C1419590n2r c1419590n2r, TemplateCategoryData templateCategoryData, boolean z) {
        this.LIZ.LJ.invoke(new C1422430n7R(i, c1419590n2r, templateCategoryData, false), Boolean.valueOf(z));
    }

    @Override // X.InterfaceC1424890nBP
    public final void LJI(C1419590n2r c1419590n2r, SmartImageView smartImageView, int i, float f, Bitmap bitmap) {
        this.LIZ.LIZ.invoke(c1419590n2r, smartImageView, Integer.valueOf(i), Float.valueOf(f), bitmap);
    }
}
