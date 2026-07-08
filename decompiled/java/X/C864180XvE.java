package X;

import com.bytedance.scene.Scene;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0XvE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C864180XvE {
    public final C0YEM LIZ;
    public final ConcurrentHashMap<EnumC863790Xub, Integer> LIZIZ = new ConcurrentHashMap<>();

    public final void LIZIZ() {
        for (Map.Entry<EnumC863790Xub, Integer> entry : this.LIZIZ.entrySet()) {
            this.LIZIZ.put(entry.getKey(), Integer.valueOf(entry.getValue().intValue() + 1));
        }
    }

    public C864180XvE(C0YEM c0yem) {
        this.LIZ = c0yem;
    }

    public final void LIZ(EnumC863790Xub enumC863790Xub) {
        Integer numRemove = this.LIZIZ.remove(enumC863790Xub);
        if (numRemove != null) {
            int iIntValue = numRemove.intValue();
            if (this.LIZ.LJIIZILJ().LJFF().getEventTracker().LIZJ(0.002f)) {
                C0YJ9 c0yj9 = new C0YJ9(this.LIZ);
                c0yj9.LIZJ("im_sdk_db_op_count");
                c0yj9.LIZ(enumC863790Xub.name(), Scene.SCENE_SERVICE);
                c0yj9.LIZ(Integer.valueOf(iIntValue), "count");
                c0yj9.LIZLLL();
            }
        }
    }
}
