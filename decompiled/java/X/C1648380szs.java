package X;

import com.ss.android.ugc.aweme.servicimpl.NowBottomTabModule;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0szs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1648380szs {
    public static final List<InterfaceC1653190t7d> LIZ(C1DRG c1drg) {
        ArrayList arrayList = new ArrayList();
        c1drg.LJII(ShortVideoContext.class, null);
        EnumC1647570syZ enumC1647570syZ = EnumC1647570syZ.RECORD_NOW;
        arrayList.add(new NowBottomTabModule(C0MTD.LIZ(enumC1647570syZ.getNameResId()), enumC1647570syZ.getTag(), c1drg));
        return arrayList;
    }
}
