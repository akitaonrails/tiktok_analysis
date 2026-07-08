package X;

import android.content.Context;
import com.ss.android.ugc.aweme.vibefeed.feed.topbar.assem.VibeFeedMenuAssem;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0r5E, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final /* synthetic */ class C1574820r5E extends C2217421BqW implements Function0<Boolean> {
    public C1574820r5E(VibeFeedMenuAssem vibeFeedMenuAssem) {
        super(0, vibeFeedMenuAssem, VibeFeedMenuAssem.class, "onIntroductionClicked", "onIntroductionClicked()Z", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        String str;
        String str2;
        String str3;
        EnumC912680ZrG enumC912680ZrG;
        String str4;
        VibeFeedMenuAssem vibeFeedMenuAssem = (VibeFeedMenuAssem) this.receiver;
        Context context = vibeFeedMenuAssem.getContext();
        if (context != null) {
            C0P38 c0p38LIZ = C0P30.LIZ();
            C636770OyJ c636770OyJGo = vibeFeedMenuAssem.Go();
            String str5 = c636770OyJGo != null ? c636770OyJGo.LLILZ : null;
            String str6 = "";
            if (str5 == null) {
                str5 = "";
            }
            String strLIZLLL = c0p38LIZ.LIZLLL(str5);
            C1575940r72 c1575940r72 = C1575940r72.LIZ;
            C636770OyJ c636770OyJGo2 = vibeFeedMenuAssem.Go();
            if (c636770OyJGo2 == null || (str = c636770OyJGo2.LLILZ) == null) {
                str = "";
            }
            C636770OyJ c636770OyJGo3 = vibeFeedMenuAssem.Go();
            if (c636770OyJGo3 == null || (str2 = c636770OyJGo3.LLILLJJLI) == null) {
                str2 = "";
            }
            C636770OyJ c636770OyJGo4 = vibeFeedMenuAssem.Go();
            if (c636770OyJGo4 == null || (str3 = c636770OyJGo4.LLIZ) == null) {
                str3 = "shared_feed";
            }
            c1575940r72.getClass();
            C1575940r72.LIZIZ(context, str, str2, "", "menu_bar", str3, null);
            C1575290r5z c1575290r5z = C1575290r5z.LIZ;
            C636770OyJ c636770OyJGo5 = vibeFeedMenuAssem.Go();
            if (c636770OyJGo5 != null && (str4 = c636770OyJGo5.LLILZ) != null) {
                str6 = str4;
            }
            C636770OyJ c636770OyJGo6 = vibeFeedMenuAssem.Go();
            if (c636770OyJGo6 == null || (enumC912680ZrG = c636770OyJGo6.LL) == null) {
                enumC912680ZrG = EnumC912680ZrG.MUTUAL_FEED_SCENE_PRIVATE;
            }
            c1575290r5z.getClass();
            C1575290r5z.LIZLLL("introduction", strLIZLLL, str6, enumC912680ZrG);
        }
        return Boolean.TRUE;
    }
}
