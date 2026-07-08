package X;

import com.ss.android.ttve.model.VEMusicWaveBean;
import com.ss.android.vesdk.VEUtils;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Dr6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.ugc.android.editor.track.utils.VEUtils$getWaveArray$2", f = "VEUtils.kt", l = {}, m = "invokeSuspend")
public final class C352020Dr6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super float[]>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C352020Dr6(int i, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C352020Dr6(this.LLILLJJLI, this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        float[] waveBean;
        C1C7U.LIZ("VEUtils@3f1f.getWaveArray$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL);
        sbLIZ.append(this.LLILLJJLI);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        HashMap<String, float[]> map = C352030Dr7.LIZ;
        if (map.get(strLIZIZ) != null) {
            float[] fArr = map.get(strLIZIZ);
            C1C7U.LIZIZ("VEUtils@3f1f.getWaveArray$2");
            return fArr;
        }
        VEMusicWaveBean musicWaveData = VEUtils.getMusicWaveData(this.LL, 2, this.LLILLJJLI);
        if (musicWaveData == null || (waveBean = musicWaveData.getWaveBean()) == null) {
            waveBean = new float[0];
        }
        map.put(strLIZIZ, waveBean);
        C1C7U.LIZIZ("VEUtils@3f1f.getWaveArray$2");
        return waveBean;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super float[]> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
