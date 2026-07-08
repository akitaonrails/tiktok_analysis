package com.bytedance.android.live.effect.singleselector;

import X.C0U60;
import X.C0UA2;
import X.C0UBC;
import X.C0UBH;
import X.C0UD4;
import X.C1888650zFP;
import X.C19YU;
import X.C23250099c;
import X.C495101wL;
import X.C495201wM;
import X.C497740JfY;
import X.C500260Jjc;
import X.C500980Jkm;
import X.C760940Tt6;
import X.C766200U3u;
import X.C768070UAz;
import X.C786410Ut5;
import X.InterfaceC1883670z7N;
import X.InterfaceC761540Tu4;
import Y.ACListenerS147S0100000_12;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.live.effect.singleselector.SingleStickerEffectSelectorDialog;
import com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class SingleStickerEffectSelectorDialog extends LiveDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiLCk1LSY4Zzw6JiIgLDw2HELIOSJCAvPSAhZhYlJyg/LRY4ICw4LTcJLyk2KzEfLCM2KzEjOws6KSkjLg==";
    public C0UA2 LL;
    public C19YU LLILLJJLI;
    public ViewPager LLILLL;
    public C0UBC LLILZ;
    public C1888650zFP LLILZIL;
    public C768070UAz LLIZ;
    public final StickerEffectViewModel LLILZLL = C0U60.LIZ();
    public final List<C0UBH> LLIZLLLIL = new ArrayList();
    public final List<C0UBH> LLJ = new ArrayList();

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.hmi);
        c500980Jkm.LJIILIIL = 3;
        c500980Jkm.LJIIJJI = 50;
        c500980Jkm.LJII = 80;
        c500980Jkm.LJI = 0.5f;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        InterfaceC761540Tu4 interfaceC761540Tu4;
        super.onDestroyView();
        C0UA2 c0ua2 = this.LL;
        if (c0ua2 == null || (interfaceC761540Tu4 = c0ua2.LIZJ) == null) {
            return;
        }
        interfaceC761540Tu4.LIZIZ();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        super.onStart();
        C760940Tt6.LIZIZ(this);
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        ViewTreeLifecycleOwner.set(decorView, this);
        ViewTreeViewModelStoreOwner.set(decorView, this);
        decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C768070UAz c768070UAz;
        String str;
        InterfaceC761540Tu4 interfaceC761540Tu4;
        super.onViewCreated(view, bundle);
        C0UA2 c0ua2 = this.LL;
        if (c0ua2 != null && (interfaceC761540Tu4 = c0ua2.LIZJ) != null) {
            interfaceC761540Tu4.LIZ();
        }
        C786410Ut5.Sd(R.layout.hmj, C786410Ut5.ne(getContext()), (ViewGroup) view.findViewById(R.id.gvn));
        this.LLILLJJLI = (C19YU) view.findViewById(R.id.wz1);
        ViewPager viewPager = (ViewPager) view.findViewById(R.id.w6p);
        this.LLILLL = viewPager;
        C19YU c19yu = this.LLILLJJLI;
        if (c19yu != null && viewPager != null) {
            this.LLILZ = new C0UBC(c19yu, viewPager, 2);
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C495201wM(this, null), 3);
        C786410Ut5.I7(new ACListenerS147S0100000_12(this, 53), view.findViewById(R.id.cko));
        if (getContext() != null) {
            String str2 = C0UD4.LIZIZ;
            LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
            StickerEffectViewModel stickerEffectViewModel = this.LLILZLL;
            C766200U3u c766200U3u = new C766200U3u();
            C0UA2 c0ua22 = this.LL;
            if (c0ua22 != null) {
                str = c0ua22.LIZ;
            } else {
                str = null;
            }
            c766200U3u.LIZ = str;
            c768070UAz = new C768070UAz(str2, lifecycleScope, stickerEffectViewModel, c766200U3u, c0ua22);
        } else {
            c768070UAz = null;
        }
        this.LLIZ = c768070UAz;
        ViewPager viewPager2 = this.LLILLL;
        if (viewPager2 != null) {
            viewPager2.setAdapter(c768070UAz);
        }
        ViewPager viewPager3 = this.LLILLL;
        if (viewPager3 != null) {
            viewPager3.setOffscreenPageLimit(1);
        }
        C19YU c19yu2 = this.LLILLJJLI;
        if (c19yu2 != null) {
            c19yu2.LJIILLIIL(this.LLILLL, false, false);
        }
        C19YU c19yu3 = this.LLILLJJLI;
        if (c19yu3 != null) {
            c19yu3.LIZIZ(new InterfaceC1883670z7N() { // from class: X.0UAW
                @Override // X.InterfaceC1883670z7N
                public final void LIZ(C1888650zFP c1888650zFP) {
                }

                @Override // X.InterfaceC1883670z7N
                public final void LIZJ(C1888650zFP c1888650zFP) {
                }

                @Override // X.InterfaceC1883670z7N
                public final void LIZIZ(C1888650zFP c1888650zFP, boolean z, boolean z2) {
                    Object obj;
                    int i;
                    SingleStickerEffectSelectorDialog singleStickerEffectSelectorDialog = this.LIZ;
                    singleStickerEffectSelectorDialog.LLILZIL = c1888650zFP;
                    if (c1888650zFP != null) {
                        obj = c1888650zFP.LIZ;
                    } else {
                        obj = null;
                    }
                    boolean z3 = obj instanceof C0UBH;
                    C768070UAz c768070UAz2 = singleStickerEffectSelectorDialog.LLIZ;
                    if (c768070UAz2 != null) {
                        if (c1888650zFP != null) {
                            i = c1888650zFP.LIZLLL;
                        } else {
                            i = 0;
                        }
                        c768070UAz2.LJJIJIL(i);
                    }
                }
            });
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.LLILZLL.LQ2());
        arrayList.add(new C0UBH(C497740JfY.LJIJI(2131841513), "", true));
        C768070UAz c768070UAz2 = this.LLIZ;
        if (c768070UAz2 != null) {
            ((ArrayList) c768070UAz2.LLIZ).clear();
            ((ArrayList) c768070UAz2.LLIZ).addAll(arrayList);
            c768070UAz2.notifyDataSetChanged();
        }
        C0UBC c0ubc = this.LLILZ;
        if (c0ubc != null) {
            c0ubc.LIZIZ(arrayList);
        }
        C500260Jjc.LJLL(0, (int) C497740JfY.LIZIZ(262.0f), this.LLILLL);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C495101wL(this, null), 3);
        C786410Ut5.I7(new ACListenerS147S0100000_12(this, 54), view.findViewById(R.id.fy5));
    }
}
