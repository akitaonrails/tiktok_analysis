package X;

import android.view.View;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.tools.draft.adapter.viewholder.NewDraftViewHolder;

/* JADX INFO: renamed from: X.0MqI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C580840MqI extends AbstractViewOnClickListenerC372950Ejl {
    public final int $t;
    public Object l0;

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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C580840MqI(NewDraftViewHolder newDraftViewHolder, int i) {
        super(1000L);
        this.$t = i;
        this.l0 = newDraftViewHolder;
    }

    public static final void LIZ$0(C580840MqI c580840MqI, View view) {
        C531100KsG c531100KsG = (C531100KsG) c580840MqI.l0;
        MediaModel mediaModel = c531100KsG.LLILZ;
        if (mediaModel != null) {
            c531100KsG.LLILLJJLI.invoke(mediaModel);
        }
    }

    public static final void LIZ$1(C580840MqI c580840MqI, View view) {
        InterfaceC529800KqA interfaceC529800KqA = ((C529740Kq4) c580840MqI.l0).LLLILZLLLI;
        if (interfaceC529800KqA != null) {
            interfaceC529800KqA.getClickListener().onClick(view);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void LIZ$2(C580840MqI c580840MqI, View view) {
        NewDraftViewHolder newDraftViewHolder = (NewDraftViewHolder) c580840MqI.l0;
        C0M0P c0m0p = newDraftViewHolder.LLJJIJIIJIL;
        C0M0P c0m0p2 = null;
        C0HZQ c0hzq = null;
        if (c0m0p == null) {
            c0m0p = null;
        }
        if (c0m0p.LIZIZ) {
            C0HZQ c0hzq2 = newDraftViewHolder.LLJJIII;
            if (c0hzq2 == null) {
                c0hzq2 = null;
            }
            if (c0hzq2.isEnabled()) {
                C0HZQ c0hzq3 = newDraftViewHolder.LLJJIII;
                if (c0hzq3 == null) {
                    c0hzq3 = null;
                }
                C0M0P c0m0p3 = newDraftViewHolder.LLJJIJIIJIL;
                if (c0m0p3 == null) {
                    c0m0p3 = null;
                }
                c0hzq3.setChecked(!c0m0p3.LJIIJJI);
                C0M3H c0m3h = newDraftViewHolder.LL;
                C0HZQ c0hzq4 = newDraftViewHolder.LLJJIII;
                C0M0P c0m0p4 = newDraftViewHolder.LLJJIJIIJIL;
                if (c0m0p4 == null) {
                    c0m0p4 = null;
                }
                if (c0hzq4 != null) {
                    c0hzq = c0hzq4;
                }
                c0m3h.v3(c0m0p4, c0hzq.isChecked(), false);
                return;
            }
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - newDraftViewHolder.LLJJJIL < 500) {
            return;
        }
        newDraftViewHolder.LLJJJIL = jCurrentTimeMillis;
        C0M3H c0m3h2 = newDraftViewHolder.LL;
        int adapterPosition = newDraftViewHolder.getAdapterPosition();
        C0M0P c0m0p5 = newDraftViewHolder.LLJJIJIIJIL;
        if (c0m0p5 != null) {
            c0m0p2 = c0m0p5;
        }
        c0m3h2.LLLLZLLIL(adapterPosition, c0m0p2);
    }

    public C580840MqI(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
