package X;

import android.os.Bundle;
import com.ss.ttlivestreamer.core.engine.VideoSink;
import com.ss.ttlivestreamer.core.scene_detect.TTLHSceneDetector;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0j3n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public interface InterfaceC1266410j3n {
    void LJFF(boolean z);

    void LJIILLIIL(int i);

    void LJIIZILJ(C1273190jEj c1273190jEj);

    void LJIJJ(EnumC1269700j96 enumC1269700j96);

    void LJJ(C1270360jAA c1270360jAA);

    void LJJI(C1269990j9Z c1269990j9Z);

    void LJJIIJZLJL(boolean z);

    void LJJIL(C1275410jIJ c1275410jIJ);

    void LJJIZ(EnumC1267980j6K enumC1267980j6K);

    void LJJJI(C1272040jCs c1272040jCs);

    void LJJJJJL(EnumC1270450jAJ enumC1270450jAJ);

    void LJJJLIIL(VideoSink videoSink);

    void LJJLIIIJL(InterfaceC1269980j9Y interfaceC1269980j9Y);

    void LJJLIIIJLLLLLLLZ(VideoSink videoSink);

    void LJJLIIJ(EnumC1267980j6K enumC1267980j6K);

    void LJJZ(C1270630jAb c1270630jAb);

    void LJL(C1272100jCy c1272100jCy);

    void LJLIIIL(TTLHSceneDetector tTLHSceneDetector);

    void LJLIL(C1270180j9s c1270180j9s);

    void LJLJI(int i, int i2, boolean z);

    void LJLJLLL(Bundle bundle, InterfaceC1270140j9o interfaceC1270140j9o);

    JSONObject LJZI();

    void LLF(JSONObject jSONObject);

    C1267750j5x LLILZIL();

    JSONObject getStatus();

    Bundle query(String str);

    void release();

    void start();
}
