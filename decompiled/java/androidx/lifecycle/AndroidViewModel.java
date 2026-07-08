package androidx.lifecycle;

import android.app.Application;

/* JADX INFO: loaded from: classes31.dex */
public class AndroidViewModel extends ViewModel {
    public final Application application;

    public <T extends Application> T getApplication() {
        return (T) this.application;
    }

    public AndroidViewModel(Application application) {
        this.application = application;
    }
}
