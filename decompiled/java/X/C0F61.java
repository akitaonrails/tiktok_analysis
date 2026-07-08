package X;

import Y.ACListenerS40S0201000_5;
import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.shortvideo.inlinecaption.CaptionUtterance;
import com.ss.android.ugc.aweme.sticker.data.Utterance;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0F61, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0F61 extends C0F62 {
    public final View LLILZ;
    public final Context LLILZIL;
    public final TextView LLILZLL;
    public final /* synthetic */ C384570F5z LLIZ;

    @Override // X.C0F62
    public final Context getContext() {
        return this.LLILZIL;
    }

    @Override // X.C0F62
    public final void L5(int i, boolean z) {
        if (z) {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.hn, this.LLILZIL);
            if (numLIZJ != null) {
                this.LLILZLL.setTextColor(numLIZJ.intValue());
                return;
            }
            return;
        }
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.eh, this.LLILZIL);
        if (numLIZJ2 == null) {
            return;
        }
        this.LLILZLL.setTextColor(numLIZJ2.intValue());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0F61(C384570F5z c384570F5z, View view, Context context) {
        super(context, view);
        this.LLIZ = c384570F5z;
        this.LLILZ = view;
        this.LLILZIL = context;
        this.LLILZLL = (TextView) view.findViewById(R.id.wmd);
    }

    @Override // X.C0F62
    public final void I5(CaptionUtterance captionUtterance, final int i, boolean z) {
        String text;
        L5(i, z);
        C786410Ut5.LLIL(this.LLILZLL, 0);
        TextView textView = this.LLILZLL;
        TextStickerData textStickerData = captionUtterance.inlineUtterance;
        if (textStickerData == null || (text = textStickerData.getTextStr()) == null) {
            Utterance utterance = captionUtterance.utterance;
            if (utterance != null) {
                text = utterance.getText();
            } else {
                text = null;
            }
        }
        textView.setText(text);
        if (!TextUtils.isEmpty(this.LLILZLL.getText())) {
            TextView textView2 = this.LLILZLL;
            final C384570F5z c384570F5z = this.LLIZ;
            textView2.setOnTouchListener(new View.OnTouchListener() { // from class: X.0F60
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    if (motionEvent.getActionMasked() == 0) {
                        c384570F5z.LLJ = motionEvent.getX();
                        c384570F5z.LLJI = motionEvent.getY();
                        c384570F5z.LLJIJIL = i;
                        return false;
                    }
                    return false;
                }
            });
            C786410Ut5.T7(this.LLILZLL, new ACListenerS40S0201000_5(i, this, this.LLIZ, 0));
        }
    }
}
