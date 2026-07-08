package X;

import android.graphics.Shader;

/* JADX INFO: renamed from: X.0rvA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public class C1607020rvA implements InterfaceC1600660rku {
    public final int LIZ;
    public final Integer LIZIZ;
    public final int LIZJ;
    public final Integer LIZLLL;
    public final Shader LJ;

    @Override // X.InterfaceC1600660rku
    public Integer LIZ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC1600660rku
    public Shader LIZIZ() {
        return this.LJ;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1607020rvA(Integer num, Shader shader, int i) {
        int iLIZIZ;
        Shader shader2 = shader;
        Integer num2 = num;
        if ((i & 1) != 0) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
        } else {
            iLIZIZ = 0;
        }
        this(iLIZIZ, null, 0, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : shader2);
    }

    public C1607020rvA(int i, Integer num, int i2, Integer num2, Shader shader) {
        this.LIZ = i;
        this.LIZIZ = num;
        this.LIZJ = i2;
        this.LIZLLL = num2;
        this.LJ = shader;
    }
}
