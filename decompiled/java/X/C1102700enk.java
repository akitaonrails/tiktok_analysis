package X;

import android.os.Looper;
import com.bytedance.android.live.toolbar.TBViewModel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.WidgetLoadedEvent;
import com.bytedance.android.livesdkapi.depend.model.live.HighlightToolbarComInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.ToolbarConfig;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS596S0100000_17;

/* JADX INFO: renamed from: X.0enk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1102700enk {
    public final C1099960ejK LIZ;
    public final Map<EnumC1102740eno, InterfaceC1102810env> LIZIZ;
    public final Map<EnumC1102740eno, TBViewModel> LIZJ;
    public final BPEAHandler LIZLLL = new BPEAHandler(Looper.getMainLooper());
    public boolean LJ;

    /* JADX WARN: Multi-variable type inference failed */
    public C1102700enk(C1099960ejK c1099960ejK, Map<EnumC1102740eno, ? extends InterfaceC1102810env> map, Map<EnumC1102740eno, TBViewModel> map2) {
        ToolbarConfig toolbarConfig;
        List<HighlightToolbarComInfo> list;
        this.LIZ = c1099960ejK;
        this.LIZIZ = map;
        this.LIZJ = map2;
        ArrayList arrayList = new ArrayList();
        Room room = (Room) c1099960ejK.LIZJ.gg0(RoomChannel.class);
        if (room != null && (toolbarConfig = room.toolbarConfig) != null && (list = toolbarConfig.highlightComs) != null) {
            Iterator it2 = C13LP.LJLLLL(new C512401z8(70), list).iterator();
            while (it2.hasNext()) {
                List<Integer> list2 = ((HighlightToolbarComInfo) it2.next()).highlightComTypes;
                ArrayList arrayList2 = new ArrayList();
                Iterator<Integer> it3 = list2.iterator();
                while (it3.hasNext()) {
                    int iIntValue = it3.next().intValue();
                    EnumC1102740eno enumC1102740enoLJ = C1103080eoM.LJ(iIntValue);
                    if (enumC1102740enoLJ != null) {
                        arrayList2.add(new C1102910eo5(iIntValue, enumC1102740enoLJ));
                    }
                }
                arrayList.add(arrayList2);
            }
        }
        this.LIZ.LIZJ.SX0(C749550Taj.class, arrayList);
        C1099960ejK c1099960ejK2 = this.LIZ;
        c1099960ejK2.LIZJ.BQ2(c1099960ejK2.LIZIZ, WidgetLoadedEvent.class, new AwS596S0100000_17(this, 653));
    }
}
