package X;

import Y.ACListenerS58S0400000_26;
import Y.ACListenerS71S0300000_4;
import Y.AObjectS395S0100000_21;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.comment.commentlist.managementv2.CommentManagementAssemVM;
import com.ss.android.ugc.aweme.comment.commentlist.managementv2.CommentManagementBottomBarAssem;
import com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.BottomMusicShootCommentAssem;
import com.ss.android.ugc.aweme.comment.gift.model.GiftViewModel;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IAudioEditAbility;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.ICommentFakeInputAbility;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.ICommentLinkProductAssemAbility;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.ICommentMentionAssemAbility;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardInputPanelAssemAbility;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.KeyboardIconGroupAssem;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.KeyboardVMV2;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.PortraitInputKeyboard;
import com.ss.android.ugc.aweme.comment.model.AudioCommentModel;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentCommonModel;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.comment.model.CommentInputContent;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.commentv2.commentlist.powercell.BaseCommentCell;
import com.ss.android.ugc.aweme.commentv2.commentlist.powercell.CommentSecondaryItemCell;
import com.ss.android.ugc.aweme.commentv2.commentlist.powercell.DescCell;
import com.ss.android.ugc.aweme.commentv2.commentlist.powercell.FoldFooterCell;
import com.ss.android.ugc.aweme.commentv2.commentlist.powercell.PollCell;
import com.ss.android.ugc.aweme.commentv2.commentlist.ui.ICommentListAssemAbility;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentPublishViewModel;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.ICommentListVMAbility;
import com.ss.android.ugc.aweme.commentv2.title.TitlePanelCommentActionAssem;
import com.ss.android.ugc.aweme.commentv2.title.TitlePanelNavAssem;
import com.ss.android.ugc.aweme.experiment.CommentWithStickerExp;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService;
import com.ss.android.ugc.aweme.lemon.comment.powercell.Lemon8BaseCommentCell;
import com.ss.android.ugc.aweme.lemon.comment.powercell.Lemon8CommentSecondaryItemCell;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.prop.fragment.StickerPropDetailFragment;
import com.ss.android.ugc.aweme.prop.presenter.MobileEffectViewModel;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ability.IAVTransformService;
import com.ss.android.ugc.aweme.share.gif.VideoShare2GifEditContext;
import com.ss.android.ugc.aweme.share.gif.ui.VideoShare2GifEditActivity;
import com.ss.android.ugc.aweme.share.gif.ui.VideoShare2GifPreviewActivity;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS135S1100000_21;
import kotlin.jvm.internal.AwS2S0602000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.AwS600S0100000_21;
import kotlin.jvm.internal.AwS635S0100000_21;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0maF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1401850maF extends AbstractViewOnClickListenerC372950Ejl {
    public final int $t;
    public Object l0;

    @Override // X.AbstractViewOnClickListenerC372950Ejl
    public final void LIZ(View view) throws Exception {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            case 2:
                LIZ$2(this, view);
                break;
            case 3:
                LIZ$3(this, view);
                break;
            case 4:
                LIZ$4(this, view);
                break;
            case 5:
                LIZ$5(this, view);
                break;
            case 6:
                LIZ$6(this, view);
                break;
            case 7:
                LIZ$7(this, view);
                break;
            case 8:
                LIZ$8(this, view);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                LIZ$9(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                LIZ$10(this, view);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                LIZ$11(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                LIZ$12(this, view);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                LIZ$13(this, view);
                break;
            case 14:
                LIZ$14(this, view);
                break;
            case 15:
                LIZ$15(this, view);
                break;
            case 16:
                LIZ$16(this, view);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                LIZ$17(this, view);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                LIZ$18(this, view);
                break;
            case 19:
                LIZ$19(this, view);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                LIZ$20(this, view);
                break;
            case 21:
                LIZ$21(this, view);
                break;
            case 22:
                LIZ$22(this, view);
                break;
            case 23:
                LIZ$23(this, view);
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                LIZ$24(this, view);
                break;
            case 25:
                LIZ$25(this, view);
                break;
            case 26:
                LIZ$26(this, view);
                break;
            case 27:
                LIZ$27(this, view);
                break;
            case 28:
                LIZ$28(this, view);
                break;
            case 29:
                LIZ$29(this, view);
                break;
            case 30:
                LIZ$30(this, view);
                break;
            case 31:
                LIZ$31(this, view);
                break;
            case 32:
                LIZ$32(this, view);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                LIZ$33(this, view);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                LIZ$34(this, view);
                break;
            case 35:
                LIZ$35(this, view);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                LIZ$36(this, view);
                break;
            case 37:
                LIZ$37(this, view);
                break;
            case 38:
                LIZ$38(this, view);
                break;
            case 39:
                LIZ$39(this, view);
                break;
            case 40:
                LIZ$40(this, view);
                break;
            case 41:
                LIZ$41(this, view);
                break;
            case 42:
                LIZ$42(this, view);
                break;
            case 43:
                LIZ$43(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public C1401850maF(com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.KeyboardIconGroupAssem r4, int r5) {
        /*
            r3 = this;
            r3.$t = r5
            switch(r5) {
                case 2: goto Le;
                case 3: goto Le;
                case 4: goto Le;
                case 5: goto Le;
                case 6: goto Le;
                case 7: goto Le;
                case 43: goto Le;
                default: goto L5;
            }
        L5:
            r2 = r3
            r2.l0 = r4
            r0 = 200(0xc8, double:9.9E-322)
        La:
            r2.<init>(r0)
            return
        Le:
            r2 = r3
            r2.l0 = r4
            r0 = 150(0x96, double:7.4E-322)
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1401850maF.<init>(com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.KeyboardIconGroupAssem, int):void");
    }

    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v4 */
    public static final void LIZ$0(C1401850maF c1401850maF, View view) {
        Fragment fragmentLJI;
        String strEnterFrom;
        char c;
        int i;
        CommentContextSource commentContextSourceWQ2;
        boolean z;
        int i2;
        ?? r3;
        String quantityString;
        String quantityString2;
        String strEnterFrom2;
        int i3;
        int i4;
        String string;
        String quantityString3;
        String quantityString4;
        if (view != null) {
            CommentManagementBottomBarAssem commentManagementBottomBarAssem = (CommentManagementBottomBarAssem) c1401850maF.l0;
            if (commentManagementBottomBarAssem.getContext() != null && C724240Sb0.LJI(commentManagementBottomBarAssem) != null && (fragmentLJI = C724240Sb0.LJI(commentManagementBottomBarAssem)) != null && fragmentLJI.getActivity() != null) {
                CommentManagementAssemVM commentManagementAssemVMHp = commentManagementBottomBarAssem.hp();
                InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558520qew.LJIIL(commentManagementBottomBarAssem), "source_default_key", AnonymousClass0165.class, null);
                if (interfaceC1555100qZQLIZIZ != null) {
                    interfaceC1555100qZQLIZIZ.getSource();
                }
                C19EG c19egLJIILLIIL = C1345700l7g.LJIILLIIL(commentManagementBottomBarAssem);
                Map<String, Comment> map = commentManagementAssemVMHp.LL;
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                HashSet hashSet3 = new HashSet();
                HashMap map2 = new HashMap();
                C118300cf c118300cf = new C118300cf();
                HashMap map3 = (HashMap) map;
                int i5 = 0;
                for (Map.Entry entry : map3.entrySet()) {
                    Object key = entry.getKey();
                    Comment comment = (Comment) entry.getValue();
                    if (comment != null) {
                        if (comment.getCommentType() == 1) {
                            hashSet3.add(key);
                            c118300cf.element += (int) (comment.getReplyCommentTotal() + 1);
                        } else if (comment.getCommentType() == 2) {
                            map2.put(key, comment.getRootCommentId());
                        }
                        if (comment.getUser() != null) {
                            hashSet2.add(comment.getUser().getUid());
                        }
                        if (comment.getAliasAweme() != null) {
                            i5++;
                        }
                    }
                }
                if (hashSet3.size() > 0) {
                    hashSet.addAll(hashSet3);
                }
                for (Map.Entry entry2 : map2.entrySet()) {
                    if (!hashSet3.contains(entry2.getValue())) {
                        hashSet.add(entry2.getKey());
                        c118300cf.element++;
                    }
                }
                int size = map3.size();
                int size2 = hashSet2.size();
                CommentContextSource commentContextSourceWQ22 = commentManagementAssemVMHp.wQ2();
                String str = "";
                if (commentContextSourceWQ22 == null || (strEnterFrom = CommentContextSourceKt.enterFrom(commentContextSourceWQ22)) == null) {
                    strEnterFrom = "";
                }
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LIZJ(size, "c_number");
                c2344009Gk.LIZJ(size2, "u_number");
                c2344009Gk.LIZJ(i5, "video_reply_number");
                c2344009Gk.LJIIIIZZ("enter_from", strEnterFrom);
                C1350920lG6.LJJJ(c2344009Gk, "comment_batch_management_delete_ck");
                if (C308890C8x.LIZ().length == 3) {
                    c = 0;
                    i = C308890C8x.LIZ()[0];
                } else {
                    c = 0;
                    i = 100;
                }
                if (size > i) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    Resources resources = c19egLJIILLIIL.getResources();
                    if (resources != null) {
                        Object[] objArr = new Object[1];
                        objArr[c] = Integer.valueOf(size);
                        quantityString3 = resources.getQuantityString(2131755163, size, objArr);
                    } else {
                        quantityString3 = null;
                    }
                    sbLIZ.append(quantityString3);
                    Resources resources2 = c19egLJIILLIIL.getResources();
                    if (resources2 != null) {
                        Object[] objArr2 = new Object[1];
                        objArr2[c] = Integer.valueOf(i);
                        quantityString4 = resources2.getQuantityString(2131755164, i, objArr2);
                    } else {
                        quantityString4 = null;
                    }
                    sbLIZ.append(quantityString4);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    C1389890mGx c1389890mGx = new C1389890mGx(c19egLJIILLIIL);
                    c1389890mGx.LJIIJ(strLIZIZ);
                    c1389890mGx.LJIIJJI();
                    return;
                }
                if (hashSet.size() > 0 && (commentContextSourceWQ2 = commentManagementAssemVMHp.wQ2()) != null && CommentContextSourceKt.aweme(commentContextSourceWQ2) != null) {
                    if (size == 1 && i5 == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C1397620mTQ c1397620mTQ = new C1397620mTQ(c19egLJIILLIIL);
                    if (z) {
                        i2 = 2131829213;
                    } else {
                        i2 = 2131829140;
                    }
                    c1397620mTQ.LJFF(i2, new AwS2S0602000_21(commentManagementAssemVMHp, (CommentManagementAssemVM) hashSet, (Set<String>) c118300cf, (C118300cf) c19egLJIILLIIL, (C19EG) size, (int) hashSet2, (Set<String>) i5, (int) map3, (Map<String, ? extends Comment>) 0));
                    c1397620mTQ.LJII(2131829139, new AwS600S0100000_21(commentManagementAssemVMHp, 432));
                    if (i5 > 0 && C1343700l4S.LIZ()) {
                        if (z) {
                            i3 = 2131829215;
                            i4 = 2131829214;
                        } else {
                            i3 = 2131829211;
                            i4 = 2131829210;
                        }
                        C1397580mTM c1397580mTM = new C1397580mTM(c19egLJIILLIIL);
                        c1397580mTM.LJFF(i3);
                        Resources resources3 = c19egLJIILLIIL.getResources();
                        if (resources3 != null) {
                            string = resources3.getString(i4);
                        } else {
                            string = null;
                        }
                        c1397580mTM.LIZIZ(string);
                        c1397580mTM.LJIIL = c1397620mTQ;
                        c1397580mTM.LJII = false;
                        new C1397510mTF(c1397580mTM).LIZLLL();
                    } else {
                        C1397580mTM c1397580mTM2 = new C1397580mTM(c19egLJIILLIIL);
                        Resources resources4 = c19egLJIILLIIL.getResources();
                        if (resources4 != null) {
                            r3 = 0;
                            quantityString = resources4.getQuantityString(2131755162, size, Integer.valueOf(size));
                        } else {
                            r3 = 0;
                            quantityString = null;
                        }
                        c1397580mTM2.LJI(quantityString);
                        Resources resources5 = c19egLJIILLIIL.getResources();
                        if (resources5 != null) {
                            Object[] objArr3 = new Object[1];
                            objArr3[r3] = Integer.valueOf(size);
                            quantityString2 = resources5.getQuantityString(2131755161, size, objArr3);
                        } else {
                            quantityString2 = null;
                        }
                        c1397580mTM2.LIZIZ(quantityString2);
                        c1397580mTM2.LJIIL = c1397620mTQ;
                        c1397580mTM2.LJII = r3;
                        new C1397510mTF(c1397580mTM2).LIZLLL();
                    }
                    CommentContextSource commentContextSourceWQ23 = commentManagementAssemVMHp.wQ2();
                    if (commentContextSourceWQ23 != null && (strEnterFrom2 = CommentContextSourceKt.enterFrom(commentContextSourceWQ23)) != null) {
                        str = strEnterFrom2;
                    }
                    C2344009Gk c2344009Gk2 = new C2344009Gk();
                    c2344009Gk2.LJIIIIZZ("enter_from", str);
                    C1350920lG6.LJJJ(c2344009Gk2, "comment_batch_management_delete_confirm_sw");
                }
            }
        }
    }

    public static final void LIZ$1(C1401850maF c1401850maF, View view) {
        Fragment fragmentLJI;
        DialogInterfaceC21560019Ze dialogInterfaceC21560019ZeLIZIZ;
        String enterFrom;
        AnonymousClass0165 anonymousClass0165;
        C1349800lEI c1349800lEI;
        Context contextLIZIZ;
        String[] strArr;
        Resources resources;
        if (view != null) {
            CommentManagementBottomBarAssem commentManagementBottomBarAssem = (CommentManagementBottomBarAssem) c1401850maF.l0;
            if (commentManagementBottomBarAssem.getContext() != null && C724240Sb0.LJI(commentManagementBottomBarAssem) != null && (fragmentLJI = C724240Sb0.LJI(commentManagementBottomBarAssem)) != null && fragmentLJI.getActivity() != null) {
                boolean z = C295780Bia.LIZIZ;
                if (z && view.getContext() == null) {
                    return;
                }
                Map<String, Comment> map = commentManagementBottomBarAssem.hp().LL;
                if (commentManagementBottomBarAssem.LLJJJ == null) {
                    if (z) {
                        contextLIZIZ = view.getContext();
                    } else {
                        Activity activityLIZ = C06MM.LIZ(commentManagementBottomBarAssem.getContext());
                        if (activityLIZ != null) {
                            contextLIZIZ = C1354730lMF.LIZIZ(activityLIZ);
                        } else {
                            contextLIZIZ = null;
                        }
                    }
                    C1381440m3K c1381440m3K = new C1381440m3K(contextLIZIZ);
                    commentManagementBottomBarAssem.LLJJJ = c1381440m3K;
                    Context context = commentManagementBottomBarAssem.getContext();
                    if (context != null && (resources = context.getResources()) != null) {
                        strArr = new String[]{resources.getString(2131829149), resources.getString(2131829135)};
                    } else {
                        strArr = null;
                    }
                    c1381440m3K.LIZ(strArr, new DialogInterfaceOnClickListenerC1401900maK(commentManagementBottomBarAssem, map, 3));
                }
                C1381440m3K c1381440m3K2 = commentManagementBottomBarAssem.LLJJJ;
                if (c1381440m3K2 != null) {
                    dialogInterfaceC21560019ZeLIZIZ = c1381440m3K2.LIZIZ();
                } else {
                    dialogInterfaceC21560019ZeLIZIZ = null;
                }
                commentManagementBottomBarAssem.LLJJJIL = dialogInterfaceC21560019ZeLIZIZ;
                Iterator it2 = ((HashMap) map).entrySet().iterator();
                int i = 0;
                while (it2.hasNext()) {
                    if (((Comment) ((Map.Entry) it2.next()).getValue()).getAliasAweme() != null) {
                        i++;
                    }
                }
                InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558520qew.LJIIL(commentManagementBottomBarAssem), "source_default_key", AnonymousClass0165.class, null);
                if (interfaceC1555100qZQLIZIZ == null || (anonymousClass0165 = (AnonymousClass0165) interfaceC1555100qZQLIZIZ.getSource()) == null || (c1349800lEI = anonymousClass0165.LL) == null || (enterFrom = c1349800lEI.getEnterFrom()) == null) {
                    enterFrom = "";
                }
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LIZJ(i, "video_reply_number");
                c2344009Gk.LJIIIIZZ("enter_from", enterFrom);
                C1350920lG6.LJJJ(c2344009Gk, "comment_batch_management_more_ck");
            }
        }
    }

    public static final void LIZ$10(C1401850maF c1401850maF, View view) {
        if (view != null) {
            KeyboardVMV2 keyboardVMV2Sp = ((PortraitInputKeyboard) c1401850maF.l0).sp();
            keyboardVMV2Sp.getClass();
            keyboardVMV2Sp.withState(new AwS600S0100000_21(keyboardVMV2Sp, 412));
        }
    }

    public static final void LIZ$11(C1401850maF c1401850maF, View view) {
        if (view != null) {
            ((PortraitInputKeyboard) c1401850maF.l0).Qp();
        }
    }

    public static final void LIZ$12(C1401850maF c1401850maF, View view) {
        boolean z;
        Aweme aweme;
        String strEnterFrom;
        if (view != null) {
            PortraitInputKeyboard portraitInputKeyboard = (PortraitInputKeyboard) c1401850maF.l0;
            List<AudioCommentModel> listXQ2 = portraitInputKeyboard.sp().xQ2();
            if (listXQ2 != null && !listXQ2.isEmpty()) {
                z = false;
            } else {
                z = true;
            }
            String strEnterMethod = null;
            if (!z) {
                portraitInputKeyboard.OY0(null);
            }
            C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
            CommentContextSource commentContextSourceKp = portraitInputKeyboard.kp();
            if (commentContextSourceKp != null) {
                aweme = CommentContextSourceKt.aweme(commentContextSourceKp);
            } else {
                aweme = null;
            }
            CommentContextSource commentContextSourceKp2 = portraitInputKeyboard.kp();
            if (commentContextSourceKp2 != null) {
                strEnterFrom = CommentContextSourceKt.enterFrom(commentContextSourceKp2);
            } else {
                strEnterFrom = null;
            }
            CommentContextSource commentContextSourceKp3 = portraitInputKeyboard.kp();
            if (commentContextSourceKp3 != null) {
                strEnterMethod = CommentContextSourceKt.enterMethod(commentContextSourceKp3);
            }
            c1350920lG6.getClass();
            C1350920lG6.LJJJIL(aweme, strEnterFrom, strEnterMethod, "delete", "audio");
        }
    }

    public static final void LIZ$13(C1401850maF c1401850maF, View view) {
        if (view != null) {
            ((PortraitInputKeyboard) c1401850maF.l0).Ii1();
        }
    }

    public static final void LIZ$14(C1401850maF c1401850maF, View view) {
        if (view != null) {
            CommentPublishViewModel commentPublishViewModelTp = ((PortraitInputKeyboard) c1401850maF.l0).tp();
            KeyboardVMV2 keyboardVMV2Sp = ((PortraitInputKeyboard) c1401850maF.l0).sp();
            EnumC1346360l8k enumC1346360l8k = EnumC1346360l8k.COMMENT_PANEL;
            C1341800l1O c1341800l1O = KeyboardVMV2.LLJJIJIL;
            commentPublishViewModelTp.Yb0(keyboardVMV2Sp.DQ2(enumC1346360l8k, null), null, null);
        }
    }

    public static final void LIZ$15(C1401850maF c1401850maF, View view) {
        if (view != null) {
            BaseCommentCell.S7((BaseCommentCell) c1401850maF.l0, null, "click_gift_comment", EnumC1341680l1C.GIFT, 8);
        }
    }

    public static final void LIZ$16(C1401850maF c1401850maF, View view) {
        if (view != null) {
            ((BaseCommentCell) c1401850maF.l0).i7();
        }
    }

    public static final void LIZ$17(C1401850maF c1401850maF, View view) {
        String replyToUserId;
        if (view != null) {
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(C2214201BlK.LJFF(), "aweme://user/profile/");
            Comment commentQ6 = ((CommentSecondaryItemCell) c1401850maF.l0).q6();
            String replyToUserId2 = null;
            if (commentQ6 != null) {
                replyToUserId = commentQ6.getReplyToUserId();
            } else {
                replyToUserId = null;
            }
            smartRouteBuildRoute.withParam("uid", replyToUserId);
            smartRouteBuildRoute.open();
            CommentSecondaryItemCell commentSecondaryItemCell = (CommentSecondaryItemCell) c1401850maF.l0;
            Comment commentQ62 = commentSecondaryItemCell.q6();
            if (commentQ62 != null) {
                replyToUserId2 = commentQ62.getReplyToUserId();
            }
            commentSecondaryItemCell.r7(replyToUserId2, "click_name");
        }
    }

    public static final void LIZ$18(C1401850maF c1401850maF, View view) {
        User user;
        C0SWK c0swk;
        if (view != null) {
            DescCell descCell = (DescCell) c1401850maF.l0;
            C0SWS item = descCell.getItem();
            if (item != null && (c0swk = item.LL) != null) {
                user = c0swk.getUser();
            } else {
                user = null;
            }
            descCell.I5(user, "click_head");
        }
    }

    public static final void LIZ$19(C1401850maF c1401850maF, View view) {
        User user;
        C0SWK c0swk;
        if (view != null) {
            DescCell descCell = (DescCell) c1401850maF.l0;
            C0SWS item = descCell.getItem();
            if (item != null && (c0swk = item.LL) != null) {
                user = c0swk.getUser();
            } else {
                user = null;
            }
            descCell.I5(user, "click_head");
        }
    }

    public static final void LIZ$2(C1401850maF c1401850maF, View view) {
        Aweme aweme;
        String str;
        Editable editable;
        String strEnterFrom;
        Aweme aweme2;
        String sessionId;
        String strFromPage;
        Boolean boolValueOf;
        CommentCommonModel commonModel;
        CommentInputContent commentInputContent;
        String strEventType;
        String aid;
        String authorUid;
        Aweme aweme3;
        Aweme aweme4;
        CommentCommonModel commonModel2;
        CommentCommonModel commonModel3;
        if (view != null) {
            C19EG c19egLJIILLIIL = C1345700l7g.LJIILLIIL((KeyboardIconGroupAssem) c1401850maF.l0);
            CommentContextSource commentContextSourceBp = ((KeyboardIconGroupAssem) c1401850maF.l0).bp();
            if (commentContextSourceBp != null && (commonModel3 = commentContextSourceBp.getCommonModel()) != null) {
                aweme = commonModel3.aweme;
            } else {
                aweme = null;
            }
            CommentContextSource commentContextSourceBp2 = ((KeyboardIconGroupAssem) c1401850maF.l0).bp();
            if (commentContextSourceBp2 != null && (commonModel2 = commentContextSourceBp2.getCommonModel()) != null) {
                str = commonModel2.enterFrom;
            } else {
                str = null;
            }
            if (!C0SYU.LIZIZ(c19egLJIILLIIL, aweme, str, "click_comment_emotion", ((KeyboardIconGroupAssem) c1401850maF.l0).bp())) {
                if (Intrinsics.LJFF(((KeyboardIconGroupAssem) c1401850maF.l0).dp().wQ2(), C1347090l9v.LIZ)) {
                    C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
                    CommentContextSource commentContextSourceBp3 = ((KeyboardIconGroupAssem) c1401850maF.l0).bp();
                    if (commentContextSourceBp3 != null) {
                        strEventType = CommentContextSourceKt.eventType(commentContextSourceBp3);
                    } else {
                        strEventType = null;
                    }
                    CommentContextSource commentContextSourceBp4 = ((KeyboardIconGroupAssem) c1401850maF.l0).bp();
                    if (commentContextSourceBp4 != null && (aweme4 = CommentContextSourceKt.aweme(commentContextSourceBp4)) != null) {
                        aid = aweme4.getAid();
                    } else {
                        aid = null;
                    }
                    CommentContextSource commentContextSourceBp5 = ((KeyboardIconGroupAssem) c1401850maF.l0).bp();
                    if (commentContextSourceBp5 != null && (aweme3 = CommentContextSourceKt.aweme(commentContextSourceBp5)) != null) {
                        authorUid = AwemeExtKt.getAuthorUid(aweme3);
                    } else {
                        authorUid = null;
                    }
                    c1350920lG6.getClass();
                    C1350920lG6.LJLJJLL("icon", strEventType, aid, authorUid);
                } else {
                    C291001Au<CommentInputContent> c291001Au = ((KeyboardIconGroupAssem) c1401850maF.l0).dp().getState().LLJI;
                    if (c291001Au != null && (commentInputContent = c291001Au.LIZ) != null) {
                        editable = commentInputContent.text;
                    } else {
                        editable = null;
                    }
                    C1350920lG6 c1350920lG62 = C1350920lG6.LIZ;
                    CommentContextSource commentContextSourceBp6 = ((KeyboardIconGroupAssem) c1401850maF.l0).bp();
                    if (commentContextSourceBp6 != null) {
                        strEnterFrom = CommentContextSourceKt.enterFrom(commentContextSourceBp6);
                    } else {
                        strEnterFrom = null;
                    }
                    CommentContextSource commentContextSourceBp7 = ((KeyboardIconGroupAssem) c1401850maF.l0).bp();
                    if (commentContextSourceBp7 != null) {
                        aweme2 = CommentContextSourceKt.aweme(commentContextSourceBp7);
                    } else {
                        aweme2 = null;
                    }
                    boolean z = !((KeyboardIconGroupAssem) c1401850maF.l0).LLJL;
                    boolean z2 = false;
                    if ((editable != null && a0.LJLIIIL(editable.toString()).toString().length() > 0) || ((KeyboardIconGroupAssem) c1401850maF.l0).dp().CQ2() != null || ((KeyboardIconGroupAssem) c1401850maF.l0).dp().GQ2() != null || ((KeyboardIconGroupAssem) c1401850maF.l0).dp().xQ2() != null) {
                        z2 = true;
                    }
                    CommentContextSource commentContextSourceBp8 = ((KeyboardIconGroupAssem) c1401850maF.l0).bp();
                    if (commentContextSourceBp8 != null) {
                        sessionId = CommentContextSourceKt.getSessionId(commentContextSourceBp8);
                    } else {
                        sessionId = null;
                    }
                    CommentContextSource commentContextSourceBp9 = ((KeyboardIconGroupAssem) c1401850maF.l0).bp();
                    if (commentContextSourceBp9 != null) {
                        strFromPage = CommentContextSourceKt.fromPage(commentContextSourceBp9);
                    } else {
                        strFromPage = null;
                    }
                    CommentContextSource commentContextSourceBp10 = ((KeyboardIconGroupAssem) c1401850maF.l0).bp();
                    if (commentContextSourceBp10 != null && (commonModel = commentContextSourceBp10.getCommonModel()) != null) {
                        boolValueOf = Boolean.valueOf(commonModel.isInPhotoCommentDetailPage());
                    } else {
                        boolValueOf = null;
                    }
                    ((KeyboardIconGroupAssem) c1401850maF.l0).bp();
                    c1350920lG62.getClass();
                    C1350920lG6.LJIJJ(strEnterFrom, aweme2, z, z2, sessionId, strFromPage, boolValueOf);
                }
                if (CommentWithStickerExp.LIZJ() == EnumC454020HrE.PIN_EMOJI.getType()) {
                    CommentService.LIZ.getClass();
                    C523420Kfs.LIZ().LJIILIIL();
                }
                KeyboardVMV2 keyboardVMV2Dp = ((KeyboardIconGroupAssem) c1401850maF.l0).dp();
                keyboardVMV2Dp.getClass();
                keyboardVMV2Dp.withState(new AwS135S1100000_21(keyboardVMV2Dp, (String) null, 19));
            }
        }
    }

    public static final void LIZ$20(C1401850maF c1401850maF, View view) {
        String authorUid;
        String str;
        String authorUid2;
        C1220590hrt c1220590hrt;
        Fragment fragmentLIZ;
        Aweme aweme;
        Aweme aweme2;
        if (view != null) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            FoldFooterCell foldFooterCell = (FoldFooterCell) c1401850maF.l0;
            C1340330kz1 c1340330kz1 = foldFooterCell.LL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = FoldFooterCell.LLILZIL;
            CommentContextSource commentContextSourceLIZ = c1340330kz1.LIZ(foldFooterCell);
            if (commentContextSourceLIZ != null && (aweme2 = CommentContextSourceKt.aweme(commentContextSourceLIZ)) != null) {
                authorUid = AwemeExtKt.getAuthorUid(aweme2);
            } else {
                authorUid = null;
            }
            if (C10EU.LJIIZILJ(authorUid)) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            c2344009Gk.LJIIIIZZ("is_item_author", str);
            FoldFooterCell foldFooterCell2 = (FoldFooterCell) c1401850maF.l0;
            CommentContextSource commentContextSourceLIZ2 = foldFooterCell2.LL.LIZ(foldFooterCell2);
            if (commentContextSourceLIZ2 != null && (aweme = CommentContextSourceKt.aweme(commentContextSourceLIZ2)) != null) {
                authorUid2 = AwemeExtKt.getAuthorUid(aweme);
            } else {
                authorUid2 = null;
            }
            c2344009Gk.LJIIIIZZ("author_id", authorUid2);
            C20684815ws.LJIILLIIL("hidden_comment_entrance_click", c2344009Gk.LIZ);
            C1157440gE2 item = ((FoldFooterCell) c1401850maF.l0).getItem();
            if (item != null && (c1220590hrt = item.LLILLJJLI) != null) {
                InterfaceC665370Q7z interfaceC665370Q7zLJ = C1558360qeg.LJ(((FoldFooterCell) c1401850maF.l0).itemView, null);
                FoldFooterCell foldFooterCell3 = (FoldFooterCell) c1401850maF.l0;
                LifecycleOwner currentLifecycleOwner = foldFooterCell3.getCurrentLifecycleOwner();
                if (!(currentLifecycleOwner instanceof Fragment) || (fragmentLIZ = (Fragment) currentLifecycleOwner) == null) {
                    fragmentLIZ = C946803n0.LIZ(foldFooterCell3.itemView);
                }
                ICommentListVMAbility iCommentListVMAbilityLJ = C1345760l7m.LJ(fragmentLIZ, interfaceC665370Q7zLJ);
                if (iCommentListVMAbilityLJ != null) {
                    iCommentListVMAbilityLJ.KD1(c1220590hrt);
                }
            }
        }
    }

    public static final void LIZ$21(C1401850maF c1401850maF, View view) {
        User author;
        Aweme aweme;
        if (view != null) {
            CommentContextSource commentContextSourceA6 = ((PollCell) c1401850maF.l0).a6();
            if (commentContextSourceA6 != null && (aweme = CommentContextSourceKt.aweme(commentContextSourceA6)) != null) {
                author = aweme.getAuthor();
                if (author != null && author.isAdFake()) {
                    C1389890mGx c1389890mGx = new C1389890mGx(((PollCell) c1401850maF.l0).itemView);
                    c1389890mGx.LJIIIZ(2131824738);
                    c1389890mGx.LJIIJJI();
                    return;
                }
            } else {
                author = null;
            }
            ((PollCell) c1401850maF.l0).V5(author, "click_comment_head");
        }
    }

    public static final void LIZ$22(C1401850maF c1401850maF, View view) {
        if (view != null) {
            ((Function1) c1401850maF.l0).invoke(view);
        }
    }

    public static final void LIZ$23(C1401850maF c1401850maF, View view) {
        if (view != null) {
            ((Function1) c1401850maF.l0).invoke(view);
        }
    }

    public static final void LIZ$24(C1401850maF c1401850maF, View view) {
        if (view != null) {
            ((Function1) c1401850maF.l0).invoke(view);
        }
    }

    public static final void LIZ$25(C1401850maF c1401850maF, View view) {
        if (view != null) {
            ((TitlePanelCommentActionAssem) c1401850maF.l0).ip(view);
        }
    }

    public static final void LIZ$26(C1401850maF c1401850maF, View view) {
        String replyToUserId;
        String replyToUserId2;
        String replyToNickName;
        if (view != null) {
            Lemon8CommentSecondaryItemCell lemon8CommentSecondaryItemCell = (Lemon8CommentSecondaryItemCell) c1401850maF.l0;
            EnumC1356100lOS enumC1356100lOS = EnumC1356100lOS.CLICK_COMMENT_NAME;
            Comment commentL5 = lemon8CommentSecondaryItemCell.L5();
            String str = "";
            if (commentL5 == null || (replyToUserId = commentL5.getReplyToUserId()) == null) {
                replyToUserId = "";
            }
            Comment commentL52 = ((Lemon8CommentSecondaryItemCell) c1401850maF.l0).L5();
            if (commentL52 != null && (replyToNickName = commentL52.getReplyToNickName()) != null) {
                str = replyToNickName;
            }
            lemon8CommentSecondaryItemCell.R5(enumC1356100lOS, replyToUserId, str);
            C1356160lOY c1356160lOY = C1356160lOY.LIZ;
            Aweme aweme = ((Lemon8CommentSecondaryItemCell) c1401850maF.l0).getAweme();
            String eventType = ((Lemon8CommentSecondaryItemCell) c1401850maF.l0).getEventType();
            Comment commentL53 = ((Lemon8CommentSecondaryItemCell) c1401850maF.l0).L5();
            if (commentL53 != null) {
                replyToUserId2 = commentL53.getReplyToUserId();
            } else {
                replyToUserId2 = null;
            }
            c1356160lOY.getClass();
            C1356160lOY.LIZ(eventType, replyToUserId2, "click_name", aweme);
        }
    }

    public static final void LIZ$27(C1401850maF c1401850maF, View view) {
        StickerPropDetailFragment stickerPropDetailFragment = (StickerPropDetailFragment) c1401850maF.l0;
        NewFaceStickerBean newFaceStickerBean = stickerPropDetailFragment.LLLLLZ;
        C19EG activity = stickerPropDetailFragment.getActivity();
        if (activity != null) {
            FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
            MobileEffectViewModel mobileEffectViewModelCS = stickerPropDetailFragment.cS();
            AObjectS395S0100000_21 aObjectS395S0100000_21 = new AObjectS395S0100000_21(stickerPropDetailFragment, 6);
            ArrayList arrayList = new ArrayList();
            if (newFaceStickerBean.isEditable) {
                C1247510iZJ c1247510iZJ = new C1247510iZJ();
                c1247510iZJ.LIZIZ(2131833783);
                c1247510iZJ.LJ = new ACListenerS58S0400000_26(newFaceStickerBean, stickerPropDetailFragment, mobileEffectViewModelCS, aObjectS395S0100000_21, 6);
                arrayList.add(c1247510iZJ);
            }
            C1247510iZJ c1247510iZJ2 = new C1247510iZJ();
            c1247510iZJ2.LIZIZ(2131833761);
            c1247510iZJ2.LIZJ = 1;
            c1247510iZJ2.LJ = new ACListenerS71S0300000_4(activity, mobileEffectViewModelCS, newFaceStickerBean, 6);
            arrayList.add(c1247510iZJ2);
            C1390850mIV c1390850mIV = new C1390850mIV();
            c1390850mIV.LJI(arrayList);
            c1390850mIV.LIZLLL(R.string.f1_);
            c1390850mIV.LIZJ().show(supportFragmentManager, "StickerDetailEditActionSheet");
        }
    }

    public static final void LIZ$28(C1401850maF c1401850maF, View view) {
        VideoShare2GifEditContext videoShare2GifEditContext;
        final VideoShare2GifEditActivity videoShare2GifEditActivity = (VideoShare2GifEditActivity) c1401850maF.l0;
        if (videoShare2GifEditActivity.LL && (videoShare2GifEditContext = videoShare2GifEditActivity.LLILLJJLI) != null && !TextUtils.isEmpty(videoShare2GifEditContext.videoPath)) {
            videoShare2GifEditActivity.LL = false;
            VideoShare2GifEditContext videoShare2GifEditContext2 = videoShare2GifEditActivity.LLILLJJLI;
            C1377830lxV.LIZ.getClass();
            C01GW c01gw = C1377830lxV.LIZIZ;
            videoShare2GifEditContext2.gifImageDir = (String) c01gw.getValue();
            VideoShare2GifEditContext videoShare2GifEditContext3 = videoShare2GifEditActivity.LLILLJJLI;
            String str = videoShare2GifEditContext3.awemeId;
            String str2 = (String) c01gw.getValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(".gif");
            videoShare2GifEditContext3.gifImagePath = new C0VSJ(str2, C2188811AlT.LIZIZ(sbLIZ)).getPath();
            final DialogC1390150mHN dialogC1390150mHN = new DialogC1390150mHN(videoShare2GifEditActivity);
            final boolean zLIZJ = C299060Bns.LIZJ();
            if (zLIZJ) {
                dialogC1390150mHN.LJJLJLI(videoShare2GifEditActivity.getResources().getString(2131829534));
            } else {
                dialogC1390150mHN.LJJLJLI(videoShare2GifEditActivity.getResources().getString(2131835075));
            }
            C786410Ut5.K4(dialogC1390150mHN);
            dialogC1390150mHN.LJJZ(false);
            ((IExternalService) ServiceManager.get().getService(IExternalService.class)).abilityService().transformService().video2gif(videoShare2GifEditActivity.LLILLJJLI, new IAVTransformService.ITransformProgress() { // from class: X.0m6Y
                @Override // com.ss.android.ugc.aweme.services.external.ability.IAVTransformService.ITransformProgress
                public final void update(int i) {
                    DialogC1390150mHN dialogC1390150mHN2 = dialogC1390150mHN;
                    String str3 = VideoShare2GifEditActivity._pnsPageId;
                    dialogC1390150mHN2.LJJLL(i, false);
                }
            }, new IAVTransformService.ITransformCallback() { // from class: X.0m6Z
                @Override // com.ss.android.ugc.aweme.services.external.ability.IAVTransformService.ITransformCallback
                public final void finish(Object obj) throws Throwable {
                    VideoShare2GifEditActivity videoShare2GifEditActivity2 = videoShare2GifEditActivity;
                    DialogC1390150mHN dialogC1390150mHN2 = dialogC1390150mHN;
                    boolean z = zLIZJ;
                    videoShare2GifEditActivity2.LL = true;
                    dialogC1390150mHN2.dismiss();
                    C785410UrT.LIZ(dialogC1390150mHN2);
                    if (((Boolean) obj).booleanValue()) {
                        if (videoShare2GifEditActivity2.LLILLJJLI != null) {
                            C1377830lxV c1377830lxV = C1377830lxV.LIZ;
                            C0VSJ c0vsj = new C0VSJ(videoShare2GifEditActivity2.LLILLJJLI.gifImagePath);
                            c1377830lxV.getClass();
                            Uri uriLIZJ = C2400409as.LIZJ(videoShare2GifEditActivity2, c0vsj.getName(), "image/gif", Environment.DIRECTORY_PICTURES + "/tiktok/");
                            try {
                                C844470XAv.LIZ.getClass();
                                ParcelFileDescriptor parcelFileDescriptorLIZLLL = C09NT.LIZLLL(C844470XAv.LIZ().getContentResolver(), uriLIZJ, "w");
                                if (parcelFileDescriptorLIZLLL != null) {
                                    C09N1.LIZJ(c0vsj, new C0VSV(parcelFileDescriptorLIZLLL.getFileDescriptor()));
                                }
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                            }
                            VideoShare2GifEditContext videoShare2GifEditContext4 = videoShare2GifEditActivity2.LLILLJJLI;
                            Intent intent = new Intent(videoShare2GifEditActivity2, (Class<?>) VideoShare2GifPreviewActivity.class);
                            intent.putExtra("extra_data", videoShare2GifEditContext4);
                            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(videoShare2GifEditActivity2, intent, "Activity_startActivityForResult_2");
                            C1701330uNH.LIZ(intent, videoShare2GifEditActivity2);
                            C2204961BRm.LJIIZILJ(1, videoShare2GifEditActivity2, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgYo3LkjWY2tjrunB1MMto0A629VB3yR01zyQplCGm0OL09BJNPd2p1w==", null));
                            return;
                        }
                        return;
                    }
                    VideoShare2GifEditContext videoShare2GifEditContext5 = videoShare2GifEditActivity2.LLILLJJLI;
                    if (videoShare2GifEditContext5 != null) {
                        videoShare2GifEditContext5.gifImagePath = null;
                    }
                    String string = videoShare2GifEditActivity2.getString(2131835076);
                    if (z) {
                        C1389880mGw c1389880mGw = new C1389880mGw(videoShare2GifEditActivity2);
                        c1389880mGw.LJIIIZ(string);
                        c1389880mGw.LJIIJ();
                    } else {
                        C1233040iBy c1233040iBy = new C1233040iBy(videoShare2GifEditActivity2);
                        c1233040iBy.LIZJ(string);
                        c1233040iBy.LIZLLL();
                    }
                }
            });
        }
    }

    public static final void LIZ$29(C1401850maF c1401850maF, View view) {
        String eventType;
        if (view != null) {
            BottomMusicShootCommentAssem bottomMusicShootCommentAssem = (BottomMusicShootCommentAssem) c1401850maF.l0;
            C19EG c19egLIZ = C724240Sb0.LIZ(bottomMusicShootCommentAssem);
            Fragment fragmentLJI = C724240Sb0.LJI((BottomMusicShootCommentAssem) c1401850maF.l0);
            Aweme awemeHo = ((BottomMusicShootCommentAssem) c1401850maF.l0).Ho();
            C2189821An6 c2189821An6Xp0 = ((BottomMusicShootCommentAssem) c1401850maF.l0).xp0();
            if (c2189821An6Xp0 != null) {
                eventType = c2189821An6Xp0.getEventType();
            } else {
                eventType = null;
            }
            bottomMusicShootCommentAssem.getClass();
            if (c19egLIZ != null && ((IMSAdaptionService) ServiceManager.get().getService(IMSAdaptionService.class)).LIZLLL(c19egLIZ)) {
                C786410Ut5.re(Toast.makeText(c19egLIZ, c19egLIZ.getString(2131832497), 0));
            } else {
                C1ER1.LIZIZ.LLIILZL().LIZLLL(c19egLIZ, fragmentLJI, awemeHo, eventType);
            }
        }
    }

    public static final void LIZ$3(C1401850maF c1401850maF, View view) {
        if (view != null) {
            KeyboardIconGroupAssem keyboardIconGroupAssem = (KeyboardIconGroupAssem) c1401850maF.l0;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = KeyboardIconGroupAssem.LLLIILIL;
            GiftViewModel giftViewModel = (GiftViewModel) keyboardIconGroupAssem.LLLIIIIL.getValue();
            if (giftViewModel != null) {
                giftViewModel.LLJILJILJ = "comment_panel_outer";
            }
            KeyboardVMV2 keyboardVMV2Dp = keyboardIconGroupAssem.dp();
            keyboardVMV2Dp.getClass();
            keyboardVMV2Dp.withState(new AwS135S1100000_21(keyboardVMV2Dp, "comment_panel_outer", 20));
        }
    }

    public static final void LIZ$30(C1401850maF c1401850maF, View view) {
        if (view != null) {
            ((TitlePanelNavAssem) c1401850maF.l0).Lo(view);
        }
    }

    public static final void LIZ$31(C1401850maF c1401850maF, View view) {
        if (view != null) {
            ((TitlePanelNavAssem) c1401850maF.l0).Lo(view);
        }
    }

    public static final void LIZ$32(C1401850maF c1401850maF, View view) {
        if (view != null) {
            ((TitlePanelNavAssem) c1401850maF.l0).Lo(view);
        }
    }

    public static final void LIZ$33(C1401850maF c1401850maF, View view) {
        String uid;
        String nickname;
        String uid2;
        User user;
        User user2;
        User user3;
        if (view != null) {
            Lemon8BaseCommentCell lemon8BaseCommentCell = (Lemon8BaseCommentCell) c1401850maF.l0;
            EnumC1356100lOS enumC1356100lOS = EnumC1356100lOS.COMMENT_REPLY_MODAL;
            Comment commentL5 = lemon8BaseCommentCell.L5();
            String str = "";
            if (commentL5 == null || (user3 = commentL5.getUser()) == null || (uid = user3.getUid()) == null) {
                uid = "";
            }
            Comment commentL52 = ((Lemon8BaseCommentCell) c1401850maF.l0).L5();
            if (commentL52 == null || (user2 = commentL52.getUser()) == null || (nickname = user2.getNickname()) == null) {
                nickname = "";
            }
            lemon8BaseCommentCell.R5(enumC1356100lOS, uid, nickname);
            C1356160lOY c1356160lOY = C1356160lOY.LIZ;
            Aweme aweme = ((Lemon8BaseCommentCell) c1401850maF.l0).getAweme();
            String eventType = ((Lemon8BaseCommentCell) c1401850maF.l0).getEventType();
            if (eventType != null) {
                str = eventType;
            }
            Comment commentL53 = ((Lemon8BaseCommentCell) c1401850maF.l0).L5();
            if (commentL53 != null && (user = commentL53.getUser()) != null) {
                uid2 = user.getUid();
            } else {
                uid2 = null;
            }
            C1356160lOY.LIZJ(c1356160lOY, aweme, str, uid2);
        }
    }

    public static final void LIZ$34(C1401850maF c1401850maF, View view) {
        String uid;
        String uid2;
        User user;
        User user2;
        String nickname;
        User user3;
        if (view != null) {
            Lemon8BaseCommentCell lemon8BaseCommentCell = (Lemon8BaseCommentCell) c1401850maF.l0;
            EnumC1356100lOS enumC1356100lOS = EnumC1356100lOS.CLICK_COMMENT_NAME;
            Comment commentL5 = lemon8BaseCommentCell.L5();
            String str = "";
            if (commentL5 == null || (user3 = commentL5.getUser()) == null || (uid = user3.getUid()) == null) {
                uid = "";
            }
            Comment commentL52 = ((Lemon8BaseCommentCell) c1401850maF.l0).L5();
            if (commentL52 != null && (user2 = commentL52.getUser()) != null && (nickname = user2.getNickname()) != null) {
                str = nickname;
            }
            lemon8BaseCommentCell.R5(enumC1356100lOS, uid, str);
            C1356160lOY c1356160lOY = C1356160lOY.LIZ;
            Aweme aweme = ((Lemon8BaseCommentCell) c1401850maF.l0).getAweme();
            String eventType = ((Lemon8BaseCommentCell) c1401850maF.l0).getEventType();
            Comment commentL53 = ((Lemon8BaseCommentCell) c1401850maF.l0).L5();
            if (commentL53 != null && (user = commentL53.getUser()) != null) {
                uid2 = user.getUid();
            } else {
                uid2 = null;
            }
            c1356160lOY.getClass();
            C1356160lOY.LIZ(eventType, uid2, "click_name", aweme);
        }
    }

    public static final void LIZ$35(C1401850maF c1401850maF, View view) throws Exception {
        if (view != null) {
            ((BaseCommentCell) c1401850maF.l0).LLLLLLLLL.onClick(view);
        }
    }

    public static final void LIZ$36(C1401850maF c1401850maF, View view) {
        if (view != null) {
            C1350920lG6.LJJLIIIJJI(CommentContextSourceKt.enterFrom(((BaseCommentCell) c1401850maF.l0).i6()), CommentContextSourceKt.aweme(((BaseCommentCell) c1401850maF.l0).i6()), true, false, false, C1347720lAw.LJII(((BaseCommentCell) c1401850maF.l0).q6()));
            ICommentFakeInputAbility iCommentFakeInputAbilityLIZJ = C1345760l7m.LIZJ(((BaseCommentCell) c1401850maF.l0).getFragment(), C1558360qeg.LJ(((BaseCommentCell) c1401850maF.l0).itemView, null));
            if (iCommentFakeInputAbilityLIZJ != null) {
                iCommentFakeInputAbilityLIZJ.HY();
            }
        }
    }

    public static final void LIZ$37(C1401850maF c1401850maF, View view) {
        User user;
        User user2;
        if (view != null) {
            Comment commentQ6 = ((BaseCommentCell) c1401850maF.l0).q6();
            if (commentQ6 != null && (user2 = commentQ6.getUser()) != null && user2.isAdFake()) {
                Fragment fragment = ((BaseCommentCell) c1401850maF.l0).getFragment();
                if (fragment != null) {
                    C1389890mGx c1389890mGx = new C1389890mGx(fragment);
                    c1389890mGx.LJIIIZ(2131824738);
                    c1389890mGx.LJIIJJI();
                    return;
                }
                return;
            }
            BaseCommentCell baseCommentCell = (BaseCommentCell) c1401850maF.l0;
            Comment commentQ62 = baseCommentCell.q6();
            if (commentQ62 != null) {
                user = commentQ62.getUser();
            } else {
                user = null;
            }
            baseCommentCell.V5(user, "click_name");
        }
    }

    public static final void LIZ$38(C1401850maF c1401850maF, View view) {
        ICommentListAssemAbility iCommentListAssemAbilityLIZLLL;
        if (view != null) {
            InterfaceC665370Q7z interfaceC665370Q7zC6 = ((BaseCommentCell) c1401850maF.l0).c6();
            if (interfaceC665370Q7zC6 != null && (iCommentListAssemAbilityLIZLLL = C1345760l7m.LIZLLL(((BaseCommentCell) c1401850maF.l0).getFragment(), interfaceC665370Q7zC6)) != null) {
                iCommentListAssemAbilityLIZLLL.Zy0(view, 2131836474, null);
            }
            C1350920lG6.LJLLL("click");
        }
    }

    public static final void LIZ$39(C1401850maF c1401850maF, View view) {
        if (view != null) {
            ((BaseCommentCell) c1401850maF.l0).i7();
        }
    }

    public static final void LIZ$4(C1401850maF c1401850maF, View view) {
        ICommentLinkProductAssemAbility iCommentLinkProductAssemAbility;
        if (view != null) {
            KeyboardIconGroupAssem keyboardIconGroupAssem = (KeyboardIconGroupAssem) c1401850maF.l0;
            if (keyboardIconGroupAssem.getContext() != null && (iCommentLinkProductAssemAbility = (ICommentLinkProductAssemAbility) C1558520qew.LIZ(C1558520qew.LJIIL(keyboardIconGroupAssem), ICommentLinkProductAssemAbility.class, null)) != null) {
                iCommentLinkProductAssemAbility.to1(null, false);
            }
        }
    }

    public static final void LIZ$40(C1401850maF c1401850maF, View view) {
        ICommentListAssemAbility iCommentListAssemAbilityLIZLLL;
        if (view != null) {
            InterfaceC665370Q7z interfaceC665370Q7zC6 = ((BaseCommentCell) c1401850maF.l0).c6();
            if (interfaceC665370Q7zC6 != null && (iCommentListAssemAbilityLIZLLL = C1345760l7m.LIZLLL(((BaseCommentCell) c1401850maF.l0).getFragment(), interfaceC665370Q7zC6)) != null) {
                iCommentListAssemAbilityLIZLLL.Zy0(view, 2131836474, null);
            }
            C1350920lG6.LJLLL("click");
        }
    }

    public static final void LIZ$41(C1401850maF c1401850maF, View view) {
        if (view != null) {
            BaseCommentCell baseCommentCell = (BaseCommentCell) c1401850maF.l0;
            if (baseCommentCell.P5(true)) {
                BaseCommentCell.S7(baseCommentCell, baseCommentCell.q6(), "click_button", null, 4);
            }
        }
    }

    public static final void LIZ$42(C1401850maF c1401850maF, View view) {
        if (view != null) {
            KeyboardIconGroupAssem keyboardIconGroupAssem = (KeyboardIconGroupAssem) c1401850maF.l0;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = KeyboardIconGroupAssem.LLLIILIL;
            keyboardIconGroupAssem.kp("comment_panel_outer");
        }
    }

    public static final void LIZ$43(C1401850maF c1401850maF, View view) {
        Aweme aweme;
        String strEnterFrom;
        if (view != null) {
            C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
            CommentContextSource commentContextSourceBp = ((KeyboardIconGroupAssem) c1401850maF.l0).bp();
            String strEnterMethod = null;
            if (commentContextSourceBp != null) {
                aweme = CommentContextSourceKt.aweme(commentContextSourceBp);
            } else {
                aweme = null;
            }
            CommentContextSource commentContextSourceBp2 = ((KeyboardIconGroupAssem) c1401850maF.l0).bp();
            if (commentContextSourceBp2 != null) {
                strEnterFrom = CommentContextSourceKt.enterFrom(commentContextSourceBp2);
            } else {
                strEnterFrom = null;
            }
            CommentContextSource commentContextSourceBp3 = ((KeyboardIconGroupAssem) c1401850maF.l0).bp();
            if (commentContextSourceBp3 != null) {
                strEnterMethod = CommentContextSourceKt.enterMethod(commentContextSourceBp3);
            }
            String strSo = ((KeyboardIconGroupAssem) c1401850maF.l0).So();
            c1350920lG6.getClass();
            C1350920lG6.LJJJJ(aweme, "plus_icon", strEnterFrom, strEnterMethod, strSo, "success", null, "comment_panel_outer", CardStruct.IStatusCode.DEFAULT, CardStruct.IStatusCode.DEFAULT);
            KeyboardVMV2 keyboardVMV2Dp = ((KeyboardIconGroupAssem) c1401850maF.l0).dp();
            keyboardVMV2Dp.getClass();
            keyboardVMV2Dp.withState(new AwS600S0100000_21(keyboardVMV2Dp, 418));
        }
    }

    public static final void LIZ$5(C1401850maF c1401850maF, View view) {
        Aweme aweme;
        CommentCommonModel commonModel;
        CommentCommonModel commonModel2;
        if (view != null && !C20612915lH.LIZIZ.LJIIIIZZ().LJFF(new AwS591S0100000_12((KeyboardIconGroupAssem) c1401850maF.l0, 601))) {
            C19EG c19egLJIILLIIL = C1345700l7g.LJIILLIIL((KeyboardIconGroupAssem) c1401850maF.l0);
            CommentContextSource commentContextSourceBp = ((KeyboardIconGroupAssem) c1401850maF.l0).bp();
            String str = null;
            if (commentContextSourceBp != null && (commonModel2 = commentContextSourceBp.getCommonModel()) != null) {
                aweme = commonModel2.aweme;
            } else {
                aweme = null;
            }
            CommentContextSource commentContextSourceBp2 = ((KeyboardIconGroupAssem) c1401850maF.l0).bp();
            if (commentContextSourceBp2 != null && (commonModel = commentContextSourceBp2.getCommonModel()) != null) {
                str = commonModel.enterFrom;
            }
            if (!C0SYU.LIZIZ(c19egLJIILLIIL, aweme, str, "click_comment_at", ((KeyboardIconGroupAssem) c1401850maF.l0).bp())) {
                ((KeyboardIconGroupAssem) c1401850maF.l0).dp().TQ2(false);
            }
        }
    }

    public static final void LIZ$6(C1401850maF c1401850maF, View view) {
        if (view != null) {
            KeyboardIconGroupAssem keyboardIconGroupAssem = (KeyboardIconGroupAssem) c1401850maF.l0;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = KeyboardIconGroupAssem.LLLIILIL;
            keyboardIconGroupAssem.lp("comment_panel_outer");
        }
    }

    public static final void LIZ$7(C1401850maF c1401850maF, View view) {
        if (view != null) {
            ICommentMentionAssemAbility iCommentMentionAssemAbility = (ICommentMentionAssemAbility) C1558520qew.LIZ(C1558520qew.LJIIL((KeyboardIconGroupAssem) c1401850maF.l0), ICommentMentionAssemAbility.class, null);
            if (iCommentMentionAssemAbility != null && iCommentMentionAssemAbility.f40()) {
                iCommentMentionAssemAbility.A51(false);
            }
            C1352670lIv c1352670lIv = C1352670lIv.LIZ;
            Context context = ((KeyboardIconGroupAssem) c1401850maF.l0).getContext();
            c1352670lIv.getClass();
            CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
            if (creativeToolsPluginService != null && creativeToolsPluginService.LIZJ(context, "comment_audio_record", true)) {
                if (C1347400lAQ.LIZIZ == -1) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    C1347400lAQ.LIZIZ = jCurrentTimeMillis;
                    C1347400lAQ.LIZ().storeLong("key_last_click_audio_timestamp", jCurrentTimeMillis);
                }
                C1346890l9b c1346890l9b = C1346890l9b.LIZ;
                CommentInputContent commentInputContent = ((KeyboardIconGroupAssem) c1401850maF.l0).dp().getState().LLJI.LIZ;
                c1346890l9b.getClass();
                if (C1346890l9b.LIZ(1, commentInputContent)) {
                    IAudioEditAbility iAudioEditAbilityLIZ = C1346550l93.LIZ(C1558520qew.LJIIL((KeyboardIconGroupAssem) c1401850maF.l0));
                    if (iAudioEditAbilityLIZ != null) {
                        iAudioEditAbilityLIZ.ho1();
                    }
                    IKeyboardInputPanelAssemAbility iKeyboardInputPanelAssemAbilityLIZJ = C1346550l93.LIZJ(C1558520qew.LJIIL((KeyboardIconGroupAssem) c1401850maF.l0));
                    if (iKeyboardInputPanelAssemAbilityLIZJ != null) {
                        iKeyboardInputPanelAssemAbilityLIZJ.C52();
                    }
                    IKeyboardInputPanelAssemAbility iKeyboardInputPanelAssemAbilityLIZJ2 = C1346550l93.LIZJ(C1558520qew.LJIIL((KeyboardIconGroupAssem) c1401850maF.l0));
                    if (iKeyboardInputPanelAssemAbilityLIZJ2 != null) {
                        iKeyboardInputPanelAssemAbilityLIZJ2.N2();
                    }
                    C1346890l9b.LIZIZ(1, ((KeyboardIconGroupAssem) c1401850maF.l0).LJJIJL(), ((KeyboardIconGroupAssem) c1401850maF.l0).dp().getState().LLJI.LIZ, new AwS565S0100000_21((KeyboardIconGroupAssem) c1401850maF.l0, 151), new AwS565S0100000_21((KeyboardIconGroupAssem) c1401850maF.l0, 152), new AwS565S0100000_21((KeyboardIconGroupAssem) c1401850maF.l0, 153), new AwS635S0100000_21((KeyboardIconGroupAssem) c1401850maF.l0, 32));
                    return;
                }
                ((KeyboardIconGroupAssem) c1401850maF.l0).No();
            }
        }
    }

    public static final void LIZ$8(C1401850maF c1401850maF, View view) {
        Aweme aweme;
        String str;
        String strEventType;
        String aid;
        String authorUid;
        Aweme aweme2;
        Aweme aweme3;
        CommentCommonModel commonModel;
        if (view != null) {
            C19EG c19egLJIILLIIL = C1345700l7g.LJIILLIIL((PortraitInputKeyboard) c1401850maF.l0);
            CommentContextSource commentContextSourceKp = ((PortraitInputKeyboard) c1401850maF.l0).kp();
            if (commentContextSourceKp != null) {
                aweme = CommentContextSourceKt.aweme(commentContextSourceKp);
            } else {
                aweme = null;
            }
            CommentContextSource commentContextSourceKp2 = ((PortraitInputKeyboard) c1401850maF.l0).kp();
            if (commentContextSourceKp2 != null && (commonModel = commentContextSourceKp2.getCommonModel()) != null) {
                str = commonModel.enterFrom;
            } else {
                str = null;
            }
            if (!C0SYU.LIZIZ(c19egLJIILLIIL, aweme, str, "click_type_comment", ((PortraitInputKeyboard) c1401850maF.l0).kp())) {
                PortraitInputKeyboard portraitInputKeyboard = (PortraitInputKeyboard) c1401850maF.l0;
                if (!Intrinsics.LJFF(portraitInputKeyboard.sp().wQ2(), C1347110l9x.LIZ) && !Intrinsics.LJFF(((PortraitInputKeyboard) c1401850maF.l0).sp().wQ2(), C1347120l9y.LIZ)) {
                    C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
                    CommentContextSource commentContextSourceKp3 = portraitInputKeyboard.kp();
                    if (commentContextSourceKp3 != null) {
                        strEventType = CommentContextSourceKt.eventType(commentContextSourceKp3);
                    } else {
                        strEventType = null;
                    }
                    CommentContextSource commentContextSourceKp4 = portraitInputKeyboard.kp();
                    if (commentContextSourceKp4 != null && (aweme3 = CommentContextSourceKt.aweme(commentContextSourceKp4)) != null) {
                        aid = aweme3.getAid();
                    } else {
                        aid = null;
                    }
                    CommentContextSource commentContextSourceKp5 = portraitInputKeyboard.kp();
                    if (commentContextSourceKp5 != null && (aweme2 = CommentContextSourceKt.aweme(commentContextSourceKp5)) != null) {
                        authorUid = AwemeExtKt.getAuthorUid(aweme2);
                    } else {
                        authorUid = null;
                    }
                    c1350920lG6.getClass();
                    C1350920lG6.LJLJJLL("box", strEventType, aid, authorUid);
                }
                KeyboardVMV2 keyboardVMV2Sp = ((PortraitInputKeyboard) c1401850maF.l0).sp();
                ((PortraitInputKeyboard) c1401850maF.l0).getClass();
                keyboardVMV2Sp.QK0(null, "click_input_box");
            }
        }
    }

    public static final void LIZ$9(C1401850maF c1401850maF, View view) {
        Aweme aweme;
        String str;
        String strEventType;
        String aid;
        String authorUid;
        Aweme aweme2;
        Aweme aweme3;
        CommentCommonModel commonModel;
        if (view != null) {
            C19EG c19egLJIILLIIL = C1345700l7g.LJIILLIIL((PortraitInputKeyboard) c1401850maF.l0);
            CommentContextSource commentContextSourceKp = ((PortraitInputKeyboard) c1401850maF.l0).kp();
            if (commentContextSourceKp != null) {
                aweme = CommentContextSourceKt.aweme(commentContextSourceKp);
            } else {
                aweme = null;
            }
            CommentContextSource commentContextSourceKp2 = ((PortraitInputKeyboard) c1401850maF.l0).kp();
            if (commentContextSourceKp2 != null && (commonModel = commentContextSourceKp2.getCommonModel()) != null) {
                str = commonModel.enterFrom;
            } else {
                str = null;
            }
            if (!C0SYU.LIZIZ(c19egLJIILLIIL, aweme, str, "click_type_comment", ((PortraitInputKeyboard) c1401850maF.l0).kp())) {
                PortraitInputKeyboard portraitInputKeyboard = (PortraitInputKeyboard) c1401850maF.l0;
                if (!Intrinsics.LJFF(portraitInputKeyboard.sp().wQ2(), C1347110l9x.LIZ) && !Intrinsics.LJFF(((PortraitInputKeyboard) c1401850maF.l0).sp().wQ2(), C1347120l9y.LIZ)) {
                    C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
                    CommentContextSource commentContextSourceKp3 = portraitInputKeyboard.kp();
                    if (commentContextSourceKp3 != null) {
                        strEventType = CommentContextSourceKt.eventType(commentContextSourceKp3);
                    } else {
                        strEventType = null;
                    }
                    CommentContextSource commentContextSourceKp4 = portraitInputKeyboard.kp();
                    if (commentContextSourceKp4 != null && (aweme3 = CommentContextSourceKt.aweme(commentContextSourceKp4)) != null) {
                        aid = aweme3.getAid();
                    } else {
                        aid = null;
                    }
                    CommentContextSource commentContextSourceKp5 = portraitInputKeyboard.kp();
                    if (commentContextSourceKp5 != null && (aweme2 = CommentContextSourceKt.aweme(commentContextSourceKp5)) != null) {
                        authorUid = AwemeExtKt.getAuthorUid(aweme2);
                    } else {
                        authorUid = null;
                    }
                    c1350920lG6.getClass();
                    C1350920lG6.LJLJJLL("box", strEventType, aid, authorUid);
                }
                KeyboardVMV2 keyboardVMV2Sp = ((PortraitInputKeyboard) c1401850maF.l0).sp();
                ((PortraitInputKeyboard) c1401850maF.l0).getClass();
                keyboardVMV2Sp.QK0(null, "click_input_box");
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1401850maF(CommentManagementBottomBarAssem commentManagementBottomBarAssem, int i) {
        super(400L);
        this.$t = i;
        this.l0 = commentManagementBottomBarAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1401850maF(StickerPropDetailFragment stickerPropDetailFragment, int i) {
        super(500L);
        this.$t = i;
        this.l0 = stickerPropDetailFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1401850maF(Object obj, int i) {
        super(700L);
        this.$t = i;
        this.l0 = obj;
    }

    public C1401850maF(VideoShare2GifEditActivity videoShare2GifEditActivity, int i) {
        this.$t = i;
        this.l0 = videoShare2GifEditActivity;
    }
}
