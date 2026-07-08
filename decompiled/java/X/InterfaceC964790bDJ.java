package X;

import android.graphics.Rect;
import android.view.SurfaceView;
import android.view.View;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DslLayout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LayoutArray;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import java.util.List;
import kotlin.Pair;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: renamed from: X.0bDJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public interface InterfaceC964790bDJ extends InterfaceC937900aVw {
    void LJII(long j);

    Rect LJIIJ(String str);

    List<PosIdentity> LJIIJJI();

    void LJIIL();

    Pair<Integer, Rect> LJJIJIIJIL(String str);

    void LJJIJIL(EnumC918810a19 enumC918810a19, LinkUser linkUser);

    InterfaceC964830bDN LJJIJL();

    void LJJIJLIJ(int i, String str);

    void LJJJ(View view, boolean z, String str);

    void LJJJJZI(LinkUser linkUser, boolean z);

    void LJJLIIIJ(boolean z);

    void LJLLILLLL(LinkUser linkUser, SurfaceView surfaceView, InterfaceC1268870j7l interfaceC1268870j7l, boolean z);

    LayoutArray LLFII();

    String LLIIIILZ();

    void LLIIIJ(DslLayout dslLayout);

    void LLIIIZ(EnumC918810a19 enumC918810a19, LinkUser linkUser);

    void LLIIJLIL(List<String> list);

    String getLayoutId();
}
