package X;

import android.text.TextUtils;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.keva.Keva;
import com.mammon.audiosdk.structures.SAMICoreServerEvent;
import com.mammon.audiosdk.structures.SAMICoreTtsResult;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.services.audio.ITTSCallback;
import com.ss.android.ugc.aweme.services.audio.ITTSService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editor.sticker.read.SpeakerCenter;
import com.ss.android.ugc.gamora.editorpro.capabilities.text.tts.ui.TTSFragment;
import java.io.File;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS406S0200000_5;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineExceptionHandler;
import njp.a;

/* JADX INFO: renamed from: X.09So, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.capabilities.text.tts.ui.TTSFragment$fetchMultiAudio$2$1", f = "TTSFragment.kt", l = {751}, m = "invokeSuspend")
public final class C2375609So extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ TTSFragment LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ ArrayList<NLETrackSlot> LLIZ;
    public final /* synthetic */ NLETrackSlot LLIZLLLIL;
    public final /* synthetic */ int LLJ;
    public final /* synthetic */ ArrayList<C386290FCp> LLJI;
    public final /* synthetic */ CoroutineExceptionHandler LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2375609So(TTSFragment tTSFragment, String str, String str2, String str3, String str4, ArrayList<NLETrackSlot> arrayList, NLETrackSlot nLETrackSlot, int i, ArrayList<C386290FCp> arrayList2, CoroutineExceptionHandler coroutineExceptionHandler, InterfaceC1364105Vn<? super C2375609So> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = tTSFragment;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        this.LLILZLL = str4;
        this.LLIZ = arrayList;
        this.LLIZLLLIL = nLETrackSlot;
        this.LLJ = i;
        this.LLJI = arrayList2;
        this.LLJIJIL = coroutineExceptionHandler;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2375609So(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        CreativeInfo creativeInfo;
        ITTSService iTTSServiceVT;
        C1C7U.LIZ("TTSFragment@b180.fetchMultiAudio$2$1");
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
            VideoPublishEditModel videoPublishEditModelZS = this.LLILLJJLI.ZS();
            if (videoPublishEditModelZS != null && (creativeInfo = videoPublishEditModelZS.getCreativeInfo()) != null) {
                final String str = this.LLILLL;
                final TTSFragment tTSFragment = this.LLILLJJLI;
                final String str2 = this.LLILZ;
                final String str3 = this.LLILZIL;
                final String str4 = this.LLILZLL;
                final ArrayList<NLETrackSlot> arrayList = this.LLIZ;
                final NLETrackSlot nLETrackSlot = this.LLIZLLLIL;
                final int i2 = this.LLJ;
                final ArrayList<C386290FCp> arrayList2 = this.LLJI;
                final CoroutineExceptionHandler coroutineExceptionHandler = this.LLJIJIL;
                if (C09TA.LIZIZ(str) == 1 && (iTTSServiceVT = tTSFragment.vT()) != null) {
                    iTTSServiceVT.initAudioSDKHandler(creativeInfo);
                }
                ITTSService iTTSServiceVT2 = tTSFragment.vT();
                if (iTTSServiceVT2 != null) {
                    boolean zLJFF = Intrinsics.LJFF(str4, "Vop");
                    ITTSCallback iTTSCallback = new ITTSCallback() { // from class: X.09Sr
                        @Override // com.ss.android.ugc.aweme.services.audio.ITTSCallback
                        public final void onCancel(int i3) {
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
                        public final void onSuccess(int i3, File file, String str5, SAMICoreServerEvent sAMICoreServerEvent) {
                            if (!file.exists()) {
                                tTSFragment.LLLLLILLIL = true;
                                return;
                            }
                            int iLIZIZ = C141Q.LIZIZ(-1, file.getAbsolutePath());
                            tTSFragment.xT(arrayList, new C386290FCp(nLETrackSlot, str3, str2, file.getAbsolutePath(), iLIZIZ), nLETrackSlot, i2, arrayList2);
                            if (i3 == 1 && !TextUtils.isEmpty(str)) {
                                tTSFragment.kT(str3, str, file, iLIZIZ);
                            } else {
                                tTSFragment.kT(str3, str2, file, iLIZIZ);
                            }
                            if (arrayList.size() > 0) {
                                tTSFragment.pT(arrayList, i2, arrayList2, coroutineExceptionHandler, str2, str, str4);
                                return;
                            }
                            tTSFragment.LLLILZLLLI = new C09TF(str2, str3, str, 120);
                            tTSFragment.AT();
                            Keva keva = SpeakerCenter.LIZ;
                            SpeakerCenter.LJIIIIZZ(str2, str);
                            TTSFragment tTSFragment2 = tTSFragment;
                            ArrayList<C386290FCp> arrayList3 = arrayList2;
                            tTSFragment2.getClass();
                            C0CNO.LIZLLL(0L, new AwS406S0200000_5(tTSFragment2, (TTSFragment) arrayList3, (ArrayList<C386290FCp>) 65));
                        }

                        @Override // com.ss.android.ugc.aweme.services.audio.ITTSCallback
                        public final void onFailure(int i3, int i4, String str5, String str6, SAMICoreServerEvent sAMICoreServerEvent) {
                            tTSFragment.LLLLLILLIL = true;
                        }
                    };
                    this.LL = 1;
                    if (iTTSServiceVT2.fetchTTSAudioFile(str2, str, str3, creativeInfo, zLJFF, false, iTTSCallback, (InterfaceC1364105Vn<? super Unit>) this) == objLJFF) {
                        C1C7U.LIZIZ("TTSFragment@b180.fetchMultiAudio$2$1");
                        return objLJFF;
                    }
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TTSFragment@b180.fetchMultiAudio$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
