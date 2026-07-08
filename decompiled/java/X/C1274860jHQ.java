package X;

import Y.ARunnableS120S0100000_20;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.Log;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.bytertc.engine.video.IVideoSink;
import com.ss.bytertc.engine.video.VideoFrame;
import com.ss.lyrax.video.NativeRenderConfig;
import com.ss.ttlivestreamer.core.abnormal_detect.TTLHAbnormalDetectorJava;
import com.ss.ttlivestreamer.core.effect.EffectWrapper;
import com.ss.ttlivestreamer.core.opengl.GlUtil;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.TimeUtils;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jHQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1274860jHQ implements IVideoSink {
    public boolean LIZIZ;
    public final C1275170jHv LIZJ;
    public volatile boolean LJFF;
    public final int LJII;
    public C1274460jGm LJIIIIZZ;
    public final C1274960jHa LJIIIZ;
    public final String LJIIJ;
    public final String LJIIJJI;
    public int LJIIL;
    public int LJIILIIL;
    public final boolean LJIILJJIL;
    public final boolean LJIILL;
    public final boolean LJIILLIIL;
    public final boolean LJIIZILJ;
    public final boolean LJIJ;
    public final int LJIJJ;
    public final boolean LJJ;
    public final boolean LJJI;
    public final long LJJIFFI;
    public final boolean LJJII;
    public final boolean LJJIII;
    public final int LJJIIJ;
    public C1274810jHL LJJIIZI;
    public boolean LIZ = true;
    public volatile boolean LIZLLL = true;
    public volatile boolean LJ = true;
    public volatile boolean LJI = true;
    public final AtomicReference<TTLHAbnormalDetectorJava> LJIJI = new AtomicReference<>(null);
    public long LJIJJLI = 0;
    public boolean LJIL = false;
    public float LJJIIJZLJL = 0.0f;
    public final C1269760j9C LJJIIZ = new C1269760j9C(-1, -1);
    public long LJJIJ = 0;
    public int LJJIJIIJI = 0;

    public final void LIZLLL() {
        AVLog.debugTrace(new Object[0]);
        C1274460jGm c1274460jGm = this.LJIIIIZZ;
        this.LJIIIIZZ = null;
        if (c1274460jGm != null) {
            Object obj = (InterfaceC1274540jGu) ((ConcurrentHashMap) ((C1271130jBP) this.LJIIIZ.LJ).LIZLLL).remove(c1274460jGm.LLILZIL);
            if (obj != c1274460jGm) {
                if (obj != null) {
                    ((C1271610jCB) obj).release();
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("remove ");
                sbLIZ.append(c1274460jGm.LLILZIL);
                sbLIZ.append(": expect ");
                sbLIZ.append(c1274460jGm);
                sbLIZ.append(", actual ");
                sbLIZ.append(obj);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                AVLog.iow("InteractVideoSinkFactory", strLIZIZ);
                AVLog.logKibana(5, "InteractVideoSinkFactory", strLIZIZ, null);
                AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException(strLIZIZ);
                C1274080jGA.LIZ.LIZ("InteractVideoSinkFactory.destroy", androidRuntimeException);
                if (C1274040jG6.LIZ()) {
                    throw androidRuntimeException;
                }
            }
            c1274460jGm.release();
        }
    }

    public final SurfaceView LJ() {
        AVLog.debugTrace(new Object[0]);
        C1274460jGm c1274460jGm = this.LJIIIIZZ;
        if (c1274460jGm != null) {
            return c1274460jGm.LJIILIIL();
        }
        return null;
    }

    public final TextureView LJFF() {
        AVLog.debugTrace(new Object[0]);
        C1274460jGm c1274460jGm = this.LJIIIIZZ;
        if (c1274460jGm != null) {
            return c1274460jGm.LJIILJJIL();
        }
        return null;
    }

    public final InterfaceC1274490jGp LJI() {
        AVLog.debugTrace(new Object[0]);
        C1274460jGm c1274460jGm = this.LJIIIIZZ;
        if (c1274460jGm != null) {
            return c1274460jGm.LLIZLLLIL;
        }
        return null;
    }

    public final synchronized void LJII() {
        AVLog.debugTrace(new Object[0]);
        if (!this.LIZIZ) {
            this.LIZIZ = true;
            this.LIZ = false;
            LIZLLL();
            this.LIZJ.LIZIZ();
            this.LJJIIZI = null;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this);
            sbLIZ.append(" released done");
            AVLog.iow("VideoSinkWrapper", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final void LIZ() {
        if (this.LJI && !this.LJIJ && this.LJ) {
            this.LJ = false;
            C1274960jHa c1274960jHa = this.LJIIIZ;
            Handler handler = c1274960jHa.LJIIJJI;
            if (handler != null) {
                C786410Ut5.LJJZZIII(handler, new ARunnableS120S0100000_20(this, 461));
                return;
            }
            InterfaceC1274450jGl interfaceC1274450jGl = c1274960jHa.LJIILIIL;
            ((C1274900jHU) interfaceC1274450jGl).LIZ.LLIIII(0, 0, this.LJIIJ);
        }
    }

    @Override // com.ss.bytertc.engine.video.IVideoSink
    public final int getRenderElapse() {
        InterfaceC1274490jGp interfaceC1274490jGpLJI = LJI();
        if (interfaceC1274490jGpLJI != null) {
            return (int) interfaceC1274490jGpLJI.getLatestRenderCostMs();
        }
        return 0;
    }

    public C1274860jHQ(C1274960jHa c1274960jHa) throws Exception {
        String str;
        String str2;
        boolean z;
        int i;
        boolean z2;
        View viewLJ;
        boolean z3;
        AbstractC1273900jFs abstractC1273900jFsLIZ;
        this.LJJ = false;
        this.LJJI = false;
        this.LJJIFFI = 0L;
        this.LJJII = false;
        this.LJJIII = false;
        this.LJJIIJ = -1;
        AVLog.debugTrace(new Object[0]);
        if (c1274960jHa.LIZ != null && c1274960jHa.LIZLLL != null && c1274960jHa.LJIILIIL != null) {
            this.LJIIIZ = c1274960jHa;
            String str3 = c1274960jHa.LIZ;
            this.LJIIJ = str3;
            String str4 = c1274960jHa.LIZIZ;
            this.LJIIJJI = str4;
            boolean z4 = c1274960jHa.LIZJ;
            this.LJIJ = z4;
            this.LJJIII = c1274960jHa.LJIJJ;
            this.LJII = c1274960jHa.LIZLLL.LJIILL(str3);
            if (c1274960jHa.LJIIIZ == EnumC1275500jIS.TEXTURE_VIEW) {
                z = true;
            } else {
                z = false;
            }
            int i2 = c1274960jHa.LJIIJ;
            this.LJIJJ = i2;
            C1274850jHP c1274850jHP = c1274960jHa.LIZLLL;
            if (c1274850jHP != null && (abstractC1273900jFsLIZ = c1274850jHP.LIZIZ.LIZ()) != null) {
                NativeRenderConfig nativeRenderConfigLJIILL = abstractC1273900jFsLIZ.LLD().LIZ.ttlhABSettingsConfigs.LJIILL();
                if (nativeRenderConfigLJIILL != null) {
                    this.LJJ = nativeRenderConfigLJIILL.enable;
                    this.LJJI = nativeRenderConfigLJIILL.enableDelayInit;
                    this.LJJIFFI = nativeRenderConfigLJIILL.initDelayTime;
                    this.LJJII = nativeRenderConfigLJIILL.supportHwDecoder;
                }
                if (C1274040jG6.LIZ) {
                    abstractC1273900jFsLIZ.LLD().LIZ.ttlhABSettingsConfigs.getClass();
                    this.LJJIIJ = -1;
                }
                abstractC1273900jFsLIZ.LJJIIJZLJL().LIZJ.getService(C1269300j8S.class);
            }
            if (z4) {
                InterfaceC1271140jBQ interfaceC1271140jBQ = c1274960jHa.LJ;
                boolean z5 = c1274960jHa.LJI;
                boolean z6 = c1274960jHa.LJIILL;
                if (c1274960jHa.LJIILLIIL.LJJIIZI != EnumC1275490jIR.NO_USE) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                i = i2;
                this.LJIIIIZZ = ((C1271130jBP) interfaceC1271140jBQ).LIZ(str4, z, i2, z5, z6, z3, c1274960jHa.LJFF);
            } else {
                i = i2;
                InterfaceC1271140jBQ interfaceC1271140jBQ2 = c1274960jHa.LJ;
                boolean z7 = c1274960jHa.LJI;
                boolean z8 = c1274960jHa.LJIILL;
                if (c1274960jHa.LJIILLIIL.LJJIIZI != EnumC1275490jIR.NO_USE) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.LJIIIIZZ = ((C1271130jBP) interfaceC1271140jBQ2).LIZ(str3, z, i, z7, z8, z2, c1274960jHa.LJFF);
            }
            this.LJIIIIZZ.LJIIZILJ(this.LJI);
            this.LJIIIIZZ.LLJL = c1274960jHa;
            this.LJIILJJIL = c1274960jHa.LJIIZILJ;
            C1275170jHv c1275170jHv = new C1275170jHv(this, str3);
            this.LIZJ = c1275170jHv;
            synchronized (c1275170jHv) {
                c1275170jHv.LIZLLL = true;
                ARunnableS120S0100000_20 aRunnableS120S0100000_20 = new ARunnableS120S0100000_20(c1275170jHv, 462);
                c1275170jHv.LJ = aRunnableS120S0100000_20;
                Handler handler = c1274960jHa.LJIIJJI;
                if (handler != null) {
                    C786410Ut5.LJJZZIII(handler, aRunnableS120S0100000_20);
                }
            }
            this.LJIILLIIL = c1274960jHa.LJIJ;
            this.LJIIZILJ = c1274960jHa.LJIJI;
            if (LJFF() != null) {
                viewLJ = LJFF();
            } else {
                viewLJ = LJ();
            }
            this.LJIILL = GlUtil.isGLES3Support(viewLJ.getContext());
            this.LIZIZ = false;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this);
            sbLIZ.append(" rtcDeliverType:");
            sbLIZ.append(i);
            AVLog.iow("VideoSinkWrapper", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("RTCcheckMemberVariable failed: we only have ");
        if (c1274960jHa.LIZ == null) {
            str = "";
        } else {
            str = " mInteractId,";
        }
        sbLIZ2.append(str);
        if (c1274960jHa.LIZLLL == null) {
            str2 = "";
        } else {
            str2 = " mInteractEngine,";
        }
        sbLIZ2.append(str2);
        sbLIZ2.append(c1274960jHa.LJIILIIL != null ? " mRemoteRenderEventHandler," : "");
        AVLog.logKibana(6, "VideoRenderConfig", C2188811AlT.LIZIZ(sbLIZ2), null);
        throw new Exception("videoRenderConfig init failed");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x027d  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(com.ss.bytertc.engine.video.VideoFrame r36) {
        /*
            Method dump skipped, instruction units count: 1232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1274860jHQ.LIZIZ(com.ss.bytertc.engine.video.VideoFrame):void");
    }

    public final void LIZJ(ByteBuffer byteBuffer) {
        InterfaceC1275920jJ8 interfaceC1275920jJ8;
        if (byteBuffer != null && !byteBuffer.isDirect()) {
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(byteBuffer.capacity());
            byteBufferAllocateDirect.position(0);
            byteBufferAllocateDirect.put(byteBuffer);
            byteBuffer.rewind();
            byteBufferAllocateDirect.position(0);
            byteBuffer = byteBufferAllocateDirect;
        }
        String strNativeParseStringFromByteBuffer = EffectWrapper.nativeParseStringFromByteBuffer(0, byteBuffer);
        if (!TextUtils.isEmpty(strNativeParseStringFromByteBuffer)) {
            try {
                JSONObject jSONObject = JSONObjectProtectorUtils.getJSONObject(new JSONObject(strNativeParseStringFromByteBuffer), "video_e2e_delay");
                if (jSONObject != null) {
                    long jOptLong = jSONObject.optLong("capture_ntp_ts");
                    if (jOptLong > 0 && (interfaceC1275920jJ8 = this.LJIIIZ.LJIIL) != null) {
                        String str = this.LJIIJ;
                        long serverTimeMSec = TimeUtils.getServerTimeMSec();
                        C1274910jHV c1274910jHV = ((C1274990jHd) interfaceC1275920jJ8).LIZJ;
                        if (c1274910jHV != null) {
                            c1274910jHV.onVideoDelayInfo(str, (int) (serverTimeMSec - jOptLong));
                        }
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public final void LJIIIIZZ(boolean z) {
        C1273190jEj c1273190jEj = this.LJIIIZ.LJFF;
        C1274460jGm c1274460jGm = this.LJIIIIZZ;
        if (c1274460jGm != null && c1273190jEj != null) {
            if (z) {
                c1274460jGm.LJI(c1273190jEj);
            } else {
                c1274460jGm.LJIIIIZZ(c1273190jEj);
            }
            this.LJIIIIZZ.LLJLIL = false;
        }
    }

    @Override // com.ss.bytertc.engine.video.IVideoSink
    public final void onFrame(VideoFrame videoFrame) {
        int i;
        String string;
        ByteBuffer byteBufferAllocateDirect;
        C1271390jBp c1271390jBp;
        try {
            if (this.LJIIL != videoFrame.getWidth()) {
                this.LJIIL = videoFrame.getWidth();
            }
            if (this.LJIILIIL != videoFrame.getHeight()) {
                this.LJIILIIL = videoFrame.getHeight();
            }
            if (!this.LJFF) {
                LIZIZ(videoFrame);
            }
            C1274460jGm c1274460jGm = this.LJIIIIZZ;
            if (c1274460jGm != null && (c1271390jBp = c1274460jGm.LLJI) != null) {
                i = c1271390jBp.LIZIZ;
            } else {
                i = -1;
            }
            ByteBuffer externalDataInfo = videoFrame.getExternalDataInfo();
            if (externalDataInfo == null) {
                string = "";
            } else {
                string = StandardCharsets.UTF_8.decode(externalDataInfo).toString();
            }
            if (this.LJIIZILJ && string.isEmpty()) {
                return;
            }
            int i2 = this.LJII;
            String str = this.LJIIJ;
            int width = videoFrame.getWidth();
            int height = videoFrame.getHeight();
            long timeStampUs = videoFrame.getTimeStampUs() / 1000;
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(string.getBytes(StandardCharsets.UTF_8));
            if (byteBufferWrap != null && !byteBufferWrap.isDirect()) {
                byteBufferAllocateDirect = ByteBuffer.allocateDirect(byteBufferWrap.capacity());
                byteBufferAllocateDirect.position(0);
                byteBufferAllocateDirect.put(byteBufferWrap);
                byteBufferWrap.rewind();
                byteBufferAllocateDirect.position(0);
            } else {
                byteBufferAllocateDirect = byteBufferWrap;
            }
            C1274960jHa c1274960jHa = this.LJIIIZ;
            if (c1274960jHa.LJIILJJIL != null) {
                c1274960jHa.LJIILLIIL.getClass();
                AbstractC1273900jFs abstractC1273900jFs = this.LJIIIZ.LJIILJJIL.LL;
                if (abstractC1273900jFs != null) {
                    abstractC1273900jFs.LLJJJJ(i2, str, i, width, height, timeStampUs, byteBufferAllocateDirect);
                }
            }
            if (!string.isEmpty()) {
                LIZJ(ByteBuffer.wrap(string.getBytes(StandardCharsets.UTF_8)));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            AVLog.logKibana(6, "VideoSinkWrapper", Log.getStackTraceString(th), null);
        }
    }
}
