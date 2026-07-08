package X;

import com.ss.android.ugc.aweme.dot.BaseRedDotImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.friendstab.model.NewContentResponse;
import com.ss.android.ugc.aweme.friendstab.model.SingleTabCounter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0rOV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1586770rOV implements InterfaceC1586780rOW {
    public final InterfaceC1586780rOW LL;

    @Override // X.InterfaceC1586780rOW
    public final ArrayList<Integer> LIZ() {
        return this.LL.LIZ();
    }

    @Override // X.InterfaceC1584770rLH
    public final void LIZIZ(String str, String str2) {
        this.LL.LIZIZ(str, str2);
    }

    @Override // X.InterfaceC1586780rOW
    public final void LIZJ() {
        this.LL.LIZJ();
    }

    @Override // X.InterfaceC1586780rOW
    public final CopyOnWriteArrayList<SingleTabCounter> LIZLLL() {
        return this.LL.LIZLLL();
    }

    @Override // X.InterfaceC1586780rOW
    public final void LJ(Aweme aweme, List list) {
        this.LL.LJ(aweme, list);
    }

    @Override // X.InterfaceC1586780rOW
    public final void LJFF(Throwable th, EnumC1586970rOp enumC1586970rOp) {
        this.LL.LJFF(th, enumC1586970rOp);
    }

    @Override // X.InterfaceC1586780rOW
    public final void LJI(boolean z) {
        this.LL.LJI(z);
    }

    @Override // X.InterfaceC1586780rOW
    public final void LJII() {
        this.LL.LJII();
    }

    @Override // X.InterfaceC1586780rOW
    public final C1582080rGw LJIIIIZZ() {
        return this.LL.LJIIIIZZ();
    }

    @Override // X.InterfaceC1586780rOW
    public final ArrayList<Integer> LJIIIZ() {
        return this.LL.LJIIIZ();
    }

    @Override // X.InterfaceC1586780rOW
    public final void LJIIJ(NewContentResponse newContentResponse, EnumC1586970rOp enumC1586970rOp) {
        this.LL.LJIIJ(newContentResponse, enumC1586970rOp);
    }

    @Override // X.InterfaceC1586780rOW
    public final C1586930rOl LJIIJJI() {
        return this.LL.LJIIJJI();
    }

    @Override // X.InterfaceC1586780rOW
    public final void LJIIL(String str, String str2) {
        this.LL.LJIIL(str, str2);
    }

    @Override // X.InterfaceC1586780rOW
    public final ArrayList LJIILIIL() {
        return this.LL.LJIILIIL();
    }

    @Override // X.InterfaceC1586780rOW
    public final InterfaceC1584860rLQ LJIILJJIL() {
        return this.LL.LJIILJJIL();
    }

    @Override // X.InterfaceC1586780rOW
    public final void LJIILL(String str) {
        this.LL.LJIILL(str);
    }

    @Override // X.InterfaceC1586780rOW
    public final ArrayList<Integer> LJIILLIIL(String str) {
        return this.LL.LJIILLIIL(str);
    }

    @Override // X.InterfaceC1586780rOW
    public final boolean LJIIZILJ() {
        return this.LL.LJIIZILJ();
    }

    @Override // X.InterfaceC1586780rOW
    public final Pair<Boolean, String> LJIJ(EnumC1586970rOp enumC1586970rOp) {
        return this.LL.LJIJ(enumC1586970rOp);
    }

    @Override // X.InterfaceC1586780rOW
    public final int LJIJI(String str) {
        return this.LL.LJIJI(str);
    }

    @Override // X.InterfaceC1586780rOW
    public final CopyOnWriteArrayList<SingleTabCounter> LJIJJ() {
        return this.LL.LJIJJ();
    }

    @Override // X.InterfaceC1586780rOW
    public final boolean LJIJJLI() {
        return this.LL.LJIJJLI();
    }

    @Override // X.InterfaceC1586780rOW
    public final int LJIL(String str) {
        return this.LL.LJIL(str);
    }

    @Override // X.InterfaceC1586780rOW
    public final C1587230rPF getSocialTabNoticeData() {
        return this.LL.getSocialTabNoticeData();
    }

    @Override // X.InterfaceC1586780rOW
    public final void removeRedDotByUid(String str, EnumC1392960mLu enumC1392960mLu) {
        this.LL.removeRedDotByUid(str, enumC1392960mLu);
    }

    public C1586770rOV(BaseRedDotImpl baseRedDotImpl) {
        this.LL = baseRedDotImpl;
    }
}
