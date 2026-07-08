package X;

import Y.ACListenerS133S0200000_31;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.zhiliaoapp.musically.R;
import webcast.data.multi_guest_play.Playbook;
import webcast.data.multi_guest_play.PlaybookContent;

/* JADX INFO: renamed from: X.14t0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20406014t0 extends C0J8P<C980070bbx, C20406114t1> {
    public final InterfaceC20405014sq LIZIZ;

    public C20406014t0(C20394614rA c20394614rA) {
        this.LIZIZ = c20394614rA;
    }

    @Override // X.C0J8P
    public final void LIZJ(RecyclerView.ViewHolder viewHolder, C980070bbx c980070bbx) {
        String str;
        String str2;
        C20406114t1 c20406114t1 = (C20406114t1) viewHolder;
        Playbook playbook = c980070bbx.LIZ;
        C1143680frq.LJFF(c20406114t1.LLILLL, "tiktok_live_interaction_normal_3", "ttlive_match_playbook_active_playbook_anim.webp", ImageView.ScaleType.CENTER_CROP, new C0IYA() { // from class: X.14t6
        });
        C0JBN c0jbnLIZ = C1819620xS4.LIZ();
        PlaybookContent playbookContent = playbook.content;
        String str3 = null;
        if (playbookContent != null) {
            str = playbookContent.coverUrl;
        } else {
            str = null;
        }
        C1324610kZf c1324610kZfLJIIIZ = c0jbnLIZ.LJIIIZ(ImageModel.genBy(str));
        c1324610kZfLJIIIZ.LJIJI(Float.valueOf(C418440Gaw.LIZIZ(8)));
        int iLIZ = C439101nJ.LIZ(47);
        int iLIZ2 = C439101nJ.LIZ(63);
        c1324610kZfLJIIIZ.LJ = iLIZ;
        c1324610kZfLJIIIZ.LJFF = iLIZ2;
        c1324610kZfLJIIIZ.LJJ = Boolean.TRUE;
        String str4 = C20399914s1.LLJJIII;
        c1324610kZfLJIIIZ.LJIIIZ = R.drawable.fht;
        c1324610kZfLJIIIZ.LJJI(c20406114t1.LLILLJJLI);
        TextView textView = c20406114t1.LLILZ;
        PlaybookContent playbookContent2 = playbook.content;
        if (playbookContent2 != null) {
            str2 = playbookContent2.title;
        } else {
            str2 = null;
        }
        textView.setText(str2);
        TextView textView2 = c20406114t1.LLILZIL;
        PlaybookContent playbookContent3 = playbook.content;
        if (playbookContent3 != null) {
            str3 = playbookContent3.description;
        }
        textView2.setText(str3);
        C1570050qxX.LIZ(new ACListenerS133S0200000_31(this, playbook, 45), c20406114t1.itemView);
    }

    @Override // X.C0J8P
    /* JADX INFO: renamed from: LJ */
    public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new C20406114t1(C786410Ut5.Td(layoutInflater, R.layout.h7w, viewGroup, false));
    }
}
