package X;

import Y.AObserverS128S0300000_21;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.internalshare.impl.more.ShareMoreViewModel;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AwS670S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lib, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1368590lib extends AbstractC1368630lif<IMContact> {
    public SharePackage LLILZLL;
    public final ShareMoreViewModel LLIZ;
    public final C1368320liA LLIZLLLIL;
    public final boolean LLJ;
    public final InterfaceC1363370laB LLJI;
    public final LifecycleOwner LLJIJIL;
    public final InterfaceC897330ZId LLJILJIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;
    public LinearLayoutManager LLJJ;
    public final C01GW LLJJI = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(5));
    public final C01GW LLJJIII = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(9));
    public final AwS670S0100000_21 LLJJIJI = new AwS670S0100000_21(this, 2);

    @Override // X.AbstractC1368630lif
    public final InterfaceC1631620sYq<Integer, Integer, View, Unit> LLLIILIL() {
        return this.LLJJIJI;
    }

    @Override // X.AbstractC1368630lif
    public final InterfaceC1363370laB LLLIL() {
        return this.LLJI;
    }

    @Override // X.AbstractC1368630lif
    public final SharePackage LLLILZ() {
        return this.LLILZLL;
    }

    @Override // X.AbstractC1368630lif
    public final AbstractC1368540liW LLLJ(ViewGroup viewGroup) {
        return new C1368410liJ(viewGroup, this.LLIZ, this.LLILZLL, this.LLJ, this.LLJILJIL);
    }

    @Override // X.AbstractC1368630lif
    /* JADX INFO: renamed from: LLLLII, reason: merged with bridge method [inline-methods] */
    public final boolean LLLJL(IMContact iMContact) {
        if (this.LLJILJILJ) {
            if (iMContact instanceof IMUser) {
                C2201941BFw c2201941BFw = IMUser.Companion;
                int followStatus = ((IMUser) iMContact).getFollowStatus();
                c2201941BFw.getClass();
                if (C2201941BFw.LIZLLL(followStatus)) {
                    return false;
                }
            }
            if (iMContact instanceof C1363150lZp) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // X.AbstractC1368630lif, X.AbstractC438050HFr
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
        this.LLJJ = (LinearLayoutManager) recyclerView.getLayoutManager();
    }

    @Override // X.AbstractC683510QrV, X.AbstractC21673619ry
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewAttachedToWindow(viewHolder);
        if ((viewHolder instanceof C1368410liJ) && viewHolder != null) {
            C1368410liJ c1368410liJ = (C1368410liJ) viewHolder;
            AObserverS128S0300000_21 aObserverS128S0300000_21 = c1368410liJ.LLJLILLLLZIIL;
            if (aObserverS128S0300000_21 != null) {
                this.LLIZ.LLJJIJIL.observe(this.LLJIJIL, aObserverS128S0300000_21);
            }
            InterfaceC897330ZId interfaceC897330ZId = c1368410liJ.LLJJ;
            if (interfaceC897330ZId != null) {
                interfaceC897330ZId.LIZIZ(true, c1368410liJ.LLJLLIL);
            }
        }
    }

    @Override // X.AbstractC683510QrV, X.AbstractC21673619ry
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        C1368410liJ c1368410liJ;
        AObserverS128S0300000_21 aObserverS128S0300000_21;
        super.onViewDetachedFromWindow(viewHolder);
        if ((viewHolder instanceof C1368410liJ) && (c1368410liJ = (C1368410liJ) viewHolder) != null && (aObserverS128S0300000_21 = c1368410liJ.LLJLILLLLZIIL) != null) {
            this.LLIZ.LLJJIJIL.removeObserver(aObserverS128S0300000_21);
            C1368410liJ c1368410liJ2 = (C1368410liJ) viewHolder;
            InterfaceC897330ZId interfaceC897330ZId = c1368410liJ2.LLJJ;
            if (interfaceC897330ZId != null) {
                interfaceC897330ZId.LJIIJ(c1368410liJ2.LLJLLIL);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:236:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0168  */
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
    public final void LLLL(int r32, com.ss.android.ugc.aweme.im.contacts.api.model.IMContact r33) {
        /*
            Method dump skipped, instruction units count: 965
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1368590lib.LLLL(int, com.ss.android.ugc.aweme.im.contacts.api.model.IMContact):void");
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List<Object> list) {
        Boolean bool;
        IMContact iMContactLLLII;
        if (viewHolder instanceof C1368410liJ) {
            if (list.isEmpty()) {
                onBindViewHolder(viewHolder, i);
                return;
            }
            if (Intrinsics.LJFF(C13LP.LJJJLL(list), "update_gray")) {
                IMContact iMContactLLLII2 = LLLII(i);
                if (iMContactLLLII2 == null) {
                    return;
                }
                C1368410liJ c1368410liJ = (C1368410liJ) viewHolder;
                c1368410liJ.R5(iMContactLLLII2);
                List<IMContact> value = c1368410liJ.LLJILJIL.LLJILLL.getValue();
                if (value == null) {
                    value = C13BV.INSTANCE;
                }
                c1368410liJ.LLIZLLLIL.setChecked(value.contains(iMContactLLLII2));
            }
            Object objLJJJLL = C13LP.LJJJLL(list);
            if ((objLJJJLL instanceof Boolean) && (bool = (Boolean) objLJJJLL) != null) {
                C1368410liJ c1368410liJ2 = (C1368410liJ) viewHolder;
                c1368410liJ2.LLIZLLLIL.setChecked(bool.booleanValue());
                if (this.LLIZ.vQ2() && (iMContactLLLII = LLLII(i)) != null) {
                    c1368410liJ2.R5(iMContactLLLII);
                    return;
                }
                return;
            }
            return;
        }
        super.onBindViewHolder(viewHolder, i, list);
    }

    public C1368590lib(SharePackage sharePackage, ShareMoreViewModel shareMoreViewModel, C1368320liA c1368320liA, boolean z, C1368800liw c1368800liw, Fragment fragment, C897520ZIw c897520ZIw) {
        this.LLILZLL = sharePackage;
        this.LLIZ = shareMoreViewModel;
        this.LLIZLLLIL = c1368320liA;
        this.LLJ = z;
        this.LLJI = c1368800liw;
        this.LLJIJIL = fragment;
        this.LLJILJIL = c897520ZIw;
    }
}
