package X;

import com.bytedance.scene.Scene;
import com.bytedance.scene.group.GroupRecord;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.19AY, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19AY {
    public List<GroupRecord> LIZ = new ArrayList();
    public final Map<Scene, GroupRecord> LIZIZ = new HashMap();
    public final Map<String, GroupRecord> LIZJ = new HashMap();

    public final GroupRecord LIZ(Scene scene) {
        return (GroupRecord) ((HashMap) this.LIZIZ).get(scene);
    }
}
