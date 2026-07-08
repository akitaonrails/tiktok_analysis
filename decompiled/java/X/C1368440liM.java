package X;

import Y.AObserverS128S0300000_21;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.contact.ContactFeature;
import com.ss.android.ugc.aweme.im.sharepanel.impl.share.viewmodel.ShareDialogViewModel;
import com.ss.android.ugc.aweme.internalshare.api.IInternalShareApi;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0liM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1368440liM extends AbstractC1368500liS<IMContact> {
    public final ShareDialogViewModel LLJIJIL;
    public final SharePackage LLJILJIL;
    public final boolean LLJILJILJ;
    public final boolean LLJILLL;
    public final InterfaceC897330ZId LLJJ;
    public final boolean LLJJI;
    public final int LLJJIII;
    public final View LLJJIJI;
    public final TextView LLJJIJIIJIL;
    public final ImageView LLJJIJIL;
    public final TuxTextView LLJJJ;
    public final C427920GqE LLJJJIL;
    public IMContact LLJJJJ;
    public int LLJJJJJIL;
    public final InterfaceC1368380liG LLJJJJLIIL;
    public final View LLJJL;
    public AObserverS128S0300000_21 LLJJLIIIJLLLLLLLZ;
    public final C1368470liP LLJL;
    public final C01GW LLJLIL;

    @Override // X.AbstractC1368500liS
    public final boolean L5() {
        IMConversation iMConversation;
        IMContact iMContact = this.LLJJJJ;
        IMUser iMUser = iMContact instanceof IMUser ? (IMUser) iMContact : null;
        if (iMUser != null && iMUser.isActive()) {
            return true;
        }
        IMContact iMContact2 = this.LLJJJJ;
        return (iMContact2 instanceof IMConversation) && (iMConversation = (IMConversation) iMContact2) != null && iMConversation.isActive();
    }

    @Override // X.AbstractC1368500liS
    public final void N5() {
        super.N5();
        boolean z = this.LLJJJJ instanceof IMUser;
    }

    public final void P5(IMContact iMContact) {
        View viewFindViewById = this.itemView.findViewById(R.id.eu1);
        List<IMContact> value = this.LLJIJIL.LLJ.getValue();
        if (value == null) {
            value = C13BV.INSTANCE;
        }
        if (this.LLJIJIL.wQ2() && !value.contains(iMContact)) {
            C786410Ut5.T4(viewFindViewById, 0.34f);
            return;
        }
        if ((iMContact instanceof IMUser) && viewFindViewById != null) {
            int disabledOnSharePanelReasonCode = iMContact.getDisabledOnSharePanelReasonCode();
            if (disabledOnSharePanelReasonCode != 1 && disabledOnSharePanelReasonCode != 2 && disabledOnSharePanelReasonCode != 3) {
                C786410Ut5.T4(viewFindViewById, 1.0f);
                return;
            } else {
                C786410Ut5.T4(viewFindViewById, 0.34f);
                return;
            }
        }
        C786410Ut5.T4(viewFindViewById, 1.0f);
    }

    public final boolean R5(IMContact iMContact) {
        if (!this.LLJILJIL.extras.getBoolean("key_is_from_multi_guest_live_event", false) || !Intrinsics.LJFF(this.LLJILJIL.extras.getString("live_event_id", ""), iMContact.getInvitedEventId())) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void S5(com.ss.android.ugc.aweme.im.contacts.api.model.IMContact r4, X.C429270GsP r5) {
        /*
            r3 = this;
            if (r5 == 0) goto L47
            boolean r0 = X.C429290GsR.LIZ(r5)
            r1 = 1
            if (r0 != r1) goto L47
        L9:
            X.0GqE r0 = r3.LLJJJIL
            r0.setActivityStatus(r5)
            android.view.View r0 = r3.itemView
            X.C0ZJ7.LIZ(r0)
            boolean r0 = r4 instanceof com.ss.android.ugc.aweme.im.contacts.api.model.IMUser
            if (r0 == 0) goto L36
            r0 = r4
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUser r0 = (com.ss.android.ugc.aweme.im.contacts.api.model.IMUser) r0
            r0.setActive(r1)
            android.view.View r2 = r3.itemView
            java.lang.String r1 = r4.getUid()
            boolean r0 = r0.isActive()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            X.C0ZJ7.LIZIZ(r2, r1, r0)
            com.ss.android.ugc.aweme.im.contacts.api.model.IMContact r1 = r3.LLJJJJ
            X.0ZE7 r0 = r3.LLJI
            X.C897490ZIt.LIZJ(r3, r1, r0)
        L35:
            return
        L36:
            boolean r0 = r4 instanceof com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation
            if (r0 == 0) goto L35
            com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation r4 = (com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation) r4
            r4.setActive(r1)
            com.ss.android.ugc.aweme.im.contacts.api.model.IMContact r1 = r3.LLJJJJ
            X.0ZE7 r0 = r3.LLJI
            X.C897490ZIt.LIZJ(r3, r1, r0)
            return
        L47:
            r1 = 0
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1368440liM.S5(com.ss.android.ugc.aweme.im.contacts.api.model.IMContact, X.0GsP):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:93:0x029f  */
    /* JADX WARN: Type inference failed for: r0v82, types: [X.0ZIi] */
    /* JADX WARN: Type inference failed for: r10v3, types: [X.0NYc] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [com.ss.android.ugc.aweme.im.contacts.api.model.IMUser] */
    /* JADX WARN: Type inference failed for: r1v24 */
    @Override // X.AbstractC1368500liS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I5(com.ss.android.ugc.aweme.im.contacts.api.model.IMContact r13, com.ss.android.ugc.aweme.im.contacts.api.model.IMContact r14, int r15, X.C0ZE7 r16) {
        /*
            Method dump skipped, instruction units count: 717
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1368440liM.I5(java.lang.Object, java.lang.Object, int, X.0ZE7):void");
    }

    /* JADX WARN: Type inference failed for: r0v27, types: [X.0liP] */
    public C1368440liM(ViewGroup viewGroup, ShareDialogViewModel shareDialogViewModel, SharePackage sharePackage, boolean z, boolean z2, InterfaceC897330ZId interfaceC897330ZId, boolean z3) {
        super(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cqu, viewGroup, false));
        this.LLJIJIL = shareDialogViewModel;
        this.LLJILJIL = sharePackage;
        this.LLJILJILJ = z;
        this.LLJILLL = z2;
        this.LLJJ = interfaceC897330ZId;
        this.LLJJI = z3;
        this.LLJJIII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
        this.LLJJIJI = this.itemView.findViewById(R.id.y1z);
        this.LLJJIJIIJIL = (TextView) this.itemView.findViewById(R.id.y3j);
        this.LLJJIJIL = (ImageView) this.itemView.findViewById(R.id.kku);
        this.LLJJJ = (TuxTextView) this.itemView.findViewById(R.id.ilu);
        this.LLJJJIL = (C427920GqE) this.itemView.findViewById(R.id.a5s);
        this.LLJJJJJIL = -1;
        IInternalShareApi.LIZ.getClass();
        C1361580lXI c1361580lXILJJIJ = C1370970lmR.LIZ().LIZJ().LJJIJ();
        this.LLJJJJLIIL = c1361580lXILJJIJ;
        this.LLJJL = this.itemView.findViewById(R.id.eu1);
        this.LLJL = new C0NYY() { // from class: X.0liP
            @Override // X.C0NYY
            public final Object k3(Map<String, C595660NXw> map, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                String strLJIIIZ;
                IMContact iMContact = this.LL.LLJJJJ;
                if (iMContact == null) {
                    return Unit.LIZ;
                }
                ContactFeature contactFeatureLIZ = ContactFeature.LIZ.LIZ();
                if (contactFeatureLIZ != null && (strLJIIIZ = contactFeatureLIZ.LJIIIZ(iMContact)) != null) {
                    if (!map.containsKey(strLJIIIZ)) {
                        return Unit.LIZ;
                    }
                    this.LL.S5(iMContact, C896480ZEw.LIZIZ(map.get(strLJIIIZ)));
                    return Unit.LIZ;
                }
                return Unit.LIZ;
            }
        };
        this.LLJLIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1300));
        if ((c1361580lXILJJIJ instanceof AbstractC2211791BhR) && c1361580lXILJJIJ != null) {
            C2211751BhN.LIZ(this.itemView, c1361580lXILJJIJ);
        }
    }
}
