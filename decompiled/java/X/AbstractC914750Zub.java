package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Zub, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public abstract class AbstractC914750Zub {
    public final long LIZ;
    public final Map<String, Rect> LIZIZ;
    public final WeakReference<SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB> LIZJ;
    public C0IEU LIZLLL;
    public Pair<Rect, Bitmap> LJ;

    public abstract void LIZ();

    public abstract void LIZIZ(SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);

    public AbstractC914750Zub(SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, long j, Map<String, Rect> map) {
        this.LIZ = j;
        this.LIZIZ = map;
        this.LIZJ = new WeakReference<>(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
    }
}
