package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Looper;
import android.provider.Settings;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.14LM, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14LM extends C09AY implements Function1<C1680570tpn, InterfaceC1680560tpm> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ C05P0<Boolean> LLILLJJLI;
    public final /* synthetic */ Function0<Boolean> LLILLL;
    public final /* synthetic */ C05P0<Boolean> LLILZ;
    public final /* synthetic */ Function0<Boolean> LLILZIL;
    public final /* synthetic */ AudioManager LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14LM(Context context, C05P0<Boolean> c05p0, Function0<Boolean> function0, C05P0<Boolean> c05p02, Function0<Boolean> function02, AudioManager audioManager) {
        super(1);
        this.LL = context;
        this.LLILLJJLI = c05p0;
        this.LLILLL = function0;
        this.LLILZ = c05p02;
        this.LLILZIL = function02;
        this.LLILZLL = audioManager;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.14LK, android.database.ContentObserver] */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.0zpp, android.content.BroadcastReceiver] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ InterfaceC1680560tpm invoke(C1680570tpn c1680570tpn) throws Exception {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.media.RINGER_MODE_CHANGED");
        intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
        intentFilter.addAction("android.media.INTERNAL_RINGER_MODE_CHANGED_ACTION");
        final C05P0<Boolean> c05p0 = this.LLILLJJLI;
        final Function0<Boolean> function0 = this.LLILLL;
        final C05P0<Boolean> c05p02 = this.LLILZ;
        final Function0<Boolean> function02 = this.LLILZIL;
        final ?? r5 = new BroadcastReceiver() { // from class: X.0zpp
            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                if (!C2214201BlK.LJIIJJI && intent != null) {
                    if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                        C2188191AkT.LIZIZ();
                    }
                }
                if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                    c05p0.setValue(function0.invoke());
                    c05p02.setValue(function02.invoke());
                } else {
                    C2408409cA.LIZ();
                    c05p0.setValue(function0.invoke());
                    c05p02.setValue(function02.invoke());
                }
            }
        };
        final BPEAHandler bPEAHandler = new BPEAHandler(Looper.getMainLooper());
        final AudioManager audioManager = this.LLILZLL;
        final C05P0<Boolean> c05p03 = this.LLILZ;
        final Function0<Boolean> function03 = this.LLILZIL;
        final ?? r3 = new ContentObserver(bPEAHandler) { // from class: X.14LK
            public int LIZ;

            @Override // android.database.ContentObserver
            public final void onChange(boolean z) {
                int streamVolume = audioManager.getStreamVolume(5);
                if (streamVolume != this.LIZ) {
                    c05p03.setValue(function03.invoke());
                }
                this.LIZ = streamVolume;
            }
        };
        C786410Ut5.LJIJJ(this.LL, r5, intentFilter);
        this.LL.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, r3);
        final Context context = this.LL;
        return new InterfaceC1680560tpm() { // from class: X.14LL
            @Override // X.InterfaceC1680560tpm
            public final void dispose() {
                C786410Ut5.LJJIFFI(context, r5);
                context.getContentResolver().unregisterContentObserver(r3);
            }
        };
    }
}
