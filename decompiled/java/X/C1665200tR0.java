package X;

import android.os.SystemClock;
import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.ies.effecteditor.swig.EEEffectHandle;
import com.bytedance.ies.effecteditor.swig.EffectEditorJniJNI;
import com.bytedance.ies.effecteditor.swig.EffectHandleGetter;
import com.bytedance.ies.effecteditor.swig.UIAnnotationErrorCode;
import com.bytedance.ies.effecteditor.swig.UIAnnotationTextInputUIMore;
import com.bytedance.ies.effecteditor.swig.UIAnnotationUIType;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.stickers.MusicAndTimeModel;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.vesdk.VERecorder;
import java.io.PrintStream;
import java.util.Objects;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0tR0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1665200tR0 {
    public static final C1665200tR0 LIZ = new C1665200tR0();
    public static Pair<String, ? extends C1DPK> LIZIZ;

    public static MusicAndTimeModel LIZ(Effect effect) {
        AbstractC1665240tR4<?, ?>[] abstractC1665240tR4ArrLIZ;
        T t;
        String currentValue;
        C1DPK c1dpkLIZIZ = LIZIZ(effect);
        if (c1dpkLIZIZ != null && (abstractC1665240tR4ArrLIZ = c1dpkLIZIZ.LIZ(UIAnnotationUIType.UIAnnotationUIType_TextInput)) != null) {
            AbstractC1665240tR4<?, ?> abstractC1665240tR4 = abstractC1665240tR4ArrLIZ[0];
            if ((abstractC1665240tR4 instanceof C1DPC) && abstractC1665240tR4 != null && (t = abstractC1665240tR4.LIZ) != 0) {
                T t2 = t.LIZ;
                if (t2 != 0) {
                    currentValue = ((UIAnnotationTextInputUIMore) t2).getCurrentValue();
                    if (currentValue != null) {
                    }
                } else {
                    currentValue = "";
                }
                try {
                    return (MusicAndTimeModel) C7740030o.LIZ().getGson().LJII(currentValue, MusicAndTimeModel.class);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [X.0tR1] */
    public static C1DPK LIZIZ(Effect effect) {
        String first;
        if (effect == null) {
            return null;
        }
        if (!C1665230tR3.LIZ) {
            synchronized (C1665230tR3.class) {
                try {
                    if (!C1665230tR3.LIZ) {
                        if (!C2074008Ao.LIZ()) {
                            return null;
                        }
                        try {
                            LoadSoLancet.LIZJ("EffectEditorJni");
                            long jUptimeMillis = SystemClock.uptimeMillis();
                            Librarian.LJFF("EffectEditorJni");
                            LoadSoLancet.LJ(jUptimeMillis, "EffectEditorJni");
                            LoadSoLancet.LIZLLL(jUptimeMillis, "EffectEditorJni");
                            LoadSoLancet.LIZIZ("EffectEditorJni");
                            C1665230tR3.LIZ = true;
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            PrintStream printStream = System.err;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("Native code library failed to load.\n");
                            sbLIZ.append(th);
                            printStream.println(C2188811AlT.LIZIZ(sbLIZ));
                            C1665230tR3.LIZ = false;
                        }
                        if (C1665230tR3.LIZ) {
                            C1665230tR3.LIZIZ = new EffectHandleGetter() { // from class: X.0tR1
                                @Override // com.bytedance.ies.effecteditor.swig.EffectHandleGetter
                                public final long getEffectHandle() {
                                    if (C1642420sqG.LIZ().LIZIZ() == null) {
                                        return 0L;
                                    }
                                    VERecorder vERecorderLIZIZ = C1642420sqG.LIZ().LIZIZ();
                                    Objects.requireNonNull(vERecorderLIZIZ);
                                    return vERecorderLIZIZ.LIZIZ.LJJIZ.LJIIIIZZ();
                                }
                            };
                            EEEffectHandle eEEffectHandleInstance = EEEffectHandle.Instance();
                            Objects.requireNonNull(eEEffectHandleInstance);
                            eEEffectHandleInstance.setMETEffectHandleGetterPtr(C1665230tR3.LIZIZ);
                            MessageCenter.addListener(new MessageCenter.Listener() { // from class: X.0tR2
                                @Override // com.bef.effectsdk.message.MessageCenter.Listener
                                public final void onMessageReceived(int i, int i2, int i3, String str) {
                                    long j = i;
                                    if (str == null) {
                                        str = "";
                                    }
                                    EffectEditorJniJNI.EffectMessageCenter_dispatchEffectMessage(j, i2, i3, str);
                                }
                            });
                        }
                        boolean z = C1665230tR3.LIZ;
                        if (!z) {
                            return null;
                        }
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    throw th2;
                }
            }
        }
        Pair<String, ? extends C1DPK> pair = LIZIZ;
        if (pair != null) {
            first = pair.getFirst();
        } else {
            first = null;
        }
        if (Intrinsics.LJFF(first, effect.getUnzipPath())) {
            Pair<String, ? extends C1DPK> pair2 = LIZIZ;
            if (pair2 == null) {
                return null;
            }
            return pair2.getSecond();
        }
        C1DPK c1dpk = new C1DPK(effect.getUnzipPath(), effect.getTransResPath());
        if (c1dpk.LIZJ() == UIAnnotationErrorCode.UIAnnotationErrorCode_None) {
            LIZIZ = new Pair<>(effect.getUnzipPath(), c1dpk);
        }
        return c1dpk;
    }

    public static boolean LIZJ(Effect effect) {
        boolean z;
        String str;
        MusicAndTimeModel musicAndTimeModelLIZ = LIZ(effect);
        if (musicAndTimeModelLIZ != null && (str = musicAndTimeModelLIZ.musicID) != null && !a0.LJJJIL(str)) {
            z = false;
        } else {
            z = true;
        }
        return !z;
    }
}
