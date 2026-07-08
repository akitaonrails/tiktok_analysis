package X;

import Y.ARunnableS135S0100000_35;
import Y.ARunnableS45S0101000_34;
import android.util.Pair;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.vesdk.VEAudioCapture;
import com.ss.android.vesdk.VECameraCapture;
import com.ss.android.vesdk.VEConfigCenter;
import com.ss.android.vesdk.VEDisplaySettings;
import com.ss.android.vesdk.VEInfo;
import com.ss.android.vesdk.VERecorder;
import com.ss.android.vesdk.filterparam.VEBaseFilterParam;
import com.ss.android.vesdk.k;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
import org.json.JSONObject;
import ud7.b;

/* JADX INFO: renamed from: X.1DLg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2254301DLg implements InterfaceC2185751AgX {
    public final /* synthetic */ k LIZ;

    public C2254301DLg(k kVar) {
        this.LIZ = kVar;
    }

    @Override // X.InterfaceC2185751AgX
    public final void onCallback(int i, int i2, float f, String str) {
        Pair pair;
        C1DIW c1diw;
        List<C2185991Agv> listLIZJ;
        VEAudioCapture vEAudioCapture;
        C1DIC c1dic;
        InterfaceC2185971Agt interfaceC2185971Agt;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Callback:: type: 0x");
        sbLIZ.append(Integer.toHexString(i));
        sbLIZ.append("; msg: ");
        sbLIZ.append(str);
        C2484209oO.LIZ("TERecorder", C2188811AlT.LIZIZ(sbLIZ));
        this.LIZ.LJIILIIL(i, i2, f, str);
        if (i == VEInfo.TE_RECORD_INFO_RECORD_STOPPED) {
            C786410Ut5.LJJZZIII(this.LIZ.LJLIL, new ARunnableS45S0101000_34(this, i2, 0));
        } else if (i == VEInfo.TE_RECORD_INFO_START_RECORD) {
            k kVar = this.LIZ;
            kVar.LJJLIL = 0;
            C786410Ut5.LJJZZIII(kVar.LJLIL, new ARunnableS45S0101000_34(this, i2, 1));
        } else if (i == VEInfo.TE_RECORD_INFO_PREPLAY_STOPPED) {
            InterfaceC2183551Acz interfaceC2183551Acz = this.LIZ.LJJL;
            if (interfaceC2183551Acz != null) {
                interfaceC2183551Acz.onDone(i2);
            }
        } else if (i == 1051) {
            C1311120kDu.LIZ("[FF]Java-TECamera-start");
            k kVar2 = this.LIZ;
            if (kVar2.LJJJI != null && (interfaceC2185971Agt = kVar2.LJJJJJ) != null && i2 == 0) {
                kVar2.LJI(interfaceC2185971Agt, false);
            } else if (i2 == 1 && (c1dic = kVar2.LJJJJIZL) != null) {
                kVar2.LJI(c1dic, false);
            }
            C1311120kDu.LIZIZ();
        } else if (i == 1000) {
            k kVar3 = this.LIZ;
            if (kVar3.LJJIJIIJIL && kVar3.LJJJJIZL != null) {
                ((ReentrantLock) kVar3.LJLLILLLL).lock();
                while (true) {
                    this.LIZ.getClass();
                    try {
                        this.LIZ.LJLLJ.await();
                    } catch (InterruptedException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            }
        } else if (i == VEInfo.TE_RECORD_INFO_ENGINE_INIT) {
            k kVar4 = this.LIZ;
            if (kVar4.LJJIJIIJIL) {
                ((ReentrantLock) kVar4.LJLLLLLL).lock();
                this.LIZ.getClass();
                this.LIZ.LJLZ.signalAll();
                ((ReentrantLock) this.LIZ.LJLLLLLL).unlock();
                k kVar5 = this.LIZ;
                VEDisplaySettings vEDisplaySettings = kVar5.LJLJL;
                if (vEDisplaySettings != null) {
                    kVar5.LJJIIZ(vEDisplaySettings);
                }
            }
        } else if (i == VEInfo.TE_INFO_COUNT_OF_LAST_FRAG_FRAMES) {
            this.LIZ.LJJLIL = i2;
        } else if (i == VEInfo.TE_INFO_RECORD_NEED_MIC) {
            k kVar6 = this.LIZ;
            if (kVar6.LJIJJ() == 0 && (vEAudioCapture = kVar6.LIZ) != null) {
                vEAudioCapture.start(null);
            }
        } else if (i == VEInfo.TE_INFO_PREVIEW_FIRST_FRAME_SCREEN) {
            InterfaceC2185971Agt interfaceC2185971Agt2 = this.LIZ.LJJJJJ;
            if (interfaceC2185971Agt2 != null) {
                interfaceC2185971Agt2.LJIILLIIL(false);
            } else {
                C2484209oO.LJIIIIZZ("TERecorder", "CameraPreview is null.");
            }
            if (this.LIZ.LLIIJI) {
                int i3 = C2187451AjH.LIZ;
                C2183341Ace.LIZ("TERecorder", "cameraThreadOptimization reportBytebench");
                if (VEConfigCenter.getInstance().getValue("ve_delay_report_camera_capability", false).booleanValue() && (this.LIZ.LJJJJJ instanceof VECameraCapture)) {
                    C2183341Ace.LIZLLL("TERecorder", "collect camera capabilities after first frame.");
                    ((VECameraCapture) this.LIZ.LJJJJJ).LLJILJIL.collectCameraCapabilities(new ARunnableS135S0100000_35(this, 19));
                }
            }
            if (this.LIZ.LJJJ != null && VEConfigCenter.getInstance().getValue("ve_delay_jni", false).booleanValue() && !k.LLIILII) {
                this.LIZ.LJJJ.LIZJ();
                k.LLIILII = true;
            }
        } else if (i == VEInfo.TE_INFO_PREVIEW_RENDER_FPS) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("preview render fps = ");
            sbLIZ2.append(f);
            C2484209oO.LIZ("TERecorder", C2188811AlT.LIZIZ(sbLIZ2));
            this.LIZ.LJJIIZ = f;
        } else if (i == VEInfo.TE_INFO_PREVIEW_SUB_RENDER_FPS) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("preview sub render fps = ");
            sbLIZ3.append(f);
            C2484209oO.LIZ("TERecorder", C2188811AlT.LIZIZ(sbLIZ3));
            this.LIZ.getClass();
        } else if (i == VEInfo.TE_INFO_CAMERA_OPEN_PREVIEW_FIRST_N_FRAME_INTERVALS_AVERAGE) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("camera open preview first n frame intervals average = ");
            sbLIZ4.append(f);
            C2484209oO.LIZ("TERecorder", C2188811AlT.LIZIZ(sbLIZ4));
            this.LIZ.LJJIIZI = f;
        } else if (i == VEInfo.TE_INFO_PREVIEW_FIRST_N_FRAME_INTERVALS_AVERAGE) {
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("preview first n frame intervals average = ");
            sbLIZ5.append(f);
            C2484209oO.LIZ("TERecorder", C2188811AlT.LIZIZ(sbLIZ5));
            this.LIZ.LJJIJ = f;
        } else if (i == VEInfo.TE_INFO_RECORD_FIRST_N_FRAME_INTERVALS_AVERAGE) {
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("encode first n frame intervals average = ");
            sbLIZ6.append(f);
            C2484209oO.LIZ("TERecorder", C2188811AlT.LIZIZ(sbLIZ6));
            this.LIZ.LJJIJIIJI = f;
        } else if (i == VEInfo.TE_INFO_RECORD_RENDER_FPS) {
            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
            sbLIZ7.append("record render fps = ");
            sbLIZ7.append(f);
            C2484209oO.LIZ("TERecorder", C2188811AlT.LIZIZ(sbLIZ7));
            this.LIZ.LJIJ = f;
        } else if (i == VEInfo.TE_INFO_RECORD_WRITE_FPS) {
            StringBuilder sbLIZ8 = C2188811AlT.LIZ();
            sbLIZ8.append("record write fps = ");
            sbLIZ8.append(f);
            C2484209oO.LIZ("TERecorder", C2188811AlT.LIZIZ(sbLIZ8));
            this.LIZ.LJIJI = f;
        } else if (i == VEInfo.TE_INFO_PREVIEW_FRAME_SCREEN) {
            VERecorder.OnFrameAvailableListenerExt onFrameAvailableListenerExt = this.LIZ.LJ;
            if (onFrameAvailableListenerExt != null) {
                onFrameAvailableListenerExt.OnFrameAvailable(null);
            }
        } else if (i == 1093) {
            k kVar7 = this.LIZ;
            if (kVar7.LJJJJJ != null) {
                if (i2 == 1) {
                    if (kVar7.LLFZ.LIZJ().size() != 2) {
                        this.LIZ.LLFZ.LIZIZ();
                        C1664350tPd<C2185991Agv> capturePipelines = this.LIZ.LJJJI.getCapturePipelines();
                        if (capturePipelines.LIZJ().size() == 1) {
                            C2484209oO.LJI("TERecorder", "switchSingleOrDualCamera, use the single camera pipeline as the first pipeline of dual-camera.");
                            listLIZJ = capturePipelines.LIZJ();
                        } else {
                            k kVar8 = this.LIZ;
                            listLIZJ = kVar8.LJJJI.createCapturePipeline(kVar8.LJJJJJ, false, kVar8.LJJJJJL.getOutputMode()).LIZJ();
                        }
                        k kVar9 = this.LIZ;
                        List<C2185991Agv> listLIZJ2 = kVar9.LLFII.createCapturePipeline(kVar9.LJJJJJ, false, kVar9.LJJJJJL.getOutputMode()).LIZJ();
                        Iterator<C2185991Agv> it2 = listLIZJ.iterator();
                        while (it2.hasNext()) {
                            this.LIZ.LLFZ.LIZ(it2.next());
                        }
                        for (C2185991Agv c2185991Agv : listLIZJ2) {
                            c2185991Agv.LJIIIIZZ = false;
                            this.LIZ.LLFZ.LIZ(c2185991Agv);
                        }
                    }
                    k kVar10 = this.LIZ;
                    InterfaceC2185971Agt interfaceC2185971Agt3 = kVar10.LJJJJJ;
                    if (interfaceC2185971Agt3 instanceof VECameraCapture) {
                        C1664350tPd<C2185991Agv> c1664350tPd = kVar10.LLFZ;
                        ((VECameraCapture) interfaceC2185971Agt3).LLJIJIL = c1664350tPd;
                        StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                        sbLIZ9.append("addCapturePipelines, pipelines = ");
                        sbLIZ9.append(c1664350tPd.LIZJ());
                        C2484209oO.LJI("VECameraCapture", C2188811AlT.LIZIZ(sbLIZ9));
                        C2484209oO.LJI("TERecorder", "switchSingleOrDualCamera, add dual-camera capture pipelines.");
                    }
                } else if (i2 == 0) {
                    C1664350tPd<C2185991Agv> capturePipelines2 = kVar7.LJJJI.getCapturePipelines();
                    if ((this.LIZ.LJJJJJ instanceof VECameraCapture) && capturePipelines2.LIZJ().size() == 1) {
                        ((VECameraCapture) this.LIZ.LJJJJJ).LLJIJIL = capturePipelines2;
                        StringBuilder sbLIZ10 = C2188811AlT.LIZ();
                        sbLIZ10.append("addCapturePipelines, pipelines = ");
                        sbLIZ10.append(capturePipelines2.LIZJ());
                        C2484209oO.LJI("VECameraCapture", C2188811AlT.LIZIZ(sbLIZ10));
                        C2484209oO.LJI("TERecorder", "switchSingleOrDualCamera, add single camera capture pipeline.");
                    }
                }
            }
        } else if (i == VEInfo.TE_RECORD_INFO_PERFORMANCE_DYNAMIC_CONTROL) {
            C2484209oO.LJI("TERecorder", "performance callback");
        } else if (i == VEInfo.TE_INFO_RECORD_RENDER_BLUR_END && (pair = (Pair) ((HashMap) this.LIZ.LJJLIIIJLLLLLLLZ).get(31)) != null && (c1diw = ((VEBaseFilterParam) pair.first).callback) != null) {
            c1diw.LIZ();
            C2484209oO.LIZ("TERecorder", "first blur frame render end");
        }
        int i4 = VEInfo.TE_RECORD_INFO_ENGINE_START;
        if (i == i4) {
            InterfaceC2185971Agt interfaceC2185971Agt4 = this.LIZ.LJJJJJ;
            if ((interfaceC2185971Agt4 instanceof VECameraCapture) && interfaceC2185971Agt4.LIZIZ() != null) {
                k kVar11 = this.LIZ;
                kVar11.LJJJI.updateCameraSetting(kVar11.LJJJJJ.LIZIZ());
            }
        }
        if (i != i4 || i2 != -124) {
            this.LIZ.LJJII(i, i2, f, str);
        }
        this.LIZ.getClass();
        if (i != VEInfo.TE_INFO_PREVIEW_RENDER_FPS && i == VEInfo.TE_INFO_PREVIEW_FIRST_FRAME_SCREEN) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = 0;
            if (C1DJC.LIZIZ > 0) {
                JSONObject jSONObject = new JSONObject();
                long jCurrentTimeMillis2 = System.currentTimeMillis() - C1DJC.LIZIZ;
                try {
                    jSONObject.put("duration", jCurrentTimeMillis2);
                } catch (JSONException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
                C2484209oO.LJI("TERecorder", "change frame size cost " + jCurrentTimeMillis2);
                b.LIZIZ("vesdk_event_recorder_change_preview_size", "behavior", jSONObject, true);
                C1DJC.LIZIZ = -1L;
            }
            if (i2 == 0) {
                j = jCurrentTimeMillis - C1DJC.LIZ;
                C1305700k5A.LIZIZ(j, "te_preview_first_frame_screen_time");
            }
            StringBuilder sbLIZ11 = C2188811AlT.LIZ();
            sbLIZ11.append("first frame screen cost ");
            sbLIZ11.append(j);
            sbLIZ11.append("ms, ret = ");
            sbLIZ11.append(i2);
            C2484209oO.LJI("TERecorder", C2188811AlT.LIZIZ(sbLIZ11));
        }
    }
}
