package X;

import Y.ACListenerS152S0100000_17;
import Y.AUListenerS266S0100000_17;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.dynamicstrategy.PsInteractiveCount;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.setting.LiveMinusOneScreenTipsInFeedSetting;
import com.bytedance.android.livesdk.dataChannel.LiveExtendedScreenStatus;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.livesetting.publicscreen.BadgeCacheOptimizeEnableSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveExtendedScreenGiftOptimizeSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon;
import com.bytedance.android.livesdkapi.host.IHostFrescoHelper;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS157S0101000_17;
import kotlin.jvm.internal.AwS383S0200000_17;
import kotlin.jvm.internal.AwS453S0200000_17;
import wh6.AbS698S0100000_17;

/* JADX INFO: renamed from: X.0f1N, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1111150f1N extends AbstractC1111060f1E<C1111000f18> {
    public final C421320Gfa LLILZIL;
    public final TextView LLILZLL;
    public final C0KVZ LLIZ;
    public final C0KVZ LLIZLLLIL;
    public final TextView LLJ;
    public final C1126540fQC LLJI;
    public final View LLJIJIL;
    public final TextView LLJILJIL;
    public final TextView LLJILJILJ;
    public ValueAnimator LLJILLL;
    public int LLJJ;

    @Override // X.AbstractC1111020f1A
    public final void LLIILZL() {
        AbstractC1113530f5D abstractC1113530f5D = this.LLILZ;
        if (abstractC1113530f5D != null) {
            abstractC1113530f5D.LJIIIIZZ();
        }
        U5();
        this.LLJJ = 0;
        super.LLIILZL();
        this.LLIZ.LIZ();
        this.LLIZLLLIL.LIZ();
    }

    public final void U5() {
        ValueAnimator valueAnimator = this.LLJILLL;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
        }
        ValueAnimator valueAnimator2 = this.LLJILLL;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.LLJILLL = null;
    }

    public final void R5(String str) {
        C1109770ez9 c1109770ez9 = this.LL;
        if (c1109770ez9 != null) {
            AbstractC1110800f0o<? extends AbstractC1136060ffY> abstractC1110800f0o = this.LLILLJJLI;
            C1111350f1h c1111350f1h = new C1111350f1h();
            c1111350f1h.LJFF = str;
            c1111350f1h.LIZ = "report_user";
            c1111350f1h.LIZIZ = "long_press";
            c1109770ez9.LJII(abstractC1110800f0o, c1111350f1h);
        }
    }

    public final void S5(int i) {
        String strLIZIZ;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        String strValueOf = String.valueOf(i);
        if (C497740JfY.LJJ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(' ');
            sbLIZ.append(strValueOf);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            int iLIZIZ = (int) C497740JfY.LIZIZ(18.0f);
            ViewGroup.LayoutParams layoutParams = this.LLJILJILJ.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = iLIZIZ * strLIZIZ.length();
            }
            ViewGroup.LayoutParams layoutParams2 = this.LLJILJILJ.getLayoutParams();
            if ((layoutParams2 instanceof C19ME) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                marginLayoutParams.setMarginEnd(0);
            }
            this.LLJILJILJ.requestLayout();
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strValueOf);
            sbLIZ2.append(' ');
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        this.LLJILJILJ.setText(strLIZIZ);
    }

    public C1111150f1N(View view, AbstractC1113530f5D abstractC1113530f5D) {
        super(view, abstractC1113530f5D);
        C421320Gfa c421320Gfa = (C421320Gfa) view.findViewById(R.id.k55);
        this.LLILZIL = c421320Gfa;
        View viewFindViewById = view.findViewById(R.id.p0d);
        this.LLILZLL = (TextView) view.findViewById(R.id.p09);
        C0KVZ c0kvz = (C0KVZ) view.findViewById(R.id.bqd);
        this.LLIZ = c0kvz;
        C0KVZ c0kvz2 = (C0KVZ) view.findViewById(R.id.bqh);
        this.LLIZLLLIL = c0kvz2;
        this.LLJ = (TextView) view.findViewById(R.id.iwq);
        this.LLJI = (C1126540fQC) view.findViewById(R.id.iy6);
        this.LLJIJIL = view.findViewById(R.id.iwj);
        this.LLJILJIL = (TextView) view.findViewById(R.id.iwk);
        TextView textView = (TextView) view.findViewById(R.id.ora);
        TextView textView2 = (TextView) view.findViewById(R.id.e9n);
        this.LLJILJILJ = textView2;
        InterfaceC518480KVa interfaceC518480KVa = new InterfaceC518480KVa() { // from class: X.0f1Q
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC518480KVa
            public final void LIZ(AbstractC498530Jgp<? extends AbstractC521080Kc6> abstractC498530Jgp) {
                String string;
                BadgeStruct badgeStructLIZIZ;
                AbstractC1110790f0n abstractC1110790f0n;
                InterfaceC1110900f0y interfaceC1110900f0y;
                BadgeStruct badgeStructLIZIZ2;
                C1111150f1N c1111150f1N = this.LIZ;
                boolean z = abstractC498530Jgp instanceof InterfaceC1110900f0y;
                AbstractC1136060ffY abstractC1136060ffY = null;
                if (z && (interfaceC1110900f0y = (InterfaceC1110900f0y) abstractC498530Jgp) != null && (badgeStructLIZIZ2 = interfaceC1110900f0y.LIZIZ()) != null) {
                    string = Integer.valueOf(badgeStructLIZIZ2.badgeScene).toString();
                } else {
                    string = null;
                }
                c1111150f1N.T5("badgeview", string, "comment_icon");
                if (z && (badgeStructLIZIZ = ((InterfaceC1110900f0y) abstractC498530Jgp).LIZIZ()) != null && (abstractC1110790f0n = this.LIZ.LLILLJJLI) != null) {
                    abstractC1110790f0n.LLILLL(badgeStructLIZIZ);
                }
                AbstractC1110800f0o abstractC1110800f0o = this.LIZ.LLILLJJLI;
                if (abstractC1110800f0o != null) {
                    abstractC1136060ffY = abstractC1110800f0o.LJIL;
                }
                C499230Jhx.LIZJ(abstractC1136060ffY);
            }
        };
        C786410Ut5.I7(new AbS698S0100000_17(this, 25, 42), c421320Gfa);
        c421320Gfa.setOnLongClickListener(new ViewOnLongClickListenerC1151640g4g(this, 13));
        viewFindViewById.setOnLongClickListener(new AbstractViewOnLongClickListenerC1111100f1I() { // from class: X.0f1e
            @Override // X.AbstractViewOnLongClickListenerC1111100f1I
            public final void LIZ() {
                this.LLILLJJLI.R5("user_name");
            }
        });
        C1098990ehl.LIZ(new ACListenerS152S0100000_17(this, 207), viewFindViewById);
        c0kvz.setOnBadgeClickListener(interfaceC518480KVa);
        c0kvz2.setOnBadgeClickListener(interfaceC518480KVa);
        textView.setTypeface(C1119920fFW.LIZJ(textView.getTextSize(), OppoPermissionPopupMaskDelayExp.DEFAULT, textView.getContext()), 2);
        textView2.setTypeface(C1119920fFW.LIZJ(textView2.getTextSize(), OppoPermissionPopupMaskDelayExp.DEFAULT, textView2.getContext()), 2);
        C786410Ut5.I7(new AbS698S0100000_17(this, 24, 42), this.itemView);
    }

    @Override // X.AbstractC1111060f1E
    public final void P5(C1109770ez9 c1109770ez9, AbstractC1110800f0o abstractC1110800f0o, List list) {
        boolean z;
        List<AbstractC498530Jgp<? extends AbstractC521080Kc6>> arrayList;
        List<AbstractC498530Jgp<? extends AbstractC521080Kc6>> arrayList2;
        boolean z2;
        int i;
        boolean z3;
        DataChannel dataChannel;
        Gift gift;
        int i2;
        List<PublicAreaMessageCommon.CreatorSuccessInfo.TagItem> list2;
        PublicAreaMessageCommon.CreatorSuccessInfo creatorSuccessInfo;
        boolean z4;
        C1111000f18 c1111000f18 = (C1111000f18) abstractC1110800f0o;
        this.LLILZIL.getHierarchy().LJIJI(0);
        ImageModel imageModelLJLLLLLL = c1111000f18.LJLLLLLL();
        if (imageModelLJLLLLLL != null) {
            C1324610kZf c1324610kZfLIZJ = C1819620xS4.LIZ().LIZJ(imageModelLJLLLLLL.getUrls());
            c1324610kZfLIZJ.LJI = -1;
            c1324610kZfLIZJ.LJII = -1;
            c1324610kZfLIZJ.LJIIL = new C1151780g4u(this, 6);
            c1324610kZfLIZJ.LJJI(this.LLILZIL);
        } else {
            C439101nJ.LJ(R.drawable.eyb, this.LLILZIL);
        }
        C1109770ez9 c1109770ez92 = this.LL;
        if (c1109770ez92 != null && c1109770ez92.LJI) {
            C421320Gfa c421320Gfa = this.LLILZIL;
            PublicAreaMessageCommon publicAreaMessageCommonLLIIII = c1111000f18.LLIIII();
            if (publicAreaMessageCommonLLIIII != null) {
                z4 = publicAreaMessageCommonLLIIII.isAnchorMarked;
            } else {
                z4 = false;
            }
            c421320Gfa.setDrawAnchorMark(z4);
        }
        TextView textView = this.LLILZLL;
        String strLIZ = C0KVU.LIZ(((GiftMessage) c1111000f18.LJIL).fromUser);
        String str = strLIZ;
        if (strLIZ == null) {
            str = "";
        }
        Object objGg0 = null;
        CharSequence charSequenceLIZLLL = str;
        if (LiveMinusOneScreenTipsInFeedSetting.isPhase3TagsAndGuideEnabled()) {
            Context context = this.itemView.getContext();
            PublicAreaMessageCommon publicAreaMessageCommonLLIIII2 = c1111000f18.LLIIII();
            if (publicAreaMessageCommonLLIIII2 != null && (creatorSuccessInfo = publicAreaMessageCommonLLIIII2.creatorSuccessInfo) != null) {
                list2 = creatorSuccessInfo.tags;
            } else {
                list2 = null;
            }
            TextView textView2 = this.LLILZLL;
            AwS383S0200000_17 awS383S0200000_17 = new AwS383S0200000_17(this, c1111000f18, 133);
            AwS453S0200000_17 awS453S0200000_17 = new AwS453S0200000_17(this, c1111000f18, 2);
            C447580Hgq c447580Hgq = C447580Hgq.LIZ;
            c447580Hgq.getClass();
            C447620Hgu c447620HguLIZJ = C447580Hgq.LIZJ(list2);
            charSequenceLIZLLL = str;
            if (c447620HguLIZJ == null) {
                if (textView2 != null) {
                    C447580Hgq.LIZ(textView2);
                    charSequenceLIZLLL = str;
                }
            } else {
                int length = str.length();
                List<PublicAreaMessageCommon.CreatorSuccessInfo.TagItem> list3 = c447620HguLIZJ.LIZIZ;
                List<PublicAreaMessageCommon.CreatorSuccessInfo.TagItem> list4 = c447620HguLIZJ.LIZ;
                c447580Hgq.getClass();
                charSequenceLIZLLL = C447580Hgq.LIZLLL(context, str, length, list3, list4, textView2, awS383S0200000_17, awS453S0200000_17, true);
            }
        }
        textView.setText(charSequenceLIZLLL);
        TextView textView3 = this.LLILZLL;
        C1109770ez9 c1109770ez93 = this.LL;
        if (c1109770ez93 != null && c1109770ez93.LIZLLL) {
            z = true;
        } else {
            z = false;
        }
        AbstractC1111020f1A.I5(textView3, z);
        if (BadgeCacheOptimizeEnableSetting.isEnabled() && c1111000f18.LJIILIIL != null) {
            C1111010f19 c1111010f19 = c1111000f18.LJJI;
            C520950Kbt c520950Kbt = c1111010f19.LIZJ;
            if (c520950Kbt == null || (arrayList = c520950Kbt.LJ) == null) {
                arrayList = new ArrayList<>();
            }
        } else {
            C520950Kbt c520950Kbt2 = c1111000f18.LJJI.LIZJ;
            if (c520950Kbt2 == null || (arrayList = c520950Kbt2.LJ) == null) {
                arrayList = new ArrayList<>();
            }
        }
        if (C19719512Dh.LJI(arrayList) && !arrayList.isEmpty()) {
            C500260Jjc.LLFFF(this.LLIZ);
            this.LLIZ.setBadges(arrayList);
        } else {
            C500260Jjc.LJIILIIL(this.LLIZ);
        }
        if (BadgeCacheOptimizeEnableSetting.isEnabled() && c1111000f18.LJIILIIL != null) {
            C1111010f19 c1111010f192 = c1111000f18.LJJI;
            C520950Kbt c520950Kbt3 = c1111010f192.LIZLLL;
            if (c520950Kbt3 == null || (arrayList2 = c520950Kbt3.LJ) == null) {
                arrayList2 = new ArrayList<>();
            }
        } else {
            C520950Kbt c520950Kbt4 = c1111000f18.LJJI.LIZLLL;
            if (c520950Kbt4 == null || (arrayList2 = c520950Kbt4.LJ) == null) {
                arrayList2 = new ArrayList<>();
            }
        }
        if (C19719512Dh.LJI(arrayList2) && !arrayList2.isEmpty()) {
            C500260Jjc.LLFFF(this.LLIZLLLIL);
            this.LLIZLLLIL.setBadges(arrayList2);
        } else {
            C500260Jjc.LJIILIIL(this.LLIZLLLIL);
        }
        this.LLJ.setText(((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).getGiftMessageDesc(c1111000f18.LJIILIIL.LJIIIZ, (GiftMessage) c1111000f18.LJIL));
        TextView textView4 = this.LLJ;
        C1109770ez9 c1109770ez94 = this.LL;
        if (c1109770ez94 != null && c1109770ez94.LIZLLL) {
            z2 = true;
        } else {
            z2 = false;
        }
        AbstractC1111020f1A.I5(textView4, z2);
        C1126540fQC c1126540fQC = this.LLJI;
        if ((c1126540fQC instanceof ImageView) && c1126540fQC != null) {
            c1126540fQC.setImageDrawable(C497740JfY.LJIIJ(R.drawable.eva));
        }
        final C1126540fQC c1126540fQC2 = this.LLJI;
        ImageModel imageModelLLJLILLLLZIIL = c1111000f18.LLJLILLLLZIIL(((GiftMessage) c1111000f18.LJIL).colorId);
        if (imageModelLLJLILLLLZIIL != null) {
            ((IHostFrescoHelper) C1161920gLG.LIZJ(IHostFrescoHelper.class)).xW1(imageModelLLJLILLLLZIIL, new InterfaceC177000m8() { // from class: X.0f1W
                @Override // X.InterfaceC177000m8
                public final void LIZ(Bitmap bitmap) {
                    if (bitmap == null) {
                        return;
                    }
                    try {
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap);
                        if (bitmapCreateBitmap != null && !bitmapCreateBitmap.isRecycled()) {
                            ImageView imageView = c1126540fQC2;
                            if (imageView != null) {
                                imageView.setImageBitmap(bitmapCreateBitmap);
                            }
                            ImageView imageView2 = c1126540fQC2;
                            if (imageView2 != null) {
                                imageView2.invalidate();
                            }
                        }
                    } catch (OutOfMemoryError e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            });
        }
        GiftMessage giftMessage = (GiftMessage) c1111000f18.LJIL;
        if (giftMessage != null && (gift = giftMessage.mGift) != null && (i2 = gift.diamondCount) > 0) {
            this.LLJILJIL.setText(String.valueOf(i2));
            C500260Jjc.LLFFF(this.LLJIJIL);
        } else {
            this.LLJILJIL.setText("");
            C500260Jjc.LJIILIIL(this.LLJIJIL);
        }
        GiftMessage giftMessage2 = (GiftMessage) c1111000f18.LJIL;
        if (giftMessage2 != null) {
            i = giftMessage2.repeatCount;
        } else {
            i = 0;
        }
        if (c1111000f18.LJIILJJIL.LIZJ == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (i <= 0) {
            U5();
            this.LLJJ = 0;
            this.LLJILJILJ.setText("");
            return;
        }
        AwS157S0101000_17 awS157S0101000_17 = new AwS157S0101000_17(this, i, 8);
        if (i <= 1) {
            awS157S0101000_17.invoke();
            return;
        }
        if (LiveExtendedScreenGiftOptimizeSetting.INSTANCE.shouldAnimateCombo()) {
            C1109770ez9 c1109770ez95 = this.LL;
            if (c1109770ez95 != null && (dataChannel = c1109770ez95.LJIIIZ) != null) {
                objGg0 = dataChannel.gg0(LiveExtendedScreenStatus.class);
            }
            if (objGg0 == EnumC1083260eIO.SHOW && z3) {
                int iLJ = C13LZ.LJ(this.LLJJ, 1, i);
                U5();
                this.LLJJ = iLJ;
                S5(iLJ);
                if (iLJ >= i) {
                    return;
                }
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(iLJ, i);
                valueAnimatorOfInt.setDuration(((long) (i - iLJ)) * 100);
                valueAnimatorOfInt.setInterpolator(new LinearInterpolator());
                valueAnimatorOfInt.addUpdateListener(new AUListenerS266S0100000_17(this, 171));
                valueAnimatorOfInt.start();
                this.LLJILLL = valueAnimatorOfInt;
                return;
            }
        }
        awS157S0101000_17.invoke();
    }

    public final void T5(String str, String str2, String str3) {
        User user;
        long messageId;
        String str4;
        PublicAreaMessageCommon publicAreaMessageCommonLLIIII;
        C1111420f1o c1111420f1o;
        MESSAGE message;
        DataChannel dataChannel;
        C1109770ez9 c1109770ez9 = this.LL;
        if (c1109770ez9 != null && (dataChannel = c1109770ez9.LJIIIZ) != null) {
            dataChannel.FQ2(PsInteractiveCount.class);
        }
        C1111000f18 c1111000f18 = this.LLILLJJLI;
        if (c1111000f18 != null && (user = c1111000f18.getUser()) != null) {
            C784440Upu c784440UpuLIZ = C784440Upu.LIZ();
            UserProfileEvent userProfileEvent = new UserProfileEvent(user.getId(), str);
            AbstractC1110800f0o abstractC1110800f0o = this.LLILLJJLI;
            long j = 0;
            if (abstractC1110800f0o != null && (message = abstractC1110800f0o.LJIL) != 0) {
                messageId = message.getMessageId();
            } else {
                messageId = 0;
            }
            userProfileEvent.msgId = messageId;
            AbstractC1110790f0n abstractC1110790f0n = this.LLILLJJLI;
            if (abstractC1110790f0n != null && (c1111420f1o = abstractC1110790f0n.LJIJ) != null) {
                j = c1111420f1o.LIZ;
            }
            userProfileEvent.releaseId = j;
            userProfileEvent.mSource = "live_comment";
            userProfileEvent.clickMethod = "normal";
            userProfileEvent.mReportType = "report_message";
            userProfileEvent.mShowEntrance = "comment_area";
            userProfileEvent.mClickUserPosition = str2;
            userProfileEvent.setFromLiveModule("comment_icon");
            C1109770ez9 c1109770ez92 = this.LL;
            if (c1109770ez92 != null && c1109770ez92.LJI) {
                if (userProfileEvent.trackExtra == null) {
                    userProfileEvent.trackExtra = new LinkedHashMap();
                }
                Map<String, String> map = userProfileEvent.trackExtra;
                AbstractC1110790f0n abstractC1110790f0n2 = this.LLILLJJLI;
                if (abstractC1110790f0n2 != null && (publicAreaMessageCommonLLIIII = abstractC1110790f0n2.LLIIII()) != null && publicAreaMessageCommonLLIIII.isAnchorMarked) {
                    str4 = "1";
                } else {
                    str4 = CardStruct.IStatusCode.DEFAULT;
                }
                map.put("click_is_marked_user", str4);
            }
            c784440UpuLIZ.LIZIZ(userProfileEvent);
        }
    }
}
