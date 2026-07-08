package X;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.internalshare.api.IInternalShareApi;
import com.ss.android.ugc.aweme.internalshare.impl.more.ShareMoreViewModel;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: X.0liF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1368370liF extends AbstractC1368540liW<IMContact> {
    public final ViewGroup LLJILJIL;
    public final ShareMoreViewModel LLJILJILJ;
    public final SharePackage LLJILLL;
    public final boolean LLJJ;
    public final InterfaceC897330ZId LLJJI;
    public final InterfaceC1362600lYw LLJJIII;
    public final Map<String, String> LLJJIJI;
    public final Map<String, String> LLJJIJIIJIL;
    public final Function0<Integer> LLJJIJIL;
    public final int LLJJJ;
    public IMContact LLJJJIL;
    public final InterfaceC1368380liG LLJJJJ;
    public final C1365060lcu LLJJJJJIL;

    @Override // X.AbstractC1368540liW
    public final boolean L5() {
        IMConversation iMConversation;
        IMContact iMContact = this.LLJJJIL;
        IMUser iMUser = iMContact instanceof IMUser ? (IMUser) iMContact : null;
        if (iMUser != null && iMUser.isActive()) {
            return true;
        }
        IMContact iMContact2 = this.LLJJJIL;
        return (iMContact2 instanceof IMConversation) && (iMConversation = (IMConversation) iMContact2) != null && iMConversation.isActive();
    }

    public final void R5(IMContact iMContact) {
        View viewFindViewById = this.itemView.findViewById(R.id.eu1);
        List<IMContact> value = this.LLJILJILJ.LLJILLL.getValue();
        if (value == null) {
            value = C13BV.INSTANCE;
        }
        if (this.LLJILJILJ.wQ2() && !value.contains(iMContact)) {
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

    public final SpannableString P5(int i, IMContact iMContact) {
        int iLIZ = C960203pA.LIZ(R.attr.a04, this.LLILZIL.getContext());
        C1368220li0 c1368220li0 = (C1368220li0) C08L9.LIZ(iMContact.getAllMatchMetaCopy(), Integer.valueOf(i), null);
        if (c1368220li0 == null) {
            return null;
        }
        SpannableString spannableString = new SpannableString(c1368220li0.LIZJ);
        for (IntRange intRange : c1368220li0.LIZLLL.LIZIZ) {
            C786410Ut5.p2(spannableString, new ForegroundColorSpan(iLIZ), intRange.LL, intRange.LLILLJJLI + 1, 17);
        }
        return spannableString;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x016e  */
    @Override // X.AbstractC1368540liW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I5(com.ss.android.ugc.aweme.im.contacts.api.model.IMContact r20, com.ss.android.ugc.aweme.im.contacts.api.model.IMContact r21, int r22, X.C0ZE7 r23) {
        /*
            Method dump skipped, instruction units count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1368370liF.I5(java.lang.Object, java.lang.Object, int, X.0ZE7):void");
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.0lcu] */
    public C1368370liF(ViewGroup viewGroup, ShareMoreViewModel shareMoreViewModel, SharePackage sharePackage, boolean z, InterfaceC897330ZId interfaceC897330ZId, InterfaceC1362600lYw interfaceC1362600lYw, Map map, Map map2, AwS565S0100000_21 awS565S0100000_21) {
        super(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cgz, viewGroup, false));
        this.LLJILJIL = viewGroup;
        this.LLJILJILJ = shareMoreViewModel;
        this.LLJILLL = sharePackage;
        this.LLJJ = z;
        this.LLJJI = interfaceC897330ZId;
        this.LLJJIII = interfaceC1362600lYw;
        this.LLJJIJI = map;
        this.LLJJIJIIJIL = map2;
        this.LLJJIJIL = awS565S0100000_21;
        this.LLJJJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
        IInternalShareApi.LIZ.getClass();
        C1361580lXI c1361580lXILJJIJ = C1370970lmR.LIZ().LIZJ().LJJIJ();
        this.LLJJJJ = c1361580lXILJJIJ;
        this.LLJJJJJIL = new C0NYY() { // from class: X.0lcu
            /* JADX WARN: Removed duplicated region for block: B:26:0x0073  */
            @Override // X.C0NYY
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object k3(java.util.Map<java.lang.String, X.C595660NXw> r6, X.InterfaceC1364105Vn<? super kotlin.Unit> r7) {
                /*
                    r5 = this;
                    X.0liF r0 = r5.LL
                    com.ss.android.ugc.aweme.im.contacts.api.model.IMContact r4 = r0.LLJJJIL
                    if (r4 != 0) goto L9
                    kotlin.Unit r0 = kotlin.Unit.LIZ
                    return r0
                L9:
                    X.06QG r0 = com.ss.android.ugc.aweme.im.saas.host.api.feature.contact.ContactFeature.LIZ
                    com.ss.android.ugc.aweme.im.saas.host.api.feature.contact.ContactFeature r0 = r0.LIZ()
                    if (r0 == 0) goto L1e
                    java.lang.String r1 = r0.LJIIIZ(r4)
                L15:
                    boolean r0 = r6.containsKey(r1)
                    if (r0 != 0) goto L20
                    kotlin.Unit r0 = kotlin.Unit.LIZ
                    return r0
                L1e:
                    r1 = 0
                    goto L15
                L20:
                    java.lang.Object r0 = r6.get(r1)
                    X.0NXw r0 = (X.C595660NXw) r0
                    X.0GsP r0 = X.C896480ZEw.LIZIZ(r0)
                    X.0liF r3 = r5.LL
                    r3.getClass()
                    if (r0 == 0) goto L73
                    boolean r0 = X.C429290GsR.LIZ(r0)
                    r1 = 1
                    if (r0 != r1) goto L73
                L38:
                    android.view.View r0 = r3.itemView
                    X.C0ZJ7.LIZ(r0)
                    boolean r0 = r4 instanceof com.ss.android.ugc.aweme.im.contacts.api.model.IMUser
                    if (r0 == 0) goto L62
                    r0 = r4
                    com.ss.android.ugc.aweme.im.contacts.api.model.IMUser r0 = (com.ss.android.ugc.aweme.im.contacts.api.model.IMUser) r0
                    r0.setActive(r1)
                    android.view.View r2 = r3.itemView
                    java.lang.String r1 = r4.getUid()
                    boolean r0 = r0.isActive()
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                    X.C0ZJ7.LIZIZ(r2, r1, r0)
                    com.ss.android.ugc.aweme.im.contacts.api.model.IMContact r1 = r3.LLJJJIL
                    X.0ZE7 r0 = r3.LLJIJIL
                    X.C897490ZIt.LIZJ(r3, r1, r0)
                L5f:
                    kotlin.Unit r0 = kotlin.Unit.LIZ
                    return r0
                L62:
                    boolean r0 = r4 instanceof com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation
                    if (r0 == 0) goto L5f
                    com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation r4 = (com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation) r4
                    r4.setActive(r1)
                    com.ss.android.ugc.aweme.im.contacts.api.model.IMContact r1 = r3.LLJJJIL
                    X.0ZE7 r0 = r3.LLJIJIL
                    X.C897490ZIt.LIZJ(r3, r1, r0)
                    goto L5f
                L73:
                    r1 = 0
                    goto L38
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1365060lcu.k3(java.util.Map, X.05Vn):java.lang.Object");
            }
        };
        if ((c1361580lXILJJIJ instanceof AbstractC2211791BhR) && c1361580lXILJJIJ != null) {
            C2211751BhN.LIZ(this.itemView, c1361580lXILJJIJ);
        }
        if (C1268904xr.LIZ()) {
            this.itemView.findViewById(R.id.fuf);
            this.itemView.findViewById(R.id.t50);
            this.itemView.findViewById(R.id.o39);
        }
    }
}
