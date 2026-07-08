package X;

import com.mammon.audiosdk.structures.SAMICoreServerEvent;
import com.mammon.audiosdk.structures.SAMICoreTtsResult;
import com.ss.android.ugc.aweme.services.audio.ITTSCallback;
import com.ss.android.ugc.aweme.services.audio.ITTSService;
import com.ss.android.ugc.aweme.services.audio.PlayAuditionCallback;
import com.ss.android.ugc.gamora.editor.audioservice.service.vopinstantclone.VopInstantCloneCameraServiceImpl;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05WY, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.audioservice.service.vopinstantclone.VopInstantCloneCameraServiceImpl$playAudition$1", f = "VopInstantCloneCameraServiceImpl.kt", l = {109}, m = "invokeSuspend")
public final class C05WY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ VopInstantCloneCameraServiceImpl LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ PlayAuditionCallback LLILZLL;
    public final /* synthetic */ C259800zU<AtomicBoolean> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05WY(VopInstantCloneCameraServiceImpl vopInstantCloneCameraServiceImpl, String str, String str2, String str3, PlayAuditionCallback playAuditionCallback, C259800zU<AtomicBoolean> c259800zU, InterfaceC1364105Vn<? super C05WY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = vopInstantCloneCameraServiceImpl;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        this.LLILZLL = playAuditionCallback;
        this.LLIZ = c259800zU;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05WY(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VopInstantCloneCameraServiceImpl@c927.playAudition$1");
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
            VopInstantCloneCameraServiceImpl vopInstantCloneCameraServiceImpl = this.LLILLJJLI;
            vopInstantCloneCameraServiceImpl.LIZIZ = true;
            ITTSService iTTSServiceLIZIZ = vopInstantCloneCameraServiceImpl.LIZIZ();
            if (iTTSServiceLIZIZ != null) {
                String str = this.LLILZ;
                String str2 = this.LLILZIL;
                String str3 = this.LLILLL;
                String strLIZ = C2279708wV.LIZ();
                final VopInstantCloneCameraServiceImpl vopInstantCloneCameraServiceImpl2 = this.LLILLJJLI;
                final PlayAuditionCallback playAuditionCallback = this.LLILZLL;
                final C259800zU<AtomicBoolean> c259800zU = this.LLIZ;
                ITTSCallback iTTSCallback = new ITTSCallback() { // from class: X.05WX
                    @Override // com.ss.android.ugc.aweme.services.audio.ITTSCallback
                    public final void onConnectToServerSuc() {
                    }

                    @Override // com.ss.android.ugc.aweme.services.audio.ITTSCallback
                    public final void onStreamTTSPlayFinish() {
                        playAuditionCallback.onStop();
                    }

                    @Override // com.ss.android.ugc.aweme.services.audio.ITTSCallback
                    public final void onCancel(int i2) {
                        playAuditionCallback.onStop();
                    }

                    @Override // com.ss.android.ugc.aweme.services.audio.ITTSCallback
                    public final void onFirstAudioReceived(SAMICoreTtsResult sAMICoreTtsResult) {
                        if (c259800zU.element.get()) {
                            return;
                        }
                        playAuditionCallback.onPlay();
                        c259800zU.element.set(true);
                    }

                    @Override // com.ss.android.ugc.aweme.services.audio.ITTSCallback
                    public final void onSuccess(int i2, File file, String str4, SAMICoreServerEvent sAMICoreServerEvent) {
                        vopInstantCloneCameraServiceImpl2.LIZIZ = false;
                        playAuditionCallback.onAudioFileSuccess(i2, file);
                    }

                    @Override // com.ss.android.ugc.aweme.services.audio.ITTSCallback
                    public final void onFailure(int i2, int i3, String str4, String str5, SAMICoreServerEvent sAMICoreServerEvent) {
                        vopInstantCloneCameraServiceImpl2.LIZIZ = false;
                        playAuditionCallback.onStop();
                    }
                };
                this.LL = 1;
                if (iTTSServiceLIZIZ.fetchTTSAudioFile(str, str2, str3, strLIZ, false, true, iTTSCallback, (InterfaceC1364105Vn<? super Unit>) this) == objLJFF) {
                    C1C7U.LIZIZ("VopInstantCloneCameraServiceImpl@c927.playAudition$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("VopInstantCloneCameraServiceImpl@c927.playAudition$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
