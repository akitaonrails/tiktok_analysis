package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1AWM, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AWM implements InterfaceC2183551Acz {
    public final /* synthetic */ Function1 LIZ;

    public C1AWM(Function1 function1) {
        this.LIZ = function1;
    }

    @Override // X.InterfaceC2183551Acz
    public final /* synthetic */ void onDone(int i) {
        this.LIZ.invoke(Integer.valueOf(i));
    }
}
