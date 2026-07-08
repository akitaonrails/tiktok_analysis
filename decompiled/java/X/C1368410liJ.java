package X;

import Y.AObserverS128S0300000_21;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.contact.ContactFeature;
import com.ss.android.ugc.aweme.internalshare.api.IInternalShareApi;
import com.ss.android.ugc.aweme.internalshare.impl.more.ShareMoreViewModel;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: X.0liJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1368410liJ extends AbstractC1368540liW<IMContact> {
    public final ShareMoreViewModel LLJILJIL;
    public final SharePackage LLJILJILJ;
    public final boolean LLJILLL;
    public final InterfaceC897330ZId LLJJ;
    public final View LLJJI;
    public final TextView LLJJIII;
    public final ImageView LLJJIJI;
    public final TuxTextView LLJJIJIIJIL;
    public final C427920GqE LLJJIJIL;
    public IMContact LLJJJ;
    public int LLJJJIL;
    public final InterfaceC1368380liG LLJJJJ;
    public final View LLJJJJJIL;
    public final TuxTextView LLJJJJLIIL;
    public final TuxTextView LLJJL;
    public final TuxTextView LLJJLIIIJLLLLLLLZ;
    public final TuxTextView LLJL;
    public final TuxTextView LLJLIL;
    public AObserverS128S0300000_21 LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public final C1368420liK LLJLLIL;

    @Override // X.AbstractC1368540liW
    public final boolean L5() {
        IMConversation iMConversation;
        IMContact iMContact = this.LLJJJ;
        IMUser iMUser = iMContact instanceof IMUser ? (IMUser) iMContact : null;
        if (iMUser != null && iMUser.isActive()) {
            return true;
        }
        IMContact iMContact2 = this.LLJJJ;
        return (iMContact2 instanceof IMConversation) && (iMConversation = (IMConversation) iMContact2) != null && iMConversation.isActive();
    }

    @Override // X.AbstractC1368540liW
    public final void N5() {
        super.N5();
        boolean z = this.LLJJJ instanceof IMUser;
    }

    public final void R5(IMContact iMContact) {
        View viewFindViewById = this.itemView.findViewById(R.id.eu1);
        List<IMContact> value = this.LLJILJIL.LLJILLL.getValue();
        if (value == null) {
            value = C13BV.INSTANCE;
        }
        if (this.LLJILJIL.wQ2() && !value.contains(iMContact)) {
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
        if ((iMContact instanceof IMConversation) && viewFindViewById != null) {
            int disabledOnSharePanelReasonCode2 = iMContact.getDisabledOnSharePanelReasonCode();
            if (disabledOnSharePanelReasonCode2 != 1 && disabledOnSharePanelReasonCode2 != 2 && disabledOnSharePanelReasonCode2 != 3) {
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
            X.0GqE r0 = r3.LLJJIJIL
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
            com.ss.android.ugc.aweme.im.contacts.api.model.IMContact r1 = r3.LLJJJ
            X.0ZE7 r0 = r3.LLJIJIL
            X.C897490ZIt.LIZJ(r3, r1, r0)
        L35:
            return
        L36:
            boolean r0 = r4 instanceof com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation
            if (r0 == 0) goto L35
            com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation r4 = (com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation) r4
            r4.setActive(r1)
            com.ss.android.ugc.aweme.im.contacts.api.model.IMContact r1 = r3.LLJJJ
            X.0ZE7 r0 = r3.LLJIJIL
            X.C897490ZIt.LIZJ(r3, r1, r0)
            return
        L47:
            r1 = 0
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1368410liJ.S5(com.ss.android.ugc.aweme.im.contacts.api.model.IMContact, X.0GsP):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:269:0x04ee, code lost:
    
        if (r11.intValue() != 1) goto L270;
     */
    /* JADX WARN: Removed duplicated region for block: B:253:0x04b1 A[PHI: r11
      0x04b1: PHI (r11v4 android.text.SpannableString) = (r11v5 android.text.SpannableString), (r11v6 android.text.SpannableString) binds: [B:252:0x04af, B:258:0x04c5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:272:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x055c  */
    @Override // X.AbstractC1368540liW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I5(com.ss.android.ugc.aweme.im.contacts.api.model.IMContact r23, com.ss.android.ugc.aweme.im.contacts.api.model.IMContact r24, int r25, X.C0ZE7 r26) {
        /*
            Method dump skipped, instruction units count: 1398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1368410liJ.I5(java.lang.Object, java.lang.Object, int, X.0ZE7):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r0v27, types: [X.0liK] */
    public C1368410liJ(ViewGroup viewGroup, ShareMoreViewModel shareMoreViewModel, SharePackage sharePackage, boolean z, InterfaceC897330ZId interfaceC897330ZId) {
        int i;
        LayoutInflater layoutInflaterNe = C786410Ut5.ne(viewGroup.getContext());
        if (C1268904xr.LIZ()) {
            i = R.layout.cu3;
        } else {
            i = R.layout.cu2;
        }
        super(C786410Ut5.Td(layoutInflaterNe, i, viewGroup, false));
        this.LLJILJIL = shareMoreViewModel;
        this.LLJILJILJ = sharePackage;
        this.LLJILLL = z;
        this.LLJJ = interfaceC897330ZId;
        C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
        this.LLJJI = this.itemView.findViewById(R.id.y1z);
        this.LLJJIII = (TextView) this.itemView.findViewById(R.id.y3j);
        this.LLJJIJI = (ImageView) this.itemView.findViewById(R.id.kku);
        this.LLJJIJIIJIL = (TuxTextView) this.itemView.findViewById(R.id.ilu);
        this.LLJJIJIL = (C427920GqE) this.itemView.findViewById(R.id.a5s);
        this.LLJJJIL = -1;
        IInternalShareApi.LIZ.getClass();
        C1361580lXI c1361580lXILJJIJ = C1370970lmR.LIZ().LIZJ().LJJIJ();
        this.LLJJJJ = c1361580lXILJJIJ;
        this.LLJLL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1197));
        this.LLJLLIL = new C0NYY() { // from class: X.0liK
            @Override // X.C0NYY
            public final Object k3(Map<String, C595660NXw> map, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                String strLJIIIZ;
                IMContact iMContact = this.LL.LLJJJ;
                if (iMContact == null) {
                    return Unit.LIZ;
                }
                ContactFeature contactFeatureLIZ = ContactFeature.LIZ.LIZ();
                if (contactFeatureLIZ != null) {
                    strLJIIIZ = contactFeatureLIZ.LJIIIZ(iMContact);
                } else {
                    strLJIIIZ = null;
                }
                if (!map.containsKey(strLJIIIZ)) {
                    return Unit.LIZ;
                }
                this.LL.S5(iMContact, C896480ZEw.LIZIZ(map.get(strLJIIIZ)));
                return Unit.LIZ;
            }
        };
        if ((c1361580lXILJJIJ instanceof AbstractC2211791BhR) && c1361580lXILJJIJ != null) {
            C2211751BhN.LIZ(this.itemView, c1361580lXILJJIJ);
        }
        if (C1268904xr.LIZ()) {
            this.LLJJJJJIL = this.itemView.findViewById(R.id.o_p);
            this.LLJJJJLIIL = (TuxTextView) this.itemView.findViewById(R.id.fuf);
            this.LLJJL = (TuxTextView) this.itemView.findViewById(R.id.fgw);
            this.LLJJLIIIJLLLLLLLZ = (TuxTextView) this.itemView.findViewById(R.id.t50);
            this.LLJL = (TuxTextView) this.itemView.findViewById(R.id.fgx);
            this.LLJLIL = (TuxTextView) this.itemView.findViewById(R.id.o39);
        }
    }
}
