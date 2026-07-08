package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.module.desc.SeaProductDescVideoViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.player.ISeaPdpMediaControlService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.jvm.internal.AwS140S1100000_26;
import kotlin.jvm.internal.AwS4S2201000_26;

/* JADX INFO: renamed from: X.0vh1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1752010vh1 implements InterfaceC1763420vzQ {
    public final /* synthetic */ SeaProductDescVideoViewHolder LIZ;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1763420vzQ
    public final void LIZIZ() {
        Video video;
        this.LIZ.LLJJJJ.LJIIIIZZ();
        ISeaPdpMediaControlService iSeaPdpMediaControlServiceD6 = this.LIZ.d6();
        if (iSeaPdpMediaControlServiceD6 != null) {
            iSeaPdpMediaControlServiceD6.uE0(this.LIZ, Boolean.TRUE, Boolean.FALSE, null);
        }
        Aweme aweme = this.LIZ.LLJJJJLIIL;
        if (aweme == null || (video = aweme.getVideo()) == null) {
            return;
        }
        SeaProductDescVideoViewHolder seaProductDescVideoViewHolder = this.LIZ;
        C1054104Ah c1054104Ah = seaProductDescVideoViewHolder.e6().LLJLIL;
        if (c1054104Ah != null) {
            Aweme aweme2 = seaProductDescVideoViewHolder.LLJJJJLIIL;
            String aid = aweme2 != null ? aweme2.getAid() : null;
            int videoLength = video.getVideoLength() * LSPassThroughRecordSizeConfig.DEFAULT;
            InterfaceC1748810vbr interfaceC1748810vbrLJJIZ = c1054104Ah.LJJIZ();
            if (interfaceC1748810vbrLJJIZ != null) {
                C1748720vbi.LIZIZ(interfaceC1748810vbrLJJIZ, new C04BN(), new AwS4S2201000_26(c1054104Ah, "product_description", aid, videoLength, (Integer) null, 0));
            }
        }
        C1054104Ah c1054104Ah2 = seaProductDescVideoViewHolder.e6().LLJLIL;
        if (c1054104Ah2 != null) {
            String str = ((C1406540mho) seaProductDescVideoViewHolder.LLILLJJLI).LL.daInfo;
            InterfaceC1748810vbr interfaceC1748810vbrLJJIZ2 = c1054104Ah2.LJJIZ();
            if (interfaceC1748810vbrLJJIZ2 != null) {
                C1748720vbi.LIZIZ(interfaceC1748810vbrLJJIZ2, new C10516049i(), new AwS140S1100000_26(c1054104Ah2, str, 32));
            }
        }
    }

    public C1752010vh1(SeaProductDescVideoViewHolder seaProductDescVideoViewHolder) {
        this.LIZ = seaProductDescVideoViewHolder;
    }
}
