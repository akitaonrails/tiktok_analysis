package X;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0Vxh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C814750Vxh extends AbstractC814720Vxe {
    public final List<C814760Vxi> LJ = new ArrayList();
    public final List<C814760Vxi> LJFF = new ArrayList();
    public final C815260VyW LJI;
    public CharSequence LJII;
    public Boolean LJIIIIZZ;

    @Override // X.AbstractC814720Vxe
    public final String LJ() {
        return "androidx.core.app.NotificationCompat$MessagingStyle";
    }

    public C814750Vxh() {
        C815290VyZ c815290VyZ = new C815290VyZ();
        c815290VyZ.LIZ = "";
        this.LJI = new C815260VyW(c815290VyZ);
    }

    public C814750Vxh(C815260VyW c815260VyW) {
        if (!TextUtils.isEmpty(c815260VyW.LIZ)) {
            this.LJI = c815260VyW;
            return;
        }
        throw new IllegalArgumentException("User's name must not be empty.");
    }

    @Override // X.AbstractC814720Vxe
    public final void LIZ(Bundle bundle) {
        super.LIZ(bundle);
        C786410Ut5.LJJIJIIJI(bundle, "android.selfDisplayName", this.LJI.LIZ);
        C786410Ut5.LJJIIZI(bundle, this.LJI.LIZ(), "android.messagingStyleUser");
        C786410Ut5.LJJIJIIJI(bundle, "android.hiddenConversationTitle", this.LJII);
        if (this.LJII != null && this.LJIIIIZZ.booleanValue()) {
            C786410Ut5.LJJIJIIJI(bundle, "android.conversationTitle", this.LJII);
        }
        if (!((ArrayList) this.LJ).isEmpty()) {
            C786410Ut5.LJJIJLIJ(bundle, "android.messages", C814760Vxi.LIZ(this.LJ));
        }
        if (!((ArrayList) this.LJFF).isEmpty()) {
            C786410Ut5.LJJIJLIJ(bundle, "android.messages.historic", C814760Vxi.LIZ(this.LJFF));
        }
        Boolean bool = this.LJIIIIZZ;
        if (bool != null) {
            bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x014b  */
    @Override // X.AbstractC814720Vxe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(X.C813530Vvj r9) {
        /*
            Method dump skipped, instruction units count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C814750Vxh.LIZIZ(X.0Vvj):void");
    }

    public final void LJIIIZ(C814760Vxi c814760Vxi) {
        ((ArrayList) this.LJ).add(c814760Vxi);
        if (((ArrayList) this.LJ).size() > 25) {
            ListProtector.remove(this.LJ, 0);
        }
    }

    public final CharSequence LJIIJ(C814760Vxi c814760Vxi) {
        CharSequence charSequence;
        C21627319kV c21627319kVLIZJ = C21627319kV.LIZJ();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        C815260VyW c815260VyW = c814760Vxi.LIZJ;
        CharSequence charSequence2 = "";
        if (c815260VyW == null) {
            charSequence = "";
        } else {
            charSequence = c815260VyW.LIZ;
        }
        int i = -16777216;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence = this.LJI.LIZ;
            int i2 = this.LIZ.LJIL;
            if (i2 != 0) {
                i = i2;
            }
        }
        CharSequence charSequenceLJ = c21627319kVLIZJ.LJ(charSequence, c21627319kVLIZJ.LIZJ);
        spannableStringBuilder.append(charSequenceLJ);
        C786410Ut5.q2(spannableStringBuilder, new TextAppearanceSpan(null, 0, 0, ColorStateList.valueOf(i), null), spannableStringBuilder.length() - ((SpannableStringBuilder) charSequenceLJ).length(), spannableStringBuilder.length(), 33);
        CharSequence charSequence3 = c814760Vxi.LIZ;
        if (charSequence3 != null) {
            charSequence2 = charSequence3;
        }
        spannableStringBuilder.append((CharSequence) "  ").append(c21627319kVLIZJ.LJ(charSequence2, c21627319kVLIZJ.LIZJ));
        return spannableStringBuilder;
    }
}
