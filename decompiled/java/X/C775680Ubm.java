package X;

import com.bytedance.android.livesdk.broadcast.stablemode.StableModeViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ubm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C775680Ubm implements InterfaceC1813270xHp<C775720Ubq, AbstractC775780Ubw, AbstractC1180404ja, StableModeViewModel> {
    public final DataChannel LL;
    public final C19EG LLILLJJLI;
    public AbstractC1273900jFs LLILLL;
    public Long LLILZ;
    public final SimpleDateFormat LLILZIL = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());

    public static final StableModeViewModel LIZIZ() {
        return (StableModeViewModel) C0U61.LIZ(new C0UNS()).get(StableModeViewModel.class);
    }

    public static int LIZ(C1112330f3H c1112330f3H) {
        Object obj;
        Map<String, Object> extraParams = c1112330f3H.LJIL.getExtraParams();
        if (extraParams != null) {
            obj = extraParams.get("level_name");
        } else {
            obj = null;
        }
        if (Intrinsics.LJFF(obj, EnumC775860Uc4.HEAVY.getLevelName())) {
            return 1;
        }
        return 2;
    }

    @Override // X.InterfaceC1813270xHp
    public final void Xh(InterfaceC775640Ubi interfaceC775640Ubi) {
        C775720Ubq c775720Ubq = (C775720Ubq) interfaceC775640Ubi;
        AbstractC1273900jFs abstractC1273900jFs = this.LLILLL;
        if (abstractC1273900jFs != null) {
            abstractC1273900jFs.LJJIJIIJI(c775720Ubq.LIZ);
        }
    }

    @Override // X.InterfaceC1813270xHp
    public final /* bridge */ /* synthetic */ void gn(InterfaceC1180504jb interfaceC1180504jb) {
    }

    public C775680Ubm(C19EG c19eg, DataChannel dataChannel) {
        this.LL = dataChannel;
        this.LLILLJJLI = c19eg;
    }
}
