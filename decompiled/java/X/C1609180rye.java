package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0rye, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1609180rye extends AbstractC1609160ryc<View> {
    public static final C1609180rye LIZJ = new C1609180rye();

    @Override // X.AbstractC1609160ryc
    public final View LIZIZ(Context context, View view, InterfaceC1609020ryO interfaceC1609020ryO) {
        if (view == null) {
            if (interfaceC1609020ryO instanceof C1608120rww) {
                return new C1609220ryi(context, null, 0);
            }
            if (interfaceC1609020ryO instanceof C1609240ryk) {
                return new C1609190ryf(context);
            }
            return new View(context);
        }
        return view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1609320rys
    public final void LIZ(View view, Context context, AvatarComponentView avatarComponentView, C1609000ryM c1609000ryM, boolean z) {
        C1606970rv5 c1606970rv5;
        InterfaceC1609020ryO interfaceC1609020ryO;
        C1608120rww c1608120rww;
        Function1<C1606310ru1, Unit> function1;
        InterfaceC1609330ryt interfaceC1609330ryt;
        AbstractC1606980rv6 abstractC1606980rv6LIZ = c1609000ryM.LIZJ.LIZ();
        if ((abstractC1606980rv6LIZ instanceof C1606970rv5) && (c1606970rv5 = (C1606970rv5) abstractC1606980rv6LIZ) != null && (interfaceC1609020ryO = c1606970rv5.LIZIZ) != null) {
            if (z) {
                LIZLLL(view, avatarComponentView, c1609000ryM);
            }
            if ((view instanceof InterfaceC1609330ryt) && (interfaceC1609330ryt = (InterfaceC1609330ryt) view) != null) {
                interfaceC1609330ryt.setUIConfig(c1609000ryM);
                interfaceC1609330ryt.setContainerView(avatarComponentView);
            }
            if (c1609000ryM.LJ.length() > 0) {
                view.setContentDescription(c1609000ryM.LJ);
            }
            if ((interfaceC1609020ryO instanceof C1608120rww) && (c1608120rww = (C1608120rww) interfaceC1609020ryO) != null && (function1 = c1608120rww.LJFF) != null) {
                function1.invoke(new C1606310ru1(avatarComponentView, view, view, context));
            }
            view.invalidate();
        }
    }
}
