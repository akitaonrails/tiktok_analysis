package X;

import com.bytedance.pitaya.api.PTYMessageHandler;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0bCm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public interface InterfaceC964460bCm {
    void LIZ(String str, Function0 function0, Function1 function1);

    void LIZIZ();

    void LIZJ(C1ATK c1atk);

    void registerMessageHandler(String str, PTYMessageHandler pTYMessageHandler);

    void removeMessageHandler(String str);

    void restart(int i);
}
