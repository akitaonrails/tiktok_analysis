package Y;

import X.C0M4M;
import X.C1401320mZO;
import X.C1C7U;
import X.C562260M3k;
import X.EnumC562220M3g;
import X.EnumC562230M3h;
import X.EnumC562250M3j;
import android.util.Pair;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.o;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.livehostimpl.LiveBusinessExtra;
import com.ss.android.ugc.aweme.live.livehostimpl.LiveBusinessGiftHighlight;
import com.ss.android.ugc.aweme.services.IExternalService;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes9.dex */
public class ACallableS18S2100000_8 implements Callable {
    public final int $t;
    public Object l2;
    public String s0;
    public String s1;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS18S2100000_8 aCallableS18S2100000_8) {
        int iQueryDraftCount;
        C1401320mZO c1401320mZO = (C1401320mZO) aCallableS18S2100000_8.l2;
        String str = aCallableS18S2100000_8.s0;
        String str2 = aCallableS18S2100000_8.s1;
        c1401320mZO.getClass();
        C1C7U.LIZ("MusicAwemeModel@3103.fetchCombinedResult$2L");
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        arrayList.add(str2);
        if (!arrayList.isEmpty()) {
            iQueryDraftCount = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).draftService().queryDraftCount(new C0M4M(EnumC562220M3g.NORMAL, new C562260M3k(EnumC562230M3h.MUSIC, arrayList, EnumC562250M3j.LIKE)));
        } else {
            iQueryDraftCount = 0;
        }
        Integer numValueOf = Integer.valueOf(iQueryDraftCount);
        C1C7U.LIZIZ("MusicAwemeModel@3103.fetchCombinedResult$2L");
        return numValueOf;
    }

    public static final Object call$1(ACallableS18S2100000_8 aCallableS18S2100000_8) {
        Gson gson = (Gson) aCallableS18S2100000_8.l2;
        String str = aCallableS18S2100000_8.s0;
        String str2 = aCallableS18S2100000_8.s1;
        C1C7U.LIZ("LiveHostCreativeTool@890f.openShortVideoEditPage$3L");
        try {
            Pair pair = new Pair((LiveBusinessExtra) GsonProtectorUtils.fromJson(gson, str, LiveBusinessExtra.class), (LiveBusinessGiftHighlight) GsonProtectorUtils.fromJson(gson, str2, LiveBusinessGiftHighlight.class));
            C1C7U.LIZIZ("LiveHostCreativeTool@890f.openShortVideoEditPage$3L");
            return pair;
        } catch (o | ClassCastException | NullPointerException e) {
            TryCatchGuardChecker.doCheck(e);
            C1C7U.LIZIZ("LiveHostCreativeTool@890f.openShortVideoEditPage$3L");
            return null;
        }
    }

    public ACallableS18S2100000_8(Object obj, String str, String str2, int i) {
        this.$t = i;
        this.l2 = obj;
        this.s0 = str;
        this.s1 = str2;
    }
}
