package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.StoryNoteInfoModel;
import com.ss.android.ugc.aweme.creative.model.StoryShootModel;
import com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig;
import com.ss.android.ugc.aweme.publish.model.UploadImageConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS35S0010000_22;

/* JADX INFO: renamed from: X.0nKj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1430670nKj extends AbstractC1434490nQt {
    public static final /* synthetic */ int LLIZLLLIL = 0;
    public C1431070nLN LLILZLL;
    public VideoPublishEditModel LLIZ;

    @Override // X.AbstractC1434490nQt
    public final EnumC1434810nRP LJIIJJI() {
        return EnumC1434810nRP.STORY_THOUGHT_UPLOAD;
    }

    public final void LJIILJJIL(C1430720nKo c1430720nKo) {
        int i;
        C1431070nLN c1431070nLN = this.LLILZLL;
        if (c1431070nLN != null) {
            i = c1431070nLN.LIZJ;
        } else {
            i = 0;
        }
        if (i < C1430640nKg.LIZ()) {
            C1431070nLN c1431070nLN2 = this.LLILZLL;
            if (c1431070nLN2 != null) {
                c1431070nLN2.LIZ.LIZIZ(null);
                try {
                    c1431070nLN2.LIZIZ.invoke();
                    return;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return;
                }
            }
            return;
        }
        C1431070nLN c1431070nLN3 = this.LLILZLL;
        if (c1431070nLN3 != null) {
            c1431070nLN3.LIZLLL(c1430720nKo.getErrorCode(), c1430720nKo);
        }
    }

    @Override // X.AbstractC1434490nQt
    public final void LJII(C1404610meh c1404610meh, C1431070nLN c1431070nLN) {
        CreativeModel creativeModel;
        StoryShootModel storyShootModel;
        StoryNoteInfoModel storyNoteInfoModel;
        String str;
        CreativeModel creativeModel2;
        StoryShootModel storyShootModel2;
        StoryNoteInfoModel storyNoteInfoModel2;
        List<String> list;
        Iterator<Object> it2 = c1404610meh.LIZ.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (next instanceof C1434960nRe) {
                if (next != null) {
                    VideoPublishEditModel videoPublishEditModel = ((C1434960nRe) next).LIZ;
                    this.LLIZ = videoPublishEditModel;
                    this.LLILZLL = c1431070nLN;
                    if (videoPublishEditModel != null && (creativeModel = videoPublishEditModel.creativeModel) != null && (storyShootModel = creativeModel.storyModel) != null && (storyNoteInfoModel = storyShootModel.getStoryNoteInfoModel()) != null && (str = storyNoteInfoModel.animatedAvatarFilePath) != null && str.length() > 0) {
                        VideoPublishEditModel videoPublishEditModel2 = this.LLIZ;
                        if (videoPublishEditModel2 != null && (creativeModel2 = videoPublishEditModel2.creativeModel) != null && (storyShootModel2 = creativeModel2.storyModel) != null && (storyNoteInfoModel2 = storyShootModel2.getStoryNoteInfoModel()) != null && (list = storyNoteInfoModel2.extractedBitmapPath) != null) {
                            Iterator<Object> it3 = c1404610meh.LIZ.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    break;
                                }
                                Object next2 = it3.next();
                                if (next2 instanceof C1404770mex) {
                                    if (next2 != null) {
                                        UploadAuthKeyConfig uploadAuthKeyConfig = (UploadAuthKeyConfig) ((C1404770mex) next2).LIZ;
                                        UploadImageConfig uploadImageConfig = uploadAuthKeyConfig.photoModeUploadConfig;
                                        if (uploadImageConfig == null) {
                                            uploadImageConfig = uploadAuthKeyConfig.frameUploadConfig;
                                        }
                                        final ArrayList arrayList = new ArrayList(list);
                                        ListProtector.add(arrayList, 0, str);
                                        if (uploadImageConfig != null) {
                                            final C259800zU c259800zU = new C259800zU();
                                            c259800zU.element = "";
                                            final ArrayList arrayList2 = new ArrayList();
                                            final C2207831Bb3 c2207831Bb3 = new C2207831Bb3(uploadImageConfig);
                                            C0CHQ.LIZ().getApplicationService();
                                            c2207831Bb3.LJIIJJI(C19221910Hx.LJFF());
                                            C2208411Bbz c2208411Bbz = new C2208411Bbz();
                                            c2208411Bbz.LIZJ(uploadImageConfig);
                                            c2207831Bb3.LJIIL(c2208411Bbz.LIZLLL());
                                            c2207831Bb3.LJIILJJIL(new AwS35S0010000_22(37));
                                            c2207831Bb3.LJIIJ(new InterfaceC2207871Bb7() { // from class: X.0nKk
                                                @Override // X.InterfaceC2207871Bb7
                                                public final void onLog(int i, int i2, String str2) {
                                                }

                                                /* JADX WARN: Type inference failed for: r2v4, types: [T, java.lang.Object, java.lang.String] */
                                                @Override // X.InterfaceC2207871Bb7
                                                public final void LIZ(int i, long j, AbstractImageUploader.ImageUploadInfo imageUploadInfo) {
                                                    C1431070nLN c1431070nLN2;
                                                    ?? r2;
                                                    c2207831Bb3.LJ();
                                                    if (i == 6) {
                                                        C201955140j.LJIILL(C1440370naN.LIZIZ, "StoryThoughtUploadTask", "uploader.MsgIsSingleImageComplete");
                                                        if (imageUploadInfo != null && (r2 = imageUploadInfo.mImageToskey) != 0) {
                                                            int i2 = imageUploadInfo.mFileIndex;
                                                            if (i2 == 0) {
                                                                c259800zU.element = r2;
                                                                return;
                                                            } else {
                                                                ListProtector.add(arrayList2, i2 - 1, r2);
                                                                return;
                                                            }
                                                        }
                                                        this.LJIILJJIL(new C1430720nKo((String) C13LP.LJJJLL(arrayList), null));
                                                        return;
                                                    }
                                                    c2207831Bb3.LJFF();
                                                    if (i == 7) {
                                                        C201955140j.LJIILL(C1440370naN.LIZIZ, "StoryThoughtUploadTask", "uploader.MsgIsSingleImageFail");
                                                        this.LJIILJJIL(new C1430720nKo((String) C13LP.LJJJLL(arrayList), null));
                                                        return;
                                                    }
                                                    c2207831Bb3.LJII();
                                                    if (i == 3) {
                                                        return;
                                                    }
                                                    c2207831Bb3.LJI();
                                                    if (i == 1) {
                                                        C201955140j.LJIILL(C1440370naN.LIZIZ, "StoryThoughtUploadTask", "uploader.MsgIsUpdateProgress");
                                                        return;
                                                    }
                                                    c2207831Bb3.LIZLLL();
                                                    if (i != 0) {
                                                        return;
                                                    }
                                                    C201955140j.LJIILL(C1440370naN.LIZIZ, "StoryThoughtUploadTask", "uploader.MsgIsComplete");
                                                    if (arrayList2.size() != arrayList.size() - 1 || (c1431070nLN2 = this.LLILZLL) == null) {
                                                        return;
                                                    }
                                                    c1431070nLN2.LJ(new C07UO(c259800zU.element, arrayList2), false);
                                                }
                                            });
                                            c2207831Bb3.LJIIIZ(arrayList.size(), (String[]) arrayList.toArray(new String[0]));
                                            C0CHQ.LIZ().getApplicationService();
                                            c2207831Bb3.LJIIJJI(C19221910Hx.LJFF());
                                            c2207831Bb3.LJIILIIL();
                                            return;
                                        }
                                        return;
                                    }
                                }
                            }
                            throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.story.AuthKeyResult");
                        }
                        C1431070nLN c1431070nLN2 = this.LLILZLL;
                        if (c1431070nLN2 != null) {
                            c1431070nLN2.LJ(new C07UO("", C13BV.INSTANCE), true);
                            return;
                        }
                        return;
                    }
                    C1431070nLN c1431070nLN3 = this.LLILZLL;
                    if (c1431070nLN3 != null) {
                        c1431070nLN3.LJ(new C07UO("", C13BV.INSTANCE), true);
                        return;
                    }
                    return;
                }
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.EditModelContainer");
    }
}
