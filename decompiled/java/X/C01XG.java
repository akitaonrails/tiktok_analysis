package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.audio.copyrightdetect.AudioCopyrightDetectAPI;
import com.ss.android.ugc.aweme.audio.copyrightdetect.AutoCheckRequest;
import com.ss.android.ugc.aweme.audio.copyrightdetect.PostSettingEntryType;
import com.ss.android.ugc.aweme.services.edit.CachedAutoMuteStripSettingStatus;
import com.ss.android.ugc.gamora.editor.audio.copyrightdetect.MuteStripSettingService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01XG, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.audio.copyrightdetect.MuteStripSettingService$setAutoMuteStripSetting$1", f = "MuteStripSettingService.kt", l = {54}, m = "invokeSuspend")
public final class C01XG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MuteStripSettingService LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ Function1<Integer, Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C01XG(MuteStripSettingService muteStripSettingService, boolean z, Function1<? super Integer, Unit> function1, InterfaceC1364105Vn<? super C01XG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = muteStripSettingService;
        this.LLILLL = z;
        this.LLILZ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01XG(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int value;
        CachedAutoMuteStripSettingStatus cachedAutoMuteStripSettingStatus;
        C1C7U.LIZ("MuteStripSettingService@968e.setAutoMuteStripSetting$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            AudioCopyrightDetectAPI audioCopyrightDetectAPI = (AudioCopyrightDetectAPI) this.LLILLJJLI.LIZIZ.getValue();
            boolean z = this.LLILLL;
            audioCopyrightDetectAPI.getClass();
            try {
                int value2 = PostSettingEntryType.ENABLE_AUTO_STRIP.getValue();
                if (z) {
                    cachedAutoMuteStripSettingStatus = CachedAutoMuteStripSettingStatus.ON;
                } else {
                    cachedAutoMuteStripSettingStatus = CachedAutoMuteStripSettingStatus.OFF;
                }
                Integer num = ((AudioCopyrightDetectAPI.MusicCheckApi) audioCopyrightDetectAPI.LIZ.getValue()).LIZIZ(new AutoCheckRequest(value2, Integer.valueOf(cachedAutoMuteStripSettingStatus.getValue()))).execute().LIZIZ.enableAutoMuteStrip;
                if (num != null) {
                    value = num.intValue();
                } else {
                    value = CachedAutoMuteStripSettingStatus.DISABLED.getValue();
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                value = CachedAutoMuteStripSettingStatus.DISABLED.getValue();
            }
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C01TV c01tv = new C01TV(value, null, this.LLILZ);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c01tv) == objLJFF) {
                C1C7U.LIZIZ("MuteStripSettingService@968e.setAutoMuteStripSetting$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MuteStripSettingService@968e.setAutoMuteStripSetting$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
