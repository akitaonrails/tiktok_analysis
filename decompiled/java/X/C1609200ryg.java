package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ryg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1609200ryg extends AbstractC1609160ryc<View> {
    public static final C1609200ryg LIZJ = new C1609200ryg();

    @Override // X.AbstractC1609160ryc
    public final View LIZIZ(Context context, View view, InterfaceC1609020ryO interfaceC1609020ryO) {
        if (view == null) {
            return new View(context);
        }
        return view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1609320rys
    public final void LIZ(View view, Context context, AvatarComponentView avatarComponentView, C1609000ryM c1609000ryM, boolean z) {
        C1609250ryl c1609250ryl;
        ViewGroup viewGroup;
        View viewLIZ;
        InterfaceC1609330ryt interfaceC1609330ryt;
        C1606970rv5 c1606970rv5;
        AbstractC1606980rv6 abstractC1606980rv6LIZ = c1609000ryM.LIZJ.LIZ();
        InterfaceC1609020ryO interfaceC1609020ryO = null;
        if ((abstractC1606980rv6LIZ instanceof C1606970rv5) && (c1606970rv5 = (C1606970rv5) abstractC1606980rv6LIZ) != null) {
            interfaceC1609020ryO = c1606970rv5.LIZIZ;
        }
        if ((interfaceC1609020ryO instanceof C1609250ryl) && (c1609250ryl = (C1609250ryl) interfaceC1609020ryO) != null) {
            if (z) {
                C1609180rye.LIZJ.LIZLLL(view, avatarComponentView, c1609000ryM);
            }
            if ((c1609250ryl.LIZJ != null || c1609250ryl.LJII) && (view instanceof FrameLayout) && (viewGroup = (ViewGroup) view) != null) {
                viewLIZ = C460180I2u.LIZ(0, viewGroup);
            } else {
                viewLIZ = view;
            }
            if ((view instanceof InterfaceC1609330ryt) && (interfaceC1609330ryt = (InterfaceC1609330ryt) view) != null) {
                interfaceC1609330ryt.setUIConfig(c1609000ryM);
                interfaceC1609330ryt.setContainerView(avatarComponentView);
            }
            Function1<C1606310ru1, Unit> function1 = c1609250ryl.LJFF;
            if (function1 != null) {
                function1.invoke(new C1606310ru1(avatarComponentView, viewLIZ, view, context));
            }
        }
    }
}
