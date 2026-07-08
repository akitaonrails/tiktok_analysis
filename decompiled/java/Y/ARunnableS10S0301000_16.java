package Y;

import X.C1058910df7;
import X.C1059920dgk;
import X.C1059940dgm;
import X.C13LP;
import X.C15X3;
import X.C1909107dp;
import X.C1C7U;
import X.C2188811AlT;
import X.C2201701BEy;
import X.C259800zU;
import X.InterfaceC1059970dgp;
import X.InterfaceC634840OvC;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.commercialize.feed.CommerceVideoDelegateKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS630S0100000_16;

/* JADX INFO: loaded from: classes17.dex */
public class ARunnableS10S0301000_16 implements Runnable {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        if (this.i3 != 47) {
            InterfaceC634840OvC interfaceC634840OvC = ((C1059940dgm) this.l0).IBridgeSdkContext;
            new C1059920dgk(new WeakReference(interfaceC634840OvC != null ? interfaceC634840OvC.getContext() : null)).LIZJ(((C1058910df7) this.l1).LIZLLL);
        }
        ((CompletionBlock) this.l2).onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1059970dgp.class, null), "");
    }

    public final void LIZ$1() {
        C2201701BEy c2201701BEy = C2201701BEy.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cpv_");
        sbLIZ.append(this.i3);
        sbLIZ.append('s');
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        List list = (List) this.l0;
        List listLLIIII = list != null ? C13LP.LLIIII(C13LP.LJJJJLI(list)) : null;
        Long creativeId = ((AwemeRawAd) this.l1).getCreativeId();
        String logExtra = ((AwemeRawAd) this.l1).getLogExtra();
        new AwS630S0100000_16((CommerceVideoDelegateKt) this.l2, 82);
        c2201701BEy.getClass();
        C2201701BEy.LIZIZ(strLIZIZ, listLLIIII, creativeId, logExtra, null);
    }

    public static final void run$0(ARunnableS10S0301000_16 aRunnableS10S0301000_16) {
        boolean zLIZ;
        C1C7U.LIZ("AwemeParamMethodIDL@9699.watchLive$1$1");
        try {
            aRunnableS10S0301000_16.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AwemeParamMethodIDL@9699.watchLive$1$1");
    }

    public static final void run$1(ARunnableS10S0301000_16 aRunnableS10S0301000_16) {
        boolean zLIZ;
        C1C7U.LIZ("CommerceVideoDelegateKt@740c.initPlayProgressTrack$4");
        try {
            aRunnableS10S0301000_16.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CommerceVideoDelegateKt@740c.initPlayProgressTrack$4");
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, android.view.View] */
    public static final void run$2(ARunnableS10S0301000_16 aRunnableS10S0301000_16) {
        boolean zLIZ;
        C1C7U.LIZ("TakoAnswerLinkFlowLayout@51e9.getItemView$1");
        try {
            ((C259800zU) aRunnableS10S0301000_16.l0).element = ((C15X3) aRunnableS10S0301000_16.l1).LJI(aRunnableS10S0301000_16.i3);
            ((Function1) aRunnableS10S0301000_16.l2).invoke(((C259800zU) aRunnableS10S0301000_16.l0).element);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TakoAnswerLinkFlowLayout@51e9.getItemView$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ARunnableS10S0301000_16(int i, int i2, List<String> list, AwemeRawAd awemeRawAd, CommerceVideoDelegateKt commerceVideoDelegateKt) {
        this.$t = commerceVideoDelegateKt;
        this.i3 = i;
        this.l0 = i2;
        this.l1 = list;
        this.l2 = awemeRawAd;
    }
}
