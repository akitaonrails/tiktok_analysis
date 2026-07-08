package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editor.toolbar.EditToolbarViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS210S0000000_22;

/* JADX INFO: renamed from: X.0o7O, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1460840o7O extends AbstractC1643610ssB<EditToolbarViewModel> implements InterfaceC379610EuV {
    public final C1DRG LLIZ;
    public final C19A3 LLIZLLLIL;
    public final VideoPublishEditModel LLJI;
    public final int LLJ = R.id.gsr;
    public final AFwS210S0000000_22 LLJIJIL = AFwS210S0000000_22.get$arr$(271);

    @Override // X.AbstractC1643600ssA
    public final void o2() {
    }

    @Override // X.AbstractC1643600ssA, X.AbstractC2255721DQs
    public final void onCreate() {
        super.onCreate();
        this.LLIZLLLIL.add(this.LLJ, C1441980ncy.LIZIZ(this.LLJI) ? new C1459960o5y(this.LLIZ) : new C1459970o5z(this.LLIZ), "EditSideToolbarComponent");
    }

    @Override // X.AbstractC1643600ssA
    public final Function0<EditToolbarViewModel> W1() {
        return this.LLJIJIL;
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLIZ;
    }

    @Override // X.AbstractC1643600ssA
    public final C19A3 getParentScene() {
        return this.LLIZLLLIL;
    }

    public C1460840o7O(C1DRG c1drg, C19A3 c19a3, VideoPublishEditModel videoPublishEditModel) {
        this.LLIZ = c1drg;
        this.LLIZLLLIL = c19a3;
        this.LLJI = videoPublishEditModel;
    }
}
