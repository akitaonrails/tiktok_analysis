package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.game.bottombar.herosheet.MoreAvatarListFragment;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS586S0100000_7;

/* JADX INFO: renamed from: X.0Ix9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C483170Ix9 {
    public static final LinkedList<C475860IlM> LJ = new LinkedList<>();
    public final C19EG LIZ;
    public final List<C475860IlM> LIZIZ;
    public final Function1<C475860IlM, Unit> LIZJ;
    public final TuxSheet LIZLLL;

    public C483170Ix9(C19EG c19eg, List list, AwS586S0100000_7 awS586S0100000_7, DialogInterfaceOnDismissListenerC521770KdD dialogInterfaceOnDismissListenerC521770KdD) {
        int iLJ;
        int i;
        this.LIZ = c19eg;
        this.LIZIZ = list;
        this.LIZJ = awS586S0100000_7;
        Map<String, Object> map = C1338270kvh.LIZ;
        MoreAvatarListFragment moreAvatarListFragment = new MoreAvatarListFragment();
        String strLJIJI = C497740JfY.LJIJI(2131851453);
        String strLJIJI2 = C497740JfY.LJIJI(2131851455);
        String strLJIJI3 = C497740JfY.LJIJI(2131851454);
        moreAvatarListFragment.LL = strLJIJI;
        moreAvatarListFragment.LLILLJJLI = strLJIJI2;
        moreAvatarListFragment.LLILLL = strLJIJI3;
        LinkedList<C475860IlM> linkedList = LJ;
        ArrayList arrayList = (ArrayList) list;
        if (!arrayList.isEmpty()) {
            moreAvatarListFragment.LLILZIL.clear();
            moreAvatarListFragment.LLILZIL.addAll(arrayList);
            moreAvatarListFragment.LLILZ.clear();
            moreAvatarListFragment.LLILZ.addAll(linkedList);
        }
        moreAvatarListFragment.LLIZ = new AwS551S0100000_7(this, 763);
        moreAvatarListFragment.LLILZLL = new AwS586S0100000_7(this, 506);
        int iLIZIZ = (int) C497740JfY.LIZIZ(425.0f);
        int iLIZIZ2 = (int) C497740JfY.LIZIZ(725.0f);
        C19EG c19eg2 = this.LIZ;
        int iLIZIZ3 = ((int) C497740JfY.LIZIZ(20.0f)) + ((int) C497740JfY.LIZIZ(4.0f));
        int iLIZIZ4 = ((int) C497740JfY.LIZIZ(20.0f)) + ((int) C497740JfY.LIZIZ(6.0f));
        C16F5 c16f5 = new C16F5(c19eg2, null);
        c16f5.setTextSize(1, 12.0f);
        c16f5.setGravity(49);
        c16f5.setMaxLines(2);
        c16f5.setMinLines(2);
        C786410Ut5.y6(c16f5, new ViewGroup.LayoutParams(-1, -2));
        c16f5.setText("1");
        c16f5.measure(View.MeasureSpec.makeMeasureSpec(C14KS.LJFF(), 1073741824), View.MeasureSpec.makeMeasureSpec(C14KS.LIZLLL(), Integer.MIN_VALUE));
        int iLIZIZ5 = ((int) C497740JfY.LIZIZ(62.0f)) + c16f5.getMeasuredHeight();
        int iLIZIZ6 = ((int) C497740JfY.LIZIZ(15.0f)) + iLIZIZ5;
        int iLIZIZ7 = (int) C497740JfY.LIZIZ(52.0f);
        int size = arrayList.size();
        if (size <= 0) {
            iLJ = iLIZIZ3 + iLIZIZ6 + iLIZIZ4 + iLIZIZ7;
        } else {
            iLJ = C13LZ.LJ(iLIZIZ3 + iLIZIZ6 + iLIZIZ4 + (iLIZIZ5 * (((size + 5) - 1) / 5)) + ((int) C497740JfY.LIZIZ((r0 - 1) * 10.0f)) + iLIZIZ7, iLIZIZ, iLIZIZ2);
        }
        if (C011Z.LIZ.LJIJ(c19eg)) {
            i = R.style.y0;
        } else {
            i = R.style.y3;
        }
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LIZLLL(i, false);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJIJI = moreAvatarListFragment;
        tuxSheet.LLJJIJIIJIL = true;
        c1390920mIc.LJIIIIZZ(1);
        TuxSheet tuxSheet2 = c1390920mIc.LIZ;
        tuxSheet2.LLJJL = iLJ;
        tuxSheet2.LLJLILLLLZIIL = false;
        tuxSheet2.LLJLLIL = true;
        tuxSheet2.LLJLLL = true;
        tuxSheet2.LLILLJJLI = dialogInterfaceOnDismissListenerC521770KdD;
        this.LIZLLL = tuxSheet2;
    }
}
