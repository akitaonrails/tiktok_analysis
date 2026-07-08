package X;

import android.content.Intent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import kotlin.Unit;

/* JADX INFO: renamed from: X.19Df, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21502919Df extends C09AY implements InterfaceC1631620sYq<InterfaceC21503119Dh, BaseActivity, Unit, Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ Intent LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21502919Df(int i, int i2, Intent intent) {
        super(3);
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = intent;
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(InterfaceC21503119Dh interfaceC21503119Dh, BaseActivity baseActivity, Unit unit) {
        interfaceC21503119Dh.onActivityResult(this.LL, this.LLILLJJLI, this.LLILLL);
        return Unit.LIZ;
    }
}
