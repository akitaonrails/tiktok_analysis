package X;

import Y.AComparatorS41S0000000_22;
import Y.ARunnableS122S0100000_22;
import Y.ARunnableS17S1100000_12;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.EditPostModel;
import com.ss.android.ugc.aweme.creative.model.album.ImportVideoInfo;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.ImageSurfaceData;
import com.ss.android.ugc.aweme.creative.model.edit.ImageSynthesisResult;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.edit.SrcImageInfo;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicObject;
import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import com.ss.android.ugc.aweme.edit.TTStoryUploadModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.InteractionTagUserInfo;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.image.ui.ImageEditRootScene;
import com.ss.android.ugc.aweme.publish.privacy.PermissionConfigure;
import com.ss.android.ugc.aweme.publish.privacy.PostBtnConfigure;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.shortvideo.CreateBaseAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.ss.android.ugc.aweme.shortvideo.privacy.ui.EditPageDefaultPrivacySettingFragment;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS423S0200000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.text.a0;
import uxk.a;

/* JADX INFO: renamed from: X.0ngn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1444350ngn implements InterfaceC1444410ngt {
    public static final int LLJJJJLIIL = 8;
    public final Fragment LL;
    public final C19EG LLILLJJLI;
    public final String LLILLL;
    public final boolean LLILZ;
    public VideoPublishEditModel LLILZIL = new VideoPublishEditModel();
    public String LLILZLL = "live_high_light_image";
    public int LLIZ = -1;
    public final MutableLiveData<Boolean> LLIZLLLIL = new MutableLiveData<>(Boolean.FALSE);
    public TuxSheet LLJ;
    public final Boolean LLJI;
    public String LLJIJIL;
    public int LLJILJIL;
    public int LLJILJILJ;
    public String LLJILLL;
    public int LLJJ;
    public Map<String, String> LLJJI;
    public String LLJJIII;
    public InterfaceC1433360nP4<CreateBaseAwemeResponse> LLJJIJI;
    public Function1<? super String, Unit> LLJJIJIIJIL;
    public InterfaceC1631630sYr<? super Integer, ? super String, ? super String, ? super String, Unit> LLJJIJIL;
    public List<C1444390ngr> LLJJJ;
    public String LLJJJIL;
    public String LLJJJJ;
    public long LLJJJJJIL;

    /* JADX WARN: Multi-variable type inference failed */
    private final void LIZIZ() {
        List<AVTextExtraStruct> arrayList;
        String str;
        String str2;
        IAVPublishService iAVPublishServicePublishService;
        IAVPublishService iAVPublishServicePublishService2;
        int i = 2;
        this.LLILZIL.setCreationMode(2);
        this.LLILZIL.setTitle(this.LLJIJIL);
        VideoPublishEditModel videoPublishEditModel = this.LLILZIL;
        int i2 = this.LLJJ;
        if (i2 == 0) {
            i = 0;
        } else if (i2 != 1) {
            i = i2 != 2 ? -1 : 1;
        }
        videoPublishEditModel.isPrivate = i;
        IExternalService iExternalService = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null);
        if (iExternalService == null || (iAVPublishServicePublishService2 = iExternalService.publishService()) == null || (arrayList = iAVPublishServicePublishService2.getMetaDataHashTag(this.LLJIJIL)) == null) {
            arrayList = new ArrayList<>();
        }
        ArrayList arrayList2 = new ArrayList();
        List<C1444390ngr> list = this.LLJJJ;
        String str3 = "";
        if (list != null) {
            for (C1444390ngr c1444390ngr : list) {
                if (c1444390ngr.LIZ == 0) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append('@');
                    sbLIZ.append(c1444390ngr.LIZIZ);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    String str4 = this.LLJIJIL;
                    if (str4 != null) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append('@');
                        sbLIZ2.append(c1444390ngr.LIZIZ);
                        int iLJJJ = a0.LJJJ(str4, C2188811AlT.LIZIZ(sbLIZ2), 0, false, 4);
                        if (iLJJJ >= 0) {
                            AVTextExtraStruct aVTextExtraStruct = new AVTextExtraStruct();
                            aVTextExtraStruct.type = 0;
                            aVTextExtraStruct.start = iLJJJ;
                            aVTextExtraStruct.end = iLJJJ + strLIZIZ.length();
                            aVTextExtraStruct.hashTagName = strLIZIZ;
                            aVTextExtraStruct.userId = c1444390ngr.LIZJ;
                            String str5 = c1444390ngr.LIZLLL;
                            if (str5 == null) {
                                str5 = "";
                            }
                            aVTextExtraStruct.setSecUid(str5);
                            arrayList2.add(aVTextExtraStruct);
                        }
                    }
                }
            }
        }
        ArrayList arrayList3 = new ArrayList();
        arrayList3.addAll(arrayList2);
        arrayList3.addAll(arrayList);
        List<AVTextExtraStruct> listLJLLLL = C13LP.LJLLLL(new AComparatorS41S0000000_22(7), arrayList3);
        int i3 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        IExternalService iExternalService2 = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null);
        if (iExternalService2 != null && (iAVPublishServicePublishService = iExternalService2.publishService()) != null) {
            iAVPublishServicePublishService.buildFakeMarkupText(this.LLJIJIL, listLJLLLL, this.LLILZIL);
        }
        VideoUrlModel videoUrlModel = null;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        Object[] objArr8 = 0;
        Object[] objArr9 = 0;
        Object[] objArr10 = 0;
        Object[] objArr11 = 0;
        Object[] objArr12 = 0;
        Object[] objArr13 = 0;
        Object[] objArr14 = 0;
        Object[] objArr15 = 0;
        Object[] objArr16 = 0;
        Object[] objArr17 = 0;
        Object[] objArr18 = 0;
        Object[] objArr19 = 0;
        Object[] objArr20 = 0;
        Object[] objArr21 = 0;
        Object[] objArr22 = 0;
        Object[] objArr23 = 0;
        Object[] objArr24 = 0;
        Object[] objArr25 = 0;
        Object[] objArr26 = 0;
        Object[] objArr27 = 0;
        ImportVideoInfo importVideoInfo = new ImportVideoInfo(0, 0, 0, 0, null, 0L, 0L, null, null, 0, 0.0f, null, null, false, null, null, 0L, 131071, null);
        importVideoInfo.setOriginImportPath(this.LLJILLL);
        importVideoInfo.setRealImportPath(this.LLJILLL);
        String str6 = null;
        Object[] objArr28 = 0;
        Object[] objArr29 = 0;
        Object[] objArr30 = 0;
        Object[] objArr31 = 0;
        Object[] objArr32 = 0;
        Object[] objArr33 = 0;
        Object[] objArr34 = 0;
        Object[] objArr35 = 0;
        Object[] objArr36 = 0;
        Object[] objArr37 = 0;
        Object[] objArr38 = 0;
        Object[] objArr39 = 0;
        Object[] objArr40 = 0;
        Object[] objArr41 = 0;
        Object[] objArr42 = 0;
        Object[] objArr43 = 0;
        Object[] objArr44 = 0;
        Object[] objArr45 = 0;
        Object[] objArr46 = 0;
        Object[] objArr47 = 0;
        Object[] objArr48 = 0;
        Object[] objArr49 = 0;
        Object[] objArr50 = 0;
        Object[] objArr51 = 0;
        Object[] objArr52 = 0;
        Object[] objArr53 = 0;
        Object[] objArr54 = 0;
        Object[] objArr55 = 0;
        Object[] objArr56 = 0;
        ImageSynthesisResult imageSynthesisResult = new ImageSynthesisResult(this.LLJILLL, this.LLJILJIL, this.LLJILJILJ, null, null, null, null, null, null, 504, null);
        ArrayList<SingleImageData> arrayList4 = new ArrayList();
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(this.LLILZIL.getCreationId());
        sbLIZ3.append('_');
        sbLIZ3.append(System.currentTimeMillis());
        boolean z = false;
        Object[] objArr57 = 0;
        Object[] objArr58 = 0;
        Object[] objArr59 = 0;
        Object[] objArr60 = 0;
        int i4 = 0;
        Object[] objArr61 = 0;
        Object[] objArr62 = 0;
        Object[] objArr63 = 0;
        Object[] objArr64 = 0;
        Object[] objArr65 = 0;
        Object[] objArr66 = 0;
        Object[] objArr67 = 0;
        Object[] objArr68 = 0;
        Object[] objArr69 = 0;
        Object[] objArr70 = 0;
        Object[] objArr71 = 0;
        Object[] objArr72 = 0;
        Object[] objArr73 = 0;
        Object[] objArr74 = 0;
        Object[] objArr75 = 0;
        Object[] objArr76 = 0;
        Object[] objArr77 = 0;
        Object[] objArr78 = 0;
        Object[] objArr79 = 0;
        Object[] objArr80 = 0;
        Object[] objArr81 = 0;
        Object[] objArr82 = 0;
        Object[] objArr83 = 0;
        Object[] objArr84 = 0;
        Object[] objArr85 = 0;
        Object[] objArr86 = 0;
        SingleImageData singleImageData = new SingleImageData(C2188811AlT.LIZIZ(sbLIZ3), null, new SrcImageInfo(this.LLJILLL, this.LLJILJILJ, this.LLJILJIL, null, null, 24, null), 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, imageSynthesisResult, 0 == true ? 1 : 0, i3, 0 == true ? 1 : 0, importVideoInfo, 0 == true ? 1 : 0, 0 == true ? 1 : 0, objArr2 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, objArr == true ? 1 : 0, 8379890, 0 == true ? 1 : 0);
        ImageSurfaceData imageSurfaceData = new ImageSurfaceData(this.LLJILJIL, this.LLJILJILJ, 0, 4, null);
        arrayList4.add(singleImageData);
        this.LLILZIL.setImageAlbumData(new ImageAlbumData(arrayList4, 0, false, imageSurfaceData, C1450870nrJ.LIZIZ(), C1450870nrJ.LIZIZ(), null, null, null, null, false, false, false, false, false, false, false, false, null, 0, null, 2097094, null));
        CreativeModel creativeModel = this.LLILZIL.creativeModel;
        if (creativeModel.editPostModel == null) {
            creativeModel.editPostModel = new EditPostModel(z, videoUrlModel, objArr27 == true ? 1 : 0, objArr26 == true ? 1 : 0, objArr25 == true ? 1 : 0, objArr24 == true ? 1 : 0, objArr23 == true ? 1 : 0, objArr22 == true ? 1 : 0, objArr21 == true ? 1 : 0, objArr20 == true ? 1 : 0, 0L, objArr19 == true ? 1 : 0, objArr18 == true ? 1 : 0, objArr60 == true ? 1 : 0, objArr59 == true ? 1 : 0, objArr58 == true ? 1 : 0, objArr57 == true ? 1 : 0, objArr17 == true ? 1 : 0, objArr16 == true ? 1 : 0, objArr15 == true ? 1 : 0, objArr14 == true ? 1 : 0, objArr13 == true ? 1 : 0, objArr12 == true ? 1 : 0, objArr11 == true ? 1 : 0, objArr10 == true ? 1 : 0, objArr9 == true ? 1 : 0, objArr8 == true ? 1 : 0, objArr7 == true ? 1 : 0, objArr6 == true ? 1 : 0, objArr5 == true ? 1 : 0, objArr4 == true ? 1 : 0, Integer.MAX_VALUE, objArr3 == true ? 1 : 0);
        }
        EditPostModel editPostModel = this.LLILZIL.creativeModel.editPostModel;
        if (editPostModel != null) {
            editPostModel.setPhotoModeHeading(this.LLJIJIL);
        }
        this.LLILZIL.creativeModel.creationTypeModel.videoEditorType = 12;
        Map<String, String> map = this.LLJJI;
        if (map == null || (str = map.get("enter_from")) == null) {
            str = "";
        }
        Map<String, String> map2 = this.LLJJI;
        if (map2 != null && (str2 = map2.get("enter_method")) != null) {
            str3 = str2;
        }
        if (!TextUtils.isEmpty(str)) {
            this.LLILZLL = str;
        }
        VideoPublishEditModel videoPublishEditModel2 = this.LLILZIL;
        videoPublishEditModel2.mShootWay = str;
        videoPublishEditModel2.setShootFrom(str3);
        this.LLILZIL.setEnterFrom(str);
        this.LLILZIL.setShootEnterMethod(str3);
        VideoPublishEditModel videoPublishEditModel3 = this.LLILZIL;
        videoPublishEditModel3.creativeModel.initialModel.highLightVideoParametersModel.enterFromPage = str;
        ArrayList arrayList5 = new ArrayList(C15438062q.LJIJJ(arrayList4, 10));
        for (SingleImageData singleImageData2 : arrayList4) {
            EditVideoSegment editVideoSegment = new EditVideoSegment(singleImageData2.getSrcImageInfo().getPath(), null, new VideoFileInfo(singleImageData2.getSrcImageInfo().getWidth(), singleImageData2.getSrcImageInfo().getHeight(), 10000 / ((long) arrayList4.size()), 0, 0, 0, 0, 0, 0.0f, 504, null));
            editVideoSegment.setImage(true);
            editVideoSegment.setVideoCutInfo(new VideoCutInfo(0L, editVideoSegment.getVideoFileInfo().getDuration(), 1.0f, 0));
            arrayList5.add(editVideoSegment);
        }
        long j = 0;
        videoPublishEditModel3.setPreviewInfo(new EditPreviewInfo(new ArrayList(arrayList5), this.LLJILJIL, this.LLJILJILJ, 0L, 0L, ""));
        this.LLILZIL.setVideoCoverPath(this.LLJILLL);
        Workspace workspaceLIZ = C1436370nTv.LIZ(this.LLILZIL);
        this.LLILZIL.setOutputFile(workspaceLIZ.LJFF().getPath());
        this.LLILZIL.setParallelUploadOutputFile(workspaceLIZ.LIZLLL().getPath());
        long j2 = this.LLJJJJJIL;
        if (j2 > 0) {
            MusicBuzModel musicBuzModel = this.LLILZIL.creativeModel.musicBuzModel;
            musicBuzModel.music = new MusicObject(j2, str6, objArr56 == true ? 1 : 0, i4, objArr86 == true ? 1 : 0, objArr85 == true ? 1 : 0, objArr55 == true ? 1 : 0, objArr54 == true ? 1 : 0, objArr53 == true ? 1 : 0, objArr84 == true ? 1 : 0, objArr52 == true ? 1 : 0, objArr51 == true ? 1 : 0, objArr83 == true ? 1 : 0, objArr82 == true ? 1 : 0, objArr50 == true ? 1 : 0, objArr81 == true ? 1 : 0, objArr80 == true ? 1 : 0, objArr49 == true ? 1 : 0, objArr48 == true ? 1 : 0, objArr47 == true ? 1 : 0, j, objArr79 == true ? 1 : 0, objArr46 == true ? 1 : 0, objArr45 == true ? 1 : 0, objArr78 == true ? 1 : 0, objArr44 == true ? 1 : 0, objArr77 == true ? 1 : 0, objArr76 == true ? 1 : 0, objArr43 == true ? 1 : 0, objArr75 == true ? 1 : 0, objArr74 == true ? 1 : 0, objArr42 == true ? 1 : 0, 1, objArr73 == true ? 1 : 0, objArr72 == true ? 1 : 0, objArr41 == true ? 1 : 0, objArr40 == true ? 1 : 0, objArr71 == true ? 1 : 0, 0.0f, objArr39 == true ? 1 : 0, objArr38 == true ? 1 : 0, objArr70 == true ? 1 : 0, objArr37 == true ? 1 : 0, C538540LAe.LLJJJIL, objArr69 == true ? 1 : 0, objArr68 == true ? 1 : 0, objArr67 == true ? 1 : 0, objArr36 == true ? 1 : 0, objArr35 == true ? 1 : 0, objArr34 == true ? 1 : 0, objArr66 == true ? 1 : 0, objArr65 == true ? 1 : 0, objArr64 == true ? 1 : 0, objArr33 == true ? 1 : 0, objArr32 == true ? 1 : 0, objArr31 == true ? 1 : 0, objArr63 == true ? 1 : 0, objArr62 == true ? 1 : 0, objArr61 == true ? 1 : 0, objArr30 == true ? 1 : 0, j, j, objArr29 == true ? 1 : 0, -2, 2147481598, objArr28 == true ? 1 : 0);
            musicBuzModel.isPhotoMvModeMusic = true;
            musicBuzModel.changeTone = true;
            musicBuzModel.musicEnd = C538540LAe.LLJJJIL;
            musicBuzModel.musicType = 1;
        }
    }

    private final void LIZJ() {
        this.LLJJIJI = new InterfaceC1433360nP4<CreateBaseAwemeResponse>() { // from class: X.0ngo
            @Override // X.InterfaceC1433360nP4
            public final void LIZLLL(String str) {
            }

            @Override // X.InterfaceC1433360nP4
            public final void LJ() {
            }

            @Override // X.InterfaceC1433360nP4
            public final void LJFF(int i, C1434900nRY c1434900nRY) {
            }

            /* JADX WARN: Removed duplicated region for block: B:12:0x0024 A[PHI: r1
              0x0024: PHI (r1v3 java.lang.String) = (r1v1 java.lang.String), (r1v4 java.lang.String) binds: [B:11:0x0022, B:9:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // X.InterfaceC1433360nP4
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZIZ(X.C1434650nR9 r6, com.ss.android.ugc.aweme.shortvideo.publish.PublishModel r7) {
                /*
                    r5 = this;
                    X.0ngn r1 = r5.LL
                    java.lang.String r0 = r1.LLJJJJ
                    r1.LJJIIZI(r0)
                    X.0ngn r0 = r5.LL
                    X.0sYr<? super java.lang.Integer, ? super java.lang.String, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> r4 = r0.LLJJIJIL
                    if (r4 == 0) goto L30
                    if (r6 == 0) goto L36
                    int r0 = r6.getErrorCode()
                L13:
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
                    java.lang.String r2 = ""
                    if (r6 == 0) goto L21
                    java.lang.String r1 = r6.getMessage()
                    if (r1 != 0) goto L24
                L21:
                    r1 = r2
                    if (r6 == 0) goto L2b
                L24:
                    java.lang.String r0 = r6.getServerLogId()
                    if (r0 == 0) goto L2b
                    r2 = r0
                L2b:
                    java.lang.String r0 = "publish_segment"
                    r4.invoke(r3, r0, r1, r2)
                L30:
                    X.0ngn r0 = r5.LL
                    r0.LJIILLIIL()
                    return
                L36:
                    r0 = -2
                    goto L13
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1444360ngo.LIZIZ(X.0nR9, com.ss.android.ugc.aweme.shortvideo.publish.PublishModel):void");
            }

            @Override // X.InterfaceC1433360nP4
            public final void LIZJ(CreateBaseAwemeResponse createBaseAwemeResponse, boolean z, PublishModel publishModel) {
                String str;
                C1444350ngn c1444350ngn = this.LL;
                c1444350ngn.LJJIIZI(c1444350ngn.LLJJJIL);
                Function1<? super String, Unit> function1 = this.LL.LLJJIJIIJIL;
                if (function1 != null) {
                    if (publishModel == null || (str = publishModel.publishId) == null) {
                        str = "";
                    }
                    function1.invoke(str);
                }
                this.LL.LJIILLIIL();
            }
        };
    }

    public final void LJIILLIIL() {
        C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS122S0100000_22(this, 64));
    }

    public final void LJIJJ() {
        this.LLIZLLLIL.setValue(Boolean.TRUE);
        C0CHQ.LIZ().getPublishService().LJJLIIIJLJLI().getClass();
        VideoPublishEditModel videoPublishEditModel = this.LLILZIL;
        C1403840mdS.LJI(videoPublishEditModel.isPrivate(), videoPublishEditModel, this.LLILZLL, new AwS601S0100000_22(this, 410));
    }

    public final void LJJIII() {
        CreativeToolsPluginService creativeToolsPluginService;
        String strStartPublish;
        IAVPublishService iAVPublishServicePublishService;
        IAVPublishService iAVPublishServicePublishService2;
        C19EG c19eg = this.LLILLJJLI;
        if (c19eg == null || (creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null)) == null || !creativeToolsPluginService.LIZJ(c19eg, "live_high_light_publish", true)) {
            return;
        }
        Bundle bundleLIZIZ = C1436250nTj.LIZIZ(this.LLILZIL);
        bundleLIZIZ.putBoolean("directly_publish_only", true);
        TTStoryUploadModel ttStoryUploadModel = this.LLILZIL.getTtStoryUploadModel();
        if (ttStoryUploadModel != null) {
            ttStoryUploadModel.setStartPublishTime(System.currentTimeMillis());
        }
        IExternalService iExternalService = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null);
        if (iExternalService == null || (iAVPublishServicePublishService2 = iExternalService.publishService()) == null || (strStartPublish = iAVPublishServicePublishService2.startPublish(c19eg, bundleLIZIZ)) == null) {
            strStartPublish = CardStruct.IStatusCode.DEFAULT;
        }
        this.LLJJIII = strStartPublish;
        C1431870nMf c1431870nMfLJJJLL = C0CHQ.LIZ().getPublishService().LJJJLL();
        VideoPublishEditModel videoPublishEditModel = this.LLILZIL;
        Fragment fragment = this.LL;
        C557270LtN.LIZ(c1431870nMfLJJJLL, c19eg, videoPublishEditModel, 0, false, false, null, fragment != null ? fragment.getArguments() : null, this.LLILZLL, 60);
        LIZJ();
        IExternalService iExternalService2 = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null);
        if (iExternalService2 == null || (iAVPublishServicePublishService = iExternalService2.publishService()) == null) {
            return;
        }
        iAVPublishServicePublishService.addPublishCallback(this.LLJJIJI, this.LLJJIII);
    }

    public void LJJIIJZLJL() {
        C19EG c19eg;
        if (this.LLILZIL == null || (c19eg = this.LLILLJJLI) == null) {
            return;
        }
        C201955140j.LJIILJJIL(C830690WiJ.LIZIZ, "start publish story with checker");
        if (!this.LLILZ) {
            LJJIII();
        } else {
            ImageEditRootScene imageEditRootScene = new ImageEditRootScene();
            C1403010mc7.LIZ.LIZLLL().LIZ(new C856060Xi8(imageEditRootScene, c19eg, this.LLILZIL, c19eg, ZJ(null, false, true), imageEditRootScene, imageEditRootScene, new AwS566S0100000_22(this, 606), true));
        }
    }

    @Override // X.InterfaceC1444410ngt
    public void kM0() {
        TuxSheet tuxSheet = this.LLJ;
        if (tuxSheet != null) {
            tuxSheet.dismiss();
        }
    }

    @Override // X.InterfaceC1444410ngt
    public void s80() {
        C1DRG c1drgLJFF;
        C19EG c19eg = this.LLILLJJLI;
        if ((c19eg instanceof C19EG) && c19eg != null && (!C545820Lau.LIZLLL(c19eg, null))) {
            if (C1444450ngx.LIZJ()) {
                a.LIZ.getClass();
                if (a.LJIIJJI()) {
                    a.LJI();
                }
            }
            C214728191q c214728191qLJJLIIIJLJLI = C0CHQ.LIZ().getPublishService().LJJLIIIJLJLI();
            this.LLIZ = this.LLILZIL.isPrivate;
            AwS601S0100000_22 awS601S0100000_22 = new AwS601S0100000_22(this, 411);
            if (!C1444380ngq.LIZ() || (c1drgLJFF = C1664600tQ2.LIZLLL(this.LLILLJJLI).LJFF()) == null || !C214728191q.LJ(c1drgLJFF, new DialogInterfaceOnDismissListenerC1466680oGo(this, 3), awS601S0100000_22)) {
                EditPageDefaultPrivacySettingFragment editPageDefaultPrivacySettingFragmentLIZJ = C214728191q.LIZJ(LJIIIZ(false, false), awS601S0100000_22);
                C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
                c1390920mIc.LIZ.LLJJIJI = editPageDefaultPrivacySettingFragmentLIZJ;
                Integer numLIZJ = C1308910kAL.LIZJ(C10BZ.LIZ() ? R.attr.a1b : R.attr.zp, c19eg);
                TuxSheet tuxSheet = c1390920mIc.LIZ;
                tuxSheet.LLJI = numLIZJ;
                tuxSheet.LLILLJJLI = new DialogInterfaceOnDismissListenerC1466690oGp(c214728191qLJJLIIIJLJLI, editPageDefaultPrivacySettingFragmentLIZJ, this, 2);
                c1390920mIc.LJIIIIZZ(1);
                c1390920mIc.LIZ.LLJJL = (int) (((double) C0FUC.LIZIZ()) * 0.65d);
                if (C10BZ.LIZ()) {
                    c1390920mIc.LIZJ(true);
                }
                TuxSheet tuxSheet2 = c1390920mIc.LIZ;
                this.LLJ = tuxSheet2;
                if (tuxSheet2 != null) {
                    tuxSheet2.show(editPageDefaultPrivacySettingFragmentLIZJ.getChildFragmentManager(), "PrivacySettingSheet");
                }
            }
            LJIJJ();
            ComplianceServiceProvider.LJIJJ().LJIIIZ(1, "content_reuse_permission");
        }
    }

    public final C19EG LJFF() {
        return this.LLILLJJLI;
    }

    public final Fragment LJI() {
        return this.LL;
    }

    public final boolean LJII() {
        return this.LLILZ;
    }

    public final String LJIIIIZZ() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC1444410ngt
    public LiveData<Boolean> QW() {
        return this.LLIZLLLIL;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0003  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void LJIILIIL(java.lang.String r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L3
            goto L6
        L3:
            r0 = 0
            goto L10
        L6:
            int r0 = r3.length()     // Catch: java.lang.Exception -> L13
            if (r0 <= 0) goto L3
            long r0 = com.bytedance.mt.protector.impl.string2number.CastLongProtector.parseLong(r3)     // Catch: java.lang.Exception -> L13
        L10:
            r2.LLJJJJJIL = r0     // Catch: java.lang.Exception -> L13
            return
        L13:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1444350ngn.LJIILIIL(java.lang.String):void");
    }

    private final void LJIIZILJ(int i) {
        ArrayList<InteractionTagUserInfo> tagUserList;
        C19EG c19eg = this.LLILLJJLI;
        if (c19eg != null) {
            if (i != 0) {
                VideoPublishEditModel videoPublishEditModel = this.LLILZIL;
                videoPublishEditModel.playlist_id = null;
                videoPublishEditModel.playlist_name = null;
            }
            ArrayList<InteractionTagUserInfo> tagUserList2 = this.LLILZIL.getTagUserList();
            if (tagUserList2 != null && !tagUserList2.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                if (i != 1) {
                    if (i == 2 && (tagUserList = this.LLILZIL.getTagUserList()) != null) {
                        Iterator<InteractionTagUserInfo> it2 = tagUserList.iterator();
                        while (it2.hasNext()) {
                            InteractionTagUserInfo next = it2.next();
                            String str = next.uniqueId;
                            String str2 = next.nickname;
                            if (next.followStatus != 2) {
                                if (this.LLJI.booleanValue()) {
                                    str = str2;
                                }
                                arrayList.add(str);
                                it2.remove();
                            }
                        }
                    }
                } else {
                    List<InteractionTagUserInfo> tagUserList3 = this.LLILZIL.getTagUserList();
                    if (tagUserList3 == null) {
                        tagUserList3 = C13BV.INSTANCE;
                    }
                    for (InteractionTagUserInfo interactionTagUserInfo : tagUserList3) {
                        String str3 = interactionTagUserInfo.uniqueId;
                        String str4 = interactionTagUserInfo.nickname;
                        if (this.LLJI.booleanValue()) {
                            str3 = str4;
                        }
                        arrayList.add(str3);
                    }
                    ArrayList<InteractionTagUserInfo> tagUserList4 = this.LLILZIL.getTagUserList();
                    if (tagUserList4 != null) {
                        tagUserList4.clear();
                    }
                }
                if (!C086I.LIZIZ(arrayList) && arrayList.toString().length() >= 2) {
                    String string = arrayList.toString();
                    String strJ4 = C786410Ut5.j4(c19eg.getString(2131849607), Arrays.copyOf(new Object[]{string.substring(1, string.length() - 1)}, 1));
                    C19EG c19eg2 = this.LLILLJJLI;
                    CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                    creativeToastBuilder.message(strJ4);
                    C1390380mHk.LIZ(c19eg2, 2031, creativeToastBuilder);
                }
            }
        }
    }

    public final void LJIJI(DialogInterface dialogInterface) {
        String str = TuxSheet._pnsPageId;
        AbstractC343940De4 abstractC343940De4LJIIJJI = C1391190mJ3.LJIIJJI(dialogInterface);
        this.LLIZLLLIL.setValue(Boolean.FALSE);
        C0CHQ.LIZ().getPublishService().LJJLIIIJLJLI().getClass();
        int iIsPrivate = this.LLILZIL.isPrivate();
        String str2 = this.LLILZIL.creativeModel.transientPostPageModel.LJJIIJZLJL;
        if (str2 == null) {
            str2 = "";
        }
        C1403840mdS.LIZLLL(iIsPrivate, "video_edit_page", str2, abstractC343940De4LJIIJJI);
    }

    public final void LJJI(int i) {
        C214728191q c214728191qLJJLIIIJLJLI = C0CHQ.LIZ().getPublishService().LJJLIIIJLJLI();
        VideoPublishEditModel videoPublishEditModel = this.LLILZIL;
        videoPublishEditModel.isPrivate = i;
        videoPublishEditModel.creativeModel.privacySettingModel.isSubscribeOnly = false;
        LJIIZILJ(i);
        c214728191qLJJLIIIJLJLI.getClass();
        C1444610nhD.LIZ(i);
        C0CHQ.LIZ().getPublishService().LJJLIIIJLJLI().getClass();
        C1403840mdS.LJFF(this.LLILZIL, this.LLILZLL, i, this.LLIZ, null);
    }

    public final void LJJIIZ(InterfaceC1631630sYr<? super Integer, ? super String, ? super String, ? super String, Unit> interfaceC1631630sYr) {
        this.LLJJIJIL = interfaceC1631630sYr;
    }

    public final void LJJIIZI(String str) {
        C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS17S1100000_12(this, str, 8));
    }

    private final PermissionConfigure LJIIIZ(boolean z, boolean z2) {
        String string;
        VideoPublishEditModel videoPublishEditModel = this.LLILZIL;
        int i = videoPublishEditModel.isPrivate;
        if (z2) {
            string = C0CHQ.LIZ.getResources().getString(2131849125);
        } else {
            string = "";
        }
        return new PermissionConfigure(i, videoPublishEditModel, new PostBtnConfigure(z, string), "");
    }

    public final void LJIILL(String str, String str2) {
        this.LLJJJIL = str;
        this.LLJJJJ = str2;
    }

    @Override // X.InterfaceC1444410ngt
    public AbstractC857240Xk2<?> ZJ(Function0<Unit> function0, boolean z, boolean z2) {
        if (this.LLILLJJLI == null) {
            return null;
        }
        return C0CHQ.LIZ().getPublishService().LJJLIIIJLJLI().LIZ(this.LLILLJJLI, this.LLILZIL, LJIIIZ(true, z), new DialogInterfaceOnDismissListenerC1466680oGo(this, 2), new AwS423S0200000_22((Function0) function0, (Function0<Unit>) this, (C1444350ngn) 54), new AwS601S0100000_22(this, 409), z2, null);
    }

    public C1444350ngn(Fragment fragment, C19EG c19eg, String str, boolean z) {
        this.LL = fragment;
        this.LLILLJJLI = c19eg;
        this.LLILLL = str;
        this.LLILZ = z;
        C0CHQ.LIZ().getRegionService();
        this.LLJI = C20186013yc.LIZIZ();
        this.LLJIJIL = "";
        this.LLJILLL = "";
        this.LLJJ = -1;
        this.LLJJIII = "";
        this.LLJJJIL = "";
        this.LLJJJJ = "";
    }

    public final void LJIILJJIL(String str, int i, int i2, String str2, int i3, Map<String, String> map, List<C1444390ngr> list, String str3) {
        this.LLJILJIL = i;
        this.LLJILJILJ = i2;
        this.LLJILLL = str;
        this.LLJIJIL = str2;
        this.LLJJ = i3;
        this.LLJJI = map;
        this.LLJJJ = list;
        LJIILIIL(str3);
        LIZIZ();
    }
}
