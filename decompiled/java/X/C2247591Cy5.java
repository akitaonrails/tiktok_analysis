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

/* JADX INFO: renamed from: X.1Cy5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2247591Cy5 extends AbstractC2239111CkP {
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
    public volatile boolean LJIIJJI;
    public TTVideoEngine LJIIL;

    @Override // X.AbstractC2239111CkP
    public final void LIZIZ() {
        this.LJIIJJI = false;
        RunnableC1276220jJc runnableC1276220jJc = this.LJIIIZ;
        if (runnableC1276220jJc != null) {
            runnableC1276220jJc.LIZ(0, 0, null);
        }
        TTVideoEngine tTVideoEngine = this.LJIIL;
        if (tTVideoEngine != null) {
            tTVideoEngine.setSurface(null);
        }
        TTVideoEngine tTVideoEngine2 = this.LJIIL;
        if (tTVideoEngine2 != null) {
            tTVideoEngine2.stop();
        }
        TTVideoEngine tTVideoEngine3 = this.LJIIL;
        if (tTVideoEngine3 != null) {
            tTVideoEngine3.release();
        }
        RunnableC1276220jJc runnableC1276220jJc2 = this.LJIIIZ;
        if (runnableC1276220jJc2 != null) {
            Surface surface = this.LJIIJ;
            synchronized (runnableC1276220jJc2.LLJJI) {
                try {
                    runnableC1276220jJc2.LIZLLL(surface);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        RunnableC1276220jJc runnableC1276220jJc3 = this.LJIIIZ;
        if (runnableC1276220jJc3 != null) {
            runnableC1276220jJc3.LJFF();
        }
        this.LJIIJ = null;
        this.LJIIIZ = null;
        this.LJIIL = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2247591Cy5)) {
            return false;
        }
        C2247591Cy5 c2247591Cy5 = (C2247591Cy5) obj;
        return Intrinsics.LJFF(this.LIZIZ, c2247591Cy5.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c2247591Cy5.LIZJ) && this.LIZLLL == c2247591Cy5.LIZLLL && Intrinsics.LJFF(this.LJ, c2247591Cy5.LJ) && Intrinsics.LJFF(this.LJFF, c2247591Cy5.LJFF) && this.LJI == c2247591Cy5.LJI && Intrinsics.LJFF(this.LJII, c2247591Cy5.LJII);
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
        sbLIZ.append("VirtualAvatarInterPlayer(context=");
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
    public final void LIZLLL() {
        LinkMicMockAvatarConfigSetting.Config config = this.LJIIIIZZ;
        int i = config.surfaceWidth;
        if (i <= 0) {
            C2247611Cy7 c2247611Cy7 = this.LJII;
            i = c2247611Cy7 != null ? c2247611Cy7.LIZ : 540;
        }
        int i2 = config.surfaceHeight;
        if (i2 <= 0) {
            C2247611Cy7 c2247611Cy72 = this.LJII;
            i2 = c2247611Cy72 != null ? c2247611Cy72.LIZIZ : 720;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("start running=");
        sbLIZ.append(this.LJIIJJI);
        sbLIZ.append(" surfaceWidth=");
        sbLIZ.append(i);
        sbLIZ.append(" surfaceHeight=");
        sbLIZ.append(i2);
        sbLIZ.append(" extraSurface=");
        Surface surface = this.LJIIJ;
        sbLIZ.append(surface != null ? Boolean.valueOf(surface.isValid()) : null);
        LJ(C2188811AlT.LIZIZ(sbLIZ));
        if (this.LJIIJJI) {
            return;
        }
        RunnableC1276220jJc runnableC1276220jJc = this.LJIIIZ;
        if (runnableC1276220jJc != null) {
            runnableC1276220jJc.LIZ(i, i2, this.LJIIJ);
        }
        TTVideoEngine tTVideoEngine = this.LJIIL;
        if (tTVideoEngine != null) {
            tTVideoEngine.setSurface(this.LJIIJ);
        }
        TTVideoEngine tTVideoEngine2 = this.LJIIL;
        if (tTVideoEngine2 != null) {
            tTVideoEngine2.play();
        }
        this.LJIIJJI = true;
    }

    @Override // X.AbstractC2239111CkP
    public final void LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("pause running=");
        sbLIZ.append(this.LJIIJJI);
        LJ(C2188811AlT.LIZIZ(sbLIZ));
        if (this.LJIIJJI) {
            RunnableC1276220jJc runnableC1276220jJc = this.LJIIIZ;
            if (runnableC1276220jJc != null) {
                runnableC1276220jJc.LIZ(0, 0, null);
            }
            TTVideoEngine tTVideoEngine = this.LJIIL;
            if (tTVideoEngine != null) {
                tTVideoEngine.setSurface(null);
            }
            TTVideoEngine tTVideoEngine2 = this.LJIIL;
            if (tTVideoEngine2 != null) {
                tTVideoEngine2.pause();
            }
            this.LJIIJJI = false;
        }
    }

    public final void LJ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VirtualAvatarInterPlayer_");
        sbLIZ.append(this.LIZJ);
        C20441214yg.LIZIZ(C2188811AlT.LIZIZ(sbLIZ), str);
    }

    public C2247591Cy5(Context context, C2247621Cy8 c2247621Cy8) {
        Integer numValueOf;
        String strLIZIZ;
        RunnableC1276220jJc runnableC1276220jJc;
        Surface surfaceLJ;
        final C1269340j8W c1269340j8WLLD;
        int i;
        C2247611Cy7 c2247611Cy7 = c2247621Cy8.LJFF;
        boolean z = c2247621Cy8.LIZ;
        String str = c2247621Cy8.LIZLLL;
        long j = c2247621Cy8.LJ;
        String str2 = c2247621Cy8.LIZIZ;
        AbstractC1273900jFs abstractC1273900jFs = c2247621Cy8.LIZJ;
        this.LIZIZ = context;
        this.LIZJ = str;
        this.LIZLLL = j;
        this.LJ = str2;
        this.LJFF = abstractC1273900jFs;
        this.LJI = z;
        this.LJII = c2247611Cy7;
        LinkMicMockAvatarConfigSetting.Config value = LinkMicMockAvatarConfigSetting.INSTANCE.getValue();
        this.LJIIIIZZ = value;
        if (z) {
            if (abstractC1273900jFs != null && (c1269340j8WLLD = abstractC1273900jFs.LLD()) != null) {
                int i2 = value.outputWidth;
                if (i2 <= 0) {
                    if (c2247611Cy7 != null) {
                        i2 = c2247611Cy7.LIZJ;
                    } else {
                        i2 = 540;
                    }
                }
                int i3 = value.outputHeight;
                if (i3 <= 0) {
                    if (c2247611Cy7 != null) {
                        i3 = c2247611Cy7.LIZLLL;
                    } else {
                        i3 = 1024;
                    }
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("createShortVideoPushManager ");
                sbLIZ.append(i2);
                sbLIZ.append('x');
                sbLIZ.append(i3);
                LJ(C2188811AlT.LIZIZ(sbLIZ));
                Context context2 = c1269340j8WLLD.LJLJI.LJIIZILJ;
                if (c2247611Cy7 != null) {
                    i = c2247611Cy7.LJ;
                } else {
                    i = value.fps;
                }
                runnableC1276220jJc = new RunnableC1276220jJc(context2, i2, i3, i, new InterfaceC1276250jJf() { // from class: X.0jK7
                    @Override // X.InterfaceC1276250jJf
                    public final void LIZ(int i4, int i5, int i6, long j2) {
                        if (this.LIZ.LJIIJJI && c1269340j8WLLD.LJJII() == 4) {
                            Bundle bundle = new Bundle();
                            bundle.putBoolean("isAvaterPush", true);
                            this.LIZ.LJFF.LJJJJ(i4, false, i5, i6, 0, null, j2, bundle);
                        }
                    }
                });
            } else {
                runnableC1276220jJc = null;
            }
            this.LJIIIZ = runnableC1276220jJc;
            if (runnableC1276220jJc != null) {
                surfaceLJ = runnableC1276220jJc.LJ();
            } else {
                surfaceLJ = null;
            }
            this.LJIIJ = surfaceLJ;
        }
        int i4 = value.resourceType;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("createPlayer resourceType:");
        sbLIZ2.append(i4);
        sbLIZ2.append(", fileName:");
        sbLIZ2.append(str2);
        sbLIZ2.append(" width:");
        if (c2247611Cy7 != null) {
            numValueOf = Integer.valueOf(c2247611Cy7.LIZJ);
        } else {
            numValueOf = null;
        }
        sbLIZ2.append(numValueOf);
        sbLIZ2.append(" height:");
        sbLIZ2.append(c2247611Cy7 != null ? Integer.valueOf(c2247611Cy7.LIZLLL) : null);
        LJ(C2188811AlT.LIZIZ(sbLIZ2));
        TTVideoEngine tTVideoEngine = new TTVideoEngine(context, 0);
        if (i4 != 0) {
            if (i4 != 1) {
                tTVideoEngine.LJIJI(str2);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("setDirectURL ");
                sbLIZ3.append(str2);
                LJ(C2188811AlT.LIZIZ(sbLIZ3));
            } else {
                try {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append(C2112608Pk.LJII(context));
                    sbLIZ4.append("/linkmic_avatar/");
                    sbLIZ4.append(str2);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
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
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("Exception:");
                sbLIZ5.append(e2);
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ5);
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append("VirtualAvatarInterPlayer_");
                sbLIZ6.append(this.LIZJ);
                C20441214yg.LJ(C2188811AlT.LIZIZ(sbLIZ6), strLIZIZ2);
            }
        }
        tTVideoEngine.LJ(true);
        tTVideoEngine.LIZJ(199, this.LJIIIIZZ.uesTexture);
        tTVideoEngine.LIZJ(4, this.LJIIIIZZ.fillLayout);
        tTVideoEngine.LIZJ(7, 1);
        tTVideoEngine.LIZJ(205, this.LJIIIIZZ.fps);
        tTVideoEngine.LIZJ(336, this.LJIIIIZZ.fps);
        tTVideoEngine.setLooping(this.LJIIIIZZ.loop);
        this.LJIIL = tTVideoEngine;
        if (this.LJIIIIZZ.effect) {
            Bundle bundle = new Bundle();
            bundle.putInt("action", 19);
            bundle.putInt("effect_type", 11);
            bundle.putFloat("width", this.LJIIIIZZ.cropWidth);
            bundle.putFloat("height", this.LJIIIIZZ.cropHeight);
            bundle.putFloat("x", this.LJIIIIZZ.cropX);
            bundle.putFloat("y", this.LJIIIIZZ.cropY);
            bundle.putInt("int_value", 1);
            bundle.putInt("use_effect", 1);
            if (this.LJIIIIZZ.ratio >= 0.0f) {
                Bundle bundle2 = new Bundle();
                bundle2.putInt("action", 27);
                bundle2.putInt("effect_type", 11);
                bundle2.putFloat("float_value", this.LJIIIIZZ.ratio);
            }
        }
        TTVideoEngine tTVideoEngine2 = this.LJIIL;
        if (tTVideoEngine2 != null) {
            tTVideoEngine2.LLJILLL(new InterfaceC1469360oL8() { // from class: X.1Cy2
                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LIZIZ(TTVideoEngine tTVideoEngine3) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LIZJ(TTVideoEngine tTVideoEngine3, int i5) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJFF(int i5, EnumC2281151EQn enumC2281151EQn) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJIIIIZZ(TTVideoEngine tTVideoEngine3) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJIIIZ(TTVideoEngine tTVideoEngine3) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJIIL(TTVideoEngine tTVideoEngine3, int i5) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJIJ(TTVideoEngine tTVideoEngine3, int i5) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJIJI(TTVideoEngine tTVideoEngine3, int i5) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJIJJ(int i5) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJIJJLI(int i5) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJIL(TTVideoEngine tTVideoEngine3, int i5) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJJII(int i5, int i6) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJJIIJ(int i5, int i6) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJJIJ(Map map) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJJJJJ(TTVideoEngine tTVideoEngine3, int i5) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJJJJJL(TTVideoEngine tTVideoEngine3, int i5, long j2, long j3, Map map) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJJJJLL(TTVideoEngine tTVideoEngine3) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJJJLIIL(int i5, int i6, int i7) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJJJLZIJ(TTVideoEngine tTVideoEngine3, int i5, C1467860oIi c1467860oIi) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJJL(e eVar, String str3) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJJLIIIIJ(int i5) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJJLIIIJJIZ(TTVideoEngine tTVideoEngine3) {
                }

                @Override // X.InterfaceC1469360oL8
                public final void LJ(TTVideoEngine tTVideoEngine3) {
                    this.LL.LJ("onRenderStart");
                }

                @Override // X.InterfaceC1469360oL8
                public final void LJI(e eVar) {
                    String str3;
                    String str4;
                    C2247591Cy5 c2247591Cy5 = this.LL;
                    StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                    sbLIZ7.append("onError ");
                    sbLIZ7.append(eVar);
                    String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ7);
                    c2247591Cy5.getClass();
                    StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                    sbLIZ8.append("VirtualAvatarInterPlayer_");
                    sbLIZ8.append(c2247591Cy5.LIZJ);
                    C20441214yg.LJ(C2188811AlT.LIZIZ(sbLIZ8), strLIZIZ3);
                    String str5 = "";
                    int i5 = 0;
                    if (Intrinsics.LJFF(this.LL.LIZJ, "speak")) {
                        C2247591Cy5 c2247591Cy52 = this.LL;
                        long j2 = c2247591Cy52.LIZLLL;
                        String str6 = c2247591Cy52.LJ;
                        if (eVar != null) {
                            i5 = eVar.LIZ;
                        }
                        if (eVar != null && (str4 = eVar.LIZLLL) != null) {
                            str5 = str4;
                        }
                        AbstractC2239111CkP.LIZJ(i5, str6, "", j2, str5);
                        return;
                    }
                    C2247591Cy5 c2247591Cy53 = this.LL;
                    long j3 = c2247591Cy53.LIZLLL;
                    String str7 = c2247591Cy53.LJ;
                    if (eVar != null) {
                        i5 = eVar.LIZ;
                    }
                    if (eVar != null && (str3 = eVar.LIZLLL) != null) {
                        str5 = str3;
                    }
                    AbstractC2239111CkP.LIZJ(i5, "", str7, j3, str5);
                }

                @Override // X.InterfaceC1469360oL8
                public final void LJIILIIL(TTVideoEngine tTVideoEngine3) {
                    this.LL.LJ("onPrepared");
                }

                @Override // X.InterfaceC1469360oL8
                public final void LJIILL(TTVideoEngine tTVideoEngine3) {
                    this.LL.LJ("onCompletion");
                }

                @Override // X.InterfaceC1469360oL8
                public final void LJIIJJI(TTVideoEngine tTVideoEngine3, int i5, int i6) {
                    C2247591Cy5 c2247591Cy5 = this.LL;
                    StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                    sbLIZ7.append("onVideoSizeChanged width=");
                    sbLIZ7.append(i5);
                    sbLIZ7.append(" height=");
                    sbLIZ7.append(i6);
                    c2247591Cy5.LJ(C2188811AlT.LIZIZ(sbLIZ7));
                }
            });
        }
    }
}
