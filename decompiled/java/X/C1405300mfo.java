package X;

import com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig;
import com.ss.android.ugc.aweme.publish.model.UploadVideoConfig;
import com.ss.android.ugc.aweme.publish.model.VideoCreation;
import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.BehaviorType;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.wavepublish.monitor.feedback.PublisherEvent;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: renamed from: X.0mfo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1405300mfo extends AbstractC1446660nkW {
    public VideoPublishEditModel LJ;
    public C1404570med LJFF;
    public PublishModel LJI;

    public C1405300mfo() {
        super(3, (Object) null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x010a, code lost:
    
        throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.normal.ClickPublishWaiter");
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0112, code lost:
    
        throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.PublishId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x011a, code lost:
    
        throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.PublishModelContainer");
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0122, code lost:
    
        throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.EditModelContainer");
     */
    @Override // X.AbstractC1446660nkW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(java.lang.Object r19, X.C1404610meh r20) {
        /*
            Method dump skipped, instruction units count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1405300mfo.LJ(java.lang.Object, X.0meh):void");
    }

    @Override // X.AbstractC1446660nkW
    public final void LIZ(Object obj, AbstractC1404540mea abstractC1404540mea, int i, int i2) {
        C1435220nS4 c1435220nS4;
        String message;
        C1404570med c1404570med = null;
        String message2 = null;
        C1404570med c1404570med2 = null;
        if ((abstractC1404540mea instanceof C1404550meb) && (c1435220nS4 = ((C1404550meb) abstractC1404540mea).LIZ) != null) {
            if (obj == EnumC1434770nRL.COMPILE) {
                C1404570med c1404570med3 = this.LJFF;
                if (c1404570med3 == null) {
                    c1404570med3 = null;
                }
                String str = c1404570med3.LIZ;
                int iLJFF = C1431420nLw.LJFF(c1435220nS4);
                Throwable cause = c1435220nS4.getCause();
                if (cause != null) {
                    message2 = cause.getMessage();
                }
                C1448790nnx.LJII(iLJFF, str, message2);
                return;
            }
            if (obj != EnumC1434770nRL.UPLOAD) {
                return;
            }
            C1404570med c1404570med4 = this.LJFF;
            if (c1404570med4 != null) {
                c1404570med2 = c1404570med4;
            }
            String str2 = c1404570med2.LIZ;
            int iLJII = C1431420nLw.LJII(c1435220nS4);
            Throwable cause2 = c1435220nS4.getCause();
            if (cause2 == null || (message = cause2.getMessage()) == null) {
                message = "";
            }
            C1448790nnx.LJFF(str2, BehaviorType.FAILED, "UP", String.valueOf(iLJII), message);
            return;
        }
        C1404570med c1404570med5 = this.LJFF;
        if (c1404570med5 != null) {
            c1404570med = c1404570med5;
        }
        C1448790nnx.LJFF(c1404570med.LIZ, BehaviorType.CANCEL, "WT", String.valueOf(-39993), "");
    }

    @Override // X.AbstractC1446660nkW
    public final void LIZJ(Object obj, C1435220nS4 c1435220nS4, int i, int i2) {
        String strValueOf;
        C1404570med c1404570med = null;
        if (obj == EnumC1434770nRL.COMPILE) {
            C1404570med c1404570med2 = this.LJFF;
            if (c1404570med2 != null) {
                c1404570med = c1404570med2;
            }
            C1448790nnx.LJII(C1431420nLw.LJFF(c1435220nS4), c1404570med.LIZ, c1435220nS4.getMessage());
            return;
        }
        String message = "";
        if (obj == EnumC1434770nRL.UPLOAD) {
            int iLJII = C1431420nLw.LJII(c1435220nS4);
            C1404570med c1404570med3 = this.LJFF;
            if (c1404570med3 != null) {
                c1404570med = c1404570med3;
            }
            String str = c1404570med.LIZ;
            String message2 = c1435220nS4.getMessage();
            if (message2 != null) {
                message = message2;
            }
            C1448790nnx.LJFF(str, BehaviorType.FAILED, "UP", String.valueOf(iLJII), message);
            return;
        }
        int i3 = -2;
        if (obj == EnumC1434770nRL.AUTH_KEY) {
            int iLJI = C1431420nLw.LJI(11, c1435220nS4);
            if (C0XF1.LIZLLL(C0CHQ.LIZ)) {
                i3 = iLJI;
            }
            C1404570med c1404570med4 = this.LJFF;
            if (c1404570med4 != null) {
                c1404570med = c1404570med4;
            }
            String str2 = c1404570med.LIZ;
            C1431420nLw.LJ(c1435220nS4);
            String message3 = c1435220nS4.getMessage();
            BehaviorType behaviorType = BehaviorType.FAILED;
            String strValueOf2 = String.valueOf(i3);
            if (message3 != null) {
                message = message3;
            }
            C1448790nnx.LJFF(str2, behaviorType, "AK", strValueOf2, message);
            return;
        }
        if (obj == EnumC1434770nRL.COVER_TEXT_UPLOAD) {
            C1404570med c1404570med5 = this.LJFF;
            if (c1404570med5 != null) {
                c1404570med = c1404570med5;
            }
            String str3 = c1404570med.LIZ;
            int code = c1435220nS4.getCode();
            if (c1435220nS4.getMessage() != null) {
                message = c1435220nS4.getMessage();
            }
            C1448790nnx.LJFF(str3, BehaviorType.FAILED, "CT", String.valueOf(code), message);
            return;
        }
        if (obj != EnumC1434770nRL.CREATE_AWEME) {
            return;
        }
        int iLJI2 = C1431420nLw.LJI(13, c1435220nS4);
        if (C0XF1.LIZLLL(C0CHQ.LIZ)) {
            i3 = iLJI2;
        }
        C1404570med c1404570med6 = this.LJFF;
        if (c1404570med6 != null) {
            c1404570med = c1404570med6;
        }
        String str4 = c1404570med.LIZ;
        C1431420nLw.LJ(c1435220nS4);
        BehaviorType behaviorType2 = BehaviorType.FAILED;
        if (i3 != 21) {
            if (i3 != 2158) {
                strValueOf = String.valueOf(i3);
            } else {
                strValueOf = "PK";
            }
        } else {
            strValueOf = "FJ";
        }
        C1448790nnx.LJFF(str4, behaviorType2, "CA", strValueOf, "");
    }

    @Override // X.AbstractC1446660nkW
    public final void LJFF(Object obj, Object obj2, boolean z, int i, int i2) {
        String strK4;
        UploadVideoConfig uploadVideoConfig;
        VideoPublishEditModel videoPublishEditModel = null;
        C1404570med c1404570med = null;
        if (obj == EnumC1434770nRL.COMPILE) {
            C1404570med c1404570med2 = this.LJFF;
            if (c1404570med2 != null) {
                c1404570med = c1404570med2;
            }
            String str = c1404570med.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("encode:");
            sbLIZ.append(((SynthetiseResult) obj2).synthetiseCPUEncode);
            C1448790nnx.LJFF(str, BehaviorType.SUCCESS, "SN", "", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        if (obj == EnumC1434770nRL.UPLOAD) {
            C1404570med c1404570med3 = this.LJFF;
            if (c1404570med3 == null) {
                c1404570med3 = null;
            }
            C1448790nnx.LJFF(c1404570med3.LIZ, BehaviorType.SUCCESS, "UP", "", "");
            return;
        }
        if (obj == EnumC1434770nRL.AUTH_KEY) {
            C1404570med c1404570med4 = this.LJFF;
            if (c1404570med4 == null) {
                c1404570med4 = null;
            }
            String str2 = c1404570med4.LIZ;
            VideoCreation videoCreation = ((C1404770mex) obj2).LIZ;
            if (!(videoCreation instanceof UploadAuthKeyConfig) || (uploadVideoConfig = ((UploadAuthKeyConfig) videoCreation).videoConfig) == null) {
                strK4 = "";
            } else {
                strK4 = C786410Ut5.k4(Locale.US, "https:%d ttnet:%d", Arrays.copyOf(new Object[]{Integer.valueOf(uploadVideoConfig.enableHttps), Integer.valueOf(uploadVideoConfig.ttnetConfigValue)}, 2));
            }
            C1448790nnx.LJFF(str2, BehaviorType.SUCCESS, "AK", "", strK4);
            return;
        }
        if (obj == EnumC1434770nRL.COVER_TEXT_UPLOAD) {
            C1404570med c1404570med5 = this.LJFF;
            if (c1404570med5 == null) {
                c1404570med5 = null;
            }
            C1448790nnx.LJFF(c1404570med5.LIZ, BehaviorType.SUCCESS, "CT", "", "");
            return;
        }
        if (obj != EnumC1434770nRL.CREATE_AWEME) {
            return;
        }
        C1404570med c1404570med6 = this.LJFF;
        if (c1404570med6 == null) {
            c1404570med6 = null;
        }
        C1448790nnx.LJFF(c1404570med6.LIZ, BehaviorType.SUCCESS, "CA", "", "");
        C1404570med c1404570med7 = this.LJFF;
        if (c1404570med7 == null) {
            c1404570med7 = null;
        }
        String str3 = c1404570med7.LIZ;
        VideoPublishEditModel videoPublishEditModel2 = this.LJ;
        if (videoPublishEditModel2 == null) {
            videoPublishEditModel2 = null;
        }
        String creationId = videoPublishEditModel2.getCreationId();
        C556300Lro c556300Lro = new C556300Lro(0);
        VideoPublishEditModel videoPublishEditModel3 = this.LJ;
        if (videoPublishEditModel3 != null) {
            videoPublishEditModel = videoPublishEditModel3;
        }
        int iLJIIJJI = C1428470nHB.LJIIJJI(videoPublishEditModel);
        C1437510nVl c1437510nVlLJJLIIIJ = C0CHQ.LIZ().getPublishService().LJJLIIIJ();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("publishId: ");
        sbLIZ2.append(str3);
        sbLIZ2.append(", creationId: ");
        sbLIZ2.append(creationId);
        sbLIZ2.append(", videoId: ");
        sbLIZ2.append("");
        sbLIZ2.append(", happenTime: ");
        sbLIZ2.append(c556300Lro);
        c1437510nVlLJJLIIIJ.LIZ("create_aweme_success", C2188811AlT.LIZIZ(sbLIZ2));
        int iLIZIZ = C1418620n1I.LIZIZ();
        long j = c556300Lro.LIZ;
        C1418620n1I.LJ(new PublisherEvent("create_aweme_success", str3, creationId, iLIZIZ, j, C1418620n1I.LIZ(j), C1418620n1I.LIZJ(), iLJIIJJI));
    }
}
