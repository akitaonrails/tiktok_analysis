package X;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.ICLACaptionService;
import com.ss.android.ugc.aweme.sticker.data.TextStickerInfo;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.11jF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19581111jF extends FrameLayout {
    public final TextView LL;
    public final ICLACaptionService LLILLJJLI;
    public final FrameLayout LLILLL;
    public TextStickerInfo LLILZ;
    public C705930RmZ LLILZIL;
    public boolean LLILZLL;

    public final String getCurText() {
        TextView textView = this.LL;
        return String.valueOf(textView != null ? textView.getText() : null);
    }

    public final int getTranslateTextSize() {
        if (this.LL != null) {
            return C341940Daq.LIZIZ(r0.getTextSize());
        }
        return 24;
    }

    public final FrameLayout getBgContainer() {
        return this.LLILLL;
    }

    public final C705930RmZ getInteractStickerParams() {
        return this.LLILZIL;
    }

    public C19581111jF(Context context) {
        FrameLayout frameLayout;
        super(context);
        this.LLILLJJLI = (ICLACaptionService) ServiceManager.get().getService(ICLACaptionService.class);
        new TextPaint();
        View viewLIZ = C20742916Ex.LIZ(getContext(), R.layout.iaq, this, false, -1);
        if (viewLIZ instanceof FrameLayout) {
            frameLayout = (FrameLayout) viewLIZ;
        } else {
            frameLayout = null;
        }
        this.LLILLL = frameLayout;
        this.LL = frameLayout != null ? (TextView) frameLayout.findViewById(R.id.xrf) : null;
        addView(frameLayout);
    }

    public final void setInteractStickerParams(C705930RmZ c705930RmZ) {
        this.LLILZIL = c705930RmZ;
    }

    public static final void LIZ(Integer num, C19581111jF c19581111jF, TextView textView) {
        ViewGroup.LayoutParams layoutParams;
        if (num != null) {
            int iIntValue = num.intValue();
            if (textView != null && (layoutParams = textView.getLayoutParams()) != null) {
                layoutParams.width = iIntValue;
            }
        }
        FrameLayout frameLayout = c19581111jF.LLILLL;
        if (frameLayout != null) {
            frameLayout.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)));
        }
        if (textView != null) {
            textView.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)));
            textView.requestLayout();
        }
    }
}
