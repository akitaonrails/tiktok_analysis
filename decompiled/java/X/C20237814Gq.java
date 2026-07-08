package X;

import com.bytedance.ies.abmock.ClientExpManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.14Gq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20237814Gq extends C09AY implements Function0<Boolean> {
    public C20237814Gq() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(!C0TKA.LJ ? false : C0C64.LJIILLIIL().LJIIJ("fix_active_user_experiment", ClientExpManager.fix_active_user_experiment()));
    }
}
