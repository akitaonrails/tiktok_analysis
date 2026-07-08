package X;

import android.content.Context;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0n4B, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1420410n4B {
    public final String LIZ;
    public final Context LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public volatile int LJFF;
    public volatile EnumC1420450n4F LJI;
    public volatile AVMusic LJII;
    public volatile Exception LJIIIIZZ;
    public volatile EnumC1420450n4F LJIIIZ;
    public volatile Pair<? extends List<C0EQL>, C05WK> LJIIJ;
    public volatile String LJIIJJI;
    public volatile int LJIIL;
    public volatile EnumC1420440n4E LJIILIIL;
    public final CopyOnWriteArrayList<InterfaceC1437705jz<AVMusic>> LJIILJJIL;
    public final C099F LJIILL;
    public final C099F LJIILLIIL;
    public AnonymousClass0956 LJIIZILJ;
    public volatile boolean LJIJ;

    public C1420410n4B(Context context, String str, String str2, String str3, String str4) {
        this.LIZ = str;
        this.LIZIZ = context;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = str4;
        EnumC1420450n4F enumC1420450n4F = EnumC1420450n4F.LL;
        this.LJI = enumC1420450n4F;
        this.LJIIIZ = enumC1420450n4F;
        this.LJIILIIL = EnumC1420440n4E.LL;
        this.LJIILJJIL = new CopyOnWriteArrayList<>();
        this.LJIILL = C090F.LIZIZ();
        this.LJIILLIIL = C090F.LIZIZ();
    }
}
