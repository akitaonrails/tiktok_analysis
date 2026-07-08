package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.feed.model.story.StoryNoteTextExtra;
import java.util.List;
import kotlin.jvm.internal.AFwS200S0000000_13;

/* JADX INFO: renamed from: X.0VM5, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VM5 {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(426));

    public final List<String> LIZ(String str) {
        if (str == null) {
            return null;
        }
        try {
            return (List) ((Gson) this.LIZ.getValue()).LJIIIIZZ(str, new TypeToken<List<? extends String>>() { // from class: X.0VM4
            }.getType());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public final List<StoryNoteTextExtra> LIZIZ(String str) {
        if (str == null) {
            return null;
        }
        try {
            return (List) ((Gson) this.LIZ.getValue()).LJIIIIZZ(str, new TypeToken<List<? extends StoryNoteTextExtra>>() { // from class: X.0VM6
            }.getType());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
