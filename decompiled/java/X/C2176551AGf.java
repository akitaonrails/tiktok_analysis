package X;

import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS224S0000000_33;
import tikcast.api.anchor_data.LiveCenterDetailAnchorGrowLevelInfo;

/* JADX INFO: renamed from: X.1AGf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2176551AGf extends C1AHE {
    public final RecyclerView LLILLJJLI;
    public final LinearLayout LLILLL;
    public final C01GW LLILZ;
    public LiveCenterDetailAnchorGrowLevelInfo LLILZIL;
    public boolean LLILZLL;
    public C1AGW LLIZ;

    /* JADX WARN: Removed duplicated region for block: B:72:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0294  */
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
    @Override // X.C1AHE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P5(int r16) {
        /*
            Method dump skipped, instruction units count: 1152
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2176551AGf.P5(int):void");
    }

    public C2176551AGf(View view, C1AHD c1ahd) {
        super(view, c1ahd);
        this.LLILLJJLI = (RecyclerView) view.findViewById(R.id.j8p);
        this.LLILLL = (LinearLayout) view.findViewById(R.id.j8q);
        this.LLILZ = C292401Bi.LIZ(AFwS224S0000000_33.get$arr$(587));
        this.LLILZLL = true;
        N5();
    }

    public final void R5(List<? extends C2176651AGp> list, List<C2176651AGp> list2) {
        if (list.size() == list2.size()) {
            return;
        }
        C1AGW c1agw = this.LLIZ;
        if (c1agw != null) {
            c1agw.LLLI(list2);
        }
        if (list2.size() > list.size()) {
            C1AGW c1agw2 = this.LLIZ;
            if (c1agw2 != null) {
                c1agw2.notifyItemRangeInserted(list.size(), list2.size() - list.size());
                return;
            }
            return;
        }
        C1AGW c1agw3 = this.LLIZ;
        if (c1agw3 == null) {
            return;
        }
        c1agw3.notifyItemRangeRemoved(list2.size(), list.size() - list2.size());
    }
}
