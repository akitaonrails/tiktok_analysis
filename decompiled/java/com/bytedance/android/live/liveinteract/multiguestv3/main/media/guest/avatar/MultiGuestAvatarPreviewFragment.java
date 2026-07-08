package com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.avatar;

import X.AbstractC19484711Kz;
import X.C01NB;
import X.C07ZC;
import X.C09JN;
import X.C0UO0;
import X.C1117360fBO;
import X.C11JL;
import X.C11NJ;
import X.C11S5;
import X.C1697810uHb;
import X.C16FS;
import X.C20441214yg;
import X.C204692157q;
import X.C2188811AlT;
import X.C443120HZe;
import X.C480460Ism;
import X.C497740JfY;
import X.C500260Jjc;
import X.C515501zd;
import X.C917520Zz4;
import X.C924610aAV;
import X.C930540aK4;
import X.C936100aT2;
import X.C936250aTH;
import X.C953780avY;
import X.InterfaceC300801Eo;
import X.InterfaceC420801kM;
import X.InterfaceC934710aQn;
import X.InterfaceC935960aSo;
import Y.AObjectS358S0100000_15;
import Y.AObjectS390S0100000_15;
import android.content.Context;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.avatar.common.IAvatarBusinessAbility;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.avatar.common.api.IAvatarAPI;
import com.bytedance.android.live.liveinteract.multilive.social.model.AvatarListReq;
import com.bytedance.android.live.liveinteract.multilive.social.model.AvatarListResp;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS30S0000100_15;
import kotlin.jvm.internal.AwS664S0100000_15;
import webcast.data.multi_guest_social_data.Avatar;
import webcast.data.multi_guest_social_data.AvatarImageSelectTips;
import webcast.data.multi_guest_social_data.AvatarStyle;

