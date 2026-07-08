package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.atomic.AtomicBoolean;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: X.0J4N, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J4N extends LayoutInflater {
    public static final AtomicBoolean LJI = new AtomicBoolean(false);
    public static final AtomicBoolean LJII = new AtomicBoolean(false);
    public final LayoutInflater LIZ;
    public View LIZIZ;
    public View LIZJ;
    public final AtomicBoolean LIZLLL;
    public final AtomicBoolean LJ;
    public final C01GW LJFF;

    @Override // android.view.LayoutInflater
    public final Context getContext() {
        return this.LIZ.getContext();
    }

    @Override // android.view.LayoutInflater
    public final LayoutInflater.Filter getFilter() {
        return this.LIZ.getFilter();
    }

    @Override // android.view.LayoutInflater
    public final LayoutInflater cloneInContext(Context context) {
        return new C0J4N(context, this.LIZ.cloneInContext(context));
    }

    @Override // android.view.LayoutInflater
    public final void setFactory(LayoutInflater.Factory factory) {
        LayoutInflater layoutInflater;
        if (this.LIZLLL.compareAndSet(false, true) && factory != null && (layoutInflater = this.LIZ) != null) {
            C786410Ut5.Ud(layoutInflater, factory);
            super.setFactory(factory);
        }
    }

    @Override // android.view.LayoutInflater
    public final void setFactory2(LayoutInflater.Factory2 factory2) {
        LayoutInflater layoutInflater;
        if (this.LJ.compareAndSet(false, true) && factory2 != null && (layoutInflater = this.LIZ) != null) {
            C786410Ut5.Vd(layoutInflater, factory2);
            super.setFactory2(factory2);
        }
    }

    @Override // android.view.LayoutInflater
    public final void setFilter(LayoutInflater.Filter filter) {
        LayoutInflater layoutInflater = this.LIZ;
        if (layoutInflater != null) {
            layoutInflater.setFilter(filter);
        }
        super.setFilter(filter);
    }

    public C0J4N(Context context, LayoutInflater layoutInflater) {
        super(layoutInflater, context);
        this.LIZ = layoutInflater;
        this.LIZLLL = new AtomicBoolean(false);
        this.LJ = new AtomicBoolean(false);
        this.LJFF = C452501pT.LIZIZ(new C0J4O(this));
    }

    @Override // android.view.LayoutInflater
    public final View inflate(int i, ViewGroup viewGroup) {
        View view;
        if (NxRewordManager.LJIILIIL) {
            C0J43.LIZIZ(this);
        }
        if (i == ((Number) this.LJFF.getValue()).intValue() && LJI.compareAndSet(false, true)) {
            View view2 = this.LIZIZ;
            if (view2 != null) {
                this.LIZIZ = null;
                return view2;
            }
        } else if (i == R.layout.hz && LJII.compareAndSet(false, true) && (view = this.LIZJ) != null) {
            this.LIZJ = null;
            return view;
        }
        return C786410Ut5.Sd(i, this.LIZ, viewGroup);
    }

    @Override // android.view.LayoutInflater
    public final View inflate(XmlPullParser xmlPullParser, ViewGroup viewGroup) {
        if (NxRewordManager.LJIILIIL) {
            C0J43.LIZIZ(this);
        }
        LayoutInflater layoutInflater = this.LIZ;
        if (NxRewordManager.LJIILIIL) {
            C0J43.LIZIZ(layoutInflater);
        }
        return layoutInflater.inflate(xmlPullParser, viewGroup);
    }

    @Override // android.view.LayoutInflater
    public final View inflate(XmlPullParser xmlPullParser, ViewGroup viewGroup, boolean z) {
        if (NxRewordManager.LJIILIIL) {
            C0J43.LIZIZ(this);
        }
        LayoutInflater layoutInflater = this.LIZ;
        if (NxRewordManager.LJIILIIL) {
            C0J43.LIZIZ(layoutInflater);
        }
        return layoutInflater.inflate(xmlPullParser, viewGroup, z);
    }

    @Override // android.view.LayoutInflater
    public final View inflate(int i, ViewGroup viewGroup, boolean z) {
        if (NxRewordManager.LJIILIIL) {
            C0J43.LIZIZ(this);
        }
        return C786410Ut5.Td(this.LIZ, i, viewGroup, z);
    }
}
