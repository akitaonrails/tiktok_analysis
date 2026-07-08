package X;

import android.content.Context;
import android.net.Uri;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Dhk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C346220Dhk extends ClickableSpan {
    public final int $t;
    public Object l1;
    public String s0;

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
            default:
                super.onClick(view);
                break;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.$t) {
            case 0:
                textPaint.setUnderlineText(false);
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
            default:
                super.updateDrawState(textPaint);
                break;
        }
    }

    public static final void onClick$0(C346220Dhk c346220Dhk, View view) {
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute((Context) c346220Dhk.l1, "//webview");
        smartRouteBuildRoute.withParam("url", c346220Dhk.s0);
        smartRouteBuildRoute.open();
    }

    public static final void onClick$1(C346220Dhk c346220Dhk, View view) {
        SmartRouter.buildRoute(((C1239710iMj) c346220Dhk.l1).getContext(), new Uri.Builder().scheme("aweme").authority("webview").appendQueryParameter("url", UriProtector.parse(c346220Dhk.s0).buildUpon().appendQueryParameter("page", "policy").build().toString()).appendQueryParameter("use_spark", "1").build().toString()).open();
    }

    public static final void onClick$2(C346220Dhk c346220Dhk, View view) {
        if (!TextUtils.isEmpty(c346220Dhk.s0)) {
            SmartRouter.buildRoute(((C1239710iMj) c346220Dhk.l1).getContext(), new Uri.Builder().scheme("aweme").authority("webview").appendQueryParameter("url", UriProtector.parse(c346220Dhk.s0).buildUpon().appendQueryParameter("page", "policy").build().toString()).appendQueryParameter("use_spark", "1").build().toString()).open();
        }
    }

    public static final void onClick$3(C346220Dhk c346220Dhk, View view) {
        String str;
        if (((C1239710iMj) c346220Dhk.l1).getMusicUsageOrigin()) {
            str = "original";
        } else {
            str = "general";
        }
        if (!TextUtils.isEmpty(c346220Dhk.s0)) {
            SmartRouter.buildRoute(((C1239710iMj) c346220Dhk.l1).getContext(), new Uri.Builder().scheme("aweme").authority("webview").appendQueryParameter("url", UriProtector.parse(c346220Dhk.s0).buildUpon().appendQueryParameter("page", "music").appendQueryParameter("music_type", str).build().toString()).appendQueryParameter("use_spark", "1").build().toString()).open();
        }
    }

    public static final void updateDrawState$1(C346220Dhk c346220Dhk, TextPaint textPaint) {
        textPaint.setColor(C960203pA.LIZ(R.attr.a1h, ((C1239710iMj) c346220Dhk.l1).getContext()));
        textPaint.setUnderlineText(false);
    }

    public static final void updateDrawState$2(C346220Dhk c346220Dhk, TextPaint textPaint) {
        textPaint.setColor(C960203pA.LIZ(R.attr.a1h, ((C1239710iMj) c346220Dhk.l1).getContext()));
        textPaint.setUnderlineText(false);
    }

    public static final void updateDrawState$3(C346220Dhk c346220Dhk, TextPaint textPaint) {
        textPaint.setColor(C960203pA.LIZ(R.attr.a1h, ((C1239710iMj) c346220Dhk.l1).getContext()));
        textPaint.setUnderlineText(false);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public C346220Dhk(X.C1239710iMj r2, java.lang.String r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            switch(r4) {
                case 1: goto Le;
                case 2: goto Le;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l1 = r2
            r0.s0 = r3
        La:
            r0.<init>()
            return
        Le:
            r0 = r1
            r0.s0 = r3
            r0.l1 = r2
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C346220Dhk.<init>(X.0iMj, java.lang.String, int):void");
    }

    public C346220Dhk(Context context, String str, int i) {
        this.$t = i;
        this.l1 = context;
        this.s0 = str;
    }
}
