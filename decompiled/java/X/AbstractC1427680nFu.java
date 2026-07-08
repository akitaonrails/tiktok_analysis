package X;

import android.text.TextUtils;
import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig;
import com.ss.android.ugc.aweme.publish.model.UploadImageConfig;
import com.ss.android.ugc.aweme.publish.model.VideoCreation;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.publish.CreateAwemeResponse;
import com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader;
import com.ss.android.ugc.aweme.uploader.retrofit.UploaderRetrofitService;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nFu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public abstract class AbstractC1427680nFu extends AbstractC1434490nQt {
    public String LLILZLL;
    public C1431070nLN LLIZ;
    public VideoPublishEditModel LLIZLLLIL;
    public String LLJ = "";
    public String LLJI = "";
    public String LLJIJIL = "";
    public long LLJILJIL = -1;
    public long LLJILJILJ = -1;
    public C2207831Bb3 LLJILLL;

    public abstract String LJIILJJIL(VideoPublishEditModel videoPublishEditModel);

    public abstract boolean LJIILL();

    public abstract String LJIILLIIL();

    public abstract String LJIJ(CreateAwemeResponse createAwemeResponse, VideoPublishEditModel videoPublishEditModel);

    public abstract InterfaceC1427650nFr LJIJI();

    public void LJIJJ(VideoPublishEditModel videoPublishEditModel) {
    }

    public abstract String LJIL(VideoPublishEditModel videoPublishEditModel);

    public abstract String LJJ();

    public final VideoPublishEditModel LJIIZILJ() {
        VideoPublishEditModel videoPublishEditModel = this.LLIZLLLIL;
        if (videoPublishEditModel != null) {
            return videoPublishEditModel;
        }
        return null;
    }

    @Override // X.AbstractC1434490nQt
    public final void LJII(C1404610meh c1404610meh, C1431070nLN c1431070nLN) {
        Object next;
        String aid;
        Aweme aweme;
        this.LLIZ = c1431070nLN;
        Iterator<Object> it2 = c1404610meh.LIZ.iterator();
        while (true) {
            Object obj = null;
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (next2 instanceof C1434960nRe) {
                if (next2 != null) {
                    this.LLIZLLLIL = ((C1434960nRe) next2).LIZ;
                    LJIJJ(LJIIZILJ());
                    this.LLILZLL = LJIIZILJ().getCreationId();
                    Iterator<Object> it3 = c1404610meh.LIZ.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            next = it3.next();
                            if (next instanceof CreateAwemeResponse) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    if (next instanceof CreateAwemeResponse) {
                        obj = next;
                    }
                    CreateAwemeResponse createAwemeResponse = (CreateAwemeResponse) obj;
                    if (createAwemeResponse == null || (aweme = createAwemeResponse.aweme) == null || (aid = aweme.getAid()) == null) {
                        aid = "";
                    }
                    this.LLJ = aid;
                    this.LLJIJIL = LJIJ(createAwemeResponse, LJIIZILJ());
                    if (LJIILL()) {
                        LJIJJLI(createAwemeResponse, true);
                        return;
                    }
                    final String strLJIL = LJIL(LJIIZILJ());
                    if (((strLJIL != null && strLJIL.length() != 0) || (strLJIL = LJIILJJIL(LJIIZILJ())) != null) && strLJIL.length() != 0) {
                        InterfaceC1427650nFr interfaceC1427650nFrLJIJI = LJIJI();
                        if (interfaceC1427650nFrLJIJI != null) {
                            interfaceC1427650nFrLJIJI.LIZ(EnumC1419290n2N.STAGE_PRE_UPLOAD, 0, this.LLJ, this.LLJI, null, null, null, 0L);
                        }
                        if (Intrinsics.LJFF("zip_url_invalid", strLJIL)) {
                            LJIJJLI(createAwemeResponse, true);
                            InterfaceC1427650nFr interfaceC1427650nFrLJIJI2 = LJIJI();
                            if (interfaceC1427650nFrLJIJI2 != null) {
                                interfaceC1427650nFrLJIJI2.LIZ(EnumC1419290n2N.STAGE_PRE_UPLOAD, 2, this.LLJ, this.LLJI, null, 10001, "zip_url_invalid_error", 0L);
                                return;
                            }
                            return;
                        }
                        LJIJJLI(createAwemeResponse, true);
                        String creationId = LJIIZILJ().getCreationId();
                        this.LLJILJIL = System.currentTimeMillis();
                        LJIIIZ().LIZIZ();
                        ListenableFuture<UploadAuthKeyConfig> ugcTemplateUploadAuthKeyConfig = ((UploaderRetrofitService) C1430900nL6.LIZ(UploaderRetrofitService.class)).getUgcTemplateUploadAuthKeyConfig(creationId, LJJ());
                        ugcTemplateUploadAuthKeyConfig.LJIIJJI(new C135Q(ugcTemplateUploadAuthKeyConfig, new C11U6<VideoCreation>() { // from class: X.0nFw
                            @Override // X.C11U6
                            public final void onFailure(Throwable th) {
                                InterfaceC1427650nFr interfaceC1427650nFrLJIJI3 = this.LIZ.LJIJI();
                                if (interfaceC1427650nFrLJIJI3 != null) {
                                    EnumC1419290n2N enumC1419290n2N = EnumC1419290n2N.STAGE_UPLOAD_ZIP;
                                    AbstractC1427680nFu abstractC1427680nFu = this.LIZ;
                                    interfaceC1427650nFrLJIJI3.LIZ(enumC1419290n2N, 2, abstractC1427680nFu.LLJ, abstractC1427680nFu.LLJI, null, 10002, "get_upload_token_error", 0L);
                                }
                                InterfaceC1427650nFr interfaceC1427650nFrLJIJI4 = this.LIZ.LJIJI();
                                if (interfaceC1427650nFrLJIJI4 != null) {
                                    interfaceC1427650nFrLJIJI4.LIZIZ(strLJIL);
                                }
                            }

                            @Override // X.C11U6
                            public final void onSuccess(VideoCreation videoCreation) {
                                VideoCreation videoCreation2 = videoCreation;
                                if (videoCreation2 instanceof UploadAuthKeyConfig) {
                                    final AbstractC1427680nFu abstractC1427680nFu = this.LIZ;
                                    final String str = strLJIL;
                                    abstractC1427680nFu.getClass();
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("AutoCutTemplateUploadTask#executeUploadZip: zipPath = ");
                                    sbLIZ.append(str);
                                    C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ));
                                    UploadImageConfig uploadImageConfig = ((UploadAuthKeyConfig) videoCreation2).imgConfig;
                                    if (uploadImageConfig != null) {
                                        C2207831Bb3 c2207831Bb3 = new C2207831Bb3(uploadImageConfig);
                                        C2208411Bbz c2208411Bbz = new C2208411Bbz();
                                        c2208411Bbz.LIZJ(uploadImageConfig);
                                        c2207831Bb3.LJIIL(c2208411Bbz.LIZLLL());
                                        C0CHQ.LIZ().getApplicationService();
                                        c2207831Bb3.LJIIJJI(C19221910Hx.LJFF());
                                        abstractC1427680nFu.LLJILLL = c2207831Bb3;
                                        c2207831Bb3.LJIIJ(new InterfaceC2207871Bb7() { // from class: X.0nFv
                                            @Override // X.InterfaceC2207871Bb7
                                            public final void onLog(int i, int i2, String str2) {
                                            }

                                            @Override // X.InterfaceC2207871Bb7
                                            public final void LIZ(int i, long j, AbstractImageUploader.ImageUploadInfo imageUploadInfo) {
                                                InterfaceC1427650nFr interfaceC1427650nFrLJIJI3;
                                                String str2;
                                                C2207831Bb3 c2207831Bb32 = abstractC1427680nFu.LLJILLL;
                                                String str3 = null;
                                                if (c2207831Bb32 == null) {
                                                    c2207831Bb32 = null;
                                                }
                                                c2207831Bb32.getClass();
                                                if (i == 6) {
                                                    AbstractC1427680nFu abstractC1427680nFu2 = abstractC1427680nFu;
                                                    if (imageUploadInfo == null || (str2 = imageUploadInfo.mImageToskey) == null) {
                                                        str2 = "";
                                                    }
                                                    abstractC1427680nFu2.LLJI = str2;
                                                    InterfaceC1427650nFr interfaceC1427650nFrLJIJI4 = abstractC1427680nFu2.LJIJI();
                                                    if (interfaceC1427650nFrLJIJI4 != null) {
                                                        EnumC1419290n2N enumC1419290n2N = EnumC1419290n2N.STAGE_UPLOAD_ZIP;
                                                        AbstractC1427680nFu abstractC1427680nFu3 = abstractC1427680nFu;
                                                        String str4 = abstractC1427680nFu3.LLJ;
                                                        String str5 = abstractC1427680nFu3.LLJI;
                                                        if (imageUploadInfo != null) {
                                                            str3 = imageUploadInfo.mExtra;
                                                        }
                                                        interfaceC1427650nFrLJIJI4.LIZ(enumC1419290n2N, 1, str4, str5, imageUploadInfo, null, str3, 0L);
                                                    }
                                                    final AbstractC1427680nFu abstractC1427680nFu4 = abstractC1427680nFu;
                                                    final String str6 = str;
                                                    if (!TextUtils.isEmpty(abstractC1427680nFu4.LLJ) && !TextUtils.isEmpty(abstractC1427680nFu4.LLJI)) {
                                                        abstractC1427680nFu4.LLJILJILJ = System.currentTimeMillis();
                                                        abstractC1427680nFu4.LJIIIZ().LIZIZ();
                                                        ListenableFuture<String> listenableFutureUgcTemplateVideoBinding = ((UploaderRetrofitService) C1430900nL6.LIZ(UploaderRetrofitService.class)).ugcTemplateVideoBinding(abstractC1427680nFu4.LLJ, abstractC1427680nFu4.LLJI, abstractC1427680nFu4.LLJIJIL, abstractC1427680nFu4.LJJ(), abstractC1427680nFu4.LJIILLIIL(), null);
                                                        listenableFutureUgcTemplateVideoBinding.LJIIJJI(new C135Q(listenableFutureUgcTemplateVideoBinding, new C11U6<String>() { // from class: X.0nFq
                                                            @Override // X.C11U6
                                                            public final void onFailure(Throwable th) {
                                                                InterfaceC1427650nFr interfaceC1427650nFrLJIJI5 = abstractC1427680nFu4.LJIJI();
                                                                if (interfaceC1427650nFrLJIJI5 != null) {
                                                                    EnumC1419290n2N enumC1419290n2N2 = EnumC1419290n2N.STAGE_BIND;
                                                                    AbstractC1427680nFu abstractC1427680nFu5 = abstractC1427680nFu4;
                                                                    interfaceC1427650nFrLJIJI5.LIZ(enumC1419290n2N2, 2, abstractC1427680nFu5.LLJ, abstractC1427680nFu5.LLJI, null, 10004, "vid_bind_error", 0L);
                                                                }
                                                                InterfaceC1427650nFr interfaceC1427650nFrLJIJI6 = abstractC1427680nFu4.LJIJI();
                                                                if (interfaceC1427650nFrLJIJI6 != null) {
                                                                    interfaceC1427650nFrLJIJI6.LIZIZ(str6);
                                                                }
                                                            }

                                                            @Override // X.C11U6
                                                            public final void onSuccess(String str7) {
                                                                InterfaceC1427650nFr interfaceC1427650nFrLJIJI5 = abstractC1427680nFu4.LJIJI();
                                                                if (interfaceC1427650nFrLJIJI5 != null) {
                                                                    EnumC1419290n2N enumC1419290n2N2 = EnumC1419290n2N.STAGE_BIND;
                                                                    AbstractC1427680nFu abstractC1427680nFu5 = abstractC1427680nFu4;
                                                                    interfaceC1427650nFrLJIJI5.LIZ(enumC1419290n2N2, 1, abstractC1427680nFu5.LLJ, abstractC1427680nFu5.LLJI, null, null, null, C1417710mzp.LIZLLL(abstractC1427680nFu5.LLJILJIL));
                                                                }
                                                                InterfaceC1427650nFr interfaceC1427650nFrLJIJI6 = abstractC1427680nFu4.LJIJI();
                                                                if (interfaceC1427650nFrLJIJI6 != null) {
                                                                    interfaceC1427650nFrLJIJI6.LIZIZ(str6);
                                                                }
                                                            }
                                                        }), EnumC2272608vM.LL);
                                                        return;
                                                    }
                                                    return;
                                                }
                                                C2207831Bb3 c2207831Bb33 = abstractC1427680nFu.LLJILLL;
                                                if (c2207831Bb33 == null) {
                                                    c2207831Bb33 = null;
                                                }
                                                c2207831Bb33.getClass();
                                                if (i != 7 || (interfaceC1427650nFrLJIJI3 = abstractC1427680nFu.LJIJI()) == null) {
                                                    return;
                                                }
                                                EnumC1419290n2N enumC1419290n2N2 = EnumC1419290n2N.STAGE_UPLOAD_ZIP;
                                                AbstractC1427680nFu abstractC1427680nFu5 = abstractC1427680nFu;
                                                String str7 = abstractC1427680nFu5.LLJ;
                                                String str8 = abstractC1427680nFu5.LLJI;
                                                if (imageUploadInfo != null) {
                                                    str3 = imageUploadInfo.mExtra;
                                                }
                                                interfaceC1427650nFrLJIJI3.LIZ(enumC1419290n2N2, 2, str7, str8, imageUploadInfo, null, str3, 0L);
                                            }
                                        });
                                        C2207831Bb3 c2207831Bb32 = abstractC1427680nFu.LLJILLL;
                                        if (c2207831Bb32 == null) {
                                            c2207831Bb32 = null;
                                        }
                                        c2207831Bb32.LJIIIZ(1, new String[]{str});
                                        try {
                                            try {
                                                C2207831Bb3 c2207831Bb33 = abstractC1427680nFu.LLJILLL;
                                                if (c2207831Bb33 == null) {
                                                    c2207831Bb33 = null;
                                                }
                                                c2207831Bb33.LJIILIIL();
                                            } catch (Exception e) {
                                                TryCatchGuardChecker.doCheck(e);
                                                C2207831Bb3 c2207831Bb34 = abstractC1427680nFu.LLJILLL;
                                                if (c2207831Bb34 == null) {
                                                    c2207831Bb34 = null;
                                                }
                                                c2207831Bb34.LIZJ();
                                            }
                                            abstractC1427680nFu.LJIJJLI(null, true);
                                            return;
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            abstractC1427680nFu.LJIJJLI(null, true);
                                            throw th;
                                        }
                                    }
                                    throw new IllegalArgumentException("upload image config is null");
                                }
                                InterfaceC1427650nFr interfaceC1427650nFrLJIJI3 = this.LIZ.LJIJI();
                                if (interfaceC1427650nFrLJIJI3 != null) {
                                    EnumC1419290n2N enumC1419290n2N = EnumC1419290n2N.STAGE_UPLOAD_ZIP;
                                    AbstractC1427680nFu abstractC1427680nFu2 = this.LIZ;
                                    interfaceC1427650nFrLJIJI3.LIZ(enumC1419290n2N, 2, abstractC1427680nFu2.LLJ, abstractC1427680nFu2.LLJI, null, 10003, "authkey_model_error", 0L);
                                }
                                InterfaceC1427650nFr interfaceC1427650nFrLJIJI4 = this.LIZ.LJIJI();
                                if (interfaceC1427650nFrLJIJI4 != null) {
                                    interfaceC1427650nFrLJIJI4.LIZIZ(strLJIL);
                                }
                            }
                        }), EnumC2272608vM.LL);
                        InterfaceC1427650nFr interfaceC1427650nFrLJIJI3 = LJIJI();
                        if (interfaceC1427650nFrLJIJI3 != null) {
                            interfaceC1427650nFrLJIJI3.LIZJ(strLJIL);
                            return;
                        }
                        return;
                    }
                    LJIJJLI(createAwemeResponse, true);
                    InterfaceC1427650nFr interfaceC1427650nFrLJIJI4 = LJIJI();
                    if (interfaceC1427650nFrLJIJI4 != null) {
                        interfaceC1427650nFrLJIJI4.LIZ(EnumC1419290n2N.STAGE_PRE_UPLOAD, 3, this.LLJ, this.LLJI, null, 10005, "no_zip_path_msg", 0L);
                        return;
                    }
                    return;
                }
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.EditModelContainer");
    }

    public final void LJIJJLI(Object obj, boolean z) {
        C1431070nLN c1431070nLN = this.LLIZ;
        if (c1431070nLN == null) {
            c1431070nLN = null;
        }
        c1431070nLN.LJ(obj, true);
    }
}
