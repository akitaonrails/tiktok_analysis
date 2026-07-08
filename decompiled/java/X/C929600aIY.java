package X;

import Y.ACListenerS118S0200000_15;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0aIY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C929600aIY extends AbstractC960470b6L<C928720aH8> {
    public final Function2<C928720aH8, Function1<? super Boolean, Unit>, Unit> LL;
    public final InterfaceC1631620sYq<LinkPlayerInfo, Integer, Integer, Unit> LLILLJJLI;
    public final C931950aML LLILLL;
    public final TextView LLILZ;
    public final TextView LLILZIL;
    public final C465750IOf LLILZLL;

    public final void L5(C928720aH8 c928720aH8) {
        if (c928720aH8.LIZIZ) {
            this.LLILLL.setEnabled(false);
            this.LLILLL.setText(C497740JfY.LJIJI(2131854541));
        } else {
            this.LLILLL.setEnabled(true);
            this.LLILLL.setText(C497740JfY.LJIJI(2131854540));
        }
    }

    @Override // X.AbstractC960470b6L
    public final void I5(int i, Object obj) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int iLIZIZ;
        C928720aH8 c928720aH8 = (C928720aH8) obj;
        ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            if (c928720aH8.LIZJ) {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            } else {
                iLIZIZ = 0;
            }
            if (marginLayoutParams.topMargin != iLIZIZ) {
                marginLayoutParams.topMargin = iLIZIZ;
                C786410Ut5.W5(this.itemView, marginLayoutParams);
            }
        }
        if (c928720aH8.LIZLLL) {
            this.LLILZ.setText(C497740JfY.LJIJI(2131854402));
            this.LLILZIL.setText(C497740JfY.LJIJI(2131854401));
        } else {
            this.LLILZ.setText(C497740JfY.LJIJI(2131854543));
            this.LLILZIL.setText(C497740JfY.LJIJI(2131854542));
        }
        C465750IOf c465750IOf = this.LLILZLL;
        List<LinkPlayerInfo> list = c928720aH8.LIZ;
        ((ArrayList) c465750IOf.LLILLJJLI).clear();
        ((ArrayList) c465750IOf.LLILLJJLI).addAll(list);
        c465750IOf.notifyDataSetChanged();
        L5(c928720aH8);
        C786410Ut5.q8(this.LLILLL, new ACListenerS118S0200000_15(this, c928720aH8, 18));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C929600aIY(View view, Function2<? super C928720aH8, ? super Function1<? super Boolean, Unit>, Unit> function2, InterfaceC1631620sYq<? super LinkPlayerInfo, ? super Integer, ? super Integer, Unit> interfaceC1631620sYq) {
        super(view);
        this.LL = function2;
        this.LLILLJJLI = interfaceC1631620sYq;
        C931950aML c931950aML = (C931950aML) view.findViewById(R.id.crb);
        this.LLILLL = c931950aML;
        this.LLILZ = (TextView) view.findViewById(R.id.tv_recent_joined_title);
        this.LLILZIL = (TextView) view.findViewById(R.id.tv_recent_joined_subtitle);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.twu);
        C465750IOf c465750IOf = new C465750IOf(interfaceC1631620sYq);
        this.LLILZLL = c465750IOf;
        boolean zLJIJJLI = C930540aK4.LJIJJLI();
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext(), 0, false));
        recyclerView.setAdapter(c465750IOf);
        if (zLJIJJLI) {
            c931950aML.setCircular(true);
            c931950aML.getLayoutParams().height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
        }
    }
}
