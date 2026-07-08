package X;

import Y.ARunnableS120S0100000_20;
import Y.ARunnableS53S0300000_20;
import android.content.Context;
import android.graphics.Matrix;
import android.opengl.GLES20;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.OrientationEventListener;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import com.ss.ttlivestreamer.core.buffer.k;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.TimeUtils;
import com.ss.ttlivestreamer.core.utils.VideoFrameStatics;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.PushBase;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0jCy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1272100jCy extends C1269970j9X {
    public final C1267500j5Y LLILLL;
    public InterfaceC1272120jD0 LLILZ;
    public Handler LLILZIL;
    public boolean LLILZLL;
    public k LLIZ;
    public C1267810j63 LLIZLLLIL;
    public C1269940j9U LLJ;
    public final C1269300j8S LLJI;
    public final C1269850j9L LLJIJIL;
    public int LLJILJIL;
    public int LLJILJILJ;
    public int LLJILLL;
    public boolean LLJJ;
    public C1273620jFQ LLJJIII;
    public C1272270jDF LLJJIJI;
    public final PushBase.HardwareRoi LLJJIJIL;
    public boolean LLJJJ;
    public boolean LLJJJIL;
    public InterfaceC1272420jDU LLJJJJLIIL;
    public InterfaceC1272600jDm LLJJL;
    public InterfaceC1272570jDj LLJJLIIIJLLLLLLLZ;
    public final VideoFrameStatics LLJL;
    public Matrix LLJLIL;
    public final C1272300jDI LLJLILLLLZIIL;
    public final LinkedList<C1269610j8x> LLJLL;
    public boolean LLJLLIL;
    public volatile boolean LLJLLL;
    public final HashMap<C0UD1, C1272170jD5> LLJJI = new HashMap<>();
    public final LinkedHashMap<EnumC1272790jE5, C1272530jDf> LLJJIJIIJIL = new LinkedHashMap<>();
    public EnumC1272290jDH LLJJJJ = EnumC1272290jDH.ROI_SWITCH_REASON_DEFAULT;
    public String LLJJJJJIL = "";

    @Override // X.C1271610jCB
    public final synchronized void release() {
        this.LLJJJJLIIL = null;
        this.LLJLLL = false;
        if (this.LLJJI.size() > 0) {
            Iterator<Map.Entry<C0UD1, C1272170jD5>> it2 = this.LLJJI.entrySet().iterator();
            while (it2.hasNext()) {
                it2.next().getValue().LJFF();
            }
        }
        this.LLJJI.clear();
        Handler handler = this.LLILZIL;
        if (handler != null) {
            C786410Ut5.LJJZZIII(handler, new ARunnableS120S0100000_20(this, 177));
        }
        this.LLILZ = null;
        C1272270jDF c1272270jDF = this.LLJJIJI;
        if (c1272270jDF != null) {
            c1272270jDF.disable();
        }
        this.LLJJIJI = null;
        this.LLILZIL = null;
        this.LLIZLLLIL = null;
        this.LLJ = null;
        this.LLJJIII = null;
        this.LLIZ = null;
        this.LLILZ = null;
    }

    public final boolean LJIIJ() {
        return this.LLJJJ && this.LLJJIJIL.enable && this.LLJJJIL;
    }

    public final boolean LJIILIIL() {
        InterfaceC1272120jD0 interfaceC1272120jD0 = this.LLILZ;
        if (interfaceC1272120jD0 != null) {
            return interfaceC1272120jD0.valid();
        }
        return false;
    }

    @Override // X.C1271610jCB
    public final String LIZLLL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoEffectNode_");
        sbLIZ.append(this.LL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final String LJIIL(Object... objArr) {
        String str;
        if (!C1267520j5a.LIZ()) {
            return "";
        }
        String strLIZIZ = e3.h;
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(ThreadMethodProxy.getStackTrace(C786410Ut5.u3())[3].getMethodName());
            sbLIZ.append(e3.h);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strLIZIZ);
            sbLIZ2.append(objArr[i]);
            if (i == objArr.length - 1) {
                str = "";
            } else {
                str = ", ";
            }
            sbLIZ2.append(str);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(strLIZIZ);
        sbLIZ3.append(')');
        return C2188811AlT.LIZIZ(sbLIZ3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.C1271610jCB
    public final Bundle LJFF(String str) {
        C1273620jFQ c1273620jFQ;
        Long lValueOf;
        Integer numValueOf;
        Bundle bundle = new Bundle();
        switch (str.hashCode()) {
            case -1990476219:
                if (str.equals("key_effect_resource_validation_query")) {
                    boolean z = true;
                    if (this.LLILLL.LIZ.ttlhABSettingsConfigs.LJFF() && this.LLJLLL) {
                        numValueOf = 1;
                    } else {
                        InterfaceC1272120jD0 interfaceC1272120jD0 = this.LLILZ;
                        if (interfaceC1272120jD0 != null) {
                            numValueOf = Integer.valueOf(interfaceC1272120jD0.isExistValidResource());
                        }
                        z = false;
                        bundle.putBoolean("key_effect_resource_validation_query", z);
                        return bundle;
                    }
                    if (numValueOf == null || numValueOf.intValue() != 1) {
                        z = false;
                    }
                    bundle.putBoolean("key_effect_resource_validation_query", z);
                    return bundle;
                }
                return bundle;
            case -1691515608:
                if (str.equals("key_effect_avg_time") && (c1273620jFQ = this.LLJJIII) != null && (lValueOf = Long.valueOf(c1273620jFQ.LIZ())) != null) {
                    bundle.putLong("key_effect_avg_time", lValueOf.longValue());
                    return bundle;
                }
                return bundle;
            case -669599318:
                if (str.equals("key_effect_out_fps")) {
                    bundle.putFloat("key_effect_out_fps", this.LLJL.getRealRatePerSecond());
                    return bundle;
                }
                return bundle;
            case 1822870162:
                if (str.equals("key_effect_node_enable")) {
                    bundle.putBoolean("key_effect_node_enable", this.LLILZLL);
                    return bundle;
                }
                return bundle;
            default:
                return bundle;
        }
    }

    public final void LJIIJJI(String[] strArr) {
        if (strArr.length == 0) {
            return;
        }
        String str = strArr[0];
        if (!TextUtils.isEmpty(str)) {
            try {
                this.LLJJJJJIL = new JSONObject(str).optString("effect_id", "");
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0150  */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.ttlivestreamer.core.buffer.VideoFrame LJIILJJIL(com.ss.ttlivestreamer.core.buffer.VideoFrame r29) {
        /*
            Method dump skipped, instruction units count: 896
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1272100jCy.LJIILJJIL(com.ss.ttlivestreamer.core.buffer.VideoFrame):com.ss.ttlivestreamer.core.buffer.VideoFrame");
    }

    @Override // X.C1269970j9X, X.InterfaceC1269980j9Y
    public final void onData(VideoFrame videoFrame, Bundle bundle) {
        this.LLILLL.LIZ.LJIIIIZZ();
        List<C1269610j8x> events = videoFrame.getEvents();
        if (events != null && (!events.isEmpty())) {
            this.LLJLL.addAll(events);
        }
        LinkedList<C1269610j8x> linkedList = this.LLJLL;
        if (!linkedList.isEmpty()) {
            Iterator<C1269610j8x> it2 = linkedList.iterator();
            while (it2.hasNext()) {
                C1269610j8x next = it2.next();
                int i = next.LJFF;
                int i2 = C1269570j8t.LIZLLL;
                if ((i & i2) != 0) {
                    EnumC1269590j8v enumC1269590j8v = next.LIZLLL;
                    if (enumC1269590j8v != null && C1269550j8r.LIZ[enumC1269590j8v.ordinal()] == 1) {
                        if (next instanceof C1269620j8y) {
                            JSONObject jSONObjectLIZLLL = next.LIZLLL(i2);
                            C1269300j8S c1269300j8S = this.LLJI;
                            if (c1269300j8S != null) {
                                c1269300j8S.LIZIZ(jSONObjectLIZLLL);
                            }
                            this.LLILZLL = ((C1269620j8y) next).LJIIIIZZ;
                            InterfaceC1272420jDU interfaceC1272420jDU = this.LLJJJJLIIL;
                            if (interfaceC1272420jDU != null) {
                                interfaceC1272420jDU.LIZ();
                            }
                            int i3 = next.LJFF & (~i2);
                            next.LJFF = i3;
                            if (i3 == 0) {
                                it2.remove();
                            }
                        }
                    } else {
                        throw new C1284660jXE(null, 1, null);
                    }
                }
            }
        }
        C1269850j9L c1269850j9L = this.LLJIJIL;
        if (c1269850j9L != null) {
            c1269850j9L.LIZJ(EnumC1269840j9K.DURATION_TYPE_PRE_EFFECT, videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight());
        }
        if (!this.LLILZLL || !LJIILIIL() || bundle.getBoolean("skip_effect", false)) {
            this.LLILLL.LIZ.LJIIIIZZ();
            if (videoFrame.getBuffer().getCaptureServerNtpMs() > 0) {
                videoFrame.getBuffer().updateEffectServerNtpMs(TimeUtils.nativeTimeUTCMicros() / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
            }
            GLES20.glFinish();
            LJIIIZ(videoFrame, bundle);
            this.LLJL.add();
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EffectOut_");
        sbLIZ.append(this.LL);
        videoFrame.retain(C2188811AlT.LIZIZ(sbLIZ));
        Handler handler = this.LLILZIL;
        if (handler != null) {
            C786410Ut5.LJJZZIII(handler, new ARunnableS53S0300000_20(this, videoFrame, bundle, 30));
        }
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [X.0jDF] */
    public C1272100jCy(C1267500j5Y c1267500j5Y, InterfaceC1272120jD0 interfaceC1272120jD0, final Context context, Handler handler) {
        this.LLILLL = c1267500j5Y;
        this.LLILZ = interfaceC1272120jD0;
        this.LLILZIL = handler;
        this.LLJJIJIL = new PushBase.HardwareRoi();
        C1272810jE7 c1272810jE7 = c1267500j5Y.LIZJ;
        this.LLJL = new VideoFrameStatics(2000);
        this.LLJLL = new LinkedList<>();
        this.LLIZLLLIL = (C1267810j63) c1272810jE7.getService(C1267810j63.class);
        c1272810jE7.getService(C1271790jCT.class);
        this.LLJ = (C1269940j9U) c1272810jE7.getService(C1269940j9U.class);
        this.LLJIJIL = (C1269850j9L) c1272810jE7.getService(C1269850j9L.class);
        this.LLJI = (C1269300j8S) c1272810jE7.getService(C1269300j8S.class);
        this.LLJJIJI = new OrientationEventListener(context) { // from class: X.0jDF
            @Override // android.view.OrientationEventListener
            public final void onOrientationChanged(int i) {
                if (i == -1) {
                    return;
                }
                int i2 = (((i + 45) / 90) * 90) % 360;
                C1272100jCy c1272100jCy = this.LIZ;
                if (i2 != c1272100jCy.LLJILJIL) {
                    c1272100jCy.LLJILJIL = i2;
                }
            }

            {
                try {
                    if (canDetectOrientation()) {
                        enable();
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    AVLog.logKibana(6, "VideoEffectNode", "AlbumOrientationEventListener register failed:", e);
                }
            }
        };
        PushBase.RoiMap roiMap = c1267500j5Y.LIZ.mPushBase.LJIIL;
        if (roiMap.hardwareRoi == null) {
            roiMap.hardwareRoi = new PushBase.HardwareRoi();
        }
        this.LLJJIJIL = roiMap.hardwareRoi;
        this.LLJLILLLLZIIL = new C1272300jDI();
    }
}
