package X;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.os.Bundle;
import android.view.Surface;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMockAvatarConfigSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttvideoengine.TTVideoEngine;
import fyo.e;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1Cy4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2247581Cy4 extends AbstractC2239111CkP {
    public final Context LIZIZ;
    public final String LIZJ;
    public final long LIZLLL;
    public final String LJ;
    public final AbstractC1273900jFs LJFF;
    public final boolean LJI;
    public final C2247611Cy7 LJII;
    public final LinkMicMockAvatarConfigSetting.Config LJIIIIZZ;
    public RunnableC1276220jJc LJIIIZ;
    public Surface LJIIJ;
    public boolean LJIIJJI;
    public TTVideoEngine LJIIL;
    public final int LJIILIIL;
    public final int LJIILJJIL;

    @Override // X.AbstractC2239111CkP
    public final void LIZIZ() {
        this.LJIIJJI = false;
        TTVideoEngine tTVideoEngine = this.LJIIL;
        if (tTVideoEngine != null) {
            tTVideoEngine.LLIZ(null);
        }
        TTVideoEngine tTVideoEngine2 = this.LJIIL;
        if (tTVideoEngine2 != null) {
            tTVideoEngine2.stop();
        }
        TTVideoEngine tTVideoEngine3 = this.LJIIL;
        if (tTVideoEngine3 != null) {
            tTVideoEngine3.release();
        }
        RunnableC1276220jJc runnableC1276220jJc = this.LJIIIZ;
        if (runnableC1276220jJc != null) {
            Surface surface = this.LJIIJ;
            synchronized (runnableC1276220jJc.LLJJI) {
                try {
                    runnableC1276220jJc.LIZLLL(surface);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        RunnableC1276220jJc runnableC1276220jJc2 = this.LJIIIZ;
        if (runnableC1276220jJc2 != null) {
            runnableC1276220jJc2.LJFF();
        }
        this.LJIIJ = null;
        this.LJIIIZ = null;
        this.LJIIL = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2247581Cy4)) {
            return false;
        }
        C2247581Cy4 c2247581Cy4 = (C2247581Cy4) obj;
        return Intrinsics.LJFF(this.LIZIZ, c2247581Cy4.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c2247581Cy4.LIZJ) && this.LIZLLL == c2247581Cy4.LIZLLL && Intrinsics.LJFF(this.LJ, c2247581Cy4.LJ) && Intrinsics.LJFF(this.LJFF, c2247581Cy4.LJFF) && this.LJI == c2247581Cy4.LJI && Intrinsics.LJFF(this.LJII, c2247581Cy4.LJII);
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LIZIZ.hashCode() * 31) + this.LIZJ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31) + this.LJ.hashCode()) * 31;
        AbstractC1273900jFs abstractC1273900jFs = this.LJFF;
        int iHashCode2 = (((iHashCode + (abstractC1273900jFs == null ? 0 : abstractC1273900jFs.hashCode())) * 31) + C786410Ut5.Z2(this.LJI)) * 31;
        C2247611Cy7 c2247611Cy7 = this.LJII;
        return iHashCode2 + (c2247611Cy7 != null ? c2247611Cy7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VirtualAvatarPlayer(context=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", name=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", avatarId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", fileName=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", liveCore=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", pushStream=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", resolution=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC2239111CkP
    public final void LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("pause running=");
        sbLIZ.append(this.LJIIJJI);
        LJ(C2188811AlT.LIZIZ(sbLIZ));
        if (this.LJIIJJI) {
            TTVideoEngine tTVideoEngine = this.LJIIL;
            if (tTVideoEngine != null) {
                tTVideoEngine.LLIZ(null);
            }
            TTVideoEngine tTVideoEngine2 = this.LJIIL;
            if (tTVideoEngine2 != null) {
                tTVideoEngine2.pause();
            }
            RunnableC1276220jJc runnableC1276220jJc = this.LJIIIZ;
            if (runnableC1276220jJc != null) {
                runnableC1276220jJc.LIZ(0, 0, null);
            }
            this.LJIIJJI = false;
        }
    }

    @Override // X.AbstractC2239111CkP
    public final void LIZLLL() {
        int i;
        int i2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("start running=");
        sbLIZ.append(this.LJIIJJI);
        sbLIZ.append(" pushWidth=");
        C2247611Cy7 c2247611Cy7 = this.LJII;
        sbLIZ.append(c2247611Cy7 != null ? Integer.valueOf(c2247611Cy7.LIZJ) : null);
        sbLIZ.append(" pushHeight=");
        C2247611Cy7 c2247611Cy72 = this.LJII;
        sbLIZ.append(c2247611Cy72 != null ? Integer.valueOf(c2247611Cy72.LIZLLL) : null);
        LJ(C2188811AlT.LIZIZ(sbLIZ));
        if (this.LJIIJJI) {
            return;
        }
        TTVideoEngine tTVideoEngine = this.LJIIL;
        if (tTVideoEngine != null) {
            tTVideoEngine.LLIZ(this.LIZ);
        }
        TTVideoEngine tTVideoEngine2 = this.LJIIL;
        if (tTVideoEngine2 != null) {
            tTVideoEngine2.play();
        }
        TTVideoEngine tTVideoEngine3 = this.LJIIL;
        if (tTVideoEngine3 != null) {
            tTVideoEngine3.start();
        }
        RunnableC1276220jJc runnableC1276220jJc = this.LJIIIZ;
        if (runnableC1276220jJc != null) {
            Surface surface = this.LJIIJ;
            C2247611Cy7 c2247611Cy73 = this.LJII;
            if (c2247611Cy73 != null) {
                i = c2247611Cy73.LIZJ;
                i2 = c2247611Cy73.LIZLLL;
            } else {
                i = this.LJIILIIL;
                i2 = this.LJIILJJIL;
            }
            runnableC1276220jJc.LIZ(i, i2, surface);
        }
        this.LJIIJJI = true;
    }

    public final void LJ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VirtualAvatarPlayer_");
        sbLIZ.append(this.LIZJ);
        C20441214yg.LIZIZ(C2188811AlT.LIZIZ(sbLIZ), str);
    }

    public C2247581Cy4(Context context, C2247631Cy9 c2247631Cy9) {
        RunnableC1276220jJc runnableC1276220jJc;
        final C1269340j8W c1269340j8WLLD;
        int iLJJIIZI;
        int iLJJIIJ;
        int i;
        String strLIZIZ;
        C2247611Cy7 c2247611Cy7 = c2247631Cy9.LJFF;
        boolean z = c2247631Cy9.LIZ;
        String str = c2247631Cy9.LIZLLL;
        long j = c2247631Cy9.LJ;
        String str2 = c2247631Cy9.LIZIZ;
        AbstractC1273900jFs abstractC1273900jFs = c2247631Cy9.LIZJ;
        this.LIZIZ = context;
        this.LIZJ = str;
        this.LIZLLL = j;
        this.LJ = str2;
        this.LJFF = abstractC1273900jFs;
        this.LJI = z;
        this.LJII = c2247611Cy7;
        LinkMicMockAvatarConfigSetting.Config value = LinkMicMockAvatarConfigSetting.INSTANCE.getValue();
        this.LJIIIIZZ = value;
        this.LJIILIIL = 540;
        this.LJIILJJIL = 720;
        int i2 = value.resourceType;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("createPlayer resourceType:");
        sbLIZ.append(i2);
        sbLIZ.append(", fileName:");
        sbLIZ.append(str2);
        LJ(C2188811AlT.LIZIZ(sbLIZ));
        TTVideoEngine tTVideoEngine = new TTVideoEngine(context, 0);
        if (i2 != 0) {
            if (i2 != 1) {
                tTVideoEngine.LJIJI(str2);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("setDirectURL ");
                sbLIZ2.append(str2);
                LJ(C2188811AlT.LIZIZ(sbLIZ2));
            } else {
                try {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(C2112608Pk.LJII(context));
                    sbLIZ3.append("/linkmic_avatar/");
                    sbLIZ3.append(str2);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    strLIZIZ = "";
                }
                tTVideoEngine.LJIJ(strLIZIZ);
                LJ("setLocalURL " + strLIZIZ);
            }
        } else {
            try {
                AssetFileDescriptor assetFileDescriptorOpenFd = context.getAssets().openFd(str2);
                if (assetFileDescriptorOpenFd != null) {
                    tTVideoEngine.LJIIZILJ(assetFileDescriptorOpenFd.getFileDescriptor(), assetFileDescriptorOpenFd.getStartOffset(), assetFileDescriptorOpenFd.getLength());
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("Exception:");
                sbLIZ4.append(e2);
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ4);
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("VirtualAvatarPlayer_");
                sbLIZ5.append(this.LIZJ);
                C20441214yg.LJ(C2188811AlT.LIZIZ(sbLIZ5), strLIZIZ2);
            }
        }
        tTVideoEngine.LJ(true);
        tTVideoEngine.LIZJ(199, this.LJIIIIZZ.uesTexture);
        tTVideoEngine.LIZJ(7, 1);
        tTVideoEngine.LIZJ(205, this.LJIIIIZZ.fps);
        tTVideoEngine.LIZJ(336, this.LJIIIIZZ.fps);
        tTVideoEngine.setLooping(this.LJIIIIZZ.loop);
        this.LJIIL = tTVideoEngine;
        tTVideoEngine.LLJILLL(new InterfaceC1469360oL8() { // from class: X.1Cy3
            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LIZIZ(TTVideoEngine tTVideoEngine2) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LIZJ(TTVideoEngine tTVideoEngine2, int i3) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJFF(int i3, EnumC2281151EQn enumC2281151EQn) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJIIIIZZ(TTVideoEngine tTVideoEngine2) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJIIIZ(TTVideoEngine tTVideoEngine2) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJIIL(TTVideoEngine tTVideoEngine2, int i3) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJIJ(TTVideoEngine tTVideoEngine2, int i3) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJIJI(TTVideoEngine tTVideoEngine2, int i3) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJIJJ(int i3) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJIJJLI(int i3) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJIL(TTVideoEngine tTVideoEngine2, int i3) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJJII(int i3, int i4) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJJIIJ(int i3, int i4) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJJIJ(Map map) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJJJJJ(TTVideoEngine tTVideoEngine2, int i3) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJJJJJL(TTVideoEngine tTVideoEngine2, int i3, long j2, long j3, Map map) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJJJJLL(TTVideoEngine tTVideoEngine2) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJJJLIIL(int i3, int i4, int i5) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJJJLZIJ(TTVideoEngine tTVideoEngine2, int i3, C1467860oIi c1467860oIi) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJJL(e eVar, String str3) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJJLIIIIJ(int i3) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJJLIIIJJIZ(TTVideoEngine tTVideoEngine2) {
            }

            @Override // X.InterfaceC1469360oL8
            public final void LJ(TTVideoEngine tTVideoEngine2) {
                this.LL.LJ("onRenderStart");
            }

            @Override // X.InterfaceC1469360oL8
            public final void LJI(e eVar) {
                String str3;
                String str4;
                C2247581Cy4 c2247581Cy4 = this.LL;
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append("onError ");
                sbLIZ6.append(eVar);
                String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ6);
                c2247581Cy4.getClass();
                StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                sbLIZ7.append("VirtualAvatarPlayer_");
                sbLIZ7.append(c2247581Cy4.LIZJ);
                C20441214yg.LJ(C2188811AlT.LIZIZ(sbLIZ7), strLIZIZ3);
                String str5 = "";
                int i3 = 0;
                if (Intrinsics.LJFF(this.LL.LIZJ, "speak")) {
                    C2247581Cy4 c2247581Cy42 = this.LL;
                    long j2 = c2247581Cy42.LIZLLL;
                    String str6 = c2247581Cy42.LJ;
                    if (eVar != null) {
                        i3 = eVar.LIZ;
                    }
                    if (eVar != null && (str4 = eVar.LIZLLL) != null) {
                        str5 = str4;
                    }
                    AbstractC2239111CkP.LIZJ(i3, str6, "", j2, str5);
                    return;
                }
                C2247581Cy4 c2247581Cy43 = this.LL;
                long j3 = c2247581Cy43.LIZLLL;
                String str7 = c2247581Cy43.LJ;
                if (eVar != null) {
                    i3 = eVar.LIZ;
                }
                if (eVar != null && (str3 = eVar.LIZLLL) != null) {
                    str5 = str3;
                }
                AbstractC2239111CkP.LIZJ(i3, "", str7, j3, str5);
            }

            @Override // X.InterfaceC1469360oL8
            public final void LJIILIIL(TTVideoEngine tTVideoEngine2) {
                this.LL.LJ("onPrepared");
            }

            @Override // X.InterfaceC1469360oL8
            public final void LJIILL(TTVideoEngine tTVideoEngine2) {
                this.LL.LJ("onCompletion");
            }

            @Override // X.InterfaceC1469360oL8
            public final void LJIIJJI(TTVideoEngine tTVideoEngine2, int i3, int i4) {
                C2247581Cy4 c2247581Cy4 = this.LL;
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append("onVideoSizeChanged width=");
                sbLIZ6.append(i3);
                sbLIZ6.append(" height=");
                sbLIZ6.append(i4);
                c2247581Cy4.LJ(C2188811AlT.LIZIZ(sbLIZ6));
            }
        });
        if (this.LJI) {
            AbstractC1273900jFs abstractC1273900jFs2 = this.LJFF;
            if (abstractC1273900jFs2 != null && (c1269340j8WLLD = abstractC1273900jFs2.LLD()) != null) {
                Context context2 = c1269340j8WLLD.LJLJI.LJIIZILJ;
                C2247611Cy7 c2247611Cy72 = this.LJII;
                if (c2247611Cy72 != null) {
                    iLJJIIZI = c2247611Cy72.LIZJ;
                } else {
                    iLJJIIZI = c1269340j8WLLD.LJJIIZI();
                }
                C2247611Cy7 c2247611Cy73 = this.LJII;
                if (c2247611Cy73 != null) {
                    iLJJIIJ = c2247611Cy73.LIZLLL;
                } else {
                    iLJJIIJ = c1269340j8WLLD.LJJIIJ();
                }
                C2247611Cy7 c2247611Cy74 = this.LJII;
                if (c2247611Cy74 != null) {
                    i = c2247611Cy74.LJ;
                } else {
                    i = this.LJIIIIZZ.fps;
                }
                runnableC1276220jJc = new RunnableC1276220jJc(context2, iLJJIIZI, iLJJIIJ, i, new InterfaceC1276250jJf() { // from class: X.0jK8
                    @Override // X.InterfaceC1276250jJf
                    public final void LIZ(int i3, int i4, int i5, long j2) {
                        Integer numValueOf;
                        C1269340j8W c1269340j8W;
                        C2247581Cy4 c2247581Cy4 = this.LIZ;
                        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                        sbLIZ6.append("pushVideoFrame videoCaptureDevice=");
                        C1269340j8W c1269340j8W2 = c1269340j8WLLD;
                        if (c1269340j8W2 != null) {
                            numValueOf = Integer.valueOf(c1269340j8W2.LJJII());
                        } else {
                            numValueOf = null;
                        }
                        sbLIZ6.append(numValueOf);
                        sbLIZ6.append(" tex2D:");
                        sbLIZ6.append(i3);
                        sbLIZ6.append(" timestamp:");
                        sbLIZ6.append(j2);
                        sbLIZ6.append(' ');
                        sbLIZ6.append(i4);
                        sbLIZ6.append('x');
                        sbLIZ6.append(i5);
                        sbLIZ6.append(" running:");
                        sbLIZ6.append(this.LIZ.LJIIJJI);
                        sbLIZ6.append(" liveCore:");
                        sbLIZ6.append(this.LIZ.LJFF);
                        c2247581Cy4.LJ(C2188811AlT.LIZIZ(sbLIZ6));
                        if (this.LIZ.LJIIJJI && (c1269340j8W = c1269340j8WLLD) != null && c1269340j8W.LJJII() == 4) {
                            Bundle bundle = new Bundle();
                            bundle.putBoolean("isAvaterPush", true);
                            AbstractC1273900jFs abstractC1273900jFs3 = this.LIZ.LJFF;
                            if (abstractC1273900jFs3 != null) {
                                abstractC1273900jFs3.LJJJJ(i3, false, i4, i5, 0, null, j2, bundle);
                            }
                        }
                    }
                });
            } else {
                runnableC1276220jJc = null;
            }
            this.LJIIIZ = runnableC1276220jJc;
            this.LJIIJ = runnableC1276220jJc != null ? runnableC1276220jJc.LJ() : null;
        }
    }
}
