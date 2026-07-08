package X;

import android.content.Context;
import android.view.View;

/* JADX INFO: renamed from: X.0e8h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C1077250e8h extends AbstractViewOnClickListenerC372950Ejl {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.AbstractViewOnClickListenerC372950Ejl
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            case 2:
                LIZ$2(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(C1077250e8h c1077250e8h, View view) {
        if (view != null) {
            ((AbstractC1066970ds7) c1077250e8h.l0).LJJIJL(view, (C2344009Gk) c1077250e8h.l1, "panel_item");
        }
    }

    public static final void LIZ$1(C1077250e8h c1077250e8h, View view) {
        if (view != null) {
            Context context = ((C1394730mOl) c1077250e8h.l0).getContext();
            String str = (String) ((C1067340dsi) c1077250e8h.l1).LLJ.getValue();
            InterfaceC1392640mLO interfaceC1392640mLO = ((C1067340dsi) c1077250e8h.l1).LL;
            if (interfaceC1392640mLO == null) {
                interfaceC1392640mLO = null;
            }
            String aid = interfaceC1392640mLO.LJJLIIIJJIZ().getAid();
            if (aid == null) {
                aid = "";
            }
            C1392810mLf.LIZLLL(context, str, aid);
        }
    }

    public static final void LIZ$2(C1077250e8h c1077250e8h, View view) {
        if (view != null) {
            Context context = ((C1394730mOl) c1077250e8h.l0).getContext();
            String str = (String) ((C1067370dsl) c1077250e8h.l1).LLJ.getValue();
            InterfaceC1392640mLO interfaceC1392640mLO = ((C1067370dsl) c1077250e8h.l1).LL;
            if (interfaceC1392640mLO == null) {
                interfaceC1392640mLO = null;
            }
            String aid = interfaceC1392640mLO.LJJLIIIJJIZ().getAid();
            if (aid == null) {
                aid = "";
            }
            C1392810mLf.LIZLLL(context, str, aid);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1077250e8h(Object obj, Object obj2, int i) {
        super(700L);
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
