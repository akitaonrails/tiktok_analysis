package X;

import android.widget.FrameLayout;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.share.dislike.ChooseItemViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.15mz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20623515mz {
    public final FrameLayout LIZ;
    public boolean LIZIZ;
    public Function1<? super Boolean, Unit> LIZJ;
    public final ChooseItemViewModel LIZLLL;
    public final int LJ = 61;
    public final int LJFF = 41;

    public C20623515mz(C19GS c19gs, FrameLayout frameLayout) {
        this.LIZ = frameLayout;
        this.LIZLLL = (ChooseItemViewModel) ViewModelProviders.of(c19gs).get(ChooseItemViewModel.class);
    }
}
