package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.audio.copyrightdetect.AudioCopyrightDetectAPI;
import com.ss.android.ugc.aweme.audio.copyrightdetect.AutoCheckResponse;
import com.ss.android.ugc.aweme.services.edit.CachedAutoMuteStripSettingStatus;
import com.ss.android.ugc.gamora.editor.audio.copyrightdetect.AutoSoundCheckService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01XE, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.audio.copyrightdetect.AutoSoundCheckService$getPostSetting$1", f = "AutoSoundCheckService.kt", l = {41}, m = "invokeSuspend")
public final class C01XE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AutoSoundCheckService LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Function1<C01XF, Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C01XE(AutoSoundCheckService autoSoundCheckService, String str, Function1<? super C01XF, Unit> function1, InterfaceC1364105Vn<? super C01XE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = autoSoundCheckService;
        this.LLILLL = str;
        this.LLILZ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01XE(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C01XF c01xf;
        boolean z;
        Integer num;
        CachedAutoMuteStripSettingStatus cachedAutoMuteStripSettingStatus;
        Integer num2;
        C1C7U.LIZ("AutoSoundCheckService@2f23.getPostSetting$1");
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
            AudioCopyrightDetectAPI audioCopyrightDetectAPI = (AudioCopyrightDetectAPI) this.LLILLJJLI.LIZ.getValue();
            String str = this.LLILLL;
            audioCopyrightDetectAPI.getClass();
            try {
                AutoCheckResponse autoCheckResponse = ((AudioCopyrightDetectAPI.MusicCheckApi) audioCopyrightDetectAPI.LIZ.getValue()).getAutoCheck(str).execute().LIZIZ;
                if (autoCheckResponse == null || (num2 = autoCheckResponse.precheck_music) == null || num2.intValue() != 1) {
                    z = false;
                } else {
                    z = true;
                }
                if (autoCheckResponse != null) {
                    num = autoCheckResponse.enableAutoMuteStrip;
                } else {
                    num = null;
                }
                if (num == null || num.intValue() != 1) {
                    if (num != null && num.intValue() == 2) {
                        cachedAutoMuteStripSettingStatus = CachedAutoMuteStripSettingStatus.ON;
                    } else {
                        cachedAutoMuteStripSettingStatus = CachedAutoMuteStripSettingStatus.DISABLED;
                    }
                } else {
                    cachedAutoMuteStripSettingStatus = CachedAutoMuteStripSettingStatus.OFF;
                }
                c01xf = new C01XF(z, cachedAutoMuteStripSettingStatus);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                c01xf = new C01XF(0);
            }
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C01XD c01xd = new C01XD(this.LLILZ, c01xf, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c01xd) == objLJFF) {
                C1C7U.LIZIZ("AutoSoundCheckService@2f23.getPostSetting$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AutoSoundCheckService@2f23.getPostSetting$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
