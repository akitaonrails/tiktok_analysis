package X;

import com.mammon.audiosdk.structures.SAMICoreServerEvent;
import com.mammon.audiosdk.structures.SAMICoreTtsResult;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.services.audio.ITTSCallback;
import com.ss.android.ugc.aweme.services.audio.ITTSService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.capabilities.text.tts.ui.TTSFragment;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09Sn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.capabilities.text.tts.ui.TTSFragment$downloadAudio$2$1", f = "TTSFragment.kt", l = {1164}, m = "invokeSuspend")
public final class C2375509Sn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ TTSFragment LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ int LLIZLLLIL;
    public final /* synthetic */ C013C LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2375509Sn(TTSFragment tTSFragment, String str, String str2, String str3, boolean z, int i, int i2, C013C c013c, InterfaceC1364105Vn<? super C2375509Sn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = tTSFragment;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        this.LLILZLL = z;
        this.LLIZ = i;
        this.LLIZLLLIL = i2;
        this.LLJ = c013c;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2375509Sn(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        CreativeInfo creativeInfo;
        ITTSService iTTSServiceVT;
        C1C7U.LIZ("TTSFragment@b180.downloadAudio$2$1");
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
            final C238400w2 c238400w2 = new C238400w2();
            c238400w2.element = System.currentTimeMillis();
            final long jCurrentTimeMillis = System.currentTimeMillis();
            final C238400w2 c238400w22 = new C238400w2();
            c238400w22.element = System.currentTimeMillis();
            VideoPublishEditModel videoPublishEditModelZS = this.LLILLJJLI.ZS();
            if (videoPublishEditModelZS != null && (creativeInfo = videoPublishEditModelZS.getCreativeInfo()) != null) {
                final String str = this.LLILLL;
                final TTSFragment tTSFragment = this.LLILLJJLI;
                final String str2 = this.LLILZ;
                final String str3 = this.LLILZIL;
                boolean z = this.LLILZLL;
                final int i2 = this.LLIZ;
                final int i3 = this.LLIZLLLIL;
                final C013C c013c = this.LLJ;
                if (C09TA.LIZIZ(str) == 1 && (iTTSServiceVT = tTSFragment.vT()) != null) {
                    iTTSServiceVT.initAudioSDKHandler(creativeInfo);
                }
                ITTSService iTTSServiceVT2 = tTSFragment.vT();
                if (iTTSServiceVT2 != null) {
                    ITTSCallback iTTSCallback = new ITTSCallback() { // from class: X.09St
                        @Override // com.ss.android.ugc.aweme.services.audio.ITTSCallback
                        public final void onStreamTTSPlayFinish() {
                        }

                        @Override // com.ss.android.ugc.aweme.services.audio.ITTSCallback
                        public final void onConnectToServerSuc() {
                            c238400w22.element = System.currentTimeMillis();
                        }

                        @Override // com.ss.android.ugc.aweme.services.audio.ITTSCallback
                        public final void onCancel(int i4) {
                            C09TL c09tl;
                            TTSFragment tTSFragment2 = tTSFragment;
                            String str4 = str2;
                            String str5 = str3;
                            int i5 = i2;
                            C09TF c09tfLIZ = tTSFragment2.uT().LIZ(str4, str5);
                            if (c09tfLIZ != null) {
                                c09tl = c09tfLIZ.LJI;
                            } else {
                                c09tl = null;
                            }
                            if (c09tl == C09TL.IDLE) {
                                C23250099c.LIZLLL(tTSFragment2.LLLLLLIL, null, null, new C2375109Sj(i5, tTSFragment2, null), 3);
                            }
                            C2376309Sv c2376309Sv = C2376309Sv.LIZ;
                            String str6 = str2;
                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                            long j = jCurrentTimeMillis;
                            long j2 = c238400w2.element - j;
                            long j3 = c238400w22.element - j;
                            int length = str3.length();
                            c2376309Sv.getClass();
                            C2376309Sv.LIZIZ(i4, str6, 0, jCurrentTimeMillis2 - j, j2, j3, 2, length, 0, 0, null, -5);
                        }

                        @Override // com.ss.android.ugc.aweme.services.audio.ITTSCallback
                        public final void onFirstAudioReceived(SAMICoreTtsResult sAMICoreTtsResult) {
                            C013C c013c2 = c013c;
                            if (!c013c2.element) {
                                c013c2.element = true;
                                c238400w2.element = System.currentTimeMillis();
                            }
                        }

                        @Override // com.ss.android.ugc.aweme.services.audio.ITTSCallback
                        public final void onSuccess(int i4, File file, String str4, SAMICoreServerEvent sAMICoreServerEvent) {
                            C19416910xr c19416910xr = tTSFragment.LLLLILI;
                            if (c19416910xr != null) {
                                Iterator it2 = ((ArrayList) c19416910xr.LL).iterator();
                                int i5 = 0;
                                while (true) {
                                    if (it2.hasNext()) {
                                        Object next = it2.next();
                                        int i6 = i5 + 1;
                                        if (i5 >= 0) {
                                            C2376409Sw c2376409Sw = (C2376409Sw) ((Pair) next).getSecond();
                                            if (c2376409Sw != null && c2376409Sw.LIZ == 2) {
                                                break;
                                            } else {
                                                i5 = i6;
                                            }
                                        } else {
                                            C1697810uHb.LJIJI();
                                            throw null;
                                        }
                                    } else {
                                        i5 = 0;
                                        break;
                                    }
                                }
                                if (i5 == i2) {
                                    TTSFragment tTSFragment2 = tTSFragment;
                                    String str5 = str3;
                                    String str6 = str2;
                                    String str7 = str;
                                    C23250099c.LIZLLL(tTSFragment2.LLLLLLIL, null, null, new C2375009Si(file, tTSFragment2, i2, i3, str6, str7, i4, str5, null), 3);
                                    int iLIZIZ = C141Q.LIZIZ(-1, file.getAbsolutePath());
                                    C2376309Sv c2376309Sv = C2376309Sv.LIZ;
                                    String str8 = str2;
                                    String str9 = str3;
                                    long j = c238400w2.element;
                                    long j2 = jCurrentTimeMillis;
                                    long j3 = c238400w22.element;
                                    c2376309Sv.getClass();
                                    C2376309Sv.LIZ(i4, 1, str8, str4, str9, iLIZIZ, j, j2, j3, sAMICoreServerEvent);
                                }
                            }
                        }

                        @Override // com.ss.android.ugc.aweme.services.audio.ITTSCallback
                        public final void onFailure(int i4, int i5, String str4, String str5, SAMICoreServerEvent sAMICoreServerEvent) {
                            String str6;
                            TTSFragment tTSFragment2 = tTSFragment;
                            String str7 = str3;
                            String str8 = str2;
                            int i6 = i2;
                            int i7 = i3;
                            C054G c054g = tTSFragment2.LLLLLLIL;
                            C1DFH c1dfh = C0PEM.LIZ;
                            Integer numValueOf = null;
                            C23250099c.LIZLLL(c054g, C2107308Nj.LIZ, null, new C2376509Sx(tTSFragment2, i6, i7, str4, str8, str7, null), 2);
                            C2376309Sv c2376309Sv = C2376309Sv.LIZ;
                            String str9 = str2;
                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                            long j = jCurrentTimeMillis;
                            long j2 = jCurrentTimeMillis2 - j;
                            long j3 = c238400w2.element - j;
                            long j4 = c238400w22.element - j;
                            int length = str3.length();
                            if (sAMICoreServerEvent != null) {
                                str6 = sAMICoreServerEvent.taskId;
                                numValueOf = Integer.valueOf(sAMICoreServerEvent.statusCode);
                            } else {
                                str6 = null;
                            }
                            c2376309Sv.getClass();
                            C2376309Sv.LIZIZ(i4, str9, 1, j2, j3, j4, 2, length, 0, 0, str6, numValueOf);
                        }
                    };
                    this.LL = 1;
                    if (iTTSServiceVT2.fetchTTSAudioFile(str2, str, str3, creativeInfo, z, true, iTTSCallback, (InterfaceC1364105Vn<? super Unit>) this) == objLJFF) {
                        C1C7U.LIZIZ("TTSFragment@b180.downloadAudio$2$1");
                        return objLJFF;
                    }
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TTSFragment@b180.downloadAudio$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
