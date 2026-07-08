package X;

import Y.ACListenerS124S0200000_21;
import Y.ACListenerS86S0300000_21;
import Y.AObserverS128S0300000_21;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.sharepanel.impl.share.viewmodel.ShareDialogViewModel;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.util.List;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AwS670S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lia, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1368580lia extends AbstractC1368600lic<IMContact> {
    public final SharePackage LLILZLL;
    public final ShareDialogViewModel LLIZ;
    public final boolean LLIZLLLIL;
    public final boolean LLJ;
    public final InterfaceC1363370laB LLJI;
    public final LifecycleOwner LLJIJIL;
    public final InterfaceC897330ZId LLJILJIL;
    public final InterfaceC1369040ljK LLJILJILJ;
    public final boolean LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;
    public LinearLayoutManager LLJJIII;
    public final C01GW LLJJIJI = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(444));
    public final AwS670S0100000_21 LLJJIJIIJIL = new AwS670S0100000_21(this, 17);

    public final boolean LLLILZ(IMContact iMContact) {
        if (!this.LLILZLL.extras.getBoolean("key_is_from_multi_guest_live_event", false) || !Intrinsics.LJFF(this.LLILZLL.extras.getString("live_event_id", ""), iMContact.getInvitedEventId())) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LLLJ(com.ss.android.ugc.aweme.im.contacts.api.model.IMContact r3) {
        /*
            r2 = this;
            boolean r0 = r2.LLJJ
            if (r0 == 0) goto L1a
            boolean r0 = r3 instanceof com.ss.android.ugc.aweme.im.contacts.api.model.IMUser
            if (r0 == 0) goto L22
            X.1BFw r1 = com.ss.android.ugc.aweme.im.contacts.api.model.IMUser.Companion
            r0 = r3
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUser r0 = (com.ss.android.ugc.aweme.im.contacts.api.model.IMUser) r0
            int r0 = r0.getFollowStatus()
            r1.getClass()
            boolean r0 = X.C2201941BFw.LIZLLL(r0)
            if (r0 == 0) goto L22
        L1a:
            boolean r0 = r2.LLLILZ(r3)
            if (r0 != 0) goto L27
            r0 = 0
            return r0
        L22:
            boolean r0 = r3 instanceof X.C1363150lZp
            if (r0 == 0) goto L27
            goto L1a
        L27:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1368580lia.LLLJ(com.ss.android.ugc.aweme.im.contacts.api.model.IMContact):boolean");
    }

    @Override // X.AbstractC1368600lic, X.AbstractC438050HFr
    public final int getBasicItemViewType(int i) {
        List<IMContact> listLLLFZ = LLLFZ();
        if (listLLLFZ != null && !listLLLFZ.isEmpty() && i >= LLLI()) {
            Integer numValueOf = Integer.valueOf(i - LLLI());
            int iIntValue = numValueOf.intValue();
            if (iIntValue >= 0 && iIntValue < listLLLFZ.size()) {
                if (!(ListProtector.get(listLLLFZ, numValueOf.intValue()) instanceof C1363150lZp)) {
                    return 0;
                }
                return 2;
            }
            return super.getBasicItemViewType(i);
        }
        return super.getBasicItemViewType(i);
    }

    @Override // X.AbstractC683510QrV, X.AbstractC21673619ry
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.LLJJIII = (LinearLayoutManager) recyclerView.getLayoutManager();
    }

    @Override // X.AbstractC683510QrV, X.AbstractC21673619ry
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        C1368450liN c1368450liN;
        InterfaceC897330ZId interfaceC897330ZId;
        InterfaceC897330ZId interfaceC897330ZId2;
        super.onViewAttachedToWindow(viewHolder);
        RecyclerView.ViewHolder viewHolder2 = null;
        if (viewHolder instanceof C1368440liM) {
            viewHolder2 = viewHolder;
        }
        if (viewHolder2 != null) {
            C1368440liM c1368440liM = (C1368440liM) viewHolder;
            AObserverS128S0300000_21 aObserverS128S0300000_21 = c1368440liM.LLJJLIIIJLLLLLLLZ;
            if (aObserverS128S0300000_21 != null) {
                this.LLIZ.LLJJ.observe(this.LLJIJIL, aObserverS128S0300000_21);
            }
            if (!c1368440liM.LLJILJIL.extras.getBoolean("key_is_from_multi_guest_live_event", false) && (interfaceC897330ZId2 = c1368440liM.LLJJ) != null) {
                interfaceC897330ZId2.LIZIZ(true, c1368440liM.LLJL);
            }
        }
        if ((viewHolder instanceof C1368450liN) && viewHolder != null && (interfaceC897330ZId = (c1368450liN = (C1368450liN) viewHolder).LLJJ) != null) {
            interfaceC897330ZId.LIZIZ(true, c1368450liN.LLJJJJJIL);
        }
    }

    @Override // X.AbstractC683510QrV, X.AbstractC21673619ry
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        C1368450liN c1368450liN;
        InterfaceC897330ZId interfaceC897330ZId;
        C1368440liM c1368440liM;
        AObserverS128S0300000_21 aObserverS128S0300000_21;
        super.onViewDetachedFromWindow(viewHolder);
        if ((viewHolder instanceof C1368440liM) && (c1368440liM = (C1368440liM) viewHolder) != null && (aObserverS128S0300000_21 = c1368440liM.LLJJLIIIJLLLLLLLZ) != null) {
            this.LLIZ.LLJJ.removeObserver(aObserverS128S0300000_21);
            C1368440liM c1368440liM2 = (C1368440liM) viewHolder;
            InterfaceC897330ZId interfaceC897330ZId2 = c1368440liM2.LLJJ;
            if (interfaceC897330ZId2 != null) {
                interfaceC897330ZId2.LJIIJ(c1368440liM2.LLJL);
            }
        }
        if ((viewHolder instanceof C1368450liN) && viewHolder != null && (interfaceC897330ZId = (c1368450liN = (C1368450liN) viewHolder).LLJJ) != null) {
            interfaceC897330ZId.LJIIJ(c1368450liN.LLJJJJJIL);
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        super.onViewRecycled(viewHolder);
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x017e  */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLILZLLLI(int r34, com.ss.android.ugc.aweme.im.contacts.api.model.IMContact r35) {
        /*
            Method dump skipped, instruction units count: 805
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1368580lia.LLLILZLLLI(int, com.ss.android.ugc.aweme.im.contacts.api.model.IMContact):void");
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List<Object> list) {
        Boolean bool;
        Boolean bool2;
        IMContact iMContactLLLII;
        if (viewHolder instanceof C1368440liM) {
            if (list.isEmpty()) {
                onBindViewHolder(viewHolder, i);
                return;
            }
            if (Intrinsics.LJFF(C13LP.LJJJLL(list), "update_gray")) {
                IMContact iMContactLLLII2 = LLLII(i);
                if (iMContactLLLII2 == null) {
                    return;
                }
                C1368440liM c1368440liM = (C1368440liM) viewHolder;
                c1368440liM.P5(iMContactLLLII2);
                List<IMContact> value = c1368440liM.LLJIJIL.LLJ.getValue();
                if (value == null) {
                    value = C13BV.INSTANCE;
                }
                c1368440liM.LLIZLLLIL.setChecked(value.contains(iMContactLLLII2));
            }
            Object objLJJJLL = C13LP.LJJJLL(list);
            if ((objLJJJLL instanceof Boolean) && (bool2 = (Boolean) objLJJJLL) != null) {
                C1368440liM c1368440liM2 = (C1368440liM) viewHolder;
                c1368440liM2.LLIZLLLIL.setChecked(bool2.booleanValue());
                if (this.LLIZ.vQ2() && (iMContactLLLII = LLLII(i)) != null) {
                    c1368440liM2.P5(iMContactLLLII);
                    return;
                }
                return;
            }
            return;
        }
        if (viewHolder instanceof C1368450liN) {
            if (list.isEmpty()) {
                onBindViewHolder(viewHolder, i);
                return;
            }
            Object objLJJJLL2 = C13LP.LJJJLL(list);
            if ((objLJJJLL2 instanceof Boolean) && (bool = (Boolean) objLJJJLL2) != null) {
                C1368450liN c1368450liN = (C1368450liN) viewHolder;
                if (!bool.booleanValue()) {
                    c1368450liN.getClass();
                    return;
                }
                IMContact iMContact = c1368450liN.LLJJI;
                if (iMContact != null) {
                    C197039127h c197039127h = c1368450liN.LLJJJJ;
                    c197039127h.setText(c197039127h.getContext().getString(2131836997));
                    c197039127h.setButtonVariant(1);
                    C786410Ut5.U8(c197039127h, new ACListenerS86S0300000_21(c197039127h, c1368450liN, iMContact, 5));
                    C786410Ut5.I7(new ACListenerS124S0200000_21(iMContact, c1368450liN, 40), c1368450liN.LLILLJJLI);
                    C786410Ut5.G9(c1368450liN.LLILLL, new ACListenerS124S0200000_21(iMContact, c1368450liN, 41));
                    return;
                }
                return;
            }
            return;
        }
        super.onBindViewHolder(viewHolder, i, list);
    }

    public C1368580lia(SharePackage sharePackage, ShareDialogViewModel shareDialogViewModel, boolean z, boolean z2, DialogC1368760lis dialogC1368760lis, LifecycleOwner lifecycleOwner, InterfaceC897330ZId interfaceC897330ZId, InterfaceC1369040ljK interfaceC1369040ljK, boolean z3) {
        this.LLILZLL = sharePackage;
        this.LLIZ = shareDialogViewModel;
        this.LLIZLLLIL = z;
        this.LLJ = z2;
        this.LLJI = dialogC1368760lis;
        this.LLJIJIL = lifecycleOwner;
        this.LLJILJIL = interfaceC897330ZId;
        this.LLJILJILJ = interfaceC1369040ljK;
        this.LLJILLL = z3;
    }
}
