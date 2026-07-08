package X;

import android.view.View;
import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0MGL, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public interface C0MGL extends C05YF {
    void BB2(String str);

    LiveEvent<Unit> CZ1();

    void FI0(InterfaceC1655970tC7 interfaceC1655970tC7);

    void Fz0(InterfaceC1655950tC5 interfaceC1655950tC5);

    void GN2(boolean z);

    boolean IV1(View view, Function0<Unit> function0);

    LiveEvent<Unit> LLLLIILLL();

    LiveEvent<Unit> LLLLLZL();

    void PY1(String str);

    long Rp1();

    void TH1(boolean z);

    void Xp1(String str, long j);

    void clear();

    void fs2(Function1<? super VideoPublishEditModel, Unit> function1);

    void lW1(InterfaceC1655950tC5 interfaceC1655950tC5);

    LiveEvent<Unit> sI2();

    void sa2(long j);

    LiveEvent<Pair<String, Boolean>> v2();

    LiveEvent<Unit> wG();

    void yp0(String str, long j);
}
