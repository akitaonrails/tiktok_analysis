package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.user.User;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import webcast.api.room.GetRoomProfileCardResponse;

/* JADX INFO: renamed from: X.0JcP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC495790JcP<T> {
    public final C495980Jci LL;
    public final Pair<Boolean, List<EnumC496240Jd8>> LLILLJJLI = new Pair<>(Boolean.FALSE, C13BV.INSTANCE);
    public View LLILLL;
    public ViewGroup LLILZ;

    public abstract EnumC495780JcO LIZLLL();

    public abstract int LJ();

    public boolean LJFF() {
        return true;
    }

    public boolean LJII() {
        return false;
    }

    public abstract boolean LJIIIZ(User user, T t);

    public abstract void LJIIJ();

    public Map LJIIJJI(Object obj) {
        return null;
    }

    public void LJIIL(User user, User user2, T t, T t2) {
    }

    public T LJIILIIL(GetRoomProfileCardResponse.ResponseData responseData) {
        return null;
    }

    public Object LJIILJJIL(GetRoomProfileCardResponse.ResponseData responseData, InterfaceC1364105Vn<? super T> interfaceC1364105Vn) {
        return null;
    }

    public Object LJIILL(GetRoomProfileCardResponse.ResponseData responseData, InterfaceC1364105Vn<? super T> interfaceC1364105Vn) {
        return null;
    }

    public Pair<Boolean, List<EnumC496240Jd8>> LJI() {
        return this.LLILLJJLI;
    }

    public AbstractC495790JcP(C495980Jci c495980Jci) {
        this.LL = c495980Jci;
    }

    public final boolean LJIIIIZZ(User user) {
        User.EnigmaInfo enigmaInfo = user.enigmaInfo;
        if ((enigmaInfo != null && enigmaInfo.isEnigmaMaskOn) || this.LL.LJIIIIZZ.isEnigma()) {
            return true;
        }
        return false;
    }

    public final void LJIILLIIL(int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        View view = this.LLILLL;
        ViewGroup.LayoutParams layoutParams = null;
        if (view != null) {
            layoutParams = view.getLayoutParams();
        }
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.leftMargin = i;
            marginLayoutParams.topMargin = i2;
            marginLayoutParams.rightMargin = i3;
            marginLayoutParams.bottomMargin = 0;
            View view2 = this.LLILLL;
            if (view2 != null) {
                C786410Ut5.W5(view2, marginLayoutParams);
            }
        }
    }
}
