package com.bytedance.android.live;

import X.AbstractC497160Jec;
import X.C0163003d;
import X.C0JCN;
import X.C0KVU;
import X.C1114660f72;
import X.C1115360f8A;
import X.C1115500f8O;
import X.C1161920gLG;
import X.C20066713fN;
import X.C470590Icr;
import X.C496230Jd7;
import X.C497590JfJ;
import X.C497740JfY;
import X.C752320TfC;
import X.C755520TkM;
import X.C786410Ut5;
import X.EnumC1102750enp;
import X.EnumC1114820f7I;
import X.InterfaceC1114710f77;
import X.InterfaceC1114800f7G;
import X.InterfaceC1115130f7n;
import X.InterfaceC1115260f80;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.programmedlive.IProgrammedLiveService;
import com.bytedance.android.livesdk.chatroom.api.AtWithIndex;
import com.bytedance.android.livesdk.chatroom.api.SpaceCommentItem;
import com.bytedance.android.livesdk.chatroom.api.SpacePost;
import com.bytedance.android.livesdk.chatroom.event.ISendCommentEvent;
import com.bytedance.android.livesdk.chatroom.model.InputAttrs;
import com.bytedance.android.livesdk.chatroom.viewmodule.CommentWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.LandscapeCommentWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.QuickCommentWidget;
import com.bytedance.android.livesdk.comp.api.subscription.status.ISubscriptionStatusService;
import com.bytedance.android.livesdk.subcription.subspaceeditor.SubSpaceEditorDialogFragment;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostResource;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;

