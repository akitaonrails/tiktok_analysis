package com.bytedance.android.live.liveinteract.matchv2.connection.individualmatch.coordinator.matching.view;

import X.AbstractC985290bkN;
import X.C098200Yq;
import X.C0JSS;
import X.C0KVU;
import X.C1324720kZq;
import X.C1685300txQ;
import X.C16F5;
import X.C16FS;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20744116Fj;
import X.C497740JfY;
import X.C754570Tip;
import X.C786410Ut5;
import X.C954460awe;
import X.C978980baC;
import X.C986950bn3;
import X.InterfaceC963450bB9;
import Y.ACListenerS150S0100000_15;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.u;

/* JADX INFO: loaded from: classes16.dex */
public final class IndividualMatchQuitRequestFragment extends IndividualMatchQuitRequestContract$AbsView {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyIyPCYkP319KyoiJyowPCwjJ2E6JiElPyY3PSHELIOSQgJC4nKy1iKiA8OiElJy4nJzdiJC4nKy0lJyh9PiwpPmEaJiElPyY3PSQgBC4nKy0dPCYnGiA9PCogPAM+KCg+LSs4";
    public C1324720kZq LLILZ;
    public C16F5 LLILZIL;
    public C16F5 LLILZLL;
    public C20744116Fj LLIZ;
    public C16FS LLIZLLLIL;
    public C16FS LLJ;
    public C954460awe LLJI;
    public Function1<? super Boolean, Unit> LLJIJIL;

    @Override // com.bytedance.android.live.liveinteract.linkroom.business.contract.InteractDialogFragmentBaseContract$AbsView
    public final C978980baC OR() {
        C978980baC c978980baC = new C978980baC();
        c978980baC.LJIIIIZZ = false;
        c978980baC.LJIIL = false;
        return c978980baC;
    }

    @Override // com.bytedance.android.live.liveinteract.matchv2.connection.individualmatch.coordinator.matching.view.IndividualMatchQuitRequestContract$AbsView
    public final boolean PR() {
        C20744116Fj c20744116Fj = this.LLIZ;
        return c20744116Fj != null && c20744116Fj.isChecked();
    }

    @Override // com.bytedance.android.live.liveinteract.matchv2.connection.individualmatch.coordinator.matching.view.IndividualMatchQuitRequestContract$AbsView
    public final void dismiss() {
        InterfaceC963450bB9 interfaceC963450bB9 = this.LL;
        if (interfaceC963450bB9 != null) {
            interfaceC963450bB9.dismiss();
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        AbstractC985290bkN abstractC985290bkN = (AbstractC985290bkN) this.LLILLL;
        if (abstractC985290bkN != null) {
            abstractC985290bkN.LJIIJJI();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.matchv2.connection.individualmatch.coordinator.matching.view.IndividualMatchQuitRequestContract$AbsView
    public final void RR(long j) {
        C16FS c16fs = this.LLIZLLLIL;
        if (c16fs != null) {
            c16fs.setText(C497740JfY.LJIJJ(2131853286, Long.valueOf(j)));
        }
        if (j == 0) {
            this.LL.dismiss();
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C754570Tip c754570Tip;
        ImageModel imageModel;
        String str;
        C754570Tip c754570Tip2;
        super.onViewCreated(view, bundle);
        AbstractC985290bkN abstractC985290bkN = (AbstractC985290bkN) this.LLILLL;
        if (abstractC985290bkN != null) {
            abstractC985290bkN.LJIIJ();
        }
        C954460awe c954460awe = this.LLJI;
        String str2 = null;
        if (c954460awe != null) {
            c754570Tip = c954460awe.LJIJJ;
        } else {
            c754570Tip = null;
        }
        C1324720kZq c1324720kZq = this.LLILZ;
        if (c754570Tip != null) {
            imageModel = c754570Tip.LIZJ;
        } else {
            imageModel = null;
        }
        C0JSS.LJII(c1324720kZq, imageModel);
        C16F5 c16f5 = this.LLILZIL;
        if (c16f5 != null) {
            String strLJIJI = C497740JfY.LJIJI(2131853289);
            C954460awe c954460awe2 = this.LLJI;
            if (c954460awe2 != null && (c754570Tip2 = c954460awe2.LJIJJ) != null) {
                str = c754570Tip2.LIZ;
            } else {
                str = null;
                if (c954460awe2 != null) {
                }
                c16f5.setText(u.LJJIFFI(strLJIJI, "{nickname}", C0KVU.LIZIZ(str, str2), false));
            }
            C754570Tip c754570Tip3 = c954460awe2.LJIJJ;
            if (c754570Tip3 != null) {
                str2 = c754570Tip3.LIZIZ;
            }
            c16f5.setText(u.LJJIFFI(strLJIJI, "{nickname}", C0KVU.LIZIZ(str, str2), false));
        }
        C16F5 c16f52 = this.LLILZLL;
        if (c16f52 != null) {
            c16f52.setText(C497740JfY.LJIJI(2131853285));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs;
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.g9u, viewGroup, false);
        this.LLILZ = (C1324720kZq) viewTd.findViewById(R.id.biz);
        this.LLILZIL = (C16F5) viewTd.findViewById(R.id.tbc);
        this.LLILZLL = (C16F5) viewTd.findViewById(R.id.tb4);
        C20744116Fj c20744116Fj = (C20744116Fj) viewTd.findViewById(R.id.aye);
        this.LLIZ = c20744116Fj;
        if (c20744116Fj != null) {
            C786410Ut5.z7(c20744116Fj, new C986950bn3(this, 1));
        }
        C16FS c16fs = (C16FS) viewTd.findViewById(R.id.t41);
        this.LLIZLLLIL = c16fs;
        if (c16fs != null) {
            C786410Ut5.h8(c16fs, new ACListenerS150S0100000_15(this, 53));
        }
        C16FS c16fs2 = (C16FS) viewTd.findViewById(R.id.b7g);
        this.LLJ = c16fs2;
        if (c16fs2 != null) {
            c16fs2.setText(C497740JfY.LJIJI(2131853287));
        }
        C16FS c16fs3 = this.LLJ;
        if (c16fs3 != null) {
            C786410Ut5.h8(c16fs3, new ACListenerS150S0100000_15(this, 54));
        }
        try {
            ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(viewTd, this);
            viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            } else {
                c19gs = null;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return viewTd;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return viewTd;
        }
    }
}
