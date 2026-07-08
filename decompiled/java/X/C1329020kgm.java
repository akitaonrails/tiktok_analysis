package X;

import Y.AComparatorS39S0000000_20;
import android.content.Context;
import java.io.File;

/* JADX INFO: renamed from: X.0kgm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1329020kgm {
    public InterfaceC1320070kSL<File> LIZIZ;
    public InterfaceC1335510krF LJ;
    public InterfaceC1331280kkQ LJFF;
    public InterfaceC1320070kSL<File> LJI;
    public final Context LJII;
    public String LIZ = "image_cache";
    public long LIZJ = 41943040;
    public final C1335620krQ LIZLLL = new InterfaceC1335630krR() { // from class: X.0krQ
        @Override // X.InterfaceC1335630krR
        public final AComparatorS39S0000000_20 get() {
            return new AComparatorS39S0000000_20(9);
        }
    };

    public final C1329030kgn LIZ() {
        C1322350kW1.LJ("Either a non-null context or a base directory path or supplier must be provided.", (this.LIZIZ == null && this.LJII == null) ? false : true);
        if (this.LIZIZ == null && this.LJII != null) {
            this.LIZIZ = new InterfaceC1320070kSL<File>() { // from class: X.0kgp
                @Override // X.InterfaceC1320070kSL
                public final File get() {
                    return C786410Ut5.w2(C786410Ut5.N3(this.LIZ.LJII));
                }
            };
        }
        if (this.LJI == null && this.LJII != null) {
            this.LJI = this.LIZIZ;
        }
        return new C1329030kgn(this);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0krQ] */
    public C1329020kgm(Context context) {
        this.LJII = context;
    }
}
