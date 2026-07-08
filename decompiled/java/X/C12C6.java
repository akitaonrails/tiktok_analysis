package X;

import Y.ACListenerS163S0100000_29;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.12C6, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12C6 extends AbstractC1664490tPr<C12CA, C12CG> {
    public View LLJJJIL;
    public TuxIconView LLJJJJ;
    public TuxTextView LLJJJJJIL;
    public C427660Gpo LLJJJJLIIL;
    public TuxTextView LLJJL;
    public View LLJJLIIIJLLLLLLLZ;
    public TuxIconView LLJL;

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LLJJJIL = this.mView.findViewById(R.id.bn2);
        this.LLJJJJ = (TuxIconView) this.mView.findViewById(R.id.bnc);
        this.LLJJJJJIL = (TuxTextView) this.mView.findViewById(R.id.y3j);
        this.LLJJJJLIIL = (C427660Gpo) this.mView.findViewById(R.id.jig);
        this.LLJJL = (TuxTextView) this.mView.findViewById(R.id.jk2);
        this.LLJJLIIIJLLLLLLLZ = this.mView.findViewById(R.id.io0);
        this.LLJL = (TuxIconView) this.mView.findViewById(R.id.io4);
        C19292410dm currentUser = C0CHQ.LIZ().getAccountService().getCurrentUser();
        if (currentUser != null && currentUser.getAvatarThumb() != null) {
            C1324750kZt.LJI(this.LLJJJJLIIL, currentUser.getAvatarThumb(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(49)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(49)));
        } else {
            C1324750kZt.LIZIZ(this.LLJJJJLIIL, 2130971789);
        }
        TuxTextView tuxTextView = this.LLJJL;
        if (tuxTextView != null) {
            C1464900oDw c1464900oDw = C1464900oDw.LIZ;
            Resources resources = getResources();
            c1464900oDw.getClass();
            tuxTextView.setText(C1464900oDw.LIZJ(currentUser, resources));
        }
        View view2 = this.LLJJJIL;
        if (view2 != null) {
            C786410Ut5.I7(new ACListenerS163S0100000_29(this, 98), view2);
        }
        View view3 = this.LLJJLIIIJLLLLLLLZ;
        if (view3 != null) {
            C786410Ut5.I7(new ACListenerS163S0100000_29(this, 99), view3);
        }
        TuxIconView tuxIconView = this.LLJJJJ;
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS163S0100000_29(this, 101));
        }
        TuxIconView tuxIconView2 = this.LLJL;
        if (tuxIconView2 != null) {
            C786410Ut5.a9(tuxIconView2, new ACListenerS163S0100000_29(this, 103));
        }
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.12C9
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C12CA) obj).LIZ);
            }
        }, Lifecycle.State.STARTED, new AwS608S0100000_29(this, 239));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.12C7
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C12CA) obj).LIZIZ);
            }
        }, Lifecycle.State.STARTED, new AwS608S0100000_29(this, 240));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.12C8
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C12CA) obj).LIZJ);
            }
        }, Lifecycle.State.STARTED, new AwS608S0100000_29(this, 241));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.duv, viewGroup, false);
    }
}
