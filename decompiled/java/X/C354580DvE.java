package X;

import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLEVideoEffect;
import com.ss.android.ugc.aweme.api.IETTaskService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0DvE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C354580DvE extends C09AY implements Function0<Unit> {
    public final /* synthetic */ NLETrackSlot LL;
    public final /* synthetic */ NLEVideoEffect LLILLJJLI;
    public final /* synthetic */ C354470Dv3 LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ NLESegmentVideo LLIZ;
    public final /* synthetic */ InterfaceC354020DuK LLIZLLLIL;
    public final /* synthetic */ NLETrackSlot LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C354580DvE(NLETrackSlot nLETrackSlot, NLEVideoEffect nLEVideoEffect, C354470Dv3 c354470Dv3, String str, String str2, boolean z, NLESegmentVideo nLESegmentVideo, C354550DvB c354550DvB, NLETrackSlot nLETrackSlot2) {
        super(0);
        this.LL = nLETrackSlot;
        this.LLILLJJLI = nLEVideoEffect;
        this.LLILLL = c354470Dv3;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = z;
        this.LLIZ = nLESegmentVideo;
        this.LLIZLLLIL = c354550DvB;
        this.LLJ = nLETrackSlot2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.addVideoEffect(this.LLILLJJLI);
        this.LL.setExtra("from_ep_create", "true");
        C354470Dv3 c354470Dv3 = this.LLILLL;
        IETTaskService iETTaskService = (IETTaskService) ServiceManager.get().getService(IETTaskService.class);
        c354470Dv3.LLILZIL = iETTaskService != null ? iETTaskService.LIZ() : null;
        final C354470Dv3 c354470Dv32 = this.LLILLL;
        InterfaceC381510ExZ<C381480ExW, C381330ExH> interfaceC381510ExZ = c354470Dv32.LLILZIL;
        if (interfaceC381510ExZ != null) {
            final NLETrackSlot nLETrackSlot = this.LL;
            C381480ExW c381480ExW = new C381480ExW(nLETrackSlot, c354470Dv32.LLILLL, this.LLILZ, this.LLILZIL, c354470Dv32.LL, c354470Dv32.LLILLJJLI, false, false, this.LLILZLL, 192);
            final NLESegmentVideo nLESegmentVideo = this.LLIZ;
            final InterfaceC354020DuK interfaceC354020DuK = this.LLIZLLLIL;
            final NLETrackSlot nLETrackSlot2 = this.LLJ;
            interfaceC381510ExZ.LIZIZ(c381480ExW, new InterfaceC381500ExY<C381330ExH>() { // from class: X.0DvF
                public String LIZ = "";

                @Override // X.InterfaceC381500ExY
                public final void onCancel() {
                }

                @Override // X.InterfaceC381500ExY
                public final String LIZIZ() {
                    return this.LIZ;
                }

                @Override // X.InterfaceC381500ExY
                public final void LIZ(String str) {
                    this.LIZ = str;
                }

                @Override // X.InterfaceC381500ExY
                public final void LIZJ(C381350ExJ c381350ExJ) {
                    EnumC355970DxT enumC355970DxT;
                    InterfaceC354020DuK interfaceC354020DuK2 = interfaceC354020DuK;
                    EnumC355970DxT[] enumC355970DxTArrValues = EnumC355970DxT.values();
                    int length = enumC355970DxTArrValues.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            enumC355970DxT = enumC355970DxTArrValues[i];
                            if (enumC355970DxT.getCode() == c381350ExJ.LIZ) {
                                break;
                            } else {
                                i++;
                            }
                        } else {
                            enumC355970DxT = null;
                            break;
                        }
                    }
                    interfaceC354020DuK2.LIZ(new C354570DvD(false, enumC355970DxT, c381350ExJ.LIZJ));
                }

                @Override // X.InterfaceC381500ExY
                public final void LIZLLL(C381330ExH c381330ExH) {
                    NLESegmentVideo nLESegmentVideo2 = nLESegmentVideo;
                    NLETrackSlot nLETrackSlot3 = nLETrackSlot2;
                    NLETrackSlot nLETrackSlot4 = nLETrackSlot;
                    nLESegmentVideo2.setTimeClipEnd(nLESegmentVideo2.getTimeClipStart() + nLETrackSlot3.getDuration());
                    nLETrackSlot4.setEndTime(nLETrackSlot4.getStartTime() + nLETrackSlot3.getDuration());
                    NLEResourceNode resource = nLESegmentVideo2.getResource();
                    if (resource != null) {
                        resource.setDuration(nLESegmentVideo2.getTimeClipStart() + nLETrackSlot3.getDuration());
                    }
                    InterfaceC354020DuK interfaceC354020DuK2 = interfaceC354020DuK;
                    C354570DvD c354570DvD = new C354570DvD(true, null, null, 6);
                    Map<String, String> map = c354570DvD.LIZJ;
                    Map<String, String> mapLJ = c381330ExH.LIZIZ;
                    if (mapLJ == null) {
                        mapLJ = C2097608Jq.LJ();
                    }
                    map.putAll(mapLJ);
                    interfaceC354020DuK2.LIZ(c354570DvD);
                }

                @Override // X.InterfaceC381500ExY
                public final void onProgress(float f) {
                    InterfaceC354020DuK interfaceC354020DuK2 = interfaceC354020DuK;
                    C354470Dv3 c354470Dv33 = c354470Dv32;
                    interfaceC354020DuK2.onProgress((int) (c354470Dv33.LLILZ + (f * c354470Dv33.LLILZLL)));
                }
            });
        }
        return Unit.LIZ;
    }
}
