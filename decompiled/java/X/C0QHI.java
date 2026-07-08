package X;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.google.gson.e;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.ISearchContextService;
import com.ss.android.ugc.aweme.search.ISearchServiceLowEnd;
import com.ss.android.ugc.aweme.search.entry.visualsearch.ability.VisualSearchTagAbility;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.source.neo.IMusicSearchContextAbility;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0QHI, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public abstract class C0QHI implements ISearchServiceLowEnd, InterfaceC1355760lNu, InterfaceC1611110s1l, InterfaceC1586210rNb, InterfaceC1584170rKJ, InterfaceC1570140qxg, InterfaceC1571010qz5, InterfaceC1604910rrl, InterfaceC1386380mBI, InterfaceC1601620rmS, C0O85, InterfaceC1600790rl7, InterfaceC634440OuY, InterfaceC20290714aP, C14SH, InterfaceC1569760qx4, InterfaceC688200Qz4, InterfaceC302520BtS, InterfaceC20267614Sc, InterfaceC1386220mB2, ISearchContextService {
    public final /* synthetic */ C0QHM LIZ = C0QHM.LIZ;
    public final /* synthetic */ C0QHC LIZIZ = C0QHC.LIZ;
    public final /* synthetic */ C1828307Eb LIZJ = C1828307Eb.LIZ;
    public final /* synthetic */ C0QHW LIZLLL = C0QHW.LIZ;
    public final /* synthetic */ C0QE5 LJ = C0QE5.LIZ;
    public final /* synthetic */ C0QHA LJFF = C0QHA.LIZ;
    public final /* synthetic */ C669510QNx LJI = C669510QNx.LIZ;
    public final /* synthetic */ C0QHQ LJII = C0QHQ.LIZ;
    public final /* synthetic */ C0QHK LJIIIIZZ = C0QHK.LIZ;
    public final /* synthetic */ C0QHU LJIIIZ = C0QHU.LIZ;
    public final /* synthetic */ C0QHR LJIIJ = C0QHR.LIZ;
    public final /* synthetic */ C0QHJ LJIIJJI = C0QHJ.LIZ;
    public final /* synthetic */ C0QDU LJIIL = C0QDU.LIZ;
    public final /* synthetic */ C2340209Ey LJIILIIL = C2340209Ey.LIZ;
    public final /* synthetic */ C0QHN LJIILJJIL = C0QHN.LIZ;
    public final /* synthetic */ C0QHS LJIILL = C0QHS.LIZ;
    public final /* synthetic */ C0QHV LJIILLIIL = C0QHV.LIZ;
    public final /* synthetic */ C0QHO LJIIZILJ = C0QHO.LIZ;
    public final /* synthetic */ C0QHL LJIJ = C0QHL.LIZ;
    public final /* synthetic */ C0PW0 LJIJI = C0PW0.LIZIZ;

    @Override // com.ss.android.ugc.aweme.search.ISearchContextService
    public final ISearchContextAbility A() {
        return this.LJIJI.A();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchContextService
    public final ISearchContextAbility A0(LifecycleOwner lifecycleOwner) {
        return this.LJIJI.A0(lifecycleOwner);
    }

    @Override // X.InterfaceC634440OuY
    public final C13IQ<? extends ReusedUIContentAssem<? extends C03H5>> C0() {
        return this.LJIIJJI.C0();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchContextService
    public final ISearchContextAbility D(Aweme aweme) {
        return this.LJIJI.D(aweme);
    }

    @Override // X.InterfaceC1604910rrl
    public final String D0() {
        return this.LJI.D0();
    }

    @Override // X.InterfaceC1386380mBI
    public final boolean F() {
        return this.LJII.F();
    }

    @Override // X.InterfaceC1355760lNu
    public final void G(String str, boolean z) {
        this.LIZ.G(str, z);
    }

    @Override // X.InterfaceC1604910rrl
    public final Long L() {
        return this.LJI.L();
    }

    @Override // X.InterfaceC1611110s1l
    public final String L0() {
        return this.LIZIZ.L0();
    }

    @Override // X.InterfaceC634440OuY
    public final void LJI(String str, String str2, String str3, String str4, boolean z) {
        this.LJIIJJI.LJI(str, str2, str3, str4, z);
    }

    @Override // X.InterfaceC1570140qxg
    public final void LJII() {
        this.LJ.LJII();
    }

    @Override // X.InterfaceC20290714aP
    public final boolean LJIIIIZZ(Context context) {
        return this.LJIIL.LJIIIIZZ(context);
    }

    @Override // X.InterfaceC1571010qz5
    public final void LJIIL(boolean z) {
        this.LJFF.LJIIL(z);
    }

    @Override // X.C0O85
    public final String LJIILJJIL() {
        this.LJIIIZ.getClass();
        return "https://search.tiktokv.com";
    }

    @Override // X.InterfaceC1600790rl7
    public final boolean LJIILL(Aweme aweme) {
        return this.LJIIJ.LJIILL(aweme);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchContextService
    public final Boolean LJIILLIIL() {
        return this.LJIJI.LJIILLIIL();
    }

    @Override // X.InterfaceC634440OuY
    public final boolean LJIIZILJ() {
        return this.LJIIJJI.LJIIZILJ();
    }

    @Override // X.InterfaceC1611110s1l
    public final boolean LJIL() {
        return this.LIZIZ.LJIL();
    }

    @Override // X.InterfaceC1586210rNb
    public final boolean LJJ() {
        return this.LIZJ.LJJ();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchContextService
    public final ISearchContextAbility LJJI() {
        return this.LJIJI.LJJI();
    }

    @Override // X.InterfaceC1611110s1l
    public final void LJLLLL() {
        this.LIZIZ.LJLLLL();
    }

    @Override // X.InterfaceC1569760qx4
    public final C13IQ<? extends ReusedUIContentAssem<? extends C03H5>> LLFII() {
        return this.LJIILJJIL.LLFII();
    }

    @Override // X.InterfaceC634440OuY
    public final boolean LLI() {
        return this.LJIIJJI.LLI();
    }

    @Override // X.InterfaceC634440OuY
    public final VisualSearchTagAbility LLIL(InterfaceC665370Q7z interfaceC665370Q7z) {
        return this.LJIIJJI.LLIL(interfaceC665370Q7z);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchContextService
    public final ISearchContextAbility LLJJI(Object obj) {
        return this.LJIJI.LLJJI(obj);
    }

    @Override // X.InterfaceC688200Qz4
    public final boolean LLJJJJ() {
        return this.LJIILL.LLJJJJ();
    }

    @Override // X.InterfaceC1601620rmS
    public final void LLLIIII(List<? extends Aweme> list, boolean z) {
        this.LJIIIIZZ.LLLIIII(list, z);
    }

    @Override // X.InterfaceC1569760qx4
    public final C13IQ<? extends AbstractC738140SxQ> LLLIL() {
        return this.LJIILJJIL.LLLIL();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchContextService
    public final IMusicSearchContextAbility LLLLII(LifecycleOwner lifecycleOwner) {
        return this.LJIJI.LLLLII(lifecycleOwner);
    }

    @Override // X.InterfaceC1355760lNu
    public final void LLLLIILL(String str, String str2, String str3, String str4, boolean z) {
        this.LIZ.LLLLIILL(str, str2, str3, str4, z);
    }

    @Override // X.InterfaceC1386220mB2
    public final boolean LLLLIILLL(Aweme aweme) {
        return this.LJIJ.LLLLIILLL(aweme);
    }

    @Override // X.InterfaceC1586210rNb
    public final boolean LLLLLJLJLL() {
        return this.LIZJ.LLLLLJLJLL();
    }

    @Override // X.C14SH
    public final void LLLZZ(e eVar) {
        this.LJIILIIL.LLLZZ(eVar);
    }

    @Override // X.InterfaceC1569760qx4
    public final C13IQ<? extends AbstractC738140SxQ> LLZIL() {
        return this.LJIILJJIL.LLZIL();
    }

    @Override // X.InterfaceC1386220mB2
    public final boolean LLZL(Aweme aweme) {
        return this.LJIJ.LLZL(aweme);
    }

    @Override // X.InterfaceC1601620rmS
    public final void LLZZ(boolean z) {
        this.LJIIIIZZ.LLZZ(z);
    }

    @Override // X.InterfaceC302520BtS
    public final void LLZZLLIL() {
        this.LJIILLIIL.getClass();
    }

    @Override // X.InterfaceC1611110s1l
    public final void P() {
        this.LIZIZ.P();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchContextService
    public final ISearchContextAbility P0() {
        return this.LJIJI.P0();
    }

    @Override // X.InterfaceC1586210rNb
    public final boolean Q0() {
        return this.LIZJ.Q0();
    }

    @Override // X.InterfaceC1569760qx4
    public final C13IQ<? extends AbstractC738140SxQ> a() {
        return this.LJIILJJIL.a();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchContextService
    public final ISearchContextAbility d0(View view) {
        return this.LJIJI.d0(view);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchContextService
    public final ISearchContextAbility l(InterfaceC2753014t interfaceC2753014t) {
        return this.LJIJI.l(interfaceC2753014t);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchContextService
    public final ISearchContextAbility p0(SearchResultParam searchResultParam) {
        return this.LJIJI.p0(searchResultParam);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchContextService
    public final IMusicSearchContextAbility r() {
        return this.LJIJI.r();
    }

    @Override // X.InterfaceC1611110s1l
    public final void v0(Function0<Unit> function0) {
        this.LIZIZ.v0(function0);
    }

    @Override // X.InterfaceC20267614Sc
    public final void x0(int i, String str, C0QHX c0qhx, long j) {
        this.LJIIZILJ.x0(i, str, c0qhx, j);
    }

    @Override // X.InterfaceC1600790rl7
    public final C0PI6 LJJII() {
        this.LJIIJ.getClass();
        return C656640PpG.LIZ;
    }

    @Override // X.InterfaceC1584170rKJ
    public final boolean LJL() {
        this.LIZLLL.getClass();
        return true;
    }

    @Override // X.InterfaceC1611110s1l
    public final boolean LLIIIZ() {
        this.LIZIZ.getClass();
        return C0QS0.LIZ();
    }
}
