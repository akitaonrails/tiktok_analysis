package X;

import Y.AObjectS195S0300000_21;
import android.app.Activity;
import android.content.pm.PackageManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Collections;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0lOa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1356180lOa extends C09AY implements Function1<C1397630mTR, Unit> {
    public final /* synthetic */ C1397580mTM LL;
    public final /* synthetic */ Activity LLILLJJLI;
    public final /* synthetic */ Aweme LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ EnumC1341630l17 LLILZIL;
    public final /* synthetic */ EnumC1356100lOS LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ Map<String, String> LLIZLLLIL;
    public final /* synthetic */ Map<String, String> LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1356180lOa(C1397580mTM c1397580mTM, Activity activity, Aweme aweme, String str, EnumC1341630l17 enumC1341630l17, EnumC1356100lOS enumC1356100lOS, String str2, Map<String, String> map, Map<String, String> map2) {
        super(1);
        this.LL = c1397580mTM;
        this.LLILLJJLI = activity;
        this.LLILLL = aweme;
        this.LLILZ = str;
        this.LLILZIL = enumC1341630l17;
        this.LLILZLL = enumC1356100lOS;
        this.LLIZ = str2;
        this.LLIZLLLIL = map;
        this.LLJ = map2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1397630mTR c1397630mTR) {
        C1397630mTR c1397630mTR2 = c1397630mTR;
        String string = this.LL.LIZ.getString(2131850820);
        final Activity activity = this.LLILLJJLI;
        final Aweme aweme = this.LLILLL;
        final String str = this.LLILZ;
        final EnumC1341630l17 enumC1341630l17 = this.LLILZIL;
        final EnumC1356100lOS enumC1356100lOS = this.LLILZLL;
        final String str2 = this.LLIZ;
        final Map<String, String> map = this.LLIZLLLIL;
        final Map<String, String> map2 = this.LLJ;
        c1397630mTR2.LIZJ(0, string, new Function1<C1397660mTU, Unit>() { // from class: X.0lOX
            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(C1397660mTU c1397660mTU) {
                boolean z;
                String str3;
                String str4;
                PackageManager packageManager;
                C1356140lOW c1356140lOW = C1356140lOW.LIZ;
                Activity activity2 = activity;
                Aweme aweme2 = aweme;
                String str5 = str;
                EnumC1341630l17 enumC1341630l172 = enumC1341630l17;
                EnumC1356100lOS enumC1356100lOS2 = enumC1356100lOS;
                String str6 = str2;
                Map<String, String> map3 = map;
                String str7 = map2.get("enter_from");
                String str8 = "";
                if (str7 == null) {
                    str7 = "";
                }
                c1356140lOW.getClass();
                C1356140lOW.LIZ(activity2, aweme2, str5, enumC1341630l172, enumC1356100lOS2, str6, map3, str7);
                Activity activity3 = activity;
                String str9 = C1065200dpG.LIZ().lemon8PkgName;
                try {
                    packageManager = activity3.getPackageManager();
                    z = true;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (C786410Ut5.Y3(packageManager, str9, 1) == null) {
                    z = false;
                }
                C1356160lOY c1356160lOY = C1356160lOY.LIZ;
                Aweme aweme3 = aweme;
                String str10 = map2.get("enter_from");
                if (str10 == null) {
                    str10 = "";
                }
                String value = enumC1356100lOS.getValue();
                String str11 = "open_app";
                if (z) {
                    str3 = "open_app";
                } else {
                    str3 = "install";
                }
                c1356160lOY.getClass();
                C1356160lOY.LIZIZ(str10, value, str3, aweme3);
                String aid = aweme.getAid();
                if (aid != null) {
                    str8 = aid;
                }
                String value2 = enumC1356100lOS.getValue();
                if (Collections.singletonList(EnumC1356100lOS.BOTTOM_BUTTON).contains(enumC1356100lOS)) {
                    str4 = "1";
                } else {
                    str4 = CardStruct.IStatusCode.DEFAULT;
                }
                if (!z) {
                    str11 = "install";
                }
                C1356160lOY.LIZLLL(c1356160lOY, str8, "lemon8_detail_popup", value2, str4, str11);
                return Unit.LIZ;
            }
        });
        c1397630mTR2.LIZJ(1, this.LL.LIZ.getString(2131850819), new AObjectS195S0300000_21(this.LLILLL, this.LLJ, this.LLILZLL, 1));
        return Unit.LIZ;
    }
}
