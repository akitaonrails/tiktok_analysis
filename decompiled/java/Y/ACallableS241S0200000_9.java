package Y;

import X.C0OGF;
import X.C1C7U;
import X.C20684815ws;
import X.C2344009Gk;
import X.C305420By8;
import X.C613050O2t;
import X.C633060OsK;
import android.os.SystemClock;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.music.api.MusicDetailApi;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public class ACallableS241S0200000_9 implements Callable {
    public final int $t;
    public Object l0;
    public Object l1;

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

    public static final Object call$0(ACallableS241S0200000_9 aCallableS241S0200000_9) throws ExecutionException, InterruptedException {
        MusicDetail musicDetail;
        int iIntValue;
        C1C7U.LIZ("MusicDetailPresenter@d338.<init>$1$sendRequest$1");
        ((C0OGF) aCallableS241S0200000_9.l1).LL.LLILZLL = Long.valueOf(SystemClock.elapsedRealtime());
        C633060OsK c633060OsK = ((C0OGF) aCallableS241S0200000_9.l1).LL;
        Object[] objArr = (Object[]) aCallableS241S0200000_9.l0;
        c633060OsK.LLILZ = (String) objArr[0];
        Object obj = objArr[1];
        if (obj != null) {
            c633060OsK.LLILZIL = obj.toString();
        }
        Object[] objArr2 = (Object[]) aCallableS241S0200000_9.l0;
        if (objArr2.length > 2 && ((Integer) objArr2[2]).intValue() == 1) {
            Object[] objArr3 = (Object[]) aCallableS241S0200000_9.l0;
            MusicDetail musicDetail2 = MusicDetailApi.LIZ.queryPartnerMusic((String) objArr3[0], (String) objArr3[1]).get();
            C1C7U.LIZIZ("MusicDetailPresenter@d338.<init>$1$sendRequest$1");
            return musicDetail2;
        }
        Object[] objArr4 = (Object[]) aCallableS241S0200000_9.l0;
        if (objArr4.length >= 5) {
            TreeMap treeMap = new TreeMap();
            Object[] objArr5 = (Object[]) aCallableS241S0200000_9.l0;
            if (objArr5.length >= 6) {
                treeMap.put("item_id", objArr5[5]);
            }
            Object[] objArr6 = (Object[]) aCallableS241S0200000_9.l0;
            if (objArr6.length >= 7) {
                treeMap.put("video_id", objArr6[6]);
            }
            Object[] objArr7 = (Object[]) aCallableS241S0200000_9.l0;
            if (objArr7.length >= 8) {
                try {
                    iIntValue = ((Integer) objArr7[7]).intValue();
                } catch (ClassCastException e) {
                    TryCatchGuardChecker.doCheck(e);
                    iIntValue = 0;
                }
                if (iIntValue == 1) {
                    treeMap.put("enter_from", String.valueOf(iIntValue));
                }
            }
            Object[] objArr8 = (Object[]) aCallableS241S0200000_9.l0;
            MusicDetail musicDetailLIZIZ = MusicDetailApi.LIZIZ(((Integer) objArr8[1]).intValue(), ((Integer) ((Object[]) aCallableS241S0200000_9.l0)[4]).intValue(), (String) objArr8[0], treeMap);
            C1C7U.LIZIZ("MusicDetailPresenter@d338.<init>$1$sendRequest$1");
            return musicDetailLIZIZ;
        }
        String strTrim = (String) objArr4[0];
        int iIntValue2 = ((Integer) objArr4[1]).intValue();
        MusicDetailApi.DetailApi detailApi = MusicDetailApi.LIZ;
        boolean zLJI = MethodIDManager.LJI(202189);
        if (C305420By8.LIZ) {
            MusicDetailApi.DetailApi detailApi2 = MusicDetailApi.LIZ;
            if (strTrim != null) {
                strTrim = strTrim.trim();
            }
            musicDetail = detailApi2.queryMusicWithHighPriority(strTrim, iIntValue2).get();
            if (zLJI) {
                MethodIDManager.LJ();
            }
        } else {
            MusicDetailApi.DetailApi detailApi3 = MusicDetailApi.LIZ;
            if (strTrim != null) {
                strTrim = strTrim.trim();
            }
            musicDetail = detailApi3.queryMusic(strTrim, iIntValue2).get();
            if (zLJI) {
                MethodIDManager.LJ();
            }
        }
        C1C7U.LIZIZ("MusicDetailPresenter@d338.<init>$1$sendRequest$1");
        return musicDetail;
    }

    public static final Object call$1(ACallableS241S0200000_9 aCallableS241S0200000_9) {
        Long lValueOf;
        C1C7U.LIZ("InvalidAnchorMobHelper@a7a6.mob$1");
        for (AnchorCommonStruct anchorCommonStruct : (List) aCallableS241S0200000_9.l0) {
            C613050O2t c613050O2t = C613050O2t.LIZ;
            Aweme aweme = (Aweme) aCallableS241S0200000_9.l1;
            c613050O2t.getClass();
            if (anchorCommonStruct != null && aweme != null) {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LIZJ(aweme.isAd() ? 1 : 0, "is_ad");
                c2344009Gk.LIZJ(anchorCommonStruct.getAnchorState(), "anchor_state");
                c2344009Gk.LIZJ(anchorCommonStruct.getType(), "anchor_type");
                c2344009Gk.LJIIIIZZ("group_id", aweme.getAid());
                c2344009Gk.LJIIIIZZ("author_id", AwemeExtKt.getAuthorUid(aweme));
                Music music = aweme.getMusic();
                String imprId = null;
                if (music != null) {
                    lValueOf = Long.valueOf(music.getId());
                } else {
                    lValueOf = null;
                }
                c2344009Gk.LJ(lValueOf, "music_id");
                c2344009Gk.LJIIIIZZ("enter_from", "homepage_hot");
                LogPbBean logPbBean = aweme.getLogPbBean();
                if (logPbBean != null) {
                    imprId = logPbBean.getImprId();
                }
                c2344009Gk.LJIIIIZZ("impression_id", imprId);
                C20684815ws.LJIILLIIL("invalid_anchor", c2344009Gk.LIZ);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InvalidAnchorMobHelper@a7a6.mob$1");
        return unit;
    }

    public ACallableS241S0200000_9(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l0 = obj2;
    }
}
