package X;

import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.VideoTagContainer;
import com.ss.android.ugc.feed.platform.cell.trigger.AbsComponentTrigger;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RW2, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RW2 implements InterfaceC697120RWc {
    public final VideoItemParams LIZ;
    public final String LIZIZ;
    public final /* synthetic */ VideoTagContainer LIZJ;

    /* JADX WARN: Type inference failed for: r12v0, types: [X.0RWQ] */
    @Override // X.InterfaceC697120RWc
    public final Map<String, C0RWU> getConfig() {
        final VideoTagContainer videoTagContainer = this.LIZJ;
        videoTagContainer.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (final String str : C1697810uHb.LJIIJJI("low_tag", "high_tag")) {
            EnumC697700RYi enumC697700RYi = Intrinsics.LJFF(str, "low_tag") ? EnumC697700RYi.VIDEO_TAG_LOW : Intrinsics.LJFF(str, "high_tag") ? EnumC697700RYi.VIDEO_TAG_HIGH : EnumC697700RYi.VIDEO_TAG;
            int i = VideoTagContainer.LLLJL;
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
            C705800RmM c705800RmM = new C705800RmM(videoTagContainer.LJJIJL().getContext());
            c705800RmM.setId(i);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c705800RmM);
            c705800RmM.setLayoutParams(marginLayoutParams);
            linkedHashMap.put(str, new C0RWU(str, enumC697700RYi, c705800RmM, new C0RY9() { // from class: X.0RWQ
                @Override // X.C0RY9
                public final Set<String> LIZJ() {
                    VideoTagContainer videoTagContainer2 = videoTagContainer;
                    String str2 = (String) videoTagContainer2.LLLII.getValue();
                    C724270Sb3 c724270Sb3 = videoTagContainer2.LLJI;
                    return C0RZ5.LJFF(str2, AwemeExtKt.getGenreType(((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme()), videoTagContainer2.up(), AnonymousClass0207.get$arr$(4)).get(str);
                }

                @Override // X.C0RY9
                public final Set<String> LIZIZ() {
                    return C08CX.INSTANCE;
                }

                @Override // X.C0RY9
                public final LifecycleOwner getLifecycleOwner() {
                    return videoTagContainer;
                }

                @Override // X.C0RY9
                public final void LIZ(PriorityProtocol priorityProtocol) {
                    if (videoTagContainer.Fp()) {
                        for (AbsComponentTrigger absComponentTrigger : videoTagContainer.LLJLILLLLZIIL) {
                            absComponentTrigger.LJJ(absComponentTrigger.LLILLJJLI);
                        }
                        ((VideoItemParams) C631370Opb.LIZ(videoTagContainer)).getAweme().getAid();
                        new C0RWS(priorityProtocol);
                        C0T6L.LIZLLL();
                    } else {
                        ((VideoItemParams) C631370Opb.LIZ(videoTagContainer)).getAweme().getAid();
                        new AwS555S0100000_11(priorityProtocol, 15);
                        C0T6L.LIZLLL();
                    }
                    C697210RWl c697210RWlBp = videoTagContainer.Bp();
                    CopyOnWriteArrayList<PriorityProtocol> value = c697210RWlBp.LLJIJIL.getValue();
                    if (value != null) {
                        value.add(priorityProtocol);
                    }
                    MutableLiveData<CopyOnWriteArrayList<PriorityProtocol>> mutableLiveData = c697210RWlBp.LLJIJIL;
                    C0RYF.LIZIZ(mutableLiveData, mutableLiveData.getValue());
                }
            }, (C748402w6.LIZ() && Intrinsics.LJFF(str, "high_tag")) ? videoTagContainer.yp() : null));
        }
        return linkedHashMap;
    }

    @Override // X.InterfaceC697120RWc
    public final String LIZIZ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC697120RWc
    public final VideoItemParams LIZJ() {
        return this.LIZ;
    }

    public C0RW2(VideoTagContainer videoTagContainer) {
        String str;
        this.LIZJ = videoTagContainer;
        this.LIZ = (VideoItemParams) C631370Opb.LIZ(videoTagContainer);
        videoTagContainer.Fp();
        C0RJN c0rjnLIZIZ = videoTagContainer.jm().LIZIZ();
        this.LIZIZ = (c0rjnLIZIZ == null || (str = c0rjnLIZIZ.LIZ) == null) ? "" : str;
    }

    @Override // X.InterfaceC697120RWc
    public final void LIZ(List<? extends PriorityProtocol> list) {
        String aid;
        Aweme aweme;
        String strLIZIZ = "";
        for (PriorityProtocol priorityProtocol : list) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLIZIZ);
            sbLIZ.append(", ");
            sbLIZ.append(priorityProtocol.zg());
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        ((VideoItemParams) C631370Opb.LIZ(this.LIZJ)).getAweme().getAid();
        new C0RW9(strLIZIZ);
        C0T6L.LIZLLL();
        VideoTagContainer videoTagContainer = this.LIZJ;
        AssemViewModel assemViewModel = (AssemViewModel) videoTagContainer.LLLFFI.getValue(videoTagContainer, VideoTagContainer.LLLJIL[2]);
        VideoItemParams videoItemParams = (VideoItemParams) C631370Opb.LIZ(this.LIZJ);
        if (videoItemParams != null && (aweme = videoItemParams.getAweme()) != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        assemViewModel.getClass();
        boolean z = false;
        if (aid != null && aid.length() != 0) {
            Iterator<? extends PriorityProtocol> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                PriorityProtocol next = it2.next();
                C697770RYp.LIZ.getClass();
                if (C697770RYp.LIZJ.contains(next.zg())) {
                    z = true;
                    break;
                }
            }
            if (aid != null) {
                assemViewModel.setStateImmediate(new C0RWV(aid, z));
            }
        }
        if (!list.isEmpty()) {
            String str = this.LIZJ.nJ2().eventType;
            Aweme aweme2 = ((VideoItemParams) C631370Opb.LIZ(this.LIZJ)).getAweme();
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<? extends PriorityProtocol> it3 = list.iterator();
            while (it3.hasNext()) {
                arrayList.add(it3.next().zg());
            }
            C0RZW.LIZIZ(str, aweme2, arrayList);
        }
    }
}
