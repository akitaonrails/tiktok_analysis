package Y;

import X.AbstractC19484711Kz;
import X.C09BH;
import X.C09FC;
import X.C1161920gLG;
import X.C19748512Ol;
import X.C2188811AlT;
import X.C953760avW;
import X.C953770avX;
import X.InterfaceC1487280oo2;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.tools.CloudDraftItemManager;
import com.bytedance.android.live.liveinteract.multilive.model.NoticeboardTemplateCreateResponse;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdkapi.host.editor.IHostMultiCanvas;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import java.io.File;
import kotlin.Pair;
import kotlin.text.Charsets;
import webcast.data.multi_guest_play.NoticeboardTemplate;

/* JADX INFO: loaded from: classes16.dex */
public class AkS42S1000000_15 implements InterfaceC1487280oo2 {
    public final int $t;
    public String s0;

    @Override // X.InterfaceC1487280oo2
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            case 2:
                return apply$2(this, obj);
            case 3:
                return apply$3(this, obj);
            case 4:
                return apply$4(this, obj);
            default:
                return null;
        }
    }

    public AkS42S1000000_15(String str, int i) {
        this.$t = i;
        this.s0 = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object apply$0(AkS42S1000000_15 akS42S1000000_15, Object obj) {
        Long lValueOf;
        BaseResponse baseResponse = (BaseResponse) obj;
        for (C953770avX c953770avX : C953760avW.LIZIZ.LIZ().LJI(akS42S1000000_15.s0)) {
            NoticeboardTemplate noticeboardTemplate = ((NoticeboardTemplateCreateResponse.ResponseData) baseResponse.data).template;
            if (noticeboardTemplate != null) {
                lValueOf = Long.valueOf(noticeboardTemplate.noticeboardTemplateId);
            } else {
                lValueOf = null;
            }
            c953770avX.LJIIL = lValueOf;
        }
        C953760avW.LIZIZ.LIZ().LJIILJJIL();
        return baseResponse;
    }

    public static final Object apply$1(AkS42S1000000_15 akS42S1000000_15, Object obj) {
        BPEAHandler bPEAHandler = CloudDraftItemManager.LIZ;
        return AbstractC19484711Kz.LJII(new C09FC((String) obj, akS42S1000000_15.s0));
    }

    public static final Object apply$2(AkS42S1000000_15 akS42S1000000_15, Object obj) {
        BPEAHandler bPEAHandler = CloudDraftItemManager.LIZ;
        return AbstractC19484711Kz.LJII(new C09FC((String) obj, akS42S1000000_15.s0));
    }

    public static final Object apply$3(AkS42S1000000_15 akS42S1000000_15, Object obj) throws Throwable {
        IHostMultiCanvas iHostMultiCanvas = (IHostMultiCanvas) C1161920gLG.LIZJ(IHostMultiCanvas.class);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Cloud/");
        sbLIZ.append(akS42S1000000_15.s0);
        sbLIZ.append("/config.json");
        File fileFM2 = iHostMultiCanvas.fM2(C2188811AlT.LIZIZ(sbLIZ), true);
        String absolutePath = fileFM2.getAbsolutePath();
        C09BH.LJIIIZ(fileFM2, GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, obj), Charsets.UTF_8);
        return new Pair(absolutePath, obj);
    }

    public static final Object apply$4(AkS42S1000000_15 akS42S1000000_15, Object obj) throws Throwable {
        IHostMultiCanvas iHostMultiCanvas = (IHostMultiCanvas) C1161920gLG.LIZJ(IHostMultiCanvas.class);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Cloud/");
        sbLIZ.append(akS42S1000000_15.s0);
        sbLIZ.append("/config.json");
        File fileFM2 = iHostMultiCanvas.fM2(C2188811AlT.LIZIZ(sbLIZ), true);
        String absolutePath = fileFM2.getAbsolutePath();
        C09BH.LJIIIZ(fileFM2, GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, obj), Charsets.UTF_8);
        return new Pair(absolutePath, obj);
    }
}
