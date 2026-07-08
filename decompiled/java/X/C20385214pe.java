package X;

import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.livesetting.linkmic.PlaybookAutoRunTypeSetting;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS397S0200000_31;

/* JADX INFO: renamed from: X.14pe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20385214pe extends AbstractC960470b6L<C20389314qJ> {
    public final InterfaceC20390014qQ LL;
    public TextView LLILLJJLI;
    public TextView LLILLL;
    public LiveIconView LLILZ;
    public TextView LLILZIL;

    public final void L5(C20389314qJ c20389314qJ) {
        String str;
        C500260Jjc.LJLIIIL(500L, this.itemView, new AwS397S0200000_31(this, c20389314qJ, 73));
        this.LLILLJJLI = (TextView) this.itemView.findViewById(R.id.qqa);
        this.LLILLL = (TextView) this.itemView.findViewById(R.id.qq_);
        this.LLILZ = (LiveIconView) this.itemView.findViewById(R.id.qq9);
        this.LLILZIL = (TextView) this.itemView.findViewById(R.id.qpx);
        TextView textView = this.LLILLJJLI;
        if (textView != null) {
            textView.setText(c20389314qJ.LIZ.LIZIZ);
        }
        if (c20389314qJ.LIZ.LIZJ.isEmpty()) {
            if (c20389314qJ.LIZIZ) {
                this.itemView.setBackgroundResource(R.drawable.f3l);
            } else {
                this.itemView.setBackgroundResource(R.drawable.f3k);
            }
        } else if (c20389314qJ.LIZIZ) {
            this.itemView.setBackgroundResource(R.drawable.f3n);
        } else {
            this.itemView.setBackgroundResource(R.drawable.f3m);
        }
        if (c20389314qJ.LIZIZ) {
            LiveIconView liveIconView = this.LLILZ;
            if (liveIconView != null) {
                C12ES.LJIILL(0, liveIconView);
            }
        } else {
            LiveIconView liveIconView2 = this.LLILZ;
            if (liveIconView2 != null) {
                C439101nJ.LJI(liveIconView2);
            }
        }
        if (C978390bZF.LIZ() && (str = c20389314qJ.LIZ.LIZLLL) != null && str.length() != 0) {
            TextView textView2 = this.LLILLL;
            if (textView2 != null) {
                C786410Ut5.LLIL(textView2, 0);
            }
            TextView textView3 = this.LLILLL;
            if (textView3 != null) {
                textView3.setText(c20389314qJ.LIZ.LIZLLL);
            }
        } else {
            TextView textView4 = this.LLILLL;
            if (textView4 != null) {
                C786410Ut5.LLIL(textView4, 8);
            }
        }
        String str2 = c20389314qJ.LIZJ;
        if (str2 != null && str2.length() != 0 && PlaybookAutoRunTypeSetting.INSTANCE.enable()) {
            TextView textView5 = this.LLILZIL;
            if (textView5 != null) {
                textView5.setText(c20389314qJ.LIZJ);
            }
            TextView textView6 = this.LLILZIL;
            if (textView6 != null) {
                C12ES.LJIILL(0, textView6);
                return;
            }
            return;
        }
        TextView textView7 = this.LLILZIL;
        if (textView7 == null) {
            return;
        }
        C439101nJ.LJI(textView7);
    }

    public C20385214pe(View view, InterfaceC20390014qQ interfaceC20390014qQ) {
        super(view);
        this.LL = interfaceC20390014qQ;
    }

    @Override // X.AbstractC960470b6L
    public final /* bridge */ /* synthetic */ void I5(int i, Object obj) {
        L5((C20389314qJ) obj);
    }
}
