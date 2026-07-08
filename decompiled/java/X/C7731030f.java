package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MainOrderInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShopOrderNew;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.030f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7731030f {
    public final BillInfoData LIZ;
    public final boolean LIZIZ;
    public final Map<String, List<MainOrderInfo>> LIZJ;
    public final List<ShopOrderNew> LIZLLL;
    public final PaymentMethod LJ;
    public final boolean LJFF;
    public final CopyOnWriteArrayList<PaymentMethod> LJI;
    public final Boolean LJII;
    public final CopyOnWriteArrayList<PaymentMethod> LJIIIIZZ;
    public final boolean LJIIIZ;
    public final List<ShopOrderNew> LJIIJ;
    public final ECRichText LJIIJJI;

    public C7731030f(BillInfoData billInfoData, boolean z, Map map, List list, PaymentMethod paymentMethod, boolean z2, CopyOnWriteArrayList copyOnWriteArrayList, Boolean bool, CopyOnWriteArrayList copyOnWriteArrayList2, boolean z3, List list2, ECRichText eCRichText, int i) {
        bool = (i & 256) != 0 ? Boolean.FALSE : bool;
        copyOnWriteArrayList2 = (i & 512) != 0 ? null : copyOnWriteArrayList2;
        z3 = (i & 1024) != 0 ? false : z3;
        list2 = (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? new ArrayList() : list2;
        eCRichText = (i & 8192) != 0 ? null : eCRichText;
        this.LIZ = billInfoData;
        this.LIZIZ = z;
        this.LIZJ = map;
        this.LIZLLL = list;
        this.LJ = paymentMethod;
        this.LJFF = z2;
        this.LJI = copyOnWriteArrayList;
        this.LJII = bool;
        this.LJIIIIZZ = copyOnWriteArrayList2;
        this.LJIIIZ = z3;
        this.LJIIJ = list2;
        this.LJIIJJI = eCRichText;
    }
}
