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
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.sticker.ab.ChangeImagePickerUIExperiment;
import com.ss.android.ugc.aweme.sticker.ab.EffectUploadPickerFolderUIExperiment;
import com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.UploadPicStickerManager$initHandler$2;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS611S0100000_32;
import kotlin.jvm.internal.AwS647S0100000_33;

/* JADX INFO: renamed from: X.18i3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21357318i3 implements InterfaceC21361518ij {
    public final View LIZ;
    public final View LIZIZ;
    public final View LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final View LJFF;
    public final View LJI;
    public final View LJII;
    public final View LJIIIIZZ;
    public final ViewGroup LJIIIZ;
    public final Function0<Boolean> LJIIJ;
    public final Function0<Boolean> LJIIJJI;
    public final Activity LJIIL;
    public final InterfaceC21358118iB LJIILIIL;
    public final InterfaceC212356188k LJIILJJIL;
    public final Function1<Boolean, Unit> LJIILL;
    public final C0N6I LJIILLIIL;
    public final ComposeView LJIIZILJ;
    public final InterfaceC1624480sNK LJIJ;
    public final Function0<Unit> LJIJI;
    public final InterfaceC21358218iC LJIJJ;
    public final InterfaceC21358718iH LJIJJLI;
    public C1624230sMv LJIL;
    public boolean LJJ;
    public final RecyclerView LJJI;
    public final View LJJIFFI;
    public final View LJJII;
    public final View LJJIII;
    public final View LJJIIJ;
    public ArrayList<C21356918hz> LJJIIJZLJL;
    public ArrayList<C1621190sI1> LJJIIZ;
    public final C21355718hn LJJIIZI;
    public final C0KW4 LJJIJ;
    public boolean LJJIJIIJI;
    public boolean LJJIJIIJIL;
    public Effect LJJIJIL;

    @Override // X.InterfaceC21361518ij
    public final void LJIIJ() {
        View view;
        LJJIII(this, false);
        if (this.LIZLLL) {
            LJJI();
        } else {
            View view2 = this.LIZJ;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(8, view2);
            }
            Function0<Boolean> function0 = this.LJIIJ;
            if (function0 != null && function0.invoke().booleanValue() && (view = this.LIZIZ) != null) {
                C786410Ut5.LJLLLLLL(0, view);
            }
        }
        Function1<Boolean, Unit> function1 = this.LJIILL;
        if (function1 != null) {
            function1.invoke(Boolean.FALSE);
        }
    }

    @Override // X.InterfaceC21361518ij
    public final void LJIJ() {
        this.LJJIJIIJI = true;
        C0KW4 c0kw4 = this.LJJIJ;
        c0kw4.dismiss();
        C785410UrT.LIZ(c0kw4);
    }

    @Override // X.InterfaceC21361518ij
    public final boolean LJIJJLI() {
        return false;
    }

    @Override // X.InterfaceC21361518ij
    public final void LIZ() {
        this.LJJIIZI.LLLIILIL();
        if (this.LJJIJIIJIL) {
            HandlerHook.viewPost(this.LJJI, new ARunnableS131S0100000_31(this, 195));
        }
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
        C21355718hn c21355718hn = this.LJJIIZI;
        c21355718hn.LLLI();
        c21355718hn.notifyDataSetChanged();
        View viewLJJ = LJJ();
        if (viewLJJ != null) {
            C786410Ut5.T4(viewLJJ, 0.4f);
        }
    }

    @Override // X.InterfaceC21361518ij
    public final int LJIIIZ() {
        return ((ArrayList) this.LJJIIZI.LLIZLLLIL).size();
    }

    @Override // X.InterfaceC21361518ij
    public final void LJIIL() {
        if (!this.LJIIL.isFinishing()) {
            C0KW4 c0kw4 = this.LJJIJ;
            if (c0kw4.isShowing()) {
                return;
            }
            C786410Ut5.P4(c0kw4);
            this.LJJIJIIJI = false;
        }
    }

    @Override // X.InterfaceC21361518ij
    public final List<C1621190sI1> LJIILIIL() {
        return this.LJJIIZI.LLLIIIIL();
    }

    @Override // X.InterfaceC21361518ij
    public final void LJIILLIIL() {
        this.LJJIIZI.LLLILZLLLI();
    }

    @Override // X.InterfaceC21361518ij
    public final void LJIJJ() {
        C21355718hn c21355718hn = this.LJJIIZI;
        c21355718hn.LLIZ = null;
        int i = c21355718hn.LLILZIL;
        if (i >= 0) {
            c21355718hn.notifyItemChanged(i);
        }
        c21355718hn.LLILZIL = -1;
    }

    public final View LJJ() {
        return this.LIZLLL ? this.LJI : this.LIZJ;
    }

    @Override // X.InterfaceC21361518ij
    public final void clearData() {
        this.LJJIIZI.clearData();
        this.LJJIIZI.notifyDataSetChanged();
    }

    @Override // X.InterfaceC21361518ij
    public final void LIZIZ() {
        if (EffectUploadPickerFolderUIExperiment.isEnabled() && this.LJJ) {
            C21357918i9.LIZ(C21357918i9.LIZ, this.LJJIJIL, this.LJIILLIIL, this.LJIILIIL, this.LJIJJ, "unfolded");
            C21357918i9.LIZLLL = C21357918i9.LIZIZ;
            this.LJJ = false;
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C21357818i8(this, null), 3);
        }
    }

    @Override // X.InterfaceC21361518ij
    public final void LIZLLL() {
        if (ChangeImagePickerUIExperiment.isEnabled()) {
            C21357918i9.LIZ(C21357918i9.LIZ, this.LJJIJIL, this.LJIILLIIL, this.LJIILIIL, this.LJIJJ, "unfolded");
            C21357918i9.LIZLLL = C21357918i9.LIZIZ;
            this.LJJ = false;
            C786410Ut5.LLILZ(this.LJIIZILJ, 8);
        }
    }

    @Override // X.InterfaceC21361518ij
    public final void LJIILL() {
        if (EffectUploadPickerFolderUIExperiment.isEnabled()) {
            C21357918i9.LIZ(C21357918i9.LIZ, this.LJJIJIL, this.LJIILLIIL, this.LJIILIIL, this.LJIJJ, "folded");
            Function0<Unit> function0 = this.LJIJI;
            if (function0 != null) {
                function0.invoke();
            }
            View viewLJJ = LJJ();
            if (viewLJJ != null) {
                C786410Ut5.LJLLLLLL(8, viewLJJ);
            }
            InterfaceC1624480sNK interfaceC1624480sNK = this.LJIJ;
            if (interfaceC1624480sNK != null) {
                interfaceC1624480sNK.LJJ(true);
            }
            this.LJJ = true;
            if (this.LJIILLIIL == C0N6I.PHOTO) {
                C1DFH c1dfh = C0PEM.LIZ;
                C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C21357618i6(this, null), 3);
                return;
            }
            C786410Ut5.LJLLLLLL(8, this.LIZ);
            this.LJIIZILJ.setContent(new C19719212De(-38913050, new AwS647S0100000_33(this, 58), true));
            C786410Ut5.LLILZ(this.LJIIZILJ, 0);
            ComposeView composeView = this.LJIIZILJ;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(composeView);
            composeView.setAlpha(1.0f);
        }
    }

    public final void LJJI() {
        View viewLJJ = LJJ();
        if (viewLJJ != null) {
            C786410Ut5.LJLLLLLL(8, viewLJJ);
        }
        View view = this.LJIIIIZZ;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        this.LIZ.setBackgroundResource(R.drawable.ac6);
        ViewGroup viewGroup = this.LJIIIZ;
        ViewGroup.LayoutParams layoutParams = viewGroup != null ? viewGroup.getLayoutParams() : null;
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.rightMargin = 0;
        }
        ViewGroup viewGroup2 = this.LJIIIZ;
        if (viewGroup2 != null) {
            C786410Ut5.X5(marginLayoutParams, viewGroup2);
        }
        this.LJJIJIIJIL = false;
    }

    public final void LJJIFFI() {
        View viewLJJ = LJJ();
        if (viewLJJ != null) {
            C786410Ut5.LJLLLLLL(0, viewLJJ);
        }
        View view = this.LJIIIIZZ;
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
        this.LIZ.setBackgroundResource(R.drawable.ac7);
        ViewGroup viewGroup = this.LJIIIZ;
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        ViewGroup.LayoutParams layoutParams = viewGroup != null ? viewGroup.getLayoutParams() : null;
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.rightMargin = (int) C11VU.LIZIZ(50.0f, this.LJIIL);
        }
        ViewGroup viewGroup2 = this.LJIIIZ;
        if (viewGroup2 != null) {
            C786410Ut5.X5(marginLayoutParams, viewGroup2);
        }
    }

    @Override // X.InterfaceC21361518ij
    public final View getRootView() {
        return this.LIZ;
    }

    @Override // X.InterfaceC21361518ij
    public final void LJFF(UploadPicStickerManager$initHandler$2 uploadPicStickerManager$initHandler$2) {
        if (uploadPicStickerManager$initHandler$2 == null || !(!this.LJIIL.isFinishing()) || this.LJJIJ.isShowing()) {
            return;
        }
        C786410Ut5.LJLIIL(300L, uploadPicStickerManager$initHandler$2, new ARunnableS131S0100000_31(this, 196));
    }

    @Override // X.InterfaceC21361518ij
    public final void LJIIIIZZ(boolean z) {
        this.LJJIIZI.LLJI = z;
    }

    @Override // X.InterfaceC21361518ij
    public final void LJIIJJI(String str) {
        InterfaceC21358118iB interfaceC21358118iB;
        boolean z;
        if (this.LIZ.getVisibility() == 0 && (interfaceC21358118iB = this.LJIILIIL) != null) {
            if (this.LJJIII.getVisibility() == 0) {
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
        if (list.isEmpty()) {
            return;
        }
        if (EffectUploadPickerFolderUIExperiment.isEnabled() && (arrayListLIZ = C09HN.LIZ(list)) != null) {
            this.LJJIIJZLJL = arrayListLIZ;
        }
        C21355718hn c21355718hn = this.LJJIIZI;
        ((ArrayList) c21355718hn.LLIZLLLIL).clear();
        ((ArrayList) c21355718hn.LLIZLLLIL).addAll(list);
        c21355718hn.LLLIILIL();
        c21355718hn.notifyDataSetChanged();
    }

    @Override // X.InterfaceC21361518ij
    public final void LJIIZILJ(List<C1621190sI1> list) {
        int i;
        C21355718hn c21355718hn = this.LJJIIZI;
        c21355718hn.LLLI();
        c21355718hn.LLLFZ(list);
        c21355718hn.notifyDataSetChanged();
        int iLLLII = c21355718hn.LLLII();
        C1624230sMv c1624230sMv = this.LJIL;
        if (c1624230sMv != null) {
            i = c1624230sMv.LIZJ;
        } else {
            i = 0;
        }
        if (iLLLII >= i) {
            View viewLJJ = LJJ();
            if (viewLJJ != null) {
                C786410Ut5.T4(viewLJJ, 1.0f);
                return;
            }
            return;
        }
        View viewLJJ2 = LJJ();
        if (viewLJJ2 == null) {
            return;
        }
        C786410Ut5.T4(viewLJJ2, 0.4f);
    }

    @Override // X.InterfaceC21361518ij
    public final void LJIL(C21356918hz c21356918hz) {
        C21355718hn c21355718hn = this.LJJIIZI;
        ((ArrayList) c21355718hn.LLIZLLLIL).add(c21356918hz);
        c21355718hn.notifyItemInserted(c21355718hn.getItemCount() - 1);
    }

    public final void LJJII(String str) {
        RecyclerView recyclerView = this.LJJI;
        C21355718hn c21355718hn = this.LJJIIZI;
        int size = ((ArrayList) c21355718hn.LLIZLLLIL).size();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (str.equals(((C21356918hz) ListProtector.get(c21355718hn.LLIZLLLIL, i2)).LIZIZ)) {
                i = i2;
                break;
            }
            i2++;
        }
        recyclerView.scrollToPosition(i);
    }

    public static void LJJIII(C21357318i3 c21357318i3, boolean z) {
        int i;
        View view = c21357318i3.LIZ;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, view);
    }

    @Override // X.InterfaceC21361518ij
    public final void LJI(final Effect effect, boolean z) {
        this.LJJIJIL = effect;
        if (ChangeImagePickerUIExperiment.isEnabled() && effect != null) {
            C1630230sWb.LIZLLL = !C1449600npG.LJFF(effect);
            C1630230sWb.LIZJ = C1624200sMs.LIZLLL(effect);
        }
        if (z) {
            View viewLJJ = LJJ();
            if (viewLJJ != null) {
                C786410Ut5.I7(null, viewLJJ);
                return;
            }
            return;
        }
        final View viewLJJ2 = LJJ();
        if (viewLJJ2 != null) {
            C786410Ut5.I7(new View.OnClickListener(viewLJJ2, this, effect) { // from class: X.18hx
                public final /* synthetic */ View LL;
                public final /* synthetic */ C21357318i3 LLILLJJLI;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C21357318i3 c21357318i3;
                    InterfaceC212356188k interfaceC212356188k;
                    if (this.LL.getAlpha() == 1.0f && (interfaceC212356188k = (c21357318i3 = this.LLILLJJLI).LJIILJJIL) != null) {
                        interfaceC212356188k.LJFF(c21357318i3.LJJIIZI.LLLIIIIL());
                    }
                    ArrayList arrayList = new ArrayList(((LinkedHashMap) this.LLILLJJLI.LJJIIZI.LLJ).keySet());
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : arrayList) {
                        if (((C21356918hz) obj).LJI == 2) {
                            arrayList2.add(obj);
                        }
                    }
                    arrayList2.isEmpty();
                    if (!arrayList.isEmpty()) {
                    }
                    C21357318i3 c21357318i32 = this.LLILLJJLI;
                    InterfaceC21358118iB interfaceC21358118iB = c21357318i32.LJIILIIL;
                    if (interfaceC21358118iB != null) {
                        ((ArrayList) c21357318i32.LJJIIZI.LLLIIIIL()).size();
                        interfaceC21358118iB.onComplete();
                    }
                }
            }, viewLJJ2);
        }
    }

    @Override // X.InterfaceC21361518ij
    public final void LJII(String str, boolean z) {
        RecyclerView.LayoutManager layoutManager;
        int iLLLILZ = this.LJJIIZI.LLLILZ(str);
        if (z && iLLLILZ != -1 && (layoutManager = this.LJJI.getLayoutManager()) != null) {
            layoutManager.scrollToPosition(iLLLILZ);
        }
    }

    @Override // X.InterfaceC21361518ij
    public final void LJIJI(boolean z, C1624230sMv c1624230sMv, String str) {
        boolean z2;
        View view;
        Boolean bool;
        InterfaceC21358118iB interfaceC21358118iB;
        int i;
        float f;
        View view2;
        this.LJIL = c1624230sMv;
        C21355718hn c21355718hn = this.LJJIIZI;
        c21355718hn.LLILZLL = c1624230sMv;
        c21355718hn.LLJJ = this.LJJIJIL;
        c21355718hn.getClass();
        boolean z3 = true;
        if (!ChangeImagePickerUIExperiment.isEnabled() || !this.LJJ) {
            LJJIII(this, true);
        }
        Function0<Boolean> function0 = this.LJIIJJI;
        int i2 = 0;
        if (function0 != null && function0.invoke().booleanValue()) {
            ViewGroup viewGroup = this.LJIIIZ;
            Object parent = null;
            if (viewGroup != null) {
                parent = viewGroup.getParent();
            }
            if ((parent instanceof RelativeLayout) && (view2 = (View) parent) != null) {
                C1213440hgM.LIZ(this.LJIIL, view2);
            }
        }
        if (c1624230sMv != null && c1624230sMv.LIZIZ) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (this.LIZLLL) {
                if (this.LJJIJIIJIL) {
                    LJJIFFI();
                    z3 = false;
                }
                this.LJJIJIIJIL = z3;
            } else {
                View view3 = this.LIZJ;
                if (view3 != null) {
                    C786410Ut5.LJLLLLLL(0, view3);
                }
                View view4 = this.LIZIZ;
                if (view4 != null) {
                    C786410Ut5.LJLLLLLL(8, view4);
                }
            }
            View viewLJJ = LJJ();
            if (viewLJJ != null) {
                if (this.LJJIIZI.LLLII() >= c1624230sMv.LIZJ) {
                    f = 1.0f;
                } else {
                    f = 0.4f;
                }
                C786410Ut5.T4(viewLJJ, f);
            }
        } else if (this.LIZLLL) {
            LJJI();
        } else {
            View view5 = this.LIZJ;
            if (view5 != null) {
                C786410Ut5.LJLLLLLL(8, view5);
            }
            Function0<Boolean> function02 = this.LJIIJ;
            if (function02 != null && function02.invoke().booleanValue() && (view = this.LIZIZ) != null) {
                C786410Ut5.LJLLLLLL(0, view);
            }
        }
        boolean z4 = this.LJ;
        View view6 = this.LJJIIJ;
        if (view6 != null) {
            if (z4) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, view6);
        }
        TuxIconView tuxIconView = (TuxIconView) this.LIZ.findViewById(R.id.ukv);
        if (C1623480sLi.LIZ()) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_video_stack_square_fill;
            c419910GdJ.LIZLLL = -1;
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(26));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(26));
            tuxIconView.setTuxIcon(c419910GdJ);
            this.LJJII.setBackgroundResource(R.drawable.d5n);
        } else if (ChangeImagePickerUIExperiment.isEnabled()) {
            C419910GdJ c419910GdJ2 = new C419910GdJ();
            c419910GdJ2.LIZ = R.raw.icon_image_alt_1_fill;
            c419910GdJ2.LIZLLL = -1;
            c419910GdJ2.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
            c419910GdJ2.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
            tuxIconView.setTuxIcon(c419910GdJ2);
            this.LJJII.setBackgroundResource(R.drawable.d5n);
        } else {
            C419910GdJ c419910GdJ3 = new C419910GdJ();
            c419910GdJ3.LIZ = R.drawable.c43;
            c419910GdJ3.LIZLLL = -1;
            c419910GdJ3.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            c419910GdJ3.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            tuxIconView.setTuxIcon(c419910GdJ3);
        }
        if (c1624230sMv != null && (bool = c1624230sMv.LJ) != null) {
            boolean zBooleanValue = bool.booleanValue();
            if (z && (interfaceC21358118iB = this.LJIILIIL) != null) {
                interfaceC21358118iB.LIZLLL(str, zBooleanValue);
            }
            View view7 = this.LJJIII;
            if (!zBooleanValue) {
                i2 = 8;
            }
            C786410Ut5.LJLLLLLL(i2, view7);
        }
        Function1<Boolean, Unit> function1 = this.LJIILL;
        if (function1 != null) {
            function1.invoke(Boolean.TRUE);
        }
        InterfaceC21358118iB interfaceC21358118iB2 = this.LJIILIIL;
        if (interfaceC21358118iB2 != null) {
            Effect effect = this.LJJIJIL;
            if (effect != null) {
                effect.getEffect_id();
            }
            interfaceC21358118iB2.LJIIIZ();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [T, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView$LayoutManager] */
    public C21357318i3(View view, View view2, View view3, boolean z, View view4, View view5, View view6, View view7, ViewGroup viewGroup, Function0 function0, Function0 function02, C19EG c19eg, InterfaceC21358118iB interfaceC21358118iB, InterfaceC212356188k interfaceC212356188k, Function1 function1, C0N6I c0n6i, ComposeView composeView, InterfaceC1624480sNK interfaceC1624480sNK, Function0 function03, InterfaceC21358218iC interfaceC21358218iC, InterfaceC21358718iH interfaceC21358718iH, int i) {
        boolean z2 = z;
        View view8 = view3;
        ViewGroup viewGroup2 = viewGroup;
        View view9 = view7;
        View view10 = view6;
        View view11 = view5;
        View view12 = view4;
        InterfaceC21358218iC interfaceC21358218iC2 = interfaceC21358218iC;
        Function0 function04 = function03;
        InterfaceC1624480sNK interfaceC1624480sNK2 = interfaceC1624480sNK;
        C0N6I c0n6i2 = c0n6i;
        Function0 function05 = function02;
        Function1 function12 = function1;
        InterfaceC21358718iH interfaceC21358718iH2 = interfaceC21358718iH;
        Function0 function06 = function0;
        View view13 = (i & 2) != 0 ? null : view2;
        view8 = (i & 4) != 0 ? null : view8;
        z2 = (i & 8) != 0 ? false : z2;
        view12 = (i & 32) != 0 ? null : view12;
        view11 = (i & 64) != 0 ? null : view11;
        view10 = (i & 128) != 0 ? null : view10;
        view9 = (i & 256) != 0 ? null : view9;
        viewGroup2 = (i & 512) != 0 ? null : viewGroup2;
        function06 = (i & 1024) != 0 ? null : function06;
        function05 = (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : function05;
        function12 = (32768 & i) != 0 ? null : function12;
        c0n6i2 = (65536 & i) != 0 ? C0N6I.PHOTO : c0n6i2;
        interfaceC1624480sNK2 = (262144 & i) != 0 ? null : interfaceC1624480sNK2;
        function04 = (524288 & i) != 0 ? null : function04;
        interfaceC21358218iC2 = (1048576 & i) != 0 ? null : interfaceC21358218iC2;
        interfaceC21358718iH2 = (i & 2097152) != 0 ? null : interfaceC21358718iH2;
        this.LIZ = view;
        this.LIZIZ = view13;
        this.LIZJ = view8;
        this.LIZLLL = z2;
        this.LJ = false;
        this.LJFF = view12;
        this.LJI = view11;
        this.LJII = view10;
        this.LJIIIIZZ = view9;
        this.LJIIIZ = viewGroup2;
        this.LJIIJ = function06;
        this.LJIIJJI = function05;
        this.LJIIL = c19eg;
        this.LJIILIIL = interfaceC21358118iB;
        this.LJIILJJIL = interfaceC212356188k;
        this.LJIILL = function12;
        this.LJIILLIIL = c0n6i2;
        this.LJIIZILJ = composeView;
        this.LJIJ = interfaceC1624480sNK2;
        this.LJIJI = function04;
        this.LJIJJ = interfaceC21358218iC2;
        this.LJIJJLI = interfaceC21358718iH2;
        final RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.mel);
        this.LJJI = recyclerView;
        this.LJJIIJZLJL = new ArrayList<>();
        this.LJJIIZ = new ArrayList<>();
        C21355718hn c21355718hn = new C21355718hn(c19eg, false, new AwS611S0100000_32(this, 375), new C21525019Ls(this, 2));
        c21355718hn.LLJIJIL = interfaceC212356188k;
        c21355718hn.LLJILJIL = interfaceC21358718iH2;
        this.LJJIIZI = c21355718hn;
        this.LJJIJ = new C0KW4(c19eg);
        this.LJJIJIIJI = true;
        C259800zU c259800zU = new C259800zU();
        ?? linearLayoutManager = new LinearLayoutManager(recyclerView.getContext(), 0, false);
        c259800zU.element = linearLayoutManager;
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(c21355718hn);
        ((AbstractC21674919sB) recyclerView.getItemAnimator()).LLIZ = false;
        recyclerView.addItemDecoration(new C422670Ghl());
        recyclerView.addOnChildAttachStateChangeListener(new InterfaceC21676519sR() { // from class: X.18iA
            @Override // X.InterfaceC21676519sR
            public final void m3(View view14) {
            }

            @Override // X.InterfaceC21676519sR
            public final void g5(View view14) {
                int childAdapterPosition = recyclerView.getChildAdapterPosition(view14);
                C21357318i3 c21357318i3 = this;
                InterfaceC21358718iH interfaceC21358718iH3 = c21357318i3.LJIJJLI;
                if (interfaceC21358718iH3 != null) {
                    interfaceC21358718iH3.LIZIZ(c21357318i3.LJJIJIL, childAdapterPosition, (C21356918hz) C13LP.LJJJLZIJ(childAdapterPosition, c21357318i3.LJJIIZI.LLIZLLLIL));
                }
            }
        });
        if (C522610KeZ.LIZ()) {
            recyclerView.addOnScrollListener(new AsS35S0100000_8(c259800zU, 7));
        }
        View viewFindViewById = view.findViewById(R.id.lxf);
        this.LJJIFFI = viewFindViewById;
        view.findViewById(R.id.xo_);
        C786410Ut5.I7(new ACListenerS166S0100000_32(this, 122), viewFindViewById);
        View viewFindViewById2 = view.findViewById(R.id.luk);
        this.LJJII = viewFindViewById2;
        C0M31.LIZ(viewFindViewById2, new AwS576S0100000_32(this, 824));
        View viewFindViewById3 = view.findViewById(R.id.lil);
        this.LJJIII = viewFindViewById3;
        C786410Ut5.I7(new ACListenerS166S0100000_32(this, 123), viewFindViewById3);
        View viewFindViewById4 = view.findViewById(R.id.lbw);
        this.LJJIIJ = viewFindViewById4;
        if (viewFindViewById4 != null) {
            C786410Ut5.I7(new ACListenerS166S0100000_32(this, 124), viewFindViewById4);
        }
        LJJIII(this, false);
        View viewLJJ = LJJ();
        if (viewLJJ != null) {
            if (z2) {
                LJJI();
            }
            C786410Ut5.LJLLLLLL(8, viewLJJ);
        }
    }
}
