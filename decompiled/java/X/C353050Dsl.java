package X;

import com.bytedance.ies.nle.editor_jni.NLEError;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS371S0200000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0Dsl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C353050Dsl {
    public static final /* synthetic */ int LIZJ = 0;
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(64));
    public final long LIZIZ = C306660C0i.LIZ();

    public static final void LIZIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RecognizeCaptionExecutor stopExtractAudio mVeEditor: ");
        sbLIZ.append((Object) null);
        C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static C1408410mkp LIZ(VideoPublishEditModel videoPublishEditModel, int i, int i2, int i3, NLEModel nLEModel) {
        boolean z;
        Pair pair;
        InterfaceC1460960o7a pathAdapter = C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter();
        CreativeInfo creativeInfo = videoPublishEditModel.getCreativeInfo();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("init_");
        sbLIZ.append(System.currentTimeMillis());
        String strLJJIII = pathAdapter.LJJIII(creativeInfo, C2188811AlT.LIZIZ(sbLIZ));
        if (C0A1H.LIZ() && !u.LJIIZILJ(strLJJIII, ".aac", false)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strLJJIII);
            sbLIZ2.append(".aac");
            strLJJIII = C2188811AlT.LIZIZ(sbLIZ2);
        }
        AwS371S0200000_5 awS371S0200000_5 = new AwS371S0200000_5(videoPublishEditModel, nLEModel, 13);
        AFwS234S0000000_5 aFwS234S0000000_5 = AFwS234S0000000_5.get$arr$(66);
        AwS584S0100000_5 awS584S0100000_5 = new AwS584S0100000_5(nLEModel, 108);
        if (nLEModel != null) {
            if (!((Boolean) C259200ADu.LIZ.getValue()).booleanValue()) {
                awS584S0100000_5 = null;
            }
            if (C0A1H.LIZ() && !videoPublishEditModel.isPhotoMvMode()) {
                z = true;
            } else {
                z = false;
            }
            NLEError nLEErrorLIZ = C0E38.LIZ(strLJJIII, nLEModel, null, awS371S0200000_5, i3, i2, i, aFwS234S0000000_5, awS584S0100000_5, z, false, 1024);
            if (nLEErrorLIZ == NLEError.SUCCESS) {
                pair = new Pair(0, "");
            } else {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("nle error ");
                sbLIZ3.append(nLEErrorLIZ.name());
                pair = new Pair(1, C2188811AlT.LIZIZ(sbLIZ3));
            }
            return new C1408410mkp(((Number) pair.getFirst()).intValue(), (String) pair.getSecond(), strLJJIII);
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
