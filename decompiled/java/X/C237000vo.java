package X;

import androidx.lifecycle.Observer;
import com.bytedance.android.live.base.model.user.User;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.00vo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C237000vo<T> implements Observer {
    public final /* synthetic */ User LL;
    public final /* synthetic */ Function1<User, Unit> LLILLJJLI;

    /* JADX WARN: Multi-variable type inference failed */
    public C237000vo(User user, Function1<? super User, Unit> function1) {
        this.LL = user;
        this.LLILLJJLI = function1;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        if (obj != this.LL) {
            this.LLILLJJLI.invoke(obj);
        }
    }
}
