package X;

import Y.AObserverS179S0200000_15;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.MultiGuestThemeViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0aZ0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class C939800aZ0 extends AbstractC940410aZz implements LifecycleOwner {
    public final String LLILZIL;
    public final MutableLiveData<MultiGuestThemeViewModel> LLILZLL;
    public InterfaceC937900aVw LLIZ;
    public final EnumC940090aZT LLIZLLLIL;
    public ViewGroup LLJ;
    public View LLJI;
    public ImageView LLJIJIL;
    public C16F5 LLJILJIL;
    public final LifecycleRegistry LLJILJILJ;

    public C939800aZ0() {
        throw null;
    }

    @Override // X.AbstractC940410aZz
    public int LIZIZ() {
        return R.layout.hdv;
    }

    public void LJIIIIZZ() {
        ViewGroup viewGroup = this.LLJ;
        if (viewGroup != null) {
            C12ES.LJIILL(0, viewGroup);
        }
        View view = this.LLJI;
        if (view != null) {
            C439101nJ.LJI(view);
        }
    }

    public void LJIIIZ() {
        ViewGroup viewGroup = this.LLJ;
        if (viewGroup != null) {
            C439101nJ.LJI(viewGroup);
        }
        View view = this.LLJI;
        if (view != null) {
            C12ES.LJIILL(0, view);
        }
    }

    @Override // X.AbstractC940410aZz
    public void LJI() {
        super.LJI();
        this.LLJILJILJ.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
    }

    @Override // X.AbstractC940410aZz
    public String LIZ() {
        return this.LLILZIL;
    }

    public InterfaceC937900aVw LJIIJ() {
        return this.LLIZ;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LLJILJILJ;
    }

    @Override // X.AbstractC940410aZz
    public void LIZJ(ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        View viewFindViewById;
        ImageView imageView;
        ViewTreeObserver viewTreeObserver;
        this.LLJILJILJ.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
        C16F5 c16f5 = null;
        if (viewGroup != null) {
            viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.naq);
        } else {
            viewGroup2 = null;
        }
        this.LLJ = viewGroup2;
        if (viewGroup != null) {
            viewFindViewById = viewGroup.findViewById(R.id.la3);
        } else {
            viewFindViewById = null;
        }
        this.LLJI = viewFindViewById;
        if (viewGroup != null) {
            imageView = (ImageView) viewGroup.findViewById(R.id.h35);
        } else {
            imageView = null;
        }
        this.LLJIJIL = imageView;
        if (viewGroup != null) {
            c16f5 = (C16F5) viewGroup.findViewById(R.id.tbd);
        }
        this.LLJILJIL = c16f5;
        ViewGroup viewGroup3 = this.LLJ;
        if (viewGroup3 != null) {
            C12ES.LJIILL(0, viewGroup3);
        }
        View view = this.LLJI;
        if (view != null) {
            C439101nJ.LJI(view);
        }
        if (viewGroup != null && (viewTreeObserver = viewGroup.getViewTreeObserver()) != null) {
            ViewTreeObserverOnGlobalLayoutListenerC987060bnE viewTreeObserverOnGlobalLayoutListenerC987060bnE = new ViewTreeObserverOnGlobalLayoutListenerC987060bnE(viewGroup, this, 2);
            viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC987060bnE);
            C2187701Ajg.LIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC987060bnE, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
        LJIIL(viewGroup);
    }

    public void LJIIJJI(InterfaceC937900aVw interfaceC937900aVw) {
        this.LLIZ = interfaceC937900aVw;
    }

    public final void LJIIL(ViewGroup viewGroup) {
        String layoutBusinessType;
        InterfaceC937820aVo interfaceC937820aVoLJJJJZ;
        InterfaceC937820aVo interfaceC937820aVoLJJJJZ2;
        if (viewGroup != null && viewGroup.getId() == R.id.i7r) {
            InterfaceC937900aVw interfaceC937900aVwLJIIJ = LJIIJ();
            String layoutBusinessType2 = null;
            if (interfaceC937900aVwLJIIJ != null && (interfaceC937820aVoLJJJJZ2 = interfaceC937900aVwLJIIJ.LJJJJZ()) != null) {
                layoutBusinessType = interfaceC937820aVoLJJJJZ2.getLayoutBusinessType();
            } else {
                layoutBusinessType = null;
            }
            if (!Intrinsics.LJFF(layoutBusinessType, EnumC918990a1R.FLOAT.getBusinessType())) {
                InterfaceC937900aVw interfaceC937900aVwLJIIJ2 = LJIIJ();
                if (interfaceC937900aVwLJIIJ2 != null && (interfaceC937820aVoLJJJJZ = interfaceC937900aVwLJIIJ2.LJJJJZ()) != null) {
                    layoutBusinessType2 = interfaceC937820aVoLJJJJZ.getLayoutBusinessType();
                }
                if (!Intrinsics.LJFF(layoutBusinessType2, EnumC918990a1R.ZOOM_PANEL_FLOAT_GUEST.getBusinessType())) {
                    if (C939550aYb.LIZLLL()) {
                        if (viewGroup != null) {
                            viewGroup.setBackground(C497740JfY.LJIIJ(R.drawable.f5t));
                        }
                    } else if (viewGroup != null) {
                        viewGroup.setBackground(C497740JfY.LJIIJ(R.drawable.f5v));
                    }
                    MutableLiveData<MultiGuestThemeViewModel> mutableLiveData = this.LLILZLL;
                    if (mutableLiveData != null) {
                        mutableLiveData.observe(this, new AObserverS179S0200000_15(viewGroup, this, 9));
                        return;
                    }
                    return;
                }
            }
            viewGroup.setBackground(new ColorDrawable(C497740JfY.LIZLLL(R.attr.c99, viewGroup.getContext())));
        }
    }

    public C939800aZ0(MutableLiveData mutableLiveData, InterfaceC937900aVw interfaceC937900aVw, EnumC940090aZT enumC940090aZT) {
        this.LLILZIL = "";
        this.LLILZLL = mutableLiveData;
        this.LLIZ = interfaceC937900aVw;
        this.LLIZLLLIL = enumC940090aZT;
        this.LLJILJILJ = new LifecycleRegistry(this);
    }
}
