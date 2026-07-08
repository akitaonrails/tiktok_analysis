package X;

import X.C11EV;
import X.C19464111Db;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* JADX INFO: renamed from: X.11DY, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public abstract class C11DY<VH extends C11EV<?>, M extends C19464111Db<VH>> extends AbstractC683510QrV implements InterfaceC19464411De<VH, M> {
    public abstract void LLLFZ(C19465311Dn c19465311Dn);

    @Override // X.AbstractC438050HFr
    public int getBasicItemViewType(int i) {
        return i < 0 ? Integer.MAX_VALUE : 0;
    }

    @Override // X.AbstractC438050HFr
    public final void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
    }

    @Override // X.AbstractC683510QrV, X.AbstractC21673619ry
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        LIZJ().LJ(recyclerView);
    }

    @Override // X.AbstractC683510QrV, X.AbstractC21673619ry
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        C19464011Da c19464011Da = LIZJ().LIZLLL;
        C11D6 c11d6 = c19464011Da.LIZIZ;
        c11d6.LLILLL = null;
        recyclerView.removeOnAttachStateChangeListener(c11d6);
        c19464011Da.LIZJ = null;
    }

    @Override // X.AbstractC438050HFr
    public final RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        if (i != Integer.MAX_VALUE) {
            return LIZJ().LIZ(i, viewGroup);
        }
        throw null;
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
    @Override // X.AbstractC21673619ry
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List<Object> list) {
        if (getItemViewType(i) == Integer.MIN_VALUE) {
            super.onBindViewHolder(viewHolder, i, list);
            return;
        }
        if (getItemViewType(i) == Integer.MAX_VALUE) {
            return;
        }
        C19465311Dn c19465311DnLIZJ = LIZJ();
        C11EV c11ev = (C11EV) viewHolder;
        Object objLIZ = ((C11DP) this).LLILLJJLI.LIZ(i, true);
        c19465311DnLIZJ.getClass();
        if (objLIZ == null) {
            return;
        }
        c11ev.N5(list, i, objLIZ);
    }
}
