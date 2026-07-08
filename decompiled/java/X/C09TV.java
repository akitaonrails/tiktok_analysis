package X;

import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.mammon.audiosdk.structures.SAMICoreServerEvent;
import com.mammon.audiosdk.structures.SAMICoreTtsResult;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.services.audio.ITTSCallback;
import com.ss.android.ugc.aweme.services.audio.ITTSService;
import com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectBean;
import com.ss.android.ugc.gamora.editorpro.capabilities.text.tts.logic.EditorProTTSHelper;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09TV, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.capabilities.text.tts.logic.EditorProTTSHelper$readText$3", f = "EditorProTTSHelper.kt", l = {168}, m = "invokeSuspend")
public final class C09TV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ EditorProTTSHelper LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ Function1<Boolean, Unit> LLIZ;
    public final /* synthetic */ NLETrackSlot LLIZLLLIL;
    public final /* synthetic */ ReadTextEffectBean LLJ;
    public final /* synthetic */ boolean LLJI;
    public final /* synthetic */ boolean LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C09TV(EditorProTTSHelper editorProTTSHelper, String str, String str2, String str3, boolean z, Function1<? super Boolean, Unit> function1, NLETrackSlot nLETrackSlot, ReadTextEffectBean readTextEffectBean, boolean z2, boolean z3, InterfaceC1364105Vn<? super C09TV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = editorProTTSHelper;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        this.LLILZLL = z;
        this.LLIZ = function1;
        this.LLIZLLLIL = nLETrackSlot;
        this.LLJ = readTextEffectBean;
        this.LLJI = z2;
        this.LLJIJIL = z3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09TV(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EditorProTTSHelper@9059.readText$3");
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
            ITTSService iTTSService = (ITTSService) this.LLILLJJLI.LLJI.getValue();
            if (iTTSService != null) {
                String str = this.LLILLL;
                String str2 = this.LLILZ;
                String str3 = this.LLILZIL;
                CreativeInfo creativeInfo = this.LLILLJJLI.LLILLL.getCreativeInfo();
                boolean z = this.LLILZLL;
                final EditorProTTSHelper editorProTTSHelper = this.LLILLJJLI;
                final Function1<Boolean, Unit> function1 = this.LLIZ;
                final NLETrackSlot nLETrackSlot = this.LLIZLLLIL;
                final String str4 = this.LLILZIL;
                final String str5 = this.LLILLL;
                final ReadTextEffectBean readTextEffectBean = this.LLJ;
                final boolean z2 = this.LLJI;
                final boolean z3 = this.LLJIJIL;
                ITTSCallback iTTSCallback = new ITTSCallback() { // from class: X.09TW
                    @Override // com.ss.android.ugc.aweme.services.audio.ITTSCallback
                    public final void onCancel(int i2) {
                    }

                    @Override // com.ss.android.ugc.aweme.services.audio.ITTSCallback
                    public final void onConnectToServerSuc() {
                    }

                    @Override // com.ss.android.ugc.aweme.services.audio.ITTSCallback
                    public final void onFirstAudioReceived(SAMICoreTtsResult sAMICoreTtsResult) {
                    }

                    @Override // com.ss.android.ugc.aweme.services.audio.ITTSCallback
                    public final void onStreamTTSPlayFinish() {
                    }

                    @Override // com.ss.android.ugc.aweme.services.audio.ITTSCallback
                    public final void onSuccess(int i2, File file, String str6, SAMICoreServerEvent sAMICoreServerEvent) {
                        if (!file.exists()) {
                            EditorProTTSHelper.LIZJ(editorProTTSHelper, function1);
                        }
                        int iLIZIZ = C141Q.LIZIZ(-1, file.getAbsolutePath());
                        EditorProTTSHelper editorProTTSHelper2 = editorProTTSHelper;
                        if (!editorProTTSHelper2.LLIZLLLIL) {
                            C0CNO.LIZLLL(0L, new C386270FCn(editorProTTSHelper2, nLETrackSlot, file, str4, str5, iLIZIZ, readTextEffectBean, z2, function1, z3));
                        }
                    }

                    @Override // com.ss.android.ugc.aweme.services.audio.ITTSCallback
                    public final void onFailure(int i2, int i3, String str6, String str7, SAMICoreServerEvent sAMICoreServerEvent) {
                        EditorProTTSHelper.LIZJ(editorProTTSHelper, function1);
                    }
                };
                this.LL = 1;
                if (iTTSService.fetchTTSAudioFile(str, str2, str3, creativeInfo, z, false, iTTSCallback, (InterfaceC1364105Vn<? super Unit>) this) == objLJFF) {
                    C1C7U.LIZIZ("EditorProTTSHelper@9059.readText$3");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EditorProTTSHelper@9059.readText$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
