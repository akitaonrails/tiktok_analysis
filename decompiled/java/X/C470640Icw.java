package X;

import Y.ACListenerS142S0100000_7;
import android.view.View;
import com.bytedance.android.live.core.paging.viewmodel.PagingViewModel;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.setting.LiveDrawerTabLandingCustomSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Icw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C470640Icw extends AbstractC470810IdD {
    public final PagingViewModel LL;
    public final LiveIconView LLILLJJLI;
    public final C16F5 LLILLL;
    public final C16F5 LLILZ;
    public final View LLILZIL;
    public final C11NJ LLILZLL;

    @Override // X.AbstractC470810IdD
    public final void L5() {
        this.LLILZLL.LJ();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.AbstractC470810IdD
    public final void I5(boolean z) {
        this.itemView.getContext();
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (!C036E.LIZ.LIZIZ()) {
            if (LiveDrawerTabLandingCustomSetting.INSTANCE.getValue()) {
                C470390IcX.LIZ(this.LLILLJJLI, R.attr.eoh);
            } else {
                this.LLILLJJLI.setIconAttr(R.attr.dye);
            }
            this.LLILLL.setText(2131843669);
            this.LLILZ.setText(2131843670);
        } else {
            if (LiveDrawerTabLandingCustomSetting.INSTANCE.getValue()) {
                C470390IcX.LIZ(this.LLILLJJLI, R.attr.eog);
            } else {
                this.LLILLJJLI.setIconAttr(R.attr.dy5);
            }
            this.LLILLL.setText(2131842856);
            this.LLILZ.setText(2131842857);
        }
        C786410Ut5.I7(new ACListenerS142S0100000_7(this, 277), this.LLILZIL);
        if (LiveDrawerTabLandingCustomSetting.INSTANCE.getValue()) {
            C470390IcX.LIZIZ(this.LLILZIL);
        }
        if (!z) {
            C470630Icv c470630Icv = (C470630Icv) this.LL.LLIZ;
            int iLIZJ = c470630Icv.LJIIIZ.LIZJ(c470630Icv.LJIIJ);
            for (int i = 0; i < iLIZJ; i++) {
                C470630Icv c470630Icv2 = (C470630Icv) this.LL.LLIZ;
                c470630Icv2.LJIIIZ.LIZ(c470630Icv2.LJIIJ);
                c470630Icv2.LJI.onNext(C0J1R.LIZJ);
            }
        }
    }

    public C470640Icw(View view, PagingViewModel pagingViewModel) {
        super(view);
        this.LLILZLL = new C11NJ();
        this.LL = pagingViewModel;
        this.LLILLJJLI = (LiveIconView) view.findViewById(R.id.hbb);
        this.LLILLL = (C16F5) view.findViewById(R.id.hc4);
        this.LLILZ = (C16F5) view.findViewById(R.id.hb1);
        this.LLILZIL = view.findViewById(R.id.hbk);
    }
}
