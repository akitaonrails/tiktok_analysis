package X;

import com.bytedance.android.live.effect.countdown.CountDownEffectViewModel;
import com.bytedance.android.live.effect.datastore.base.BaseEffectViewModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0U41, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.LiveEffectDataProvider$fetchEffectByResourceId$1$3$1", f = "LiveEffectDataProvider.kt", l = {930, 938, 940, 942}, m = "invokeSuspend")
public final class C0U41 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C0UDQ LL;
    public Object LLILLJJLI;
    public CountDownEffectViewModel LLILLL;
    public int LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ BaseEffectViewModel<LiveEffect> LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ InterfaceC760910Tt3<Object> LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0U41(boolean z, BaseEffectViewModel<LiveEffect> baseEffectViewModel, String str, String str2, InterfaceC760910Tt3<Object> interfaceC760910Tt3, InterfaceC1364105Vn<? super C0U41> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = z;
        this.LLILZLL = baseEffectViewModel;
        this.LLIZ = str;
        this.LLIZLLLIL = str2;
        this.LLJ = interfaceC760910Tt3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0U41(this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0126, code lost:
    
        if (r12 == null) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ea A[SYNTHETIC] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0U41.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
