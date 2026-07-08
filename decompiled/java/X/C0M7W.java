package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.share.improve.channel.AIRemixChannel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS552S0100000_8;
import njp.a;

/* JADX INFO: renamed from: X.0M7W, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.share.improve.channel.AIRemixChannel$share$2", f = "AIRemixChannel.kt", l = {134}, m = "invokeSuspend")
public final class C0M7W extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ AIRemixChannel LLILZ;
    public final /* synthetic */ Activity LLILZIL;
    public final /* synthetic */ C0M7Y LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0M7W(Context context, AIRemixChannel aIRemixChannel, Activity activity, C0M7Y c0m7y, InterfaceC1364105Vn<? super C0M7W> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = context;
        this.LLILZ = aIRemixChannel;
        this.LLILZIL = activity;
        this.LLILZLL = c0m7y;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0M7W c0m7w = new C0M7W(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c0m7w.LLILLJJLI = obj;
        return c0m7w;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Dialog dialog;
        boolean zLIZIZ;
        C1C7U.LIZ("AIRemixChannel@4caa.share$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                Dialog dialog2 = (Dialog) this.LLILLJJLI;
                C155000ia.LIZIZ(obj);
                dialog = dialog2;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            DialogC1389620mGW dialogC1389620mGW = new DialogC1389620mGW(this.LLILLL);
            dialogC1389620mGW.setOnDismissListener(new DialogInterfaceOnDismissListenerC580970MqV(interfaceC497601wk, 0));
            dialogC1389620mGW.LJJLJ(R.string.txr);
            C571830Mbl.LIZIZ(dialogC1389620mGW);
            C0M7D c0m7d = this.LLILZ.LLILLL;
            this.LLILLJJLI = dialogC1389620mGW;
            this.LL = 1;
            obj = c0m7d.LIZIZ(this);
            dialog = dialogC1389620mGW;
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AIRemixChannel@4caa.share$2");
                return objLJFF;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            AIRemixChannel aIRemixChannel = this.LLILZ;
            C23250099c.LIZLLL(aIRemixChannel.LLIZLLLIL, null, null, new C563170M6x(aIRemixChannel, this.LLILLL, new AwS552S0100000_8(this.LLILZLL, 166), null), 3);
        } else {
            try {
                zLIZIZ = C036E.LIZ.LIZIZ();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                zLIZIZ = false;
            }
            if (!zLIZIZ) {
                Activity activity = this.LLILZIL;
                if (activity != null) {
                    C1389890mGx c1389890mGx = new C1389890mGx(activity);
                    c1389890mGx.LJIIIZ(2131857244);
                    c1389890mGx.LJIIJJI();
                }
            } else {
                Activity activity2 = this.LLILZIL;
                if (activity2 != null) {
                    C1389890mGx c1389890mGx2 = new C1389890mGx(activity2);
                    c1389890mGx2.LJIIIZ(2131846103);
                    c1389890mGx2.LJIIJJI();
                }
            }
        }
        C571830Mbl.LIZ(dialog);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AIRemixChannel@4caa.share$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
