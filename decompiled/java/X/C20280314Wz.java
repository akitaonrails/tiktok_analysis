package X;

import com.ss.android.ugc.aweme.setting.serverpush.compose.login.PushSettingsCommonComposeSubFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.14Wz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20280314Wz extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ PushSettingsCommonComposeSubFragment LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20280314Wz(PushSettingsCommonComposeSubFragment pushSettingsCommonComposeSubFragment, String str, int i) {
        super(2);
        this.LL = pushSettingsCommonComposeSubFragment;
        this.LLILLJJLI = str;
        this.LLILLL = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        PushSettingsCommonComposeSubFragment pushSettingsCommonComposeSubFragment = this.LL;
        String str = this.LLILLJJLI;
        pushSettingsCommonComposeSubFragment.ZR(C341440Da2.LIZ(this.LLILLL | 1), interfaceC1680500tpg, str);
        return Unit.LIZ;
    }
}
