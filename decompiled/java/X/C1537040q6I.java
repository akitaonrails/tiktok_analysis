package X;

import android.content.Context;
import java.io.File;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: X.0q6I, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1537040q6I {
    public InterfaceC1504290pFT LIZ;
    public List<String> LIZIZ;
    public List<String> LIZJ;
    public final Context LIZLLL;
    public InterfaceC1551450qTX LJ;
    public C1551290qTH LJFF;
    public Long LJI;
    public String LJII;
    public String LJIIIIZZ;
    public String LJIIIZ;
    public File LJIIJ;
    public String LJIIJJI;
    public boolean LJIIL;

    public C1537040q6I(Context context) {
        this.LIZLLL = C786410Ut5.N3(context);
    }

    public final void LIZ(String... strArr) {
        if (strArr.length >= 1) {
            this.LIZIZ = Arrays.asList(strArr);
        }
    }

    public final void LIZIZ(String... strArr) {
        if (strArr != null && strArr.length >= 1) {
            this.LIZJ = Arrays.asList(strArr);
        }
    }

    public final void LIZJ(long j) {
        this.LJI = Long.valueOf(j);
    }
}