/* JADX INFO: loaded from: classes16.dex */
public final class MultiGuestAvatarPreviewFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2OzE6emE+HELIOSKSwiZyI2LCwtZygmLTY4Zy4lKTEtO2EePSk4IAgmLTY4CDkyPCQ+GT02PiwpPgkhKSIhLCEn";
    public boolean LL;
    public boolean LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public Function0<Unit> LLILZIL;
    public DataChannel LLILZLL;
    public boolean LLIZ;
    public RecyclerView LLIZLLLIL;
    public C16FS LLJ;
    public C1117360fBO LLJI;
    public FragmentManager LLJIJIL;
    public boolean LLJILJIL;
    public AvatarImageSelectTips LLJILJILJ;
    public List<AvatarStyle> LLJILLL;
    public List<Avatar> LLJJ;
    public Long LLJJIII;
    public Long LLJJIJI;
    public IAvatarBusinessAbility LLJJIJIIJIL;
    public Function2<? super Boolean, ? super Avatar, Unit> LLJJIJIL;
    public Function1<? super Boolean, Unit> LLJJJ;
    public Function0<Unit> LLJJJIL;
    public boolean LLJJJJ;
    public C11JL LLJJJJJIL;
    public Long LLJJJJLIIL;
    public long LLJJL;
    public boolean LLJL;
    public final C11NJ LLJJI = new C11NJ();
    public final Set<Long> LLJJLIIIJLLLLLLLZ = new LinkedHashSet();
    public final AwS664S0100000_15 LLJLIL = new AwS664S0100000_15(this, 6);

    public final Avatar PR() {
        List<Avatar> list;
        Long l = this.LLJJIJI;
        Avatar avatar = null;
        if (l == null || l.longValue() == 0 || (list = this.LLJJ) == null) {
            return null;
        }
        Iterator<Avatar> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Avatar next = it2.next();
            long j = next.avatarId;
            Long l2 = this.LLJJIJI;
            if (l2 != null && j == l2.longValue()) {
                avatar = next;
                break;
            }
        }
        return avatar;
    }

    public final void VR() {
        List<?> list;
        C1117360fBO c1117360fBO = this.LLJI;
        if (c1117360fBO != null && (list = c1117360fBO.LL) != null) {
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i < 0) {
                    C1697810uHb.LJIJI();
                    throw null;
                }
                if (obj instanceof InterfaceC935960aSo) {
                    if (obj instanceof C07ZC) {
                        C07ZC c07zc = (C07ZC) obj;
                        if (!c07zc.LIZ) {
                            c07zc.LIZ = true;
                        }
                    } else {
                        InterfaceC935960aSo interfaceC935960aSo = (InterfaceC935960aSo) obj;
                        if (interfaceC935960aSo.LIZJ()) {
                            interfaceC935960aSo.LIZLLL();
                            if (obj instanceof C936100aT2) {
                                ((C936100aT2) obj).LJFF = false;
                            }
                        }
                    }
                }
                i = i2;
            }
        }
        this.LLJJIJI = null;
        this.LLJJJJLIIL = null;
        C924610aAV.LIZ(C917520Zz4.LJI(), C930540aK4.LJ() ? 1 : 0, "cancel", true ^ this.LLJJJJ, null, null, null);
        C1117360fBO c1117360fBO2 = this.LLJI;
        if (c1117360fBO2 != null) {
            c1117360fBO2.notifyDataSetChanged();
        }
        AwS664S0100000_15 awS664S0100000_15 = this.LLJLIL;
        Boolean bool = Boolean.FALSE;
        awS664S0100000_15.invoke(bool, null, bool);
    }

    public final void WR() {
        Long l = this.LLJJIJI;
        Avatar avatar = null;
        if (l != null) {
            long jLongValue = l.longValue();
            List<Avatar> list = this.LLJJ;
            if (list != null) {
                Iterator<Avatar> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Avatar next = it2.next();
                    if (jLongValue == next.avatarId) {
                        avatar = next;
                        break;
                    }
                }
                avatar = avatar;
                if (avatar != null) {
                    if (avatar.status != 1) {
                        return;
                    }
                    C204692157q c204692157q = C204692157q.LIZ;
                    Context contextLJII = C497740JfY.LJII();
                    c204692157q.getClass();
                    if (!C204692157q.LIZIZ(contextLJII, avatar)) {
                        return;
                    }
                }
            }
        }
        this.LLJLIL.invoke(Boolean.valueOf(avatar != null), avatar, Boolean.TRUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x015b  */
    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDestroy() {
        /*
            Method dump skipped, instruction units count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.avatar.MultiGuestAvatarPreviewFragment.onDestroy():void");
    }

    public final void OR(boolean z) {
        AbstractC19484711Kz abstractC19484711KzLIZ;
        if (z) {
            C936250aTH.LIZ();
        }
        C11JL c11jl = this.LLJJJJJIL;
        if (c11jl != null) {
            c11jl.dispose();
        }
        boolean z2 = C936250aTH.LIZIZ;
        boolean zBooleanValue = InterfaceC934710aQn.hc.LIZIZ().booleanValue();
        AvatarListResp.ResponseData responseData = C936250aTH.LIZJ;
        if (responseData == null || !C936250aTH.LIZIZ || ((zBooleanValue && responseData.imageSelectTips == null) || System.currentTimeMillis() - C936250aTH.LJIIJ > C936250aTH.LIZ * ((long) LSPassThroughRecordSizeConfig.DEFAULT))) {
            AvatarListReq avatarListReq = new AvatarListReq();
            avatarListReq.needimageselecttips = zBooleanValue;
            avatarListReq.applier = C936250aTH.LJ();
            avatarListReq.common = C936250aTH.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("fetchList start:needTips=");
            sbLIZ.append(zBooleanValue);
            C20441214yg.LIZIZ("AvatarDataManager", C2188811AlT.LIZIZ(sbLIZ));
            C480460Ism.LIZ().getClass();
            abstractC19484711KzLIZ = C01NB.LIZ(((IAvatarAPI) C480460Ism.LIZLLL(IAvatarAPI.class)).fetchAvatarList(avatarListReq).LJJIJIIJI(C11S5.LIZ()).LJJ(C953780avY.LIZIZ).LJIILL(new C09JN() { // from class: X.00SQ
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("AvatarDataManager@42e9.fetchList$1");
                    C470590Icr c470590Icr = (C470590Icr) obj;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("fetchList resp:");
                    sbLIZ2.append(c470590Icr.data);
                    C20441214yg.LIZIZ("AvatarDataManager", C2188811AlT.LIZIZ(sbLIZ2));
                    C930480aJy.LIZ.getClass();
                    if (C930480aJy.LJJIFFI(c470590Icr)) {
                        boolean z3 = C936250aTH.LIZIZ;
                        C936250aTH.LIZJ = (AvatarListResp.ResponseData) c470590Icr.data;
                        C936250aTH.LJIIJ = System.currentTimeMillis();
                    }
                    C1C7U.LIZIZ("AvatarDataManager@42e9.fetchList$1");
                }
            }));
        } else {
            abstractC19484711KzLIZ = AbstractC19484711Kz.LJII(new InterfaceC300801Eo() { // from class: X.01El
                @Override // X.InterfaceC300801Eo
                public final void subscribe(InterfaceC2329309At<C470590Icr<AvatarListResp.ResponseData>> interfaceC2329309At) {
                    T t = (T) C936250aTH.LIZJ;
                    if (t != null) {
                        C470590Icr<AvatarListResp.ResponseData> c470590Icr = new C470590Icr<>();
                        c470590Icr.data = t;
                        c470590Icr.statusCode = 0;
                        interfaceC2329309At.onSuccess(c470590Icr);
                    }
                }
            });
        }
        InterfaceC420801kM interfaceC420801kMLJJIIZ = abstractC19484711KzLIZ.LJFF(new C0UO0()).LJJIIZ(new C515501zd(this, z, 0), new C515501zd(this, z, 1));
        this.LLJJJJJIL = (C11JL) interfaceC420801kMLJJIIZ;
        this.LLJJI.LIZ(interfaceC420801kMLJJIIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void PL1(boolean r11) {
        /*
            r10 = this;
            if (r11 != 0) goto Le
            kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r1 = r10.LLJJJ
            if (r1 == 0) goto Lb
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.invoke(r0)
        Lb:
            r10.LLIZ = r11
            return
        Le:
            kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r7 = r10.LLJJJ
            r9 = 0
            r8 = 1
            if (r7 == 0) goto L47
            java.lang.Long r0 = r10.LLJJIJI
            if (r0 == 0) goto L3f
            long r5 = r0.longValue()
            java.util.List<webcast.data.multi_guest_social_data.Avatar> r0 = r10.LLJJ
            if (r0 == 0) goto L68
            java.util.Iterator r4 = r0.iterator()
        L24:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L66
            java.lang.Object r3 = r4.next()
            r0 = r3
            webcast.data.multi_guest_social_data.Avatar r0 = (webcast.data.multi_guest_social_data.Avatar) r0
            long r1 = r0.avatarId
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 != 0) goto L24
        L37:
            webcast.data.multi_guest_social_data.Avatar r3 = (webcast.data.multi_guest_social_data.Avatar) r3
            if (r3 == 0) goto L68
            int r0 = r3.status
            if (r0 != r8) goto L68
        L3f:
            r0 = 1
        L40:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r7.invoke(r0)
        L47:
            kotlin.jvm.internal.AwS664S0100000_15 r5 = r10.LLJLIL
            java.lang.Long r0 = r10.LLJJIJI
            if (r0 == 0) goto L58
            long r3 = r0.longValue()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L58
            r9 = 1
        L58:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r9)
            webcast.data.multi_guest_social_data.Avatar r1 = r10.PR()
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r5.invoke(r2, r1, r0)
            goto Lb
        L66:
            r3 = 0
            goto L37
        L68:
            r0 = 0
            goto L40
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.avatar.MultiGuestAvatarPreviewFragment.PL1(boolean):void");
    }

    public final C443120HZe<Long, Integer, Boolean> RR(Long l) {
        if (l != null || (l = this.LLJJIJI) != null) {
            long jLongValue = l.longValue();
            List<Avatar> list = this.LLJJ;
            if (list != null) {
                Pair pairLJI = C500260Jjc.LJI(list, new AwS30S0000100_15(jLongValue, 4));
                Avatar avatar = (Avatar) pairLJI.getFirst();
                if (avatar != null) {
                    return new C443120HZe<>(Long.valueOf(avatar.avatarId), Integer.valueOf(((Number) pairLJI.getSecond()).intValue() + 1), Boolean.valueOf(!avatar.isSystem));
                }
                return null;
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x012b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void UR(X.C936100aT2 r23, boolean r24) {
        /*
            Method dump skipped, instruction units count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.avatar.MultiGuestAvatarPreviewFragment.UR(X.0aT2, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01b9  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r14, android.view.ViewGroup r15, android.os.Bundle r16) {
        /*
            Method dump skipped, instruction units count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.avatar.MultiGuestAvatarPreviewFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void NR(long r31, boolean r33, java.util.List r34, boolean r35) {
        /*
            Method dump skipped, instruction units count: 579
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.avatar.MultiGuestAvatarPreviewFragment.NR(long, boolean, java.util.List, boolean):void");
    }

    public static final MultiGuestAvatarPreviewFragment SR(FragmentManager fragmentManager, boolean z, boolean z2, boolean z3, boolean z4, DataChannel dataChannel, Function0 function0, Function2 function2, AObjectS358S0100000_15 aObjectS358S0100000_15, AObjectS390S0100000_15 aObjectS390S0100000_15) {
        C20441214yg.LJIIIZ("MultiGuestAvatarPreviewFragment", "avatar preview fragment newInstance");
        MultiGuestAvatarPreviewFragment multiGuestAvatarPreviewFragment = new MultiGuestAvatarPreviewFragment();
        multiGuestAvatarPreviewFragment.LLJIJIL = fragmentManager;
        multiGuestAvatarPreviewFragment.LL = z;
        multiGuestAvatarPreviewFragment.LLILLJJLI = z2;
        multiGuestAvatarPreviewFragment.LLILLL = z3;
        multiGuestAvatarPreviewFragment.LLILZ = z4;
        multiGuestAvatarPreviewFragment.LLILZIL = function0;
        multiGuestAvatarPreviewFragment.LLILZLL = dataChannel;
        multiGuestAvatarPreviewFragment.LLJJIJIL = function2;
        multiGuestAvatarPreviewFragment.LLJJJ = aObjectS358S0100000_15;
        multiGuestAvatarPreviewFragment.LLJJJIL = aObjectS390S0100000_15;
        return multiGuestAvatarPreviewFragment;
    }
}
