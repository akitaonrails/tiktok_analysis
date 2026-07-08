package X;

import Y.ARunnableS113S0100000_13;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ad.feed.ibe.setting.IBEConfigSettings;
import com.ss.android.ugc.aweme.commerce.InteractiveBrandedEffectInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS165S1100000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0dlo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1063060dlo extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1063050dln LL;
    public final /* synthetic */ SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LLILLJJLI;
    public final /* synthetic */ InteractiveBrandedEffectInfo LLILLL;
    public final /* synthetic */ C1057930ddX LLILZ;
    public final /* synthetic */ Aweme LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1063060dlo(C1063050dln c1063050dln, SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, InteractiveBrandedEffectInfo interactiveBrandedEffectInfo, C1057930ddX c1057930ddX, Aweme aweme, String str) {
        super(0);
        this.LL = c1063050dln;
        this.LLILLJJLI = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        this.LLILLL = interactiveBrandedEffectInfo;
        this.LLILZ = c1057930ddX;
        this.LLILZIL = aweme;
        this.LLILZLL = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Object next;
        C1063050dln c1063050dln = this.LL;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLILLJJLI;
        InteractiveBrandedEffectInfo interactiveBrandedEffectInfo = this.LLILLL;
        C1057930ddX c1057930ddX = this.LLILZ;
        Aweme aweme = this.LLILZIL;
        c1063050dln.getClass();
        C1063100dls.LIZIZ.LJFF = true;
        ConcurrentHashMap<String, List<C1062850dlT>> concurrentHashMap = C1063100dls.LIZ.LIZ;
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<String, List<C1062850dlT>>> it2 = concurrentHashMap.entrySet().iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(it2.next().getValue(), arrayList);
        }
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                next = null;
                break;
            }
            next = it3.next();
            if (Intrinsics.LJFF(((C1062850dlT) next).LIZ, sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB)) {
                break;
            }
        }
        C1062850dlT c1062850dlT = (C1062850dlT) next;
        if (c1062850dlT != null) {
            synchronized (c1062850dlT) {
                try {
                    c1062850dlT.LJFF = EnumC1062840dlS.LLILZ;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        C789490Uy3 c789490Uy3 = c1063050dln.LLILLJJLI;
        if (c789490Uy3 != null) {
            c789490Uy3.setView(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
            int visibility = c789490Uy3.getVisibility();
            c789490Uy3.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, c789490Uy3);
            if (interactiveBrandedEffectInfo.getEnableTap()) {
                c789490Uy3.setInterceptTouchEvent(C1063100dls.LIZIZ.LIZJ == 1);
                c789490Uy3.setEnabled(C1063100dls.LIZIZ.LIZJ == 0);
                c789490Uy3.setClickable(C1063100dls.LIZIZ.LIZJ == 0);
            }
            if (interactiveBrandedEffectInfo.getEnableShake()) {
                c789490Uy3.setInterceptTouchEvent(true);
                c789490Uy3.setEnabled(false);
                c789490Uy3.setClickable(false);
            }
        }
        C1063030dll.LIZ.getClass();
        c1057930ddX.log(C1063030dll.LJII);
        Pair[] pairArr = new Pair[8];
        pairArr[0] = new Pair("prop_data", interactiveBrandedEffectInfo.getPropData());
        pairArr[1] = new Pair("brand_extra", interactiveBrandedEffectInfo.getBrandExtra());
        pairArr[2] = new Pair("scale_mode", 0);
        pairArr[3] = new Pair("did_finish", Integer.valueOf(C1063100dls.LIZIZ.LIZJ));
        InterfaceC988610bpj interfaceC988610bpj = (InterfaceC988610bpj) C2214471Bll.LJIIJJI.LIZ();
        if (interfaceC988610bpj == null) {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        pairArr[4] = new Pair("client_extra", GsonProtectorUtils.toJson(interfaceC988610bpj.getGson(), interactiveBrandedEffectInfo.getVideoInterval()));
        pairArr[5] = new Pair("sticker_id", interactiveBrandedEffectInfo.getStickerId());
        pairArr[6] = new Pair("enter_from", c1063050dln.LL.getEventType());
        pairArr[7] = new Pair("video_id", aweme.getAid());
        C0J3A.LIZIZ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, "IBEShow", pairArr);
        C1063050dln c1063050dln2 = this.LL;
        Aweme aweme2 = this.LLILZIL;
        c1063050dln2.getClass();
        long duration = aweme2.getVideo().getDuration();
        double d = IBEConfigSettings.LIZ().ibeHideTime;
        double d2 = LSPassThroughRecordSizeConfig.DEFAULT;
        long jLIZJ = duration <= C814420VxA.LIZJ(d * d2) ? C814420VxA.LIZJ(IBEConfigSettings.LIZ().ibeHideTime * d2) - C814420VxA.LIZJ(IBEConfigSettings.LIZ().ibeShowTime * d2) : C814420VxA.LIZJ(IBEConfigSettings.LIZ().ibeHideTime * d2);
        C1063050dln c1063050dln3 = this.LL;
        Aweme aweme3 = this.LLILZIL;
        c1063050dln3.getClass();
        C786410Ut5.LJLIIL(jLIZJ - C1063050dln.LIZIZ(aweme3), new BPEAHandler(Looper.getMainLooper()), new ARunnableS113S0100000_13(new AwS165S1100000_16(this.LLILZLL, this.LL, 23), (Function0<Unit>) 140));
        return Unit.LIZ;
    }
}
