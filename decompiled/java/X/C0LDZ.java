package X;

import android.content.Context;
import com.bytedance.ies.cutsame.util.MediaUtil;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.vesdk.VEEditor;
import com.ss.android.vesdk.VEFileUtils;
import com.ss.android.vesdk.VETimelineParams;
import com.ss.android.vesdk.VEUtils;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import com.ss.android.vesdk.runtime.VEEditorResManager;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0LDZ, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LDZ implements InterfaceC497601wk {
    public final C1DFB LL = C0PEM.LIZJ;

    public C0LDZ() {
        new ArrayList();
    }

    @Override // X.InterfaceC497601wk
    public final CoroutineContext getCoroutineContext() {
        return this.LL;
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [X.0L8V] */
    public final void LIZ(final int i, final Context context, final List list, final Function0 function0, final Function1 function1, final Function1 function12) {
        String strLIZJ;
        C539280LDa c539280LDaLIZ;
        final C0L8Q c0l8q = (C0L8Q) ListProtector.get(list, i);
        MediaUtil mediaUtil = MediaUtil.LIZ;
        int i2 = mediaUtil.LIZ(context, c0l8q.LIZ).LJ;
        String str = C353030Dsj.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("/reverse_");
        String str2 = c0l8q.LIZ;
        C2473009ma.LIZ.getClass();
        if (C2473009ma.LJI(str2)) {
            strLIZJ = C2117808Rk.LIZIZ(context, UriProtector.parse(str2));
        } else {
            strLIZJ = C2117808Rk.LIZJ(str2);
        }
        sbLIZ.append(strLIZJ);
        sbLIZ.append(".mp4");
        final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (C0L8X.LIZ.LIZJ(strLIZIZ)) {
            c0l8q.LIZJ = true;
            c0l8q.LIZ = strLIZIZ;
            function0.invoke();
            int i3 = i + 1;
            if (i3 < list.size()) {
                LIZ(i3, context, list, function0, function1, function12);
                return;
            } else {
                function1.invoke(Boolean.TRUE);
                return;
            }
        }
        C539510LDx c539510LDx = C539510LDx.LIZ;
        String str3 = c0l8q.LIZ;
        final ?? r9 = new Function1() { // from class: X.0L8V
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                C0L8Q c0l8q2 = c0l8q;
                String str4 = strLIZIZ;
                Function0 function02 = function0;
                int i4 = i;
                List list2 = list;
                C0LDZ c0ldz = this;
                Context context2 = context;
                Function1 function13 = function1;
                Function1 function14 = function12;
                if (((Integer) obj).intValue() == 0) {
                    c0l8q2.LIZJ = true;
                    c0l8q2.LIZ = str4;
                    C0L8X.LIZ.LIZ(str4);
                    function02.invoke();
                    int i5 = 1 + i4;
                    if (i5 < list2.size()) {
                        c0ldz.LIZ(i5, context2, list2, function02, function13, function14);
                    } else {
                        function13.invoke(Boolean.TRUE);
                    }
                } else {
                    function13.invoke(Boolean.FALSE);
                }
                return Unit.LIZ;
            }
        };
        c539510LDx.getClass();
        if (!C2473009ma.LJFF(context, str3)) {
            r9.invoke(-1);
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str);
        sbLIZ2.append("/audio/");
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        C2473009ma.LJII(strLIZIZ2, true);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(strLIZIZ2);
        sbLIZ3.append("audio");
        final String fileBestStreamAudio = VEUtils.getFileBestStreamAudio(str3, C2188811AlT.LIZIZ(sbLIZ3));
        C539280LDa c539280LDaLIZ2 = mediaUtil.LIZ(context, str3);
        int i4 = c539280LDaLIZ2.LIZLLL;
        if (i4 != 90 && i4 != 270) {
            c539280LDaLIZ = C539280LDa.LIZ(c539280LDaLIZ2, c539280LDaLIZ2.LIZIZ, c539280LDaLIZ2.LIZJ);
        } else {
            c539280LDaLIZ = C539280LDa.LIZ(c539280LDaLIZ2, c539280LDaLIZ2.LIZJ, c539280LDaLIZ2.LIZIZ);
        }
        final VEEditorResManager vEEditorResManager = new VEEditorResManager(str);
        C1780100wQK c1780100wQK = new C1780100wQK(2);
        c1780100wQK.LJIIJ(c539280LDaLIZ.LIZIZ, c539280LDaLIZ.LIZJ);
        c1780100wQK.LJII(30);
        c1780100wQK.LIZIZ.isSupportHWEncoder = false;
        c1780100wQK.LJIIIIZZ(13);
        VEVideoEncodeSettings vEVideoEncodeSettings = c1780100wQK.LIZIZ;
        vEVideoEncodeSettings.gopSize = 1;
        vEVideoEncodeSettings.mWatermarkParam = null;
        c1780100wQK.LJFF(VEVideoEncodeSettings.ENCODE_PROFILE.ENCODE_PROFILE_BASELINE);
        c1780100wQK.LIZIZ.swPreset = VEVideoEncodeSettings.ENCODE_PRESET.ENCODE_LEVEL_ULTRAFAST.ordinal();
        VEVideoEncodeSettings vEVideoEncodeSettings2 = c1780100wQK.LIZIZ;
        vEVideoEncodeSettings2.enableRemuxVideo = false;
        vEVideoEncodeSettings2.enableRemuxVideoForRotation = false;
        VEEditor vEEditorLJIJ = VEEditor.LJIJ(vEEditorResManager, new VETimelineParams(new String[]{str3}), c1780100wQK.LIZ(), 0, i2, new C1DOH() { // from class: X.0LHC
            @Override // X.C1DOH
            public final void LIZ(double d) {
                function12.invoke(Float.valueOf((float) d));
            }

            @Override // X.C1DOH
            public final void LIZIZ(int i5) throws IOException {
                if (i5 == 0) {
                    if (fileBestStreamAudio != null) {
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append(new C0VSJ(vEEditorResManager.mReverseAudioPaths[0]).getParent());
                        sbLIZ4.append("/audio_reverse.mp4");
                        String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ4);
                        VEUtils.reverseAudio(fileBestStreamAudio, strLIZIZ3);
                        VEUtils.mux(vEEditorResManager.mReverseVideoPath[0], strLIZIZ3, strLIZIZ);
                    } else {
                        new C0VSJ(strLIZIZ).createNewFile();
                        new C0VSJ(vEEditorResManager.mReverseVideoPath[0]).renameTo(new C0VSJ(strLIZIZ));
                    }
                } else {
                    VEFileUtils.deleteFile(strLIZIZ);
                }
                r9.invoke(Integer.valueOf(i5));
            }
        });
        C539510LDx.LIZIZ = vEEditorLJIJ;
        if (vEEditorLJIJ != null) {
            return;
        }
        r9.invoke(-1);
    }
}
