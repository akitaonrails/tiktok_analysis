package X;

import android.app.Activity;
import android.view.ViewGroup;
import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.19C3, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19C3 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C19C2 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19C3(C19C2 c19c2) {
        super(0);
        this.LL = c19c2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ViewGroup viewGroup;
        this.LL.getClass();
        if (!C19C2.LJI()) {
            throw new IllegalStateException("onActivityCreated must run on ui thread");
        }
        C19C2 c19c2 = this.LL;
        C19C4 c19c4 = c19c2.LJII;
        if (c19c4 != C19C4.LLILLJJLI) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("invoke onDestroyView() first, current state ");
            sbLIZ.append(this.LL.LJII);
            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
        }
        C19C4 c19c42 = C19C4.LLILLL;
        if (c19c4 != c19c42) {
            c19c2.LJIIIZ = false;
            c19c2.LJII = c19c42;
            InterfaceC19394510uF interfaceC19394510uF = c19c2.LIZIZ;
            if (interfaceC19394510uF != null) {
                viewGroup = (ViewGroup) interfaceC19394510uF.LIZ(c19c2.LIZ);
            } else {
                Activity activity = c19c2.LIZJ;
                if (activity == null) {
                    throw new IllegalArgumentException("both viewFinder and activityViewFinder are null");
                }
                viewGroup = (ViewGroup) activity.findViewById(c19c2.LIZ);
            }
            C19C2 c19c22 = this.LL;
            c19c22.LIZLLL.dispatchCreateView(c19c22.LJIIJ, viewGroup);
            Scene scene = this.LL.LIZLLL;
            if (!(scene instanceof NavigationScene) || !((NavigationScene) scene).LLJJIJI) {
                viewGroup.addView(scene.requireView(), new ViewGroup.LayoutParams(-1, -1));
            } else if (scene.requireView().getParent() == null) {
                throw new IllegalStateException("You should invoke onActivityCreated after Activity.setContentView");
            }
        }
        return Unit.LIZ;
    }
}
