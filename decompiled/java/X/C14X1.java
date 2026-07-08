package X;

import com.ss.android.ugc.aweme.setting.serverpush.compose.login.PushSettingsCommonComposeSubFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.14X1, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14X1 extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ C20696015yg LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ PushSettingsCommonComposeSubFragment LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14X1(C20696015yg c20696015yg, int i, PushSettingsCommonComposeSubFragment pushSettingsCommonComposeSubFragment, String str) {
        super(2);
        this.LL = c20696015yg;
        this.LLILLJJLI = i;
        this.LLILLL = pushSettingsCommonComposeSubFragment;
        this.LLILZ = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        boolean z;
        InterfaceC1680500tpg interfaceC1680500tpg2 = interfaceC1680500tpg;
        if ((num.intValue() & 3) == 2 && interfaceC1680500tpg2.LIZ()) {
            interfaceC1680500tpg2.LIZJ();
        } else {
            C20696015yg c20696015yg = this.LL;
            if (this.LLILLJJLI == 0) {
                z = true;
            } else {
                z = false;
            }
            C1689580u4K.LIZ(c20696015yg, z, C13Z4.LIZJ(-24101566, new C20696515yl(c20696015yg, this.LLILLL, this.LLILZ), interfaceC1680500tpg2), interfaceC1680500tpg2, 384, 0);
        }
        return Unit.LIZ;
    }
}
