package X;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostInviteListContract$AbsView;

/* JADX INFO: renamed from: X.0b8i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C961940b8i extends AbstractC1585810rMx {
    public final C962490b9b LL;
    public final C950660aqW LLILLL;
    public final MultiCoHostInviteListContract$AbsView LLILZ;
    public boolean LLIZ;
    public final InterfaceC963450bB9 LLILLJJLI = null;
    public EnumC961950b8j LLILZIL = EnumC961950b8j.INVITE_LIST_NORMAL;
    public EnumC961280b7e LLILZLL = EnumC961280b7e.NORMAL;

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
    public final void LJJIJIIJIL(EnumC961280b7e enumC961280b7e) {
        boolean z;
        C978980baC c978980baCOR;
        if (this.LLILZIL == EnumC961950b8j.INVITE_LIST_SCROLL_UP_STATE_COMPRESS && enumC961280b7e == EnumC961280b7e.MANAGE_PANEL_EXTEND) {
            this.LLILZIL = EnumC961950b8j.INVITE_LIST_SCROLL_UP_STATE_EXTEND;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("extend manage panel, toScrollState = ");
            sbLIZ.append(this.LLILZIL);
            C20441214yg.LIZIZ("CoHostInviteListRecyclerViewUtil", C2188811AlT.LIZIZ(sbLIZ));
            C962490b9b c962490b9b = this.LL;
            if (c962490b9b != null) {
                z = true;
            } else {
                z = false;
            }
            C978980baC c978980baC = null;
            C961150b7R c961150b7R = null;
            c978980baC = null;
            if (z) {
                C961150b7R currentHeadViewConfig = c962490b9b.getCurrentHeadViewConfig();
                if (currentHeadViewConfig != null) {
                    currentHeadViewConfig.LJIIIZ = this.LLILZIL.getState();
                    currentHeadViewConfig.LJIIIIZZ = true;
                    currentHeadViewConfig.LJII = false;
                    c961150b7R = currentHeadViewConfig;
                }
                C962490b9b c962490b9b2 = this.LL;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("CoHostInviteListRecyclerViewUtil setManagePanelState managePanelState = ");
                sbLIZ2.append(enumC961280b7e);
                c962490b9b2.e0(c961150b7R, C2188811AlT.LIZIZ(sbLIZ2));
            } else if (this.LLILLJJLI != null) {
                MultiCoHostInviteListContract$AbsView multiCoHostInviteListContract$AbsView = this.LLILZ;
                if (multiCoHostInviteListContract$AbsView != null && (c978980baCOR = multiCoHostInviteListContract$AbsView.OR()) != null) {
                    c978980baCOR.LJJIII = this.LLILZIL.getState();
                    c978980baCOR.LJIILJJIL = true;
                    c978980baCOR.LJIILL = false;
                    c978980baC = c978980baCOR;
                }
                this.LLILLJJLI.Vh(c978980baC);
            }
        }
        this.LLILZLL = enumC961280b7e;
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIJ(RecyclerView recyclerView, int i) {
        boolean z;
        if (i == 2) {
            z = true;
        } else {
            z = false;
        }
        this.LLIZ = z;
    }

    public C961940b8i(C962490b9b c962490b9b, C950660aqW c950660aqW, MultiCoHostInviteListContract$AbsView multiCoHostInviteListContract$AbsView) {
        this.LL = c962490b9b;
        this.LLILLL = c950660aqW;
        this.LLILZ = multiCoHostInviteListContract$AbsView;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0021  */
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
    @Override // X.AbstractC1585810rMx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIZI(androidx.recyclerview.widget.RecyclerView r14, int r15, int r16) {
        /*
            Method dump skipped, instruction units count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C961940b8i.LJJIIZI(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }
}
