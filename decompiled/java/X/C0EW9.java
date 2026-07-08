package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import java.util.ArrayList;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0EW9, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EW9 {
    public final C375830EoP<ArrayList<TikTokMediaModel>> LIZ;
    public final C375830EoP<Boolean> LIZIZ;
    public final ArrayList<Bitmap> LIZJ;
    public final C375830EoP<Unit> LIZLLL;
    public final String LJ;

    public C0EW9() {
        this(0);
    }

    public /* synthetic */ C0EW9(int i) {
        this(new C375830EoP(new ArrayList()), new C375830EoP(Boolean.FALSE), new ArrayList(), new C375830EoP(Unit.LIZ), "");
    }

    public C0EW9(C375830EoP<ArrayList<TikTokMediaModel>> c375830EoP, C375830EoP<Boolean> c375830EoP2, ArrayList<Bitmap> arrayList, C375830EoP<Unit> c375830EoP3, String str) {
        this.LIZ = c375830EoP;
        this.LIZIZ = c375830EoP2;
        this.LIZJ = arrayList;
        this.LIZLLL = c375830EoP3;
        this.LJ = str;
    }

    public static C0EW9 LIZ(C0EW9 c0ew9, C375830EoP c375830EoP, C375830EoP c375830EoP2, ArrayList arrayList, C375830EoP c375830EoP3, String str, int i) {
        String str2 = str;
        C375830EoP c375830EoP4 = c375830EoP3;
        ArrayList arrayList2 = arrayList;
        C375830EoP c375830EoP5 = c375830EoP2;
        C375830EoP c375830EoP6 = c375830EoP;
        if ((i & 1) != 0) {
            c375830EoP6 = c0ew9.LIZ;
        }
        if ((i & 2) != 0) {
            c375830EoP5 = c0ew9.LIZIZ;
        }
        if ((i & 4) != 0) {
            arrayList2 = c0ew9.LIZJ;
        }
        if ((i & 8) != 0) {
            c375830EoP4 = c0ew9.LIZLLL;
        }
        if ((i & 16) != 0) {
            str2 = c0ew9.LJ;
        }
        c0ew9.getClass();
        return new C0EW9(c375830EoP6, c375830EoP5, arrayList2, c375830EoP4, str2);
    }
}
