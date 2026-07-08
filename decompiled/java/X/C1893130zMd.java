package X;

import android.content.Context;
import android.widget.ImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.poi.experiment.PoiThirdPartyRetainConfig;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS46S2100000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zMd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1893130zMd {
    public static boolean LIZIZ;
    public static boolean LIZLLL;
    public static final C1893130zMd LIZ = new C1893130zMd();
    public static final Map<String, Object> LIZJ = new LinkedHashMap();

    public static void LIZ(C1397580mTM c1397580mTM) {
        String str;
        PoiThirdPartyRetainConfig.RetainConfig retainConfigLIZ = PoiThirdPartyRetainConfig.LIZ();
        String str2 = null;
        if (retainConfigLIZ != null) {
            str = retainConfigLIZ.clickBtnWord;
        } else {
            str = null;
        }
        PoiThirdPartyRetainConfig.RetainConfig retainConfigLIZ2 = PoiThirdPartyRetainConfig.LIZ();
        if (retainConfigLIZ2 != null) {
            str2 = retainConfigLIZ2.jumpBtnWord;
        }
        if (str != null && str2 != null) {
            C1238130iKB.LIZ(c1397580mTM, new AwS46S2100000_28(str, str2, c1397580mTM, 5));
        }
    }

    public static void LIZIZ(C1397580mTM c1397580mTM, Context context) {
        String str;
        PoiThirdPartyRetainConfig.RetainConfig retainConfigLIZ = PoiThirdPartyRetainConfig.LIZ();
        if (retainConfigLIZ != null && Intrinsics.LJFF(retainConfigLIZ.useLogo, Boolean.TRUE)) {
            TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
            PoiThirdPartyRetainConfig.RetainConfig retainConfigLIZ2 = PoiThirdPartyRetainConfig.LIZ();
            if (retainConfigLIZ2 != null) {
                str = retainConfigLIZ2.logoKey;
            } else {
                str = null;
            }
            Intrinsics.LJFF(str, "sorry_to_see_you_go_light");
            tuxIconView.setIconRes(R.drawable.s8);
            tuxIconView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            tuxIconView.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(278)));
            tuxIconView.setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(119)));
            C340280DVq c340280DVq = new C340280DVq(context, tuxIconView);
            c340280DVq.LJFF = -1;
            c340280DVq.LJI = -1;
            c1397580mTM.LJIIIZ = c340280DVq;
        }
    }

    public static boolean LIZJ(Context context, boolean z) {
        String str;
        String str2;
        String string;
        String str3;
        String str4;
        if (!LIZLLL && PoiThirdPartyRetainConfig.LIZ() != null) {
            if (LIZIZ) {
                if (z) {
                    Object obj = ((LinkedHashMap) LIZJ).get("local_service_key_category");
                    if (obj == null || (string = obj.toString()) == null) {
                        string = "";
                    }
                    boolean zLIZIZ = C2281621ESi.LIZ(string).LIZIZ();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("keyCategory: ");
                    sbLIZ.append(string);
                    sbLIZ.append("; hitFrequency: ");
                    sbLIZ.append(zLIZIZ);
                    C2188811AlT.LIZIZ(sbLIZ);
                    if (!zLIZIZ) {
                        C1397580mTM c1397580mTM = new C1397580mTM(context);
                        LIZIZ(c1397580mTM, context);
                        PoiThirdPartyRetainConfig.RetainConfig retainConfigLIZ = PoiThirdPartyRetainConfig.LIZ();
                        if (retainConfigLIZ != null && (str4 = retainConfigLIZ.title) != null) {
                            c1397580mTM.LJI(str4);
                        }
                        PoiThirdPartyRetainConfig.RetainConfig retainConfigLIZ2 = PoiThirdPartyRetainConfig.LIZ();
                        if (retainConfigLIZ2 != null && (str3 = retainConfigLIZ2.subTitle) != null) {
                            c1397580mTM.LIZIZ(str3);
                        }
                        LIZ(c1397580mTM);
                        c1397580mTM.LJII = false;
                        new C1397510mTF(c1397580mTM).LIZLLL();
                        C2281621ESi.LIZ(string).LJI(true);
                        C1892770zM3.LIZ.getClass();
                        C1892770zM3.LJII();
                        return true;
                    }
                }
            } else {
                C1397580mTM c1397580mTM2 = new C1397580mTM(context);
                LIZIZ(c1397580mTM2, context);
                PoiThirdPartyRetainConfig.RetainConfig retainConfigLIZ3 = PoiThirdPartyRetainConfig.LIZ();
                if (retainConfigLIZ3 != null && (str2 = retainConfigLIZ3.title) != null) {
                    c1397580mTM2.LJI(str2);
                }
                PoiThirdPartyRetainConfig.RetainConfig retainConfigLIZ4 = PoiThirdPartyRetainConfig.LIZ();
                if (retainConfigLIZ4 != null && (str = retainConfigLIZ4.subTitle) != null) {
                    c1397580mTM2.LIZIZ(str);
                }
                LIZ(c1397580mTM2);
                c1397580mTM2.LJII = false;
                new C1397510mTF(c1397580mTM2).LIZLLL();
                C1892770zM3.LIZ.getClass();
                C1892770zM3.LJII();
                return true;
            }
        }
        return false;
    }
}
