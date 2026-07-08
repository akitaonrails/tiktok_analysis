package X;

import Y.AObjectS396S0100000_22;
import android.app.Activity;
import android.view.View;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.creative.model.ChangeAvatarModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.SocialAvatarUpdateInfoStruct;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.AwS636S0100000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0oGc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public class C1466560oGc extends AbstractViewOnClickListenerC372950Ejl {
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
            case 8:
                LIZ$8(this, view);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                LIZ$9(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                LIZ$10(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public C1466560oGc(X.C1460230o6P r4, int r5) {
        /*
            r3 = this;
            r3.$t = r5
            switch(r5) {
                case 3: goto Le;
                case 10: goto Le;
                default: goto L5;
            }
        L5:
            r2 = r3
            r2.l0 = r4
            r0 = 600(0x258, double:2.964E-321)
        La:
            r2.<init>(r0)
            return
        Le:
            r2 = r3
            r2.l0 = r4
            r0 = 2500(0x9c4, double:1.235E-320)
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1466560oGc.<init>(X.0o6P, int):void");
    }

    public static final void LIZ$0(C1466560oGc c1466560oGc, View view) {
        ((C1418830n1d) c1466560oGc.l0).LLLLIL().LJII.invoke();
    }

    public static final void LIZ$1(C1466560oGc c1466560oGc, View view) {
        ((C1418830n1d) c1466560oGc.l0).LLLLIL().LJIIIIZZ.invoke();
    }

    public static final void LIZ$10(C1466560oGc c1466560oGc, View view) {
        boolean zLJI = MethodIDManager.LJI(72034);
        ((C1460230o6P) c1466560oGc.l0).LLLIILIL("video_edit_page");
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public static final void LIZ$2(C1466560oGc c1466560oGc, View view) {
        String str;
        VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) c1466560oGc.l0;
        CreativeModel creativeModel = videoPublishContainerScene.LLLLIILL.creativeModel;
        if (creativeModel.changeAvatarModel.isFromChangeAvatar && !creativeModel.draftInfoModel.isDraft) {
            Activity activityRequireActivity = videoPublishContainerScene.requireActivity();
            LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(videoPublishContainerScene);
            VideoPublishEditModel videoPublishEditModel = videoPublishContainerScene.LLLLIILL;
            C1443880ng2 c1443880ng2 = new C1443880ng2(activityRequireActivity, lifecycleScope, videoPublishEditModel);
            AObjectS396S0100000_22 aObjectS396S0100000_22 = new AObjectS396S0100000_22(videoPublishContainerScene, 6);
            Function1<Exception, Unit> function1 = new Function1<Exception, Unit>() { // from class: X.0nfz
                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ Unit invoke(Exception exc) {
                    return null;
                }
            };
            c1443880ng2.LIZ(true);
            ChangeAvatarModel changeAvatarModel = videoPublishEditModel.creativeModel.changeAvatarModel;
            if (changeAvatarModel.isFromSocialAvatar) {
                SocialAvatarUpdateInfoStruct socialAvatarUpdateInfoStruct = changeAvatarModel.socialAvatarUpdateInfoStruct;
                if (Intrinsics.LJFF(socialAvatarUpdateInfoStruct.getNeedUpdate(), Boolean.TRUE)) {
                    C23250099c.LIZLLL(lifecycleScope, null, null, new C1443820nfw(c1443880ng2, socialAvatarUpdateInfoStruct, aObjectS396S0100000_22, function1, null), 3);
                    return;
                } else {
                    c1443880ng2.LIZ(false);
                    aObjectS396S0100000_22.invoke();
                    return;
                }
            }
            if (changeAvatarModel.isFromAiVatar) {
                str = "2";
            } else {
                str = "1";
            }
            C23250099c.LIZLLL(lifecycleScope, null, null, new C1443860ng0(c1443880ng2, str, aObjectS396S0100000_22, function1, null), 3);
            return;
        }
        videoPublishContainerScene.LLLLLLLZIL();
    }

    public static final void LIZ$3(C1466560oGc c1466560oGc, View view) {
        boolean zLJI = MethodIDManager.LJI(72034);
        C1456140nzo.LIZ(((C1460230o6P) c1466560oGc.l0).LLLLIIIILLL(), false, 3);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public static final void LIZ$4(C1466560oGc c1466560oGc, View view) {
        InterfaceC1446740nke interfaceC1446740nke;
        boolean zLJI = MethodIDManager.LJI(72034);
        InterfaceC1439070nYH publishService = C0CHQ.LIZ().getPublishService();
        if (publishService.LJJLIIIJJIZ(((C1460230o6P) c1466560oGc.l0).getEditModel(), true)) {
            C1460230o6P c1460230o6P = (C1460230o6P) c1466560oGc.l0;
            publishService.LJJJLIIL(c1460230o6P, new AwS636S0100000_22(c1460230o6P, 20));
            InterfaceC1455860nzM interfaceC1455860nzMLLLLIIIILLL = ((C1460230o6P) c1466560oGc.l0).LLLLIIIILLL();
            if ((interfaceC1455860nzMLLLLIIIILLL instanceof InterfaceC1446740nke) && (interfaceC1446740nke = (InterfaceC1446740nke) interfaceC1455860nzMLLLLIIIILLL) != null) {
                interfaceC1446740nke.RF0();
            }
            publishService.LJIJI(((C1460230o6P) c1466560oGc.l0).LLLLIIIILLL().g().getValue(), ((C1460230o6P) c1466560oGc.l0).getEditModel().clone(), ((C1460230o6P) c1466560oGc.l0).getEditModel().hasInfoStickers());
            C1432260nNI.LIZ(((C1460230o6P) c1466560oGc.l0).getEditModel());
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public static final void LIZ$5(C1466560oGc c1466560oGc, View view) {
        boolean zLJI = MethodIDManager.LJI(72034);
        C1460230o6P c1460230o6P = (C1460230o6P) c1466560oGc.l0;
        InterfaceC1431860nMe interfaceC1431860nMe = (InterfaceC1431860nMe) c1460230o6P.LLLJL.getValue(c1460230o6P, C1460230o6P.LLLLIILL[11]);
        if (interfaceC1431860nMe != null) {
            interfaceC1431860nMe.hh2(true, "story_edit_page_message_panel", null);
        }
        C1460230o6P c1460230o6P2 = (C1460230o6P) c1466560oGc.l0;
        AwS566S0100000_22 awS566S0100000_22 = new AwS566S0100000_22(c1460230o6P2, 581);
        c1460230o6P2.getClass();
        C1618440sDa.LIZIZ.LJIIJJI().LIZIZ(c1460230o6P2.mView.getContext(), "", true, c1460230o6P2.getEditModel(), "story_edit_page", false, awS566S0100000_22);
        C0L2R c0l2r = C0L2R.LIZ;
        VideoPublishEditModel editModel = ((C1460230o6P) c1466560oGc.l0).getEditModel();
        c0l2r.getClass();
        C0LAB c0labLIZ = C0L2R.LIZ(editModel);
        c0labLIZ.LJ("message_button_show_way", "story_edit_page");
        C2341909Fp.LIZ("story_edit_page_send_message_button_click", c0labLIZ.LIZ);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public static final void LIZ$6(C1466560oGc c1466560oGc, View view) {
        boolean zLJI = MethodIDManager.LJI(72034);
        C1460230o6P c1460230o6P = (C1460230o6P) c1466560oGc.l0;
        InterfaceC1431860nMe interfaceC1431860nMe = (InterfaceC1431860nMe) c1460230o6P.LLLJL.getValue(c1460230o6P, C1460230o6P.LLLLIILL[11]);
        if (interfaceC1431860nMe != null) {
            interfaceC1431860nMe.hh2(true, "story_edit_page_message_panel", null);
        }
        C1460230o6P c1460230o6P2 = (C1460230o6P) c1466560oGc.l0;
        c1460230o6P2.getClass();
        C1618440sDa.LIZIZ.LJJJJIZL().LIZ(c1460230o6P2.mView, c1460230o6P2.getEditModel(), new AwS601S0100000_22(c1460230o6P2, 394), new AwS601S0100000_22(c1460230o6P2, 396));
        C0L2R c0l2r = C0L2R.LIZ;
        VideoPublishEditModel editModel = ((C1460230o6P) c1466560oGc.l0).getEditModel();
        c0l2r.getClass();
        C0LAB c0labLIZ = C0L2R.LIZ(editModel);
        if (C298680BnG.LIZ()) {
            c0labLIZ.LIZ(C298630BnB.LIZ() ? 1 : 0, "if_key_sub_creator");
        }
        C2341909Fp.LIZ("story_edit_page_share_button_click", c0labLIZ.LIZ);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public static final void LIZ$7(C1466560oGc c1466560oGc, View view) {
        boolean zLJI = MethodIDManager.LJI(72034);
        ((C1460230o6P) c1466560oGc.l0).LLLILZ();
        ((C1460230o6P) c1466560oGc.l0).LLLLIIIILLL().wi0();
        InterfaceC1451520nsM interfaceC1451520nsMLLLLII = ((C1460230o6P) c1466560oGc.l0).LLLLII();
        if (interfaceC1451520nsMLLLLII != null) {
            interfaceC1451520nsMLLLLII.m7("start quick Publish");
        }
        Function0<Unit> function0 = ((C1460230o6P) c1466560oGc.l0).LLJI.LJIIIIZZ;
        if (function0 == null) {
            function0 = null;
        }
        function0.invoke();
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public static final void LIZ$8(C1466560oGc c1466560oGc, View view) {
        boolean zLJI = MethodIDManager.LJI(72034);
        Function0<Unit> function0 = ((C1460230o6P) c1466560oGc.l0).LLJI.LJIIJJI;
        if (function0 == null) {
            function0 = null;
        }
        function0.invoke();
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public static final void LIZ$9(C1466560oGc c1466560oGc, View view) {
        boolean zLJI = MethodIDManager.LJI(72034);
        C1458390o3R.LIZ.getClass();
        C1458390o3R.LJJIIJZLJL(1024);
        if (((C1460230o6P) c1466560oGc.l0).LLLLLJLJLL(true)) {
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        C573960MfC.LIZ(C0CHQ.LIZ().LJIIJ(), ((C1460230o6P) c1466560oGc.l0).getEditModel(), ((C1460230o6P) c1466560oGc.l0).getEditModel().getCreationId(), 1, null, 24);
        if (C1428470nHB.LJJZZI(((C1460230o6P) c1466560oGc.l0).getEditModel())) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("click to next page creationId = ");
            sbLIZ.append(((C1460230o6P) c1466560oGc.l0).getEditModel().getCreationId());
            C1450070nq1.LJII(C2188811AlT.LIZIZ(sbLIZ));
        }
        if (C0CHQ.LIZ().getPublishService().LJJLIIIJJI(((C1460230o6P) c1466560oGc.l0).getEditModel())) {
            ((C1460230o6P) c1466560oGc.l0).LLLIILIL("edit_quick_publish");
        } else {
            ((C1460230o6P) c1466560oGc.l0).LLLIILIL("video_edit_page");
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1466560oGc(C1418830n1d c1418830n1d, int i) {
        super(600L);
        this.$t = i;
        this.l0 = c1418830n1d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1466560oGc(VideoPublishContainerScene videoPublishContainerScene, int i) {
        super(1000L);
        this.$t = i;
        this.l0 = videoPublishContainerScene;
    }
}
