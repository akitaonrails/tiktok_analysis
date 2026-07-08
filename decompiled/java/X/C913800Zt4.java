package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.sheet.intro.TuxPanel;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.archive.InboxArchivePageTitleBarAssem;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.archive.settings.ArchiveSettingFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0Zt4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public class C913800Zt4 extends ClickableSpan {
    public final int $t;
    public Object l0;

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
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
            default:
                super.updateDrawState(textPaint);
                break;
        }
    }

    public C913800Zt4(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onClick$0(C913800Zt4 c913800Zt4, View view) {
        C19EG c19eg = (C19EG) c913800Zt4.l0;
        C857660Xki.LJIIIIZZ(c19eg, true, c19eg.getSupportFragmentManager());
        C857700Xkm.LIZ.getClass();
        C20684815ws.LJIILLIIL("content_check_learn_more_click", new LinkedHashMap());
    }

    public static final void onClick$1(C913800Zt4 c913800Zt4, View view) {
        String str = ArchiveSettingFragment._pnsPageId;
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(((InboxArchivePageTitleBarAssem) c913800Zt4.l0).getContext(), "aweme://im/archive_settings");
        smartRouteBuildRoute.withParam("enter_method", "click_how_it_work_panel");
        smartRouteBuildRoute.open();
        TuxPanel tuxPanel = ((InboxArchivePageTitleBarAssem) c913800Zt4.l0).LLJI;
        if (tuxPanel != null) {
            tuxPanel.dismiss();
        }
    }

    public static final void updateDrawState$0(C913800Zt4 c913800Zt4, TextPaint textPaint) {
        super.updateDrawState(textPaint);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, (C19EG) c913800Zt4.l0);
        if (numLIZJ != null) {
            textPaint.setColor(numLIZJ.intValue());
        }
        textPaint.setUnderlineText(false);
    }

    public static final void updateDrawState$1(C913800Zt4 c913800Zt4, TextPaint textPaint) {
        int iIntValue;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1n, ((InboxArchivePageTitleBarAssem) c913800Zt4.l0).Jo());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -16776961;
        }
        textPaint.setColor(iIntValue);
        textPaint.setUnderlineText(false);
    }
}