/* JADX INFO: loaded from: classes18.dex */
public class CommentService implements ICommentService {
    public final C20066713fN<InterfaceC1114800f7G> LL = new C20066713fN<>((Object) null);
    public final Set<InterfaceC1114710f77> LLILLJJLI = new LinkedHashSet();

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0JfJ] */
    @Override // com.bytedance.android.live.ICommentService
    public final C497590JfJ kz2() {
        return new AbstractC497160Jec<C470590Icr<C0163003d>, C496230Jd7>() { // from class: X.0JfJ
            @Override // X.AbstractC497160Jec
            public final void LIZJ() {
            }

            @Override // X.AbstractC497160Jec
            public final String LIZLLL() {
                return "GET";
            }

            @Override // X.AbstractC497160Jec
            public final String LJ() {
                return "/webcast/room/quick_chat_list/";
            }

            @Override // X.AbstractC497160Jec
            public final String LJFF() {
                return "";
            }

            @Override // X.AbstractC497160Jec
            public final Type LJII() {
                return new TypeToken<C470590Icr<C0163003d>>() { // from class: X.0JfK
                }.getType();
            }

            @Override // X.AbstractC497160Jec
            public final Class<C470590Icr<C0163003d>> LJIIIIZZ() {
                new C470590Icr();
                return C470590Icr.class;
            }

            /* JADX WARN: Removed duplicated region for block: B:42:0x0071  */
            @Override // X.AbstractC497160Jec
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean LIZ(X.C496230Jd7 r9) {
                /*
                    r8 = this;
                    com.bytedance.android.livesdkapi.depend.model.live.Room r2 = r9.LIZ
                    r5 = 0
                    if (r2 == 0) goto L70
                    com.bytedance.android.livesdkapi.depend.model.live.AggregationData r0 = r2.aggregationData
                    if (r0 == 0) goto L70
                    com.bytedance.android.live.base.model.user.User r1 = r0.audience
                    if (r1 == 0) goto L70
                    com.bytedance.android.livesdkapi.depend.model.live.CommerceStruct r0 = r2.getCommerceStruct()
                    r3 = 1
                    if (r0 == 0) goto L79
                    int r0 = r0.commercePermission
                    if (r0 != r3) goto L79
                    r7 = 1
                L19:
                    com.bytedance.android.livesdk.model.UserAttr r0 = r1.getUserAttr()
                    if (r0 == 0) goto L77
                    boolean r0 = r0.isMuted
                    if (r0 != r3) goto L77
                    r6 = 1
                L24:
                    com.bytedance.android.livesdk.model.RoomAuthStatus r0 = r2.getRoomAuthStatus()
                    if (r0 == 0) goto L75
                    int r1 = r0.getQuickCommentState()
                    r0 = 2
                    if (r1 != r0) goto L75
                    r4 = 1
                L32:
                    com.bytedance.android.livesdk.model.RoomAuthStatus r0 = r2.getRoomAuthStatus()
                    if (r0 == 0) goto L73
                    boolean r0 = r0.enableChat
                    if (r0 != r3) goto L73
                    r3 = 1
                L3d:
                    boolean r0 = X.C494680Jac.LJIIJJI(r5, r2)
                    if (r0 == 0) goto L71
                    X.0K9Q r0 = com.bytedance.android.livesdk.comp.api.subscription.status.ISubscriptionStatusService.LJIIIZ
                    r0.getClass()
                    com.bytedance.android.livesdk.comp.api.subscription.status.ISubscriptionStatusService r0 = X.C0K9Q.LIZ()
                    X.0JyZ r0 = r0.m70(r2)
                    boolean r0 = r0.LIZ
                    if (r0 == 0) goto L71
                    r2 = 1
                L55:
                    com.bytedance.android.livesdk.userservice.UserService r0 = com.bytedance.android.livesdk.userservice.UserService.getInstance()
                    X.0Jki r1 = r0.user()
                    X.0fcQ r0 = X.EnumC1134120fcQ.COMMENT
                    boolean r0 = r1.LJIJI(r0)
                    if (r7 != 0) goto L70
                    if (r6 != 0) goto L70
                    if (r4 != 0) goto L70
                    if (r3 == 0) goto L70
                    if (r2 != 0) goto L70
                    if (r0 != 0) goto L70
                    r5 = 1
                L70:
                    return r5
                L71:
                    r2 = 0
                    goto L55
                L73:
                    r3 = 0
                    goto L3d
                L75:
                    r4 = 0
                    goto L32
                L77:
                    r6 = 0
                    goto L24
                L79:
                    r7 = 0
                    goto L19
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C497590JfJ.LIZ(X.0Jd7):boolean");
            }

            @Override // X.AbstractC497160Jec
            public final /* bridge */ /* synthetic */ Object LIZIZ(C496230Jd7 c496230Jd7) {
                return null;
            }

            @Override // X.AbstractC497160Jec
            public final Map LJI(C496230Jd7 c496230Jd7) {
                Long lValueOf;
                User owner;
                C496230Jd7 c496230Jd72 = c496230Jd7;
                boolean zLm1 = ((IProgrammedLiveService) C1161920gLG.LIZJ(IProgrammedLiveService.class)).lm1();
                String strLIZIZ = CardStruct.IStatusCode.DEFAULT;
                if (zLm1) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(CardStruct.IStatusCode.DEFAULT);
                    sbLIZ.append(",4");
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                }
                Pair[] pairArr = new Pair[5];
                Room room = c496230Jd72.LIZ;
                Long lValueOf2 = null;
                if (room != null) {
                    lValueOf = Long.valueOf(room.getId());
                } else {
                    lValueOf = null;
                }
                pairArr[0] = new Pair("room_id", String.valueOf(lValueOf));
                Room room2 = c496230Jd72.LIZ;
                if (room2 != null && (owner = room2.getOwner()) != null) {
                    lValueOf2 = Long.valueOf(owner.getId());
                }
                pairArr[1] = new Pair("anchor_id", String.valueOf(lValueOf2));
                ISubscriptionStatusService.LJIIIZ.getClass();
                pairArr[2] = new Pair("is_subscribing", String.valueOf(C0K9Q.LIZ().m70(c496230Jd72.LIZ).LIZ));
                pairArr[3] = new Pair("scenes_list", strLIZIZ);
                pairArr[4] = new Pair("extra", "");
                return C2097608Jq.LJIIIIZZ(pairArr);
            }

            @Override // X.AbstractC497160Jec
            public final boolean LJIIIZ(C470590Icr<C0163003d> c470590Icr) {
                if (c470590Icr.statusCode == 0) {
                    return true;
                }
                return false;
            }
        };
    }

    @Override // com.bytedance.android.live.ICommentService
    public final List<C1115500f8O> Mf1() {
        C1115360f8A.LIZJ().LIZ.getClass();
        return ((IHostResource) C1161920gLG.LIZJ(IHostResource.class)).cq1();
    }

    @Override // com.bytedance.android.live.ICommentService
    public final Class<? extends LiveRecyclableWidget> EW0() {
        return LandscapeCommentWidget.class;
    }

    @Override // com.bytedance.android.live.ICommentService
    public final Class<? extends LiveRecyclableWidget> KK1() {
        return CommentWidget.class;
    }

    @Override // com.bytedance.android.live.ICommentService
    public final Class<? extends LiveRecyclableWidget> TO0() {
        return QuickCommentWidget.class;
    }

    @Override // com.bytedance.android.live.ICommentService
    public final void H42(InterfaceC1114710f77 interfaceC1114710f77) {
        this.LLILLJJLI.add(interfaceC1114710f77);
    }

    @Override // com.bytedance.android.live.ICommentService
    public final void bF1(InterfaceC1114710f77 interfaceC1114710f77) {
        this.LLILLJJLI.remove(interfaceC1114710f77);
    }

    @Override // com.bytedance.android.live.ICommentService
    public final void oJ1(DataChannel dataChannel) {
        dataChannel.SX0(C755520TkM.class, Boolean.TRUE);
        dataChannel.SX0(C1114660f72.class, null);
    }

    @Override // com.bytedance.android.live.ICommentService
    public final void sj2(Context context, DataChannel dataChannel) {
        EnumC1102750enp.COMMENT_EXT.load(dataChannel, new C752320TfC(context));
    }

    @Override // com.bytedance.android.live.ICommentService
    public final void Pv1(long j, List list, ISendCommentEvent.Sender sender) {
        InterfaceC1114800f7G interfaceC1114800f7GLJ = this.LL.LJ(j);
        if (interfaceC1114800f7GLJ != null) {
            interfaceC1114800f7GLJ.y(list, sender);
        }
    }

    @Override // com.bytedance.android.live.ICommentService
    public final void vF2(long j, String str, String str2, int i, ISendCommentEvent.Sender sender) {
        InterfaceC1114800f7G interfaceC1114800f7GLJ = this.LL.LJ(j);
        if (interfaceC1114800f7GLJ != null) {
            interfaceC1114800f7GLJ.LJJLIIIJILLIZJL(str, str2, i, sender);
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [X.0f7H] */
    @Override // com.bytedance.android.live.ICommentService
    public final void su2(FragmentManager fragmentManager, C0JCN c0jcn, DataChannel dataChannel, final SpaceCommentItem spaceCommentItem, final SpacePost spacePost, int i, boolean z) {
        EnumC1114820f7I enumC1114820f7I;
        String strLJIJI;
        SubSpaceEditorDialogFragment.LLLLL.getClass();
        if (i == 1) {
            enumC1114820f7I = EnumC1114820f7I.Panel;
        } else {
            enumC1114820f7I = EnumC1114820f7I.Keyboard;
        }
        InputAttrs inputAttrs = new InputAttrs();
        inputAttrs.trackInfo = null;
        inputAttrs.canSendDanmu = false;
        inputAttrs.isOfficial = false;
        inputAttrs.emoteEnabled = false;
        if (spaceCommentItem != null) {
            strLJIJI = C786410Ut5.j4(C497740JfY.LJIJI(2131856518), Arrays.copyOf(new Object[]{C0KVU.LIZ(spaceCommentItem.userInfo)}, 1));
        } else {
            strLJIJI = C497740JfY.LJIJI(2131844323);
        }
        inputAttrs.hint = strLJIJI;
        inputAttrs.mCommentMethod = "click";
        ?? r3 = new InterfaceC1115260f80() { // from class: X.0f7H
            @Override // X.InterfaceC1115260f80
            public final boolean fu() {
                return true;
            }

            @Override // X.InterfaceC1115260f80
            public final void gu() {
            }
        };
        final SubSpaceEditorDialogFragment subSpaceEditorDialogFragment = new SubSpaceEditorDialogFragment();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIJL(bundle, "live.intent.extra.INPUT_ATTRS", inputAttrs);
        subSpaceEditorDialogFragment.setArguments(bundle);
        subSpaceEditorDialogFragment.LLILZIL = r3;
        subSpaceEditorDialogFragment.LLILLL = dataChannel;
        if (i == 2) {
            subSpaceEditorDialogFragment.LLLLJ = true;
        }
        subSpaceEditorDialogFragment.LLLLJI = z;
        InterfaceC1115130f7n interfaceC1115130f7n = new InterfaceC1115130f7n() { // from class: X.0JCV
            @Override // X.InterfaceC1115130f7n
            public final void LIZ() {
            }

            @Override // X.InterfaceC1115130f7n
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC1115130f7n
            public final void Mc() {
            }

            @Override // X.InterfaceC1115130f7n
            public final void Nc(String str, C1114670f73 c1114670f73) {
            }

            @Override // X.InterfaceC1115130f7n
            public final void Oc() {
            }

            @Override // X.InterfaceC1115130f7n
            public final void Qc() {
            }

            @Override // X.InterfaceC1115130f7n
            public final void Rc(InputAttrs inputAttrs2) {
            }

            @Override // X.InterfaceC1115130f7n
            public final void Sc(InterfaceC1112060f2q interfaceC1112060f2q, Boolean bool) {
            }

            @Override // X.InterfaceC1115130f7n
            public final /* bridge */ /* synthetic */ void Pc(Boolean bool) {
                bool.booleanValue();
            }

            @Override // X.InterfaceC1115130f7n
            public final void Tc(String str, String str2, boolean z2, int i2, C520890Kbn c520890Kbn, C1114670f73 c1114670f73, InterfaceC1114610f6x interfaceC1114610f6x) {
                String str3;
                List<AtWithIndex> arrayList;
                C0JCN c0jcn2;
                if (str == null) {
                    return;
                }
                SubSpaceEditorDialogFragment subSpaceEditorDialogFragment2 = subSpaceEditorDialogFragment;
                SpaceCommentItem spaceCommentItem2 = spaceCommentItem;
                SpacePost spacePost2 = spacePost;
                C0JCM c0jcmHS = subSpaceEditorDialogFragment2.hS();
                if (c0jcmHS == null || (str3 = c0jcmHS.LL) == null) {
                    str3 = "";
                }
                C0JCM c0jcmHS2 = subSpaceEditorDialogFragment2.hS();
                if (c0jcmHS2 == null || (arrayList = c0jcmHS2.LLILLL) == null) {
                    arrayList = new ArrayList<>();
                }
                if (spaceCommentItem2 != null) {
                    C0JCN c0jcn3 = subSpaceEditorDialogFragment2.LLLLIL;
                    if (c0jcn3 != null) {
                        c0jcn3.CN1(spaceCommentItem2, str3, arrayList);
                    }
                } else if (spacePost2 != null && (c0jcn2 = subSpaceEditorDialogFragment2.LLLLIL) != null) {
                    c0jcn2.FF1(str3, arrayList, spacePost2);
                }
                subSpaceEditorDialogFragment.MR();
            }
        };
        subSpaceEditorDialogFragment.LLIZLLLIL = enumC1114820f7I;
        subSpaceEditorDialogFragment.LLJJJ = true;
        subSpaceEditorDialogFragment.LLILZ = interfaceC1115130f7n;
        subSpaceEditorDialogFragment.LLLLIL = c0jcn;
        subSpaceEditorDialogFragment.LLLJIL = true;
        subSpaceEditorDialogFragment.show(fragmentManager, "SubSpaceEditorDialogFragment");
    }
}
