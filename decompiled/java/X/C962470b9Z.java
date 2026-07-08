package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.chatroom.model.interact.VirtualWaitingUser;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS250S0000000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS629S0100000_15;

/* JADX INFO: renamed from: X.0b9Z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C962470b9Z extends ConstraintLayout {
    public DataChannel LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final AwS629S0100000_15 LLILZIL;

    /* JADX WARN: Removed duplicated region for block: B:62:0x018a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0172 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List<java.lang.Object> getAllUserList() {
        /*
            Method dump skipped, instruction units count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C962470b9Z.getAllUserList():java.util.List");
    }

    private final C427760Gpy getAvatarStack() {
        return (C427760Gpy) this.LLILLJJLI.getValue();
    }

    private final ViewGroup getWaitingUserMask1() {
        return (ViewGroup) this.LLILLL.getValue();
    }

    private final ViewGroup getWaitingUserMask2() {
        return (ViewGroup) this.LLILZ.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0151 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x013b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j0() {
        /*
            Method dump skipped, instruction units count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C962470b9Z.j0():void");
    }

    public final void e0() {
        getAvatarStack().setTotalCount(C915980Zwa.LJII().LJIJJ().size());
        C500260Jjc.LJIILIIL(getWaitingUserMask1());
        C500260Jjc.LJIILIIL(getWaitingUserMask2());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C915980Zwa.LJII().LLLJIL(C954930axP.class, this.LLILZIL);
        j0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C915980Zwa.LJII().LJJLIIIJL(C954930axP.class, this.LLILZIL);
        DataChannel dataChannel = this.LL;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
    }

    public final void h0(long j) {
        long j2;
        Object objLJJJLZIJ;
        List<ImageModel> list;
        ImageModel imageModel;
        List<String> listLIZ;
        List<ImageModel> list2;
        int size;
        Pair pairLJI = C500260Jjc.LJI(C915980Zwa.LJII().LJJIJIL(), AFwS250S0000000_15.get$arr$(93));
        int size2 = C915980Zwa.LJII().LJIJJ().size();
        if (pairLJI.getFirst() != null && size2 > 0) {
            C500260Jjc.LLFFF(getAvatarStack());
            getAvatarStack().setTotalCount(Math.min(C915980Zwa.LJII().LJIJJ().size() + C915980Zwa.LJII().LJJIJIL().size(), 4));
            VirtualWaitingUser virtualWaitingUser = (VirtualWaitingUser) pairLJI.getFirst();
            if (virtualWaitingUser != null && (list2 = virtualWaitingUser.avatars) != null && (size = list2.size()) > 0) {
                j2 = j % ((long) size);
            } else {
                j2 = 0;
            }
            VirtualWaitingUser virtualWaitingUser2 = (VirtualWaitingUser) pairLJI.getFirst();
            if (virtualWaitingUser2 == null || (list = virtualWaitingUser2.avatars) == null || (imageModel = (ImageModel) C13LP.LJJJLZIJ((int) j2, list)) == null || (listLIZ = C842240X2g.LIZ(imageModel)) == null || (objLJJJLZIJ = C13LP.LJJJLZIJ(0, listLIZ)) == null) {
                objLJJJLZIJ = "";
            }
            int iIntValue = ((Number) C500260Jjc.LJI(getAllUserList(), AFwS250S0000000_15.get$arr$(92)).getSecond()).intValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateQuickCoHostByOtherAnchorCountdownTick virtual waiting user = ");
            sbLIZ.append(pairLJI);
            sbLIZ.append(", index = ");
            sbLIZ.append(iIntValue);
            C20441214yg.LIZIZ("MultiCoHostMangePanelCompressUserLayout", C2188811AlT.LIZIZ(sbLIZ));
            if (iIntValue < 4) {
                C427760Gpy.LIZ(getAvatarStack(), iIntValue, objLJJJLZIJ, "", null, null, false, null, 2040);
            }
            if (iIntValue != 2) {
                if (iIntValue == 3) {
                    C500260Jjc.LLFFF(getWaitingUserMask2());
                }
            } else {
                C500260Jjc.LLFFF(getWaitingUserMask1());
            }
            if (size2 <= 2 && C915980Zwa.LJII().LJJIJIL().size() <= 1) {
                getWaitingUserMask1().setBackgroundResource(R.drawable.dnz);
            } else {
                getWaitingUserMask1().setBackgroundResource(R.drawable.do0);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i0(long r15) {
        /*
            Method dump skipped, instruction units count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C962470b9Z.i0(long):void");
    }

    public C962470b9Z(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C962470b9Z(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLILLJJLI = C1935407i4.LIZ(new AwS559S0100000_15(this, 517));
        this.LLILLL = C1935407i4.LIZ(new AwS559S0100000_15(this, 518));
        this.LLILZ = C1935407i4.LIZ(new AwS559S0100000_15(this, 519));
        this.LLILZIL = new AwS629S0100000_15(this, 39);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.h99, this, true);
    }
}
