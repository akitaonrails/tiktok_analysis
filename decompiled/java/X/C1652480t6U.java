package X;

import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS622S0100000_8;
import kotlin.jvm.internal.AwS674S0100000_25;

/* JADX INFO: renamed from: X.0t6U, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1652480t6U {
    public final C19EG LIZ;
    public final Function2<MusicModel, Long, Unit> LIZIZ;
    public final InterfaceC1631620sYq<String, MusicModel, String, Unit> LIZJ;
    public final Function2<MusicModel, Exception, Unit> LIZLLL;
    public final Function0<Unit> LJ;
    public final C1652490t6V LJFF = new InterfaceC20500715Jt() { // from class: X.0t6V
        @Override // X.InterfaceC20500715Jt
        public final void LLJLLIL() {
        }

        @Override // X.InterfaceC20500715Jt
        public final void LJI() {
            this.LIZ.getClass();
        }

        @Override // X.InterfaceC20500715Jt
        public final C19EG LLILLL() {
            return this.LIZ.LIZ;
        }

        @Override // X.InterfaceC20500715Jt
        public final void v2() {
            Function0<Unit> function0 = this.LIZ.LJ;
            if (function0 != null) {
                function0.invoke();
            }
        }

        @Override // X.InterfaceC20500715Jt
        public final void J2(MusicModel musicModel, long j) {
            Function2<MusicModel, Long, Unit> function2 = this.LIZ.LIZIZ;
            if (function2 != null) {
                function2.invoke(musicModel, Long.valueOf(j));
            }
        }

        @Override // X.InterfaceC20500715Jt
        public final void LLJILJILJ(MusicModel musicModel, Exception exc) {
            Function2<MusicModel, Exception, Unit> function2 = this.LIZ.LIZLLL;
            if (function2 != null) {
                function2.invoke(musicModel, exc);
            }
        }

        @Override // X.InterfaceC20500715Jt
        public final void LLJJL(MusicModel musicModel, String str, String str2) {
            InterfaceC1631620sYq<String, MusicModel, String, Unit> interfaceC1631620sYq = this.LIZ.LIZJ;
            if (interfaceC1631620sYq != null) {
                interfaceC1631620sYq.invoke(str, musicModel, str2);
            }
        }
    };
    public final C01GW LJI = C452501pT.LIZIZ(new AwS569S0100000_25(this, 542));

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0t6V] */
    public C1652480t6U(C19EG c19eg, AFwS311S0000000_25 aFwS311S0000000_25, AwS674S0100000_25 awS674S0100000_25, AwS622S0100000_8 awS622S0100000_8, AwS569S0100000_25 awS569S0100000_25) {
        this.LIZ = c19eg;
        this.LIZIZ = aFwS311S0000000_25;
        this.LIZJ = awS674S0100000_25;
        this.LIZLLL = awS622S0100000_8;
        this.LJ = awS569S0100000_25;
    }
}
