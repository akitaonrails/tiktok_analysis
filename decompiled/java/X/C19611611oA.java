package X;

import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.o;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.stickers.StickerNewEngineModel;
import com.ss.android.ugc.aweme.creative.model.story.stickercreate.StorySocialEventStickerModel;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.social.sticker.model.BusinessInfo;
import com.ss.android.ugc.aweme.social.sticker.model.InteractionData;
import com.ss.android.ugc.aweme.social.sticker.model.Position;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.InteractAreaModel;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.11oA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19611611oA extends AbstractC2255721DQs<InterfaceC1427620nFo> implements InterfaceC1427620nFo, InterfaceC379610EuV, MessageCenter.Listener {
    public static final C19611711oB LLILZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public static final int LLILZLL;
    public final C1DRG LL;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1446740nke.class, null);
    public final InterfaceC1427620nFo LLILLL = this;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.11oB] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C19611611oA.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/gamora/editor/preview/TiktokEditPreviewApi;", 0);
        C13LE.LIZ.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLILZ = new Object() { // from class: X.11oB
        };
        LLILZLL = 8;
    }

    private final InterfaceC1446740nke JY0() {
        return (InterfaceC1446740nke) this.LLILLJJLI.getValue(this, LLILZIL[0]);
    }

    private final int X1() {
        VideoPublishEditModel videoPublishEditModelLJJJLIIL;
        CreativeModel creativeModel;
        StorySocialEventStickerModel storySocialEventStickerModel;
        Integer numValueOf;
        InterfaceC1446740nke interfaceC1446740nkeJY0 = JY0();
        return (interfaceC1446740nkeJY0 == null || (videoPublishEditModelLJJJLIIL = interfaceC1446740nkeJY0.LJJJLIIL()) == null || (creativeModel = videoPublishEditModelLJJJLIIL.creativeModel) == null || (storySocialEventStickerModel = creativeModel.storyEventStickerData) == null || (numValueOf = Integer.valueOf(storySocialEventStickerModel.getCelebrationType())) == null || numValueOf.intValue() != 9) ? EnumC19597511lt.STORY_ANNIVERSARY_MENTION.getValue() : EnumC19597511lt.STORY_STREAK_PET_MENTION.getValue();
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        MessageCenter.removeListener(this);
        MessageCenter.addListener(this);
    }

    public InterfaceC1427620nFo W1() {
        return this.LLILLL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C19611611oA(C1DRG c1drg) {
        this.LL = c1drg;
    }

    public final void Z1(String str) {
        String str2;
        VideoPublishEditModel videoPublishEditModelLJJJLIIL;
        CreativeModel creativeModel;
        StickerNewEngineModel stickerNewEngineModel;
        List<InteractAreaModel> list;
        List<String> urlList;
        String str3;
        VideoPublishEditModel videoPublishEditModelLJJJLIIL2;
        CreativeModel creativeModel2;
        StickerNewEngineModel stickerNewEngineModel2;
        List<InteractAreaModel> list2;
        InterfaceC1446740nke interfaceC1446740nkeJY0 = JY0();
        if (interfaceC1446740nkeJY0 != null && (videoPublishEditModelLJJJLIIL2 = interfaceC1446740nkeJY0.LJJJLIIL()) != null && (creativeModel2 = videoPublishEditModelLJJJLIIL2.creativeModel) != null && (stickerNewEngineModel2 = creativeModel2.stickerModel) != null && (list2 = stickerNewEngineModel2.interactStickerStructs) != null) {
            Iterator<InteractAreaModel> it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                InteractAreaModel next = it2.next();
                if (next.getMessageType() == 36865) {
                    if (next != null) {
                        return;
                    }
                }
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("origin data : ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        try {
            C1227904rF c1227904rF = C1227904rF.LIZ;
            Type type = new TypeToken<List<? extends InteractionData>>() { // from class: X.01jo
            }.getType();
            c1227904rF.getClass();
            List list3 = (List) C1227904rF.LIZJ(str, type);
            if (list3.isEmpty()) {
                return;
            }
            InteractAreaModel interactAreaModel = new InteractAreaModel("", "", "", "", EnumC19597511lt.STORY_ANNIVERSARY_MENTION.getValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1);
            InteractionData interactionData = (InteractionData) ListProtector.get(list3, 0);
            Position position = interactionData.position;
            if (position == null) {
                return;
            }
            interactAreaModel.setX(position.u);
            interactAreaModel.setY(position.v);
            float f = position.x;
            if (f != 0.0f) {
                interactAreaModel.setWidth((position.width / f) * position.u);
            }
            float f2 = position.y;
            if (f2 != 0.0f) {
                interactAreaModel.setHeight((position.height / f2) * position.v);
            }
            interactAreaModel.setScale(position.scale);
            BusinessInfo businessInfo = interactionData.businessInfo;
            if (businessInfo != null && (str2 = businessInfo.userId) != null) {
                interactAreaModel.setToUserId(str2);
                IMContactApi.LIZ.getClass();
                String str4 = "";
                IMUser iMUserLJIIL = C069P.LIZ().LJ().LJIIL(interactAreaModel.getToUserId(), "", "im_local_db");
                if (iMUserLJIIL != null) {
                    String uniqueId = iMUserLJIIL.getUniqueId();
                    if (uniqueId == null) {
                        uniqueId = "";
                    }
                    interactAreaModel.setUserName(uniqueId);
                    String nickName = iMUserLJIIL.getNickName();
                    if (nickName == null) {
                        nickName = "";
                    }
                    interactAreaModel.setNickname(nickName);
                    UrlModel avatarThumb = iMUserLJIIL.getAvatarThumb();
                    if (avatarThumb != null && (urlList = avatarThumb.getUrlList()) != null && (str3 = (String) ListProtector.get(urlList, 0)) != null) {
                        str4 = str3;
                    }
                    interactAreaModel.setAvatarUrl(str4);
                }
                interactAreaModel.setScenario(X1());
                interactAreaModel.setMessageType(36865);
                InterfaceC1446740nke interfaceC1446740nkeJY02 = JY0();
                if (interfaceC1446740nkeJY02 != null && (videoPublishEditModelLJJJLIIL = interfaceC1446740nkeJY02.LJJJLIIL()) != null && (creativeModel = videoPublishEditModelLJJJLIIL.creativeModel) != null && (stickerNewEngineModel = creativeModel.stickerModel) != null && (list = stickerNewEngineModel.interactStickerStructs) != null) {
                    list.add(interactAreaModel);
                }
            }
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
        } catch (o e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }

    @Override // com.bef.effectsdk.message.MessageCenter.Listener
    public void onMessageReceived(int i, int i2, int i3, String str) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C417301jn(i, i2, i3, str, this, null), 3);
    }
}
