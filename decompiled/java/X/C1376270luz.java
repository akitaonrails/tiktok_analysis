package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.ICreativeSAAService;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.ShareDependServiceImpl;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0luz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1376270luz {
    public static final C1376270luz LIZ = new C1376270luz();
    public static final ArrayList<String> LIZIZ;
    public static boolean LIZJ;
    public static boolean LIZLLL;
    public static boolean LJ;
    public static Aweme LJFF;
    public static Aweme LJI;
    public static String LJII;
    public static String LJIIIIZZ;
    public static int LJIIIZ;
    public static final List<String> LJIIJ;
    public static String LJIIJJI;
    public static int LJIIL;
    public static SharePackage LJIILIIL;
    public static boolean LJIILJJIL;
    public static boolean LJIILL;

    static {
        ArrayList<String> arrayList = new ArrayList<>();
        LIZIZ = arrayList;
        arrayList.add("com.ss.android.ugc.aweme.adaptation.saa.SAAActivity");
        LJIIJ = C1697810uHb.LJIIJJI("download", "download_no_watermark");
        LJIIJJI = "";
        LJIIL = 1;
        LJIILL = true;
    }

    public static boolean LIZ() {
        Aweme aweme = LJI;
        if (aweme == null || LJFF == null) {
            return false;
        }
        return Intrinsics.LJFF(aweme.getAid(), LJFF.getAid());
    }

    public static final boolean LIZIZ() {
        return C621180OYa.LIZIZ.LIZLLL();
    }

    public static final boolean LIZLLL() {
        ShareDependService.LIZ.getClass();
        return ShareDependServiceImpl.LJJJJI().LJJIJIIJI() || C1589640rT8.LIZIZ.l2() || C1587150rP7.LIZIZ.LJIIL();
    }

    public static boolean LJ() {
        String str = LJIIIIZZ;
        if (str == null) {
            return false;
        }
        List<String> list = LJIIJ;
        return list.contains(str) && list.contains("download");
    }

    public static final boolean LIZJ() {
        Activity activityLJFF = C2214201BlK.LJFF();
        if (activityLJFF == null) {
            return false;
        }
        boolean zContains = LIZIZ.contains(activityLJFF.getLocalClassName());
        ICreativeSAAService iCreativeSAAService = (ICreativeSAAService) PluggableExtentionKt.pluggableSpi$default(ICreativeSAAService.class, false, false, false, 14, null);
        return zContains || (iCreativeSAAService != null && iCreativeSAAService.isSAAActivity(activityLJFF));
    }
}
