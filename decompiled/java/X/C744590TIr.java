package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.tools.music.avoidonresult.AvoidOnResultFragment;

/* JADX INFO: renamed from: X.0TIr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C744590TIr {
    public final AvoidOnResultFragment LIZ;

    public C744590TIr(C19EG c19eg) {
        AvoidOnResultFragment avoidOnResultFragment;
        if (c19eg != null) {
            Fragment fragmentLJJJJZI = c19eg.getSupportFragmentManager().LJJJJZI("AvoidOnResult");
            if (fragmentLJJJJZI == null || (avoidOnResultFragment = (AvoidOnResultFragment) fragmentLJJJJZI) == null) {
                avoidOnResultFragment = new AvoidOnResultFragment();
                FragmentManager supportFragmentManager = c19eg.getSupportFragmentManager();
                C19EH c19ehLJIIJ = supportFragmentManager.LJIIJ();
                c19ehLJIIJ.LIZLLL(avoidOnResultFragment, "AvoidOnResult");
                c19ehLJIIJ.LJIIJ();
                supportFragmentManager.LJJJJL();
            }
            this.LIZ = avoidOnResultFragment;
        }
    }
}
