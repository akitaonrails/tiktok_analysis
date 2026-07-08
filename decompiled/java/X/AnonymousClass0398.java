package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextPaint;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS185S0000000_1;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0398, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class AnonymousClass0398 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(SpannableString spannableString, List list, AFwS185S0000000_1 aFwS185S0000000_1, final Context context, final List list2) {
        try {
            final int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                C444920HcY c444920HcY = null;
                if (i >= 0) {
                    String str = (String) obj;
                    int iLJJJJI = a0.LJJJJI(spannableString, str, 0, 6);
                    if (aFwS185S0000000_1 != null) {
                        c444920HcY = (C444920HcY) aFwS185S0000000_1.invoke();
                    }
                    if (c444920HcY != null) {
                        C786410Ut5.p2(spannableString, c444920HcY, iLJJJJI, str.length() + iLJJJJI, 33);
                    }
                    if (list2 != null) {
                        C786410Ut5.p2(spannableString, new AbstractC426530Gnz() { // from class: X.0397
                            @Override // android.text.style.ClickableSpan
                            public final void onClick(View view) {
                                Function0 function0 = (Function0) C13LP.LJJJLZIJ(i, list2);
                                if (function0 != null) {
                                    function0.invoke();
                                }
                            }

                            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                            public final void updateDrawState(TextPaint textPaint) {
                                Integer numLIZJ;
                                super.updateDrawState(textPaint);
                                textPaint.setUnderlineText(false);
                                Context context2 = context;
                                if (context2 != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a1n, context2)) != null) {
                                    textPaint.setColor(numLIZJ.intValue());
                                }
                            }
                        }, iLJJJJI, str.length() + iLJJJJI, 33);
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
