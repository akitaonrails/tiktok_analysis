package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0SkG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C729980SkG {
    public static String LIZJ(Aweme aweme) {
        if (aweme != null) {
            return aweme.getAid();
        }
        return "";
    }

    public static Aweme LIZLLL(Aweme aweme) {
        if (aweme == null) {
            return null;
        }
        if (AwemeSaaSExtKt.isForwardAweme(aweme)) {
            return aweme.getForwardItem();
        }
        return aweme;
    }

    public static Aweme LJ(String str) {
        Aweme awemeLLILZ = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).LLILZ(str);
        if (awemeLLILZ == null) {
            Aweme awemeAr = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).Ar(str);
            if (awemeAr == null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("getAweme ");
                sbLIZ.append(str);
                sbLIZ.append(" is null, mock one");
                C2344809Gs.LIZLLL(6, "DeleteAweme", C2188811AlT.LIZIZ(sbLIZ));
                Aweme aweme = new Aweme();
                aweme.setAid(str);
                return aweme;
            }
            return awemeAr;
        }
        return awemeLLILZ;
    }

    public static boolean LJI(Aweme aweme) {
        if (aweme != null && LJIIIIZZ(aweme) && AwemeExtKt.isProhibited(aweme)) {
            return true;
        }
        return false;
    }

    public static void LJII(Aweme aweme) {
        if (aweme != null && aweme.getHotListStruct() != null) {
            aweme.getHotListStruct().getType();
        }
    }

    public static boolean LJIIIIZZ(Aweme aweme) {
        User author;
        if (aweme != null && (author = aweme.getAuthor()) != null) {
            return TextUtils.equals(author.getUid(), C0XQ7.LJFF().getCurUser().getUid());
        }
        return false;
    }

    public static boolean LJIIIZ(Aweme aweme) {
        if (aweme != null && aweme.getContentModel() != null && aweme.getContentModel().standardBusinessModel != null && aweme.getContentModel().standardBusinessModel.getImInfo() != null && aweme.getContentModel().standardBusinessModel.getImInfo().recType == 1) {
            return true;
        }
        return false;
    }

    public static boolean LJIIJJI(Aweme aweme) {
        if (aweme != null && aweme.getAwemeRiskModel() != null) {
            if (aweme.getAwemeRiskModel().isWarn() || aweme.getAwemeRiskModel().isNotice()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static int LIZ(Aweme aweme, Collection collection) {
        int i = -1;
        if (aweme != null && aweme.getAid() != null && collection != null && !collection.isEmpty()) {
            String aid = aweme.getAid();
            Iterator it2 = collection.iterator();
            int i2 = 0;
            while (it2.hasNext()) {
                Aweme aweme2 = (Aweme) it2.next();
                if (aweme2 != null && aid.equals(aweme2.getAid())) {
                    if (!AwemeExtKt.isLiveNoDeduplicate(aweme) && !AwemeExtKt.isLiveNoDeduplicateClient(aweme)) {
                        it2.remove();
                    } else if (TextUtils.equals(AwemeSaaSExtKt.getUniqueId(aweme), AwemeSaaSExtKt.getUniqueId(aweme2))) {
                        it2.remove();
                    }
                    i = i2;
                    break;
                }
                i2++;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("delete aweme : ");
            sbLIZ.append(aid);
            sbLIZ.append(", index is ");
            sbLIZ.append(i);
            C2344809Gs.LIZLLL(6, "DeleteAweme", C2188811AlT.LIZIZ(sbLIZ));
            if (AwemeBizExtKt.getSubAweme(aweme) != null) {
                collection.remove(AwemeBizExtKt.getSubAweme(aweme));
            }
            return i;
        }
        C2344809Gs.LIZLLL(6, "DeleteAweme", "aweme is null or items is null, delete failed");
        return -1;
    }

    public static int LJFF(Aweme aweme, List list) {
        if (aweme != null && aweme.getAid() != null && list != null && !list.isEmpty()) {
            String aid = aweme.getAid();
            for (int i = 0; i < list.size(); i++) {
                Aweme aweme2 = (Aweme) ListProtector.get(list, i);
                if (aweme2 != null && aid.equals(aweme2.getAid())) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static int LJIIJ(Aweme aweme, List list) {
        if (aweme != null && aweme.getAid() != null && list != null && !list.isEmpty()) {
            String aid = aweme.getAid();
            for (int size = list.size() - 1; size > -1; size--) {
                Aweme aweme2 = (Aweme) ListProtector.get(list, size);
                if (aweme2 != null && aid.equals(aweme2.getAid())) {
                    return size;
                }
            }
        }
        return -1;
    }

    public static void LJIILIIL(List<InterfaceC1526205yG> list, List<Aweme> list2) {
        if (!C086I.LIZIZ(list) && !C086I.LIZIZ(list2)) {
            for (InterfaceC1526205yG interfaceC1526205yG : list) {
                if (interfaceC1526205yG instanceof InterfaceC1255940imu) {
                    ((InterfaceC1255940imu) interfaceC1526205yG).L4(list2);
                }
            }
        }
    }

    public static boolean LIZIZ(Collection<Aweme> collection, Aweme aweme, List<InterfaceC1526205yG> list) {
        int iLIZ = LIZ(aweme, collection);
        LJIIL(aweme, list, iLIZ);
        if (iLIZ >= 0) {
            return true;
        }
        return false;
    }

    public static void LJIIL(Aweme aweme, List list, int i) {
        if (i >= 0 && !C086I.LIZIZ(list)) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                InterfaceC1526205yG interfaceC1526205yG = (InterfaceC1526205yG) it2.next();
                if (interfaceC1526205yG instanceof InterfaceC1255940imu) {
                    InterfaceC1255940imu interfaceC1255940imu = (InterfaceC1255940imu) interfaceC1526205yG;
                    interfaceC1255940imu.Y1(i);
                    interfaceC1255940imu.V1(i, aweme);
                }
            }
        }
    }
}
