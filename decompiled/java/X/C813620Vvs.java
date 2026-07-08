package X;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: renamed from: X.0Vvs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C813620Vvs extends AbstractC814720Vxe {
    public final int LJ;
    public final C815260VyW LJFF;
    public final PendingIntent LJI;
    public final PendingIntent LJII;
    public final PendingIntent LJIIIIZZ;

    @Override // X.AbstractC814720Vxe
    public final String LJ() {
        return "androidx.core.app.NotificationCompat$CallStyle";
    }

    public C813620Vvs() {
    }

    @Override // X.AbstractC814720Vxe
    public final void LIZ(Bundle bundle) {
        super.LIZ(bundle);
        bundle.putInt("android.callType", this.LJ);
        bundle.putBoolean("android.callIsVideo", false);
        C815260VyW c815260VyW = this.LJFF;
        if (c815260VyW != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                Person personLIZIZ = C815250VyV.LIZIZ(c815260VyW);
                C813650Vvv.LIZIZ(personLIZIZ);
                C786410Ut5.LJJIJL(bundle, "android.callPerson", personLIZIZ);
            } else {
                C786410Ut5.LJJIJL(bundle, "android.callPersonCompat", c815260VyW.LIZ());
            }
        }
        C786410Ut5.LJJIJIIJI(bundle, "android.verificationText", null);
        C786410Ut5.LJJIJL(bundle, "android.answerIntent", this.LJI);
        C786410Ut5.LJJIJL(bundle, "android.declineIntent", this.LJII);
        C786410Ut5.LJJIJL(bundle, "android.hangUpIntent", this.LJIIIIZZ);
    }

    @Override // X.AbstractC814720Vxe
    public final void LIZIZ(C813530Vvj c813530Vvj) {
        CharSequence charSequence;
        CharSequence charSequence2;
        Notification.CallStyle callStyleLIZ;
        int i = Build.VERSION.SDK_INT;
        String string = null;
        if (i >= 31) {
            int i2 = this.LJ;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        C815260VyW c815260VyW = this.LJFF;
                        c815260VyW.getClass();
                        callStyleLIZ = C813630Vvt.LIZJ(C815250VyV.LIZIZ(c815260VyW), this.LJIIIIZZ, this.LJI);
                    } else {
                        return;
                    }
                } else {
                    C815260VyW c815260VyW2 = this.LJFF;
                    c815260VyW2.getClass();
                    callStyleLIZ = C813630Vvt.LIZIZ(C815250VyV.LIZIZ(c815260VyW2), this.LJIIIIZZ);
                }
            } else {
                C815260VyW c815260VyW3 = this.LJFF;
                c815260VyW3.getClass();
                callStyleLIZ = C813630Vvt.LIZ(C815250VyV.LIZIZ(c815260VyW3), this.LJII, this.LJI);
            }
            if (callStyleLIZ != null) {
                callStyleLIZ.setBuilder(c813530Vvj.LIZIZ);
                C813630Vvt.LJIIIIZZ(callStyleLIZ, null);
                C813630Vvt.LJI(callStyleLIZ, false);
                return;
            }
            return;
        }
        Notification.Builder builder = c813530Vvj.LIZIZ;
        C815260VyW c815260VyW4 = this.LJFF;
        if (c815260VyW4 != null) {
            charSequence = c815260VyW4.LIZ;
        } else {
            charSequence = null;
        }
        builder.setContentTitle(charSequence);
        Bundle bundle = this.LIZ.LJIJJLI;
        if (bundle == null || !bundle.containsKey("android.text") || (charSequence2 = this.LIZ.LJIJJLI.getCharSequence("android.text")) == null) {
            int i3 = this.LJ;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 == 3) {
                        string = this.LIZ.LIZ.getResources().getString(2131828237);
                    }
                } else {
                    string = this.LIZ.LIZ.getResources().getString(2131828236);
                }
            } else {
                string = this.LIZ.LIZ.getResources().getString(2131828235);
            }
            charSequence2 = string;
        }
        builder.setContentText(charSequence2);
        C815260VyW c815260VyW5 = this.LJFF;
        if (c815260VyW5 != null) {
            IconCompat iconCompat = c815260VyW5.LIZIZ;
            if (iconCompat != null) {
                C813500Vvg.LIZJ(builder, C815270VyX.LJFF(iconCompat, this.LIZ.LIZ));
            }
            if (i >= 28) {
                C815260VyW c815260VyW6 = this.LJFF;
                c815260VyW6.getClass();
                C813650Vvv.LIZ(builder, C815250VyV.LIZIZ(c815260VyW6));
            } else {
                C813510Vvh.LIZ(builder, this.LJFF.LIZJ);
            }
        }
        C813510Vvh.LIZIZ(builder, "call");
    }

    public final C813540Vvk LJIIIZ(int i, int i2, int i3, PendingIntent pendingIntent) {
        Integer numValueOf = Integer.valueOf(C446980Hfs.LIZ(this.LIZ.LIZ, i3));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.LIZ.LIZ.getResources().getString(i2));
        C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(numValueOf.intValue()), 0, spannableStringBuilder.length(), 18);
        Context context = this.LIZ.LIZ;
        context.getClass();
        C813540Vvk c813540VvkLIZ = new C813550Vvl(IconCompat.LJFF(context.getResources(), context.getPackageName(), i), spannableStringBuilder, pendingIntent, new Bundle()).LIZ();
        c813540VvkLIZ.LIZ.putBoolean("key_action_priority", true);
        return c813540VvkLIZ;
    }

    public C813620Vvs(int i, C815260VyW c815260VyW, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3) {
        if (!TextUtils.isEmpty(c815260VyW.LIZ)) {
            this.LJ = i;
            this.LJFF = c815260VyW;
            this.LJI = pendingIntent3;
            this.LJII = pendingIntent2;
            this.LJIIIIZZ = pendingIntent;
            return;
        }
        throw new IllegalArgumentException("person must have a non-empty a name");
    }
}
