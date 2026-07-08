package X;

import X.AbstractC999780c7k;
import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0c8b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public interface InterfaceC1000310c8b<T extends AbstractC999780c7k> extends InterfaceC990700bt6 {
    T LIZ(String str);

    int LJIIJ();

    boolean LJIIJJI(Aweme aweme);

    void LJIIL();

    String LJIILIIL();

    int LJIILJJIL();

    void LJIILL(Context context, Aweme aweme);

    @Override // X.InterfaceC990700bt6
    void LJIIZILJ(String str);

    int LJIJI();

    ConcurrentHashMap<String, T> LJIJJ();

    void LJIJJLI(WeakReference<Context> weakReference);

    WeakReference<Context> LJIL();

    void releaseAll();
}
