package Y;

import X.C0DZJ;
import X.C0LU9;
import X.C15438062q;
import X.C2188811AlT;
import X.C2252321DDq;
import X.InterfaceC1364105Vn;
import X.InterfaceC327200CsA;
import X.InterfaceC346701Wf;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.AwemeStatusViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.prop.draft.EffectDraftDetailViewModel;
import com.ss.android.ugc.aweme.social.thought.api.model.ThoughtAggregatedModel;
import com.ss.android.ugc.aweme.social.thought.api.model.ThoughtInfo;
import com.ss.android.ugc.aweme.social.thought.api.model.ThoughtInteractionInfo;
import com.ss.android.ugc.aweme.social.thought.api.model.ThoughtLikeInfo;
import com.ss.android.ugc.aweme.social.thought.ui.aggregated.SocialThoughtAggregatedVM;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS89S1200000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public class AgS97S1100000_4 implements InterfaceC346701Wf {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // X.InterfaceC346701Wf
    public final Object emit(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        switch (this.$t) {
            case 0:
                return emit$0(this, obj, interfaceC1364105Vn);
            case 1:
                return emit$1(this, obj, interfaceC1364105Vn);
            case 2:
                return emit$2(this, obj, interfaceC1364105Vn);
            case 3:
                return emit$3(this, obj, interfaceC1364105Vn);
            default:
                return null;
        }
    }

    public AgS97S1100000_4(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }

    public static final Object emit$0(AgS97S1100000_4 agS97S1100000_4, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        Object value;
        C0DZJ c0dzjLIZ;
        String uid;
        String str;
        Integer num;
        ThoughtLikeInfo thoughtLikeInfo;
        ThoughtInteractionInfo thoughtInteractionInfo;
        ThoughtLikeInfo thoughtLikeInfo2;
        ThoughtInfo thoughtInfo = (ThoughtInfo) obj;
        if (thoughtInfo != null) {
            SocialThoughtAggregatedVM socialThoughtAggregatedVM = (SocialThoughtAggregatedVM) agS97S1100000_4.l1;
            String str2 = agS97S1100000_4.s0;
            C2252321DDq c2252321DDq = socialThoughtAggregatedVM.LL;
            do {
                value = c2252321DDq.getValue();
                c0dzjLIZ = (C0DZJ) value;
                List<ThoughtAggregatedModel> list = c0dzjLIZ.LIZ;
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                boolean z = false;
                for (ThoughtAggregatedModel thoughtAggregatedModelCopy : list) {
                    User user = thoughtAggregatedModelCopy.userInfo;
                    Integer num2 = null;
                    if (user != null) {
                        uid = user.getUid();
                    } else {
                        uid = null;
                    }
                    if (Intrinsics.LJFF(uid, str2)) {
                        ThoughtInfo thoughtInfo2 = thoughtAggregatedModelCopy.thoughtInfo;
                        if (thoughtInfo2 != null) {
                            str = thoughtInfo2.thoughtId;
                        } else {
                            str = null;
                        }
                        if (Intrinsics.LJFF(str, thoughtInfo.thoughtId)) {
                            ThoughtInfo thoughtInfo3 = thoughtAggregatedModelCopy.thoughtInfo;
                            if (thoughtInfo3 != null && (thoughtInteractionInfo = thoughtInfo3.viewerInteraction) != null && (thoughtLikeInfo2 = thoughtInteractionInfo.likeInfo) != null) {
                                num = thoughtLikeInfo2.type;
                            } else {
                                num = null;
                            }
                            ThoughtInteractionInfo thoughtInteractionInfo2 = thoughtInfo.viewerInteraction;
                            if (thoughtInteractionInfo2 != null && (thoughtLikeInfo = thoughtInteractionInfo2.likeInfo) != null) {
                                num2 = thoughtLikeInfo.type;
                            }
                            if (!Intrinsics.LJFF(num, num2)) {
                                thoughtAggregatedModelCopy = thoughtAggregatedModelCopy.copy(thoughtAggregatedModelCopy.userInfo, thoughtInfo);
                                z = true;
                            }
                        }
                    }
                    arrayList.add(thoughtAggregatedModelCopy);
                }
                if (z) {
                    c0dzjLIZ = C0DZJ.LIZ(c0dzjLIZ, arrayList, false, false, false, 14);
                }
            } while (!c2252321DDq.compareAndSet(value, c0dzjLIZ));
        }
        return Unit.LIZ;
    }

    public static final Object emit$1(AgS97S1100000_4 agS97S1100000_4, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        C0LU9 c0lu9 = (C0LU9) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("observeTaskStatusIfNeed, workflowTaskId: ");
        sbLIZ.append(agS97S1100000_4.s0);
        sbLIZ.append(", state: ");
        sbLIZ.append(c0lu9);
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("EffectDraftDetailViewModel", C2188811AlT.LIZIZ(sbLIZ));
        EffectDraftDetailViewModel effectDraftDetailViewModel = (EffectDraftDetailViewModel) agS97S1100000_4.l1;
        String str = agS97S1100000_4.s0;
        effectDraftDetailViewModel.getClass();
        effectDraftDetailViewModel.setState(new AwS89S1200000_4(str, effectDraftDetailViewModel, c0lu9, 6));
        return Unit.LIZ;
    }

    public static final Object emit$2(AgS97S1100000_4 agS97S1100000_4, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        ((AwemeStatusViewModel) agS97S1100000_4.l1).yQ2((InterfaceC327200CsA) obj, agS97S1100000_4.s0);
        return Unit.LIZ;
    }

    public static final Object emit$3(AgS97S1100000_4 agS97S1100000_4, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        ((AwemeStatusViewModel) agS97S1100000_4.l1).yQ2((InterfaceC327200CsA) obj, agS97S1100000_4.s0);
        return Unit.LIZ;
    }
}
