package X;

import Y.AObserverS230S0100000_28;
import android.content.res.Resources;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelStoreOwner;
import com.ss.android.ugc.aweme.common.LiveEventObserver;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.follow.logic.RelationViewVM;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS166S0101000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zlw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public abstract class AbstractC1908820zlw implements InterfaceC1908750zlp, Observer<FollowStatus> {
    public final InterfaceC1908740zlo LL;
    public User LLILLJJLI;
    public LifecycleOwner LLILLL;
    public ViewModelStoreOwner LLILZ;
    public C1908870zm1 LLILZIL;
    public LiveEventObserver<FollowStatus> LLILZLL;
    public boolean LLJ;
    public boolean LLJI;
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 678));
    public final AObserverS230S0100000_28 LLIZLLLIL = new AObserverS230S0100000_28(this, 61);
    public final boolean LLJIJIL = true;

    public void LIZIZ(User user) {
    }

    public abstract void LJIIIIZZ();

    public void LJIIJJI(int i) {
    }

    public abstract void LJIIL(int i, Integer num);

    public abstract void LJIILIIL(int i, Integer num, String str);

    public abstract void LJIILJJIL();

    @Override // X.InterfaceC1908750zlp
    public void LJJIJIIJIL() {
    }

    @Override // X.InterfaceC1908750zlp
    public void LLILII(int i, AwS166S0101000_28 awS166S0101000_28) {
    }

    public final LifecycleOwner LJFF() {
        LifecycleOwner lifecycleOwner = this.LLILLL;
        if (lifecycleOwner != null) {
            return lifecycleOwner;
        }
        "lifecycleOwner in RelationViewDelegate is null".toString();
        throw new IllegalArgumentException("lifecycleOwner in RelationViewDelegate is null");
    }

    public final User LJI() {
        User user = this.LLILLJJLI;
        if (user != null) {
            return user;
        }
        "user in RelationViewDelegate is null".toString();
        throw new IllegalArgumentException("user in RelationViewDelegate is null");
    }

    public final RelationViewVM LJII() {
        return (RelationViewVM) this.LLIZ.getValue();
    }

    public AbstractC1908820zlw(InterfaceC1908740zlo interfaceC1908740zlo) {
        this.LL = interfaceC1908740zlo;
    }

    @Override // androidx.lifecycle.Observer
    /* JADX INFO: renamed from: LJIIIZ, reason: merged with bridge method [inline-methods] */
    public void onChanged(FollowStatus followStatus) {
        if (!Intrinsics.LJFF(LJI().getUid(), followStatus.getUserId())) {
            return;
        }
        C0SY7 c0sy7LIZ = C0SY5.LIZ(followStatus.getFollowStatus());
        C0SY7 c0sy7LIZ2 = C0SY5.LIZ(LJI().getFollowStatus());
        C0SY7 c0sy7 = C0SY7.FOLLOW_REQUESTED;
        if (c0sy7LIZ2 != c0sy7 && c0sy7LIZ != c0sy7) {
            C0SY7 c0sy72 = C0SY7.UNFOLLOW;
            if (c0sy7LIZ != c0sy72) {
                LJI().setFollowerCount(LJI().getFollowerCount() + 1);
            } else if (c0sy7LIZ == c0sy72) {
                LJI().setFollowerCount(LJI().getFollowerCount() - 1);
            }
        }
        LJI().setFollowStatus(followStatus.getFollowStatus());
        Integer followerStatus = followStatus.getFollowerStatus();
        if (followerStatus != null) {
            LJI().setFollowerStatus(followerStatus.intValue());
        }
        LJIILIIL(followStatus.getFollowStatus(), followStatus.getFollowerStatus(), followStatus.getUserId());
        LJIIJJI(followStatus.getFollowStatus());
        LJIIL(followStatus.getFollowStatus(), followStatus.getFollowerStatus());
        Function1<C0SY7, Unit> dataChangeListener = this.LL.getDataChangeListener();
        if (dataChangeListener != null) {
            dataChangeListener.invoke(c0sy7LIZ);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0074 A[PHI: r3
      0x0074: PHI (r3v4 X.15ms) = (r3v9 X.15ms), (r3v10 X.15ms) binds: [B:48:0x008d, B:37:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC1908750zlp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LLLLZIL(X.C1908870zm1 r5) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1908820zlw.LLLLZIL(X.0zm1):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x01ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(kotlin.jvm.functions.Function2 r16, boolean r17) {
        /*
            Method dump skipped, instruction units count: 539
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1908820zlw.LIZJ(kotlin.jvm.functions.Function2, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0054 A[PHI: r5
      0x0054: PHI (r5v6 java.lang.String) = (r5v4 java.lang.String), (r5v7 java.lang.String) binds: [B:28:0x0052, B:26:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e5 A[PHI: r2
      0x00e5: PHI (r2v4 java.lang.String) = (r2v2 java.lang.String), (r2v5 java.lang.String) binds: [B:76:0x00e3, B:74:0x00e0] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean LJIIJ(int r9, kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super X.C0XIR, kotlin.Unit> r10) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1908820zlw.LJIIJ(int, kotlin.jvm.functions.Function2):boolean");
    }

    public String LJ(int i, Integer num, String str, Map map, boolean z) {
        C1908890zm3 c1908890zm3;
        String str2;
        C1908890zm3 c1908890zm32;
        String str3;
        C1908890zm3 c1908890zm33;
        String str4;
        int i2;
        C1908890zm3 c1908890zm34;
        String str5;
        if (i == C0SY7.UNFOLLOW.getValue()) {
            int value = C0SY7.FOLLOWED.getValue();
            if (num != null && num.intValue() == value) {
                if (map == null || (c1908890zm34 = (C1908890zm3) map.get(C0SY7.UNFOLLOW_BUT_BE_FOLLOWED)) == null || (str5 = c1908890zm34.LIZ) == null) {
                    if (z) {
                        return this.LL.getCtx().getResources().getString(2131834753);
                    }
                    return this.LL.getCtx().getResources().getString(2131834735);
                }
                return str5;
            }
            Resources resources = this.LL.getCtx().getResources();
            if (C297750Bll.LIZ()) {
                i2 = 2131834786;
            } else {
                i2 = R.string.jp2;
            }
            return resources.getString(i2);
        }
        C0SY7 c0sy7 = C0SY7.FOLLOWED;
        if (i == c0sy7.getValue()) {
            if (map != null && (c1908890zm33 = (C1908890zm3) map.get(c0sy7)) != null && (str4 = c1908890zm33.LIZ) != null) {
                return str4;
            }
            if (str != null) {
                return C1336205Ku.LIZ(false).getImSayHiService().LJFF(Integer.MAX_VALUE, this.LL.getCtx(), str, true, false);
            }
            return this.LL.getCtx().getResources().getString(R.string.jqm);
        }
        C0SY7 c0sy72 = C0SY7.FOLLOW_REQUESTED;
        if (i == c0sy72.getValue()) {
            if (map != null && (c1908890zm32 = (C1908890zm3) map.get(c0sy72)) != null && (str3 = c1908890zm32.LIZ) != null) {
                return str3;
            }
            return this.LL.getCtx().getResources().getString(R.string.jqb);
        }
        C0SY7 c0sy73 = C0SY7.FOLLOW_MUTUAL;
        if (i == c0sy73.getValue()) {
            if (map != null && (c1908890zm3 = (C1908890zm3) map.get(c0sy73)) != null && (str2 = c1908890zm3.LIZ) != null) {
                return str2;
            }
            return this.LL.getCtx().getResources().getString(R.string.hz7);
        }
        return "";
    }
}
