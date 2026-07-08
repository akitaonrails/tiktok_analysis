package X;

import android.graphics.Rect;
import android.hardware.Camera;
import android.util.Size;
import android.view.MotionEvent;
import androidx.lifecycle.LiveData;
import com.bytedance.android.livesdk.broadcast.LiveCoverManualFocusEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: renamed from: X.19Lv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21525319Lv extends C21648719nx {
    public final int $t;
    public Object l0;

    @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        switch (this.$t) {
            case 0:
                return onSingleTapUp$0(this, motionEvent);
            case 1:
                return onSingleTapUp$1(this, motionEvent);
            default:
                return super.onSingleTapUp(motionEvent);
        }
    }

    public C21525319Lv(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean onSingleTapUp$0(C21525319Lv c21525319Lv, MotionEvent motionEvent) {
        Camera.Parameters parameters;
        if (motionEvent != null) {
            C19I1 c19i1 = (C19I1) c21525319Lv.l0;
            DataChannel dataChannel = c19i1.LLILLJJLI;
            if (dataChannel == null) {
                dataChannel = null;
            }
            dataChannel.LC0(LiveCoverManualFocusEvent.class, motionEvent);
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int iLIZIZ = (((int) C497740JfY.LIZIZ(65.0f)) / C14KS.LJFF()) * 2000;
            Size size = c19i1.LLILZ;
            if (size != null) {
                int width = size.getWidth();
                if (c19i1.LLILZ != null) {
                    float f = 2000;
                    float height = (y / r0.getHeight()) * f;
                    float f2 = LSPassThroughRecordSizeConfig.DEFAULT;
                    float f3 = width;
                    int i = (int) ((((f3 - x) / f3) * f) - f2);
                    int i2 = iLIZIZ / 2;
                    int iLIZIZ2 = C419990GdR.LIZIZ(((int) (height - f2)) - i2, C386801es.DEFAULT, LSPassThroughRecordSizeConfig.DEFAULT);
                    int iLIZIZ3 = C419990GdR.LIZIZ(i - i2, C386801es.DEFAULT, LSPassThroughRecordSizeConfig.DEFAULT);
                    Rect rect = new Rect(iLIZIZ2, iLIZIZ3, C419990GdR.LIZIZ(iLIZIZ2 + iLIZIZ, C386801es.DEFAULT, LSPassThroughRecordSizeConfig.DEFAULT), C419990GdR.LIZIZ(iLIZIZ + iLIZIZ3, C386801es.DEFAULT, LSPassThroughRecordSizeConfig.DEFAULT));
                    C19I2 cameraProxy = c19i1.getCameraProxy();
                    cameraProxy.getClass();
                    try {
                        Camera camera = cameraProxy.LIZJ;
                        if (camera != null) {
                            camera.cancelAutoFocus();
                        }
                    } catch (RuntimeException e) {
                        TryCatchGuardChecker.doCheck(e);
                        C20441214yg.LJI("LiveCoverCameraProxy", e);
                    }
                    Camera camera2 = cameraProxy.LIZJ;
                    if (camera2 != null && (parameters = camera2.getParameters()) != null) {
                        if (parameters.getMaxNumFocusAreas() > 0) {
                            parameters.setFocusAreas(C1697810uHb.LJ(new Camera.Area(rect, LSPassThroughRecordSizeConfig.DEFAULT)));
                        }
                        if (parameters.getMaxNumMeteringAreas() > 0) {
                            parameters.setMeteringAreas(C1697810uHb.LJ(new Camera.Area(rect, LSPassThroughRecordSizeConfig.DEFAULT)));
                        }
                        parameters.setFocusMode("macro");
                        cameraProxy.LJ(parameters);
                        try {
                            Camera camera3 = cameraProxy.LIZJ;
                            if (camera3 != null) {
                                camera3.autoFocus(new Camera.AutoFocusCallback() { // from class: X.19I0
                                    @Override // android.hardware.Camera.AutoFocusCallback
                                    public final void onAutoFocus(boolean z, Camera camera4) {
                                    }
                                });
                                return true;
                            }
                        } catch (RuntimeException e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            C20441214yg.LJI("LiveCoverCameraProxy", e2);
                        }
                    }
                }
            }
        }
        return true;
    }

    public static final boolean onSingleTapUp$1(C21525319Lv c21525319Lv, MotionEvent motionEvent) {
        if (motionEvent != null) {
            SurfaceHolderCallbackC21514919Hv surfaceHolderCallbackC21514919Hv = (SurfaceHolderCallbackC21514919Hv) c21525319Lv.l0;
            com.ss.android.ugc.profile.business.ur.camera.datachannel.DataChannel dataChannel = surfaceHolderCallbackC21514919Hv.LLILLJJLI;
            if (dataChannel == null) {
                dataChannel = null;
            }
            if (dataChannel.wQ2()) {
                LiveData liveData = (LiveData) dataChannel.vQ2(com.ss.android.ugc.profile.business.ur.camera.LiveCoverManualFocusEvent.class);
                if (liveData != null) {
                    liveData.postValue(motionEvent);
                }
            } else {
                LiveData liveData2 = (LiveData) dataChannel.vQ2(com.ss.android.ugc.profile.business.ur.camera.LiveCoverManualFocusEvent.class);
                if (liveData2 != null) {
                    liveData2.setValue(motionEvent);
                }
            }
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            C0IKF.LIZ.getClass();
            int iLIZIZ = (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(65.0f))) / C465320IMo.LIZ().LIZIZ(surfaceHolderCallbackC21514919Hv.getContext()).LIZ().width()) * 2000;
            Size size = surfaceHolderCallbackC21514919Hv.LLILZ;
            if (size != null) {
                int width = size.getWidth();
                if (surfaceHolderCallbackC21514919Hv.LLILZ != null) {
                    float f = 2000;
                    float height = (y / r0.getHeight()) * f;
                    float f2 = LSPassThroughRecordSizeConfig.DEFAULT;
                    float f3 = width;
                    int i = (int) ((((f3 - x) / f3) * f) - f2);
                    int i2 = iLIZIZ / 2;
                    int iLIZIZ2 = C419990GdR.LIZIZ(((int) (height - f2)) - i2, C386801es.DEFAULT, LSPassThroughRecordSizeConfig.DEFAULT);
                    int iLIZIZ3 = C419990GdR.LIZIZ(i - i2, C386801es.DEFAULT, LSPassThroughRecordSizeConfig.DEFAULT);
                    Rect rect = new Rect(iLIZIZ2, iLIZIZ3, C419990GdR.LIZIZ(iLIZIZ2 + iLIZIZ, C386801es.DEFAULT, LSPassThroughRecordSizeConfig.DEFAULT), C419990GdR.LIZIZ(iLIZIZ + iLIZIZ3, C386801es.DEFAULT, LSPassThroughRecordSizeConfig.DEFAULT));
                    C21514619Hs cameraProxy = surfaceHolderCallbackC21514919Hv.getCameraProxy();
                    cameraProxy.getClass();
                    try {
                        Camera camera = cameraProxy.LIZJ;
                        if (camera != null) {
                            camera.cancelAutoFocus();
                        }
                    } catch (RuntimeException e) {
                        TryCatchGuardChecker.doCheck(e);
                        cameraProxy.LIZIZ().LIZLLL("LiveCoverCameraProxy", e);
                    }
                    try {
                        Camera camera2 = cameraProxy.LIZJ;
                        if (camera2 != null) {
                            Camera.Parameters parameters = camera2.getParameters();
                            if (parameters != null) {
                                if (parameters.getMaxNumFocusAreas() > 0) {
                                    parameters.setFocusAreas(C1697810uHb.LJ(new Camera.Area(rect, LSPassThroughRecordSizeConfig.DEFAULT)));
                                }
                                if (parameters.getMaxNumMeteringAreas() > 0) {
                                    parameters.setMeteringAreas(C1697810uHb.LJ(new Camera.Area(rect, LSPassThroughRecordSizeConfig.DEFAULT)));
                                }
                                parameters.setFocusMode("macro");
                                cameraProxy.LJFF(parameters);
                                try {
                                    Camera camera3 = cameraProxy.LIZJ;
                                    if (camera3 != null) {
                                        camera3.autoFocus(new Camera.AutoFocusCallback() { // from class: X.19Hx
                                            @Override // android.hardware.Camera.AutoFocusCallback
                                            public final void onAutoFocus(boolean z, Camera camera4) {
                                            }
                                        });
                                        return true;
                                    }
                                } catch (RuntimeException e2) {
                                    TryCatchGuardChecker.doCheck(e2);
                                    cameraProxy.LIZIZ().LIZLLL("LiveCoverCameraProxy", e2);
                                    return true;
                                }
                            }
                        }
                    } catch (RuntimeException e3) {
                        TryCatchGuardChecker.doCheck(e3);
                        cameraProxy.LIZIZ().LIZLLL("LiveCoverCameraProxy", e3);
                    }
                }
            }
        }
        return true;
    }
}
