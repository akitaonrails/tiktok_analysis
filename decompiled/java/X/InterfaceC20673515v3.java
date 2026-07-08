package X;

import android.app.Activity;
import android.view.MotionEvent;
import androidx.fragment.app.DialogFragment;
import com.ss.android.ugc.aweme.feed.model.live.NewLiveRoomStruct;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONObject;
import webcast.api.room.LivePodcastResponse;

/* JADX INFO: renamed from: X.15v3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public interface InterfaceC20673515v3 extends C1AKK {
    void Be(Activity activity, Boolean bool);

    void LIZIZ();

    @Override // X.C1AKK
    boolean LJ();

    C11NZ<NewLiveRoomStruct> LJFF(long j, String str);

    int LJII();

    void LJJ(ArrayList<String> arrayList);

    void LJJIIZ(Boolean bool);

    C473630Ihl LJJJJJL();

    long LJJJJZI();

    LivePodcastResponse.ResponseData LJJLIIIJJI(boolean z);

    boolean LJJLL(String str);

    C11NZ LJJZ(long j, String str);

    boolean LJLLI();

    String LLIIIJ();

    boolean LLJ(String str, JSONObject jSONObject, JSONObject jSONObject2);

    String[] LLJIJIL();

    void LLJJIJIL(C1AD1 c1ad1);

    void N6(float f, float f2, float f3, float f4);

    void U5();

    boolean canShowInternalWindow(Long l);

    void clearSafeZone();

    void e0(Boolean bool);

    int getInternalWindowState();

    int getScreenOrientation();

    void hideInternalWindow();

    boolean isInternalWindowMute();

    boolean isInternalWindowUserManualMute();

    void kc(MotionEvent motionEvent, String str);

    boolean o1();

    void resetInternalWindow();

    void resetUserManualMuteClickState();

    void setLiveFunnelSession(boolean z);

    void setResumeAfterMediaConflict(boolean z);

    void showInternalWindow(Activity activity, DialogFragment dialogFragment, Boolean bool, Map<String, String> map, Integer num, Integer num2, Integer num3, Integer num4);

    boolean up(String str);

    void updateSafeZone(int i, int i2, int i3, int i4);

    boolean w9();
}
