package X;

import com.lynx.tasm.behavior.ui.list.UIList;

/* JADX INFO: renamed from: X.0kGz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1313030kGz {
    public final /* synthetic */ UIList LIZ;

    public C1313030kGz(UIList uIList) {
        this.LIZ = uIList;
    }

    public final void LIZ(int i, int i2, int i3, int i4, int i5) {
        UIList uIList = this.LIZ;
        if (uIList.LLJJJJJIL) {
            i3 = uIList.LLJ.LLJILJIL;
        } else {
            i2 = uIList.LLJ.LLJILJIL;
        }
        int i6 = i4 + i2;
        int i7 = i5 + i3;
        if (i2 != i6 || i3 != i7) {
            C1289960jfm c1289960jfm = new C1289960jfm(uIList.getSign(), "snap");
            c1289960jfm.LIZIZ(Integer.valueOf(i), "position");
            c1289960jfm.LIZIZ(Float.valueOf(C1311130kDv.LIZJ(i2)), "currentScrollLeft");
            c1289960jfm.LIZIZ(Float.valueOf(C1311130kDv.LIZJ(i3)), "currentScrollTop");
            c1289960jfm.LIZIZ(Float.valueOf(C1311130kDv.LIZJ(i6)), "targetScrollLeft");
            c1289960jfm.LIZIZ(Float.valueOf(C1311130kDv.LIZJ(i7)), "targetScrollTop");
            uIList.mContext.LLIZ.LIZIZ(c1289960jfm);
        }
    }
}
