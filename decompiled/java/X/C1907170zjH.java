package X;

import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.widget.TextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentImageStruct;
import com.ss.android.ugc.aweme.notice.repo.list.bean.AtMe;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.CommentNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.GeneralTemplateNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.SearchHighLights;
import com.ss.android.ugc.aweme.notice.repo.list.uitemplate.NoticeUITemplate;
import com.ss.android.ugc.aweme.notification.view.NotificationBoldSpan;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0zjH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1907170zjH {
    public static final SpannableStringBuilder LIZJ(SpannableStringBuilder spannableStringBuilder, TextPaint textPaint, int i, int i2, int i3, int i4) {
        return C0P0O.LIZJ(spannableStringBuilder, textPaint, i, i2, i3, i4, true);
    }

    public static final void LIZ(final TextView textView, final SpannableStringBuilder spannableStringBuilder, final BaseNotice baseNotice, final int i, int i2, final C1242270iQr c1242270iQr, final EnumC1906270zhp enumC1906270zhp) {
        AtMe atMe;
        Comment comment;
        Comment comment2;
        String strLIZIZ;
        int length;
        String str;
        int length2;
        String str2;
        String str3;
        String str4;
        if (i2 == 0) {
            HandlerHook.viewPost(textView, new Runnable() { // from class: X.0zjN
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("MTNewBaseNotificationHolderKt@2350.addTimeAndSetEllipsized$1");
                    try {
                        TextView textView2 = textView;
                        C1907170zjH.LIZ(textView2, spannableStringBuilder, baseNotice, i, textView2.getWidth(), c1242270iQr, enumC1906270zhp);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("MTNewBaseNotificationHolderKt@2350.addTimeAndSetEllipsized$1");
                }
            });
            return;
        }
        int length3 = 0;
        textView.setBreakStrategy(0);
        GeneralTemplateNotice generalTemplateNotice = baseNotice.templateNotice;
        final List<CommentImageStruct> imageList = null;
        if (generalTemplateNotice != null) {
            NoticeUITemplate noticeUITemplate = generalTemplateNotice.uiTemplate;
            if (noticeUITemplate != null) {
                imageList = noticeUITemplate.commentsImageList;
            }
        } else {
            int i3 = baseNotice.type;
            if (i3 == 31) {
                CommentNotice commentNotice = baseNotice.commentNotice;
                if (commentNotice != null && (comment2 = commentNotice.getComment()) != null) {
                    imageList = comment2.getImageList();
                }
            } else if (i3 == 45 && (atMe = baseNotice.atMe) != null && (comment = atMe.getComment()) != null) {
                imageList = comment.getImageList();
            }
        }
        String str5 = "";
        if (imageList == null || imageList.isEmpty() || ((Number) C276110Arx.LIZ.getValue()).intValue() > 0) {
            strLIZIZ = "";
        } else {
            spannableStringBuilder.append(" T");
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_image;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(14.0d)));
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(14.0d)));
            C786410Ut5.q2(spannableStringBuilder, c419910GdJ.LIZIZ(2, textView.getContext()), spannableStringBuilder.length() - 2, spannableStringBuilder.length(), 33);
            String string = textView.getContext().getString(2131829122);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(' ');
            sbLIZ.append(string);
            spannableStringBuilder.append((CharSequence) C2188811AlT.LIZIZ(sbLIZ));
            final UrlModel originUrl = ((CommentImageStruct) ListProtector.get(imageList, 0)).getOriginUrl();
            final int iLIZ = C1618770sE7.LIZ(R.attr.a1h);
            C786410Ut5.q2(spannableStringBuilder, new AbstractC431450Gvv(iLIZ, imageList, originUrl) { // from class: X.0l8U
                public final /* synthetic */ List<CommentImageStruct> LLILZ;
                public final /* synthetic */ UrlModel LLILZIL;

                /* JADX WARN: Removed duplicated region for block: B:14:0x0073  */
                @Override // android.text.style.ClickableSpan
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void onClick(android.view.View r12) {
                    /*
                        r11 = this;
                        java.util.List<com.ss.android.ugc.aweme.comment.model.CommentImageStruct> r0 = r11.LLILZ
                        boolean r0 = r0.isEmpty()
                        r10 = 1
                        r0 = r0 ^ 1
                        r2 = 0
                        if (r0 == 0) goto L73
                        java.util.List<com.ss.android.ugc.aweme.comment.model.CommentImageStruct> r0 = r11.LLILZ
                        java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r2)
                        com.ss.android.ugc.aweme.comment.model.CommentImageStruct r0 = (com.ss.android.ugc.aweme.comment.model.CommentImageStruct) r0
                        int r0 = r0.getSource()
                        if (r0 == 0) goto L71
                        if (r0 != r10) goto L73
                        r9 = 2
                    L1d:
                        com.ss.android.ugc.aweme.base.model.UrlModel r1 = r11.LLILZIL
                        java.lang.Integer r8 = java.lang.Integer.valueOf(r9)
                        java.lang.String r7 = "is_photo_contained"
                        java.lang.String r6 = "inbox_notice"
                        java.lang.String r5 = "source"
                        java.lang.String r4 = "notification_page"
                        java.lang.String r3 = "enter_from"
                        if (r1 == 0) goto L57
                        com.ss.android.ugc.aweme.base.model.UrlModel[] r0 = new com.ss.android.ugc.aweme.base.model.UrlModel[r10]
                        r0[r2] = r1
                        java.util.ArrayList r2 = X.C1697810uHb.LJ(r0)
                        X.0XAv r0 = X.C844470XAv.LIZ
                        r0.getClass()
                        android.content.Context r1 = X.C844470XAv.LIZ()
                        java.lang.String r0 = "//comment/photo_detail"
                        com.bytedance.router.SmartRoute r1 = com.bytedance.router.SmartRouter.buildRoute(r1, r0)
                        java.lang.String r0 = "image_uri"
                        r1.withParam(r0, r2)
                        r1.withParam(r3, r4)
                        r1.withParam(r5, r6)
                        r1.withParam(r7, r8)
                        r1.open()
                    L57:
                        java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
                        X.09Gk r0 = new X.09Gk
                        r0.<init>()
                        r0.LJIIIIZZ(r3, r4)
                        r0.LJIIIIZZ(r5, r6)
                        r0.LJ(r1, r7)
                        java.util.Map<java.lang.String, java.lang.String> r1 = r0.LIZ
                        java.lang.String r0 = "full_screen_view_photo"
                        X.C20684815ws.LJIILLIIL(r0, r1)
                        return
                    L71:
                        r9 = 1
                        goto L1d
                    L73:
                        r9 = 0
                        goto L1d
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1346200l8U.onClick(android.view.View):void");
                }

                @Override // X.AbstractC431450Gvv, android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public final void updateDrawState(TextPaint textPaint) {
                    super.updateDrawState(textPaint);
                    textPaint.setUnderlineText(false);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(iLIZ, iLIZ);
                    this.LLILZ = imageList;
                    this.LLILZIL = originUrl;
                }
            }, (spannableStringBuilder.length() - string.length()) - 2, spannableStringBuilder.length(), 33);
            boolean zIsClickable = textView.isClickable();
            boolean zIsLongClickable = textView.isLongClickable();
            textView.setMovementMethod(C431440Gvu.LIZ());
            textView.setClickable(zIsClickable);
            textView.setLongClickable(zIsLongClickable);
            C786410Ut5.q2(spannableStringBuilder, new NotificationBoldSpan(), spannableStringBuilder.length() - string.length(), spannableStringBuilder.length(), 33);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(" T");
            sbLIZ2.append(string);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        String strAddCreateTimeSpan = AbstractC1906850zil.addCreateTimeSpan(spannableStringBuilder, baseNotice, textView.getContext(), enumC1906270zhp);
        if (c1242270iQr != null) {
            NoticeUITemplate noticeUITemplate2 = baseNotice.templateNotice.uiTemplate;
            if (noticeUITemplate2 != null && (str4 = noticeUITemplate2.content) != null) {
                length = str4.length();
            } else {
                length = 0;
            }
            List<SearchHighLights> list = baseNotice.searchHighLights;
            ArrayList arrayList = new ArrayList();
            for (SearchHighLights searchHighLights : list) {
                int i4 = searchHighLights.startIndex;
                if (i4 <= length && searchHighLights.endIndex <= length) {
                    arrayList.add(new Pair(Integer.valueOf(i4), Integer.valueOf(searchHighLights.endIndex)));
                }
            }
            ArrayList arrayList2 = new ArrayList(arrayList);
            String str6 = c1242270iQr.LIZJ;
            if (str6 != null && str6.length() > 0 && arrayList2.isEmpty()) {
                int i5 = C2187451AjH.LIZ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("addTimeAndSetEllipsized() - keyword = ");
                sbLIZ3.append(str6);
                C1720106oR.LJI("MTNewBaseNotificationHolder", C2188811AlT.LIZIZ(sbLIZ3));
                NoticeUITemplate noticeUITemplate3 = baseNotice.templateNotice.uiTemplate;
                if (noticeUITemplate3 != null && (str3 = noticeUITemplate3.templateContent) != null) {
                    length2 = str3.length();
                } else {
                    length2 = 0;
                }
                NoticeUITemplate noticeUITemplate4 = baseNotice.templateNotice.uiTemplate;
                if (noticeUITemplate4 != null && (str2 = noticeUITemplate4.content) != null) {
                    str5 = str2;
                }
                for (int iLJJIJLIJ = a0.LJJIJLIJ(length2, str5, str6, true); iLJJIJLIJ != -1; iLJJIJLIJ = a0.LJJIJLIJ(iLJJIJLIJ + str6.length() + 1, str5, str6, true)) {
                    arrayList2.add(new Pair(Integer.valueOf(iLJJIJLIJ), Integer.valueOf(str6.length() + iLJJIJLIJ)));
                }
            }
            C19212010Ec c19212010Ec = C19212010Ec.LIZJ;
            NoticeUITemplate noticeUITemplate5 = baseNotice.templateNotice.uiTemplate;
            if (noticeUITemplate5 != null && (str = noticeUITemplate5.templateContent) != null) {
                length3 = str.length();
            }
            textView.setText(c19212010Ec.LJLIL(textView, spannableStringBuilder, i2, i, length3, strLIZIZ.length() + strAddCreateTimeSpan.length(), arrayList2, 52));
            return;
        }
        TextPaint paint = textView.getPaint();
        int length4 = strAddCreateTimeSpan.length() + strLIZIZ.length();
        TextPaint paint2 = textView.getPaint();
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append(strLIZIZ);
        sbLIZ4.append(strAddCreateTimeSpan);
        textView.setText(LIZJ(spannableStringBuilder, paint, i2, i, length4, (int) paint2.measureText(C2188811AlT.LIZIZ(sbLIZ4))));
    }
}
