package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0qIV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1544610qIV implements InterfaceC634840OvC {
    public final Map<Class<?>, InterfaceC1544640qIY<?>> LIZ = new LinkedHashMap();
    public WeakReference<View> LIZIZ;
    public WeakReference<Activity> LIZJ;
    public String LIZLLL;
    public InterfaceC1544650qIZ LJ;
    public WeakReference<C1543410qGZ> LJFF;

    @Override // X.InterfaceC634840OvC
    public final C1543410qGZ LIZJ() {
        WeakReference<C1543410qGZ> weakReference = this.LJFF;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // X.InterfaceC634840OvC
    public final Activity LIZLLL() {
        return (Activity) new WeakReference(C0XS4.LIZ(getContext())).get();
    }

    @Override // X.InterfaceC634840OvC
    public final Context getContext() {
        View view;
        Context context;
        WeakReference<View> weakReference = this.LIZIZ;
        return (weakReference == null || (view = weakReference.get()) == null || (context = view.getContext()) == null) ? (Context) LIZIZ(Context.class) : context;
    }

    @Override // X.InterfaceC634840OvC
    public final View getView() {
        View view;
        WeakReference<View> weakReference = this.LIZIZ;
        return (weakReference == null || (view = weakReference.get()) == null) ? (View) LIZIZ(View.class) : view;
    }

    @Override // X.InterfaceC634840OvC
    public final String getContainerID() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC634840OvC
    public final <T> T LIZIZ(Class<T> cls) {
        InterfaceC1544640qIY interfaceC1544640qIY = (InterfaceC1544640qIY) ((LinkedHashMap) this.LIZ).get(cls);
        if (interfaceC1544640qIY != null) {
            return (T) interfaceC1544640qIY.LIZ();
        }
        return null;
    }

    public final void LJFF(C1543410qGZ c1543410qGZ) {
        WeakReference<C1543410qGZ> weakReference = this.LJFF;
        if (weakReference == null || weakReference.get() == null) {
            this.LJFF = new WeakReference<>(c1543410qGZ);
        }
    }

    public final void LJI(Activity activity) {
        WeakReference<Activity> weakReference = this.LIZJ;
        if (weakReference == null || weakReference.get() == null) {
            this.LIZJ = new WeakReference<>(activity);
        }
    }

    public final <T> void LIZ(Class<T> cls, T t) {
        this.LIZ.put(cls, new C1544630qIX(t));
    }

    public final <T> void LJ(Class<T> cls, T t) {
        this.LIZ.put(cls, new C1544620qIW(t));
    }

    @Override // X.InterfaceC634840OvC
    public final void sendEvent(String str, JSONObject jSONObject) {
        InterfaceC1544650qIZ interfaceC1544650qIZ = this.LJ;
        if (interfaceC1544650qIZ != null) {
            interfaceC1544650qIZ.LIZ(str, jSONObject);
        }
    }
}
