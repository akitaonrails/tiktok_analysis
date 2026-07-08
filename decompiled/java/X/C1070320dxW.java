package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.setting.unit.privacy.FindCtxViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0dxW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1070320dxW extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Function1<Integer, Unit> LL;
    public final /* synthetic */ Function1<Integer, Unit> LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ LifecycleOwner LLILZ;
    public final /* synthetic */ Function1<Boolean, Unit> LLILZIL;
    public final /* synthetic */ Function0<Unit> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1070320dxW(Function1<? super Integer, Unit> function1, Function1<? super Integer, Unit> function12, Context context, LifecycleOwner lifecycleOwner, Function1<? super Boolean, Unit> function13, Function0<Unit> function0) {
        super(0);
        this.LL = function1;
        this.LLILLJJLI = function12;
        this.LLILLL = context;
        this.LLILZ = lifecycleOwner;
        this.LLILZIL = function13;
        this.LLILZLL = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        FindCtxViewModel findCtxViewModel;
        InterfaceC497601wk viewModelScope;
        C1070560dxu.LIZ.getClass();
        C1070560dxu.LIZLLL(6, true);
        Keva.getRepo("mlbb_sync_repo").storeBoolean("mlbb_sync_is_removing", true);
        this.LL.invoke(1);
        this.LLILLJJLI.invoke(6);
        if (C1071540dzU.LIZIZ.LJ(EnumC1070340dxY.MLBB).LIZIZ() && (findCtxViewModel = C1070520dxq.LIZJ) != null && (viewModelScope = ViewModelKt.getViewModelScope(findCtxViewModel)) != null) {
            C23250099c.LIZLLL(viewModelScope, null, null, new C1070100dxA(this.LLILLL, this.LLILZ, null), 3);
        }
        C1070520dxq c1070520dxq = C1070520dxq.LIZ;
        Context context = this.LLILLL;
        LifecycleOwner lifecycleOwner = this.LLILZ;
        Function1<Integer, Unit> function1 = this.LL;
        Function1<Boolean, Unit> function12 = this.LLILZIL;
        c1070520dxq.getClass();
        C1070520dxq.LIZLLL(context, lifecycleOwner, function1, function12);
        this.LLILZLL.invoke();
        return Unit.LIZ;
    }
}
