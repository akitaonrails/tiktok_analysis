package X;

import android.content.Context;
import com.bytedance.android.live.broadcast.model.AcademyCourseTheme;
import com.bytedance.android.live.broadcast.model.SurveyAnswer;
import com.bytedance.android.live.broadcast.model.SurveyResponse;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.11w2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19660411w2 {
    public static AcademyCourseTheme LIZIZ;
    public static SurveyAnswer LIZJ;
    public static String LJI;
    public static String LJII;
    public static Long LJIIIIZZ;
    public static final C19660411w2 LIZ = new C19660411w2();
    public static String LIZLLL = "";
    public static String LJ = "";
    public static int LJFF = -1;

    public static void LIZ() {
        LIZIZ = null;
        LIZJ = null;
        LIZLLL = "";
        LJ = "";
        LJFF = -1;
        LJI = null;
        LJII = null;
        LJIIIIZZ = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.11w7] */
    public static void LIZIZ(Boolean bool, String str) {
        if (str != null && bool != null && !Intrinsics.LJFF(bool, Boolean.FALSE)) {
            ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().LJL(Long.valueOf(CastLongProtector.parseLong(str)), new InterfaceC19661511wD() { // from class: X.11w7
                @Override // X.InterfaceC19661511wD
                public final void onFailed() {
                }

                @Override // X.InterfaceC19661511wD
                public final void LIZ(SurveyResponse surveyResponse) {
                    C19660411w2 c19660411w2 = C19660411w2.LIZ;
                    AcademyCourseTheme academyCourseTheme = surveyResponse.courseTheme;
                    c19660411w2.getClass();
                    C19660411w2.LIZIZ = academyCourseTheme;
                }
            });
        }
    }

    public static void LIZJ(Context context, String str, String str2, boolean z) {
        if (context != null) {
            if (z) {
                C1233040iBy c1233040iBy = new C1233040iBy(context);
                c1233040iBy.LIZJ(context.getString(2131843196));
                C1389890mGx c1389890mGx = c1233040iBy.LIZIZ;
                if (c1389890mGx != null) {
                    c1389890mGx.LJFF(R.raw.icon_tick_fill_small);
                }
                int iLIZ = C960203pA.LIZ(R.attr.a0i, context);
                C1389890mGx c1389890mGx2 = c1233040iBy.LIZIZ;
                if (c1389890mGx2 != null) {
                    c1389890mGx2.LJI(iLIZ);
                }
                c1233040iBy.LIZLLL();
            } else {
                C1233040iBy c1233040iBy2 = new C1233040iBy(context);
                c1233040iBy2.LIZJ(context.getString(2131843192));
                c1233040iBy2.LIZLLL();
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(0, "A");
        linkedHashMap.put(1, "B");
        linkedHashMap.put(2, "C");
        linkedHashMap.put(3, "Other");
        C505201xy c505201xy = C505201xy.LIZ;
        String str3 = LJ;
        String str4 = (String) linkedHashMap.get(Integer.valueOf(LJFF));
        if (str4 == null) {
            str4 = "";
        }
        Long l = LJIIIIZZ;
        String str5 = LJII;
        String str6 = LJI;
        c505201xy.getClass();
        C505201xy.LIZJ(false, true, z, str, str3, "submit", str4, str2, l, str5, str6);
        LIZ();
    }
}
