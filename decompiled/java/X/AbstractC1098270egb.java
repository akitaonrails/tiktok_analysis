package X;

import android.content.Context;
import android.view.View;
import com.bytedance.android.livesdk.chatroom.viewmodule.NewTopRightBannerWidget;
import com.bytedance.android.livesdk.model.BannerInRoom;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.ugc.live.sdk.message.data.IMessage;
import java.util.List;

/* JADX INFO: renamed from: X.0egb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1098270egb {
    public Context LL;
    public List<? extends BannerInRoom> LLILLJJLI;
    public final boolean LLILLL;
    public final Room LLILZ;
    public NewTopRightBannerWidget LLILZIL;
    public NewTopRightBannerWidget LLILZLL;
    public NewTopRightBannerWidget LLIZ;

    public void LIZ(int i, int i2, C1098290egd c1098290egd) {
    }

    public void LIZIZ(IMessage iMessage) {
    }

    public void LIZJ() {
    }

    public void LIZLLL(int i, int i2, C1098290egd c1098290egd) {
    }

    public abstract View LJFF();

    public long LJI() {
        return 0L;
    }

    public boolean LJII() {
        return true;
    }

    public void LJIIIIZZ() {
    }

    public boolean LJIIIZ() {
        return true;
    }

    public void LJIIJ() {
    }

    public void LJIIJJI(boolean z) {
    }

    public void LJIIL(C782680Un4 c782680Un4) {
    }

    public void LJIILIIL(C784060UpI c784060UpI) {
    }

    public void LJIILJJIL(boolean z) {
    }

    public void LJIILL() {
    }

    public void LJIILLIIL() {
    }

    public void LJIJ() {
    }

    public boolean LJIJI(IMessage iMessage) {
        return false;
    }

    public void LJIJJ(C1098290egd c1098290egd) {
    }

    public void LJIJJLI(String str, C1098290egd c1098290egd) {
    }

    public void LJIL(C1098290egd c1098290egd) {
    }

    public void LJ(C1098290egd c1098290egd) {
        NewTopRightBannerWidget newTopRightBannerWidget = this.LLILZLL;
        if (newTopRightBannerWidget != null) {
            newTopRightBannerWidget.R1(c1098290egd);
        }
    }

    public void LJIIZILJ(List<? extends BannerInRoom> list) {
        this.LLILLJJLI = list;
    }

    public AbstractC1098270egb(Context context, List<? extends BannerInRoom> list, boolean z, Room room) {
        this.LL = context;
        this.LLILLJJLI = list;
        this.LLILLL = z;
        this.LLILZ = room;
    }
}
