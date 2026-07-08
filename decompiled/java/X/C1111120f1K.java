package X;

import Y.ACListenerS152S0100000_17;
import Y.ATListenerS450S0100000_17;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.dynamicstrategy.PsInteractiveCount;
import com.bytedance.android.livesdk.dataChannel.LiveExtendedScreenStatus;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.livesetting.LivePublicScreenUiConfigAnchorIconSizeSetting;
import com.bytedance.android.livesdk.livesetting.LivePublicScreenUiConfigAudienceIconSizeSetting;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveBackupMessageOfflineTestSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenClickCloseKeyboardSetting;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon;
import com.bytedance.android.livesdk.model.message.WhisperMessage;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AwS413S0200000_12;
import kotlin.jvm.internal.AwS418S0200000_17;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0f1K, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1111120f1K extends AbstractC1110760f0k<C1110490f0J> {
    public final boolean LLILZ;
    public final boolean LLILZIL;
    public final boolean LLILZLL;
    public final View LLIZ;
    public final TextView LLIZLLLIL;
    public final C1110070ezd LLJ;
    public final C0KVZ LLJI;
    public final C0KVZ LLJIJIL;
    public final C421320Gfa LLJILJIL;
    public final ViewGroup LLJILJILJ;
    public final SpannableStringBuilder LLJILLL;
    public final C21627319kV LLJJ;
    public final HashSet<Long> LLJJI;
    public final Drawable LLJJIII;
    public final C20743516Fd LLJJIJI;
    public final C20743516Fd LLJJIJIIJIL;
    public final C416760GVu LLJJIJIL;
    public AbstractC1136060ffY LLJJJ;
    public boolean LLJJJIL;

    public final void T5() {
        DataChannel dataChannel;
        C1109770ez9 c1109770ez9 = this.LL;
        if (c1109770ez9 != null && (dataChannel = c1109770ez9.LJIIIZ) != null) {
            dataChannel.FQ2(PsInteractiveCount.class);
        }
        C1109770ez9 c1109770ez92 = this.LL;
        if (c1109770ez92 != null) {
            AbstractC1110800f0o<? extends AbstractC1136060ffY> abstractC1110800f0o = this.LLILLJJLI;
            C1111350f1h c1111350f1h = new C1111350f1h();
            c1111350f1h.LJFF = "comment";
            c1111350f1h.LIZ = "report_message";
            c1111350f1h.LIZIZ = "long_press";
            c1109770ez92.LJII(abstractC1110800f0o, c1111350f1h);
        }
    }

    public final void U5() {
        C1110490f0J c1110490f0J;
        C1110490f0J c1110490f0J2 = this.LLILLJJLI;
        if (!(c1110490f0J2 instanceof C1110490f0J) || (c1110490f0J = c1110490f0J2) == null) {
            return;
        }
        c1110490f0J.LLLILZLLLI("tap");
    }

    @Override // X.AbstractC1111020f1A, X.InterfaceC1111030f1B
    public final int V0() {
        return this.LLJ.getLineCount();
    }

    public final void W5() throws Throwable {
        if (this.LLILZIL) {
            return;
        }
        C1152540g68.LIZIZ(this.LLJ, this.LLILZLL, this.LLILZ, this.LLJJJIL);
        C1152540g68.LIZLLL(this.LLIZLLLIL, this.LLILZLL, this.LLILZ, this.LLJJJIL);
    }

    @Override // X.AbstractC1111020f1A
    public final void LLIILZL() {
        Animatable animatable;
        super.LLIILZL();
        Object obj = this.LLJJIII;
        if ((obj instanceof Animatable) && (animatable = (Animatable) obj) != null) {
            animatable.stop();
        }
        this.LLJILLL.clear();
        this.LLJ.setText("");
        this.LLJJJ = null;
        C0KVZ c0kvz = this.LLJI;
        if (c0kvz != null) {
            c0kvz.LIZ();
        }
        C0KVZ c0kvz2 = this.LLJIJIL;
        if (c0kvz2 != null) {
            c0kvz2.LIZ();
        }
    }

    @Override // X.AbstractC1111020f1A
    public final void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
    }

    public final void R5(AbstractC1110520f0M abstractC1110520f0M) {
        List arrayList;
        Collection<AbstractC498530Jgp<? extends AbstractC521080Kc6>> collectionLLJLILLLLZIIL = abstractC1110520f0M.LLJLILLLLZIIL();
        C520950Kbt c520950Kbt = abstractC1110520f0M.LJJII;
        if (c520950Kbt == null || (arrayList = c520950Kbt.LJ) == null) {
            arrayList = new ArrayList();
        }
        if (collectionLLJLILLLLZIIL.isEmpty()) {
            C0KVZ c0kvz = this.LLJI;
            if (c0kvz != null) {
                C786410Ut5.LLJZ(c0kvz, 8);
            }
        } else {
            C0KVZ c0kvz2 = this.LLJI;
            if (c0kvz2 != null) {
                C786410Ut5.LLJZ(c0kvz2, 0);
            }
        }
        C0KVZ c0kvz3 = this.LLJI;
        if (c0kvz3 != null) {
            c0kvz3.setBadges(C19719512Dh.LIZIZ(collectionLLJLILLLLZIIL));
        }
        if (arrayList.isEmpty()) {
            C0KVZ c0kvz4 = this.LLJIJIL;
            if (c0kvz4 != null) {
                C786410Ut5.LLJZ(c0kvz4, 8);
            }
        } else {
            C0KVZ c0kvz5 = this.LLJIJIL;
            if (c0kvz5 != null) {
                C786410Ut5.LLJZ(c0kvz5, 0);
            }
        }
        C0KVZ c0kvz6 = this.LLJIJIL;
        if (c0kvz6 != null) {
            c0kvz6.setBadges(C19719512Dh.LIZIZ(arrayList));
        }
    }

    public final int S5(C1109770ez9 c1109770ez9) {
        int value;
        if (c1109770ez9.LJJ) {
            return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        }
        if (this.LLILZ) {
            if (this.LLILZLL) {
                value = LivePublicScreenUiConfigAnchorIconSizeSetting.INSTANCE.getValue();
            } else {
                value = LivePublicScreenUiConfigAudienceIconSizeSetting.INSTANCE.getValue();
            }
            return (int) C497740JfY.LIZIZ(value);
        }
        return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
    }

    public final void P5(View view, boolean z) {
        ViewGroup viewGroup = this.LLJILJILJ;
        if ((viewGroup instanceof ConstraintLayout) && viewGroup != null) {
            View view2 = new View(viewGroup.getContext());
            if (LivePublicScreenClickCloseKeyboardSetting.INSTANCE.marginCanNotCloseKeyboard(this.LLILZLL)) {
                view2.setOnTouchListener(new ATListenerS450S0100000_17(this, 19));
            }
            C19ME c19me = new C19ME(0, 0);
            if (z) {
                c19me.bottomToTop = view.getId();
                c19me.topToTop = 0;
            } else {
                c19me.topToBottom = view.getId();
                c19me.bottomToBottom = 0;
            }
            c19me.startToStart = view.getId();
            c19me.endToEnd = view.getId();
            viewGroup.addView(view2, c19me);
        }
    }

    @Override // X.AbstractC1111020f1A
    public final /* bridge */ /* synthetic */ void L5(C1109770ez9 c1109770ez9, InterfaceC1112060f2q interfaceC1112060f2q) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1111020f1A
    public final void N5(final C1109770ez9 c1109770ez9, InterfaceC1112060f2q interfaceC1112060f2q, List list) throws Throwable {
        boolean z;
        Animatable animatable;
        Long lValueOf;
        int iIntValue;
        int i;
        int length;
        C416770GVv c416770GVv;
        Animatable animatable2;
        Animatable animatable3;
        C416770GVv c416770GVv2;
        final C1110490f0J c1110490f0J = (C1110490f0J) interfaceC1112060f2q;
        super.N5(c1109770ez9, c1110490f0J, list);
        this.LLJJJ = c1110490f0J.LJIL;
        boolean z2 = true;
        if (!list.isEmpty()) {
            for (Object obj : list) {
                if (!(obj instanceof C1111440f1q)) {
                    if (obj instanceof C1110550f0P) {
                        R5(c1110490f0J);
                        return;
                    }
                    if (obj instanceof C1111110f1J) {
                        boolean z3 = this.LLJJJIL;
                        boolean z4 = ((C1111110f1J) obj).LIZ;
                        if (z3 == z4) {
                            return;
                        }
                        this.LLJJJIL = z4;
                        W5();
                        return;
                    }
                } else {
                    return;
                }
            }
        } else {
            R5(c1110490f0J);
        }
        boolean z5 = this.LLJJJIL;
        boolean z6 = c1109770ez9.LJJIIZI;
        if (z5 != z6) {
            this.LLJJJIL = z6;
            W5();
        }
        AbstractC1136060ffY abstractC1136060ffY = this.LLJJJ;
        if ((abstractC1136060ffY instanceof ChatMessage) && ((ChatMessage) abstractC1136060ffY).LIZ()) {
            z = true;
        } else {
            z = false;
        }
        this.LLJILLL.clear();
        LiveBackupMessageOfflineTestSetting.INSTANCE.getValue();
        if (c1110490f0J instanceof InterfaceC759280TqQ) {
            SpannableStringBuilder spannableStringBuilder = this.LLJILLL;
            CharSequence content = c1110490f0J.getContent();
            if (content != null) {
                InterfaceC759280TqQ interfaceC759280TqQ = (InterfaceC759280TqQ) c1110490f0J;
                if (interfaceC759280TqQ.LJLLL() && !TextUtils.isEmpty(interfaceC759280TqQ.LJLJLLL()) && (content = interfaceC759280TqQ.LJLJLLL()) == null) {
                    content = "";
                }
                this.LLJILLL.append((CharSequence) C1110490f0J.LLLILZ());
                spannableStringBuilder.append(content);
                if (z) {
                    Object[] objArr = new Object[1];
                    C20743516Fd c20743516Fd = this.LLJJIJIIJIL;
                    if (c20743516Fd != null) {
                        c20743516Fd.setBounds(0, 0, S5(c1109770ez9), S5(c1109770ez9));
                    }
                    C20743516Fd c20743516Fd2 = this.LLJJIJIIJIL;
                    if (c20743516Fd2 != null) {
                        c416770GVv2 = new C416770GVv(c20743516Fd2);
                        c416770GVv2.LLILZ = C497740JfY.LJIIIZ(R.dimen.avp);
                    } else {
                        c416770GVv2 = null;
                    }
                    objArr[0] = c416770GVv2;
                    List listLJIILJJIL = C1697810uHb.LJIILJJIL(objArr);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                    spannableStringBuilder2.append((char) 65532);
                    C0JCF.LIZ(new AwS418S0200000_17(this, (C1111120f1K) c1110490f0J, (AbstractC1110520f0M<? extends AbstractC1136060ffY>) 144), null, null, null, spannableStringBuilder2, listLJIILJJIL);
                    spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
                }
                if (interfaceC759280TqQ.LJIILLIIL()) {
                    List listLJIILJJIL2 = C1697810uHb.LJIILJJIL(this.LLJJIJIL);
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                    spannableStringBuilder3.append((char) 65532);
                    C0JCF.LIZ(null, null, null, null, spannableStringBuilder3, listLJIILJJIL2);
                    spannableStringBuilder.append((CharSequence) spannableStringBuilder3);
                    Object obj2 = this.LLJJIII;
                    if ((obj2 instanceof Animatable) && (animatable3 = (Animatable) obj2) != null) {
                        animatable3.start();
                    }
                } else {
                    Object obj3 = this.LLJJIII;
                    if ((obj3 instanceof Animatable) && (animatable2 = (Animatable) obj3) != null) {
                        animatable2.stop();
                    }
                    if (interfaceC759280TqQ.LJLLL()) {
                        C20743516Fd c20743516Fd3 = this.LLJJIJI;
                        if (c20743516Fd3 != null) {
                            c20743516Fd3.setBounds(0, 0, S5(c1109770ez9), S5(c1109770ez9));
                        }
                        C20743516Fd c20743516Fd4 = this.LLJJIJI;
                        if (c20743516Fd4 != null) {
                            c416770GVv = new C416770GVv(c20743516Fd4);
                            c416770GVv.LLILZ = C497740JfY.LJIIIZ(R.dimen.avp);
                        } else {
                            c416770GVv = null;
                        }
                        if (!(c1109770ez9.LJIIJJI instanceof C1112070f2r)) {
                            List listLJIILJJIL3 = C1697810uHb.LJIILJJIL(c416770GVv);
                            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                            spannableStringBuilder4.append((char) 65532);
                            C0JCF.LIZ(new AwS413S0200000_12(c1109770ez9, c1110490f0J, 79), null, null, null, spannableStringBuilder4, listLJIILJJIL3);
                            spannableStringBuilder.append((CharSequence) spannableStringBuilder4);
                        }
                    }
                }
            }
        } else {
            Object obj4 = this.LLJJIII;
            if ((obj4 instanceof Animatable) && (animatable = (Animatable) obj4) != null) {
                animatable.stop();
            }
            this.LLJILLL.append((CharSequence) C1110490f0J.LLLILZ());
            SpannableStringBuilder spannableStringBuilder5 = this.LLJILLL;
            CharSequence content2 = c1110490f0J.getContent();
            if (content2 == null) {
                content2 = "";
            }
            spannableStringBuilder5.append(content2);
        }
        String strLLLILZ = C1110490f0J.LLLILZ();
        if (strLLLILZ != null && !a0.LJJJIL(strLLLILZ)) {
            int length2 = C1110490f0J.LLLILZ().length();
            C786410Ut5.q2(this.LLJILLL, new ForegroundColorSpan(C497740JfY.LJFF(R.color.a5f)), 0, length2, 33);
            C786410Ut5.q2(this.LLJILLL, new AbstractC1098790ehR() { // from class: X.0f0H
                @Override // X.AbstractC431510Gw1
                public final void LIZ() {
                }

                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public final void updateDrawState(TextPaint textPaint) {
                }

                @Override // X.AbstractC1098790ehR
                public final void LIZIZ(View view) {
                    c1110490f0J.LJJIIZ.invoke();
                    this.U5();
                }
            }, 0, length2, 33);
        }
        this.LLIZLLLIL.setText(c1110490f0J.LLJLL());
        this.LLJ.setTextColor(c1110490f0J.getColor());
        if (!c1110490f0J.LLLIL()) {
            StringBuilder sb = new StringBuilder();
            sb.append(C1110490f0J.LLLILZ());
            CharSequence content3 = c1110490f0J.getContent();
            if (content3 == null) {
                content3 = "";
            }
            sb.append((Object) content3);
            String string = sb.toString();
            Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(this.LLJ.getContext().getResources(), R.drawable.bqd);
            int width = bitmapDecodeResource.getWidth();
            bitmapDecodeResource.recycle();
            BitmapCrashChecker.recordBitmapRecyclePoint(bitmapDecodeResource);
            C1110070ezd c1110070ezd = this.LLJ;
            BitmapShader bitmapShader = new BitmapShader(BitmapFactory.decodeResource(c1110070ezd.getContext().getResources(), R.drawable.bqd), Shader.TileMode.REPEAT, Shader.TileMode.CLAMP);
            final Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setShader(bitmapShader);
            c1110070ezd.setBackgroundDrawable(new Drawable() { // from class: X.0GQo
                @Override // android.graphics.drawable.Drawable
                public final int getOpacity() {
                    return -1;
                }

                @Override // android.graphics.drawable.Drawable
                public final void draw(Canvas canvas) {
                    canvas.drawRect(getBounds(), paint);
                }

                @Override // android.graphics.drawable.Drawable
                public final void setAlpha(int i2) {
                    paint.setAlpha(i2);
                }

                @Override // android.graphics.drawable.Drawable
                public final void setColorFilter(ColorFilter colorFilter) {
                    paint.setColorFilter(colorFilter);
                }
            });
            if (this.LLILZ) {
                i = DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;
            } else {
                i = 180;
            }
            float fLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
            TextPaint paint2 = this.LLJ.getPaint();
            if (string != null) {
                length = string.length();
            } else {
                length = 0;
            }
            int iLIZIZ = C814420VxA.LIZIZ(Math.min(fLIZIZ, paint2.measureText((CharSequence) string, 0, length)) / width) * width;
            ViewGroup.LayoutParams layoutParams = this.LLJ.getLayoutParams();
            C19ME c19me = (C19ME) layoutParams;
            c19me.endToEnd = -1;
            ((ViewGroup.MarginLayoutParams) c19me).width = iLIZIZ;
            C1110070ezd c1110070ezd2 = this.LLJ;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1110070ezd2);
            c1110070ezd2.setLayoutParams(layoutParams);
            this.LLJ.setMaxLines(1);
        } else {
            this.LLJ.setMaxLines(Integer.MAX_VALUE);
            ViewGroup.LayoutParams layoutParams2 = this.LLJ.getLayoutParams();
            layoutParams2.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
            ((C19ME) layoutParams2).endToEnd = 0;
            C1110070ezd c1110070ezd3 = this.LLJ;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1110070ezd3);
            c1110070ezd3.setLayoutParams(layoutParams2);
            this.LLJ.setBackgroundDrawable(null);
        }
        C1110490f0J c1110490f0J2 = this.LLILLJJLI;
        if (c1110490f0J2 != null && c1110490f0J2.LLLIL()) {
            C786410Ut5.t8(this.LLJ, new ACListenerS152S0100000_17(this, 215));
        } else {
            C786410Ut5.t8(this.LLJ, new ACListenerS152S0100000_17(this, 214));
        }
        boolean z7 = !C1111450f1r.LIZ;
        if (!c1110490f0J.LLLIL()) {
            this.LLJ.setText("");
        } else {
            this.LLJ.setText(this.LLJJ.LJ(this.LLJILLL, new InterfaceC21543319St() { // from class: X.0f1m
                @Override // X.InterfaceC21543319St
                public final boolean LIZ(int i2, CharSequence charSequence) {
                    return c1109770ez9.LIZJ;
                }
            }));
        }
        ImageModel imageModelLJLLLLLL = c1110490f0J.LJLLLLLL();
        if (imageModelLJLLLLLL != null) {
            C1324610kZf c1324610kZfLIZJ = C1819620xS4.LIZ().LIZJ(imageModelLJLLLLLL.getUrls());
            c1324610kZfLIZJ.LJI = -1;
            c1324610kZfLIZJ.LJII = -1;
            c1324610kZfLIZJ.LJIIL = new C1151780g4u(this, 7);
            c1324610kZfLIZJ.LJJI(this.LLJILJIL);
        } else {
            C439101nJ.LJ(R.drawable.eu1, this.LLJILJIL);
        }
        WhisperMessage whisperMessage = (WhisperMessage) c1110490f0J.LJIL;
        if (this.LLJJI.contains(Long.valueOf(whisperMessage.getMessageId())) || whisperMessage.isLocalInsertMsg) {
            return;
        }
        User user = whisperMessage.user;
        if (user != null) {
            lValueOf = Long.valueOf(user.getId());
        } else {
            lValueOf = null;
        }
        String strValueOf = String.valueOf(lValueOf);
        DataChannel dataChannel = c1110490f0J.LLIIIILZ().LJIIIZ;
        if (dataChannel != null) {
            Integer num = (Integer) dataChannel.gg0(C0UZS.class);
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            String strValueOf2 = String.valueOf(c1110490f0J.LJIL.getMessageId());
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_enigma_whisper_show_viewer");
            c474500IjALIZ.LJJII(C01CC.LIZIZ(dataChannel), "view_type");
            c474500IjALIZ.LJJII(strValueOf, "to_user_id");
            c474500IjALIZ.LJJII(strValueOf2, "to_msg_id");
            c474500IjALIZ.LJJII(C01CC.LIZ(strValueOf), "self_type");
            c474500IjALIZ.LJJII(Integer.valueOf(iIntValue), "room_acu");
            c474500IjALIZ.LJIJJLI(dataChannel);
            c474500IjALIZ.LIZ();
            if (UserService.getInstance().user().getCurrentUserId() != c1110490f0J.LJZL()) {
                z2 = false;
            }
            C01CC.LIZJ("enigma_whisper", strValueOf, null, z2);
        }
        this.LLJJI.add(Long.valueOf(whisperMessage.getMessageId()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.0Upu] */
    public final void V5(String str, String str2, String str3) {
        User user;
        long messageId;
        Object objGg0;
        ?? arrayList;
        PublicAreaMessageCommon.CreatorSuccessInfo creatorSuccessInfo;
        PublicAreaMessageCommon.CreatorSuccessInfo.Topic topic;
        PublicAreaMessageCommon.CreatorSuccessInfo creatorSuccessInfo2;
        List<PublicAreaMessageCommon.CreatorSuccessInfo.TagItem> list;
        DataChannel dataChannel;
        C1111420f1o c1111420f1o;
        DataChannel dataChannel2;
        C1109770ez9 c1109770ez9 = this.LL;
        if (c1109770ez9 != null && (dataChannel2 = c1109770ez9.LJIIIZ) != null) {
            dataChannel2.FQ2(PsInteractiveCount.class);
        }
        C1110490f0J c1110490f0J = this.LLILLJJLI;
        if (c1110490f0J != null && (user = c1110490f0J.getUser()) != null) {
            ?? LIZ = C784440Upu.LIZ();
            UserProfileEvent userProfileEvent = new UserProfileEvent(user.getId(), str);
            AbstractC1136060ffY abstractC1136060ffY = this.LLJJJ;
            long j = 0;
            if (abstractC1136060ffY != null) {
                messageId = abstractC1136060ffY.getMessageId();
            } else {
                messageId = 0;
            }
            userProfileEvent.msgId = messageId;
            AbstractC1110790f0n abstractC1110790f0n = this.LLILLJJLI;
            if (abstractC1110790f0n != null && (c1111420f1o = abstractC1110790f0n.LJIJ) != null) {
                j = c1111420f1o.LIZ;
            }
            userProfileEvent.releaseId = j;
            AbstractC1136060ffY abstractC1136060ffY2 = this.LLJJJ;
            if (abstractC1136060ffY2 instanceof WhisperMessage) {
                userProfileEvent.content = String.valueOf(((WhisperMessage) abstractC1136060ffY2).content);
                userProfileEvent.setEnigmaOutside(true);
            }
            userProfileEvent.enigmaEnterFrom = "enigma_whisper";
            userProfileEvent.mSource = "live_comment";
            userProfileEvent.clickMethod = "normal";
            userProfileEvent.mReportType = "report_message";
            userProfileEvent.mShowEntrance = "comment_area";
            userProfileEvent.mClickUserPosition = str2;
            C1109770ez9 c1109770ez92 = this.LL;
            String strLJJLIIIJ = null;
            text = null;
            text = null;
            Text text = null;
            strLJJLIIIJ = null;
            if (c1109770ez92 != null && (dataChannel = c1109770ez92.LJIIIZ) != null) {
                objGg0 = dataChannel.gg0(LiveExtendedScreenStatus.class);
            } else {
                objGg0 = null;
            }
            if (objGg0 == EnumC1083260eIO.SHOW) {
                userProfileEvent.mEventPage = "live_extended_comment_filed";
                AbstractC1110790f0n abstractC1110790f0n2 = this.LLILLJJLI;
                if (abstractC1110790f0n2 != null && !C500260Jjc.LJJIFFI(Boolean.valueOf(abstractC1110790f0n2.LJIIIZ.LIZ))) {
                    PublicAreaMessageCommon publicAreaMessageCommonLLIIII = abstractC1110790f0n2.LLIIII();
                    if (publicAreaMessageCommonLLIIII != null && (creatorSuccessInfo2 = publicAreaMessageCommonLLIIII.creatorSuccessInfo) != null && (list = creatorSuccessInfo2.tags) != null) {
                        arrayList = new ArrayList();
                        Iterator<PublicAreaMessageCommon.CreatorSuccessInfo.TagItem> it2 = list.iterator();
                        while (it2.hasNext()) {
                            Text text2 = it2.next().tagText;
                            if (text2 != null) {
                                arrayList.add(text2);
                            }
                        }
                    } else {
                        arrayList = C13BV.INSTANCE;
                    }
                    PublicAreaMessageCommon publicAreaMessageCommonLLIIII2 = abstractC1110790f0n2.LLIIII();
                    if (publicAreaMessageCommonLLIIII2 != null && (creatorSuccessInfo = publicAreaMessageCommonLLIIII2.creatorSuccessInfo) != null && (topic = creatorSuccessInfo.topic) != null) {
                        text = topic.topicText;
                    }
                    List listLJLIL = C13LP.LJLIL(C1697810uHb.LJIIL(text), arrayList);
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it3 = ((ArrayList) listLJLIL).iterator();
                    while (it3.hasNext()) {
                        String str4 = ((Text) it3.next()).key;
                        if (str4 != null) {
                            arrayList2.add(str4);
                        }
                    }
                    strLJJLIIIJ = C13LP.LJJLIIIJ(C13LP.LJJJJI(arrayList2), ",", null, null, 0, null, null, 62);
                }
                userProfileEvent.crmLabel = strLJJLIIIJ;
            }
            userProfileEvent.setFromLiveModule("comment_icon");
            C1109770ez9 c1109770ez93 = this.LL;
            if (c1109770ez93 != null && c1109770ez93.LJI) {
                if (userProfileEvent.trackExtra == null) {
                    userProfileEvent.trackExtra = new LinkedHashMap();
                }
                userProfileEvent.trackExtra.put("click_is_marked_user", CardStruct.IStatusCode.DEFAULT);
            }
            LIZ.LIZIZ(userProfileEvent);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0248  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1111120f1K(android.view.View r18, android.view.View r19, boolean r20, boolean r21, boolean r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 631
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1111120f1K.<init>(android.view.View, android.view.View, boolean, boolean, boolean):void");
    }
}
