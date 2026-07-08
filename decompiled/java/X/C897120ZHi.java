package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.messagelist.api.wheedmbadge.WheeDmBadgeMessageListViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0ZHi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C897120ZHi implements InterfaceC897100ZHg {
    public final Context LIZ;
    public final SessionInfo LIZIZ;
    public final WheeDmBadgeMessageListViewModel LIZJ;
    public final EnumC897070ZHd LIZLLL = EnumC897070ZHd.WHEE_DM_BADGE;
    public final C01GW LJ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(386));

    @Override // X.InterfaceC897100ZHg
    public final boolean LIZ() {
        return false;
    }

    @Override // X.InterfaceC897100ZHg
    public final EnumC897070ZHd getType() {
        return this.LIZLLL;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x016f  */
    @Override // X.InterfaceC897100ZHg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.InterfaceC1233004s4> LIZIZ(java.util.List<? extends X.C869590Y9l> r13) {
        /*
            Method dump skipped, instruction units count: 487
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C897120ZHi.LIZIZ(java.util.List):java.util.List");
    }

    public final CharSequence LIZJ(Context context) {
        int iIntValue;
        boolean z;
        int length;
        int length2;
        String string = context.getString(2131858495, "\u200d", "\u200e");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(35));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
        int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(11));
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_color_whee_text_logo;
        c419910GdJ.LIZIZ = iLIZIZ;
        c419910GdJ.LIZJ = iLIZIZ2;
        C419890GdH c419890GdHLIZIZ = c419910GdJ.LIZIZ(2, context);
        C419910GdJ c419910GdJ2 = new C419910GdJ();
        c419910GdJ2.LIZ = R.raw.icon_chevron_right_fill_ltr;
        c419910GdJ2.LIZIZ = iLIZIZ3;
        c419910GdJ2.LIZJ = iLIZIZ3;
        c419910GdJ2.LIZLLL = Integer.valueOf(ColorProtector.parseColor("#06CF94"));
        C419890GdH c419890GdHLIZIZ2 = c419910GdJ2.LIZIZ(2, context);
        int iLJJJ = a0.LJJJ(string, "\u200d", 0, false, 6);
        int i = iLJJJ + 1;
        int iLJJJ2 = a0.LJJJ(string, "\u200e", i, false, 4);
        if (iLJJJ >= 0) {
            C786410Ut5.q2(spannableStringBuilder, c419890GdHLIZIZ, iLJJJ, i, 33);
        }
        if (iLJJJ2 >= 0) {
            C786410Ut5.q2(spannableStringBuilder, c419890GdHLIZIZ2, iLJJJ2, iLJJJ2 + 1, 33);
        }
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1k, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        Integer numValueOf = Integer.valueOf(iLJJJ);
        if (numValueOf.intValue() >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            length = numValueOf.intValue();
        } else {
            length = spannableStringBuilder.length();
        }
        Integer numValueOf2 = Integer.valueOf(iLJJJ2);
        if (numValueOf2.intValue() >= 0) {
            length2 = numValueOf2.intValue();
        } else {
            length2 = spannableStringBuilder.length();
        }
        int iMin = Math.min(length, length2);
        if (iMin > 0) {
            C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(iIntValue), 0, iMin, 33);
        }
        C786410Ut5.q2(spannableStringBuilder, new C913780Zt2(this, context, iIntValue, 0), 0, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public C897120ZHi(Context context, SessionInfo sessionInfo, WheeDmBadgeMessageListViewModel wheeDmBadgeMessageListViewModel) {
        this.LIZ = context;
        this.LIZIZ = sessionInfo;
        this.LIZJ = wheeDmBadgeMessageListViewModel;
    }
}
