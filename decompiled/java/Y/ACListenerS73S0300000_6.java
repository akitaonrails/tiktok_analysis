package Y;

import X.C0HA0;
import X.C0HDV;
import X.C0HF2;
import X.C0HF3;
import X.C0I0Y;
import X.C0I6S;
import X.C0I6V;
import X.C0K1D;
import X.C0WZX;
import X.C1388190mED;
import X.C1389890mGx;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1721980uua;
import X.C197039127h;
import X.C19EG;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C23250099c;
import X.C424100Gk4;
import X.C425500GmK;
import X.C426500Gnw;
import X.C432270GxF;
import X.C435220H4u;
import X.C436570H9z;
import X.C450510HlZ;
import X.C450530Hlb;
import X.C450730Hlv;
import X.C450970HmJ;
import X.C450980HmK;
import X.C451030HmP;
import X.C451050HmR;
import X.C452150HoD;
import X.C786410Ut5;
import X.C869590Y9l;
import X.EnumC451180Hme;
import X.InterfaceC432280GxG;
import X.InterfaceC434700H2u;
import X.InterfaceC449850HkV;
import X.InterfaceC451150Hmb;
import X.InterfaceC461490I7v;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleKt;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.sticker.typing.TypingStickerPowerCell;
import com.ss.android.ugc.aweme.emoji.common.emojipagev2.SystemBigGridAdapter;
import com.ss.android.ugc.aweme.emoji.model.Emoji;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.common.model.IMGiphyInfo;
import com.ss.android.ugc.aweme.im.common.model.SetSticker;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import com.ss.android.ugc.aweme.im.common.model.VideoSticker;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListStickerClickAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListTextBigEmojiClickAbility;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.text.content.TextBigEmojiAssem;
import com.ss.android.ugc.aweme.im.sticker.impl.ui.StickerGridAdapter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.util.IStickerCreationEntranceHelper;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes7.dex */
public class ACListenerS73S0300000_6 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // android.view.View.OnClickListener
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
            case 7:
                onClick$7(this, view);
                break;
            case 8:
                onClick$8(this, view);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onClick$9(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onClick$10(this, view);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onClick$11(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onClick$12(this, view);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onClick$13(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS73S0300000_6 aCListenerS73S0300000_6, View view) {
        ((C0HA0) aCListenerS73S0300000_6.l0).LIZIZ.invoke((Context) aCListenerS73S0300000_6.l1, (FrameLayout) aCListenerS73S0300000_6.l2);
        PopupWindow popupWindow = C436570H9z.LIZIZ;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    public static final void onClick$1(ACListenerS73S0300000_6 aCListenerS73S0300000_6, View view) {
        C1721980uua c1721980uua = (C1721980uua) aCListenerS73S0300000_6.l0;
        EditText editText = (EditText) aCListenerS73S0300000_6.l1;
        String string = ((C197039127h) aCListenerS73S0300000_6.l2).getText().toString();
        c1721980uua.e0();
        int selectionStart = editText.getSelectionStart();
        int selectionEnd = editText.getSelectionEnd();
        C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEgAjS8/YVFkiQFyUb/aLhwMOXCw4YwRSzxfnVPcxJoskQoC66PRHLsUZ7j4+9lIy/3EcqONU4Pr7m8E=", null)).replace(Math.min(selectionStart, selectionEnd), Math.max(selectionStart, selectionEnd), string, 0, string.length());
    }

    public static final void onClick$10(ACListenerS73S0300000_6 aCListenerS73S0300000_6, View view) {
        String type;
        int iIntValue;
        String url;
        Integer height;
        Integer width;
        C0I0Y c0i0y;
        String id = null;
        if (((C451030HmP) aCListenerS73S0300000_6.l0).LIZLLL()) {
            View viewFindViewById = view.findViewById(R.id.gzy);
            if (viewFindViewById == null) {
                return;
            }
            if ((viewFindViewById instanceof C0I0Y) && (c0i0y = (C0I0Y) viewFindViewById) != null) {
                c0i0y.setImageCrashFixTag("SystemBigGridAdapter");
            }
            ((SystemBigGridAdapter) aCListenerS73S0300000_6.l1).LLLI().LIZ(viewFindViewById, (C451030HmP) aCListenerS73S0300000_6.l0);
            ((SystemBigGridAdapter) aCListenerS73S0300000_6.l1).getClass();
            return;
        }
        SetSticker setSticker = ((C451030HmP) aCListenerS73S0300000_6.l0).LJ;
        if (setSticker != null && setSticker.getStickerId() != null) {
            ((SystemBigGridAdapter) aCListenerS73S0300000_6.l1).LLLI().LJFF(((C451030HmP) aCListenerS73S0300000_6.l0).LJ, null);
            return;
        }
        VideoSticker videoSticker = ((C451030HmP) aCListenerS73S0300000_6.l0).LJFF;
        if (videoSticker != null && videoSticker.getVideoStickerId() != null) {
            ((SystemBigGridAdapter) aCListenerS73S0300000_6.l1).LLLI().LJFF(((C451030HmP) aCListenerS73S0300000_6.l0).LJFF, null);
            return;
        }
        if (((C451030HmP) aCListenerS73S0300000_6.l0).LJI != null) {
            C451030HmP c451030HmP = new C451030HmP();
            C451030HmP c451030HmP2 = (C451030HmP) aCListenerS73S0300000_6.l0;
            Emoji emoji = new Emoji();
            IMGiphyInfo iMGiphyInfo = c451030HmP2.LJI;
            if (iMGiphyInfo != null) {
                type = iMGiphyInfo.getType();
            } else {
                type = null;
            }
            emoji.setAnimateType(type);
            emoji.setStickerType(3);
            IMGiphyInfo iMGiphyInfo2 = c451030HmP2.LJI;
            int iIntValue2 = 200;
            if (iMGiphyInfo2 != null && (width = iMGiphyInfo2.getWidth()) != null) {
                iIntValue = width.intValue();
            } else {
                iIntValue = 200;
            }
            emoji.setWidth(iIntValue);
            IMGiphyInfo iMGiphyInfo3 = c451030HmP2.LJI;
            if (iMGiphyInfo3 != null && (height = iMGiphyInfo3.getHeight()) != null) {
                iIntValue2 = height.intValue();
            }
            emoji.setHeight(iIntValue2);
            UrlModel urlModel = new UrlModel();
            IMGiphyInfo iMGiphyInfo4 = c451030HmP2.LJI;
            if (iMGiphyInfo4 != null) {
                url = iMGiphyInfo4.getUrl();
            } else {
                url = null;
            }
            urlModel.setUrlList(Collections.singletonList(url));
            emoji.setAnimateUrl(urlModel);
            IMGiphyInfo iMGiphyInfo5 = c451030HmP2.LJI;
            if (iMGiphyInfo5 != null) {
                id = iMGiphyInfo5.getId();
            }
            emoji.setStickerId(id);
            c451030HmP.LIZJ = emoji;
            ((SystemBigGridAdapter) aCListenerS73S0300000_6.l1).LLLI().LIZ(((C450970HmJ) aCListenerS73S0300000_6.l2).itemView, c451030HmP);
        }
    }

    public static final void onClick$11(ACListenerS73S0300000_6 aCListenerS73S0300000_6, View view) {
        int bindingAdapterPosition = ((TypingStickerPowerCell) aCListenerS73S0300000_6.l0).getBindingAdapterPosition();
        if (bindingAdapterPosition != -1) {
            ((C452150HoD) aCListenerS73S0300000_6.l1).LLILZIL.invoke((StickerItem) aCListenerS73S0300000_6.l2, Integer.valueOf(bindingAdapterPosition));
        }
    }

    public static final void onClick$12(ACListenerS73S0300000_6 aCListenerS73S0300000_6, View view) {
        int iIntValue;
        Rect rectLIZ = C451050HmR.LIZ(view);
        C451030HmP c451030HmP = (C451030HmP) aCListenerS73S0300000_6.l0;
        if (c451030HmP instanceof C450730Hlv) {
            ((StickerGridAdapter) aCListenerS73S0300000_6.l1).LLLI().LIZIZ(((C450730Hlv) ((C451030HmP) aCListenerS73S0300000_6.l0)).LJIIIZ, rectLIZ);
            return;
        }
        InterfaceC451150Hmb interfaceC451150Hmb = c451030HmP.LJFF;
        if (interfaceC451150Hmb == null && (interfaceC451150Hmb = c451030HmP.LJ) == null) {
            interfaceC451150Hmb = c451030HmP.LJI;
        }
        boolean z = interfaceC451150Hmb instanceof SetSticker;
        if (z) {
            Integer stickerType = ((SetSticker) interfaceC451150Hmb).getStickerType();
            int type = EnumC451180Hme.AIMOJI_STICKER_STATIC.getType();
            if (stickerType != null && stickerType.intValue() == type) {
                ((StickerGridAdapter) aCListenerS73S0300000_6.l1).LLLI().LJFF((InterfaceC449850HkV) interfaceC451150Hmb, rectLIZ);
                return;
            }
        }
        if (((C451030HmP) aCListenerS73S0300000_6.l0).LIZLLL()) {
            ((StickerGridAdapter) aCListenerS73S0300000_6.l1).LLLI().LIZ(view.findViewById(R.id.gzy), (C451030HmP) aCListenerS73S0300000_6.l0);
            ((StickerGridAdapter) aCListenerS73S0300000_6.l1).getClass();
            return;
        }
        if (z && ((SetSticker) interfaceC451150Hmb).getStickerId() != null) {
            ((StickerGridAdapter) aCListenerS73S0300000_6.l1).LLLI().LJFF((InterfaceC449850HkV) interfaceC451150Hmb, rectLIZ);
            return;
        }
        if ((interfaceC451150Hmb instanceof VideoSticker) && ((VideoSticker) interfaceC451150Hmb).getVideoStickerId() != null) {
            ((StickerGridAdapter) aCListenerS73S0300000_6.l1).LLLI().LJFF((InterfaceC449850HkV) interfaceC451150Hmb, rectLIZ);
            return;
        }
        Integer numLIZIZ = ((C451030HmP) aCListenerS73S0300000_6.l0).LIZIZ();
        int type2 = EnumC451180Hme.ENTRANCE.getType();
        if (numLIZIZ != null && numLIZIZ.intValue() == type2) {
            IStickerCreationEntranceHelper.LIZ.getClass();
            IStickerCreationEntranceHelper iStickerCreationEntranceHelperLIZ = C450510HlZ.LIZ();
            if (iStickerCreationEntranceHelperLIZ == null) {
                return;
            }
            iStickerCreationEntranceHelperLIZ.LIZ(((C450970HmJ) aCListenerS73S0300000_6.l2).itemView.getContext(), ((StickerGridAdapter) aCListenerS73S0300000_6.l1).LLLI());
            return;
        }
        if (!(interfaceC451150Hmb instanceof IMGiphyInfo)) {
            return;
        }
        C451030HmP c451030HmP2 = new C451030HmP();
        Emoji emoji = new Emoji();
        IMGiphyInfo iMGiphyInfo = (IMGiphyInfo) interfaceC451150Hmb;
        emoji.setAnimateType(iMGiphyInfo.getType());
        emoji.setStickerType(3);
        Integer width = iMGiphyInfo.getWidth();
        int iIntValue2 = 200;
        if (width != null) {
            iIntValue = width.intValue();
        } else {
            iIntValue = 200;
        }
        emoji.setWidth(iIntValue);
        Integer height = iMGiphyInfo.getHeight();
        if (height != null) {
            iIntValue2 = height.intValue();
        }
        emoji.setHeight(iIntValue2);
        UrlModel urlModel = new UrlModel();
        urlModel.setUrlList(Collections.singletonList(iMGiphyInfo.getUrl()));
        emoji.setAnimateUrl(urlModel);
        emoji.setStickerId(iMGiphyInfo.getId());
        c451030HmP2.LIZJ = emoji;
        c451030HmP2.LJI = iMGiphyInfo;
        ((StickerGridAdapter) aCListenerS73S0300000_6.l1).LLLI().LIZ(((C450970HmJ) aCListenerS73S0300000_6.l2).itemView, c451030HmP2);
    }

    public static final void onClick$13(ACListenerS73S0300000_6 aCListenerS73S0300000_6, View view) {
        C450730Hlv c450730Hlv;
        StickerItem stickerItem;
        Function1<StickerItem, Unit> function1;
        C451030HmP c451030HmP = (C451030HmP) aCListenerS73S0300000_6.l0;
        if ((c451030HmP instanceof C450730Hlv) && (c450730Hlv = (C450730Hlv) c451030HmP) != null && (stickerItem = c450730Hlv.LJIIIZ) != null && (function1 = ((C450530Hlb) aCListenerS73S0300000_6.l2).LJIJI) != null) {
            function1.invoke(stickerItem);
        }
        Activity activityLIZ = C1388190mED.LIZ((Context) aCListenerS73S0300000_6.l1);
        if (activityLIZ != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
            c1389890mGx.LJIIIZ(2131835847);
            c1389890mGx.LJIIJJI();
        }
        ((C450530Hlb) aCListenerS73S0300000_6.l2).LJIIJ();
    }

    public static final void onClick$2(ACListenerS73S0300000_6 aCListenerS73S0300000_6, View view) {
        C1721980uua c1721980uua = (C1721980uua) aCListenerS73S0300000_6.l0;
        EditText editText = (EditText) aCListenerS73S0300000_6.l1;
        String string = ((C197039127h) aCListenerS73S0300000_6.l2).getText().toString();
        c1721980uua.e0();
        String string2 = C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEgAjS8/YVFkiQFyUb/aLhwMOXCw4YwRSzxfnVPcxJoskQoC66PRHLsUZ7j4+9lIy/3EcqONU4Pr7m8E=", null)).toString();
        int selectionStart = editText.getSelectionStart();
        int selectionEnd = editText.getSelectionEnd();
        int iMin = Math.min(selectionStart, selectionEnd);
        int iMax = Math.max(selectionStart, selectionEnd);
        String strSubstring = string2.substring(iMin, iMax);
        if (a0.LJJIIZI(string2, string, false) && !a0.LJJIIZI(strSubstring, string, false)) {
            return;
        }
        if (iMin == 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('0');
            sbLIZ.append(string);
            string = C2188811AlT.LIZIZ(sbLIZ);
        }
        C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEgAjS8/YVFkiQFyUb/aLhwMOXCw4YwRSzxfnVPcxJoskQoC66PRHLsUZ7j4+9lIy/3EcqONU4Pr7m8E=", null)).replace(iMin, iMax, string, 0, string.length());
    }

    public static final void onClick$3(ACListenerS73S0300000_6 aCListenerS73S0300000_6, View view) {
        FragmentManager supportFragmentManager;
        MessageListStickerClickAbility messageListStickerClickAbility = (MessageListStickerClickAbility) C1558520qew.LIZ(C1558360qeg.LJ((SmartImageView) aCListenerS73S0300000_6.l0, null), MessageListStickerClickAbility.class, null);
        if (messageListStickerClickAbility == null) {
            return;
        }
        SmartImageView smartImageView = (SmartImageView) aCListenerS73S0300000_6.l0;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(smartImageView.getContext());
        if (c19egLIZIZ != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
            messageListStickerClickAbility.up1(smartImageView, supportFragmentManager, (C869590Y9l) aCListenerS73S0300000_6.l1, ((C0I6S) ((C0I6V) aCListenerS73S0300000_6.l2)).LIZ);
        }
    }

    public static final void onClick$4(ACListenerS73S0300000_6 aCListenerS73S0300000_6, View view) {
        ((MessageListTextBigEmojiClickAbility) aCListenerS73S0300000_6.l0).B21(((TextBigEmojiAssem) aCListenerS73S0300000_6.l1).getContentView(), ((InterfaceC461490I7v) aCListenerS73S0300000_6.l2).LJIILL().toString());
    }

    public static final void onClick$5(ACListenerS73S0300000_6 aCListenerS73S0300000_6, View view) {
        Function1<? super Aweme, Unit> function1;
        if (Intrinsics.LJFF(((LinkedHashMap) ((C426500Gnw) aCListenerS73S0300000_6.l0).LLILLL).get((SmartImageView) aCListenerS73S0300000_6.l1), Boolean.TRUE) && (function1 = ((C426500Gnw) aCListenerS73S0300000_6.l0).LL) != null) {
            function1.invoke((Aweme) aCListenerS73S0300000_6.l2);
        }
    }

    public static final void onClick$6(ACListenerS73S0300000_6 aCListenerS73S0300000_6, View view) {
        C0K1D c0k1d = (C0K1D) aCListenerS73S0300000_6.l0;
        boolean z = !c0k1d.LLILZ;
        c0k1d.LLILZ = z;
        C435220H4u c435220H4u = (C435220H4u) aCListenerS73S0300000_6.l1;
        c435220H4u.LLILLJJLI = !z;
        c435220H4u.notifyDataSetChanged();
        C0K1D c0k1d2 = (C0K1D) aCListenerS73S0300000_6.l0;
        Context context = (Context) aCListenerS73S0300000_6.l2;
        if (c0k1d2.LLILZ) {
            TextView textView = c0k1d2.LLJI;
            if (textView != null) {
                textView.setText(context.getString(2131839358));
            }
            ImageView imageView = c0k1d2.LLJIJIL;
            if (imageView != null) {
                C786410Ut5.Cb(imageView, 180.0f);
                return;
            }
            return;
        }
        TextView textView2 = c0k1d2.LLJI;
        if (textView2 != null) {
            textView2.setText(context.getString(2131839359));
        }
        ImageView imageView2 = c0k1d2.LLJIJIL;
        if (imageView2 == null) {
            return;
        }
        C786410Ut5.Cb(imageView2, 0.0f);
    }

    public static final void onClick$7(ACListenerS73S0300000_6 aCListenerS73S0300000_6, View view) {
        C425500GmK c425500GmK = (C425500GmK) aCListenerS73S0300000_6.l0;
        InterfaceC434700H2u interfaceC434700H2u = c425500GmK.LLILZ;
        if (interfaceC434700H2u != null) {
            C23250099c.LIZLLL(LifecycleKt.androidx_lifecycle_LifecycleKt_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_getCoroutineScope((Lifecycle) aCListenerS73S0300000_6.l1), null, null, new C432270GxF((InterfaceC432280GxG) aCListenerS73S0300000_6.l2, interfaceC434700H2u, c425500GmK, null), 3);
        }
    }

    public static final void onClick$8(ACListenerS73S0300000_6 aCListenerS73S0300000_6, View view) {
        int bindingAdapterPosition = ((C0HF3) aCListenerS73S0300000_6.l0).getBindingAdapterPosition();
        if (bindingAdapterPosition != -1 && bindingAdapterPosition < ((ArrayList) ((C0HF2) aCListenerS73S0300000_6.l1).LLILLJJLI).size()) {
            C0HF2 c0hf2 = (C0HF2) aCListenerS73S0300000_6.l1;
            int i = c0hf2.LLILLL;
            c0hf2.LLILLL = bindingAdapterPosition;
            if (i >= 0 && i < ((ArrayList) c0hf2.LLILLJJLI).size()) {
                c0hf2.notifyItemChanged(i);
            }
            if (bindingAdapterPosition >= 0 && bindingAdapterPosition < ((ArrayList) c0hf2.LLILLJJLI).size()) {
                c0hf2.notifyItemChanged(bindingAdapterPosition);
            }
            ((C0HF2) aCListenerS73S0300000_6.l1).LL.invoke((Aweme) aCListenerS73S0300000_6.l2, Integer.valueOf(bindingAdapterPosition));
        }
    }

    public static final void onClick$9(ACListenerS73S0300000_6 aCListenerS73S0300000_6, View view) {
        int iHashCode = ((View) aCListenerS73S0300000_6.l0).hashCode();
        ConcurrentHashMap<Integer, Boolean> concurrentHashMap = C0HDV.LIZJ;
        if (concurrentHashMap.get(Integer.valueOf(iHashCode)) == null || Intrinsics.LJFF(concurrentHashMap.get(Integer.valueOf(iHashCode)), Boolean.FALSE)) {
            concurrentHashMap.put(Integer.valueOf(iHashCode), Boolean.TRUE);
            C786410Ut5.LJLIIL(800L, ((View) aCListenerS73S0300000_6.l0).getHandler(), new ARunnableS1S0001000_6(iHashCode, 1));
            ((C424100Gk4) aCListenerS73S0300000_6.l1).LIZIZ.onClick((View) aCListenerS73S0300000_6.l2);
        }
    }

    public ACListenerS73S0300000_6(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }

    public ACListenerS73S0300000_6(C451030HmP c451030HmP, SystemBigGridAdapter systemBigGridAdapter, int i, C450970HmJ c450970HmJ, int i2) {
        this.$t = i2;
        this.l0 = c451030HmP;
        this.l1 = systemBigGridAdapter;
        this.l2 = c450970HmJ;
    }

    public ACListenerS73S0300000_6(C451030HmP c451030HmP, StickerGridAdapter stickerGridAdapter, int i, C450980HmK c450980HmK, int i2) {
        this.$t = i2;
        this.l0 = c451030HmP;
        this.l1 = stickerGridAdapter;
        this.l2 = c450980HmK;
    }
}
