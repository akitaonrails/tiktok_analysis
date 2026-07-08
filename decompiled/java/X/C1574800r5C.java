package X;

import android.content.Context;
import com.ss.android.ugc.aweme.vibefeed.feed.topbar.assem.VibeFeedMenuAssem;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS10S2300000_24;

/* JADX INFO: renamed from: X.0r5C, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final /* synthetic */ class C1574800r5C extends C2217421BqW implements Function0<Boolean> {
    public C1574800r5C(VibeFeedMenuAssem vibeFeedMenuAssem) {
        super(0, vibeFeedMenuAssem, VibeFeedMenuAssem.class, "onTurnOffClicked", "onTurnOffClicked()Z", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        String str;
        EnumC912680ZrG enumC912680ZrG;
        String str2;
        C1574790r5B c1574790r5B;
        String str3;
        String str4;
        VibeFeedMenuAssem vibeFeedMenuAssem = (VibeFeedMenuAssem) this.receiver;
        vibeFeedMenuAssem.getClass();
        C1575290r5z c1575290r5z = C1575290r5z.LIZ;
        C636770OyJ c636770OyJGo = vibeFeedMenuAssem.Go();
        String str5 = c636770OyJGo != null ? c636770OyJGo.LLILZ : null;
        String str6 = "";
        if (str5 == null) {
            str5 = "";
        }
        C0P38 c0p38LIZ = C0P30.LIZ();
        C636770OyJ c636770OyJGo2 = vibeFeedMenuAssem.Go();
        if (c636770OyJGo2 == null || (str = c636770OyJGo2.LLILZ) == null) {
            str = "";
        }
        String strLIZLLL = c0p38LIZ.LIZLLL(str);
        C636770OyJ c636770OyJGo3 = vibeFeedMenuAssem.Go();
        if (c636770OyJGo3 == null || (enumC912680ZrG = c636770OyJGo3.LL) == null) {
            enumC912680ZrG = EnumC912680ZrG.MUTUAL_FEED_SCENE_PRIVATE;
        }
        c1575290r5z.getClass();
        C1575290r5z.LIZLLL("turn_off_shared_feed", strLIZLLL, str5, enumC912680ZrG);
        Context context = vibeFeedMenuAssem.LJJIJL().getContext();
        if (context != null) {
            C636770OyJ c636770OyJGo4 = vibeFeedMenuAssem.Go();
            if (c636770OyJGo4 == null || (str2 = c636770OyJGo4.LLILZ) == null) {
                str2 = "";
            }
            String strLIZLLL2 = C0P30.LIZ().LIZLLL(str2);
            EnumC912680ZrG enumC912680ZrGLJI = C1575440r6E.LJI(str2);
            if (enumC912680ZrGLJI.isGroup()) {
                c1574790r5B = new C1574790r5B(context.getString(2131835341), context.getString(2131835338), vibeFeedMenuAssem.Ho(2131835339), vibeFeedMenuAssem.Ho(2131835340));
            } else {
                C636770OyJ c636770OyJGo5 = vibeFeedMenuAssem.Go();
                String strLJ = C1575440r6E.LJ(c636770OyJGo5 != null ? c636770OyJGo5.LLILLJJLI : null);
                if (strLJ == null) {
                    strLJ = "";
                }
                c1574790r5B = new C1574790r5B(context.getString(2131848011, strLJ), context.getString(2131848008, strLJ), vibeFeedMenuAssem.Ho(2131848009), vibeFeedMenuAssem.Ho(2131848010));
            }
            C1397580mTM c1397580mTM = new C1397580mTM(context);
            c1397580mTM.LJI(c1574790r5B.LIZ);
            c1397580mTM.LIZIZ(c1574790r5B.LIZIZ);
            C985403tE.LIZ(c1397580mTM, new AwS10S2300000_24(c1574790r5B, vibeFeedMenuAssem, str2, strLIZLLL2, enumC912680ZrGLJI, 2));
            new C1397510mTF(c1397580mTM).LIZLLL();
            C636770OyJ c636770OyJGo6 = vibeFeedMenuAssem.Go();
            if (c636770OyJGo6 == null || (str3 = c636770OyJGo6.LLILZ) == null) {
                str3 = "";
            }
            C0P38 c0p38LIZ2 = C0P30.LIZ();
            C636770OyJ c636770OyJGo7 = vibeFeedMenuAssem.Go();
            if (c636770OyJGo7 != null && (str4 = c636770OyJGo7.LLILZ) != null) {
                str6 = str4;
            }
            C1575290r5z.LJFF(str3, c0p38LIZ2.LIZLLL(str6), "turn_off_popup", enumC912680ZrGLJI);
        }
        return Boolean.TRUE;
    }
}
