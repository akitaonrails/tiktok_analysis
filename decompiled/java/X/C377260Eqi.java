package X;

import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.framework.datastore.EditModelProvider;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Eqi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C377260Eqi {
    public final C0E48 LIZ;

    public static VideoPublishEditModel LJ() {
        EditModelProvider.Companion.getClass();
        EditModelProvider editModelProviderLIZIZ = C0E1T.LIZIZ();
        if (editModelProviderLIZIZ != null) {
            return editModelProviderLIZIZ.getEditModel();
        }
        return null;
    }

    public final void LIZ() {
        C0LAB c0labLIZIZ = LIZIZ(LJ(), this.LIZ, null);
        if (c0labLIZIZ != null) {
            C20684815ws.LJIILLIIL("async_task_repeat_popup_show", c0labLIZIZ.LIZ);
        }
    }

    public C377260Eqi(C0E48 c0e48) {
        this.LIZ = c0e48;
    }

    public final void LIZLLL(String str, List list) {
        C0LAB c0labLIZIZ = LIZIZ(LJ(), this.LIZ, list);
        if (c0labLIZIZ != null) {
            c0labLIZIZ.LJ("method", str);
            C20684815ws.LJIILLIIL("exit_async_process_popup_show", c0labLIZIZ.LIZ);
        }
    }

    public static C0LAB LIZIZ(VideoPublishEditModel videoPublishEditModel, C0E48 c0e48, List list) {
        if (c0e48 != null && videoPublishEditModel != null) {
            C0LAB c0labLJFF = C361680EFy.LJFF(-1L, videoPublishEditModel, c0e48, new Pair(-1, -1));
            if (list != null && !list.isEmpty()) {
                c0labLJFF.LJ("async_function_list", C13LP.LJJLIIIJ(list, ",", null, null, 0, null, null, 62));
            }
            return c0labLJFF;
        }
        return null;
    }

    public final void LIZJ(String str, String str2, List list) {
        C0LAB c0labLIZIZ = LIZIZ(LJ(), this.LIZ, list);
        if (c0labLIZIZ != null) {
            c0labLIZIZ.LJ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str);
            c0labLIZIZ.LJ("method", str2);
            C20684815ws.LJIILLIIL("exit_async_process_popup_click", c0labLIZIZ.LIZ);
        }
    }
}
