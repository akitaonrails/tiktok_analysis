package X;

import com.ss.android.ugc.aweme.tools.mvtemplate.core.TemplateCategoryData;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0n83, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1422810n83 {
    public final C1DRG LIZ;
    public final TemplateCategoryData LIZIZ;
    public final Pair<C1422890n8B, List<C1419590n2r>> LIZJ;
    public final C1423010n8N LIZLLL;
    public final C443120HZe<Boolean, C1419590n2r, Float> LJ;
    public final C375830EoP<Boolean> LJFF;
    public final C375830EoP<Integer> LJI;

    /* JADX WARN: Multi-variable type inference failed */
    public C1422810n83(C1DRG c1drg, TemplateCategoryData templateCategoryData, Pair<C1422890n8B, ? extends List<C1419590n2r>> pair, C1423010n8N c1423010n8N, C443120HZe<Boolean, C1419590n2r, Float> c443120HZe, C375830EoP<Boolean> c375830EoP, C375830EoP<Integer> c375830EoP2) {
        this.LIZ = c1drg;
        this.LIZIZ = templateCategoryData;
        this.LIZJ = pair;
        this.LIZLLL = c1423010n8N;
        this.LJ = c443120HZe;
        this.LJFF = c375830EoP;
        this.LJI = c375830EoP2;
    }

    public static C1422810n83 LIZ(C1422810n83 c1422810n83, Pair pair, C1423010n8N c1423010n8N, C443120HZe c443120HZe, C375830EoP c375830EoP, C375830EoP c375830EoP2, int i) {
        C1DRG c1drg;
        C375830EoP c375830EoP3 = c375830EoP2;
        C375830EoP c375830EoP4 = c375830EoP;
        C443120HZe c443120HZe2 = c443120HZe;
        C1423010n8N c1423010n8N2 = c1423010n8N;
        Pair pair2 = pair;
        TemplateCategoryData templateCategoryData = null;
        if ((i & 1) != 0) {
            c1drg = c1422810n83.LIZ;
        } else {
            c1drg = null;
        }
        if ((i & 2) != 0) {
            templateCategoryData = c1422810n83.LIZIZ;
        }
        if ((i & 4) != 0) {
            pair2 = c1422810n83.LIZJ;
        }
        if ((i & 8) != 0) {
            c1423010n8N2 = c1422810n83.LIZLLL;
        }
        if ((i & 16) != 0) {
            c443120HZe2 = c1422810n83.LJ;
        }
        if ((i & 32) != 0) {
            c375830EoP4 = c1422810n83.LJFF;
        }
        if ((i & 64) != 0) {
            c375830EoP3 = c1422810n83.LJI;
        }
        c1422810n83.getClass();
        return new C1422810n83(c1drg, templateCategoryData, pair2, c1423010n8N2, c443120HZe2, c375830EoP4, c375830EoP3);
    }
}
