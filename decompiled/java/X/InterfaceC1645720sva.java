package X;

import com.bef.effectsdk.message.MessageCenter;
import com.ss.android.medialib.presenter.IStickerRequestCallback;
import com.ss.android.ttve.model.VEFrame;
import com.ss.android.vesdk.VETouchPointer;
import com.ss.android.vesdk.filterparam.VEEffectFilterParam;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0sva, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public interface InterfaceC1645720sva extends InterfaceC1661400tKs {
    void Ao(float f, float f2);

    void Bh(String str, Map<Integer, Float> map);

    void Bo(InterfaceC1684900twm interfaceC1684900twm);

    boolean Ch(VETouchPointer vETouchPointer, int i);

    void Co(InterfaceC1684900twm interfaceC1684900twm);

    void Do(float f, float f2);

    int[] LJJLL(String str, String str2);

    int LJJZ(String str, String str2);

    void LJJZZI(boolean z);

    void LJJZZIII(double d, double d2, double d3, double d4);

    void LJL(String str);

    void LJLI(double d, double[] dArr);

    void LJLIIIL();

    void LJLIIL(double d, double d2, double d3, double d4);

    void LJLIL(boolean z, boolean z2, boolean z3, boolean z4);

    float LJLILLLLZI(String str);

    void LJLJI(double d, double d2, double d3, double d4);

    void LJLJJI();

    void LJLJJL(int i, int i2, String str, String str2);

    void LJLJL(int i, int i2, InterfaceC2173471A4j interfaceC2173471A4j);

    void LJLJLJ();

    void Nn(int i, String str);

    int On(VEEffectFilterParam vEEffectFilterParam);

    void Pa(float f, float f2);

    void Pn(boolean z, boolean z2, boolean z3);

    @InterfaceC1294060jmO
    void Q7(String str, float f);

    void Qa(boolean z);

    void Qn(String str, String str2, String str3);

    void R7();

    void Ra(boolean z);

    void Rn(String str, String str2);

    void Sa(C1AM5 c1am5);

    int Sn(List<String> list, List<? extends VEFrame> list2);

    void Tn(MessageCenter.Listener listener);

    void Un(String str);

    void Vn(C12JH c12jh);

    void Wn();

    void Xn(C2177801ALa c2177801ALa);

    int Y9(String[] strArr, int i, String[] strArr2, int i2);

    void Yn(double d);

    void Zn(C1AM5 c1am5);

    void ao();

    void bo(int i, int i2, C2177891ALj c2177891ALj);

    void co(float f, float f2);

    /* JADX INFO: renamed from: do, reason: not valid java name */
    void mo59do(float f, float f2);

    void enableEffect(boolean z);

    C1413440msw eo();

    void fo(float f, float f2, float f3, float f4, float f5);

    List<VEEffectFilterParam> getPreparedEffectList();

    String go();

    void ho();

    int io(int i, String[] strArr);

    VEFrame jo(String str);

    void kk(float f);

    void ko();

    void lk();

    void lo(List<? extends VEEffectFilterParam> list);

    void mk(InterfaceC1623210sLH interfaceC1623210sLH);

    int mo(int i, String[] strArr);

    void nk(String[] strArr, double[] dArr, boolean[] zArr);

    void no(float f, float f2, int i, int i2);

    String ok();

    void oo();

    void pauseEffectAudio(boolean z);

    @InterfaceC1294060jmO
    void pg(String str, float f, float f2);

    void po();

    void processTouchEvent(float f, float f2);

    int qo(List<String> list, List<? extends VEFrame> list2);

    void ro(String str, String str2, float f, float f2, float f3);

    void sendEffectMsg(int i, long j, long j2, String str);

    void setDetectInterval(int i);

    void setFilter(String str);

    void setFilter(String str, float f);

    void setHandDetectLowpower(boolean z);

    void setRenderCacheString(String str, String str2);

    void setStickerRequestCallback(IStickerRequestCallback iStickerRequestCallback);

    void so();

    void to(MessageCenter.Listener listener);

    void uo(List<? extends VEEffectFilterParam> list);

    int vo(String str, float f);

    InterfaceC1622650sKN wo();

    void xo(C1625110sOL c1625110sOL);

    void ya(String str, float f, float f2);

    void yo(float f);

    C1448420nnM zo();
}
