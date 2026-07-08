package X;

import android.app.Application;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0Vqk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C810440Vqk {
    public final Application LIZ;
    public boolean LIZIZ;
    public String LIZJ;
    public C810460Vqm LIZLLL;
    public InterfaceC808700Vnw LJFF;
    public InterfaceC810510Vqr LJI;
    public C810470Vqn LJII;
    public InterfaceC809260Voq LJIIIIZZ;
    public C818800WAc LJIIIZ;
    public InterfaceC808710Vnx LJIIJ;
    public InterfaceC809250Vop LJIIJJI;
    public C810500Vqq LJIIL;
    public final C809240Voo LJIILIIL;
    public InterfaceC809060VoW LJIILJJIL;
    public boolean LJIILL;
    public final List<InterfaceC808630Vnp> LJ = new ArrayList();
    public final long LJIILLIIL = TimeUnit.MINUTES.toMillis(2);

    public final void LIZ(String str) {
        if (!this.LIZIZ) {
        } else {
            throw new IllegalArgumentException(str);
        }
    }

    public C810440Vqk(Application application, C809240Voo c809240Voo) {
        this.LIZ = application;
        this.LJIILIIL = c809240Voo;
    }
}
