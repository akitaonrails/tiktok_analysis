package X;

import android.util.SparseArray;
import android.view.View;

/* JADX INFO: renamed from: X.0S3D, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0S3D {
    public final View LIZ;
    public final SparseArray<View> LIZIZ = new SparseArray<>();

    public C0S3D(View view) {
        this.LIZ = view;
    }

    public final C0S3D LIZ(int i) {
        View view;
        View viewFindViewById = this.LIZIZ.get(i);
        if (viewFindViewById == null && (view = this.LIZ) != null) {
            viewFindViewById = view.findViewById(i);
        }
        this.LIZIZ.put(i, viewFindViewById);
        return new C0S3D(viewFindViewById);
    }
}
