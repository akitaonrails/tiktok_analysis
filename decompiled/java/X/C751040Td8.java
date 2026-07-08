package X;

import android.widget.CompoundButton;
import com.bytedance.android.livesdk.adminsetting.LiveCommentSettingFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Td8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.adminsetting.LiveCommentSettingFragment$switchEnigma$1", f = "LiveCommentSettingFragment.kt", l = {497}, m = "invokeSuspend")
public final class C751040Td8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ LiveCommentSettingFragment LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ CompoundButton.OnCheckedChangeListener LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C751040Td8(LiveCommentSettingFragment liveCommentSettingFragment, boolean z, CompoundButton.OnCheckedChangeListener onCheckedChangeListener, InterfaceC1364105Vn<? super C751040Td8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = liveCommentSettingFragment;
        this.LLILLL = z;
        this.LLILZ = onCheckedChangeListener;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C751040Td8(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveCommentSettingFragment@ca1d.switchEnigma$1");
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
            C751280TdW c751280TdW = this.LLILLJJLI.LLJJIJIL;
            if (c751280TdW != null) {
                boolean z = this.LLILLL;
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.LLILZ;
                this.LL = 1;
                if (c751280TdW.LJIIIIZZ(z, onCheckedChangeListener, this) == objLJFF) {
                    C1C7U.LIZIZ("LiveCommentSettingFragment@ca1d.switchEnigma$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveCommentSettingFragment@ca1d.switchEnigma$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
