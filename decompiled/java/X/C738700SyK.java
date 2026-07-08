package X;

import android.view.View;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.commentv2.title.TitlePanelDescAssem;
import com.ss.android.ugc.aweme.commentv2.title.TitlePanelInteractionInputBottomBarAssem;
import com.ss.android.ugc.aweme.commentv2.title.TitlePanelNavAssem;
import com.ss.android.ugc.aweme.commercialize.routeradapter.api.openapi.invoke.ICRouterComponentClick;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.feed.platform.cell.RootCellCommonAbility;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: renamed from: X.0SyK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C738700SyK extends AbstractViewOnClickListenerC372950Ejl {
    public final int $t;
    public Object l0;

    @Override // X.AbstractViewOnClickListenerC372950Ejl
    public final void LIZ(View view) {
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
            default:
                super.LIZ(view);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C738700SyK(Object obj, int i) {
        super(700L);
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZ$0(C738700SyK c738700SyK, View view) {
        boolean z;
        C1354140lLI c1354140lLI;
        RootCellCommonAbility rootCellCommonAbility;
        String strEventType;
        Aweme aweme;
        if (view != null) {
            C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
            CommentContextSource commentContextSourceKp = ((TitlePanelDescAssem) c738700SyK.l0).kp();
            c1350920lG6.getClass();
            C1350920lG6.LJJIJIIJIL(commentContextSourceKp, "click_username");
            CommentContextSource commentContextSourceKp2 = ((TitlePanelDescAssem) c738700SyK.l0).kp();
            if (commentContextSourceKp2 != null && (aweme = CommentContextSourceKt.aweme(commentContextSourceKp2)) != null && AwemeExtKt.isTextMoreAd(aweme)) {
                z = true;
            } else {
                z = false;
            }
            User user = null;
            if (z) {
                TitlePanelDescAssem titlePanelDescAssem = (TitlePanelDescAssem) c738700SyK.l0;
                titlePanelDescAssem.getClass();
                C0SWD.LIZ = 1;
                InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558520qew.LJIIL(titlePanelDescAssem), "source_default_key", C1354140lLI.class, null);
                if (interfaceC1555100qZQLIZIZ != null && (c1354140lLI = (C1354140lLI) interfaceC1555100qZQLIZIZ.getSource()) != null && (rootCellCommonAbility = c1354140lLI.LLILZLL.get()) != null) {
                    CommentContextSource commentContextSourceKp3 = titlePanelDescAssem.kp();
                    if (commentContextSourceKp3 == null || (strEventType = CommentContextSourceKt.eventType(commentContextSourceKp3)) == null) {
                        strEventType = "";
                    }
                    rootCellCommonAbility.Q5(strEventType);
                    return;
                }
                return;
            }
            TitlePanelDescAssem titlePanelDescAssem2 = (TitlePanelDescAssem) c738700SyK.l0;
            Comment comment = (Comment) titlePanelDescAssem2.LLLIIII.getValue();
            if (comment != null) {
                user = comment.getUser();
            }
            titlePanelDescAssem2.ip(user, "click_name");
        }
    }

    public static final void LIZ$1(C738700SyK c738700SyK, View view) {
        boolean z;
        Aweme aweme;
        Aweme aweme2;
        if (view != null) {
            C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
            CommentContextSource commentContextSourceKp = ((TitlePanelDescAssem) c738700SyK.l0).kp();
            c1350920lG6.getClass();
            C1350920lG6.LJJIJIIJIL(commentContextSourceKp, "click_avatar");
            CommentContextSource commentContextSourceKp2 = ((TitlePanelDescAssem) c738700SyK.l0).kp();
            if (commentContextSourceKp2 != null && (aweme2 = CommentContextSourceKt.aweme(commentContextSourceKp2)) != null && AwemeExtKt.isTextMoreAd(aweme2)) {
                z = true;
            } else {
                z = false;
            }
            User user = null;
            String strEventType = null;
            if (z) {
                TitlePanelDescAssem titlePanelDescAssem = (TitlePanelDescAssem) c738700SyK.l0;
                CommentContextSource commentContextSourceKp3 = titlePanelDescAssem.kp();
                if (commentContextSourceKp3 != null) {
                    aweme = CommentContextSourceKt.aweme(commentContextSourceKp3);
                } else {
                    aweme = null;
                }
                C0SWD.LIZ = 1;
                ICRouterComponentClick iCRouterComponentClick = (ICRouterComponentClick) PluggableExtentionKt.pluggableSpi$default(ICRouterComponentClick.class, false, false, false, 14, null);
                if (iCRouterComponentClick != null) {
                    CommentContextSource commentContextSourceKp4 = titlePanelDescAssem.kp();
                    if (commentContextSourceKp4 != null) {
                        strEventType = CommentContextSourceKt.eventType(commentContextSourceKp4);
                    }
                    iCRouterComponentClick.LIZLLL(aweme, strEventType, titlePanelDescAssem.getContext(), new AwS555S0100000_11(titlePanelDescAssem, 1479));
                    return;
                }
                return;
            }
            TitlePanelDescAssem titlePanelDescAssem2 = (TitlePanelDescAssem) c738700SyK.l0;
            Comment comment = (Comment) titlePanelDescAssem2.LLLIIII.getValue();
            if (comment != null) {
                user = comment.getUser();
            }
            titlePanelDescAssem2.ip(user, "click_head");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033 A[PHI: r4
      0x0033: PHI (r4v3 java.lang.String) = (r4v0 java.lang.String), (r4v4 java.lang.String) binds: [B:16:0x0031, B:14:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0039 A[PHI: r4
      0x0039: PHI (r4v2 java.lang.String) = (r4v0 java.lang.String), (r4v3 java.lang.String) binds: [B:16:0x0031, B:18:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$2(X.C738700SyK r17, android.view.View r18) {
        /*
            Method dump skipped, instruction units count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C738700SyK.LIZ$2(X.0SyK, android.view.View):void");
    }

    public static final void LIZ$3(C738700SyK c738700SyK, View view) {
        Aweme aweme;
        C1354140lLI c1354140lLI;
        RootCellCommonAbility rootCellCommonAbility;
        String strEventType;
        if (view != null) {
            C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
            CommentContextSource commentContextSourceJo = ((TitlePanelNavAssem) c738700SyK.l0).Jo();
            c1350920lG6.getClass();
            C1350920lG6.LJJIJIIJIL(commentContextSourceJo, "click_username");
            CommentContextSource commentContextSourceJo2 = ((TitlePanelNavAssem) c738700SyK.l0).Jo();
            if (commentContextSourceJo2 != null && (aweme = CommentContextSourceKt.aweme(commentContextSourceJo2)) != null && AwemeExtKt.isTextMoreAd(aweme)) {
                TitlePanelNavAssem titlePanelNavAssem = (TitlePanelNavAssem) c738700SyK.l0;
                titlePanelNavAssem.getClass();
                C0SWD.LIZ = 1;
                InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558520qew.LJIIL(titlePanelNavAssem), "source_default_key", C1354140lLI.class, null);
                if (interfaceC1555100qZQLIZIZ != null && (c1354140lLI = (C1354140lLI) interfaceC1555100qZQLIZIZ.getSource()) != null && (rootCellCommonAbility = c1354140lLI.LLILZLL.get()) != null) {
                    CommentContextSource commentContextSourceJo3 = titlePanelNavAssem.Jo();
                    if (commentContextSourceJo3 == null || (strEventType = CommentContextSourceKt.eventType(commentContextSourceJo3)) == null) {
                        strEventType = "";
                    }
                    rootCellCommonAbility.Q5(strEventType);
                    return;
                }
                return;
            }
            TitlePanelNavAssem.Ho(((TitlePanelNavAssem) c738700SyK.l0).LJJIJL().getContext(), ((TitlePanelNavAssem) c738700SyK.l0).Jo(), "click_name");
        }
    }

    public static final void LIZ$4(C738700SyK c738700SyK, View view) {
        Aweme aweme;
        Aweme aweme2;
        if (view != null) {
            C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
            CommentContextSource commentContextSourceJo = ((TitlePanelNavAssem) c738700SyK.l0).Jo();
            c1350920lG6.getClass();
            C1350920lG6.LJJIJIIJIL(commentContextSourceJo, "click_avatar");
            CommentContextSource commentContextSourceJo2 = ((TitlePanelNavAssem) c738700SyK.l0).Jo();
            if (commentContextSourceJo2 != null && (aweme = CommentContextSourceKt.aweme(commentContextSourceJo2)) != null && AwemeExtKt.isTextMoreAd(aweme)) {
                TitlePanelNavAssem titlePanelNavAssem = (TitlePanelNavAssem) c738700SyK.l0;
                CommentContextSource commentContextSourceJo3 = titlePanelNavAssem.Jo();
                String strEventType = null;
                if (commentContextSourceJo3 != null) {
                    aweme2 = CommentContextSourceKt.aweme(commentContextSourceJo3);
                } else {
                    aweme2 = null;
                }
                C0SWD.LIZ = 1;
                ICRouterComponentClick iCRouterComponentClick = (ICRouterComponentClick) PluggableExtentionKt.pluggableSpi$default(ICRouterComponentClick.class, false, false, false, 14, null);
                if (iCRouterComponentClick != null) {
                    CommentContextSource commentContextSourceJo4 = titlePanelNavAssem.Jo();
                    if (commentContextSourceJo4 != null) {
                        strEventType = CommentContextSourceKt.eventType(commentContextSourceJo4);
                    }
                    iCRouterComponentClick.LIZLLL(aweme2, strEventType, titlePanelNavAssem.getContext(), new AwS555S0100000_11(titlePanelNavAssem, 1482));
                    return;
                }
                return;
            }
            TitlePanelNavAssem.Ho(((TitlePanelNavAssem) c738700SyK.l0).LJJIJL().getContext(), ((TitlePanelNavAssem) c738700SyK.l0).Jo(), "click_head");
        }
    }

    public static final void LIZ$5(C738700SyK c738700SyK, View view) {
        if (view != null) {
            ((TitlePanelInteractionInputBottomBarAssem) c738700SyK.l0).mp();
        }
    }

    public static final void LIZ$6(C738700SyK c738700SyK, View view) {
        if (view != null) {
            C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
            CommentContextSource commentContextSourceLIZ = ((C0SW9) c738700SyK.l0).LIZ();
            c1350920lG6.getClass();
            C1350920lG6.LJJIJIIJIL(commentContextSourceLIZ, "click_username");
            ((C0SW9) c738700SyK.l0).LIZ.LJIJI("click_name");
        }
    }

    public static final void LIZ$7(C738700SyK c738700SyK, View view) {
        if (view != null) {
            C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
            CommentContextSource commentContextSourceLIZ = ((C0SW9) c738700SyK.l0).LIZ();
            c1350920lG6.getClass();
            C1350920lG6.LJJIJIIJIL(commentContextSourceLIZ, "click_avatar");
            ((C0SW9) c738700SyK.l0).LIZ.LJIJI("click_head");
        }
    }
}
