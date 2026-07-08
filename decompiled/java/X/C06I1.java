package X;

import android.app.Activity;
import com.bytedance.forest.Forest;
import com.bytedance.forest.model.RequestParams;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AwS116S1100000_2;

/* JADX INFO: renamed from: X.06I1, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06I1 {
    public static final C06I1 LIZIZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZJ;
    public static C15401061f LIZLLL;
    public static Boolean LJ;
    public static final C01GW LJFF;
    public static final C054G LJI;
    public static final ConcurrentHashMap<C15386060q, String> LJII;
    public volatile C1598406Nq LIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C06I1.class, "ttDispatchers", "getTtDispatchers()Lcom/ss/android/ugc/aweme/im/saas/host/api/utils/IMDispatchers;", 0);
        C13LE.LIZ.getClass();
        LIZJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        C06I1 c06i1 = new C06I1();
        LIZIZ = c06i1;
        LJFF = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(928));
        C1598406Nq c1598406Nq = c06i1.LIZ;
        if (c1598406Nq == null) {
            synchronized (c06i1) {
                c1598406Nq = c06i1.LIZ;
                if (c1598406Nq == null) {
                    c1598406Nq = (C1598406Nq) C1807670x8n.LLLLLJIL();
                    c06i1.LIZ = c1598406Nq;
                }
            }
        }
        LJI = C2296808zG.LIZ(c1598406Nq.LIZ);
        LJII = new ConcurrentHashMap<>();
    }

    public static boolean LIZJ() {
        Activity activityLIZIZ;
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        return (abstractC1387200mCcLJ == null || (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) == null || !C960203pA.LIZIZ(activityLIZIZ)) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ(C118300cf c118300cf, C259800zU c259800zU, C259800zU c259800zU2, Function1 function1) {
        boolean z;
        CharSequence charSequence;
        if (c118300cf.element < 2) {
            return;
        }
        CharSequence charSequence2 = (CharSequence) c259800zU.element;
        if (charSequence2 != null && charSequence2.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z && (charSequence = (CharSequence) c259800zU2.element) != null && charSequence.length() != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("fetchGeckoResources success, configFilePath=");
            sbLIZ.append((String) c259800zU.element);
            sbLIZ.append(", mp4FilePath=");
            sbLIZ.append((String) c259800zU2.element);
            C2188811AlT.LIZIZ(sbLIZ);
            C15401061f c15401061f = new C15401061f((String) c259800zU.element, (String) c259800zU2.element);
            LIZLLL = c15401061f;
            LIZIZ.getClass();
            LJ = Boolean.valueOf(LIZJ());
            if (function1 != null) {
                function1.invoke(c15401061f);
                return;
            }
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("fetchGeckoResources failed, configFilePath=");
        sbLIZ2.append((String) c259800zU.element);
        sbLIZ2.append(", mp4FilePath=");
        sbLIZ2.append((String) c259800zU2.element);
        C062H.LIZIZ("SmartReplyGeckoHelper", C2188811AlT.LIZIZ(sbLIZ2));
        if (function1 == null) {
            return;
        }
        function1.invoke(null);
    }

    public static void LIZIZ(String str, String str2, String str3, Function1 function1) {
        Forest forest = (Forest) LJFF.getValue();
        if (forest != null) {
            RequestParams requestParams = new RequestParams(null, 1, null);
            requestParams.disableBuiltin = true;
            requestParams.resourceScene = EnumC1533980q1M.OTHER;
            requestParams.enableRequestReuse = true;
            requestParams.enableCDNCache = Boolean.TRUE;
            requestParams.channel = str;
            requestParams.bundle = str2;
            forest.fetchResourceAsync(str3, requestParams, new AwS116S1100000_2(str2, (String) function1, (Function1<? super C1533790q13, Unit>) 9));
        }
    }
}
