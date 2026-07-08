package X;

import android.content.Context;
import com.bytedance.im.core.common.statusmsg.BusinessCommandMessage;
import com.bytedance.im.core.proto.ReferenceInfo;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.common.model.SetSticker;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import com.ss.android.ugc.aweme.im.common.model.VideoSticker;
import com.ss.android.ugc.aweme.im.message.content.BaseHeader;
import com.ss.android.ugc.aweme.im.message.content.FeatureAttachmentContent;
import com.ss.android.ugc.aweme.im.message.template.card.StickerTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseHeaderComponent;
import com.ss.android.ugc.aweme.im.message.template.data.QuoteMode;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.PreshownStickerItem;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: renamed from: X.0HsL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC454710HsL {
    void LIZ(StickerItem stickerItem);

    C454740HsO LIZIZ(StickerTemplate stickerTemplate);

    void LIZJ(Context context, C0YTK c0ytk, ReferenceInfo referenceInfo, InterfaceC454700HsK interfaceC454700HsK, StickerItem stickerItem, C441010HRb c441010HRb, AttachmentComponent attachmentComponent, BaseHeaderComponent baseHeaderComponent, String str, Map map, Map map2, ByteString byteString, boolean z);

    Map<String, String> LIZLLL(Integer num, Long l, Long l2);

    void LJ(C19EG c19eg, StickerItem stickerItem, String str, Integer num, String str2);

    StickerTemplate LJFF(StickerItem stickerItem, Context context, AttachmentComponent attachmentComponent, String str, BaseHeaderComponent baseHeaderComponent);

    UrlModel LJI(UrlModel urlModel, String str);

    void LJII(Context context, C0YTK c0ytk, ReferenceInfo referenceInfo, InterfaceC454700HsK interfaceC454700HsK, SetSticker setSticker, AttachmentComponent attachmentComponent, BaseHeaderComponent baseHeaderComponent, String str, Map map, Map map2, ByteString byteString, boolean z);

    String LJIIIIZZ(PreshownStickerItem preshownStickerItem);

    void LJIIIZ(C869590Y9l c869590Y9l);

    void LJIIJ(String str);

    void LJIIJJI(BusinessCommandMessage businessCommandMessage);

    boolean LJIIL(StickerTemplate stickerTemplate);

    void LJIILIIL(C451030HmP c451030HmP, String str, C1867907Th c1867907Th, String str2, Map map, Map map2, ByteString byteString, C0YTK c0ytk, QuoteMode quoteMode, FeatureAttachmentContent featureAttachmentContent, BaseHeader baseHeader);

    long LJIILJJIL();

    Map<String, String> LJIILL(VideoSticker videoSticker, String str, String str2);

    void LJIILLIIL(VideoSticker videoSticker, String str, InterfaceC454700HsK interfaceC454700HsK, Map<String, String> map, Map<String, String> map2, ByteString byteString, C0YTK c0ytk, Context context, QuoteMode quoteMode, BaseHeaderComponent baseHeaderComponent);

    Map LJIIZILJ(StickerItem stickerItem);

    Long LJIJ(StickerTemplate stickerTemplate);

    Map<String, String> LJIJI(SetSticker setSticker, AttachmentComponent attachmentComponent);

    void LJIJJ(PreshownStickerItem preshownStickerItem, String str, Map map, Context context, ReferenceInfo referenceInfo);

    StickerTemplate LJIJJLI(SetSticker setSticker, Context context, AttachmentComponent attachmentComponent, String str, BaseHeaderComponent baseHeaderComponent);
}
