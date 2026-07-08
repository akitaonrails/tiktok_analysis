package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.api.AtWithIndex;
import com.bytedance.android.livesdk.chatroom.api.SpaceCommentItem;
import com.bytedance.android.livesdk.chatroom.api.SpacePost;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.text.a0;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0JnY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C502700JnY extends RecyclerView.ViewHolder {
    public void I5(AbstractC503810JpL abstractC503810JpL, InterfaceC2753014t interfaceC2753014t) {
    }

    public C502700JnY(View view) {
        super(view);
    }

    public static void T5(C16F5 c16f5, SpaceCommentItem spaceCommentItem) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spaceCommentItem.text);
        for (AtWithIndex atWithIndex : spaceCommentItem.atList) {
            if (atWithIndex.startIndex >= 0 && atWithIndex.endIndex <= spaceCommentItem.text.length()) {
                long j = atWithIndex.endIndex;
                long j2 = atWithIndex.startIndex;
                if (j > j2) {
                    C1119920fFW.LJIIIIZZ(spannableStringBuilder, (int) j2, (int) j, 33, 500);
                }
            }
        }
        c16f5.setText(spannableStringBuilder);
    }

    public final void R5(C16F5 c16f5, SpaceCommentItem spaceCommentItem) {
        final int iIntValue;
        Integer numLIZJ;
        Integer numLIZJ2;
        if (!spaceCommentItem.anchorLiked) {
            return;
        }
        final int iIntValue2 = 0;
        if (a0.LJJIIZI(c16f5.getText(), C497740JfY.LJIJI(2131844324), false)) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(c16f5.getText());
        spannableStringBuilder.append((CharSequence) " ");
        String strLJIJI = C497740JfY.LJIJI(2131844324);
        if (strLJIJI != null) {
            spannableStringBuilder.append((CharSequence) strLJIJI);
            Context context = this.itemView.getContext();
            if (context != null && (numLIZJ2 = C1308910kAL.LIZJ(R.attr.c5r, context)) != null) {
                iIntValue = numLIZJ2.intValue();
            } else {
                iIntValue = 0;
            }
            Context context2 = this.itemView.getContext();
            if (context2 != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.ex7, context2)) != null) {
                iIntValue2 = numLIZJ.intValue();
            }
            final float fLIZIZ = C418440Gaw.LIZIZ(10);
            final float fLIZIZ2 = C418440Gaw.LIZIZ(13);
            final float fLIZIZ3 = C418440Gaw.LIZIZ(4);
            final float fLIZIZ4 = C418440Gaw.LIZIZ(4);
            final boolean zLJJ = C497740JfY.LJJ();
            C786410Ut5.q2(spannableStringBuilder, new ReplacementSpan(iIntValue, iIntValue2, fLIZIZ, fLIZIZ2, fLIZIZ3, fLIZIZ4, zLJJ) { // from class: X.0GWU
                public final int LL;
                public final int LLILLJJLI;
                public final float LLILLL;
                public final float LLILZ;
                public final float LLILZIL;
                public final float LLILZLL;
                public final boolean LLIZ;

                @Override // android.text.style.ReplacementSpan
                public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
                    TextPaint textPaint = new TextPaint(paint);
                    textPaint.setTextSize(this.LLILLL);
                    return (int) textPaint.measureText(charSequence, i, i2);
                }

                {
                    this.LL = iIntValue;
                    this.LLILLJJLI = iIntValue2;
                    this.LLILLL = fLIZIZ;
                    this.LLILZ = fLIZIZ2;
                    this.LLILZIL = fLIZIZ3;
                    this.LLILZLL = fLIZIZ4;
                    this.LLIZ = zLJJ;
                }

                @Override // android.text.style.ReplacementSpan
                public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
                    RectF rectF;
                    TextPaint textPaint = new TextPaint(paint);
                    textPaint.setColor(this.LLILLJJLI);
                    textPaint.setTextSize(this.LLILLL);
                    Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
                    float f2 = (i5 + i3) / 2.0f;
                    float f3 = this.LLILZ;
                    float f4 = f2 - (f3 / 2.0f);
                    float f5 = (f3 / 2.0f) + f2;
                    float fMeasureText = textPaint.measureText(charSequence, i, i2) + f;
                    if (this.LLIZ) {
                        rectF = new RectF(f - (this.LLILZIL * 2), f4, fMeasureText, f5);
                    } else {
                        rectF = new RectF(f, f4, fMeasureText + (this.LLILZIL * 2), f5);
                    }
                    paint.setColor(this.LL);
                    float f6 = this.LLILZLL;
                    canvas.drawRoundRect(rectF, f6, f6, paint);
                    float f7 = fontMetrics.descent;
                    float f8 = (f2 + ((f7 - fontMetrics.ascent) * 0.5f)) - f7;
                    if (this.LLIZ) {
                        canvas.drawText(charSequence, i, i2, f - this.LLILZIL, f8 + (fontMetrics.leading * 0.5f), textPaint);
                    } else {
                        canvas.drawText(charSequence, i, i2, f + this.LLILZIL, f8 + (fontMetrics.leading * 0.5f), textPaint);
                    }
                }
            }, spannableStringBuilder.length() - strLJIJI.length(), spannableStringBuilder.length(), 33);
        }
        c16f5.setText(spannableStringBuilder);
    }

    public static void S5(C0KVZ c0kvz, List list, User user) {
        boolean z = true;
        if (list != null && !list.isEmpty()) {
            C786410Ut5.LLJZ(c0kvz, 0);
            if (user == null) {
                return;
            }
            if (Boolean.FALSE != null) {
                z = false;
            }
            c0kvz.LLILZLL = z;
            c0kvz.LIZLLL();
            c0kvz.LJ(false, list, user, 10, new C502740Jnc(c0kvz), null, false);
            return;
        }
        C786410Ut5.LLJZ(c0kvz, 8);
    }

    public static void L5(View view, final User user, final SpacePost spacePost, final InterfaceC502750Jnd interfaceC502750Jnd) {
        if (user == null || view == null) {
            return;
        }
        C786410Ut5.I7(new AbstractViewOnClickListenerC1637610siV() { // from class: X.0Jna
            @Override // X.AbstractViewOnClickListenerC1637610siV
            public final void LIZ(View view2) {
                if (view2 != null) {
                    C784440Upu c784440UpuLIZ = C784440Upu.LIZ();
                    UserProfileEvent userProfileEvent = new UserProfileEvent(user);
                    userProfileEvent.mSource = "sub_space";
                    c784440UpuLIZ.LIZIZ(userProfileEvent);
                    InterfaceC502750Jnd interfaceC502750Jnd2 = interfaceC502750Jnd;
                    if (interfaceC502750Jnd2 != null) {
                        interfaceC502750Jnd2.LIZ(spacePost, "enter_homepage");
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(300L);
            }
        }, view);
    }

    public static void P5(C16F5 c16f5, String str, String str2, String str3) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ColorDrawable colorDrawable = new ColorDrawable(0);
        colorDrawable.setBounds(0, 0, (int) c16f5.getTextSize(), (int) c16f5.getTextSize());
        C442801nu c442801nu = new C442801nu(c16f5, colorDrawable, new C502730Jnb(str));
        spannableStringBuilder.append((CharSequence) e3.d);
        C786410Ut5.q2(spannableStringBuilder, c442801nu, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) str2);
        C1119920fFW.LJIIIIZZ(spannableStringBuilder, spannableStringBuilder.length() - str2.length(), spannableStringBuilder.length(), 33, OppoPermissionPopupMaskDelayExp.DEFAULT);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) str3);
        c16f5.setText(spannableStringBuilder);
    }

    public final void N5(View view, final User user, final SpacePost spacePost, final InterfaceC502750Jnd interfaceC502750Jnd) {
        if (user == null || view == null) {
            return;
        }
        C786410Ut5.I7(new AbstractViewOnClickListenerC1637610siV() { // from class: X.0JnZ
            @Override // X.AbstractViewOnClickListenerC1637610siV
            public final void LIZ(View view2) {
                if (view2 != null) {
                    C502700JnY c502700JnY = this.LLILZ;
                    User user2 = user;
                    c502700JnY.getClass();
                    Uri.Builder builderAppendQueryParameter = UriProtector.parse("sslocal://user/profile").buildUpon().appendQueryParameter("uid", String.valueOf(user2.getId()));
                    String secUid = user2.getSecUid();
                    secUid.toString();
                    ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(c502700JnY.itemView.getContext(), builderAppendQueryParameter.appendQueryParameter("sec_user_id", secUid).appendQueryParameter("enter_from", "sub_only_space").build().toString());
                    InterfaceC502750Jnd interfaceC502750Jnd2 = interfaceC502750Jnd;
                    if (interfaceC502750Jnd2 != null) {
                        interfaceC502750Jnd2.LIZ(spacePost, "enter_homepage");
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(300L);
            }
        }, view);
    }
}
