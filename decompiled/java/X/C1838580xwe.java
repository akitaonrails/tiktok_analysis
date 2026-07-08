package X;

import android.text.Spannable;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS250S0000000_15;

/* JADX INFO: renamed from: X.0xwe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1838580xwe implements InterfaceC961810b8V {
    public final Function1<Text, Spannable> LIZ;
    public final AnonymousClass0951 LIZIZ;

    @Override // X.InterfaceC961810b8V
    public final AnonymousClass0951 LIZ() {
        return this.LIZIZ;
    }

    public final C961570b87 LIZIZ(long j, Text text) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long hours = timeUnit.toHours(j);
        long j2 = 60;
        long minutes = timeUnit.toMinutes(j) % j2;
        long seconds = timeUnit.toSeconds(j) % j2;
        Spannable spannableInvoke = this.LIZ.invoke(text);
        Locale locale = Locale.US;
        return new C961570b87(spannableInvoke, C786410Ut5.k4(locale, "%02d", Arrays.copyOf(new Object[]{Long.valueOf(hours)}, 1)), C786410Ut5.k4(locale, "%02d", Arrays.copyOf(new Object[]{Long.valueOf(minutes)}, 1)), C786410Ut5.k4(locale, "%02d", Arrays.copyOf(new Object[]{Long.valueOf(seconds)}, 1)));
    }

    public C1838580xwe(LifecycleCoroutineScope lifecycleCoroutineScope, InterfaceC340001Tq interfaceC340001Tq, AFwS250S0000000_15 aFwS250S0000000_15) {
        this.LIZ = aFwS250S0000000_15;
        this.LIZIZ = C09IC.LJJIJIL(new C1864860yd2(interfaceC340001Tq.LIZ(), this, 9), lifecycleCoroutineScope, C1370905Yd.LIZ(C05YW.LIZ, Mp4ScreenVideoLoadTimeout.CONTROL, 2), LIZIZ(0L, null));
    }
}
