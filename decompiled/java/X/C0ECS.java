package X;

import android.view.ViewGroup;
import com.ss.android.ugc.gamora.editorpro.capabilities.effects.videoanim.ui.VideoAnimFragment;
import kotlin.jvm.internal.AwS371S0200000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ECS, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0ECS implements C0ECT {
    public boolean LIZ;
    public final /* synthetic */ VideoAnimFragment LIZIZ;
    public final /* synthetic */ C360680ECc LIZJ;

    public C0ECS(VideoAnimFragment videoAnimFragment, C360680ECc c360680ECc) {
        this.LIZIZ = videoAnimFragment;
        this.LIZJ = c360680ECc;
    }

    @Override // X.C0ECT
    public final C0EBQ LIZ(C357590E0f c357590E0f, ViewGroup viewGroup) {
        boolean z;
        C19EG c19egRequireActivity = this.LIZIZ.requireActivity();
        C0E48 c0e48 = this.LIZIZ.LL;
        if (this.LIZJ.getCategoryList().size() > 1) {
            z = true;
        } else {
            z = false;
        }
        String str = c357590E0f.LIZIZ;
        if (str == null) {
            str = "";
        }
        C0EBQ c0ebq = new C0EBQ(viewGroup, c19egRequireActivity, c0e48, z, str, this.LIZIZ.LLLFFI);
        if (Intrinsics.LJFF(c357590E0f.LIZIZ, this.LIZIZ.LLLIZZ)) {
            c0ebq.LJIIJJI = true;
        }
        c0ebq.LJIIL = new AwS371S0200000_5(this, this.LIZIZ, 238);
        return c0ebq;
    }
}
