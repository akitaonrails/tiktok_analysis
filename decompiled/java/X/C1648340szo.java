package X;

import android.content.Context;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.d4;
import java.util.ArrayList;
import java.util.List;
import zrj.m0;

/* JADX INFO: renamed from: X.0szo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1648340szo {
    public ShortVideoContext LIZ;

    public final List<InterfaceC1653190t7d> LIZ(C1DRG c1drg) {
        ArrayList arrayList = new ArrayList();
        ShortVideoContext shortVideoContext = null;
        Context context = (Context) c1drg.LJII(C19EG.class, null);
        ShortVideoContext shortVideoContext2 = (ShortVideoContext) c1drg.LJII(ShortVideoContext.class, null);
        this.LIZ = shortVideoContext2;
        if (!shortVideoContext2.creativeModel.initialModel.dmCameraModel.isBulletin) {
            if (d4.LJIL(shortVideoContext2)) {
                if (C294760Bgw.LIZ()) {
                    EnumC1647570syZ enumC1647570syZ = EnumC1647570syZ.RECORD_LIGHTENING_DM_VIDEO;
                    arrayList.add(new C1648220szc(c1drg, false, true, context.getString(enumC1647570syZ.getNameResId()), enumC1647570syZ.getTag(), "quick_video", true));
                    EnumC1647570syZ enumC1647570syZ2 = EnumC1647570syZ.RECORD_LIGHTENING_DM_PHOTO;
                    arrayList.add(new C1648220szc(c1drg, true, true, context.getString(enumC1647570syZ2.getNameResId()), enumC1647570syZ2.getTag(), "quick_photo", true));
                }
            } else {
                C1446350nk1 c1446350nk1 = C1446350nk1.LIZ;
                ShortVideoContext shortVideoContext3 = this.LIZ;
                if (shortVideoContext3 == null) {
                    shortVideoContext3 = null;
                }
                c1446350nk1.getClass();
                if (!shortVideoContext3.LJJLL() && !shortVideoContext3.LJJJJLL() && !C1446350nk1.LJFF(shortVideoContext3) && !C123100dR.LIZ(shortVideoContext3.creativeModel.paidContentModel.getCollectionId())) {
                    arrayList.add(new m0(context.getString(EnumC1647570syZ.RECORD_LIGHTENING_PHOTO.getNameResId()), EnumC1647570syZ.PHOTO_SHORT.getTag(), false, c1drg));
                }
                ShortVideoContext shortVideoContext4 = this.LIZ;
                if (shortVideoContext4 != null) {
                    shortVideoContext = shortVideoContext4;
                }
                if (!shortVideoContext.LJJLL() && !shortVideoContext.LJJJJLL() && !C1446350nk1.LJFF(shortVideoContext) && !C123100dR.LIZ(shortVideoContext.creativeModel.paidContentModel.getCollectionId())) {
                    EnumC1647570syZ enumC1647570syZ3 = EnumC1647570syZ.RECORD_LIGHTENING_VIDEO;
                    arrayList.add(new C1648270szh(context.getString(enumC1647570syZ3.getNameResId()), enumC1647570syZ3.getTag(), "quick_video", true, c1drg));
                    return arrayList;
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.InterfaceC1653190t7d> LIZIZ(X.C1DRG r23) {
        /*
            Method dump skipped, instruction units count: 1294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1648340szo.LIZIZ(X.1DRG):java.util.List");
    }

    public final void LIZJ(String str) {
        ShortVideoContext shortVideoContext = this.LIZ;
        if (shortVideoContext == null) {
            shortVideoContext = null;
        }
        String str2 = shortVideoContext.shootWay;
        String creationId = shortVideoContext.getCreationId();
        if (!C306620C0e.LIZ()) {
            List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
            C0LAB c0lab = new C0LAB();
            c0lab.LJ("content_type", "normal_type");
            c0lab.LJ("shoot_way", str2);
            c0lab.LJ("creation_id", creationId);
            c0lab.LJ("no_tab_reason", str);
            C2341909Fp.LIZ("livesdk_no_live_tab_reason", c0lab.LIZ);
        }
    }
}
