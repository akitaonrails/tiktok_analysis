package Y;

import X.C0CHQ;
import X.C13LP;
import X.C1644050sst;
import X.InterfaceC1441305kZ;
import com.ss.android.ugc.aweme.services.audio.IAudioGlitchService;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ui.component.u;
import com.ss.android.vesdk.VEAudioCapture;
import com.ss.android.vesdk.VERecorder;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes23.dex */
public class AObjectS25S0310000_22 implements InterfaceC1441305kZ {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                break;
            case 1:
                onChanged$1(this, obj);
                break;
        }
    }

    public static final void onChanged$0(AObjectS25S0310000_22 aObjectS25S0310000_22, Object obj) {
        IAudioGlitchService iAudioGlitchService;
        u uVar = (u) aObjectS25S0310000_22.l0;
        uVar.LLJJJIL = true;
        IAudioGlitchService iAudioGlitchService2 = uVar.LLJJIJIL;
        if (iAudioGlitchService2 != null) {
            iAudioGlitchService2.startDevicesChangedListener();
        }
        IAudioGlitchService iAudioGlitchService3 = ((u) aObjectS25S0310000_22.l0).LLJJIJIL;
        if (iAudioGlitchService3 != null) {
            iAudioGlitchService3.enableRecordGlitchInShootScene((VEAudioCapture) aObjectS25S0310000_22.l1, true);
        }
        if ((aObjectS25S0310000_22.z3 || ((u) aObjectS25S0310000_22.l0).LLILZIL.LJJJJZI()) && (iAudioGlitchService = ((u) aObjectS25S0310000_22.l0).LLJJIJIL) != null) {
            iAudioGlitchService.enablePlayGlitchInShootScene((VERecorder) aObjectS25S0310000_22.l2, true);
        }
        C0CHQ.LIZ().LJIIL().updateCurrentScene("tool_recording", true);
    }

    public static final void onChanged$1(AObjectS25S0310000_22 aObjectS25S0310000_22, Object obj) {
        u uVar;
        IAudioGlitchService iAudioGlitchService;
        String str;
        C1644050sst c1644050sst = (C1644050sst) obj;
        u uVar2 = (u) aObjectS25S0310000_22.l0;
        uVar2.LLJJJIL = false;
        IAudioGlitchService iAudioGlitchService2 = uVar2.LLJJIJIL;
        if (iAudioGlitchService2 != null) {
            iAudioGlitchService2.getRecordGlitchAndReportInShootScene((VEAudioCapture) aObjectS25S0310000_22.l1);
        }
        if ((aObjectS25S0310000_22.z3 || ((u) aObjectS25S0310000_22.l0).LLILZIL.LJJJJZI()) && (iAudioGlitchService = (uVar = (u) aObjectS25S0310000_22.l0).LLJJIJIL) != null) {
            ShortVideoContext shortVideoContext = uVar.LLILZIL;
            iAudioGlitchService.getPlayGlitchAndReportInShootScene(shortVideoContext.creativeModel, (VERecorder) aObjectS25S0310000_22.l2, aObjectS25S0310000_22.z3, shortVideoContext.getCreationId());
        }
        IAudioGlitchService iAudioGlitchService3 = ((u) aObjectS25S0310000_22.l0).LLJJIJIL;
        if (iAudioGlitchService3 != null) {
            iAudioGlitchService3.enableRecordGlitchInShootScene((VEAudioCapture) aObjectS25S0310000_22.l1, false);
        }
        IAudioGlitchService iAudioGlitchService4 = ((u) aObjectS25S0310000_22.l0).LLJJIJIL;
        if (iAudioGlitchService4 != null) {
            iAudioGlitchService4.enablePlayGlitchInShootScene((VERecorder) aObjectS25S0310000_22.l2, false);
        }
        IAudioGlitchService iAudioGlitchService5 = ((u) aObjectS25S0310000_22.l0).LLJJIJIL;
        if (iAudioGlitchService5 != null) {
            iAudioGlitchService5.stopDevicesChangedListener();
        }
        C0CHQ.LIZ().LJIIL().updateCurrentScene("tool_recording", false);
        ArrayList<String> arrayList = ((u) aObjectS25S0310000_22.l0).LLILZIL.creativeModel.recordData.recordTypeList;
        if (arrayList != null && (str = (String) C13LP.LJJLIIIJL(arrayList)) != null) {
            u uVar3 = (u) aObjectS25S0310000_22.l0;
            uVar3.LLILZIL.creativeModel.commonMobModel.recordResult = uVar3.o4(str);
        }
        ((u) aObjectS25S0310000_22.l0).S5(c1644050sst);
    }

    public AObjectS25S0310000_22(u uVar, VEAudioCapture vEAudioCapture, boolean z, VERecorder vERecorder, int i) {
        this.$t = i;
        this.l0 = uVar;
        this.l1 = vEAudioCapture;
        this.z3 = z;
        this.l2 = vERecorder;
    }
}
