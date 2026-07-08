package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.IAnoleManager;
import com.ss.android.ugc.aweme.api.IFeedService;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentLayoutModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0REr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC692590REr implements InterfaceC999040c6Y {
    public Context LIZ;
    public Aweme LIZIZ;
    public String LIZJ;
    public ViewGroup LIZLLL;

    public abstract String LIZJ();

    public final void LIZLLL() {
        this.LIZ = null;
        this.LIZJ = null;
        this.LIZIZ = null;
        ViewGroup viewGroup = this.LIZLLL;
        if (viewGroup != null) {
            C786410Ut5.LJJJJI(viewGroup);
        }
        ViewGroup viewGroup2 = this.LIZLLL;
        if (viewGroup2 != null) {
            C337180DJs.LIZ(viewGroup2);
        }
        this.LIZLLL = null;
    }

    public final IAnoleManager LIZIZ() {
        String str;
        IFeedService iFeedService;
        InterfaceC1008930cMV interfaceC1008930cMVLIZJ;
        Aweme aweme = this.LIZIZ;
        if (aweme == null || (str = this.LIZJ) == null || !AwemeExtKt.isAdTraffic(aweme) || !C0PPH.LIZ(aweme, LIZJ()) || (iFeedService = (IFeedService) PluggableExtentionKt.pluggableSpi$default(IFeedService.class, false, false, false, 14, null)) == null || (interfaceC1008930cMVLIZJ = iFeedService.LIZJ(this.LIZ, aweme, str, true)) == null) {
            return null;
        }
        return interfaceC1008930cMVLIZJ.Ri();
    }

    @Override // X.InterfaceC999040c6Y
    public final void onUnbind() {
        IAnoleManager iAnoleManagerLIZIZ = LIZIZ();
        if (iAnoleManagerLIZIZ == null) {
            LIZLLL();
        } else {
            iAnoleManagerLIZIZ.LJIIJJI(LIZJ());
            LIZLLL();
        }
    }

    @Override // X.InterfaceC999040c6Y
    public final void LJJIIJ() {
        LIZLLL();
    }

    @Override // X.InterfaceC999040c6Y
    public final void LIZ(final ViewGroup viewGroup) {
        IAnoleManager iAnoleManagerLIZIZ = LIZIZ();
        if (iAnoleManagerLIZIZ == null) {
            LIZLLL();
            return;
        }
        this.LIZLLL = viewGroup;
        if (viewGroup != null) {
            C786410Ut5.LJJJJI(viewGroup);
            iAnoleManagerLIZIZ.mount(viewGroup, LIZJ(), new InterfaceC1014340cVE() { // from class: X.0REq
                @Override // X.InterfaceC1014340cVE
                public final void LIZIZ() {
                }

                @Override // X.InterfaceC1014340cVE
                public final void LIZJ() {
                }

                @Override // X.InterfaceC1014340cVE
                public final void LIZLLL(boolean z) {
                }

                @Override // X.InterfaceC1014340cVE
                public final void LJ(String str, View view, AnoleComponentLayoutModel anoleComponentLayoutModel) {
                }

                @Override // X.InterfaceC1014340cVE
                public final void LJFF(boolean z) {
                }

                @Override // X.InterfaceC1014340cVE
                public final void LJII() {
                }

                @Override // X.InterfaceC1014340cVE
                public final void LJJJIL() {
                }

                @Override // X.InterfaceC1014340cVE
                public final void LJI(String str, Integer num, Integer num2, Integer num3, Integer num4) {
                    if (!Intrinsics.LJFF(str, this.LIZ.LIZJ())) {
                        return;
                    }
                    ViewGroup viewGroup2 = viewGroup;
                    ViewGroup.LayoutParams layoutParams = viewGroup2.getLayoutParams();
                    if (layoutParams != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        if (num != null) {
                            marginLayoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(num.intValue()))));
                        }
                        if (num2 != null) {
                            marginLayoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(num2.intValue()))));
                        }
                        if (num3 != null) {
                            marginLayoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(num3.intValue())));
                        }
                        if (num4 != null) {
                            marginLayoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(num4.intValue())));
                        }
                        C786410Ut5.W5(viewGroup2, marginLayoutParams);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
            });
        }
    }

    @Override // X.InterfaceC999040c6Y
    public final void LJJIJIL(Context context, Aweme aweme, String str) {
        this.LIZ = context;
        this.LIZIZ = aweme;
        this.LIZJ = str;
    }
}
