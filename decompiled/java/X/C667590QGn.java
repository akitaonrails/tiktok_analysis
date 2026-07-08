package X;

import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.music.service.IMusicDetailService;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QGn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C667590QGn {
    public static final C667590QGn LIZ = new C667590QGn();
    public static String LIZIZ;

    public static boolean LIZ() {
        return (!C0BRD.LIZ() || ((Number) C272390Alx.LIZ.getValue()).intValue() == 0 || C293280BeY.LIZ) ? false : true;
    }

    public static boolean LIZIZ(C0QER c0qer) {
        IMusicDetailService iMusicDetailService = (IMusicDetailService) PluggableExtentionKt.pluggableSpi$default(IMusicDetailService.class, false, false, false, 14, null);
        if (iMusicDetailService == null || !iMusicDetailService.LIZIZ()) {
            return false;
        }
        String enterSearchFrom = c0qer.getEnterSearchFrom();
        String enterFromMusicId = c0qer.getEnterFromMusicId();
        if (!Intrinsics.LJFF(enterSearchFrom, "single_song") || !C123100dR.LIZ(enterFromMusicId)) {
            return false;
        }
        return true;
    }

    public static boolean LIZJ(Intent intent) {
        String keyword;
        SearchResultParam searchResultParam;
        try {
            searchResultParam = (SearchResultParam) intent.getSerializableExtra("searchParam");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (searchResultParam == null || (keyword = searchResultParam.getKeyword()) == null) {
            keyword = "";
        }
        return TextUtils.isEmpty(keyword);
    }
}
