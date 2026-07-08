package X;

import Y.ACListenerS166S0100000_32;
import Y.ARunnableS131S0100000_31;
import Y.AsS35S0100000_8;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.sticker.ab.ChangeImagePickerUIExperiment;
import com.ss.android.ugc.aweme.sticker.ab.EffectUploadPickerFolderUIExperiment;
import com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.UploadPicStickerManager$initHandler$2;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.AwS611S0100000_32;
import kotlin.jvm.internal.AwS647S0100000_33;

/* JADX INFO: renamed from: X.18i4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21357418i4 implements InterfaceC21361518ij {
    public final View LIZ;
    public final View LIZIZ;
    public final View LIZJ;
    public final View LIZLLL;
    public final View LJ;
    public final View LJFF;
    public final View LJI;
    public final ViewGroup LJII;
    public final Function0<Boolean> LJIIIIZZ;
    public final Function0<Boolean> LJIIIZ;
    public final Activity LJIIJ;
    public final InterfaceC21358118iB LJIIJJI;
    public final InterfaceC212356188k LJIIL;
    public final Function1<Boolean, Unit> LJIILIIL;
    public final ViewGroup LJIILJJIL;
    public final C21356518hv LJIILL;
    public final Function1<Effect, Boolean> LJIILLIIL;
    public final C0N6I LJIIZILJ;
    public final ComposeView LJIJ;
    public final InterfaceC1624480sNK LJIJI;
    public final Function0<Unit> LJIJJ;
    public C1624230sMv LJIJJLI;
    public boolean LJIL;
    public final RecyclerView LJJ;
    public final View LJJI;
    public final View LJJIFFI;
    public final View LJJII;
    public final View LJJIII;
    public ArrayList<C21356918hz> LJJIIJ;
    public ArrayList<C1621190sI1> LJJIIJZLJL;
    public final C21355718hn LJJIIZ;
    public final C0KW4 LJJIIZI;
    public boolean LJJIJ;
    public Effect LJJIJIIJI;
    public final C01GW LJJIJIIJIL;

    @Override // X.InterfaceC21361518ij
    public final void LJIIJ() {
        LJJI(this, false);
        this.LJJIIZ.LLJIJIL = null;
        LJJ().LIZ().LJ();
        Function1<Boolean, Unit> function1 = this.LJIILIIL;
        if (function1 != null) {
            function1.invoke(Boolean.FALSE);
        }
    }

    @Override // X.InterfaceC21361518ij
    public final void LJIJ() {
        this.LJJIJ = true;
        C0KW4 c0kw4 = this.LJJIIZI;
        c0kw4.dismiss();
        C785410UrT.LIZ(c0kw4);
    }

    @Override // X.InterfaceC21361518ij
    public final void LIZ() {
        this.LJJIIZ.LLLIILIL();
        LJJ().LIZ().LJII();
    }

    @Override // X.InterfaceC21361518ij
    public final TextView LIZJ() {
        View view = this.LIZJ;
        if (view instanceof TextView) {
            return (TextView) view;
        }
        return null;
    }

    @Override // X.InterfaceC21361518ij
    public final void LJ() {
        C21355718hn c21355718hn = this.LJJIIZ;
        c21355718hn.LLLI();
        c21355718hn.notifyDataSetChanged();
        LJJ().LIZ().LIZLLL();
    }

    @Override // X.InterfaceC21361518ij
    public final int LJIIIZ() {
        return ((ArrayList) this.LJJIIZ.LLIZLLLIL).size();
    }

    @Override // X.InterfaceC21361518ij
    public final void LJIIL() {
        if (!this.LJIIJ.isFinishing()) {
            C0KW4 c0kw4 = this.LJJIIZI;
            if (c0kw4.isShowing()) {
                return;
            }
            C786410Ut5.P4(c0kw4);
            this.LJJIJ = false;
        }
    }

    @Override // X.InterfaceC21361518ij
    public final List<C1621190sI1> LJIILIIL() {
        return this.LJJIIZ.LLLIIIIL();
    }

    @Override // X.InterfaceC21361518ij
    public final void LJIILLIIL() {
        this.LJJIIZ.LLLILZLLLI();
    }

    @Override // X.InterfaceC21361518ij
    public final void LJIJJ() {
        C21355718hn c21355718hn = this.LJJIIZ;
        c21355718hn.LLIZ = null;
        int i = c21355718hn.LLILZIL;
        if (i >= 0) {
            c21355718hn.notifyItemChanged(i);
        }
        c21355718hn.LLILZIL = -1;
        LJJ().LIZ();
    }

    public final C21356418hu LJJ() {
        return (C21356418hu) this.LJJIJIIJIL.getValue();
    }

    @Override // X.InterfaceC21361518ij
    public final void clearData() {
        this.LJJIIZ.clearData();
        this.LJJIIZ.notifyDataSetChanged();
        if (ChangeImagePickerUIExperiment.isEnabled()) {
            C21357918i9.LIZ.clear();
        }
    }

    @Override // X.InterfaceC21361518ij
    public final void LIZIZ() {
        if (EffectUploadPickerFolderUIExperiment.isEnabled() && this.LJIL) {
            C21357918i9.LIZ(C21357918i9.LIZ, this.LJJIJIIJI, this.LJIIZILJ, this.LJIIJJI, null, "unfolded");
            C21357918i9.LIZLLL = C21357918i9.LIZIZ;
            this.LJIL = false;
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C21357718i7(this, null), 3);
        }
    }

    @Override // X.InterfaceC21361518ij
    public final void LIZLLL() {
        if (ChangeImagePickerUIExperiment.isEnabled()) {
            C21357918i9.LIZ(C21357918i9.LIZ, this.LJJIJIIJI, this.LJIIZILJ, this.LJIIJJI, null, "unfolded");
            C21357918i9.LIZLLL = C21357918i9.LIZIZ;
            this.LJIL = false;
            C786410Ut5.LLILZ(this.LJIJ, 8);
        }
    }

    @Override // X.InterfaceC21361518ij
    public final void LJIILL() {
        if (EffectUploadPickerFolderUIExperiment.isEnabled()) {
            C21357918i9.LIZ(C21357918i9.LIZ, this.LJJIJIIJI, this.LJIIZILJ, this.LJIIJJI, null, "folded");
            Function0<Unit> function0 = this.LJIJJ;
            if (function0 != null) {
                function0.invoke();
            }
            LJJ().LIZ().LJIIJJI(true);
            InterfaceC1624480sNK interfaceC1624480sNK = this.LJIJI;
            if (interfaceC1624480sNK != null) {
                interfaceC1624480sNK.LJJ(true);
            }
            this.LJIL = true;
            if (this.LJIIZILJ == C0N6I.PHOTO) {
                C1DFH c1dfh = C0PEM.LIZ;
                C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C21357518i5(this, null), 3);
                return;
            }
            C786410Ut5.LJLLLLLL(8, this.LIZ);
            this.LJIJ.setContent(new C19719212De(1298097766, new AwS647S0100000_33(this, 61), true));
            C786410Ut5.LLILZ(this.LJIJ, 0);
            ComposeView composeView = this.LJIJ;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(composeView);
            composeView.setAlpha(1.0f);
        }
    }

    @Override // X.InterfaceC21361518ij
    public final boolean LJIJJLI() {
        return LJJ().LIZ() instanceof C212354188i;
    }

    @Override // X.InterfaceC21361518ij
    public final View getRootView() {
        return this.LIZ;
    }

    @Override // X.InterfaceC21361518ij
    public final void LJFF(UploadPicStickerManager$initHandler$2 uploadPicStickerManager$initHandler$2) {
        if (uploadPicStickerManager$initHandler$2 == null || !(!this.LJIIJ.isFinishing()) || this.LJJIIZI.isShowing()) {
            return;
        }
        C786410Ut5.LJLIIL(300L, uploadPicStickerManager$initHandler$2, new ARunnableS131S0100000_31(this, 194));
    }

    @Override // X.InterfaceC21361518ij
    public final void LJIIIIZZ(boolean z) {
        this.LJJIIZ.LLJI = z;
    }

    @Override // X.InterfaceC21361518ij
    public final void LJIIJJI(String str) {
        InterfaceC21358118iB interfaceC21358118iB;
        boolean z;
        if (this.LIZ.getVisibility() == 0 && (interfaceC21358118iB = this.LJIIJJI) != null) {
            if (this.LJJII.getVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
            interfaceC21358118iB.LIZLLL(str, z);
        }
    }

    @Override // X.InterfaceC21361518ij
    public final void LJIILJJIL(List<C21356918hz> list) {
        ArrayList<C21356918hz> arrayListLIZ;
        if (((ArrayList) list).isEmpty()) {
            return;
        }
        if (EffectUploadPickerFolderUIExperiment.isEnabled() && (arrayListLIZ = C09HN.LIZ(list)) != null) {
            this.LJJIIJ = arrayListLIZ;
        }
        C21355718hn c21355718hn = this.LJJIIZ;
        ((ArrayList) c21355718hn.LLIZLLLIL).clear();
        ((ArrayList) c21355718hn.LLIZLLLIL).addAll(list);
        c21355718hn.LLLIILIL();
        c21355718hn.notifyDataSetChanged();
    }

    @Override // X.InterfaceC21361518ij
    public final void LJIIZILJ(List<C1621190sI1> list) {
        C21355718hn c21355718hn = this.LJJIIZ;
        c21355718hn.LLLI();
        c21355718hn.LLLFZ(list);
        c21355718hn.notifyDataSetChanged();
        LJJ().LIZ().LJI(list);
    }

    @Override // X.InterfaceC21361518ij
    public final void LJIL(C21356918hz c21356918hz) {
        C21355718hn c21355718hn = this.LJJIIZ;
        ((ArrayList) c21355718hn.LLIZLLLIL).add(c21356918hz);
        c21355718hn.notifyItemInserted(c21355718hn.getItemCount() - 1);
    }

    public static void LJJI(C21357418i4 c21357418i4, boolean z) {
        int i;
        Object parent;
        View view;
        if (!z && c21357418i4.LJIILL.LIZJ && c21357418i4.LIZ.getVisibility() == 0) {
            ViewGroup viewGroup = c21357418i4.LJII;
            if (viewGroup != null) {
                parent = viewGroup.getParent();
            } else {
                parent = null;
            }
            if ((parent instanceof RelativeLayout) && (view = (View) parent) != null) {
                view.setBackground(null);
            }
        }
        View view2 = c21357418i4.LIZ;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, view2);
    }

    @Override // X.InterfaceC21361518ij
    public final void LJI(Effect effect, boolean z) {
        this.LJJIJIIJI = effect;
        if (ChangeImagePickerUIExperiment.isEnabled() && effect != null) {
            C1630230sWb.LIZLLL = !C1449600npG.LJFF(effect);
            C1630230sWb.LIZJ = C1624200sMs.LIZLLL(effect);
        }
        C21356418hu c21356418huLJJ = LJJ();
        c21356418huLJJ.LJIJ = effect;
        c21356418huLJJ.LIZ().LJIIJ(effect, z);
    }

    @Override // X.InterfaceC21361518ij
    public final void LJII(String str, boolean z) {
        RecyclerView.LayoutManager layoutManager;
        int iLLLILZ = this.LJJIIZ.LLLILZ(str);
        LJJ().LIZ().LJIIIIZZ(str);
        if (z && iLLLILZ != -1 && (layoutManager = this.LJJ.getLayoutManager()) != null) {
            layoutManager.scrollToPosition(iLLLILZ);
        }
    }

    @Override // X.InterfaceC21361518ij
    public final void LJIJI(boolean z, C1624230sMv c1624230sMv, String str) {
        Boolean bool;
        InterfaceC21358118iB interfaceC21358118iB;
        int i;
        View view;
        this.LJIJJLI = c1624230sMv;
        C21356418hu c21356418huLJJ = LJJ();
        c21356418huLJJ.LJIIZILJ = c1624230sMv;
        c21356418huLJJ.LIZ().LJIIZILJ = c1624230sMv;
        C21355718hn c21355718hn = this.LJJIIZ;
        c21355718hn.LLILZLL = c1624230sMv;
        c21355718hn.LLJJ = this.LJJIJIIJI;
        c21355718hn.LLJIJIL = LJJ().LIZ().LIZIZ();
        this.LJJIIZ.getClass();
        if (!ChangeImagePickerUIExperiment.isEnabled() || !this.LJIL) {
            LJJI(this, true);
        }
        Function0<Boolean> function0 = this.LJIIIZ;
        int i2 = 0;
        if (function0 != null && function0.invoke().booleanValue()) {
            ViewGroup viewGroup = this.LJII;
            Object parent = null;
            if (viewGroup != null) {
                parent = viewGroup.getParent();
            }
            if ((parent instanceof RelativeLayout) && (view = (View) parent) != null) {
                C1213440hgM.LIZ(this.LJIIJ, view);
            }
        }
        if (!this.LJIL) {
            LJJ().LIZ().LJIIIZ(C21357918i9.LIZ.size());
        }
        boolean z2 = this.LJIILL.LIZIZ;
        View view2 = this.LJJIII;
        if (view2 != null) {
            if (z2) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, view2);
        }
        TuxIconView tuxIconView = (TuxIconView) this.LIZ.findViewById(R.id.ukv);
        if (ChangeImagePickerUIExperiment.isEnabled()) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_image_alt_1_fill;
            c419910GdJ.LIZLLL = -1;
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
            tuxIconView.setTuxIcon(c419910GdJ);
            this.LJJIFFI.setBackgroundResource(R.drawable.d5n);
        } else {
            C419910GdJ c419910GdJ2 = new C419910GdJ();
            c419910GdJ2.LIZ = R.drawable.c43;
            c419910GdJ2.LIZLLL = -1;
            c419910GdJ2.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            c419910GdJ2.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            tuxIconView.setTuxIcon(c419910GdJ2);
        }
        if (c1624230sMv != null && (bool = c1624230sMv.LJ) != null) {
            boolean zBooleanValue = bool.booleanValue();
            if (z && (interfaceC21358118iB = this.LJIIJJI) != null) {
                interfaceC21358118iB.LIZLLL(str, zBooleanValue);
            }
            View view3 = this.LJJII;
            if (!zBooleanValue) {
                i2 = 8;
            }
            C786410Ut5.LJLLLLLL(i2, view3);
        }
        Function1<Boolean, Unit> function1 = this.LJIILIIL;
        if (function1 != null) {
            function1.invoke(Boolean.TRUE);
        }
        InterfaceC21358118iB interfaceC21358118iB2 = this.LJIIJJI;
        if (interfaceC21358118iB2 != null) {
            Effect effect = this.LJJIJIIJI;
            if (effect != null) {
                effect.getEffect_id();
            }
            interfaceC21358118iB2.LJIIIZ();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [T, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView$LayoutManager] */
    public C21357418i4(View view, View view2, View view3, View view4, View view5, View view6, View view7, ViewGroup viewGroup, Function0 function0, Function0 function02, C19EG c19eg, InterfaceC21358118iB interfaceC21358118iB, C21361018ie c21361018ie, AwS604S0100000_25 awS604S0100000_25, ViewGroup viewGroup2, C21356518hv c21356518hv, Function1 function1, C0N6I c0n6i, ComposeView composeView, InterfaceC1624480sNK interfaceC1624480sNK, AwS576S0100000_32 awS576S0100000_32) {
        this.LIZ = view;
        this.LIZIZ = view2;
        this.LIZJ = view3;
        this.LIZLLL = view4;
        this.LJ = view5;
        this.LJFF = view6;
        this.LJI = view7;
        this.LJII = viewGroup;
        this.LJIIIIZZ = function0;
        this.LJIIIZ = function02;
        this.LJIIJ = c19eg;
        this.LJIIJJI = interfaceC21358118iB;
        this.LJIIL = c21361018ie;
        this.LJIILIIL = awS604S0100000_25;
        this.LJIILJJIL = viewGroup2;
        this.LJIILL = c21356518hv;
        this.LJIILLIIL = function1;
        this.LJIIZILJ = c0n6i;
        this.LJIJ = composeView;
        this.LJIJI = interfaceC1624480sNK;
        this.LJIJJ = awS576S0100000_32;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.mel);
        this.LJJ = recyclerView;
        this.LJJIIJ = new ArrayList<>();
        this.LJJIIJZLJL = new ArrayList<>();
        C21355718hn c21355718hn = new C21355718hn(c19eg, c21356518hv.LIZJ, new AwS611S0100000_32(this, 376), new C21525019Ls(this, 3));
        this.LJJIIZ = c21355718hn;
        this.LJJIIZI = new C0KW4(c19eg);
        this.LJJIJ = true;
        this.LJJIJIIJIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 823));
        if (recyclerView != 0) {
            C259800zU c259800zU = new C259800zU();
            ?? linearLayoutManager = new LinearLayoutManager(recyclerView.getContext(), 0, false);
            c259800zU.element = linearLayoutManager;
            recyclerView.setLayoutManager(linearLayoutManager);
            recyclerView.setAdapter(c21355718hn);
            ((AbstractC21674919sB) recyclerView.getItemAnimator()).LLIZ = false;
            recyclerView.addItemDecoration(new C422670Ghl());
            if (C522610KeZ.LIZ()) {
                recyclerView.addOnScrollListener(new AsS35S0100000_8(c259800zU, 8));
            }
        }
        View viewFindViewById = view.findViewById(R.id.lxf);
        this.LJJI = viewFindViewById;
        view.findViewById(R.id.xo_);
        C786410Ut5.I7(new ACListenerS166S0100000_32(this, 125), viewFindViewById);
        View viewFindViewById2 = view.findViewById(R.id.luk);
        this.LJJIFFI = viewFindViewById2;
        C0M31.LIZ(viewFindViewById2, new AwS576S0100000_32(this, 825));
        View viewFindViewById3 = view.findViewById(R.id.lil);
        this.LJJII = viewFindViewById3;
        C786410Ut5.I7(new ACListenerS166S0100000_32(this, 126), viewFindViewById3);
        View viewFindViewById4 = view.findViewById(R.id.lbw);
        this.LJJIII = viewFindViewById4;
        if (viewFindViewById4 != null) {
            C786410Ut5.I7(new ACListenerS166S0100000_32(this, 127), viewFindViewById4);
        }
        LJJI(this, false);
        LJJ().getClass();
    }
}
