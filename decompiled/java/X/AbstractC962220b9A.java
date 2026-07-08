package X;

import X.C955590ayT;
import Y.ACListenerS24S0500000_15;
import Y.AfS109S0300000_15;
import Y.AfS184S0100000_15;
import Y.AfS3S0300100_15;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.multihost.event.CoHostSearchCloseKeyBoard;
import com.bytedance.android.live.room.FollowAnchorStateChangeEvent;
import com.bytedance.android.livesdk.chatroom.interact.model.LinkerInfo;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import com.bytedance.android.livesdk.chatroom.interact.model.UserInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CohostWithGuestPhase2UiDebugSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS381S0200000_15;
import kotlin.ranges.IntRange;
import kotlin.text.Regex;
import kotlin.text.a0;
import ttpobfuscated.e3;
import u4.q0;

/* JADX INFO: renamed from: X.0b9A, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public abstract class AbstractC962220b9A<D extends C955590ayT> extends C957430b1R<InterfaceC962270b9F, D> {
    public InterfaceC962270b9F LIZ;
    public D LIZIZ;

    public abstract void LIZIZ(InterfaceC962270b9F interfaceC962270b9F, D d, boolean z);

    public void LIZLLL(C955590ayT c955590ayT) {
    }

    public final void LIZJ() {
        InterfaceC962270b9F interfaceC962270b9F;
        ImageView imageViewI4;
        D d = this.LIZIZ;
        if (d == null || (interfaceC962270b9F = this.LIZ) == null || (imageViewI4 = interfaceC962270b9F.I4()) == null) {
            return;
        }
        ((C0J1N) C784440Upu.LIZ().LJ(C257100z3.class).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(C11RD.LIZJ(imageViewI4))).LIZ(new AfS109S0300000_15(d, this, interfaceC962270b9F, 18), new C09JN() { // from class: X.0b9I
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("BaseMultiHostUserInfoViewHolderDelegate@36e3.observeFollowStatusChange$2");
                C1C7U.LIZIZ("BaseMultiHostUserInfoViewHolderDelegate@36e3.observeFollowStatusChange$2");
            }
        });
        DataChannel dataChannel = interfaceC962270b9F.getDataChannel();
        if (dataChannel != null) {
            dataChannel.CQ2(FollowAnchorStateChangeEvent.class, imageViewI4, new AwS381S0200000_15((AbstractC962220b9A) this, interfaceC962270b9F, (InterfaceC962270b9F) 122));
        }
    }

    public static SpannableStringBuilder LIZ(Context context, String str) {
        ForegroundColorSpan foregroundColorSpan;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int iLJJJ = a0.LJJJ(str, e3.e, 0, false, 6);
        int iLJJJ2 = a0.LJJJ(str, e3.f, 0, false, 6) - 1;
        String strReplace = new Regex("[\\[\\]]").replace(str, "");
        if (iLJJJ >= 0 && iLJJJ <= iLJJJ2 && iLJJJ2 <= strReplace.length()) {
            spannableStringBuilder.append((CharSequence) strReplace);
            if (!TextUtils.isEmpty(strReplace)) {
                C1119920fFW.LJIIIIZZ(spannableStringBuilder, iLJJJ, iLJJJ2, 33, 500);
                if (context != null) {
                    Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ewy, context);
                    if (numLIZJ != null) {
                        foregroundColorSpan = new ForegroundColorSpan(numLIZJ.intValue());
                    } else {
                        foregroundColorSpan = null;
                    }
                    C786410Ut5.q2(spannableStringBuilder, foregroundColorSpan, iLJJJ, iLJJJ2, 33);
                }
            }
            return spannableStringBuilder;
        }
        spannableStringBuilder.append((CharSequence) str);
        return spannableStringBuilder;
    }

    public static void LJFF(long j, InterfaceC962270b9F interfaceC962270b9F) {
        if (j != 0 && j != 3) {
            ImageView imageViewI4 = interfaceC962270b9F.I4();
            if (imageViewI4 != null) {
                C786410Ut5.LJZI(8, imageViewI4);
                return;
            }
            return;
        }
        ImageView imageViewI42 = interfaceC962270b9F.I4();
        if (imageViewI42 == null) {
            return;
        }
        C500260Jjc.LLFFF(imageViewI42);
        C962250b9D.LJIIJJI(2131841125, imageViewI42);
    }

    /* JADX WARN: Removed duplicated region for block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIJ(X.InterfaceC962270b9F r7, X.C955590ayT r8) {
        /*
            Method dump skipped, instruction units count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC962220b9A.LJIIJ(X.0b9F, X.0ayT):void");
    }

    public final void LJII(final InterfaceC962270b9F interfaceC962270b9F, final C955590ayT c955590ayT) {
        final Room room = c955590ayT.LJ;
        final Room room2 = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        final long followStatus = room.getOwner().getFollowInfo().getFollowStatus();
        ImageView imageViewI4 = interfaceC962270b9F.I4();
        if (imageViewI4 != null) {
            C786410Ut5.I7(new AbstractViewOnClickListenerC1637610siV() { // from class: X.0anL
                @Override // X.AbstractViewOnClickListenerC1637610siV
                public final void LIZ(View view) {
                    long id;
                    if (view != null) {
                        DataChannel dataChannel = interfaceC962270b9F.getDataChannel();
                        if (dataChannel != null) {
                            dataChannel.FQ2(CoHostSearchCloseKeyBoard.class);
                        }
                        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
                        C1099420eiS c1099420eiS = new C1099420eiS();
                        c1099420eiS.LIZIZ(room.getOwner().getId());
                        Room room3 = room2;
                        if (room3 != null) {
                            id = room3.getId();
                        } else {
                            id = 0;
                        }
                        c1099420eiS.LJ(id);
                        c1099420eiS.getClass();
                        C11O8 c11o8LJJJLZIJ = interfaceC500940JkiUser.LIZ(new C1812130xFz(c1099420eiS)).LJJJLZIJ(C1701940uOG.LIZIZ());
                        InterfaceC962270b9F interfaceC962270b9F2 = interfaceC962270b9F;
                        c11o8LJJJLZIJ.LJJLL(new AfS3S0300100_15(interfaceC962270b9F2, c955590ayT, followStatus, room2, 0), new AfS184S0100000_15(interfaceC962270b9F2, 159));
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(300L);
                }
            }, imageViewI4);
        }
        LJFF(followStatus, interfaceC962270b9F);
        LIZJ();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJI(X.InterfaceC962270b9F r11, X.C955590ayT r12, boolean r13) {
        /*
            Method dump skipped, instruction units count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC962220b9A.LJI(X.0b9F, X.0ayT, boolean):boolean");
    }

    public static boolean LJIIL(InterfaceC962270b9F interfaceC962270b9F, C955590ayT c955590ayT, boolean z) {
        RivalExtraInfo rivalExtraInfo;
        String strLJIIL;
        if (C949990apR.LJFF() && z && (rivalExtraInfo = c955590ayT.LJIIJ) != null) {
            RivalExtraInfo.OffliveInviteInfo offliveInviteInfo = rivalExtraInfo.offliveInviteInfo;
            if (offliveInviteInfo != null) {
                long jLIZJ = C158B.LIZJ() - offliveInviteInfo.inviterTimestamp;
                TextView textViewR4 = interfaceC962270b9F.r4(true);
                if (textViewR4 != null) {
                    if (jLIZJ >= 3600) {
                        int i = (int) (jLIZJ / ((long) 3600));
                        strLJIIL = C497740JfY.LJIIL(2131755814, i, Integer.valueOf(i));
                    } else {
                        long j = jLIZJ / ((long) 60);
                        strLJIIL = C497740JfY.LJIIL(2131755815, (int) Math.max(j, 1L), Integer.valueOf((int) Math.max(j, 1L)));
                    }
                    textViewR4.setText(strLJIIL);
                }
                TextView textViewR42 = interfaceC962270b9F.r4(true);
                if (textViewR42 != null) {
                    C500260Jjc.LLFFF(textViewR42);
                }
                C955400ayA.LJJIIJ.put(Long.valueOf(c955590ayT.LJ.getOwnerUserId()), "offlive_invite_before");
                return true;
            }
            if (rivalExtraInfo != null && rivalExtraInfo.showPlayType == 3) {
                TextView textViewR43 = interfaceC962270b9F.r4(true);
                if (textViewR43 != null) {
                    textViewR43.setText(C497740JfY.LJIJI(2131851859));
                }
                TextView textViewR44 = interfaceC962270b9F.r4(true);
                if (textViewR44 != null) {
                    C500260Jjc.LLFFF(textViewR44);
                }
                return true;
            }
        }
        C500260Jjc.LJIILIIL(interfaceC962270b9F.r4(false));
        return false;
    }

    public static void LJIILIIL(InterfaceC962270b9F interfaceC962270b9F, C955590ayT c955590ayT, boolean z) {
        Integer numValueOf;
        if (C949990apR.LJFF() && !z) {
            C21569819bE c21569819bED3 = interfaceC962270b9F.d3();
            if (c21569819bED3 != null) {
                c21569819bED3.setOuterCircleStrokeWidth(C497740JfY.LIZIZ(2));
                c21569819bED3.LIZJ(EnumC21569519bB.LIVE_COHOST_LIST_AVATAR);
                c21569819bED3.LJFF();
            }
            RivalExtraInfo rivalExtraInfo = c955590ayT.LJIIJ;
            if (rivalExtraInfo != null && (numValueOf = Integer.valueOf(rivalExtraInfo.showPlayType)) != null && numValueOf.intValue() != 4) {
                if (numValueOf.intValue() == 3) {
                    C500260Jjc.LJIILIIL(interfaceC962270b9F.d3());
                    C500260Jjc.LLFFF(interfaceC962270b9F.e3());
                    return;
                } else {
                    C500260Jjc.LLFFF(interfaceC962270b9F.d3());
                    C500260Jjc.LJIILIIL(interfaceC962270b9F.e3());
                    return;
                }
            }
            C500260Jjc.LJIILIIL(interfaceC962270b9F.d3());
            C500260Jjc.LJIILIIL(interfaceC962270b9F.e3());
            return;
        }
        C500260Jjc.LJIILIIL(interfaceC962270b9F.d3());
        C500260Jjc.LJIILIIL(interfaceC962270b9F.e3());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJ(InterfaceC962270b9F interfaceC962270b9F, C955590ayT c955590ayT, List list) {
        boolean z;
        this.LIZ = interfaceC962270b9F;
        this.LIZIZ = c955590ayT;
        C955400ayA.LJJIIJ.put(Long.valueOf(c955590ayT.LJ.getOwnerUserId()), "");
        if (list != null && !list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        LIZIZ(interfaceC962270b9F, c955590ayT, !z);
    }

    public final void LJIILJJIL(InterfaceC962270b9F interfaceC962270b9F, D d, boolean z) {
        C1099610eil c1099610eilN;
        C013C c013c = new C013C();
        if (d instanceof C955980az6) {
            c013c.element = ((C955980az6) d).LJJ;
        }
        User owner = d.LJ.getOwner();
        if (!z && (c1099610eilN = interfaceC962270b9F.N()) != null) {
            q0.LJIJ(c1099610eilN, new C759630Tqz(C0KVU.LIZ(d.LJ.getOwner())));
            C1121670fIL.LJIILIIL(c1099610eilN, owner.getAvatarThumb(), c1099610eilN.getWidth(), c1099610eilN.getHeight(), R.drawable.el_);
            C786410Ut5.H8(c1099610eilN, new ACListenerS24S0500000_15(interfaceC962270b9F, d, c013c, owner, this, 2));
        }
    }

    public static boolean LJIIIIZZ(boolean z, InterfaceC962270b9F interfaceC962270b9F, C955590ayT c955590ayT, boolean z2) {
        List<UserInfo> list;
        boolean z3;
        ImageModel avatarThumb;
        User owner;
        List<UserInfo> list2;
        LinkerInfo linkerInfo;
        LinkerInfo linkerInfo2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showLinkedUsers; show: ");
        sbLIZ.append(z);
        sbLIZ.append("; roomId=");
        sbLIZ.append(c955590ayT.LJ.getId());
        C20441214yg.LJIIIZ("BaseMultiHostUserInfoViewHolderDelegate", C2188811AlT.LIZIZ(sbLIZ));
        if (!z) {
            if (!z2) {
                C500260Jjc.LJIILIIL(interfaceC962270b9F.F4(false));
            }
            return false;
        }
        RivalExtraInfo rivalExtraInfo = c955590ayT.LJIIJ;
        if (rivalExtraInfo != null && (linkerInfo2 = rivalExtraInfo.linkerInfo) != null) {
            list = linkerInfo2.linkedUsers;
        } else {
            list = null;
        }
        if (list != null && !list.isEmpty()) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (!z3) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("showLinkedUsers; linkedHosts=");
            sbLIZ2.append(list);
            C20441214yg.LJIIIZ("BaseMultiHostUserInfoViewHolderDelegate", C2188811AlT.LIZIZ(sbLIZ2));
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<UserInfo> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().anchorAvatar);
            }
            return LJIIIZ(interfaceC962270b9F, c955590ayT, C497740JfY.LJIJI(2131841171), arrayList);
        }
        if (C948770anT.LIZLLL()) {
            RivalExtraInfo rivalExtraInfo2 = c955590ayT.LJIIJ;
            if (rivalExtraInfo2 != null && (linkerInfo = rivalExtraInfo2.linkerInfo) != null) {
                list2 = linkerInfo.linkedGuestUsers;
            } else {
                list2 = null;
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("showLinkedUsers; linkedGuests=");
            sbLIZ3.append(list2);
            C20441214yg.LJIIIZ("BaseMultiHostUserInfoViewHolderDelegate", C2188811AlT.LIZIZ(sbLIZ3));
            if (list2 != null) {
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
                Iterator<UserInfo> it3 = list2.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(it3.next().anchorAvatar);
                }
                if (!arrayList2.isEmpty()) {
                    return LJIIIZ(interfaceC962270b9F, c955590ayT, C497740JfY.LJIJI(2131841252), arrayList2);
                }
            }
        }
        if (CohostWithGuestPhase2UiDebugSetting.INSTANCE.isEnabled()) {
            IntRange intRange = new IntRange(1, 5);
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(intRange, 10));
            C531650Kt9 it4 = intRange.iterator();
            while (it4.LLILLL) {
                it4.nextInt();
                Room roomLIZJ = C950220apo.LIZJ();
                if (roomLIZJ != null && (owner = roomLIZJ.getOwner()) != null) {
                    avatarThumb = owner.getAvatarThumb();
                } else {
                    avatarThumb = null;
                }
                arrayList3.add(avatarThumb);
            }
            return LJIIIZ(interfaceC962270b9F, c955590ayT, C497740JfY.LJIJI(2131841252), arrayList3);
        }
        if (!z2) {
            C500260Jjc.LJIILIIL(interfaceC962270b9F.F4(false));
        }
        return false;
    }

    public static boolean LJIIIZ(InterfaceC962270b9F interfaceC962270b9F, C955590ayT c955590ayT, String str, List list) {
        boolean z;
        int i;
        int i2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showLinkedUsersInternal; size=");
        ArrayList arrayList = (ArrayList) list;
        sbLIZ.append(arrayList.size());
        sbLIZ.append("; roomId=");
        sbLIZ.append(c955590ayT.LJ.getId());
        C20441214yg.LIZIZ("BaseMultiHostUserInfoViewHolderDelegate", C2188811AlT.LIZIZ(sbLIZ));
        ViewGroup viewGroupF4 = interfaceC962270b9F.F4(true);
        int i3 = 0;
        if (viewGroupF4 == null) {
            return false;
        }
        int i4 = 0;
        for (Object obj : arrayList) {
            int i5 = i4 + 1;
            if (i4 >= 0) {
                ImageModel imageModel = (ImageModel) obj;
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            C498540Jgq c498540JgqLLLIILIL = interfaceC962270b9F.LLLIILIL(true);
                            if (c498540JgqLLLIILIL != null) {
                                c498540JgqLLLIILIL.setAvatar(imageModel);
                            }
                            C498540Jgq c498540JgqLLLIILIL2 = interfaceC962270b9F.LLLIILIL(true);
                            if (c498540JgqLLLIILIL2 != null) {
                                C786410Ut5.LLLFZ(c498540JgqLLLIILIL2, 0);
                            }
                        }
                    } else {
                        C498540Jgq c498540JgqH = interfaceC962270b9F.h(true);
                        if (c498540JgqH != null) {
                            c498540JgqH.setAvatar(imageModel);
                        }
                        C498540Jgq c498540JgqH2 = interfaceC962270b9F.h(true);
                        if (c498540JgqH2 != null) {
                            C786410Ut5.LLLFZ(c498540JgqH2, 0);
                        }
                        C498540Jgq c498540JgqLLLIILIL3 = interfaceC962270b9F.LLLIILIL(true);
                        if (c498540JgqLLLIILIL3 != null) {
                            C786410Ut5.LLLFZ(c498540JgqLLLIILIL3, 8);
                        }
                    }
                } else {
                    C498540Jgq c498540JgqI = interfaceC962270b9F.i(true);
                    if (c498540JgqI != null) {
                        c498540JgqI.setAvatar(imageModel);
                    }
                    C498540Jgq c498540JgqI2 = interfaceC962270b9F.i(true);
                    if (c498540JgqI2 != null) {
                        C786410Ut5.LLLFZ(c498540JgqI2, 0);
                    }
                    C498540Jgq c498540JgqH3 = interfaceC962270b9F.h(true);
                    if (c498540JgqH3 != null) {
                        C786410Ut5.LLLFZ(c498540JgqH3, 8);
                    }
                    C498540Jgq c498540JgqLLLIILIL4 = interfaceC962270b9F.LLLIILIL(true);
                    if (c498540JgqLLLIILIL4 != null) {
                        C786410Ut5.LLLFZ(c498540JgqLLLIILIL4, 8);
                    }
                }
                i4 = i5;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        if (arrayList.size() > 3) {
            C498540Jgq c498540JgqLLLIILIL5 = interfaceC962270b9F.LLLIILIL(true);
            if (c498540JgqLLLIILIL5 != null) {
                C786410Ut5.LLLFZ(c498540JgqLLLIILIL5, 8);
            }
            ViewGroup viewGroupLLLZ = interfaceC962270b9F.LLLZ(true);
            if (viewGroupLLLZ != null) {
                C786410Ut5.LJLZ(0, viewGroupLLLZ);
            }
            C16F5 c16f5K1 = interfaceC962270b9F.k1(true);
            if (c16f5K1 != null) {
                c16f5K1.setText(String.valueOf(arrayList.size() - 2));
            }
        } else {
            ViewGroup viewGroupLLLZ2 = interfaceC962270b9F.LLLZ(true);
            if (viewGroupLLLZ2 != null) {
                C786410Ut5.LJLZ(8, viewGroupLLLZ2);
            }
        }
        RivalExtraInfo rivalExtraInfo = c955590ayT.LJIIJ;
        if (rivalExtraInfo != null && rivalExtraInfo.cohostLayoutMode == 1 && interfaceC962270b9F.e1() != null && interfaceC962270b9F.LLLLLLZZ() != null) {
            z = true;
        } else {
            z = false;
        }
        C500260Jjc.LLFFF(viewGroupF4);
        TextView textViewV1 = interfaceC962270b9F.V1();
        if (textViewV1 != null) {
            if (z) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            C786410Ut5.LLIL(textViewV1, i2);
        }
        TextView textViewV12 = interfaceC962270b9F.V1();
        if (textViewV12 != null) {
            textViewV12.setText(str);
        }
        TextView textViewLLLLLLZZ = interfaceC962270b9F.LLLLLLZZ();
        if (textViewLLLLLLZZ != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LLIL(textViewLLLLLLZZ, i);
        }
        LiveIconView liveIconViewE1 = interfaceC962270b9F.e1();
        if (liveIconViewE1 != null) {
            if (!z) {
                i3 = 8;
            }
            C786410Ut5.LLJJIJIL(liveIconViewE1, i3);
        }
        c955590ayT.LJIILLIIL = z;
        return true;
    }

    public static void LJIIJJI(InterfaceC962270b9F interfaceC962270b9F, long j, long j2, Context context) {
        long jMax;
        TextView textViewP4;
        Long l = C916430ZxJ.LIZIZ.get(Long.valueOf(j2));
        if (l != null) {
            jMax = l.longValue();
        } else {
            jMax = 0;
        }
        if (jMax == 0 && j == 0) {
            ViewGroup viewGroupR = interfaceC962270b9F.r(false);
            if (viewGroupR != null) {
                C786410Ut5.LJLZ(8, viewGroupR);
                return;
            }
            return;
        }
        ViewGroup viewGroupR2 = interfaceC962270b9F.r(true);
        if (viewGroupR2 != null) {
            C786410Ut5.LJLZ(0, viewGroupR2);
        }
        TextView textViewP42 = interfaceC962270b9F.p4();
        if (textViewP42 != null) {
            C786410Ut5.LLIL(textViewP42, 0);
        }
        if (jMax == 0) {
            long jLIZ = C974520bT0.LIZ();
            long j3 = LSPassThroughRecordSizeConfig.DEFAULT;
            long jCurrentTimeMillis = jLIZ / j3;
            if (jCurrentTimeMillis <= 0) {
                jCurrentTimeMillis = System.currentTimeMillis() / j3;
            }
            jMax = Math.max(0L, jCurrentTimeMillis - j);
            C916430ZxJ.LIZIZ(j2, j);
        }
        if (jMax < 300) {
            SpannableStringBuilder spannableStringBuilderLIZ = LIZ(context, C497740JfY.LJIJJ(2131843685, C963140bAe.LJIIJ(300 - jMax)));
            TextView textViewP43 = interfaceC962270b9F.p4();
            if (textViewP43 != null) {
                textViewP43.setText(spannableStringBuilderLIZ);
                return;
            }
            return;
        }
        if (300 <= jMax && jMax < 3600) {
            int i = (int) (jMax / 60);
            SpannableStringBuilder spannableStringBuilderLIZ2 = LIZ(context, C497740JfY.LJIIL(2131755583, i, Integer.valueOf(i)));
            TextView textViewP44 = interfaceC962270b9F.p4();
            if (textViewP44 == null) {
                return;
            }
            textViewP44.setText(spannableStringBuilderLIZ2);
            return;
        }
        if (3600 <= jMax && jMax < 7200) {
            TextView textViewP45 = interfaceC962270b9F.p4();
            if (textViewP45 == null) {
                return;
            }
            textViewP45.setText(C497740JfY.LJIJI(2131843680));
            return;
        }
        if (jMax < 7200 || (textViewP4 = interfaceC962270b9F.p4()) == null) {
            return;
        }
        textViewP4.setText(C497740JfY.LJIJI(2131843681));
    }
}
