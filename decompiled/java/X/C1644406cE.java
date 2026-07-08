package X;

import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.ChatRoomFakeMsgOperatorAbility;
import com.ss.android.ugc.aweme.im.prompts.api.chatnotice.flow.base.viewmodel.ICommonChatNoticeViewModel;
import java.util.Collections;
import java.util.Set;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: renamed from: X.06cE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1644406cE extends C06O6<C06AH> {
    public final C1600706On LLILZ;
    public final C01GW LLILZIL;
    public final Set<C067L> LLILZLL;
    public final Set<EnumC1596306Mv> LLIZ;
    public final C01GW LLIZLLLIL;
    public String LLJ;
    public int LLJI;
    public final C01GW LLJIJIL;

    @Override // X.C06O6
    public final boolean LIZLLL() {
        int i = C067M.LIZ[this.LLILZ.LIZIZ.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3) {
                throw new C1954807lC();
            }
            InterfaceC1601306Ot interfaceC1601306Ot = this.LLILZ.LJIIJ;
            if (interfaceC1601306Ot == null || !interfaceC1601306Ot.LIZ()) {
                return false;
            }
        }
        return true;
    }

    @Override // X.C06O6
    public final C067K LJI() {
        return (C067K) this.LLILZIL.getValue();
    }

    @Override // X.AnonymousClass0684
    public final Set<EnumC1596306Mv> LIZIZ() {
        return this.LLIZ;
    }

    @Override // X.C06O6
    public final Set<C067L> LJII() {
        return this.LLILZLL;
    }

    public C1644406cE(C1600706On c1600706On) {
        super(c1600706On);
        this.LLILZ = c1600706On;
        this.LLILZIL = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1309));
        this.LLILZLL = C13LQ.LJLIIL(new C067L[]{C067L.SINGLE, C067L.BUSINESS, C067L.GROUP});
        this.LLIZ = Collections.singleton(EnumC1596306Mv.AI_MOJI_SUGGESTED);
        this.LLIZLLLIL = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1310));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 1170));
    }

    @Override // X.C06O6
    public final void LJIIIZ(C06OO c06oo) {
        ICommonChatNoticeViewModel value;
        ChatRoomFakeMsgOperatorAbility chatRoomFakeMsgOperatorAbility = (ChatRoomFakeMsgOperatorAbility) C1558520qew.LIZ(this.LLILZ.LJFF, ChatRoomFakeMsgOperatorAbility.class, null);
        if (chatRoomFakeMsgOperatorAbility != null) {
            chatRoomFakeMsgOperatorAbility.y52((C1684506ih) this.LLJIJIL.getValue(), null);
        }
        String str = this.LLJ;
        if (str != null && (value = this.LLILZ.LJIIJJI.LJ().getValue()) != null) {
            value.MQ2(str);
        }
    }

    @Override // X.C06O6
    public final Object LJIIIIZZ(C06OO c06oo, InterfaceC1364105Vn interfaceC1364105Vn) {
        C1DFH c1dfh = C0PEM.LIZ;
        return C23250099c.LJI(interfaceC1364105Vn, C2107308Nj.LIZ, new C1645206cM((C06AH) c06oo, this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00aa  */
    @Override // X.C06O6
    /* JADX INFO: renamed from: LJIIL, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJ(X.C06AH r11, X.InterfaceC1364105Vn<? super kotlin.Unit> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof X.C1644506cF
            if (r0 == 0) goto Laa
            r4 = r12
            X.06cF r4 = (X.C1644506cF) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Laa
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r3 = r4.LLILLJJLI
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r4.LLILZ
            r0 = 1
            if (r1 == 0) goto L9e
            if (r1 != r0) goto Lb1
            X.06AH r11 = r4.LL
            X.C155000ia.LIZIZ(r3)
        L24:
            com.ss.android.ugc.aweme.im.common.model.IMNoticeMsgStruct r0 = r11.LIZJ
            java.lang.String r0 = r0.noticeCode
            r10.LLJ = r0
            X.01GW r0 = r10.LLJIJIL
            java.lang.Object r1 = r0.getValue()
            X.06ih r1 = (X.C1684506ih) r1
            java.lang.String r0 = r10.LLJ
            if (r0 != 0) goto L38
            java.lang.String r0 = "aimoji_suggested_stickers"
        L38:
            r1.LIZJ = r0
            X.06On r0 = r10.LLILZ
            X.0Q7z r1 = r0.LJFF
            java.lang.Class<com.ss.android.ugc.aweme.im.messagelist.api.fake.message.ChatRoomFakeMsgOperatorAbility> r0 = com.ss.android.ugc.aweme.im.messagelist.api.fake.message.ChatRoomFakeMsgOperatorAbility.class
            r4 = 0
            X.01wD r1 = X.C1558520qew.LIZ(r1, r0, r4)
            com.ss.android.ugc.aweme.im.messagelist.api.fake.message.ChatRoomFakeMsgOperatorAbility r1 = (com.ss.android.ugc.aweme.im.messagelist.api.fake.message.ChatRoomFakeMsgOperatorAbility) r1
            if (r1 == 0) goto L54
            X.01GW r0 = r10.LLJIJIL
            java.lang.Object r0 = r0.getValue()
            X.06ih r0 = (X.C1684506ih) r0
            r1.yl2(r0, r4)
        L54:
            X.06On r0 = r10.LLILZ
            com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo r1 = r0.LJI
            X.06cT r0 = com.ss.android.ugc.aweme.im.service.analytics.IIMSuggestedStickersAnalytics.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.im.service.analytics.IIMSuggestedStickersAnalytics r2 = X.C1645906cT.LIZ()
            if (r2 == 0) goto L98
            java.lang.String r3 = r1.getConversationId()
            boolean r0 = r1 instanceof X.C909290Zln
            if (r0 == 0) goto L6f
            java.lang.String r4 = r1.getSingleChatFromUserId()
        L6f:
            if (r0 == 0) goto L9b
            X.06cG r5 = X.EnumC1644606cG.SINGLE
        L73:
            java.lang.String r0 = r10.LLJ
            if (r0 != 0) goto L79
            java.lang.String r0 = ""
        L79:
            X.06cK r0 = X.C1644906cJ.LIZ(r0)
            java.lang.String r6 = r0.getValue()
            int r7 = r10.LLJI
            X.06dc r0 = X.EnumC1653006dc.AIMOJI
            java.lang.String r0 = r0.getValue()
            java.util.Set r8 = java.util.Collections.singleton(r0)
            java.lang.String r1 = r10.LLJ
            java.lang.String r0 = "avatar_duo_suggested_stickers"
            boolean r9 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            r2.LIZLLL(r3, r4, r5, r6, r7, r8, r9)
        L98:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L9b:
            X.06cG r5 = X.EnumC1644606cG.GROUP
            goto L73
        L9e:
            X.C155000ia.LIZIZ(r3)
            r4.LL = r11
            r4.LLILZ = r0
            kotlin.Unit r0 = kotlin.Unit.LIZ
            if (r0 != r2) goto L24
            return r2
        Laa:
            X.06cF r4 = new X.06cF
            r4.<init>(r10, r12)
            goto L12
        Lb1:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1644406cE.LJIIJ(X.06AH, X.05Vn):java.lang.Object");
    }
}
