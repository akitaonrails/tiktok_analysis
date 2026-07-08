package X;

import com.ss.android.ugc.aweme.creative.model.album.ImportVideoInfo;
import com.ss.android.ugc.aweme.im.creative.common.api.model.data.IMCreativeEditModel;
import com.ss.android.vesdk.VEUtils;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0nh6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1444540nh6 {
    public static final C1444540nh6 LIZ = new C1444540nh6();

    public static ArrayList LIZIZ(String str) {
        int[] iArr = new int[10];
        if (VEUtils.getVideoFileInfo(str, iArr) != 0) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[6];
        int i4 = iArr[8];
        long j = iArr[3];
        arrayList.add(new ImportVideoInfo(i, i2, i3, i4, str, j, j, null, null, iArr[7], 1.0f, str, str, false, null, null, 0L, 98304, null));
        return arrayList;
    }

    public static void LIZJ(IMCreativeEditModel iMCreativeEditModel, C19EG c19eg) {
        C1390130mHL c1390130mHL = new C1390130mHL(c19eg, null, 6);
        C786410Ut5.LJLLLLLL(0, c1390130mHL);
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0MWY(c19eg, iMCreativeEditModel, c1390130mHL, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x061d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0173  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.C19EG r65, com.ss.android.ugc.aweme.im.creative.common.api.model.data.IMCreativeEditModel r66, X.InterfaceC1364105Vn r67) {
        /*
            Method dump skipped, instruction units count: 1588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1444540nh6.LIZ(X.19EG, com.ss.android.ugc.aweme.im.creative.common.api.model.data.IMCreativeEditModel, X.05Vn):java.lang.Object");
    }
}
