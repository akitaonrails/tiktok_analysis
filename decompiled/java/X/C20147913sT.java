package X;

import X.AbstractC20147813sS;
import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: renamed from: X.13sT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C20147913sT<D> {
    public int LIZ;
    public InterfaceC20148413sY<D> LIZIZ;
    public final Context LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public boolean LJFF = true;
    public boolean LJI;
    public boolean LJII;

    public final void LIZ() {
        AbstractC20147813sS abstractC20147813sS = (AbstractC20147813sS) this;
        if (abstractC20147813sS.LJIIIZ != null) {
            if (!abstractC20147813sS.LIZLLL) {
                abstractC20147813sS.LJI = true;
            }
            if (abstractC20147813sS.LJIIJ != null) {
                abstractC20147813sS.LJIIIZ.getClass();
                abstractC20147813sS.LJIIIZ = null;
                return;
            }
            abstractC20147813sS.LJIIIZ.getClass();
            AbstractC20147813sS<D>.a aVar = abstractC20147813sS.LJIIIZ;
            aVar.LLILZ.set(true);
            if (aVar.LLILLJJLI.cancel(false)) {
                abstractC20147813sS.LJIIJ = abstractC20147813sS.LJIIIZ;
                abstractC20147813sS.LJIIIIZZ();
            }
            abstractC20147813sS.LJIIIZ = null;
        }
    }

    public void LIZJ(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        throw null;
    }

    public final void LIZLLL() {
        AbstractC20147813sS abstractC20147813sS = (AbstractC20147813sS) this;
        abstractC20147813sS.LIZ();
        abstractC20147813sS.LJIIIZ = new AbstractC20147813sS.a();
        abstractC20147813sS.LJIIIZ();
    }

    public void LJFF() {
    }

    public void LJI() {
        throw null;
    }

    public void LJII() {
    }

    public void LJ() {
        if (this.LIZLLL) {
            LIZLLL();
        } else {
            this.LJI = true;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        C08P7.LIZ(this, sb);
        sb.append(" id=");
        sb.append(this.LIZ);
        sb.append("}");
        return sb.toString();
    }

    /* JADX INFO: renamed from: X.13sT$a */
    public final class a extends ContentObserver {
        @Override // android.database.ContentObserver
        public final boolean deliverSelfNotifications() {
            return true;
        }

        public a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public final void onChange(boolean z) {
            C20147913sT.this.LJ();
        }
    }

    public C20147913sT(Context context) {
        this.LIZJ = C786410Ut5.N3(context);
    }

    public void LIZIZ(D d) {
        InterfaceC20148413sY<D> interfaceC20148413sY = this.LIZIZ;
        if (interfaceC20148413sY != null) {
            interfaceC20148413sY.onLoadComplete(this, d);
        }
    }
}
