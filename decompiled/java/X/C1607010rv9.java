package X;

import android.graphics.Shader;
import java.util.Map;

/* JADX INFO: renamed from: X.0rv9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1607010rv9 extends C1607020rvA {
    public final Map<Integer, InterfaceC1600660rku> LJFF;
    public int LJI;

    @Override // X.C1607020rvA, X.InterfaceC1600660rku
    public final Integer LIZ() {
        InterfaceC1600660rku interfaceC1600660rku;
        Integer numLIZ;
        Map<Integer, InterfaceC1600660rku> map = this.LJFF;
        return (map == null || (interfaceC1600660rku = map.get(Integer.valueOf(this.LJI))) == null || (numLIZ = interfaceC1600660rku.LIZ()) == null) ? this.LIZLLL : numLIZ;
    }

    @Override // X.C1607020rvA, X.InterfaceC1600660rku
    public final Shader LIZIZ() {
        InterfaceC1600660rku interfaceC1600660rku;
        Shader shaderLIZIZ;
        Map<Integer, InterfaceC1600660rku> map = this.LJFF;
        return (map == null || (interfaceC1600660rku = map.get(Integer.valueOf(this.LJI))) == null || (shaderLIZIZ = interfaceC1600660rku.LIZIZ()) == null) ? this.LJ : shaderLIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1607010rv9(int i, Integer num, int i2, Integer num2, Shader shader, Map<Integer, ? extends InterfaceC1600660rku> map) {
        super(i, num, i2, num2, shader);
        this.LJFF = map;
    }
}
