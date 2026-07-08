package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.portrait.model.PortraitStyleItem;
import com.ss.android.ugc.aweme.portrait.network.PortraitStylesResponse;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0CcH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C317350CcH {
    public static final C317350CcH LIZ = new C317350CcH();
    public static List<PortraitStyleItem> LIZIZ;
    public static PortraitStylesResponse LIZJ;
    public static String LIZLLL;
    public static long LJ;

    public final synchronized PortraitStylesResponse LIZIZ(String str) {
        boolean z;
        if (!Intrinsics.LJFF(LIZLLL, str)) {
            return null;
        }
        PortraitStylesResponse portraitStylesResponse = LIZJ;
        if (portraitStylesResponse == null) {
            return null;
        }
        List<PortraitStyleItem> list = portraitStylesResponse.styles;
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            LIZJ = null;
            LJ = 0L;
            return null;
        }
        if (SystemClock.elapsedRealtime() - LJ >= ((long) ((Number) C0AQF.LIZ.getValue()).intValue()) * 1000) {
            LIZJ = null;
            LJ = 0L;
            return null;
        }
        return portraitStylesResponse;
    }

    public final synchronized void LIZ(String str, List<PortraitStyleItem> list) {
        if (!Intrinsics.LJFF(LIZLLL, str)) {
            LIZIZ = null;
            LIZJ = null;
            LJ = 0L;
        }
        if (list.isEmpty()) {
            return;
        }
        LIZIZ = list;
        LIZLLL = str;
    }
}
