package X;

import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.TaskInfoInCreativeModel;
import com.ss.android.ugc.aweme.creative.model.magic.MagicCombineEffectModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0Eqg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C377240Eqg {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(C377270Eqj c377270Eqj) {
        List<C377380Equ> list;
        if (c377270Eqj == null || (list = c377270Eqj.LIZJ) == null || list.isEmpty()) {
            return false;
        }
        Iterator<C377380Equ> it2 = list.iterator();
        while (it2.hasNext()) {
            if (it2.next().LJFF == EnumC381960EyI.EDITOR_PRO) {
                return true;
            }
        }
        return false;
    }

    public static boolean LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        CreativeModel creativeModel;
        MagicCombineEffectModel magicCombineEffectModel;
        TaskInfoInCreativeModel taskInfoInCreativeModel;
        if (LIZJ(videoPublishEditModel)) {
            if (videoPublishEditModel == null || (creativeModel = videoPublishEditModel.creativeModel) == null || (magicCombineEffectModel = creativeModel.magicCombineEffectModel) == null || (taskInfoInCreativeModel = magicCombineEffectModel.taskInfoInCreativeModel) == null || taskInfoInCreativeModel.isBlockByLoading) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean LIZJ(VideoPublishEditModel videoPublishEditModel) {
        CreativeModel creativeModel;
        MagicCombineEffectModel magicCombineEffectModel;
        TaskInfoInCreativeModel taskInfoInCreativeModel;
        if (videoPublishEditModel != null && (creativeModel = videoPublishEditModel.creativeModel) != null && (magicCombineEffectModel = creativeModel.magicCombineEffectModel) != null && (taskInfoInCreativeModel = magicCombineEffectModel.taskInfoInCreativeModel) != null) {
            return taskInfoInCreativeModel.needBlockLeaveEditorPro;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZLLL(X.C377270Eqj r4) {
        /*
            r3 = 1
            if (r4 == 0) goto L24
            java.util.List<X.0Equ> r1 = r4.LIZIZ
            if (r1 == 0) goto L24
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L24
            java.util.Iterator r2 = r1.iterator()
        L11:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L24
            java.lang.Object r0 = r2.next()
            X.0Equ r0 = (X.C377380Equ) r0
            X.0EyI r1 = r0.LJFF
            X.0EyI r0 = X.EnumC381960EyI.EDITOR_PRO
            if (r1 != r0) goto L11
        L23:
            return r3
        L24:
            boolean r0 = LIZ(r4)
            if (r0 != 0) goto L23
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C377240Eqg.LIZLLL(X.0Eqj):boolean");
    }

    public static void LJ(VideoPublishEditModel videoPublishEditModel, C377270Eqj c377270Eqj) {
        MagicCombineEffectModel magicCombineEffectModel;
        TaskInfoInCreativeModel taskInfoInCreativeModel;
        MagicCombineEffectModel magicCombineEffectModel2;
        TaskInfoInCreativeModel taskInfoInCreativeModel2;
        if (videoPublishEditModel != null) {
            CreativeModel creativeModel = videoPublishEditModel.creativeModel;
            if (creativeModel != null && (magicCombineEffectModel2 = creativeModel.magicCombineEffectModel) != null && (taskInfoInCreativeModel2 = magicCombineEffectModel2.taskInfoInCreativeModel) != null) {
                taskInfoInCreativeModel2.needBlockLeaveEditorPro = LIZLLL(c377270Eqj);
            }
            CreativeModel creativeModel2 = videoPublishEditModel.creativeModel;
            if (creativeModel2 != null && (magicCombineEffectModel = creativeModel2.magicCombineEffectModel) != null && (taskInfoInCreativeModel = magicCombineEffectModel.taskInfoInCreativeModel) != null) {
                taskInfoInCreativeModel.isBlockByLoading = !LIZ(c377270Eqj);
            }
        }
    }
}
