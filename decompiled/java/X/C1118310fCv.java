package X;

import com.bytedance.android.livesdk.livesetting.gift.LiveGreyGiftToolbarWhenGiftPermissionOffSetting;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: renamed from: X.0fCv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1118310fCv {
    public static final /* synthetic */ int LIZ = 0;

    public static C1118330fCx LIZ(boolean z, boolean z2, boolean z3) {
        EnumC1118320fCw enumC1118320fCw;
        EnumC1118320fCw enumC1118320fCw2;
        EnumC1118320fCw enumC1118320fCw3;
        if (z) {
            enumC1118320fCw = EnumC1118320fCw.YES;
        } else {
            enumC1118320fCw = EnumC1118320fCw.NO;
        }
        if (z2) {
            enumC1118320fCw2 = EnumC1118320fCw.YES;
        } else {
            enumC1118320fCw2 = EnumC1118320fCw.NO;
        }
        if (z3) {
            enumC1118320fCw3 = EnumC1118320fCw.YES;
        } else {
            enumC1118320fCw3 = EnumC1118320fCw.NO;
        }
        EnumC1118320fCw enumC1118320fCw4 = EnumC1118320fCw.WHATEVER;
        return new C1118330fCx(enumC1118320fCw, enumC1118320fCw2, enumC1118320fCw4, enumC1118320fCw3, enumC1118320fCw4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.LinkedList] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.List] */
    public static final EnumC1118300fCu LIZIZ(boolean z, boolean z2, boolean z3) {
        ?? linkedList;
        C1118330fCx c1118330fCxLIZ = LIZ(z, z2, z3);
        for (EnumC1118300fCu enumC1118300fCu : EnumC1118300fCu.getEntries()) {
            if (enumC1118300fCu == EnumC1118300fCu.HIDE) {
                linkedList = new LinkedList();
                EnumC1118320fCw enumC1118320fCw = EnumC1118320fCw.WHATEVER;
                EnumC1118320fCw enumC1118320fCw2 = EnumC1118320fCw.NO;
                linkedList.add(new C1118330fCx(enumC1118320fCw, enumC1118320fCw2, enumC1118320fCw2, enumC1118320fCw, enumC1118320fCw));
                if (!LiveGreyGiftToolbarWhenGiftPermissionOffSetting.INSTANCE.getValue()) {
                    linkedList.add(new C1118330fCx(enumC1118320fCw2, enumC1118320fCw, enumC1118320fCw, enumC1118320fCw2, enumC1118320fCw));
                }
            } else {
                linkedList = enumC1118300fCu.getMStatusSets();
                if (linkedList == 0) {
                    continue;
                }
            }
            Iterator it2 = linkedList.iterator();
            boolean z4 = false;
            while (it2.hasNext()) {
                if (((C1118330fCx) it2.next()).LIZ(c1118330fCxLIZ)) {
                    z4 = true;
                }
            }
            if (z4) {
                return enumC1118300fCu;
            }
        }
        return EnumC1118300fCu.GREY;
    }
}
