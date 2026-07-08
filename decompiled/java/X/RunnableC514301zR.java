package X;

import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.ReplaceMusicBottomBarAssem;
import com.ss.android.ugc.profile.business.ur.ProfileNavbarOtherNicknameProtocol;
import com.zhiliaoapp.musically.R;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.01zR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC514301zR implements Runnable {
    public final int $t;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;
    public String s1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        TuxTextView tuxTextView;
        TextPaint paint;
        String strLIZIZ;
        TuxTextView tuxTextView2 = (TuxTextView) this.l2;
        if (tuxTextView2 == null || tuxTextView2.getLineCount() <= 1 || (tuxTextView = (TuxTextView) this.l2) == null || (paint = tuxTextView.getPaint()) == null) {
            return;
        }
        float fMeasureText = paint.measureText(this.s0);
        if (((TuxTextView) this.l2) != null) {
            float width = (r0.getWidth() - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(80))) / fMeasureText;
            int length = (int) ((this.s0.length() * width) - 3);
            if (length <= 0 || width >= 1.0f) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append((Object) this.s0.subSequence(0, 1));
                sbLIZ.append("...");
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                if (((TuxTextView) this.l2).getPaint().measureText(strLIZIZ) >= fMeasureText) {
                    strLIZIZ = "";
                }
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append((Object) this.s0.subSequence(0, length));
                sbLIZ2.append("...");
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            }
            ProfileNavbarOtherNicknameProtocol profileNavbarOtherNicknameProtocol = (ProfileNavbarOtherNicknameProtocol) this.l3;
            int iIntValue = ((Integer) this.l4).intValue();
            String str = this.s1;
            profileNavbarOtherNicknameProtocol.LJLILLLLZI(iIntValue, strLIZIZ, str != null ? str : "");
        }
    }

    public final void LIZ$1() {
        SpannableString spannableString = new SpannableString(this.s0);
        int iLJJJ = a0.LJJJ(this.s0, this.s1, 0, false, 6);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.agw, ((ReplaceMusicBottomBarAssem) this.l3).getContentView().getContext());
        C786410Ut5.p2(spannableString, numLIZJ != null ? new ForegroundColorSpan(numLIZJ.intValue()) : null, iLJJJ, this.s1.length() + iLJJJ, 17);
        ((TuxTextView) this.l4).setText(spannableString);
    }

    public static final void run$0(RunnableC514301zR runnableC514301zR) {
        boolean zLIZ;
        C1C7U.LIZ("ProfileNavbarOtherNicknameProtocol@d237.updateComponentUIAndData$1");
        try {
            runnableC514301zR.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ProfileNavbarOtherNicknameProtocol@d237.updateComponentUIAndData$1");
    }

    public static final void run$1(RunnableC514301zR runnableC514301zR) {
        boolean zLIZ;
        C1C7U.LIZ("ReplaceMusicBottomBarAssem@aef8.tryShow$lambda$2$$inlined$doOnPreDraw$1");
        try {
            runnableC514301zR.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ReplaceMusicBottomBarAssem@aef8.tryShow$lambda$2$$inlined$doOnPreDraw$1");
    }

    public RunnableC514301zR(Object obj, String str, Object obj2, Object obj3, String str2, int i) {
        this.$t = i;
        this.l2 = obj;
        this.s0 = str;
        this.l3 = obj2;
        this.l4 = obj3;
        this.s1 = str2;
    }
}
