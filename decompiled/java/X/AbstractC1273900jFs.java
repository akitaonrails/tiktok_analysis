package X;

import android.content.Intent;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import com.bytedance.bpea.basics.Cert;
import com.ss.bytertc.engine.video.IVideoStrategyRunner;
import com.ss.lyrax.LyraxErrorCode;
import com.ss.ttlivestreamer.core.engine.AudioDeviceModule;
import com.ss.ttlivestreamer.core.engine.VideoSink;
import com.ss.ttlivestreamer.core.scene_detect.TTLHSceneDetector;
import com.ss.ttlivestreamer.livestreamv2.strategy.TTLHPerfAdaptiveConfig;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jFs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC1273900jFs implements InterfaceC1273910jFt, InterfaceC1274510jGr {
    public static final AtomicLong LL = new AtomicLong(0);
    public static final String LLILLJJLI = UUID.randomUUID().toString().replace("-", "");

    @Override // X.InterfaceC1273910jFt
    public /* synthetic */ void LIZIZ(String str) {
    }

    @Override // X.InterfaceC1273910jFt
    public /* synthetic */ void LIZJ(long j, String str) {
    }

    @Override // X.InterfaceC1273910jFt
    public /* synthetic */ void LIZLLL(String str) {
    }

    @Override // X.InterfaceC1273910jFt
    public /* synthetic */ boolean LJJII() {
        return false;
    }

    public abstract void LJJIII(C1271090jBL c1271090jBL);

    @Override // X.InterfaceC1273910jFt
    public /* synthetic */ C1267500j5Y LJJIIJZLJL() {
        return null;
    }

    public /* synthetic */ int LJJIJIIJIL(String str, String str2) {
        return 0;
    }

    @Override // X.InterfaceC1273910jFt
    public /* synthetic */ void LJJIJL(boolean z) {
    }

    @Override // X.InterfaceC1273910jFt
    public /* synthetic */ int LJJIZ(String str, boolean z, boolean z2, String str2, int i, Object obj) {
        return 0;
    }

    @Override // X.InterfaceC1273910jFt
    public /* synthetic */ void LJJJI(String str, String str2) {
    }

    @Override // X.InterfaceC1273910jFt
    public final /* synthetic */ InterfaceC1269980j9Y LJJJIL() {
        return null;
    }

    @Override // X.InterfaceC1273910jFt
    public final /* synthetic */ AudioDeviceModule LJJJJJ() {
        return null;
    }

    public /* synthetic */ int LJJJJLI(String str, Object obj, int i, boolean z, boolean z2, String str2) {
        return 0;
    }

    @Override // X.InterfaceC1273910jFt
    public /* synthetic */ void LJJJJLL(C1267140j4y c1267140j4y) {
    }

    @Override // X.InterfaceC1273910jFt
    public /* synthetic */ int LJJJJZI(String str, boolean z, boolean z2, String str2, int i, Object obj) {
        return 0;
    }

    @Override // X.InterfaceC1273910jFt
    public /* synthetic */ int LJJJLL(String str, Object obj, int i, boolean z, boolean z2, int i2, String str2) {
        return 0;
    }

    @Override // X.InterfaceC1273910jFt
    public /* synthetic */ void LJJLIIIJLLLLLLLZ(String str, EnumC1269700j96 enumC1269700j96) {
    }

    public abstract void LJJLJ(C0UHD c0uhd);

    @Override // X.InterfaceC1273910jFt
    public /* synthetic */ void LJJZZI() {
    }

    @Override // X.InterfaceC1273910jFt
    public /* synthetic */ void LJJZZIII(String str, EnumC1269640j90 enumC1269640j90, C947150akr c947150akr) {
    }

    public /* synthetic */ void LJL(C1274330jGZ c1274330jGZ) {
    }

    public /* synthetic */ void LJLI(C1269610j8x c1269610j8x) {
    }

    public /* synthetic */ void LJLIIIL(Bundle bundle, C777170UeB c777170UeB, InterfaceC1270140j9o interfaceC1270140j9o) {
    }

    public void LJLIIL(int i) {
    }

    public /* synthetic */ void LJLIL() {
    }

    public /* synthetic */ int LJLILLLLZI(JSONObject jSONObject) {
        return 0;
    }

    public abstract InterfaceC774130UYh LJLJI();

    public /* synthetic */ boolean LJLJJI() {
        return false;
    }

    public void LJLJJL(int i, int i2) {
    }

    public void LJLJJLL(boolean z) {
    }

    public abstract void LJLJL(boolean z);

    public void LJLJLJ(boolean z) {
    }

    public /* synthetic */ void LJLJLLL(boolean z) {
    }

    public void LJLL(boolean z) {
    }

    public abstract AudioDeviceModule LJLLI();

    public C1275410jIJ LJLLILLLL() {
        return null;
    }

    public /* synthetic */ C1267280j5C LJLLJ() {
        return null;
    }

    public /* synthetic */ Map LJLLL(long j) {
        return null;
    }

    public JSONObject LJLLLL() {
        return null;
    }

    public /* synthetic */ float LJLLLLLL() {
        return 0.0f;
    }

    public abstract JSONObject LJLZ();

    public /* synthetic */ int LJZ() {
        return -1;
    }

    public abstract View LJZL();

    public /* synthetic */ int LL() {
        return -1;
    }

    public abstract C1269340j8W LLD();

    public /* synthetic */ int LLF() {
        return 24;
    }

    public abstract InterfaceC1272980jEO LLFF();

    public abstract void LLFFF(C1269240j8M c1269240j8M);

    public /* synthetic */ JSONObject LLFII() {
        return null;
    }

    public /* synthetic */ float LLFZ() {
        return 0.0f;
    }

    public Map<String, String> LLI() {
        return null;
    }

    public /* synthetic */ void LLIFFJFJJ() {
    }

    public /* synthetic */ C1273620jFQ LLII() {
        return null;
    }

    public TTLHSceneDetector LLIIIILZ() {
        return null;
    }

    public int LLIIIJ() {
        return 0;
    }

    public /* synthetic */ InterfaceC1272820jE8 LLIIIL() {
        return null;
    }

    public /* synthetic */ int LLIIIZ() {
        return 20;
    }

    public /* synthetic */ C012U LLIIJI(String str) {
        return null;
    }

    public /* synthetic */ String LLIIJLIL() {
        return "";
    }

    public /* synthetic */ void LLIIL() {
    }

    public abstract List<String> LLIILII();

    public /* synthetic */ C1269410j8d LLIILZL() {
        return null;
    }

    public /* synthetic */ JSONObject LLIIZ() {
        return null;
    }

    public Handler LLIL() {
        return null;
    }

    public /* synthetic */ InterfaceC1266410j3n LLILII() {
        return null;
    }

    public /* synthetic */ JSONObject LLILIL() {
        return null;
    }

    public /* synthetic */ Bundle LLILL() {
        return null;
    }

    public /* synthetic */ IVideoStrategyRunner LLILLJJLI() {
        return null;
    }

    public /* synthetic */ void LLILLL(TTLHPerfAdaptiveConfig tTLHPerfAdaptiveConfig) {
    }

    public /* synthetic */ boolean LLILZ() {
        return false;
    }

    public /* synthetic */ boolean LLILZIL() {
        return false;
    }

    public /* synthetic */ boolean LLILZLL() {
        return false;
    }

    public /* synthetic */ boolean LLIZ() {
        return false;
    }

    public /* synthetic */ boolean LLIZLLLIL() {
        return false;
    }

    public /* synthetic */ boolean LLJ() {
        return false;
    }

    public /* synthetic */ boolean LLJI() {
        return false;
    }

    public /* synthetic */ boolean LLJIJIL() {
        return false;
    }

    public /* synthetic */ boolean LLJILJIL() {
        return false;
    }

    public /* synthetic */ boolean LLJILJILJ() {
        return false;
    }

    public /* synthetic */ boolean LLJILLL() {
        return false;
    }

    public /* synthetic */ boolean LLJJ() {
        return false;
    }

    public /* synthetic */ boolean LLJJI() {
        return false;
    }

    public /* synthetic */ boolean LLJJIII() {
        return false;
    }

    public /* synthetic */ void LLJJIJI(JSONObject jSONObject) {
    }

    public abstract void LLJJIJIIJIL(int i, Object... objArr);

    public void LLJJIJIL(int i, int i2, int i3) {
    }

    public /* synthetic */ void LLJJJ(EnumC1267980j6K enumC1267980j6K) {
    }

    public void LLJJJIL(Cert cert) {
    }

    public void LLJJJJ(int i, String str, int i2, int i3, int i4, long j, ByteBuffer byteBuffer) {
    }

    public /* synthetic */ Bundle LLJJJJJIL(String str) {
        return null;
    }

    public void LLJJJJLIIL(AudioManager.AudioRecordingCallback audioRecordingCallback) {
    }

    public abstract void LLJJL(C1273930jFv c1273930jFv);

    public void LLJJLIIIJLLLLLLLZ() {
    }

    public void LLJL(C1274850jHP c1274850jHP) {
    }

    public /* synthetic */ void LLJLIL(InterfaceC1266830j4T interfaceC1266830j4T) {
    }

    public void LLJLILLLLZIIL(Cert cert) {
    }

    public abstract void LLJLL(InterfaceC1267860j68 interfaceC1267860j68);

    public /* synthetic */ void LLJLLIL(C1274330jGZ c1274330jGZ) {
    }

    public /* synthetic */ void LLJLLL() {
    }

    public abstract void LLJZ(C0UHD c0uhd);

    public /* synthetic */ void LLL(JSONObject jSONObject) {
    }

    public /* synthetic */ void LLLF() {
    }

    public void LLLFF(Cert cert) {
    }

    public void LLLFFI(Cert cert, boolean z) {
    }

    public abstract void LLLFZ(JSONObject jSONObject);

    public /* synthetic */ void LLLI(int i) {
    }

    public void LLLII(int i, int i2) {
    }

    public /* synthetic */ void LLLIIII(float f) {
    }

    public /* synthetic */ void LLLIIIIL(C923980a9U c923980a9U) {
    }

    public abstract void LLLIIIL(View view);

    public abstract void LLLIIL(boolean z);

    public abstract void LLLIILIL(boolean z);

    public /* synthetic */ void LLLIL(List list) {
    }

    public /* synthetic */ void LLLILZ(C1273190jEj c1273190jEj) {
    }

    public /* synthetic */ void LLLILZJ(C0UHH c0uhh) {
    }

    public /* synthetic */ void LLLILZLLLI(InterfaceC1272020jCq interfaceC1272020jCq) {
    }

    public /* synthetic */ void LLLIZZ(C923790a9B c923790a9B) {
    }

    public /* synthetic */ void LLLJ(C1267580j5g c1267580j5g) {
    }

    public void LLLJIL() {
    }

    public /* synthetic */ void LLLJL(InterfaceC1268200j6g interfaceC1268200j6g) {
    }

    public void LLLL(InterfaceC1272730jDz interfaceC1272730jDz) {
    }

    public /* synthetic */ void LLLLII(VideoSink videoSink) {
    }

    public /* synthetic */ void LLLLIIIILLL(EnumC1267980j6K enumC1267980j6K) {
    }

    public void LLLLIIL(float f) {
    }

    public void LLLLIILL(float f) {
    }

    public /* synthetic */ void LLLLIILLL(InterfaceC1274230jGP interfaceC1274230jGP) {
    }

    public /* synthetic */ void LLLLIL(List list, boolean z, boolean z2) {
    }

    public /* synthetic */ void LLLLILI(String str, boolean z) {
    }

    public void LLLLJ(Cert cert) {
    }

    public void LLLLJI(Cert cert) {
    }

    public /* synthetic */ void LLLLL(String str, boolean z) {
    }

    public void LLLLLIL(Cert cert) {
    }

    public void LLLLLILLIL(Cert cert) {
    }

    public void LLLLLJIL(int i, Cert cert) {
    }

    public /* synthetic */ JSONObject LLLLLJLJLL() {
        return null;
    }

    public /* synthetic */ void LLLLLL() {
    }

    public /* synthetic */ int LLLLLLIL(int i, int i2) {
        return 0;
    }

    public /* synthetic */ void LLLLLLJ() {
    }

    public /* synthetic */ void LLLLLLL() {
    }

    public /* synthetic */ void LLLLLLLLL() {
    }

    public void LLLLLLLLLL(Intent intent) {
    }

    public /* synthetic */ int LLLLLLLZIL(String str) {
        return 0;
    }

    public /* synthetic */ int LLLLLLZ(String str) {
        return 0;
    }

    public /* synthetic */ void LLLLLLZZ(C1267110j4v c1267110j4v) {
    }

    public /* synthetic */ void LLLLLZ() {
    }

    public /* synthetic */ int LLLLLZIL(float f, C1271210jBX c1271210jBX) {
        return -1;
    }

    public int LLJZIJLIL() {
        return LyraxErrorCode.NOT_SUPPORT.value();
    }

    public final C1269340j8W LJZI() {
        return LLD();
    }

    public EnumC1267980j6K LLIIII() {
        return EnumC1267980j6K.NORMAL_LIVE;
    }

    public InterfaceC1274490jGp LJIIJ(View view, Handler handler, boolean z) {
        return LJI(view, handler, z);
    }
}
