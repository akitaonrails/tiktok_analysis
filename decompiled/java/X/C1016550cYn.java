package X;

import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.detail.platform.IDetailPageAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import java.util.List;

/* JADX INFO: renamed from: X.0cYn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1016550cYn {
    public static C1017520caM LIZ(String str) {
        if (C1043460dGC.LJI(InterfaceC1017210cZr.class) == null) {
            return null;
        }
        return ((InterfaceC1017210cZr) C1043460dGC.LJI(InterfaceC1017210cZr.class)).SW0(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean LIZJ(FragmentManager fragmentManager) {
        if (fragmentManager == null) {
            return false;
        }
        List<Fragment> listLJJLIIIJL = fragmentManager.LJJLIIIJL();
        if (C086I.LIZIZ(listLJJLIIIJL)) {
            return false;
        }
        for (Fragment fragment : listLJJLIIIJL) {
            if (fragment != 0 && !(fragment instanceof InterfaceC1209130hZP)) {
                IDetailPageAbility iDetailPageAbilityLIZ = C1600700rky.LIZ(fragment);
                if (iDetailPageAbilityLIZ != null && iDetailPageAbilityLIZ.ku1()) {
                    return true;
                }
                if (fragment instanceof DialogFragment) {
                    Dialog dialog = ((DialogFragment) fragment).getDialog();
                    if (dialog != null) {
                        return dialog.isShowing();
                    }
                } else if (fragment instanceof InterfaceC1351090lGN) {
                    return ((InterfaceC1351090lGN) fragment).isShowing();
                }
            }
        }
        return false;
    }

    public static boolean LIZLLL(String str) {
        C1017520caM c1017520caMSW0;
        if (C1043460dGC.LJI(InterfaceC1017210cZr.class) == null || (c1017520caMSW0 = ((InterfaceC1017210cZr) C1043460dGC.LJI(InterfaceC1017210cZr.class)).SW0(str)) == null) {
            return false;
        }
        return !c1017520caMSW0.LIZJ;
    }

    public static boolean LJ(Aweme aweme) {
        C1017520caM c1017520caMLIZ;
        if (aweme == null || !AwemeExtKt.isAdTraffic(aweme) || aweme.getAwemeRawAd() == null || aweme.getAwemeRawAd().getCreativeIdStr() == null || !C1017070cZd.LL(aweme) || (c1017520caMLIZ = LIZ(aweme.getAwemeRawAd().getCreativeIdStr())) == null) {
            return false;
        }
        return c1017520caMLIZ.LIZJ;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0110  */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Unknown Source)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZIZ(android.content.Context r5, com.ss.android.ugc.aweme.feed.model.Aweme r6, boolean r7) {
        /*
            Method dump skipped, instruction units count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1016550cYn.LIZIZ(android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme, boolean):java.lang.String");
    }
}
