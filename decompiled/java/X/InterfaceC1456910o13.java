package X;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.inlinecaption.CaptionUtterance;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0o13, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public interface InterfaceC1456910o13 extends C05YF {
    void As2();

    LiveEvent<Unit> BH1();

    void Dt1(NLEModel nLEModel);

    LiveEvent<Unit> EI2();

    MutableLiveData<Integer> Gl();

    void Hs1(boolean z);

    LiveData<Boolean> Jy1();

    LiveData<Unit> Kp2();

    void M8(int i);

    void O32(boolean z);

    LiveEvent<List<TextStickerData>> OR();

    void RG2(ArrayList<TextStickerData> arrayList);

    MutableLiveData<Integer> Rv();

    void Rw();

    void SI(Pair<String, Integer> pair);

    void TC1(long j);

    MutableLiveData<Pair<String, Integer>> Vn();

    void Xf(int i);

    void Xp2(ArrayList<TextStickerData> arrayList);

    void Z30(C364440EQo c364440EQo);

    LiveData<Unit> b91();

    LiveEvent<Long> bi0();

    void cn2();

    void eN1(List<CaptionUtterance> list, boolean z);

    void hide();

    void hz();

    void iW(String str);

    void n80();

    LiveData<Pair<String, Boolean>> nW0();

    void pQ0();

    LiveEvent<Unit> ri1();

    AbstractC2217051Bpv rw1();

    void s02(VideoPublishEditModel videoPublishEditModel, InterfaceC1455860nzM interfaceC1455860nzM);

    C385670FAf<List<CaptionUtterance>> sF();

    boolean sj1();

    MutableLiveData<Integer> tk();

    LiveData<C364440EQo> vh1();

    void z6(int i);
}
