package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.message.template.data.QuoteMode;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.contact.ContactFeature;
import com.ss.android.ugc.aweme.im.service.service.IIMChatService;
import com.ss.android.ugc.aweme.im.sharepanel.impl.share.viewmodel.ShareDialogViewModel;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.services.dm.IMMediaPublishEvent;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS670S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0liN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1368450liN extends AbstractC1368500liS<IMContact> {
    public final ShareDialogViewModel LLJIJIL;
    public final SharePackage LLJILJIL;
    public final Function0<Unit> LLJILJILJ;
    public final Function0<Unit> LLJILLL;
    public final InterfaceC897330ZId LLJJ;
    public IMContact LLJJI;
    public final int LLJJIII;
    public final View LLJJIJI;
    public final TextView LLJJIJIIJIL;
    public final TuxTextView LLJJIJIL;
    public final ImageView LLJJJ;
    public final C19727912Gn LLJJJIL;
    public final C197039127h LLJJJJ;
    public final C1368460liO LLJJJJJIL;

    @Override // X.AbstractC1368500liS
    public final boolean L5() {
        IMConversation iMConversation;
        IMContact iMContact = this.LLJJI;
        IMUser iMUser = iMContact instanceof IMUser ? (IMUser) iMContact : null;
        if (iMUser != null && iMUser.isActive()) {
            return true;
        }
        IMContact iMContact2 = this.LLJJI;
        return (iMContact2 instanceof IMConversation) && (iMConversation = (IMConversation) iMContact2) != null && iMConversation.isActive();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void S5(com.ss.android.ugc.aweme.im.contacts.api.model.IMContact r4) {
        /*
            r3 = this;
            android.view.View r0 = r3.itemView
            X.C0ZJ7.LIZ(r0)
            boolean r0 = r4 instanceof com.ss.android.ugc.aweme.im.contacts.api.model.IMUser
            if (r0 == 0) goto L26
            r0 = r4
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUser r0 = (com.ss.android.ugc.aweme.im.contacts.api.model.IMUser) r0
            boolean r0 = r0.isActive()
            if (r0 == 0) goto L1d
            android.view.View r2 = r3.itemView
            java.lang.String r1 = r4.getUid()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            X.C0ZJ7.LIZIZ(r2, r1, r0)
        L1d:
            r0 = r4
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUser r0 = (com.ss.android.ugc.aweme.im.contacts.api.model.IMUser) r0
            boolean r0 = r0.isActive()
            if (r0 != 0) goto L32
        L26:
            boolean r0 = r4 instanceof com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation
            if (r0 == 0) goto L4e
            com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation r4 = (com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation) r4
            boolean r0 = r4.isActive()
            if (r0 == 0) goto L4e
        L32:
            X.12Gn r1 = r3.LLJJJIL
            r0 = 1
            r1.setActive(r0)
            X.12Gn r1 = r3.LLJJJIL
            r0 = 0
            X.C786410Ut5.d0(r1, r0)
            X.12Gn r1 = r3.LLJJJIL
            r0 = 2131099676(0x7f06001c, float:1.7811712E38)
            r1.LIZ(r0)
            com.ss.android.ugc.aweme.im.contacts.api.model.IMContact r1 = r3.LLJJI
            X.0ZE7 r0 = r3.LLJI
            X.C897490ZIt.LIZJ(r3, r1, r0)
            return
        L4e:
            X.12Gn r1 = r3.LLJJJIL
            r0 = 8
            X.C786410Ut5.d0(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1368450liN.S5(com.ss.android.ugc.aweme.im.contacts.api.model.IMContact):void");
    }

    public final void R5(View view, IMContact iMContact) {
        AwS670S0100000_21 awS670S0100000_21 = this.LL;
        if (awS670S0100000_21 != null) {
            awS670S0100000_21.invoke(2, Integer.valueOf(getBindingAdapterPosition()), view);
        }
        C0ZE7 c0ze7 = this.LLJI;
        if (c0ze7 != null) {
            c0ze7.LJI = Integer.valueOf(getBindingAdapterPosition() - 1);
            c0ze7.LJII = Boolean.valueOf(L5());
        } else {
            c0ze7 = null;
        }
        C897490ZIt.LIZIZ(c0ze7);
        if (Intrinsics.LJFF(this.LLJILJIL.itemType, "private_screenshot")) {
            String strLIZIZ = C1529905yr.LIZIZ(iMContact);
            if (strLIZIZ == null) {
                strLIZIZ = "";
            }
            MediaModel mediaModel = new MediaModel("");
            mediaModel.LJIILL(this.LLJILJIL.extras.getString("screenshot_path"));
            mediaModel.type = 1;
            List listSingletonList = Collections.singletonList(mediaModel);
            Pair[] pairArr = new Pair[2];
            String string = this.LLJILJIL.extras.getString("enter_from");
            if (string == null) {
                string = "other_page";
            }
            pairArr[0] = new Pair("enter_from", string);
            String string2 = this.LLJILJIL.extras.getString("enter_method");
            if (string2 == null) {
                string2 = "screenshot_share_panel";
            }
            pairArr[1] = new Pair("enter_method", string2);
            C1440005kM.LIZ(new IMMediaPublishEvent.DMAlbumMediaPublishEvent(strLIZIZ, listSingletonList, C2097608Jq.LJIIJ(pairArr), null, QuoteMode.None.INSTANCE, null, null, null, null));
        } else {
            C1365330ldL c1365330ldL = C1365330ldL.LIZ;
            this.itemView.getContext();
            c1365330ldL.LJIIJ(Collections.singletonList(iMContact), this.LLJILJIL, new C0U3R() { // from class: X.0liQ
                @Override // X.C0U3R
                public final /* bridge */ /* synthetic */ void run(Object obj) {
                }
            });
        }
        this.LLJILJILJ.invoke();
    }

    public final void P5(View view, Context context, IMContact iMContact) {
        AwS670S0100000_21 awS670S0100000_21 = this.LL;
        if (awS670S0100000_21 != null) {
            awS670S0100000_21.invoke(2, Integer.valueOf(getBindingAdapterPosition()), view);
        }
        C0ZE7 c0ze7 = this.LLJI;
        if (c0ze7 != null) {
            c0ze7.LJI = Integer.valueOf(getBindingAdapterPosition() - 1);
            c0ze7.LJII = Boolean.valueOf(L5());
        } else {
            c0ze7 = null;
        }
        C897490ZIt.LIZIZ(c0ze7);
        IIMChatService imChatService = C1336205Ku.LIZ(false).getImChatService();
        EnterChatParams enterChatParams = new EnterChatParams(context, iMContact);
        enterChatParams.setQuickChat(true);
        Bundle bundle = this.LLJILJIL.extras;
        String string = bundle.getString("enter_method");
        if (string != null) {
            enterChatParams.setEnterMethodForMob(string);
        }
        String string2 = bundle.getString("enter_from");
        if (string2 != null) {
            enterChatParams.setEnterFromForMob(string2);
        }
        imChatService.LJIILLIIL(enterChatParams, null);
        this.LLJIJIL.LLJILJILJ.setValue(Boolean.TRUE);
        this.LLJILLL.invoke();
    }

    /* JADX WARN: Removed duplicated region for block: B:91:0x02c1  */
    @Override // X.AbstractC1368500liS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I5(com.ss.android.ugc.aweme.im.contacts.api.model.IMContact r13, com.ss.android.ugc.aweme.im.contacts.api.model.IMContact r14, int r15, X.C0ZE7 r16) {
        /*
            Method dump skipped, instruction units count: 721
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1368450liN.I5(java.lang.Object, java.lang.Object, int, X.0ZE7):void");
    }

    /* JADX WARN: Type inference failed for: r0v24, types: [X.0liO] */
    public C1368450liN(ViewGroup viewGroup, ShareDialogViewModel shareDialogViewModel, SharePackage sharePackage, Function0<Unit> function0, Function0<Unit> function02, InterfaceC897330ZId interfaceC897330ZId) {
        super(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cmr, viewGroup, false));
        this.LLJIJIL = shareDialogViewModel;
        this.LLJILJIL = sharePackage;
        this.LLJILJILJ = function0;
        this.LLJILLL = function02;
        this.LLJJ = interfaceC897330ZId;
        this.LLJJIII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
        this.LLJJIJI = this.itemView.findViewById(R.id.y1z);
        this.LLJJIJIIJIL = (TextView) this.itemView.findViewById(R.id.y3j);
        this.LLJJIJIL = (TuxTextView) this.itemView.findViewById(R.id.ilu);
        this.LLJJJ = (ImageView) this.itemView.findViewById(R.id.kku);
        this.LLJJJIL = (C19727912Gn) this.itemView.findViewById(R.id.a5s);
        this.LLJJJJ = (C197039127h) this.itemView.findViewById(R.id.up8);
        this.LLJJJJJIL = new C0NYY() { // from class: X.0liO
            @Override // X.C0NYY
            public final Object k3(Map<String, C595660NXw> map, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                String strLJIIIZ;
                IMContact iMContact = this.LL.LLJJI;
                if (iMContact == null) {
                    return Unit.LIZ;
                }
                ContactFeature contactFeatureLIZ = ContactFeature.LIZ.LIZ();
                if (contactFeatureLIZ != null && (strLJIIIZ = contactFeatureLIZ.LJIIIZ(iMContact)) != null) {
                    if (!map.containsKey(strLJIIIZ)) {
                        return Unit.LIZ;
                    }
                    boolean zLIZJ = C896480ZEw.LIZJ(map.get(strLJIIIZ));
                    if (iMContact instanceof IMUser) {
                        ((IMUser) iMContact).setActive(zLIZJ);
                    } else if (iMContact instanceof IMConversation) {
                        ((IMConversation) iMContact).setActive(zLIZJ);
                    }
                    this.LL.S5(iMContact);
                    return Unit.LIZ;
                }
                return Unit.LIZ;
            }
        };
    }
}
