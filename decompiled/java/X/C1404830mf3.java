package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig;
import com.ss.android.ugc.aweme.publish.model.UploadVideoConfig;
import com.ss.android.ugc.aweme.publish.model.VideoCreation;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mf3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1404830mf3 extends AbstractC1446660nkW {
    public final String LJ;
    public VideoPublishEditModel LJFF;
    public C1405220mfg LJI;
    public C1404570med LJII;
    public PublishModel LJIIIIZZ;
    public InterfaceC1434300nQa LJIIIZ;
    public long LJIIJ;

    public final C0LAB LJII() {
        VideoPublishEditModel videoPublishEditModel;
        C1404570med c1404570med = this.LJII;
        if (c1404570med == null) {
            c1404570med = null;
        }
        C1420470n4H c1420470n4H = new C1420470n4H(c1404570med.LIZ);
        VideoPublishEditModel videoPublishEditModel2 = this.LJFF;
        if (videoPublishEditModel2 == null) {
            videoPublishEditModel = null;
            videoPublishEditModel2 = null;
        } else {
            videoPublishEditModel = videoPublishEditModel2;
        }
        C0LAB c0labLJFF = C0EMD.LJFF(videoPublishEditModel2);
        c1420470n4H.LIZ(videoPublishEditModel, c0labLJFF);
        VideoPublishEditModel videoPublishEditModel3 = this.LJFF;
        if (videoPublishEditModel3 == null) {
            videoPublishEditModel3 = null;
        }
        long previewVideoLength = videoPublishEditModel3.getPreviewInfo() != null ? r0.getPreviewVideoLength() : 0L;
        this.LJIIJ = previewVideoLength;
        c0labLJFF.LIZIZ(previewVideoLength, "source_duration");
        c0labLJFF.LIZIZ(this.LJIIJ, "creation_duration");
        C1439880nZa c1439880nZa = C1439880nZa.LIZ;
        VideoPublishEditModel videoPublishEditModel4 = this.LJFF;
        VideoPublishEditModel videoPublishEditModel5 = videoPublishEditModel4 != null ? videoPublishEditModel4 : null;
        c1439880nZa.getClass();
        c0labLJFF.LJFF("is_save_with_watermark", C1439880nZa.LJII(videoPublishEditModel5, false));
        return c0labLJFF;
    }

    public C1404830mf3(String str) {
        super(3, (Object) null);
        this.LJ = str;
    }

    public final String LJI(Object obj) {
        if (Intrinsics.LJFF(obj, this.LJ)) {
            return this.LJ;
        }
        return obj.toString().toLowerCase(Locale.ROOT);
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x0184, code lost:
    
        throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.PublishId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x018c, code lost:
    
        throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.normal.ClickPublishWaiter");
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0194, code lost:
    
        throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.PublishModelContainer");
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x019c, code lost:
    
        throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.EditModelContainer");
     */
    @Override // X.AbstractC1446660nkW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(java.lang.Object r8, X.C1404610meh r9) {
        /*
            Method dump skipped, instruction units count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1404830mf3.LJ(java.lang.Object, X.0meh):void");
    }

    public final int LJIIIIZZ(Object obj, boolean z) {
        if (Intrinsics.LJFF(obj, this.LJ)) {
            return 70;
        }
        if (obj == EnumC1434770nRL.COMPILE) {
            if (z) {
                return 10;
            }
            return 11;
        }
        if (obj == EnumC1434770nRL.UPLOAD) {
            if (z) {
                return 30;
            }
            return 31;
        }
        if (obj == EnumC1434770nRL.AUTH_KEY) {
            if (z) {
                return 20;
            }
            return 21;
        }
        if (obj == EnumC1434770nRL.COVER_TEXT_UPLOAD) {
            if (z) {
                return 60;
            }
            return 61;
        }
        if (obj == EnumC1434770nRL.CREATE_AWEME) {
            if (z) {
                return 40;
            }
            return 41;
        }
        if (obj == EnumC1434770nRL.CLOUD_MERGE) {
            if (z) {
                return 120;
            }
            return 121;
        }
        return -1;
    }

    @Override // X.AbstractC1446660nkW
    public final void LIZ(Object obj, AbstractC1404540mea abstractC1404540mea, int i, int i2) {
        String str;
        String str2;
        InterfaceC1434300nQa interfaceC1434300nQa = this.LJIIIZ;
        VideoPublishEditModel videoPublishEditModel = null;
        if (interfaceC1434300nQa == null) {
            interfaceC1434300nQa = null;
        }
        C1434440nQo c1434440nQoLJ = interfaceC1434300nQa.LJ();
        C0LAB c0labLJII = LJII();
        PublishModel publishModel = this.LJIIIIZZ;
        if (publishModel == null) {
            publishModel = null;
        }
        c0labLJII.LJ("shoot_way", publishModel.shootWay);
        VideoPublishEditModel videoPublishEditModel2 = this.LJFF;
        if (videoPublishEditModel2 == null) {
            videoPublishEditModel2 = null;
        }
        C559510Lwz.LIZIZ(videoPublishEditModel2, c0labLJII);
        VideoPublishEditModel videoPublishEditModel3 = this.LJFF;
        if (videoPublishEditModel3 == null) {
            videoPublishEditModel3 = null;
        }
        c0labLJII.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel3));
        VideoPublishEditModel videoPublishEditModel4 = this.LJFF;
        if (videoPublishEditModel4 == null) {
            videoPublishEditModel4 = null;
        }
        c0labLJII.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel4));
        PublishModel publishModel2 = this.LJIIIIZZ;
        if (publishModel2 == null) {
            publishModel2 = null;
        }
        c0labLJII.LJ("retry_publish", publishModel2.LIZ());
        c0labLJII.LIZ(LJIIIIZZ(obj, false), "publish_step");
        c0labLJII.LJ("publish_step_name", LJI(obj));
        if (abstractC1404540mea instanceof C1404560mec) {
            c0labLJII.LIZ(-39993, "error_code");
            Object obj2 = ((C1404560mec) abstractC1404540mea).LIZ;
            if (obj2 instanceof C1433230nOr) {
                c0labLJII.LJ("error_cause", ((C1433230nOr) obj2).LIZ);
            }
            c0labLJII.LJ("event_type", EnumC1405140mfY.CANCEL_EXTERNAL.getDesc());
        } else if (abstractC1404540mea instanceof C1404550meb) {
            C1404550meb c1404550meb = (C1404550meb) abstractC1404540mea;
            c0labLJII.LIZ(c1404550meb.LIZ.getCode(), "error_code");
            c0labLJII.LJ("error_node_name", c1404550meb.LIZ.getNodeTag().toString());
            c0labLJII.LJ("event_type", EnumC1405140mfY.CANCEL_INTERNAL.getDesc());
        } else {
            throw new C1954807lC();
        }
        c0labLJII.LIZ(i, "duration");
        C1405220mfg c1405220mfg = this.LJI;
        if (c1405220mfg == null) {
            c1405220mfg = null;
        }
        String str3 = "1";
        if (c1405220mfg.LIZIZ) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c0labLJII.LJ("click_publish", str);
        if (C790050Uyx.LIZ(C0CHQ.LIZ)) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c0labLJII.LJ("network_available", str2);
        VideoPublishEditModel videoPublishEditModel5 = this.LJFF;
        if (videoPublishEditModel5 == null) {
            videoPublishEditModel5 = null;
        }
        c0labLJII.LJ("creation_id", videoPublishEditModel5.getCreationId());
        C1404570med c1404570med = this.LJII;
        if (c1404570med == null) {
            c1404570med = null;
        }
        c0labLJII.LJ("publish_id", c1404570med.LIZ);
        PublishModel publishModel3 = this.LJIIIIZZ;
        if (publishModel3 == null) {
            publishModel3 = null;
        }
        c0labLJII.LIZ(publishModel3.isEditSave ? 1 : 0, "is_save_local");
        VideoPublishEditModel videoPublishEditModel6 = this.LJFF;
        if (videoPublishEditModel6 != null) {
            videoPublishEditModel = videoPublishEditModel6;
        }
        if (!videoPublishEditModel.creativeModel.editSaveLocalModel.isFromQuickPublish) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        c0labLJII.LJ("is_from_save_local_popup", str3);
        Map<String, String> map = c0labLJII.LIZ;
        c1434440nQoLJ.getClass();
        C20684815ws.LJIILLIIL("parallel_publish_result", map);
    }

    @Override // X.AbstractC1446660nkW
    public final void LIZJ(Object obj, C1435220nS4 c1435220nS4, int i, int i2) {
        int iLJI;
        String message;
        String strLJ;
        String str;
        String str2;
        C1433670nPZ c1433670nPZ;
        Throwable cause;
        InterfaceC1434300nQa interfaceC1434300nQa = this.LJIIIZ;
        VideoPublishEditModel videoPublishEditModel = null;
        if (interfaceC1434300nQa == null) {
            interfaceC1434300nQa = null;
        }
        C1434440nQo c1434440nQoLJ = interfaceC1434300nQa.LJ();
        C0LAB c0labLJII = LJII();
        VideoPublishEditModel videoPublishEditModel2 = this.LJFF;
        if (videoPublishEditModel2 == null) {
            videoPublishEditModel2 = null;
        }
        C559510Lwz.LIZIZ(videoPublishEditModel2, c0labLJII);
        PublishModel publishModel = this.LJIIIIZZ;
        if (publishModel == null) {
            publishModel = null;
        }
        c0labLJII.LJ("retry_publish", publishModel.LIZ());
        VideoPublishEditModel videoPublishEditModel3 = this.LJFF;
        if (videoPublishEditModel3 == null) {
            videoPublishEditModel3 = null;
        }
        c0labLJII.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel3));
        VideoPublishEditModel videoPublishEditModel4 = this.LJFF;
        if (videoPublishEditModel4 == null) {
            videoPublishEditModel4 = null;
        }
        c0labLJII.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel4));
        PublishModel publishModel2 = this.LJIIIIZZ;
        if (publishModel2 == null) {
            publishModel2 = null;
        }
        c0labLJII.LJ("shoot_way", publishModel2.shootWay);
        c0labLJII.LIZ(LJIIIIZZ(obj, false), "publish_step");
        c0labLJII.LJ("publish_step_name", LJI(obj));
        EnumC1434770nRL enumC1434770nRL = EnumC1434770nRL.COMPILE;
        if (obj == enumC1434770nRL) {
            iLJI = C1431420nLw.LJFF(c1435220nS4);
        } else if (obj == EnumC1434770nRL.AUTH_KEY) {
            iLJI = C1431420nLw.LJI(11, c1435220nS4);
        } else if (obj == EnumC1434770nRL.UPLOAD) {
            iLJI = C1431420nLw.LJII(c1435220nS4);
        } else if (obj == EnumC1434770nRL.CREATE_AWEME) {
            iLJI = C1431420nLw.LJI(13, c1435220nS4);
        } else {
            iLJI = 13;
        }
        c0labLJII.LIZ(iLJI, "error_code");
        String str3 = "";
        if (obj != enumC1434770nRL || (cause = c1435220nS4.getCause()) == null || (message = cause.getMessage()) == null) {
            message = "";
        }
        c0labLJII.LJ("upload_error_msg", message);
        Throwable cause2 = c1435220nS4.getCause();
        if (!(cause2 instanceof C1433670nPZ) || (c1433670nPZ = (C1433670nPZ) cause2) == null || (strLJ = c1433670nPZ.getVESDKErrorCode()) == null) {
            strLJ = C1431420nLw.LJ(c1435220nS4);
        }
        c0labLJII.LJ("server_log_id", strLJ);
        if (obj == enumC1434770nRL) {
            VideoPublishEditModel videoPublishEditModel5 = this.LJFF;
            if (videoPublishEditModel5 == null) {
                videoPublishEditModel5 = null;
            }
            c0labLJII.LIZ(videoPublishEditModel5.getVideoEditorType(), "video_editor_type");
        }
        VideoPublishEditModel videoPublishEditModel6 = this.LJFF;
        if (videoPublishEditModel6 == null) {
            videoPublishEditModel6 = null;
        }
        String outputFile = videoPublishEditModel6.getOutputFile();
        if (outputFile != null) {
            str3 = outputFile;
        }
        C0VSJ c0vsj = new C0VSJ(str3);
        if (c0vsj.exists()) {
            long length = c0vsj.length() / ((long) 1024);
            c0labLJII.LIZIZ(length, "content_storage_size");
            c0labLJII.LIZIZ(length, "file_size");
        }
        C1405220mfg c1405220mfg = this.LJI;
        if (c1405220mfg == null) {
            c1405220mfg = null;
        }
        String str4 = "1";
        if (c1405220mfg.LIZIZ) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c0labLJII.LJ("click_publish", str);
        if (C790050Uyx.LIZ(C0CHQ.LIZ)) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c0labLJII.LJ("network_available", str2);
        c0labLJII.LIZ(i, "duration");
        VideoPublishEditModel videoPublishEditModel7 = this.LJFF;
        if (videoPublishEditModel7 == null) {
            videoPublishEditModel7 = null;
        }
        c0labLJII.LJ("creation_id", videoPublishEditModel7.getCreationId());
        C1404570med c1404570med = this.LJII;
        if (c1404570med == null) {
            c1404570med = null;
        }
        c0labLJII.LIZLLL(c1404570med, "publish_id");
        c0labLJII.LJ("event_type", EnumC1405140mfY.FAILED.getDesc());
        PublishModel publishModel3 = this.LJIIIIZZ;
        if (publishModel3 == null) {
            publishModel3 = null;
        }
        c0labLJII.LIZ(publishModel3.isEditSave ? 1 : 0, "is_save_local");
        VideoPublishEditModel videoPublishEditModel8 = this.LJFF;
        if (videoPublishEditModel8 != null) {
            videoPublishEditModel = videoPublishEditModel8;
        }
        if (!videoPublishEditModel.creativeModel.editSaveLocalModel.isFromQuickPublish) {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        c0labLJII.LJ("is_from_save_local_popup", str4);
        Map<String, String> map = c0labLJII.LIZ;
        c1434440nQoLJ.getClass();
        C20684815ws.LJIILLIIL("parallel_publish_result", map);
    }

    @Override // X.AbstractC1446660nkW
    public final void LJFF(Object obj, Object obj2, boolean z, int i, int i2) {
        String string;
        UploadVideoConfig uploadVideoConfig;
        String str;
        String str2;
        InterfaceC1434300nQa interfaceC1434300nQa = this.LJIIIZ;
        VideoPublishEditModel videoPublishEditModel = null;
        if (interfaceC1434300nQa == null) {
            interfaceC1434300nQa = null;
        }
        C1434440nQo c1434440nQoLJ = interfaceC1434300nQa.LJ();
        C0LAB c0labLJII = LJII();
        PublishModel publishModel = this.LJIIIIZZ;
        if (publishModel == null) {
            publishModel = null;
        }
        c0labLJII.LJ("retry_publish", publishModel.LIZ());
        VideoPublishEditModel videoPublishEditModel2 = this.LJFF;
        if (videoPublishEditModel2 == null) {
            videoPublishEditModel2 = null;
        }
        c0labLJII.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel2));
        VideoPublishEditModel videoPublishEditModel3 = this.LJFF;
        if (videoPublishEditModel3 == null) {
            videoPublishEditModel3 = null;
        }
        c0labLJII.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel3));
        PublishModel publishModel2 = this.LJIIIIZZ;
        if (publishModel2 == null) {
            publishModel2 = null;
        }
        c0labLJII.LJ("shoot_way", publishModel2.shootWay);
        c0labLJII.LIZ(LJIIIIZZ(obj, false), "publish_step");
        c0labLJII.LJ("publish_step_name", LJI(obj));
        VideoPublishEditModel videoPublishEditModel4 = this.LJFF;
        if (videoPublishEditModel4 == null) {
            videoPublishEditModel4 = null;
        }
        C559510Lwz.LIZIZ(videoPublishEditModel4, c0labLJII);
        if (obj == EnumC1434770nRL.COMPILE) {
            VideoPublishEditModel videoPublishEditModel5 = this.LJFF;
            if (videoPublishEditModel5 == null) {
                videoPublishEditModel5 = null;
            }
            c0labLJII.LIZ(videoPublishEditModel5.getVideoEditorType(), "video_editor_type");
            long j = this.LJIIJ;
            if (j > 0 && i > 0) {
                float f = (j * 1.0f) / i;
                InterfaceC1434300nQa interfaceC1434300nQa2 = this.LJIIIZ;
                if (interfaceC1434300nQa2 == null) {
                    interfaceC1434300nQa2 = null;
                }
                interfaceC1434300nQa2.LIZJ();
                C1405310mfp.LJ("compile_speed", new C1404840mf4(this, i, f));
                c0labLJII.LJ("compile_speed", C786410Ut5.j4("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1)));
            }
        } else if (obj == EnumC1434770nRL.AUTH_KEY) {
            VideoCreation videoCreation = ((C1404770mex) obj2).LIZ;
            if (!(videoCreation instanceof UploadAuthKeyConfig) || (uploadVideoConfig = ((UploadAuthKeyConfig) videoCreation).videoConfig) == null || (string = uploadVideoConfig.toString()) == null) {
                string = "";
            }
            c0labLJII.LJ("auth_key", string);
        } else if (obj == EnumC1434770nRL.CLOUD_MERGE) {
            if (obj2 instanceof C1405080mfS) {
                c0labLJII.LJ("upload_error_msg", ((C1405080mfS) obj2).LIZ.getMessage());
            } else {
                c0labLJII.LJ("upload_error_msg", EnumC1405140mfY.SUCCESS.getDesc());
            }
        }
        C1405220mfg c1405220mfg = this.LJI;
        if (c1405220mfg == null) {
            c1405220mfg = null;
        }
        String str3 = "1";
        if (c1405220mfg.LIZIZ) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c0labLJII.LJ("click_publish", str);
        c0labLJII.LIZ(i, "duration");
        if (C790050Uyx.LIZ(C0CHQ.LIZ)) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c0labLJII.LJ("network_available", str2);
        VideoPublishEditModel videoPublishEditModel6 = this.LJFF;
        if (videoPublishEditModel6 == null) {
            videoPublishEditModel6 = null;
        }
        c0labLJII.LJ("creation_id", videoPublishEditModel6.getCreationId());
        C1404570med c1404570med = this.LJII;
        if (c1404570med == null) {
            c1404570med = null;
        }
        c0labLJII.LIZLLL(c1404570med, "publish_id");
        c0labLJII.LJ("event_type", EnumC1405140mfY.SUCCESS.getDesc());
        PublishModel publishModel3 = this.LJIIIIZZ;
        if (publishModel3 == null) {
            publishModel3 = null;
        }
        c0labLJII.LIZ(publishModel3.isEditSave ? 1 : 0, "is_save_local");
        VideoPublishEditModel videoPublishEditModel7 = this.LJFF;
        if (videoPublishEditModel7 != null) {
            videoPublishEditModel = videoPublishEditModel7;
        }
        if (!videoPublishEditModel.creativeModel.editSaveLocalModel.isFromQuickPublish) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        c0labLJII.LJ("is_from_save_local_popup", str3);
        Map<String, String> map = c0labLJII.LIZ;
        c1434440nQoLJ.getClass();
        C20684815ws.LJIILLIIL("parallel_publish_result", map);
    }
}
