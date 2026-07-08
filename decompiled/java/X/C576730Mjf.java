package X;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataReactiveStreams;
import com.bytedance.ies.nle.editor_jni.NLEMediaABConfig;
import com.bytedance.ies.nle.editor_jni.NLEMediaConfig;
import com.bytedance.ies.nle.editor_jni.NLEVEGlobalConfig;
import com.bytedance.ies.nle.editor_jni.NLEVEUserConfig;
import com.bytedance.ies.nle.editor_jni.NLEVideoEncodeSettings;
import com.ss.android.ugc.aweme.mediachoose.helper.LivePhotoInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.property.bytebench.CameraLayoutHwDecodeConfig;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.vesdk.VEException;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.VEUtils;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import com.ss.android.vesdk.runtime.VERuntime;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS374S0200000_8;
import kotlin.jvm.internal.AwS587S0100000_8;

/* JADX INFO: renamed from: X.0Mjf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C576730Mjf {
    public static final boolean LJI() {
        return ((Boolean) C0BXM.LIZ.getValue()).booleanValue() && C578540Mma.LIZ().supportEffect && ((Boolean) C266950AdB.LIZ.getValue()).booleanValue();
    }

    public static final boolean LIZJ(List<String> list) {
        if (((ArrayList) list).isEmpty()) {
            return false;
        }
        for (String str : (ArrayList) list) {
            C2356009La.LIZ.getClass();
            VEUtils.VEVideoFileInfo vEVideoFileInfoLIZ = C2356009La.LIZ(str);
            if (vEVideoFileInfoLIZ != null && vEVideoFileInfoLIZ.bHDR) {
                return true;
            }
        }
        return false;
    }

    public static final NLEMediaConfig LIZLLL(boolean z) {
        C2189111Alx c2189111Alx;
        int pageModeCodecConfig;
        if (z) {
            CameraLayoutHwDecodeConfig cameraLayoutHwDecodeConfig = (CameraLayoutHwDecodeConfig) C578540Mma.LIZJ.getValue();
            C2189111Alx c2189111Alx2 = null;
            if (cameraLayoutHwDecodeConfig != null) {
                c2189111Alx = new C2189111Alx(cameraLayoutHwDecodeConfig.pageMode, cameraLayoutHwDecodeConfig.higherFpsThreshold, cameraLayoutHwDecodeConfig.lowerFpsMinSideThreshold, cameraLayoutHwDecodeConfig.higherFpsMinSideThreshold);
            } else {
                c2189111Alx = null;
            }
            CameraLayoutHwDecodeConfig cameraLayoutHwDecodeConfig2 = (CameraLayoutHwDecodeConfig) C578540Mma.LIZLLL.getValue();
            if (cameraLayoutHwDecodeConfig2 != null) {
                c2189111Alx2 = new C2189111Alx(cameraLayoutHwDecodeConfig2.pageMode, cameraLayoutHwDecodeConfig2.higherFpsThreshold, cameraLayoutHwDecodeConfig2.lowerFpsMinSideThreshold, cameraLayoutHwDecodeConfig2.higherFpsMinSideThreshold);
            }
            if (c2189111Alx != null && c2189111Alx2 != null && (pageModeCodecConfig = VERuntime.getInstance().setPageModeCodecConfig(c2189111Alx, c2189111Alx2)) == -108) {
                throw new VEException(pageModeCodecConfig, "please set VEEnv or VEEnv#init");
            }
        }
        NLEMediaConfig nLEMediaConfig = new NLEMediaConfig();
        nLEMediaConfig.setForCanvasMode(true);
        nLEMediaConfig.setNleMediaAbConfig(new NLEMediaABConfig());
        NLEVEGlobalConfig nLEVEGlobalConfig = new NLEVEGlobalConfig();
        nLEVEGlobalConfig.addConfig("EnableEditorFpsLog", true);
        nLEVEGlobalConfig.addConfig("ve_enable_render_encode_resolution_align4", true);
        nLEMediaConfig.setNleVEGlobalConfig(nLEVEGlobalConfig);
        if (z) {
            NLEVEUserConfig nLEVEUserConfig = new NLEVEUserConfig();
            nLEVEUserConfig.addConfig("ve_preview_optimized_lanczos_setting", "");
            nLEMediaConfig.setNleVEUserConfig(nLEVEUserConfig);
        }
        return nLEMediaConfig;
    }

    public static final Pair<String, String> LJ(ShortVideoContext shortVideoContext) {
        String strLIZLLL = C2298208zU.LIZLLL(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), shortVideoContext.creativeInfo, EnumC20228214Cy.CONCAT, null, false, 12);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strLIZLLL);
        sbLIZ.append(C1449640npK.LIZ("--concat-v"));
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(strLIZLLL);
        sbLIZ2.append(C1449640npK.LIZ("--concat-a"));
        return new Pair<>(strLIZIZ, C2188811AlT.LIZIZ(sbLIZ2));
    }

    public static final boolean LJII(List<? extends MediaModel> list) {
        boolean z = list instanceof Collection;
        if (!z || !list.isEmpty()) {
            Iterator<? extends MediaModel> it2 = list.iterator();
            int i = 0;
            while (it2.hasNext()) {
                if (it2.next().LJIIJJI() && (i = i + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
            if (i > 0) {
                if (z && list.isEmpty()) {
                    return true;
                }
                int i2 = 0;
                for (MediaModel mediaModel : list) {
                    if (!mediaModel.LJIIJJI() && !mediaModel.LJIIJ() && (i2 = i2 + 1) < 0) {
                        C1697810uHb.LJIJ();
                        throw null;
                    }
                }
                if (i2 == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final int LJIIIIZZ(MediaModel mediaModel) {
        long videoDuration;
        LivePhotoInfo livePhotoInfo = mediaModel.livePhotoInfo;
        if (mediaModel.LJIIJJI() && livePhotoInfo != null) {
            C2356009La c2356009La = C2356009La.LIZ;
            String videoPath = livePhotoInfo.getVideoPath();
            c2356009La.getClass();
            VEUtils.VEVideoFileInfo vEVideoFileInfoLIZ = C2356009La.LIZ(videoPath);
            if (vEVideoFileInfoLIZ != null) {
                return vEVideoFileInfoLIZ.duration;
            }
            videoDuration = livePhotoInfo.getVideoDuration();
        } else {
            if (mediaModel.LJIIJ()) {
                return 0;
            }
            videoDuration = mediaModel.duration;
        }
        return (int) videoDuration;
    }

    public static final NLEVideoEncodeSettings LJIIL(C0LDO c0ldo) {
        VEVideoEncodeSettings.COMPILE_TYPE compile_type;
        C1780100wQK c1780100wQK = new C1780100wQK(2);
        c1780100wQK.LIZIZ.isSupportHWEncoder = true;
        String strLIZIZ = c0ldo.LIZIZ();
        VEVideoEncodeSettings vEVideoEncodeSettings = c1780100wQK.LIZIZ;
        vEVideoEncodeSettings.externalSettingsJsonStr = strLIZIZ;
        if (c0ldo instanceof C0LDL) {
            compile_type = VEVideoEncodeSettings.COMPILE_TYPE.COMPILE_TYPE_JPEG;
        } else {
            compile_type = VEVideoEncodeSettings.COMPILE_TYPE.COMPILE_TYPE_MP4;
        }
        vEVideoEncodeSettings.compileType = compile_type;
        c1780100wQK.LJIIJ(c0ldo.LIZLLL(), c0ldo.LIZJ());
        NLEVideoEncodeSettings nLEVideoEncodeSettingsLJ = C1776260wK8.LJ(c1780100wQK.LIZ());
        nLEVideoEncodeSettingsLJ.setEnableUploadingWhileCompile(false);
        if (c0ldo.LIZ()) {
            nLEVideoEncodeSettingsLJ.setColorSpace(0);
        }
        return nLEVideoEncodeSettingsLJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LJFF(com.ss.android.ugc.aweme.mediachoose.helper.MediaModel r2, com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r3) {
        /*
            com.ss.android.ugc.aweme.creative.model.CreativeInfo r1 = r3.creativeInfo
            boolean r0 = r2.LJIIJJI()
            if (r0 == 0) goto L1a
            X.0KmK r0 = X.C527420KmK.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.mediachoose.helper.MediaModel r0 = X.C527420KmK.LIZIZ(r1, r2)
            if (r0 == 0) goto L1a
            java.lang.String r0 = r0.LJFF()
            if (r0 == 0) goto L1a
        L19:
            return r0
        L1a:
            java.lang.String r0 = r2.LJFF()
            boolean r0 = X.C2471909mP.LJJIIZI(r0)
            if (r0 == 0) goto L69
            android.app.Application r1 = X.C1BWL.LIZ()
            java.lang.String r0 = r2.LJFF()
            android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r0)
            java.lang.String r0 = X.C09N5.LIZ(r1, r0)
        L34:
            boolean r1 = X.C570490MZb.LJ(r0)
            if (r1 != 0) goto L19
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.io.File r0 = X.C786410Ut5.W3()
            java.lang.String r0 = r0.getPath()
            r1.append(r0)
            java.lang.String r0 = java.io.File.separator
            r1.append(r0)
            java.lang.String r0 = r2.relativePath
            r1.append(r0)
            java.lang.String r0 = r2.fileName
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            boolean r1 = X.C570490MZb.LJ(r0)
            if (r1 != 0) goto L19
            java.lang.String r0 = r2.relativePath
            if (r0 != 0) goto L19
            java.lang.String r0 = ""
            return r0
        L69:
            java.lang.String r0 = r2.LJFF()
            goto L34
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C576730Mjf.LJFF(com.ss.android.ugc.aweme.mediachoose.helper.MediaModel, com.ss.android.ugc.aweme.shortvideo.ShortVideoContext):java.lang.String");
    }

    public static final void LJIIIZ(String str, String str2) {
        C201967140v c201967140v = C201967140v.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('[');
        sbLIZ.append(str);
        sbLIZ.append("] ");
        sbLIZ.append(str2);
        C201955140j.LIZLLL(c201967140v, "CameraLayout", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void LJIIJ(String str, String str2) {
        C201967140v c201967140v = C201967140v.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('[');
        sbLIZ.append(str);
        sbLIZ.append("] ");
        sbLIZ.append(str2);
        C201955140j.LJIIIIZZ(c201967140v, "CameraLayout", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void LJIIJJI(String str, String str2) {
        C201967140v c201967140v = C201967140v.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('[');
        sbLIZ.append(str);
        sbLIZ.append("] ");
        sbLIZ.append(str2);
        C201955140j.LJIILL(c201967140v, "CameraLayout", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final C11LZ LJIILIIL(LiveData liveData, LifecycleOwner lifecycleOwner) {
        return C11NZ.LJJJJJ(LiveDataReactiveStreams.toPublisher(lifecycleOwner, liveData));
    }

    public static final VESize LIZIZ(VESize vESize, int i, int i2) {
        int i3;
        int i4;
        if (i2 > 0 && i > 0 && (i3 = vESize.width) > 0 && (i4 = vESize.height) > 0) {
            float f = i3;
            float f2 = i4;
            float f3 = i / i2;
            if (f / f2 > f3) {
                return new VESize((int) (f2 * f3), vESize.height);
            }
            return new VESize(vESize.width, (int) (f / f3));
        }
        return vESize;
    }

    public static final void LIZ(C539960LFq c539960LFq, C19A3 c19a3, int i, EnumC1642750sqn enumC1642750sqn, C385670FAf c385670FAf) {
        C0LEK c0lek = c539960LFq.LIZ;
        C559610Lx9 c559610Lx9 = new C559610Lx9(c0lek, "camera_layout");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("register component ");
        sbLIZ.append(C577030Mk9.class.getName());
        sbLIZ.append(" api ");
        sbLIZ.append(InterfaceC577380Mki.class.getName());
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        c0lek.LIZ("camera_layout", enumC1642750sqn, c385670FAf, InterfaceC577380Mki.class, C577030Mk9.class, new AwS587S0100000_8(new C0ET4(), c559610Lx9, 483));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("register component ");
        sbLIZ2.append(C579330Mnr.class.getName());
        sbLIZ2.append(" api ");
        sbLIZ2.append(InterfaceC576770Mjj.class.getName());
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
        c0lek.LIZ("camera_layout", enumC1642750sqn, c385670FAf, InterfaceC576770Mjj.class, C579330Mnr.class, new AwS587S0100000_8(new C0ET4(), c559610Lx9, 485));
        EnumC1642750sqn enumC1642750sqn2 = EnumC1642750sqn.LAZY;
        EnumC371580EhY enumC371580EhY = EnumC371580EhY.HIDE;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("register slotUIComponent ");
        sbLIZ3.append(C577450Mkp.class.getName());
        sbLIZ3.append(" api ");
        sbLIZ3.append(InterfaceC577060MkC.class.getName());
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ3));
        c0lek.LIZIZ("camera_layout", enumC1642750sqn2, null, InterfaceC577060MkC.class, C577450Mkp.class, C577530Mkx.class, R.id.sz5, enumC371580EhY, new AwS374S0200000_8(new C0ET4(), c559610Lx9, c19a3, 134));
        EnumC371580EhY enumC371580EhY2 = EnumC371580EhY.SHOW;
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("register slotUIComponent ");
        sbLIZ4.append(C576610MjT.class.getName());
        sbLIZ4.append(" api ");
        sbLIZ4.append(InterfaceC576680Mja.class.getName());
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ4));
        c0lek.LIZIZ("camera_layout", enumC1642750sqn2, null, InterfaceC576680Mja.class, C576610MjT.class, C576420MjA.class, i, enumC371580EhY2, new AwS374S0200000_8(new C0ET4(), c559610Lx9, c19a3, 135));
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("register slotUIComponent ");
        sbLIZ5.append(C576760Mji.class.getName());
        sbLIZ5.append(" api ");
        sbLIZ5.append(InterfaceC576660MjY.class.getName());
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ5));
        c0lek.LIZIZ("camera_layout", enumC1642750sqn2, null, InterfaceC576660MjY.class, C576760Mji.class, C0L2V.class, i, enumC371580EhY2, new AwS374S0200000_8(new C0ET4(), c559610Lx9, c19a3, 127));
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append("register component ");
        sbLIZ6.append(C577000Mk6.class.getName());
        sbLIZ6.append(" api ");
        sbLIZ6.append(InterfaceC576870Mjt.class.getName());
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ6));
        c0lek.LIZ("camera_layout", enumC1642750sqn2, null, InterfaceC576870Mjt.class, C577000Mk6.class, new AwS587S0100000_8(new C0ET4(), c559610Lx9, 487));
        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
        sbLIZ7.append("register component ");
        sbLIZ7.append(C539980LFs.class.getName());
        sbLIZ7.append(" api ");
        sbLIZ7.append(InterfaceC576620MjU.class.getName());
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ7));
        c0lek.LIZ("camera_layout", enumC1642750sqn2, null, InterfaceC576620MjU.class, C539980LFs.class, new AwS374S0200000_8(new C0ET4(), c559610Lx9, c19a3, 133));
        StringBuilder sbLIZ8 = C2188811AlT.LIZ();
        sbLIZ8.append("register component ");
        sbLIZ8.append(C578510MmX.class.getName());
        sbLIZ8.append(" api ");
        sbLIZ8.append(InterfaceC576630MjV.class.getName());
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ8));
        c0lek.LIZ("camera_layout", enumC1642750sqn2, null, InterfaceC576630MjV.class, C578510MmX.class, new AwS587S0100000_8(new C0ET4(), c559610Lx9, 490));
        StringBuilder sbLIZ9 = C2188811AlT.LIZ();
        sbLIZ9.append("register component ");
        sbLIZ9.append(C576920Mjy.class.getName());
        sbLIZ9.append(" api ");
        sbLIZ9.append(InterfaceC576780Mjk.class.getName());
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ9));
        c0lek.LIZ("camera_layout", enumC1642750sqn2, null, InterfaceC576780Mjk.class, C576920Mjy.class, new AwS587S0100000_8(new C0ET4(), c559610Lx9, 491));
        StringBuilder sbLIZ10 = C2188811AlT.LIZ();
        sbLIZ10.append("register component ");
        sbLIZ10.append(C1638470sjt.class.getName());
        sbLIZ10.append(" api ");
        sbLIZ10.append(InterfaceC577190MkP.class.getName());
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ10));
        c0lek.LIZ("camera_layout", enumC1642750sqn2, null, InterfaceC577190MkP.class, C1638470sjt.class, new AwS587S0100000_8(new C0ET4(), c559610Lx9, 493));
        StringBuilder sbLIZ11 = C2188811AlT.LIZ();
        sbLIZ11.append("register component ");
        sbLIZ11.append(C576690Mjb.class.getName());
        sbLIZ11.append(" api ");
        sbLIZ11.append(InterfaceC576910Mjx.class.getName());
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ11));
        c0lek.LIZ("camera_layout", enumC1642750sqn2, null, InterfaceC576910Mjx.class, C576690Mjb.class, new AwS587S0100000_8(new C0ET4(), c559610Lx9, 495));
    }
}
