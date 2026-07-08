package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.Record;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.19AC, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19AC {
    public List<Record> LIZ = new ArrayList();

    public final Record LIZIZ() {
        if (this.LIZ.size() <= 0) {
            return null;
        }
        return (Record) ListProtector.get(this.LIZ, r1.size() - 1);
    }

    public final List<Record> LIZJ() {
        return new ArrayList(this.LIZ);
    }

    public final Record LIZLLL(Scene scene) {
        for (int i = 0; i < this.LIZ.size(); i++) {
            Record record = (Record) ListProtector.get(this.LIZ, i);
            if (record.mScene == scene) {
                return record;
            }
        }
        return null;
    }

    public final void LJ(Record record) {
        ((ArrayList) this.LIZ).add(record);
        Scene scene = record.mScene;
        if (scene != null) {
            C21494919Ad c21494919Ad = C21494919Ad.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("add new record to RecordStack, current stack size ");
            sbLIZ.append(((ArrayList) this.LIZ).size());
            sbLIZ.append(" added scene ");
            sbLIZ.append(scene);
            c21494919Ad.LIZIZ("RecordStack", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        C21494919Ad c21494919Ad2 = C21494919Ad.LIZIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("add new record to RecordStack, current stack size ");
        sbLIZ2.append(((ArrayList) this.LIZ).size());
        c21494919Ad2.LIZIZ("RecordStack", C2188811AlT.LIZIZ(sbLIZ2));
    }

    public final void LJFF(Record record) {
        this.LIZ.remove(record);
        Scene scene = record.mScene;
        if (scene != null) {
            C21494919Ad c21494919Ad = C21494919Ad.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("remove old record from RecordStack, current stack size ");
            sbLIZ.append(this.LIZ.size());
            sbLIZ.append(" removed scene ");
            sbLIZ.append(scene);
            c21494919Ad.LIZIZ("RecordStack", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        C21494919Ad c21494919Ad2 = C21494919Ad.LIZIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("remove old record from RecordStack, current stack size ");
        sbLIZ2.append(this.LIZ.size());
        c21494919Ad2.LIZIZ("RecordStack", C2188811AlT.LIZIZ(sbLIZ2));
    }

    public static Scene LIZ(Context context, int i, Record record, InterfaceC214877197j interfaceC214877197j) {
        Scene sceneLIZ;
        if (i == 0 && interfaceC214877197j != null && (sceneLIZ = interfaceC214877197j.LIZ(context.getClassLoader(), record.LLILLJJLI, null)) != null) {
            if (sceneLIZ.mParentScene != null) {
                throw new IllegalArgumentException("SceneComponentFactory instantiateScene return Scene already has a parent");
            }
            return sceneLIZ;
        }
        return C2350509Ix.LIZIZ(context, record.LLILLJJLI, null);
    }
}
