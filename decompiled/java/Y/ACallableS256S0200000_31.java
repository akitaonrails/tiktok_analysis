package Y;

import X.C13LP;
import X.C15438062q;
import X.C15KF;
import X.C1C7U;
import X.C20643115q9;
import X.EnumC20643215qA;
import X.InterfaceC20498115It;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Pair;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes32.dex */
public class ACallableS256S0200000_31 implements Callable {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            case 3:
                return call$3(this);
            case 4:
                return call$4(this);
            case 5:
                return call$5(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS256S0200000_31 aCallableS256S0200000_31) {
        C1C7U.LIZ("InnerPushPuller@6455.pull$1");
        C20643115q9 c20643115q9 = C20643115q9.LIZ;
        EnumC20643215qA enumC20643215qA = (EnumC20643215qA) aCallableS256S0200000_31.l0;
        JSONObject jSONObject = (JSONObject) aCallableS256S0200000_31.l1;
        c20643115q9.getClass();
        C20643115q9.LIZJ(enumC20643215qA, jSONObject);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InnerPushPuller@6455.pull$1");
        return unit;
    }

    public static final Object call$1(ACallableS256S0200000_31 aCallableS256S0200000_31) {
        C1C7U.LIZ("InnerPushPuller@6455.pull$3");
        C20643115q9 c20643115q9 = C20643115q9.LIZ;
        EnumC20643215qA enumC20643215qA = (EnumC20643215qA) aCallableS256S0200000_31.l0;
        JSONObject jSONObject = (JSONObject) aCallableS256S0200000_31.l1;
        c20643115q9.getClass();
        C20643115q9.LIZJ(enumC20643215qA, jSONObject);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InnerPushPuller@6455.pull$3");
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    public static final Object call$2(ACallableS256S0200000_31 aCallableS256S0200000_31) {
        int i;
        AVMusicWaveBean musicWaveData;
        MusicWaveBean musicWaveBeanLJ;
        C1C7U.LIZ("MusicWaveDataFetcher@f064.getMultiMusicWaveBeanAsync$1");
        List list = (List) aCallableS256S0200000_31.l0;
        List list2 = (List) aCallableS256S0200000_31.l1;
        C15KF.LIZ.getClass();
        Object objLIZJ = C15KF.LIZJ(list, list2);
        if (objLIZJ == 0) {
            List listLLIILII = C13LP.LLIILII(list, list2);
            objLIZJ = new ArrayList(C15438062q.LJIJJ(listLLIILII, 10));
            for (Pair pair : (ArrayList) listLLIILII) {
                String str = (String) pair.getFirst();
                int iIntValue = ((Number) pair.getSecond()).intValue();
                int musicDuration = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).abilityService().infoService().getMusicDuration(str);
                if (musicDuration <= -1) {
                    musicWaveBeanLJ = C15KF.LJ(iIntValue);
                } else {
                    if (iIntValue <= 0) {
                        i = 2000;
                    } else {
                        i = iIntValue;
                    }
                    if (musicDuration <= 90000 && (musicWaveData = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).vesdkService().getMusicWaveData(str, 0, i)) != null) {
                        musicWaveBeanLJ = new MusicWaveBean();
                        musicWaveBeanLJ.setMusicLength(musicWaveData.getMusicLength());
                        musicWaveBeanLJ.setMusicWavePointArray(musicWaveData.getMusicWavePointArray());
                        musicWaveBeanLJ.setVideoLenght(musicWaveData.getVideoLenght());
                    } else {
                        musicWaveBeanLJ = C15KF.LJ(iIntValue);
                    }
                    C15KF.LIZ(musicWaveBeanLJ);
                }
                objLIZJ.add(musicWaveBeanLJ);
            }
        }
        C1C7U.LIZIZ("MusicWaveDataFetcher@f064.getMultiMusicWaveBeanAsync$1");
        return objLIZJ;
    }

    public static final Object call$3(ACallableS256S0200000_31 aCallableS256S0200000_31) {
        InterfaceC20498115It interfaceC20498115It = (InterfaceC20498115It) aCallableS256S0200000_31.l0;
        Exception exc = (Exception) aCallableS256S0200000_31.l1;
        C1C7U.LIZ("MusicService@3f29.fetchMusicDetail$1L$1L");
        interfaceC20498115It.onFailed(exc);
        C1C7U.LIZIZ("MusicService@3f29.fetchMusicDetail$1L$1L");
        return null;
    }

    public static final Object call$4(ACallableS256S0200000_31 aCallableS256S0200000_31) {
        InterfaceC20498115It interfaceC20498115It = (InterfaceC20498115It) aCallableS256S0200000_31.l0;
        Exception exc = (Exception) aCallableS256S0200000_31.l1;
        C1C7U.LIZ("MusicService@3f29.fetchMusicByTemplateId$1L$1L");
        interfaceC20498115It.onFailed(exc);
        C1C7U.LIZIZ("MusicService@3f29.fetchMusicByTemplateId$1L$1L");
        return null;
    }

    public static final Object call$5(ACallableS256S0200000_31 aCallableS256S0200000_31) {
        InterfaceC20498115It interfaceC20498115It = (InterfaceC20498115It) aCallableS256S0200000_31.l0;
        Exception exc = (Exception) aCallableS256S0200000_31.l1;
        C1C7U.LIZ("MusicService@3f29.downloadMusic$2L");
        interfaceC20498115It.onFailed(exc);
        C1C7U.LIZIZ("MusicService@3f29.downloadMusic$2L");
        return null;
    }

    public ACallableS256S0200000_31(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
