package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import java.util.ArrayList;
import kotlin.jvm.internal.AwS612S0100000_33;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1ACD, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public interface C1ACD {
    C2175631ACr LIZ(boolean z);

    void LIZIZ();

    void LIZJ(String str);

    void LIZLLL();

    void LJ(LiveRoomStruct liveRoomStruct, boolean z, C1ACA c1aca);

    JSONObject LJI();

    void LJII();

    String LJIIIIZZ();

    void LJIIIZ(C0IXC c0ixc);

    void LJIIJ(C2174981AAe c2174981AAe);

    void LJIIJJI(boolean z);

    C1608290rxD LJIIL();

    void LJIILIIL(C1699360uK6 c1699360uK6);

    void LJIILJJIL(boolean z);

    void LJIILL(boolean z);

    void LJIILLIIL(ArrayList<String> arrayList);

    void LJIIZILJ(LiveWidget liveWidget);

    void LJIJ(int i);

    Bitmap LJIJI(boolean z);

    InterfaceC2175461ACa LJIJJ();

    int LJIJJLI();

    void LJIL(String str);

    String LJJ(int i);

    void LJJI(int i, int i2, boolean z);

    void LJJIFFI(C750450TcB c750450TcB);

    boolean LJJII();

    void LJJIII(boolean z);

    void LJJIIJ(boolean z);

    void LJJIIJZLJL(boolean z, LiveRoomStruct liveRoomStruct, FrameLayout frameLayout, boolean z2, String str, String str2, boolean z3, String str3);

    void LJJIIZ(String str);

    void LJJIJ(String str);

    void LJJIJIIJI(LiveRoomStruct liveRoomStruct);

    void LJJIJIIJIL(AwS612S0100000_33 awS612S0100000_33);

    void LJJIJIL(String str, boolean z);

    void LJJIJLIJ();

    long LJJIL();

    boolean LJJIZ();

    void LJJJ(Context context, String str, FrameLayout frameLayout);

    boolean LJJJI();

    void LJJJIL();

    void LJJJJ();

    void LJJJJI(C1ACN c1acn);

    void LJJJJIZL();

    void LJJJJJ();

    void LJJJJJL();

    void LJJJJL(boolean z);

    C2175491ACd LJJJJLI();

    void bind();

    void changeLowLatencyMode(boolean z);

    void changeSRSupportScene(boolean z);

    void dynamicOpenTextureRender();

    void f0(C0IIZ c0iiz, boolean z);

    String getCurrentResolution();

    boolean getIfPreviewUsingPlayer();

    String getPlayerTag();

    C1699430uKD getPlayerThreadBlockStatus();

    View getVideoView();

    void onAppBackground(boolean z);

    void onPause();

    void onResume();

    void s6();

    void setHadGamePreviewLiveVideoRotated(boolean z);

    void stopUseTextureRender();

    void switchResolution(String str, InterfaceC1699420uKC interfaceC1699420uKC);
}
