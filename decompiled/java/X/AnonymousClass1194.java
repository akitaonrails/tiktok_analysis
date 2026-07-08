package X;

import Y.ACListenerS131S0200000_29;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

/* JADX INFO: renamed from: X.1194, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public abstract class AnonymousClass1194<T, VH extends RecyclerView.ViewHolder> extends C0J8P<T, VH> {
    public final AnonymousClass1192 LIZIZ;
    public C194515118f LIZJ;

    /* JADX INFO: renamed from: X.1194$c */
    public class c extends RecyclerView.ViewHolder {
        public c(View view) {
            super(view);
        }
    }

    public AnonymousClass1194(AnonymousClass1192 anonymousClass1192) {
        this.LIZIZ = anonymousClass1192;
    }

    /* JADX INFO: renamed from: X.1194$a */
    public class a extends RecyclerView.ViewHolder {
        public a(AnonymousClass1194 anonymousClass1194, View view) {
            super(view);
            C786410Ut5.I7(new ACListenerS131S0200000_29(this, anonymousClass1194, 68), view);
        }
    }
}
