package X;

import android.view.MotionEvent;
import android.view.View;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import java.util.List;

/* JADX INFO: renamed from: X.0Pbd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C648190Pbd implements C0PTJ, C0PUC, InterfaceC648220Pbg {
    public final C648160Pba LL;
    public boolean LLILLJJLI;
    public boolean LLILLL;

    @Override // X.C0PUC
    public final SearchResultParam I() {
        return null;
    }

    @Override // X.C0PT8
    public final void I2(ISearchContextAbility iSearchContextAbility) {
    }

    @Override // X.InterfaceC648220Pbg
    public final void LIZ() {
        this.LLILLL = true;
    }

    @Override // X.InterfaceC648220Pbg
    public final void LIZIZ() {
        this.LLILLL = false;
    }

    @Override // X.InterfaceC648220Pbg
    public final void LIZJ() {
    }

    @Override // X.C0PTJ
    public final void LLIILZL() {
    }

    @Override // X.C0PUC
    public final void LLLILZLLLI(int i) {
    }

    @Override // X.C0PUC
    public final void LLLLLZ() {
    }

    @Override // X.C0PUC
    public final void LLZZ() {
    }

    @Override // X.C0PUC
    public final int k2() {
        return -1;
    }

    @Override // X.C0PUC
    public final void n4(MotionEvent motionEvent) {
    }

    @Override // X.C0PUC
    public final Aweme LJIIIIZZ() {
        List<Aweme> awemeList;
        Aweme aweme;
        DynamicPatch dynamicPatchLIZIZ = C647320PaE.LIZIZ(this.LL);
        if (dynamicPatchLIZIZ == null || (!(dynamicPatchLIZIZ.getOriginType() == 8 || dynamicPatchLIZIZ.getOriginType() == 20 || dynamicPatchLIZIZ.getOriginType() == 33) || (awemeList = dynamicPatchLIZIZ.getAwemeList()) == null || (aweme = (Aweme) C13LP.LJJJLL(awemeList)) == null)) {
            return null;
        }
        return aweme;
    }

    @Override // X.InterfaceC648220Pbg
    public final void bind() {
        C0PFZ c0pfz = C0PFZ.LIZ;
        DynamicPatch dynamicPatchLIZIZ = C647320PaE.LIZIZ(this.LL);
        List<Aweme> awemeList = dynamicPatchLIZIZ != null ? dynamicPatchLIZIZ.getAwemeList() : null;
        c0pfz.getClass();
        C0PFZ.LIZLLL(0, true, awemeList);
        this.LLILLJJLI = true;
    }

    @Override // X.C0PUC
    public final View getItemView() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.C0PUC
    public final int getViewType() {
        throw new Exception("use getItemViewType");
    }

    @Override // X.C0PT8
    public final C653660PkS l3() {
        C653660PkS c653660PkSLIZ = this.LL.LIZLLL.LIZ();
        return c653660PkSLIZ == null ? new C653660PkS() : c653660PkSLIZ;
    }

    @Override // X.C0PUC
    public final boolean LIZLLL() {
        return this.LLILLL;
    }

    @Override // X.C0PUC
    public final boolean LLLZZIL() {
        return this.LLILLJJLI;
    }

    public C648190Pbd(C648160Pba c648160Pba) {
        this.LL = c648160Pba;
    }

    @Override // X.C0PT8
    public final void LLLIL(C653660PkS c653660PkS) {
        this.LL.LIZLLL.LIZIZ(c653660PkS);
    }
}
