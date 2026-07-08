package X;

import com.bytedance.android.livesdk.adminsetting.LiveCommentSettingFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Td3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.adminsetting.LiveCommentSettingFragment$switchCommentTray$1", f = "LiveCommentSettingFragment.kt", l = {448}, m = "invokeSuspend")
public final class C750990Td3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ LiveCommentSettingFragment LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C750990Td3(LiveCommentSettingFragment liveCommentSettingFragment, boolean z, InterfaceC1364105Vn<? super C750990Td3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = liveCommentSettingFragment;
        this.LLILLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C750990Td3(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveCommentSettingFragment@ca1d.switchCommentTray$1");
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
            LiveCommentSettingFragment liveCommentSettingFragment = this.LLILLJJLI;
            C751280TdW c751280TdW = liveCommentSettingFragment.LLJJIJIL;
            if (c751280TdW != null) {
                boolean z = this.LLILLL;
                C785990UsP c785990UsP = liveCommentSettingFragment.LLJJL;
                this.LL = 1;
                if (c751280TdW.LJII(z, c785990UsP, this) == objLJFF) {
                    C1C7U.LIZIZ("LiveCommentSettingFragment@ca1d.switchCommentTray$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveCommentSettingFragment@ca1d.switchCommentTray$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
