package X;

import android.content.Context;
import com.ss.android.ugc.aweme.vibefeed.feed.topbar.assem.VibeFeedMenuAssem;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0r5D, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final /* synthetic */ class C1574810r5D extends C2217421BqW implements Function0<Boolean> {
    public C1574810r5D(VibeFeedMenuAssem vibeFeedMenuAssem) {
        super(0, vibeFeedMenuAssem, VibeFeedMenuAssem.class, "onSharedLikeHistoryClicked", "onSharedLikeHistoryClicked()Z", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        String str;
        String str2;
        String str3;
        EnumC912680ZrG enumC912680ZrG;
        String str4;
        VibeFeedMenuAssem vibeFeedMenuAssem = (VibeFeedMenuAssem) this.receiver;
        vibeFeedMenuAssem.getClass();
        C1575940r72 c1575940r72 = C1575940r72.LIZ;
        Context context = vibeFeedMenuAssem.LJJIJL().getContext();
        C636770OyJ c636770OyJGo = vibeFeedMenuAssem.Go();
        String str5 = c636770OyJGo != null ? c636770OyJGo.LLILZ : null;
        String str6 = "";
        if (str5 == null) {
            str5 = "";
        }
        C636770OyJ c636770OyJGo2 = vibeFeedMenuAssem.Go();
        if (c636770OyJGo2 == null || (str = c636770OyJGo2.LLILLJJLI) == null) {
            str = "";
        }
        C636770OyJ c636770OyJGo3 = vibeFeedMenuAssem.Go();
        if (c636770OyJGo3 == null || (str2 = c636770OyJGo3.LLIZ) == null) {
            str2 = "shared_feed";
        }
        c1575940r72.getClass();
        C1575940r72.LIZ(0, context, str5, str, "", "", "shared_feed_top_button", str2);
        C1575290r5z c1575290r5z = C1575290r5z.LIZ;
        C636770OyJ c636770OyJGo4 = vibeFeedMenuAssem.Go();
        if (c636770OyJGo4 == null || (str3 = c636770OyJGo4.LLILZ) == null) {
            str3 = "";
        }
        C0P38 c0p38LIZ = C0P30.LIZ();
        C636770OyJ c636770OyJGo5 = vibeFeedMenuAssem.Go();
        if (c636770OyJGo5 != null && (str4 = c636770OyJGo5.LLILZ) != null) {
            str6 = str4;
        }
        String strLIZLLL = c0p38LIZ.LIZLLL(str6);
        C636770OyJ c636770OyJGo6 = vibeFeedMenuAssem.Go();
        if (c636770OyJGo6 == null || (enumC912680ZrG = c636770OyJGo6.LL) == null) {
            enumC912680ZrG = EnumC912680ZrG.MUTUAL_FEED_SCENE_PRIVATE;
        }
        c1575290r5z.getClass();
        C1575290r5z.LIZLLL("shared_like_history", strLIZLLL, str3, enumC912680ZrG);
        return Boolean.TRUE;
    }
}
