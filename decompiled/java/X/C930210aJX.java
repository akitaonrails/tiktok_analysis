package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.LayoutSettingContract;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS21S0401000_15;
import tikcast.linkmic.common.LayoutState;

/* JADX INFO: renamed from: X.0aJX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C930210aJX extends C09AY implements Function0<Unit> {
    public final /* synthetic */ LayoutSettingContract LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ LifecycleOwner LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL;
    public final /* synthetic */ Function1<LayoutState, Unit> LLILZLL;
    public final /* synthetic */ Function0<Unit> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C930210aJX(LayoutSettingContract layoutSettingContract, int i, Context context, LifecycleOwner lifecycleOwner, Function0<Unit> function0, Function1<? super LayoutState, Unit> function1, Function0<Unit> function02) {
        super(0);
        this.LL = layoutSettingContract;
        this.LLILLJJLI = i;
        this.LLILLL = context;
        this.LLILZ = lifecycleOwner;
        this.LLILZIL = function0;
        this.LLILZLL = function1;
        this.LLIZ = function02;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        LayoutSettingContract layoutSettingContract = this.LL;
        int i = this.LLILLJJLI;
        layoutSettingContract.LJII(i, this.LLILLL, this.LLILZ, new AwS21S0401000_15(layoutSettingContract, (LayoutSettingContract) i, (int) this.LLILZIL, (Function0<Unit>) this.LLILZLL, (Function1<? super LayoutState, Unit>) this.LLIZ, (Function0<Unit>) 2));
        return Unit.LIZ;
    }
}
