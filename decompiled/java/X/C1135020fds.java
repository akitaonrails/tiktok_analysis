package X;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.liveinteract.match.service.ILiveMatchService;
import java.util.List;

/* JADX INFO: renamed from: X.0fds, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1135020fds {
    public static C1130340fWK LIZ(long j, long j2) {
        long j3;
        long j4;
        MutableLiveData<List<C976480bWA>> mutableLiveDataLJJJJIZL;
        List<C976480bWA> value;
        ILiveMatchService iLiveMatchService = (ILiveMatchService) C1161920gLG.LIZJ(ILiveMatchService.class);
        long j5 = 0;
        if (iLiveMatchService.xB0() == EnumC919170a1j.MATCH_TYPE_INDIVIDUAL) {
            InterfaceC973730bRj interfaceC973730bRjYf2 = iLiveMatchService.yf2(false);
            if (interfaceC973730bRjYf2 != null && (mutableLiveDataLJJJJIZL = interfaceC973730bRjYf2.LJJJJIZL()) != null && (value = mutableLiveDataLJJJJIZL.getValue()) != null) {
                j4 = -1;
                long j6 = -1;
                for (C976480bWA c976480bWA : value) {
                    if (c976480bWA.LIZ != interfaceC973730bRjYf2.LJJJJJ()) {
                        if (j4 == -1 || c976480bWA.LIZIZ < j4) {
                            j4 = c976480bWA.LIZIZ;
                        }
                        if (j6 == -1 || c976480bWA.LIZIZ > j6) {
                            j6 = c976480bWA.LIZIZ;
                        }
                    }
                }
                if (j6 != -1 && j < j6) {
                    j3 = j6 - j;
                }
                if (j4 != -1 && j > j4) {
                    j5 = j - j4;
                }
            } else {
                j4 = -1;
            }
            j3 = 0;
            if (j4 != -1) {
                j5 = j - j4;
            }
        } else if (j < j2) {
            j3 = j2 - j;
        } else {
            j3 = 0;
            if (j > j2) {
                j5 = j - j2;
            }
        }
        return new C1130340fWK(j3, j5);
    }
}
