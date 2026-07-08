package X;

import com.ss.android.ugc.aweme.ecommerce.base.selector.model.TikTokMediaModel;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.09bD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2402509bD implements InterfaceC1004403wI {
    public final String LL;
    public final Set<TikTokMediaModel> LLILLJJLI;
    public final Function2<C2402509bD, Boolean, Unit> LLILLL;

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public C2402509bD() {
        this("", new LinkedHashSet(), null);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(this, interfaceC1891350zJl);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return C1004303wH.LIZ(this, interfaceC1891350zJl);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2402509bD(String str, Set<TikTokMediaModel> set, Function2<? super C2402509bD, ? super Boolean, Unit> function2) {
        this.LL = str;
        this.LLILLJJLI = set;
        this.LLILLL = function2;
    }
}
