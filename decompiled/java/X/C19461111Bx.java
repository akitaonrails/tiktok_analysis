package X;

import Y.ARunnableS62S0300000_29;
import android.app.Activity;
import android.os.Build;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import dmt.av.services.VEEncodingImpl;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS273S0300000_29;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.11Bx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19461111Bx {
    public static boolean LJ;
    public static boolean LJFF;
    public static volatile C19461111Bx LJI;
    public static volatile String LJII;
    public static final Object LJIIIIZZ = new Object();
    public volatile boolean LIZ;
    public String LIZIZ;
    public C1441830ncj LIZJ;
    public final C19460011Bm LIZLLL = new C19460011Bm();

    public final void LIZJ() {
        synchronized (LJIIIIZZ) {
            try {
                LIZLLL();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LIZLLL() {
        String str;
        if (LJI == this || (LJI == null && (str = this.LIZIZ) != null && Intrinsics.LJFF(str, LJII))) {
            LJ = false;
            LJII = null;
            LJI = null;
            this.LIZIZ = null;
        }
    }

    public final void LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        this.LIZLLL.getClass();
        C19460911Bv.LIZJ(videoPublishEditModel.getCreationId());
        C19460311Bp.LIZIZ = 5;
        C19460311Bp.LIZJ = 0;
        C19460311Bp.LIZLLL = videoPublishEditModel;
        C1440005kM.LIZ(new C19460211Bo());
    }

    public final void LJ(final C19EG c19eg, final VideoPublishEditModel videoPublishEditModel, LifecycleOwner lifecycleOwner, C1291180jhk c1291180jhk) {
        EnumC19461211By enumC19461211By;
        if (c19eg != null && videoPublishEditModel != null) {
            String creationId = videoPublishEditModel.getCreationId();
            synchronized (LJIIIIZZ) {
                try {
                    if (!LJ && LJI == null) {
                        if (!C2354709Kn.LJIIZILJ()) {
                            enumC19461211By = EnumC19461211By.LLILLJJLI;
                        } else if (C2354709Kn.LJIILL() < 20971520) {
                            enumC19461211By = EnumC19461211By.LLILLL;
                        } else {
                            LJ = true;
                            LJI = this;
                            LJII = creationId;
                            this.LIZIZ = creationId;
                            this.LIZ = false;
                            enumC19461211By = null;
                        }
                    } else {
                        enumC19461211By = EnumC19461211By.LL;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            if (enumC19461211By != null) {
                int i = C11C0.LIZ[enumC19461211By.ordinal()];
                if (i != -1) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                throw new C1954807lC();
                            }
                        } else {
                            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                            creativeToastBuilder.messageRes(2131847054);
                            creativeToastBuilder.isTuxToastLegacy(true);
                            C1390380mHk.LIZJ(c19eg, 2047, creativeToastBuilder);
                        }
                    } else {
                        CreativeToastBuilder creativeToastBuilder2 = new CreativeToastBuilder();
                        creativeToastBuilder2.messageRes(2131836334);
                        creativeToastBuilder2.isTuxToastLegacy(true);
                        C1390380mHk.LIZJ(c19eg, 2047, creativeToastBuilder2);
                    }
                }
                if (enumC19461211By != null) {
                    return;
                }
            }
            C1441830ncj c1441830ncj = new C1441830ncj(videoPublishEditModel.getVideoEditorType(), C1428520nHG.LJJZZIII(videoPublishEditModel).getValue(), C1428520nHG.LJJZZI(videoPublishEditModel).getValue(), "DraftDownloadHelper", C338630DPh.LIZ());
            c1441830ncj.LJIJJ = videoPublishEditModel.getNleData();
            this.LIZJ = c1441830ncj;
            C1447450nln.LIZ.getClass();
            C1447450nln.LIZ(c19eg, lifecycleOwner, c1291180jhk, c1441830ncj, videoPublishEditModel, "");
            new SynthetiseResult();
            videoPublishEditModel.getHardEncode();
            String.valueOf(videoPublishEditModel.getOutputFile());
            SettingsManager.LIZLLL().getClass();
            SettingsManager.LIZ("enable_synthetic_fps_set", true);
            videoPublishEditModel.getPreviewInfo();
            videoPublishEditModel.videoWidth();
            videoPublishEditModel.videoHeight();
            videoPublishEditModel.isFastImport();
            C1428470nHB.LJJLIIIJ(videoPublishEditModel);
            videoPublishEditModel.segmentCounts();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("com.bytedance.info", new JSONObject(C2097908Jt.LIZJ(new Pair("is_km_video", 1))));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            c1441830ncj.LJIIIZ.addMetadata("com.android.information", C786410Ut5.J3(jSONObject));
            this.LIZLLL.getClass();
            C19460311Bp.LIZIZ = 1;
            C19460311Bp.LIZJ = 0;
            C19460311Bp.LIZLLL = videoPublishEditModel;
            C1440005kM.LIZ(new C19460211Bo());
            c1441830ncj.LJIIIZ.Qe(videoPublishEditModel.getOutputFile(), null, VEEncodingImpl.LIZIZ().LIZ(videoPublishEditModel, c1441830ncj.LJIIIZ), new InterfaceC574560MgA() { // from class: X.11C1
                @Override // X.InterfaceC574560MgA
                public final void onCompileDone() {
                    if (this.LIZ.LIZ) {
                        this.LIZ.LIZJ();
                        return;
                    }
                    final AwS273S0300000_29 awS273S0300000_29 = new AwS273S0300000_29(this.LIZ, c19eg, videoPublishEditModel, 21);
                    if (Build.VERSION.SDK_INT >= 29) {
                        awS273S0300000_29.invoke();
                        return;
                    }
                    final C19461111Bx c19461111Bx = this.LIZ;
                    final Activity activity = c19eg;
                    TokenCert tokenCertWith = TokenCert.Companion.with("bpea-tools_request_storage_permission_save_draft");
                    c19461111Bx.getClass();
                    C19514511Wl c19514511WlLIZIZ = C19514711Wn.LIZIZ.LIZIZ(activity, tokenCertWith).LIZIZ("android.permission.WRITE_EXTERNAL_STORAGE");
                    c19514511WlLIZIZ.LIZJ.LIZ(new AbstractC19515011Wq() { // from class: X.0Wtq
                        @Override // X.AbstractC19515011Wq
                        public final void LIZ(C19514611Wm c19514611Wm, String... strArr) {
                            if (C838410Wul.LIZ(activity, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
                                if (c19514611Wm != null) {
                                    c19514611Wm.LIZIZ();
                                }
                            } else {
                                if (c19514611Wm == null) {
                                    return;
                                }
                                c19514611Wm.LIZJ();
                            }
                        }
                    });
                    c19514511WlLIZIZ.LIZJ(new InterfaceC19515111Wr() { // from class: X.11C2
                        @Override // X.InterfaceC19515111Wr
                        public final void onCanceled() {
                            c19461111Bx.LIZJ();
                        }

                        @Override // X.InterfaceC19515111Wr
                        public final void LIZ(C0HWO... c0hwoArr) {
                            if (c0hwoArr.length == 0) {
                                c19461111Bx.LIZJ();
                                return;
                            }
                            if (c0hwoArr[0].LIZIZ == EnumC442280HVy.GRANTED) {
                                Function0<Unit> function0 = awS273S0300000_29;
                                if (function0 != null) {
                                    function0.invoke();
                                    return;
                                }
                                return;
                            }
                            Activity activity2 = activity;
                            CreativeToastBuilder creativeToastBuilder3 = new CreativeToastBuilder();
                            creativeToastBuilder3.messageRes(2131838182);
                            creativeToastBuilder3.isTuxToastLegacy(true);
                            C1390380mHk.LIZ(activity2, 2047, creativeToastBuilder3);
                            c19461111Bx.LIZJ();
                        }
                    });
                }

                @Override // X.InterfaceC574560MgA
                public final void onCompileProgress(float f) {
                    if (this.LIZ.LIZ) {
                        return;
                    }
                    C19460011Bm c19460011Bm = this.LIZ.LIZLLL;
                    VideoPublishEditModel videoPublishEditModel2 = videoPublishEditModel;
                    c19460011Bm.getClass();
                    C786410Ut5.LJJZZIII(new BPEAHandler(), new RunnableC19459911Bl(f * 80, videoPublishEditModel2, c19460011Bm));
                }

                @Override // X.InterfaceC574560MgA
                public final void onCompileError(int i2, int i3, float f, String str) {
                    if (this.LIZ.LIZ) {
                        this.LIZ.LIZJ();
                    } else {
                        this.LIZ.LIZIZ(videoPublishEditModel);
                    }
                }
            });
        }
    }

    public final void LIZ(Activity activity, VideoPublishEditModel videoPublishEditModel, C0VSP c0vsp, OutputStream outputStream, long j) {
        byte[] bArr;
        try {
            try {
                bArr = new byte[SpeechEngineDefines.TTS_WORK_MODE_BOTH];
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                if (!this.LIZ) {
                    LIZIZ(videoPublishEditModel);
                }
                C09N0.LIZ(c0vsp);
                C09N0.LIZIZ(outputStream);
                if (!this.LIZ) {
                    return;
                }
            }
            if (outputStream != null) {
                long j2 = 0;
                while (true) {
                    if (this.LIZ) {
                        break;
                    }
                    int i = c0vsp.read(bArr);
                    if (i <= 0) {
                        if (!this.LIZ) {
                            C19460011Bm c19460011Bm = this.LIZLLL;
                            c19460011Bm.getClass();
                            C786410Ut5.LJJZZIII(new BPEAHandler(), new ARunnableS62S0300000_29(videoPublishEditModel, activity, c19460011Bm, 10));
                        }
                    } else {
                        outputStream.write(bArr, 0, i);
                        j2 += (long) i;
                        C19460011Bm c19460011Bm2 = this.LIZLLL;
                        c19460011Bm2.getClass();
                        C786410Ut5.LJJZZIII(new BPEAHandler(), new RunnableC19459911Bl(((j2 / j) * 100) + 80, videoPublishEditModel, c19460011Bm2));
                    }
                }
                if (!this.LIZ) {
                    outputStream.flush();
                }
                C09N0.LIZ(c0vsp);
                C09N0.LIZIZ(outputStream);
                if (!this.LIZ) {
                    return;
                }
                LIZJ();
                this.LIZLLL.getClass();
                C19460011Bm.LIZ(videoPublishEditModel);
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Failed to copy input:");
            sbLIZ.append(c0vsp);
            sbLIZ.append("output:");
            sbLIZ.append(outputStream);
            throw new IOException(C2188811AlT.LIZIZ(sbLIZ));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C09N0.LIZ(c0vsp);
            C09N0.LIZIZ(outputStream);
            if (this.LIZ) {
                LIZJ();
                this.LIZLLL.getClass();
                C19460011Bm.LIZ(videoPublishEditModel);
            }
            throw th;
        }
    }
}
