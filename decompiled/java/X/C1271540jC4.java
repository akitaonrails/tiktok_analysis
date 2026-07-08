package X;

import Y.ARunnableS120S0100000_20;
import Y.ARunnableS28S0400000_20;
import Y.ARunnableS3S0111000_20;
import Y.ARunnableS53S0300000_20;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import com.ss.ttlivestreamer.core.buffer.k;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.livestreamv2.filter.bmf.BmfVideoStreamHDFilterImpl;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.PushBase;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jC4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1271540jC4 extends C1269970j9X {
    public final C1267500j5Y LLILLL;
    public C1266350j3h LLILZ;
    public final EnumC1267980j6K LLILZIL;
    public Handler LLILZLL;
    public BmfVideoStreamHDFilterImpl LLIZ;
    public k LLIZLLLIL;
    public C1267810j63 LLJ;
    public C1269940j9U LLJI;
    public C1273620jFQ LLJIJIL;
    public boolean LLJILLL;
    public final boolean LLJILJIL = true;
    public final C1271580jC8 LLJILJILJ = new C1271580jC8();
    public boolean LLJJ = true;

    public final void LJIIL() {
        JSONObject jSONObjectLJJJJI;
        Boolean boolValueOf;
        Handler handler;
        C1268700j7U c1268700j7U = (C1268700j7U) this.LLILLL.LIZJ.getService(C1268700j7U.class);
        this.LLILZLL = c1268700j7U != null ? c1268700j7U.LIZ() : null;
        this.LLJ = (C1267810j63) this.LLILLL.LIZJ.getService(C1267810j63.class);
        this.LLILLL.LIZJ.getService(C1271790jCT.class);
        this.LLJI = (C1269940j9U) this.LLILLL.LIZJ.getService(C1269940j9U.class);
        C1266350j3h c1266350j3h = this.LLILZ;
        this.LLJIJIL = c1266350j3h != null ? c1266350j3h.LLJLL : null;
        try {
            PushBase pushBase = this.LLILLL.LIZ.mPushBase;
            if (this.LLILZIL == EnumC1267980j6K.GAME_LIVE) {
                jSONObjectLJJJJI = pushBase.LJJI();
                boolValueOf = Boolean.valueOf(pushBase.LJIILJJIL());
                this.LLJJ = pushBase.LJIILL();
            } else {
                jSONObjectLJJJJI = pushBase.LJJJJI();
                boolValueOf = Boolean.valueOf(pushBase.LJIJI());
                if (this.LLILZ.LLLLZ != EnumC1267980j6K.NORMAL_LIVE) {
                    boolValueOf = Boolean.valueOf(boolValueOf.booleanValue() & this.LLILLL.LIZ.mPushBase.LJJIIJ());
                }
                this.LLJJ = pushBase.LJIL();
            }
            C1266350j3h c1266350j3h2 = this.LLILZ;
            if (c1266350j3h2 != null) {
                c1266350j3h2.LLLZIIL(-1, -1, false, boolValueOf.booleanValue());
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("videoStreamHDParams:");
            sbLIZ.append(jSONObjectLJJJJI);
            AVLog.logKibana(4, "BmfStreamHDNode", C2188811AlT.LIZIZ(sbLIZ), null);
            InterfaceC1273880jFq interfaceC1273880jFq = new InterfaceC1273880jFq() { // from class: X.0j9b
                @Override // X.InterfaceC1273880jFq
                public final int LJLJJLL() {
                    C1266350j3h c1266350j3h3 = this.LIZ.LLILZ;
                    if (c1266350j3h3 != null) {
                        return c1266350j3h3.LLIIIILZ();
                    }
                    return -1;
                }

                @Override // X.InterfaceC1273880jFq
                public final void LIZ(int i) {
                    EnumC1267980j6K enumC1267980j6K;
                    boolean zLJIJI = this.LIZ.LLILLL.LIZ.mPushBase.LJIJI();
                    C1271540jC4 c1271540jC4 = this.LIZ;
                    if (c1271540jC4.LLILZIL == EnumC1267980j6K.GAME_LIVE) {
                        zLJIJI = c1271540jC4.LLILLL.LIZ.mPushBase.LJIILJJIL();
                    }
                    C1266350j3h c1266350j3h3 = this.LIZ.LLILZ;
                    if (c1266350j3h3 != null) {
                        enumC1267980j6K = c1266350j3h3.LLLLZ;
                    } else {
                        enumC1267980j6K = null;
                    }
                    if (enumC1267980j6K != EnumC1267980j6K.NORMAL_LIVE) {
                        zLJIJI &= this.LIZ.LLILLL.LIZ.mPushBase.LJJIIJ();
                    }
                    C1266350j3h c1266350j3h4 = this.LIZ.LLILZ;
                    if (c1266350j3h4 != null) {
                        c1266350j3h4.LLLZIIL(-1, i, false, zLJIJI);
                    }
                }
            };
            Context context = this.LLILLL.LIZIZ.LJIIZILJ;
            if (context == null || (handler = this.LLILZLL) == null) {
                return;
            }
            C786410Ut5.LJJZZIII(handler, new ARunnableS28S0400000_20(this, context, jSONObjectLJJJJI, interfaceC1273880jFq, 7));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.C1271610jCB
    public final void release() {
        Handler handler = this.LLILZLL;
        if (handler != null) {
            C786410Ut5.LJJZZIII(handler, new ARunnableS120S0100000_20(this, 182));
        }
        this.LLILZ = null;
        this.LLILZLL = null;
        this.LLJ = null;
        this.LLJI = null;
        this.LLJIJIL = null;
        this.LLIZLLLIL = null;
    }

    @Override // X.C1271610jCB
    public final String LIZLLL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BmfStreamHDNode_");
        sbLIZ.append(this.LL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean LJIIJ(Bundle bundle) {
        if (!this.LLJILJIL) {
            this.LLILLL.LIZ.LJIIIIZZ();
            return true;
        }
        if (!bundle.getBoolean("skip_crop_and_scale", false)) {
            return false;
        }
        this.LLILLL.LIZ.LJIIIIZZ();
        return true;
    }

    public final void LJIIJJI(int i, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("enableVideoStreamHD enable:");
        sbLIZ.append(z);
        sbLIZ.append(" mask:");
        sbLIZ.append(i);
        sbLIZ.append(" mVideoStreamHDFilter:");
        sbLIZ.append(this.LLIZ);
        AVLog.logKibana(6, "BmfStreamHDNode", C2188811AlT.LIZIZ(sbLIZ), null);
        this.LLJJ = z;
        Handler handler = this.LLILZLL;
        if (handler != null) {
            C786410Ut5.LJJZZIII(handler, new ARunnableS3S0111000_20(this, z, i, 2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0230 A[PHI: r2
      0x0230: PHI (r2v7 boolean) = (r2v6 boolean), (r2v6 boolean), (r2v6 boolean), (r2v9 boolean), (r2v9 boolean) binds: [B:58:0x0124, B:60:0x0136, B:62:0x013a, B:113:0x022c, B:72:0x016d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILIIL(com.ss.ttlivestreamer.core.buffer.VideoFrame r28, android.os.Bundle r29) throws java.lang.CloneNotSupportedException {
        /*
            Method dump skipped, instruction units count: 696
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1271540jC4.LJIILIIL(com.ss.ttlivestreamer.core.buffer.VideoFrame, android.os.Bundle):void");
    }

    @Override // X.C1269970j9X, X.InterfaceC1269980j9Y
    public final void onData(VideoFrame videoFrame, Bundle bundle) {
        this.LLILLL.LIZ.LJIIIIZZ();
        if (this.LLILLL.LIZ.mPushBase.LJIIJ()) {
            boolean zLJIIJ = LJIIJ(bundle);
            BmfVideoStreamHDFilterImpl bmfVideoStreamHDFilterImpl = this.LLIZ;
            if (bmfVideoStreamHDFilterImpl != null) {
                bmfVideoStreamHDFilterImpl.canSkipNode(zLJIIJ);
            }
            if (!this.LLJILLL && (!this.LLJJ || zLJIIJ)) {
                bundle.putBoolean("bmf_stream_hd_result", false);
                LJIIIZ(videoFrame, bundle);
                return;
            }
        } else if (LJIIJ(bundle)) {
            bundle.putBoolean("bmf_stream_hd_result", false);
            LJIIIZ(videoFrame, bundle);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BmfStreamHD_");
        sbLIZ.append(this.LL);
        videoFrame.retain(C2188811AlT.LIZIZ(sbLIZ));
        Handler handler = this.LLILZLL;
        if (handler != null) {
            C786410Ut5.LJJZZIII(handler, new ARunnableS53S0300000_20(this, videoFrame, bundle, 34));
        }
    }

    public C1271540jC4(C1267500j5Y c1267500j5Y, C1266350j3h c1266350j3h, EnumC1267980j6K enumC1267980j6K) {
        this.LLILLL = c1267500j5Y;
        this.LLILZ = c1266350j3h;
        this.LLILZIL = enumC1267980j6K;
    }
}
