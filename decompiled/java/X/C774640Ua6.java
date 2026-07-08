package X;

import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import kotlin.jvm.internal.AFwS218S0000000_29;

/* JADX INFO: renamed from: X.0Ua6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C774640Ua6 implements C0JFW, InterfaceC774620Ua4 {
    public static final C774640Ua6 LL = new C774640Ua6();
    public static final boolean LLILLJJLI;
    public static final C01GW LLILLL;
    public static final C1664350tPd<C774650Ua7> LLILZ;
    public static final SimpleDateFormat LLILZIL;

    @Override // X.InterfaceC774620Ua4
    public final void LLLLZLLLI() {
    }

    @Override // X.InterfaceC774620Ua4
    public final void LLLZ(String str, String str2, Map<String, ? extends Object> map, C0U8C c0u8c) {
    }

    @Override // X.InterfaceC774620Ua4
    public final void LLLZI(DataChannel dataChannel) {
    }

    @Override // X.InterfaceC774620Ua4
    public final void LLLZIL() {
    }

    @Override // X.InterfaceC774620Ua4
    public final void LLLZLZ() {
    }

    @Override // X.InterfaceC774620Ua4
    public final void LLLZZ(boolean z, boolean z2) {
    }

    @Override // X.InterfaceC774620Ua4
    public final void LLLZZIL(boolean z) {
    }

    @Override // X.InterfaceC774620Ua4
    public final void LLZIL() {
    }

    static {
        new WeakReference(null);
        new WeakReference(null);
        LLILLJJLI = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLocalTest();
        LLILLL = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(328));
        LLILZ = new C1664350tPd<>();
        LLILZIL = new SimpleDateFormat("yyyy-MM-dd HH:mm:sss");
    }

    @Override // X.InterfaceC774620Ua4
    public final EnumC773520UVy LLZ() {
        return EnumC773520UVy.PREVIEW_AND_VIDEO_BROADCAST_PAGE;
    }

    public static final void LIZ(String str, String str2) {
        if (LLILLJJLI) {
            LLILZ.LIZ((C774650Ua7) new Object() { // from class: X.0Ua7
                {
                    C774640Ua6.LLILZIL.format(new Date(System.currentTimeMillis()));
                }
            });
        }
        C20441214yg.LIZIZ(str, str2);
    }

    @Override // X.InterfaceC774620Ua4
    public final void LLLZIIL(Fragment fragment, DataChannel dataChannel) {
        new WeakReference(dataChannel);
        new WeakReference(fragment);
        LLILZ.LIZIZ();
    }

    @Override // X.InterfaceC774620Ua4
    public final void LLLZL(Fragment fragment, DataChannel dataChannel) {
        new WeakReference(dataChannel);
        new WeakReference(fragment);
    }

    @Override // X.InterfaceC774620Ua4
    public final void LLLZLL(Fragment fragment, DataChannel dataChannel) {
        new WeakReference(dataChannel);
    }
}
