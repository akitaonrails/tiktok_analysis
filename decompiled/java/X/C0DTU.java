package X;

import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaMessageSettingActivity;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS583S0100000_4;
import njp.a;

/* JADX INFO: renamed from: X.0DTU, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaMessageSettingActivity$checkChatEveryone$1", f = "BaMessageSettingActivity.kt", l = {305}, m = "invokeSuspend")
public final class C0DTU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ BaMessageSettingActivity LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0DTU(BaMessageSettingActivity baMessageSettingActivity, InterfaceC1364105Vn<? super C0DTU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = baMessageSettingActivity;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0DTU(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BaMessageSettingActivity@5e22.checkChatEveryone$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C099G c099g = this.LLILLJJLI.LLILZIL;
            if (c099g == null) {
                c099g = null;
            }
            this.LL = 1;
            obj = c099g.LJLIIIL(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("BaMessageSettingActivity@5e22.checkChatEveryone$1");
                return objLJFF;
            }
        }
        PushSettings pushSettings = (PushSettings) obj;
        if (pushSettings == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("BaMessageSettingActivity@5e22.checkChatEveryone$1");
            return unit;
        }
        BaMessageSettingActivity baMessageSettingActivity = this.LLILLJJLI;
        int i2 = pushSettings.chatSet;
        if (i2 == 0 || i2 == 1) {
            C0CLW.LIZIZ.LIZ.getEnableTImChatEveryone().booleanValue();
        }
        baMessageSettingActivity.LLJJIII = i2;
        BaMessageSettingActivity baMessageSettingActivity2 = this.LLILLJJLI;
        if (baMessageSettingActivity2.LLJJIII != 1) {
            C1397580mTM c1397580mTM = new C1397580mTM(baMessageSettingActivity2);
            c1397580mTM.LJII = false;
            c1397580mTM.LIZ(2131850863);
            C985403tE.LIZ(c1397580mTM, new AwS583S0100000_4(this.LLILLJJLI, 330));
            new C1397510mTF(c1397580mTM).LIZLLL();
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("BaMessageSettingActivity@5e22.checkChatEveryone$1");
            return unit2;
        }
        C0DTV c0dtv = C0DTV.LL;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("dm_permission_status", "Y");
        c0dtv.invoke("ttelite_auto_message_entrance", c2344009Gk.LIZ);
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("BaMessageSettingActivity@5e22.checkChatEveryone$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
