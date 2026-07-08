package X;

import android.app.Activity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiLiveApi;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.BaseGuestShowdownViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.utils.setting.MultiGuestGuestShowdownDestroyControllerInUnknownForAudienceSetting;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.BasePlaybookEditorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.pgc.PGCPlaybookEditorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.INoticeboardApi;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.MultiLiveAsAnchorListDialogV2;
import com.bytedance.android.live.liveinteract.multilive.model.NoticeboardUpdateParams;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS123S0101000_15;
import webcast.data.multi_guest_play.Playbook;
import webcast.data.multi_guest_play.PlaybookContent;
import webcast.data.multi_guest_play.PlaybookTagAggregation;

/* JADX INFO: renamed from: X.020L, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public class C020L extends C09AY implements Function0 {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(C020L c020l) {
        if (c020l.i1 == 5 || MultiGuestGuestShowdownDestroyControllerInUnknownForAudienceSetting.INSTANCE.isEnable()) {
            C15B9 c15b9 = ((BaseGuestShowdownViewModel) c020l.l0).LLIZ;
            if (c15b9 != null) {
                c15b9.LJI();
            }
            ((BaseGuestShowdownViewModel) c020l.l0).LLIZ = null;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(C020L c020l) {
        String str;
        MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2 = (MultiLiveAsAnchorListDialogV2) c020l.l0;
        C933910aPV c933910aPV = multiLiveAsAnchorListDialogV2.LLLLIIL;
        int i = c020l.i1;
        LifecycleOwner lifecycleOwner = multiLiveAsAnchorListDialogV2.LLJILJILJ;
        C020B c020b = new C020B(i, 3);
        AnonymousClass0207 anonymousClass0207 = AnonymousClass0207.get$arr$(20);
        c933910aPV.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("clickCloseAllGuestMedia op: ");
        sbLIZ.append(i);
        C20441214yg.LIZIZ("ComposeViewExt", C2188811AlT.LIZIZ(sbLIZ));
        c933910aPV.LLIZLLLIL.getValue().getClass();
        Long lLJIIJ = C930540aK4.LJIIJ();
        if (lLJIIJ != null) {
            long jLongValue = lLJIIJ.longValue();
            Long lLJII = C930540aK4.LJII();
            if (lLJII != null) {
                long jLongValue2 = lLJII.longValue();
                long jLJIILL = C921180a4y.LJIILL(C915980Zwa.LJIIIIZZ());
                C480460Ism.LIZ().getClass();
                ((C0J1N) ((MultiLiveApi) C480460Ism.LIZLLL(MultiLiveApi.class)).anchorOrModeratorMuteGuest(jLongValue, jLongValue2, jLJIILL, null, i, null, null).LJIILIIL(new C0UO0()).LIZJ(C11RD.LJ(lifecycleOwner))).LIZ(new C516201zk(c020b, 329), new C516201zk(anonymousClass0207, 330));
            } else {
                anonymousClass0207.invoke("anchorId is null");
            }
        } else {
            anonymousClass0207.invoke("roomId is null");
        }
        if (6 == c020l.i1) {
            str = "camera";
        } else {
            str = "microphone";
        }
        C932160aMg.LIZJ("confirm", str);
        return Unit.LIZ;
    }

    public static final Object invoke$2(C020L c020l) {
        C1389890mGx c1389890mGx = new C1389890mGx((Activity) c020l.l0);
        int i = c020l.i1;
        c1389890mGx.LJIIJ(C497740JfY.LJIIL(2131755780, i, Integer.valueOf(i)));
        c1389890mGx.LJI(-1);
        c1389890mGx.LJFF(R.raw.icon_tick_circle_fill);
        C100U.LIZ(c1389890mGx);
        return Unit.LIZ;
    }

    public static final Object invoke$3(C020L c020l) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[S3] current hour=");
        sbLIZ.append(c020l.i1);
        sbLIZ.append(" not in window=");
        sbLIZ.append((Set) c020l.l0);
        sbLIZ.append(", skip fire");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$4(C020L c020l) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getStatusBarHeight exception, resourceId=");
        sbLIZ.append(c020l.i1);
        sbLIZ.append(", msg=");
        sbLIZ.append(((Exception) c020l.l0).getMessage());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$5(C020L c020l) {
        Playbook playbook;
        PlaybookContent playbookContent;
        List<PlaybookTagAggregation> list;
        BasePlaybookEditorViewModel basePlaybookEditorViewModel = (BasePlaybookEditorViewModel) c020l.l0;
        Map<Integer, List<Integer>> map = null;
        if ((basePlaybookEditorViewModel instanceof PGCPlaybookEditorViewModel) && basePlaybookEditorViewModel != null) {
            int i = c020l.i1;
            MutableLiveData<Map<Integer, List<Integer>>> mutableLiveData = basePlaybookEditorViewModel.LLILLL.LJIIIZ;
            Map<Integer, List<Integer>> value = mutableLiveData.getValue();
            if (value != null) {
                value.remove(Integer.valueOf(i));
                map = value;
            }
            mutableLiveData.postValue(map);
            C20379114of value2 = basePlaybookEditorViewModel.LLILLL.LIZIZ.getValue();
            if (value2 != null && (playbook = value2.LIZ) != null && (playbookContent = playbook.content) != null && (list = playbookContent.tagAggregations) != null) {
                C19719612Di.LJJIIJ(list, new C020M(i, 7), true);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(C020L c020l) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("detachBTM: ");
        sbLIZ.append(c020l.i1);
        sbLIZ.append(", ");
        sbLIZ.append((LifecycleOwner) c020l.l0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$7(C020L c020l) {
        C11NJ c11nj = ((C953610avH) c020l.l0).LIZLLL;
        C485801uq c485801uq = new C485801uq((C953610avH) c020l.l0);
        int i = c020l.i1;
        AwS123S0101000_15 awS123S0101000_15 = new AwS123S0101000_15((C953610avH) c020l.l0, i, 8);
        Long l = (Long) c485801uq.invoke();
        if (l != null) {
            long jLongValue = l.longValue();
            C20441214yg.LJIIIZ("NoticeboardController", "endNoticeboard");
            C480460Ism.LIZ().getClass();
            INoticeboardApi iNoticeboardApi = (INoticeboardApi) C480460Ism.LIZLLL(INoticeboardApi.class);
            NoticeboardUpdateParams noticeboardUpdateParams = new NoticeboardUpdateParams();
            noticeboardUpdateParams.roomId = C954140aw8.LIZJ();
            noticeboardUpdateParams.channelId = C954140aw8.LIZIZ();
            noticeboardUpdateParams.noticeboardId = jLongValue;
            noticeboardUpdateParams.updateType = 2;
            noticeboardUpdateParams.mediaNodeId = "";
            noticeboardUpdateParams.imagePath = "";
            noticeboardUpdateParams.position = i;
            c11nj.LIZ(new C11QI(iNoticeboardApi.updateNoticeboard(noticeboardUpdateParams).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJIILL(new C516201zk(awS123S0101000_15, 310)).LJIIL(new C516201zk(awS123S0101000_15, 311))).LJIILL().LJIIZILJ());
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020L(int i, LifecycleOwner lifecycleOwner, int i2) {
        super(0);
        this.$t = i2;
        this.i1 = i;
        this.l0 = lifecycleOwner;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020L(int i, BaseGuestShowdownViewModel baseGuestShowdownViewModel, int i2) {
        super(0);
        this.$t = i2;
        this.i1 = i;
        this.l0 = baseGuestShowdownViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020L(int i, MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = multiLiveAsAnchorListDialogV2;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020L(int i, Exception exc, int i2) {
        super(0);
        this.$t = i2;
        this.i1 = i;
        this.l0 = exc;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020L(C953610avH c953610avH, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c953610avH;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020L(Activity activity, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = activity;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020L(BasePlaybookEditorViewModel basePlaybookEditorViewModel, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = basePlaybookEditorViewModel;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020L(Set set, int i, int i2) {
        super(0);
        this.$t = i2;
        this.i1 = i;
        this.l0 = set;
    }
}
