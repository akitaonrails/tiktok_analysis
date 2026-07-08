package X;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import com.ss.android.ugc.aweme.authorize.I18nAuthorizeFragment;
import com.ss.android.ugc.aweme.minis.model.MinisMetaResp;
import com.ss.android.ugc.aweme.minis.model.NetworkResponse;
import com.ss.android.ugc.aweme.minis.viewmodel.MinisViewModel;
import com.ss.android.ugc.aweme.minis.viewmodel.SingleLiveEvent;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.1D0u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public class C2248981D0u extends ClickableSpan {
    public final int $t;
    public Object l0;
    public Object l1;

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
            default:
                super.updateDrawState(textPaint);
                break;
        }
    }

    public static final void onClick$0(C2248981D0u c2248981D0u, View view) {
        C2197371AzH c2197371AzH = C2197371AzH.LIZ;
        Context contextRequireContext = ((I18nAuthorizeFragment) c2248981D0u.l0).requireContext();
        String url = ((URLSpan) c2248981D0u.l1).getURL();
        c2197371AzH.getClass();
        C2197371AzH.LJ(contextRequireContext, url);
    }

    public static final void onClick$1(C2248981D0u c2248981D0u, View view) {
        String str;
        SingleLiveEvent<NetworkResponse<MinisMetaResp>> singleLiveEvent;
        NetworkResponse<MinisMetaResp> value;
        MinisMetaResp minisMetaResp;
        MinisViewModel minisViewModel = ((C2196981Aye) c2248981D0u.l0).LIZIZ;
        if (minisViewModel != null && (singleLiveEvent = minisViewModel.LLILLJJLI) != null && (value = singleLiveEvent.getValue()) != null && (minisMetaResp = value.data) != null) {
            str = minisMetaResp.privacyTosUrl;
        } else {
            str = null;
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getSpannableStringBuilderGame, privacyTosUrl:");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        if (str != null) {
            C2196981Aye.LIZIZ(((C2196981Aye) c2248981D0u.l0).LIZ, str);
        }
    }

    public static final void onClick$2(C2248981D0u c2248981D0u, View view) {
        String str;
        SingleLiveEvent<NetworkResponse<MinisMetaResp>> singleLiveEvent;
        NetworkResponse<MinisMetaResp> value;
        MinisMetaResp minisMetaResp;
        MinisViewModel minisViewModel = ((C2196981Aye) c2248981D0u.l0).LIZIZ;
        if (minisViewModel != null && (singleLiveEvent = minisViewModel.LLILLJJLI) != null && (value = singleLiveEvent.getValue()) != null && (minisMetaResp = value.data) != null) {
            str = minisMetaResp.privacyUrl;
        } else {
            str = null;
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getSpannableStringBuilderGame, privacyTosUrl:");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        if (str != null) {
            C2196981Aye.LIZIZ(((C2196981Aye) c2248981D0u.l0).LIZ, str);
        }
    }

    public static final void updateDrawState$0(C2248981D0u c2248981D0u, TextPaint textPaint) {
        textPaint.setColor(C446980Hfs.LIZ(((I18nAuthorizeFragment) c2248981D0u.l0).requireContext(), R.color.da));
        textPaint.setUnderlineText(false);
    }

    public static final void updateDrawState$1(C2248981D0u c2248981D0u, TextPaint textPaint) {
        int i = C2187451AjH.LIZ;
        textPaint.setUnderlineText(false);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1j, (Context) c2248981D0u.l1);
        if (numLIZJ != null) {
            textPaint.setColor(numLIZJ.intValue());
        }
    }

    public static final void updateDrawState$2(C2248981D0u c2248981D0u, TextPaint textPaint) {
        int i = C2187451AjH.LIZ;
        textPaint.setUnderlineText(false);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1j, (Context) c2248981D0u.l1);
        if (numLIZJ != null) {
            textPaint.setColor(numLIZJ.intValue());
        }
    }

    public C2248981D0u(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
