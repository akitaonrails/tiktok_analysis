package X;

import com.ss.android.ugc.aweme.im.streaming.api.BlockUIData;
import com.ss.android.ugc.aweme.im.streaming.api.StreamingResponseData;
import java.util.List;

/* JADX INFO: renamed from: X.0ZgH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C905870ZgH implements InterfaceC905820ZgC {
    public static final C905870ZgH LIZ = new C905870ZgH();

    @Override // X.InterfaceC905820ZgC
    public final C1622006Ws<C905880ZgI> getExtraData() {
        return new C1622006Ws<>(new C905880ZgI(null));
    }

    @Override // X.InterfaceC905820ZgC
    public final C1622006Ws<StreamingResponseData> getRawData() {
        return new C1622006Ws<>(null);
    }

    @Override // X.InterfaceC905820ZgC
    public final List<BlockUIData> LIZ() {
        return C13BV.INSTANCE;
    }
}
