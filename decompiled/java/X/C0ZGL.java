package X;

import android.app.Activity;
import com.bytedance.im.core.proto.ReferenceInfo;
import com.ss.android.ugc.aweme.IMVoiceMessageUtil;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.common.model.IMGiphyInfo;
import com.ss.android.ugc.aweme.im.common.model.SetSticker;
import com.ss.android.ugc.aweme.im.common.model.StickerBase;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import com.ss.android.ugc.aweme.im.common.model.VideoSticker;
import com.ss.android.ugc.aweme.im.message.content.BaseHeader;
import com.ss.android.ugc.aweme.im.message.content.BaseText;
import com.ss.android.ugc.aweme.im.message.content.FeatureAttachmentContent;
import com.ss.android.ugc.aweme.im.message.persistentext.adapter.FeatureAttachmentData;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentTypeComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseHeaderComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;
import com.ss.android.ugc.aweme.im.message.template.data.QuoteMode;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import com.ss.android.ugc.aweme.service.IIMMediaCreativeService;
import com.ss.android.ugc.aweme.services.dm.DMCreativeStickerFontData;
import com.ss.android.ugc.aweme.video.IPlayerManagerService;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AwS558S0100000_14;
import okio.ByteString;

/* JADX INFO: renamed from: X.0ZGL, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZGL implements InterfaceC457250HwR {
    public final C0I0H LIZ;
    public final C0I2B LIZIZ;
    public final C01GW LIZJ;

    @Override // X.InterfaceC457250HwR
    public final boolean LJ() {
        IPlayerManagerService iPlayerManagerService = (IPlayerManagerService) PluggableExtentionKt.pluggableSpi$default(IPlayerManagerService.class, false, false, false, 14, null);
        return iPlayerManagerService != null && iPlayerManagerService.LIZJ();
    }

    @Override // X.InterfaceC457250HwR
    public final void LJI() {
        C0ZGJ c0zgjLJIIL = LJIIL();
        Map<String, String> mapLJIIJJI = LJIIJJI(false);
        this.LIZ.Bt();
        this.LIZ.tC(true);
        IIMMediaCreativeService iIMMediaCreativeServiceLJIILIIL = C912070ZqH.LIZIZ.LJIILIIL();
        Activity activity = c0zgjLJIIL.LIZ;
        String str = c0zgjLJIIL.LIZIZ;
        if (str == null) {
            return;
        }
        String str2 = c0zgjLJIIL.LIZLLL;
        int i = c0zgjLJIIL.LJ;
        String str3 = c0zgjLJIIL.LIZJ;
        QuoteMode quoteModeLIZ = c0zgjLJIIL.LJII.LIZ(C0ZGS.NONE);
        BaseHeaderComponent baseHeaderComponentLJIIJ = LJIIJ();
        iIMMediaCreativeServiceLJIILIIL.LIZLLL(i, activity, C0CGL.SINGLE, LJIILIIL(), baseHeaderComponentLJIIJ, quoteModeLIZ, str, str2, str3, str, mapLJIIJJI, mapLJIIJJI, new AwS558S0100000_14(this, 1799));
    }

    public final C0ZGJ LJIIL() {
        return (C0ZGJ) this.LIZJ.getValue();
    }

    public final BaseHeaderComponent LJIIJ() {
        C0ZFT c0zftInvoke;
        BaseHeader baseHeader;
        BaseText baseText;
        C0ZFV c0zfv = LJIIL().LJIIIZ;
        if (c0zfv == null || (c0zftInvoke = c0zfv.invoke()) == null || (baseHeader = c0zftInvoke.LIZIZ) == null || (baseText = baseHeader.text) == null) {
            return null;
        }
        String str = baseText.text;
        if (str == null) {
            str = "";
        }
        return new BaseHeaderComponent(new TextComponent(str, baseText.senderStarling, baseText.receiverStarling));
    }

    public final FeatureAttachmentData LJIILIIL() {
        C0ZFT c0zftInvoke;
        FeatureAttachmentContent featureAttachmentContent;
        C0ZFV c0zfv = LJIIL().LJIIIZ;
        if (c0zfv == null || (c0zftInvoke = c0zfv.invoke()) == null || (featureAttachmentContent = c0zftInvoke.LIZ) == null) {
            return null;
        }
        C462070IAb c462070IAb = AttachmentTypeComponent.Companion;
        int i = featureAttachmentContent.type;
        c462070IAb.getClass();
        AttachmentTypeComponent attachmentTypeComponentLIZ = C462070IAb.LIZ(i);
        String str = featureAttachmentContent.id;
        if (str == null) {
            str = "";
        }
        Long l = featureAttachmentContent.uid;
        long jLongValue = l != null ? l.longValue() : 0L;
        Long l2 = featureAttachmentContent.originalCreateTime;
        return new FeatureAttachmentData(attachmentTypeComponentLIZ, str, jLongValue, l2 != null ? l2.longValue() : 0L, 16);
    }

    public final ByteString LJIILJJIL() {
        C0ZFT c0zftInvoke;
        FeatureAttachmentContent featureAttachmentContent;
        C0ZFV c0zfv = LJIIL().LJIIIZ;
        if (c0zfv == null || (c0zftInvoke = c0zfv.invoke()) == null || (featureAttachmentContent = c0zftInvoke.LIZ) == null) {
            return null;
        }
        C1496910p3Z c1496910p3Z = ByteString.Companion;
        C905560Zfm c905560Zfm = new C905560Zfm();
        C0ZGN c0zgn = new C0ZGN();
        c0zgn.LIZLLL = EnumC2244491Ct5.fromValue(featureAttachmentContent.type);
        c0zgn.LJ = featureAttachmentContent.id;
        c0zgn.LJFF = featureAttachmentContent.uid;
        c0zgn.LJI = featureAttachmentContent.originalCreateTime;
        c905560Zfm.LJIIL = c0zgn.build();
        byte[] bArrEncode = c905560Zfm.build().encode();
        byte[] bArrCopyOf = Arrays.copyOf(bArrEncode, bArrEncode.length);
        c1496910p3Z.getClass();
        return C1496910p3Z.LIZIZ(bArrCopyOf);
    }

    @Override // X.InterfaceC457250HwR
    public final void LIZJ(VideoSticker videoSticker) {
        C0ZGJ c0zgjLJIIL = LJIIL();
        InterfaceC454710HsL imStickerMessageService = IMStickerApi.LIZ.LIZIZ().getImStickerMessageService();
        String str = c0zgjLJIIL.LIZIZ;
        if (str == null) {
            return;
        }
        C0ZGG c0zgg = LJIIL().LJI;
        C0ZGS c0zgs = C0ZGS.NONE;
        C1867907Th c1867907Th = new C1867907Th(c0zgg.LIZ(c0zgs));
        LinkedHashMap linkedHashMap = new LinkedHashMap(c0zgjLJIIL.LJIIIIZZ.LIZ(c0zgs));
        ByteString byteStringLJIILJJIL = LJIILJJIL();
        QuoteMode quoteModeLIZ = c0zgjLJIIL.LJII.LIZ(c0zgs);
        BaseHeaderComponent baseHeaderComponentLJIIJ = LJIIJ();
        C0I0B.LJFF.LIZJ();
        imStickerMessageService.LJIILLIIL(videoSticker, str, c1867907Th, linkedHashMap, null, byteStringLJIILJJIL, null, C894660Z7w.LIZ(), quoteModeLIZ, baseHeaderComponentLJIIJ);
        this.LIZ.Gk(C0I0E.ACTION_SEND_MESSAGE);
        LIZ(c0zgs, "quick_reply_sticker_panel");
    }

    @Override // X.InterfaceC457250HwR
    public final void LJII(boolean z) {
        if (z) {
            IPlayerManagerService iPlayerManagerService = (IPlayerManagerService) PluggableExtentionKt.pluggableSpi$default(IPlayerManagerService.class, false, false, false, 14, null);
            if (iPlayerManagerService != null) {
                iPlayerManagerService.LJIILLIIL();
                return;
            }
            return;
        }
        IPlayerManagerService iPlayerManagerService2 = (IPlayerManagerService) PluggableExtentionKt.pluggableSpi$default(IPlayerManagerService.class, false, false, false, 14, null);
        if (iPlayerManagerService2 == null) {
            return;
        }
        iPlayerManagerService2.LIZ();
    }

    @Override // X.InterfaceC457250HwR
    public final void LJIIIIZZ(DMCreativeStickerFontData dMCreativeStickerFontData) {
        this.LIZ.tC(true);
        C0ZGJ c0zgjLJIIL = LJIIL();
        Map<String, String> mapLJIIJJI = LJIIJJI(false);
        QuoteMode quoteModeLIZ = c0zgjLJIIL.LJII.LIZ(C0ZGS.NONE);
        IIMMediaCreativeService iIMMediaCreativeServiceLJIILIIL = C912070ZqH.LIZIZ.LJIILIIL();
        Activity activity = c0zgjLJIIL.LIZ;
        String str = c0zgjLJIIL.LIZIZ;
        if (str == null) {
            return;
        }
        iIMMediaCreativeServiceLJIILIIL.LJIIIIZZ(activity, str, c0zgjLJIIL.LJ, c0zgjLJIIL.LIZJ, c0zgjLJIIL.LIZLLL, c0zgjLJIIL.LJFF, null, null, "half_screen_input_panel", dMCreativeStickerFontData, null, false, null, mapLJIIJJI, mapLJIIJJI, 27, false, "dm_camera", null, null, false, false, false, quoteModeLIZ, LJIIJ(), LJIILIIL());
    }

    @Override // X.InterfaceC457250HwR
    public final void LJIIIZ(SetSticker setSticker) {
        C0ZGJ c0zgjLJIIL = LJIIL();
        LinkedHashMap linkedHashMap = new LinkedHashMap(LJIIJJI(false));
        C0ZGE c0zge = c0zgjLJIIL.LJII;
        C0ZGS c0zgs = C0ZGS.NONE;
        QuoteMode quoteModeLIZ = c0zge.LIZ(c0zgs);
        InterfaceC454710HsL imStickerMessageService = IMStickerApi.LIZ.LIZIZ().getImStickerMessageService();
        String str = c0zgjLJIIL.LIZIZ;
        if (str == null) {
            return;
        }
        C1867907Th c1867907Th = new C1867907Th(LJIIL().LJI.LIZ(c0zgs));
        AttachmentComponent attachmentComponentT3 = quoteModeLIZ.T3();
        ByteString byteStringLJIILJJIL = LJIILJJIL();
        ReferenceInfo referenceInfoJK = quoteModeLIZ.jK();
        BaseHeaderComponent baseHeaderComponentLJIIJ = LJIIJ();
        C0I0B.LJFF.LIZJ();
        imStickerMessageService.LJII(C894660Z7w.LIZ(), null, referenceInfoJK, c1867907Th, setSticker, attachmentComponentT3, baseHeaderComponentLJIIJ, str, linkedHashMap, linkedHashMap, byteStringLJIILJJIL, true);
        this.LIZ.Gk(C0I0E.ACTION_SEND_MESSAGE);
        LIZ(c0zgs, "quick_reply_sticker_panel");
    }

    public final Map<String, String> LJIIJJI(boolean z) {
        C0ZGS c0zgs;
        C13DA c13da = new C13DA();
        if (z) {
            c0zgs = C0ZGS.STICKER;
        } else {
            c0zgs = C0ZGS.NONE;
        }
        c13da.putAll(LJIIL().LJIIIIZZ.LIZ(c0zgs));
        CharSequence charSequence = (CharSequence) c13da.get("enter_from");
        if (charSequence == null || charSequence.length() == 0) {
            c13da.put("enter_from", LJIIL().LJFF);
        }
        CharSequence charSequence2 = (CharSequence) c13da.get("enter_method");
        if (charSequence2 == null || charSequence2.length() == 0) {
            c13da.put("enter_method", LJIIL().LJI.LIZ(c0zgs));
        }
        return c13da.build();
    }

    public final void LJIILL(C451030HmP c451030HmP) {
        C0ZFT c0zftInvoke;
        FeatureAttachmentContent featureAttachmentContent;
        C0ZGJ c0zgjLJIIL = LJIIL();
        C0ZFV c0zfv = c0zgjLJIIL.LJIIIZ;
        BaseHeader baseHeader = null;
        if (c0zfv != null) {
            c0zftInvoke = c0zfv.invoke();
        } else {
            c0zftInvoke = null;
        }
        InterfaceC454710HsL imStickerMessageService = IMStickerApi.LIZ.LIZIZ().getImStickerMessageService();
        String str = c0zgjLJIIL.LIZIZ;
        if (str == null) {
            return;
        }
        C0ZGG c0zgg = LJIIL().LJI;
        C0ZGS c0zgs = C0ZGS.NONE;
        C1867907Th c1867907Th = new C1867907Th(c0zgg.LIZ(c0zgs));
        String str2 = c0zgjLJIIL.LJFF;
        LinkedHashMap linkedHashMap = new LinkedHashMap(c0zgjLJIIL.LJIIIIZZ.LIZ(c0zgs));
        ByteString byteStringLJIILJJIL = LJIILJJIL();
        QuoteMode quoteModeLIZ = c0zgjLJIIL.LJII.LIZ(c0zgs);
        if (c0zftInvoke != null) {
            featureAttachmentContent = c0zftInvoke.LIZ;
            baseHeader = c0zftInvoke.LIZIZ;
        } else {
            featureAttachmentContent = null;
        }
        CopyOnWriteArrayList<InterfaceC1743406sC> copyOnWriteArrayList = C874810YTn.LIZ;
        C874780YTk.LIZ();
        C0I0B.LJFF.LIZJ();
        C894660Z7w.LIZ();
        imStickerMessageService.LJIILIIL(c451030HmP, str, c1867907Th, str2, linkedHashMap, null, byteStringLJIILJJIL, null, quoteModeLIZ, featureAttachmentContent, baseHeader);
        this.LIZ.Gk(C0I0E.ACTION_SEND_MESSAGE);
        LIZ(c0zgs, "quick_reply_sticker_panel");
    }

    @Override // X.InterfaceC457250HwR
    public final void LIZ(C0ZGS c0zgs, String str) {
        this.LIZIZ.LIZ(c0zgs, str);
    }

    @Override // X.InterfaceC457250HwR
    public final void LIZIZ(C458370HyF c458370HyF, C0HVB c0hvb) {
        C0ZGJ c0zgjLJIIL = LJIIL();
        C0ZGE c0zge = c0zgjLJIIL.LJII;
        C0ZGS c0zgs = C0ZGS.NONE;
        QuoteMode quoteModeLIZ = c0zge.LIZ(c0zgs);
        IMVoiceMessageUtil iMVoiceMessageUtil = IMVoiceMessageUtil.LIZ;
        String str = c458370HyF.LIZ;
        long j = c458370HyF.LIZIZ;
        float f = c458370HyF.LIZLLL;
        List<Float> list = c458370HyF.LIZJ;
        String str2 = c0zgjLJIIL.LIZIZ;
        if (str2 == null) {
            return;
        }
        IMVoiceMessageUtil.LJIILIIL(iMVoiceMessageUtil, str, j, f, list, str2, new InterfaceC462440IBm() { // from class: X.0ZGO
            @Override // X.InterfaceC462440IBm
            public final void LIZ(String str3) {
            }
        }, c0hvb, quoteModeLIZ.jK(), quoteModeLIZ.T3(), null, null, LJIIJJI(false), LJIIJ(), LJIILJJIL(), 1536);
        this.LIZ.Gk(C0I0E.ACTION_SEND_VOICE_MESSAGE);
        LIZ(c0zgs, "quick_reply_voice");
    }

    @Override // X.InterfaceC457250HwR
    public final void LIZLLL(StickerItem stickerItem, boolean z) {
        Integer num;
        C0ZGS c0zgs;
        C0ZGS c0zgs2;
        String str;
        C0ZGJ c0zgjLJIIL = LJIIL();
        StickerBase stickerBase = stickerItem.stickerBase;
        if (stickerBase != null) {
            num = stickerBase.stickerType;
        } else {
            num = null;
        }
        if (C453560HqU.LIZJ(num)) {
            IMGiphyInfo iMGiphyInfoLJIIJ = C453550HqT.LJIIJ(stickerItem);
            if (iMGiphyInfoLJIIJ != null) {
                LJIILL(C453550HqT.LJIIIZ(iMGiphyInfoLJIIJ));
                return;
            }
            return;
        }
        C0ZGE c0zge = c0zgjLJIIL.LJII;
        if (z) {
            c0zgs = C0ZGS.STICKER;
        } else {
            c0zgs = C0ZGS.NONE;
        }
        QuoteMode quoteModeLIZ = c0zge.LIZ(c0zgs);
        InterfaceC454710HsL imStickerMessageService = IMStickerApi.LIZ.LIZIZ().getImStickerMessageService();
        String str2 = c0zgjLJIIL.LIZIZ;
        if (str2 == null) {
            return;
        }
        C0ZGG c0zgg = LJIIL().LJI;
        if (z) {
            c0zgs2 = C0ZGS.STICKER;
        } else {
            c0zgs2 = C0ZGS.NONE;
        }
        C1867907Th c1867907Th = new C1867907Th(c0zgg.LIZ(c0zgs2));
        AttachmentComponent attachmentComponentT3 = quoteModeLIZ.T3();
        LinkedHashMap linkedHashMap = new LinkedHashMap(LJIIJJI(z));
        ByteString byteStringLJIILJJIL = LJIILJJIL();
        ReferenceInfo referenceInfoJK = quoteModeLIZ.jK();
        BaseHeaderComponent baseHeaderComponentLJIIJ = LJIIJ();
        C441010HRb c441010HRb = new C441010HRb(null);
        C0I0B.LJFF.LIZJ();
        imStickerMessageService.LIZJ(C894660Z7w.LIZ(), null, referenceInfoJK, c1867907Th, stickerItem, c441010HRb, attachmentComponentT3, baseHeaderComponentLJIIJ, str2, null, linkedHashMap, byteStringLJIILJJIL, true);
        this.LIZ.Gk(C0I0E.ACTION_SEND_MESSAGE);
        if (z) {
            str = "quick_reply_sa_quick_reply_panel";
        } else {
            str = "quick_reply_sticker_panel";
        }
        LIZ(C0ZGS.NONE, str);
    }

    @Override // X.InterfaceC457250HwR
    public final void LJFF(CharSequence charSequence, boolean z) {
        throw new IllegalStateException("Implement this yourself");
    }

    public C0ZGL(C01GW<C0ZGJ> c01gw, C0I0H c0i0h, C0I2B c0i2b) {
        this.LIZ = c0i0h;
        this.LIZIZ = c0i2b;
        this.LIZJ = c01gw;
    }
}
