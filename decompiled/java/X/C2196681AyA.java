package X;

import android.app.Activity;
import android.content.Context;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.minis.common.SchemaParserData;
import com.ss.android.ugc.aweme.minis.model.MinisMetaResp;
import com.ss.android.ugc.aweme.minis.page.main.fragment.MinisFragment;
import com.ss.android.ugc.aweme.structure.saas.ICommerceSaasService;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1AyA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2196681AyA {
    public static MinisFragment LIZIZ;
    public static final C2196681AyA LIZ = new C2196681AyA();
    public static final LinkedList<C2196691AyB> LIZJ = new LinkedList<>(C1697810uHb.LJIILJJIL(new C2196691AyB(EnumC1222760hvO.TAG_0), new C2196691AyB(EnumC1222760hvO.TAG_1), new C2196691AyB(EnumC1222760hvO.TAG_2)));
    public static final HashMap<String, String> LIZLLL = new HashMap<>();
    public static final HashMap<String, List<Activity>> LJ = new HashMap<>();
    public static int LJFF = 1;
    public static final HashMap<String, Integer> LJI = new HashMap<>();

    public static void LIZ(String str) {
        List<Activity> list;
        String str2;
        ICommerceSaasService iCommerceSaasService;
        InterfaceC1032100cxs interfaceC1032100cxsLIZIZ;
        if (str.length() != 0 && (str2 = LIZLLL.get(str)) != null && str2.length() != 0 && (iCommerceSaasService = (ICommerceSaasService) PluggableExtentionKt.pluggableSpi$default(ICommerceSaasService.class, false, false, false, 14, null)) != null && (interfaceC1032100cxsLIZIZ = iCommerceSaasService.LIZIZ(str2)) != null) {
            interfaceC1032100cxsLIZIZ.taskCompleted(false, null, null);
            interfaceC1032100cxsLIZIZ.exit(false);
        }
        if (str.length() != 0 && (list = LJ.get(str)) != null) {
            Iterator<Activity> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().finish();
            }
            LJ.remove(str);
        }
    }

    public static void LIZIZ(List list) {
        InterfaceC1032100cxs interfaceC1032100cxsLIZIZ;
        if (list != null && !list.isEmpty()) {
            ICommerceSaasService iCommerceSaasService = (ICommerceSaasService) PluggableExtentionKt.pluggableSpi$default(ICommerceSaasService.class, false, false, false, 14, null);
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                String str = (String) it2.next();
                if (iCommerceSaasService != null && (interfaceC1032100cxsLIZIZ = iCommerceSaasService.LIZIZ(str)) != null) {
                    interfaceC1032100cxsLIZIZ.taskCompleted(false, null, null);
                    interfaceC1032100cxsLIZIZ.exit(false);
                }
            }
        }
    }

    public static int LIZJ(String str) {
        Integer num;
        if (str.length() == 0 || (num = LJI.get(str)) == null) {
            return 1;
        }
        return num.intValue();
    }

    public static void LJFF(Activity activity) {
        String str = LIZJ.peekLast().LIZ;
        HashMap<String, List<Activity>> map = LJ;
        List<Activity> list = map.get(str);
        if (list == null) {
            map.put(str, Collections.singletonList(activity));
        } else {
            map.put(str, C13LP.LJLILLLLZI(activity, list));
        }
    }

    public static void LJI(Activity activity) {
        String str = LIZJ.peekLast().LIZ;
        HashMap<String, List<Activity>> map = LJ;
        List<Activity> list = map.get(str);
        if (list == null) {
            return;
        }
        map.put(str, C13LP.LJLIIIL(activity, list));
    }

    public static void LJ(MinisFragment minisFragment, String str) {
        LIZIZ = minisFragment;
        if (minisFragment != null) {
            if (C123100dR.LIZ(str)) {
                LJI.put(str, Integer.valueOf(LJFF));
            }
            LJFF = 2;
        } else {
            String str2 = LIZJ.getLast().LIZ;
            if (str2 != null && str2.length() != 0) {
                return;
            }
            LJFF = 1;
        }
    }

    public static void LJII(EnumC1222760hvO enumC1222760hvO, Activity activity) {
        for (C2196691AyB c2196691AyB : LIZJ) {
            if (c2196691AyB.LIZIZ == enumC1222760hvO) {
                c2196691AyB.LIZJ = new WeakReference<>(activity);
                return;
            }
        }
    }

    public static void LIZLLL(Context context, SchemaParserData schemaParserData, C2196371Axf c2196371Axf, MinisMetaResp minisMetaResp) {
        C2196691AyB c2196691AyBPoll;
        String url;
        Activity activity;
        String strIS;
        Iterator<C2196691AyB> it2 = LIZJ.iterator();
        while (true) {
            c2196691AyBPoll = null;
            if (!it2.hasNext()) {
                break;
            }
            c2196691AyBPoll = it2.next();
            if (Intrinsics.LJFF(c2196691AyBPoll.LIZ, schemaParserData.clientKey)) {
                it2.remove();
                break;
            }
        }
        if (c2196691AyBPoll == null) {
            MinisFragment minisFragment = LIZIZ;
            if (minisFragment != null && Intrinsics.LJFF(minisFragment.iS(), schemaParserData.clientKey)) {
                String str = schemaParserData.clientKey;
                if (str == null) {
                    str = "";
                }
                LIZ(str);
                MinisFragment minisFragment2 = LIZIZ;
                if (minisFragment2 != null) {
                    minisFragment2.SR(EnumC2196901AyW.BACKGROUND, true);
                }
            }
            c2196691AyBPoll = LIZJ.poll();
            String str2 = schemaParserData.clientKey;
            if (str2 == null) {
                str2 = "";
            }
            c2196691AyBPoll.LIZ = str2;
        } else {
            String str3 = schemaParserData.clientKey;
            if (str3 == null) {
                str3 = "";
            }
            LIZ(str3);
        }
        LinkedList<C2196691AyB> linkedList = LIZJ;
        linkedList.add(c2196691AyBPoll);
        LJI.put(c2196691AyBPoll.LIZ, Integer.valueOf(LJFF));
        LJFF++;
        WeakReference<Activity> weakReference = linkedList.get(1).LIZJ;
        if (weakReference != null && weakReference.get() != null) {
            C2196681AyA c2196681AyA = LIZ;
            MinisFragment minisFragment3 = LIZIZ;
            if (minisFragment3 == null || (strIS = minisFragment3.iS()) == null) {
                strIS = "";
            }
            c2196681AyA.getClass();
            LIZ(strIS);
            MinisFragment minisFragment4 = LIZIZ;
            if (minisFragment4 != null) {
                minisFragment4.SR(EnumC2196901AyW.BACKGROUND, true);
            }
        }
        C2196681AyA c2196681AyA2 = LIZ;
        EnumC1222760hvO enumC1222760hvO = c2196691AyBPoll.LIZIZ;
        if (enumC1222760hvO == null || (url = enumC1222760hvO.getUrl()) == null) {
            url = "";
        }
        c2196681AyA2.getClass();
        if (url.length() != 0) {
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, url);
            smartRouteBuildRoute.withParam("intent_key_minis_schema_data", schemaParserData);
            smartRouteBuildRoute.withParam("intent_key_minis_load_perf_data", c2196371Axf);
            smartRouteBuildRoute.withParam("intent_key_minis_meta_data_from_token_link", minisMetaResp);
            smartRouteBuildRoute.addFlags(131072);
            smartRouteBuildRoute.withAnimation(0, R.anim.jd);
            smartRouteBuildRoute.open();
        }
        C2196691AyB next = linkedList.iterator().next();
        String str4 = next.LIZ;
        if (str4 == null) {
            str4 = "";
        }
        LIZ(str4);
        WeakReference<Activity> weakReference2 = next.LIZJ;
        if (weakReference2 != null && (activity = weakReference2.get()) != null) {
            activity.finish();
        }
        WeakReference<Activity> weakReference3 = next.LIZJ;
        if (weakReference3 != null) {
            weakReference3.clear();
        }
        next.LIZ = "";
    }
}
