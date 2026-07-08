package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParam;

/* JADX INFO: renamed from: X.0yHh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1851630yHh {
    public final C375830EoP<Bundle> LIZ;
    public final C375830EoP<Boolean> LIZIZ;
    public final C375830EoP<C377660ErM> LIZJ;
    public final C375830EoP<Boolean> LIZLLL;
    public final C375830EoP<Boolean> LJ;
    public final AIGCGenerationParam LJFF;
    public final EnumC1641380soa LJI;

    public C1851630yHh() {
        this(null, 127);
    }

    public /* synthetic */ C1851630yHh(EnumC1641380soa enumC1641380soa, int i) {
        this(null, null, null, null, null, null, (i & 64) != 0 ? null : enumC1641380soa);
    }

    public C1851630yHh(C375830EoP<Bundle> c375830EoP, C375830EoP<Boolean> c375830EoP2, C375830EoP<C377660ErM> c375830EoP3, C375830EoP<Boolean> c375830EoP4, C375830EoP<Boolean> c375830EoP5, AIGCGenerationParam aIGCGenerationParam, EnumC1641380soa enumC1641380soa) {
        this.LIZ = c375830EoP;
        this.LIZIZ = c375830EoP2;
        this.LIZJ = c375830EoP3;
        this.LIZLLL = c375830EoP4;
        this.LJ = c375830EoP5;
        this.LJFF = aIGCGenerationParam;
        this.LJI = enumC1641380soa;
    }

    public static C1851630yHh LIZ(C1851630yHh c1851630yHh, C375830EoP c375830EoP, C375830EoP c375830EoP2, C375830EoP c375830EoP3, C375830EoP c375830EoP4, C375830EoP c375830EoP5, AIGCGenerationParam aIGCGenerationParam, EnumC1641380soa enumC1641380soa, int i) {
        EnumC1641380soa enumC1641380soa2 = enumC1641380soa;
        AIGCGenerationParam aIGCGenerationParam2 = aIGCGenerationParam;
        C375830EoP c375830EoP6 = c375830EoP5;
        C375830EoP c375830EoP7 = c375830EoP4;
        C375830EoP c375830EoP8 = c375830EoP3;
        C375830EoP c375830EoP9 = c375830EoP2;
        C375830EoP c375830EoP10 = c375830EoP;
        if ((i & 1) != 0) {
            c375830EoP10 = c1851630yHh.LIZ;
        }
        if ((i & 2) != 0) {
            c375830EoP9 = c1851630yHh.LIZIZ;
        }
        if ((i & 4) != 0) {
            c375830EoP8 = c1851630yHh.LIZJ;
        }
        if ((i & 8) != 0) {
            c375830EoP7 = c1851630yHh.LIZLLL;
        }
        if ((i & 16) != 0) {
            c375830EoP6 = c1851630yHh.LJ;
        }
        if ((i & 32) != 0) {
            aIGCGenerationParam2 = c1851630yHh.LJFF;
        }
        if ((i & 64) != 0) {
            enumC1641380soa2 = c1851630yHh.LJI;
        }
        c1851630yHh.getClass();
        return new C1851630yHh(c375830EoP10, c375830EoP9, c375830EoP8, c375830EoP7, c375830EoP6, aIGCGenerationParam2, enumC1641380soa2);
    }
}
