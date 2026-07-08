package X;

import androidx.lifecycle.LiveData;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1Bp1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2216491Bp1 implements InterfaceC2216401Bos<Object, Object> {
    public final /* synthetic */ Function0<Object> LIZIZ;
    public final /* synthetic */ Function0<LiveData<Object>> LIZJ;

    @Override // X.InterfaceC2216401Bos
    public final Object get() {
        return this.LIZIZ.invoke();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2216491Bp1(Function0<Object> function0, Function0<? extends LiveData<Object>> function02) {
        this.LIZIZ = function0;
        this.LIZJ = function02;
    }
}
