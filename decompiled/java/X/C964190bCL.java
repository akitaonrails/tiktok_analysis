package X;

import Y.AfS181S0100000_12;
import Y.AfS184S0100000_15;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bCL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C964190bCL {
    public final ViewGroup LIZ;
    public final DataChannel LIZIZ;
    public final Function0<Unit> LIZJ;
    public final Function0<Unit> LIZLLL;
    public User LJ;
    public int LJFF;
    public Long LJII;
    public ConstraintLayout LJIIIZ;
    public final List<User> LJI = new ArrayList();
    public AbstractC964230bCP LJIIIIZZ = C964240bCQ.LIZ;
    public EnumC963350bAz LJIIJ = EnumC963350bAz.COHOST_WITH_GUEST;

    public final void LIZ() {
        ViewGroup viewGroup = this.LIZ;
        if (viewGroup != null) {
            ConstraintLayout constraintLayout = this.LJIIIZ;
            if (!(constraintLayout instanceof ViewGroup) || viewGroup.indexOfChild(constraintLayout) == -1) {
                return;
            }
            C786410Ut5.LJJJLZIJ(this.LJIIIZ, this.LIZ);
        }
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [X.0bCO, androidx.constraintlayout.widget.ConstraintLayout] */
    public final void LIZJ(List<? extends User> list) {
        Long lValueOf;
        Object next;
        Long lValueOf2 = null;
        boolean z = true;
        if (list != null) {
            ((ArrayList) this.LJI).clear();
            ((ArrayList) this.LJI).addAll(list);
            if (((ArrayList) this.LJI).size() == 1) {
                Iterator it2 = ((ArrayList) this.LJI).iterator();
                if (it2.hasNext()) {
                    next = it2.next();
                } else {
                    next = null;
                }
                this.LJ = (User) next;
            }
        }
        if (((ArrayList) this.LJI).isEmpty()) {
            ViewGroup viewGroup = this.LIZ;
            if (viewGroup != null) {
                C786410Ut5.LJJJJI(viewGroup);
            }
            this.LJIIIIZZ = C964240bCQ.LIZ;
            return;
        }
        if (((ArrayList) this.LJI).size() > 1) {
            this.LJIIIIZZ = new C964200bCM(this.LJFF);
        } else if (this.LJ != null) {
            Room roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(this.LIZIZ);
            if (roomLJJLIIIIJ == null) {
                roomLJJLIIIIJ = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
            }
            IInteractService iInteractService = C1128450fTH.LIZ;
            boolean zLJJ = C1128450fTH.LJJ(this.LIZIZ);
            if (roomLJJLIIIIJ != null) {
                lValueOf = Long.valueOf(roomLJJLIIIIJ.getOwnerUserId());
            } else {
                lValueOf = null;
            }
            User user = this.LJ;
            if (user != null) {
                lValueOf2 = Long.valueOf(user.getId());
            }
            if (!Intrinsics.LJFF(lValueOf, lValueOf2) || (this.LJIIJ == EnumC963350bAz.COHOST_WITH_GUEST && !zLJJ)) {
                z = false;
            }
            User user2 = this.LJ;
            if (user2 != null) {
                this.LJIIIIZZ = new C964210bCN(user2, z);
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        ?? r1 = this.LJIIIZ;
        if (r1 != 0) {
            r1.LJLJI(this.LJIIIIZZ);
        }
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [X.0bCO, androidx.constraintlayout.widget.ConstraintLayout] */
    public final void LIZIZ(List<? extends User> list, int i, boolean z, EnumC963350bAz enumC963350bAz) {
        ConstraintLayout c972160bPC;
        ViewGroup.LayoutParams layoutParams;
        User owner;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("do onStart-- ");
        sbLIZ.append(enumC963350bAz);
        sbLIZ.append(", toUsers = ");
        sbLIZ.append(list);
        sbLIZ.append(",totalCoins = ");
        sbLIZ.append(i);
        C20441214yg.LIZIZ("GiftReceiverBanner", C2188811AlT.LIZIZ(sbLIZ));
        this.LJIIJ = enumC963350bAz;
        if (this.LIZ == null || ((ArrayList) list).isEmpty()) {
            return;
        }
        this.LJFF = i;
        if (this.LIZ.getChildCount() > 0) {
            C786410Ut5.LJJJJI(this.LIZ);
        }
        ArrayList arrayList = new ArrayList();
        if (z && enumC963350bAz == EnumC963350bAz.MULTI_GUEST) {
            Room roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(this.LIZIZ);
            if (roomLJJLIIIIJ != null && (owner = roomLJJLIIIIJ.getOwner()) != null) {
                arrayList.add(owner);
            } else {
                return;
            }
        } else {
            arrayList.clear();
            arrayList.addAll(list);
        }
        EnumC963350bAz enumC963350bAz2 = this.LJIIJ;
        ViewGroup viewGroup = this.LIZ;
        boolean z2 = false;
        Boolean boolValueOf = null;
        if (viewGroup != null && viewGroup.getContext() != null) {
            if (C963360bB0.LIZ[enumC963350bAz2.ordinal()] == 1) {
                Context context = this.LIZ.getContext();
                if (context != null) {
                    c972160bPC = new C972170bPD(context, null, 0);
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            } else {
                Context context2 = this.LIZ.getContext();
                if (context2 != null) {
                    c972160bPC = new C972160bPC(context2, null, 0);
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
        } else {
            c972160bPC = null;
        }
        this.LJIIIZ = c972160bPC;
        if (c972160bPC instanceof ViewGroup) {
            ViewGroup viewGroup2 = this.LIZ;
            if (viewGroup2 != null) {
                if (viewGroup2.indexOfChild(c972160bPC) != -1) {
                    z2 = true;
                }
                boolValueOf = Boolean.valueOf(z2);
            }
            if (C500260Jjc.LJJIFFI(boolValueOf)) {
                if (this.LIZ instanceof FrameLayout) {
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams2.gravity = 8388627;
                    layoutParams = layoutParams2;
                } else {
                    layoutParams = new ViewGroup.LayoutParams(-1, -1);
                }
                ViewGroup viewGroup3 = this.LIZ;
                if (viewGroup3 != null) {
                    viewGroup3.addView(this.LJIIIZ, layoutParams);
                }
            }
        }
        ?? r3 = this.LJIIIZ;
        if (r3 != 0) {
            r3.setSwitchTargetClick(new AwS559S0100000_15(this, 551));
            r3.setUserProfileClick(new AwS594S0100000_15(this, 573));
        }
        LIZJ(arrayList);
    }

    public C964190bCL(ViewGroup viewGroup, C11RK c11rk, C11RK c11rk2, C11RK c11rk3, C11RK c11rk4, DataChannel dataChannel, Function0 function0, Function0 function02) {
        this.LIZ = viewGroup;
        this.LIZIZ = dataChannel;
        this.LIZJ = function0;
        this.LIZLLL = function02;
        c11rk.LJJLJLI(new AfS181S0100000_12(this, 230));
        c11rk2.LJJLJLI(new AfS184S0100000_15(this, 146));
        c11rk3.LJJLJLI(new AfS181S0100000_12(this, 231));
        c11rk4.LJJLJLI(new AfS181S0100000_12(this, 232));
    }
}
