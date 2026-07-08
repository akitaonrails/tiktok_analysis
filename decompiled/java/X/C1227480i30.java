package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.publicgroup.data.model.InvitationListCell;
import com.ss.android.ugc.aweme.publicgroup.data.model.InvitationListCellType;
import com.ss.android.ugc.aweme.publicgroup.data.model.InvitationListSectionType;
import com.ss.android.ugc.aweme.publicgroup.data.model.InvitationUserInfo;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0i30, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1227480i30 extends C1225970i0Z {
    public final String LLILLL;
    public final AbstractC1225770i0F LLILZ;
    public final C1227090i2N LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public final Map<String, String> LLJI;
    public final AtomicInteger LLJIJIL;
    public final Set<InvitationListCell> LLJILJIL;

    @Override // X.C1225970i0Z, X.InterfaceC1223360hwM
    public final View LJ() {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(this.LLILZ.LJJJJLL().LIZIZ()), R.layout.cj_, null, false);
        C1749280vcc c1749280vcc = (C1749280vcc) viewTd.findViewById(R.id.h3a);
        Pair pair = new Pair(((C1227810i3X) this.LLIZLLLIL.getValue()).LIZ, ((C1227810i3X) this.LLIZLLLIL.getValue()).LIZIZ);
        String str = (String) pair.getFirst();
        String str2 = (String) pair.getSecond();
        C1722300uv6 c1722300uv6 = new C1722300uv6();
        C0HTI c0hti = new C0HTI();
        c0hti.LIZ = R.drawable.my;
        Drawable drawableLIZ = c0hti.LIZ(viewTd.getContext());
        c1722300uv6.LIZJ = 2;
        c1722300uv6.LIZ = drawableLIZ;
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(130));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(96));
        c1722300uv6.LIZLLL = iLIZIZ;
        c1722300uv6.LJ = iLIZIZ2;
        c1722300uv6.LJI = str;
        c1722300uv6.LJIIIIZZ = str2;
        c1749280vcc.setStatus(c1722300uv6);
        return viewTd;
    }

    @Override // X.C1225970i0Z, X.InterfaceC1224300hxs
    public final void LJJI() {
        ((LinkedHashMap) this.LLJI).clear();
        this.LLJILJIL.clear();
        this.LLJIJIL.set(0);
    }

    @Override // X.C1225970i0Z, X.InterfaceC1224180hxg
    public final Object LJJIL(InterfaceC1364105Vn<? super AbstractC1223670hwr> interfaceC1364105Vn) {
        return C2296808zG.LJ(new C1223720hww(this, null), interfaceC1364105Vn);
    }

    public final List<AbstractC1223800hx4> LJJJJJ(List<InvitationListCell> list) {
        Object c1223790hx3;
        String str;
        String memberTypeForET;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        String str2;
        ArrayList arrayList = new ArrayList();
        for (InvitationListCell invitationListCell : list) {
            InvitationListCellType invitationListCellType = invitationListCell.cellType;
            if (invitationListCellType != null) {
                int i = C1157750gEX.LIZ[invitationListCellType.ordinal()];
                if (i != 1 && i != 2) {
                    if (i == 3) {
                        InvitationUserInfo invitationUserInfo = invitationListCell.invitee;
                        if (invitationUserInfo != null && (str = invitationUserInfo.userId) != null) {
                            this.LLJI.put(str, invitationUserInfo.userTag);
                            int iIncrementAndGet = this.LLJIJIL.incrementAndGet();
                            InvitationListSectionType invitationListSectionType = invitationUserInfo.sectionType;
                            if (invitationListSectionType == null || (memberTypeForET = invitationListSectionType.getMemberTypeForET()) == null) {
                                memberTypeForET = InvitationListSectionType.INVITATION_LIST_SECTION_TYPE_DEFAULT.getMemberTypeForET();
                            }
                            IMUser iMUser = new IMUser();
                            iMUser.setUid(invitationUserInfo.userId);
                            iMUser.setNickName(invitationUserInfo.nickname);
                            iMUser.setAvatarThumb(invitationUserInfo.avatarThumb);
                            iMUser.setUniqueId(invitationUserInfo.uniqueId);
                            C1224850hyl c1224850hyl = new C1224850hyl(EnumC992630bwD.TYPE_CONTENT_PAGE, this.LLILLL);
                            EnumC1224830hyj enumC1224830hyj = (EnumC1224830hyj) this.LLJ.getValue();
                            UrlModel urlModel = invitationUserInfo.avatarThumb;
                            String str3 = invitationUserInfo.displayName;
                            if (str3 == null && (str3 = invitationUserInfo.nickname) == null) {
                                str3 = "";
                            }
                            String str4 = invitationUserInfo.uniqueId;
                            boolean zContains = ((List) this.LLIZ.getValue()).contains(str);
                            if (!((List) this.LLIZ.getValue()).contains(str) && !Intrinsics.LJFF(invitationUserInfo.disableInvite, Boolean.TRUE)) {
                                z = false;
                            } else {
                                z = true;
                            }
                            if (!((List) this.LLIZ.getValue()).contains(str) && !Intrinsics.LJFF(invitationUserInfo.disableInvite, Boolean.TRUE)) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            if (!C13LP.LJJJJ(invitationUserInfo.userId, (Iterable) this.LLIZ.getValue()) && Intrinsics.LJFF(invitationUserInfo.disableInvite, Boolean.TRUE)) {
                                z3 = false;
                            } else {
                                z3 = true;
                            }
                            if (!C13LP.LJJJJ(invitationUserInfo.userId, (Iterable) this.LLIZ.getValue()) && Intrinsics.LJFF(invitationUserInfo.disableInvite, Boolean.TRUE)) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            Pair[] pairArr = new Pair[4];
                            pairArr[0] = new Pair("contact", iMUser);
                            pairArr[1] = new Pair("rank_num", Integer.valueOf(iIncrementAndGet));
                            Map<String, String> map = invitationUserInfo.eventTrack;
                            if (map == null || (str2 = map.get("member_label")) == null) {
                                str2 = "";
                            }
                            pairArr[2] = new Pair("member_label", str2);
                            pairArr[3] = new Pair("member_type", memberTypeForET);
                            c1223790hx3 = new C1224840hyk(c1224850hyl, enumC1224830hyj, "private", str, urlModel, str3, str4, true, z3, C2097608Jq.LJIIIIZZ(pairArr), zContains, z, z2, z4, false, 1024);
                            arrayList.add(c1223790hx3);
                        }
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    String str5 = invitationListCell.sectionName;
                    if (str5 != null) {
                        c1223790hx3 = new C1223790hx3(str5, new C1223780hx2(Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), null, null, Integer.valueOf(R.attr.a1h), 14), 4);
                        arrayList.add(c1223790hx3);
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // X.C1225970i0Z, X.InterfaceC1223360hwM
    public final void LJJ(FrameLayout frameLayout, String str) {
        int i;
        String str2 = (String) ((LinkedHashMap) this.LLJI).get(str);
        if (C123100dR.LIZ(str2)) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, frameLayout);
        if (frameLayout.findViewById(R.id.tv_recall_reason) == null) {
            C786410Ut5.Sd(R.layout.cjp, C786410Ut5.ne(frameLayout.getContext()), frameLayout);
        }
        TextView textView = (TextView) frameLayout.findViewById(R.id.tv_recall_reason);
        if (C123100dR.LIZ(str2)) {
            textView.setText((CharSequence) ((LinkedHashMap) this.LLJI).get(str));
            C786410Ut5.LJLLLLLL(0, textView);
        } else {
            textView.setText("");
            C786410Ut5.LJLLLLLL(8, textView);
        }
    }

    @Override // X.C1225970i0Z, X.InterfaceC1224180hxg
    public final Object LJJJI(Object obj, InterfaceC1364105Vn<? super AbstractC1223670hwr> interfaceC1364105Vn) {
        return C2296808zG.LJ(new C1223710hwv(obj, this, null), interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0086 A[Catch: Exception -> 0x00f5, TryCatch #0 {Exception -> 0x00f5, blocks: (B:20:0x006c, B:21:0x006f, B:23:0x0076, B:27:0x0081, B:29:0x0088, B:31:0x008c, B:32:0x0095, B:34:0x009b, B:36:0x00a6, B:43:0x00b2, B:44:0x00b6, B:45:0x00ba, B:47:0x00c0, B:49:0x00ca, B:52:0x00d0, B:53:0x00ef, B:28:0x0086, B:16:0x0038, B:17:0x0049), top: B:58:0x0020 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJJIZL(int r19, X.InterfaceC1364105Vn<? super kotlin.Pair<com.ss.android.ugc.aweme.publicgroup.data.model.GroupInviteListResponse, ? extends java.util.List<? extends X.AbstractC1223800hx4>>> r20) {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1227480i30.LJJJJIZL(int, X.05Vn):java.lang.Object");
    }

    public C1227480i30(String str, AbstractC1225770i0F abstractC1225770i0F, C1227090i2N c1227090i2N) {
        super(c1227090i2N, 0);
        this.LLILLL = str;
        this.LLILZ = abstractC1225770i0F;
        this.LLILZIL = c1227090i2N;
        this.LLILZLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 3294));
        this.LLIZ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 3292));
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 3293));
        this.LLJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 3295));
        this.LLJI = new LinkedHashMap();
        this.LLJIJIL = new AtomicInteger(0);
        this.LLJILJIL = new LinkedHashSet();
    }
}
