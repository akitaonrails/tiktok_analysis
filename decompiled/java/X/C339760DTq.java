package X;

import android.app.Activity;
import android.net.Uri;
import com.ss.android.ugc.aweme.effectcreator.IEffectCreatorService;
import com.ss.android.ugc.aweme.effectcreator.protocol.IAIEffectEntranceService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS232S0000000_4;
import njp.a;

/* JADX INFO: renamed from: X.0DTq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.app.AdsCommands$RecordCommand$openAMEEditor$1", f = "AdsCommands.kt", l = {2961}, m = "invokeSuspend")
public final class C339760DTq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C19572711ht LLILLJJLI;
    public final /* synthetic */ C1737170vJ5 LLILLL;
    public final /* synthetic */ Uri LLILZ;
    public final /* synthetic */ Activity LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C339760DTq(C19572711ht c19572711ht, C1737170vJ5 c1737170vJ5, Uri uri, Activity activity, InterfaceC1364105Vn<? super C339760DTq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c19572711ht;
        this.LLILLL = c1737170vJ5;
        this.LLILZ = uri;
        this.LLILZIL = activity;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C339760DTq(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        IAIEffectEntranceService iAIEffectEntranceServiceLJFF;
        C1C7U.LIZ("AdsCommands$RecordCommand@a128.openAMEEditor$1");
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
            IEffectCreatorService iEffectCreatorService = (IEffectCreatorService) PluggableExtentionKt.pluggableSpi$default(IEffectCreatorService.class, false, false, false, 14, null);
            if (iEffectCreatorService != null && (iAIEffectEntranceServiceLJFF = iEffectCreatorService.LJFF()) != null) {
                this.LL = 1;
                obj = iAIEffectEntranceServiceLJFF.LIZIZ(false, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("AdsCommands$RecordCommand@a128.openAMEEditor$1");
                    return objLJFF;
                }
            }
            C339780DTs.LIZJ(this.LLILLL, AFwS232S0000000_4.get$arr$(16));
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("AdsCommands$RecordCommand@a128.openAMEEditor$1");
            return unit;
        }
        if (((Boolean) obj).booleanValue()) {
            C19572711ht c19572711ht = this.LLILLJJLI;
            C1737170vJ5 c1737170vJ5 = this.LLILLL;
            Uri uri = this.LLILZ;
            Activity activity = this.LLILZIL;
            c19572711ht.getClass();
            C19572711ht.LJIIJ(c1737170vJ5, uri, activity);
        } else {
            C339780DTs.LIZJ(this.LLILLL, AFwS232S0000000_4.get$arr$(16));
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("AdsCommands$RecordCommand@a128.openAMEEditor$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
