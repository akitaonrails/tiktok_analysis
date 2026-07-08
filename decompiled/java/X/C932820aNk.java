package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0aNk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C932820aNk {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ() {
        List<C957020b0m> listLJIIIZ = C940770aaZ.LIZ().getDataSource().LJIIIZ();
        if ((listLJIIIZ instanceof Collection) && listLJIIIZ.isEmpty()) {
            return true;
        }
        Iterator<C957020b0m> it2 = listLJIIIZ.iterator();
        while (it2.hasNext()) {
            if (C500260Jjc.LJJIFFI(Boolean.valueOf(it2.next().LLJIJIL))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZIZ(tikcast.linkmic.common.PosIdentity r5) {
        /*
            r3 = 0
            r4 = 0
            if (r5 == 0) goto L41
            X.0a86 r0 = X.C940770aaZ.LIZ()
            X.0a3Q r0 = r0.getDataSource()
            java.util.List r0 = r0.LJIIIZ()
            java.util.Iterator r2 = r0.iterator()
        L14:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L75
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.0b0m r0 = (X.C957020b0m) r0
            tikcast.linkmic.common.PosIdentity r0 = r0.getPosIdentity()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r5)
            if (r0 == 0) goto L14
        L2b:
            X.0b0m r1 = (X.C957020b0m) r1
            if (r1 == 0) goto L3b
            tikcast.linkmic.common.MultiGuestSpotExtra r0 = r1.getMultiGuestExtra()
            if (r0 == 0) goto L3b
            boolean r0 = r0.isEnlarged
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
        L3b:
            boolean r0 = X.C500260Jjc.LJJJI(r3)
            if (r0 != 0) goto L94
        L41:
            X.0ac4 r0 = com.bytedance.android.live.liveinteract.multiguestv3.main.ability.LinkMicAbilityManager.LJIIIZ
            r0.getClass()
            X.0ac6 r0 = X.C941700ac4.LIZIZ()
            if (r0 == 0) goto L96
            java.util.List r0 = r0.LJIILLIIL()
            if (r0 == 0) goto L96
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r0.iterator()
        L5b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L77
            java.lang.Object r1 = r2.next()
            com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestAbilityListDisableSwitchSpotSetting r0 = com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestAbilityListDisableSwitchSpotSetting.INSTANCE
            java.util.List r0 = r0.getAbilityList()
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L5b
            r3.add(r1)
            goto L5b
        L75:
            r1 = r3
            goto L2b
        L77:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L96
            r0 = 0
        L7e:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = X.C500260Jjc.LJJIFFI(r0)
            if (r0 != 0) goto L94
            boolean r0 = X.C932490aND.LIZIZ()
            if (r0 == 0) goto L95
            boolean r0 = LIZ()
            if (r0 == 0) goto L95
        L94:
            r4 = 1
        L95:
            return r4
        L96:
            r0 = 1
            goto L7e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C932820aNk.LIZIZ(tikcast.linkmic.common.PosIdentity):boolean");
    }
}
