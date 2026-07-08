package X;

import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.ss.android.ugc.aweme.search.detail.adaption.SearchCellAdaptionComponent;
import com.ss.android.ugc.aweme.search.detail.keyframe.autoseek.utils.SearchDetailSeekComponent;
import com.ss.android.ugc.aweme.search.general.SearchDetailPlayComponent;
import com.ss.android.ugc.aweme.search.pages.middlepage.core.repo.signal.SearchIntermediateSignalComponent;

/* JADX INFO: renamed from: X.0QHN, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QHN implements InterfaceC1569760qx4 {
    public static final C0QHN LIZ = new C0QHN();

    @Override // X.InterfaceC1569760qx4
    public final C13IQ<? extends ReusedUIContentAssem<? extends C03H5>> LLFII() {
        return C13LE.LIZ(SearchCellAdaptionComponent.class);
    }

    @Override // X.InterfaceC1569760qx4
    public final C13IQ<? extends AbstractC738140SxQ> LLLIL() {
        return C13LE.LIZ(SearchDetailPlayComponent.class);
    }

    @Override // X.InterfaceC1569760qx4
    public final C13IQ<? extends AbstractC738140SxQ> LLZIL() {
        return C13LE.LIZ(SearchIntermediateSignalComponent.class);
    }

    @Override // X.InterfaceC1569760qx4
    public final C13IQ<? extends AbstractC738140SxQ> a() {
        return C13LE.LIZ(SearchDetailSeekComponent.class);
    }
}
