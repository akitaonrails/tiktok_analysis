package X;

import Y.ARunnableS50S0300000_17;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import android.net.Uri;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.gift.LivePSMGiftIconSpaceFixSetting;
import com.bytedance.android.livesdk.model.message.InteractionHubGoalMessage;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common.TextPiece;
import com.bytedance.android.livesdk.model.message.common.TextPieceUser;
import com.bytedance.android.livesdkapi.host.IHostFrescoHelper;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.text.a0;
import org.json.JSONObject;
import tikcast.api.creator_succ.ActionButton;

/* JADX INFO: renamed from: X.0f5E, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1113540f5E extends AbstractC1111060f1E<C226800uA> implements InterfaceC176300m1, InterfaceC204400qY {
    public final C16F9 LLILZIL;
    public final C197039127h LLILZLL;
    public CharSequence LLIZ;

    public final void U5() {
        SpannableStringBuilder spannableStringBuilder;
        int iLJJJ;
        CharSequence charSequence = this.LLIZ;
        if (charSequence == null || (iLJJJ = a0.LJJJ((spannableStringBuilder = new SpannableStringBuilder(charSequence)), "AVATAR_PLACEHOLDER", 0, false, 6)) == -1) {
            return;
        }
        for (iLJJJ = a0.LJJJ((spannableStringBuilder = new SpannableStringBuilder(charSequence)), "AVATAR_PLACEHOLDER", 0, false, 6); iLJJJ != -1; iLJJJ = a0.LJJJ(spannableStringBuilder, "AVATAR_PLACEHOLDER", 0, false, 6)) {
            spannableStringBuilder.delete(iLJJJ, iLJJJ + 18);
            if (iLJJJ < spannableStringBuilder.length() && spannableStringBuilder.charAt(iLJJJ) == ' ') {
                spannableStringBuilder.delete(iLJJJ, iLJJJ + 1);
            }
        }
        this.LLIZ = spannableStringBuilder;
        this.LLILZIL.setText(spannableStringBuilder);
    }

    @Override // X.AbstractC1111020f1A
    public final void LLIILZL() {
        super.LLIILZL();
        AbstractC1113530f5D abstractC1113530f5D = this.LLILZ;
        if (abstractC1113530f5D != null) {
            abstractC1113530f5D.LJIIIIZZ();
        }
    }

    public static JSONObject T5(String str) {
        try {
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str), "jsb_params");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                return null;
            }
            try {
                return new JSONObject(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            return null;
        }
    }

    public C1113540f5E(View view, AbstractC1113530f5D abstractC1113530f5D) {
        super(view, abstractC1113530f5D);
        this.LLILZIL = (C16F9) view.findViewById(R.id.xzd);
        this.LLILZLL = (C197039127h) view.findViewById(R.id.xz6);
    }

    public static void S5(String str, String str2) {
        String strOptString;
        JSONObject jSONObjectT5 = T5(str2);
        C974210bSV c974210bSV = new C974210bSV("start_co_host", null);
        String str3 = "full_screen";
        if (jSONObjectT5 != null && (strOptString = jSONObjectT5.optString("enterFrom", "full_screen")) != null) {
            str3 = strOptString;
        }
        c974210bSV.LJFF = str3;
        if (jSONObjectT5 != null) {
            c974210bSV.LJIILIIL = jSONObjectT5.optBoolean("autoQuickCohostInvite", false);
            Object objOpt = jSONObjectT5.opt("autoMatchScene");
            if (objOpt instanceof Number) {
                c974210bSV.LJIILJJIL = (Number) objOpt;
            }
            Object objOpt2 = jSONObjectT5.opt("autoMatchEntrance");
            if (objOpt2 instanceof Number) {
                c974210bSV.LJIILL = (Number) objOpt2;
            }
            JSONObject jSONObjectOptJSONObject = jSONObjectT5.optJSONObject("trackParams");
            if (jSONObjectOptJSONObject != null) {
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    c974210bSV.LJIILLIIL.put(next, jSONObjectOptJSONObject.optString(next, ""));
                }
            }
        }
        C784440Upu.LIZ().LIZIZ(c974210bSV);
    }

    @Override // X.InterfaceC176300m1
    public final void LLLL(Bitmap bitmap, AbstractC1110800f0o<? extends AbstractC1136060ffY> abstractC1110800f0o) {
        Spannable spannable;
        Spannable spannable2;
        if (bitmap != null && abstractC1110800f0o != null && this.LLILLJJLI == abstractC1110800f0o) {
            if (LivePSMGiftIconSpaceFixSetting.INSTANCE.enabled()) {
                CharSequence charSequence = this.LLIZ;
                if ((charSequence instanceof Spannable) && (spannable2 = (Spannable) charSequence) != null) {
                    C1133830fbx.LIZLLL(spannable2, bitmap, abstractC1110800f0o, true);
                }
            } else {
                int iLJJJJI = a0.LJJJJI(String.valueOf(this.LLIZ), " . ", 0, 6);
                if (iLJJJJI != -1) {
                    CharSequence charSequence2 = this.LLIZ;
                    if ((charSequence2 instanceof Spannable) && (spannable = (Spannable) charSequence2) != null) {
                        C1133830fbx.LIZIZ(spannable, bitmap, iLJJJJI + 1, iLJJJJI + 2, abstractC1110800f0o);
                    }
                }
            }
            this.LLILZIL.setText(this.LLIZ);
        }
    }

    @Override // X.InterfaceC204400qY
    public final void R3(Bitmap bitmap, AbstractC1110800f0o<? extends AbstractC1136060ffY> abstractC1110800f0o) {
        Spannable spannable;
        if (bitmap != null && abstractC1110800f0o != null && this.LLILLJJLI == abstractC1110800f0o) {
            Pair<Integer, Integer> pair = ((C226800uA) abstractC1110800f0o).LJJIIJ;
            if (pair == null) {
                U5();
                return;
            }
            CharSequence charSequence = this.LLIZ;
            if ((charSequence instanceof Spannable) && (spannable = (Spannable) charSequence) != null) {
                C1133830fbx.LIZIZ(spannable, bitmap, pair.getFirst().intValue(), pair.getSecond().intValue(), abstractC1110800f0o);
            }
            this.LLILZIL.setText(this.LLIZ);
            return;
        }
        U5();
    }

    public static String R5(Uri uri, String str, boolean z) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "gift_id");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 == null || (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "gift_count")) == null) {
            return null;
        }
        Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme("sslocal").authority("webcast_set_live_goal").appendQueryParameter("gift_id", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2).appendQueryParameter("gift_count", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
        if (z) {
            builderAppendQueryParameter.appendQueryParameter("need_pin", "true");
        }
        if (str.length() > 0) {
            builderAppendQueryParameter.appendQueryParameter("tip_or_tag_id", str);
        }
        return builderAppendQueryParameter.build().toString();
    }

    @Override // X.AbstractC1111060f1E
    public final void P5(final C1109770ez9 c1109770ez9, AbstractC1110800f0o abstractC1110800f0o, List list) {
        Object next;
        C227000uC c227000uC;
        Text text;
        List<TextPiece> list2;
        TextPiece next2;
        TextPieceUser textPieceUser;
        User user;
        ImageModel avatarThumb;
        TextPieceUser textPieceUser2;
        User user2;
        final ActionButton actionButton;
        Text text2;
        Text text3;
        String str;
        Spannable spannable;
        final C226800uA c226800uA = (C226800uA) abstractC1110800f0o;
        Iterator it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next instanceof C227000uC) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        if (next instanceof C227000uC) {
            c227000uC = (C227000uC) next;
        } else {
            c227000uC = null;
        }
        if (c227000uC != null) {
            CharSequence text4 = this.LLILZIL.getText();
            if ((text4 instanceof Spannable) && (spannable = (Spannable) text4) != null) {
                C1133830fbx.LIZIZ(spannable, c227000uC.LIZ.getFirst(), c227000uC.LIZ.getSecond().intValue(), c227000uC.LIZ.getThird().intValue(), null);
                this.LLILZIL.setText(spannable);
                return;
            }
        }
        CharSequence content = c226800uA.getContent();
        if (content != null) {
            this.LLIZ = content;
            this.LLILZIL.setText(content);
        }
        c226800uA.LJJL(this);
        Bitmap bitmap = c226800uA.LJJII;
        if (bitmap != null) {
            R3(bitmap, c226800uA);
        } else if (!c226800uA.LJJIII && (text = ((InteractionHubGoalMessage) c226800uA.LJIL).interactionTips) != null && (list2 = text.pieces) != null) {
            Iterator<TextPiece> it3 = list2.iterator();
            while (true) {
                if (it3.hasNext()) {
                    next2 = it3.next();
                    TextPiece textPiece = next2;
                    if (textPiece.type == EnumC1133850fbz.USER.getPieceType() && (textPieceUser2 = textPiece.userValue) != null && (user2 = textPieceUser2.user) != null && user2.getAvatarThumb() != null) {
                        break;
                    }
                } else {
                    next2 = null;
                    break;
                }
            }
            TextPiece textPiece2 = next2;
            if (textPiece2 != null && (textPieceUser = textPiece2.userValue) != null && (user = textPieceUser.user) != null && (avatarThumb = user.getAvatarThumb()) != null) {
                c226800uA.LJJIII = true;
                ((IHostFrescoHelper) C1161920gLG.LIZJ(IHostFrescoHelper.class)).xW1(avatarThumb, new InterfaceC177000m8() { // from class: X.0f5I
                    @Override // X.InterfaceC177000m8
                    public final void LIZ(Bitmap bitmap2) {
                        if (bitmap2 == null) {
                            c226800uA.LJJIII = false;
                            return;
                        }
                        Bitmap bitmapCopy = bitmap2.copy(Bitmap.Config.ARGB_8888, true);
                        if (bitmapCopy != null) {
                            bitmap2 = bitmapCopy;
                        }
                        c226800uA.getClass();
                        Bitmap bitmapCopy2 = bitmap2.copy(Bitmap.Config.ARGB_8888, true);
                        if (bitmapCopy2 != null) {
                            bitmap2 = bitmapCopy2;
                        }
                        int iMin = Math.min(bitmap2.getWidth(), bitmap2.getHeight());
                        if (iMin > 0) {
                            int iMax = Math.max((bitmap2.getWidth() - iMin) / 2, 0);
                            int iMax2 = Math.max((bitmap2.getHeight() - iMin) / 2, 0);
                            if (bitmap2.getWidth() != iMin || bitmap2.getHeight() != iMin) {
                                bitmap2 = Bitmap.createBitmap(bitmap2, iMax, iMax2, iMin, iMin);
                            }
                            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
                            Paint paint = new Paint(1);
                            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                            paint.setShader(new BitmapShader(bitmap2, tileMode, tileMode));
                            float f = iMin / 2.0f;
                            new Canvas(bitmapCreateBitmap).drawCircle(f, f, f, paint);
                            bitmap2 = bitmapCreateBitmap;
                        }
                        C226800uA c226800uA2 = c226800uA;
                        c226800uA2.LJJII = bitmap2;
                        InterfaceC204400qY interfaceC204400qY = this;
                        if (interfaceC204400qY != null) {
                            interfaceC204400qY.R3(bitmap2, c226800uA2);
                        }
                        c226800uA.LJJIII = false;
                    }
                });
            }
        }
        C786410Ut5.LLLLLLJ(this.LLILZLL, 8);
        C786410Ut5.U8(this.LLILZLL, null);
        final InteractionHubGoalMessage interactionHubGoalMessage = (InteractionHubGoalMessage) c226800uA.LJIL;
        if (interactionHubGoalMessage.hasButton && (actionButton = interactionHubGoalMessage.actionButton) != null && (((text2 = actionButton.buttonActiveText) != null && (str = text2.defaultPattern) != null && str.length() > 0) || ((text3 = actionButton.buttonInactiveText) != null && (str = text3.defaultPattern) != null && str.length() > 0))) {
            this.LLILZLL.setText(str);
            C786410Ut5.LLLLLLJ(this.LLILZLL, 0);
            C786410Ut5.U8(this.LLILZLL, new View.OnClickListener() { // from class: X.0f5F
                /* JADX WARN: Code restructure failed: missing block: B:110:0x02c8, code lost:
                
                    if (r8.equals("start_rematch") != false) goto L124;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:123:0x0303, code lost:
                
                    if (r8.equals("start_match") != false) goto L124;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:125:0x030b, code lost:
                
                    if (kotlin.jvm.internal.Intrinsics.LJFF(r8, "start_rematch") == false) goto L127;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:126:0x030d, code lost:
                
                    r7 = "start_rematch";
                 */
                /* JADX WARN: Code restructure failed: missing block: B:127:0x030e, code lost:
                
                    r5 = new X.C974210bSV(r7, null);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:128:0x0312, code lost:
                
                    if (r6 == null) goto L132;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:129:0x0314, code lost:
                
                    r0 = r6.optString("enter_from", "full_screen");
                 */
                /* JADX WARN: Code restructure failed: missing block: B:130:0x0318, code lost:
                
                    if (r0 == null) goto L132;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:131:0x031a, code lost:
                
                    r3 = r0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:132:0x031b, code lost:
                
                    r5.LJFF = r3;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:133:0x031d, code lost:
                
                    if (r6 == null) goto L137;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:134:0x031f, code lost:
                
                    r1 = r6.optLong("gift_id", 0);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:135:0x0327, code lost:
                
                    if (r1 <= 0) goto L137;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:136:0x0329, code lost:
                
                    r5.LIZJ = new X.C974250bSZ(r1);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:137:0x0330, code lost:
                
                    X.C784440Upu.LIZ().LIZIZ(r5);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:138:0x0337, code lost:
                
                    return;
                 */
                @Override // android.view.View.OnClickListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void onClick(android.view.View r21) throws org.json.JSONException {
                    /*
                        Method dump skipped, instruction units count: 1063
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.ViewOnClickListenerC1113550f5F.onClick(android.view.View):void");
                }
            });
        }
        if (c226800uA.LJJIIJZLJL) {
            return;
        }
        ViewTreeObserverOnPreDrawListenerC337150DJp.LIZ(this.itemView, new ARunnableS50S0300000_17(this, c226800uA, c1109770ez9, 29));
    }
}
