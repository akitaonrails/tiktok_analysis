package X;

import android.graphics.Bitmap;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.filter.FilterBean;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0sjW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1638240sjW implements InterfaceC1326460kce<FilterBean> {
    public static final C1638240sjW LIZ = new C1638240sjW();
    public static String LIZIZ;

    @Override // X.InterfaceC1326460kce
    public final String LIZIZ(FilterBean filterBean) {
        return C1326470kcf.LIZLLL(this, filterBean);
    }

    @Override // X.InterfaceC1326460kce
    public final String LIZJ(FilterBean filterBean) {
        FilterBean filterBean2 = filterBean;
        String str = LIZIZ;
        if (str != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(C1489060oqu.LIZ(str));
            sbLIZ2.append(filterBean2.getId());
            sbLIZ.append(C1489060oqu.LIZ(C2188811AlT.LIZIZ(sbLIZ2)));
            sbLIZ.append(LIZ.LIZIZ(filterBean2));
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return null;
    }

    @Override // X.InterfaceC1326460kce
    public final Uri LJ(FilterBean filterBean) {
        String string;
        Uri thumbnailFileUri = filterBean.getThumbnailFileUri();
        if (thumbnailFileUri == null || (string = thumbnailFileUri.toString()) == null) {
            return null;
        }
        return UriProtector.parse(string);
    }

    @Override // X.InterfaceC1326460kce
    public final void LIZ(int i, String str) {
        C2281251EQx.LIZ.LJI(i, str);
    }

    @Override // X.InterfaceC1326460kce
    public final C1339420kxY LIZLLL(C1320700kTM c1320700kTM, Function0 function0) {
        return new C1339420kxY(function0, c1320700kTM, 1);
    }

    @Override // X.InterfaceC1326460kce
    public final boolean LJFF(FilterBean filterBean, C1322110kVd c1322110kVd, int i, int i2, Bitmap.Config config, InterfaceC1325670kbN interfaceC1325670kbN, C1320700kTM c1320700kTM, Function0 function0) {
        return C1326470kcf.LIZ(this, filterBean, c1322110kVd, i, i2, config, interfaceC1325670kbN, c1320700kTM, function0);
    }
}
