package X;

import android.view.View;
import java.util.Comparator;

/* JADX INFO: renamed from: X.05Fn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1322505Fn<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((View) t2).getId()), Integer.valueOf(((View) t).getId()));
    }
}
