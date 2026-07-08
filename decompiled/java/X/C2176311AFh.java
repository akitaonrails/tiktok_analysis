package X;

import Y.AObjectS534S0100000_1;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentManager;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PopUpMessage;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS682S0100000_33;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1AFh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2176311AFh extends AbstractC2176321AFi {
    public final void LIZJ() {
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("state", "dismiss");
            interfaceC634840OvC.sendEvent("ec_open_sheet", jSONObject);
        }
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Context context;
        Activity activityLIZLLL;
        C19EG c19eg;
        FragmentManager supportFragmentManager;
        InterfaceC2176331AFj interfaceC2176331AFj = (InterfaceC2176331AFj) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            context = interfaceC634840OvC.getContext();
        } else {
            context = null;
        }
        InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
        if (interfaceC634840OvC2 != null) {
            activityLIZLLL = interfaceC634840OvC2.LIZLLL();
        } else {
            activityLIZLLL = null;
        }
        if ((activityLIZLLL instanceof C19EG) && (c19eg = (C19EG) activityLIZLLL) != null && (supportFragmentManager = c19eg.getSupportFragmentManager()) != null && context != null) {
            try {
                if (Intrinsics.LJFF(interfaceC2176331AFj.getContentType(), "richText")) {
                    LIZLLL(interfaceC2176331AFj, context, supportFragmentManager, completionBlock);
                    return;
                }
                if (Intrinsics.LJFF(interfaceC2176331AFj.getContentType(), "richTextList")) {
                    InterfaceC634840OvC interfaceC634840OvC3 = this.IBridgeSdkContext;
                    if (interfaceC634840OvC3 != null) {
                        interfaceC634840OvC3.LIZLLL();
                    }
                    LJ(interfaceC2176331AFj, context, supportFragmentManager, completionBlock);
                    return;
                }
                if (interfaceC2176331AFj.getContent() == null) {
                    C2382909Vj.LIZ(completionBlock, 0, "jsb state error", null, 4);
                    return;
                }
                InterfaceC2176341AFk content = interfaceC2176331AFj.getContent();
                if (content != null) {
                    LJFF(context, interfaceC2176331AFj, supportFragmentManager, completionBlock, content);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1019103yf.LIZ(EnumC1014603xw.ERR_PDP_JSB_OPEN_SHEET_PARSE_ERROR, e, null);
            }
        }
    }

    public final void LIZLLL(InterfaceC2176331AFj interfaceC2176331AFj, Context context, FragmentManager fragmentManager, CompletionBlock<InterfaceC2176371AFn> completionBlock) {
        if (interfaceC2176331AFj.getRichTextContent() == null) {
            C2382909Vj.LIZ(completionBlock, 0, "jsb state error", null, 4);
            return;
        }
        InterfaceC2176351AFl richTextContent = interfaceC2176331AFj.getRichTextContent();
        if (richTextContent != null) {
            C808003Dq.LJFF(C808003Dq.LIZLLL(C808003Dq.LIZ(context, richTextContent.getSource(), C13LQ.LJJLL((Object[]) C1280004ze.LIZ(richTextContent.getContentModels(), ECRichText[].class))), interfaceC2176331AFj.getTitle(), false, new AwS682S0100000_33(this, 0), 28), fragmentManager, null, new AwS577S0100000_33(completionBlock, (CompletionBlock<InterfaceC2176371AFn>) 19), 4);
        }
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [X.03Cv, android.view.View] */
    public final void LJ(InterfaceC2176331AFj interfaceC2176331AFj, final Context context, FragmentManager fragmentManager, CompletionBlock completionBlock) {
        if (interfaceC2176331AFj.getRichTextListContent() == null) {
            C2382909Vj.LIZ(completionBlock, 0, "jsb state error", null, 4);
            return;
        }
        InterfaceC2176361AFm richTextListContent = interfaceC2176331AFj.getRichTextListContent();
        if (richTextListContent != null) {
            final PopUpMessage popUpMessage = (PopUpMessage) C1280004ze.LIZ(richTextListContent.getContentModels(), PopUpMessage.class);
            final String source = richTextListContent.getSource();
            ?? r7 = new LinearLayout(context, popUpMessage, source) { // from class: X.03Cv
                public final String LL;
                public final PopUpMessage LLILLJJLI;

                {
                    List<ECRichText> list;
                    List<ECRichText> list2;
                    Icon icon;
                    Image icon2;
                    this.LL = source;
                    RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, null);
                    removeAllViews();
                    ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
                    setLayoutParams(layoutParams);
                    setOrientation(0);
                    C426750GoL.LJIIL(this, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), 16);
                    this.LLILLJJLI = popUpMessage;
                    if (popUpMessage != null && (icon = popUpMessage.leadIcon) != null) {
                        SmartImageView smartImageView = new SmartImageView(getContext());
                        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
                        marginLayoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
                        C786410Ut5.G6(smartImageView, marginLayoutParams);
                        addView(smartImageView);
                        if (C1744700vVE.LJ(getContext(), null)) {
                            icon2 = icon.getIconDark();
                        } else {
                            icon2 = icon.getIcon();
                        }
                        C1326790kdB.LIZ.getClass();
                        C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(icon2);
                        c1331670kl3LIZLLL.LJJ(smartImageView);
                        C786410Ut5.h3(c1331670kl3LIZLLL);
                    }
                    LinearLayout linearLayout = new LinearLayout(getContext());
                    C786410Ut5.d6(linearLayout, new ViewGroup.LayoutParams(-1, -2));
                    linearLayout.setOrientation(1);
                    addView(linearLayout);
                    if (popUpMessage != null && (list = popUpMessage.contents) != null) {
                        int i = 0;
                        for (ECRichText eCRichText : list) {
                            int i2 = i + 1;
                            if (i >= 0) {
                                TuxTextView tuxTextView = new TuxTextView(getContext(), null, 6, 0);
                                C786410Ut5.R6(tuxTextView, new ViewGroup.LayoutParams(-1, -2));
                                C0H9H.LIZJ(C0H9H.LIZIZ(4), tuxTextView);
                                C03B0 c03b0 = new C03B0(tuxTextView, this.LL);
                                C03B0.LIZ(c03b0, eCRichText, new AObjectS534S0100000_1(tuxTextView, 2), null, false, null, null, 124);
                                tuxTextView.setText(c03b0.LIZJ);
                                linearLayout.addView(tuxTextView);
                                PopUpMessage popUpMessage2 = this.LLILLJJLI;
                                if (popUpMessage2 != null && (list2 = popUpMessage2.contents) != null && i < list2.size() - 1) {
                                    View view = new View(getContext());
                                    ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-1, 2);
                                    C426750GoL.LJIIJ(marginLayoutParams2, view.getContext(), 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), 32);
                                    C786410Ut5.W5(view, marginLayoutParams2);
                                    Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ng, view.getContext());
                                    if (numLIZJ != null) {
                                        view.setBackgroundColor(numLIZJ.intValue());
                                    }
                                    linearLayout.addView(view);
                                }
                                i = i2;
                            } else {
                                C1697810uHb.LJIJI();
                                throw null;
                            }
                        }
                    }
                }
            };
            C0OM1 c0om1 = new C0OM1();
            C1250250idj c1250250idj = new C1250250idj();
            String str = popUpMessage.title;
            if (str == null) {
                str = "";
            }
            c1250250idj.LIZJ = str;
            c0om1.LIZJ = c1250250idj;
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
            c1251150ifB.LIZLLL = true;
            c1251150ifB.LIZJ(new AwS545S0100000_1((C805903Cv) r7, 10));
            c0om1.LIZIZ(c1251150ifB);
            c0om1.LIZLLL = true;
            C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
            TuxSheet tuxSheet = c1390920mIc.LIZ;
            tuxSheet.LLJJIJIL = c0om1;
            tuxSheet.LLJJJ = null;
            tuxSheet.LLJJIII = r7;
            c1390920mIc.LJIIIIZZ(0);
            TuxSheet tuxSheet2 = c1390920mIc.LIZ;
            tuxSheet2.LLJJIJIIJIL = true;
            tuxSheet2.LLJLILLLLZIIL = true;
            tuxSheet2.LLILLJJLI = new DialogInterfaceOnDismissListenerC2189651Amp(this, 0);
            C808003Dq.LJFF(tuxSheet2, fragmentManager, null, new AwS577S0100000_33(completionBlock, (CompletionBlock<InterfaceC2176371AFn>) 21), 4);
        }
    }

    public final void LJFF(Context context, InterfaceC2176331AFj interfaceC2176331AFj, FragmentManager fragmentManager, CompletionBlock<InterfaceC2176371AFn> completionBlock, InterfaceC2176341AFk interfaceC2176341AFk) {
        String item = interfaceC2176341AFk.getItem();
        int color = ColorProtector.parseColor(interfaceC2176341AFk.getColor());
        int iLIZJ = C7736030k.LIZJ(Integer.valueOf(interfaceC2176341AFk.getFont().intValue()), null);
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setText(item);
        tuxTextView.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48)));
        tuxTextView.setTextColor(color);
        tuxTextView.setTuxFont(iLIZJ);
        C808003Dq.LJFF(C808003Dq.LIZLLL(tuxTextView, interfaceC2176331AFj.getTitle(), false, new AwS682S0100000_33(this, 1), 20), fragmentManager, null, new AwS577S0100000_33(completionBlock, (CompletionBlock<InterfaceC2176371AFn>) 20), 4);
    }
}
