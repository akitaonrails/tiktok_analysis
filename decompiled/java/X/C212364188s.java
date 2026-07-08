package X;

import Y.AsS57S0100000_32;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.tools.chat.input.scene.ActionBarCell;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS611S0100000_32;

/* JADX INFO: renamed from: X.188s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C212364188s extends AbstractC1664490tPr<C433160Gyg, C21287918Sn> {
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 657));
    public final C01GW LLJJJJ = C452501pT.LIZIZ(new AwS576S0100000_32(this, 656));
    public final Set<String> LLJJJJJIL = new LinkedHashSet();

    @Override // X.C19A3
    public final void LLLILZLLLI() {
        C786410Ut5.LJLLLLLL(LLLLILI().LIZ.LIZIZ ? 0 : 8, (View) this.LLJJJJ.getValue());
        AbstractC1664490tPr.LLLLLIL(this, new AwS611S0100000_32(this, 319));
    }

    public final ViewOnAttachStateChangeListenerC20604515jv LLLLLJLJLL() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJJJIL.getValue();
    }

    public final void LLLLLJIL() {
        LinearLayoutManager linearLayoutManager;
        C427580Gpg c427580Gpg;
        RecyclerView.LayoutManager layoutManager = LLLLLJLJLL().getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager) || (linearLayoutManager = (LinearLayoutManager) layoutManager) == null) {
            return;
        }
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        if (iFindFirstVisibleItemPosition == -1 || iFindFirstVisibleItemPosition > iFindLastVisibleItemPosition) {
            return;
        }
        while (true) {
            C20600815jK<InterfaceC1891350zJl> state = LLLLLJLJLL().getState();
            InterfaceC1891350zJl interfaceC1891350zJlLJI = state != null ? state.LJI(iFindFirstVisibleItemPosition) : null;
            if ((interfaceC1891350zJlLJI instanceof C427580Gpg) && (c427580Gpg = (C427580Gpg) interfaceC1891350zJlLJI) != null && this.LLJJJJJIL.add(c427580Gpg.LL)) {
                c427580Gpg.LLJ.invoke();
            }
            if (iFindFirstVisibleItemPosition == iFindLastVisibleItemPosition) {
                return;
            } else {
                iFindFirstVisibleItemPosition++;
            }
        }
    }

    @Override // X.AbstractC1664490tPr, com.bytedance.scene.Scene
    public final void onResume() {
        super.onResume();
        C18T2.LIZ.getClass();
        C18T2.LIZLLL("ai_chat_action_bar_boot_duration");
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvLLLLLJLJLL = LLLLLJLJLL();
        viewOnAttachStateChangeListenerC20604515jvLLLLLJLJLL.setLifecycleOwner(this);
        viewOnAttachStateChangeListenerC20604515jvLLLLLJLJLL.addItemDecoration(new C0DXR() { // from class: X.06XJ
            @Override // X.C0DXR
            public final void LIZIZ(Rect rect, View view2, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                boolean z;
                int i;
                int childAdapterPosition = recyclerView.getChildAdapterPosition(view2);
                if (recyclerView.getLayoutDirection() == 1) {
                    z = true;
                } else {
                    z = false;
                }
                Pair pair = new Pair(Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))));
                int iIntValue = ((Number) pair.getFirst()).intValue();
                int iIntValue2 = ((Number) pair.getSecond()).intValue();
                if (childAdapterPosition == 0) {
                    iIntValue = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                }
                AbstractC21673619ry adapter = recyclerView.getAdapter();
                if (adapter != null && childAdapterPosition == adapter.getItemCount() - 1) {
                    iIntValue2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                }
                if (z) {
                    i = iIntValue2;
                } else {
                    i = iIntValue;
                    iIntValue = iIntValue2;
                }
                rect.set(i, 0, iIntValue, 0);
            }
        });
        viewOnAttachStateChangeListenerC20604515jvLLLLLJLJLL.setLayoutManager(new LinearLayoutManager(viewOnAttachStateChangeListenerC20604515jvLLLLLJLJLL.getContext(), 0, false));
        viewOnAttachStateChangeListenerC20604515jvLLLLLJLJLL.LJIILJJIL(ActionBarCell.class);
        viewOnAttachStateChangeListenerC20604515jvLLLLLJLJLL.addOnScrollListener(new AsS57S0100000_32(this, 8));
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LJIIIZ = "ai_chat_actionbar_fps";
        c20603715jn.LJIIZILJ = true;
        viewOnAttachStateChangeListenerC20604515jvLLLLLJLJLL.setListConfig(c20603715jn);
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C18T2.LIZ.getClass();
        C18T2.LIZ("ai_chat_action_bar_boot_duration");
        C18T2.LIZ("ai_chat_action_bar_ready_duration");
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.bg2, viewGroup, false);
    }
}
