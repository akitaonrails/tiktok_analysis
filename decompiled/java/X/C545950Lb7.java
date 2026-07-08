package X;

import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Lb7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C545950Lb7 {
    public static final List<String> LIZ(AwemeDraft awemeDraft) {
        Function1<CreativeModel, String> function1;
        String strInvoke;
        HashSet hashSet = new HashSet();
        hashSet.addAll(awemeDraft.LIZ.asyncTaskIds);
        String taskId = awemeDraft.LIZ.aiLivePhotoModel.getTaskId();
        if (taskId != null && taskId.length() > 0) {
            hashSet.add(taskId);
        }
        if (LIZIZ(awemeDraft)) {
            C547860LeC.LIZ.getClass();
            Iterator<C546230LbZ> it2 = C547860LeC.LIZIZ().LJFF(true).iterator();
            while (it2.hasNext()) {
                C546040LbG c546040LbGLIZIZ = it2.next().LIZIZ();
                if (c546040LbGLIZIZ != null && (function1 = c546040LbGLIZIZ.LIZJ) != null && (strInvoke = function1.invoke(awemeDraft.LIZ)) != null) {
                    hashSet.add(strInvoke);
                }
            }
        }
        return C13LP.LLIIII(hashSet);
    }

    public static final boolean LIZIZ(AwemeDraft awemeDraft) {
        C548590LfN.LIZ.getClass();
        return C548590LfN.LIZ().LJFF(awemeDraft);
    }
}
