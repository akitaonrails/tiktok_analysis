package X;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.io.Closeable;

/* JADX INFO: renamed from: X.0VLF, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public interface C0VLF extends Closeable {
    void LJIIIIZZ();

    InterfaceC796340VLs LJIIJJI(String str);

    void LJIILJJIL(String str);

    void LJJII();

    void LJJIIZ();

    void LJJIIZI();

    boolean LJJIJIIJI();

    void LJJJJIZL(String str, Object[] objArr);

    Cursor LJLJJL(C0VOJ c0voj, CancellationSignal cancellationSignal);

    Cursor LJLLLL(C0VOJ c0voj);

    boolean LLIIJLIL();

    boolean isOpen();

    Cursor query(String str);
}
