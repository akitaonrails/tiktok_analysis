package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig;
import com.ss.android.ugc.aweme.publish.model.UploadImageConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS35S0010000_22;

/* JADX INFO: renamed from: X.0nKm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1430700nKm extends AbstractC1434490nQt {
    public static final /* synthetic */ int LLIZ = 0;
    public C1431070nLN LLILZLL;

    @Override // X.AbstractC1434490nQt
    public final EnumC1434810nRP LJIIJJI() {
        return EnumC1434810nRP.STORY_THOUGHT_AVATAR_WITH_CUSTOM_BACKGROUND_UPLOAD;
    }

    public final void LJIILJJIL(C1430710nKn c1430710nKn) {
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
            c1431070nLN3.LIZLLL(c1430710nKn.getErrorCode(), c1430710nKn);
        }
    }

    @Override // X.AbstractC1434490nQt
    public final void LJII(C1404610meh c1404610meh, C1431070nLN c1431070nLN) {
        Iterator<Object> it2 = c1404610meh.LIZ.iterator();
        while (true) {
            String absolutePath = null;
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (next instanceof C1434960nRe) {
                if (next != null) {
                    VideoPublishEditModel videoPublishEditModel = ((C1434960nRe) next).LIZ;
                    this.LLILZLL = c1431070nLN;
                    if (videoPublishEditModel != null) {
                        C0VSJ c0vsj = new C0VSJ(C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJJL(videoPublishEditModel.getCreativeInfo()), "avatar.png");
                        if (c0vsj.exists()) {
                            absolutePath = c0vsj.getAbsolutePath();
                        }
                    }
                    if (absolutePath == null) {
                        C1431070nLN c1431070nLN2 = this.LLILZLL;
                        if (c1431070nLN2 != null) {
                            c1431070nLN2.LJ(new C1153000g6s(""), true);
                            return;
                        }
                        return;
                    }
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
                                final List listSingletonList = Collections.singletonList(absolutePath);
                                if (uploadImageConfig != null) {
                                    final C259800zU c259800zU = new C259800zU();
                                    c259800zU.element = "";
                                    final C2207831Bb3 c2207831Bb3 = new C2207831Bb3(uploadImageConfig);
                                    C0CHQ.LIZ().getApplicationService();
                                    c2207831Bb3.LJIIJJI(C19221910Hx.LJFF());
                                    C2208411Bbz c2208411Bbz = new C2208411Bbz();
                                    c2208411Bbz.LIZJ(uploadImageConfig);
                                    c2207831Bb3.LJIIL(c2208411Bbz.LIZLLL());
                                    c2207831Bb3.LJIILJJIL(new AwS35S0010000_22(37));
                                    c2207831Bb3.LJIIJ(new InterfaceC2207871Bb7() { // from class: X.0nKl
                                        @Override // X.InterfaceC2207871Bb7
                                        public final void onLog(int i, int i2, String str) {
                                        }

                                        /* JADX WARN: Type inference failed for: r1v7, types: [T, java.lang.String] */
                                        @Override // X.InterfaceC2207871Bb7
                                        public final void LIZ(int i, long j, AbstractImageUploader.ImageUploadInfo imageUploadInfo) {
                                            ?? r1;
                                            c2207831Bb3.LJ();
                                            if (i == 6) {
                                                C201955140j.LJIILL(C1440370naN.LIZIZ, "StoryThoughtAvatarWithCustomBackgroundUploadTask", "uploader.MsgIsSingleImageComplete");
                                                if (imageUploadInfo != null && (r1 = imageUploadInfo.mImageToskey) != 0) {
                                                    if (imageUploadInfo.mFileIndex == 0) {
                                                        c259800zU.element = r1;
                                                        return;
                                                    }
                                                    return;
                                                }
                                                this.LJIILJJIL(new C1430710nKn((String) C13LP.LJJJLL(listSingletonList), null));
                                                return;
                                            }
                                            c2207831Bb3.LJFF();
                                            if (i == 7) {
                                                C201955140j.LJIILL(C1440370naN.LIZIZ, "StoryThoughtAvatarWithCustomBackgroundUploadTask", "uploader.MsgIsSingleImageFail");
                                                this.LJIILJJIL(new C1430710nKn((String) C13LP.LJJJLL(listSingletonList), null));
                                                return;
                                            }
                                            c2207831Bb3.LJII();
                                            if (i == 3) {
                                                return;
                                            }
                                            c2207831Bb3.LJI();
                                            if (i == 1) {
                                                C201955140j.LJIILL(C1440370naN.LIZIZ, "StoryThoughtAvatarWithCustomBackgroundUploadTask", "uploader.MsgIsUpdateProgress");
                                                return;
                                            }
                                            c2207831Bb3.LIZLLL();
                                            if (i != 0) {
                                                return;
                                            }
                                            C201955140j.LJIILL(C1440370naN.LIZIZ, "StoryThoughtAvatarWithCustomBackgroundUploadTask", "uploader.MsgIsComplete");
                                            C1431070nLN c1431070nLN3 = this.LLILZLL;
                                            if (c1431070nLN3 == null) {
                                                return;
                                            }
                                            c1431070nLN3.LJ(new C1153000g6s(c259800zU.element), false);
                                        }
                                    });
                                    c2207831Bb3.LJIIIZ(listSingletonList.size(), (String[]) listSingletonList.toArray(new String[0]));
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
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.EditModelContainer");
    }
}
