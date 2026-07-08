package X;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.comment.event.PinNotice;
import com.ss.android.ugc.aweme.comment.event.PinResult;
import com.ss.android.ugc.aweme.comment.model.Comment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0l4P, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1343670l4P implements InterfaceC1342370l2J {
    public static C1343680l4Q LJ;
    public static C1343680l4Q LJFF;
    public C420090Gdb LIZ;
    public TuxIconView LIZIZ;
    public C1343680l4Q LIZJ;
    public Comment LIZLLL;

    public final C1343680l4Q LJFF() {
        C1343680l4Q c1343680l4Q = this.LIZJ;
        if (c1343680l4Q != null) {
            return c1343680l4Q;
        }
        return null;
    }

    public final C420090Gdb LJI() {
        C420090Gdb c420090Gdb = this.LIZ;
        if (c420090Gdb != null) {
            return c420090Gdb;
        }
        return null;
    }

    @Override // X.InterfaceC1342370l2J
    public final Comment getComment() {
        Comment comment = this.LIZLLL;
        if (comment != null) {
            return comment;
        }
        return null;
    }

    @Override // X.InterfaceC1342370l2J
    public final MutableLiveData LIZJ() {
        if (LJFF().LIZJ || getComment() == null || getComment().getAwemeId() == null || getComment().getCid() == null) {
            return null;
        }
        return LJ(false, false);
    }

    @Override // X.InterfaceC1342370l2J
    public final void LJJJJL() {
        LJI().setDefaultLoadingText("");
        LJI().setLoading(false);
    }

    @Override // X.InterfaceC1342370l2J
    public final void LIZ(boolean z) {
        int i;
        TuxIconView tuxIconView = this.LIZIZ;
        if (tuxIconView == null) {
            tuxIconView = null;
        }
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LLLLLLZZ(tuxIconView, i);
    }

    @Override // X.InterfaceC1342370l2J
    public final MutableLiveData LIZIZ(boolean z) {
        if (!LJFF().LIZJ && getComment() != null && getComment().getAwemeId() != null && getComment().getCid() != null) {
            return LJ(true, z);
        }
        return null;
    }

    @Override // X.InterfaceC1342370l2J
    public final void LIZLLL(boolean z) {
        if (z) {
            LJI().setDefaultLoadingText(LJI().getContext().getString(2131829202));
        } else {
            LJI().setDefaultLoadingText(LJI().getContext().getString(2131829243));
        }
        LJI().setLoading(true);
    }

    public final MutableLiveData<C1342530l2Z> LJ(final boolean z, boolean z2) {
        int i;
        final MutableLiveData<C1342530l2Z> mutableLiveData = new MutableLiveData<>();
        C0TB5.LIZ.getClass();
        InterfaceC756650TmB interfaceC756650TmB = C0TB5.LIZIZ;
        String awemeId = getComment().getAwemeId();
        String cid = getComment().getCid();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        interfaceC756650TmB.LIZ(awemeId, cid, jCurrentTimeMillis, i, z2).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LIZ(new InterfaceC19474811He<PinResult>() { // from class: X.0l4O
            @Override // X.InterfaceC19474811He
            public final void onError(Throwable th) {
                C23112093u c23112093u;
                PinResult pinResult;
                PinNotice pinNotice = null;
                if ((th instanceof C0XIR) && (c23112093u = (C23112093u) th) != null && c23112093u.getErrorCode() == 3008034) {
                    C1343680l4Q c1343680l4QLJFF = this.LL.LJFF();
                    EnumC1342540l2a enumC1342540l2a = EnumC1342540l2a.LIMIT;
                    Object rawResponse = ((C0XIR) th).getRawResponse();
                    if ((rawResponse instanceof PinResult) && (pinResult = (PinResult) rawResponse) != null) {
                        pinNotice = pinResult.notice;
                    }
                    c1343680l4QLJFF.LIZ(new C1342530l2Z(enumC1342540l2a, pinNotice));
                    return;
                }
                this.LL.LJFF().LIZ(new C1342530l2Z(EnumC1342540l2a.FAIL, null));
            }

            @Override // X.InterfaceC19474811He
            public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
                C1343680l4Q c1343680l4QLJFF = this.LL.LJFF();
                MutableLiveData<C1342530l2Z> mutableLiveData2 = mutableLiveData;
                c1343680l4QLJFF.LIZ = interfaceC420801kM;
                c1343680l4QLJFF.LIZIZ = mutableLiveData2;
                c1343680l4QLJFF.LIZJ = true;
                boolean z3 = z;
                C1343680l4Q c1343680l4QLJFF2 = this.LL.LJFF();
                if (z3) {
                    if (!Intrinsics.LJFF(C1343670l4P.LJ, c1343680l4QLJFF2)) {
                        C1343680l4Q c1343680l4Q = C1343670l4P.LJ;
                        if (c1343680l4Q != null) {
                            c1343680l4Q.LIZ(new C1342530l2Z(EnumC1342540l2a.CANCEL, null));
                        }
                        C1343670l4P.LJ = c1343680l4QLJFF2;
                        return;
                    }
                    return;
                }
                if (Intrinsics.LJFF(C1343670l4P.LJFF, c1343680l4QLJFF2)) {
                    return;
                }
                C1343680l4Q c1343680l4Q2 = C1343670l4P.LJFF;
                if (c1343680l4Q2 != null) {
                    c1343680l4Q2.LIZ(new C1342530l2Z(EnumC1342540l2a.CANCEL, null));
                }
                C1343670l4P.LJFF = c1343680l4QLJFF2;
            }

            @Override // X.InterfaceC19474811He
            public final void onSuccess(PinResult pinResult) {
                PinResult pinResult2 = pinResult;
                int i2 = pinResult2.status_code;
                if (i2 == 0) {
                    this.LL.LJFF().LIZ(new C1342530l2Z(EnumC1342540l2a.SUCCESS, null));
                } else if (i2 == 3008034) {
                    this.LL.LJFF().LIZ(new C1342530l2Z(EnumC1342540l2a.LIMIT, pinResult2.notice));
                } else {
                    onError(new Exception("response status_code != 0"));
                }
            }
        });
        return mutableLiveData;
    }
}
