package X;

import androidx.lifecycle.Lifecycle;
import com.ss.android.ugc.gamora.editorpro.capabilities.audio.beats.logic.BeatInfo;
import com.ss.android.ugc.gamora.editorpro.capabilities.audio.beats.ui.AudioBeatsPanelFragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0ECn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C360790ECn extends C2217421BqW implements InterfaceC1631620sYq<Boolean, Boolean, List<? extends BeatInfo>, Unit> {
    public C360790ECn(AudioBeatsPanelFragment audioBeatsPanelFragment) {
        super(3, audioBeatsPanelFragment, AudioBeatsPanelFragment.class, "onFinish", "onFinish(ZZLjava/util/List;)V", 0);
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(Boolean bool, Boolean bool2, List<? extends BeatInfo> list) {
        String string;
        int i;
        boolean zBooleanValue = bool.booleanValue();
        boolean zBooleanValue2 = bool2.booleanValue();
        List<? extends BeatInfo> list2 = list;
        AudioBeatsPanelFragment audioBeatsPanelFragment = (AudioBeatsPanelFragment) this.receiver;
        if (audioBeatsPanelFragment.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
            audioBeatsPanelFragment.LLLLIIIILLL = false;
            audioBeatsPanelFragment.LJIIL();
            C0E5P c0e5p = C0E5P.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("generateAutoBeats finish isSuccess:");
            sbLIZ.append(zBooleanValue);
            C356530DyN.LIZ(c0e5p, C2188811AlT.LIZIZ(sbLIZ));
            if (zBooleanValue) {
                audioBeatsPanelFragment.sT().setChecked(true);
                ArrayList arrayList = new ArrayList();
                for (BeatInfo beatInfo : list2) {
                    int i2 = beatInfo.timestampInMS;
                    if (i2 > 400 && (i2 < (i = audioBeatsPanelFragment.LLLJ) || i2 > i + 400)) {
                        arrayList.add(beatInfo);
                    }
                }
                audioBeatsPanelFragment.LLLL = new ArrayList(arrayList);
                audioBeatsPanelFragment.mT().LJFF(audioBeatsPanelFragment.LLLL, new AwS584S0100000_5(audioBeatsPanelFragment, 1193));
            } else {
                if (!zBooleanValue2) {
                    C1389890mGx c1389890mGx = new C1389890mGx(audioBeatsPanelFragment.requireActivity());
                    C19EG activity = audioBeatsPanelFragment.getActivity();
                    if (activity == null || (string = activity.getString(2131848651)) == null) {
                        string = "";
                    }
                    c1389890mGx.LJIIJ(string);
                    c1389890mGx.LJIIJJI();
                }
                audioBeatsPanelFragment.sT().setChecked(false);
            }
        }
        return Unit.LIZ;
    }
}
