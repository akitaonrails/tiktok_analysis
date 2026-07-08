package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.creative.model.PropFromGroupModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0nob, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.sticker.mob.AVStickerMobHelper$mobPropShow$1", f = "AVStickerMobHelper.kt", l = {}, m = "invokeSuspend")
public final class C1449190nob extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1449180noa LL;
    public final /* synthetic */ Effect LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Bundle LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ PropFromGroupModel LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1449190nob(C1449180noa c1449180noa, Effect effect, String str, Bundle bundle, String str2, String str3, int i, String str4, PropFromGroupModel propFromGroupModel, InterfaceC1364105Vn<? super C1449190nob> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1449180noa;
        this.LLILLJJLI = effect;
        this.LLILLL = str;
        this.LLILZ = bundle;
        this.LLILZIL = str2;
        this.LLILZLL = str3;
        this.LLIZ = i;
        this.LLIZLLLIL = str4;
        this.LLJ = propFromGroupModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1449190nob(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:98:0x027f  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r30) {
        /*
            Method dump skipped, instruction units count: 671
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1449190nob.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
