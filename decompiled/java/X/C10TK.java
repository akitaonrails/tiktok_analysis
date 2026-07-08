package X;

import Y.AfS178S0100000_9;
import android.os.SystemClock;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.client.experiment.UploadVidApi;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.journey.INewUserJourneyService;
import com.ss.android.ugc.aweme.network.spi.INetworkStateService;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS58S0100100_28;

/* JADX INFO: renamed from: X.10TK, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10TK implements C0CSC {
    public static final C10TK LIZ = new C10TK();
    public static final UploadVidApi LIZIZ;
    public static final Keva LIZJ;
    public static int LIZLLL;
    public static boolean LJ;
    public static final INetworkStateService LJFF;

    static {
        IRetrofitFactory iRetrofitFactory = (IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("https://");
        sbLIZ.append(C844470XAv.LJIIIIZZ.LIZ);
        LIZIZ = (UploadVidApi) iRetrofitFactory.LIZ(C2188811AlT.LIZIZ(sbLIZ)).create(UploadVidApi.class);
        LIZJ = Keva.getRepo("upload_vids_keva_repo");
        LJFF = (INetworkStateService) ServiceManager.get().getService(INetworkStateService.class);
    }

    @Override // X.C0CSC
    public final void LIZ(EnumC325100Com enumC325100Com) {
        if (enumC325100Com == EnumC325100Com.STRONG) {
            LIZLLL++;
            LIZJ(AFwS217S0000000_28.get$arr$(98));
        }
        if (LIZLLL >= 3) {
            LJ = false;
            LJFF.removeNetworkChangeObserver(this);
        }
    }

    public final void LIZJ(Function0<Unit> function0) {
        String[] strArr;
        long jElapsedRealtime;
        List listLJJJJJ;
        List<String> listLJJJJI = ((INewUserJourneyService) ServiceManager.get().getService(INewUserJourneyService.class)).LJJJJI();
        String[] stringArray = LIZJ.getStringArray("key_successful_vids", new String[0]);
        ArrayList arrayList = new ArrayList();
        for (String str : listLJJJJI) {
            if (!C13LQ.LJIILLIIL(str, stringArray)) {
                arrayList.add(str);
            }
        }
        String[] stringArray2 = LIZJ.getStringArray("key_successful_vids", new String[0]);
        ArrayList arrayList2 = new ArrayList(arrayList);
        C19719612Di.LJJII(arrayList2, stringArray2);
        if (arrayList2.size() <= 50 || (listLJJJJJ = C13LP.LJJJJJ(30, arrayList2)) == null || (strArr = (String[]) listLJJJJJ.toArray(new String[0])) == null) {
            strArr = new String[0];
        }
        if (!arrayList.isEmpty()) {
            String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
            AwS572S0100000_28 awS572S0100000_28 = new AwS572S0100000_28(strArr, 123);
            long j = C1150504el.LIZ().LJJIII;
            if (j > 0) {
                jElapsedRealtime = SystemClock.elapsedRealtime() - j;
            } else {
                jElapsedRealtime = -1;
            }
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LIZLLL(jElapsedRealtime, "app_start_req_send_duration");
            c2344009Gk.LIZJ(C1514430pVp.LIZLLL().booleanValue() ? 1 : 0, "is_cold_start_first_launch");
            Map<String, String> map = c2344009Gk.LIZ;
            C807840VmY.LIZ(map);
            C20684815ws.LJIILLIIL("upload_vid_req_send", map);
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            LIZIZ.LIZ(new UploadVidApi.UploadVidRequest(strLJJLIIIJ)).LJL(C11S5.LIZ()).LJJJLZIJ(C11S5.LIZ()).LJJLIIIJJIZ(3L).LJJLL(new AfS178S0100000_9(new C10TL(jElapsedRealtime2, awS572S0100000_28, function0), (Function1<? super Throwable, Unit>) 90), new AfS178S0100000_9(new AwS58S0100100_28(jElapsedRealtime2, (long) function0, (Function0<Unit>) 1), (Function1<? super Throwable, Unit>) 90));
            return;
        }
        LJ = false;
        LJFF.removeNetworkChangeObserver(this);
    }

    public static void LIZIZ(int i, long j) {
        long jElapsedRealtime;
        long j2 = C1150504el.LIZ().LJJIII;
        if (j2 > 0) {
            jElapsedRealtime = SystemClock.elapsedRealtime() - j2;
        } else {
            jElapsedRealtime = -1;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(i, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c2344009Gk.LIZLLL(SystemClock.elapsedRealtime() - j, "req_duration");
        c2344009Gk.LIZJ(C1514430pVp.LIZLLL().booleanValue() ? 1 : 0, "is_cold_start_first_launch");
        c2344009Gk.LIZLLL(jElapsedRealtime, "duration_from_start");
        Map<String, String> map = c2344009Gk.LIZ;
        C807840VmY.LIZ(map);
        C20684815ws.LJIILLIIL("upload_vid_req_recv", map);
    }
}
