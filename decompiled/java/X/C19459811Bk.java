package X;

import X.C19460111Bn;
import X.C1C7U;
import Y.ACListenerS163S0100000_29;
import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.ss.android.ugc.aweme.tools.draft.ftc.view.VideoDownloadStatusBar$Companion$mHandler$1;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.11Bk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19459811Bk extends RelativeLayout {
    public static final ArrayList<InterfaceC19460411Bq> LLJI = new ArrayList<>();
    public static final VideoDownloadStatusBar$Companion$mHandler$1 LLJIJIL;
    public RelativeLayout LL;
    public ImageView LLILLJJLI;
    public TextView LLILLL;
    public TextView LLILZ;
    public TextView LLILZIL;
    public TextView LLILZLL;
    public TextView LLIZ;
    public InterfaceC19460411Bq LLIZLLLIL;
    public final C19460011Bm LLJ;

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.tools.draft.ftc.view.VideoDownloadStatusBar$Companion$mHandler$1] */
    static {
        final Looper mainLooper = Looper.getMainLooper();
        LLJIJIL = new BPEAHandler(mainLooper) { // from class: com.ss.android.ugc.aweme.tools.draft.ftc.view.VideoDownloadStatusBar$Companion$mHandler$1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                C1C7U.LIZ("VideoDownloadStatusBar$Companion@b412.mHandler$1");
                C19460111Bn.LIZ();
                C1C7U.LIZIZ("VideoDownloadStatusBar$Companion@b412.mHandler$1");
            }
        };
    }

    public static void LIZLLL() {
        VideoDownloadStatusBar$Companion$mHandler$1 videoDownloadStatusBar$Companion$mHandler$1 = LLJIJIL;
        if (videoDownloadStatusBar$Companion$mHandler$1.hasMessages(1)) {
            videoDownloadStatusBar$Companion$mHandler$1.removeMessages(1);
        }
        if (videoDownloadStatusBar$Companion$mHandler$1.hasMessages(2)) {
            videoDownloadStatusBar$Companion$mHandler$1.removeMessages(2);
        }
    }

    public final void LIZ() {
        TextView textView = this.LLILZ;
        if (textView == null) {
            textView = null;
        }
        C786410Ut5.LLIL(textView, 8);
        TextView textView2 = this.LLILZIL;
        if (textView2 == null) {
            textView2 = null;
        }
        C786410Ut5.LLIL(textView2, 8);
        ImageView imageView = this.LLILLJJLI;
        if (imageView == null) {
            imageView = null;
        }
        C786410Ut5.LJZI(8, imageView);
        TextView textView3 = this.LLILLL;
        if (textView3 == null) {
            textView3 = null;
        }
        C786410Ut5.LLIL(textView3, 8);
        getMDownloadProgressViewRoot().setBackgroundColor(ColorProtector.parseColor("#383838"));
        C786410Ut5.LLIIL(getMDownloadProgressViewRoot(), 0);
        getMDownloadFailedTextView().setWidth(C12ES.LJIIJ(getContext()) - ((int) C12ES.LIZJ(77.0f, getContext())));
        C786410Ut5.LLIL(getMDownloadFailedTextView(), 0);
        TextView textView4 = this.LLIZ;
        C786410Ut5.LLIL(textView4 != null ? textView4 : null, 0);
        getMDownloadFailedTextView().requestLayout();
        getMDownloadProgressViewRoot().requestLayout();
        LIZJ();
        VideoDownloadStatusBar$Companion$mHandler$1 videoDownloadStatusBar$Companion$mHandler$1 = LLJIJIL;
        if (videoDownloadStatusBar$Companion$mHandler$1.hasMessages(2)) {
            return;
        }
        C786410Ut5.LJLJJI(2, 3000L, videoDownloadStatusBar$Companion$mHandler$1);
    }

    public final void LIZIZ() {
        TextView textView = this.LLILZ;
        if (textView == null) {
            textView = null;
        }
        C786410Ut5.LLIL(textView, 8);
        TextView textView2 = this.LLILZIL;
        if (textView2 == null) {
            textView2 = null;
        }
        C786410Ut5.LLIL(textView2, 8);
        TextView textView3 = this.LLIZ;
        if (textView3 == null) {
            textView3 = null;
        }
        C786410Ut5.LLIL(textView3, 8);
        C786410Ut5.LLIL(getMDownloadFailedTextView(), 8);
        getMDownloadProgressViewRoot().setBackgroundColor(getResources().getColor(R.color.cz));
        C786410Ut5.LLIIL(getMDownloadProgressViewRoot(), 0);
        ImageView imageView = this.LLILLJJLI;
        if (imageView == null) {
            imageView = null;
        }
        C786410Ut5.LJZI(0, imageView);
        TextView textView4 = this.LLILLL;
        C786410Ut5.LLIL(textView4 != null ? textView4 : null, 0);
        getMDownloadProgressViewRoot().requestLayout();
        LIZJ();
        VideoDownloadStatusBar$Companion$mHandler$1 videoDownloadStatusBar$Companion$mHandler$1 = LLJIJIL;
        if (videoDownloadStatusBar$Companion$mHandler$1.hasMessages(1)) {
            return;
        }
        C786410Ut5.LJLJJI(1, 1000L, videoDownloadStatusBar$Companion$mHandler$1);
    }

    public final TextView getMDownloadFailedTextView() {
        TextView textView = this.LLILZLL;
        if (textView != null) {
            return textView;
        }
        return null;
    }

    public final RelativeLayout getMDownloadProgressViewRoot() {
        RelativeLayout relativeLayout = this.LL;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        return null;
    }

    public final void LIZJ() {
        if (TextUtils.equals("ar", C0CHQ.LIZ().getAppLanguage())) {
            TextView textView = this.LLILZ;
            (textView != null ? textView : null).setText("%0");
        } else {
            TextView textView2 = this.LLILZ;
            (textView2 != null ? textView2 : null).setText("0%");
        }
    }

    public final InterfaceC19460411Bq getVideoDownloadClickListener() {
        return this.LLIZLLLIL;
    }

    public final void LJ(int i) {
        ImageView imageView = this.LLILLJJLI;
        TextView textView = null;
        if (imageView == null) {
            imageView = null;
        }
        C786410Ut5.LJZI(8, imageView);
        TextView textView2 = this.LLILLL;
        if (textView2 == null) {
            textView2 = null;
        }
        C786410Ut5.LLIL(textView2, 8);
        C786410Ut5.LLIL(getMDownloadFailedTextView(), 8);
        getMDownloadProgressViewRoot().setBackgroundColor(ColorProtector.parseColor("#383838"));
        C786410Ut5.LLIIL(getMDownloadProgressViewRoot(), 0);
        TextView textView3 = this.LLILZ;
        if (textView3 == null) {
            textView3 = null;
        }
        C786410Ut5.LLIL(textView3, 0);
        TextView textView4 = this.LLILZIL;
        if (textView4 == null) {
            textView4 = null;
        }
        C786410Ut5.LLIL(textView4, 0);
        TextView textView5 = this.LLIZ;
        if (textView5 == null) {
            textView5 = null;
        }
        C786410Ut5.LLIL(textView5, 0);
        if (TextUtils.equals("ar", C0CHQ.LIZ().getAppLanguage())) {
            TextView textView6 = this.LLILZ;
            if (textView6 != null) {
                textView = textView6;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('%');
            sbLIZ.append(i);
            textView.setText(C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        TextView textView7 = this.LLILZ;
        if (textView7 != null) {
            textView = textView7;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(i);
        sbLIZ2.append('%');
        textView.setText(C2188811AlT.LIZIZ(sbLIZ2));
    }

    public final void setMDownloadFailedTextView(TextView textView) {
        this.LLILZLL = textView;
    }

    public final void setMDownloadProgressViewRoot(RelativeLayout relativeLayout) {
        this.LL = relativeLayout;
    }

    public final void setVideoDownloadClickListener(InterfaceC19460411Bq interfaceC19460411Bq) {
        this.LLIZLLLIL = interfaceC19460411Bq;
    }

    public C19459811Bk(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLJ = new C19460011Bm();
        C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.fum, this, true);
        setMDownloadProgressViewRoot((RelativeLayout) findViewById(R.id.trf));
        C786410Ut5.S7(getMDownloadProgressViewRoot(), new View.OnClickListener() { // from class: X.11Bs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
            }
        });
        this.LLILLJJLI = (ImageView) findViewById(R.id.g4q);
        this.LLILLL = (TextView) findViewById(R.id.g4r);
        this.LLILZ = (TextView) findViewById(R.id.g4f);
        this.LLILZIL = (TextView) findViewById(R.id.g4v);
        setMDownloadFailedTextView((TextView) findViewById(R.id.g44));
        String string = getContext().getString(2131834556);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getContext().getString(2131834555));
        sbLIZ.append(' ');
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(string);
        sbLIZ2.append(strLIZIZ);
        SpannableString spannableString = new SpannableString(C2188811AlT.LIZIZ(sbLIZ2));
        C786410Ut5.p2(spannableString, new C19772712Xt(this, 1), a0.LJJJ(spannableString, strLIZIZ, 0, false, 6), (a0.LJJJ(spannableString, strLIZIZ, 0, false, 6) + strLIZIZ.length()) - 1, 17);
        getMDownloadFailedTextView().setMovementMethod(LinkMovementMethod.getInstance());
        getMDownloadFailedTextView().setText(spannableString);
        TextView textView = (TextView) findViewById(R.id.g42);
        this.LLIZ = textView;
        C786410Ut5.T7(textView == null ? null : textView, new ACListenerS163S0100000_29(this, 122));
        LIZJ();
    }
}
