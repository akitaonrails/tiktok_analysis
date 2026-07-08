package Y;

import X.C1459970o5z;
import X.C1C7U;
import X.C862640Xsk;
import X.EnumC880850Yh1;
import X.InterfaceC1891350zJl;
import X.InterfaceC887660Ys0;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.archive.ArchivePageViewModel;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.archive.InboxArchivePageChatListAssem;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS380S0200000_14;
import kotlin.jvm.internal.AwS430S0200000_29;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public class ARunnableS15S0210000_14 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        if (this.z2) {
            C862640Xsk c862640Xsk = C1459970o5z.LLJLLL;
            AwS430S0200000_29 awS430S0200000_29 = new AwS430S0200000_29((Function0) this.l0, (Function0<Boolean>) this.l1, (C1459970o5z) 59);
            c862640Xsk.getClass();
            C862640Xsk.LIZIZ(awS430S0200000_29);
            return;
        }
        C862640Xsk c862640Xsk2 = C1459970o5z.LLJLLL;
        AwS558S0100000_14 awS558S0100000_14 = new AwS558S0100000_14((Function0) this.l0, 1178);
        c862640Xsk2.getClass();
        C862640Xsk.LIZ("keva_repo_send_to_dm", "key_group_chat_sticker_guide", awS558S0100000_14);
    }

    public final void LIZ$1() {
        RecyclerView recyclerViewLLII;
        InterfaceC887660Ys0 interfaceC887660Ys0;
        List list = (List) this.l0;
        if (list != null && !list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                InterfaceC1891350zJl interfaceC1891350zJl = (InterfaceC1891350zJl) it2.next();
                if ((interfaceC1891350zJl instanceof InterfaceC887660Ys0) && (interfaceC887660Ys0 = (InterfaceC887660Ys0) interfaceC1891350zJl) != null && interfaceC887660Ys0.isSwitchingMode()) {
                    ArchivePageViewModel archivePageViewModelGo = ((InboxArchivePageChatListAssem) this.l1).Go();
                    archivePageViewModelGo.setState(new AwS380S0200000_14((EnumC880850Yh1) null, archivePageViewModelGo, 115));
                    break;
                }
            }
        }
        if (!this.z2 || (recyclerViewLLII = ((InboxArchivePageChatListAssem) this.l1).LLII()) == null) {
            return;
        }
        recyclerViewLLII.scrollToPosition(0);
    }

    public static final void run$0(ARunnableS15S0210000_14 aRunnableS15S0210000_14) {
        boolean zLIZ;
        C1C7U.LIZ("NewEditToolbarScene@2309.showDMGroupChatPromote$1$1$showTooltipAction$1$1");
        try {
            aRunnableS15S0210000_14.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("NewEditToolbarScene@2309.showDMGroupChatPromote$1$1$showTooltipAction$1$1");
    }

    public static final void run$1(ARunnableS15S0210000_14 aRunnableS15S0210000_14) {
        boolean zLIZ;
        C1C7U.LIZ("InboxArchivePageChatListAssem@c3eb.initSubscribe$2$1");
        try {
            aRunnableS15S0210000_14.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("InboxArchivePageChatListAssem@c3eb.initSubscribe$2$1");
    }

    public ARunnableS15S0210000_14(Object obj, Object obj2, boolean z, int i) {
        this.$t = i;
        this.z2 = z;
        this.l0 = obj2;
        this.l1 = obj;
    }
}
