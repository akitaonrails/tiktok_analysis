package X;

import com.bytedance.ies.smartmovie.jni.CommonRequestCallback;
import com.bytedance.ies.smartmovie.jni.MusicRequestParams;
import com.bytedance.ies.smartmovie.jni.SmartMovieErrorCode;
import com.bytedance.ies.smartmovie.jni.SmartMovieJniJNI;
import com.bytedance.ies.smartmovie.jni.UnorderedMapStrStr;
import com.bytedance.ies.smartmovie.jni.VecMeta;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0n2b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1419430n2b extends C09AY implements InterfaceC1631630sYr<Integer, Integer, String, String, Unit> {
    public final /* synthetic */ C1419380n2W LL;
    public final /* synthetic */ MusicRequestParams LLILLJJLI;
    public final /* synthetic */ C259800zU<Long> LLILLL;
    public final /* synthetic */ C15O7<String> LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ CommonRequestCallback LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1419430n2b(C1419380n2W c1419380n2W, MusicRequestParams musicRequestParams, C259800zU<Long> c259800zU, C15O7<String> c15o7, boolean z, boolean z2, CommonRequestCallback commonRequestCallback) {
        super(4);
        this.LL = c1419380n2W;
        this.LLILLJJLI = musicRequestParams;
        this.LLILLL = c259800zU;
        this.LLILZ = c15o7;
        this.LLILZIL = z;
        this.LLILZLL = z2;
        this.LLIZ = commonRequestCallback;
    }

    @Override // X.InterfaceC1631630sYr
    public final Unit invoke(Integer num, Integer num2, String str, String str2) {
        String str3;
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        String str4 = str;
        String str5 = str2;
        InterfaceC1419480n2g interfaceC1419480n2g = this.LL.LIZLLL;
        if (interfaceC1419480n2g != null) {
            VecMeta vecMetaLIZIZ = this.LLILLJJLI.LIZIZ();
            MusicRequestParams musicRequestParams = this.LLILLJJLI;
            str3 = str4;
            interfaceC1419480n2g.LIZJ(vecMetaLIZIZ, false, iIntValue, iIntValue2, str4, SmartMovieJniJNI.MusicRequestParams_getZipUri(musicRequestParams.LIZ, musicRequestParams), this.LLILLL.element, str5, this.LLILZ.LJIIL(), (String) this.LLILLJJLI.LIZ().get("source"), this.LLILZIL, this.LLILZLL);
        } else {
            str3 = str4;
        }
        UnorderedMapStrStr unorderedMapStrStr = new UnorderedMapStrStr();
        if (C306440Bzm.LIZ() && iIntValue == 5000 && (iIntValue2 == -199 || iIntValue2 == -106)) {
            unorderedMapStrStr.put("weak_net", "weak_net");
        }
        unorderedMapStrStr.put("sub_error_code", String.valueOf(iIntValue2));
        CommonRequestCallback commonRequestCallback = this.LLIZ;
        if (commonRequestCallback != null) {
            commonRequestCallback.onFailure(SmartMovieErrorCode.MUSIC_REQUEST_FAILURE.swigValue(), str3, unorderedMapStrStr);
        }
        return Unit.LIZ;
    }
}
