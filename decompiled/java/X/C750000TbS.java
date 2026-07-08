package X;

import Y.ACListenerS147S0100000_12;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.zhiliaoapp.musically.R;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Set;
import tikcast.api.anchor.HostInfo;

/* JADX INFO: renamed from: X.0TbS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C750000TbS extends AbstractC749630Tar {
    public C1099610eil LL;
    public TextView LLILLJJLI;
    public View LLILLL;
    public View LLILZ;
    public TextView LLILZIL;
    public TextView LLILZLL;
    public final Context LLIZ;
    public HostInfo LLIZLLLIL;
    public final InterfaceC750010TbT LLJ;
    public final Set<Long> LLJI;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC749630Tar
    public final <T> void V2(T t) {
        User user;
        if (t instanceof HostInfo) {
            HostInfo hostInfo = (HostInfo) t;
            this.LLIZLLLIL = hostInfo;
            User user2 = hostInfo.userInfo;
            if (user2 == null) {
                return;
            }
            if (user2.getAvatarThumb() != null) {
                C0JSS.LJII(this.LL, this.LLIZLLLIL.userInfo.getAvatarThumb());
            } else {
                this.LL.setImageResource(R.drawable.el_);
            }
            TextView textView = this.LLILLJJLI;
            if (textView != null) {
                C786410Ut5.LLIL(textView, 8);
            }
            View view = this.LLILLL;
            if (view != null) {
                C786410Ut5.LJLLLLLL(0, view);
            }
            TextView textView2 = this.LLILLJJLI;
            if (textView2 != null) {
                C786410Ut5.LLIL(textView2, 0);
                this.LLILLJJLI.setText(2131843895);
                this.LLILLJJLI.setBackground(C497740JfY.LJIIJ(R.drawable.dow));
                this.LLILLJJLI.setTextColor(C497740JfY.LJFF(R.color.a1w));
                C786410Ut5.T7(this.LLILLJJLI, new ACListenerS147S0100000_12(this, 460));
            }
            TextView textView3 = this.LLILZLL;
            if (textView3 != null) {
                textView3.setText(C0KVU.LIZ(this.LLIZLLLIL.userInfo));
            }
            TextView textView4 = this.LLILZIL;
            if (textView4 != null) {
                textView4.setText(this.LLIZ.getString(2131843893, new SimpleDateFormat("M/d/yyyy", Locale.getDefault()).format(Long.valueOf(this.LLIZLLLIL.addtimesecond * 1000))));
            }
            HostInfo hostInfo2 = this.LLIZLLLIL;
            if (hostInfo2 != null && (user = hostInfo2.userInfo) != null && !this.LLJI.contains(Long.valueOf(user.getId()))) {
                this.LLJI.add(Long.valueOf(hostInfo2.userInfo.getId()));
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_host_moderate_list_show");
                c474500IjALIZ.LJIL();
                c474500IjALIZ.LJJII(Long.valueOf(hostInfo2.addtimesecond), "added_date");
                c474500IjALIZ.LIZ();
            }
        }
    }

    public C750000TbS(View view, InterfaceC750010TbT interfaceC750010TbT, Set set) {
        super(0, view);
        this.LLIZ = view.getContext();
        this.LLJ = interfaceC750010TbT;
        this.LLJI = set;
        this.LL = (C1099610eil) view.findViewById(R.id.jjh);
        this.LLILLJJLI = (TextView) view.findViewById(R.id.db0);
        this.LLILLL = view.findViewById(R.id.db9);
        this.LLILZ = view.findViewById(R.id.dbc);
        this.LLILZIL = (TextView) view.findViewById(R.id.user_tag);
        this.LLILZLL = (TextView) view.findViewById(R.id.user_name);
    }
}
