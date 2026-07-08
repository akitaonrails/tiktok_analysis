package X;

import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import ge.i;
import java.util.HashSet;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS214S0300000_5;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0FKz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C388470FKz extends i<InterfaceC384330F5b, C388420FKu, C388440FKw, C0FL1> implements InterfaceC379610EuV, InterfaceC384330F5b {
    public static final int LLJJJJJIL = 8;
    public final FrameLayout LLJILJILJ;
    public final FrameLayout LLJILLL;
    public final C0FKI LLJJ;
    public final C1DRG LLJJI;
    public final C01GW LLJJIII;
    public final Function0<C388420FKu> LLJJIJI;
    public final Function0<C388440FKw> LLJJIJIIJIL;
    public final Function0<C0FL1> LLJJIJIL;
    public final C385670FAf<TextStickerModel> LLJJJ;
    public final C385670FAf<C0FHM> LLJJJIL;
    public HashSet<InterfaceC385510F9p> LLJJJJ;

    @Override // X.InterfaceC384330F5b
    public boolean EA(TextStickerModel textStickerModel) {
        return false;
    }

    @Override // X.InterfaceC384330F5b
    public void hP2() {
    }

    @Override // X.InterfaceC384330F5b
    public boolean ps1() {
        return false;
    }

    public final C388420FKu F4() {
        return (C388420FKu) this.LLJJIII.getValue();
    }

    @Override // X.InterfaceC384330F5b
    public void u0() {
        i3(AFwS234S0000000_5.get$arr$(439));
    }

    @Override // X.InterfaceC384330F5b, X.C0FEF
    public boolean onBackPressed() {
        C0FWO api;
        C388170FJv c388170FJv = F4().LLJJJJLIIL;
        if (c388170FJv == null || (api = c388170FJv.getApi()) == null) {
            return false;
        }
        return api.onBackPressed();
    }

    @Override // ge.i
    public Function0<C388420FKu> E3() {
        return this.LLJJIJI;
    }

    @Override // X.InterfaceC384330F5b
    public C385670FAf<C0FHM> S1() {
        return this.LLJJJIL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJJI;
    }

    @Override // X.InterfaceC384330F5b
    public C385670FAf<TextStickerModel> j4() {
        return this.LLJJJ;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C388440FKw> o2() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C0FL1> w2() {
        return this.LLJJIJIL;
    }

    @Override // X.InterfaceC384330F5b
    public void hQ0(InterfaceC385510F9p interfaceC385510F9p) {
        this.LLJJJJ.remove(interfaceC385510F9p);
    }

    @Override // X.InterfaceC384330F5b
    public void mp1(InterfaceC385510F9p interfaceC385510F9p) {
        this.LLJJJJ.add(interfaceC385510F9p);
    }

    @Override // X.InterfaceC384330F5b, X.C0FF7
    public void LLZLI(TextStickerModel textStickerModel, C388340FKm c388340FKm, C390420FSm c390420FSm, C0FSC c0fsc) {
        i3(new AwS214S0300000_5(textStickerModel, c390420FSm, c0fsc, 31));
        show();
    }

    public C388470FKz(FrameLayout frameLayout, FrameLayout frameLayout2, C0FKI c0fki, C19A3 c19a3, C1DRG c1drg) {
        super(c19a3);
        this.LLJILJILJ = frameLayout;
        this.LLJILLL = frameLayout2;
        this.LLJJ = c0fki;
        this.LLJJI = c1drg;
        this.LLJJIII = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1121));
        this.LLJJIJI = new AwS549S0100000_5(this, 1123);
        this.LLJJIJIIJIL = AFwS191S0000000_5.get$arr$(310);
        this.LLJJIJIL = new AwS549S0100000_5(this, 1122);
        this.LLJJJ = Z1(new C2217381BqS() { // from class: X.0FKx
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C388440FKw) obj).LIZ;
            }
        });
        this.LLJJJIL = Z1(new C2217381BqS() { // from class: X.0FKy
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C388440FKw) obj).LIZJ;
            }
        });
        this.LLJJJJ = new HashSet<>();
    }
}
