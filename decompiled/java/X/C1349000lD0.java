package X;

import android.view.ViewGroup;
import com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.AbstractBottomPriorityComponent;
import java.util.HashMap;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lD0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1349000lD0 {
    public final ViewGroup LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(513));
    public String LIZJ = "";

    public final HashMap<String, AbstractBottomPriorityComponent> LIZJ() {
        return (HashMap) this.LIZIZ.getValue();
    }

    public final void LIZLLL() {
        for (String str : C1349010lD1.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getProtocolForCurrentAweme: ");
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
            AbstractBottomPriorityComponent abstractBottomPriorityComponent = LIZJ().get(str);
            if (abstractBottomPriorityComponent != null && abstractBottomPriorityComponent.LJJLIL()) {
                String str2 = this.LIZJ;
                if (!Intrinsics.LJFF(str2, str)) {
                    ViewGroup viewGroup = this.LIZ;
                    if (viewGroup != null) {
                        C786410Ut5.LJJJJI(viewGroup);
                    }
                    ViewGroup viewGroup2 = this.LIZ;
                    if (viewGroup2 != null) {
                        viewGroup2.addView(abstractBottomPriorityComponent.LJJIJL());
                    }
                    this.LIZJ = str;
                }
                AbstractBottomPriorityComponent abstractBottomPriorityComponent2 = LIZJ().get(str2);
                if (abstractBottomPriorityComponent2 != null) {
                    abstractBottomPriorityComponent2.Oo(this.LIZ);
                }
                abstractBottomPriorityComponent.Lo(str2, this.LIZ);
                return;
            }
        }
        throw new IllegalStateException("No valid protocol found!");
    }

    public final AbstractBottomPriorityComponent LIZ() {
        return LIZJ().get(this.LIZJ);
    }

    public final InterfaceC1349050lD5 LIZIZ() {
        C06KX c06kx = (AbstractBottomPriorityComponent) LIZJ().get("default_comment");
        if (c06kx == null || (c06kx instanceof InterfaceC1349050lD5)) {
            return (InterfaceC1349050lD5) c06kx;
        }
        return null;
    }

    public C1349000lD0(ViewGroup viewGroup) {
        this.LIZ = viewGroup;
    }
}
