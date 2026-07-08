package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;

/* JADX INFO: renamed from: X.0J9j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C487370J9j extends LayoutInflater {
    public final Context LIZ;

    public C487370J9j(Context context) {
        super(C786410Ut5.ne(context), context);
        this.LIZ = context;
    }

    @Override // android.view.LayoutInflater
    public final LayoutInflater cloneInContext(Context context) {
        return C786410Ut5.ne(context);
    }

    @Override // android.view.LayoutInflater
    public final View inflate(int i, ViewGroup viewGroup, boolean z) {
        if (NxRewordManager.LJIILIIL) {
            C0J43.LIZIZ(this);
        }
        return C20742916Ex.LIZ(this.LIZ, i, viewGroup, z, -1);
    }
}
