package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Dqh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C351770Dqh extends AbstractC371450EhL<Unit> {
    public static final /* synthetic */ int LJ = 0;
    public final C365910EWf LIZLLL;

    public C351770Dqh(C0EI6 c0ei6) {
        this.LIZLLL = (C365910EWf) c0ei6.LIZ(C365910EWf.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:173:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x0ac2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0149  */
    @Override // X.AbstractC371450EhL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.InterfaceC1364105Vn<? super kotlin.Unit> r25) {
        /*
            Method dump skipped, instruction units count: 2867
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C351770Dqh.LIZJ(X.05Vn):java.lang.Object");
    }

    public static boolean LJFF(VideoPublishEditModel videoPublishEditModel, NLEModel nLEModel) {
        boolean z;
        boolean z2;
        if (!C0EYQ.LJIIJ(nLEModel) && !C0EYQ.LJIILLIIL(nLEModel)) {
            z = false;
        } else {
            z = true;
        }
        AutoCutThemeData autoCutThemeDataLIZJ = C1403130mcJ.LIZJ(videoPublishEditModel.creativeModel);
        if (videoPublishEditModel.creativeModel.autoCutModel.curSource != C0MJ9.MIX_EDITING.ordinal() && autoCutThemeDataLIZJ != null && C13LQ.LJLIIL(new Integer[]{Integer.valueOf(EnumC1412640mre.DESIGNER_FIXED_TEMPLATE.getValue()), Integer.valueOf(EnumC1412640mre.ALGORITHM_TEMPLATE.getValue()), Integer.valueOf(EnumC1412640mre.CUT_SAME.getValue()), Integer.valueOf(EnumC1412640mre.AIGT.getValue()), Integer.valueOf(EnumC1412640mre.SGT.getValue())}).contains(Integer.valueOf(videoPublishEditModel.creativeModel.autoCutModel.curTemplateType))) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z && !z2) {
            return false;
        }
        return true;
    }
}
