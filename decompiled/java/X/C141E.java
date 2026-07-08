package X;

import com.ss.android.ugc.aweme.nimblecard.components.image.ui.NimbleImageListAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.141E, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C141E implements InterfaceC201984141m {
    public final Function1<C685070Qu1, Unit> LIZ;

    @Override // X.InterfaceC201984141m
    public final C19719912Dl LIZ() {
        return C13LE.LIZ(NimbleImageListAssem.class);
    }

    @Override // X.InterfaceC201983141l
    public final C685070Qu1 getConfig() {
        C685070Qu1 c685070Qu1 = new C685070Qu1(null);
        this.LIZ.invoke(c685070Qu1);
        return c685070Qu1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C141E(Function1<? super C685070Qu1, Unit> function1) {
        this.LIZ = function1;
    }
}
