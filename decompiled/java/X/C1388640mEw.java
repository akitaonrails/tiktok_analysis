package X;

import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS618S0100000_4;

/* JADX INFO: renamed from: X.0mEw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1388640mEw extends RecyclerView.ViewHolder {
    public final View LL;
    public final String LLILLJJLI;
    public final InterfaceC897330ZId LLILLL;
    public final LifecycleOwner LLILZ;
    public final Function2<IMUser, Integer, Unit> LLILZIL;
    public final SmartAvatarImageView LLILZLL;
    public final C01GW LLIZ;
    public final C19727912Gn LLIZLLLIL;
    public final TuxTextView LLJ;
    public final int LLJI;
    public C1388670mEz LLJIJIL;

    public final void I5(boolean z, C1388670mEz c1388670mEz) {
        IMUser iMUser;
        if (z) {
            C19727912Gn c19727912Gn = this.LLIZLLLIL;
            if (c19727912Gn != null) {
                c19727912Gn.setActive(true);
            }
            C19727912Gn c19727912Gn2 = this.LLIZLLLIL;
            if (c19727912Gn2 != null) {
                C786410Ut5.d0(c19727912Gn2, 0);
            }
            if (c1388670mEz != null && (iMUser = c1388670mEz.LIZ) != null) {
                InterfaceC897380ZIi.LIZIZ.getClass();
                C897370ZIh.LIZ().LJIIJJI();
                C0ZE7 c0ze7 = new C0ZE7(this.LLILZ);
                c0ze7.LIZIZ(EnumC1910440zoY.GROUP_MENTION);
                c0ze7.LIZJ = iMUser.getUid();
                c0ze7.LJII = Boolean.TRUE;
                C0ZE8.LJIIIZ(c0ze7);
                return;
            }
            return;
        }
        C19727912Gn c19727912Gn3 = this.LLIZLLLIL;
        if (c19727912Gn3 == null) {
            return;
        }
        C786410Ut5.d0(c19727912Gn3, 8);
    }

    public C1388640mEw(View view, String str, InterfaceC897330ZId interfaceC897330ZId, LifecycleOwner lifecycleOwner, AwS618S0100000_4 awS618S0100000_4, int i) {
        super(view);
        this.LL = view;
        this.LLILLJJLI = str;
        this.LLILLL = interfaceC897330ZId;
        this.LLILZ = lifecycleOwner;
        this.LLILZIL = awS618S0100000_4;
        this.LLILZLL = (SmartAvatarImageView) view.findViewById(R.id.biz);
        this.LLIZ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1471));
        C19727912Gn c19727912Gn = (C19727912Gn) view.findViewById(R.id.a6g);
        c19727912Gn.setStrokeColor(i);
        this.LLIZLLLIL = c19727912Gn;
        this.LLJ = (TuxTextView) view.findViewById(R.id.p0w);
        this.LLJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64));
        if (interfaceC897330ZId != null) {
            interfaceC897330ZId.LIZIZ(true, new C0NYY() { // from class: X.0mEx
                @Override // X.C0NYY
                public final Object k3(Map<String, C595660NXw> map, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                    IMUser iMUser;
                    String uid;
                    C1388670mEz c1388670mEz = this.LL.LLJIJIL;
                    if (c1388670mEz != null && (iMUser = c1388670mEz.LIZ) != null && (uid = iMUser.getUid()) != null) {
                        C595660NXw c595660NXw = map.get(uid);
                        if (c595660NXw == null) {
                            return Unit.LIZ;
                        }
                        this.LL.I5(C896480ZEw.LIZJ(c595660NXw), this.LL.LLJIJIL);
                        return Unit.LIZ;
                    }
                    return Unit.LIZ;
                }
            });
        }
    }
}
