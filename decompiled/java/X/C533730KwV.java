package X;

import Y.ACallableS411S0100000_3;
import android.content.Context;
import android.content.res.Resources;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.UploadSingleSelectData;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KwV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C533730KwV {
    public static final C533730KwV LIZ = new C533730KwV();

    public static int LJII() {
        return C1444820nhY.LIZIZ ? 35 : 12;
    }

    public static boolean LIZJ() {
        UploadSingleSelectData uploadSingleSelectDataLIZ;
        if (!((IAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getStoryService().LJI() || C0CHQ.LIZ().getAccountService().LIZ()) {
            if (!C527910Kn7.LIZ.contains(Integer.valueOf(C527910Kn7.LIZIZ)) || (uploadSingleSelectDataLIZ = C527940KnA.LIZ()) == null || !uploadSingleSelectDataLIZ.getUploadAllTabNonStory() || !C527940KnA.LIZIZ()) {
                return false;
            }
        }
        return C1444820nhY.LIZIZ;
    }

    public static int LJIIIZ() {
        return (!C289500BWi.LIZ() || C0CHQ.LIZ().getAccountService().LIZ()) ? LJII() : ((Number) C533740KwW.LIZ.getValue()).intValue();
    }

    public static void LIZIZ(File file) {
        if (file == null || !file.exists()) {
            return;
        }
        if (file.isDirectory()) {
            C089E c089e = new C089E(file.listFiles());
            while (c089e.hasNext()) {
                LIZIZ((File) c089e.next());
            }
        }
        file.delete();
    }

    public static NLEResType LJ(String str) {
        if (C297420BlE.LIZ()) {
            Boolean mediaTypeCache = C0CHQ.LIZ().LJIILL().getMediaTypeCache(str);
            if (Intrinsics.LJFF(mediaTypeCache, Boolean.TRUE)) {
                return NLEResType.IMAGE;
            }
            if (Intrinsics.LJFF(mediaTypeCache, Boolean.FALSE)) {
                return NLEResType.VIDEO;
            }
            if (C2286708xd.LJIILL(str)) {
                return NLEResType.IMAGE;
            }
            return NLEResType.VIDEO;
        }
        if (C2286708xd.LJIILL(str)) {
            return NLEResType.IMAGE;
        }
        return NLEResType.VIDEO;
    }

    public static String LJFF(CreativeInfo creativeInfo) {
        return C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJIJJ(creativeInfo);
    }

    public static String LJI(Context context) {
        String string;
        Resources resources;
        if (context != null && (resources = context.getResources()) != null) {
            string = resources.getString(2131830079);
        } else {
            string = null;
        }
        return C786410Ut5.j4(string, Arrays.copyOf(new Object[]{Integer.valueOf(LJII())}, 1));
    }

    public static String LJIIIIZZ(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd-HHmmssSSS", Locale.US);
        Date time = Calendar.getInstance(TimeZone.getTimeZone("GMT+8")).getTime();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(simpleDateFormat.format(time));
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static boolean LJIIJ(String str) {
        Boolean mediaTypeCache = C0CHQ.LIZ().LJIILL().getMediaTypeCache(str);
        if (mediaTypeCache != null) {
            return mediaTypeCache.booleanValue();
        }
        C0CHQ.LIZ().LJIILL().updateMediaTypeCache(str);
        return C2471909mP.LJJIII(str, true, 4);
    }

    public static void LIZ(List list, InterfaceC2471609mM interfaceC2471609mM) {
        if (C580130Mp9.LIZ(list)) {
            interfaceC2471609mM.LIZ(false);
        } else {
            C15O7.LIZJ(new ACallableS411S0100000_3(list, (List<? extends MediaModel>) 16)).LJ(new C2501509rB(interfaceC2471609mM, 7), C15O7.LJIIIIZZ, null);
        }
    }

    public static boolean LIZLLL(int i, boolean z) {
        if (i == 15) {
            return false;
        }
        if (i == 6 || i == 18 || i == 22 || i == 24 || i == 40 || i == 42 || i == 51 || i == 54 || i == 57 || i == 60 || i == 36 || i == 37) {
            return true;
        }
        if (i == 29) {
            if (C527950KnB.LIZ() == 0) {
                return true;
            }
        } else if (i == 16) {
            return true;
        }
        if (!C1444820nhY.LIZIZ) {
            if (!C989140bqa.LIZ() || !C988990bqL.LIZ() || i != 2) {
                return false;
            }
        } else {
            if (i != 3 && i != 12) {
                if (i == 19) {
                    return true;
                }
            } else if (!z) {
                return false;
            }
            if (i == 4 || i == 10 || i == 27 || i == 37 || i == 46 || i == 30 || i == 35 || i == 48 || i == 54) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJIIJJI(X.C533730KwV r9, com.ss.android.ugc.aweme.creative.model.CreativeInfo r10, java.util.ArrayList r11, java.util.ArrayList r12, long r13, int r15) {
        /*
            Method dump skipped, instruction units count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C533730KwV.LJIIJJI(X.0KwV, com.ss.android.ugc.aweme.creative.model.CreativeInfo, java.util.ArrayList, java.util.ArrayList, long, int):boolean");
    }
}
