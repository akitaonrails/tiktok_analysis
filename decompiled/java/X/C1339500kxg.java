package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.0kxg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1339500kxg {
    public final C430440GuI LIZ;
    public final Fragment LIZIZ;
    public Comment LIZJ;
    public Aweme LIZLLL;
    public String LJ;
    public boolean LJFF;
    public C1339610kxr LJI;

    public C1339500kxg(C430440GuI c430440GuI, Fragment fragment) {
        this.LIZ = c430440GuI;
        this.LIZIZ = fragment;
    }

    public final void LIZ(String str, C430440GuI c430440GuI) {
        if (this.LJFF) {
            return;
        }
        if (str != null) {
            this.LJ = str;
        }
        this.LJI = new C1339610kxr(c430440GuI.getContext());
        this.LJFF = true;
    }
}
