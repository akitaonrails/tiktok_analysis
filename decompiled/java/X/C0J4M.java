package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: X.0J4M, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J4M extends LayoutInflater {
    public final Scene LIZ;
    public LayoutInflater LIZIZ;

    public final void LIZ() {
        if (this.LIZIZ != null) {
            return;
        }
        Scene scene = this.LIZ;
        this.LIZIZ = this.LIZ.requireActivity().getLayoutInflater().cloneInContext(scene.mThemeResource == 0 ? scene.requireActivity() : scene.requireSceneContext());
        LayoutInflater.Filter filter = getFilter();
        if (filter != null) {
            this.LIZIZ.setFilter(filter);
        }
        LayoutInflater.Factory2 factory2 = NxRewordManager.LJIILIIL ? (LayoutInflater.Factory2) C0J43.LIZ(this, true) : getFactory2();
        if (factory2 != null) {
            C786410Ut5.Vd(this.LIZIZ, factory2);
            return;
        }
        LayoutInflater.Factory factoryLIZ = NxRewordManager.LJIILIIL ? C0J43.LIZ(this, false) : getFactory();
        if (factoryLIZ != null) {
            C786410Ut5.Ud(this.LIZIZ, factoryLIZ);
        }
    }

    @Override // android.view.LayoutInflater
    public final LayoutInflater cloneInContext(Context context) {
        return new C0J4M(context, this.LIZ);
    }

    @Override // android.view.LayoutInflater
    public final void setFactory(LayoutInflater.Factory factory) {
        super.setFactory(factory);
        LayoutInflater layoutInflater = this.LIZIZ;
        if (layoutInflater != null) {
            C786410Ut5.Ud(layoutInflater, factory);
        }
    }

    @Override // android.view.LayoutInflater
    public final void setFactory2(LayoutInflater.Factory2 factory2) {
        super.setFactory2(factory2);
        LayoutInflater layoutInflater = this.LIZIZ;
        if (layoutInflater != null) {
            C786410Ut5.Vd(layoutInflater, factory2);
        }
    }

    public C0J4M(Context context, Scene scene) {
        super(context);
        this.LIZ = scene;
    }

    @Override // android.view.LayoutInflater
    public final View inflate(XmlPullParser xmlPullParser, ViewGroup viewGroup) {
        if (NxRewordManager.LJIILIIL) {
            C0J43.LIZIZ(this);
        }
        LIZ();
        LayoutInflater layoutInflater = this.LIZIZ;
        if (NxRewordManager.LJIILIIL) {
            C0J43.LIZIZ(layoutInflater);
        }
        return layoutInflater.inflate(xmlPullParser, viewGroup);
    }

    @Override // android.view.LayoutInflater
    public final View inflate(int i, ViewGroup viewGroup) {
        if (NxRewordManager.LJIILIIL) {
            C0J43.LIZIZ(this);
        }
        LIZ();
        return C786410Ut5.Sd(i, this.LIZIZ, viewGroup);
    }

    @Override // android.view.LayoutInflater
    public final View inflate(XmlPullParser xmlPullParser, ViewGroup viewGroup, boolean z) {
        if (NxRewordManager.LJIILIIL) {
            C0J43.LIZIZ(this);
        }
        LIZ();
        LayoutInflater layoutInflater = this.LIZIZ;
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
        LIZ();
        return C786410Ut5.Td(this.LIZIZ, i, viewGroup, z);
    }
}
