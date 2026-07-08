package X;

import Y.ARunnableS61S0300000_28;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import kotlin.jvm.internal.AwS63S0001000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.11v2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19654211v2 implements InterfaceC1352000lHq {
    public C1222450hut LL;
    public C19646111tj LLILLJJLI;
    public C19646111tj LLILLL;
    public TuxNavBar LLILZ;
    public View LLILZIL;
    public View LLILZLL;
    public C21578619ce LLIZ;
    public View LLIZLLLIL;
    public C197039127h LLJ;
    public TuxTextView LLJI;

    @Override // X.InterfaceC1352000lHq
    public final void LLILII() {
        View view = this.LLIZLLLIL;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = 0;
            C786410Ut5.W5(view, marginLayoutParams);
            view.setPadding(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
        }
        View view2 = this.LLILZIL;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams2.height = -2;
            C786410Ut5.W5(view2, layoutParams2);
        }
    }

    public final void LIZ(InterfaceC1556330qbP interfaceC1556330qbP) {
        C19646111tj c19646111tj = this.LLILLL;
        if (c19646111tj == null) {
            return;
        }
        if (interfaceC1556330qbP instanceof C1556320qbO) {
            String str = ((C1556320qbO) interfaceC1556330qbP).LIZ;
            if (str != null) {
                c19646111tj.getEditor().setText(str);
                return;
            }
            return;
        }
        if (interfaceC1556330qbP instanceof C19654411v4) {
            C19654411v4 c19654411v4 = (C19654411v4) interfaceC1556330qbP;
            Boolean bool = c19654411v4.LIZLLL;
            if (bool != null) {
                bool.booleanValue();
                if (Intrinsics.LJFF(c19654411v4.LIZLLL, Boolean.TRUE)) {
                    C19646111tj c19646111tj2 = this.LLILLJJLI;
                    if (c19646111tj2 != null) {
                        c19646111tj2.i0();
                    }
                    C19646111tj c19646111tj3 = this.LLILLL;
                    if (c19646111tj3 != null) {
                        c19646111tj3.i0();
                    }
                }
            }
            EnumC19646311tl enumC19646311tl = c19654411v4.LIZ;
            if (enumC19646311tl != null) {
                c19646111tj.setState(enumC19646311tl);
            }
            String str2 = c19654411v4.LIZIZ;
            if (str2 != null) {
                c19646111tj.setErrorMsg(str2);
            }
            Boolean bool2 = c19654411v4.LIZJ;
            if (bool2 == null) {
                return;
            }
            C995130c0F.LIZLLL(c19646111tj.getBtnPreviewLink(), bool2.booleanValue());
            return;
        }
        throw new C1954807lC();
    }

    public final void LIZIZ(InterfaceC19653211us interfaceC19653211us) {
        C19646111tj c19646111tj = this.LLILLJJLI;
        if (c19646111tj == null) {
            return;
        }
        if (interfaceC19653211us instanceof C19654911v9) {
            C19654911v9 c19654911v9 = (C19654911v9) interfaceC19653211us;
            Boolean bool = c19654911v9.LIZ;
            if (bool != null) {
                C995130c0F.LIZLLL(c19646111tj, bool.booleanValue());
            }
            UrlModel urlModel = c19654911v9.LIZIZ;
            if (urlModel != null) {
                RemoteImageView remoteImageView = c19646111tj.LLILZLL;
                C995130c0F.LIZLLL(remoteImageView, true);
                C1324840ka2.LJFF(remoteImageView, urlModel);
            }
            String str = c19654911v9.LIZLLL;
            if (str != null) {
                c19646111tj.getEditor().setText(str);
            }
            Integer num = c19654911v9.LIZJ;
            if (num != null) {
                c19646111tj.h0(num.intValue(), false);
                return;
            }
            return;
        }
        if (interfaceC19653211us instanceof C19652311uj) {
            C19652311uj c19652311uj = (C19652311uj) interfaceC19653211us;
            EnumC19646311tl enumC19646311tl = c19652311uj.LIZ;
            if (enumC19646311tl != null) {
                c19646111tj.setState(enumC19646311tl);
            }
            C19653311ut c19653311ut = c19652311uj.LIZIZ;
            if (c19653311ut == null) {
                return;
            }
            if (c19653311ut.LIZ) {
                c19646111tj.setErrorMsg(c19653311ut.LIZIZ);
                return;
            } else {
                c19646111tj.setWarningMsg(c19653311ut.LIZIZ);
                return;
            }
        }
        throw new C1954807lC();
    }

    @Override // X.InterfaceC1352000lHq
    public final void LLLLZI(int i) {
        new AwS63S0001000_28(i, 1);
        View view = this.LLIZLLLIL;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.bottomMargin = i;
                C786410Ut5.W5(view, marginLayoutParams);
                view.setPadding(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), 0, 0);
                ViewTreeObserverOnPreDrawListenerC337150DJp.LIZ(view, new ARunnableS61S0300000_28(view, this, view, 2));
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    @Override // X.InterfaceC1352000lHq
    public final void j(int i) {
        new AwS63S0001000_28(i, 0);
        View view = this.LLIZLLLIL;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.bottomMargin = i;
                C786410Ut5.W5(view, marginLayoutParams);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }
}
