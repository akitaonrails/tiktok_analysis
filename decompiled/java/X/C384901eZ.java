package X;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.01eZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C384901eZ {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.01eY, android.database.ContentObserver] */
    public static final Object LIZ(final ContentResolver contentResolver, Uri uri, final Function1 function1, AbstractC23140094w abstractC23140094w) {
        final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(abstractC23140094w));
        c2252611DEt.LJIJJ();
        final BPEAHandler bPEAHandler = new BPEAHandler(Looper.getMainLooper());
        ?? r2 = new ContentObserver(bPEAHandler) { // from class: X.01eY
            @Override // android.database.ContentObserver
            public final void onChange(boolean z) {
                super.onChange(z);
                if (c2252611DEt.isActive()) {
                    C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C383601eM(function1, c2252611DEt, null), 2);
                    contentResolver.unregisterContentObserver(this);
                }
            }
        };
        contentResolver.registerContentObserver(uri, false, r2);
        c2252611DEt.LJJII(new C020W(contentResolver, (C384801eY) r2, 87));
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(abstractC23140094w);
        }
        return objLJIJ;
    }
}
