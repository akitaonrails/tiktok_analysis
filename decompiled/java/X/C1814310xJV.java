package X;

import android.app.Dialog;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.save.SaveAssem;
import com.bytedance.assem.arch.core.UIAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0xJV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1814310xJV extends C09AY implements Function2<UIAssem, C291001Au<? extends Boolean>, Unit> {
    public final /* synthetic */ SaveAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1814310xJV(SaveAssem saveAssem) {
        super(2);
        this.LL = saveAssem;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, C291001Au<? extends Boolean> c291001Au) {
        T t = c291001Au.LIZ;
        SaveAssem saveAssem = this.LL;
        if (((Boolean) t).booleanValue()) {
            C0FNV.LIZJ((Dialog) saveAssem.LLJI.getValue());
        } else {
            C500260Jjc.LJJLIIIJL((Dialog) saveAssem.LLJI.getValue());
        }
        return Unit.LIZ;
    }
}
