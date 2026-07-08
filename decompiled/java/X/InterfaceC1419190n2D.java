package X;

import androidx.lifecycle.LiveData;
import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.aweme.creative.model.album.ImportVideoInfo;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0n2D, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public interface InterfaceC1419190n2D extends C12VU {
    void ET(boolean z, Function0<Unit> function0);

    void G61(boolean z);

    void II1();

    void LJJJJLL(boolean z);

    void M9(AVMusic aVMusic, boolean z, Function1<? super Boolean, Unit> function1);

    LiveEvent<Boolean> N50();

    void UZ1();

    void Uu2();

    void ar2();

    void fN();

    void fb2();

    void gy();

    LiveEvent<Unit> ko2();

    LiveData<Boolean> nz2();

    ArrayList<ImportVideoInfo> o31(boolean z, boolean z2);

    void pW1();

    LiveData<Boolean> rJ0();

    void tG1(boolean z, Function1<? super Boolean, Unit> function1);

    LiveData<Unit> xO();
}
