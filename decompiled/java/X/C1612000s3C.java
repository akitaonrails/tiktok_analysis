package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.model.PaywallInfoModel;
import com.ss.android.ugc.aweme.model.PurchaseOption;
import java.util.List;

/* JADX INFO: renamed from: X.0s3C, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1612000s3C {
    public final Integer LIZ;
    public final List<PurchaseOption> LIZIZ;
    public final Integer LIZJ;
    public final String LIZLLL;
    public final Boolean LJ;
    public final List<C1612360s3m> LJFF;
    public final CollectionDetailModel LJI;
    public final Integer LJII;
    public final String LJIIIIZZ;
    public final PaywallInfoModel LJIIIZ;
    public final String LJIIJ;

    public C1612000s3C() {
        this(null, null, null, null, null, null, null, null, null, null, null, 16383);
    }

    public C1612000s3C(Integer num, List list, Integer num2, String str, Boolean bool, List list2, CollectionDetailModel collectionDetailModel, Integer num3, String str2, PaywallInfoModel paywallInfoModel, String str3, int i) {
        num = (i & 1) != 0 ? null : num;
        list = (i & 2) != 0 ? null : list;
        num2 = (i & 4) != 0 ? null : num2;
        str = (i & 8) != 0 ? null : str;
        bool = (i & 16) != 0 ? null : bool;
        list2 = (i & 64) != 0 ? null : list2;
        collectionDetailModel = (i & 128) != 0 ? null : collectionDetailModel;
        num3 = (i & 1024) != 0 ? 0 : num3;
        str2 = (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? "" : str2;
        paywallInfoModel = (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : paywallInfoModel;
        str3 = (i & 8192) != 0 ? null : str3;
        this.LIZ = num;
        this.LIZIZ = list;
        this.LIZJ = num2;
        this.LIZLLL = str;
        this.LJ = bool;
        this.LJFF = list2;
        this.LJI = collectionDetailModel;
        this.LJII = num3;
        this.LJIIIIZZ = str2;
        this.LJIIIZ = paywallInfoModel;
        this.LJIIJ = str3;
    }
}
