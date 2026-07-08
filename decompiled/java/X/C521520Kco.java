package X;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.BasePreviewSettingMainFragmentSheetInitializer;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.subcription.subspaceeditor.CommentLegalAssem;
import com.bytedance.android.livesdk.subcription.subspaceeditor.SubSpaceEditorVM;
import com.bytedance.android.livesdk.toolbar.AiGeneratedContentSheetFragment;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.editor.assem.PGCCommentLegalAssem;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.feed.vm.SubSpaceFeedAbility;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.feed.vm.SubSpaceFeedVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS586S0100000_7;
import webcast.api.sub.SpaceTip;

/* JADX INFO: renamed from: X.0Kco, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C521520Kco extends ClickableSpan {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void updateDrawState$2(C521520Kco c521520Kco, TextPaint textPaint) {
    }

    public static final void updateDrawState$4(C521520Kco c521520Kco, TextPaint textPaint) {
    }

    public static final void updateDrawState$5(C521520Kco c521520Kco, TextPaint textPaint) {
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
            case 3:
                onClick$3(this, view);
                break;
            case 4:
                onClick$4(this, view);
                break;
            case 5:
                onClick$5(this, view);
                break;
            case 6:
                onClick$6(this, view);
                break;
            default:
                super.onClick(view);
                break;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.$t) {
            case 0:
                updateDrawState$0(this, textPaint);
                break;
            case 1:
                updateDrawState$1(this, textPaint);
                break;
            case 2:
                updateDrawState$2(this, textPaint);
                break;
            case 3:
                updateDrawState$3(this, textPaint);
                break;
            case 4:
                updateDrawState$4(this, textPaint);
                break;
            case 5:
                updateDrawState$5(this, textPaint);
                break;
            case 6:
                updateDrawState$6(this, textPaint);
                break;
            default:
                super.updateDrawState(textPaint);
                break;
        }
    }

    public static final void onClick$0(C521520Kco c521520Kco, View view) {
        AbstractC775660Ubk abstractC775660Ubk = (AbstractC775660Ubk) c521520Kco.l0;
        Context context = view.getContext();
        abstractC775660Ubk.getClass();
        IActionHandlerService iActionHandlerService = (IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("aweme://roma_redirect/?spark_page=live_adaptive_lite_faq");
        sbLIZ.append("&anchor_id=");
        sbLIZ.append(abstractC775660Ubk.LLILLJJLI);
        sbLIZ.append("&user_id=");
        sbLIZ.append(abstractC775660Ubk.LLILLL);
        iActionHandlerService.handle(context, C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void onClick$1(C521520Kco c521520Kco, View view) {
        AssemVMLazy assemVMLazy = ((CommentLegalAssem) c521520Kco.l0).LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = CommentLegalAssem.LLJJIII;
        C0JCN c0jcn = ((SubSpaceEditorVM) assemVMLazy.getValue()).LL;
        if (c0jcn != null) {
            c0jcn.LJJLI();
        }
        Fragment fragmentLJI = C724240Sb0.LJI((CommentLegalAssem) c521520Kco.l0);
        if (fragmentLJI != null && (fragmentLJI instanceof DialogFragment)) {
            ((DialogFragment) fragmentLJI).dismissAllowingStateLoss();
        }
    }

    public static final void onClick$2(C521520Kco c521520Kco, View view) {
        long jLongValue;
        C0IR5 c0ir5;
        Long l;
        FragmentManager fragmentManager;
        DataChannel dataChannel = ((BasePreviewSettingMainFragmentSheetInitializer) c521520Kco.l0).LLILLJJLI;
        if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) != null) {
            C19322110iZ.LJFF(fragmentManager, new AiGeneratedContentSheetFragment(((BasePreviewSettingMainFragmentSheetInitializer) c521520Kco.l0).LLILLJJLI), AiGeneratedContentSheetFragment.class.getName(), null, 0);
        }
        DataChannel dataChannel2 = ((BasePreviewSettingMainFragmentSheetInitializer) c521520Kco.l0).LLILLJJLI;
        String strCurrentRegionCode = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).currentRegionCode();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("click_live_aigc_toggle_learn_more");
        c474500IjALIZ.LJIJJLI(dataChannel2);
        c474500IjALIZ.LJJII("before", "enter_type");
        c474500IjALIZ.LJJII(strCurrentRegionCode, "country_code");
        if (dataChannel2 != null && (c0ir5 = (C0IR5) dataChannel2.gg0(C1087000eOQ.class)) != null && (l = c0ir5.LIZLLL) != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        c474500IjALIZ.LJJII(Long.valueOf(jLongValue), "user_id");
        c474500IjALIZ.LIZ();
        C249600xq.LIZ("click_more", "ai_generated_content", "live_take_page", ((BasePreviewSettingMainFragmentSheetInitializer) c521520Kco.l0).LLILLJJLI, (C20743716Ff) c521520Kco.l1);
    }

    public static final void onClick$3(C521520Kco c521520Kco, View view) {
        AssemVMLazy assemVMLazy = ((PGCCommentLegalAssem) c521520Kco.l0).LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = PGCCommentLegalAssem.LLJJIII;
        C0JCO c0jco = ((com.ss.android.ugc.aweme.subscription.pgc.business.foundation.editor.viewmodel.SubSpaceEditorVM) assemVMLazy.getValue()).LL;
        if (c0jco != null) {
            c0jco.LJJLI();
        }
        Fragment fragmentLJI = C724240Sb0.LJI((PGCCommentLegalAssem) c521520Kco.l0);
        if (fragmentLJI != null && (fragmentLJI instanceof DialogFragment)) {
            ((DialogFragment) fragmentLJI).dismissAllowingStateLoss();
        }
    }

    public static final void onClick$4(C521520Kco c521520Kco, View view) {
        long id;
        Boolean bool;
        int i;
        Room room;
        C19EG c19egLJ = C500260Jjc.LJ((Context) c521520Kco.l0);
        if (c19egLJ != null) {
            C773800UXa c773800UXa = (C773800UXa) c521520Kco.l1;
            c773800UXa.LJ.invoke();
            IHostAction iHostAction = (IHostAction) C1161920gLG.LIZJ(IHostAction.class);
            DataChannel dataChannel = c773800UXa.LJIILIIL;
            if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
                id = room.getId();
            } else {
                id = 0;
            }
            DataChannel dataChannel2 = c773800UXa.LJIILIIL;
            if (dataChannel2 != null) {
                bool = (Boolean) dataChannel2.gg0(UserIsAnchorChannel.class);
            } else {
                bool = null;
            }
            if (C500260Jjc.LJJJI(bool)) {
                i = 3;
            } else {
                i = 2;
            }
            iHostAction.jumpToFeedBack(c19egLJ, id, i);
        }
    }

    public static final void onClick$5(C521520Kco c521520Kco, View view) {
        FragmentManager fragmentManager;
        DataChannel dataChannel = ((BasePreviewSettingMainFragmentSheetInitializer) c521520Kco.l0).LLILLJJLI;
        if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) != null) {
            new C499900Jj2().LIZIZ(fragmentManager, false, "live_take_page", null);
        }
        C249600xq.LIZ("click_more", "record_comments_gifts", "live_take_page", ((BasePreviewSettingMainFragmentSheetInitializer) c521520Kco.l0).LLILLJJLI, (C20743716Ff) c521520Kco.l1);
    }

    public static final void onClick$6(C521520Kco c521520Kco, View view) {
        SpaceTip spaceTip = (SpaceTip) c521520Kco.l0;
        if (spaceTip.spaceTipJumpType == 4) {
            InterfaceC665370Q7z interfaceC665370Q7z = ((C0K2V) c521520Kco.l1).LLILLJJLI.LL;
            if (interfaceC665370Q7z == null) {
                interfaceC665370Q7z = null;
            }
            SubSpaceFeedAbility subSpaceFeedAbility = (SubSpaceFeedAbility) C1558520qew.LIZ(interfaceC665370Q7z, SubSpaceFeedAbility.class, null);
            if (subSpaceFeedAbility != null) {
                subSpaceFeedAbility.KE1();
                return;
            }
            return;
        }
        SubSpaceFeedVM subSpaceFeedVM = ((C0K2V) c521520Kco.l1).LLILLJJLI;
        subSpaceFeedVM.getClass();
        subSpaceFeedVM.setState(new AwS586S0100000_7(spaceTip, 487));
    }

    public static final void updateDrawState$0(C521520Kco c521520Kco, TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        textPaint.setColor(C20736316Cj.LIZIZ(R.attr.ezs, ((C16F5) c521520Kco.l1).getContext()));
    }

    public static final void updateDrawState$1(C521520Kco c521520Kco, TextPaint textPaint) {
        int iIntValue;
        super.updateDrawState(textPaint);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ex3, (Context) c521520Kco.l1);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        textPaint.setColor(iIntValue);
        textPaint.setUnderlineText(false);
    }

    public static final void updateDrawState$3(C521520Kco c521520Kco, TextPaint textPaint) {
        int iIntValue;
        super.updateDrawState(textPaint);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.f_h, (Context) c521520Kco.l1);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        textPaint.setColor(iIntValue);
        textPaint.setUnderlineText(false);
    }

    public static final void updateDrawState$6(C521520Kco c521520Kco, TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setColor(C426930God.LIZIZ(R.attr.a1j, ((C0K2V) c521520Kco.l1).LLILZIL));
        textPaint.setUnderlineText(false);
    }

    public C521520Kco(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
