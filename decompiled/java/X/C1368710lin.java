package X;

import Y.ACListenerS155S0100000_21;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.internalshare.impl.more.ShareMorePanelBehavior;
import com.ss.android.ugc.aweme.internalshare.impl.more.TuxShareMorePanelBehavior;
import com.ss.android.ugc.aweme.utils.KeyBoardMonitor;
import com.zhiliaoapp.musically.R;
import irm.AkS89S0100000_21;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: renamed from: X.0lin, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1368710lin extends AbstractC1368920lj8 {
    public TuxIconView LLJIJIL;
    public TuxTextView LLJILJIL;
    public final C01GW LLJILJILJ;

    public C1368710lin(C1368870lj3 c1368870lj3) {
        super(c1368870lj3);
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 50));
    }

    @Override // X.InterfaceC1368960ljC
    public final void onViewCreated(View view, Bundle bundle) {
        TuxIconView tuxIconView;
        TuxTextView tuxTextView;
        View viewFindViewById;
        View viewFindViewById2;
        String string;
        this.LLIZ = view;
        String panelTitle = null;
        if (view != null) {
            tuxIconView = (TuxIconView) view.findViewById(R.id.okt);
        } else {
            tuxIconView = null;
        }
        this.LLJIJIL = tuxIconView;
        if (tuxIconView != null) {
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
            tuxIconView.setPadding(iLIZIZ, iLIZIZ, iLIZIZ, iLIZIZ);
            C1383370m6R.LJIILJJIL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44)), tuxIconView);
            tuxIconView.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
            tuxIconView.setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
            C426750GoL.LJIIIZ(tuxIconView, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), null, false, 27);
        }
        TuxIconView tuxIconView2 = this.LLJIJIL;
        if (tuxIconView2 != null) {
            C786410Ut5.a9(tuxIconView2, new ACListenerS155S0100000_21(this, 10));
        }
        TuxIconView tuxIconView3 = this.LLJIJIL;
        if (tuxIconView3 != null) {
            Context contextLIZ = LIZ();
            if (contextLIZ != null) {
                string = contextLIZ.getString(2131823173);
            } else {
                string = null;
            }
            tuxIconView3.setContentDescription(string);
        }
        View view2 = this.LLIZ;
        if (view2 != null) {
            tuxTextView = (TuxTextView) view2.findViewById(R.id.title);
        } else {
            tuxTextView = null;
        }
        this.LLJILJIL = tuxTextView;
        if (!((Boolean) this.LLJILJILJ.getValue()).booleanValue()) {
            TuxTextView tuxTextView2 = this.LLJILJIL;
            if (tuxTextView2 != null) {
                C1368890lj5.LIZIZ(tuxTextView2, 2131832051);
            }
        } else {
            TuxTextView tuxTextView3 = this.LLJILJIL;
            if (tuxTextView3 != null) {
                C1365460ldY c1365460ldY = LIZJ().LJIILJJIL;
                if (c1365460ldY != null) {
                    panelTitle = c1365460ldY.getPanelTitle();
                }
                tuxTextView3.setText(panelTitle);
            }
        }
        View view3 = this.LLIZ;
        if (view3 != null && (viewFindViewById2 = view3.findViewById(R.id.nur)) != null) {
            C786410Ut5.I7(new AkS89S0100000_21(this, 0), viewFindViewById2);
        }
        View view4 = this.LLIZ;
        if (view4 != null && (viewFindViewById = view4.findViewById(R.id.ye3)) != null) {
            final C013C c013c = new C013C();
            C443160HZi c443160HZi = C443160HZi.LIZ;
            InterfaceC459810I1j interfaceC459810I1j = new InterfaceC459810I1j() { // from class: X.0lio
                @Override // X.InterfaceC459810I1j
                public final void V3() {
                    c013c.element = true;
                    if (C299110Bnx.LIZ()) {
                        TuxShareMorePanelBehavior tuxShareMorePanelBehavior = (TuxShareMorePanelBehavior) this.LLJI.getValue();
                        if (tuxShareMorePanelBehavior != null) {
                            tuxShareMorePanelBehavior.LJJIZ = true;
                            return;
                        }
                        return;
                    }
                    ShareMorePanelBehavior shareMorePanelBehavior = (ShareMorePanelBehavior) this.LLJ.getValue();
                    if (shareMorePanelBehavior != null) {
                        shareMorePanelBehavior.LIZLLL = true;
                    }
                }

                @Override // X.InterfaceC459810I1j
                public final void ub() {
                    c013c.element = false;
                    if (C299110Bnx.LIZ()) {
                        TuxShareMorePanelBehavior tuxShareMorePanelBehavior = (TuxShareMorePanelBehavior) this.LLJI.getValue();
                        if (tuxShareMorePanelBehavior != null) {
                            tuxShareMorePanelBehavior.LJJIZ = false;
                            return;
                        }
                        return;
                    }
                    ShareMorePanelBehavior shareMorePanelBehavior = (ShareMorePanelBehavior) this.LLJ.getValue();
                    if (shareMorePanelBehavior != null) {
                        shareMorePanelBehavior.LIZLLL = false;
                    }
                }
            };
            Fragment fragmentLIZIZ = LIZIZ();
            c443160HZi.getClass();
            new KeyBoardMonitor(fragmentLIZIZ).LIZ(viewFindViewById, interfaceC459810I1j);
        }
    }
}
