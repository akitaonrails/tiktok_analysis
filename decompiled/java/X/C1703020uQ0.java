package X;

import com.ss.android.ugc.aweme.services.audio.AudioWatermarkInfo;
import com.ss.android.ugc.aweme.services.audio.TtsCreatorInfo;
import com.ss.android.ugc.aweme.services.audio.VcCreatorInfo;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uQ0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.audioservice.service.watermark.AudioWatermarkServiceImpl$fetchAudioWatermarkInfo$1$1", f = "AudioWatermarkServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C1703020uQ0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ TtsCreatorInfo LL;
    public final /* synthetic */ VcCreatorInfo LLILLJJLI;
    public final /* synthetic */ C013C LLILLL;
    public final /* synthetic */ C259800zU<List<String>> LLILZ;
    public final /* synthetic */ C259800zU<List<String>> LLILZIL;
    public final /* synthetic */ C259800zU<String> LLILZLL;
    public final /* synthetic */ Function1<AudioWatermarkInfo, Unit> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1703020uQ0(TtsCreatorInfo ttsCreatorInfo, VcCreatorInfo vcCreatorInfo, C013C c013c, C259800zU<List<String>> c259800zU, C259800zU<List<String>> c259800zU2, C259800zU<String> c259800zU3, Function1<? super AudioWatermarkInfo, Unit> function1, InterfaceC1364105Vn<? super C1703020uQ0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = ttsCreatorInfo;
        this.LLILLJJLI = vcCreatorInfo;
        this.LLILLL = c013c;
        this.LLILZ = c259800zU;
        this.LLILZIL = c259800zU2;
        this.LLILZLL = c259800zU3;
        this.LLIZ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1703020uQ0(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference failed for: r0v22, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v23, types: [T, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r0v27, types: [T, java.util.List<java.lang.String>] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        VcCreatorInfo vcCreatorInfo;
        C1C7U.LIZ("AudioWatermarkServiceImpl@9fc7.fetchAudioWatermarkInfo$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        TtsCreatorInfo ttsCreatorInfo = this.LL;
        if ((ttsCreatorInfo != null && ttsCreatorInfo.hasTtsCreatorVoice) || ((vcCreatorInfo = this.LLILLJJLI) != null && vcCreatorInfo.hasVcCreatorVoice)) {
            this.LLILLL.element = true;
            LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
            TtsCreatorInfo ttsCreatorInfo2 = this.LL;
            if (ttsCreatorInfo2 != null) {
                this.LLILZ.element = ttsCreatorInfo2.ttsCreatorIdsList;
                Iterator<String> it2 = ttsCreatorInfo2.ttsCreatorUserNameList.iterator();
                while (it2.hasNext()) {
                    linkedHashSet.add(it2.next());
                }
            }
            VcCreatorInfo vcCreatorInfo2 = this.LLILLJJLI;
            if (vcCreatorInfo2 != null) {
                this.LLILZIL.element = vcCreatorInfo2.vcCreatorIdsList;
                Iterator<String> it3 = vcCreatorInfo2.vcCreatorUserNameList.iterator();
                while (it3.hasNext()) {
                    linkedHashSet.add(it3.next());
                }
            }
            for (String str : linkedHashSet) {
                C259800zU<String> c259800zU = this.LLILZLL;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(this.LLILZLL.element);
                sbLIZ.append(str);
                sbLIZ.append(", ");
                c259800zU.element = C2188811AlT.LIZIZ(sbLIZ);
            }
            this.LLIZ.invoke(new AudioWatermarkInfo(this.LLILLL.element, this.LLILZLL.element, this.LLILZ.element, this.LLILZIL.element));
        } else {
            this.LLIZ.invoke(new AudioWatermarkInfo(this.LLILLL.element, this.LLILZLL.element, this.LLILZ.element, this.LLILZIL.element));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AudioWatermarkServiceImpl@9fc7.fetchAudioWatermarkInfo$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
