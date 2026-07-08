package X;

import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.text.a0;
import kotlin.text.u;
import ttpobfuscated.e3;
import webcast.api.room.EncourageGoLiveCard;
import webcast.api.room.GoLiveCardPicture;

/* JADX INFO: renamed from: X.0Ic0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C470060Ic0 extends AbstractC470040Iby {
    public ViewTreeObserverOnGlobalLayoutListenerC521810KdH LLJJJJJIL;
    public C19R6 LLJJJJLIIL;

    @Override // X.AbstractC470040Iby
    public final int LJIIZILJ() {
        return R.layout.hjv;
    }

    @Override // X.AbstractC470040Iby
    public final int LJIJ() {
        return 1;
    }

    @Override // X.AbstractC470040Iby
    public final void LJJ(View view) {
    }

    @Override // X.AbstractC470040Iby
    public final boolean LJJI() {
        return true;
    }

    @Override // X.AbstractC470040Iby
    public final boolean LJJIFFI() {
        EncourageGoLiveCard encourageGoLiveCard = this.LLILZ;
        return C500260Jjc.LJJIIZ(encourageGoLiveCard != null ? encourageGoLiveCard.bgImgUrl : null);
    }

    @Override // X.AbstractC470040Iby, X.AbstractC463340IEy
    public final void LIZIZ() {
        super.LIZIZ();
        this.LLJJJJJIL = null;
        this.LLJJJJLIIL = null;
    }

    @Override // X.AbstractC470040Iby, X.AbstractC463340IEy
    public final void LJII(View view, Bundle bundle) {
        String str;
        SpannableString spannableString;
        super.LJII(view, bundle);
        EncourageGoLiveCard encourageGoLiveCard = this.LLILZ;
        if (encourageGoLiveCard == null) {
            return;
        }
        ViewGroup viewGroup = this.LLJJIII;
        if (viewGroup != null) {
            TextView textView = (TextView) viewGroup.findViewById(R.id.tv_title);
            if (textView != null) {
                if (encourageGoLiveCard.title.length() == 0) {
                    C500260Jjc.LJIILIIL(textView);
                } else {
                    String str2 = encourageGoLiveCard.title;
                    String str3 = encourageGoLiveCard.diffColor;
                    int iLJJJ = a0.LJJJ(str2, e3.e, 0, false, 6);
                    int iLJJJ2 = a0.LJJJ(str2, e3.f, 0, false, 6);
                    if (iLJJJ2 > iLJJJ + 1 && iLJJJ > -1) {
                        spannableString = new SpannableString(u.LJJIFFI(u.LJJIFFI(str2, e3.e, "", false), e3.f, "", false));
                        try {
                            C786410Ut5.p2(spannableString, new ForegroundColorSpan(Color.parseColor(str3)), iLJJJ, iLJJJ2 - 1, 18);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    } else {
                        spannableString = new SpannableString(str2);
                    }
                    textView.setText(spannableString);
                }
            }
            TextView textView2 = (TextView) viewGroup.findViewById(R.id.tv_sub_title);
            if (textView2 != null) {
                if (encourageGoLiveCard.subTitle.length() == 0) {
                    C500260Jjc.LJIILIIL(textView2);
                } else {
                    textView2.setText(encourageGoLiveCard.subTitle);
                }
            }
            this.LLJJJJLIIL = (C19R6) viewGroup.findViewById(R.id.lo3);
            GoLiveCardPicture goLiveCardPicture = (GoLiveCardPicture) C13LP.LJJJLL(encourageGoLiveCard.pictures);
            if (goLiveCardPicture != null && (str = goLiveCardPicture.url) != null) {
                LJIJJ(str, this.LLJJJJLIIL, ImageView.ScaleType.FIT_CENTER);
            }
        }
        this.LLJJJJJIL = new ViewTreeObserverOnGlobalLayoutListenerC521810KdH(view, this, 7);
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver != null) {
            ViewTreeObserverOnGlobalLayoutListenerC521810KdH viewTreeObserverOnGlobalLayoutListenerC521810KdH = this.LLJJJJJIL;
            viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC521810KdH);
            C2187701Ajg.LIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC521810KdH, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
    }
}
