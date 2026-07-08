package Y;

import X.C0BRL;
import X.C0DHG;
import X.C0I7D;
import X.C0OBG;
import X.C0PUB;
import X.C0PUE;
import X.C0PUL;
import X.C0PV3;
import X.C0Q94;
import X.C0QIY;
import X.C0QM5;
import X.C0QS5;
import X.C0QSC;
import X.C0QVQ;
import X.C0QWQ;
import X.C0WZX;
import X.C128Y;
import X.C1388190mED;
import X.C1391850mK7;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C1440005kM;
import X.C1507790pL7;
import X.C1558520qew;
import X.C1954807lC;
import X.C19719212De;
import X.C1ER1;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C632670Orh;
import X.C653660PkS;
import X.C659430Ptl;
import X.C661490Px5;
import X.C661510Px7;
import X.C668320QJi;
import X.C668420QJs;
import X.C668440QJu;
import X.C671780QWq;
import X.C672020QXo;
import X.C673770Qbn;
import X.C673780Qbo;
import X.C680740Qn2;
import X.C681430Qo9;
import X.C681620QoS;
import X.C786410Ut5;
import X.C823050WQl;
import X.C958103op;
import X.C985403tE;
import X.EnumC681490QoF;
import X.InterfaceC668720QKw;
import X.InterfaceC671770QWp;
import X.InterfaceC680760Qn4;
import X.InterfaceC681980Qp2;
import X.ViewOnAttachStateChangeListenerC655110Pmn;
import X.ViewOnAttachStateChangeListenerC656430Pov;
import X.ViewOnClickListenerC662370PyV;
import android.graphics.Rect;
import android.text.Editable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.ecommerce.search.middle.ai.ui.EcSearchMiddlePagerContainerFragment;
import com.ss.android.ugc.aweme.ecommerce.search.result.ui.HalfDynamicSearchShopFragment;
import com.ss.android.ugc.aweme.ecommerce.search.searchbar.ECSearchBarAssem;
import com.ss.android.ugc.aweme.ecommerce.search.searchbar.ISearchBarContextAbility;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.ClickSearchWord;
import com.ss.android.ugc.aweme.search.entry.searchbox.ui.SearchBoxSlotAssem;
import com.ss.android.ugc.aweme.search.middle.BaseDiscoverAndSearchFragmentNew;
import com.ss.android.ugc.aweme.search.middle.SearchResultFragmentNew;
import com.ss.android.ugc.aweme.search.model.SearchHistory;
import com.ss.android.ugc.aweme.search.pages.choosemusic.core.ui.ChooseSearchMusicFragment;
import com.ss.android.ugc.aweme.search.pages.middlepage.takoentrance.ui.MixedRoundFloatingButtonAssem;
import com.ss.android.ugc.aweme.search.pages.result.bot.component.SearchTakoVideoRootAssem;
import com.ss.android.ugc.aweme.search.pages.result.common.searchphoto.core.SearchPhotoFeedbackAssem;
import com.ss.android.ugc.aweme.search.pages.result.common.searchphoto.core.SearchPhotoHolder;
import com.ss.android.ugc.aweme.search.pages.result.common.searchphoto.core.SearchPhotoViewModel;
import com.ss.android.ugc.aweme.search.pages.result.common.searchphoto.core.SearchVisualPhotoFeedbackAssem;
import com.ss.android.ugc.aweme.search.pages.result.pov.ui.multisummary.FoldableSectionHeaderAssem;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.cs.core.ui.opt.SearchCSItemCell;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.tako.TakoSugCardItemAssem;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.governance.eventbus.IEvent;
import com.tts.oecverify.BdTuring;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS25S0001000_10;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.AwS665S0100000_16;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class ATListenerS444S0100000_10 implements View.OnTouchListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.$t) {
            case 0:
                return onTouch$0(this, view, motionEvent);
            case 1:
                return onTouch$1(this, view, motionEvent);
            case 2:
                return onTouch$2(this, view, motionEvent);
            case 3:
                return onTouch$3(this, view, motionEvent);
            case 4:
                return onTouch$4(this, view, motionEvent);
            case 5:
                return onTouch$5(this, view, motionEvent);
            case 6:
                return onTouch$6(this, view, motionEvent);
            case 7:
                return onTouch$7(this, view, motionEvent);
            case 8:
                return onTouch$8(this, view, motionEvent);
            case BdTuring.TYPE_ECAF /* 9 */:
                return onTouch$9(this, view, motionEvent);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return onTouch$10(this, view, motionEvent);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return onTouch$11(this, view, motionEvent);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return onTouch$12(this, view, motionEvent);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return onTouch$13(this, view, motionEvent);
            case 14:
                return onTouch$14(this, view, motionEvent);
            case 15:
                return onTouch$15(this, view, motionEvent);
            case 16:
                return onTouch$16(this, view, motionEvent);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return onTouch$17(this, view, motionEvent);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return onTouch$18(this, view, motionEvent);
            case 19:
                return onTouch$19(this, view, motionEvent);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return onTouch$20(this, view, motionEvent);
            case 21:
                return onTouch$21(this, view, motionEvent);
            case 22:
                return onTouch$22(this, view, motionEvent);
            case 23:
                return onTouch$23(this, view, motionEvent);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return onTouch$24(this, view, motionEvent);
            case 25:
                return onTouch$25(this, view, motionEvent);
            case 26:
                return onTouch$26(this, view, motionEvent);
            case 27:
                return onTouch$27(this, view, motionEvent);
            case 28:
                return onTouch$28(this, view, motionEvent);
            default:
                return false;
        }
    }

    public ATListenerS444S0100000_10(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean onTouch$0(ATListenerS444S0100000_10 aTListenerS444S0100000_10, View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 1) {
            ((C0PUE) aTListenerS444S0100000_10.l0).LJIIIIZZ.n4(motionEvent);
            return false;
        }
        return false;
    }

    public static final boolean onTouch$1(ATListenerS444S0100000_10 aTListenerS444S0100000_10, View view, MotionEvent motionEvent) {
        InterfaceC680760Qn4 interfaceC680760Qn4;
        if (motionEvent.getAction() == 1 && (interfaceC680760Qn4 = ((C680740Qn2) aTListenerS444S0100000_10.l0).LIZIZ.LJI) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[click] x=");
            sbLIZ.append(motionEvent.getX());
            sbLIZ.append(" y=");
            sbLIZ.append(motionEvent.getY());
            C2188811AlT.LIZIZ(sbLIZ);
            interfaceC680760Qn4.LIZ(motionEvent.getX(), motionEvent.getY());
        }
        return true;
    }

    public static final boolean onTouch$10(ATListenerS444S0100000_10 aTListenerS444S0100000_10, View view, MotionEvent motionEvent) {
        boolean z;
        if (motionEvent.getAction() == 0) {
            ((SearchBoxSlotAssem) aTListenerS444S0100000_10.l0).LLJJIII = System.currentTimeMillis();
            C1ER1.LIZIZ.LLJILLL();
        } else {
            if (motionEvent.getAction() == 3) {
                C1ER1.LIZIZ.LLJJJJJIL(((SearchBoxSlotAssem) aTListenerS444S0100000_10.l0).LLJJIII, "click_feed_searchbox", true);
                return false;
            }
            if (motionEvent.getAction() == 1) {
                int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                C1ER1 c1er1 = C1ER1.LIZIZ;
                ((SearchBoxSlotAssem) aTListenerS444S0100000_10.l0).getClass();
                float f = -scaledTouchSlop;
                if (x >= f && y >= f && x < (view.getRight() - view.getLeft()) + scaledTouchSlop && y < (view.getBottom() - view.getTop()) + scaledTouchSlop) {
                    z = true;
                } else {
                    z = false;
                }
                c1er1.LLJJJJJIL(((SearchBoxSlotAssem) aTListenerS444S0100000_10.l0).LLJJIII, "click_feed_searchbox", !z);
                return false;
            }
        }
        return false;
    }

    public static final boolean onTouch$11(ATListenerS444S0100000_10 aTListenerS444S0100000_10, View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 1 && !C0OBG.LIZIZ(view)) {
            C668440QJu c668440QJu = (C668440QJu) aTListenerS444S0100000_10.l0;
            c668440QJu.getClass();
            C1397580mTM c1397580mTM = new C1397580mTM(c668440QJu.itemView.getContext());
            c1397580mTM.LJFF(2131847151);
            c1397580mTM.LIZ(2131847138);
            C985403tE.LIZ(c1397580mTM, new AwS589S0100000_10(c668440QJu, 493));
            C1397510mTF c1397510mTF = new C1397510mTF(c1397580mTM);
            C1391850mK7.LIZIZ(c1397510mTF, "49");
            c1397510mTF.LIZLLL();
            return false;
        }
        return false;
    }

    public static final boolean onTouch$12(ATListenerS444S0100000_10 aTListenerS444S0100000_10, View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 1 && !C0OBG.LIZIZ(view)) {
            C668320QJi c668320QJi = (C668320QJi) aTListenerS444S0100000_10.l0;
            c668320QJi.getClass();
            if (C0DHG.LIZ() && C1388190mED.LIZ(c668320QJi.itemView.getContext()) != null) {
                C632670Orh.LIZIZ(c668320QJi.itemView.getContext(), new C19719212De(-1037194700, new AwS665S0100000_16(c668320QJi, 5), true));
                return false;
            }
            C1397580mTM c1397580mTM = new C1397580mTM(c668320QJi.itemView.getContext());
            c1397580mTM.LJFF(2131847151);
            c1397580mTM.LIZ(2131847138);
            C985403tE.LIZ(c1397580mTM, new AwS589S0100000_10(c668320QJi, 495));
            new C1397510mTF(c1397580mTM).LIZLLL();
            return false;
        }
        return false;
    }

    public static final boolean onTouch$13(ATListenerS444S0100000_10 aTListenerS444S0100000_10, View view, MotionEvent motionEvent) {
        SearchHistory next;
        boolean z;
        if (motionEvent.getActionMasked() == 1 && !C0OBG.LIZIZ(view)) {
            C668420QJs c668420QJs = (C668420QJs) aTListenerS444S0100000_10.l0;
            KeyboardUtils.LIZIZ(c668420QJs.itemView);
            C1440005kM.LIZ(new IEvent() { // from class: X.0QGs
                @Override // com.ss.android.ugc.governance.eventbus.IEvent
                public final /* synthetic */ IEvent post() {
                    C1440005kM.LIZ(this);
                    return this;
                }

                @Override // com.ss.android.ugc.governance.eventbus.IEvent
                public final /* synthetic */ IEvent postSticky() {
                    C1440005kM.LIZIZ(this);
                    return this;
                }
            });
            Iterator<SearchHistory> it2 = c668420QJs.LL.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (next.musicId != null) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            String str = c668420QJs.LLILLJJLI;
            String str2 = c668420QJs.LLILLL;
            if (next != null) {
                z = true;
            } else {
                z = false;
            }
            C823050WQl.LIZJ().execute(new C0QIY(str, str2, c668420QJs.LLILZ, z, "show_all", null));
        }
        return false;
    }

    public static final boolean onTouch$14(ATListenerS444S0100000_10 aTListenerS444S0100000_10, View view, MotionEvent motionEvent) {
        View view2;
        if (motionEvent.getActionMasked() == 1 && (view2 = ((TakoSugCardItemAssem) aTListenerS444S0100000_10.l0).LLJL) != null) {
            view2.performClick();
            return false;
        }
        return false;
    }

    public static final boolean onTouch$15(ATListenerS444S0100000_10 aTListenerS444S0100000_10, View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 1) {
            ((ViewOnClickListenerC662370PyV) aTListenerS444S0100000_10.l0).onClick(view);
            return false;
        }
        return false;
    }

    public static final boolean onTouch$16(ATListenerS444S0100000_10 aTListenerS444S0100000_10, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            ECSearchBarAssem eCSearchBarAssem = (ECSearchBarAssem) aTListenerS444S0100000_10.l0;
            eCSearchBarAssem.getClass();
            C672020QXo c672020QXoLIZ = C671780QWq.LIZ(C1558520qew.LJIIL(eCSearchBarAssem));
            if (c672020QXoLIZ != null) {
                c672020QXoLIZ.LIZJ("click_search_bar");
                return false;
            }
            return false;
        }
        return false;
    }

    public static final boolean onTouch$17(ATListenerS444S0100000_10 aTListenerS444S0100000_10, View view, MotionEvent motionEvent) {
        InterfaceC671770QWp interfaceC671770QWpHh1;
        if (motionEvent.getAction() == 1) {
            ECSearchBarAssem eCSearchBarAssem = (ECSearchBarAssem) aTListenerS444S0100000_10.l0;
            eCSearchBarAssem.getClass();
            ISearchBarContextAbility iSearchBarContextAbility = (ISearchBarContextAbility) C1558520qew.LIZ(C1558520qew.LJIIL(eCSearchBarAssem), ISearchBarContextAbility.class, null);
            if (iSearchBarContextAbility != null && (interfaceC671770QWpHh1 = iSearchBarContextAbility.Hh1()) != null) {
                interfaceC671770QWpHh1.vG();
                return false;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean onTouch$18(Y.ATListenerS444S0100000_10 r14, android.view.View r15, android.view.MotionEvent r16) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ATListenerS444S0100000_10.onTouch$18(Y.ATListenerS444S0100000_10, android.view.View, android.view.MotionEvent):boolean");
    }

    public static final boolean onTouch$19(ATListenerS444S0100000_10 aTListenerS444S0100000_10, View view, MotionEvent motionEvent) {
        ((ViewOnAttachStateChangeListenerC655110Pmn) aTListenerS444S0100000_10.l0).getClass();
        if (motionEvent.getActionMasked() == 1) {
            view.performClick();
            return false;
        }
        return false;
    }

    public static final boolean onTouch$2(ATListenerS444S0100000_10 aTListenerS444S0100000_10, View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 1) {
            ((View) aTListenerS444S0100000_10.l0).performClick();
            return false;
        }
        return false;
    }

    public static final boolean onTouch$20(ATListenerS444S0100000_10 aTListenerS444S0100000_10, View view, MotionEvent motionEvent) {
        InterfaceC668720QKw interfaceC668720QKw;
        SearchResultFragmentNew searchResultFragmentNewLJI;
        EcSearchMiddlePagerContainerFragment ecSearchMiddlePagerContainerFragment = (EcSearchMiddlePagerContainerFragment) aTListenerS444S0100000_10.l0;
        ecSearchMiddlePagerContainerFragment.getClass();
        if (motionEvent.getAction() == 1 && (interfaceC668720QKw = ecSearchMiddlePagerContainerFragment.LL) != null && (searchResultFragmentNewLJI = interfaceC668720QKw.LJI()) != null) {
            searchResultFragmentNewLJI.VS(motionEvent, view);
            return false;
        }
        return false;
    }

    public static final boolean onTouch$21(ATListenerS444S0100000_10 aTListenerS444S0100000_10, View view, MotionEvent motionEvent) {
        InterfaceC671770QWp interfaceC671770QWp;
        if (motionEvent.getAction() == 1) {
            EcSearchMiddlePagerContainerFragment ecSearchMiddlePagerContainerFragment = (EcSearchMiddlePagerContainerFragment) aTListenerS444S0100000_10.l0;
            C0QWQ c0qwq = ecSearchMiddlePagerContainerFragment.LLJJJJJIL;
            C128Y c128yLLLJ = null;
            if (c0qwq != null) {
                c128yLLLJ = c0qwq.LLLJ(C0QVQ.LIZ(ecSearchMiddlePagerContainerFragment));
            }
            if ((c128yLLLJ instanceof InterfaceC671770QWp) && (interfaceC671770QWp = (InterfaceC671770QWp) c128yLLLJ) != null) {
                interfaceC671770QWp.vG();
                return false;
            }
            return false;
        }
        return false;
    }

    public static final boolean onTouch$22(ATListenerS444S0100000_10 aTListenerS444S0100000_10, View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 1 && !C0OBG.LIZIZ(view)) {
            C1440005kM.LIZ(new C0QM5(false));
            C673780Qbo c673780Qbo = (C673780Qbo) aTListenerS444S0100000_10.l0;
            c673780Qbo.getClass();
            C1397580mTM c1397580mTM = new C1397580mTM(c673780Qbo.itemView.getContext());
            c1397580mTM.LJFF(2131847151);
            c1397580mTM.LIZ(2131847138);
            C985403tE.LIZ(c1397580mTM, new AwS589S0100000_10(c673780Qbo, 645));
            C1397510mTF c1397510mTF = new C1397510mTF(c1397580mTM);
            C1391850mK7.LIZIZ(c1397510mTF, "49");
            c1397510mTF.LIZLLL();
        }
        return false;
    }

    public static final boolean onTouch$23(ATListenerS444S0100000_10 aTListenerS444S0100000_10, View view, MotionEvent motionEvent) throws JSONException {
        if (motionEvent.getActionMasked() == 1 && !C0OBG.LIZIZ(view)) {
            C673770Qbn c673770Qbn = (C673770Qbn) aTListenerS444S0100000_10.l0;
            KeyboardUtils.LIZIZ(c673770Qbn.itemView);
            C1440005kM.LIZ(new IEvent() { // from class: X.0Qbc
                @Override // com.ss.android.ugc.governance.eventbus.IEvent
                public final /* synthetic */ IEvent post() {
                    C1440005kM.LIZ(this);
                    return this;
                }

                @Override // com.ss.android.ugc.governance.eventbus.IEvent
                public final /* synthetic */ IEvent postSticky() {
                    C1440005kM.LIZIZ(this);
                    return this;
                }
            });
            C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
            JSONObject jSONObject = new JSONObject();
            HashMap<String, Object> map = c673770Qbn.LLILLJJLI;
            if (map != null) {
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
            }
            jSONObject.put("action_type", "show_all");
            c1507790pL7.getClass();
            C1507790pL7.LIZLLL("search_history", jSONObject);
            return false;
        }
        return false;
    }

    public static final boolean onTouch$24(ATListenerS444S0100000_10 aTListenerS444S0100000_10, View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 1) {
            ((Function0) aTListenerS444S0100000_10.l0).invoke();
            return false;
        }
        return false;
    }

    public static final boolean onTouch$25(ATListenerS444S0100000_10 aTListenerS444S0100000_10, View view, MotionEvent motionEvent) {
        ((BaseDiscoverAndSearchFragmentNew) aTListenerS444S0100000_10.l0).VS(motionEvent, view);
        return false;
    }

    public static final boolean onTouch$26(ATListenerS444S0100000_10 aTListenerS444S0100000_10, View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 1) {
            view.performClick();
            SearchPhotoFeedbackAssem searchPhotoFeedbackAssem = (SearchPhotoFeedbackAssem) aTListenerS444S0100000_10.l0;
            C659430Ptl.LIZ(motionEvent, searchPhotoFeedbackAssem.LLJJJJLIIL, ((SearchPhotoViewModel) searchPhotoFeedbackAssem.LLJJJJ.getValue()).LL, ((SearchPhotoFeedbackAssem) aTListenerS444S0100000_10.l0).LLJJJJJIL);
            return false;
        }
        return false;
    }

    public static final boolean onTouch$27(ATListenerS444S0100000_10 aTListenerS444S0100000_10, View view, MotionEvent motionEvent) {
        if (C0BRL.LIZ() && motionEvent.getActionMasked() == 1) {
            ((SearchPhotoHolder) aTListenerS444S0100000_10.l0).n4(motionEvent);
            return false;
        }
        return false;
    }

    public static final boolean onTouch$28(ATListenerS444S0100000_10 aTListenerS444S0100000_10, View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 1) {
            view.performClick();
            SearchVisualPhotoFeedbackAssem searchVisualPhotoFeedbackAssem = (SearchVisualPhotoFeedbackAssem) aTListenerS444S0100000_10.l0;
            C659430Ptl.LIZ(motionEvent, searchVisualPhotoFeedbackAssem.LLJJJJLIIL, ((SearchPhotoViewModel) searchVisualPhotoFeedbackAssem.LLJJJJ.getValue()).LL, ((SearchVisualPhotoFeedbackAssem) aTListenerS444S0100000_10.l0).LLJJJJJIL);
            return false;
        }
        return false;
    }

    public static final boolean onTouch$3(ATListenerS444S0100000_10 aTListenerS444S0100000_10, View view, MotionEvent motionEvent) {
        String string;
        boolean z;
        Editable editableLLLLJI;
        boolean z2 = true;
        if (motionEvent.getAction() == 1) {
            ChooseSearchMusicFragment chooseSearchMusicFragment = (ChooseSearchMusicFragment) aTListenerS444S0100000_10.l0;
            chooseSearchMusicFragment.cS();
            C0I7D c0i7d = chooseSearchMusicFragment.LLJIJIL;
            if (c0i7d == null || (editableLLLLJI = C2204961BRm.LLLLJI(c0i7d, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmtYo3N1HzhDDRLpI7nb2pWYPuNWKQF85S7SSzZqWMoE3l8SV3s2wuFChV0WmsSDAMzhY5+soLhTPw=", null))) == null || (string = editableLLLLJI.toString()) == null) {
                string = "";
            }
            if (chooseSearchMusicFragment.PR().getState().LL == 0) {
                z = true;
            } else {
                z = false;
            }
            chooseSearchMusicFragment.LLJJJIL = z;
            if (!TextUtils.isEmpty(string)) {
                chooseSearchMusicFragment.PR().setState(new AwS25S0001000_10(2, 8));
                chooseSearchMusicFragment.aS(false);
                chooseSearchMusicFragment.MR(false);
            } else {
                chooseSearchMusicFragment.WR(false);
                chooseSearchMusicFragment.aS(C681430Qo9.LIZ());
                if (!C681620QoS.LIZLLL() || !(!chooseSearchMusicFragment.LLLFZ.isEmpty())) {
                    z2 = false;
                }
                chooseSearchMusicFragment.MR(z2);
            }
            chooseSearchMusicFragment.LLJJIJIL = null;
            ((C0Q94) chooseSearchMusicFragment.LLLI.getValue()).LIZJ();
            ((InterfaceC681980Qp2) chooseSearchMusicFragment.LLL.getValue()).setLastSearchSoundPage(EnumC681490QoF.SEARCH_SUG_PAGE);
        }
        return false;
    }

    public static final boolean onTouch$4(ATListenerS444S0100000_10 aTListenerS444S0100000_10, View view, MotionEvent motionEvent) {
        LinearLayout linearLayout;
        boolean z;
        Rect rect;
        C0QS5 c0qs5;
        MixedRoundFloatingButtonAssem mixedRoundFloatingButtonAssem = (MixedRoundFloatingButtonAssem) aTListenerS444S0100000_10.l0;
        LinearLayout linearLayout2 = mixedRoundFloatingButtonAssem.LLJZ;
        if (linearLayout2 != null && (linearLayout = mixedRoundFloatingButtonAssem.LLJLLL) != null && view.getWidth() > 0 && view.getHeight() > 0 && linearLayout2.getWidth() > 0 && linearLayout.getWidth() > 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (!new Rect(0, 0, view.getWidth(), view.getHeight()).contains(x, y)) {
                ((MixedRoundFloatingButtonAssem) aTListenerS444S0100000_10.l0).LLL = null;
                return false;
            }
            ((MixedRoundFloatingButtonAssem) aTListenerS444S0100000_10.l0).getClass();
            Rect rectMp = MixedRoundFloatingButtonAssem.mp(view, linearLayout2);
            ((MixedRoundFloatingButtonAssem) aTListenerS444S0100000_10.l0).getClass();
            Rect rectMp2 = MixedRoundFloatingButtonAssem.mp(view, linearLayout);
            if (!rectMp.contains(x, y) && !rectMp2.contains(x, y)) {
                ((MixedRoundFloatingButtonAssem) aTListenerS444S0100000_10.l0).getClass();
                if (rectMp.centerX() < rectMp2.centerX()) {
                    z = true;
                    rect = rectMp;
                    rectMp = rectMp2;
                } else {
                    z = false;
                    rect = rectMp2;
                }
                if (x <= (rect.right + rectMp.left) / 2) {
                    if (z) {
                        c0qs5 = C0QS5.LL;
                    } else {
                        c0qs5 = C0QS5.LLILLJJLI;
                    }
                } else if (z) {
                    c0qs5 = C0QS5.LLILLJJLI;
                } else {
                    c0qs5 = C0QS5.LL;
                }
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked != 0) {
                    if (actionMasked != 1) {
                        if (actionMasked != 3) {
                            if (((MixedRoundFloatingButtonAssem) aTListenerS444S0100000_10.l0).LLL == null) {
                                return false;
                            }
                        } else {
                            ((MixedRoundFloatingButtonAssem) aTListenerS444S0100000_10.l0).LLL = null;
                            return false;
                        }
                    } else {
                        if (((MixedRoundFloatingButtonAssem) aTListenerS444S0100000_10.l0).LLL == c0qs5) {
                            int iOrdinal = c0qs5.ordinal();
                            if (iOrdinal != 0) {
                                if (iOrdinal == 1) {
                                    MixedRoundFloatingButtonAssem mixedRoundFloatingButtonAssem2 = (MixedRoundFloatingButtonAssem) aTListenerS444S0100000_10.l0;
                                    mixedRoundFloatingButtonAssem2.lp(mixedRoundFloatingButtonAssem2.LLJILJIL, false, false);
                                } else {
                                    throw new C1954807lC();
                                }
                            } else {
                                MixedRoundFloatingButtonAssem mixedRoundFloatingButtonAssem3 = (MixedRoundFloatingButtonAssem) aTListenerS444S0100000_10.l0;
                                mixedRoundFloatingButtonAssem3.getClass();
                                C0QSC.LIZ.getClass();
                                if (C0QSC.LIZ()) {
                                    mixedRoundFloatingButtonAssem3.lp(mixedRoundFloatingButtonAssem3.LLJLILLLLZIIL, true, ((Boolean) mixedRoundFloatingButtonAssem3.LLLF.getValue()).booleanValue());
                                } else {
                                    mixedRoundFloatingButtonAssem3.op();
                                }
                            }
                        }
                        ((MixedRoundFloatingButtonAssem) aTListenerS444S0100000_10.l0).LLL = null;
                    }
                } else {
                    ((MixedRoundFloatingButtonAssem) aTListenerS444S0100000_10.l0).LLL = c0qs5;
                }
                return true;
            }
            ((MixedRoundFloatingButtonAssem) aTListenerS444S0100000_10.l0).LLL = null;
        }
        return false;
    }

    public static final boolean onTouch$5(ATListenerS444S0100000_10 aTListenerS444S0100000_10, View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 1) {
            ((SearchTakoVideoRootAssem) aTListenerS444S0100000_10.l0).LJJIJL().performClick();
            return false;
        }
        return false;
    }

    public static final boolean onTouch$6(ATListenerS444S0100000_10 aTListenerS444S0100000_10, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1 && action != 3) {
                return false;
            }
            TuxTextView tuxTextView = ((FoldableSectionHeaderAssem) aTListenerS444S0100000_10.l0).LLJLLL;
            if (tuxTextView != null) {
                C786410Ut5.B5(tuxTextView, 1.0f);
            }
            ImageView imageView = ((FoldableSectionHeaderAssem) aTListenerS444S0100000_10.l0).LLJZ;
            if (imageView == null) {
                return false;
            }
            C786410Ut5.V4(imageView, 1.0f);
            return false;
        }
        TuxTextView tuxTextView2 = ((FoldableSectionHeaderAssem) aTListenerS444S0100000_10.l0).LLJLLL;
        if (tuxTextView2 != null) {
            C786410Ut5.B5(tuxTextView2, 0.5f);
        }
        ImageView imageView2 = ((FoldableSectionHeaderAssem) aTListenerS444S0100000_10.l0).LLJZ;
        if (imageView2 == null) {
            return false;
        }
        C786410Ut5.V4(imageView2, 0.5f);
        return false;
    }

    public static final boolean onTouch$7(ATListenerS444S0100000_10 aTListenerS444S0100000_10, View view, MotionEvent motionEvent) {
        C0PUL item;
        ClickSearchWord clickSearchWord;
        C653660PkS c653660PkS;
        String str;
        if (motionEvent.getActionMasked() == 1 && !C0OBG.LIZIZ(view) && (item = ((SearchCSItemCell) aTListenerS444S0100000_10.l0).getItem()) != null && (clickSearchWord = item.LL) != null) {
            C0PV3 c0pv3 = C0PV3.LIZ;
            SearchCSItemCell searchCSItemCell = (SearchCSItemCell) aTListenerS444S0100000_10.l0;
            View view2 = searchCSItemCell.itemView;
            C0PUL item2 = searchCSItemCell.getItem();
            C0PUB c0pub = null;
            if (item2 != null) {
                c653660PkS = item2.LLILLJJLI;
            } else {
                c653660PkS = null;
            }
            C0PUL item3 = ((SearchCSItemCell) aTListenerS444S0100000_10.l0).getItem();
            if (item3 != null) {
                str = item3.LLILLL;
            } else {
                str = null;
            }
            C0PUL item4 = ((SearchCSItemCell) aTListenerS444S0100000_10.l0).getItem();
            if (item4 != null) {
                c0pub = item4.LLILZ;
            }
            c0pv3.getClass();
            C0PV3.LIZ(clickSearchWord, view2, c653660PkS, str, c0pub);
            return false;
        }
        return false;
    }

    public static final boolean onTouch$8(ATListenerS444S0100000_10 aTListenerS444S0100000_10, View view, MotionEvent motionEvent) {
        Integer numValueOf;
        if (motionEvent != null && (numValueOf = Integer.valueOf(motionEvent.getAction())) != null) {
            if (numValueOf.intValue() == 0) {
                ((HalfDynamicSearchShopFragment) aTListenerS444S0100000_10.l0).LLJ = motionEvent.getX();
                ((HalfDynamicSearchShopFragment) aTListenerS444S0100000_10.l0).LLJI = motionEvent.getY();
                return true;
            }
            if (numValueOf.intValue() == 2) {
                float fAbs = Math.abs(motionEvent.getY() - ((HalfDynamicSearchShopFragment) aTListenerS444S0100000_10.l0).LLJI);
                float fAbs2 = Math.abs(motionEvent.getX() - ((HalfDynamicSearchShopFragment) aTListenerS444S0100000_10.l0).LLJ);
                float y = motionEvent.getY();
                HalfDynamicSearchShopFragment halfDynamicSearchShopFragment = (HalfDynamicSearchShopFragment) aTListenerS444S0100000_10.l0;
                if (y > halfDynamicSearchShopFragment.LLJI && fAbs > fAbs2 && fAbs > C958103op.LJ) {
                    halfDynamicSearchShopFragment.dismiss();
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static final boolean onTouch$9(ATListenerS444S0100000_10 aTListenerS444S0100000_10, View view, MotionEvent motionEvent) {
        C661490Px5 c661490Px5I1;
        if (motionEvent.getActionMasked() != 1 || C0OBG.LIZIZ(view)) {
            return false;
        }
        ViewOnAttachStateChangeListenerC656430Pov viewOnAttachStateChangeListenerC656430Pov = (ViewOnAttachStateChangeListenerC656430Pov) aTListenerS444S0100000_10.l0;
        if (viewOnAttachStateChangeListenerC656430Pov.I1() != null && viewOnAttachStateChangeListenerC656430Pov.LLJILJIL != null && (c661490Px5I1 = viewOnAttachStateChangeListenerC656430Pov.I1()) != null && c661490Px5I1.LIZJ != null) {
            C661490Px5 c661490Px5I12 = viewOnAttachStateChangeListenerC656430Pov.I1();
            C661510Px7.LIZ.getClass();
            C661510Px7.LIZ(c661490Px5I12, true, false);
            View.OnClickListener onClickListener = viewOnAttachStateChangeListenerC656430Pov.LLJJJJJIL;
            if (onClickListener != null) {
                onClickListener.onClick(viewOnAttachStateChangeListenerC656430Pov.LLJILJIL);
            }
        }
        return false;
    }
}
