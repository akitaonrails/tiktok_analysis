package X;

import com.bytedance.android.starship.trace.span.Span;

/* JADX INFO: renamed from: X.0k7W, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public interface InterfaceC1307160k7W extends AutoCloseable {
    String LJIJI();

    void LJJIJIL(String str, String str2);

    void LJJJLIIL(String str);

    Object LJJLIIIIJ();

    InterfaceC1307160k7W LJJLIIIJJIZ();

    void LJJLIIIJLLLLLLLZ(Number number, String str);

    void LJLL(String str, String str2);

    void LJLLI(Span span);

    void LLIIIILZ(String str, Object obj);

    InterfaceC1307160k7W LLIIIZ(String str);

    @Override // java.lang.AutoCloseable
    void close();

    Object get();

    String getTraceId();

    void release();
}
