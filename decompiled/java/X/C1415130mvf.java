package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.edit.EditModel;
import com.ss.android.ugc.aweme.creative.model.edit.mixediting.MixEditingMaterialType;
import com.ss.android.ugc.aweme.creative.model.edit.mixediting.MixEditingModel;
import com.ss.android.ugc.aweme.creative.model.edit.mixediting.SelectedMaterialItem;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mvf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1415130mvf {
    public static final WeakHashMap<VideoPublishEditModel, String> LJI = new WeakHashMap<>();
    public final InterfaceC1455860nzM LIZ;
    public final C0EMC LIZIZ;
    public final InterfaceC366450EYh LIZJ;
    public final InterfaceC1418580n1E LIZLLL;
    public final InterfaceC497601wk LJ;
    public final Function0<VideoPublishEditModel> LJFF;

    public final void LIZIZ() {
        VideoPublishEditModel videoPublishEditModelInvoke;
        NLEModel nLEModelLIZ;
        NLETrack mainTrack;
        Function0<VideoPublishEditModel> function0 = this.LJFF;
        if (function0 == null || (videoPublishEditModelInvoke = function0.invoke()) == null) {
            return;
        }
        String strLIZJ = LIZJ();
        LJI(null);
        if (C1414450muZ.LJIIJJI(videoPublishEditModelInvoke)) {
            InterfaceC366450EYh interfaceC366450EYh = this.LIZJ;
            if (interfaceC366450EYh != null) {
                interfaceC366450EYh.yS(false);
            }
            InterfaceC366450EYh interfaceC366450EYh2 = this.LIZJ;
            if (interfaceC366450EYh2 != null) {
                interfaceC366450EYh2.LC1(false);
            }
            C0EMC c0emc = this.LIZIZ;
            if (c0emc != null) {
                c0emc.LIZJ();
            }
            InterfaceC1452170ntP value = this.LIZ.g().getValue();
            if (value != null && (nLEModelLIZ = C352130DrH.LIZ(value)) != null && (mainTrack = nLEModelLIZ.getMainTrack()) != null) {
                mainTrack.removeExtraWithKey("using_template_type");
                mainTrack.removeExtraWithKey("using_template_id");
            }
            AutoCutThemeData autoCutThemeDataLIZJ = C1403130mcJ.LIZJ(videoPublishEditModelInvoke.creativeModel);
            if (autoCutThemeDataLIZJ != null && autoCutThemeDataLIZJ.templateType == EnumC1412640mre.LYRICS_RULE_TEMPLATE.getValue()) {
                C1416110mxF.LJIIIZ(videoPublishEditModelInvoke.creativeModel.autoCutModel, -1, null, -1, null, null, null, C0L9M.FIRST_GENERATE_AUTOCUT.getValue(), null);
            }
            MixEditingModel mixEditingModel = videoPublishEditModelInvoke.creativeModel.mixEditingModel;
            SelectedMaterialItem selectedMaterialItem = mixEditingModel.selectedMaterialItem;
            if ((selectedMaterialItem != null ? selectedMaterialItem.materialType : null) == MixEditingMaterialType.LYRICS_RULE_TEMPLATE) {
                mixEditingModel.selectedMaterialItem = null;
            }
            C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("DONE prev=");
            sbLIZ.append(strLIZJ);
            sbLIZ.append(" | ");
            sbLIZ.append(LJFF());
            C1426005i6.LIZ(c1398350mUb, "Clear", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final String LIZJ() {
        VideoPublishEditModel videoPublishEditModelInvoke;
        String str;
        Function0<VideoPublishEditModel> function0 = this.LJFF;
        if (function0 == null || (videoPublishEditModelInvoke = function0.invoke()) == null) {
            return null;
        }
        WeakHashMap<VideoPublishEditModel, String> weakHashMap = LJI;
        synchronized (weakHashMap) {
            try {
                str = weakHashMap.get(videoPublishEditModelInvoke);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return str;
    }

    public final void LJ() {
        InterfaceC1418580n1E interfaceC1418580n1E = this.LIZLLL;
        if (interfaceC1418580n1E != null) {
            interfaceC1418580n1E.Hr1(false, true, true);
        }
        InterfaceC1418580n1E interfaceC1418580n1E2 = this.LIZLLL;
        if (interfaceC1418580n1E2 != null) {
            interfaceC1418580n1E2.N81(0.0f);
        }
    }

    public final String LJFF() {
        NLEModel nLEModelLIZ;
        CreativeModel creativeModel;
        EditModel editModel;
        InterfaceC1452170ntP value = this.LIZ.g().getValue();
        if (value == null || (nLEModelLIZ = C352130DrH.LIZ(value)) == null) {
            return "nle=null";
        }
        Function0<VideoPublishEditModel> function0 = this.LJFF;
        Boolean boolValueOf = null;
        VideoPublishEditModel videoPublishEditModelInvoke = function0 != null ? function0.invoke() : null;
        boolean zLIZ = C359160E6g.LIZ(nLEModelLIZ);
        if (videoPublishEditModelInvoke != null && (creativeModel = videoPublishEditModelInvoke.creativeModel) != null && (editModel = creativeModel.editModel) != null) {
            boolValueOf = Boolean.valueOf(editModel.editMusicSyncMode);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("musicSync=");
        sbLIZ.append(zLIZ);
        sbLIZ.append(" editMode=");
        sbLIZ.append(boolValueOf);
        sbLIZ.append(" applied=");
        sbLIZ.append(LIZJ());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LJI(String str) {
        VideoPublishEditModel videoPublishEditModelInvoke;
        Function0<VideoPublishEditModel> function0 = this.LJFF;
        if (function0 != null && (videoPublishEditModelInvoke = function0.invoke()) != null) {
            WeakHashMap<VideoPublishEditModel, String> weakHashMap = LJI;
            synchronized (weakHashMap) {
                try {
                    if (str == null) {
                        weakHashMap.remove(videoPublishEditModelInvoke);
                    } else {
                        weakHashMap.put(videoPublishEditModelInvoke, str);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0243  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(com.ss.android.ugc.aweme.creative.model.music.AVMusic r29, java.lang.String r30, X.C0MJ7 r31, kotlin.jvm.functions.Function0<kotlin.Unit> r32) {
        /*
            Method dump skipped, instruction units count: 611
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1415130mvf.LIZ(com.ss.android.ugc.aweme.creative.model.music.AVMusic, java.lang.String, X.0MJ7, kotlin.jvm.functions.Function0):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1415130mvf(InterfaceC1455860nzM interfaceC1455860nzM, C0EMC c0emc, InterfaceC366450EYh interfaceC366450EYh, InterfaceC1418580n1E interfaceC1418580n1E, InterfaceC497601wk interfaceC497601wk, Function0<? extends VideoPublishEditModel> function0) {
        this.LIZ = interfaceC1455860nzM;
        this.LIZIZ = c0emc;
        this.LIZJ = interfaceC366450EYh;
        this.LIZLLL = interfaceC1418580n1E;
        this.LJ = interfaceC497601wk;
        this.LJFF = function0;
    }

    public final void LIZLLL(String str, String str2, String str3, String str4, String str5, String str6) {
        String str7;
        String strLIZIZ;
        if (Intrinsics.LJFF(str4, "APPLIED")) {
            str7 = "SUCCESS";
        } else {
            str7 = "FAIL";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("key=");
        sbLIZ.append(str2);
        sbLIZ.append(" result=");
        sbLIZ.append(str7);
        sbLIZ.append(" soundSync=");
        sbLIZ.append(str3);
        sbLIZ.append(" lyric=");
        sbLIZ.append(str4);
        sbLIZ.append("(src=");
        sbLIZ.append(str5);
        sbLIZ.append(')');
        if (str6 != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(" reason=");
            sbLIZ2.append(str6);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        } else {
            strLIZIZ = "";
        }
        sbLIZ.append(strLIZIZ);
        sbLIZ.append(" | ");
        sbLIZ.append(LJFF());
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
        if (Intrinsics.LJFF(str7, "SUCCESS")) {
            C1426005i6.LIZ(C1398350mUb.LIZIZ, str, strLIZIZ2);
        } else {
            C1426005i6.LIZJ(C1398350mUb.LIZIZ, str, strLIZIZ2);
        }
    }
}
