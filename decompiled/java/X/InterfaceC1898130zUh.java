package X;

import com.bytedance.touchpoint.api.model.TaskEvent;
import com.bytedance.touchpoint.api.model.TaskEventContent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0zUh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public interface InterfaceC1898130zUh {
    void LIZ();

    void LIZIZ(String str, String str2);

    void LIZJ();

    void LIZLLL(InterfaceC1898470zVF<TaskEvent> interfaceC1898470zVF);

    void LJ(boolean z, boolean z2);

    boolean LJFF();

    boolean LJI();

    boolean LJII();

    Integer LJIIIIZZ();

    void LJIIIZ();

    boolean LJIIJ();

    void LJIIJJI(TaskEventContent taskEventContent, boolean z, Function1<? super C1898920zVy, Unit> function1);

    String getTaskEventKey();

    void onAppForeground();
}
