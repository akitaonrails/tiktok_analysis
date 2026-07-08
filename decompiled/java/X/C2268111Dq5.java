package X;

import com.ss.android.ugc.aweme.im.search.sdk.config.SearchSdkOptions;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AFwS283S0000000_35;

/* JADX INFO: renamed from: X.1Dq5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2268111Dq5 {
    public static final C2268111Dq5 LIZ = new C2268111Dq5();
    public static final AtomicBoolean LIZIZ = new AtomicBoolean(false);

    public final synchronized void LIZ() {
        InterfaceC1240800iOU interfaceC1240800iOU;
        InterfaceC907910ZjZ interfaceC907910ZjZ;
        if (LIZIZ.getAndSet(true)) {
            return;
        }
        C907870ZjV.LIZIZ = (SearchSdkOptions) C2268121Dq6.LIZIZ.getValue();
        AFwS283S0000000_35 aFwS283S0000000_35 = AFwS283S0000000_35.get$arr$(149);
        C2268101Dq4 c2268101Dq4 = new C2268101Dq4();
        aFwS283S0000000_35.invoke(c2268101Dq4);
        InterfaceC907900ZjY interfaceC907900ZjY = c2268101Dq4.LIZ;
        if (interfaceC907900ZjY != null) {
            Boolean bool = c2268101Dq4.LIZIZ;
            boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
            InterfaceC907890ZjX interfaceC907890ZjX = c2268101Dq4.LIZJ;
            if (interfaceC907890ZjX != null && (interfaceC1240800iOU = c2268101Dq4.LIZLLL) != null && (interfaceC907910ZjZ = c2268101Dq4.LJ) != null) {
                C907870ZjV.LIZ = new C907880ZjW(interfaceC907900ZjY, zBooleanValue, interfaceC907890ZjX, interfaceC1240800iOU, interfaceC907910ZjZ);
            }
        }
    }
}
