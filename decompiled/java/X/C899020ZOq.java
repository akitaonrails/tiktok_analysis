package X;

import android.view.View;
import android.view.ViewStub;

/* JADX INFO: renamed from: X.0ZOq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C899020ZOq {
    public static final /* synthetic */ C899020ZOq LIZ = new C899020ZOq();

    public static InterfaceC899400ZQc LIZ(View view, int i, final Integer num) {
        View viewFindViewById = view.findViewById(i);
        if (viewFindViewById instanceof ViewStub) {
            final ViewStub viewStub = (ViewStub) viewFindViewById;
            return new InterfaceC899400ZQc(viewStub, num) { // from class: X.0ZOp
                public final ViewStub LIZIZ;
                public final Integer LIZJ;
                public boolean LIZLLL;
                public View LJ;

                @Override // X.InterfaceC899400ZQc
                public final boolean LIZIZ() {
                    return this.LIZLLL;
                }

                @Override // X.InterfaceC899400ZQc
                public final void LIZ(int i2) {
                    View viewFindViewById2;
                    View view2 = this.LJ;
                    if (view2 != null && (viewFindViewById2 = view2.findViewById(i2)) != null) {
                        C337180DJs.LIZ(viewFindViewById2);
                    }
                }

                @Override // X.InterfaceC899400ZQc
                public final <T extends View> T LIZJ(int i2) {
                    View viewLJLLLL;
                    if (!this.LIZLLL) {
                        this.LIZLLL = true;
                        Integer num2 = this.LIZJ;
                        if (num2 != null) {
                            this.LIZIZ.setLayoutResource(num2.intValue());
                        }
                        viewLJLLLL = C786410Ut5.LJLLLL(this.LIZIZ);
                        this.LJ = viewLJLLLL;
                    } else {
                        viewLJLLLL = this.LJ;
                    }
                    if (viewLJLLLL != null) {
                        return (T) viewLJLLLL.findViewById(i2);
                    }
                    return null;
                }

                {
                    this.LIZIZ = viewStub;
                    this.LIZJ = num;
                }
            };
        }
        return new C1671606gc(view);
    }
}
