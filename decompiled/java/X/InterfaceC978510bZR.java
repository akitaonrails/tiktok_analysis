package X;

import androidx.lifecycle.LiveData;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftMode;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0bZR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public interface InterfaceC978510bZR {
    Text LIZ();

    long LIZIZ();

    void LIZJ(Function1<? super List<GiftMode>, Unit> function1, Function1<? super Throwable, Unit> function12);

    List<GiftMode> LIZLLL();

    void LJ(long j);

    void LJFF(Text text);

    LiveData<GiftMode> LJI();

    void LJII(GiftMode giftMode);

    LiveData<Integer> LJIIIIZZ();

    void LJIIIZ(long j);

    void LJIIJ(List<GiftMode> list);

    void LJIIJJI(int i);
}
