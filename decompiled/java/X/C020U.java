package X;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.BaseLiveShowViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.BaseLiveShowWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.LiveShowOpenMicDialogShowingData;
import com.bytedance.android.livesdk.userservice.UserService;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import webcast.data.multi_guest_play.ShowContent;
import webcast.data.multi_guest_play.ShowListUser;

/* JADX INFO: renamed from: X.020U, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public class C020U extends C09AY implements Function0 {
    public final int $t;
    public long j1;
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

    public static final Object invoke$0(C020U c020u) {
        ShowListUser showListUser;
        String str;
        Integer numValueOf;
        MultiGuestDataHolder multiGuestDataHolderLIZJ;
        T t;
        MutableLiveData<C303501Fp> mutableLiveData;
        C303501Fp value;
        ShowListUser showListUser2;
        MutableLiveData<C01H9> mutableLiveData2;
        C01H9 value2;
        List<ShowListUser> list;
        T t2 = ((BaseLiveShowWidget) c020u.l0).LLILLJJLI;
        if (t2 != 0 && (mutableLiveData2 = t2.LLILLJJLI) != null && (value2 = mutableLiveData2.getValue()) != null && (list = value2.LIZIZ) != null) {
            Iterator<ShowListUser> it2 = list.iterator();
            if (it2.hasNext()) {
                ShowListUser next = it2.next();
                if (it2.hasNext()) {
                    int i = next.order;
                    do {
                        ShowListUser next2 = it2.next();
                        int i2 = next2.order;
                        if (i > i2) {
                            next = next2;
                            i = i2;
                        }
                    } while (it2.hasNext());
                }
                showListUser = next;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            showListUser = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("nextPerformUser : ");
        if (showListUser != null) {
            str = showListUser.nickname;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        sbLIZ.append(", ");
        if (showListUser != null) {
            numValueOf = Integer.valueOf(showListUser.order);
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C20441214yg.LIZIZ("BaseLiveShowWidget", C2188811AlT.LIZIZ(sbLIZ));
        if (showListUser == null) {
            return null;
        }
        BaseLiveShowWidget baseLiveShowWidget = (BaseLiveShowWidget) c020u.l0;
        long j = c020u.j1;
        if (showListUser.userId == UserService.getInstance().user().getCurrentUserId() && (multiGuestDataHolderLIZJ = C916490ZxP.LIZJ()) != null && !multiGuestDataHolderLIZJ.LJIIIZ && ((t = baseLiveShowWidget.LLILLJJLI) == 0 || (mutableLiveData = t.LLILLL) == null || (value = mutableLiveData.getValue()) == null || (showListUser2 = value.LIZIZ) == null || showListUser.userId != showListUser2.userId)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("MultiGuestLiveShowOpenMicDialogEvent , remainTime: ");
            sbLIZ2.append(j);
            C20441214yg.LIZIZ("BaseLiveShowWidget", C2188811AlT.LIZIZ(sbLIZ2));
            LiveDialog liveDialog = baseLiveShowWidget.LLJILJILJ;
            if (liveDialog == null || !liveDialog.isShowing()) {
                baseLiveShowWidget.dataChannel.zW(LiveShowOpenMicDialogShowingData.class, Boolean.FALSE);
                C782110Um9 c782110Um9 = new C782110Um9(baseLiveShowWidget.context);
                c782110Um9.LIZJ = C497740JfY.LJIJI(2131843455);
                c782110Um9.LJIIIZ(C497740JfY.LJIJI(2131843454));
                c782110Um9.LJIILJJIL(C497740JfY.LJIJI(2131843457), new C515201za(baseLiveShowWidget, 8));
                c782110Um9.LJIIJJI(C497740JfY.LJIJI(2131841087), new C515201za(baseLiveShowWidget, 9));
                c782110Um9.LJIJ = new DialogInterfaceOnDismissListenerC512701zB(baseLiveShowWidget, 7);
                c782110Um9.LJIILL = false;
                LiveDialog liveDialogLIZ = c782110Um9.LIZ();
                baseLiveShowWidget.LLJILJILJ = liveDialogLIZ;
                C926630aDl.LIZ(liveDialogLIZ, 12, true, true, false, 16);
                LiveDialog liveDialog2 = baseLiveShowWidget.LLJILJILJ;
                if (liveDialog2 != null) {
                    C500260Jjc.LJJLIIIJLLLLLLLZ(liveDialog2);
                }
                C306901Gx.LJIIZILJ("SHOW", baseLiveShowWidget.y1());
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(C020U c020u) {
        C923330a8R c923330a8R = C923330a8R.LIZ;
        C923330a8R.LJIIL(new C020U((C01GG) c020u.l0, c020u.j1, 3));
        return Unit.LIZ;
    }

    public static final Object invoke$2(C020U c020u) {
        C923330a8R c923330a8R = C923330a8R.LIZ;
        C923330a8R.LJIIL(new C020U((C01GG) c020u.l0, c020u.j1, 4));
        return Unit.LIZ;
    }

    public static final Object invoke$3(C020U c020u) {
        ShowContent content;
        C01GG c01gg = (C01GG) c020u.l0;
        InterfaceC302601Fg interfaceC302601FgLIZ = C01FQ.LIZ();
        if (interfaceC302601FgLIZ != null) {
            content = interfaceC302601FgLIZ.getContent();
        } else {
            content = null;
        }
        long j = c020u.j1;
        c01gg.getClass();
        String strLJIIIZ = C01GG.LJIIIZ(content, j);
        if (strLJIIIZ != null) {
            C766270U4b.LJII(2131853848, strLJIIIZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(C020U c020u) {
        ShowContent content;
        C01GG c01gg = (C01GG) c020u.l0;
        InterfaceC302601Fg interfaceC302601FgLIZ = C01FQ.LIZ();
        if (interfaceC302601FgLIZ != null) {
            content = interfaceC302601FgLIZ.getContent();
        } else {
            content = null;
        }
        long j = c020u.j1;
        c01gg.getClass();
        String strLJIIIZ = C01GG.LJIIIZ(content, j);
        if (strLJIIIZ != null) {
            C766270U4b.LJII(2131853844, strLJIIIZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(C020U c020u) {
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c020u.l0;
        Long lValueOf = Long.valueOf(System.currentTimeMillis() - c020u.j1);
        C189200o6.m2constructorimpl(lValueOf);
        interfaceC1364105Vn.resumeWith(lValueOf);
        return Unit.LIZ;
    }

    public static final Object invoke$6(C020U c020u) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("persist disk fail ");
        sbLIZ.append(c020u.j1);
        sbLIZ.append(": ");
        sbLIZ.append(((Throwable) c020u.l0).getMessage());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$7(C020U c020u) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("read disk fail ");
        sbLIZ.append(c020u.j1);
        sbLIZ.append(": ");
        sbLIZ.append(((Throwable) c020u.l0).getMessage());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020U(long j, Throwable th, int i) {
        super(0);
        this.$t = i;
        this.j1 = j;
        this.l0 = th;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020U(C01GG c01gg, long j, int i) {
        super(0);
        this.$t = i;
        this.l0 = c01gg;
        this.j1 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020U(C23260099m c23260099m, long j, int i) {
        super(0);
        this.$t = i;
        this.l0 = c23260099m;
        this.j1 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0000: IPUT (r6 I:int), (r2 I:X.020U) (LINE:50528256) X.020U.$t int, block:B:2:0x0000 */
    public C020U(BaseLiveShowWidget baseLiveShowWidget, BaseLiveShowWidget<BaseLiveShowViewModel> baseLiveShowWidget2, long j) {
        int i;
        super(0);
        this.$t = i;
        this.l0 = baseLiveShowWidget;
        this.j1 = baseLiveShowWidget2;
    }
}
