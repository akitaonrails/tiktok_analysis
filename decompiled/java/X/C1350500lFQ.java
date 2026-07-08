package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CommentTopBarComponent;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS54S0500000_21;

/* JADX INFO: renamed from: X.0lFQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1350500lFQ {
    public static final C1350500lFQ LIZ = new C1350500lFQ();
    public static final ConcurrentHashMap<Integer, ICommentTopBarImplementService> LIZIZ = new ConcurrentHashMap<>();

    public static ICommentTopBarImplementService LIZLLL(int i) {
        ICommentTopBarImplementService iCommentTopBarImplementService = LIZIZ.get(Integer.valueOf(i));
        if (iCommentTopBarImplementService != null) {
            return iCommentTopBarImplementService;
        }
        Set services = ServiceManager.get().getServices(ICommentTopBarImplementService.class, true);
        ICommentTopBarImplementService iCommentTopBarImplementService2 = null;
        Object obj = null;
        if (services != null) {
            Iterator it2 = services.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (((ICommentTopBarImplementService) next).getBizTypes().contains(Integer.valueOf(i))) {
                    obj = next;
                    break;
                }
            }
            iCommentTopBarImplementService2 = (ICommentTopBarImplementService) obj;
            if (iCommentTopBarImplementService2 != null) {
                LIZIZ.put(Integer.valueOf(i), iCommentTopBarImplementService2);
            }
        }
        return iCommentTopBarImplementService2;
    }

    public static HashMap LIZ(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) {
        HashMap<String, String> mapAppendClickEventParams;
        Integer num = commentTopBarComponent.bizType;
        if (num != null) {
            int iIntValue = num.intValue();
            HashMap map = new HashMap();
            ICommentTopBarImplementService iCommentTopBarImplementServiceLIZLLL = LIZLLL(iIntValue);
            if (iCommentTopBarImplementServiceLIZLLL != null && (mapAppendClickEventParams = iCommentTopBarImplementServiceLIZLLL.appendClickEventParams(c19eg, fragment, commentTopBarComponent, aweme, commentContextSource)) != null) {
                for (Map.Entry<String, String> entry : mapAppendClickEventParams.entrySet()) {
                    map.put(entry.getKey(), entry.getValue());
                }
            }
            return map;
        }
        return null;
    }

    public static HashMap LIZIZ(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) {
        HashMap<String, String> mapAppendSchemaParams;
        Integer num = commentTopBarComponent.bizType;
        if (num != null) {
            int iIntValue = num.intValue();
            HashMap map = new HashMap();
            ICommentTopBarImplementService iCommentTopBarImplementServiceLIZLLL = LIZLLL(iIntValue);
            if (iCommentTopBarImplementServiceLIZLLL != null && (mapAppendSchemaParams = iCommentTopBarImplementServiceLIZLLL.appendSchemaParams(c19eg, fragment, commentTopBarComponent, aweme, commentContextSource)) != null) {
                for (Map.Entry<String, String> entry : mapAppendSchemaParams.entrySet()) {
                    map.put(entry.getKey(), entry.getValue());
                }
            }
            return map;
        }
        return null;
    }

    public static boolean LJ(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) {
        Integer num = commentTopBarComponent.bizType;
        if (num != null) {
            ICommentTopBarImplementService iCommentTopBarImplementServiceLIZLLL = LIZLLL(num.intValue());
            if (iCommentTopBarImplementServiceLIZLLL != null && iCommentTopBarImplementServiceLIZLLL.onComponentClick(c19eg, fragment, commentTopBarComponent, aweme, commentContextSource)) {
                return true;
            }
            LIZJ(c19eg, fragment, commentTopBarComponent, aweme, commentContextSource, new AwS54S0500000_21(c19eg, fragment, commentTopBarComponent, aweme, commentContextSource, 0));
            return false;
        }
        return false;
    }

    public static boolean LJFF(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) {
        ICommentTopBarImplementService iCommentTopBarImplementServiceLIZLLL;
        Integer num = commentTopBarComponent.bizType;
        if (num != null && (iCommentTopBarImplementServiceLIZLLL = LIZLLL(num.intValue())) != null && iCommentTopBarImplementServiceLIZLLL.onComponentLongClick(c19eg, fragment, commentTopBarComponent, aweme, commentContextSource)) {
            return true;
        }
        return false;
    }

    public static void LJI(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) {
        Integer num = commentTopBarComponent.bizType;
        if (num != null) {
            ICommentTopBarImplementService iCommentTopBarImplementServiceLIZLLL = LIZLLL(num.intValue());
            if (iCommentTopBarImplementServiceLIZLLL != null) {
                iCommentTopBarImplementServiceLIZLLL.onComponentShow(c19eg, fragment, commentTopBarComponent, aweme, commentContextSource);
            }
            LIZJ(c19eg, fragment, commentTopBarComponent, aweme, commentContextSource, new AwS54S0500000_21(c19eg, fragment, commentTopBarComponent, aweme, commentContextSource, 1));
        }
    }

    public static Boolean LJII(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) {
        Integer num = commentTopBarComponent.bizType;
        if (num != null) {
            ICommentTopBarImplementService iCommentTopBarImplementServiceLIZLLL = LIZLLL(num.intValue());
            if (iCommentTopBarImplementServiceLIZLLL != null) {
                return Boolean.valueOf(iCommentTopBarImplementServiceLIZLLL.needSetTextOnClickPressState(c19eg, fragment, commentTopBarComponent, aweme, commentContextSource));
            }
            return null;
        }
        return Boolean.FALSE;
    }

    public static void LIZJ(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource, Function1 function1) {
        Set<ICommentTopBarImplementService> services = ServiceManager.get().getServices(ICommentTopBarImplementService.class, true);
        if (services != null) {
            for (ICommentTopBarImplementService iCommentTopBarImplementService : services) {
                if (iCommentTopBarImplementService.addGlobalEventListener(c19eg, fragment, commentTopBarComponent, aweme, commentContextSource)) {
                    function1.invoke(iCommentTopBarImplementService);
                }
            }
        }
    }
}
