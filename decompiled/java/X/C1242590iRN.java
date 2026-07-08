package X;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.hox.Hox;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.follow.logic.RelationViewVM;
import com.ss.android.ugc.aweme.relation.link.feed.SharedInviteDialogVM;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AwS263S0300000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0iRN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1242590iRN implements InterfaceC1234410iEB {
    public C19EG LIZ;
    public Bundle LIZIZ;
    public C1397510mTF LIZJ;
    public SharedInviteDialogVM LIZLLL;
    public RelationViewVM LJ;
    public C1233440iCc LJFF;
    public C1233510iCj LJI;
    public C1242620iRQ LJII;
    public InterfaceC1234720iEg LJIIIIZZ;
    public final C01GW LJIIIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(67));

    public final C1242620iRQ LJI() {
        C1242620iRQ c1242620iRQ = this.LJII;
        if (c1242620iRQ != null) {
            return c1242620iRQ;
        }
        SharedInviteDialogVM sharedInviteDialogVM = this.LIZLLL;
        if (sharedInviteDialogVM == null) {
            sharedInviteDialogVM = null;
        }
        return sharedInviteDialogVM.LLILLJJLI;
    }

    public final void LJIILIIL() {
        C1397510mTF c1397510mTF = this.LIZJ;
        if (c1397510mTF != null) {
            if (c1397510mTF.LJIIIZ()) {
                return;
            }
            C1397510mTF c1397510mTF2 = this.LIZJ;
            if (c1397510mTF2 == null) {
                c1397510mTF2 = null;
            }
            C1391850mK7.LIZIZ(c1397510mTF2, "426");
            C1397510mTF c1397510mTF3 = this.LIZJ;
            (c1397510mTF3 != null ? c1397510mTF3 : null).LIZLLL();
        }
    }

    @Override // X.InterfaceC1234410iEB
    public final void LIZJ(AbstractC1234430iED abstractC1234430iED) {
        C1397510mTF c1397510mTF = this.LIZJ;
        if (c1397510mTF != null) {
            C1397510mTF c1397510mTF2 = null;
            if (c1397510mTF.LJIIIZ()) {
                C1397510mTF c1397510mTF3 = this.LIZJ;
                if (c1397510mTF3 != null) {
                    c1397510mTF2 = c1397510mTF3;
                }
                c1397510mTF2.LIZIZ(abstractC1234430iED);
            }
        }
    }

    @Override // X.InterfaceC1234410iEB
    public final void LIZLLL(InterfaceC1234720iEg interfaceC1234720iEg) {
        this.LJIIIIZZ = interfaceC1234720iEg;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0111  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(com.ss.android.ugc.aweme.profile.model.User r10) {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1242590iRN.LJFF(com.ss.android.ugc.aweme.profile.model.User):void");
    }

    public final void LJIIJ(Aweme aweme) {
        C1242620iRQ c1242620iRQLJI = LJI();
        if (c1242620iRQLJI != null) {
            c1242620iRQLJI.LIZ(EnumC1260930iux.SHOW);
            c1242620iRQLJI.LIZJ("show_popup");
            c1242620iRQLJI.LIZIZ("show");
        }
        InterfaceC1234720iEg interfaceC1234720iEg = this.LJIIIIZZ;
        if (interfaceC1234720iEg != null) {
            interfaceC1234720iEg.LIZ(aweme);
        }
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("@LinkRelation_VideoDialog", "shared dialog show!");
    }

    @Override // X.InterfaceC1234410iEB
    public final void LIZ(C19EG c19eg, Bundle bundle) {
        String stringExtra;
        String stringExtra2;
        int i = C2187451AjH.LIZ;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(c19eg);
        if (c19egLIZIZ == null) {
            return;
        }
        this.LIZ = c19egLIZIZ;
        this.LIZIZ = bundle;
        this.LIZLLL = new SharedInviteDialogVM(0);
        C19EG c19eg2 = this.LIZ;
        C19EG c19eg3 = null;
        if (c19eg2 == null) {
            c19eg2 = null;
        }
        this.LJ = (RelationViewVM) ViewModelProviders.of(c19eg2).get(RelationViewVM.class);
        C19EG c19eg4 = this.LIZ;
        if (c19eg4 == null) {
            c19eg4 = null;
        }
        C1233440iCc c1233440iCcLIZLLL = C1234220iDs.LIZLLL(c19eg4.getIntent());
        this.LJFF = c1233440iCcLIZLLL;
        C19EG c19eg5 = this.LIZ;
        if (c19eg5 == null) {
            c19eg5 = null;
        }
        try {
            stringExtra = c19eg5.getIntent().getStringExtra("gids");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            stringExtra = null;
        }
        C19EG c19eg6 = this.LIZ;
        if (c19eg6 == null) {
            c19eg6 = null;
        }
        try {
            stringExtra2 = c19eg6.getIntent().getStringExtra("aweme_id");
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            stringExtra2 = null;
        }
        SharedInviteDialogVM sharedInviteDialogVM = this.LIZLLL;
        if (sharedInviteDialogVM == null) {
            sharedInviteDialogVM = null;
        }
        if (stringExtra == null) {
            stringExtra = stringExtra2;
        }
        Bundle bundle2 = this.LIZIZ;
        if (bundle2 == null) {
            bundle2 = null;
        }
        sharedInviteDialogVM.LLILZIL = bundle2;
        C23250099c.LIZLLL(sharedInviteDialogVM.LL, C0PEM.LIZJ, null, new C1219140hpY(sharedInviteDialogVM, c1233440iCcLIZLLL, stringExtra, null), 2);
        Bundle bundle3 = this.LIZIZ;
        if (bundle3 == null) {
            bundle3 = null;
        }
        final String string = bundle3.getString("enter_from", "");
        SharedInviteDialogVM sharedInviteDialogVM2 = this.LIZLLL;
        if (sharedInviteDialogVM2 == null) {
            sharedInviteDialogVM2 = null;
        }
        MutableLiveData mutableLiveData = sharedInviteDialogVM2.LLILZ;
        C19EG c19eg7 = this.LIZ;
        if (c19eg7 != null) {
            c19eg3 = c19eg7;
        }
        mutableLiveData.observe(c19eg3, new Observer() { // from class: X.0iGN
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                String aid;
                String uid;
                String str;
                User sharer;
                Pair pair = (Pair) obj;
                EnumC1233410iCZ enumC1233410iCZ = (EnumC1233410iCZ) pair.getFirst();
                Aweme aweme = (Aweme) pair.getSecond();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("observe show info status:");
                sbLIZ.append(enumC1233410iCZ.name());
                sbLIZ.append(" aid:");
                SharedInviteDialogVM sharedInviteDialogVM3 = null;
                C19EG c19eg8 = null;
                if (aweme != null) {
                    aid = aweme.getAid();
                } else {
                    aid = null;
                }
                sbLIZ.append(aid);
                sbLIZ.append(", uid: ");
                if (aweme != null && (sharer = AwemeBizExtKt.getSharer(aweme)) != null) {
                    uid = sharer.getUid();
                } else {
                    uid = null;
                }
                sbLIZ.append(uid);
                C1720106oR.LJI("@LinkRelation_VideoDialog", C2188811AlT.LIZIZ(sbLIZ));
                switch (C1233420iCa.LIZ[enumC1233410iCZ.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        InterfaceC1234720iEg interfaceC1234720iEg = this.LL.LJIIIIZZ;
                        if (interfaceC1234720iEg != null) {
                            interfaceC1234720iEg.LIZJ(enumC1233410iCZ, aweme);
                        }
                        SharedInviteDialogVM sharedInviteDialogVM4 = this.LL.LIZLLL;
                        if (sharedInviteDialogVM4 != null) {
                            sharedInviteDialogVM3 = sharedInviteDialogVM4;
                        }
                        sharedInviteDialogVM3.onCleared();
                        return;
                    case 6:
                        if (aweme != null) {
                            C1242590iRN c1242590iRN = this.LL;
                            String str2 = string;
                            C1233440iCc c1233440iCc = c1242590iRN.LJFF;
                            if (c1233440iCc != null) {
                                str = c1233440iCc.LJIIIZ;
                            } else {
                                str = null;
                            }
                            c1242590iRN.LJIIL(aweme, str2, C123100dR.LIZ(str));
                            C19EG c19eg9 = c1242590iRN.LIZ;
                            if (c19eg9 != null) {
                                c19eg8 = c19eg9;
                            }
                            PopupManager.LJIJI(new C686810Qwp(c19eg8, new AwS563S0100000_19(c1242590iRN, 1)), true);
                            return;
                        }
                        return;
                    default:
                        throw new C1954807lC();
                }
            }
        });
    }

    public final void LJIIIZ(Aweme aweme, Object obj) {
        AbstractC1234430iED c1234440iEE;
        C1242620iRQ c1242620iRQLJI;
        Integer num;
        boolean zLJI = MethodIDManager.LJI(71747);
        SharedInviteDialogVM sharedInviteDialogVM = null;
        if (!(obj instanceof AbstractC1234430iED) || (c1234440iEE = (AbstractC1234430iED) obj) == null) {
            c1234440iEE = C1234460iEG.LIZ;
        }
        if (Intrinsics.LJFF(obj, "button_close")) {
            C1397510mTF c1397510mTF = this.LIZJ;
            if (c1397510mTF == null) {
                c1397510mTF = null;
            }
            c1397510mTF.LIZIZ(new C1234440iEE(aweme));
            C1242620iRQ c1242620iRQLJI2 = LJI();
            if (c1242620iRQLJI2 != null) {
                c1242620iRQLJI2.LIZ(EnumC1260930iux.CLOSE);
                c1242620iRQLJI2.LIZIZ("close");
            }
            c1234440iEE = new C1234440iEE(aweme);
        }
        if (Intrinsics.LJFF(obj, "video_play_after_follow")) {
            C1397510mTF c1397510mTF2 = this.LIZJ;
            if (c1397510mTF2 == null) {
                c1397510mTF2 = null;
            }
            c1397510mTF2.LIZIZ(new C1234440iEE(aweme));
            c1234440iEE = new C1234440iEE(aweme);
        }
        C1233510iCj c1233510iCj = this.LJI;
        if (c1233510iCj != null && (num = c1233510iCj.LJIIJJI) != null && num.intValue() == 1 && Intrinsics.LJFF(obj, C1234460iEG.LIZ)) {
            C1397510mTF c1397510mTF3 = this.LIZJ;
            if (c1397510mTF3 == null) {
                c1397510mTF3 = null;
            }
            c1397510mTF3.LIZIZ(new C1234440iEE(aweme));
            c1234440iEE = new C1234440iEE(aweme);
        }
        if (Intrinsics.LJFF(c1234440iEE, C1234460iEG.LIZ) && (c1242620iRQLJI = LJI()) != null) {
            c1242620iRQLJI.LIZ(EnumC1260930iux.CLOSE);
            c1242620iRQLJI.LIZIZ("close");
        }
        InterfaceC1234720iEg interfaceC1234720iEg = this.LJIIIIZZ;
        if (interfaceC1234720iEg != null) {
            interfaceC1234720iEg.LIZIZ(c1234440iEE);
        }
        SharedInviteDialogVM sharedInviteDialogVM2 = this.LIZLLL;
        if (sharedInviteDialogVM2 != null) {
            sharedInviteDialogVM = sharedInviteDialogVM2;
        }
        sharedInviteDialogVM.onCleared();
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("shared dialog dismiss! reason:");
        sbLIZ.append(c1234440iEE);
        C1720106oR.LJI("@LinkRelation_VideoDialog", C2188811AlT.LIZIZ(sbLIZ));
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public final void LJ(String str, String str2, Function0<Unit> function0) {
        C19EG c19eg = this.LIZ;
        Bundle bundle = null;
        if (c19eg == null) {
            c19eg = null;
        }
        Bundle bundle2 = this.LIZIZ;
        if (bundle2 != null) {
            bundle = bundle2;
        }
        String string = bundle.getString("enter_from");
        if (string == null) {
            string = "";
        }
        C627150Oin c627150Oin = new C627150Oin();
        C786410Ut5.LJJJI("group_id", str, c627150Oin.LIZ);
        C786410Ut5.LJJJI("author_id", str2, c627150Oin.LIZ);
        C786410Ut5.LJJJI("log_pb", C735370Ssx.LJIIJJI(str), c627150Oin.LIZ);
        C0XPD.LIZIZ(c19eg, string, "click_follow", c627150Oin.LIZ, new C1266200j3S(function0, 0));
    }

    public final void LJII(Aweme aweme, String str, boolean z) {
        C1242620iRQ c1242620iRQLJI = LJI();
        if (c1242620iRQLJI != null) {
            c1242620iRQLJI.LIZIZ(str);
        }
        User sharer = AwemeBizExtKt.getSharer(aweme);
        if (sharer == null) {
            return;
        }
        if (!z) {
            LIZJ(new C1234440iEE(aweme));
        } else if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            LJ(aweme.getAid(), AwemeExtKt.getAuthorUid(aweme), new AwS263S0300000_19(aweme, sharer, this, 0));
        } else {
            LJFF(sharer);
            LIZJ(new C1234450iEF(aweme));
        }
    }

    public final void LJIIIIZZ(Context context, User user, String str) {
        C1242620iRQ c1242620iRQLJI = LJI();
        if (c1242620iRQLJI != null) {
            c1242620iRQLJI.LIZ(EnumC1260930iux.ENTER_PROFILE);
        }
        LJIILJJIL(this, user, context, str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0261  */
    /* JADX WARN: Type inference failed for: r0v30, types: [T, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIL(com.ss.android.ugc.aweme.feed.model.Aweme r26, final java.lang.String r27, boolean r28) {
        /*
            Method dump skipped, instruction units count: 1666
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1242590iRN.LJIIL(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, boolean):void");
    }

    public static void LJIILJJIL(C1242590iRN c1242590iRN, User user, Context context, String str) {
        boolean zIsRelatedRec;
        C1261860iwS c1261860iwS;
        C1261860iwS c1261860iwS2;
        AbstractC1261010iv5 from = null;
        c1242590iRN.getClass();
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "aweme://user/profile/");
        smartRouteBuildRoute.withParam("uid", user.getUid());
        smartRouteBuildRoute.withParam("sec_user_id", user.getSecUid());
        smartRouteBuildRoute.withParam("enter_from", str);
        smartRouteBuildRoute.withParam("enter_method", "share_link");
        smartRouteBuildRoute.withParam("enter_from_request_id", user.getRequestId());
        smartRouteBuildRoute.withParam("extra_from_pre_page", "share_user_info_popup");
        smartRouteBuildRoute.withParam("extra_previous_page", "share_user_info_popup");
        smartRouteBuildRoute.withParam("extra_previous_page_position", "card_head");
        smartRouteBuildRoute.withParam("need_track_compare_recommend_reason", 1);
        String recommendReason = user.getRecommendReason();
        if (recommendReason == null) {
            MatchedFriendStruct matchedFriendStruct = user.getMatchedFriendStruct();
            if (matchedFriendStruct != null) {
                recommendReason = matchedFriendStruct.recommendReason;
            } else {
                recommendReason = null;
            }
        }
        smartRouteBuildRoute.withParam("previous_recommend_reason", recommendReason);
        smartRouteBuildRoute.withParam("recommend_from_type", "card");
        EnumC1260920iuw enumC1260920iuw = EnumC1260920iuw.CARD;
        String recType = user.getRecType();
        if (recType == null) {
            MatchedFriendStruct matchedFriendStruct2 = user.getMatchedFriendStruct();
            if (matchedFriendStruct2 != null) {
                recType = matchedFriendStruct2.recType;
            } else {
                recType = null;
            }
        }
        C1252610ihX.Companion.getClass();
        EnumC736410Sud enumC736410SudLIZ = C736420Sue.LIZ(user);
        String uid = user.getUid();
        String requestId = user.getRequestId();
        String friendTypeStr = user.getFriendTypeStr();
        if (friendTypeStr == null) {
            MatchedFriendStruct matchedFriendStruct3 = user.getMatchedFriendStruct();
            if (matchedFriendStruct3 != null) {
                friendTypeStr = matchedFriendStruct3.relationType;
            } else {
                friendTypeStr = null;
            }
        }
        String socialInfo = user.getSocialInfo();
        if (socialInfo == null) {
            MatchedFriendStruct matchedFriendStruct4 = user.getMatchedFriendStruct();
            if (matchedFriendStruct4 != null) {
                socialInfo = matchedFriendStruct4.socialInfo;
            } else {
                socialInfo = null;
            }
        }
        MatchedFriendStruct matchedFriendStruct5 = user.getMatchedFriendStruct();
        boolean z = user instanceof C1261860iwS;
        if (z && (c1261860iwS2 = (C1261860iwS) user) != null) {
            from = c1261860iwS2.getFrom();
        }
        if (z && (c1261860iwS = (C1261860iwS) user) != null) {
            zIsRelatedRec = c1261860iwS.isRelatedRec();
        } else {
            zIsRelatedRec = false;
        }
        smartRouteBuildRoute.withParam("recommend_enter_profile_params", new C1252610ihX(str, "share_user_info_popup", enumC1260920iuw, recType, enumC736410SudLIZ, uid, null, null, requestId, "", friendTypeStr, socialInfo, matchedFriendStruct5, null, null, from, zIsRelatedRec, "share_link", "sharer_popup", null, null, false, null, false, null));
        smartRouteBuildRoute.withParam("source_page", "");
        smartRouteBuildRoute.open();
    }

    @Override // X.InterfaceC1234410iEB
    public final void LIZIZ(C19EG c19eg, C1233510iCj c1233510iCj, Aweme aweme, Bundle bundle) {
        String str;
        this.LIZ = c19eg;
        this.LJI = c1233510iCj;
        this.LIZIZ = bundle;
        String str2 = "";
        String string = bundle.getString("enter_from", "");
        User sharer = AwemeBizExtKt.getSharer(aweme);
        if (sharer == null) {
            return;
        }
        C1233510iCj c1233510iCj2 = this.LJI;
        if (c1233510iCj2 != null) {
            str = c1233510iCj2.LIZ;
        } else {
            str = null;
        }
        this.LJII = new C1242620iRQ(string, sharer, aweme, str);
        String string2 = bundle.getString("enter_from", "");
        String string3 = bundle.getString("click_time");
        if (string3 != null) {
            str2 = string3;
        }
        Long lLJIILIIL = C2095008Iq.LJIILIIL(str2);
        C1242620iRQ c1242620iRQLJI = LJI();
        if (c1242620iRQLJI != null) {
            c1242620iRQLJI.LJFF = lLJIILIIL;
        }
        this.LIZLLL = new SharedInviteDialogVM(0);
        this.LJ = (RelationViewVM) ViewModelProviders.of(c19eg).get(RelationViewVM.class);
        LJIIL(aweme, string2, C123100dR.LIZ(c1233510iCj.LJIIIIZZ));
        C686810Qwp c686810Qwp = new C686810Qwp(c19eg, new AwS563S0100000_19(this, 0));
        if (!Hox.LLJILJIL.LIZ(c19eg).LQ2("For You")) {
            PopupManager.LJIIJ(C686810Qwp.class, c686810Qwp.scene);
        } else {
            PopupManager.LJIJI(c686810Qwp, true);
        }
    }

    public final void LJIIJJI(final User user, final String str, TuxTextView tuxTextView, String str2, CharSequence charSequence, Function0<Unit> function0) {
        int iLJJJ = a0.LJJJ(charSequence, "%s", 0, false, 6);
        if (iLJJJ == -1) {
            function0.invoke();
            return;
        }
        int length = str2.length();
        if (length < iLJJJ) {
            function0.invoke();
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C786410Ut5.j4(charSequence.toString(), Arrays.copyOf(new Object[]{str2}, 1)));
        C786410Ut5.q2(spannableStringBuilder, new ClickableSpan() { // from class: X.0iRO
            @Override // android.text.style.ClickableSpan
            public final void onClick(View view) {
                C1242620iRQ c1242620iRQLJI = this.LL.LJI();
                if (c1242620iRQLJI != null) {
                    c1242620iRQLJI.LIZIZ("click_nickname");
                }
                C1242590iRN c1242590iRN = this.LL;
                User user2 = user;
                C19EG c19eg = c1242590iRN.LIZ;
                if (c19eg == null) {
                    c19eg = null;
                }
                c1242590iRN.LJIIIIZZ(c19eg, user2, str);
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public final void updateDrawState(TextPaint textPaint) {
                C444890HcV c444890HcV = new C444890HcV();
                c444890HcV.LIZ(42);
                textPaint.setTypeface(c444890HcV.getTypeface());
            }
        }, iLJJJ, length, 33);
        tuxTextView.setMovementMethod(LinkMovementMethod.getInstance());
        tuxTextView.setHighlightColor(0);
        tuxTextView.setText(spannableStringBuilder);
    }
}
