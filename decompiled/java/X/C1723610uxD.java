package X;

import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0uxD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1723610uxD extends AbstractC1723600uxC {
    public final C1776140wJw LLILLL = new C1776140wJw(CoroutineExceptionHandler.LJJLIL, 6);
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1229));
    public final C01GW LLILZIL = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL));

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        C23250099c.LIZLLL((InterfaceC497601wk) this.LLILZ.getValue(), null, null, new C1723580uxA(this, completionBlock, null), 3);
    }
}
