package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.scene.Scene;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.biz.wallet.biz.finish.WalletAccountFinishFragment;
import com.ss.android.ugc.aweme.component.ca.OpenCANeedSyncAssem;
import com.ss.android.ugc.aweme.component.ca.OpenCANeedSyncFragment;
import com.ss.android.ugc.aweme.im.viewmodel.IMSearchDetailVM;
import com.ss.android.ugc.aweme.inbox.search.InboxSearchGenericAbility;
import com.ss.android.ugc.aweme.invitation.newdesign.assem.GroupInvitationConfirmBtnAssem;
import com.ss.android.ugc.aweme.invitation.newdesign.vm.GroupInvitationVM;
import com.ss.android.ugc.aweme.profile.model.BlockStruct;
import com.ss.android.ugc.aweme.publicgroup.data.GroupInvitation;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.profile.business.profile.ui.v2.UserProfileAbility;
import com.ss.android.ugc.profile.business.ug.NavBarMoreData;
import com.ss.android.ugc.profile.business.ug.ProfileNavbarMoreProtocol;
import com.ss.android.ugc.profile.business.ur.aigc.AvatarCell;
import com.ss.android.ugc.profile.business.ur.editprofileassem.EditProfileBioCellAssem;
import com.ss.android.ugc.profile.business.ur.platform.follow.HeaderCTAFollowComponent;
import com.ss.android.ugc.profile.platform.base.data.ProfileCommonInfo;
import com.ss.android.ugc.profile.platform.base.data.UserProfileInfo;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0j3a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class C1266280j3a extends C09AY implements InterfaceC1631630sYr {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1631630sYr
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3, obj4);
            case 1:
                return invoke$1(this, obj, obj2, obj3, obj4);
            case 2:
                return invoke$2(this, obj, obj2, obj3, obj4);
            case 3:
                return invoke$3(this, obj, obj2, obj3, obj4);
            case 4:
                return invoke$4(this, obj, obj2, obj3, obj4);
            case 5:
                return invoke$5(this, obj, obj2, obj3, obj4);
            case 6:
                return invoke$6(this, obj, obj2, obj3, obj4);
            case 7:
                return invoke$7(this, obj, obj2, obj3, obj4);
            case 8:
                return invoke$8(this, obj, obj2, obj3, obj4);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj, obj2, obj3, obj4);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj, obj2, obj3, obj4);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj, obj2, obj3, obj4);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj, obj2, obj3, obj4);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj, obj2, obj3, obj4);
            case 14:
                return invoke$14(this, obj, obj2, obj3, obj4);
            case 15:
                return invoke$15(this, obj, obj2, obj3, obj4);
            case 16:
                return invoke$16(this, obj, obj2, obj3, obj4);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this, obj, obj2, obj3, obj4);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this, obj, obj2, obj3, obj4);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1266280j3a(C1240110iNN c1240110iNN, int i) {
        super(4);
        this.$t = i;
        this.l0 = c1240110iNN;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1266280j3a(C1240120iNO c1240120iNO, int i) {
        super(4);
        this.$t = i;
        this.l0 = c1240120iNO;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1266280j3a(C1240150iNR c1240150iNR, int i) {
        super(4);
        this.$t = i;
        this.l0 = c1240150iNR;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1266280j3a(C1240160iNS c1240160iNS, int i) {
        super(4);
        this.$t = i;
        this.l0 = c1240160iNS;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1266280j3a(C1240210iNX c1240210iNX, int i) {
        super(4);
        this.$t = i;
        this.l0 = c1240210iNX;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1266280j3a(C1240220iNY c1240220iNY, int i) {
        super(4);
        this.$t = i;
        this.l0 = c1240220iNY;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1266280j3a(C1262980iyG c1262980iyG, int i) {
        super(4);
        this.$t = i;
        this.l0 = c1262980iyG;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1266280j3a(OpenCANeedSyncAssem openCANeedSyncAssem, int i) {
        super(4);
        this.$t = i;
        this.l0 = openCANeedSyncAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1266280j3a(GroupInvitationConfirmBtnAssem groupInvitationConfirmBtnAssem, int i) {
        super(4);
        this.$t = i;
        this.l0 = groupInvitationConfirmBtnAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1266280j3a(ProfileNavbarMoreProtocol profileNavbarMoreProtocol, int i) {
        super(4);
        this.$t = i;
        this.l0 = profileNavbarMoreProtocol;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1266280j3a(AvatarCell avatarCell, int i) {
        super(4);
        this.$t = i;
        this.l0 = avatarCell;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1266280j3a(EditProfileBioCellAssem editProfileBioCellAssem, int i) {
        super(4);
        this.$t = i;
        this.l0 = editProfileBioCellAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1266280j3a(HeaderCTAFollowComponent headerCTAFollowComponent, int i) {
        super(4);
        this.$t = i;
        this.l0 = headerCTAFollowComponent;
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(C1266280j3a c1266280j3a, Object obj, Object obj2, Object obj3, Object obj4) {
        AbstractC738140SxQ abstractC738140SxQ = (AbstractC738140SxQ) obj;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        String str = (String) obj4;
        int i = C0JD9.LIZ[((EnumC488160JCk) obj2).ordinal()];
        if (i != 1) {
            if (i != 2) {
                String str2 = WalletAccountFinishFragment._pnsPageId;
                String str3 = ((OpenCANeedSyncAssem) c1266280j3a.l0).Go().LLILLJJLI;
                if (str != null && str.length() != 0) {
                    WalletAccountFinishFragment.LLJJIII.put(str3, str);
                }
                String strCreateJumpSourceBtmToken = BtmSDK.INSTANCE.createJumpSourceBtmToken("a2270.b52415.c4498.d75046", PageFinder.via(C724240Sb0.LJI(abstractC738140SxQ)), null);
                String str4 = OpenCANeedSyncFragment._pnsPageId;
                InterfaceC1221990hu9 interfaceC1221990hu9 = OpenCANeedSyncFragment.LLJIJIL.get(((OpenCANeedSyncAssem) c1266280j3a.l0).Go().LLILLJJLI);
                if (interfaceC1221990hu9 != null) {
                    interfaceC1221990hu9.onSuccess(strCreateJumpSourceBtmToken);
                }
                ((OpenCANeedSyncAssem) c1266280j3a.l0).Ho();
                String str5 = ((OpenCANeedSyncAssem) c1266280j3a.l0).Go().LLILLJJLI;
                C1716310ulR c1716310ulR = C1716310ulR.LIZ;
                Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("step", "finish_ca"), new Pair(Scene.SCENE_SERVICE, str5));
                c1716310ulR.getClass();
                C1716310ulR.LIZLLL("rd_pipo_on_boarding", mapLJIIIIZZ);
                Long l = C1716310ulR.LIZIZ;
                if (l != null) {
                    long jLongValue = l.longValue();
                    Pair[] pairArr = new Pair[3];
                    pairArr[0] = new Pair("step", "total");
                    if (str5 == null) {
                        str5 = "";
                    }
                    pairArr[1] = new Pair(Scene.SCENE_SERVICE, str5);
                    pairArr[2] = new Pair("duration", String.valueOf(System.currentTimeMillis() - jLongValue));
                    C1716310ulR.LIZLLL("rd_pipo_on_boarding", C2097608Jq.LJIIIIZZ(pairArr));
                }
                C1716310ulR.LIZIZ = null;
                C19EG c19egLIZ = C724240Sb0.LIZ(abstractC738140SxQ);
                if (c19egLIZ != null) {
                    c19egLIZ.finish();
                }
            } else {
                ((C1390410mHn) ((OpenCANeedSyncAssem) c1266280j3a.l0).LLJIJIL.getValue()).LIZLLL();
                C786410Ut5.LLLZZIL((C1390410mHn) ((OpenCANeedSyncAssem) c1266280j3a.l0).LLJIJIL.getValue(), 8);
                C786410Ut5.LLZ((C1390130mHL) ((OpenCANeedSyncAssem) c1266280j3a.l0).LLJI.getValue(), 8);
                OpenCANeedSyncAssem openCANeedSyncAssem = (OpenCANeedSyncAssem) c1266280j3a.l0;
                Context context = openCANeedSyncAssem.getContext();
                if (context != null) {
                    C0HTI c0hti = new C0HTI();
                    c0hti.LIZ = R.drawable.ph;
                    ((ImageView) openCANeedSyncAssem.LLJJ.getValue()).setImageDrawable(c0hti.LIZ(context));
                    C786410Ut5.LJLLLLLL(0, (View) openCANeedSyncAssem.LLJILLL.getValue());
                    C786410Ut5.LLLLLLJ((C197039127h) openCANeedSyncAssem.LLJILJILJ.getValue(), 0);
                }
                TuxNavBar tuxNavBar = (TuxNavBar) openCANeedSyncAssem.LLJILJIL.getValue();
                C0OM1 c0om1 = new C0OM1();
                C1251150ifB c1251150ifB = new C1251150ifB();
                c1251150ifB.LIZLLL();
                c1251150ifB.LIZJ = R.raw.icon_x_mark;
                c1251150ifB.LIZLLL = true;
                c1251150ifB.LIZJ(new AwS563S0100000_19(openCANeedSyncAssem, 959));
                c0om1.LJ(c1251150ifB);
                tuxNavBar.setNavActions(c0om1);
                C786410Ut5.LLLLZLLLI((TuxNavBar) openCANeedSyncAssem.LLJILJIL.getValue(), 0);
            }
        } else if (zBooleanValue) {
            C786410Ut5.LLLZZIL((C1390410mHn) ((OpenCANeedSyncAssem) c1266280j3a.l0).LLJIJIL.getValue(), 0);
            ((C1390410mHn) ((OpenCANeedSyncAssem) c1266280j3a.l0).LLJIJIL.getValue()).LIZJ();
        } else {
            C786410Ut5.LLZ((C1390130mHL) ((OpenCANeedSyncAssem) c1266280j3a.l0).LLJI.getValue(), 0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(C1266280j3a c1266280j3a, Object obj, Object obj2, Object obj3, Object obj4) {
        String uid;
        UserProfileAbility userProfileAbility;
        int i;
        UserProfileInfo userProfileInfo;
        String str = (String) obj2;
        BlockStruct blockStruct = (BlockStruct) obj3;
        int iIntValue = ((Number) obj4).intValue();
        ProfileCommonInfo profileCommonInfoLJIILIIL = ((ProfileNavbarMoreProtocol) c1266280j3a.l0).LJIILIIL();
        if (profileCommonInfoLJIILIIL != null && (userProfileInfo = profileCommonInfoLJIILIIL.getUserProfileInfo()) != null) {
            uid = userProfileInfo.getUid();
        } else {
            uid = null;
        }
        if (((Boolean) C0B9I.LIZ.getValue()).booleanValue() && !Intrinsics.LJFF(str, uid)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("blockUserID != curUid, blockUserID: ");
            sbLIZ.append(str);
            sbLIZ.append(", curUid: ");
            sbLIZ.append(uid);
            C1248210iaR.LIZJ("nav_bar_end_more", C2188811AlT.LIZIZ(sbLIZ), EnumC1253850ijX.ERROR, "block_error");
        } else {
            NavBarMoreData navBarMoreData = (NavBarMoreData) ((ProfileNavbarMoreProtocol) c1266280j3a.l0).LLJILJIL;
            if (navBarMoreData != null) {
                if (iIntValue == 4) {
                    i = 1;
                } else {
                    i = 0;
                }
                navBarMoreData.setBlockingByType(Integer.valueOf(i));
            }
            if (blockStruct != null && (userProfileAbility = (UserProfileAbility) C1558520qew.LIZ(C1558420qem.LIZIZ((ProfileNavbarMoreProtocol) c1266280j3a.l0), UserProfileAbility.class, null)) != null) {
                userProfileAbility.lO2(blockStruct.blockStatus, iIntValue);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$10(X.C1266280j3a r10, java.lang.Object r11, java.lang.Object r12, java.lang.Object r13, java.lang.Object r14) {
        /*
            java.lang.Class<com.ss.android.ugc.aweme.im.service.service.IIMAnonymousService> r2 = com.ss.android.ugc.aweme.im.service.service.IIMAnonymousService.class
            r3 = 0
            r9 = 0
            r6 = 14
            r7 = 0
            r4 = r3
            r5 = r3
            java.lang.Object r3 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r2, r3, r4, r5, r6, r7)
            com.ss.android.ugc.aweme.im.service.service.IIMAnonymousService r3 = (com.ss.android.ugc.aweme.im.service.service.IIMAnonymousService) r3
            java.lang.String r5 = ""
            if (r3 == 0) goto L76
            java.lang.Object r0 = r10.l0
            X.0iNO r0 = (X.C1240120iNO) r0
            X.0Y8T r0 = r0.LJII
            if (r0 == 0) goto L21
            java.lang.String r2 = r0.getConversationId()
            if (r2 != 0) goto L22
        L21:
            r2 = r5
        L22:
            java.lang.Object r0 = r10.l0
            X.0iNO r0 = (X.C1240120iNO) r0
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUser r0 = r0.LIZ
            java.lang.String r0 = r0.getUid()
            if (r0 != 0) goto L2f
            r0 = r5
        L2f:
            r1 = 1
            boolean r0 = r3.LIZLLL(r2, r0, r1)
            if (r0 != r1) goto L76
            X.0mCc r0 = X.C1906580ziK.LIZIZ()
            if (r0 == 0) goto L73
            android.app.Activity r0 = r0.LIZIZ()
            if (r0 == 0) goto L73
            android.app.Activity r4 = X.C1388190mED.LIZ(r0)
            if (r4 == 0) goto L73
            java.lang.Object r3 = r10.l0
            X.0iNO r3 = (X.C1240120iNO) r3
            java.lang.Class<com.ss.android.ugc.aweme.im.service.service.IIMAnonymousService> r8 = com.ss.android.ugc.aweme.im.service.service.IIMAnonymousService.class
            r10 = r9
            r11 = r9
            r12 = r6
            r13 = r7
            java.lang.Object r2 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r8, r9, r10, r11, r12, r13)
            com.ss.android.ugc.aweme.im.service.service.IIMAnonymousService r2 = (com.ss.android.ugc.aweme.im.service.service.IIMAnonymousService) r2
            if (r2 == 0) goto L73
            X.0Y8T r0 = r3.LJII
            if (r0 == 0) goto L64
            java.lang.String r1 = r0.getConversationId()
            if (r1 != 0) goto L65
        L64:
            r1 = r5
        L65:
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUser r0 = r3.LIZ
            java.lang.String r0 = r0.getUid()
            if (r0 == 0) goto L6e
            r5 = r0
        L6e:
            java.lang.String r0 = "search_cell"
            r2.LIZIZ(r4, r0, r1, r5)
        L73:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L76:
            X.0iNZ r3 = X.C1240230iNZ.LIZIZ
            java.lang.Object r0 = r10.l0
            X.0iNO r0 = (X.C1240120iNO) r0
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUser r2 = r0.LIZ
            X.0iOB r1 = X.EnumC1240610iOB.MESSAGE
            X.0iOC r0 = r0.LIZIZ
            r3.LIZ(r2, r1, r0)
            X.0iOA r3 = X.C1240600iOA.LIZIZ
            X.0iOD r2 = X.EnumC1240630iOD.ENTER_PROFILE
            java.lang.Object r0 = r10.l0
            X.0iNO r0 = (X.C1240120iNO) r0
            java.util.Map<java.lang.String, java.lang.String> r1 = r0.LJIILIIL
            X.0I0B r0 = X.C0I0B.LJFF
            X.05sz r0 = r0.LIZIZ()
            r3.LIZIZ(r2, r1, r0)
            java.lang.Object r0 = r10.l0
            X.0iNO r0 = (X.C1240120iNO) r0
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUser r0 = r0.LIZ
            java.lang.String r3 = r0.getUid()
            if (r3 == 0) goto L73
            X.10Ec r2 = X.C19212010Ec.LIZJ
            long r0 = java.lang.System.currentTimeMillis()
            r2.LJLJLLL(r0, r3)
            goto L73
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1266280j3a.invoke$10(X.0j3a, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$11(C1266280j3a c1266280j3a, Object obj, Object obj2, Object obj3, Object obj4) {
        AbstractC1240270iNd abstractC1240270iNd = (AbstractC1240270iNd) obj3;
        InboxSearchGenericAbility inboxSearchGenericAbility = (InboxSearchGenericAbility) obj4;
        C1240230iNZ c1240230iNZ = C1240230iNZ.LIZIZ;
        C1240150iNR c1240150iNR = (C1240150iNR) c1266280j3a.l0;
        c1240230iNZ.LIZ(c1240150iNR.LIZ, EnumC1240610iOB.MESSAGE, c1240150iNR.LIZLLL);
        if (abstractC1240270iNd != null) {
            abstractC1240270iNd.LIZ(null, C1240600iOA.LIZIZ.LIZJ(EnumC1240630iOD.ENTER_PROFILE, ((C1240150iNR) c1266280j3a.l0).LJIIJJI));
        }
        if (inboxSearchGenericAbility != null) {
            inboxSearchGenericAbility.z30(C0PGF.USER, ((C1240150iNR) c1266280j3a.l0).LIZ.getUid());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$12(C1266280j3a c1266280j3a, Object obj, Object obj2, Object obj3, Object obj4) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C1240180iNU((C1240120iNO) c1266280j3a.l0, (View) obj, null), 3);
        return Unit.LIZ;
    }

    public static final Object invoke$13(C1266280j3a c1266280j3a, Object obj, Object obj2, Object obj3, Object obj4) {
        EnumC1240630iOD enumC1240630iOD;
        View view = (View) obj;
        IMSearchDetailVM iMSearchDetailVM = (IMSearchDetailVM) obj2;
        AbstractC1240270iNd abstractC1240270iNd = (AbstractC1240270iNd) obj3;
        InboxSearchGenericAbility inboxSearchGenericAbility = (InboxSearchGenericAbility) obj4;
        List<C1240300iNg> list = ((C1240150iNR) c1266280j3a.l0).LJII.LIZ;
        boolean z = true;
        if (list.size() <= 1) {
            z = false;
        }
        if (z) {
            String nickName = ((C1240150iNR) c1266280j3a.l0).LIZ.getNickName();
            C1240150iNR c1240150iNR = (C1240150iNR) c1266280j3a.l0;
            iMSearchDetailVM.vQ2(nickName, c1240150iNR.LIZLLL, c1240150iNR.LJIIIIZZ, c1240150iNR.LIZ, list);
            C1240230iNZ.LIZIZ.LIZIZ(view.getContext());
            enumC1240630iOD = EnumC1240630iOD.ENTER_AGGREGATE_MESSAGE;
        } else {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C1240190iNV((C1240150iNR) c1266280j3a.l0, view, null), 3);
            enumC1240630iOD = EnumC1240630iOD.ENTER_CHAT;
        }
        if (abstractC1240270iNd != null) {
            abstractC1240270iNd.LIZ(null, C1240600iOA.LIZIZ.LIZJ(enumC1240630iOD, ((C1240150iNR) c1266280j3a.l0).LJIIJJI));
        }
        if (inboxSearchGenericAbility != null) {
            inboxSearchGenericAbility.z30(C0PGF.NORMAL, null);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$14(C1266280j3a c1266280j3a, Object obj, Object obj2, Object obj3, Object obj4) {
        AbstractC1240270iNd abstractC1240270iNd = (AbstractC1240270iNd) obj3;
        InboxSearchGenericAbility inboxSearchGenericAbility = (InboxSearchGenericAbility) obj4;
        C1240230iNZ c1240230iNZ = C1240230iNZ.LIZIZ;
        C1240160iNS c1240160iNS = (C1240160iNS) c1266280j3a.l0;
        c1240230iNZ.LIZLLL((View) obj, c1240160iNS.LIZ, null, null, "", EnumC1240610iOB.MESSAGE, c1240160iNS.LIZIZ, false);
        if (abstractC1240270iNd != null) {
            abstractC1240270iNd.LIZ(null, C1240600iOA.LIZIZ.LIZJ(EnumC1240630iOD.ENTER_CHAT, ((C1240160iNS) c1266280j3a.l0).LJIIIZ));
        }
        if (inboxSearchGenericAbility != null) {
            inboxSearchGenericAbility.z30(C0PGF.GROUP, ((C1240160iNS) c1266280j3a.l0).LIZ.getConversationId());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$15(C1266280j3a c1266280j3a, Object obj, Object obj2, Object obj3, Object obj4) {
        AbstractC1240270iNd abstractC1240270iNd = (AbstractC1240270iNd) obj3;
        InboxSearchGenericAbility inboxSearchGenericAbility = (InboxSearchGenericAbility) obj4;
        C1240230iNZ c1240230iNZ = C1240230iNZ.LIZIZ;
        C1240220iNY c1240220iNY = (C1240220iNY) c1266280j3a.l0;
        c1240230iNZ.LIZ(c1240220iNY.LIZ, EnumC1240610iOB.USER_CELL, c1240220iNY.LIZJ);
        if (abstractC1240270iNd != null) {
            abstractC1240270iNd.LIZ(null, C1240600iOA.LIZIZ.LIZJ(EnumC1240630iOD.ENTER_PROFILE, ((C1240220iNY) c1266280j3a.l0).LJII));
        }
        if (inboxSearchGenericAbility != null) {
            C0PGF c0pgf = C0PGF.USER;
            String uid = ((C1240220iNY) c1266280j3a.l0).LIZ.getUid();
            if (uid == null) {
                uid = "";
            }
            inboxSearchGenericAbility.z30(c0pgf, uid);
        }
        ((C1240220iNY) c1266280j3a.l0).LJIILIIL("click_avatar", inboxSearchGenericAbility);
        return Unit.LIZ;
    }

    public static final Object invoke$16(C1266280j3a c1266280j3a, Object obj, Object obj2, Object obj3, Object obj4) {
        EnumC1240630iOD enumC1240630iOD;
        String name;
        View view = (View) obj;
        IMSearchDetailVM iMSearchDetailVM = (IMSearchDetailVM) obj2;
        AbstractC1240270iNd abstractC1240270iNd = (AbstractC1240270iNd) obj3;
        InboxSearchGenericAbility inboxSearchGenericAbility = (InboxSearchGenericAbility) obj4;
        boolean z = true;
        if (((C1240160iNS) c1266280j3a.l0).LJFF.LIZ.size() <= 1) {
            z = false;
        }
        if (z) {
            C0Y8Y coreInfo = ((C1240160iNS) c1266280j3a.l0).LIZ.getCoreInfo();
            if (coreInfo != null) {
                name = coreInfo.getName();
            } else {
                name = null;
            }
            C1240160iNS c1240160iNS = (C1240160iNS) c1266280j3a.l0;
            iMSearchDetailVM.vQ2(name, c1240160iNS.LIZIZ, c1240160iNS.LJI, null, c1240160iNS.LJFF.LIZ);
            C1240230iNZ.LIZIZ.LIZIZ(view.getContext());
            enumC1240630iOD = EnumC1240630iOD.ENTER_AGGREGATE_MESSAGE;
        } else {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C1240200iNW((C1240160iNS) c1266280j3a.l0, view, null), 3);
            enumC1240630iOD = EnumC1240630iOD.ENTER_CHAT;
        }
        if (abstractC1240270iNd != null) {
            abstractC1240270iNd.LIZ(null, C1240600iOA.LIZIZ.LIZJ(enumC1240630iOD, ((C1240160iNS) c1266280j3a.l0).LJIIIZ));
        }
        if (inboxSearchGenericAbility != null) {
            inboxSearchGenericAbility.z30(C0PGF.NORMAL, null);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$17(C1266280j3a c1266280j3a, Object obj, Object obj2, Object obj3, Object obj4) {
        AbstractC1240270iNd abstractC1240270iNd = (AbstractC1240270iNd) obj3;
        InboxSearchGenericAbility inboxSearchGenericAbility = (InboxSearchGenericAbility) obj4;
        C1240230iNZ c1240230iNZ = C1240230iNZ.LIZIZ;
        C1240220iNY c1240220iNY = (C1240220iNY) c1266280j3a.l0;
        c1240230iNZ.LIZJ((View) obj, c1240220iNY.LIZ, c1240220iNY.LIZIZ, null, null, "", EnumC1240610iOB.USER_CELL, c1240220iNY.LIZJ, false);
        if (abstractC1240270iNd != null) {
            abstractC1240270iNd.LIZ(null, C1240600iOA.LIZIZ.LIZJ(EnumC1240630iOD.ENTER_CHAT, ((C1240220iNY) c1266280j3a.l0).LJII));
        }
        if (inboxSearchGenericAbility != null) {
            inboxSearchGenericAbility.z30(C0PGF.USER, ((C1240220iNY) c1266280j3a.l0).LIZ.getUid());
        }
        ((C1240220iNY) c1266280j3a.l0).LJIILIIL("click_cell", inboxSearchGenericAbility);
        return Unit.LIZ;
    }

    public static final Object invoke$18(C1266280j3a c1266280j3a, Object obj, Object obj2, Object obj3, Object obj4) {
        AbstractC1623806Xk c1623606Xi;
        C627660Ojc c627660Ojc = (C627660Ojc) obj2;
        boolean zBooleanValue = ((Boolean) obj4).booleanValue();
        AbstractC1623806Xk<C626160OhC> abstractC1623806Xk = c627660Ojc.LL;
        AbstractC1623806Xk<C626160OhC> abstractC1623806Xk2 = c627660Ojc.LLILLJJLI;
        if (zBooleanValue) {
            if (obj3 == null) {
                obj3 = C13BV.INSTANCE;
            }
            c1623606Xi = new C1623606Xi(obj3);
        } else {
            c1623606Xi = C491101vh.LIZ;
        }
        C1075800e6M c1075800e6M = new C1075800e6M(abstractC1623806Xk, abstractC1623806Xk2, c1623606Xi);
        ((C1262980iyG) c1266280j3a.l0).LIZ().xQ2().K70(c1075800e6M);
        C1264320j0Q c1264320j0Q = C1264320j0Q.LIZ;
        String str = ((C1262980iyG) c1266280j3a.l0).LLILLJJLI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("new state: ");
        sbLIZ.append(c1075800e6M);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1264320j0Q.getClass();
        C1264320j0Q.LIZLLL(str, strLIZIZ);
        ((C1262980iyG) c1266280j3a.l0).LIZ().xQ2().v52(new AwS598S0100000_19(c1075800e6M, 814));
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$2(C1266280j3a c1266280j3a, Object obj, Object obj2, Object obj3, Object obj4) {
        ((AvatarCell) c1266280j3a.l0).I5((EnumC1221420htE) ((C291001Au) obj2).LIZ, (C1221030hsb) ((C291001Au) obj3).LIZ, (Set) ((C291001Au) obj4).LIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$3(C1266280j3a c1266280j3a, Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        String str = (String) obj2;
        int iIntValue = ((Number) obj3).intValue();
        boolean zBooleanValue = ((Boolean) obj4).booleanValue();
        if (iIntValue != 0) {
            i = 1;
        } else {
            i = 0;
        }
        EditProfileBioCellAssem editProfileBioCellAssem = (EditProfileBioCellAssem) c1266280j3a.l0;
        editProfileBioCellAssem.getClass();
        if (C1EDI.LJ()) {
            if (!TextUtils.isEmpty(str)) {
                TuxTextView tuxTextView = editProfileBioCellAssem.LLJILJIL;
                if (tuxTextView != null) {
                    tuxTextView.setText(str);
                    tuxTextView.setTuxFont(102);
                    tuxTextView.setTextColorRes(R.attr.a1h);
                }
            } else {
                TuxTextView tuxTextView2 = editProfileBioCellAssem.LLJILJIL;
                if (tuxTextView2 != null) {
                    tuxTextView2.setText(C1216270hkv.LIZJ(2131838878));
                    tuxTextView2.setTuxFont(41);
                    tuxTextView2.setTextColorRes(R.attr.a1p);
                }
            }
            C1232140iAW.LIZ.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LIZJ(i, "complete_status");
            C20684815ws.LJIILLIIL("show_profile_bio", c2344009Gk.LIZ);
        } else {
            if (!TextUtils.isEmpty(str)) {
                C127K c127k = editProfileBioCellAssem.LLJI;
                if (c127k != null) {
                    C1215970hkR.LJ(c127k, str, false);
                }
            } else {
                C127K c127k2 = editProfileBioCellAssem.LLJI;
                if (c127k2 != null) {
                    C1215970hkR.LJ(c127k2, C1216270hkv.LIZJ(2131833250), false);
                }
            }
            C127K c127k3 = editProfileBioCellAssem.LLJI;
            if (c127k3 != null) {
                C1215970hkR.LJ(c127k3, null, zBooleanValue);
            }
            C1232140iAW.LIZ.getClass();
            C2344009Gk c2344009Gk2 = new C2344009Gk();
            c2344009Gk2.LIZJ(i, "complete_status");
            C20684815ws.LJIILLIIL("show_profile_bio", c2344009Gk2.LIZ);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$4(X.C1266280j3a r5, java.lang.Object r6, java.lang.Object r7, java.lang.Object r8, java.lang.Object r9) {
        /*
            X.0SxQ r6 = (X.AbstractC738140SxQ) r6
            java.lang.String r7 = (java.lang.String) r7
            com.ss.android.ugc.aweme.profile.model.BlockStruct r8 = (com.ss.android.ugc.aweme.profile.model.BlockStruct) r8
            java.lang.Number r9 = (java.lang.Number) r9
            int r4 = r9.intValue()
            X.01GW r0 = X.C0B9I.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r3 = 0
            if (r0 == 0) goto L63
            java.lang.Object r0 = r5.l0
            com.ss.android.ugc.profile.business.ur.platform.follow.HeaderCTAFollowComponent r0 = (com.ss.android.ugc.profile.business.ur.platform.follow.HeaderCTAFollowComponent) r0
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.iq()
            if (r0 == 0) goto L61
            java.lang.String r0 = r0.getUid()
        L29:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r7, r0)
            if (r0 != 0) goto L63
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "blockUserID != curUser?.uid, blockUserID: "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = ", curUser?.uid: "
            r1.append(r0)
            java.lang.Object r0 = r5.l0
            com.ss.android.ugc.profile.business.ur.platform.follow.HeaderCTAFollowComponent r0 = (com.ss.android.ugc.profile.business.ur.platform.follow.HeaderCTAFollowComponent) r0
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.iq()
            if (r0 == 0) goto L4e
            java.lang.String r3 = r0.getUid()
        L4e:
            r1.append(r3)
            java.lang.String r3 = X.C2188811AlT.LIZIZ(r1)
            X.0ijX r2 = X.EnumC1253850ijX.ERROR
            java.lang.String r1 = "block_error"
            java.lang.String r0 = "BaseUIComponent"
            X.C1248210iaR.LIZJ(r0, r3, r2, r1)
        L5e:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L61:
            r0 = r3
            goto L29
        L63:
            if (r8 == 0) goto L5e
            java.lang.Object r2 = r5.l0
            com.ss.android.ugc.profile.business.ur.platform.follow.HeaderCTAFollowComponent r2 = (com.ss.android.ugc.profile.business.ur.platform.follow.HeaderCTAFollowComponent) r2
            com.ss.android.ugc.profile.platform.business.header.business.cta.business.data.SocialBlockData r1 = new com.ss.android.ugc.profile.platform.business.header.business.cta.business.data.SocialBlockData
            r1.<init>()
            r0 = 4
            if (r4 != r0) goto L8f
            r0 = 1
        L72:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.setBlockingByType(r0)
            r2.LLLIIII = r1
            X.0Q7z r1 = X.C1558520qew.LJIIL(r6)
            java.lang.Class<com.ss.android.ugc.profile.business.profile.ui.v2.UserProfileAbility> r0 = com.ss.android.ugc.profile.business.profile.ui.v2.UserProfileAbility.class
            X.01wD r1 = X.C1558520qew.LIZ(r1, r0, r3)
            com.ss.android.ugc.profile.business.profile.ui.v2.UserProfileAbility r1 = (com.ss.android.ugc.profile.business.profile.ui.v2.UserProfileAbility) r1
            if (r1 == 0) goto L5e
            int r0 = r8.blockStatus
            r1.lO2(r0, r4)
            goto L5e
        L8f:
            r0 = 0
            goto L72
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1266280j3a.invoke$4(X.0j3a, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$5(C1266280j3a c1266280j3a, Object obj, Object obj2, Object obj3, Object obj4) {
        GroupInvitation groupInvitation;
        C1230090i7D groupMetaData;
        ((Number) obj2).intValue();
        GroupInvitationConfirmBtnAssem groupInvitationConfirmBtnAssem = (GroupInvitationConfirmBtnAssem) c1266280j3a.l0;
        C197039127h c197039127h = (C197039127h) groupInvitationConfirmBtnAssem.LLJJIJI.getValue();
        Context context = c197039127h.getContext();
        GroupInvitationVM groupInvitationVMIp = groupInvitationConfirmBtnAssem.ip();
        AbstractC1230540i7w abstractC1230540i7w = (AbstractC1230540i7w) groupInvitationConfirmBtnAssem.LLJJI.getValue();
        if (abstractC1230540i7w != null && (groupMetaData = abstractC1230540i7w.getGroupMetaData()) != null) {
            groupInvitation = groupMetaData.LIZLLL;
        } else {
            groupInvitation = null;
        }
        C1885507a1 c1885507a1LIZ = C1230360i7e.LIZ(context, groupInvitationVMIp, groupInvitation);
        c197039127h.setEnabled(c1885507a1LIZ.LIZIZ);
        c197039127h.setText(c1885507a1LIZ.LIZ);
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$6(X.C1266280j3a r10, java.lang.Object r11, java.lang.Object r12, java.lang.Object r13, java.lang.Object r14) {
        /*
            java.lang.Class<com.ss.android.ugc.aweme.im.service.service.IIMAnonymousService> r2 = com.ss.android.ugc.aweme.im.service.service.IIMAnonymousService.class
            r3 = 0
            r9 = 0
            r6 = 14
            r7 = 0
            r4 = r3
            r5 = r3
            java.lang.Object r3 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r2, r3, r4, r5, r6, r7)
            com.ss.android.ugc.aweme.im.service.service.IIMAnonymousService r3 = (com.ss.android.ugc.aweme.im.service.service.IIMAnonymousService) r3
            java.lang.String r5 = ""
            if (r3 == 0) goto L76
            java.lang.Object r0 = r10.l0
            X.0iNN r0 = (X.C1240110iNN) r0
            X.0Y8T r0 = r0.LJII
            if (r0 == 0) goto L21
            java.lang.String r2 = r0.getConversationId()
            if (r2 != 0) goto L22
        L21:
            r2 = r5
        L22:
            java.lang.Object r0 = r10.l0
            X.0iNN r0 = (X.C1240110iNN) r0
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUser r0 = r0.LIZ
            java.lang.String r0 = r0.getUid()
            if (r0 != 0) goto L2f
            r0 = r5
        L2f:
            r1 = 1
            boolean r0 = r3.LIZLLL(r2, r0, r1)
            if (r0 != r1) goto L76
            X.0mCc r0 = X.C1906580ziK.LIZIZ()
            if (r0 == 0) goto L73
            android.app.Activity r0 = r0.LIZIZ()
            if (r0 == 0) goto L73
            android.app.Activity r4 = X.C1388190mED.LIZ(r0)
            if (r4 == 0) goto L73
            java.lang.Object r3 = r10.l0
            X.0iNN r3 = (X.C1240110iNN) r3
            java.lang.Class<com.ss.android.ugc.aweme.im.service.service.IIMAnonymousService> r8 = com.ss.android.ugc.aweme.im.service.service.IIMAnonymousService.class
            r10 = r9
            r11 = r9
            r12 = r6
            r13 = r7
            java.lang.Object r2 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r8, r9, r10, r11, r12, r13)
            com.ss.android.ugc.aweme.im.service.service.IIMAnonymousService r2 = (com.ss.android.ugc.aweme.im.service.service.IIMAnonymousService) r2
            if (r2 == 0) goto L73
            X.0Y8T r0 = r3.LJII
            if (r0 == 0) goto L64
            java.lang.String r1 = r0.getConversationId()
            if (r1 != 0) goto L65
        L64:
            r1 = r5
        L65:
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUser r0 = r3.LIZ
            java.lang.String r0 = r0.getUid()
            if (r0 == 0) goto L6e
            r5 = r0
        L6e:
            java.lang.String r0 = "search_cell"
            r2.LIZIZ(r4, r0, r1, r5)
        L73:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L76:
            X.0iNZ r3 = X.C1240230iNZ.LIZIZ
            java.lang.Object r0 = r10.l0
            X.0iNN r0 = (X.C1240110iNN) r0
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUser r2 = r0.LIZ
            X.0iOB r1 = X.EnumC1240610iOB.MESSAGE
            X.0iOC r0 = r0.LIZIZ
            r3.LIZ(r2, r1, r0)
            goto L73
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1266280j3a.invoke$6(X.0j3a, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$7(C1266280j3a c1266280j3a, Object obj, Object obj2, Object obj3, Object obj4) {
        AbstractC1240270iNd abstractC1240270iNd = (AbstractC1240270iNd) obj3;
        InboxSearchGenericAbility inboxSearchGenericAbility = (InboxSearchGenericAbility) obj4;
        C1240230iNZ c1240230iNZ = C1240230iNZ.LIZIZ;
        C1240210iNX c1240210iNX = (C1240210iNX) c1266280j3a.l0;
        c1240230iNZ.LIZLLL((View) obj, c1240210iNX.LIZ, null, null, "", EnumC1240610iOB.USER_CELL, c1240210iNX.LIZIZ, false);
        if (abstractC1240270iNd != null) {
            abstractC1240270iNd.LIZ(null, C1240600iOA.LIZIZ.LIZJ(EnumC1240630iOD.ENTER_CHAT, ((C1240210iNX) c1266280j3a.l0).LJII));
        }
        if (inboxSearchGenericAbility != null) {
            inboxSearchGenericAbility.z30(C0PGF.GROUP, ((C1240210iNX) c1266280j3a.l0).LIZ.getConversationId());
        }
        ((C1240210iNX) c1266280j3a.l0).LJIILIIL("click_avatar", inboxSearchGenericAbility);
        return Unit.LIZ;
    }

    public static final Object invoke$8(C1266280j3a c1266280j3a, Object obj, Object obj2, Object obj3, Object obj4) {
        AbstractC1240270iNd abstractC1240270iNd = (AbstractC1240270iNd) obj3;
        InboxSearchGenericAbility inboxSearchGenericAbility = (InboxSearchGenericAbility) obj4;
        C1240230iNZ c1240230iNZ = C1240230iNZ.LIZIZ;
        C1240210iNX c1240210iNX = (C1240210iNX) c1266280j3a.l0;
        c1240230iNZ.LIZLLL((View) obj, c1240210iNX.LIZ, null, null, "", EnumC1240610iOB.USER_CELL, c1240210iNX.LIZIZ, false);
        if (abstractC1240270iNd != null) {
            abstractC1240270iNd.LIZ(null, C1240600iOA.LIZIZ.LIZJ(EnumC1240630iOD.ENTER_CHAT, ((C1240210iNX) c1266280j3a.l0).LJII));
        }
        if (inboxSearchGenericAbility != null) {
            inboxSearchGenericAbility.z30(C0PGF.GROUP, ((C1240210iNX) c1266280j3a.l0).LIZ.getConversationId());
        }
        ((C1240210iNX) c1266280j3a.l0).LJIILIIL("", inboxSearchGenericAbility);
        return Unit.LIZ;
    }

    public static final Object invoke$9(C1266280j3a c1266280j3a, Object obj, Object obj2, Object obj3, Object obj4) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C1240170iNT((C1240110iNN) c1266280j3a.l0, (View) obj, null), 3);
        return Unit.LIZ;
    }
}
