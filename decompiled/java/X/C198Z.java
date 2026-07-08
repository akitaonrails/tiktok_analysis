package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.SAFFragmentRootScene;

/* JADX INFO: renamed from: X.198Z, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C198Z implements C12WO {
    public final /* synthetic */ SAFFragmentRootScene LIZ;
    public final /* synthetic */ Fragment LIZIZ;
    public final /* synthetic */ int LIZJ;
    public final /* synthetic */ String[] LIZLLL;

    public C198Z(SAFFragmentRootScene sAFFragmentRootScene, Fragment fragment, int i, String[] strArr) {
        this.LIZ = sAFFragmentRootScene;
        this.LIZIZ = fragment;
        this.LIZJ = i;
        this.LIZLLL = strArr;
    }

    @Override // X.C12WO
    public final void LIZ(int[] iArr) {
        this.LIZ.LLLIILIL().LIZJ();
        Fragment fragment = this.LIZIZ;
        int i = this.LIZJ;
        String[] strArr = this.LIZLLL;
        if (iArr == null) {
            iArr = new int[0];
        }
        fragment.onRequestPermissionsResult(i, strArr, iArr);
    }
}
